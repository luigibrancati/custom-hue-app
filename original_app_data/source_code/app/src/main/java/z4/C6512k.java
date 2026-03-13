package z4;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: z4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6512k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6512k f48773a = new C6512k();

    public final boolean a(String clazz, A4.a aVar) {
        AbstractC4862t.e(clazz, "clazz");
        return b(clazz, aVar) != null;
    }

    public final Class b(String str, A4.a aVar) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            if (aVar == null) {
                return null;
            }
            aVar.a("Class not available:" + str + ": " + e10);
            return null;
        } catch (UnsatisfiedLinkError e11) {
            if (aVar == null) {
                return null;
            }
            aVar.d("Failed to load (UnsatisfiedLinkError) " + str + ": " + e11);
            return null;
        } catch (Throwable th) {
            if (aVar == null) {
                return null;
            }
            aVar.d("Failed to initialize " + str + ": " + th);
            return null;
        }
    }
}
