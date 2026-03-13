package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f44873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[][] f44874b;

    public p(n nVar, String[][] strArr) {
        this.f44873a = nVar;
        this.f44874b = strArr;
    }

    public boolean a() {
        boolean zA = true;
        for (String[] strArr : this.f44874b) {
            zA &= this.f44873a.a(strArr);
        }
        return zA;
    }
}
