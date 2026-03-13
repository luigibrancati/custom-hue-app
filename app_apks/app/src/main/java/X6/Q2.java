package X6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2416j3 f18480a;

    public Q2(R6 r62) {
        this.f18480a = r62.g0();
    }

    public final boolean a() {
        try {
            C2416j3 c2416j3 = this.f18480a;
            D6.c cVarA = D6.d.a(c2416j3.d());
            if (cVarA != null) {
                return cVarA.e("com.android.vending", 128).versionCode >= 80837300;
            }
            c2416j3.a().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f18480a.a().w().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
