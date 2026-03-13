package K4;

import kotlin.jvm.internal.AbstractC4854k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7450b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f7451a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final b a(int i10, String str) {
            Bc.f fVarB = g.SUCCESS.b();
            int iC = fVarB.c();
            if (i10 <= fVarB.d() && iC <= i10) {
                return new j();
            }
            Bc.f fVarB2 = g.BAD_REQUEST.b();
            int iC2 = fVarB2.c();
            if (i10 <= fVarB2.d() && iC2 <= i10) {
                return new c(new JSONObject(str));
            }
            Bc.f fVarB3 = g.PAYLOAD_TOO_LARGE.b();
            int iC3 = fVarB3.c();
            if (i10 <= fVarB3.d() && iC3 <= i10) {
                return new h(new JSONObject(str));
            }
            Bc.f fVarB4 = g.TOO_MANY_REQUESTS.b();
            int iC4 = fVarB4.c();
            if (i10 <= fVarB4.d() && iC4 <= i10) {
                return new l(new JSONObject(str));
            }
            Bc.f fVarB5 = g.TIMEOUT.b();
            return (i10 > fVarB5.d() || fVarB5.c() > i10) ? new d(b(str)) : new k();
        }

        public final JSONObject b(String str) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (str != null && str.length() != 0) {
                try {
                    return new JSONObject(str);
                } catch (Exception unused) {
                    jSONObject.put("error", str);
                }
            }
            return jSONObject;
        }

        public a() {
        }
    }

    public /* synthetic */ b(g gVar, AbstractC4854k abstractC4854k) {
        this(gVar);
    }

    public final g a() {
        return this.f7451a;
    }

    public b(g gVar) {
        this.f7451a = gVar;
    }
}
