package com.braze.requests;

import com.braze.Braze;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import io.sentry.protocol.Device;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends t implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b3 f28219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f28220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f28221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.braze.models.outgoing.h f28225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28226j;

    public /* synthetic */ b(com.braze.requests.util.d dVar, String str, b3 b3Var, int i10) {
        this(dVar, (i10 & 2) != 0 ? null : str, b3Var, c.f28230e);
    }

    public static final String b(b bVar) {
        return ">> API key    : " + bVar.f28223g;
    }

    public static final String c(b bVar) {
        return bVar + " for " + bVar.c() + " executed successfully.";
    }

    public static final String d() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    public static final String f() {
        return "******************************************************************";
    }

    public static final String g() {
        return "******************************************************************";
    }

    public static final String h() {
        return "**                        !! WARNING !!                         **";
    }

    public static final String i() {
        return "**  The current API key/endpoint combination is invalid. This   **";
    }

    public static final String j() {
        return "** is potentially an integration error. Please ensure that your **";
    }

    public static final String k() {
        return "**     API key AND custom endpoint information are correct.     **";
    }

    @Override // com.braze.requests.p
    public void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(externalPublisher, "externalPublisher");
        AbstractC4862t.e(apiResponse, "apiResponse");
        com.braze.models.response.i iVar = apiResponse.f28127e;
        if (iVar != null) {
            ((com.braze.events.d) externalPublisher).b(new BrazeSdkAuthenticationErrorEvent(new com.braze.models.response.h(iVar.f28144a, iVar.f28145b, iVar.f28146c, null)), BrazeSdkAuthenticationErrorEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c() == n.f28324n, new InterfaceC6082a() { // from class: n5.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.b.c(this.f40581a);
            }
        }, 3, (Object) null);
    }

    public final com.braze.requests.util.d e() {
        return new com.braze.requests.util.d(Braze.INSTANCE.getApiEndpoint(this.f28335a.f28348b));
    }

    public String toString() {
        return hashCode() + " - " + JsonUtils.getPrettyPrintedString(b()) + "\nto target: " + e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.braze.requests.util.d requestTarget, String str, b3 serverConfigStorageProvider, c requestInitiatedBy) {
        super(requestTarget);
        AbstractC4862t.e(requestTarget, "requestTarget");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(requestInitiatedBy, "requestInitiatedBy");
        this.f28218b = str;
        this.f28219c = serverConfigStorageProvider;
        this.f28220d = requestInitiatedBy;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.braze.models.outgoing.h hVar = this.f28225i;
            if (hVar != null && !hVar.isEmpty()) {
                jSONObject.put(Device.TYPE, hVar.getKey());
            }
            String str = this.f28222f;
            if (str != null) {
                jSONObject.put("device_id", str);
            }
            Long l10 = this.f28221e;
            if (l10 != null) {
                jSONObject.put("time", l10);
            }
            String str2 = this.f28223g;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.f28224h;
            if (str3 != null) {
                jSONObject.put("sdk_version", str3);
            }
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.d();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.p
    public void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.d responseError) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(externalPublisher, "externalPublisher");
        AbstractC4862t.e(responseError, "responseError");
        final String strA = responseError.a();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.b.a(strA);
            }
        }, 6, (Object) null);
        if (responseError instanceof com.braze.models.response.e) {
            ((com.braze.events.d) internalPublisher).b(responseError, com.braze.models.response.e.class);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.g();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.h();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.i();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.k
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.j();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.l
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.k();
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.b(this.f40583a);
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.a(this.f40584a);
                }
            }, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.b.f();
                }
            }, 6, (Object) null);
        }
        if (responseError instanceof com.braze.models.response.h) {
            ((com.braze.events.d) externalPublisher).b(new BrazeSdkAuthenticationErrorEvent((com.braze.models.response.h) responseError), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    public static final String a(String str) {
        return "Error occurred while executing Braze request: " + str;
    }

    public static final String a(b bVar) {
        return ">> Request Uri: " + bVar.e();
    }

    @Override // com.braze.requests.p
    public void a(com.braze.events.d internalPublisher) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        internalPublisher.b(new com.braze.events.internal.r(this), com.braze.events.internal.r.class);
    }

    @Override // com.braze.requests.p
    public void a(com.braze.events.e internalPublisher) {
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.q(this), com.braze.events.internal.q.class);
    }

    public void a(HashMap existingHeaders) {
        AbstractC4862t.e(existingHeaders, "existingHeaders");
        existingHeaders.put("X-Braze-Api-Key", this.f28223g);
        String str = this.f28226j;
        if (str != null && str.length() != 0) {
            existingHeaders.put("X-Braze-Auth-Signature", this.f28226j);
        }
        c cVar = this.f28220d;
        if (cVar != c.f28230e) {
            existingHeaders.put("X-Braze-Request-Initiated-By", cVar.f28232a);
        }
    }
}
