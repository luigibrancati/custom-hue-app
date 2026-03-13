package rb;

/* JADX INFO: renamed from: rb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5693b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43942a = 0;

    public boolean a(int i10) {
        return (this.f43942a == i10 || c()) ? false : true;
    }

    public int b() {
        return this.f43942a;
    }

    public boolean c() {
        return this.f43942a == 0;
    }

    public void d() {
        int i10 = this.f43942a;
        int i11 = i10 + 1;
        this.f43942a = i11;
        if (i11 == 0) {
            this.f43942a = i10 + 2;
        }
    }
}
