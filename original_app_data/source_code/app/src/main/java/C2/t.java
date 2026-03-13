package C2;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D1.o f1061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f1063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f1064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u[] f1066l;

    public t(int i10, int i11, long j10, long j11, long j12, long j13, D1.o oVar, int i12, u[] uVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f1055a = i10;
        this.f1056b = i11;
        this.f1057c = j10;
        this.f1058d = j11;
        this.f1059e = j12;
        this.f1060f = j13;
        this.f1061g = oVar;
        this.f1062h = i12;
        this.f1066l = uVarArr;
        this.f1065k = i13;
        this.f1063i = jArr;
        this.f1064j = jArr2;
    }

    public t a(D1.o oVar) {
        return new t(this.f1055a, this.f1056b, this.f1057c, this.f1058d, this.f1059e, this.f1060f, oVar, this.f1062h, this.f1066l, this.f1065k, this.f1063i, this.f1064j);
    }

    public u b(int i10) {
        u[] uVarArr = this.f1066l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i10];
    }
}
