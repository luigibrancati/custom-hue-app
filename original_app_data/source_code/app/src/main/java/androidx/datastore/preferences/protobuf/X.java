package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class X implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f22762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f22764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22765d;

    public X(K k10, String str, Object[] objArr) {
        this.f22762a = k10;
        this.f22763b = str;
        this.f22764c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f22765d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f22765d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public boolean a() {
        return (this.f22765d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public K b() {
        return this.f22762a;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public U c() {
        int i10 = this.f22765d;
        return (i10 & 1) != 0 ? U.PROTO2 : (i10 & 4) == 4 ? U.EDITIONS : U.PROTO3;
    }

    public Object[] d() {
        return this.f22764c;
    }

    public String e() {
        return this.f22763b;
    }
}
