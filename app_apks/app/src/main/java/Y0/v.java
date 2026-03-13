package Y0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19669b;

    public v(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f19669b | this.f19668a;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f19669b = i10;
        } else {
            this.f19668a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f19669b = 0;
        } else {
            this.f19668a = 0;
        }
    }
}
