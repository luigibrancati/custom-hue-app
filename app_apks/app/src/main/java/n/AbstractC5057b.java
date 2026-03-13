package n;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: n.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5057b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f40404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40405b;

    /* JADX INFO: renamed from: n.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        boolean a(AbstractC5057b abstractC5057b, Menu menu);

        boolean b(AbstractC5057b abstractC5057b, Menu menu);

        boolean c(AbstractC5057b abstractC5057b, MenuItem menuItem);

        void d(AbstractC5057b abstractC5057b);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f40404a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f40405b;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f40404a = obj;
    }

    public abstract void q(int i10);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z10) {
        this.f40405b = z10;
    }
}
