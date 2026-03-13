package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import b0.C2777a;
import java.util.Collections;
import java.util.Map;
import ke.p;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f40882e;

    /* JADX INFO: renamed from: net.openid.appauth.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0544a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f40884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f40886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f40887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f40888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f40889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f40890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f40891i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f40892j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Map f40893k;

        static {
            a aVarE = a.e(1000, "invalid_request");
            f40883a = aVarE;
            a aVarE2 = a.e(1001, "unauthorized_client");
            f40884b = aVarE2;
            a aVarE3 = a.e(1002, "access_denied");
            f40885c = aVarE3;
            a aVarE4 = a.e(1003, "unsupported_response_type");
            f40886d = aVarE4;
            a aVarE5 = a.e(1004, "invalid_scope");
            f40887e = aVarE5;
            a aVarE6 = a.e(1005, "server_error");
            f40888f = aVarE6;
            a aVarE7 = a.e(1006, "temporarily_unavailable");
            f40889g = aVarE7;
            a aVarE8 = a.e(1007, null);
            f40890h = aVarE8;
            a aVarE9 = a.e(1008, null);
            f40891i = aVarE9;
            f40892j = a.m(9, "Response state param did not match request state");
            f40893k = a.f(aVarE, aVarE2, aVarE3, aVarE4, aVarE5, aVarE6, aVarE7, aVarE8, aVarE9);
        }

        public static a a(String str) {
            a aVar = (a) f40893k.get(str);
            return aVar != null ? aVar : f40891i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40894a = a.m(0, "Invalid discovery document");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f40895b = a.m(1, "User cancelled flow");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40896c = a.m(2, "Flow cancelled programmatically");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f40897d = a.m(3, "Network error");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f40898e = a.m(4, "Server error");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f40899f = a.m(5, "JSON deserialization error");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f40900g = a.m(6, "Token response construction error");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f40901h = a.m(7, "Invalid registration response");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f40902i = a.m(8, "Unable to parse ID Token");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f40903j = a.m(9, "Invalid ID Token");
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f40905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f40907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f40908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f40909f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f40910g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f40911h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Map f40912i;

        static {
            a aVarQ = a.q(2000, "invalid_request");
            f40904a = aVarQ;
            a aVarQ2 = a.q(2001, "invalid_client");
            f40905b = aVarQ2;
            a aVarQ3 = a.q(2002, "invalid_grant");
            f40906c = aVarQ3;
            a aVarQ4 = a.q(2003, "unauthorized_client");
            f40907d = aVarQ4;
            a aVarQ5 = a.q(2004, "unsupported_grant_type");
            f40908e = aVarQ5;
            a aVarQ6 = a.q(2005, "invalid_scope");
            f40909f = aVarQ6;
            a aVarQ7 = a.q(2006, null);
            f40910g = aVarQ7;
            a aVarQ8 = a.q(2007, null);
            f40911h = aVarQ8;
            f40912i = a.f(aVarQ, aVarQ2, aVarQ3, aVarQ4, aVarQ5, aVarQ6, aVarQ7, aVarQ8);
        }

        public static a a(String str) {
            a aVar = (a) f40912i.get(str);
            return aVar != null ? aVar : f40911h;
        }
    }

    public a(int i10, int i11, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.f40878a = i10;
        this.f40879b = i11;
        this.f40880c = str;
        this.f40881d = str2;
        this.f40882e = uri;
    }

    public static a e(int i10, String str) {
        return new a(1, i10, str, null, null, null);
    }

    public static Map f(a... aVarArr) {
        C2777a c2777a = new C2777a(aVarArr != null ? aVarArr.length : 0);
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                String str = aVar.f40880c;
                if (str != null) {
                    c2777a.put(str, aVar);
                }
            }
        }
        return Collections.unmodifiableMap(c2777a);
    }

    public static a g(Intent intent) {
        p.d(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return h(intent.getStringExtra("net.openid.appauth.AuthorizationException"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e10);
        }
    }

    public static a h(String str) {
        p.c(str, "jsonStr cannot be null or empty");
        return i(new JSONObject(str));
    }

    public static a i(JSONObject jSONObject) {
        p.e(jSONObject, "json cannot be null");
        return new a(jSONObject.getInt("type"), jSONObject.getInt("code"), f.e(jSONObject, "error"), f.e(jSONObject, "errorDescription"), f.i(jSONObject, "errorUri"), null);
    }

    public static a j(Uri uri) {
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        a aVarA = C0544a.a(queryParameter);
        int i10 = aVarA.f40878a;
        int i11 = aVarA.f40879b;
        if (queryParameter2 == null) {
            queryParameter2 = aVarA.f40881d;
        }
        return new a(i10, i11, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : aVarA.f40882e, null);
    }

    public static a k(a aVar, String str, String str2, Uri uri) {
        int i10 = aVar.f40878a;
        int i11 = aVar.f40879b;
        if (str == null) {
            str = aVar.f40880c;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = aVar.f40881d;
        }
        String str4 = str2;
        if (uri == null) {
            uri = aVar.f40882e;
        }
        return new a(i10, i11, str3, str4, uri, null);
    }

    public static a l(a aVar, Throwable th) {
        return new a(aVar.f40878a, aVar.f40879b, aVar.f40880c, aVar.f40881d, aVar.f40882e, th);
    }

    public static a m(int i10, String str) {
        return new a(0, i10, null, str, null, null);
    }

    public static a q(int i10, String str) {
        return new a(2, i10, str, null, null, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (this.f40878a == aVar.f40878a && this.f40879b == aVar.f40879b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f40878a + 31) * 31) + this.f40879b;
    }

    public Intent n() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", p());
        return intent;
    }

    public JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        f.k(jSONObject, "type", this.f40878a);
        f.k(jSONObject, "code", this.f40879b);
        f.p(jSONObject, "error", this.f40880c);
        f.p(jSONObject, "errorDescription", this.f40881d);
        f.n(jSONObject, "errorUri", this.f40882e);
        return jSONObject;
    }

    public String p() {
        return o().toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AuthorizationException: " + p();
    }
}
