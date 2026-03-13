package com.braze.support;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements vc.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f28641a;

    public l(JSONArray jSONArray) {
        this.f28641a = jSONArray;
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f28641a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
