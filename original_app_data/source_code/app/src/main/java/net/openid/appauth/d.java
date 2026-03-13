package net.openid.appauth;

import android.net.Uri;
import io.sentry.ProfilingTraceData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ke.p;
import net.openid.appauth.f;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final f.e f40934A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final f.e f40935B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final f.C0546f f40936C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final f.e f40937D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final f.e f40938E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final f.a f40939F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final f.a f40940G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final f.a f40941H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final f.a f40942I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final f.C0546f f40943J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final f.C0546f f40944K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final List f40945L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f.d f40946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f.C0546f f40947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f.C0546f f40948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f.C0546f f40949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f.C0546f f40950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f.C0546f f40951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f.C0546f f40952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f.e f40953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f.e f40954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f.e f40955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f.e f40956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f.e f40957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f.e f40958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f.e f40959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f.e f40960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f.e f40961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f.e f40962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f.e f40963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f.e f40964t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f.e f40965u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f.e f40966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f.e f40967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f.e f40968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f.e f40969y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final f.e f40970z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f40971a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f40972a;

        public a(String str) {
            super("Missing mandatory configuration field: " + str);
            this.f40972a = str;
        }

        public String a() {
            return this.f40972a;
        }
    }

    static {
        f.d dVarH = h("issuer");
        f40946b = dVarH;
        f.C0546f c0546fK = k("authorization_endpoint");
        f40947c = c0546fK;
        f40948d = k("token_endpoint");
        f40949e = k("end_session_endpoint");
        f40950f = k("userinfo_endpoint");
        f.C0546f c0546fK2 = k("jwks_uri");
        f40951g = c0546fK2;
        f40952h = k("registration_endpoint");
        f40953i = i("scopes_supported");
        f.e eVarI = i("response_types_supported");
        f40954j = eVarI;
        f40955k = i("response_modes_supported");
        f40956l = j("grant_types_supported", Arrays.asList("authorization_code", "implicit"));
        f40957m = i("acr_values_supported");
        f.e eVarI2 = i("subject_types_supported");
        f40958n = eVarI2;
        f.e eVarI3 = i("id_token_signing_alg_values_supported");
        f40959o = eVarI3;
        f40960p = i("id_token_encryption_enc_values_supported");
        f40961q = i("id_token_encryption_enc_values_supported");
        f40962r = i("userinfo_signing_alg_values_supported");
        f40963s = i("userinfo_encryption_alg_values_supported");
        f40964t = i("userinfo_encryption_enc_values_supported");
        f40965u = i("request_object_signing_alg_values_supported");
        f40966v = i("request_object_encryption_alg_values_supported");
        f40967w = i("request_object_encryption_enc_values_supported");
        f40968x = j("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));
        f40969y = i("token_endpoint_auth_signing_alg_values_supported");
        f40970z = i("display_values_supported");
        f40934A = j("claim_types_supported", Collections.singletonList(ProfilingTraceData.TRUNCATION_REASON_NORMAL));
        f40935B = i("claims_supported");
        f40936C = k("service_documentation");
        f40937D = i("claims_locales_supported");
        f40938E = i("ui_locales_supported");
        f40939F = a("claims_parameter_supported", false);
        f40940G = a("request_parameter_supported", false);
        f40941H = a("request_uri_parameter_supported", true);
        f40942I = a("require_request_uri_registration", false);
        f40943J = k("op_policy_uri");
        f40944K = k("op_tos_uri");
        f40945L = Arrays.asList(dVarH.f40984a, c0546fK.f40984a, c0546fK2.f40984a, eVarI.f40986a, eVarI2.f40986a, eVarI3.f40986a);
    }

    public d(JSONObject jSONObject) throws a {
        this.f40971a = (JSONObject) p.d(jSONObject);
        for (String str : f40945L) {
            if (!this.f40971a.has(str) || this.f40971a.get(str) == null) {
                throw new a(str);
            }
        }
    }

    public static f.a a(String str, boolean z10) {
        return new f.a(str, z10);
    }

    public static f.d h(String str) {
        return new f.d(str);
    }

    public static f.e i(String str) {
        return new f.e(str);
    }

    public static f.e j(String str, List list) {
        return new f.e(str, list);
    }

    public static f.C0546f k(String str) {
        return new f.C0546f(str);
    }

    public final Object b(f.b bVar) {
        return f.a(this.f40971a, bVar);
    }

    public Uri c() {
        return (Uri) b(f40947c);
    }

    public Uri d() {
        return (Uri) b(f40949e);
    }

    public String e() {
        return (String) b(f40946b);
    }

    public Uri f() {
        return (Uri) b(f40952h);
    }

    public Uri g() {
        return (Uri) b(f40948d);
    }
}
