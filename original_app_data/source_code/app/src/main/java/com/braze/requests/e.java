package com.braze.requests;

import Rd.AbstractC2130h;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.internal.h0;
import com.braze.events.internal.l;
import com.braze.managers.d1;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.storage.b3;
import com.braze.storage.g1;
import com.braze.storage.i1;
import com.braze.storage.j1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import fc.C4015H;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.framework.h f28233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.communication.e f28234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f28235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f28236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.managers.r f28237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b3 f28238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.braze.storage.p f28239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.braze.requests.util.a f28240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.braze.requests.framework.c f28241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f28242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f28243k;

    public e(com.braze.requests.framework.h requestInfo, com.braze.communication.e httpConnector, com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.managers.r brazeManager, b3 serverConfigStorage, com.braze.storage.p contentCardsStorage, com.braze.requests.util.a endpointMetadataProvider, com.braze.requests.framework.c requestDispatchCallback) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        AbstractC4862t.e(httpConnector, "httpConnector");
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(externalPublisher, "externalPublisher");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(serverConfigStorage, "serverConfigStorage");
        AbstractC4862t.e(contentCardsStorage, "contentCardsStorage");
        AbstractC4862t.e(endpointMetadataProvider, "endpointMetadataProvider");
        AbstractC4862t.e(requestDispatchCallback, "requestDispatchCallback");
        this.f28233a = requestInfo;
        this.f28234b = httpConnector;
        this.f28235c = internalPublisher;
        this.f28236d = externalPublisher;
        this.f28237e = brazeManager;
        this.f28238f = serverConfigStorage;
        this.f28239g = contentCardsStorage;
        this.f28240h = endpointMetadataProvider;
        this.f28241i = requestDispatchCallback;
        HashMap map = new HashMap();
        map.put("Accept-Encoding", "gzip, deflate");
        map.put(HttpHeaders.CONTENT_TYPE, "application/json");
        this.f28242j = map;
        o oVar = requestInfo.f28280a;
        this.f28243k = oVar;
        oVar.a(map);
    }

    public static final String b() {
        return "Experienced network communication exception processing API response. Sending network error event.";
    }

    public static final String d() {
        return "Api response was null, failing task.";
    }

    public final com.braze.models.response.a a() {
        ((b) this.f28243k).f28221e = Long.valueOf(DateTimeUtils.nowInSeconds());
        final com.braze.requests.util.d target = ((b) this.f28243k).e();
        JSONObject jSONObjectB = this.f28243k.b();
        if (jSONObjectB == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.a(target);
                }
            }, 6, (Object) null);
            return new com.braze.models.response.n(this.f28243k, new com.braze.communication.d(-1, (Map) null, 6));
        }
        com.braze.requests.util.a aVar = this.f28240h;
        aVar.getClass();
        AbstractC4862t.e(target, "target");
        String key = com.braze.requests.util.a.b(target.f28347a);
        long jA = aVar.f28339a.a(key);
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        j1 j1Var = aVar.f28339a;
        j1Var.getClass();
        AbstractC4862t.e(key, "key");
        AbstractC2130h.b(null, new i1(j1Var, key, jNowInMilliseconds, null), 1, null);
        this.f28242j.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(Math.min(jNowInMilliseconds - jA, 7200000L)));
        HashMap map = this.f28242j;
        com.braze.requests.util.a aVar2 = this.f28240h;
        aVar2.getClass();
        AbstractC4862t.e(target, "target");
        String key2 = com.braze.requests.util.a.a(target.f28347a);
        long jA2 = aVar2.f28339a.a(key2, 1L);
        j1 j1Var2 = aVar2.f28339a;
        j1Var2.getClass();
        AbstractC4862t.e(key2, "key");
        AbstractC2130h.b(null, new g1(j1Var2, key2, jA2 + 1, null), 1, null);
        map.put("X-Braze-Req-Attempt", String.valueOf(jA2));
        this.f28242j.put("X-Braze-Req-Tokens-Remaining", String.valueOf(this.f28233a.f28284e));
        Integer num = this.f28233a.f28285f;
        if (num != null) {
            this.f28242j.put("X-Braze-Ept-Req-Tokens-Remaining", String.valueOf(num.intValue()));
        }
        int i10 = com.braze.communication.c.f27520a;
        com.braze.communication.d dVarA = this.f28234b.a(target, this.f28242j, jSONObjectB);
        if (dVarA.f27523c != null) {
            return new com.braze.models.response.g(this.f28243k, dVarA, this.f28237e);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.v
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.e.b();
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.f28236d).b(new BrazeNetworkFailureEvent(this.f28243k, dVarA), BrazeNetworkFailureEvent.class);
        return new com.braze.models.response.n(this.f28243k, dVarA);
    }

    public final void c() {
        com.braze.models.response.a aVarA = a();
        if (!(aVarA instanceof com.braze.models.response.g)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.p
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.d();
                }
            }, 6, (Object) null);
            com.braze.models.response.f fVar = new com.braze.models.response.f(this.f28243k, aVarA.f28113a);
            this.f28243k.a(this.f28235c, this.f28236d, fVar);
            ((com.braze.events.d) this.f28235c).b(new com.braze.events.internal.f(this.f28243k), com.braze.events.internal.f.class);
            a(fVar);
            this.f28241i.a(aVarA);
            return;
        }
        com.braze.models.response.g apiResponse = (com.braze.models.response.g) aVarA;
        AbstractC4862t.e(apiResponse, "apiResponse");
        com.braze.models.response.d dVar = apiResponse.f28126d;
        if (dVar == null) {
            com.braze.requests.util.a aVar = this.f28240h;
            com.braze.requests.util.d target = ((b) this.f28243k).e();
            aVar.getClass();
            AbstractC4862t.e(target, "target");
            String key = com.braze.requests.util.a.a(target.f28347a);
            j1 j1Var = aVar.f28339a;
            j1Var.getClass();
            AbstractC4862t.e(key, "key");
            AbstractC2130h.b(null, new g1(j1Var, key, 1L, null), 1, null);
            this.f28243k.a(this.f28235c, this.f28236d, apiResponse);
            this.f28241i.a(apiResponse);
        } else {
            a(dVar);
            this.f28243k.a(this.f28235c, this.f28236d, apiResponse.f28126d);
            this.f28241i.a((com.braze.models.response.a) apiResponse);
        }
        a(apiResponse);
        if (apiResponse.f28126d instanceof com.braze.models.response.h) {
            ((com.braze.events.d) this.f28235c).b(new com.braze.events.internal.f(this.f28243k), com.braze.events.internal.f.class);
        } else {
            ((com.braze.events.d) this.f28235c).b(new com.braze.events.internal.g(this.f28243k), com.braze.events.internal.g.class);
        }
    }

    public static final String b(com.braze.models.response.d dVar) {
        return "Received server error from request: " + dVar.a();
    }

    public final void b(final ArrayList arrayList) {
        if (arrayList != null) {
            d.a(arrayList, new InterfaceC6082a() { // from class: n5.r
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.b(this.f40588a, arrayList);
                }
            });
        }
    }

    public static final C4015H b(e eVar, List list) {
        ((com.braze.events.d) eVar.f28235c).b(new h0(list), h0.class);
        return C4015H.f34254a;
    }

    public static final String a(com.braze.requests.util.d dVar) {
        return "Could not parse request parameters for POST request to " + dVar + ", cancelling request.";
    }

    public final void a(com.braze.models.response.g apiResponse) {
        AbstractC4862t.e(apiResponse, "apiResponse");
        final String str = this.f28237e.f27967b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.t
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.e.a(str);
            }
        }, 6, (Object) null);
        a(apiResponse.f28128f, str);
        a(apiResponse.f28131i);
        b(apiResponse.f28130h);
        a(apiResponse.f28132j);
        a(apiResponse.f28133k);
        a(apiResponse.f28129g, str);
        String str2 = apiResponse.f28134l;
        String str3 = apiResponse.f28135m;
        String str4 = apiResponse.f28136n;
        if (str2 != null && str3 != null && str4 != null) {
            ((com.braze.events.d) this.f28235c).b(new com.braze.events.internal.h(str2, str3, str4), com.braze.events.internal.h.class);
        }
        a(apiResponse.f28138p);
        d1 d1Var = apiResponse.f28139q;
        if (d1Var != null) {
            ((com.braze.events.d) this.f28235c).b(new com.braze.events.internal.t(d1Var), com.braze.events.internal.t.class);
        }
    }

    public static final String a(String str) {
        return "Processing server response payload for user with id: " + str;
    }

    public final void a(final com.braze.models.response.d responseError) {
        AbstractC4862t.e(responseError, "responseError");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.s
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.e.b(responseError);
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.f28235c).b(new com.braze.events.internal.x(responseError), com.braze.events.internal.x.class);
        o oVar = this.f28243k;
        if (oVar instanceof y) {
            com.braze.events.e eVar = this.f28236d;
            String strA = ((y) oVar).f28367l.a();
            AbstractC4862t.d(strA, "getTriggerEventType(...)");
            ((com.braze.events.d) eVar).b(new NoMatchingTriggerEvent(strA), NoMatchingTriggerEvent.class);
        }
    }

    public final void a(final com.braze.models.response.c cVar, final String str) {
        if (cVar != null) {
            d.a(cVar, new InterfaceC6082a() { // from class: n5.x
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.a(this.f40596a, cVar, str);
                }
            });
        }
    }

    public static final C4015H a(e eVar, com.braze.models.response.c cVar, String str) {
        ContentCardsUpdatedEvent contentCardsUpdatedEventA = eVar.f28239g.a(cVar, str);
        if (contentCardsUpdatedEventA != null) {
            ((com.braze.events.d) eVar.f28236d).b(contentCardsUpdatedEventA, ContentCardsUpdatedEvent.class);
        }
        return C4015H.f34254a;
    }

    public final void a(final com.braze.models.response.m mVar) {
        if (mVar != null) {
            d.a(mVar, new InterfaceC6082a() { // from class: n5.y
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.a(this.f40599a, mVar);
                }
            });
        }
    }

    public static final C4015H a(e eVar, com.braze.models.response.m serverConfig) {
        eVar.f28238f.a(serverConfig);
        ((com.braze.events.d) eVar.f28235c).b(new com.braze.events.internal.w(serverConfig), com.braze.events.internal.w.class);
        AbstractC4862t.e(serverConfig, "serverConfig");
        d1 d1Var = new d1(serverConfig.f28184z, serverConfig.f28152B, serverConfig.f28151A, serverConfig.f28153C, serverConfig.f28154D, serverConfig.f28155E);
        ((com.braze.events.d) eVar.f28235c).b(new com.braze.events.internal.t(d1Var), com.braze.events.internal.t.class);
        return C4015H.f34254a;
    }

    public final void a(final ArrayList arrayList) {
        if (arrayList != null) {
            d.a(arrayList, new InterfaceC6082a() { // from class: n5.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.a(this.f40575a, arrayList);
                }
            });
        }
    }

    public static final C4015H a(e eVar, List list) {
        ((com.braze.events.d) eVar.f28235c).b(new l(list), l.class);
        return C4015H.f34254a;
    }

    public final void a(final JSONArray jSONArray) {
        if (jSONArray != null) {
            d.a(jSONArray, new InterfaceC6082a() { // from class: n5.q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.a(this.f40586a, jSONArray);
                }
            });
        }
    }

    public static final C4015H a(e eVar, JSONArray jSONArray) {
        ((com.braze.events.d) eVar.f28235c).b(new com.braze.events.internal.i(jSONArray), com.braze.events.internal.i.class);
        return C4015H.f34254a;
    }

    public final void a(final JSONObject jSONObject) {
        if (jSONObject != null) {
            d.a(jSONObject, new InterfaceC6082a() { // from class: n5.z
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.a(this.f40601a, jSONObject);
                }
            });
        }
    }

    public static final C4015H a(e eVar, JSONObject jSONObject) {
        ((com.braze.events.d) eVar.f28235c).b(new com.braze.events.internal.a(jSONObject), com.braze.events.internal.a.class);
        return C4015H.f34254a;
    }

    public final void a(final InAppMessageBase inAppMessageBase, final String str) {
        if (inAppMessageBase != null) {
            d.a(inAppMessageBase, new InterfaceC6082a() { // from class: n5.w
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.e.a(this.f40593a, inAppMessageBase, str);
                }
            });
        }
    }

    public static final C4015H a(e eVar, IInAppMessage iInAppMessage, String str) {
        o oVar = eVar.f28243k;
        if (oVar instanceof y) {
            iInAppMessage.setExpirationTimestamp(((y) oVar).f28371p);
            com.braze.events.e eVar2 = eVar.f28235c;
            y yVar = (y) eVar.f28243k;
            ((com.braze.events.d) eVar2).b(new com.braze.events.internal.m(yVar.f28367l, yVar.f28372q, iInAppMessage, str), com.braze.events.internal.m.class);
        }
        return C4015H.f34254a;
    }
}
