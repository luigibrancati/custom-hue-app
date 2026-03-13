package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.JniCommon;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    private static final String TAG = "JavaAudioDeviceModule";
    public final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    public final WebRtcAudioTrack audioOutput;
    private final Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AudioBufferCallback {
        long onBuffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int i10, int i11, int i12, byte[] bArr) {
            this.audioFormat = i10;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private AudioAttributes audioAttributes;
        private AudioBufferCallback audioBufferCallback;
        private int audioFormat;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private AudioRecordStateCallback audioRecordStateCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private AudioTrackStateCallback audioTrackStateCallback;
        private final Context context;
        private boolean enableVolumeLogger;
        private int inputSampleRate;
        private int outputSampleRate;
        private PlaybackSamplesReadyCallback playbackSamplesReadyCallback;
        private SamplesReadyCallback samplesReadyCallback;
        private ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useLowLatency;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        public JavaAudioDeviceModule createAudioDeviceModule() {
            Logging.d(JavaAudioDeviceModule.TAG, "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                Logging.d(JavaAudioDeviceModule.TAG, "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.d(JavaAudioDeviceModule.TAG, "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.d(JavaAudioDeviceModule.TAG, "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.d(JavaAudioDeviceModule.TAG, "HW AEC will not be used.");
            }
            if (this.useLowLatency) {
                Logging.d(JavaAudioDeviceModule.TAG, "Low latency mode will be used.");
            }
            ScheduledExecutorService scheduledExecutorServiceNewDefaultScheduler = this.scheduler;
            if (scheduledExecutorServiceNewDefaultScheduler == null) {
                scheduledExecutorServiceNewDefaultScheduler = WebRtcAudioRecord.newDefaultScheduler();
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, scheduledExecutorServiceNewDefaultScheduler, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.audioBufferCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor, this.inputSampleRate, this.useStereoInput ? 2 : 1), new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.playbackSamplesReadyCallback, this.useLowLatency, this.enableVolumeLogger), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setAudioBufferCallback(AudioBufferCallback audioBufferCallback) {
            this.audioBufferCallback = audioBufferCallback;
            return this;
        }

        public Builder setAudioFormat(int i10) {
            this.audioFormat = i10;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public Builder setAudioSource(int i10) {
            this.audioSource = i10;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public Builder setEnableVolumeLogger(boolean z10) {
            this.enableVolumeLogger = z10;
            return this;
        }

        public Builder setInputSampleRate(int i10) {
            Logging.d(JavaAudioDeviceModule.TAG, "Input sample rate overridden to: " + i10);
            this.inputSampleRate = i10;
            return this;
        }

        public Builder setOutputSampleRate(int i10) {
            Logging.d(JavaAudioDeviceModule.TAG, "Output sample rate overridden to: " + i10);
            this.outputSampleRate = i10;
            return this;
        }

        public Builder setPlaybackSamplesReadyCallback(PlaybackSamplesReadyCallback playbackSamplesReadyCallback) {
            this.playbackSamplesReadyCallback = playbackSamplesReadyCallback;
            return this;
        }

        public Builder setSampleRate(int i10) {
            Logging.d(JavaAudioDeviceModule.TAG, "Input/Output sample rate overridden to: " + i10);
            this.inputSampleRate = i10;
            this.outputSampleRate = i10;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setScheduler(ScheduledExecutorService scheduledExecutorService) {
            this.scheduler = scheduledExecutorService;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z10) {
            if (z10 && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW AEC not supported");
                z10 = false;
            }
            this.useHardwareAcousticEchoCanceler = z10;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z10) {
            if (z10 && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW NS not supported");
                z10 = false;
            }
            this.useHardwareNoiseSuppressor = z10;
            return this;
        }

        public Builder setUseLowLatency(boolean z10) {
            this.useLowLatency = z10;
            return this;
        }

        public Builder setUseStereoInput(boolean z10) {
            this.useStereoInput = z10;
            return this;
        }

        public Builder setUseStereoOutput(boolean z10) {
            this.useStereoOutput = z10;
            return this;
        }

        private Builder(Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.audioManager = audioManager;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.useLowLatency = false;
            this.enableVolumeLogger = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface PlaybackSamplesReadyCallback {
        void onWebRtcAudioTrackSamplesReady(AudioSamples audioSamples);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public static Builder builder(Context context) {
        return new Builder(context);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i10, int i11, boolean z10, boolean z11);

    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j10;
        synchronized (this.nativeLock) {
            try {
                if (this.nativeAudioDeviceModule == 0) {
                    this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                }
                j10 = this.nativeAudioDeviceModule;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }

    public void prewarmRecording() {
        this.audioInput.initRecordingIfNeeded();
        this.audioInput.prewarmRecordingIfNeeded();
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            try {
                long j10 = this.nativeAudioDeviceModule;
                if (j10 != 0) {
                    JniCommon.nativeReleaseRef(j10);
                    this.nativeAudioDeviceModule = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void requestStartRecording() {
        this.audioInput.initRecordingIfNeeded();
        this.audioInput.startRecordingIfNeeded();
    }

    public void requestStopRecording() {
        this.audioInput.initRecordingIfNeeded();
        this.audioInput.stopRecordingIfNeeded();
    }

    public void setAudioRecordEnabled(boolean z10) {
        this.audioInput.setUseAudioRecord(z10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z10) {
        Logging.d(TAG, "setMicrophoneMute: " + z10);
        this.audioInput.setMicrophoneMute(z10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public boolean setNoiseSuppressorEnabled(boolean z10) {
        Logging.d(TAG, "setNoiseSuppressorEnabled: " + z10);
        return this.audioInput.setNoiseSuppressorEnabled(z10);
    }

    public void setPreferredInputDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.d(TAG, "setPreferredInputDevice: " + audioDeviceInfo.getId());
        this.audioInput.setPreferredDevice(audioDeviceInfo);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z10) {
        Logging.d(TAG, "setSpeakerMute: " + z10);
        this.audioOutput.setSpeakerMute(z10);
    }

    private JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i10, int i11, boolean z10, boolean z11) {
        this.nativeLock = new Object();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i10;
        this.outputSampleRate = i11;
        this.useStereoInput = z10;
        this.useStereoOutput = z11;
    }
}
