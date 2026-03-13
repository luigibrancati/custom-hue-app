package ke;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.SentryThread;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ke.r;
import ne.AbstractC5177b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h extends AbstractC4843e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f39709j = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", SentryThread.JsonKeys.STATE, "code", "access_token", "expires_in", "id_token", "scope")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f39710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f39715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f39718i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f39719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f39720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f39721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f39722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f39723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f39724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f39725g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f39726h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Map f39727i = new LinkedHashMap();

        public b(g gVar) {
            this.f39719a = (g) p.e(gVar, "authorization request cannot be null");
        }

        public h a() {
            return new h(this.f39719a, this.f39720b, this.f39721c, this.f39722d, this.f39723e, this.f39724f, this.f39725g, this.f39726h, Collections.unmodifiableMap(this.f39727i));
        }

        public b b(Uri uri) {
            return c(uri, q.f39748a);
        }

        public b c(Uri uri, k kVar) {
            l(uri.getQueryParameter(SentryThread.JsonKeys.STATE));
            m(uri.getQueryParameter("token_type"));
            g(uri.getQueryParameter("code"));
            d(uri.getQueryParameter("access_token"));
            e(AbstractC5177b.d(uri, "expires_in"), kVar);
            h(uri.getQueryParameter("id_token"));
            i(uri.getQueryParameter("scope"));
            f(AbstractC4839a.c(uri, h.f39709j));
            return this;
        }

        public b d(String str) {
            p.f(str, "accessToken must not be empty");
            this.f39723e = str;
            return this;
        }

        public b e(Long l10, k kVar) {
            if (l10 == null) {
                this.f39724f = null;
                return this;
            }
            this.f39724f = Long.valueOf(kVar.getCurrentTimeMillis() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            return this;
        }

        public b f(Map map) {
            this.f39727i = AbstractC4839a.b(map, h.f39709j);
            return this;
        }

        public b g(String str) {
            p.f(str, "authorizationCode must not be empty");
            this.f39722d = str;
            return this;
        }

        public b h(String str) {
            p.f(str, "idToken cannot be empty");
            this.f39725g = str;
            return this;
        }

        public b i(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f39726h = null;
                return this;
            }
            k(str.split(" +"));
            return this;
        }

        public b j(Iterable iterable) {
            this.f39726h = AbstractC4841c.a(iterable);
            return this;
        }

        public b k(String... strArr) {
            if (strArr == null) {
                this.f39726h = null;
                return this;
            }
            j(Arrays.asList(strArr));
            return this;
        }

        public b l(String str) {
            p.f(str, "state must not be empty");
            this.f39720b = str;
            return this;
        }

        public b m(String str) {
            p.f(str, "tokenType must not be empty");
            this.f39721c = str;
            return this;
        }
    }

    public static h h(Intent intent) {
        p.e(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            return i(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e10);
        }
    }

    public static h i(String str) {
        return j(new JSONObject(str));
    }

    public static h j(JSONObject jSONObject) {
        if (jSONObject.has(SentryBaseEvent.JsonKeys.REQUEST)) {
            return new h(g.c(jSONObject.getJSONObject(SentryBaseEvent.JsonKeys.REQUEST)), net.openid.appauth.f.e(jSONObject, SentryThread.JsonKeys.STATE), net.openid.appauth.f.e(jSONObject, "token_type"), net.openid.appauth.f.e(jSONObject, "code"), net.openid.appauth.f.e(jSONObject, "access_token"), net.openid.appauth.f.c(jSONObject, "expires_at"), net.openid.appauth.f.e(jSONObject, "id_token"), net.openid.appauth.f.e(jSONObject, "scope"), net.openid.appauth.f.g(jSONObject, "additional_parameters"));
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    @Override // ke.AbstractC4843e
    public String a() {
        return this.f39711b;
    }

    @Override // ke.AbstractC4843e
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        net.openid.appauth.f.m(jSONObject, SentryBaseEvent.JsonKeys.REQUEST, this.f39710a.d());
        net.openid.appauth.f.p(jSONObject, SentryThread.JsonKeys.STATE, this.f39711b);
        net.openid.appauth.f.p(jSONObject, "token_type", this.f39712c);
        net.openid.appauth.f.p(jSONObject, "code", this.f39713d);
        net.openid.appauth.f.p(jSONObject, "access_token", this.f39714e);
        net.openid.appauth.f.o(jSONObject, "expires_at", this.f39715f);
        net.openid.appauth.f.p(jSONObject, "id_token", this.f39716g);
        net.openid.appauth.f.p(jSONObject, "scope", this.f39717h);
        net.openid.appauth.f.m(jSONObject, "additional_parameters", net.openid.appauth.f.j(this.f39718i));
        return jSONObject;
    }

    @Override // ke.AbstractC4843e
    public Intent d() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", c());
        return intent;
    }

    public r f() {
        return g(Collections.EMPTY_MAP);
    }

    public r g(Map map) {
        p.e(map, "additionalExchangeParameters cannot be null");
        if (this.f39713d == null) {
            throw new IllegalStateException("authorizationCode not available for exchange request");
        }
        g gVar = this.f39710a;
        return new r.b(gVar.f39673a, gVar.f39674b).h("authorization_code").j(this.f39710a.f39680h).f(this.f39710a.f39684l).d(this.f39713d).c(map).i(this.f39710a.f39683k).a();
    }

    public h(g gVar, String str, String str2, String str3, String str4, Long l10, String str5, String str6, Map map) {
        this.f39710a = gVar;
        this.f39711b = str;
        this.f39712c = str2;
        this.f39713d = str3;
        this.f39714e = str4;
        this.f39715f = l10;
        this.f39716g = str5;
        this.f39717h = str6;
        this.f39718i = map;
    }
}
