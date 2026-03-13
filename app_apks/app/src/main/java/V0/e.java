package V0;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f17206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17210h;

    public e(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    public final String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List b() {
        return this.f17206d;
    }

    public int c() {
        return this.f17207e;
    }

    public String d() {
        return this.f17210h;
    }

    public String e() {
        return this.f17203a;
    }

    public String f() {
        return this.f17204b;
    }

    public String g() {
        return this.f17205c;
    }

    public String h() {
        return this.f17208f;
    }

    public String i() {
        return this.f17209g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f17203a + ", mProviderPackage: " + this.f17204b + ", mQuery: " + this.f17205c + ", mSystemFont: " + this.f17208f + ", mVariationSettings: " + this.f17209g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f17206d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f17206d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f17207e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List list, String str4, String str5) {
        this.f17203a = (String) X0.h.g(str);
        this.f17204b = (String) X0.h.g(str2);
        this.f17205c = (String) X0.h.g(str3);
        this.f17206d = (List) X0.h.g(list);
        this.f17207e = 0;
        this.f17208f = str4;
        this.f17209g = str5;
        this.f17210h = a(str, str2, str3, str4, str5);
    }
}
