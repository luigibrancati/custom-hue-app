package b7;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: b7.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2864M extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25404a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2859H f25405b = new C2859H();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f25407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f25408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f25409f;

    public final void A() {
        if (this.f25407d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void B() {
        synchronized (this.f25404a) {
            try {
                if (this.f25406c) {
                    this.f25405b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task a(Executor executor, InterfaceC2871e interfaceC2871e) {
        this.f25405b.a(new C2890x(executor, interfaceC2871e));
        B();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task b(InterfaceC2872f interfaceC2872f) {
        this.f25405b.a(new C2892z(AbstractC2879m.f25415a, interfaceC2872f));
        B();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task c(Executor executor, InterfaceC2872f interfaceC2872f) {
        this.f25405b.a(new C2892z(executor, interfaceC2872f));
        B();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task d(Activity activity, InterfaceC2873g interfaceC2873g) {
        C2853B c2853b = new C2853B(AbstractC2879m.f25415a, interfaceC2873g);
        this.f25405b.a(c2853b);
        C2863L.l(activity).m(c2853b);
        B();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(InterfaceC2873g interfaceC2873g) {
        f(AbstractC2879m.f25415a, interfaceC2873g);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, InterfaceC2873g interfaceC2873g) {
        this.f25405b.a(new C2853B(executor, interfaceC2873g));
        B();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Activity activity, InterfaceC2874h interfaceC2874h) {
        C2855D c2855d = new C2855D(AbstractC2879m.f25415a, interfaceC2874h);
        this.f25405b.a(c2855d);
        C2863L.l(activity).m(c2855d);
        B();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task h(InterfaceC2874h interfaceC2874h) {
        i(AbstractC2879m.f25415a, interfaceC2874h);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task i(Executor executor, InterfaceC2874h interfaceC2874h) {
        this.f25405b.a(new C2855D(executor, interfaceC2874h));
        B();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task j(Executor executor, InterfaceC2869c interfaceC2869c) {
        C2864M c2864m = new C2864M();
        this.f25405b.a(new C2886t(executor, interfaceC2869c, c2864m));
        B();
        return c2864m;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task k(Executor executor, InterfaceC2869c interfaceC2869c) {
        C2864M c2864m = new C2864M();
        this.f25405b.a(new C2888v(executor, interfaceC2869c, c2864m));
        B();
        return c2864m;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception l() {
        Exception exc;
        synchronized (this.f25404a) {
            exc = this.f25409f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object m() {
        Object obj;
        synchronized (this.f25404a) {
            try {
                y();
                A();
                Exception exc = this.f25409f;
                if (exc != null) {
                    throw new C2876j(exc);
                }
                obj = this.f25408e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object n(Class cls) {
        Object obj;
        synchronized (this.f25404a) {
            try {
                y();
                A();
                if (cls.isInstance(this.f25409f)) {
                    throw ((Throwable) cls.cast(this.f25409f));
                }
                Exception exc = this.f25409f;
                if (exc != null) {
                    throw new C2876j(exc);
                }
                obj = this.f25408e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean o() {
        return this.f25407d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean p() {
        boolean z10;
        synchronized (this.f25404a) {
            z10 = this.f25406c;
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean q() {
        boolean z10;
        synchronized (this.f25404a) {
            try {
                z10 = false;
                if (this.f25406c && !this.f25407d && this.f25409f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task r(InterfaceC2877k interfaceC2877k) {
        Executor executor = AbstractC2879m.f25415a;
        C2864M c2864m = new C2864M();
        this.f25405b.a(new C2857F(executor, interfaceC2877k, c2864m));
        B();
        return c2864m;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task s(Executor executor, InterfaceC2877k interfaceC2877k) {
        C2864M c2864m = new C2864M();
        this.f25405b.a(new C2857F(executor, interfaceC2877k, c2864m));
        B();
        return c2864m;
    }

    public final void t(Object obj) {
        synchronized (this.f25404a) {
            z();
            this.f25406c = true;
            this.f25408e = obj;
        }
        this.f25405b.b(this);
    }

    public final boolean u(Object obj) {
        synchronized (this.f25404a) {
            try {
                if (this.f25406c) {
                    return false;
                }
                this.f25406c = true;
                this.f25408e = obj;
                this.f25405b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Exception exc) {
        AbstractC6056k.m(exc, "Exception must not be null");
        synchronized (this.f25404a) {
            z();
            this.f25406c = true;
            this.f25409f = exc;
        }
        this.f25405b.b(this);
    }

    public final boolean w(Exception exc) {
        AbstractC6056k.m(exc, "Exception must not be null");
        synchronized (this.f25404a) {
            try {
                if (this.f25406c) {
                    return false;
                }
                this.f25406c = true;
                this.f25409f = exc;
                this.f25405b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean x() {
        synchronized (this.f25404a) {
            try {
                if (this.f25406c) {
                    return false;
                }
                this.f25406c = true;
                this.f25407d = true;
                this.f25405b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y() {
        AbstractC6056k.q(this.f25406c, "Task is not yet complete");
    }

    public final void z() {
        if (this.f25406c) {
            throw C2870d.a(this);
        }
    }
}
