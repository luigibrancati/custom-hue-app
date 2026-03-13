package ta;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f44862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[][] f44863b;

    public j(n nVar, String[][] strArr) {
        this.f44862a = nVar;
        this.f44863b = strArr;
    }

    public boolean a() {
        boolean zA = true;
        for (String[] strArr : this.f44863b) {
            zA &= this.f44862a.a(strArr);
        }
        return zA;
    }
}
