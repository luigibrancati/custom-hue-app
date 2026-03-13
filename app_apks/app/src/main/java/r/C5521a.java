package r;

import java.util.HashMap;
import java.util.Map;
import r.C5522b;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5521a extends C5522b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f43484e = new HashMap();

    public boolean contains(Object obj) {
        return this.f43484e.containsKey(obj);
    }

    @Override // r.C5522b
    public C5522b.c d(Object obj) {
        return (C5522b.c) this.f43484e.get(obj);
    }

    @Override // r.C5522b
    public Object k(Object obj, Object obj2) {
        C5522b.c cVarD = d(obj);
        if (cVarD != null) {
            return cVarD.f43490b;
        }
        this.f43484e.put(obj, h(obj, obj2));
        return null;
    }

    @Override // r.C5522b
    public Object l(Object obj) {
        Object objL = super.l(obj);
        this.f43484e.remove(obj);
        return objL;
    }

    public Map.Entry n(Object obj) {
        if (contains(obj)) {
            return ((C5522b.c) this.f43484e.get(obj)).f43492d;
        }
        return null;
    }
}
