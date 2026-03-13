package com.braze.managers;

import Rd.InterfaceC2166z0;
import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f27861i = TimeUnit.SECONDS.toMillis(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3 f27862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f27863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.communication.dust.j f27864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.requests.util.c f27865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.storage.a1 f27866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC2166z0 f27867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC2166z0 f27868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27869h;

    public g0(Context context, String str, String apiKey, b3 serverConfigStorageProvider, com.braze.events.d internalPublisher, com.braze.communication.dust.j connector, com.braze.requests.util.c backoffStateProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(connector, "connector");
        AbstractC4862t.e(backoffStateProvider, "backoffStateProvider");
        this.f27862a = serverConfigStorageProvider;
        this.f27863b = internalPublisher;
        this.f27864c = connector;
        this.f27865d = backoffStateProvider;
        this.f27866e = new com.braze.storage.a1(context, str, apiKey);
        internalPublisher.c(com.braze.events.internal.a0.class, new IEventSubscriber() { // from class: c5.n0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.g0.a(this.f25754a, (com.braze.events.internal.a0) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.b0.class, new IEventSubscriber() { // from class: c5.q0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.g0.a(this.f25765a, (com.braze.events.internal.b0) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.o.class, new IEventSubscriber() { // from class: c5.r0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.g0.a(this.f25769a, (com.braze.events.internal.o) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.h.class, new IEventSubscriber() { // from class: c5.s0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.g0.a(this.f25774a, (com.braze.events.internal.h) obj);
            }
        });
    }

    public static final String b() {
        return "Ending DUST subscription";
    }

    public static final String c() {
        return "Saving rcs value from TTL message";
    }

    public static final String d() {
        return "Cancelling ending of DUST subscription on delay and resuming stream";
    }

    public static final String e() {
        return "Ending DUST subscription on a delay";
    }

    public static final String f() {
        return "Received dust config. Starting/resuming a new subscription";
    }

    public static final String h() {
        return "Connection attempt succeeded. Resetting attempts to 0";
    }

    public static final String i() {
        return "Max reconnect attempts reached. Not starting DUST subscription.";
    }

    public final void a(com.braze.models.dust.b bVar) {
        g0 g0Var;
        if (bVar == null) {
            return;
        }
        final String str = bVar.f28040b;
        if (str != null) {
            g0Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.o0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g0.a(str);
                }
            }, 6, (Object) null);
        } else {
            g0Var = this;
        }
        ((com.braze.communication.dust.i) g0Var.f27864c).b();
        InterfaceC2166z0 interfaceC2166z0 = g0Var.f27868g;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        long j10 = bVar.f28039a;
        com.braze.requests.util.b bVar2 = (com.braze.requests.util.b) g0Var.f27865d;
        g0Var.f27868g = BrazeCoroutineScope.launchDelayed$default(brazeCoroutineScope, Long.valueOf(j10 + ((long) bVar2.a(bVar2.f28342b))), null, new b0(g0Var, null), 2, null);
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.i0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.h();
            }
        }, 7, (Object) null);
        this.f27869h = 0;
        ((com.braze.requests.util.b) this.f27865d).f28346f = 0;
    }

    public static final String b(com.braze.models.dust.g gVar) {
        return "Ingesting DUST message of type " + gVar.a() + "\n" + gVar;
    }

    public static final String c(long j10) {
        return "Scheduling stream reconnection in " + j10 + " ms";
    }

    public final void b(final long j10) {
        InterfaceC2166z0 interfaceC2166z0 = this.f27868g;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.p0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.c(j10);
            }
        }, 6, (Object) null);
        this.f27868g = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(j10), null, new c0(this, j10, null), 2, null);
    }

    public static final String b(Integer num) {
        return "Not scheduling dust reconnect for non-retriable response code: " + num;
    }

    public final void a(com.braze.models.dust.c cVar) {
        if (cVar == null) {
            return;
        }
        String str = cVar.f28043b;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.l0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g0.c();
                }
            }, 7, (Object) null);
            this.f27866e.writeData(DataStoreKey.DUST_RCS, str);
        }
        Long l10 = cVar.f28042a;
        if (l10 != null) {
            final long jLongValue = l10.longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.m0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g0.a(jLongValue);
                }
            }, 7, (Object) null);
            b(jLongValue);
        }
    }

    public static final void a(g0 g0Var, com.braze.events.internal.a0 it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.v0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.d();
            }
        }, 7, (Object) null);
        InterfaceC2166z0 interfaceC2166z0 = g0Var.f27867f;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        g0Var.a(true);
    }

    public static final void a(g0 g0Var, com.braze.events.internal.b0 it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.x0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.e();
            }
        }, 7, (Object) null);
        g0Var.f27867f = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(f27861i), null, new z(g0Var, null), 2, null);
    }

    public static final void a(g0 g0Var, final com.braze.events.internal.o it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.w0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.a(it);
            }
        }, 7, (Object) null);
        com.braze.enums.e eVar = it.f27743b;
        com.braze.enums.e eVar2 = com.braze.enums.e.f27654a;
        if (eVar == eVar2) {
            g0Var.a();
        } else if (it.f27742a == eVar2) {
            g0Var.a(true);
        }
    }

    public static final String a(com.braze.events.internal.o oVar) {
        return "Got network change event: " + oVar;
    }

    public static final void a(g0 g0Var, final com.braze.events.internal.h it) {
        AbstractC4862t.e(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.t0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.f();
            }
        }, 7, (Object) null);
        com.braze.storage.a1 a1Var = g0Var.f27866e;
        DataStoreKey dataStoreKey = DataStoreKey.MITE_KEY;
        String string = a1Var.readString(dataStoreKey, "");
        if (string == null || string.length() == 0) {
            string = null;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.u0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.a(it);
            }
        }, 7, (Object) null);
        String str = it.f27730a;
        if (str != null) {
            g0Var.f27866e.writeData(dataStoreKey, str);
        }
        String str2 = it.f27731b;
        if (str2 != null) {
            g0Var.f27866e.writeData(DataStoreKey.DUST_HOST, str2);
        }
        String str3 = it.f27732c;
        if (str3 != null) {
            g0Var.f27866e.writeData(DataStoreKey.DUST_AUTH, str3);
        }
        g0Var.a(AbstractC4862t.a(string, it.f27730a));
    }

    public static final String a(com.braze.events.internal.h hVar) {
        return "Setting dust config: mite=" + hVar.b() + ", host=" + hVar.a();
    }

    public final void a(final boolean z10) {
        InterfaceC2166z0 interfaceC2166z0 = this.f27868g;
        String str = null;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        if (this.f27869h > 10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.d0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g0.i();
                }
            }, 7, (Object) null);
            return;
        }
        final String string = this.f27866e.readString(DataStoreKey.MITE_KEY, "");
        if (string == null || string.length() == 0) {
            string = null;
        }
        final String string2 = this.f27866e.readString(DataStoreKey.DUST_HOST, "");
        if (string2 == null || string2.length() == 0) {
            string2 = null;
        }
        final String string3 = this.f27866e.readString(DataStoreKey.DUST_AUTH, "");
        if (string3 == null || string3.length() == 0) {
            string3 = null;
        }
        String string4 = this.f27866e.readString(DataStoreKey.DUST_RCS, "");
        if (string4 != null && string4.length() != 0) {
            str = string4;
        }
        if (string != null && string2 != null && string3 != null && this.f27862a.F()) {
            final String strA = a0.a(string2, string, string3, str, this.f27869h);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.e0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g0.a(z10, string, strA);
                }
            }, 7, (Object) null);
            ((com.braze.communication.dust.i) this.f27864c).a(strA, new d0(this), new e0(this), new f0(this), z10);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.f0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.a(string, string2, string3, this);
            }
        }, 7, (Object) null);
    }

    public static final String a(String str, String str2, String str3, g0 g0Var) {
        return "Cannot start dust subscription: mite=" + str + ", host=" + str2 + ", auth=" + (str3 != null) + ", enabled=" + g0Var.f27862a.F();
    }

    public static final String a(boolean z10, String str, String str2) {
        return "Starting (resume = " + z10 + ") DUST subscription for mite: " + str + " to url: " + str2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.c0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.b();
            }
        }, 7, (Object) null);
        InterfaceC2166z0 interfaceC2166z0 = this.f27868g;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        this.f27868g = null;
        ((com.braze.communication.dust.i) this.f27864c).b();
    }

    public final void a(final com.braze.models.dust.g dm) {
        AbstractC4862t.e(dm, "dm");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.j0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.b(dm);
            }
        }, 7, (Object) null);
        final com.braze.models.dust.f fVarA = dm.a();
        int iOrdinal = fVarA.ordinal();
        if (iOrdinal == 1) {
            com.braze.events.d dVar = this.f27863b;
            com.braze.requests.c cVar = com.braze.requests.c.f28227b;
            dVar.b(new com.braze.events.internal.e(), com.braze.events.internal.e.class);
            return;
        }
        if (iOrdinal == 2) {
            a(dm instanceof com.braze.models.dust.c ? (com.braze.models.dust.c) dm : null);
        } else if (iOrdinal != 3) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.k0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g0.a(fVarA);
                }
            }, 6, (Object) null);
        } else {
            a(dm instanceof com.braze.models.dust.b ? (com.braze.models.dust.b) dm : null);
        }
    }

    public static final String a(com.braze.models.dust.f fVar) {
        return "Lacked logic to ingest message! Type: " + fVar;
    }

    public static final String a(long j10) {
        return "Scheduling reconnection in " + j10 + "ms";
    }

    public static final String a(String str) {
        return "Received disconnect and retry request. Reason: " + str;
    }

    public final void a(final Integer num) {
        this.f27869h++;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.g0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.g0.a(this.f25726a, num);
            }
        }, 7, (Object) null);
        InterfaceC2166z0 interfaceC2166z0 = this.f27868g;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        Bc.f fVar = com.braze.communication.dust.i.f27559g;
        if (num != null && fVar.k(num.intValue())) {
            com.braze.requests.util.b bVar = (com.braze.requests.util.b) this.f27865d;
            b(bVar.a(bVar.f28342b));
        } else {
            Bc.f fVar2 = com.braze.communication.dust.i.f27558f;
            if (num != null) {
                fVar2.k(num.intValue());
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.h0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.g0.b(num);
                }
            }, 7, (Object) null);
        }
    }

    public static final String a(g0 g0Var, Integer num) {
        return "Connection attempt failed. Attempts now at: " + g0Var.f27869h + ". Response code: " + num;
    }
}
