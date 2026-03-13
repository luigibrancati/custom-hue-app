package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.AbstractC4839a;
import ke.k;
import ke.r;
import net.openid.appauth.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Long f40973i = 1000L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Long f40974j = 600L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set f40975k = AbstractC4839a.a("iss", "sub", "aud", "exp", "iat", "nonce", "azp");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f40978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f40979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f40980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f40982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f40983h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public e(String str, String str2, List list, Long l10, Long l11, String str3, String str4, Map map) {
        this.f40976a = str;
        this.f40977b = str2;
        this.f40978c = list;
        this.f40979d = l10;
        this.f40980e = l11;
        this.f40981f = str3;
        this.f40982g = str4;
        this.f40983h = map;
    }

    public static e a(String str) throws JSONException, a {
        List listF;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length <= 1) {
            throw new a("ID token must have both header and claims section");
        }
        b(strArrSplit[0]);
        JSONObject jSONObjectB = b(strArrSplit[1]);
        String strD = f.d(jSONObjectB, "iss");
        String strD2 = f.d(jSONObjectB, "sub");
        try {
            listF = f.f(jSONObjectB, "aud");
        } catch (JSONException unused) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(f.d(jSONObjectB, "aud"));
            listF = arrayList;
        }
        Long lValueOf = Long.valueOf(jSONObjectB.getLong("exp"));
        Long lValueOf2 = Long.valueOf(jSONObjectB.getLong("iat"));
        String strE = f.e(jSONObjectB, "nonce");
        String strE2 = f.e(jSONObjectB, "azp");
        Iterator it = f40975k.iterator();
        while (it.hasNext()) {
            jSONObjectB.remove((String) it.next());
        }
        return new e(strD, strD2, listF, lValueOf, lValueOf2, strE, strE2, f.s(jSONObjectB));
    }

    public static JSONObject b(String str) {
        return new JSONObject(new String(Base64.decode(str, 8)));
    }

    public void c(r rVar, k kVar, boolean z10) throws net.openid.appauth.a {
        d dVar = rVar.f39750a.f40929e;
        if (dVar != null) {
            if (!this.f40976a.equals(dVar.e())) {
                throw net.openid.appauth.a.l(a.b.f40903j, new a("Issuer mismatch"));
            }
            Uri uri = Uri.parse(this.f40976a);
            if (!z10 && !uri.getScheme().equals("https")) {
                throw net.openid.appauth.a.l(a.b.f40903j, new a("Issuer must be an https URL"));
            }
            if (TextUtils.isEmpty(uri.getHost())) {
                throw net.openid.appauth.a.l(a.b.f40903j, new a("Issuer host can not be empty"));
            }
            if (uri.getFragment() != null || uri.getQueryParameterNames().size() > 0) {
                throw net.openid.appauth.a.l(a.b.f40903j, new a("Issuer URL should not containt query parameters or fragment components"));
            }
        }
        String str = rVar.f39752c;
        if (!this.f40978c.contains(str) && !str.equals(this.f40982g)) {
            throw net.openid.appauth.a.l(a.b.f40903j, new a("Audience mismatch"));
        }
        long currentTimeMillis = kVar.getCurrentTimeMillis() / f40973i.longValue();
        if (currentTimeMillis > this.f40979d.longValue()) {
            throw net.openid.appauth.a.l(a.b.f40903j, new a("ID Token expired"));
        }
        if (Math.abs(currentTimeMillis - this.f40980e.longValue()) > f40974j.longValue()) {
            throw net.openid.appauth.a.l(a.b.f40903j, new a("Issued at time is more than 10 minutes before or after the current time"));
        }
        if ("authorization_code".equals(rVar.f39753d)) {
            if (!TextUtils.equals(this.f40981f, rVar.f39751b)) {
                throw net.openid.appauth.a.l(a.b.f40903j, new a("Nonce mismatch"));
            }
        }
    }
}
