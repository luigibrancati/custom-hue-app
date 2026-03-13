package I3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: I3.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0884n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5621a;

    static {
        String strI = AbstractC0890u.i("InputMerger");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f5621a = strI;
    }

    public static final AbstractC0882l a(String className) {
        AbstractC4862t.e(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            AbstractC4862t.c(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (AbstractC0882l) objNewInstance;
        } catch (Exception e10) {
            AbstractC0890u.e().d(f5621a, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
