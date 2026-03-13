package com.braze.models.inappmessage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f28067a;

    public h(JSONArray jSONArray) {
        this.f28067a = jSONArray;
    }

    @Override // vc.l
    public final Object invoke(Object obj) throws JSONException {
        Object obj2 = this.f28067a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (JSONObject) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }
}
