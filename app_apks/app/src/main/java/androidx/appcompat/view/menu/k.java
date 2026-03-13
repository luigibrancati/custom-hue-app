package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import o.AbstractC5181d;
import p.C5335N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC5181d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f21636v = h.g.f35920m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f21638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f21639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5335N f21644i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f21647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f21648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f21649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.a f21650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f21651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21654s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21656u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f21645j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f21646k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21655t = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.a() || k.this.f21644i.A()) {
                return;
            }
            View view = k.this.f21649n;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.f21644i.show();
            }
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f21637b = context;
        this.f21638c = eVar;
        this.f21640e = z10;
        this.f21639d = new d(eVar, LayoutInflater.from(context), z10, f21636v);
        this.f21642g = i10;
        this.f21643h = i11;
        Resources resources = context.getResources();
        this.f21641f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.f35828b));
        this.f21648m = view;
        this.f21644i = new C5335N(context, null, i10, i11);
        eVar.c(this, context);
    }

    @Override // o.InterfaceC5183f
    public boolean a() {
        return !this.f21652q && this.f21644i.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        if (eVar != this.f21638c) {
            return;
        }
        dismiss();
        i.a aVar = this.f21650o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f21650o = aVar;
    }

    @Override // o.InterfaceC5183f
    public void dismiss() {
        if (a()) {
            this.f21644i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.f21637b, lVar, this.f21649n, this.f21640e, this.f21642g, this.f21643h);
            hVar.j(this.f21650o);
            hVar.g(AbstractC5181d.w(lVar));
            hVar.i(this.f21647l);
            this.f21647l = null;
            this.f21638c.e(false);
            int iB = this.f21644i.b();
            int iK = this.f21644i.k();
            if ((Gravity.getAbsoluteGravity(this.f21655t, this.f21648m.getLayoutDirection()) & 7) == 5) {
                iB += this.f21648m.getWidth();
            }
            if (hVar.n(iB, iK)) {
                i.a aVar = this.f21650o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(lVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        this.f21653r = false;
        d dVar = this.f21639d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // o.InterfaceC5183f
    public ListView n() {
        return this.f21644i.n();
    }

    @Override // o.AbstractC5181d
    public void o(View view) {
        this.f21648m = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f21652q = true;
        this.f21638c.close();
        ViewTreeObserver viewTreeObserver = this.f21651p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f21651p = this.f21649n.getViewTreeObserver();
            }
            this.f21651p.removeGlobalOnLayoutListener(this.f21645j);
            this.f21651p = null;
        }
        this.f21649n.removeOnAttachStateChangeListener(this.f21646k);
        PopupWindow.OnDismissListener onDismissListener = this.f21647l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.AbstractC5181d
    public void q(boolean z10) {
        this.f21639d.d(z10);
    }

    @Override // o.AbstractC5181d
    public void r(int i10) {
        this.f21655t = i10;
    }

    @Override // o.AbstractC5181d
    public void s(int i10) {
        this.f21644i.d(i10);
    }

    @Override // o.InterfaceC5183f
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // o.AbstractC5181d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f21647l = onDismissListener;
    }

    @Override // o.AbstractC5181d
    public void u(boolean z10) {
        this.f21656u = z10;
    }

    @Override // o.AbstractC5181d
    public void v(int i10) {
        this.f21644i.h(i10);
    }

    public final boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f21652q || (view = this.f21648m) == null) {
            return false;
        }
        this.f21649n = view;
        this.f21644i.J(this);
        this.f21644i.K(this);
        this.f21644i.I(true);
        View view2 = this.f21649n;
        boolean z10 = this.f21651p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f21651p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f21645j);
        }
        view2.addOnAttachStateChangeListener(this.f21646k);
        this.f21644i.C(view2);
        this.f21644i.F(this.f21655t);
        if (!this.f21653r) {
            this.f21654s = AbstractC5181d.m(this.f21639d, null, this.f21637b, this.f21641f);
            this.f21653r = true;
        }
        this.f21644i.E(this.f21654s);
        this.f21644i.H(2);
        this.f21644i.G(l());
        this.f21644i.show();
        ListView listViewN = this.f21644i.n();
        listViewN.setOnKeyListener(this);
        if (this.f21656u && this.f21638c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f21637b).inflate(h.g.f35919l, (ViewGroup) listViewN, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f21638c.x());
            }
            frameLayout.setEnabled(false);
            listViewN.addHeaderView(frameLayout, null, false);
        }
        this.f21644i.l(this.f21639d);
        this.f21644i.show();
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f21651p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f21651p = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f21651p.removeGlobalOnLayoutListener(kVar.f21645j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // o.AbstractC5181d
    public void j(e eVar) {
    }
}
