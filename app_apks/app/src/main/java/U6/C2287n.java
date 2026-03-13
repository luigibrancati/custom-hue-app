package U6;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: U6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2287n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6.D f16691a;

    public C2287n(L6.D d10) {
        this.f16691a = (L6.D) AbstractC6056k.l(d10);
    }

    public float a() {
        try {
            return this.f16691a.c();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public LatLngBounds b() {
        try {
            return this.f16691a.j();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public float c() {
        try {
            return this.f16691a.d();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public String d() {
        try {
            return this.f16691a.p();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public LatLng e() {
        try {
            return this.f16691a.h();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2287n)) {
            return false;
        }
        try {
            return this.f16691a.N4(((C2287n) obj).f16691a);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public float f() {
        try {
            return this.f16691a.e();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public float g() {
        try {
            return this.f16691a.i();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public float h() {
        try {
            return this.f16691a.f();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f16691a.g();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean i() {
        try {
            return this.f16691a.g0();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean j() {
        try {
            return this.f16691a.V();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void k() {
        try {
            this.f16691a.m();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void l(float f10) {
        try {
            this.f16691a.Y5(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void m(boolean z10) {
        try {
            this.f16691a.w(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void n(float f10) {
        try {
            this.f16691a.s5(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void o(float f10, float f11) {
        try {
            this.f16691a.J5(f10, f11);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void p(C2276c c2276c) {
        AbstractC6056k.m(c2276c, "imageDescriptor must not be null");
        try {
            this.f16691a.g2(c2276c.a());
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void q(LatLng latLng) {
        try {
            this.f16691a.i2(latLng);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void r(LatLngBounds latLngBounds) {
        try {
            this.f16691a.u0(latLngBounds);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void s(float f10) {
        try {
            this.f16691a.i1(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void t(boolean z10) {
        try {
            this.f16691a.I(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void u(float f10) {
        try {
            this.f16691a.I3(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }
}
