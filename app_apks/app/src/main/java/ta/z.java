package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class z implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f44903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f44904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44907e;

    public z(l lVar, p pVar, int i10, int i11, boolean z10) {
        this.f44903a = lVar;
        this.f44904b = pVar;
        this.f44906d = i10;
        this.f44907e = i11;
        this.f44905c = z10;
    }

    @Override // ta.w
    public boolean a() {
        return !c() || this.f44903a.a();
    }

    @Override // ta.w
    public boolean b() {
        return this.f44904b.a();
    }

    public final boolean c() {
        if (this.f44905c) {
            return false;
        }
        return this.f44907e >= 29 || this.f44906d >= 23;
    }
}
