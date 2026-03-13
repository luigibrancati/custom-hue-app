package o;

import Y0.AbstractC2548b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import n.InterfaceC5058c;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemC5180c extends AbstractC5179b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q0.b f41028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f41029e;

    /* JADX INFO: renamed from: o.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC2548b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC2548b.InterfaceC0246b f41030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ActionProvider f41031e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f41031e = actionProvider;
        }

        @Override // Y0.AbstractC2548b
        public boolean a() {
            return this.f41031e.hasSubMenu();
        }

        @Override // Y0.AbstractC2548b
        public boolean b() {
            return this.f41031e.isVisible();
        }

        @Override // Y0.AbstractC2548b
        public View c(MenuItem menuItem) {
            return this.f41031e.onCreateActionView(menuItem);
        }

        @Override // Y0.AbstractC2548b
        public boolean d() {
            return this.f41031e.onPerformDefaultAction();
        }

        @Override // Y0.AbstractC2548b
        public void e(SubMenu subMenu) {
            this.f41031e.onPrepareSubMenu(MenuItemC5180c.this.d(subMenu));
        }

        @Override // Y0.AbstractC2548b
        public boolean f() {
            return this.f41031e.overridesItemVisibility();
        }

        @Override // Y0.AbstractC2548b
        public void i(AbstractC2548b.InterfaceC0246b interfaceC0246b) {
            this.f41030d = interfaceC0246b;
            ActionProvider actionProvider = this.f41031e;
            if (interfaceC0246b == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC2548b.InterfaceC0246b interfaceC0246b = this.f41030d;
            if (interfaceC0246b != null) {
                interfaceC0246b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* JADX INFO: renamed from: o.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends FrameLayout implements InterfaceC5058c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f41033a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f41033a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f41033a;
        }

        @Override // n.InterfaceC5058c
        public void onActionViewCollapsed() {
            this.f41033a.onActionViewCollapsed();
        }

        @Override // n.InterfaceC5058c
        public void onActionViewExpanded() {
            this.f41033a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: o.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class MenuItemOnActionExpandListenerC0547c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f41034a;

        public MenuItemOnActionExpandListenerC0547c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f41034a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f41034a.onMenuItemActionCollapse(MenuItemC5180c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f41034a.onMenuItemActionExpand(MenuItemC5180c.this.c(menuItem));
        }
    }

    /* JADX INFO: renamed from: o.c$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f41036a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f41036a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f41036a.onMenuItemClick(MenuItemC5180c.this.c(menuItem));
        }
    }

    public MenuItemC5180c(Context context, Q0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f41028d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f41028d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f41028d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC2548b abstractC2548bA = this.f41028d.a();
        if (abstractC2548bA instanceof a) {
            return ((a) abstractC2548bA).f41031e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f41028d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f41028d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f41028d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f41028d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f41028d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f41028d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f41028d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f41028d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f41028d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f41028d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f41028d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f41028d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f41028d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f41028d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f41028d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f41028d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f41028d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f41028d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f41029e == null) {
                this.f41029e = this.f41028d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f41029e.invoke(this.f41028d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f41028d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f41028d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f41028d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f41028d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f41028d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f41028d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f41025a, actionProvider);
        Q0.b bVar = this.f41028d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f41028d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f41028d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f41028d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f41028d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f41028d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f41028d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f41028d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f41028d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f41028d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f41028d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f41028d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f41028d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0547c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f41028d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f41028d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f41028d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f41028d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f41028d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f41028d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f41028d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f41028d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f41028d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f41028d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f41028d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f41028d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f41028d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f41028d.setActionView(i10);
        View actionView = this.f41028d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f41028d.setActionView(new b(actionView));
        }
        return this;
    }
}
