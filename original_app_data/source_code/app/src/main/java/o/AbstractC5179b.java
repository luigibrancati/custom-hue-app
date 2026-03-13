package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import b0.J;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5179b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J f41026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J f41027c;

    public AbstractC5179b(Context context) {
        this.f41025a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof Q0.b)) {
            return menuItem;
        }
        Q0.b bVar = (Q0.b) menuItem;
        if (this.f41026b == null) {
            this.f41026b = new J();
        }
        MenuItem menuItem2 = (MenuItem) this.f41026b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC5180c menuItemC5180c = new MenuItemC5180c(this.f41025a, bVar);
        this.f41026b.put(bVar, menuItemC5180c);
        return menuItemC5180c;
    }

    public final void e() {
        J j10 = this.f41026b;
        if (j10 != null) {
            j10.clear();
        }
        J j11 = this.f41027c;
        if (j11 != null) {
            j11.clear();
        }
    }

    public final void f(int i10) {
        if (this.f41026b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f41026b.size()) {
            if (((Q0.b) this.f41026b.f(i11)).getGroupId() == i10) {
                this.f41026b.h(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void g(int i10) {
        if (this.f41026b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f41026b.size(); i11++) {
            if (((Q0.b) this.f41026b.f(i11)).getItemId() == i10) {
                this.f41026b.h(i11);
                return;
            }
        }
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
