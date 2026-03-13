package K;

import E.AbstractC0807p0;
import E.C0781c0;
import E.C0785e0;
import K.C0965g;
import K.C0980w;
import K.P;
import L.X0;
import U.C2272u;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f6525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U.w f6526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraCharacteristics f6527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f6528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U.y f6529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U.y f6530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public U.y f6531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U.y f6532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public U.y f6533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public U.y f6534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public U.y f6535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public U.y f6536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public U.y f6537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final X0 f6538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6539o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public static a e(int i10, List list) {
            return new C0962d(new C2272u(), new C2272u(), i10, list);
        }

        public abstract C2272u a();

        public abstract int b();

        public abstract List c();

        public abstract C2272u d();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public static b c(Q q10, androidx.camera.core.d dVar) {
            return new C0963e(q10, dVar);
        }

        public abstract androidx.camera.core.d a();

        public abstract Q b();
    }

    public P(Executor executor, CameraCharacteristics cameraCharacteristics, U.w wVar) {
        this(executor, cameraCharacteristics, wVar, R.b.c());
    }

    public static /* synthetic */ void b(final P p10, final b bVar) {
        p10.getClass();
        if (bVar.b().l()) {
            bVar.a().close();
        } else {
            p10.f6525a.execute(new Runnable() { // from class: K.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6513a.k(bVar);
                }
            });
        }
    }

    public static /* synthetic */ void d(final P p10, final b bVar) {
        p10.getClass();
        if (!bVar.b().l()) {
            p10.f6525a.execute(new Runnable() { // from class: K.H
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6511a.m(bVar);
                }
            });
        } else {
            AbstractC0807p0.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    public final U.z i(U.z zVar, int i10) {
        X0.h.i(T.b.e(zVar.e()));
        U.z zVar2 = (U.z) this.f6533i.apply(zVar);
        U.y yVar = this.f6537m;
        if (yVar != null) {
            zVar2 = (U.z) yVar.apply(zVar2);
        }
        return (U.z) this.f6531g.apply(C0965g.b.c(zVar2, i10));
    }

    public androidx.camera.core.d j(b bVar) {
        Q qB = bVar.b();
        U.z zVar = (U.z) this.f6529e.apply(bVar);
        List listC = this.f6528d.c();
        X0.h.a(!listC.isEmpty());
        int iIntValue = ((Integer) listC.get(0)).intValue();
        if ((zVar.e() == 35 || this.f6537m != null || this.f6539o) && iIntValue == 256) {
            U.z zVarI = (U.z) this.f6530f.apply(C0980w.a.c(zVar, qB.c()));
            if (this.f6537m != null) {
                zVarI = i(zVarI, qB.c());
            }
            zVar = (U.z) this.f6535k.apply(zVarI);
        }
        androidx.camera.core.d dVar = (androidx.camera.core.d) this.f6534j.apply(zVar);
        if (listC.size() > 1) {
            qB.k().s(dVar.getFormat(), true);
        }
        return dVar;
    }

    public void k(b bVar) {
        final Q qB = bVar.b();
        try {
            boolean z10 = true;
            if (this.f6528d.c().size() <= 1) {
                z10 = false;
            }
            if (bVar.b().m()) {
                final androidx.camera.core.d dVarJ = j(bVar);
                N.a.d().execute(new Runnable() { // from class: K.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        qB.r(dVarJ);
                    }
                });
                return;
            }
            final C0781c0.h hVarL = l(bVar);
            if (z10 && !qB.k().q()) {
                return;
            }
            N.a.d().execute(new Runnable() { // from class: K.K
                @Override // java.lang.Runnable
                public final void run() {
                    qB.q(hVarL);
                }
            });
        } catch (C0785e0 e10) {
            o(qB, e10);
        } catch (OutOfMemoryError e11) {
            o(qB, new C0785e0(0, "Processing failed due to low memory.", e11));
        } catch (RuntimeException e12) {
            o(qB, new C0785e0(0, "Processing failed.", e12));
        }
    }

    public C0781c0.h l(b bVar) {
        List listC = this.f6528d.c();
        X0.h.a(!listC.isEmpty());
        Integer num = (Integer) listC.get(0);
        int iIntValue = num.intValue();
        X0.h.b(T.b.e(iIntValue) || T.b.f(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        Q qB = bVar.b();
        qB.d();
        X0.h.b(false, "OutputFileOptions cannot be empty");
        U.z zVar = (U.z) this.f6529e.apply(bVar);
        if (listC.size() <= 1) {
            if (iIntValue != 32) {
                qB.d();
                throw null;
            }
            qB.d();
            throw null;
        }
        qB.d();
        X0.h.b(false, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (zVar.e() != 32) {
            qB.g();
            throw null;
        }
        qB.d();
        throw null;
    }

    public void m(b bVar) {
        final Q qB = bVar.b();
        try {
            U.z zVar = (U.z) this.f6529e.apply(bVar);
            int iE = zVar.e();
            X0.h.b(iE == 35 || iE == 256 || iE == 4101, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(iE)));
            final Bitmap bitmap = (Bitmap) this.f6536l.apply(zVar);
            N.a.d().execute(new Runnable() { // from class: K.L
                @Override // java.lang.Runnable
                public final void run() {
                    qB.t(bitmap);
                }
            });
        } catch (Exception e10) {
            bVar.a().close();
            AbstractC0807p0.d("ProcessingNode", "process postview input packet failed.", e10);
        }
    }

    public final void o(final Q q10, final C0785e0 c0785e0) {
        N.a.d().execute(new Runnable() { // from class: K.M
            @Override // java.lang.Runnable
            public final void run() {
                q10.u(c0785e0);
            }
        });
    }

    public Void p(a aVar) {
        this.f6528d = aVar;
        aVar.a().a(new X0.a() { // from class: K.N
            @Override // X0.a
            public final void accept(Object obj) {
                P.b(this.f6523a, (P.b) obj);
            }
        });
        aVar.d().a(new X0.a() { // from class: K.O
            @Override // X0.a
            public final void accept(Object obj) {
                P.d(this.f6524a, (P.b) obj);
            }
        });
        this.f6529e = new G();
        this.f6530f = new C0980w(this.f6538n);
        this.f6533i = new C0983z();
        this.f6531g = new C0965g();
        this.f6532h = new A();
        this.f6534j = new C();
        this.f6536l = new C0979v();
        if (aVar.b() != 35 && !this.f6539o) {
            return null;
        }
        this.f6535k = new B();
        return null;
    }

    public P(Executor executor, CameraCharacteristics cameraCharacteristics, U.w wVar, X0 x02) {
        if (R.b.b(LowMemoryQuirk.class) != null) {
            this.f6525a = N.a.f(executor);
        } else {
            this.f6525a = executor;
        }
        this.f6526b = wVar;
        this.f6527c = cameraCharacteristics;
        this.f6538n = x02;
        this.f6539o = x02.a(IncorrectJpegMetadataQuirk.class);
    }

    public void n() {
    }
}
