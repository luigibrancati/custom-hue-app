package N6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: N6.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280d0 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1358j0 f10204a;

    public C1280d0(C1358j0 c1358j0) {
        this.f10204a = c1358j0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10204a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapO = this.f10204a.o();
        if (mapO != null) {
            return mapO.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZ = this.f10204a.z(entry.getKey());
            if (iZ != -1 && AbstractC1538x.a(C1358j0.m(this.f10204a, iZ), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1358j0 c1358j0 = this.f10204a;
        Map mapO = c1358j0.o();
        return mapO != null ? mapO.entrySet().iterator() : new C1254b0(c1358j0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapO = this.f10204a.o();
        if (mapO != null) {
            return mapO.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C1358j0 c1358j0 = this.f10204a;
        if (c1358j0.u()) {
            return false;
        }
        int iY = c1358j0.y();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C1358j0 c1358j02 = this.f10204a;
        int iB = AbstractC1371k0.b(key, value, iY, C1358j0.l(c1358j02), c1358j02.a(), c1358j02.b(), c1358j02.c());
        if (iB == -1) {
            return false;
        }
        this.f10204a.t(iB, iY);
        C1358j0 c1358j03 = this.f10204a;
        c1358j03.f10335f--;
        this.f10204a.r();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10204a.size();
    }
}
