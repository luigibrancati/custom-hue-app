package com.android.billingclient.api;

import android.text.TextUtils;
import io.sentry.clientreport.DiscardedEvent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f26601c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f26599a = str;
        this.f26600b = str2;
        this.f26601c = new JSONObject(str);
    }

    public String a() {
        return this.f26601c.optString("developerPayload");
    }

    public String b() {
        return this.f26599a;
    }

    public List c() {
        return h();
    }

    public long d() {
        return this.f26601c.optLong("purchaseTime");
    }

    public String e() {
        JSONObject jSONObject = this.f26601c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f26599a, purchaseHistoryRecord.b()) && TextUtils.equals(this.f26600b, purchaseHistoryRecord.g());
    }

    public int f() {
        return this.f26601c.optInt(DiscardedEvent.JsonKeys.QUANTITY, 1);
    }

    public String g() {
        return this.f26600b;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        if (this.f26601c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f26601c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f26601c.has("productId")) {
            arrayList.add(this.f26601c.optString("productId"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f26599a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f26599a));
    }
}
