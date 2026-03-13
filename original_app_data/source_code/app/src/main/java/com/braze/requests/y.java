package com.braze.requests;

import com.braze.events.internal.g0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import gc.Q;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.braze.triggers.actions.f f28366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.braze.triggers.events.b f28367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f28368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f28369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f28370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f28371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.braze.triggers.actions.f f28372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.braze.models.outgoing.k f28373r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b3 serverConfigStorageProvider, String urlBase, com.braze.triggers.actions.f templatedTriggeredAction, com.braze.triggers.events.b triggerEvent, String str) {
        super(new com.braze.requests.util.d(urlBase + "template"), str, serverConfigStorageProvider, 8);
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(urlBase, "urlBase");
        AbstractC4862t.e(templatedTriggeredAction, "templatedTriggeredAction");
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        this.f28366k = templatedTriggeredAction;
        this.f28367l = triggerEvent;
        this.f28368m = n.f28317g;
        this.f28369n = templatedTriggeredAction.f();
        int i10 = templatedTriggeredAction.d().f28698e;
        this.f28370o = i10 == -1 ? TimeUnit.SECONDS.toMillis(r3.f28697d + 30) : i10;
        this.f28371p = templatedTriggeredAction.g();
        this.f28372q = templatedTriggeredAction;
        this.f28373r = new com.braze.models.outgoing.j().a(str).a();
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
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
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_id", this.f28369n);
            jSONObject.put("trigger_event_type", this.f28367l.a());
            com.braze.models.k kVar = ((com.braze.triggers.events.i) this.f28367l).f28720c;
            jSONObject.put("data", kVar != null ? ((com.braze.models.outgoing.event.b) kVar).getKey() : null);
            jSONObjectB.put("template", jSONObject);
            String str = this.f28373r.f28102a;
            if (str != null && str.length() != 0) {
                jSONObjectB.put("respond_with", this.f28373r.getKey());
            }
            return jSONObjectB;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.U
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.y.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f28368m;
    }

    @Override // com.braze.requests.b
    public final String toString() {
        com.braze.triggers.actions.f fVar = this.f28366k;
        com.braze.triggers.events.b bVar = this.f28367l;
        return "TemplateRequest(templatedTriggeredAction=" + fVar + ", triggerEvent=" + bVar + ", triggerAnalyticsId='" + this.f28369n + "', templatePayloadExpirationTimestamp=" + this.f28371p + ", getTemplatedDataExpiration=" + (((com.braze.triggers.events.i) bVar).f28719b + this.f28370o) + "triggeredAction=" + this.f28372q + ")";
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(externalPublisher, "externalPublisher");
        AbstractC4862t.e(apiResponse, "apiResponse");
        InAppMessageBase inAppMessageBase = apiResponse.f28129g;
        if (inAppMessageBase != null) {
            inAppMessageBase.setLocalPrefetchedAssetPaths(Q.u(this.f28366k.f28674f));
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.d responseError) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(externalPublisher, "externalPublisher");
        AbstractC4862t.e(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        if (responseError instanceof com.braze.models.response.b) {
            ((com.braze.events.d) internalPublisher).b(new g0(this.f28367l, this.f28366k), g0.class);
        }
    }
}
