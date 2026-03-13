package R9;

import R9.C2103a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends PhantomReference implements C2103a.InterfaceC0181a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f15002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f15003b;

    public /* synthetic */ r(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, q qVar) {
        super(obj, referenceQueue);
        this.f15002a = set;
        this.f15003b = runnable;
    }

    @Override // R9.C2103a.InterfaceC0181a
    public final void a() {
        if (this.f15002a.remove(this)) {
            clear();
            this.f15003b.run();
        }
    }
}
