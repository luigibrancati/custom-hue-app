package n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n.AbstractC5057b;

/* JADX INFO: renamed from: n.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5060e extends AbstractC5057b implements e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f40412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f40413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC5057b.a f40414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f40415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f40418i;

    public C5060e(Context context, ActionBarContextView actionBarContextView, AbstractC5057b.a aVar, boolean z10) {
        this.f40412c = context;
        this.f40413d = actionBarContextView;
        this.f40414e = aVar;
        androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f40418i = eVarT;
        eVarT.S(this);
        this.f40417h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f40414e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f40413d.l();
    }

    @Override // n.AbstractC5057b
    public void c() {
        if (this.f40416g) {
            return;
        }
        this.f40416g = true;
        this.f40414e.d(this);
    }

    @Override // n.AbstractC5057b
    public View d() {
        WeakReference weakReference = this.f40415f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.AbstractC5057b
    public Menu e() {
        return this.f40418i;
    }

    @Override // n.AbstractC5057b
    public MenuInflater f() {
        return new C5062g(this.f40413d.getContext());
    }

    @Override // n.AbstractC5057b
    public CharSequence g() {
        return this.f40413d.getSubtitle();
    }

    @Override // n.AbstractC5057b
    public CharSequence i() {
        return this.f40413d.getTitle();
    }

    @Override // n.AbstractC5057b
    public void k() {
        this.f40414e.b(this, this.f40418i);
    }

    @Override // n.AbstractC5057b
    public boolean l() {
        return this.f40413d.j();
    }

    @Override // n.AbstractC5057b
    public void m(View view) {
        this.f40413d.setCustomView(view);
        this.f40415f = view != null ? new WeakReference(view) : null;
    }

    @Override // n.AbstractC5057b
    public void n(int i10) {
        o(this.f40412c.getString(i10));
    }

    @Override // n.AbstractC5057b
    public void o(CharSequence charSequence) {
        this.f40413d.setSubtitle(charSequence);
    }

    @Override // n.AbstractC5057b
    public void q(int i10) {
        r(this.f40412c.getString(i10));
    }

    @Override // n.AbstractC5057b
    public void r(CharSequence charSequence) {
        this.f40413d.setTitle(charSequence);
    }

    @Override // n.AbstractC5057b
    public void s(boolean z10) {
        super.s(z10);
        this.f40413d.setTitleOptional(z10);
    }
}
