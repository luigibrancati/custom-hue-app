package com.braze.managers;

import Od.F;
import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import fc.C4015H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import nc.AbstractC5158b;
import org.apache.tika.utils.StringUtils;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c1 f27875k = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3 f27876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.d f27877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d1 f27878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f27881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f27883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC2166z0 f27884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f27885j;

    public h1(b3 serverConfigStorageProvider, com.braze.events.d internalPublisher, Context context) {
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(internalPublisher, "internalPublisher");
        AbstractC4862t.e(context, "context");
        this.f27876a = serverConfigStorageProvider;
        this.f27877b = internalPublisher;
        this.f27878c = new d1();
        this.f27879d = DateTimeUtils.nowInSeconds();
        this.f27881f = new ArrayList();
        this.f27883h = new ReentrantLock();
        this.f27885j = new AtomicInteger(0);
        if (g()) {
            c();
        }
        internalPublisher.c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: c5.D0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.h1.a(this.f25639a, (com.braze.events.internal.q) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.t.class, new IEventSubscriber() { // from class: c5.F0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                com.braze.managers.h1.a(this.f25644a, (com.braze.events.internal.t) obj);
            }
        });
    }

    public static final void a(h1 h1Var, com.braze.events.internal.q it) {
        AbstractC4862t.e(it, "it");
        if (it.f27745a instanceof com.braze.requests.x) {
            h1Var.f27885j.decrementAndGet();
            AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new b1(h1Var, null), 3, null);
        }
    }

    public static final String b() {
        return "Shutting down SDK Debugger due to being past expiration time";
    }

    public static final String d() {
        return "Initializing SDK Debugger";
    }

    public static final String e() {
        return "SDK Debugger transitioned from disabled to enabled. Initializing SDK Debugger.";
    }

    public static final String f() {
        return "SDK Debugger transitioned from enabled to disabled. Shutting down SDK Debugger.";
    }

    public static final String h() {
        return "Debugging session has expired. Disabling SDK Debugger.";
    }

    public static final String j() {
        return "Shutting down SDK Debugger";
    }

    public final void c() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.L0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.h1.d();
            }
        }, 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(new f1(this));
        this.f27877b.b(new com.braze.events.internal.u(), com.braze.events.internal.u.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r9 = this;
            com.braze.managers.d1 r0 = r9.f27878c
            com.braze.storage.b3 r1 = r9.f27876a
            boolean r1 = r1.M()
            r0.f27850a = r1
            com.braze.managers.d1 r0 = r9.f27878c
            boolean r1 = r0.f27850a
            if (r1 == 0) goto L44
            com.braze.storage.b3 r1 = r9.f27876a
            java.lang.String r1 = r1.y()
            r0.f27852c = r1
            com.braze.managers.d1 r0 = r9.f27878c
            com.braze.storage.b3 r1 = r9.f27876a
            long r1 = r1.A()
            r0.f27853d = r1
            com.braze.managers.d1 r0 = r9.f27878c
            com.braze.storage.b3 r1 = r9.f27876a
            long r1 = r1.B()
            r0.f27854e = r1
            com.braze.managers.d1 r0 = r9.f27878c
            com.braze.storage.b3 r1 = r9.f27876a
            long r1 = r1.C()
            r0.f27855f = r1
            com.braze.managers.d1 r0 = r9.f27878c
            com.braze.storage.b3 r1 = r9.f27876a
            long r1 = r1.z()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f27851b = r1
        L44:
            com.braze.managers.d1 r0 = r9.f27878c
            java.lang.Long r0 = r0.f27851b
            if (r0 == 0) goto L6e
            long r0 = r0.longValue()
            long r2 = com.braze.support.DateTimeUtils.nowInSeconds()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6e
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.INSTANCE
            c5.N0 r6 = new c5.N0
            r6.<init>()
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r9
            com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7, r8)
            com.braze.managers.d1 r9 = new com.braze.managers.d1
            r9.<init>()
            r2.f27878c = r9
            goto L6f
        L6e:
            r2 = r9
        L6f:
            com.braze.managers.d1 r9 = r2.f27878c
            boolean r9 = r9.f27850a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.h1.g():boolean");
    }

    public final void i() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.E0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.h1.j();
            }
        }, 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(null);
        this.f27878c = new d1();
        ReentrantLock reentrantLock = this.f27883h;
        reentrantLock.lock();
        try {
            this.f27881f.clear();
            this.f27882g = 0;
            C4015H c4015h = C4015H.f34254a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void a(h1 h1Var, final com.braze.events.internal.t newConfig) {
        AbstractC4862t.e(newConfig, "newConfig");
        final d1 d1Var = h1Var.f27878c;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.G0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.h1.a(newConfig, d1Var);
            }
        }, 7, (Object) null);
        if (newConfig.f27747a.f27851b == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.H0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.h1.a(d1Var);
                }
            }, 7, (Object) null);
            newConfig.f27747a.f27851b = d1Var.f27851b;
        }
        d1 d1Var2 = newConfig.f27747a;
        if (d1Var2.f27852c == null) {
            d1Var2.f27852c = d1Var.f27852c;
        }
        h1Var.f27878c = d1Var2;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.I0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.managers.h1.a(newConfig);
            }
        }, 6, (Object) null);
        h1Var.f27876a.a(newConfig.f27747a);
        boolean z10 = d1Var.f27850a;
        if (!z10 && h1Var.f27878c.f27850a) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.J0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.h1.e();
                }
            }, 6, (Object) null);
            h1Var.c();
        } else {
            if (!z10 || h1Var.f27878c.f27850a) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.K0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.h1.f();
                }
            }, 6, (Object) null);
            h1Var.i();
        }
    }

    public static final String a(com.braze.events.internal.t tVar, d1 d1Var) {
        return "Received SdkDebuggerConfigUpdateEvent. Updating SDK Debugger config with " + tVar.a() + ".\nOld config " + d1Var;
    }

    public static final String a(d1 d1Var) {
        return "updating expiration time to " + d1Var.b();
    }

    public static final String a(com.braze.events.internal.t tVar) {
        return "Updating SDK Debugger config with " + tVar.a();
    }

    public final void a(String tag, BrazeLogger.Priority priority, String message, Throwable th) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(priority, "priority");
        AbstractC4862t.e(message, "message");
        if (!this.f27878c.f() || F.V(message, "Braze v41.0.0 .", false, 2, null)) {
            return;
        }
        String str = "";
        Object obj = th;
        if (th == null) {
            obj = "";
        }
        for (String str2 : F.I0(priority + StringUtils.SPACE + tag + ": " + message + StringUtils.SPACE + obj, new String[]{"\n"}, false, 0, 6, null)) {
            if (str2.length() + str.length() > this.f27878c.e()) {
                a(priority + ": " + ((Object) str));
                str = str2;
            } else {
                str = ((Object) str) + "\n" + str2;
            }
        }
        if (str.length() > 0) {
            a(str);
        }
        AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new g1(this, null), 3, null);
    }

    public final void a(String str) {
        com.braze.models.o oVar = new com.braze.models.o(str);
        ReentrantLock reentrantLock = this.f27883h;
        reentrantLock.lock();
        try {
            this.f27881f.add(oVar);
            int length = this.f27882g + oVar.f28068a.length();
            this.f27882g = length;
            if (length > 1048576) {
                while (this.f27882g > 838860) {
                    this.f27882g -= ((com.braze.models.o) this.f27881f.remove(0)).f28068a.length();
                    this.f27880e++;
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final C4015H a() {
        Long lB;
        if (this.f27878c.f() && this.f27878c.a() != null && this.f27878c.b() != null && (((lB = this.f27878c.b()) == null || lB.longValue() != 0) && this.f27885j.get() <= 0)) {
            Long lB2 = this.f27878c.b();
            if (lB2 != null) {
                if (DateTimeUtils.nowInSeconds() > lB2.longValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.M0
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.managers.h1.b();
                        }
                    }, 7, (Object) null);
                    i();
                    return C4015H.f34254a;
                }
            }
            if (DateTimeUtils.nowInSeconds() <= this.f27878c.d() + this.f27879d && this.f27882g <= this.f27878c.c()) {
                if (this.f27884i == null) {
                    this.f27884i = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, AbstractC5158b.d(TimeUnit.SECONDS.toMillis((this.f27878c.d() + this.f27879d) - DateTimeUtils.nowInSeconds())), null, new e1(this, null), 2, null);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                ReentrantLock reentrantLock = this.f27883h;
                reentrantLock.lock();
                try {
                    int length = 0;
                    int length2 = 0;
                    for (com.braze.models.o oVar : this.f27881f) {
                        int i10 = this.f27880e;
                        if (i10 != 0) {
                            String str = "Removed " + i10 + " logs due to buffer overflow";
                            arrayList.add(new com.braze.models.o(str));
                            this.f27880e = 0;
                            length2 += str.length();
                        }
                        int length3 = oVar.c().length() + length2;
                        if (length3 <= this.f27878c.e()) {
                            arrayList.add(oVar);
                            length2 = length3;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.f27881f.remove((com.braze.models.o) it.next());
                    }
                    Iterator it2 = this.f27881f.iterator();
                    while (it2.hasNext()) {
                        length += ((com.braze.models.o) it2.next()).c().length();
                    }
                    this.f27882g = length;
                    this.f27879d = DateTimeUtils.nowInSeconds();
                    C4015H c4015h = C4015H.f34254a;
                    reentrantLock.unlock();
                    InterfaceC2166z0 interfaceC2166z0 = this.f27884i;
                    if (interfaceC2166z0 != null) {
                        InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
                    }
                    this.f27884i = null;
                    if (!arrayList.isEmpty()) {
                        this.f27885j.incrementAndGet();
                        this.f27877b.b(new com.braze.events.internal.v(arrayList), com.braze.events.internal.v.class);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            return C4015H.f34254a;
        }
        return C4015H.f34254a;
    }
}
