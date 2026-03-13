package U6;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: U6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2280g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6.w f16673a;

    public C2280g(L6.w wVar) {
        this.f16673a = (L6.w) AbstractC6056k.l(wVar);
    }

    public String a() {
        try {
            return this.f16673a.j();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void b() {
        try {
            this.f16673a.m();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void c(LatLng latLng) {
        try {
            AbstractC6056k.m(latLng, "center must not be null.");
            this.f16673a.t4(latLng);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void d(boolean z10) {
        try {
            this.f16673a.w(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void e(int i10) {
        try {
            this.f16673a.U(i10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2280g)) {
            return false;
        }
        try {
            return this.f16673a.M0(((C2280g) obj).f16673a);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void f(double d10) {
        try {
            this.f16673a.G5(d10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f16673a.q1(i10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f16673a.X1(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f16673a.g();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void i(boolean z10) {
        try {
            this.f16673a.F(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void j(float f10) {
        try {
            this.f16673a.t(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }
}
