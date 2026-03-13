package Sd;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import fc.AbstractC4036s;
import fc.C4035r;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f15872a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            C4035r.a aVar = C4035r.f34274b;
            objB = C4035r.b(new f(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        f15872a = (g) (C4035r.g(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
