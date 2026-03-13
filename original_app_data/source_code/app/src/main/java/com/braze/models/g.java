package com.braze.models;

import org.json.JSONArray;
import org.json.JSONException;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f28054a;

    public g(JSONArray jSONArray) {
        this.f28054a = jSONArray;
    }

    @Override // vc.l
    public final Object invoke(Object obj) throws JSONException {
        Object obj2 = this.f28054a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }
}
