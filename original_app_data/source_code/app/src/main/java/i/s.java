package i;

import Y0.E;
import Y0.M;
import Y0.N;
import Y0.O;
import Y0.P;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import h.AbstractC4262a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import n.AbstractC5057b;
import n.C5056a;
import n.C5062g;
import p.InterfaceC5328G;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class s extends AbstractC4308a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Interpolator f36766D = new AccelerateInterpolator();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Interpolator f36767E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f36772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f36773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f36774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f36775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC5328G f36776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f36777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f36778h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f36782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC5057b f36783m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AbstractC5057b.a f36784n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f36785o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f36787q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f36790t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36791u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36792v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n.h f36794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f36795y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f36796z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f36779i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36780j = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f36786p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36788r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f36789s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f36793w = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final N f36768A = new a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final N f36769B = new b();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final P f36770C = new c();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends O {
        public a() {
        }

        @Override // Y0.O, Y0.N
        public void b(View view) {
            View view2;
            s sVar = s.this;
            if (sVar.f36789s && (view2 = sVar.f36778h) != null) {
                view2.setTranslationY(0.0f);
                s.this.f36775e.setTranslationY(0.0f);
            }
            s.this.f36775e.setVisibility(8);
            s.this.f36775e.setTransitioning(false);
            s sVar2 = s.this;
            sVar2.f36794x = null;
            sVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = s.this.f36774d;
            if (actionBarOverlayLayout != null) {
                E.c0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends O {
        public b() {
        }

        @Override // Y0.O, Y0.N
        public void b(View view) {
            s sVar = s.this;
            sVar.f36794x = null;
            sVar.f36775e.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements P {
        public c() {
        }

        @Override // Y0.P
        public void a(View view) {
            ((View) s.this.f36775e.getParent()).invalidate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends AbstractC5057b implements e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f36800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f36801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AbstractC5057b.a f36802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference f36803f;

        public d(Context context, AbstractC5057b.a aVar) {
            this.f36800c = context;
            this.f36802e = aVar;
            androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(context).T(1);
            this.f36801d = eVarT;
            eVarT.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            AbstractC5057b.a aVar = this.f36802e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f36802e == null) {
                return;
            }
            k();
            s.this.f36777g.l();
        }

        @Override // n.AbstractC5057b
        public void c() {
            s sVar = s.this;
            if (sVar.f36782l != this) {
                return;
            }
            if (s.v(sVar.f36790t, sVar.f36791u, false)) {
                this.f36802e.d(this);
            } else {
                s sVar2 = s.this;
                sVar2.f36783m = this;
                sVar2.f36784n = this.f36802e;
            }
            this.f36802e = null;
            s.this.u(false);
            s.this.f36777g.g();
            s sVar3 = s.this;
            sVar3.f36774d.setHideOnContentScrollEnabled(sVar3.f36796z);
            s.this.f36782l = null;
        }

        @Override // n.AbstractC5057b
        public View d() {
            WeakReference weakReference = this.f36803f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // n.AbstractC5057b
        public Menu e() {
            return this.f36801d;
        }

        @Override // n.AbstractC5057b
        public MenuInflater f() {
            return new C5062g(this.f36800c);
        }

        @Override // n.AbstractC5057b
        public CharSequence g() {
            return s.this.f36777g.getSubtitle();
        }

        @Override // n.AbstractC5057b
        public CharSequence i() {
            return s.this.f36777g.getTitle();
        }

        @Override // n.AbstractC5057b
        public void k() {
            if (s.this.f36782l != this) {
                return;
            }
            this.f36801d.e0();
            try {
                this.f36802e.b(this, this.f36801d);
            } finally {
                this.f36801d.d0();
            }
        }

        @Override // n.AbstractC5057b
        public boolean l() {
            return s.this.f36777g.j();
        }

        @Override // n.AbstractC5057b
        public void m(View view) {
            s.this.f36777g.setCustomView(view);
            this.f36803f = new WeakReference(view);
        }

        @Override // n.AbstractC5057b
        public void n(int i10) {
            o(s.this.f36771a.getResources().getString(i10));
        }

        @Override // n.AbstractC5057b
        public void o(CharSequence charSequence) {
            s.this.f36777g.setSubtitle(charSequence);
        }

        @Override // n.AbstractC5057b
        public void q(int i10) {
            r(s.this.f36771a.getResources().getString(i10));
        }

        @Override // n.AbstractC5057b
        public void r(CharSequence charSequence) {
            s.this.f36777g.setTitle(charSequence);
        }

        @Override // n.AbstractC5057b
        public void s(boolean z10) {
            super.s(z10);
            s.this.f36777g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f36801d.e0();
            try {
                return this.f36802e.a(this, this.f36801d);
            } finally {
                this.f36801d.d0();
            }
        }
    }

    public s(Activity activity, boolean z10) {
        this.f36773c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z10) {
            return;
        }
        this.f36778h = decorView.findViewById(R.id.content);
    }

    public static boolean v(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    public int A() {
        return this.f36776f.j();
    }

    public final void B() {
        if (this.f36792v) {
            this.f36792v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f36774d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    public final void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(h.f.f35897p);
        this.f36774d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f36776f = z(view.findViewById(h.f.f35882a));
        this.f36777g = (ActionBarContextView) view.findViewById(h.f.f35887f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(h.f.f35884c);
        this.f36775e = actionBarContainer;
        InterfaceC5328G interfaceC5328G = this.f36776f;
        if (interfaceC5328G == null || this.f36777g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f36771a = interfaceC5328G.getContext();
        boolean z10 = (this.f36776f.s() & 4) != 0;
        if (z10) {
            this.f36781k = true;
        }
        C5056a c5056aB = C5056a.b(this.f36771a);
        I(c5056aB.a() || z10);
        G(c5056aB.e());
        TypedArray typedArrayObtainStyledAttributes = this.f36771a.obtainStyledAttributes(null, h.j.f36046a, AbstractC4262a.f35794c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.f36096k, false)) {
            H(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.f36086i, 0);
        if (dimensionPixelSize != 0) {
            F(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void D(boolean z10) {
        E(z10 ? 4 : 0, 4);
    }

    public void E(int i10, int i11) {
        int iS = this.f36776f.s();
        if ((i11 & 4) != 0) {
            this.f36781k = true;
        }
        this.f36776f.i((i10 & i11) | ((~i11) & iS));
    }

    public void F(float f10) {
        E.m0(this.f36775e, f10);
    }

    public final void G(boolean z10) {
        this.f36787q = z10;
        if (z10) {
            this.f36775e.setTabContainer(null);
            this.f36776f.p(null);
        } else {
            this.f36776f.p(null);
            this.f36775e.setTabContainer(null);
        }
        boolean z11 = false;
        boolean z12 = A() == 2;
        this.f36776f.n(!this.f36787q && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f36774d;
        if (!this.f36787q && z12) {
            z11 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    public void H(boolean z10) {
        if (z10 && !this.f36774d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f36796z = z10;
        this.f36774d.setHideOnContentScrollEnabled(z10);
    }

    public void I(boolean z10) {
        this.f36776f.l(z10);
    }

    public final boolean J() {
        return this.f36775e.isLaidOut();
    }

    public final void K() {
        if (this.f36792v) {
            return;
        }
        this.f36792v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f36774d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        L(false);
    }

    public final void L(boolean z10) {
        if (v(this.f36790t, this.f36791u, this.f36792v)) {
            if (this.f36793w) {
                return;
            }
            this.f36793w = true;
            y(z10);
            return;
        }
        if (this.f36793w) {
            this.f36793w = false;
            x(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f36791u) {
            this.f36791u = false;
            L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f36789s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f36791u) {
            return;
        }
        this.f36791u = true;
        L(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        n.h hVar = this.f36794x;
        if (hVar != null) {
            hVar.a();
            this.f36794x = null;
        }
    }

    @Override // i.AbstractC4308a
    public boolean g() {
        InterfaceC5328G interfaceC5328G = this.f36776f;
        if (interfaceC5328G == null || !interfaceC5328G.h()) {
            return false;
        }
        this.f36776f.collapseActionView();
        return true;
    }

    @Override // i.AbstractC4308a
    public void h(boolean z10) {
        if (z10 == this.f36785o) {
            return;
        }
        this.f36785o = z10;
        if (this.f36786p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.a.a(this.f36786p.get(0));
        throw null;
    }

    @Override // i.AbstractC4308a
    public int i() {
        return this.f36776f.s();
    }

    @Override // i.AbstractC4308a
    public Context j() {
        if (this.f36772b == null) {
            TypedValue typedValue = new TypedValue();
            this.f36771a.getTheme().resolveAttribute(AbstractC4262a.f35796e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f36772b = new ContextThemeWrapper(this.f36771a, i10);
            } else {
                this.f36772b = this.f36771a;
            }
        }
        return this.f36772b;
    }

    @Override // i.AbstractC4308a
    public void l(Configuration configuration) {
        G(C5056a.b(this.f36771a).e());
    }

    @Override // i.AbstractC4308a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f36782l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f36788r = i10;
    }

    @Override // i.AbstractC4308a
    public void q(boolean z10) {
        if (this.f36781k) {
            return;
        }
        D(z10);
    }

    @Override // i.AbstractC4308a
    public void r(boolean z10) {
        n.h hVar;
        this.f36795y = z10;
        if (z10 || (hVar = this.f36794x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // i.AbstractC4308a
    public void s(CharSequence charSequence) {
        this.f36776f.setWindowTitle(charSequence);
    }

    @Override // i.AbstractC4308a
    public AbstractC5057b t(AbstractC5057b.a aVar) {
        d dVar = this.f36782l;
        if (dVar != null) {
            dVar.c();
        }
        this.f36774d.setHideOnContentScrollEnabled(false);
        this.f36777g.k();
        d dVar2 = new d(this.f36777g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f36782l = dVar2;
        dVar2.k();
        this.f36777g.h(dVar2);
        u(true);
        return dVar2;
    }

    public void u(boolean z10) {
        M mF;
        M mF2;
        if (z10) {
            K();
        } else {
            B();
        }
        if (!J()) {
            if (z10) {
                this.f36776f.r(4);
                this.f36777g.setVisibility(0);
                return;
            } else {
                this.f36776f.r(0);
                this.f36777g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            mF = this.f36776f.k(4, 100L);
            mF2 = this.f36777g.f(0, 200L);
        } else {
            M mK = this.f36776f.k(0, 200L);
            mF = this.f36777g.f(8, 100L);
            mF2 = mK;
        }
        n.h hVar = new n.h();
        hVar.d(mF, mF2);
        hVar.h();
    }

    public void w() {
        AbstractC5057b.a aVar = this.f36784n;
        if (aVar != null) {
            aVar.d(this.f36783m);
            this.f36783m = null;
            this.f36784n = null;
        }
    }

    public void x(boolean z10) {
        View view;
        n.h hVar = this.f36794x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f36788r != 0 || (!this.f36795y && !z10)) {
            this.f36768A.b(null);
            return;
        }
        this.f36775e.setAlpha(1.0f);
        this.f36775e.setTransitioning(true);
        n.h hVar2 = new n.h();
        float f10 = -this.f36775e.getHeight();
        if (z10) {
            this.f36775e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        M mL = E.e(this.f36775e).l(f10);
        mL.j(this.f36770C);
        hVar2.c(mL);
        if (this.f36789s && (view = this.f36778h) != null) {
            hVar2.c(E.e(view).l(f10));
        }
        hVar2.f(f36766D);
        hVar2.e(250L);
        hVar2.g(this.f36768A);
        this.f36794x = hVar2;
        hVar2.h();
    }

    public void y(boolean z10) {
        View view;
        View view2;
        n.h hVar = this.f36794x;
        if (hVar != null) {
            hVar.a();
        }
        this.f36775e.setVisibility(0);
        if (this.f36788r == 0 && (this.f36795y || z10)) {
            this.f36775e.setTranslationY(0.0f);
            float f10 = -this.f36775e.getHeight();
            if (z10) {
                this.f36775e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f36775e.setTranslationY(f10);
            n.h hVar2 = new n.h();
            M mL = E.e(this.f36775e).l(0.0f);
            mL.j(this.f36770C);
            hVar2.c(mL);
            if (this.f36789s && (view2 = this.f36778h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(E.e(this.f36778h).l(0.0f));
            }
            hVar2.f(f36767E);
            hVar2.e(250L);
            hVar2.g(this.f36769B);
            this.f36794x = hVar2;
            hVar2.h();
        } else {
            this.f36775e.setAlpha(1.0f);
            this.f36775e.setTranslationY(0.0f);
            if (this.f36789s && (view = this.f36778h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f36769B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f36774d;
        if (actionBarOverlayLayout != null) {
            E.c0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC5328G z(View view) {
        if (view instanceof InterfaceC5328G) {
            return (InterfaceC5328G) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    public s(Dialog dialog) {
        C(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
