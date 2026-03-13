package g3;

import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.X;
import android.os.SystemClock;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;
import l3.InterfaceC4878d;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;
import vc.p;

/* JADX INFO: renamed from: g3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4132b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f35380l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0463b f35381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC4878d f35382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M f35383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC6082a f35384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f35385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f35386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f35387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AtomicLong f35388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC4877c f35389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC2166z0 f35391k;

    /* JADX INFO: renamed from: g3.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: g3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0463b {
        long a();
    }

    /* JADX INFO: renamed from: g3.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f35392j;

        public c(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C4132b.this.new c(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f35392j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                long j10 = C4132b.this.f35386f;
                this.f35392j = 1;
                if (X.a(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            C4132b.this.e();
            return C4015H.f34254a;
        }
    }

    public C4132b(long j10, TimeUnit timeUnit, InterfaceC0463b watch) {
        AbstractC4862t.e(timeUnit, "timeUnit");
        AbstractC4862t.e(watch, "watch");
        this.f35381a = watch;
        this.f35385e = new Object();
        this.f35386f = timeUnit.toMillis(j10);
        this.f35387g = new AtomicInteger(0);
        this.f35388h = new AtomicLong(watch.a());
    }

    public static final long b() {
        return SystemClock.uptimeMillis();
    }

    public final void e() {
        synchronized (this.f35385e) {
            try {
                if (this.f35381a.a() - this.f35388h.get() < this.f35386f) {
                    return;
                }
                if (this.f35387g.get() != 0) {
                    return;
                }
                InterfaceC6082a interfaceC6082a = this.f35384d;
                if (interfaceC6082a == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                interfaceC6082a.invoke();
                InterfaceC4877c interfaceC4877c = this.f35389i;
                if (interfaceC4877c != null && interfaceC4877c.isOpen()) {
                    interfaceC4877c.close();
                }
                this.f35389i = null;
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f35385e) {
            try {
                this.f35390j = true;
                InterfaceC2166z0 interfaceC2166z0 = this.f35391k;
                if (interfaceC2166z0 != null) {
                    InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
                }
                this.f35391k = null;
                InterfaceC4877c interfaceC4877c = this.f35389i;
                if (interfaceC4877c != null) {
                    interfaceC4877c.close();
                }
                this.f35389i = null;
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        M m10;
        int iDecrementAndGet = this.f35387g.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        this.f35388h.set(this.f35381a.a());
        if (iDecrementAndGet == 0) {
            M m11 = this.f35383c;
            if (m11 == null) {
                AbstractC4862t.p("coroutineScope");
                m10 = null;
            } else {
                m10 = m11;
            }
            this.f35391k = AbstractC2132i.d(m10, null, null, new c(null), 3, null);
        }
    }

    public final Object h(vc.l block) {
        AbstractC4862t.e(block, "block");
        try {
            return block.invoke(j());
        } finally {
            g();
        }
    }

    public final InterfaceC4877c i() {
        return this.f35389i;
    }

    public final InterfaceC4877c j() {
        InterfaceC2166z0 interfaceC2166z0 = this.f35391k;
        InterfaceC4878d interfaceC4878d = null;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        this.f35391k = null;
        this.f35387g.incrementAndGet();
        if (this.f35390j) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.f35385e) {
            InterfaceC4877c interfaceC4877c = this.f35389i;
            if (interfaceC4877c != null && interfaceC4877c.isOpen()) {
                return interfaceC4877c;
            }
            InterfaceC4878d interfaceC4878d2 = this.f35382b;
            if (interfaceC4878d2 == null) {
                AbstractC4862t.p("delegateOpenHelper");
            } else {
                interfaceC4878d = interfaceC4878d2;
            }
            InterfaceC4877c interfaceC4877cF0 = interfaceC4878d.F0();
            this.f35389i = interfaceC4877cF0;
            return interfaceC4877cF0;
        }
    }

    public final void k(M coroutineScope) {
        AbstractC4862t.e(coroutineScope, "coroutineScope");
        this.f35383c = coroutineScope;
    }

    public final void l(InterfaceC4878d delegateOpenHelper) {
        AbstractC4862t.e(delegateOpenHelper, "delegateOpenHelper");
        if (delegateOpenHelper instanceof C4138h) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f35382b = delegateOpenHelper;
    }

    public final void m(InterfaceC6082a onAutoClose) {
        AbstractC4862t.e(onAutoClose, "onAutoClose");
        this.f35384d = onAutoClose;
    }

    public /* synthetic */ C4132b(long j10, TimeUnit timeUnit, InterfaceC0463b interfaceC0463b, int i10, AbstractC4854k abstractC4854k) {
        this(j10, timeUnit, (i10 & 4) != 0 ? new InterfaceC0463b() { // from class: g3.a
            @Override // g3.C4132b.InterfaceC0463b
            public final long a() {
                return C4132b.b();
            }
        } : interfaceC0463b);
    }
}
