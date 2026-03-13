package O4;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: O4.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1600l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11104c;

    public /* synthetic */ C1600l0(JSONObject jSONObject, J0 j02) {
        this.f11102a = jSONObject.optString("productId");
        this.f11103b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f11104c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1600l0)) {
            return false;
        }
        C1600l0 c1600l0 = (C1600l0) obj;
        return this.f11102a.equals(c1600l0.f11102a) && this.f11103b.equals(c1600l0.f11103b) && Objects.equals(this.f11104c, c1600l0.f11104c);
    }

    public final int hashCode() {
        return Objects.hash(this.f11102a, this.f11103b, this.f11104c);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.f11102a, this.f11103b, this.f11104c);
    }
}
