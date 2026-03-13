package com.braze.events;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.internal.a0;
import com.braze.events.internal.e0;
import com.braze.events.internal.f0;
import com.braze.events.internal.g0;
import com.braze.events.internal.m;
import com.braze.events.internal.n;
import com.braze.events.internal.u;
import com.braze.events.internal.w;
import com.braze.events.internal.y;
import com.braze.events.internal.z;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.h0;
import com.braze.managers.j;
import com.braze.managers.k0;
import com.braze.managers.p;
import com.braze.managers.r;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.k;
import com.braze.models.outgoing.l;
import com.braze.requests.g;
import com.braze.requests.o;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.b3;
import com.braze.storage.n3;
import com.braze.storage.o0;
import com.braze.storage.p0;
import com.braze.storage.v0;
import com.braze.storage.w2;
import com.braze.storage.y2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.triggers.events.i;
import com.braze.triggers.managers.f;
import com.braze.triggers.managers.h;
import fc.C4015H;
import gc.C4179C;
import gc.C4205s;
import ge.C4231e;
import ge.w0;
import he.AbstractC4304b;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f27665A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f27666B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f27668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f27669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f27670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n3 f27671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v0 f27672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f27673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f27674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h0 f27675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BrazeGeofenceManager f27676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f27677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BrazeConfigurationProvider f27678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.braze.storage.p f27679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w2 f27680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b3 f27681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k0 f27682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.braze.managers.v0 f27683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f27684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f27685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f27686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e0 f27687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f27688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f27689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f27690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f27691y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f27692z;

    public a(Context applicationContext, p locationManager, e internalEventPublisher, r brazeManager, n3 userCache, v0 deviceCache, f triggerManager, h triggerReEligibilityManager, h0 eventStorageManager, BrazeGeofenceManager geofenceManager, e externalEventPublisher, BrazeConfigurationProvider configurationProvider, com.braze.storage.p contentCardsStorageProvider, w2 sdkMetadataCache, b3 serverConfigStorageProvider, k0 featureFlagsManager, com.braze.managers.v0 pushDeliveryManager, j bannersManager) {
        AbstractC4862t.e(applicationContext, "applicationContext");
        AbstractC4862t.e(locationManager, "locationManager");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(userCache, "userCache");
        AbstractC4862t.e(deviceCache, "deviceCache");
        AbstractC4862t.e(triggerManager, "triggerManager");
        AbstractC4862t.e(triggerReEligibilityManager, "triggerReEligibilityManager");
        AbstractC4862t.e(eventStorageManager, "eventStorageManager");
        AbstractC4862t.e(geofenceManager, "geofenceManager");
        AbstractC4862t.e(externalEventPublisher, "externalEventPublisher");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        AbstractC4862t.e(contentCardsStorageProvider, "contentCardsStorageProvider");
        AbstractC4862t.e(sdkMetadataCache, "sdkMetadataCache");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(featureFlagsManager, "featureFlagsManager");
        AbstractC4862t.e(pushDeliveryManager, "pushDeliveryManager");
        AbstractC4862t.e(bannersManager, "bannersManager");
        this.f27667a = applicationContext;
        this.f27668b = locationManager;
        this.f27669c = internalEventPublisher;
        this.f27670d = brazeManager;
        this.f27671e = userCache;
        this.f27672f = deviceCache;
        this.f27673g = triggerManager;
        this.f27674h = triggerReEligibilityManager;
        this.f27675i = eventStorageManager;
        this.f27676j = geofenceManager;
        this.f27677k = externalEventPublisher;
        this.f27678l = configurationProvider;
        this.f27679m = contentCardsStorageProvider;
        this.f27680n = sdkMetadataCache;
        this.f27681o = serverConfigStorageProvider;
        this.f27682p = featureFlagsManager;
        this.f27683q = pushDeliveryManager;
        this.f27684r = bannersManager;
        this.f27685s = new AtomicBoolean(false);
        this.f27686t = new AtomicBoolean(false);
        this.f27688v = new AtomicBoolean(false);
        this.f27689w = new AtomicBoolean(false);
        this.f27690x = new AtomicBoolean(false);
        this.f27691y = new AtomicBoolean(false);
        this.f27692z = new AtomicBoolean(false);
        this.f27665A = new AtomicBoolean(false);
        this.f27666B = new AtomicBoolean(false);
    }

    public static final String J() {
        return "Requesting Banners refresh on session created event due to configuration.";
    }

    public static final String K() {
        return "Banners already initialized. Not retrieving.";
    }

    public static final String M() {
        return "Requesting Content Card refresh on session created event due to configuration.";
    }

    public static final String N() {
        return "Content Cards already initialized. Not retrieving.";
    }

    public static final String P() {
        return "Starting DUST subscription due to configuration.";
    }

    public static final String Q() {
        return "DUST initial subscription already started. Not starting again.";
    }

    public static final String S() {
        return "Requesting Feature Flags refresh on session created event due to configuration.";
    }

    public static final String T() {
        return "Feature Flags already initialized. Not retrieving.";
    }

    public static final String V() {
        return "Requesting Push Max request on session created event due to configuration.";
    }

    public static final String W() {
        return "Push Max already requested for this session. Not requesting again.";
    }

    public static final String Y() {
        return "Doing Debugger Handshake.";
    }

    public static final String Z() {
        return "Debugger Initialization already attempted. Not doing Debugger initialization again.";
    }

    public static final void a(a aVar, com.braze.events.internal.a aVar2) {
        AbstractC4862t.e(aVar2, "<destruct>");
        ((d) aVar.f27677k).b(aVar.f27684r.a(aVar2.f27705a), BannersUpdatedEvent.class);
    }

    public static final String b() {
        return "Failed to request a content card refresh.";
    }

    public static final String b0() {
        return "Performing push delivery event flush";
    }

    public static final String c() {
        return "Requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String d() {
        return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String d0() {
        return "Requesting trigger refresh in next sync";
    }

    public static final String e() {
        return "Session created event for new session received.";
    }

    public static final String f() {
        return "Session start event for new session received.";
    }

    public static final String g() {
        return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
    }

    public static final String h() {
        return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
    }

    public static final String i() {
        return "Not automatically requesting Push Max on session created event due to server configuration.";
    }

    public static final String j() {
        return "Not automatically starting DUST subscription on session created event due to server configuration.";
    }

    public static final String k() {
        return "Not automatically requesting Banners refresh on session created event due to server configuration.";
    }

    public static final String l() {
        return "Not automatically starting SDK Debugger on session created event due to server configuration.";
    }

    public static final String m() {
        return "Failed to log the storage exception.";
    }

    public static final String n() {
        return "Requesting trigger update due to trigger-eligible push click event";
    }

    public static final String u() {
        return "Failed to log error.";
    }

    public final IEventSubscriber A() {
        return new IEventSubscriber() { // from class: Z4.i
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20263a, (com.braze.events.internal.y) obj);
            }
        };
    }

    public final IEventSubscriber B() {
        return new IEventSubscriber() { // from class: Z4.V
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20234a, (com.braze.events.internal.z) obj);
            }
        };
    }

    public final IEventSubscriber C() {
        return new IEventSubscriber() { // from class: Z4.d
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20249a, (com.braze.events.internal.a0) obj);
            }
        };
    }

    public final IEventSubscriber D() {
        return new IEventSubscriber() { // from class: Z4.w
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20268a, (com.braze.exceptions.b) obj);
            }
        };
    }

    public final IEventSubscriber E() {
        return new IEventSubscriber() { // from class: Z4.h
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20261a, (com.braze.events.internal.e0) obj);
            }
        };
    }

    public final IEventSubscriber F() {
        return new IEventSubscriber() { // from class: Z4.f
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20255a, (com.braze.events.internal.f0) obj);
            }
        };
    }

    public final IEventSubscriber G() {
        return new IEventSubscriber() { // from class: Z4.X
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20236a, (com.braze.events.internal.g0) obj);
            }
        };
    }

    public final IEventSubscriber H() {
        return new IEventSubscriber() { // from class: Z4.W
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20235a, (com.braze.events.internal.h0) obj);
            }
        };
    }

    public final void I() {
        if (!this.f27665A.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.N
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.K();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.M
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.J();
                }
            }, 7, (Object) null);
            this.f27684r.a();
        }
    }

    public final void L() {
        if (!this.f27689w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.y
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.N();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.x
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.a.M();
            }
        }, 7, (Object) null);
        r rVar = this.f27670d;
        com.braze.storage.p pVar = this.f27679m;
        rVar.a(pVar.f28526d, pVar.f28527e, 0, com.braze.requests.c.f28227b);
    }

    public final void O() {
        if (!this.f27692z.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.P
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.Q();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.O
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.P();
                }
            }, 7, (Object) null);
            this.f27670d.t();
        }
    }

    public final void R() {
        if (!this.f27690x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.L
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.T();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.K
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.S();
                }
            }, 7, (Object) null);
            this.f27682p.f27942d.q();
        }
    }

    public final void U() {
        if (!this.f27691y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.r
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.W();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.V();
                }
            }, 7, (Object) null);
            this.f27670d.w();
        }
    }

    public final void X() {
        if (!this.f27666B.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.S
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.Z();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.Q
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.a.Y();
            }
        }, 7, (Object) null);
        ((d) this.f27669c).b(new u(), u.class);
    }

    public final void a0() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.B
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.a.b0();
            }
        }, 7, (Object) null);
        this.f27670d.a(0L);
    }

    public final void c0() {
        a aVar;
        com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
        if (this.f27670d.f27985t.get()) {
            this.f27685s.set(true);
            aVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.d0();
                }
            }, 7, (Object) null);
            jVar.f28100b = Boolean.TRUE;
            aVar.f27670d.a(false);
        } else {
            aVar = this;
        }
        if (AbstractC4862t.a(jVar.f28100b, Boolean.TRUE)) {
            aVar.f27670d.a(jVar);
        }
    }

    public final IEventSubscriber o() {
        return new IEventSubscriber() { // from class: Z4.l
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20266a, (com.braze.events.internal.a) obj);
            }
        };
    }

    public final IEventSubscriber p() {
        return new IEventSubscriber() { // from class: Z4.T
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20232a, (com.braze.events.internal.d) obj);
            }
        };
    }

    public final IEventSubscriber q() {
        return new IEventSubscriber() { // from class: Z4.U
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20233a, (com.braze.events.internal.e) obj);
            }
        };
    }

    public final IEventSubscriber r() {
        return new IEventSubscriber() { // from class: Z4.H
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20231a, (com.braze.events.internal.f) obj);
            }
        };
    }

    public final IEventSubscriber s() {
        return new IEventSubscriber() { // from class: Z4.b
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20242a, (com.braze.events.internal.g) obj);
            }
        };
    }

    public final IEventSubscriber t() {
        final Semaphore semaphore = null;
        return new IEventSubscriber() { // from class: Z4.c
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20245a, semaphore, (Throwable) obj);
            }
        };
    }

    public final IEventSubscriber v() {
        return new IEventSubscriber() { // from class: Z4.Y
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20237a, (com.braze.events.internal.i) obj);
            }
        };
    }

    public final IEventSubscriber w() {
        return new IEventSubscriber() { // from class: Z4.g
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20259a, (com.braze.events.internal.l) obj);
            }
        };
    }

    public final IEventSubscriber x() {
        return new IEventSubscriber() { // from class: Z4.j
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20264a, (com.braze.events.internal.m) obj);
            }
        };
    }

    public final IEventSubscriber y() {
        return new IEventSubscriber() { // from class: Z4.e
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20252a, (com.braze.events.internal.n) obj);
            }
        };
    }

    public final IEventSubscriber z() {
        return new IEventSubscriber() { // from class: Z4.k
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.events.a.a(this.f20265a, (com.braze.events.internal.w) obj);
            }
        };
    }

    public static final void a(a aVar, com.braze.events.internal.f fVar) {
        e0 e0Var;
        AbstractC4862t.e(fVar, "<destruct>");
        o oVar = fVar.f27725a;
        com.braze.models.outgoing.h hVar = ((com.braze.requests.b) oVar).f28225i;
        if (hVar != null) {
            aVar.f27672f.a((Object) hVar, false);
        }
        if (oVar instanceof g) {
            g gVar = (g) oVar;
            if (gVar.f28298k.c()) {
                if (aVar.f27685s.compareAndSet(true, false)) {
                    aVar.f27673g.a((i) new com.braze.triggers.events.e());
                }
                if (aVar.f27686t.compareAndSet(true, false) && (e0Var = aVar.f27687u) != null) {
                    aVar.f27673g.a((i) new com.braze.triggers.events.g(e0Var.f27723a, e0Var.f27724b));
                    aVar.f27687u = null;
                }
                aVar.f27670d.a(true);
            }
            l lVar = gVar.f28300m;
            if (lVar != null) {
                aVar.f27671e.a((Object) lVar, false);
                if (lVar.f28105a.has(DataStoreKey.PUSH_TOKEN.getKey())) {
                    aVar.f27671e.j();
                    aVar.f27672f.e();
                }
            }
            com.braze.models.b bVar = gVar.f28301n;
            if (bVar != null) {
                for (k kVar : bVar.f28034a) {
                    e eVar = aVar.f27669c;
                    List events = C4205s.d(kVar);
                    AbstractC4862t.e(events, "events");
                    ((d) eVar).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.f27714b, events, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
                }
            }
            if (gVar.f28298k.f28104c != null) {
                aVar.f27681o.N();
            }
        }
        if (oVar instanceof com.braze.requests.r) {
            aVar.f27683q.b(((com.braze.requests.r) oVar).f28328k);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.g gVar) {
        String strB;
        AbstractC4862t.e(gVar, "<destruct>");
        o oVar = gVar.f27727a;
        com.braze.models.outgoing.h hVar = ((com.braze.requests.b) oVar).f28225i;
        if (hVar != null) {
            aVar.f27672f.a((Object) hVar, true);
        }
        if (oVar instanceof g) {
            g gVar2 = (g) oVar;
            l lVar = gVar2.f28300m;
            if (lVar != null) {
                aVar.f27671e.a((Object) lVar, true);
            }
            com.braze.models.b bVar = gVar2.f28301n;
            if (bVar != null) {
                aVar.f27675i.a(bVar.f28034a);
            }
            if (gVar2.f28298k.c()) {
                aVar.f27670d.a(false);
            }
            EnumSet sdkMetadata = gVar2.f28302o;
            if (sdkMetadata != null) {
                w2 w2Var = aVar.f27680n;
                w2Var.getClass();
                AbstractC4862t.e(sdkMetadata, "sdkMetadata");
                y2 y2Var = w2Var.f28603a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                List listV0 = C4179C.V0(com.braze.support.k.a(sdkMetadata));
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        try {
                            AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                            aVar2.d();
                            strB = aVar2.b(new C4231e(w0.f35762a), listV0);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                            strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
                        }
                        y2Var.writeData(dataStoreKey, strB);
                    } catch (Exception e11) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
                    }
                }
            }
            if (gVar2.f28298k.f28104c != null) {
                aVar.f27681o.N();
            }
        }
        if (oVar instanceof com.braze.requests.r) {
            aVar.f27683q.a(((com.braze.requests.r) oVar).f28328k);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.i iVar) {
        AbstractC4862t.e(iVar, "<destruct>");
        ((d) aVar.f27677k).b(aVar.f27682p.a(iVar.f27734a), FeatureFlagsUpdatedEvent.class);
    }

    public static final void a(a aVar, com.braze.events.internal.l lVar) {
        AbstractC4862t.e(lVar, "<destruct>");
        aVar.f27676j.registerGeofences(lVar.f27736a);
    }

    public static final void a(a aVar, m mVar) {
        AbstractC4862t.e(mVar, "<destruct>");
        com.braze.triggers.events.b bVar = mVar.f27737a;
        final com.braze.triggers.actions.h hVar = mVar.f27738b;
        IInAppMessage iInAppMessage = mVar.f27739c;
        String str = mVar.f27740d;
        synchronized (aVar.f27674h) {
            try {
                if (aVar.f27674h.a((com.braze.triggers.actions.g) hVar)) {
                    ((d) aVar.f27677k).b(new InAppMessageEvent(bVar, hVar, iInAppMessage, str), InAppMessageEvent.class);
                    aVar.f27674h.a(hVar, DateTimeUtils.nowInSeconds());
                    aVar.f27673g.b(DateTimeUtils.nowInSeconds());
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.v
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.events.a.a(hVar);
                        }
                    }, 7, (Object) null);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(a aVar, w wVar) {
        AbstractC4862t.e(wVar, "<destruct>");
        com.braze.models.response.m mVar = wVar.f27749a;
        aVar.f27676j.configureFromServerConfig(mVar);
        if (aVar.f27688v.get()) {
            if (mVar.f28168j) {
                aVar.L();
            }
            if (mVar.f28171m) {
                aVar.R();
            }
            if (mVar.f28173o) {
                aVar.U();
            }
            if (mVar.f28178t) {
                aVar.O();
            }
            if (mVar.f28157G) {
                aVar.I();
            }
            if (mVar.f28184z) {
                aVar.X();
            }
        }
    }

    public static final void a(a aVar, f0 f0Var) {
        AbstractC4862t.e(f0Var, "<destruct>");
        aVar.f27673g.a((i) f0Var.f27726a);
    }

    public static final void a(a aVar, g0 g0Var) {
        AbstractC4862t.e(g0Var, "<destruct>");
        aVar.f27673g.a(g0Var.f27728a, g0Var.f27729b);
    }

    public static final void a(a aVar, com.braze.events.internal.h0 h0Var) {
        e0 e0Var;
        AbstractC4862t.e(h0Var, "<destruct>");
        aVar.f27673g.a(h0Var.f27733a);
        if (aVar.f27685s.compareAndSet(true, false)) {
            aVar.f27673g.a((i) new com.braze.triggers.events.e());
        }
        if (!aVar.f27686t.compareAndSet(true, false) || (e0Var = aVar.f27687u) == null) {
            return;
        }
        aVar.f27673g.a((i) new com.braze.triggers.events.g(e0Var.f27723a, e0Var.f27724b));
        aVar.f27687u = null;
    }

    public static final void a(a aVar, com.braze.events.internal.d event) {
        AbstractC4862t.e(event, "event");
        if (!event.f27710a.f28168j || event.f27711b.f28168j) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.t
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.a.a();
            }
        }, 7, (Object) null);
        aVar.f27679m.a();
    }

    public static final void a(a aVar, y it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.n
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.a.e();
            }
        }, 7, (Object) null);
        aVar.f27689w.set(false);
        aVar.f27690x.set(false);
        aVar.f27691y.set(false);
        aVar.f27692z.set(false);
        aVar.f27666B.set(false);
        aVar.f27668b.f();
        k kVarA = com.braze.models.outgoing.event.b.f28071g.a(it.f27751a.f28107a);
        if (kVarA != null) {
            ((com.braze.models.outgoing.event.b) kVarA).a(it.f27751a.f28107a);
        }
        if (kVarA != null) {
            aVar.f27670d.a(kVarA);
        }
        aVar.f27670d.a(true);
        aVar.f27671e.j();
        aVar.f27672f.e();
        aVar.a0();
        if (aVar.f27678l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.o
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.c();
                }
            }, 7, (Object) null);
            BrazeInternal.requestGeofenceRefresh(aVar.f27667a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.p
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.d();
                }
            }, 7, (Object) null);
        }
        aVar.f27682p.f27943e.clearData(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP);
        aVar.f27684r.h();
        aVar.c0();
    }

    public static final void a(a aVar, a0 it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.C
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.a.f();
            }
        }, 7, (Object) null);
        aVar.f27688v.set(true);
        if (aVar.f27681o.E()) {
            aVar.L();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.D
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.g();
                }
            }, 7, (Object) null);
        }
        if (aVar.f27681o.H()) {
            aVar.R();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.E
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.h();
                }
            }, 7, (Object) null);
        }
        if (aVar.f27681o.L()) {
            aVar.U();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.F
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.i();
                }
            }, 7, (Object) null);
        }
        if (aVar.f27681o.F()) {
            aVar.O();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.G
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.j();
                }
            }, 7, (Object) null);
        }
        if (aVar.f27681o.d()) {
            aVar.I();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.I
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.k();
                }
            }, 7, (Object) null);
        }
        if (aVar.f27681o.M()) {
            aVar.X();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.J
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.l();
                }
            }, 7, (Object) null);
        }
    }

    public static final void a(a aVar, n it) {
        AbstractC4862t.e(it, "it");
        aVar.f27670d.a(true);
        aVar.c0();
    }

    public static final void a(a aVar, z message) {
        AbstractC4862t.e(message, "message");
        aVar.getClass();
        com.braze.models.p pVar = message.f27752a;
        k kVarA = com.braze.models.outgoing.event.b.f28071g.a(pVar.d());
        if (kVarA != null) {
            ((com.braze.models.outgoing.event.b) kVarA).a(pVar.f28107a);
            aVar.f27670d.a(kVarA);
        }
        Braze.INSTANCE.getInstance(aVar.f27667a).requestImmediateDataFlush();
        aVar.a0();
    }

    public static final void a(a aVar, e0 message) {
        AbstractC4862t.e(message, "message");
        aVar.f27686t.set(true);
        aVar.f27687u = message;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.s
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.a.n();
            }
        }, 6, (Object) null);
        r rVar = aVar.f27670d;
        com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
        jVar.f28100b = Boolean.TRUE;
        rVar.a(jVar);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Could not publish in-app message with trigger action id: " + ((com.braze.triggers.actions.g) aVar).c();
    }

    public static final void a(a aVar, com.braze.exceptions.b throwable) {
        AbstractC4862t.e(throwable, "storageException");
        try {
            r rVar = aVar.f27670d;
            AbstractC4862t.e(throwable, "throwable");
            rVar.a((Throwable) throwable, false);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: Z4.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.m();
                }
            }, 4, (Object) null);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.e it) {
        AbstractC4862t.e(it, "it");
        try {
            r rVar = aVar.f27670d;
            com.braze.storage.p pVar = aVar.f27679m;
            long j10 = pVar.f28526d;
            long j11 = pVar.f28527e;
            it.getClass();
            rVar.a(j10, j11, 0, com.braze.requests.c.f28228c);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: Z4.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.a.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Content cards have moved to disabled. Clearing content card data.";
    }

    public final void a(final d eventMessenger) {
        AbstractC4862t.e(eventMessenger, "eventMessenger");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.a.a(eventMessenger);
            }
        }, 7, (Object) null);
        eventMessenger.c(com.braze.events.internal.f.class, r());
        eventMessenger.c(com.braze.events.internal.g.class, s());
        eventMessenger.c(y.class, A());
        eventMessenger.c(a0.class, C());
        eventMessenger.c(z.class, B());
        eventMessenger.c(e0.class, E());
        eventMessenger.c(w.class, z());
        eventMessenger.c(Throwable.class, t());
        eventMessenger.c(com.braze.exceptions.b.class, D());
        eventMessenger.c(com.braze.events.internal.h0.class, H());
        eventMessenger.c(n.class, y());
        eventMessenger.c(com.braze.events.internal.l.class, w());
        eventMessenger.c(com.braze.events.internal.i.class, v());
        eventMessenger.c(com.braze.events.internal.a.class, o());
        eventMessenger.c(f0.class, F());
        eventMessenger.c(m.class, x());
        eventMessenger.c(g0.class, G());
        eventMessenger.c(com.braze.events.internal.e.class, q());
        eventMessenger.c(com.braze.events.internal.d.class, p());
    }

    public static final String a(e eVar) {
        return "Subscribing to events with " + eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.braze.events.a r8, java.util.concurrent.Semaphore r9, java.lang.Throwable r10) {
        /*
            if (r10 == 0) goto L2d
            com.braze.managers.r r0 = r8.f27670d     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r1 = "throwable"
            kotlin.jvm.internal.AbstractC4862t.e(r10, r1)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r1 = 1
            r0.a(r10, r1)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            goto L2d
        Le:
            r0 = move-exception
            r8 = r0
            goto L27
        L11:
            r0 = move-exception
            r10 = r0
            r3 = r10
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> Le
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f28625E     // Catch: java.lang.Throwable -> Le
            Z4.z r5 = new Z4.z     // Catch: java.lang.Throwable -> Le
            r5.<init>()     // Catch: java.lang.Throwable -> Le
            r6 = 4
            r7 = 0
            r4 = 0
            r1 = r8
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Le
            if (r9 == 0) goto L32
            goto L2f
        L27:
            if (r9 == 0) goto L2c
            r9.release()
        L2c:
            throw r8
        L2d:
            if (r9 == 0) goto L32
        L2f:
            r9.release()
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.events.a.a(com.braze.events.a, java.util.concurrent.Semaphore, java.lang.Throwable):void");
    }
}
