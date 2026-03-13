package N6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P0 extends AbstractC1513v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f9988d;

    public P0(Object obj, Object[] objArr, int i10) {
        this.f9988d = objArr;
    }

    public static P0 g(int i10, Object[] objArr, AbstractC1500u0 abstractC1500u0) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        Y.b(obj, obj2);
        return new P0(null, objArr, 1);
    }

    @Override // N6.AbstractC1513v0
    public final AbstractC1423o0 a() {
        return new O0(this.f9988d, 1, 1);
    }

    @Override // N6.AbstractC1513v0
    public final AbstractC1526w0 d() {
        return new M0(this, this.f9988d, 0, 1);
    }

    @Override // N6.AbstractC1513v0
    public final AbstractC1526w0 e() {
        return new N0(this, new O0(this.f9988d, 0, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // N6.AbstractC1513v0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
        L3:
            r2 = r0
            goto L19
        L5:
            java.lang.Object[] r2 = r2.f9988d
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L3
            r3 = 1
            r2 = r2[r3]
            java.util.Objects.requireNonNull(r2)
        L19:
            if (r2 != 0) goto L1c
            return r0
        L1c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.P0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}
