package Fc;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f3837a = new ConcurrentHashMap();

    public static final Qc.k a(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        ClassLoader classLoaderF = Rc.d.f(cls);
        M m10 = new M(classLoaderF);
        ConcurrentMap concurrentMap = f3837a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(m10);
        if (weakReference != null) {
            Qc.k kVar = (Qc.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(m10, weakReference);
        }
        Qc.k kVarA = Qc.k.f14272c.a(classLoaderF);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f3837a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(m10, new WeakReference(kVarA));
                if (weakReference2 == null) {
                    return kVarA;
                }
                Qc.k kVar2 = (Qc.k) weakReference2.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(m10, weakReference2);
            } finally {
                m10.a(null);
            }
        }
    }
}
