package com.braze.managers;

import Rd.AbstractC2132i;
import Rd.D0;
import Rd.InterfaceC2166z0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.storage.k1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import fc.C4015H;
import gc.C4179C;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f28002n = BrazeLogger.getBrazeLogTag((Class<?>) w.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f28003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f28004p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f28006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.events.d f28007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f28008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AlarmManager f28009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f28011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f28012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f28013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f28014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC2166z0 f28015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.braze.models.n f28016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f28017m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f28003o = timeUnit.toMillis(10L);
        f28004p = timeUnit.toMillis(10L);
    }

    public w(Context applicationContext, k1 sessionStorageManager, com.braze.events.d internalEventPublisher, com.braze.events.e externalEventPublisher, AlarmManager alarmManager, int i10, boolean z10) {
        AbstractC4862t.e(applicationContext, "applicationContext");
        AbstractC4862t.e(sessionStorageManager, "sessionStorageManager");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(externalEventPublisher, "externalEventPublisher");
        AbstractC4862t.e(alarmManager, "alarmManager");
        this.f28005a = applicationContext;
        this.f28006b = sessionStorageManager;
        this.f28007c = internalEventPublisher;
        this.f28008d = externalEventPublisher;
        this.f28009e = alarmManager;
        this.f28010f = i10;
        this.f28011g = z10;
        this.f28012h = new ReentrantLock();
        this.f28015k = D0.b(null, 1, null);
        this.f28017m = new LinkedHashMap();
        u uVar = new u(this);
        this.f28014j = uVar;
        String str = applicationContext.getPackageName() + ".intent.BRAZE_SESSION_SHOULD_SEAL";
        this.f28013i = str;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationContext.registerReceiver(uVar, new IntentFilter(str), 2);
            } else {
                applicationContext.registerReceiver(uVar, new IntentFilter(str));
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.u3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.a(this.f25784a);
                }
            }, 4, (Object) null);
            this.f28014j = null;
        }
    }

    public static final String a(w wVar) {
        return "Failed to register dynamic receiver for " + wVar.f28013i;
    }

    public static final String b(String str) {
        return "Attempting to close session with context: " + str;
    }

    public static final String d(String str) {
        return "Attempting to open session with context: " + str;
    }

    public static final String e(w wVar) {
        return "Completed the stopSession call. Current session: " + wVar.h();
    }

    public static final String f(com.braze.models.n nVar) {
        return "Closed session with id " + nVar.f();
    }

    public static final String k() {
        return "Getting the stored open session";
    }

    public static final String n() {
        return "Failed to unregister session seal receiver.";
    }

    public static final String q() {
        return "At least one session context is open. Calling startSession.";
    }

    public static final String r() {
        return "No session contexts are open. Calling stopSession.";
    }

    public final void c(final String str) {
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.L3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.d(str);
                }
            }, 6, (Object) null);
            a(str, true);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.M3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.a();
                }
            }, 6, (Object) null);
            a("$/! global session context sentinel", true);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.N3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.w.c(this.f25670a);
            }
        }, 6, (Object) null);
    }

    public final boolean g() {
        ReentrantLock reentrantLock = this.f28012h;
        reentrantLock.lock();
        try {
            j();
            final com.braze.models.n nVar = this.f28016l;
            boolean z10 = true;
            if (nVar == null || nVar.f28110d) {
                i();
                if (nVar != null && nVar.f28110d) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.H3
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.w.a(nVar);
                        }
                    }, 7, (Object) null);
                    this.f28006b.a(nVar.f28107a.f28112b);
                }
            } else if (nVar.f28109c != null) {
                nVar.f28109c = null;
            } else {
                z10 = false;
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final com.braze.models.q h() {
        ReentrantLock reentrantLock = this.f28012h;
        reentrantLock.lock();
        try {
            j();
            com.braze.models.n nVar = this.f28016l;
            return nVar != null ? nVar.f28107a : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i() {
        final com.braze.models.n nVar = new com.braze.models.n();
        this.f28016l = nVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.I3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.w.b(nVar);
            }
        }, 6, (Object) null);
        this.f28007c.b(new com.braze.events.internal.y(nVar), com.braze.events.internal.y.class);
        ((com.braze.events.d) this.f28008d).b(new SessionStateChangedEvent(nVar.f28107a.f28112b, SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:3:0x0007, B:5:0x000c, B:7:0x0023, B:11:0x0037, B:12:0x0039, B:14:0x003d, B:16:0x0050, B:18:0x0054, B:20:0x006b, B:25:0x0083, B:27:0x009a, B:29:0x009e, B:23:0x0079, B:30:0x00a7), top: B:35:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r16 = this;
            r1 = r16
            java.util.concurrent.locks.ReentrantLock r8 = r1.f28012h
            r8.lock()
            com.braze.models.n r0 = r1.f28016l     // Catch: java.lang.Throwable -> L33
            r9 = 0
            if (r0 != 0) goto L39
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L33
            c5.O3 r5 = new c5.O3     // Catch: java.lang.Throwable -> L33
            r5.<init>()     // Catch: java.lang.Throwable -> L33
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
            com.braze.storage.k1 r0 = r1.f28006b     // Catch: java.lang.Throwable -> L33
            com.braze.models.p r0 = r0.c()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L36
            com.braze.models.n r2 = new com.braze.models.n     // Catch: java.lang.Throwable -> L33
            com.braze.models.q r3 = r0.f28107a     // Catch: java.lang.Throwable -> L33
            double r4 = r0.f28108b     // Catch: java.lang.Throwable -> L33
            java.lang.Double r6 = r0.e()     // Catch: java.lang.Throwable -> L33
            boolean r7 = r0.f28110d     // Catch: java.lang.Throwable -> L33
            r2.<init>(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            goto Lad
        L36:
            r2 = r9
        L37:
            r1.f28016l = r2     // Catch: java.lang.Throwable -> L33
        L39:
            com.braze.models.n r10 = r1.f28016l     // Catch: java.lang.Throwable -> L33
            if (r10 == 0) goto La9
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L33
            c5.P3 r5 = new c5.P3     // Catch: java.lang.Throwable -> L33
            r5.<init>()     // Catch: java.lang.Throwable -> L33
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
            java.lang.Double r2 = r10.f28109c     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto La7
            boolean r3 = r10.f28110d     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto La7
            double r3 = r10.f28108b     // Catch: java.lang.Throwable -> L33
            double r5 = r2.doubleValue()     // Catch: java.lang.Throwable -> L33
            int r2 = r1.f28010f     // Catch: java.lang.Throwable -> L33
            boolean r7 = r1.f28011g     // Catch: java.lang.Throwable -> L33
            long r11 = com.braze.support.DateTimeUtils.nowInMilliseconds()     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L33
            long r14 = (long) r2     // Catch: java.lang.Throwable -> L33
            long r14 = r13.toMillis(r14)     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L79
            long r2 = (long) r3     // Catch: java.lang.Throwable -> L33
            long r2 = r13.toMillis(r2)     // Catch: java.lang.Throwable -> L33
            long r2 = r2 + r14
            long r4 = com.braze.managers.w.f28004p     // Catch: java.lang.Throwable -> L33
            long r2 = r2 + r4
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto La7
            goto L83
        L79:
            long r2 = (long) r5     // Catch: java.lang.Throwable -> L33
            long r2 = r13.toMillis(r2)     // Catch: java.lang.Throwable -> L33
            long r2 = r2 + r14
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto La7
        L83:
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f28626I     // Catch: java.lang.Throwable -> L33
            c5.Q3 r5 = new c5.Q3     // Catch: java.lang.Throwable -> L33
            r5.<init>()     // Catch: java.lang.Throwable -> L33
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
            r1.l()     // Catch: java.lang.Throwable -> L33
            com.braze.storage.k1 r0 = r1.f28006b     // Catch: java.lang.Throwable -> L33
            com.braze.models.n r2 = r1.f28016l     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L9d
            com.braze.models.q r2 = r2.f28107a     // Catch: java.lang.Throwable -> L33
            goto L9e
        L9d:
            r2 = r9
        L9e:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            r0.a(r2)     // Catch: java.lang.Throwable -> L33
            r1.f28016l = r9     // Catch: java.lang.Throwable -> L33
        La7:
            fc.H r0 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L33
        La9:
            r8.unlock()
            return
        Lad:
            r8.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.w.j():void");
    }

    public final void l() {
        final com.braze.models.n nVar = this.f28016l;
        if (nVar != null) {
            ReentrantLock reentrantLock = this.f28012h;
            reentrantLock.lock();
            try {
                nVar.f28110d = true;
                nVar.f28109c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f28006b.a(nVar);
                this.f28007c.b(new com.braze.events.internal.z(nVar), com.braze.events.internal.z.class);
                ((com.braze.events.d) this.f28008d).b(new SessionStateChangedEvent(nVar.f28107a.f28112b, SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.v3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.w.e(nVar);
                    }
                }, 6, (Object) null);
                C4015H c4015h = C4015H.f34254a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void m() {
        try {
            u uVar = this.f28014j;
            if (uVar != null) {
                this.f28005a.unregisterReceiver(uVar);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.K3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.n();
                }
            }, 4, (Object) null);
        }
    }

    public final void o() {
        com.braze.models.n nVar;
        ReentrantLock reentrantLock = this.f28012h;
        reentrantLock.lock();
        try {
            if (g() && (nVar = this.f28016l) != null) {
                this.f28006b.a(nVar);
            }
            InterfaceC2166z0.a.a(this.f28015k, null, 1, null);
            b();
            this.f28007c.b(com.braze.events.internal.a0.f27706a, com.braze.events.internal.a0.class);
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.z3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.d(this.f25797a);
                }
            }, 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void p() {
        ReentrantLock reentrantLock = this.f28012h;
        reentrantLock.lock();
        try {
            g();
            final com.braze.models.n nVar = this.f28016l;
            if (nVar != null) {
                nVar.f28109c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f28006b.a(nVar);
                InterfaceC2166z0.a.a(this.f28015k, null, 1, null);
                this.f28015k = AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new v(this, null), 3, null);
                e();
                this.f28007c.b(com.braze.events.internal.b0.f27707a, com.braze.events.internal.b0.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.A3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.w.f(nVar);
                    }
                }, 7, (Object) null);
                C4015H c4015h = C4015H.f34254a;
            }
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.B3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.e(this.f25635a);
                }
            }, 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a() {
        return "Opening a session with a global context identifier.";
    }

    public static final String b(w wVar) {
        return "Completed the attemptToCloseSession call. Current session: " + wVar.h();
    }

    public static final String d(w wVar) {
        return "Completed the startSession call. Current session: " + wVar.h();
    }

    public static final String e(com.braze.models.n nVar) {
        return "Sealed session with id " + nVar.f();
    }

    public static final String f() {
        return "Failed to create session seal alarm";
    }

    public static final String b(com.braze.models.n nVar) {
        return "New session created with ID: " + nVar.f();
    }

    public static final String d(com.braze.models.n nVar) {
        return "Session [" + nVar.f() + "] being sealed because its end time is over the grace period. Session: " + nVar;
    }

    public final void a(final String sessionContextId) {
        AbstractC4862t.e(sessionContextId, "sessionContextId");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.F3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.w.b(sessionContextId);
            }
        }, 6, (Object) null);
        a(sessionContextId, false);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.J3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.w.b(this.f25660a);
            }
        }, 6, (Object) null);
    }

    public final void e() {
        com.braze.models.n mutableSession = this.f28016l;
        if (mutableSession != null) {
            int i10 = this.f28010f;
            boolean z10 = this.f28011g;
            AbstractC4862t.e(mutableSession, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i10);
            if (z10) {
                millis = Math.max(f28004p, (timeUnit.toMillis((long) mutableSession.f28108b) + millis) - DateTimeUtils.nowInMilliseconds());
            }
            final long j10 = millis;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.C3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.a(j10);
                }
            }, 7, (Object) null);
            try {
                Intent intent = new Intent(this.f28013i);
                intent.putExtra("session_id", mutableSession.toString());
                this.f28009e.set(1, DateTimeUtils.nowInMilliseconds() + j10, PendingIntent.getBroadcast(this.f28005a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.D3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.w.f();
                    }
                }, 4, (Object) null);
            }
        }
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.E3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.w.c();
            }
        }, 7, (Object) null);
        try {
            Intent intent = new Intent(this.f28013i);
            intent.putExtra("session_id", String.valueOf(this.f28016l));
            this.f28009e.cancel(PendingIntent.getBroadcast(this.f28005a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.G3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.d();
                }
            }, 4, (Object) null);
        }
    }

    public static final String d() {
        return "Failed to cancel session seal alarm";
    }

    public static final String c(w wVar) {
        return "Completed the attemptToOpenSession call. Current session: " + wVar.h();
    }

    public final void a(String sessionContextId, boolean z10) {
        AbstractC4862t.e(sessionContextId, "sessionContextId");
        ReentrantLock reentrantLock = this.f28012h;
        reentrantLock.lock();
        int i10 = z10 ? 1 : -1;
        try {
            Object obj = this.f28017m.get(sessionContextId);
            if (obj == null) {
                obj = 0;
            }
            this.f28017m.put(sessionContextId, Integer.valueOf(((Number) obj).intValue() + i10));
            final int iK0 = C4179C.K0(this.f28017m.values());
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.w3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.w.a(iK0, this);
                }
            }, 6, (Object) null);
            if (iK0 > 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.x3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.w.q();
                    }
                }, 6, (Object) null);
                o();
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.y3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.managers.w.r();
                    }
                }, 6, (Object) null);
                p();
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String c(com.braze.models.n nVar) {
        return "Checking if this session needs to be sealed: " + nVar.f();
    }

    public static final String c() {
        return "Cancelling session seal alarm";
    }

    public static final String a(int i10, w wVar) {
        return "Session context identifier map updated. sum: " + i10 + " map: " + wVar.f28017m;
    }

    public static final String a(com.braze.models.n nVar) {
        return "Clearing completely dispatched sealed session " + nVar.f();
    }

    public static final String a(long j10) {
        return "Creating a session seal alarm with a delay of " + j10 + " ms";
    }
}
