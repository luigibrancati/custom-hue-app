package U6;

import android.os.RemoteException;
import java.util.List;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: U6.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2295w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6.k f16740a;

    public C2295w(L6.k kVar) {
        this.f16740a = (L6.k) AbstractC6056k.l(kVar);
    }

    public String a() {
        try {
            return this.f16740a.h();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void b() {
        try {
            this.f16740a.n();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f16740a.w(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f16740a.U(i10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void e(boolean z10) {
        try {
            this.f16740a.a0(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2295w)) {
            return false;
        }
        try {
            return this.f16740a.R3(((C2295w) obj).f16740a);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void f(List list) {
        try {
            this.f16740a.S2(list);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void g(List list) {
        try {
            AbstractC6056k.m(list, "points must not be null.");
            this.f16740a.q2(list);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void h(int i10) {
        try {
            this.f16740a.s(i10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f16740a.g();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void i(float f10) {
        try {
            this.f16740a.t(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f16740a.v2(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f16740a.R1(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }
}
