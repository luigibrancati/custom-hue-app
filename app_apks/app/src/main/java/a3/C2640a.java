package a3;

/* JADX INFO: renamed from: a3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2640a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f20932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20933b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20934c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20935d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20936e = null;

    public C2640a(d dVar) {
        this.f20932a = dVar;
    }

    @Override // a3.d
    public void a(int i10, int i11) {
        int i12;
        if (this.f20933b == 1 && i10 >= (i12 = this.f20934c)) {
            int i13 = this.f20935d;
            if (i10 <= i12 + i13) {
                this.f20935d = i13 + i11;
                this.f20934c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f20934c = i10;
        this.f20935d = i11;
        this.f20933b = 1;
    }

    @Override // a3.d
    public void b(int i10, int i11) {
        int i12;
        if (this.f20933b == 2 && (i12 = this.f20934c) >= i10 && i12 <= i10 + i11) {
            this.f20935d += i11;
            this.f20934c = i10;
        } else {
            e();
            this.f20934c = i10;
            this.f20935d = i11;
            this.f20933b = 2;
        }
    }

    @Override // a3.d
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.f20933b == 3) {
            int i13 = this.f20934c;
            int i14 = this.f20935d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f20936e == obj) {
                this.f20934c = Math.min(i10, i13);
                this.f20935d = Math.max(i14 + i13, i12) - this.f20934c;
                return;
            }
        }
        e();
        this.f20934c = i10;
        this.f20935d = i11;
        this.f20936e = obj;
        this.f20933b = 3;
    }

    @Override // a3.d
    public void d(int i10, int i11) {
        e();
        this.f20932a.d(i10, i11);
    }

    public void e() {
        int i10 = this.f20933b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f20932a.a(this.f20934c, this.f20935d);
        } else if (i10 == 2) {
            this.f20932a.b(this.f20934c, this.f20935d);
        } else if (i10 == 3) {
            this.f20932a.c(this.f20934c, this.f20935d, this.f20936e);
        }
        this.f20936e = null;
        this.f20933b = 0;
    }
}
