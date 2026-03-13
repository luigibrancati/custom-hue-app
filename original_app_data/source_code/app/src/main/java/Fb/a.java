package Fb;

import Eb.q;
import Ib.b;
import Jb.e;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile e f3816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile e f3817b;

    public static Object a(e eVar, Object obj) {
        try {
            return eVar.apply(obj);
        } catch (Throwable th) {
            throw b.a(th);
        }
    }

    public static q b(e eVar, Callable callable) {
        q qVar = (q) a(eVar, callable);
        if (qVar != null) {
            return qVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    public static q c(Callable callable) {
        try {
            q qVar = (q) callable.call();
            if (qVar != null) {
                return qVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw b.a(th);
        }
    }

    public static q d(Callable callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        e eVar = f3816a;
        return eVar == null ? c(callable) : b(eVar, callable);
    }

    public static q e(q qVar) {
        if (qVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        e eVar = f3817b;
        return eVar == null ? qVar : (q) a(eVar, qVar);
    }
}
