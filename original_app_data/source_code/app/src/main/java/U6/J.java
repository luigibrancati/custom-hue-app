package U6;

import android.os.RemoteException;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6.p f16651a;

    public J(L6.p pVar) {
        this.f16651a = (L6.p) AbstractC6056k.l(pVar);
    }

    public void a() {
        try {
            this.f16651a.f();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean b() {
        try {
            return this.f16651a.n();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public float c() {
        try {
            return this.f16651a.c();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public float d() {
        try {
            return this.f16651a.d();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean e() {
        try {
            return this.f16651a.q();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof J)) {
            return false;
        }
        try {
            return this.f16651a.t3(((J) obj).f16651a);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void f() {
        try {
            this.f16651a.g();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void g(boolean z10) {
        try {
            this.f16651a.y4(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f16651a.H4(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f16651a.e();
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void i(boolean z10) {
        try {
            this.f16651a.M3(z10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }

    public void j(float f10) {
        try {
            this.f16651a.S3(f10);
        } catch (RemoteException e10) {
            throw new B(e10);
        }
    }
}
