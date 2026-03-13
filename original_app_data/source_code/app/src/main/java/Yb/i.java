package Yb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f19884e;

    public i() {
        this(16, 0.75f);
    }

    public static int c(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    public boolean a(Object obj) {
        Object obj2;
        Object[] objArr = this.f19884e;
        int i10 = this.f19881b;
        int iC = c(obj.hashCode()) & i10;
        Object obj3 = objArr[iC];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                iC = (iC + 1) & i10;
                obj2 = objArr[iC];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[iC] = obj;
        int i11 = this.f19882c + 1;
        this.f19882c = i11;
        if (i11 >= this.f19883d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f19884e;
    }

    public void d() {
        Object obj;
        Object[] objArr = this.f19884e;
        int length = objArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        Object[] objArr2 = new Object[i10];
        int i12 = this.f19882c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f19881b = i11;
                this.f19883d = (int) (i10 * this.f19880a);
                this.f19884e = objArr2;
                return;
            }
            do {
                length--;
                obj = objArr[length];
            } while (obj == null);
            int iC = c(obj.hashCode()) & i11;
            if (objArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i11;
                } while (objArr2[iC] != null);
            }
            objArr2[iC] = objArr[length];
            i12 = i13;
        }
    }

    public boolean e(Object obj) {
        Object obj2;
        Object[] objArr = this.f19884e;
        int i10 = this.f19881b;
        int iC = c(obj.hashCode()) & i10;
        Object obj3 = objArr[iC];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            return f(iC, objArr, i10);
        }
        do {
            iC = (iC + 1) & i10;
            obj2 = objArr[iC];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return f(iC, objArr, i10);
    }

    public boolean f(int i10, Object[] objArr, int i11) {
        int i12;
        Object obj;
        this.f19882c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i10] = null;
                    return true;
                }
                int iC = c(obj.hashCode()) & i11;
                if (i10 <= i12) {
                    if (i10 >= iC || iC > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < iC || iC <= i12) {
                    i13 = i12 + 1;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }

    public i(int i10, float f10) {
        this.f19880a = f10;
        int iA = j.a(i10);
        this.f19881b = iA - 1;
        this.f19883d = (int) (f10 * iA);
        this.f19884e = new Object[iA];
    }
}
