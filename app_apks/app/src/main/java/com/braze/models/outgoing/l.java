package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import io.sentry.TraceContext;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements IPutIntoJson, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f28105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f28106b;

    public l(JSONObject userObject) {
        AbstractC4862t.e(userObject, "userObject");
        this.f28105a = userObject;
        this.f28106b = new JSONArray().put(userObject);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONArray jsonArrayForJsonPut = this.f28106b;
        AbstractC4862t.d(jsonArrayForJsonPut, "jsonArrayForJsonPut");
        return jsonArrayForJsonPut;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return this.f28105a.length() == 0 || (this.f28105a.length() == 1 && this.f28105a.has(TraceContext.JsonKeys.USER_ID));
    }
}
