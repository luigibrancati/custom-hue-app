package com.android.billingclient.api;

import O4.C1577a;
import android.text.TextUtils;
import io.sentry.clientreport.DiscardedEvent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f26597c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JSONObject f26598a;

        public a(JSONObject jSONObject) {
            this.f26598a = jSONObject;
        }

        public List a() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.f26598a.has("productIds") && (jSONArrayOptJSONArray = this.f26598a.optJSONArray("productIds")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
            return arrayList;
        }

        public String b() {
            return this.f26598a.optString("purchaseToken");
        }
    }

    public Purchase(String str, String str2) {
        this.f26595a = str;
        this.f26596b = str2;
        this.f26597c = new JSONObject(str);
    }

    public C1577a a() {
        JSONObject jSONObject = this.f26597c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new C1577a(strOptString, strOptString2);
    }

    public String b() {
        return this.f26597c.optString("developerPayload");
    }

    public String c() {
        String strOptString = this.f26597c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String d() {
        return this.f26595a;
    }

    public String e() {
        return this.f26597c.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f26595a, purchase.d()) && TextUtils.equals(this.f26596b, purchase.l());
    }

    public a f() {
        JSONObject jSONObjectOptJSONObject = this.f26597c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new a(jSONObjectOptJSONObject);
    }

    public List g() {
        return o();
    }

    public int h() {
        return this.f26597c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public int hashCode() {
        return this.f26595a.hashCode();
    }

    public long i() {
        return this.f26597c.optLong("purchaseTime");
    }

    public String j() {
        JSONObject jSONObject = this.f26597c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int k() {
        return this.f26597c.optInt(DiscardedEvent.JsonKeys.QUANTITY, 1);
    }

    public String l() {
        return this.f26596b;
    }

    public boolean m() {
        return this.f26597c.optBoolean("acknowledged", true);
    }

    public boolean n() {
        return this.f26597c.optBoolean("autoRenewing");
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        if (this.f26597c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f26597c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f26597c.has("productId")) {
            arrayList.add(this.f26597c.optString("productId"));
        }
        return arrayList;
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f26595a));
    }
}
