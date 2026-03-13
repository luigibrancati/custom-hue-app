package ke;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set f39749k = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final net.openid.appauth.c f39750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f39754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f39758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f39759j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public net.openid.appauth.c f39760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f39761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f39762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f39763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Uri f39764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f39765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f39766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f39767h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f39768i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Map f39769j;

        public b(net.openid.appauth.c cVar, String str) {
            g(cVar);
            e(str);
            this.f39769j = new LinkedHashMap();
        }

        public r a() {
            String strB = b();
            if ("authorization_code".equals(strB)) {
                p.e(this.f39766g, "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(strB)) {
                p.e(this.f39767h, "refresh token must be specified for grant_type = refresh_token");
            }
            if (strB.equals("authorization_code") && this.f39764e == null) {
                throw new IllegalStateException("no redirect URI specified on token request for code exchange");
            }
            return new r(this.f39760a, this.f39761b, this.f39762c, strB, this.f39764e, this.f39765f, this.f39766g, this.f39767h, this.f39768i, Collections.unmodifiableMap(this.f39769j));
        }

        public final String b() {
            String str = this.f39763d;
            if (str != null) {
                return str;
            }
            if (this.f39766g != null) {
                return "authorization_code";
            }
            if (this.f39767h != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        public b c(Map map) {
            this.f39769j = AbstractC4839a.b(map, r.f39749k);
            return this;
        }

        public b d(String str) {
            p.f(str, "authorization code must not be empty");
            this.f39766g = str;
            return this;
        }

        public b e(String str) {
            this.f39761b = p.c(str, "clientId cannot be null or empty");
            return this;
        }

        public b f(String str) {
            if (str != null) {
                l.a(str);
            }
            this.f39768i = str;
            return this;
        }

        public b g(net.openid.appauth.c cVar) {
            this.f39760a = (net.openid.appauth.c) p.d(cVar);
            return this;
        }

        public b h(String str) {
            this.f39763d = p.c(str, "grantType cannot be null or empty");
            return this;
        }

        public b i(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f39762c = null;
                return this;
            }
            this.f39762c = str;
            return this;
        }

        public b j(Uri uri) {
            if (uri != null) {
                p.e(uri.getScheme(), "redirectUri must have a scheme");
            }
            this.f39764e = uri;
            return this;
        }

        public b k(String str) {
            if (str != null) {
                p.c(str, "refresh token cannot be empty if defined");
            }
            this.f39767h = str;
            return this;
        }

        public b l(Iterable iterable) {
            this.f39765f = AbstractC4841c.a(iterable);
            return this;
        }
    }

    public Map b() {
        HashMap map = new HashMap();
        map.put("grant_type", this.f39753d);
        c(map, "redirect_uri", this.f39754e);
        c(map, "code", this.f39755f);
        c(map, "refresh_token", this.f39757h);
        c(map, "code_verifier", this.f39758i);
        c(map, "scope", this.f39756g);
        for (Map.Entry entry : this.f39759j.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        return map;
    }

    public final void c(Map map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    public r(net.openid.appauth.c cVar, String str, String str2, String str3, Uri uri, String str4, String str5, String str6, String str7, Map map) {
        this.f39750a = cVar;
        this.f39752c = str;
        this.f39751b = str2;
        this.f39753d = str3;
        this.f39754e = uri;
        this.f39756g = str4;
        this.f39755f = str5;
        this.f39757h = str6;
        this.f39758i = str7;
        this.f39759j = map;
    }
}
