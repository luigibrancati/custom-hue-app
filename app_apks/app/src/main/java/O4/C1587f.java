package O4;

import org.json.JSONObject;

/* JADX INFO: renamed from: O4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1587f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11050a;

    public C1587f(String str) {
        this.f11050a = new JSONObject(str).optString("externalTransactionToken");
    }

    public String a() {
        return this.f11050a;
    }
}
