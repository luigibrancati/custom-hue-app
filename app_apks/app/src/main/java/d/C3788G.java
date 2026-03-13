package d;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2756l;
import androidx.lifecycle.InterfaceC2758n;
import d.AbstractC3785D;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: d.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3788G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f32718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X0.a f32719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S2.c f32721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f32722e;

    /* JADX INFO: renamed from: d.G$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a extends S2.h {
        public a() {
        }

        @Override // S2.h
        public void j(boolean z10) {
            C3788G.this.f32720c = z10;
            X0.a aVar = C3788G.this.f32719b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z10));
            }
        }

        public final void m() {
            b();
        }
    }

    /* JADX INFO: renamed from: d.G$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC2756l, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC3785D.a f32724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3788G f32725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC2754j f32726c;

        public b(AbstractC3785D.a aVar, C3788G c3788g, AbstractC2754j abstractC2754j) {
            this.f32724a = aVar;
            this.f32725b = c3788g;
            this.f32726c = abstractC2754j;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.f32726c.c(this);
        }

        @Override // androidx.lifecycle.InterfaceC2756l
        public void d(InterfaceC2758n source, AbstractC2754j.a event) {
            AbstractC4862t.e(source, "source");
            AbstractC4862t.e(event, "event");
            if (C3793a.f32730b) {
                if (event == AbstractC2754j.a.ON_START) {
                    this.f32724a.A(true);
                } else if (event == AbstractC2754j.a.ON_STOP) {
                    this.f32724a.A(false);
                }
            } else if (event == AbstractC2754j.a.ON_START) {
                S2.c.b(this.f32725b.g(), this.f32724a, 0, 2, null);
            } else if (event == AbstractC2754j.a.ON_STOP) {
                this.f32724a.w();
            }
            if (event == AbstractC2754j.a.ON_DESTROY) {
                this.f32724a.w();
                this.f32726c.c(this);
            }
        }
    }

    public C3788G() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final void f(C3788G c3788g) {
        Runnable runnable = c3788g.f32718a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(InterfaceC2758n owner, AbstractC3785D onBackPressedCallback) {
        AbstractC4862t.e(owner, "owner");
        AbstractC4862t.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC2754j lifecycle = owner.getLifecycle();
        if (lifecycle.b() == AbstractC2754j.b.DESTROYED) {
            return;
        }
        AbstractC3785D.a aVarCreateNavigationEventHandler$activity = onBackPressedCallback.createNavigationEventHandler$activity(new C3786E(onBackPressedCallback, owner));
        if (C3793a.f32730b) {
            aVarCreateNavigationEventHandler$activity.A(false);
            S2.c.b(this.f32721d, aVarCreateNavigationEventHandler$activity, 0, 2, null);
        }
        b bVar = new b(aVarCreateNavigationEventHandler$activity, this, lifecycle);
        lifecycle.a(bVar);
        onBackPressedCallback.addCloseable$activity(bVar);
    }

    public final void e(AbstractC3785D onBackPressedCallback) {
        AbstractC4862t.e(onBackPressedCallback, "onBackPressedCallback");
        S2.c.b(this.f32721d, onBackPressedCallback.createNavigationEventHandler$activity(new C3786E(onBackPressedCallback, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }

    public final S2.c g() {
        return this.f32721d;
    }

    public final void h() {
        this.f32722e.m();
    }

    public final void i(OnBackInvokedDispatcher invoker) {
        AbstractC4862t.e(invoker, "invoker");
        this.f32721d.d(new S2.m(invoker), 1);
        this.f32721d.d(new S2.p(invoker), 0);
    }

    public C3788G(Runnable runnable, X0.a aVar) {
        this.f32718a = runnable;
        this.f32719b = aVar;
        S2.c cVar = new S2.c(new S2.l() { // from class: d.F
            @Override // S2.l
            public final void a() {
                C3788G.f(this.f32717a);
            }
        });
        this.f32721d = cVar;
        a aVar2 = new a();
        this.f32722e = aVar2;
        cVar.c(aVar2);
    }

    public C3788G(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ C3788G(Runnable runnable, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : runnable);
    }
}
