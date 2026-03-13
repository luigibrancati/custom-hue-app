package com.braze.requests;

import Od.F;
import com.braze.managers.d1;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import io.sentry.TraceContext;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f28364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f28365l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b3 serverConfigStorageProvider, String urlBase, String str, ArrayList logs) {
        super(new com.braze.requests.util.d(urlBase + "debugger/log", true), str, serverConfigStorageProvider, 8);
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(urlBase, "urlBase");
        AbstractC4862t.e(logs, "logs");
        this.f28364k = logs;
        this.f28365l = n.f28324n;
    }

    public static final String d() {
        return "Experienced JSONException while creating SDK Debugger Log request. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return this.f28364k.isEmpty();
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            String str = this.f28218b;
            if (str != null && !F.k0(str)) {
                jSONObjectB.put(TraceContext.JsonKeys.USER_ID, this.f28218b);
            }
            JSONArray jSONArray = new JSONArray();
            for (com.braze.models.o oVar : this.f28364k) {
                oVar.getClass();
                jSONArray.put(new JSONObject().put("log", oVar.f28068a).put("time", oVar.f28069b));
            }
            jSONObjectB.put("data", new JSONArray().put(new JSONObject().put("type", "sdk_event_log").put("data", jSONArray)));
            return jSONObjectB;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog((Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, true, new InterfaceC6082a() { // from class: n5.S
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.x.d();
                }
            });
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f28365l;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, final com.braze.models.response.d responseError) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(externalPublisher, "externalPublisher");
        AbstractC4862t.e(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new InterfaceC6082a() { // from class: n5.T
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.x.a(responseError);
            }
        }, 3, (Object) null);
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.t(new d1()), com.braze.events.internal.t.class);
    }

    public static final String a(com.braze.models.response.d dVar) {
        return "SDK Debugger Log Request failed " + dVar.a() + ". Disabling SDK Debugger.";
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap existingHeaders) {
        AbstractC4862t.e(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-Rec-Auth-Code", this.f28219c.y());
    }
}
