package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.C3794b;
import fc.C4015H;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import r1.AbstractC5525b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f23197g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f23198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23203f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final a0 a(ViewGroup container, J fragmentManager) {
            AbstractC4862t.e(container, "container");
            AbstractC4862t.e(fragmentManager, "fragmentManager");
            b0 b0VarD0 = fragmentManager.D0();
            AbstractC4862t.d(b0VarD0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, b0VarD0);
        }

        public final a0 b(ViewGroup container, b0 factory) {
            AbstractC4862t.e(container, "container");
            AbstractC4862t.e(factory, "factory");
            Object tag = container.getTag(AbstractC5525b.f43505b);
            if (tag instanceof a0) {
                return (a0) tag;
            }
            a0 a0VarA = factory.a(container);
            AbstractC4862t.d(a0VarA, "factory.createController(container)");
            container.setTag(AbstractC5525b.f43505b, a0VarA);
            return a0VarA;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23206c;

        public final void a(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            if (!this.f23206c) {
                c(container);
            }
            this.f23206c = true;
        }

        public boolean b() {
            return this.f23204a;
        }

        public void c(ViewGroup container) {
            AbstractC4862t.e(container, "container");
        }

        public void d(ViewGroup container) {
            AbstractC4862t.e(container, "container");
        }

        public void e(C3794b backEvent, ViewGroup container) {
            AbstractC4862t.e(backEvent, "backEvent");
            AbstractC4862t.e(container, "container");
        }

        public void f(ViewGroup container) {
            AbstractC4862t.e(container, "container");
        }

        public final void g(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            if (!this.f23205b) {
                f(container);
            }
            this.f23205b = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final P f23207l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b finalState, d.a lifecycleImpact, P fragmentStateManager) {
            AbstractC4862t.e(finalState, "finalState");
            AbstractC4862t.e(lifecycleImpact, "lifecycleImpact");
            AbstractC4862t.e(fragmentStateManager, "fragmentStateManager");
            ComponentCallbacksC2736q componentCallbacksC2736qK = fragmentStateManager.k();
            AbstractC4862t.d(componentCallbacksC2736qK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, componentCallbacksC2736qK);
            this.f23207l = fragmentStateManager;
        }

        @Override // androidx.fragment.app.a0.d
        public void d() {
            super.d();
            h().mTransitioning = false;
            this.f23207l.m();
        }

        @Override // androidx.fragment.app.a0.d
        public void p() {
            if (n()) {
                return;
            }
            super.p();
            if (i() != d.a.ADDING) {
                if (i() == d.a.REMOVING) {
                    ComponentCallbacksC2736q componentCallbacksC2736qK = this.f23207l.k();
                    AbstractC4862t.d(componentCallbacksC2736qK, "fragmentStateManager.fragment");
                    View viewRequireView = componentCallbacksC2736qK.requireView();
                    AbstractC4862t.d(viewRequireView, "fragment.requireView()");
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + componentCallbacksC2736qK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            ComponentCallbacksC2736q componentCallbacksC2736qK2 = this.f23207l.k();
            AbstractC4862t.d(componentCallbacksC2736qK2, "fragmentStateManager.fragment");
            View viewFindFocus = componentCallbacksC2736qK2.mView.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC2736qK2.setFocusedView(viewFindFocus);
                if (J.L0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + componentCallbacksC2736qK2);
                }
            }
            View viewRequireView2 = h().requireView();
            AbstractC4862t.d(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Adding fragment " + componentCallbacksC2736qK2 + " view " + viewRequireView2 + " to container in onStart");
                }
                this.f23207l.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "Making view " + viewRequireView2 + " INVISIBLE in onStart");
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(componentCallbacksC2736qK2.getPostOnViewCreatedAlpha());
            if (J.L0(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + componentCallbacksC2736qK2.getPostOnViewCreatedAlpha() + " in onStart");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f23208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f23209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ComponentCallbacksC2736q f23210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f23211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f23212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f23214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f23215h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f23216i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f23217j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List f23218k;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a Companion = new a(null);

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class a {
                public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                    this();
                }

                public final b a(View view) {
                    AbstractC4862t.e(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                public a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.a0$d$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public /* synthetic */ class C0292b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f23219a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f23219a = iArr;
                }
            }

            public static final b j(int i10) {
                return Companion.b(i10);
            }

            public final void b(View view, ViewGroup container) {
                AbstractC4862t.e(view, "view");
                AbstractC4862t.e(container, "container");
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int i10 = C0292b.f23219a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23220a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f23220a = iArr;
            }
        }

        public d(b finalState, a lifecycleImpact, ComponentCallbacksC2736q fragment) {
            AbstractC4862t.e(finalState, "finalState");
            AbstractC4862t.e(lifecycleImpact, "lifecycleImpact");
            AbstractC4862t.e(fragment, "fragment");
            this.f23208a = finalState;
            this.f23209b = lifecycleImpact;
            this.f23210c = fragment;
            this.f23211d = new ArrayList();
            this.f23216i = true;
            ArrayList arrayList = new ArrayList();
            this.f23217j = arrayList;
            this.f23218k = arrayList;
        }

        public final void a(Runnable listener) {
            AbstractC4862t.e(listener, "listener");
            this.f23211d.add(listener);
        }

        public final void b(b effect) {
            AbstractC4862t.e(effect, "effect");
            this.f23217j.add(effect);
        }

        public final void c(ViewGroup container) {
            AbstractC4862t.e(container, "container");
            this.f23215h = false;
            if (this.f23212e) {
                return;
            }
            this.f23212e = true;
            if (this.f23217j.isEmpty()) {
                d();
                return;
            }
            Iterator it = C4179C.V0(this.f23218k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.f23215h = false;
            if (this.f23213f) {
                return;
            }
            if (J.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f23213f = true;
            Iterator it = this.f23211d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(b effect) {
            AbstractC4862t.e(effect, "effect");
            if (this.f23217j.remove(effect) && this.f23217j.isEmpty()) {
                d();
            }
        }

        public final List f() {
            return this.f23218k;
        }

        public final b g() {
            return this.f23208a;
        }

        public final ComponentCallbacksC2736q h() {
            return this.f23210c;
        }

        public final a i() {
            return this.f23209b;
        }

        public final boolean j() {
            return this.f23216i;
        }

        public final boolean k() {
            return this.f23212e;
        }

        public final boolean l() {
            return this.f23213f;
        }

        public final boolean m() {
            return this.f23214g;
        }

        public final boolean n() {
            return this.f23215h;
        }

        public final void o(b finalState, a lifecycleImpact) {
            AbstractC4862t.e(finalState, "finalState");
            AbstractC4862t.e(lifecycleImpact, "lifecycleImpact");
            int i10 = c.f23220a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f23208a == b.REMOVED) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f23210c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f23209b + " to ADDING.");
                    }
                    this.f23208a = b.VISIBLE;
                    this.f23209b = a.ADDING;
                    this.f23216i = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f23210c + " mFinalState = " + this.f23208a + " -> REMOVED. mLifecycleImpact  = " + this.f23209b + " to REMOVING.");
                }
                this.f23208a = b.REMOVED;
                this.f23209b = a.REMOVING;
                this.f23216i = true;
                return;
            }
            if (i10 == 3 && this.f23208a != b.REMOVED) {
                if (J.L0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f23210c + " mFinalState = " + this.f23208a + " -> " + finalState + '.');
                }
                this.f23208a = finalState;
            }
        }

        public void p() {
            this.f23215h = true;
        }

        public final void q(boolean z10) {
            this.f23216i = z10;
        }

        public final void r(boolean z10) {
            this.f23214g = z10;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f23208a + " lifecycleImpact = " + this.f23209b + " fragment = " + this.f23210c + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23221a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23221a = iArr;
        }
    }

    public a0(ViewGroup container) {
        AbstractC4862t.e(container, "container");
        this.f23198a = container;
        this.f23199b = new ArrayList();
        this.f23200c = new ArrayList();
    }

    public static final void h(a0 this$0, c operation) {
        AbstractC4862t.e(this$0, "this$0");
        AbstractC4862t.e(operation, "$operation");
        if (this$0.f23199b.contains(operation)) {
            d.b bVarG = operation.g();
            View view = operation.h().mView;
            AbstractC4862t.d(view, "operation.fragment.mView");
            bVarG.b(view, this$0.f23198a);
        }
    }

    public static final void i(a0 this$0, c operation) {
        AbstractC4862t.e(this$0, "this$0");
        AbstractC4862t.e(operation, "$operation");
        this$0.f23199b.remove(operation);
        this$0.f23200c.remove(operation);
    }

    public static final a0 u(ViewGroup viewGroup, J j10) {
        return f23197g.a(viewGroup, j10);
    }

    public static final a0 v(ViewGroup viewGroup, b0 b0Var) {
        return f23197g.b(viewGroup, b0Var);
    }

    public final void A(C3794b backEvent) {
        AbstractC4862t.e(backEvent, "backEvent");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.a());
        }
        List list = this.f23200c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc.y.C(arrayList, ((d) it.next()).f());
        }
        List listV0 = C4179C.V0(C4179C.Z0(arrayList));
        int size = listV0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listV0.get(i10)).e(backEvent, this.f23198a);
        }
    }

    public final void B(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) list.get(i10)).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc.y.C(arrayList, ((d) it.next()).f());
        }
        List listV0 = C4179C.V0(C4179C.Z0(arrayList));
        int size2 = listV0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listV0.get(i11)).g(this.f23198a);
        }
    }

    public final void C() {
        for (d dVar : this.f23199b) {
            if (dVar.i() == d.a.ADDING) {
                View viewRequireView = dVar.h().requireView();
                AbstractC4862t.d(viewRequireView, "fragment.requireView()");
                dVar.o(d.b.Companion.b(viewRequireView.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void D(boolean z10) {
        this.f23202e = z10;
    }

    public final void c(d operation) {
        AbstractC4862t.e(operation, "operation");
        if (operation.j()) {
            d.b bVarG = operation.g();
            View viewRequireView = operation.h().requireView();
            AbstractC4862t.d(viewRequireView, "operation.fragment.requireView()");
            bVarG.b(viewRequireView, this.f23198a);
            operation.q(false);
        }
    }

    public abstract void d(List list, boolean z10);

    public void e(List operations) {
        AbstractC4862t.e(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            gc.y.C(arrayList, ((d) it.next()).f());
        }
        List listV0 = C4179C.V0(C4179C.Z0(arrayList));
        int size = listV0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listV0.get(i10)).d(this.f23198a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c((d) operations.get(i11));
        }
        List listV02 = C4179C.V0(operations);
        int size3 = listV02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listV02.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.f23200c);
        e(this.f23200c);
    }

    public final void g(d.b bVar, d.a aVar, P p10) {
        synchronized (this.f23199b) {
            try {
                ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
                AbstractC4862t.d(componentCallbacksC2736qK, "fragmentStateManager.fragment");
                d dVarO = o(componentCallbacksC2736qK);
                if (dVarO == null) {
                    if (p10.k().mTransitioning || p10.k().mRemoving) {
                        ComponentCallbacksC2736q componentCallbacksC2736qK2 = p10.k();
                        AbstractC4862t.d(componentCallbacksC2736qK2, "fragmentStateManager.fragment");
                        dVarO = p(componentCallbacksC2736qK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, p10);
                this.f23199b.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.h(this.f23189a, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.i(this.f23191a, cVar);
                    }
                });
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(d.b finalState, P fragmentStateManager) {
        AbstractC4862t.e(finalState, "finalState");
        AbstractC4862t.e(fragmentStateManager, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(P fragmentStateManager) {
        AbstractC4862t.e(fragmentStateManager, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(P fragmentStateManager) {
        AbstractC4862t.e(fragmentStateManager, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(P fragmentStateManager) {
        AbstractC4862t.e(fragmentStateManager, "fragmentStateManager");
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z10;
        if (this.f23203f) {
            return;
        }
        if (!this.f23198a.isAttachedToWindow()) {
            q();
            this.f23202e = false;
            return;
        }
        synchronized (this.f23199b) {
            try {
                List<d> listX0 = C4179C.X0(this.f23200c);
                this.f23200c.clear();
                Iterator it = listX0.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.f23199b.isEmpty() || !dVar.h().mTransitioning) {
                        z10 = false;
                    }
                    dVar.r(z10);
                }
                for (d dVar2 : listX0) {
                    if (this.f23201d) {
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (J.L0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.f23198a);
                    }
                    this.f23201d = false;
                    if (!dVar2.l()) {
                        this.f23200c.add(dVar2);
                    }
                }
                if (!this.f23199b.isEmpty()) {
                    C();
                    List listX02 = C4179C.X0(this.f23199b);
                    if (listX02.isEmpty()) {
                        return;
                    }
                    this.f23199b.clear();
                    this.f23200c.addAll(listX02);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(listX02, this.f23202e);
                    boolean zW = w(listX02);
                    boolean zX = x(listX02);
                    if (!zX || zW) {
                        z10 = false;
                    }
                    this.f23201d = z10;
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zW + " \ntransition = " + zX);
                    }
                    if (!zX) {
                        B(listX02);
                        e(listX02);
                    } else if (zW) {
                        B(listX02);
                        int size = listX02.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c((d) listX02.get(i10));
                        }
                    }
                    this.f23202e = false;
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d o(ComponentCallbacksC2736q componentCallbacksC2736q) {
        Object next;
        Iterator it = this.f23199b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (AbstractC4862t.a(dVar.h(), componentCallbacksC2736q) && !dVar.k()) {
                break;
            }
        }
        return (d) next;
    }

    public final d p(ComponentCallbacksC2736q componentCallbacksC2736q) {
        Object next;
        Iterator it = this.f23200c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (AbstractC4862t.a(dVar.h(), componentCallbacksC2736q) && !dVar.k()) {
                break;
            }
        }
        return (d) next;
    }

    public final void q() {
        if (J.L0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f23198a.isAttachedToWindow();
        synchronized (this.f23199b) {
            try {
                C();
                B(this.f23199b);
                List<d> listX0 = C4179C.X0(this.f23200c);
                Iterator it = listX0.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listX0) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f23198a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f23198a);
                }
                List<d> listX02 = C4179C.X0(this.f23199b);
                Iterator it2 = listX02.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : listX02) {
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f23198a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f23198a);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.f23203f) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f23203f = false;
            n();
        }
    }

    public final d.a s(P fragmentStateManager) {
        AbstractC4862t.e(fragmentStateManager, "fragmentStateManager");
        ComponentCallbacksC2736q componentCallbacksC2736qK = fragmentStateManager.k();
        AbstractC4862t.d(componentCallbacksC2736qK, "fragmentStateManager.fragment");
        d dVarO = o(componentCallbacksC2736qK);
        d.a aVarI = dVarO != null ? dVarO.i() : null;
        d dVarP = p(componentCallbacksC2736qK);
        d.a aVarI2 = dVarP != null ? dVarP.i() : null;
        int i10 = aVarI == null ? -1 : e.f23221a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup t() {
        return this.f23198a;
    }

    public final boolean w(List list) {
        boolean z10;
        Iterator it = list.iterator();
        loop0: while (true) {
            z10 = true;
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (!dVar.f().isEmpty()) {
                    List listF = dVar.f();
                    if (listF == null || !listF.isEmpty()) {
                        Iterator it2 = listF.iterator();
                        while (it2.hasNext()) {
                            if (!((b) it2.next()).b()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                gc.y.C(arrayList, ((d) it3.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(List list) {
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).h().mTransitioning) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean y() {
        return !this.f23199b.isEmpty();
    }

    public final void z() {
        Object objPrevious;
        synchronized (this.f23199b) {
            try {
                C();
                List list = this.f23199b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    d dVar = (d) objPrevious;
                    d.b.a aVar = d.b.Companion;
                    View view = dVar.h().mView;
                    AbstractC4862t.d(view, "operation.fragment.mView");
                    d.b bVarA = aVar.a(view);
                    d.b bVarG = dVar.g();
                    d.b bVar = d.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) objPrevious;
                ComponentCallbacksC2736q componentCallbacksC2736qH = dVar2 != null ? dVar2.h() : null;
                this.f23203f = componentCallbacksC2736qH != null ? componentCallbacksC2736qH.isPostponed() : false;
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
