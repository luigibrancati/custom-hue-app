package com.braze.models;

import java.util.Objects;
import org.json.JSONArray;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONArray f28053a;

    public f(JSONArray jSONArray) {
        this.f28053a = jSONArray;
    }

    @Override // vc.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Objects.nonNull(this.f28053a.opt(((Number) obj).intValue())));
    }
}
