package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28686d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28687c;

    public i(JSONObject jSONObject) {
        super(jSONObject);
        this.f28687c = jSONObject.getJSONObject("data").getString("product_id");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.f) || StringUtils.isNullOrBlank(this.f28687c)) {
            return false;
        }
        com.braze.triggers.events.f fVar = (com.braze.triggers.events.f) bVar;
        if (!StringUtils.isNullOrBlank(fVar.f28714f) && fVar.f28714f.equals(this.f28687c)) {
            return this.f28690a.a(bVar);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject jSONObjectC = super.c();
        try {
            jSONObjectC.put("type", "purchase_property");
            JSONObject jSONObject = jSONObjectC.getJSONObject("data");
            jSONObject.put("product_id", this.f28687c);
            jSONObjectC.put("data", jSONObject);
            return jSONObjectC;
        } catch (JSONException e10) {
            BrazeLogger.e(f28686d, "Caught exception creating Json.", e10);
            return jSONObjectC;
        }
    }
}
