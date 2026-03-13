package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G implements F {
    public static int i(int i10, Object obj, Object obj2) {
        E e10 = (E) obj;
        D d10 = (D) obj2;
        int iA = 0;
        if (e10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : e10.entrySet()) {
            iA += d10.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static E j(Object obj, Object obj2) {
        E eR = (E) obj;
        E e10 = (E) obj2;
        if (!e10.isEmpty()) {
            if (!eR.o()) {
                eR = eR.r();
            }
            eR.q(e10);
        }
        return eR;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public D.a b(Object obj) {
        return ((D) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Map c(Object obj) {
        return (E) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Object d(Object obj) {
        return E.i().r();
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Map e(Object obj) {
        return (E) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Object f(Object obj) {
        ((E) obj).p();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public boolean h(Object obj) {
        return !((E) obj).o();
    }
}
