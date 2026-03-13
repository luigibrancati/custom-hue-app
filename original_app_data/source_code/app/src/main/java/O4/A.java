package O4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f10937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10938c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10941c;

        public String a() {
            return this.f10939a;
        }

        public String b() {
            return this.f10941c;
        }

        public String c() {
            return this.f10940b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10939a.equals(aVar.a()) && this.f10940b.equals(aVar.c()) && Objects.equals(this.f10941c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f10939a, this.f10940b, this.f10941c);
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f10939a, this.f10940b, this.f10941c);
        }

        public a(JSONObject jSONObject) {
            this.f10939a = jSONObject.optString("productId");
            this.f10940b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f10941c = true == strOptString.isEmpty() ? null : strOptString;
        }
    }

    public A(String str) {
        this.f10936a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f10937b = jSONObject;
        this.f10938c = d(jSONObject.optJSONArray("products"));
    }

    public static List d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    public String a() {
        return this.f10937b.optString("externalTransactionToken");
    }

    public String b() {
        String strOptString = this.f10937b.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    public List c() {
        return this.f10938c;
    }
}
