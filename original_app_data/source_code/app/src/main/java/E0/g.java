package E0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f3130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3131b;

    public g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3130a = new Object[i10];
    }

    @Override // E0.f
    public boolean a(Object obj) {
        int i10 = this.f3131b;
        Object[] objArr = this.f3130a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f3131b = i10 + 1;
        return true;
    }

    @Override // E0.f
    public Object b() {
        int i10 = this.f3131b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f3130a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f3131b = i10 - 1;
        return obj;
    }

    @Override // E0.f
    public void c(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f3131b;
            Object[] objArr2 = this.f3130a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f3131b = i12 + 1;
            }
        }
    }
}
