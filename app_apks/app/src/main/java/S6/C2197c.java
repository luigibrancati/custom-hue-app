package S6;

import T6.InterfaceC2229b;
import U6.C2274a;
import U6.C2275b;
import U6.C2280g;
import U6.C2281h;
import U6.C2287n;
import U6.C2288o;
import U6.C2289p;
import U6.C2290q;
import U6.C2291s;
import U6.C2295w;
import U6.C2296x;
import U6.C2297y;
import U6.C2298z;
import U6.J;
import U6.K;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: S6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2197c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2229b f15389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2289p f15390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15391c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f15392d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S6.j f15393e;

    /* JADX INFO: renamed from: S6.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
    }

    /* JADX INFO: renamed from: S6.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        View b(U6.r rVar);

        View c(U6.r rVar);
    }

    /* JADX INFO: renamed from: S6.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0186c {
        void onCameraIdle();
    }

    /* JADX INFO: renamed from: S6.c$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void onCameraMove();
    }

    /* JADX INFO: renamed from: S6.c$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        void onCameraMoveStarted(int i10);
    }

    /* JADX INFO: renamed from: S6.c$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        void onCircleClick(C2280g c2280g);
    }

    /* JADX INFO: renamed from: S6.c$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g {
        void onGroundOverlayClick(C2287n c2287n);
    }

    /* JADX INFO: renamed from: S6.c$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface h {
        void onInfoWindowClick(U6.r rVar);
    }

    /* JADX INFO: renamed from: S6.c$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface i {
        void a(U6.r rVar);
    }

    /* JADX INFO: renamed from: S6.c$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface j {
        void onMapClick(LatLng latLng);
    }

    /* JADX INFO: renamed from: S6.c$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface k {
        void onMapLongClick(LatLng latLng);
    }

    /* JADX INFO: renamed from: S6.c$l */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface l {
        boolean onMarkerClick(U6.r rVar);
    }

    /* JADX INFO: renamed from: S6.c$m */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface m {
        void onMarkerDrag(U6.r rVar);

        void onMarkerDragEnd(U6.r rVar);

        void onMarkerDragStart(U6.r rVar);
    }

    /* JADX INFO: renamed from: S6.c$n */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface n {
        void onPolygonClick(C2295w c2295w);
    }

    /* JADX INFO: renamed from: S6.c$o */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface o {
        void onPolylineClick(C2297y c2297y);
    }

    /* JADX INFO: renamed from: S6.c$p */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface p {
        void a(Bitmap bitmap);
    }

    public C2197c(InterfaceC2229b interfaceC2229b) {
        this.f15389a = (InterfaceC2229b) AbstractC6056k.l(interfaceC2229b);
    }

    public final void A(boolean z10) {
        try {
            this.f15389a.setMyLocationEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void B(InterfaceC0186c interfaceC0186c) {
        try {
            if (interfaceC0186c == null) {
                this.f15389a.Q5(null);
            } else {
                this.f15389a.Q5(new D(this, interfaceC0186c));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void C(d dVar) {
        try {
            if (dVar == null) {
                this.f15389a.s6(null);
            } else {
                this.f15389a.s6(new C(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void D(e eVar) {
        try {
            if (eVar == null) {
                this.f15389a.j0(null);
            } else {
                this.f15389a.j0(new B(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void E(f fVar) {
        try {
            if (fVar == null) {
                this.f15389a.P4(null);
            } else {
                this.f15389a.P4(new x(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void F(g gVar) {
        try {
            if (gVar == null) {
                this.f15389a.o1(null);
            } else {
                this.f15389a.o1(new w(this, gVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void G(h hVar) {
        try {
            if (hVar == null) {
                this.f15389a.S4(null);
            } else {
                this.f15389a.S4(new t(this, hVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void H(i iVar) {
        try {
            if (iVar == null) {
                this.f15389a.j6(null);
            } else {
                this.f15389a.j6(new u(this, iVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void I(j jVar) {
        try {
            if (jVar == null) {
                this.f15389a.f5(null);
            } else {
                this.f15389a.f5(new E(this, jVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void J(k kVar) {
        try {
            if (kVar == null) {
                this.f15389a.H2(null);
            } else {
                this.f15389a.H2(new S6.l(this, kVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void K(l lVar) {
        try {
            if (lVar == null) {
                this.f15389a.e1(null);
            } else {
                this.f15389a.e1(new S6.k(this, lVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void L(m mVar) {
        try {
            if (mVar == null) {
                this.f15389a.j1(null);
            } else {
                this.f15389a.j1(new s(this, mVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void M(n nVar) {
        try {
            if (nVar == null) {
                this.f15389a.V2(null);
            } else {
                this.f15389a.V2(new y(this, nVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void N(o oVar) {
        try {
            if (oVar == null) {
                this.f15389a.Z2(null);
            } else {
                this.f15389a.Z2(new z(this, oVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void O(int i10, int i11, int i12, int i13) {
        try {
            this.f15389a.r4(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void P(boolean z10) {
        try {
            this.f15389a.setTrafficEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void Q(p pVar) {
        AbstractC6056k.m(pVar, "Callback must not be null.");
        R(pVar, null);
    }

    public final void R(p pVar, Bitmap bitmap) {
        AbstractC6056k.m(pVar, "Callback must not be null.");
        try {
            this.f15389a.p2(new A(this, pVar), (ObjectWrapper) (bitmap != null ? ObjectWrapper.wrap(bitmap) : null));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final C2280g a(C2281h c2281h) {
        try {
            AbstractC6056k.m(c2281h, "CircleOptions must not be null.");
            return new C2280g(this.f15389a.W1(c2281h));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final C2287n b(C2288o c2288o) {
        try {
            AbstractC6056k.m(c2288o, "GroundOverlayOptions must not be null.");
            L6.D dE2 = this.f15389a.e2(c2288o);
            if (dE2 != null) {
                return new C2287n(dE2);
            }
            return null;
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final U6.r c(C2291s c2291s) {
        if (c2291s instanceof C2275b) {
            c2291s.U(1);
        }
        try {
            AbstractC6056k.m(c2291s, "MarkerOptions must not be null.");
            L6.h hVarQ5 = this.f15389a.q5(c2291s);
            if (hVarQ5 != null) {
                return c2291s.R() == 1 ? new C2274a(hVarQ5) : new U6.r(hVarQ5);
            }
            return null;
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final C2295w d(C2296x c2296x) {
        try {
            AbstractC6056k.m(c2296x, "PolygonOptions must not be null");
            return new C2295w(this.f15389a.h5(c2296x));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final C2297y e(C2298z c2298z) {
        try {
            AbstractC6056k.m(c2298z, "PolylineOptions must not be null");
            return new C2297y(this.f15389a.o6(c2298z));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final J f(K k10) {
        try {
            AbstractC6056k.m(k10, "TileOverlayOptions must not be null.");
            L6.p pVarE6 = this.f15389a.e6(k10);
            if (pVarE6 != null) {
                return new J(pVarE6);
            }
            return null;
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void g(C2195a c2195a) {
        try {
            AbstractC6056k.m(c2195a, "CameraUpdate must not be null.");
            this.f15389a.a3(c2195a.a());
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void h(C2195a c2195a, int i10, a aVar) {
        try {
            AbstractC6056k.m(c2195a, "CameraUpdate must not be null.");
            this.f15389a.t6(c2195a.a(), i10, aVar == null ? null : new S6.m(aVar));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final CameraPosition i() {
        try {
            return this.f15389a.getCameraPosition();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public C2289p j() {
        if (this.f15390b == null) {
            try {
                this.f15390b = new C2289p(this.f15389a.N1());
            } catch (RemoteException e10) {
                throw new U6.B(e10);
            }
        }
        return this.f15390b;
    }

    public final float k() {
        try {
            return this.f15389a.q3();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final float l() {
        try {
            return this.f15389a.Q3();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final S6.i m() {
        try {
            return new S6.i(this.f15389a.E());
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final S6.j n() {
        try {
            if (this.f15393e == null) {
                this.f15393e = new S6.j(this.f15389a.H5());
            }
            return this.f15393e;
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final boolean o() {
        try {
            return this.f15389a.M5();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final boolean p() {
        try {
            return this.f15389a.isTrafficEnabled();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void q(C2195a c2195a) {
        try {
            AbstractC6056k.m(c2195a, "CameraUpdate must not be null.");
            this.f15389a.F4(c2195a.a());
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void r() {
        try {
            this.f15389a.w5();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void s(boolean z10) {
        try {
            this.f15389a.setBuildingsEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final boolean t(boolean z10) {
        try {
            return this.f15389a.setIndoorEnabled(z10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void u(b bVar) {
        try {
            if (bVar == null) {
                this.f15389a.P2(null);
            } else {
                this.f15389a.P2(new v(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void v(LatLngBounds latLngBounds) {
        try {
            this.f15389a.L0(latLngBounds);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public boolean w(C2290q c2290q) {
        try {
            return this.f15389a.n1(c2290q);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void x(int i10) {
        try {
            this.f15389a.setMapType(i10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void y(float f10) {
        try {
            this.f15389a.T1(f10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public void z(float f10) {
        try {
            this.f15389a.i5(f10);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }
}
