package U6;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6.h f16706a;

    public r(L6.h hVar) {
        this.f16706a = (L6.h) AbstractC6056k.l(hVar);
    }

    public String a() {
        try {
            return this.f16706a.h();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public LatLng b() {
        try {
            return this.f16706a.k();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public String c() {
        try {
            return this.f16706a.j();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public String d() {
        try {
            return this.f16706a.p();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void e() {
        try {
            this.f16706a.m();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        try {
            return this.f16706a.I4(((r) obj).f16706a);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean f() {
        try {
            return this.f16706a.G();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void g() {
        try {
            this.f16706a.n();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f16706a.p6(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f16706a.i();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void i(float f10, float f11) {
        try {
            this.f16706a.r5(f10, f11);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f16706a.a0(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f16706a.C1(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void l(C2276c c2276c) {
        try {
            if (c2276c == null) {
                this.f16706a.H(null);
            } else {
                this.f16706a.H(c2276c.a());
            }
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void m(float f10, float f11) {
        try {
            this.f16706a.x0(f10, f11);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void n(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f16706a.Y0(latLng);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void o(float f10) {
        try {
            this.f16706a.t(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void p(String str) {
        try {
            this.f16706a.D5(str);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void q(String str) {
        try {
            this.f16706a.N3(str);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void r(boolean z10) {
        try {
            this.f16706a.D0(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void s(float f10) {
        try {
            this.f16706a.x(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void t() {
        try {
            this.f16706a.z();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }
}
