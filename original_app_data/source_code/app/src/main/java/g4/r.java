package g4;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements DefaultLifecycleObserver {
    public /* synthetic */ r(AbstractC4854k abstractC4854k) {
        this();
    }

    public abstract void b();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC2758n owner) {
        AbstractC4862t.e(owner, "owner");
        b();
    }

    public r() {
    }

    public void a() {
    }
}
