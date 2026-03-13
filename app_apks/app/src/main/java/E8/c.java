package E8;

import Cc.l;
import Rd.AbstractC2130h;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import fc.AbstractC4036s;
import fc.C4015H;
import g1.C4094d;
import g1.InterfaceC4099i;
import gc.C4205s;
import gc.Q;
import h1.C4268b;
import j1.AbstractC4670b;
import j1.k;
import java.util.List;
import java.util.Map;
import k1.AbstractC4785h;
import k1.AbstractC4786i;
import k1.AbstractC4789l;
import k1.C4781d;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.M;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.m;
import vc.p;
import yc.InterfaceC6461c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l[] f3335f = {M.h(new G(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal f3338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC6461c f3339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4099i f3340e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f3341j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ vc.l f3343l;

        /* JADX INFO: renamed from: E8.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0047a extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f3344j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f3345k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ vc.l f3346l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0047a(vc.l lVar, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f3346l = lVar;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C0047a c0047a = new C0047a(this.f3346l, interfaceC4988e);
                c0047a.f3345k = obj;
                return c0047a;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f3344j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                this.f3346l.invoke((C4781d) this.f3345k);
                return C4015H.f34254a;
            }

            @Override // vc.p
            public final Object invoke(C4781d c4781d, InterfaceC4988e interfaceC4988e) {
                return ((C0047a) create(c4781d, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vc.l lVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f3343l = lVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return c.this.new a(this.f3343l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f3341j;
            try {
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    if (AbstractC4862t.a(c.this.f3338c.get(), AbstractC5158b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.f3338c.set(AbstractC5158b.a(true));
                    InterfaceC4099i interfaceC4099i = c.this.f3340e;
                    C0047a c0047a = new C0047a(this.f3343l, null);
                    this.f3341j = 1;
                    obj = AbstractC4789l.a(interfaceC4099i, c0047a, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return (AbstractC4785h) obj;
            } finally {
                c.this.f3338c.set(AbstractC5158b.a(false));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f3347j;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return c.this.new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map mapA;
            Object objF = C5046c.f();
            int i10 = this.f3347j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2313e data = c.this.f3340e.getData();
                this.f3347j = 1;
                obj = AbstractC2315g.r(data, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            AbstractC4785h abstractC4785h = (AbstractC4785h) obj;
            return (abstractC4785h == null || (mapA = abstractC4785h.a()) == null) ? Q.i() : mapA;
        }
    }

    /* JADX INFO: renamed from: E8.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0048c extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f3349j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC4785h.a f3351l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f3352m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0048c(AbstractC4785h.a aVar, Object obj, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f3351l = aVar;
            this.f3352m = obj;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return c.this.new C0048c(this.f3351l, this.f3352m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((C0048c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            Object objF = C5046c.f();
            int i10 = this.f3349j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2313e data = c.this.f3340e.getData();
                this.f3349j = 1;
                obj = AbstractC2315g.r(data, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            AbstractC4785h abstractC4785h = (AbstractC4785h) obj;
            return (abstractC4785h == null || (objC = abstractC4785h.c(this.f3351l)) == null) ? this.f3352m : objC;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f3353j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC4785h.a f3355l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f3356m;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f3357j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f3358k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AbstractC4785h.a f3359l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Object f3360m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC4785h.a aVar, Object obj, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f3359l = aVar;
                this.f3360m = obj;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                a aVar = new a(this.f3359l, this.f3360m, interfaceC4988e);
                aVar.f3358k = obj;
                return aVar;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f3357j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                ((C4781d) this.f3358k).l(this.f3359l, this.f3360m);
                return C4015H.f34254a;
            }

            @Override // vc.p
            public final Object invoke(C4781d c4781d, InterfaceC4988e interfaceC4988e) {
                return ((a) create(c4781d, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC4785h.a aVar, Object obj, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f3355l = aVar;
            this.f3356m = obj;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return c.this.new d(this.f3355l, this.f3356m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f3353j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            InterfaceC4099i interfaceC4099i = c.this.f3340e;
            a aVar = new a(this.f3355l, this.f3356m, null);
            this.f3353j = 1;
            Object objA = AbstractC4789l.a(interfaceC4099i, aVar, this);
            return objA == objF ? objF : objA;
        }
    }

    public c(Context context, String name) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(name, "name");
        this.f3336a = context;
        this.f3337b = name;
        this.f3338c = new ThreadLocal();
        this.f3339d = AbstractC4670b.c(name, new C4268b(new vc.l() { // from class: E8.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return c.e(this.f3333a, (C4094d) obj);
            }
        }), new vc.l() { // from class: E8.b
            @Override // vc.l
            public final Object invoke(Object obj) {
                return c.f(this.f3334a, (Context) obj);
            }
        }, null, 8, null);
        this.f3340e = i(context);
    }

    public static final AbstractC4785h e(c cVar, C4094d ex) {
        AbstractC4862t.e(ex, "ex");
        Log.w(M.b(c.class).l(), "CorruptionException in " + cVar.f3337b + " DataStore running in process " + Process.myPid(), ex);
        return AbstractC4786i.a();
    }

    public static final List f(c cVar, Context it) {
        AbstractC4862t.e(it, "it");
        return C4205s.d(k.b(it, cVar.f3337b, null, 4, null));
    }

    public final AbstractC4785h g(vc.l transform) {
        AbstractC4862t.e(transform, "transform");
        return (AbstractC4785h) AbstractC2130h.b(null, new a(transform, null), 1, null);
    }

    public final Map h() {
        return (Map) AbstractC2130h.b(null, new b(null), 1, null);
    }

    public final InterfaceC4099i i(Context context) {
        return (InterfaceC4099i) this.f3339d.getValue(context, f3335f[0]);
    }

    public final Object j(AbstractC4785h.a key, Object obj) {
        AbstractC4862t.e(key, "key");
        return AbstractC2130h.b(null, new C0048c(key, obj, null), 1, null);
    }

    public final AbstractC4785h k(AbstractC4785h.a key, Object obj) {
        AbstractC4862t.e(key, "key");
        return (AbstractC4785h) AbstractC2130h.b(null, new d(key, obj, null), 1, null);
    }
}
