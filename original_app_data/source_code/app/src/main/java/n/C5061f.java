package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import b0.J;
import java.util.ArrayList;
import n.AbstractC5057b;
import o.MenuC5182e;
import o.MenuItemC5180c;

/* JADX INFO: renamed from: n.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5061f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5057b f40420b;

    /* JADX INFO: renamed from: n.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements AbstractC5057b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f40421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f40422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f40423c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final J f40424d = new J();

        public a(Context context, ActionMode.Callback callback) {
            this.f40422b = context;
            this.f40421a = callback;
        }

        @Override // n.AbstractC5057b.a
        public boolean a(AbstractC5057b abstractC5057b, Menu menu) {
            return this.f40421a.onCreateActionMode(e(abstractC5057b), f(menu));
        }

        @Override // n.AbstractC5057b.a
        public boolean b(AbstractC5057b abstractC5057b, Menu menu) {
            return this.f40421a.onPrepareActionMode(e(abstractC5057b), f(menu));
        }

        @Override // n.AbstractC5057b.a
        public boolean c(AbstractC5057b abstractC5057b, MenuItem menuItem) {
            return this.f40421a.onActionItemClicked(e(abstractC5057b), new MenuItemC5180c(this.f40422b, (Q0.b) menuItem));
        }

        @Override // n.AbstractC5057b.a
        public void d(AbstractC5057b abstractC5057b) {
            this.f40421a.onDestroyActionMode(e(abstractC5057b));
        }

        public ActionMode e(AbstractC5057b abstractC5057b) {
            int size = this.f40423c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C5061f c5061f = (C5061f) this.f40423c.get(i10);
                if (c5061f != null && c5061f.f40420b == abstractC5057b) {
                    return c5061f;
                }
            }
            C5061f c5061f2 = new C5061f(this.f40422b, abstractC5057b);
            this.f40423c.add(c5061f2);
            return c5061f2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f40424d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC5182e menuC5182e = new MenuC5182e(this.f40422b, (Q0.a) menu);
            this.f40424d.put(menu, menuC5182e);
            return menuC5182e;
        }
    }

    public C5061f(Context context, AbstractC5057b abstractC5057b) {
        this.f40419a = context;
        this.f40420b = abstractC5057b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f40420b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f40420b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC5182e(this.f40419a, (Q0.a) this.f40420b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f40420b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f40420b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f40420b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f40420b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f40420b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f40420b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f40420b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f40420b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f40420b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f40420b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f40420b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f40420b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f40420b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f40420b.q(i10);
    }
}
