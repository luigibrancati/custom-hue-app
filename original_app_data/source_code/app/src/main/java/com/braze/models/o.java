package com.braze.models;

import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28069b;

    public o(String log) {
        AbstractC4862t.e(log, "log");
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        AbstractC4862t.e(log, "log");
        this.f28068a = log;
        this.f28069b = jNowInMilliseconds;
    }

    public final String c() {
        return this.f28068a;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonKey() {
        return new JSONObject().put("log", this.f28068a).put("time", this.f28069b);
    }
}
