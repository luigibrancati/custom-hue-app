package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.J;
import fc.C4015H;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f23005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f23006b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J.k f23007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23008b;

        public a(J.k callback, boolean z10) {
            AbstractC4862t.e(callback, "callback");
            this.f23007a = callback;
            this.f23008b = z10;
        }

        public final J.k a() {
            return this.f23007a;
        }

        public final boolean b() {
            return this.f23008b;
        }
    }

    public C(J fragmentManager) {
        AbstractC4862t.e(fragmentManager, "fragmentManager");
        this.f23005a = fragmentManager;
        this.f23006b = new CopyOnWriteArrayList();
    }

    public final void a(ComponentCallbacksC2736q f10, Bundle bundle, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().a(f10, bundle, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().a(this.f23005a, f10, bundle);
            }
        }
    }

    public final void b(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        Context contextF = this.f23005a.y0().f();
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().b(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().b(this.f23005a, f10, contextF);
            }
        }
    }

    public final void c(ComponentCallbacksC2736q f10, Bundle bundle, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().c(f10, bundle, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().c(this.f23005a, f10, bundle);
            }
        }
    }

    public final void d(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().d(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().d(this.f23005a, f10);
            }
        }
    }

    public final void e(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().e(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().e(this.f23005a, f10);
            }
        }
    }

    public final void f(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().f(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().f(this.f23005a, f10);
            }
        }
    }

    public final void g(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        Context contextF = this.f23005a.y0().f();
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().g(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().g(this.f23005a, f10, contextF);
            }
        }
    }

    public final void h(ComponentCallbacksC2736q f10, Bundle bundle, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().h(f10, bundle, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().h(this.f23005a, f10, bundle);
            }
        }
    }

    public final void i(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().i(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().i(this.f23005a, f10);
            }
        }
    }

    public final void j(ComponentCallbacksC2736q f10, Bundle outState, boolean z10) {
        AbstractC4862t.e(f10, "f");
        AbstractC4862t.e(outState, "outState");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().j(f10, outState, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().j(this.f23005a, f10, outState);
            }
        }
    }

    public final void k(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().k(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().k(this.f23005a, f10);
            }
        }
    }

    public final void l(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().l(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().l(this.f23005a, f10);
            }
        }
    }

    public final void m(ComponentCallbacksC2736q f10, View v10, Bundle bundle, boolean z10) {
        AbstractC4862t.e(f10, "f");
        AbstractC4862t.e(v10, "v");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().m(f10, v10, bundle, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().m(this.f23005a, f10, v10, bundle);
            }
        }
    }

    public final void n(ComponentCallbacksC2736q f10, boolean z10) {
        AbstractC4862t.e(f10, "f");
        ComponentCallbacksC2736q componentCallbacksC2736qB0 = this.f23005a.B0();
        if (componentCallbacksC2736qB0 != null) {
            J parentFragmentManager = componentCallbacksC2736qB0.getParentFragmentManager();
            AbstractC4862t.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().n(f10, true);
        }
        for (a aVar : this.f23006b) {
            if (!z10 || aVar.b()) {
                aVar.a().n(this.f23005a, f10);
            }
        }
    }

    public final void o(J.k cb2, boolean z10) {
        AbstractC4862t.e(cb2, "cb");
        this.f23006b.add(new a(cb2, z10));
    }

    public final void p(J.k cb2) {
        AbstractC4862t.e(cb2, "cb");
        synchronized (this.f23006b) {
            try {
                int size = this.f23006b.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (((a) this.f23006b.get(i10)).a() == cb2) {
                        this.f23006b.remove(i10);
                        break;
                    }
                    i10++;
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
