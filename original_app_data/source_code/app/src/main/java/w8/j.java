package w8;

import org.json.JSONObject;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H8.a f46372a = new J8.d().j(C6164a.f46323a).i();

    public static j a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new C6165b(str, str2, i(str3), str4, j10);
    }

    public static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.AbstractC0662e h() {
        return F.e.d.AbstractC0662e.a().d(F.e.d.AbstractC0662e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
