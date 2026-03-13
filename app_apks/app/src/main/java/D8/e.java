package D8;

import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f2318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f2319d;

    public e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f2316a = str;
        this.f2317b = str2;
        this.f2318c = stackTraceElementArr;
        this.f2319d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
