package i4;

import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2757m;
import androidx.lifecycle.InterfaceC2758n;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC2754j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f37107b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC2758n f37108c = new InterfaceC2758n() { // from class: i4.g
        @Override // androidx.lifecycle.InterfaceC2758n
        public final AbstractC2754j getLifecycle() {
            return h.e();
        }
    };

    public static final AbstractC2754j e() {
        return f37107b;
    }

    @Override // androidx.lifecycle.AbstractC2754j
    public void a(InterfaceC2757m observer) {
        AbstractC4862t.e(observer, "observer");
        if (!(observer instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) observer;
        InterfaceC2758n interfaceC2758n = f37108c;
        defaultLifecycleObserver.onCreate(interfaceC2758n);
        defaultLifecycleObserver.onStart(interfaceC2758n);
        defaultLifecycleObserver.onResume(interfaceC2758n);
    }

    @Override // androidx.lifecycle.AbstractC2754j
    public AbstractC2754j.b b() {
        return AbstractC2754j.b.RESUMED;
    }

    @Override // androidx.lifecycle.AbstractC2754j
    public void c(InterfaceC2757m observer) {
        AbstractC4862t.e(observer, "observer");
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
