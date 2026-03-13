package x;

import E.AbstractC0807p0;
import L.AbstractC1109l0;
import L.C1136z0;
import L.InterfaceC1099g0;
import L.InterfaceC1130w0;
import L.a1;
import L.t1;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class N1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1109l0 f46672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L.a1 f46673b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f46675d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f46677f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B.w f46676e = new B.w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a1.c f46678g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f46674c = new b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Surface f46679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f46680b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f46679a = surface;
            this.f46680b = surfaceTexture;
        }

        @Override // O.c
        public void a(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f46679a.release();
            this.f46680b.release();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements L.s1 {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public final InterfaceC1099g0 f46682P;

        public b() {
            L.M0 m0G0 = L.M0.g0();
            m0G0.H(L.s1.f8188y, new O0());
            m0G0.H(InterfaceC1130w0.f8213j, 34);
            d0(m0G0);
            this.f46682P = m0G0;
        }

        @Override // L.s1
        public t1.b S() {
            return t1.b.METERING_REPEATING;
        }

        public final void d0(L.M0 m02) {
            m02.H(P.q.f12542N, N1.class);
            m02.H(P.q.f12541M, N1.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // L.Y0
        public InterfaceC1099g0 getConfig() {
            return this.f46682P;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a();
    }

    public N1(C6378n c6378n, C6236k1 c6236k1, c cVar) {
        this.f46677f = cVar;
        Size sizeG = g(c6378n, c6236k1);
        this.f46675d = sizeG;
        AbstractC0807p0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeG);
        this.f46673b = d();
    }

    public static /* synthetic */ void a(N1 n12, L.a1 a1Var, a1.g gVar) {
        n12.f46673b = n12.d();
        c cVar = n12.f46677f;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void c() {
        AbstractC0807p0.a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC1109l0 abstractC1109l0 = this.f46672a;
        if (abstractC1109l0 != null) {
            abstractC1109l0.d();
        }
        this.f46672a = null;
    }

    public L.a1 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f46675d.getWidth(), this.f46675d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        a1.b bVarQ = a1.b.q(this.f46674c, this.f46675d);
        bVarQ.y(1);
        C1136z0 c1136z0 = new C1136z0(surface);
        this.f46672a = c1136z0;
        O.n.j(c1136z0.k(), new a(surface, surfaceTexture), N.a.a());
        bVarQ.l(this.f46672a);
        a1.c cVar = this.f46678g;
        if (cVar != null) {
            cVar.b();
        }
        a1.c cVar2 = new a1.c(new a1.d() { // from class: x.L1
            @Override // L.a1.d
            public final void a(L.a1 a1Var, a1.g gVar) {
                N1.a(this.f46661a, a1Var, gVar);
            }
        });
        this.f46678g = cVar2;
        bVarQ.r(cVar2);
        return bVarQ.p();
    }

    public Size e() {
        return this.f46675d;
    }

    public String f() {
        return "MeteringRepeating";
    }

    public final Size g(C6378n c6378n, C6236k1 c6236k1) {
        Size[] sizeArrF = c6378n.e().f(34);
        if (sizeArrF == null) {
            AbstractC0807p0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrA = this.f46676e.a(sizeArrF);
        List listAsList = Arrays.asList(sizeArrA);
        Collections.sort(listAsList, new Comparator() { // from class: x.M1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            }
        });
        Size sizeF = c6236k1.f();
        long jMin = Math.min(((long) sizeF.getWidth()) * ((long) sizeF.getHeight()), 307200L);
        int length = sizeArrA.length;
        Size size = null;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = sizeArrA[i10];
            long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
            if (width == jMin) {
                return size2;
            }
            if (width <= jMin) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) listAsList.get(0);
    }

    public L.a1 h() {
        return this.f46673b;
    }

    public L.s1 i() {
        return this.f46674c;
    }
}
