package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28685a;

    public h(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.isNull("product_id")) {
            return;
        }
        this.f28685a = jSONObjectOptJSONObject.optString("product_id", null);
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.f)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f28685a)) {
            return true;
        }
        com.braze.triggers.events.f fVar = (com.braze.triggers.events.f) bVar;
        return !StringUtils.isNullOrBlank(fVar.f28714f) && fVar.f28714f.equals(this.f28685a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f28685a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f28685a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
