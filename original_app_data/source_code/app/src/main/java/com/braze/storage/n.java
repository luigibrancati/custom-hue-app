package com.braze.storage;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n implements vc.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f28498a;

    public n(JSONArray jSONArray) {
        this.f28498a = jSONArray;
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f28498a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
