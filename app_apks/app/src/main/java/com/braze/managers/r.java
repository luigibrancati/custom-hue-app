package com.braze.managers;

import Od.F;
import Rd.D0;
import Rd.InterfaceC2166z0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.models.IBrazeLocation;
import com.braze.storage.b3;
import com.braze.storage.m2;
import com.braze.storage.s1;
import com.braze.storage.v2;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import fc.C4034q;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r implements m0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String[] f27965u = {"android.os.deadsystemexception"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f27968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f27969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BrazeConfigurationProvider f27970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b3 f27971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f27972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f27973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v2 f27974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f27975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v0 f27976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m2 f27977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.braze.storage.t0 f27978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f27979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f27980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReentrantLock f27981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC2166z0 f27982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s1 f27983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile String f27984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f27985t;

    public r(Context context, String str, String apiKey, w sessionManager, com.braze.events.e internalEventPublisher, BrazeConfigurationProvider configurationProvider, b3 serverConfigStorageProvider, h0 eventStorageManager, s messagingSessionManager, v2 sdkEnablementProvider, y0 pushMaxManager, v0 pushDeliveryManager, m2 pushIdentifierStorageProvider, com.braze.storage.t0 delayedInitializationProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(sessionManager, "sessionManager");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(eventStorageManager, "eventStorageManager");
        AbstractC4862t.e(messagingSessionManager, "messagingSessionManager");
        AbstractC4862t.e(sdkEnablementProvider, "sdkEnablementProvider");
        AbstractC4862t.e(pushMaxManager, "pushMaxManager");
        AbstractC4862t.e(pushDeliveryManager, "pushDeliveryManager");
        AbstractC4862t.e(pushIdentifierStorageProvider, "pushIdentifierStorageProvider");
        AbstractC4862t.e(delayedInitializationProvider, "delayedInitializationProvider");
        this.f27966a = context;
        this.f27967b = str;
        this.f27968c = sessionManager;
        this.f27969d = internalEventPublisher;
        this.f27970e = configurationProvider;
        this.f27971f = serverConfigStorageProvider;
        this.f27972g = eventStorageManager;
        this.f27973h = messagingSessionManager;
        this.f27974i = sdkEnablementProvider;
        this.f27975j = pushMaxManager;
        this.f27976k = pushDeliveryManager;
        this.f27977l = pushIdentifierStorageProvider;
        this.f27978m = delayedInitializationProvider;
        this.f27979n = new AtomicInteger(0);
        this.f27980o = new AtomicInteger(0);
        this.f27981p = new ReentrantLock();
        this.f27982q = D0.b(null, 1, null);
        this.f27983r = new s1(context, str, apiKey);
        this.f27984s = "";
        this.f27985t = new AtomicBoolean(false);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.h3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.a();
            }
        }, 6, (Object) null);
        com.braze.events.d dVar = (com.braze.events.d) internalEventPublisher;
        dVar.c(com.braze.events.internal.s.class, new IEventSubscriber() { // from class: c5.i3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.r rVar = this.f25736a;
                android.support.v4.media.session.a.a(obj);
                com.braze.managers.r.a(rVar, (com.braze.events.internal.s) null);
            }
        });
        dVar.c(com.braze.events.internal.u.class, new IEventSubscriber() { // from class: c5.j3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.r.a(this.f25741a, (com.braze.events.internal.u) obj);
            }
        });
        dVar.c(com.braze.events.internal.v.class, new IEventSubscriber() { // from class: c5.B2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.r.a(this.f25634a, (com.braze.events.internal.v) obj);
            }
        });
    }

    public static final String a() {
        return "BrazeManager init called";
    }

    public static final String c(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f27978m.c() + " and GDPR disabled mode: " + rVar.f27974i.a() + ". Not closing session.";
    }

    public static final String e() {
        return "BrazeManager got SdkDebuggerInitializationRequestedEvent";
    }

    public static final String f() {
        return "Braze SDK Debugger logs being sent";
    }

    public static final String g() {
        return "Failed to log error.";
    }

    public static final String h() {
        return "Publishing an internal push body clicked event for any awaiting triggers.";
    }

    public static final String i() {
        return "Adding push click to dispatcher pending list";
    }

    public static final String j() {
        return "Session in background, data syncing event on delay";
    }

    public static final String k() {
        return "Logging push max campaign";
    }

    public static final String m() {
        return "Flushing Push Delivery Events now";
    }

    public static final String n() {
        return "Attempted to flush Push Delivery events, but no events are available";
    }

    public static final String p() {
        return "Posting banners refresh request.";
    }

    public static final String r() {
        return "Posting feature flags refresh request.";
    }

    public static final String s() {
        return "Disallowing Content Cards sync due to Content Cards not being enabled.";
    }

    public static final String u() {
        return "Requesting DUST mite";
    }

    public static final String v() {
        return "Posting geofence request for location.";
    }

    public static final String x() {
        return "Sending Push Max data";
    }

    public static final String y() {
        return "Posting SDK Debugger Logs request.";
    }

    public final void b(a activity) {
        AbstractC4862t.e(activity, "activity");
        if (this.f27974i.a() || this.f27978m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.g3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.r.f(this.f25730a);
                }
            }, 6, (Object) null);
        } else {
            this.f27968c.c(activity.f27837a.toString());
            this.f27973h.b();
        }
    }

    public final void d() {
        if (this.f27974i.a() || this.f27978m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.C2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.r.d(this.f25637a);
                }
            }, 6, (Object) null);
        } else {
            this.f27968c.l();
        }
    }

    public final void l() {
        if (this.f27974i.a() || this.f27978m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.D2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.r.e(this.f25641a);
                }
            }, 6, (Object) null);
        } else {
            this.f27968c.c((String) null);
        }
    }

    public final void q() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.O2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.r();
            }
        }, 7, (Object) null);
        a(new com.braze.requests.j(this.f27971f, this.f27970e.getBaseUrlForRequests(), this.f27967b));
    }

    public final void t() {
        if (this.f27971f.F()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.b3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.r.u();
                }
            }, 6, (Object) null);
            a(new com.braze.requests.h(this.f27971f, this.f27970e.getBaseUrlForRequests(), this.f27967b));
        }
    }

    public final void w() {
        List listV0;
        if (this.f27971f.L()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Y2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.r.x();
                }
            }, 7, (Object) null);
            b3 b3Var = this.f27971f;
            String baseUrlForRequests = this.f27970e.getBaseUrlForRequests();
            String str = this.f27967b;
            y0 y0Var = this.f27975j;
            Object data = y0Var.f28028b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) data).longValue() - y0Var.f28027a.u();
            List listA = y0Var.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (((w0) obj).f28019b > jLongValue) {
                    arrayList.add(obj);
                }
            }
            List listV02 = C4179C.V0(arrayList);
            ArrayList arrayList2 = new ArrayList(C4207u.v(listV02, 10));
            Iterator it = listV02.iterator();
            while (it.hasNext()) {
                arrayList2.add(((w0) it.next()).f28018a);
            }
            Object data2 = this.f27975j.f28028b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            AbstractC4862t.c(data2, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue2 = ((Long) data2).longValue();
            m2 m2Var = this.f27977l;
            long jV = this.f27971f.v();
            if (jV <= 0) {
                listV0 = C4206t.k();
            } else {
                long jNowInSeconds = DateTimeUtils.nowInSeconds() - jV;
                Map mapA = m2Var.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapA.entrySet()) {
                    if (((Number) entry.getValue()).longValue() >= jNowInSeconds) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                listV0 = C4179C.V0(linkedHashMap.keySet());
            }
            a(new com.braze.requests.s(b3Var, baseUrlForRequests, str, arrayList2, jLongValue2, listV0));
        }
    }

    public static final void a(r rVar, com.braze.events.internal.s it) {
        AbstractC4862t.e(it, "it");
        throw null;
    }

    public static final String e(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f27978m.c() + " and GDPR disabled mode: " + rVar.f27974i.a() + ". Not opening session.";
    }

    public static final String f(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f27978m.c() + " and GDPR disabled mode: " + rVar.f27974i.a() + ". Not opening session.";
    }

    public static final void a(r rVar, com.braze.events.internal.u it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rVar, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Q2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.e();
            }
        }, 6, (Object) null);
        rVar.b();
    }

    public static final String c(com.braze.models.k kVar) {
        return "Not processing event after validation failed: " + kVar;
    }

    public static final String d(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f27978m.c() + " and GDPR disabled mode: " + rVar.f27974i.a() + ". Not force closing session.";
    }

    public static final String e(com.braze.models.k kVar) {
        return "Not adding user id to event: " + JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getKey());
    }

    public static final String f(com.braze.models.k kVar) {
        return "Attempting to log event: " + JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getKey());
    }

    public final void c(String campaignId) {
        AbstractC4862t.e(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.P2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.k();
            }
        }, 7, (Object) null);
        this.f27975j.a(campaignId);
    }

    public static final void a(r rVar, com.braze.events.internal.v it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rVar, BrazeLogger.Priority.f28624D, (Throwable) null, true, new InterfaceC6082a() { // from class: c5.T2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.f();
            }
        }, 2, (Object) null);
        rVar.b(it.f27748a);
    }

    public static final String c() {
        return "Requesting SDK Debugger Handshake";
    }

    public static final String d(com.braze.models.k kVar) {
        return "Not adding session id to event: " + JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getKey());
    }

    public static final String b(com.braze.models.k kVar) {
        return "BrazeManager logEvent called for: " + JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getKey());
    }

    public static final String b(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f27978m.c() + " and GDPR disabled mode: " + rVar.f27974i.a() + ". Not adding request to dispatch.";
    }

    public final void a(boolean z10) {
        this.f27985t.set(z10);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.X2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.a(this.f25694a);
            }
        }, 6, (Object) null);
    }

    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28624D, (Throwable) null, true, new InterfaceC6082a() { // from class: c5.U2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.y();
            }
        }, 2, (Object) null);
        a(new com.braze.requests.x(this.f27971f, this.f27970e.getBaseUrlForRequests(), this.f27967b, arrayList));
    }

    public static final String a(r rVar) {
        return "Updated shouldRequestTriggersInNextRequest to: " + rVar.f27985t;
    }

    public final void a(a activity) {
        AbstractC4862t.e(activity, "activity");
        if (!this.f27974i.a() && !this.f27978m.c()) {
            this.f27973h.e();
            w wVar = this.f27968c;
            String string = activity.f27837a.toString();
            AbstractC4862t.d(string, "toString(...)");
            wVar.a(string);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.A2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.c(this.f25630a);
            }
        }, 6, (Object) null);
    }

    public static final String b(Throwable th) {
        return "Not logging duplicate error: " + th;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(final com.braze.models.k r15) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.r.a(com.braze.models.k):boolean");
    }

    public static final String b(long j10) {
        return "Scheduling Push Delivery Events Flush in " + j10 + " ms";
    }

    public static final String b(String str) {
        return "Logging push delivery event for campaign id: " + str;
    }

    public final void b() {
        if (this.f27971f.M()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.V2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.r.c();
                }
            }, 6, (Object) null);
            a(new com.braze.requests.w(this.f27971f, this.f27970e.getBaseUrlForRequests(), this.f27967b));
        }
    }

    public static final String a(r rVar, com.braze.models.k kVar) {
        return "SDK delayed initialization mode: " + rVar.f27978m.c() + " and GDPR disabled mode: " + rVar.f27974i.a() + ". Not logging event: " + kVar;
    }

    public final void a(com.braze.models.outgoing.j respondWithBuilder) {
        AbstractC4862t.e(respondWithBuilder, "respondWithBuilder");
        C4034q c4034qA = this.f27971f.a();
        if (c4034qA != null) {
            com.braze.models.outgoing.i outboundConfigParams = new com.braze.models.outgoing.i(((Number) c4034qA.e()).longValue(), ((Boolean) c4034qA.f()).booleanValue());
            AbstractC4862t.e(outboundConfigParams, "outboundConfigParams");
            respondWithBuilder.f28101c = outboundConfigParams;
        }
        if (this.f27985t.get()) {
            respondWithBuilder.f28100b = Boolean.TRUE;
        }
        respondWithBuilder.f28099a = this.f27967b;
        a(new com.braze.requests.g(this.f27971f, this.f27970e.getBaseUrlForRequests(), respondWithBuilder.a()));
        this.f27985t.set(false);
    }

    public final void a(IBrazeLocation location) {
        AbstractC4862t.e(location, "location");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.c3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.v();
            }
        }, 7, (Object) null);
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f28071g.a(location);
        if (kVarA != null) {
            com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) kVarA;
            bVar.f28077e.setValue(bVar, com.braze.models.outgoing.event.b.f28072h[0], this.f27967b);
            a(new com.braze.requests.k(this.f27971f, this.f27970e.getBaseUrlForRequests(), kVarA, this.f27967b));
        }
    }

    public final void a(ArrayList ids) {
        AbstractC4862t.e(ids, "ids");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.S2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.p();
            }
        }, 7, (Object) null);
        a(new com.braze.requests.a(ids, this.f27971f, this.f27970e.getBaseUrlForRequests(), this.f27967b));
    }

    public final void a(com.braze.requests.b request) {
        AbstractC4862t.e(request, "request");
        if (!this.f27974i.a() && !this.f27978m.c()) {
            request.f28218b = this.f27967b;
            com.braze.events.e eVar = this.f27969d;
            AbstractC4862t.e(request, "request");
            ((com.braze.events.d) eVar).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.f27716d, null, null, request, 6), com.braze.events.internal.dispatchmanager.c.class);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.L2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.b(this.f25663a);
            }
        }, 6, (Object) null);
    }

    public final void a(long j10, long j11, int i10, com.braze.requests.c requestInitiatedBy) {
        AbstractC4862t.e(requestInitiatedBy, "requestInitiatedBy");
        if (!this.f27971f.E()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.W2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.r.s();
                }
            }, 6, (Object) null);
        } else {
            a(new com.braze.requests.f(this.f27971f, this.f27970e.getBaseUrlForRequests(), j10, j11, this.f27967b, i10, requestInitiatedBy));
        }
    }

    public final boolean a(Throwable th) {
        ReentrantLock reentrantLock = this.f27981p;
        reentrantLock.lock();
        try {
            this.f27979n.getAndIncrement();
            if (AbstractC4862t.a(this.f27984s, th.getMessage()) && this.f27980o.get() > 3 && this.f27979n.get() < 25) {
                reentrantLock.unlock();
                return true;
            }
            if (AbstractC4862t.a(this.f27984s, th.getMessage())) {
                this.f27980o.getAndIncrement();
            } else {
                this.f27980o.set(0);
            }
            if (this.f27979n.get() >= 25) {
                this.f27979n.set(0);
            }
            this.f27984s = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(final Throwable throwable, boolean z10) {
        com.braze.models.k kVarA;
        AbstractC4862t.e(throwable, "throwable");
        try {
            if (a(throwable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.Z2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.r.b(throwable);
                    }
                }, 6, (Object) null);
                return;
            }
            String string = throwable.toString();
            String str = f27965u[0];
            Locale US = Locale.US;
            AbstractC4862t.d(US, "US");
            String lowerCase = string.toLowerCase(US);
            AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            if (F.V(lowerCase, str, false, 2, null) || (kVarA = com.braze.models.outgoing.event.b.f28071g.a(throwable, this.f27968c.h(), z10)) == null) {
                return;
            }
            a(kVarA);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.a3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.r.g();
                }
            }, 4, (Object) null);
        }
    }

    public final void a(final long j10) {
        Object systemService = this.f27966a.getSystemService("alarm");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.f27966a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
        intent.setAction("com.braze.FLUSH_PUSH_DELIVERY");
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f27966a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        if (j10 <= 0) {
            alarmManager.cancel(broadcast);
            v0 v0Var = this.f27976k;
            v0Var.getClass();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = v0Var.f27999a;
            reentrantLock.lock();
            try {
                for (com.braze.models.push.a aVar : v0Var.f28000b) {
                    if (arrayList.size() >= 32) {
                        break;
                    } else {
                        arrayList.add(aVar);
                    }
                }
                v0Var.f28000b.removeAll(arrayList);
                reentrantLock.unlock();
                if (!arrayList.isEmpty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.d3
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.r.m();
                        }
                    }, 7, (Object) null);
                    a(new com.braze.requests.r(this.f27971f, this.f27970e.getBaseUrlForRequests(), this.f27967b, arrayList));
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.e3
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.r.n();
                        }
                    }, 7, (Object) null);
                    return;
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.f3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.b(j10);
            }
        }, 7, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j10, broadcast);
    }

    public final void a(final String campaignId) {
        AbstractC4862t.e(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.R2
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.r.b(campaignId);
            }
        }, 7, (Object) null);
        this.f27976k.a(campaignId);
    }
}
