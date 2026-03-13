package O4;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC3541h0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f11142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f11150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f11151k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11153b;

        public a(JSONObject jSONObject) {
            this.f11152a = jSONObject.getInt("commitmentPaymentsCount");
            this.f11153b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int a() {
            return this.f11152a;
        }

        public int b() {
            return this.f11153b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f11155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f11156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f11157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f11158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C0 f11159f;

        public b(JSONObject jSONObject) throws JSONException {
            this.f11154a = jSONObject.optString("formattedPrice");
            this.f11155b = jSONObject.optLong("priceAmountMicros");
            this.f11156c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f11157d = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            AbstractC3541h0.r(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f11158e = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f11159f = jSONObjectOptJSONObject6 != null ? new C0(jSONObjectOptJSONObject6) : null;
        }

        public String a() {
            return this.f11154a;
        }

        public long b() {
            return this.f11155b;
        }

        public String c() {
            return this.f11156c;
        }

        public final C0 d() {
            return this.f11159f;
        }

        public final String e() {
            return this.f11157d;
        }

        public final String f() {
            return this.f11158e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f11161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f11162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f11163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f11165f;

        public c(JSONObject jSONObject) {
            this.f11163d = jSONObject.optString("billingPeriod");
            this.f11162c = jSONObject.optString("priceCurrencyCode");
            this.f11160a = jSONObject.optString("formattedPrice");
            this.f11161b = jSONObject.optLong("priceAmountMicros");
            this.f11165f = jSONObject.optInt("recurrenceMode");
            this.f11164e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f11164e;
        }

        public String b() {
            return this.f11163d;
        }

        public String c() {
            return this.f11160a;
        }

        public long d() {
            return this.f11161b;
        }

        public String e() {
            return this.f11162c;
        }

        public int f() {
            return this.f11165f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f11166a;

        public d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f11166a = arrayList;
        }

        public List a() {
            return this.f11166a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f11169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f11170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f11171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f11172f;

        public e(JSONObject jSONObject) throws JSONException {
            this.f11167a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f11168b = true == strOptString.isEmpty() ? null : strOptString;
            this.f11169c = jSONObject.getString("offerIdToken");
            this.f11170d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f11172f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f11171e = arrayList;
        }

        public String a() {
            return this.f11167a;
        }

        public a b() {
            return this.f11172f;
        }

        public String c() {
            return this.f11168b;
        }

        public List d() {
            return this.f11171e;
        }

        public String e() {
            return this.f11169c;
        }

        public d f() {
            return this.f11170d;
        }
    }

    public r(String str) {
        this.f11141a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11142b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f11143c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f11144d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f11145e = jSONObject.optString("title");
        this.f11146f = jSONObject.optString("name");
        this.f11147g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f11148h = jSONObject.optString("skuDetailsToken");
        this.f11149i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f11150j = arrayList;
        } else {
            this.f11150j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f11142b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f11142b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f11151k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f11151k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f11151k = arrayList2;
        }
    }

    public String a() {
        return this.f11147g;
    }

    public String b() {
        return this.f11146f;
    }

    public b c() {
        List list = this.f11151k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f11151k.get(0);
    }

    public String d() {
        return this.f11143c;
    }

    public String e() {
        return this.f11144d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return TextUtils.equals(this.f11141a, ((r) obj).f11141a);
        }
        return false;
    }

    public List f() {
        return this.f11150j;
    }

    public String g() {
        return this.f11145e;
    }

    public final String h() {
        return this.f11142b.optString("packageName");
    }

    public int hashCode() {
        return this.f11141a.hashCode();
    }

    public final String i() {
        return this.f11148h;
    }

    public String j() {
        return this.f11149i;
    }

    public final List k() {
        return this.f11151k;
    }

    public String toString() {
        List list = this.f11150j;
        return "ProductDetails{jsonString='" + this.f11141a + "', parsedJson=" + this.f11142b.toString() + ", productId='" + this.f11143c + "', productType='" + this.f11144d + "', title='" + this.f11145e + "', productDetailsToken='" + this.f11148h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
