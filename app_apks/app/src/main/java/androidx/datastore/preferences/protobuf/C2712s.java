package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2712s implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2712s f22902a = new C2712s();

    public static C2712s c() {
        return f22902a;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public I a(Class cls) {
        if (!AbstractC2713t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (I) AbstractC2713t.t(cls.asSubclass(AbstractC2713t.class)).i();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public boolean b(Class cls) {
        return AbstractC2713t.class.isAssignableFrom(cls);
    }
}
