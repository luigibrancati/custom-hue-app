package Y8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k f19841a;

    public static synchronized k e() {
        try {
            if (f19841a == null) {
                f19841a = new k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19841a;
    }

    @Override // Y8.v
    public String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // Y8.v
    public String c() {
        return "fpr_disabled_android_versions";
    }

    public String d() {
        return "";
    }
}
