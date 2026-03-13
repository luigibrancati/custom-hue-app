package E4;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3310c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3312b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final f a(JSONObject jsonObject) {
            AbstractC4862t.e(jsonObject, "jsonObject");
            return new f(jsonObject.optString("source_name", null), jsonObject.optString("source_version", null));
        }

        public a() {
        }
    }

    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final f a() {
        return new f(this.f3311a, this.f3312b);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f3311a;
            if (str != null && str.length() != 0) {
                jSONObject.put("source_name", this.f3311a);
            }
            String str2 = this.f3312b;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("source_version", this.f3312b);
            }
            return jSONObject;
        } catch (JSONException unused) {
            C4.a.f1152b.a().d("JSON Serialization of ingestion metadata object failed");
            return jSONObject;
        }
    }

    public f(String str, String str2) {
        this.f3311a = str;
        this.f3312b = str2;
    }

    public /* synthetic */ f(String str, String str2, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
