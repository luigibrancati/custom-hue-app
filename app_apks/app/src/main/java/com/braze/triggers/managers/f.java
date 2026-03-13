package com.braze.triggers.managers;

import Od.F;
import Od.v;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.internal.c0;
import com.braze.managers.r;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h0;
import com.braze.storage.i0;
import com.braze.storage.m3;
import com.braze.storage.o0;
import com.braze.storage.p0;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.i;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import ge.C4231e;
import ge.w0;
import he.AbstractC4304b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f28736p = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f28737q = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f28739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f28740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f28741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3 f28743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f28744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f28745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Queue f28746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f28747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f28748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f28749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ReentrantLock f28750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ReentrantLock f28751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.braze.requests.framework.g f28752o;

    public f(Context context, r brazeManager, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, BrazeConfigurationProvider configurationProvider, String str, String apiKey, com.braze.requests.framework.g requestFramework) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(externalEventPublisher, "externalEventPublisher");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(requestFramework, "requestFramework");
        this.f28750m = new ReentrantLock();
        this.f28751n = new ReentrantLock();
        this.f28738a = context.getApplicationContext();
        this.f28739b = brazeManager;
        this.f28740c = internalEventPublisher;
        AbstractC4862t.e(externalEventPublisher, "<set-?>");
        this.f28741d = externalEventPublisher;
        this.f28742e = configurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        m3 m3Var = new m3(context, str, apiKey);
        AbstractC4862t.e(m3Var, "<set-?>");
        this.f28743f = m3Var;
        this.f28744g = new b(context, apiKey);
        this.f28745h = new h(m3Var);
        this.f28747j = g();
        this.f28746i = new ArrayDeque();
        this.f28752o = requestFramework;
        l();
    }

    public static final String a(long j10) {
        return "TriggerManager lastDisplayTimeSeconds updated to " + j10;
    }

    public static final String c(List list) {
        return "Successfully saved " + list.size() + " triggered actions to DataStore";
    }

    public static final String d(com.braze.triggers.actions.a aVar) {
        return "Registering triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + StringUtils.SPACE;
    }

    public static final String e() {
        return "Test triggered actions found, triggering test event.";
    }

    public static final String f() {
        return "No test triggered actions found.";
    }

    public static final String g(com.braze.triggers.actions.a aVar) {
        return "Fallback trigger has expired. Trigger id: " + ((com.braze.triggers.actions.g) aVar).c();
    }

    public static final String h() {
        return "No triggered actions found in DataStore";
    }

    public static final String i() {
        return "Skipping blank triggered action string from DataStore";
    }

    public static final String j() {
        return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
    }

    public static final String k() {
        return "Triggered action has no fallback action to perform. Doing nothing.";
    }

    public static final String m() {
        return "Subscribing to trigger dispatch events.";
    }

    public static final String n() {
        return "Executing pending events after trigger dispatch completed.";
    }

    public final void b(final long j10) {
        this.f28748k = this.f28749l;
        this.f28749l = j10;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.O
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.a(j10);
            }
        }, 7, (Object) null);
    }

    public final void l() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.K
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.m();
            }
        }, 6, (Object) null);
        com.braze.events.e eVar = this.f28740c;
        ((com.braze.events.d) eVar).c(c0.class, new IEventSubscriber() { // from class: w5.L
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.triggers.managers.f.a(this.f46245a, (com.braze.events.internal.c0) obj);
            }
        });
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return "Trigger manager received reenqueue with action with id: <" + ((com.braze.triggers.actions.g) aVar).c() + ">.";
    }

    public static final String d() {
        return "Trigger request is in-flight. Not processing trigger event.";
    }

    public static final String e(com.braze.triggers.events.b bVar) {
        return "Failed to match triggered action for incoming <" + bVar.a() + ">.";
    }

    public static final String f(com.braze.triggers.actions.a aVar) {
        return "Trigger manager received failed triggered action with id: <" + ((com.braze.triggers.actions.g) aVar).c() + ">. Will attempt to perform fallback triggered actions, if present.";
    }

    public final void a(final List triggeredActions) {
        String strB;
        AbstractC4862t.e(triggeredActions, "triggeredActions");
        com.braze.triggers.events.h hVar = new com.braze.triggers.events.h();
        ReentrantLock reentrantLock = this.f28750m;
        reentrantLock.lock();
        try {
            this.f28747j.clear();
            m3 m3Var = this.f28743f;
            m3 m3Var2 = null;
            if (m3Var == null) {
                AbstractC4862t.p("triggerDataStoreProvider");
                m3Var = null;
            }
            m3Var.clearData(DataStoreKey.TRIGGERED_ACTIONS);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.P
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.b(triggeredActions);
                }
            }, 7, (Object) null);
            Iterator it = triggeredActions.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.Q
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.d(aVar);
                    }
                }, 7, (Object) null);
                this.f28747j.put(((com.braze.triggers.actions.g) aVar).f28669a, aVar);
                if (((com.braze.triggers.actions.g) aVar).b(hVar)) {
                    z10 = true;
                }
            }
            ArrayList arrayList = new ArrayList(C4207u.v(triggeredActions, 10));
            Iterator it2 = triggeredActions.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((com.braze.triggers.actions.a) it2.next()).getKey()));
            }
            m3 m3Var3 = this.f28743f;
            if (m3Var3 != null) {
                m3Var2 = m3Var3;
            } else {
                AbstractC4862t.p("triggerDataStoreProvider");
            }
            DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                        aVar2.d();
                        strB = aVar2.b(new C4231e(w0.f35762a), arrayList);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) i.f28638a, 4, (Object) null);
                        strB = arrayList instanceof Map ? "{}" : "[]";
                    }
                    m3Var2.writeData(dataStoreKey, strB);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.T
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.c(triggeredActions);
                }
            }, 7, (Object) null);
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            this.f28745h.a(triggeredActions);
            this.f28744g.a(triggeredActions);
            if (!z10) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.V
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.f();
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.U
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.e();
                    }
                }, 6, (Object) null);
                a((com.braze.triggers.events.i) hVar);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final LinkedHashMap g() {
        List arrayList;
        List listK;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        m3 m3Var = this.f28743f;
        if (m3Var == null) {
            AbstractC4862t.p("triggerDataStoreProvider");
            m3Var = null;
        }
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = m3Var.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        listK = C4206t.k();
                    } else {
                        try {
                            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                            aVar.d();
                            listK = (List) aVar.a(new C4231e(w0.f35762a), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                            listK = C4206t.k();
                        }
                    }
                    arrayList = C4179C.X0(listK);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        final List<String> list = arrayList;
        if (list.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.g0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.h();
                }
            }, 7, (Object) null);
            return linkedHashMap;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.h0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.d(list);
            }
        }, 7, (Object) null);
        for (final String str2 : list) {
            if (F.k0(str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.i0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.i();
                    }
                }, 7, (Object) null);
            } else {
                try {
                    final com.braze.triggers.actions.h hVarB = com.braze.triggers.utils.c.f28761a.b(new JSONObject(str2), this.f28739b);
                    if (hVarB != null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.H
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return com.braze.triggers.managers.f.e(hVarB);
                            }
                        }, 7, (Object) null);
                        linkedHashMap.put(hVarB.f28669a, hVarB);
                        C4015H c4015h = C4015H.f34254a;
                    }
                } catch (Exception e12) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e12, false, new InterfaceC6082a() { // from class: w5.I
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.triggers.managers.f.a(str2);
                        }
                    }, 4, (Object) null);
                    C4015H c4015h2 = C4015H.f34254a;
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.J
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.a(linkedHashMap);
            }
        }, 7, (Object) null);
        return linkedHashMap;
    }

    public static final String c(com.braze.triggers.events.b bVar) {
        return "No action found for " + bVar.a() + " event, publishing NoMatchingTriggerEvent";
    }

    public static final String e(com.braze.triggers.actions.a aVar) {
        return "Retrieving templated triggered action id " + ((com.braze.triggers.actions.g) aVar).c() + " from DataStore.";
    }

    public final com.braze.triggers.actions.a d(com.braze.triggers.events.b bVar) {
        com.braze.triggers.events.b bVar2;
        com.braze.triggers.events.b event = bVar;
        AbstractC4862t.e(event, "event");
        ReentrantLock reentrantLock = this.f28750m;
        reentrantLock.lock();
        try {
            final L l10 = new L();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f28747j.values().iterator();
            int i10 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                final com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) it.next());
                if (gVar.b(event) && this.f28745h.a(gVar)) {
                    bVar2 = event;
                    if (f28736p.a(event, gVar, this.f28749l, this.f28742e)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.Y
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return com.braze.triggers.managers.f.a(gVar);
                            }
                        }, 7, (Object) null);
                        int i11 = gVar.f28670b.f28696c;
                        if (i11 > i10) {
                            l10.f39776a = gVar;
                            i10 = i11;
                        }
                        arrayList.add(gVar);
                    }
                } else {
                    bVar2 = event;
                }
                event = bVar2;
            }
            final com.braze.triggers.events.b bVar3 = event;
            Object obj = l10.f39776a;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.Z
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.e(bVar3);
                    }
                }, 7, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) l10.f39776a)).f28672d = new com.braze.triggers.utils.b(arrayList);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.a0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.a(bVar3, l10);
                }
            }, 7, (Object) null);
            com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) l10.f39776a;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(List list) {
        return "Registering " + list.size() + " new triggered actions.";
    }

    public static final String c() {
        return "In flight trigger requests is empty. Executing any pending trigger events.";
    }

    public final void b(final com.braze.triggers.actions.a action) {
        AbstractC4862t.e(action, "action");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.e0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.c(action);
            }
        }, 7, (Object) null);
        b(this.f28748k);
        this.f28748k = 0L;
        this.f28745h.d(action);
    }

    public static final String b(com.braze.triggers.events.b bVar) {
        return "New incoming <" + bVar.a() + ">. Searching for matching triggers.";
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f28751n;
        reentrantLock.lock();
        try {
            if (a()) {
                reentrantLock.unlock();
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.N
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.c();
                }
            }, 7, (Object) null);
            while (!((ArrayDeque) this.f28746i).isEmpty()) {
                com.braze.triggers.events.b bVar = (com.braze.triggers.events.b) ((ArrayDeque) this.f28746i).poll();
                if (bVar != null) {
                    a(bVar);
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d(List list) {
        return "Retrieved " + list.size() + " triggered actions from DataStore";
    }

    public final void a(com.braze.triggers.events.i triggerEvent) {
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        ReentrantLock reentrantLock = this.f28751n;
        reentrantLock.lock();
        try {
            ((ArrayDeque) this.f28746i).add(triggerEvent);
            if (!a()) {
                b();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.f0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.f.d();
                    }
                }, 7, (Object) null);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a(com.braze.triggers.events.b triggerEvent, final com.braze.triggers.actions.a failedAction) {
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        AbstractC4862t.e(failedAction, "failedAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.G
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.f(failedAction);
            }
        }, 7, (Object) null);
        com.braze.triggers.utils.b bVar = ((com.braze.triggers.actions.g) failedAction).f28672d;
        if (bVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.S
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.j();
                }
            }, 7, (Object) null);
            return;
        }
        final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) bVar.f28760a.poll();
        if (aVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.b0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.k();
                }
            }, 7, (Object) null);
            return;
        }
        com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) aVar;
        gVar.f28672d = bVar;
        Map remoteAssetToLocalAssetPaths = this.f28744g.a(aVar);
        AbstractC4862t.e(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
        ((com.braze.triggers.actions.h) aVar).f28674f = new HashMap(remoteAssetToLocalAssetPaths);
        long j10 = ((com.braze.triggers.events.i) triggerEvent).f28719b;
        long j11 = gVar.f28670b.f28698e;
        long millis = TimeUnit.SECONDS.toMillis(r1.f28697d);
        long j12 = j11 != -1 ? j11 + j10 : j10 + millis + f28737q;
        if (j12 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.c0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.g(aVar);
                }
            }, 7, (Object) null);
            a(triggerEvent, aVar);
        } else {
            final long jMax = Math.max(0L, (millis + j10) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.d0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.f.a(aVar, jMax);
                }
            }, 7, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(jMax), null, new e(aVar, this, triggerEvent, j12, null), 2, null);
        }
    }

    public static final String a(com.braze.triggers.actions.a aVar, long j10) {
        return "Performing fallback triggered action with id: <" + ((com.braze.triggers.actions.g) aVar).c() + "> with a delay: " + j10 + " ms";
    }

    public static final void a(f fVar, c0 it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) fVar, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.M
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.n();
            }
        }, 6, (Object) null);
        fVar.b();
    }

    public final void a(final com.braze.triggers.events.b event) {
        AbstractC4862t.e(event, "triggerEvent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.W
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.b(event);
            }
        }, 7, (Object) null);
        com.braze.triggers.actions.a action = d(event);
        if (action != null) {
            AbstractC4862t.e(event, "event");
            AbstractC4862t.e(action, "action");
            Map remoteAssetToLocalAssetPaths = this.f28744g.a(action);
            AbstractC4862t.e(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
            ((com.braze.triggers.actions.h) action).f28674f = new HashMap(remoteAssetToLocalAssetPaths);
            int i10 = ((com.braze.triggers.actions.g) action).f28670b.f28698e;
            long j10 = i10 != -1 ? ((com.braze.triggers.events.i) event).f28719b + ((long) i10) : -1L;
            long millis = TimeUnit.SECONDS.toMillis(r0.f28697d);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new d(this, action, event, j10, millis, null), 2, null);
            return;
        }
        String strA = event.a();
        int iHashCode = strA.hashCode();
        if (iHashCode != 3417674) {
            if (iHashCode != 717572172) {
                if (iHashCode != 1743324417 || !strA.equals("purchase")) {
                    return;
                }
            } else if (!strA.equals("custom_event")) {
                return;
            }
        } else if (!strA.equals("open")) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.X
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.f.c(event);
            }
        }, 7, (Object) null);
        com.braze.events.e eVar = this.f28741d;
        if (eVar == null) {
            AbstractC4862t.p("externalEventMessenger");
            eVar = null;
        }
        String strA2 = event.a();
        AbstractC4862t.d(strA2, "getTriggerEventType(...)");
        ((com.braze.events.d) eVar).b(new NoMatchingTriggerEvent(strA2), NoMatchingTriggerEvent.class);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Found potential triggered action for incoming trigger event. Action id " + ((com.braze.triggers.actions.g) aVar).c() + ".";
    }

    public static final String a(com.braze.triggers.events.b bVar, L l10) {
        String prettyPrintedString;
        com.braze.triggers.events.i iVar = (com.braze.triggers.events.i) bVar;
        if (iVar.b() != null) {
            prettyPrintedString = JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) iVar.b()).getKey());
        } else {
            prettyPrintedString = "";
        }
        return v.n("\n     Found best triggered action for incoming trigger event " + prettyPrintedString + ".\n     Matched Action id: " + ((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) l10.f39776a)).c() + ".\n                ");
    }

    public static final String a(String str) {
        return "Failed to parse triggered action JSON:'" + str + "' from DataStore.";
    }

    public static final String a(Map map) {
        return "Successfully loaded " + map.size() + " triggered actions from DataStore";
    }

    public final boolean a() {
        com.braze.requests.framework.b bVar = (com.braze.requests.framework.b) this.f28752o.f28271e.get(n.f28316f);
        if (bVar == null || !(bVar instanceof com.braze.requests.framework.queue.c)) {
            return false;
        }
        ArrayList<com.braze.requests.framework.h> arrayList = ((com.braze.requests.framework.queue.c) bVar).f28253e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (com.braze.requests.framework.h hVar : arrayList) {
            o oVar = hVar.f28280a;
            if ((oVar instanceof com.braze.requests.g) && ((com.braze.requests.g) oVar).f28298k.c() && hVar.f28283d == com.braze.requests.framework.i.f28290c) {
                return true;
            }
        }
        return false;
    }
}
