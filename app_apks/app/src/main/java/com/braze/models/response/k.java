package com.braze.models.response;

import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k implements vc.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f28149a;

    public k(JSONArray jSONArray) {
        this.f28149a = jSONArray;
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f28149a.opt(((Number) obj).intValue()) instanceof String);
    }
}
