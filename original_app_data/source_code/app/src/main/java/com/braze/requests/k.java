package com.braze.requests;

import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.braze.models.k f28310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f28311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b3 serverConfigStorageProvider, String urlBase, com.braze.models.k locationEvent, String str) {
        super(new com.braze.requests.util.d(urlBase + "geofence/request"), str, serverConfigStorageProvider, 8);
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(urlBase, "urlBase");
        AbstractC4862t.e(locationEvent, "locationEvent");
        this.f28310k = locationEvent;
        this.f28311l = n.f28319i;
    }

    public static final String l() {
        return "Experienced JSONException while creating geofence refresh request. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            jSONObjectB.put("location_event", ((com.braze.models.outgoing.event.b) this.f28310k).getKey());
            return jSONObjectB;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.K
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.k.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f28311l;
    }
}
