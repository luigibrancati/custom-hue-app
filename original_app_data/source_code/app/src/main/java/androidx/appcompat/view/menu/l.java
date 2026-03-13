package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l extends e implements SubMenu {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f21659B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public g f21660C;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f21659B = eVar;
        this.f21660C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e D() {
        return this.f21659B.D();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean G() {
        return this.f21659B.G();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean H() {
        return this.f21659B.H();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f21659B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public void S(e.a aVar) {
        this.f21659B.S(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f21659B.f(gVar);
    }

    public Menu f0() {
        return this.f21659B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f21660C;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f21659B.h(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean k(g gVar) {
        return this.f21659B.k(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f21659B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.W(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Z(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f21660C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f21659B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.e
    public String t() {
        g gVar = this.f21660C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.V(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.Y(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f21660C.setIcon(i10);
        return this;
    }
}
