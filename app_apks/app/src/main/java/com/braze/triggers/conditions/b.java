package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28676d = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28677c;

    public b(JSONObject jSONObject) {
        super(jSONObject);
        this.f28677c = jSONObject.getJSONObject("data").getString("event_name");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.a)) {
            return false;
        }
        com.braze.triggers.events.a aVar = (com.braze.triggers.events.a) bVar;
        if (StringUtils.isNullOrBlank(aVar.f28711f) || !aVar.f28711f.equals(this.f28677c)) {
            return false;
        }
        return this.f28690a.a(bVar);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject jSONObjectC = super.c();
        try {
            jSONObjectC.put("type", "custom_event_property");
            JSONObject jSONObject = jSONObjectC.getJSONObject("data");
            jSONObject.put("event_name", this.f28677c);
            jSONObjectC.put("data", jSONObject);
            return jSONObjectC;
        } catch (JSONException e10) {
            BrazeLogger.e(f28676d, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e10);
            return jSONObjectC;
        }
    }
}
