package com.braze.events;

import Rd.AbstractC2132i;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.internal.g;
import com.braze.events.internal.q;
import com.braze.events.internal.r;
import com.braze.events.internal.u;
import com.braze.events.internal.v;
import com.braze.requests.o;
import com.braze.storage.t0;
import com.braze.storage.v2;
import com.braze.support.BrazeLogger;
import fc.C4015H;
import gc.C4206t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.utils.StringUtils;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f27695j = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2 f27696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f27697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f27698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f27699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f27700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f27701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f27702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f27703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27704i;

    public d(v2 sdkEnablementProvider, t0 delayedInitializationProvider, boolean z10) {
        AbstractC4862t.e(sdkEnablementProvider, "sdkEnablementProvider");
        AbstractC4862t.e(delayedInitializationProvider, "delayedInitializationProvider");
        this.f27696a = sdkEnablementProvider;
        this.f27697b = delayedInitializationProvider;
        this.f27698c = new ConcurrentHashMap();
        this.f27699d = new ConcurrentHashMap();
        this.f27700e = new ConcurrentHashMap();
        this.f27701f = new ReentrantLock();
        this.f27702g = new ReentrantLock();
        this.f27703h = new ReentrantLock();
        this.f27704i = !z10;
    }

    public static final String b() {
        return "Now allowing events to send";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.i0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.d.b();
            }
        }, 7, (Object) null);
        this.f27704i = true;
        ReentrantLock reentrantLock = this.f27703h;
        reentrantLock.lock();
        try {
            for (Class cls : this.f27700e.keySet()) {
                AbstractC4862t.b(cls);
                a(cls);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c(Class eventClass, IEventSubscriber subscriber) {
        AbstractC4862t.e(eventClass, "eventClass");
        AbstractC4862t.e(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f27702g;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f27699d;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(eventClass);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(eventClass, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            boolean zAdd = copyOnWriteArraySet.add(subscriber);
            a(eventClass);
            reentrantLock.unlock();
            return zAdd;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(Class eventClass, IEventSubscriber subscriber) {
        AbstractC4862t.e(eventClass, "eventClass");
        AbstractC4862t.e(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f27701f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.f27698c;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(eventClass);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(eventClass, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            copyOnWriteArraySet.add(subscriber);
            a(eventClass);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean b(Class eventClass, IEventSubscriber subscriber) {
        AbstractC4862t.e(eventClass, "eventClass");
        AbstractC4862t.e(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f27702g;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f27699d.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(final Object obj, final Class eventClass) {
        o oVar;
        AbstractC4862t.e(eventClass, "eventClass");
        boolean z10 = true;
        if (!(obj instanceof u) && !(obj instanceof v) && ((!(obj instanceof com.braze.events.internal.dispatchmanager.c) || (oVar = ((com.braze.events.internal.dispatchmanager.c) obj).f27722d) == null || !((com.braze.requests.b) oVar).e().f28350d) && ((!(obj instanceof r) || !((r) obj).f27746a.e().f28350d) && ((!(obj instanceof q) || !((q) obj).f27745a.e().f28350d) && (!(obj instanceof g) || !((com.braze.requests.b) ((g) obj).f27727a).e().f28350d))))) {
            z10 = false;
        }
        boolean z11 = z10;
        if (this.f27696a.a() || this.f27697b.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z11, new InterfaceC6082a() { // from class: Z4.f0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.d.a(this.f20256a, eventClass, obj);
                }
            }, 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z11, new InterfaceC6082a() { // from class: Z4.a0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.d.d(eventClass);
                }
            }, 3, (Object) null);
            return;
        }
        if (!this.f27704i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z11, new InterfaceC6082a() { // from class: Z4.b0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.d.a(eventClass, obj);
                }
            }, 3, (Object) null);
            a(obj, eventClass);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z11, new InterfaceC6082a() { // from class: Z4.c0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.events.d.b(eventClass, obj);
            }
        }, 3, (Object) null);
        b bVar = f27695j;
        HashSet hashSetA = b.a(this.f27698c, eventClass, this.f27701f);
        Iterator it = bVar.a(eventClass, hashSetA).iterator();
        while (it.hasNext()) {
            AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new c((IEventSubscriber) it.next(), obj, null), 3, null);
        }
        b bVar2 = f27695j;
        HashSet hashSetA2 = b.a(this.f27699d, eventClass, this.f27702g);
        Iterator it2 = bVar2.a(eventClass, hashSetA2).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (hashSetA2.isEmpty() && hashSetA.isEmpty()) {
            if (AbstractC4862t.a(eventClass, NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.f28626I, (Throwable) null, z11, new InterfaceC6082a() { // from class: Z4.d0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.events.d.a(eventClass, this);
                    }
                }, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.f28626I, (Throwable) null, z11, new InterfaceC6082a() { // from class: Z4.e0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.events.d.b(eventClass, this);
                    }
                }, 2, (Object) null);
                a(obj, eventClass);
            }
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f27701f;
        reentrantLock.lock();
        try {
            this.f27698c.clear();
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f27702g;
            reentrantLock2.lock();
            try {
                this.f27699d.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d(Class cls) {
        return "Not publishing null message to event class " + cls.getName();
    }

    public final boolean a(Class eventClass, IEventSubscriber subscriber) {
        AbstractC4862t.e(eventClass, "eventClass");
        AbstractC4862t.e(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f27701f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f27698c.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String c(Class cls) {
        return "Publishing cached event for class: " + cls;
    }

    public static final String a(d dVar, Class cls, Object obj) {
        return "SDK delayed initialization mode: " + dVar.f27697b.c() + " and GDPR disabled mode: " + dVar.f27696a.a() + ". Not publishing event class: " + cls.getName() + " and message: " + obj;
    }

    public static final String a(Class cls, Object obj) {
        return "Not publishing event class: " + cls.getName() + " and message: " + obj + " because events are not allowed to send yet. Adding to replay cache.";
    }

    public static final String a(Class cls, d dVar) {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + cls + StringUtils.SPACE + dVar;
    }

    public final void a(Object obj, Class cls) {
        List list;
        ReentrantLock reentrantLock = this.f27703h;
        reentrantLock.lock();
        if (obj == null) {
            reentrantLock.unlock();
            return;
        }
        try {
            if (this.f27700e.containsKey(cls) && (list = (List) this.f27700e.get(cls)) != null) {
                list.add(obj);
            } else {
                this.f27700e.put(cls, C4206t.q(obj));
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a(final Class cls) {
        if (!this.f27704i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.g0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.d.b(cls);
                }
            }, 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.f27703h;
        reentrantLock.lock();
        try {
            if (this.f27700e.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: Z4.h0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.events.d.c(cls);
                    }
                }, 6, (Object) null);
                Object objRemove = this.f27700e.remove(cls);
                AbstractC4862t.c(objRemove, "null cannot be cast to non-null type kotlin.collections.List<T of com.braze.events.EventMessenger.attemptPublishFromCache>");
                Iterator it = ((List) objRemove).iterator();
                while (it.hasNext()) {
                    b(it.next(), cls);
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(Class cls, Object obj) {
        return cls.getName() + " fired:\n" + obj;
    }

    public static final String b(Class cls, d dVar) {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + cls + " this " + dVar;
    }

    public static final String b(Class cls) {
        return "Not publishing cached event for class: " + cls + " because events are not allowed to send yet.";
    }
}
