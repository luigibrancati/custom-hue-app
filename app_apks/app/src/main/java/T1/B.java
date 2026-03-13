package T1;

import G1.AbstractC0853a;
import G1.I;
import T1.m;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f15889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15890b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements m.b {
        @Override // T1.m.b
        public m b(m.a aVar) throws Throwable {
            MediaCodec mediaCodec = null;
            byte b10 = 0;
            try {
                MediaCodec mediaCodecC = c(aVar);
                try {
                    I.a("configureCodec");
                    Surface surface = aVar.f15952d;
                    mediaCodecC.configure(aVar.f15950b, surface, aVar.f15953e, (surface == null && aVar.f15949a.f15969k && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    I.b();
                    I.a("startCodec");
                    mediaCodecC.start();
                    I.b();
                    return new B(mediaCodecC, aVar.f15954f);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e11) {
                e = e11;
            }
        }

        public MediaCodec c(m.a aVar) throws IOException {
            AbstractC0853a.e(aVar.f15949a);
            String str = aVar.f15949a.f15959a;
            I.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            I.b();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void k(B b10, m.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        b10.getClass();
        dVar.a(b10, j10, j11);
    }

    @Override // T1.m
    public void a(int i10, int i11, J1.c cVar, long j10, int i12) {
        this.f15889a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // T1.m
    public void b() {
        this.f15889a.detachOutputSurface();
    }

    @Override // T1.m
    public void d(final m.d dVar, Handler handler) {
        this.f15889a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: T1.A
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                B.k(this.f15887a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // T1.m
    public void e(int i10) {
        this.f15889a.setVideoScalingMode(i10);
    }

    @Override // T1.m
    public void f(Surface surface) {
        this.f15889a.setOutputSurface(surface);
    }

    @Override // T1.m
    public void flush() {
        this.f15889a.flush();
    }

    @Override // T1.m
    public boolean g() {
        return false;
    }

    @Override // T1.m
    public ByteBuffer getInputBuffer(int i10) {
        return this.f15889a.getInputBuffer(i10);
    }

    @Override // T1.m
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f15889a.getOutputBuffer(i10);
    }

    @Override // T1.m
    public MediaFormat getOutputFormat() {
        return this.f15889a.getOutputFormat();
    }

    @Override // T1.m
    public void h(int i10, long j10) {
        this.f15889a.releaseOutputBuffer(i10, j10);
    }

    @Override // T1.m
    public int i() {
        return this.f15889a.dequeueInputBuffer(0L);
    }

    @Override // T1.m
    public int j(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f15889a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // T1.m
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f15889a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // T1.m
    public void release() {
        k kVar;
        k kVar2;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 33) {
                this.f15889a.stop();
            }
            if (i10 >= 35 && (kVar2 = this.f15890b) != null) {
                kVar2.d(this.f15889a);
            }
            this.f15889a.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (kVar = this.f15890b) != null) {
                kVar.d(this.f15889a);
            }
            this.f15889a.release();
            throw th;
        }
    }

    @Override // T1.m
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f15889a.releaseOutputBuffer(i10, z10);
    }

    @Override // T1.m
    public void setParameters(Bundle bundle) {
        this.f15889a.setParameters(bundle);
    }

    public B(MediaCodec mediaCodec, k kVar) {
        this.f15889a = mediaCodec;
        this.f15890b = kVar;
        if (Build.VERSION.SDK_INT < 35 || kVar == null) {
            return;
        }
        kVar.b(mediaCodec);
    }
}
