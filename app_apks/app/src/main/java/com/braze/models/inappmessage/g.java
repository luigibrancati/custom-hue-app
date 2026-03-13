package com.braze.models.inappmessage;

import org.json.JSONArray;
import org.json.JSONObject;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f28066a;

    public g(JSONArray jSONArray) {
        this.f28066a = jSONArray;
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f28066a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
