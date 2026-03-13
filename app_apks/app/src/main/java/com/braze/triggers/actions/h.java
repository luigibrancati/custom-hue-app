package com.braze.triggers.actions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f28674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JSONObject json) {
        super(json);
        AbstractC4862t.e(json, "json");
        this.f28674f = new LinkedHashMap();
    }
}
