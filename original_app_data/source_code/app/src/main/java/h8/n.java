package h8;

import android.content.Context;
import android.text.TextUtils;
import org.apache.tika.metadata.ClimateForcast;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import v6.C6059n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36315g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f36316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f36317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f36318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f36319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f36320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f36321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f36322g;

        public n a() {
            return new n(this.f36317b, this.f36316a, this.f36318c, this.f36319d, this.f36320e, this.f36321f, this.f36322g);
        }

        public b b(String str) {
            this.f36316a = AbstractC6056k.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f36317b = AbstractC6056k.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f36318c = str;
            return this;
        }

        public b e(String str) {
            this.f36319d = str;
            return this;
        }

        public b f(String str) {
            this.f36320e = str;
            return this;
        }

        public b g(String str) {
            this.f36322g = str;
            return this;
        }

        public b h(String str) {
            this.f36321f = str;
            return this;
        }
    }

    public static n a(Context context) {
        C6059n c6059n = new C6059n(context);
        String strA = c6059n.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new n(strA, c6059n.a("google_api_key"), c6059n.a("firebase_database_url"), c6059n.a("ga_trackingId"), c6059n.a("gcm_defaultSenderId"), c6059n.a("google_storage_bucket"), c6059n.a(ClimateForcast.PROJECT_ID));
    }

    public String b() {
        return this.f36309a;
    }

    public String c() {
        return this.f36310b;
    }

    public String d() {
        return this.f36311c;
    }

    public String e() {
        return this.f36312d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC6055j.a(this.f36310b, nVar.f36310b) && AbstractC6055j.a(this.f36309a, nVar.f36309a) && AbstractC6055j.a(this.f36311c, nVar.f36311c) && AbstractC6055j.a(this.f36312d, nVar.f36312d) && AbstractC6055j.a(this.f36313e, nVar.f36313e) && AbstractC6055j.a(this.f36314f, nVar.f36314f) && AbstractC6055j.a(this.f36315g, nVar.f36315g);
    }

    public String f() {
        return this.f36313e;
    }

    public String g() {
        return this.f36315g;
    }

    public String h() {
        return this.f36314f;
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f36310b, this.f36309a, this.f36311c, this.f36312d, this.f36313e, this.f36314f, this.f36315g);
    }

    public String toString() {
        return AbstractC6055j.c(this).a("applicationId", this.f36310b).a("apiKey", this.f36309a).a("databaseUrl", this.f36311c).a("gcmSenderId", this.f36313e).a("storageBucket", this.f36314f).a("projectId", this.f36315g).toString();
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC6056k.q(!B6.n.a(str), "ApplicationId must be set.");
        this.f36310b = str;
        this.f36309a = str2;
        this.f36311c = str3;
        this.f36312d = str4;
        this.f36313e = str5;
        this.f36314f = str6;
        this.f36315g = str7;
    }
}
