package com.cloudwebrtc.webrtc.audio;

import android.os.SystemClock;
import com.cloudwebrtc.webrtc.LocalTrack;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrack;
import org.webrtc.AudioTrackSink;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class LocalAudioTrack extends LocalTrack implements JavaAudioDeviceModule.SamplesReadyCallback {
    final List<AudioTrackSink> sinks;

    public LocalAudioTrack(AudioTrack audioTrack) {
        super(audioTrack);
        this.sinks = new ArrayList();
    }

    private int getBytesPerSample(int i10) {
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

    public void addSink(AudioTrackSink audioTrackSink) {
        synchronized (this.sinks) {
            this.sinks.add(audioTrackSink);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        int bytesPerSample = getBytesPerSample(audioSamples.getAudioFormat()) * 8;
        int sampleRate = audioSamples.getSampleRate() / 100;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.sinks) {
            try {
                Iterator<AudioTrackSink> it = this.sinks.iterator();
                while (it.hasNext()) {
                    it.next().onData(ByteBuffer.wrap(audioSamples.getData()), bytesPerSample, audioSamples.getSampleRate(), audioSamples.getChannelCount(), sampleRate, jElapsedRealtime);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeSink(AudioTrackSink audioTrackSink) {
        synchronized (this.sinks) {
            this.sinks.remove(audioTrackSink);
        }
    }
}
