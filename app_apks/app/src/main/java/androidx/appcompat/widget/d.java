package androidx.appcompat.widget;

import Y0.E;
import Y0.M;
import Y0.O;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.i;
import h.AbstractC4262a;
import h.e;
import h.f;
import h.h;
import h.j;
import j.AbstractC4666a;
import o.C5178a;
import p.InterfaceC5328G;
import p.W;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC5328G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f21910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f21912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f21913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f21914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f21915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f21916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f21918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f21919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f21920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window.Callback f21921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.a f21923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f21926q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5178a f21927a;

        public a() {
            this.f21927a = new C5178a(d.this.f21910a.getContext(), 0, R.id.home, 0, 0, d.this.f21918i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f21921l;
            if (callback == null || !dVar.f21922m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f21927a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f21929a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f21930b;

        public b(int i10) {
            this.f21930b = i10;
        }

        @Override // Y0.O, Y0.N
        public void a(View view) {
            this.f21929a = true;
        }

        @Override // Y0.O, Y0.N
        public void b(View view) {
            if (this.f21929a) {
                return;
            }
            d.this.f21910a.setVisibility(this.f21930b);
        }

        @Override // Y0.O, Y0.N
        public void c(View view) {
            d.this.f21910a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.f35925a, e.f35864n);
    }

    public void A(Drawable drawable) {
        this.f21916g = drawable;
        F();
    }

    public void B(CharSequence charSequence) {
        this.f21919j = charSequence;
        if ((this.f21911b & 8) != 0) {
            this.f21910a.setSubtitle(charSequence);
        }
    }

    public void C(CharSequence charSequence) {
        this.f21917h = true;
        D(charSequence);
    }

    public final void D(CharSequence charSequence) {
        this.f21918i = charSequence;
        if ((this.f21911b & 8) != 0) {
            this.f21910a.setTitle(charSequence);
            if (this.f21917h) {
                E.i0(this.f21910a.getRootView(), charSequence);
            }
        }
    }

    public final void E() {
        if ((this.f21911b & 4) != 0) {
            if (TextUtils.isEmpty(this.f21920k)) {
                this.f21910a.setNavigationContentDescription(this.f21925p);
            } else {
                this.f21910a.setNavigationContentDescription(this.f21920k);
            }
        }
    }

    public final void F() {
        if ((this.f21911b & 4) == 0) {
            this.f21910a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f21910a;
        Drawable drawable = this.f21916g;
        if (drawable == null) {
            drawable = this.f21926q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void G() {
        Drawable drawable;
        int i10 = this.f21911b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f21915f) == null) {
            drawable = this.f21914e;
        }
        this.f21910a.setLogo(drawable);
    }

    @Override // p.InterfaceC5328G
    public boolean a() {
        return this.f21910a.d();
    }

    @Override // p.InterfaceC5328G
    public boolean b() {
        return this.f21910a.w();
    }

    @Override // p.InterfaceC5328G
    public boolean c() {
        return this.f21910a.P();
    }

    @Override // p.InterfaceC5328G
    public void collapseActionView() {
        this.f21910a.e();
    }

    @Override // p.InterfaceC5328G
    public void d(Menu menu, i.a aVar) {
        if (this.f21923n == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.f21910a.getContext());
            this.f21923n = aVar2;
            aVar2.p(f.f35888g);
        }
        this.f21923n.d(aVar);
        this.f21910a.K((androidx.appcompat.view.menu.e) menu, this.f21923n);
    }

    @Override // p.InterfaceC5328G
    public boolean e() {
        return this.f21910a.B();
    }

    @Override // p.InterfaceC5328G
    public void f() {
        this.f21922m = true;
    }

    @Override // p.InterfaceC5328G
    public boolean g() {
        return this.f21910a.A();
    }

    @Override // p.InterfaceC5328G
    public Context getContext() {
        return this.f21910a.getContext();
    }

    @Override // p.InterfaceC5328G
    public CharSequence getTitle() {
        return this.f21910a.getTitle();
    }

    @Override // p.InterfaceC5328G
    public boolean h() {
        return this.f21910a.v();
    }

    @Override // p.InterfaceC5328G
    public void i(int i10) {
        View view;
        int i11 = this.f21911b ^ i10;
        this.f21911b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i11 & 3) != 0) {
                G();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f21910a.setTitle(this.f21918i);
                    this.f21910a.setSubtitle(this.f21919j);
                } else {
                    this.f21910a.setTitle((CharSequence) null);
                    this.f21910a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f21913d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f21910a.addView(view);
            } else {
                this.f21910a.removeView(view);
            }
        }
    }

    @Override // p.InterfaceC5328G
    public int j() {
        return this.f21924o;
    }

    @Override // p.InterfaceC5328G
    public M k(int i10, long j10) {
        return E.e(this.f21910a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // p.InterfaceC5328G
    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p.InterfaceC5328G
    public void n(boolean z10) {
        this.f21910a.setCollapsible(z10);
    }

    @Override // p.InterfaceC5328G
    public void o() {
        this.f21910a.f();
    }

    @Override // p.InterfaceC5328G
    public void p(c cVar) {
        View view = this.f21912c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f21910a;
            if (parent == toolbar) {
                toolbar.removeView(this.f21912c);
            }
        }
        this.f21912c = cVar;
    }

    @Override // p.InterfaceC5328G
    public void q(int i10) {
        x(i10 != 0 ? AbstractC4666a.b(getContext(), i10) : null);
    }

    @Override // p.InterfaceC5328G
    public void r(int i10) {
        this.f21910a.setVisibility(i10);
    }

    @Override // p.InterfaceC5328G
    public int s() {
        return this.f21911b;
    }

    @Override // p.InterfaceC5328G
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? AbstractC4666a.b(getContext(), i10) : null);
    }

    @Override // p.InterfaceC5328G
    public void setWindowCallback(Window.Callback callback) {
        this.f21921l = callback;
    }

    @Override // p.InterfaceC5328G
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f21917h) {
            return;
        }
        D(charSequence);
    }

    @Override // p.InterfaceC5328G
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final int u() {
        if (this.f21910a.getNavigationIcon() == null) {
            return 11;
        }
        this.f21926q = this.f21910a.getNavigationIcon();
        return 15;
    }

    public void v(View view) {
        View view2 = this.f21913d;
        if (view2 != null && (this.f21911b & 16) != 0) {
            this.f21910a.removeView(view2);
        }
        this.f21913d = view;
        if (view == null || (this.f21911b & 16) == 0) {
            return;
        }
        this.f21910a.addView(view);
    }

    public void w(int i10) {
        if (i10 == this.f21925p) {
            return;
        }
        this.f21925p = i10;
        if (TextUtils.isEmpty(this.f21910a.getNavigationContentDescription())) {
            y(this.f21925p);
        }
    }

    public void x(Drawable drawable) {
        this.f21915f = drawable;
        G();
    }

    public void y(int i10) {
        z(i10 == 0 ? null : getContext().getString(i10));
    }

    public void z(CharSequence charSequence) {
        this.f21920k = charSequence;
        E();
    }

    public d(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f21924o = 0;
        this.f21925p = 0;
        this.f21910a = toolbar;
        this.f21918i = toolbar.getTitle();
        this.f21919j = toolbar.getSubtitle();
        this.f21917h = this.f21918i != null;
        this.f21916g = toolbar.getNavigationIcon();
        W wV = W.v(toolbar.getContext(), null, j.f36046a, AbstractC4262a.f35794c, 0);
        this.f21926q = wV.g(j.f36101l);
        if (z10) {
            CharSequence charSequenceP = wV.p(j.f36131r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                C(charSequenceP);
            }
            CharSequence charSequenceP2 = wV.p(j.f36121p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                B(charSequenceP2);
            }
            Drawable drawableG = wV.g(j.f36111n);
            if (drawableG != null) {
                x(drawableG);
            }
            Drawable drawableG2 = wV.g(j.f36106m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f21916g == null && (drawable = this.f21926q) != null) {
                A(drawable);
            }
            i(wV.k(j.f36081h, 0));
            int iN = wV.n(j.f36076g, 0);
            if (iN != 0) {
                v(LayoutInflater.from(this.f21910a.getContext()).inflate(iN, (ViewGroup) this.f21910a, false));
                i(this.f21911b | 16);
            }
            int iM = wV.m(j.f36091j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f21910a.getLayoutParams();
                layoutParams.height = iM;
                this.f21910a.setLayoutParams(layoutParams);
            }
            int iE = wV.e(j.f36071f, -1);
            int iE2 = wV.e(j.f36066e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f21910a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = wV.n(j.f36136s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f21910a;
                toolbar2.M(toolbar2.getContext(), iN2);
            }
            int iN3 = wV.n(j.f36126q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f21910a;
                toolbar3.L(toolbar3.getContext(), iN3);
            }
            int iN4 = wV.n(j.f36116o, 0);
            if (iN4 != 0) {
                this.f21910a.setPopupTheme(iN4);
            }
        } else {
            this.f21911b = u();
        }
        wV.x();
        w(i10);
        this.f21920k = this.f21910a.getNavigationContentDescription();
        this.f21910a.setNavigationOnClickListener(new a());
    }

    @Override // p.InterfaceC5328G
    public void setIcon(Drawable drawable) {
        this.f21914e = drawable;
        G();
    }

    @Override // p.InterfaceC5328G
    public void l(boolean z10) {
    }
}
