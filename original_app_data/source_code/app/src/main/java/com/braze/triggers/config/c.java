package com.braze.triggers.config;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.triggers.config.c;
import io.sentry.ProfilingTraceData;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f28699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28700g;

    public c(JSONObject json) {
        AbstractC4862t.e(json, "json");
        this.f28694a = json.optLong("start_time", -1L);
        this.f28695b = json.optLong("end_time", -1L);
        this.f28696c = json.optInt("priority", 0);
        this.f28700g = json.optInt("min_seconds_since_last_trigger", -1);
        this.f28697d = json.optInt("delay", 0);
        this.f28698e = json.optInt(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, -1);
        this.f28699f = new b(json);
    }

    public static final String c() {
        return "Could not convert ScheduleConfig to JSON";
    }

    public final int d() {
        return this.f28697d;
    }

    public final b e() {
        return this.f28699f;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        try {
            JSONObject jsonKey = this.f28699f.getPropertiesJSONObject();
            if (jsonKey == null) {
                return null;
            }
            jsonKey.put("start_time", this.f28694a);
            jsonKey.put("end_time", this.f28695b);
            jsonKey.put("priority", this.f28696c);
            jsonKey.put("min_seconds_since_last_trigger", this.f28700g);
            jsonKey.put(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, this.f28698e);
            jsonKey.put("delay", this.f28697d);
            return jsonKey;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: v5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return c.c();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
