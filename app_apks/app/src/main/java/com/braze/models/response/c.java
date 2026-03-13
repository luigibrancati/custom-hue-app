package com.braze.models.response;

import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f28120d;

    public c(JSONObject jsonObject) {
        AbstractC4862t.e(jsonObject, "jsonObject");
        this.f28117a = jsonObject.optLong("last_card_updated_at", -1L);
        this.f28118b = jsonObject.optLong("last_full_sync_at", -1L);
        this.f28119c = jsonObject.optBoolean("full_sync", false);
        this.f28120d = jsonObject.optJSONArray("cards");
    }

    public c(String serializedCardJson) {
        AbstractC4862t.e(serializedCardJson, "serializedCardJson");
        this.f28119c = false;
        this.f28117a = -1L;
        this.f28118b = -1L;
        this.f28120d = new JSONArray().put(new JSONObject(serializedCardJson));
    }
}
