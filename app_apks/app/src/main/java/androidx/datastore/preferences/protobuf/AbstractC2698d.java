package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2698d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f22789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f22790b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f22791c;

    static {
        f22791c = (f22789a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f22790b;
    }

    public static boolean c() {
        if (f22789a) {
            return true;
        }
        return (f22790b == null || f22791c) ? false : true;
    }
}
