package c3;

import fc.C4015H;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: c3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2939a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC6082a f25580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f25581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f25582c;

    public C2939a(InterfaceC6082a closeAction) {
        AbstractC4862t.e(closeAction, "closeAction");
        this.f25580a = closeAction;
        this.f25581b = new AtomicInteger(0);
        this.f25582c = new AtomicBoolean(false);
    }

    public final boolean a() {
        synchronized (this) {
            if (b()) {
                return false;
            }
            this.f25581b.incrementAndGet();
            return true;
        }
    }

    public final boolean b() {
        return this.f25582c.get();
    }

    public final void c() {
        synchronized (this) {
            this.f25581b.decrementAndGet();
            if (this.f25581b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            C4015H c4015h = C4015H.f34254a;
        }
    }
}
