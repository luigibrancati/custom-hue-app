package O4;

import org.json.JSONObject;

/* JADX INFO: renamed from: O4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1597k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11100a;

    public C1597k(String str) {
        this.f11100a = new JSONObject(str).optString("countryCode");
    }

    public String a() {
        return this.f11100a;
    }
}
