package com.braze.models;

import com.braze.models.p;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class p implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f28107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f28108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Double f28109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28110d;

    public p(q sessionId, double d10, Double d11, boolean z10) {
        AbstractC4862t.e(sessionId, "sessionId");
        this.f28107a = sessionId;
        this.f28108b = d10;
        ((n) this).f28109c = d11;
        this.f28110d = z10;
    }

    public static final String a(double d10, p pVar) {
        return "End time '" + d10 + "' for session is less than the start time '" + pVar.f28108b + "' for this session.";
    }

    public static final String c() {
        return "Caught exception creating Session Json.";
    }

    public final long d() {
        Double dE = e();
        if (dE == null) {
            return -1L;
        }
        final double dDoubleValue = dE.doubleValue();
        long j10 = (long) (dDoubleValue - this.f28108b);
        if (j10 < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: d5.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return p.a(dDoubleValue, this);
                }
            }, 6, (Object) null);
        }
        return j10;
    }

    public Double e() {
        return this.f28109c;
    }

    public final q f() {
        return this.f28107a;
    }

    public final double g() {
        return this.f28108b;
    }

    public final boolean h() {
        return this.f28110d;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f28107a + ", startTime=" + this.f28108b + ", endTime=" + e() + ", isSealed=" + this.f28110d + ", duration=" + d() + ")";
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f28107a);
            jSONObject.put("start_time", this.f28108b);
            jSONObject.put("is_sealed", this.f28110d);
            if (e() == null) {
                return jSONObject;
            }
            jSONObject.put("end_time", e());
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: d5.l
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return p.c();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    public p(JSONObject sessionData) throws JSONException {
        AbstractC4862t.e(sessionData, "sessionData");
        String sessionId = sessionData.getString("session_id");
        AbstractC4862t.d(sessionId, "getString(...)");
        AbstractC4862t.e(sessionId, "sessionId");
        UUID uuidFromString = UUID.fromString(sessionId);
        AbstractC4862t.d(uuidFromString, "fromString(...)");
        this.f28107a = new q(uuidFromString);
        this.f28108b = sessionData.getDouble("start_time");
        this.f28110d = sessionData.getBoolean("is_sealed");
        this.f28109c = JsonUtils.getDoubleOrNull(sessionData, "end_time");
    }
}
