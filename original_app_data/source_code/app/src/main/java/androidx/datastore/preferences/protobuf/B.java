package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2719z f22712a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2719z f22713b = new A();

    public static InterfaceC2719z a() {
        return f22712a;
    }

    public static InterfaceC2719z b() {
        return f22713b;
    }

    public static InterfaceC2719z c() {
        if (V.f22756d) {
            return null;
        }
        try {
            return (InterfaceC2719z) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
