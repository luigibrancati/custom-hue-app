package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements IPutIntoJson, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28098b;

    public i(long j10, boolean z10) {
        this.f28097a = j10;
        this.f28098b = z10;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f28097a);
        return jSONObject;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return !this.f28098b;
    }
}
