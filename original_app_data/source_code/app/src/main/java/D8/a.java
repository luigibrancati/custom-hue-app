package D8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f2312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2313c;

    public a(int i10, d... dVarArr) {
        this.f2311a = i10;
        this.f2312b = dVarArr;
        this.f2313c = new b(i10);
    }

    @Override // D8.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f2311a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f2312b) {
            if (stackTraceElementArrA.length <= this.f2311a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f2311a ? this.f2313c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
