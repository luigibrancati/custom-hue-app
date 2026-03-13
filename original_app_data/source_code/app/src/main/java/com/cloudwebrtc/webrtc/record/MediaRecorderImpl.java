package com.cloudwebrtc.webrtc.record;

import android.util.Log;
import com.cloudwebrtc.webrtc.utils.EglUtils;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.VideoTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class MediaRecorderImpl {
    private static final String TAG = "MediaRecorderImpl";
    private AudioFileRenderer audioFileRenderer;
    private final AudioSamplesInterceptor audioInterceptor;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final Integer f28813id;
    private File recordFile;
    private VideoFileRenderer videoFileRenderer;
    private final VideoTrack videoTrack;
    private boolean isRunning = false;
    private final ExecutorService releaseExecutor = Executors.newSingleThreadExecutor();

    public MediaRecorderImpl(Integer num, VideoTrack videoTrack, AudioSamplesInterceptor audioSamplesInterceptor) {
        this.f28813id = num;
        this.videoTrack = videoTrack;
        this.audioInterceptor = audioSamplesInterceptor;
    }

    public static /* synthetic */ void a(MediaRecorderImpl mediaRecorderImpl, Runnable runnable) {
        mediaRecorderImpl.videoFileRenderer.release();
        mediaRecorderImpl.videoFileRenderer = null;
        if (runnable != null) {
            runnable.run();
        }
        mediaRecorderImpl.releaseExecutor.shutdown();
    }

    public File getRecordFile() {
        return this.recordFile;
    }

    public void startRecording(File file) throws Exception {
        this.recordFile = file;
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        file.getParentFile().mkdirs();
        if (this.videoTrack == null) {
            Log.d(TAG, "Video track is null - checking for audio-only recording");
            if (this.audioInterceptor == null) {
                throw new Exception("Both video track and audio interceptor are null - cannot record");
            }
            AudioFileRenderer audioFileRenderer = new AudioFileRenderer(file.getAbsolutePath());
            this.audioFileRenderer = audioFileRenderer;
            this.audioInterceptor.attachCallback(this.f28813id, audioFileRenderer);
            return;
        }
        VideoFileRenderer videoFileRenderer = new VideoFileRenderer(file.getAbsolutePath(), EglUtils.getRootEglBaseContext(), this.audioInterceptor != null);
        this.videoFileRenderer = videoFileRenderer;
        this.videoTrack.addSink(videoFileRenderer);
        AudioSamplesInterceptor audioSamplesInterceptor = this.audioInterceptor;
        if (audioSamplesInterceptor != null) {
            audioSamplesInterceptor.attachCallback(this.f28813id, this.videoFileRenderer);
        }
    }

    public void stopRecording(final Runnable runnable) {
        VideoFileRenderer videoFileRenderer;
        this.isRunning = false;
        AudioSamplesInterceptor audioSamplesInterceptor = this.audioInterceptor;
        if (audioSamplesInterceptor != null) {
            audioSamplesInterceptor.detachCallback(this.f28813id);
        }
        VideoTrack videoTrack = this.videoTrack;
        if (videoTrack == null || (videoFileRenderer = this.videoFileRenderer) == null) {
            if (runnable != null) {
                runnable.run();
            }
            this.releaseExecutor.shutdown();
        } else {
            videoTrack.removeSink(videoFileRenderer);
            this.releaseExecutor.submit(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.d
                @Override // java.lang.Runnable
                public final void run() {
                    MediaRecorderImpl.a(this.f28819a, runnable);
                }
            });
        }
        AudioFileRenderer audioFileRenderer = this.audioFileRenderer;
        if (audioFileRenderer != null) {
            audioFileRenderer.release();
            this.audioFileRenderer = null;
        }
    }
}
