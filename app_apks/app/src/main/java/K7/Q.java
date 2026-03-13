package K7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Q extends AbstractC1085z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f7610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q f7611i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f7612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f7614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f7615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f7616g;

    static {
        Object[] objArr = new Object[0];
        f7610h = objArr;
        f7611i = new Q(objArr, 0, objArr, 0, 0);
    }

    public Q(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f7612c = objArr;
        this.f7613d = i10;
        this.f7614e = objArr2;
        this.f7615f = i11;
        this.f7616g = i12;
    }

    @Override // K7.AbstractC1079t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f7614e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = AbstractC1078s.c(obj);
        while (true) {
            int i10 = iC & this.f7615f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // K7.AbstractC1079t
    public int d(Object[] objArr, int i10) {
        System.arraycopy(this.f7612c, 0, objArr, i10, this.f7616g);
        return i10 + this.f7616g;
    }

    @Override // K7.AbstractC1079t
    public Object[] e() {
        return this.f7612c;
    }

    @Override // K7.AbstractC1079t
    public int f() {
        return this.f7616g;
    }

    @Override // K7.AbstractC1079t
    public int h() {
        return 0;
    }

    @Override // K7.AbstractC1085z, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f7613d;
    }

    @Override // K7.AbstractC1079t
    public boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l */
    public Y iterator() {
        return c().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7616g;
    }

    @Override // K7.AbstractC1085z
    public AbstractC1081v w() {
        return AbstractC1081v.p(this.f7612c, this.f7616g);
    }

    @Override // K7.AbstractC1085z
    public boolean x() {
        return true;
    }
}
