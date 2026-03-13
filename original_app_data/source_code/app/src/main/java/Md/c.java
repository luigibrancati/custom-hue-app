package Md;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final boolean a(Throwable th) {
        AbstractC4862t.e(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!AbstractC4862t.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable e10) throws Throwable {
        AbstractC4862t.e(e10, "e");
        throw e10;
    }
}
