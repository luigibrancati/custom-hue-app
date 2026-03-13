package U6;

import android.os.RemoteException;
import java.util.List;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: U6.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2297y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6.m f16752a;

    public C2297y(L6.m mVar) {
        this.f16752a = (L6.m) AbstractC6056k.l(mVar);
    }

    public String a() {
        try {
            return this.f16752a.j();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void b() {
        try {
            this.f16752a.q();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f16752a.A5(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f16752a.L5(i10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void e(C2279f c2279f) {
        AbstractC6056k.m(c2279f, "endCap must not be null");
        try {
            this.f16752a.F2(c2279f);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2297y)) {
            return false;
        }
        try {
            return this.f16752a.Q1(((C2297y) obj).f16752a);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void f(boolean z10) {
        try {
            this.f16752a.V1(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f16752a.s(i10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void h(List list) {
        try {
            this.f16752a.g3(list);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f16752a.f();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void i(List list) {
        AbstractC6056k.m(list, "points must not be null");
        try {
            this.f16752a.b1(list);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void j(C2279f c2279f) {
        AbstractC6056k.m(c2279f, "startCap must not be null");
        try {
            this.f16752a.y6(c2279f);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f16752a.U1(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void l(float f10) {
        try {
            this.f16752a.l0(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f16752a.x(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }
}
