package O6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X5 extends P5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P5 f11523f = new X5(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f11524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f11525e;

    public X5(Object obj, Object[] objArr, int i10) {
        this.f11524d = objArr;
        this.f11525e = i10;
    }

    public static X5 g(int i10, Object[] objArr, O5 o52) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC1695j3.a(obj, obj2);
        return new X5(null, objArr, 1);
    }

    @Override // O6.P5
    public final M4 a() {
        return new W5(this.f11524d, 1, this.f11525e);
    }

    @Override // O6.P5
    public final Q5 d() {
        return new U5(this, this.f11524d, 0, this.f11525e);
    }

    @Override // O6.P5
    public final Q5 e() {
        return new V5(this, new W5(this.f11524d, 0, this.f11525e));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // O6.P5, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r3.f11524d
            int r3 = r3.f11525e
            r1 = 0
            if (r4 != 0) goto L9
        L7:
            r3 = r1
            goto L1d
        L9:
            r2 = 1
            if (r3 != r2) goto L7
            r3 = 0
            r3 = r0[r3]
            r3.getClass()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7
            r3 = r0[r2]
            r3.getClass()
        L1d:
            if (r3 != 0) goto L20
            return r1
        L20:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O6.X5.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11525e;
    }
}
