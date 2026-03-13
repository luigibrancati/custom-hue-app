package T1;

import G1.I;
import T1.C2226b;
import T1.m;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: T1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2226b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f15894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f15895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f15896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f15897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15899f;

    /* JADX INFO: renamed from: T1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0197b implements m.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J7.t f15900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final J7.t f15901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15902d;

        public C0197b(final int i10) {
            this(new J7.t() { // from class: T1.c
                @Override // J7.t
                public final Object get() {
                    return C2226b.C0197b.d(i10);
                }
            }, new J7.t() { // from class: T1.d
                @Override // J7.t
                public final Object get() {
                    return C2226b.C0197b.c(i10);
                }
            });
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(C2226b.p(i10));
        }

        public static /* synthetic */ HandlerThread d(int i10) {
            return new HandlerThread(C2226b.o(i10));
        }

        public static boolean g(D1.o oVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || D1.v.t(oVar.f1805o);
        }

        @Override // T1.m.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C2226b b(m.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            n fVar;
            int i10;
            C2226b c2226b;
            String str = aVar.f15949a.f15959a;
            C2226b c2226b2 = null;
            try {
                I.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f15902d && g(aVar.f15951c)) {
                        fVar = new C(mediaCodecCreateByCodecName);
                        i10 = 4;
                    } else {
                        fVar = new f(mediaCodecCreateByCodecName, (HandlerThread) this.f15901c.get());
                        i10 = 0;
                    }
                    c2226b = new C2226b(mediaCodecCreateByCodecName, (HandlerThread) this.f15900b.get(), fVar, aVar.f15954f);
                } catch (Exception e10) {
                    exc = e10;
                }
            } catch (Exception e11) {
                exc = e11;
                mediaCodecCreateByCodecName = null;
            }
            try {
                I.b();
                Surface surface = aVar.f15952d;
                if (surface == null && aVar.f15949a.f15969k && Build.VERSION.SDK_INT >= 35) {
                    i10 |= 8;
                }
                c2226b.r(aVar.f15950b, surface, aVar.f15953e, i10);
                return c2226b;
            } catch (Exception e12) {
                exc = e12;
                c2226b2 = c2226b;
                if (c2226b2 != null) {
                    c2226b2.release();
                    throw exc;
                }
                if (mediaCodecCreateByCodecName == null) {
                    throw exc;
                }
                mediaCodecCreateByCodecName.release();
                throw exc;
            }
        }

        public void f(boolean z10) {
            this.f15902d = z10;
        }

        public C0197b(J7.t tVar, J7.t tVar2) {
            this.f15900b = tVar;
            this.f15901c = tVar2;
            this.f15902d = false;
        }
    }

    public static /* synthetic */ void k(C2226b c2226b, m.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        c2226b.getClass();
        dVar.a(c2226b, j10, j11);
    }

    public static String o(int i10) {
        return q(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String p(int i10) {
        return q(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String q(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // T1.m
    public void a(int i10, int i11, J1.c cVar, long j10, int i12) {
        this.f15896c.a(i10, i11, cVar, j10, i12);
    }

    @Override // T1.m
    public void b() {
        this.f15894a.detachOutputSurface();
    }

    @Override // T1.m
    public boolean c(m.c cVar) {
        this.f15895b.p(cVar);
        return true;
    }

    @Override // T1.m
    public void d(final m.d dVar, Handler handler) {
        this.f15894a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: T1.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                C2226b.k(this.f15892a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // T1.m
    public void e(int i10) {
        this.f15894a.setVideoScalingMode(i10);
    }

    @Override // T1.m
    public void f(Surface surface) {
        this.f15894a.setOutputSurface(surface);
    }

    @Override // T1.m
    public void flush() {
        this.f15896c.flush();
        this.f15894a.flush();
        this.f15895b.e();
        this.f15894a.start();
    }

    @Override // T1.m
    public boolean g() {
        return false;
    }

    @Override // T1.m
    public ByteBuffer getInputBuffer(int i10) {
        return this.f15894a.getInputBuffer(i10);
    }

    @Override // T1.m
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f15894a.getOutputBuffer(i10);
    }

    @Override // T1.m
    public MediaFormat getOutputFormat() {
        return this.f15895b.g();
    }

    @Override // T1.m
    public void h(int i10, long j10) {
        this.f15894a.releaseOutputBuffer(i10, j10);
    }

    @Override // T1.m
    public int i() {
        this.f15896c.b();
        return this.f15895b.c();
    }

    @Override // T1.m
    public int j(MediaCodec.BufferInfo bufferInfo) {
        this.f15896c.b();
        return this.f15895b.d(bufferInfo);
    }

    @Override // T1.m
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f15896c.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public final void r(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        k kVar;
        this.f15895b.h(this.f15894a);
        I.a("configureCodec");
        this.f15894a.configure(mediaFormat, surface, mediaCrypto, i10);
        I.b();
        this.f15896c.start();
        I.a("startCodec");
        this.f15894a.start();
        I.b();
        if (Build.VERSION.SDK_INT >= 35 && (kVar = this.f15897d) != null) {
            kVar.b(this.f15894a);
        }
        this.f15899f = 1;
    }

    @Override // T1.m
    public void release() {
        k kVar;
        k kVar2;
        try {
            if (this.f15899f == 1) {
                this.f15896c.shutdown();
                this.f15895b.q();
            }
            this.f15899f = 2;
            if (this.f15898e) {
                return;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 33) {
                    this.f15894a.stop();
                }
                if (i10 >= 35 && (kVar2 = this.f15897d) != null) {
                    kVar2.d(this.f15894a);
                }
                this.f15894a.release();
                this.f15898e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f15898e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 33) {
                        this.f15894a.stop();
                    }
                    if (i11 >= 35 && (kVar = this.f15897d) != null) {
                        kVar.d(this.f15894a);
                    }
                    this.f15894a.release();
                    this.f15898e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // T1.m
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f15894a.releaseOutputBuffer(i10, z10);
    }

    @Override // T1.m
    public void setParameters(Bundle bundle) {
        this.f15896c.setParameters(bundle);
    }

    public C2226b(MediaCodec mediaCodec, HandlerThread handlerThread, n nVar, k kVar) {
        this.f15894a = mediaCodec;
        this.f15895b = new h(handlerThread);
        this.f15896c = nVar;
        this.f15897d = kVar;
        this.f15899f = 0;
    }
}
