package A7;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f168a = new AtomicReference(null);

    public static G a() {
        return (G) f168a.get();
    }

    public static void b(G g10) {
        AtomicReference atomicReference = f168a;
        while (!T1.e.a(atomicReference, null, g10) && atomicReference.get() == null) {
        }
    }
}
