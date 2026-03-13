package ke;

import android.net.Uri;
import io.sentry.protocol.SentryThread;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ne.AbstractC5177b;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class g implements InterfaceC4842d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Set f39672s = AbstractC4839a.a("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "ui_locales", "redirect_uri", "response_mode", "response_type", "scope", SentryThread.JsonKeys.STATE, "claims", "claims_locales");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final net.openid.appauth.c f39673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f39680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f39681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f39682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f39683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f39684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f39685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f39686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f39687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JSONObject f39688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f39689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map f39690r;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public net.openid.appauth.c f39691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f39692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f39693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f39694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f39695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f39696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f39697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Uri f39698h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f39699i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f39700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f39701k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f39702l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f39703m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f39704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f39705o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public JSONObject f39706p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public String f39707q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Map f39708r = new HashMap();

        public b(net.openid.appauth.c cVar, String str, String str2, Uri uri) {
            c(cVar);
            e(str);
            l(str2);
            j(uri);
            n(f.a());
            h(f.a());
            f(l.c());
        }

        public g a() {
            return new g(this.f39691a, this.f39692b, this.f39697g, this.f39698h, this.f39693c, this.f39694d, this.f39695e, this.f39696f, this.f39699i, this.f39700j, this.f39701k, this.f39702l, this.f39703m, this.f39704n, this.f39705o, this.f39706p, this.f39707q, Collections.unmodifiableMap(new HashMap(this.f39708r)));
        }

        public b b(Map map) {
            this.f39708r = AbstractC4839a.b(map, g.f39672s);
            return this;
        }

        public b c(net.openid.appauth.c cVar) {
            this.f39691a = (net.openid.appauth.c) p.e(cVar, "configuration cannot be null");
            return this;
        }

        public b d(JSONObject jSONObject) {
            this.f39706p = jSONObject;
            return this;
        }

        public b e(String str) {
            this.f39692b = p.c(str, "client ID cannot be null or empty");
            return this;
        }

        public b f(String str) {
            if (str == null) {
                this.f39702l = null;
                this.f39703m = null;
                this.f39704n = null;
                return this;
            }
            l.a(str);
            this.f39702l = str;
            this.f39703m = l.b(str);
            this.f39704n = l.e();
            return this;
        }

        public b g(String str) {
            this.f39694d = p.f(str, "login hint must be null or not empty");
            return this;
        }

        public b h(String str) {
            this.f39701k = p.f(str, "nonce cannot be empty if defined");
            return this;
        }

        public b i(Iterable iterable) {
            this.f39695e = AbstractC4841c.a(iterable);
            return this;
        }

        public b j(Uri uri) {
            this.f39698h = (Uri) p.e(uri, "redirect URI cannot be null or empty");
            return this;
        }

        public b k(String str) {
            p.f(str, "responseMode must not be empty");
            this.f39705o = str;
            return this;
        }

        public b l(String str) {
            this.f39697g = p.c(str, "expected response type cannot be null or empty");
            return this;
        }

        public b m(Iterable iterable) {
            this.f39699i = AbstractC4841c.a(iterable);
            return this;
        }

        public b n(String str) {
            this.f39700j = p.f(str, "state cannot be empty if defined");
            return this;
        }

        public b o(String str) {
            this.f39696f = p.f(str, "uiLocales must be null or not empty");
            return this;
        }
    }

    public static g c(JSONObject jSONObject) {
        p.e(jSONObject, "json cannot be null");
        return new g(net.openid.appauth.c.d(jSONObject.getJSONObject("configuration")), net.openid.appauth.f.d(jSONObject, "clientId"), net.openid.appauth.f.d(jSONObject, "responseType"), net.openid.appauth.f.h(jSONObject, "redirectUri"), net.openid.appauth.f.e(jSONObject, "display"), net.openid.appauth.f.e(jSONObject, "login_hint"), net.openid.appauth.f.e(jSONObject, "prompt"), net.openid.appauth.f.e(jSONObject, "ui_locales"), net.openid.appauth.f.e(jSONObject, "scope"), net.openid.appauth.f.e(jSONObject, SentryThread.JsonKeys.STATE), net.openid.appauth.f.e(jSONObject, "nonce"), net.openid.appauth.f.e(jSONObject, "codeVerifier"), net.openid.appauth.f.e(jSONObject, "codeVerifierChallenge"), net.openid.appauth.f.e(jSONObject, "codeVerifierChallengeMethod"), net.openid.appauth.f.e(jSONObject, "responseMode"), net.openid.appauth.f.b(jSONObject, "claims"), net.openid.appauth.f.e(jSONObject, "claimsLocales"), net.openid.appauth.f.g(jSONObject, "additionalParameters"));
    }

    @Override // ke.InterfaceC4842d
    public String a() {
        return d().toString();
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        net.openid.appauth.f.m(jSONObject, "configuration", this.f39673a.e());
        net.openid.appauth.f.l(jSONObject, "clientId", this.f39674b);
        net.openid.appauth.f.l(jSONObject, "responseType", this.f39679g);
        net.openid.appauth.f.l(jSONObject, "redirectUri", this.f39680h.toString());
        net.openid.appauth.f.p(jSONObject, "display", this.f39675c);
        net.openid.appauth.f.p(jSONObject, "login_hint", this.f39676d);
        net.openid.appauth.f.p(jSONObject, "scope", this.f39681i);
        net.openid.appauth.f.p(jSONObject, "prompt", this.f39677e);
        net.openid.appauth.f.p(jSONObject, "ui_locales", this.f39678f);
        net.openid.appauth.f.p(jSONObject, SentryThread.JsonKeys.STATE, this.f39682j);
        net.openid.appauth.f.p(jSONObject, "nonce", this.f39683k);
        net.openid.appauth.f.p(jSONObject, "codeVerifier", this.f39684l);
        net.openid.appauth.f.p(jSONObject, "codeVerifierChallenge", this.f39685m);
        net.openid.appauth.f.p(jSONObject, "codeVerifierChallengeMethod", this.f39686n);
        net.openid.appauth.f.p(jSONObject, "responseMode", this.f39687o);
        net.openid.appauth.f.q(jSONObject, "claims", this.f39688p);
        net.openid.appauth.f.p(jSONObject, "claimsLocales", this.f39689q);
        net.openid.appauth.f.m(jSONObject, "additionalParameters", net.openid.appauth.f.j(this.f39690r));
        return jSONObject;
    }

    @Override // ke.InterfaceC4842d
    public String getState() {
        return this.f39682j;
    }

    @Override // ke.InterfaceC4842d
    public Uri toUri() {
        Uri.Builder builderAppendQueryParameter = this.f39673a.f40925a.buildUpon().appendQueryParameter("redirect_uri", this.f39680h.toString()).appendQueryParameter("client_id", this.f39674b).appendQueryParameter("response_type", this.f39679g);
        AbstractC5177b.a(builderAppendQueryParameter, "display", this.f39675c);
        AbstractC5177b.a(builderAppendQueryParameter, "login_hint", this.f39676d);
        AbstractC5177b.a(builderAppendQueryParameter, "prompt", this.f39677e);
        AbstractC5177b.a(builderAppendQueryParameter, "ui_locales", this.f39678f);
        AbstractC5177b.a(builderAppendQueryParameter, SentryThread.JsonKeys.STATE, this.f39682j);
        AbstractC5177b.a(builderAppendQueryParameter, "nonce", this.f39683k);
        AbstractC5177b.a(builderAppendQueryParameter, "scope", this.f39681i);
        AbstractC5177b.a(builderAppendQueryParameter, "response_mode", this.f39687o);
        if (this.f39684l != null) {
            builderAppendQueryParameter.appendQueryParameter("code_challenge", this.f39685m).appendQueryParameter("code_challenge_method", this.f39686n);
        }
        AbstractC5177b.a(builderAppendQueryParameter, "claims", this.f39688p);
        AbstractC5177b.a(builderAppendQueryParameter, "claims_locales", this.f39689q);
        for (Map.Entry entry : this.f39690r.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderAppendQueryParameter.build();
    }

    public g(net.openid.appauth.c cVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JSONObject jSONObject, String str14, Map map) {
        this.f39673a = cVar;
        this.f39674b = str;
        this.f39679g = str2;
        this.f39680h = uri;
        this.f39690r = map;
        this.f39675c = str3;
        this.f39676d = str4;
        this.f39677e = str5;
        this.f39678f = str6;
        this.f39681i = str7;
        this.f39682j = str8;
        this.f39683k = str9;
        this.f39684l = str10;
        this.f39685m = str11;
        this.f39686n = str12;
        this.f39687o = str13;
        this.f39688p = jSONObject;
        this.f39689q = str14;
    }
}
