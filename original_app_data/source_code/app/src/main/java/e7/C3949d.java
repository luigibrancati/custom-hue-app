package e7;

import Y0.E;
import android.view.View;

/* JADX INFO: renamed from: e7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3949d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f33796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33801f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33802g = true;

    public C3949d(View view) {
        this.f33796a = view;
    }

    public void a() {
        View view = this.f33796a;
        E.R(view, this.f33799d - (view.getTop() - this.f33797b));
        View view2 = this.f33796a;
        E.Q(view2, this.f33800e - (view2.getLeft() - this.f33798c));
    }

    public int b() {
        return this.f33799d;
    }

    public void c() {
        this.f33797b = this.f33796a.getTop();
        this.f33798c = this.f33796a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f33802g || this.f33800e == i10) {
            return false;
        }
        this.f33800e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f33801f || this.f33799d == i10) {
            return false;
        }
        this.f33799d = i10;
        a();
        return true;
    }
}
