package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f22753a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f22754b = new Q();

    public static P a() {
        return f22753a;
    }

    public static P b() {
        return f22754b;
    }

    public static P c() {
        if (V.f22756d) {
            return null;
        }
        try {
            return (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
