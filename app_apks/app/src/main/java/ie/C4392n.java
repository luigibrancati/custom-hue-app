package ie;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: ie.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4392n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f37539a = AbstractC4391m.a(16);

    /* JADX INFO: renamed from: ie.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
    }

    public final Object a(ee.e descriptor, a key) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(key, "key");
        Map map = (Map) this.f37539a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(ee.e descriptor, a key, InterfaceC6082a defaultValue) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(defaultValue, "defaultValue");
        Object objA = a(descriptor, key);
        if (objA != null) {
            return objA;
        }
        Object objInvoke = defaultValue.invoke();
        c(descriptor, key, objInvoke);
        return objInvoke;
    }

    public final void c(ee.e descriptor, a key, Object value) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        Map map = this.f37539a;
        Object objA = map.get(descriptor);
        if (objA == null) {
            objA = AbstractC4391m.a(2);
            map.put(descriptor, objA);
        }
        ((Map) objA).put(key, value);
    }
}
