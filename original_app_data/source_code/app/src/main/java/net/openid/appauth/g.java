package net.openid.appauth;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ke.AbstractC4839a;
import ke.AbstractC4841c;
import ke.k;
import ke.p;
import ke.q;
import ke.r;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set f40988i = new HashSet(Arrays.asList("token_type", "access_token", "expires_in", "refresh_token", "id_token", "scope"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f40989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f40992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f40995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f40996h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f40997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f40999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f41000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f41001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f41002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f41003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map f41004h;

        public a(r rVar) {
            j(rVar);
            this.f41004h = Collections.EMPTY_MAP;
        }

        public g a() {
            return new g(this.f40997a, this.f40998b, this.f40999c, this.f41000d, this.f41001e, this.f41002f, this.f41003g, this.f41004h);
        }

        public a b(JSONObject jSONObject) {
            n(f.d(jSONObject, "token_type"));
            c(f.e(jSONObject, "access_token"));
            d(f.c(jSONObject, "expires_at"));
            if (jSONObject.has("expires_in")) {
                e(Long.valueOf(jSONObject.getLong("expires_in")));
            }
            i(f.e(jSONObject, "refresh_token"));
            h(f.e(jSONObject, "id_token"));
            k(f.e(jSONObject, "scope"));
            g(AbstractC4839a.d(jSONObject, g.f40988i));
            return this;
        }

        public a c(String str) {
            this.f40999c = p.f(str, "access token cannot be empty if specified");
            return this;
        }

        public a d(Long l10) {
            this.f41000d = l10;
            return this;
        }

        public a e(Long l10) {
            return f(l10, q.f39748a);
        }

        public a f(Long l10, k kVar) {
            if (l10 == null) {
                this.f41000d = null;
                return this;
            }
            this.f41000d = Long.valueOf(kVar.getCurrentTimeMillis() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            return this;
        }

        public a g(Map map) {
            this.f41004h = AbstractC4839a.b(map, g.f40988i);
            return this;
        }

        public a h(String str) {
            this.f41001e = p.f(str, "id token must not be empty if defined");
            return this;
        }

        public a i(String str) {
            this.f41002f = p.f(str, "refresh token must not be empty if defined");
            return this;
        }

        public a j(r rVar) {
            this.f40997a = (r) p.e(rVar, "request cannot be null");
            return this;
        }

        public a k(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f41003g = null;
                return this;
            }
            m(str.split(" +"));
            return this;
        }

        public a l(Iterable iterable) {
            this.f41003g = AbstractC4841c.a(iterable);
            return this;
        }

        public a m(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            l(Arrays.asList(strArr));
            return this;
        }

        public a n(String str) {
            this.f40998b = p.f(str, "token type must not be empty if defined");
            return this;
        }
    }

    public g(r rVar, String str, String str2, Long l10, String str3, String str4, String str5, Map map) {
        this.f40989a = rVar;
        this.f40990b = str;
        this.f40991c = str2;
        this.f40992d = l10;
        this.f40993e = str3;
        this.f40994f = str4;
        this.f40995g = str5;
        this.f40996h = map;
    }
}
