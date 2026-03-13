package com.braze.dispatch;

import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.d;
import com.braze.events.internal.a0;
import com.braze.events.internal.b0;
import com.braze.events.internal.o;
import com.braze.support.BrazeLogger;
import com.braze.support.c;
import fc.C4032o;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f27599m = BrazeLogger.getBrazeLogTag((Class<?>) f.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f27601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f27602c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f27603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.braze.enums.f f27604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f27605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f27606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConnectivityManager f27607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.braze.enums.e f27608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC2166z0 f27609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27610l;

    public f(Context context, d internalEventPublisher, a dataSyncConfigurationProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(dataSyncConfigurationProvider, "dataSyncConfigurationProvider");
        this.f27600a = context;
        this.f27601b = internalEventPublisher;
        this.f27602c = dataSyncConfigurationProvider;
        this.f27604f = com.braze.enums.f.f27660b;
        this.f27605g = -1L;
        Object systemService = context.getSystemService("connectivity");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f27607i = (ConnectivityManager) systemService;
        this.f27608j = com.braze.enums.e.f27656c;
        this.f27603e = new b(this);
        a(internalEventPublisher);
    }

    public static final String d() {
        return "The data sync policy is already running. Ignoring request.";
    }

    public static final String e() {
        return "Data sync started";
    }

    public static final String g() {
        return "The data sync policy is not running. Ignoring request.";
    }

    public static final String h() {
        return "Data sync stopped";
    }

    public static final String j() {
        return "Failed to unregister Connectivity callback";
    }

    public final InterfaceC2166z0 a(final long j10) {
        if (this.f27605g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.dispatch.f.a(j10, this);
                }
            }, 6, (Object) null);
            return AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new e(this, j10, null), 3, null);
        }
        Braze.INSTANCE.getInstance(this.f27600a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.dispatch.f.a(this.f18107a);
            }
        }, 7, (Object) null);
        return null;
    }

    public final void b(final long j10) {
        InterfaceC2166z0 interfaceC2166z0 = this.f27609k;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        this.f27609k = null;
        if (this.f27605g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.dispatch.f.c(j10);
                }
            }, 7, (Object) null);
            this.f27609k = a(j10);
        }
    }

    public final synchronized void c() {
        if (this.f27606h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.dispatch.f.d();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.o
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.dispatch.f.e();
            }
        }, 7, (Object) null);
        ConnectivityManager connectivityManager = this.f27607i;
        b bVar = this.f27603e;
        if (bVar == null) {
            AbstractC4862t.p("connectivityNetworkCallback");
            bVar = null;
        }
        connectivityManager.registerDefaultNetworkCallback(bVar);
        a(this.f27607i.getNetworkCapabilities(this.f27607i.getActiveNetwork()));
        b(this.f27605g);
        this.f27606h = true;
    }

    public final synchronized void f() {
        if (!this.f27606h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.dispatch.f.g();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.dispatch.f.h();
            }
        }, 7, (Object) null);
        InterfaceC2166z0 interfaceC2166z0 = this.f27609k;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        this.f27609k = null;
        i();
        this.f27606h = false;
    }

    public final void i() {
        try {
            ConnectivityManager connectivityManager = this.f27607i;
            b bVar = this.f27603e;
            if (bVar == null) {
                AbstractC4862t.p("connectivityNetworkCallback");
                bVar = null;
            }
            connectivityManager.unregisterNetworkCallback(bVar);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: X4.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.dispatch.f.j();
                }
            }, 4, (Object) null);
        }
    }

    public static final String d(f fVar) {
        return "Flush interval was too low (" + fVar.f27605g + "), moving to minimum of 1000 ms";
    }

    public static final String a(long j10, f fVar) {
        return "Kicking off the Sync Job. initialDelaysMs: " + j10 + ": currentIntervalMs " + fVar.f27605g + " ms";
    }

    public final void b() {
        long j10;
        int intValue;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.dispatch.f.c(this.f18103a);
            }
        }, 6, (Object) null);
        final long j11 = this.f27605g;
        if (this.f27604f != com.braze.enums.f.f27660b && !this.f27610l) {
            int iOrdinal = this.f27608j.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    a aVar = this.f27602c;
                    aVar.getClass();
                    com.braze.configuration.b bVar = com.braze.configuration.b.f27567b;
                    intValue = aVar.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                } else if (iOrdinal == 2) {
                    a aVar2 = this.f27602c;
                    aVar2.getClass();
                    com.braze.configuration.b bVar2 = com.braze.configuration.b.f27567b;
                    intValue = aVar2.getIntValue("com_braze_data_flush_interval_good_network", 30);
                } else if (iOrdinal == 3) {
                    a aVar3 = this.f27602c;
                    aVar3.getClass();
                    com.braze.configuration.b bVar3 = com.braze.configuration.b.f27567b;
                    intValue = aVar3.getIntValue("com_braze_data_flush_interval_great_network", 10);
                } else {
                    throw new C4032o();
                }
                j10 = ((long) intValue) * 1000;
            } else {
                j10 = -1;
            }
            this.f27605g = j10;
            if (j10 != -1 && j10 < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.g
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.dispatch.f.d(this.f18108a);
                    }
                }, 6, (Object) null);
                this.f27605g = 1000L;
            }
        } else {
            this.f27605g = -1L;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.dispatch.f.b(this.f18109a);
            }
        }, 6, (Object) null);
        if (j11 != this.f27605g) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.dispatch.f.b(j11, this);
                }
            }, 7, (Object) null);
            b(this.f27605g);
        }
    }

    public static final String a(f fVar) {
        return "Data flush interval is " + fVar.f27605g + " ms. Not scheduling a proceeding data flush.";
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        com.braze.enums.e eVar = this.f27608j;
        com.braze.enums.e eVarA = c.a(networkCapabilities);
        this.f27608j = eVarA;
        if (eVar != eVarA) {
            this.f27601b.b(new o(eVar, eVarA), o.class);
        }
        b();
    }

    public static final String c(long j10) {
        return "Posting new sync runnable with delay " + j10 + " ms";
    }

    public static final String c(f fVar) {
        return "recalculateDispatchState called with session state: " + fVar.f27604f + " lastNetworkLevel: " + fVar.f27608j;
    }

    public final void a(d eventManager) {
        AbstractC4862t.e(eventManager, "eventManager");
        eventManager.c(a0.class, new IEventSubscriber() { // from class: X4.l
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.dispatch.f.a(this.f18112a, (a0) obj);
            }
        });
        eventManager.c(b0.class, new IEventSubscriber() { // from class: X4.m
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.dispatch.f.a(this.f18113a, (b0) obj);
            }
        });
    }

    public static final void a(f fVar, a0 it) {
        AbstractC4862t.e(it, "it");
        fVar.f27604f = com.braze.enums.f.f27659a;
        fVar.b();
    }

    public static final void a(f fVar, b0 it) {
        AbstractC4862t.e(it, "it");
        fVar.f27604f = com.braze.enums.f.f27660b;
        fVar.b();
    }

    public static final String b(f fVar) {
        return "currentIntervalMs: " + fVar.f27605g;
    }

    public static final String b(long j10, f fVar) {
        return "Data flush interval has changed from " + j10 + " ms to " + fVar.f27605g + " ms after connectivity state change to: " + fVar.f27608j + " and session state: " + fVar.f27604f;
    }
}
