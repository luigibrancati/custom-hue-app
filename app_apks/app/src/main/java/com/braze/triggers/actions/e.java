package com.braze.triggers.actions;

import org.json.JSONArray;
import org.json.JSONException;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f28664a;

    public e(JSONArray jSONArray) {
        this.f28664a = jSONArray;
    }

    @Override // vc.l
    public final Object invoke(Object obj) throws JSONException {
        Object obj2 = this.f28664a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
