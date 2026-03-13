package androidx.appcompat.view.menu;

import Y0.AbstractC2548b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import j.AbstractC4666a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Q0.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f21591A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AbstractC2548b f21592B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f21593C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f21595E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f21600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f21601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f21602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f21603h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f21605j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f21607l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f21609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f21610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f21611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f21612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f21613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f21614s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f21621z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21604i = RecognitionOptions.AZTEC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21606k = RecognitionOptions.AZTEC;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21608m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f21615t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f21616u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21617v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21618w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f21619x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21620y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f21594D = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements AbstractC2548b.InterfaceC0246b {
        public a() {
        }

        @Override // Y0.AbstractC2548b.InterfaceC0246b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f21609n.K(gVar);
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f21609n = eVar;
        this.f21596a = i11;
        this.f21597b = i10;
        this.f21598c = i12;
        this.f21599d = i13;
        this.f21600e = charSequence;
        this.f21621z = i14;
    }

    public static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public boolean A() {
        return this.f21609n.I() && g() != 0;
    }

    public boolean B() {
        return (this.f21621z & 4) == 4;
    }

    @Override // Q0.b
    public AbstractC2548b a() {
        return this.f21592B;
    }

    @Override // Q0.b
    public Q0.b b(AbstractC2548b abstractC2548b) {
        AbstractC2548b abstractC2548b2 = this.f21592B;
        if (abstractC2548b2 != null) {
            abstractC2548b2.g();
        }
        this.f21591A = null;
        this.f21592B = abstractC2548b;
        this.f21609n.L(true);
        AbstractC2548b abstractC2548b3 = this.f21592B;
        if (abstractC2548b3 != null) {
            abstractC2548b3.i(new a());
        }
        return this;
    }

    public void c() {
        this.f21609n.J(this);
    }

    @Override // Q0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f21621z & 8) == 0) {
            return false;
        }
        if (this.f21591A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21593C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f21609n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f21619x && (this.f21617v || this.f21618w)) {
            drawable = P0.a.l(drawable).mutate();
            if (this.f21617v) {
                P0.a.i(drawable, this.f21615t);
            }
            if (this.f21618w) {
                P0.a.j(drawable, this.f21616u);
            }
            this.f21619x = false;
        }
        return drawable;
    }

    @Override // Q0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21593C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f21609n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f21599d;
    }

    public char g() {
        return this.f21609n.H() ? this.f21605j : this.f21603h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // Q0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f21591A;
        if (view != null) {
            return view;
        }
        AbstractC2548b abstractC2548b = this.f21592B;
        if (abstractC2548b == null) {
            return null;
        }
        View viewC = abstractC2548b.c(this);
        this.f21591A = viewC;
        return viewC;
    }

    @Override // Q0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f21606k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f21605j;
    }

    @Override // Q0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f21613r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f21597b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f21607l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f21608m == 0) {
            return null;
        }
        Drawable drawableB = AbstractC4666a.b(this.f21609n.u(), this.f21608m);
        this.f21608m = 0;
        this.f21607l = drawableB;
        return e(drawableB);
    }

    @Override // Q0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f21615t;
    }

    @Override // Q0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f21616u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f21602g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f21596a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f21595E;
    }

    @Override // Q0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f21604i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f21603h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f21598c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f21610o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f21600e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21601f;
        return charSequence != null ? charSequence : this.f21600e;
    }

    @Override // Q0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f21614s;
    }

    public String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f21609n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f21609n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(h.h.f35937m));
        }
        int i10 = this.f21609n.H() ? this.f21606k : this.f21604i;
        d(sb2, i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, resources.getString(h.h.f35933i));
        d(sb2, i10, RecognitionOptions.AZTEC, resources.getString(h.h.f35929e));
        d(sb2, i10, 2, resources.getString(h.h.f35928d));
        d(sb2, i10, 1, resources.getString(h.h.f35934j));
        d(sb2, i10, 4, resources.getString(h.h.f35936l));
        d(sb2, i10, 8, resources.getString(h.h.f35932h));
        if (cG == '\b') {
            sb2.append(resources.getString(h.h.f35930f));
        } else if (cG == '\n') {
            sb2.append(resources.getString(h.h.f35931g));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(h.h.f35935k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f21610o != null;
    }

    public CharSequence i(j.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // Q0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f21594D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f21620y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f21620y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f21620y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC2548b abstractC2548b = this.f21592B;
        return (abstractC2548b == null || !abstractC2548b.f()) ? (this.f21620y & 8) == 0 : (this.f21620y & 8) == 0 && this.f21592B.b();
    }

    public boolean j() {
        AbstractC2548b abstractC2548b;
        if ((this.f21621z & 8) != 0) {
            if (this.f21591A == null && (abstractC2548b = this.f21592B) != null) {
                this.f21591A = abstractC2548b.c(this);
            }
            if (this.f21591A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f21612q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f21609n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f21611p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f21602g != null) {
            try {
                this.f21609n.u().startActivity(this.f21602g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC2548b abstractC2548b = this.f21592B;
        return abstractC2548b != null && abstractC2548b.d();
    }

    public boolean l() {
        return (this.f21620y & 32) == 32;
    }

    public boolean m() {
        return (this.f21620y & 4) != 0;
    }

    public boolean n() {
        return (this.f21621z & 1) == 1;
    }

    public boolean o() {
        return (this.f21621z & 2) == 2;
    }

    @Override // Q0.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Q0.b setActionView(int i10) {
        Context contextU = this.f21609n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i10, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Q0.b setActionView(View view) {
        int i10;
        this.f21591A = view;
        this.f21592B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f21596a) > 0) {
            view.setId(i10);
        }
        this.f21609n.J(this);
        return this;
    }

    public void r(boolean z10) {
        this.f21594D = z10;
        this.f21609n.L(false);
    }

    public void s(boolean z10) {
        int i10 = this.f21620y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f21620y = i11;
        if (i10 != i11) {
            this.f21609n.L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f21605j == c10) {
            return this;
        }
        this.f21605j = Character.toLowerCase(c10);
        this.f21609n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f21620y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f21620y = i11;
        if (i10 != i11) {
            this.f21609n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f21620y & 4) != 0) {
            this.f21609n.U(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f21620y |= 16;
        } else {
            this.f21620y &= -17;
        }
        this.f21609n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f21608m = 0;
        this.f21607l = drawable;
        this.f21619x = true;
        this.f21609n.L(false);
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21615t = colorStateList;
        this.f21617v = true;
        this.f21619x = true;
        this.f21609n.L(false);
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21616u = mode;
        this.f21618w = true;
        this.f21619x = true;
        this.f21609n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f21602g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f21603h == c10) {
            return this;
        }
        this.f21603h = c10;
        this.f21609n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21593C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21612q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f21603h = c10;
        this.f21605j = Character.toLowerCase(c11);
        this.f21609n.L(false);
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f21621z = i10;
        this.f21609n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f21600e = charSequence;
        this.f21609n.L(false);
        l lVar = this.f21610o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21601f = charSequence;
        this.f21609n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f21609n.K(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f21620y = (z10 ? 4 : 0) | (this.f21620y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f21600e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f21620y |= 32;
        } else {
            this.f21620y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f21595E = contextMenuInfo;
    }

    @Override // Q0.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Q0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(l lVar) {
        this.f21610o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z10) {
        int i10 = this.f21620y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f21620y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f21609n.A();
    }

    @Override // android.view.MenuItem
    public Q0.b setContentDescription(CharSequence charSequence) {
        this.f21613r = charSequence;
        this.f21609n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public Q0.b setTooltipText(CharSequence charSequence) {
        this.f21614s = charSequence;
        this.f21609n.L(false);
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f21605j == c10 && this.f21606k == i10) {
            return this;
        }
        this.f21605j = Character.toLowerCase(c10);
        this.f21606k = KeyEvent.normalizeMetaState(i10);
        this.f21609n.L(false);
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f21603h == c10 && this.f21604i == i10) {
            return this;
        }
        this.f21603h = c10;
        this.f21604i = KeyEvent.normalizeMetaState(i10);
        this.f21609n.L(false);
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f21603h = c10;
        this.f21604i = KeyEvent.normalizeMetaState(i10);
        this.f21605j = Character.toLowerCase(c11);
        this.f21606k = KeyEvent.normalizeMetaState(i11);
        this.f21609n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f21607l = null;
        this.f21608m = i10;
        this.f21619x = true;
        this.f21609n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f21609n.u().getString(i10));
    }
}
