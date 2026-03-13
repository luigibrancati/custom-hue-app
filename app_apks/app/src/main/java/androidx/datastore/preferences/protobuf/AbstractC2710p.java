package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2710p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2708n f22891a = new C2709o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2708n f22892b = c();

    public static AbstractC2708n a() {
        AbstractC2708n abstractC2708n = f22892b;
        if (abstractC2708n != null) {
            return abstractC2708n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC2708n b() {
        return f22891a;
    }

    public static AbstractC2708n c() {
        if (V.f22756d) {
            return null;
        }
        try {
            return (AbstractC2708n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
