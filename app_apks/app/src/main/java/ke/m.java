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
public class m implements InterfaceC4842d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f39730g = AbstractC4839a.a("id_token_hint", "post_logout_redirect_uri", SentryThread.JsonKeys.STATE, "ui_locales");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final net.openid.appauth.c f39731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f39733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f39736f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public net.openid.appauth.c f39737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f39738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f39739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f39740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f39741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map f39742f = new HashMap();

        public b(net.openid.appauth.c cVar) {
            c(cVar);
            f(f.a());
        }

        public m a() {
            return new m(this.f39737a, this.f39738b, this.f39739c, this.f39740d, this.f39741e, Collections.unmodifiableMap(new HashMap(this.f39742f)));
        }

        public b b(Map map) {
            this.f39742f = AbstractC4839a.b(map, m.f39730g);
            return this;
        }

        public b c(net.openid.appauth.c cVar) {
            this.f39737a = (net.openid.appauth.c) p.e(cVar, "configuration cannot be null");
            return this;
        }

        public b d(String str) {
            this.f39738b = p.f(str, "idTokenHint must not be empty");
            return this;
        }

        public b e(Uri uri) {
            this.f39739c = uri;
            return this;
        }

        public b f(String str) {
            this.f39740d = p.f(str, "state must not be empty");
            return this;
        }
    }

    public static m c(JSONObject jSONObject) {
        p.e(jSONObject, "json cannot be null");
        return new m(net.openid.appauth.c.d(jSONObject.getJSONObject("configuration")), net.openid.appauth.f.e(jSONObject, "id_token_hint"), net.openid.appauth.f.i(jSONObject, "post_logout_redirect_uri"), net.openid.appauth.f.e(jSONObject, SentryThread.JsonKeys.STATE), net.openid.appauth.f.e(jSONObject, "ui_locales"), net.openid.appauth.f.g(jSONObject, "additionalParameters"));
    }

    @Override // ke.InterfaceC4842d
    public String a() {
        return d().toString();
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        net.openid.appauth.f.m(jSONObject, "configuration", this.f39731a.e());
        net.openid.appauth.f.p(jSONObject, "id_token_hint", this.f39732b);
        net.openid.appauth.f.n(jSONObject, "post_logout_redirect_uri", this.f39733c);
        net.openid.appauth.f.p(jSONObject, SentryThread.JsonKeys.STATE, this.f39734d);
        net.openid.appauth.f.p(jSONObject, "ui_locales", this.f39735e);
        net.openid.appauth.f.m(jSONObject, "additionalParameters", net.openid.appauth.f.j(this.f39736f));
        return jSONObject;
    }

    @Override // ke.InterfaceC4842d
    public String getState() {
        return this.f39734d;
    }

    @Override // ke.InterfaceC4842d
    public Uri toUri() {
        Uri.Builder builderBuildUpon = this.f39731a.f40927c.buildUpon();
        AbstractC5177b.a(builderBuildUpon, "id_token_hint", this.f39732b);
        AbstractC5177b.a(builderBuildUpon, SentryThread.JsonKeys.STATE, this.f39734d);
        AbstractC5177b.a(builderBuildUpon, "ui_locales", this.f39735e);
        Uri uri = this.f39733c;
        if (uri != null) {
            builderBuildUpon.appendQueryParameter("post_logout_redirect_uri", uri.toString());
        }
        for (Map.Entry entry : this.f39736f.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build();
    }

    public m(net.openid.appauth.c cVar, String str, Uri uri, String str2, String str3, Map map) {
        this.f39731a = cVar;
        this.f39732b = str;
        this.f39733c = uri;
        this.f39734d = str2;
        this.f39735e = str3;
        this.f39736f = map;
    }
}
