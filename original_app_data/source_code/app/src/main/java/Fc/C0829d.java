package Fc;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0829d extends AbstractC0826a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc.l f3866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3867b;

    public C0829d(vc.l compute) {
        AbstractC4862t.e(compute, "compute");
        this.f3866a = compute;
        this.f3867b = new ConcurrentHashMap();
    }

    @Override // Fc.AbstractC0826a
    public Object a(Class key) {
        AbstractC4862t.e(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f3867b;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f3866a.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
