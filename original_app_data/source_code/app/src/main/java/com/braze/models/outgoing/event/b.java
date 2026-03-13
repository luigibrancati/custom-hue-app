package com.braze.models.outgoing.event;

import Cc.l;
import com.braze.enums.d;
import com.braze.models.k;
import com.braze.models.q;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import io.flutter.plugins.firebase.analytics.Constants;
import io.sentry.TraceContext;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.y;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f28073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f28074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f28075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.support.delegates.a f28077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.braze.support.delegates.a f28078f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l[] f28072h = {M.e(new y(b.class, Constants.USER_ID, "getUserId()Ljava/lang/String;", 0)), M.e(new y(b.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f28071g = new a();

    public b(d type, JSONObject data, double d10, String uniqueIdentifier) {
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(data, "data");
        AbstractC4862t.e(uniqueIdentifier, "uniqueIdentifier");
        this.f28073a = type;
        this.f28074b = data;
        this.f28075c = d10;
        this.f28076d = uniqueIdentifier;
        this.f28077e = new com.braze.support.delegates.a();
        this.f28078f = new com.braze.support.delegates.a();
        if (type == d.f27626I) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    public static final String c() {
        return "Caught exception creating Braze event json";
    }

    public final void a(q qVar) {
        this.f28078f.setValue(this, f28072h[1], qVar);
    }

    public final d d() {
        return this.f28073a;
    }

    public final String e() {
        return this.f28076d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC4862t.a(getClass(), obj.getClass())) {
            return false;
        }
        return AbstractC4862t.a(this.f28076d, ((b) obj).f28076d);
    }

    public final int hashCode() {
        return this.f28076d.hashCode();
    }

    public final String toString() {
        return a();
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f28073a.f27653a);
            jSONObject.put("data", this.f28074b);
            jSONObject.put("time", this.f28075c);
            com.braze.support.delegates.a aVar = this.f28077e;
            l[] lVarArr = f28072h;
            l property = lVarArr[0];
            aVar.getClass();
            AbstractC4862t.e(this, "thisRef");
            AbstractC4862t.e(property, "property");
            String str = (String) aVar.f28635a;
            if (str != null && str.length() != 0) {
                com.braze.support.delegates.a aVar2 = this.f28077e;
                l property2 = lVarArr[0];
                aVar2.getClass();
                AbstractC4862t.e(this, "thisRef");
                AbstractC4862t.e(property2, "property");
                jSONObject.put(TraceContext.JsonKeys.USER_ID, (String) aVar2.f28635a);
            }
            com.braze.support.delegates.a aVar3 = this.f28078f;
            l property3 = lVarArr[1];
            aVar3.getClass();
            AbstractC4862t.e(this, "thisRef");
            AbstractC4862t.e(property3, "property");
            q qVar = (q) aVar3.f28635a;
            if (qVar != null) {
                jSONObject.put("session_id", qVar.f28112b);
            }
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: i5.D
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.outgoing.event.b.c();
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    public /* synthetic */ b(d dVar, JSONObject jSONObject, double d10, int i10) {
        this(dVar, (i10 & 2) != 0 ? new JSONObject() : jSONObject, (i10 & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d10, UUID.randomUUID().toString());
    }
}
