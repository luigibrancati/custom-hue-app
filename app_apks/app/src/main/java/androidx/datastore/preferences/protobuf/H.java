package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f22727a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f22728b = new G();

    public static F a() {
        return f22727a;
    }

    public static F b() {
        return f22728b;
    }

    public static F c() {
        if (V.f22756d) {
            return null;
        }
        try {
            return (F) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
