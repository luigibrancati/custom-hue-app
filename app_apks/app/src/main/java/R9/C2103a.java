package R9;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: R9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2103a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f14949a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f14950b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: R9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0181a {
        void a();
    }

    public static C2103a a() {
        C2103a c2103a = new C2103a();
        c2103a.b(c2103a, new Runnable() { // from class: R9.o
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c2103a.f14949a;
        final Set set = c2103a.f14950b;
        Thread thread = new Thread(new Runnable() { // from class: R9.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((r) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c2103a;
    }

    public InterfaceC0181a b(Object obj, Runnable runnable) {
        r rVar = new r(obj, this.f14949a, this.f14950b, runnable, null);
        this.f14950b.add(rVar);
        return rVar;
    }
}
