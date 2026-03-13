package E4;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3313e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3317d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final g a(JSONObject jsonObject) {
            AbstractC4862t.e(jsonObject, "jsonObject");
            return new g(jsonObject.optString("branch", null), jsonObject.optString("source", null), jsonObject.optString("version", null), jsonObject.optString("versionId", null));
        }

        public a() {
        }
    }

    public g() {
        this(null, null, null, null, 15, null);
    }

    public final g a() {
        return new g(this.f3314a, this.f3315b, this.f3316c, this.f3317d);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f3314a;
            if (str != null && str.length() != 0) {
                jSONObject.put("branch", this.f3314a);
            }
            String str2 = this.f3315b;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("source", this.f3315b);
            }
            String str3 = this.f3316c;
            if (str3 != null && str3.length() != 0) {
                jSONObject.put("version", this.f3316c);
            }
            String str4 = this.f3317d;
            if (str4 != null && str4.length() != 0) {
                jSONObject.put("versionId", this.f3317d);
            }
            return jSONObject;
        } catch (JSONException unused) {
            C4.a.f1152b.a().d("JSON Serialization of tacking plan object failed");
            return jSONObject;
        }
    }

    public g(String str, String str2, String str3, String str4) {
        this.f3314a = str;
        this.f3315b = str2;
        this.f3316c = str3;
        this.f3317d = str4;
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
