package d3;

import Pd.a;
import Rd.M;
import c3.AbstractC2942d;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4025h;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.AbstractC4791a;
import k3.InterfaceC4792b;
import k3.InterfaceC4793c;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import nc.AbstractC5160d;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4793c f33009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f33010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f33011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f33012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f33013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f33014f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33015j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33016k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f33017l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f33018m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f33019n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f33020o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f33021p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f33022q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f33024s;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33022q = obj;
            this.f33024s |= Integer.MIN_VALUE;
            return j.this.O0(false, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f33025j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ vc.p f33026k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f33027l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vc.p pVar, o oVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f33026k = pVar;
            this.f33027l = oVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(this.f33026k, this.f33027l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f33025j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            vc.p pVar = this.f33026k;
            o oVar = this.f33027l;
            this.f33025j = 1;
            Object objInvoke = pVar.invoke(oVar, this);
            return objInvoke == objF ? objF : objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f33028j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ vc.p f33029k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ L f33030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vc.p pVar, L l10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f33029k = pVar;
            this.f33030l = l10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new c(this.f33029k, this.f33030l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f33028j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            vc.p pVar = this.f33029k;
            Object obj2 = this.f33030l.f39776a;
            this.f33028j = 1;
            Object objInvoke = pVar.invoke(obj2, this);
            return objInvoke == objF ? objF : objInvoke;
        }
    }

    public j(final InterfaceC4793c driver, final String fileName) {
        AbstractC4862t.e(driver, "driver");
        AbstractC4862t.e(fileName, "fileName");
        this.f33012d = new ThreadLocal();
        this.f33013e = new AtomicBoolean(false);
        a.C0170a c0170a = Pd.a.f13294b;
        this.f33014f = Pd.c.s(30, Pd.d.SECONDS);
        this.f33009a = driver;
        n nVar = new n(1, new InterfaceC6082a() { // from class: d3.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return j.d(driver, fileName);
            }
        });
        this.f33010b = nVar;
        this.f33011c = nVar;
    }

    public static final InterfaceC4792b d(InterfaceC4793c interfaceC4793c, String str) {
        return interfaceC4793c.a(str);
    }

    public static final InterfaceC4792b f(InterfaceC4793c interfaceC4793c, String str) throws Exception {
        InterfaceC4792b interfaceC4792bA = interfaceC4793c.a(str);
        AbstractC4791a.a(interfaceC4792bA, "PRAGMA query_only = 1");
        return interfaceC4792bA;
    }

    public static final InterfaceC4792b g(InterfaceC4793c interfaceC4793c, String str) {
        return interfaceC4793c.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0192 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:89:0x018c, B:91:0x0192), top: B:115:0x018c }] */
    @Override // d3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object O0(boolean r18, vc.p r19, lc.InterfaceC4988e r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.j.O0(boolean, vc.p, lc.e):java.lang.Object");
    }

    @Override // d3.e, java.lang.AutoCloseable
    public void close() {
        if (this.f33013e.compareAndSet(false, true)) {
            this.f33010b.b();
            this.f33011c.b();
        }
    }

    public final InterfaceC4992i h(o oVar) {
        return new d(oVar).plus(AbstractC2942d.a(this.f33012d, oVar));
    }

    public final Void i(boolean z10) {
        String str = z10 ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.f33011c.c(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.f33010b.c(sb2);
        AbstractC4791a.b(5, sb2.toString());
        throw new C4025h();
    }

    public final boolean isClosed() {
        return this.f33013e.get();
    }

    public j(final InterfaceC4793c driver, final String fileName, int i10, int i11) {
        AbstractC4862t.e(driver, "driver");
        AbstractC4862t.e(fileName, "fileName");
        this.f33012d = new ThreadLocal();
        this.f33013e = new AtomicBoolean(false);
        a.C0170a c0170a = Pd.a.f13294b;
        this.f33014f = Pd.c.s(30, Pd.d.SECONDS);
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.f33009a = driver;
            this.f33010b = new n(i10, new InterfaceC6082a() { // from class: d3.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return j.f(driver, fileName);
                }
            });
            this.f33011c = new n(i11, new InterfaceC6082a() { // from class: d3.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return j.g(driver, fileName);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
