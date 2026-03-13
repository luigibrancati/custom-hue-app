package com.braze.models.push;

import com.braze.enums.d;
import com.braze.models.outgoing.event.b;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(String campaignId, long j10) throws JSONException {
        AbstractC4862t.e(campaignId, "campaignId");
        d dVar = d.f27625H;
        JSONObject jSONObjectPut = new JSONObject().put("cid", campaignId);
        AbstractC4862t.d(jSONObjectPut, "put(...)");
        super(dVar, jSONObjectPut, j10, 8);
    }

    public final String f() throws JSONException {
        String string = this.f28074b.getString("cid");
        AbstractC4862t.d(string, "getString(...)");
        return string;
    }
}
