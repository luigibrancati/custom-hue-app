package M6;

import java.util.Arrays;

/* JADX INFO: renamed from: M6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1217h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f9336a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9337b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1216g f9338c;

    public final C1217h a(Object obj, Object obj2) {
        int i10 = this.f9337b + 1;
        Object[] objArr = this.f9336a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f9336a = Arrays.copyOf(objArr, AbstractC1211b.a(length, i11));
        }
        X.a(obj, obj2);
        Object[] objArr2 = this.f9336a;
        int i12 = this.f9337b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f9337b = i12 + 1;
        return this;
    }

    public final AbstractC1218i b() {
        C1216g c1216g = this.f9338c;
        if (c1216g != null) {
            throw c1216g.a();
        }
        C1226q c1226qG = C1226q.g(this.f9337b, this.f9336a, this);
        C1216g c1216g2 = this.f9338c;
        if (c1216g2 == null) {
            return c1226qG;
        }
        throw c1216g2.a();
    }
}
