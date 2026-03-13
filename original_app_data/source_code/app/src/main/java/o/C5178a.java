package o;

import Y0.AbstractC2548b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5178a implements Q0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f41008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f41009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f41010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f41011g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f41013i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f41015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f41016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f41017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f41018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f41019o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41012h = RecognitionOptions.AZTEC;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41014j = RecognitionOptions.AZTEC;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f41020p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f41021q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41022r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41023s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f41024t = 16;

    public C5178a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f41016l = context;
        this.f41005a = i11;
        this.f41006b = i10;
        this.f41007c = i13;
        this.f41008d = charSequence;
    }

    @Override // Q0.b
    public AbstractC2548b a() {
        return null;
    }

    @Override // Q0.b
    public Q0.b b(AbstractC2548b abstractC2548b) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f41015k;
        if (drawable != null) {
            if (this.f41022r || this.f41023s) {
                Drawable drawableL = P0.a.l(drawable);
                this.f41015k = drawableL;
                Drawable drawableMutate = drawableL.mutate();
                this.f41015k = drawableMutate;
                if (this.f41022r) {
                    P0.a.i(drawableMutate, this.f41020p);
                }
                if (this.f41023s) {
                    P0.a.j(this.f41015k, this.f41021q);
                }
            }
        }
    }

    @Override // Q0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // Q0.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Q0.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // Q0.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Q0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // Q0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // Q0.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Q0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // Q0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // Q0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f41014j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f41013i;
    }

    @Override // Q0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f41018n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f41006b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f41015k;
    }

    @Override // Q0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f41020p;
    }

    @Override // Q0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f41021q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f41010f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f41005a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // Q0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f41012h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f41011g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f41007c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f41008d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f41009e;
        return charSequence != null ? charSequence : this.f41008d;
    }

    @Override // Q0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f41019o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // Q0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f41024t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f41024t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f41024t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f41024t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f41013i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f41024t = (z10 ? 1 : 0) | (this.f41024t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f41024t = (z10 ? 2 : 0) | (this.f41024t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f41024t = (z10 ? 16 : 0) | (this.f41024t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f41015k = drawable;
        c();
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f41020p = colorStateList;
        this.f41022r = true;
        c();
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f41021q = mode;
        this.f41023s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f41010f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f41011g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f41017m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f41011g = c10;
        this.f41013i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f41008d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f41009e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f41024t = (this.f41024t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f41013i = Character.toLowerCase(c10);
        this.f41014j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public Q0.b setContentDescription(CharSequence charSequence) {
        this.f41018n = charSequence;
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f41011g = c10;
        this.f41012h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f41008d = this.f41016l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public Q0.b setTooltipText(CharSequence charSequence) {
        this.f41019o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f41015k = L0.a.f(this.f41016l, i10);
        c();
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f41011g = c10;
        this.f41012h = KeyEvent.normalizeMetaState(i10);
        this.f41013i = Character.toLowerCase(c11);
        this.f41014j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // Q0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
