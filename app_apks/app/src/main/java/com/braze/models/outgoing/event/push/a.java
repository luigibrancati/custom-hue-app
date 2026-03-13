package com.braze.models.outgoing.event.push;

import com.braze.enums.d;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.braze.models.outgoing.event.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28079j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f28080i;

    public a(JSONObject jSONObject, String str) {
        super(d.f27635i, jSONObject, 0.0d, 12);
        this.f28080i = AbstractC4862t.a(str, "ab_none");
    }
}
