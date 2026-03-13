package e7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: e7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3948c extends CoordinatorLayout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3949d f33793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33795c;

    public C3948c() {
        this.f33794b = 0;
        this.f33795c = 0;
    }

    public int E() {
        C3949d c3949d = this.f33793a;
        if (c3949d != null) {
            return c3949d.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.G(view, i10);
    }

    public boolean G(int i10) {
        C3949d c3949d = this.f33793a;
        if (c3949d != null) {
            return c3949d.e(i10);
        }
        this.f33794b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f33793a == null) {
            this.f33793a = new C3949d(view);
        }
        this.f33793a.c();
        this.f33793a.a();
        int i11 = this.f33794b;
        if (i11 != 0) {
            this.f33793a.e(i11);
            this.f33794b = 0;
        }
        int i12 = this.f33795c;
        if (i12 == 0) {
            return true;
        }
        this.f33793a.d(i12);
        this.f33795c = 0;
        return true;
    }

    public C3948c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33794b = 0;
        this.f33795c = 0;
    }
}
