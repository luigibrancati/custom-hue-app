package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28689b = BrazeLogger.getBrazeLogTag((Class<?>) l.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.conditions.logical.a f28690a;

    public l(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(new g(jSONArray2.getJSONObject(i11)));
            }
            arrayList.add(new com.braze.triggers.conditions.logical.c(arrayList2));
        }
        this.f28690a = new com.braze.triggers.conditions.logical.a(arrayList);
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f28690a.getJsonObject());
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.e(f28689b, "Caught exception creating Json.", e10);
            return jSONObject;
        }
    }
}
