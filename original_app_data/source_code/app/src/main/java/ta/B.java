package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class B implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f44827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f44828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44830d;

    public B(l lVar, p pVar, boolean z10, boolean z11) {
        this.f44827a = lVar;
        this.f44828b = pVar;
        this.f44829c = z10;
        this.f44830d = z11;
    }

    private boolean c() {
        if (this.f44829c) {
            return false;
        }
        return !this.f44830d;
    }

    @Override // ta.w
    public boolean a() {
        return !c() || this.f44827a.a();
    }

    @Override // ta.w
    public boolean b() {
        return this.f44828b.a();
    }
}
