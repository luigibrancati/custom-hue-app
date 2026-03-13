package com.google.android.gms.auth.api.signin;

import B6.e;
import B6.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o6.C5227a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v6.AbstractC6056k;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC6157a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C5227a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f28994m = h.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f28999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f29001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f29002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f29003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f29004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f29005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f29006l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f28995a = str;
        this.f28996b = str2;
        this.f28997c = str3;
        this.f28998d = str4;
        this.f28999e = uri;
        this.f29000f = str5;
        this.f29001g = j10;
        this.f29002h = str6;
        this.f29003i = list;
        this.f29004j = str7;
        this.f29005k = str8;
    }

    public static GoogleSignInAccount v(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountW = w(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountW.f29000f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountW;
    }

    public static GoogleSignInAccount w(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(str, str2, str3, str4, uri, null, l10.longValue(), AbstractC6056k.f(str7), new ArrayList((Collection) AbstractC6056k.l(set)), str5, str6);
    }

    public String d() {
        return this.f28998d;
    }

    public String e() {
        return this.f28997c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f29002h.equals(this.f29002h) && googleSignInAccount.r().equals(r());
    }

    public String f() {
        return this.f29005k;
    }

    public String h() {
        return this.f29004j;
    }

    public int hashCode() {
        return ((this.f29002h.hashCode() + 527) * 31) + r().hashCode();
    }

    public String k() {
        return this.f28995a;
    }

    public String l() {
        return this.f28996b;
    }

    public Uri n() {
        return this.f28999e;
    }

    public Set r() {
        HashSet hashSet = new HashSet(this.f29003i);
        hashSet.addAll(this.f29006l);
        return hashSet;
    }

    public String t() {
        return this.f29000f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.w(parcel, 2, k(), false);
        c.w(parcel, 3, l(), false);
        c.w(parcel, 4, e(), false);
        c.w(parcel, 5, d(), false);
        c.u(parcel, 6, n(), i10, false);
        c.w(parcel, 7, t(), false);
        c.s(parcel, 8, this.f29001g);
        c.w(parcel, 9, this.f29002h, false);
        c.A(parcel, 10, this.f29003i, false);
        c.w(parcel, 11, h(), false);
        c.w(parcel, 12, f(), false);
        c.b(parcel, iA);
    }
}
