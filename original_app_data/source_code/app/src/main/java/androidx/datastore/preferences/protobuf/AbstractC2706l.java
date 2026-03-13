package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2706l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f22881a = c();

    public static C2707m a() {
        C2707m c2707mB = b("getEmptyRegistry");
        return c2707mB != null ? c2707mB : C2707m.f22887c;
    }

    public static final C2707m b(String str) {
        Class cls = f22881a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2707m) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
