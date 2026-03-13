package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f28679b = new HashSet();

    public e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f28678a = jSONObject2.getString("id");
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("buttons");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                this.f28679b.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (bVar instanceof com.braze.triggers.events.d) {
            com.braze.triggers.events.d dVar = (com.braze.triggers.events.d) bVar;
            if (!StringUtils.isNullOrBlank(dVar.f28712e) && dVar.f28712e.equals(this.f28678a)) {
                return this.f28679b.size() > 0 ? !StringUtils.isNullOrBlank(dVar.f28713f) && this.f28679b.contains(dVar.f28713f) : StringUtils.isNullOrBlank(dVar.f28713f);
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f28678a);
            if (this.f28679b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f28679b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
