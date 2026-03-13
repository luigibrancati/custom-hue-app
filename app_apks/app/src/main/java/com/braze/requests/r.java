package com.braze.requests;

import Od.F;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import io.sentry.TraceContext;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f28328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f28329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f28330m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b3 serverConfigStorageProvider, String urlBase, String str, ArrayList pushDeliveryEvents) {
        super(new com.braze.requests.util.d(urlBase + "push/delivery_events"), str, serverConfigStorageProvider, 8);
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(urlBase, "urlBase");
        AbstractC4862t.e(pushDeliveryEvents, "pushDeliveryEvents");
        this.f28328k = pushDeliveryEvents;
        this.f28329l = pushDeliveryEvents.isEmpty();
        this.f28330m = n.f28318h;
    }

    public static final String d() {
        return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return this.f28329l;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (com.braze.models.push.a aVar : this.f28328k) {
                aVar.f28077e.setValue(aVar, com.braze.models.outgoing.event.b.f28072h[0], this.f28218b);
                jSONArray.put(aVar.getKey());
            }
            jSONObjectB.put("events", jSONArray);
            String str = this.f28218b;
            if (str != null && !F.k0(str)) {
                jSONObjectB.put(TraceContext.JsonKeys.USER_ID, this.f28218b);
            }
            return jSONObjectB;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.M
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.r.d();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f28330m;
    }
}
