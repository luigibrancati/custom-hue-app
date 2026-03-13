package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private static final AtomicInteger nextSchedulerId = new AtomicInteger(0);
    private final JavaAudioDeviceModule.AudioBufferCallback audioBufferCallback;
    private final int audioFormat;
    private final AudioManager audioManager;
    private volatile AudioRecord audioRecord;
    private final Object audioRecordStateLock;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private final Object audioThreadStateLock;
    private ByteBuffer byteBuffer;
    private int channelCount;
    private AtomicBoolean clientCalledStartRecording;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private int expectedChannelCount;
    private int expectedSampleRate;
    private ScheduledFuture<String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private AtomicBoolean nativeCalledInitRecording;
    private AtomicBoolean nativeCalledStartRecording;
    private AudioDeviceInfo preferredDevice;
    private int sampleRate;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;
    private boolean useAudioRecord;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioRecord audioRecord;
            boolean z10;
            int iCapacity;
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord != null) {
                WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            }
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            while (this.keepAlive) {
                synchronized (WebRtcAudioRecord.this.audioRecordStateLock) {
                    audioRecord = WebRtcAudioRecord.this.audioRecord;
                    z10 = WebRtcAudioRecord.this.nativeCalledInitRecording.get();
                }
                AudioRecord audioRecord2 = null;
                if (audioRecord == null && WebRtcAudioRecord.this.useAudioRecord) {
                    if (WebRtcAudioRecord.this.initAudioRecord()) {
                        synchronized (WebRtcAudioRecord.this.audioRecordStateLock) {
                            audioRecord = WebRtcAudioRecord.this.audioRecord;
                        }
                        WebRtcAudioRecord.assertTrue(audioRecord != null);
                        try {
                            audioRecord.startRecording();
                        } catch (IllegalStateException e10) {
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e10.getMessage());
                            WebRtcAudioRecord.this.useAudioRecord = false;
                            audioRecord = null;
                        }
                        if (WebRtcAudioRecord.this.useAudioRecord && audioRecord.getRecordingState() != 3) {
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + audioRecord.getRecordingState());
                            WebRtcAudioRecord.this.useAudioRecord = false;
                            audioRecord = null;
                        }
                    } else {
                        WebRtcAudioRecord.this.useAudioRecord = false;
                    }
                }
                if (audioRecord == null || WebRtcAudioRecord.this.useAudioRecord) {
                    audioRecord2 = audioRecord;
                } else {
                    WebRtcAudioRecord.this.releaseAudioResources();
                }
                long j10 = 0;
                if (audioRecord2 != null) {
                    int i10 = audioRecord2.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                    if (i10 == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                        if (WebRtcAudioRecord.this.microphoneMute) {
                            WebRtcAudioRecord.this.byteBuffer.clear();
                            WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                        }
                        if (this.keepAlive && audioRecord2.getTimestamp(audioTimestamp, 0) == 0) {
                            j10 = audioTimestamp.nanoTime;
                        }
                        iCapacity = i10;
                    } else {
                        String str = "AudioRecord.read failed: " + i10;
                        Logging.e(WebRtcAudioRecord.TAG, str);
                        if (i10 == -3) {
                            this.keepAlive = false;
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                        }
                    }
                } else {
                    WebRtcAudioRecord.this.byteBuffer.clear();
                    WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    iCapacity = 0;
                }
                long jOnBuffer = j10;
                if (this.keepAlive && WebRtcAudioRecord.this.audioBufferCallback != null) {
                    jOnBuffer = WebRtcAudioRecord.this.audioBufferCallback.onBuffer(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.audioFormat, WebRtcAudioRecord.this.channelCount, WebRtcAudioRecord.this.sampleRate, iCapacity, jOnBuffer);
                    iCapacity = WebRtcAudioRecord.this.byteBuffer.capacity();
                }
                int i11 = iCapacity;
                long j11 = jOnBuffer;
                if (this.keepAlive && z10) {
                    WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                    webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i11, j11);
                }
                if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                    WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioRecord.this.audioFormat, WebRtcAudioRecord.this.channelCount, WebRtcAudioRecord.this.sampleRate, Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.capacity() + WebRtcAudioRecord.this.byteBuffer.arrayOffset())));
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e11) {
                Logging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e11.getMessage());
            }
            WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    @CalledByNative
    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported(), WebRtcAudioManager.getSampleRate(audioManager), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static String audioStateToString(int i10) {
        return i10 != 0 ? i10 != 1 ? "INVALID" : "STOP" : "START";
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    @TargetApi(24)
    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int i10, int i11, int i12, int i13, int i14) {
        Logging.d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(i10, i11, i12, i13, i14);
    }

    @TargetApi(23)
    private static AudioRecord createAudioRecordOnMOrHigher(int i10, int i11, int i12, int i13, int i14) {
        Logging.d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i10).setAudioFormat(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i11).setChannelMask(i12).build()).setBufferSizeInBytes(i14).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i10) {
        Logging.d(TAG, "doAudioRecordStateCallback: " + audioStateToString(i10));
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i10 == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i10 == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    @CalledByNative
    private boolean enableBuiltInAEC(boolean z10) {
        Logging.d(TAG, "enableBuiltInAEC(" + z10 + ")");
        return this.effects.setAEC(z10);
    }

    @CalledByNative
    private boolean enableBuiltInNS(boolean z10) {
        Logging.d(TAG, "enableBuiltInNS(" + z10 + ")");
        return this.effects.setNS(z10);
    }

    private static int getBytesPerFrame(int i10, int i11) {
        return i10 * getBytesPerSample(i11);
    }

    private static int getBytesPerSample(int i10) {
        int i11 = 1;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    if (i10 != 13) {
                        throw new IllegalArgumentException("Bad audio format " + i10);
                    }
                }
            }
            return i11;
        }
        return 2;
    }

    private static int getFramesPerBuffer(int i10) {
        return i10 / 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initAudioRecord() {
        if (this.sampleRate == 0 || this.channelCount == 0) {
            Logging.w(TAG, "initAudioRecord called before initRecord!");
            return false;
        }
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    reportWebRtcAudioRecordInitError("InitAudioRecord called twice without StopRecording.");
                    return false;
                }
                int iChannelCountToConfiguration = channelCountToConfiguration(this.channelCount);
                int minBufferSize = AudioRecord.getMinBufferSize(this.sampleRate, iChannelCountToConfiguration, this.audioFormat);
                if (minBufferSize != -1 && minBufferSize != -2) {
                    Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
                    int iMax = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                    Logging.d(TAG, "bufferSizeInBytes: " + iMax);
                    try {
                        this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, this.sampleRate, iChannelCountToConfiguration, this.audioFormat, iMax);
                        this.audioSourceMatchesRecordingSessionRef.set(null);
                        AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                        if (audioDeviceInfo != null) {
                            setPreferredDevice(audioDeviceInfo);
                        }
                        if (this.audioRecord != null && this.audioRecord.getState() == 1) {
                            this.effects.enable(this.audioRecord.getAudioSessionId());
                            logMainParameters();
                            logMainParametersExtended();
                            return true;
                        }
                        reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                        releaseAudioResources();
                        return false;
                    } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                        reportWebRtcAudioRecordInitError(e10.getMessage());
                        releaseAudioResources();
                        return false;
                    }
                }
                reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    private int initRecording(int i10, int i11) {
        Logging.d(TAG, "initRecording(sampleRate=" + i10 + ", channels=" + i11 + ")");
        synchronized (this.audioRecordStateLock) {
            try {
                if (!this.nativeCalledInitRecording.compareAndSet(false, true)) {
                    reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
                    return -1;
                }
                if (this.audioRecord == null) {
                    return initRecordingImpl(i10, i11, true);
                }
                int framesPerBuffer = getFramesPerBuffer(i10);
                ByteBuffer byteBuffer = this.byteBuffer;
                if (byteBuffer == null) {
                    throw new IllegalStateException("initRecording: byteBuffer is null!");
                }
                nativeCacheDirectBufferAddress(this.nativeAudioRecord, byteBuffer);
                return framesPerBuffer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int initRecordingImpl(int i10, int i11, boolean z10) {
        Logging.d(TAG, "initRecordingImpl(sampleRate=" + i10 + ", channels=" + i11 + ")");
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        this.sampleRate = i10;
        this.channelCount = i11;
        int bytesPerFrame = getBytesPerFrame(i11, this.audioFormat);
        int framesPerBuffer = getFramesPerBuffer(i10);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytesPerFrame * framesPerBuffer);
        this.byteBuffer = byteBufferAllocateDirect;
        if (!byteBufferAllocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        if (z10) {
            nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        }
        if (this.useAudioRecord && !initAudioRecord()) {
            return -1;
        }
        int iLogRecordingConfigurations = logRecordingConfigurations(this.audioRecord, false);
        if (iLogRecordingConfigurations != 0) {
            Logging.w(TAG, "Potential microphone conflict. Active sessions: " + iLogRecordingConfigurations);
        }
        return framesPerBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) {
        if (this.audioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    @TargetApi(24)
    private static boolean logActiveRecordingConfigs(int i10, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Logging.d(TAG, "AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            StringBuilder sb2 = new StringBuilder();
            int clientAudioSource = audioRecordingConfiguration.getClientAudioSource();
            sb2.append("  client audio source=");
            sb2.append(WebRtcAudioUtils.audioSourceToString(clientAudioSource));
            sb2.append(", client session id=");
            sb2.append(audioRecordingConfiguration.getClientAudioSessionId());
            sb2.append(" (");
            sb2.append(i10);
            sb2.append(")");
            sb2.append("\n");
            AudioFormat format = audioRecordingConfiguration.getFormat();
            sb2.append("  Device AudioFormat: ");
            sb2.append("channel count=");
            sb2.append(format.getChannelCount());
            sb2.append(", channel index mask=");
            sb2.append(format.getChannelIndexMask());
            sb2.append(", channel mask=");
            sb2.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb2.append(", encoding=");
            sb2.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb2.append(", sample rate=");
            sb2.append(format.getSampleRate());
            sb2.append("\n");
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            sb2.append("  Client AudioFormat: ");
            sb2.append("channel count=");
            sb2.append(clientFormat.getChannelCount());
            sb2.append(", channel index mask=");
            sb2.append(clientFormat.getChannelIndexMask());
            sb2.append(", channel mask=");
            sb2.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb2.append(", encoding=");
            sb2.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb2.append(", sample rate=");
            sb2.append(clientFormat.getSampleRate());
            sb2.append("\n");
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb2.append("  AudioDevice: ");
                sb2.append("type=");
                sb2.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb2.append(", id=");
                sb2.append(audioDevice.getId());
            }
            Logging.d(TAG, sb2.toString());
        }
        return true;
    }

    private void logMainParameters() {
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(23)
    private void logMainParametersExtended() {
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    Logging.d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(24)
    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z10) {
        if (audioRecord == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        Logging.d(TAG, "Number of active recording sessions: " + size);
        if (size > 0) {
            logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (z10) {
                this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    private native void nativeCacheDirectBufferAddress(long j10, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j10, int i10, long j11);

    public static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", Integer.valueOf(WebRtcAudioRecord.nextSchedulerId.getAndIncrement()), Integer.valueOf(atomicInteger.getAndIncrement())));
                return threadNewThread;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        synchronized (this.audioRecordStateLock) {
            try {
                this.effects.release();
                if (this.audioRecord != null) {
                    this.audioRecord.release();
                    this.audioRecord = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e(TAG, "Start recording error: " + String.valueOf(audioRecordStartErrorCode) + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(final AudioRecord audioRecord) {
        Logging.d(TAG, "scheduleLogRecordingConfigurationsTask");
        Callable callable = new Callable() { // from class: org.webrtc.audio.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f41672a.lambda$scheduleLogRecordingConfigurationsTask$0(audioRecord);
            }
        };
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callable, 100L, TimeUnit.MILLISECONDS);
    }

    @CalledByNative
    private boolean startRecording() {
        if (!this.nativeCalledStartRecording.compareAndSet(false, true)) {
            throw new IllegalStateException("startRecording called twice without stopRecording");
        }
        if (this.audioThread == null) {
            synchronized (this.audioRecordStateLock) {
                synchronized (this.audioThreadStateLock) {
                    if (this.audioThread == null) {
                        return startRecordingImpl();
                    }
                }
            }
        }
        return true;
    }

    private boolean startRecordingImpl() {
        Logging.d(TAG, "startRecording");
        synchronized (this.audioRecordStateLock) {
            synchronized (this.audioThreadStateLock) {
                assertTrue(this.audioThread == null);
                if (this.useAudioRecord) {
                    assertTrue(this.audioRecord != null);
                    try {
                        this.audioRecord.startRecording();
                        if (this.audioRecord.getRecordingState() != 3) {
                            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecord.getRecordingState());
                            return false;
                        }
                    } catch (IllegalStateException e10) {
                        reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e10.getMessage());
                        return false;
                    }
                }
                AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                scheduleLogRecordingConfigurationsTask(this.audioRecord);
                return true;
            }
        }
    }

    @CalledByNative
    private boolean stopRecording() {
        boolean zStopRecordingIfNeededImpl;
        Logging.d(TAG, "stopRecording");
        synchronized (this.audioRecordStateLock) {
            this.nativeCalledStartRecording.set(false);
            this.nativeCalledInitRecording.set(false);
            zStopRecordingIfNeededImpl = stopRecordingIfNeededImpl();
        }
        return zStopRecordingIfNeededImpl;
    }

    private boolean stopRecordingIfNeededImpl() {
        synchronized (this.audioRecordStateLock) {
            try {
                if (!this.clientCalledStartRecording.get() && !this.nativeCalledStartRecording.get()) {
                    Logging.d(TAG, "stopping recording");
                    assertTrue(this.audioThread != null);
                    ScheduledFuture<String> scheduledFuture = this.future;
                    if (scheduledFuture != null) {
                        if (!scheduledFuture.isDone()) {
                            this.future.cancel(true);
                        }
                        this.future = null;
                    }
                    this.audioThread.stopThread();
                    if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
                        Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
                        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
                    }
                    this.audioThread = null;
                    releaseAudioResources();
                    return true;
                }
                return true;
            } finally {
            }
        }
    }

    @TargetApi(24)
    private static boolean verifyAudioConfig(int i10, int i11, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i10 && audioRecordingConfiguration.getClientAudioSessionId() == i11 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    Logging.d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    public boolean initRecordingIfNeeded() {
        synchronized (this.audioRecordStateLock) {
            try {
                boolean z10 = true;
                if (this.audioRecord != null) {
                    return true;
                }
                if (initRecordingImpl(this.expectedSampleRate, this.expectedChannelCount, false) < 0) {
                    z10 = false;
                }
                return z10;
            } finally {
            }
        }
    }

    @CalledByNative
    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    @CalledByNative
    public boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    @CalledByNative
    public boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        Logging.w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    @CalledByNative
    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public boolean prewarmRecordingIfNeeded() {
        if (this.audioThread != null) {
            return true;
        }
        synchronized (this.audioRecordStateLock) {
            synchronized (this.audioThreadStateLock) {
                if (this.audioThread != null) {
                    return true;
                }
                return startRecordingImpl();
            }
        }
    }

    public void setMicrophoneMute(boolean z10) {
        Logging.w(TAG, "setMicrophoneMute(" + z10 + ")");
        this.microphoneMute = z10;
    }

    @CalledByNative
    public void setNativeAudioRecord(long j10) {
        this.nativeAudioRecord = j10;
    }

    public boolean setNoiseSuppressorEnabled(boolean z10) {
        if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            Logging.e(TAG, "Noise suppressor is not supported.");
            return false;
        }
        Logging.w(TAG, "SetNoiseSuppressorEnabled(" + z10 + ")");
        return this.effects.toggleNS(z10);
    }

    @TargetApi(23)
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.d(TAG, "setPreferredDevice " + (audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null));
        this.preferredDevice = audioDeviceInfo;
        if (this.audioRecord == null || this.audioRecord.setPreferredDevice(audioDeviceInfo)) {
            return;
        }
        Logging.e(TAG, "setPreferredDevice failed");
    }

    public void setUseAudioRecord(boolean z10) {
        Logging.d(TAG, "setUseAudioRecord(" + z10 + ")");
        this.useAudioRecord = z10;
    }

    public boolean startRecordingIfNeeded() {
        this.clientCalledStartRecording.set(true);
        if (this.audioThread == null) {
            synchronized (this.audioRecordStateLock) {
                synchronized (this.audioThreadStateLock) {
                    if (this.audioThread == null) {
                        return startRecordingImpl();
                    }
                }
            }
        }
        return true;
    }

    public boolean stopRecordingIfNeeded() {
        Logging.d(TAG, "stopRecordingIfNeeded");
        synchronized (this.audioRecordStateLock) {
            try {
                this.clientCalledStartRecording.set(false);
                if (this.audioThread == null) {
                    return true;
                }
                return stopRecordingIfNeededImpl();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i10, int i11, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, JavaAudioDeviceModule.AudioBufferCallback audioBufferCallback, boolean z10, boolean z11, int i12, int i13) {
        this.effects = new WebRtcAudioEffects();
        this.audioRecordStateLock = new Object();
        this.useAudioRecord = true;
        this.audioThreadStateLock = new Object();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        this.clientCalledStartRecording = new AtomicBoolean(false);
        this.nativeCalledInitRecording = new AtomicBoolean(false);
        this.nativeCalledStartRecording = new AtomicBoolean(false);
        if (z10 && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        }
        if (z11 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new IllegalArgumentException("HW NS not supported");
        }
        this.context = context;
        this.executor = scheduledExecutorService;
        this.audioManager = audioManager;
        this.audioSource = i10;
        this.audioFormat = i11;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.audioBufferCallback = audioBufferCallback;
        this.isAcousticEchoCancelerSupported = z10;
        this.isNoiseSuppressorSupported = z11;
        this.expectedSampleRate = i12;
        this.expectedChannelCount = i13;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }
}
