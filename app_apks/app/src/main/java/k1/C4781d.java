package k1;

import fc.C4034q;
import gc.C4179C;
import gc.C4204q;
import gc.C4207u;
import gc.P;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k1.AbstractC4785h;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: k1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4781d extends AbstractC4785h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4779b f39191b;

    public C4781d() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static final CharSequence n(Map.Entry entry) {
        AbstractC4862t.e(entry, "entry");
        Object value = entry.getValue();
        return "  " + ((AbstractC4785h.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? C4204q.p0((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
    }

    @Override // k1.AbstractC4785h
    public Map a() {
        C4034q c4034q;
        Set<Map.Entry> setEntrySet = this.f39190a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC4862t.d(bArrCopyOf, "copyOf(...)");
                c4034q = new C4034q(key, bArrCopyOf);
            } else {
                c4034q = new C4034q(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c4034q.e(), c4034q.f());
        }
        return AbstractC4778a.b(linkedHashMap);
    }

    @Override // k1.AbstractC4785h
    public boolean b(AbstractC4785h.a key) {
        AbstractC4862t.e(key, "key");
        return this.f39190a.containsKey(key);
    }

    @Override // k1.AbstractC4785h
    public Object c(AbstractC4785h.a key) {
        AbstractC4862t.e(key, "key");
        Object obj = this.f39190a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC4862t.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof k1.C4781d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            k1.d r6 = (k1.C4781d) r6
            java.util.Map r0 = r6.f39190a
            java.util.Map r2 = r5.f39190a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map r2 = r5.f39190a
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map r6 = r6.f39190a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L26
            return r3
        L26:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map r2 = r5.f39190a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L63
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5e
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L63
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L63
            r0 = r3
            goto L64
        L5e:
            boolean r0 = kotlin.jvm.internal.AbstractC4862t.a(r0, r2)
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L2e
            return r1
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C4781d.equals(java.lang.Object):boolean");
    }

    public final void g() {
        if (this.f39191b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void h() {
        g();
        this.f39190a.clear();
    }

    public int hashCode() {
        Iterator it = this.f39190a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i() {
        this.f39191b.b(true);
    }

    public final void j(AbstractC4785h.b... pairs) {
        AbstractC4862t.e(pairs, "pairs");
        g();
        if (pairs.length <= 0) {
            return;
        }
        AbstractC4785h.b bVar = pairs[0];
        throw null;
    }

    public final Object k(AbstractC4785h.a key) {
        AbstractC4862t.e(key, "key");
        g();
        return this.f39190a.remove(key);
    }

    public final void l(AbstractC4785h.a key, Object obj) {
        AbstractC4862t.e(key, "key");
        m(key, obj);
    }

    public final void m(AbstractC4785h.a key, Object obj) {
        AbstractC4862t.e(key, "key");
        g();
        if (obj == null) {
            k(key);
            return;
        }
        if (obj instanceof Set) {
            this.f39190a.put(key, AbstractC4778a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f39190a.put(key, obj);
            return;
        }
        Map map = this.f39190a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC4862t.d(bArrCopyOf, "copyOf(...)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return C4179C.q0(this.f39190a.entrySet(), ",\n", "{\n", "\n}", 0, null, new vc.l() { // from class: k1.c
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C4781d.n((Map.Entry) obj);
            }
        }, 24, null);
    }

    public C4781d(Map preferencesMap, boolean z10) {
        AbstractC4862t.e(preferencesMap, "preferencesMap");
        this.f39190a = preferencesMap;
        this.f39191b = new C4779b(z10);
    }

    public /* synthetic */ C4781d(Map map, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }
}
