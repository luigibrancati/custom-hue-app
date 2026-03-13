package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import io.sentry.TraceContext;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k implements IPutIntoJson, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f28103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f28104c;

    public k(String str, Boolean bool, i iVar) {
        this.f28102a = str;
        this.f28103b = bool;
        this.f28104c = iVar;
    }

    public final boolean c() {
        return this.f28103b != null;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() throws JSONException {
        i iVar;
        JSONObject jsonKey = getJsonKey();
        if (jsonKey.length() == 0) {
            return true;
        }
        if (this.f28103b == null && (iVar = this.f28104c) != null) {
            return !iVar.f28098b;
        }
        if (jsonKey.length() == 1) {
            return jsonKey.has(TraceContext.JsonKeys.USER_ID);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonKey() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f28102a;
        if (str != null && str.length() != 0) {
            jSONObject.put(TraceContext.JsonKeys.USER_ID, this.f28102a);
        }
        Boolean bool = this.f28103b;
        if (bool != null) {
            jSONObject.put("triggers", bool.booleanValue());
        }
        i iVar = this.f28104c;
        if (iVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", iVar.f28097a);
            jSONObject.put("config", jSONObject2);
        }
        return jSONObject;
    }
}
