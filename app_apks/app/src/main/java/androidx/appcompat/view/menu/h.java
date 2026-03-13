package androidx.appcompat.view.menu;

import Y0.AbstractC2554h;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import o.AbstractC5181d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f21624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f21628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f21631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC5181d f21632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f21633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f21634l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    public h(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public final AbstractC5181d a() {
        Display defaultDisplay = ((WindowManager) this.f21623a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC5181d bVar = Math.min(point.x, point.y) >= this.f21623a.getResources().getDimensionPixelSize(h.d.f35827a) ? new b(this.f21623a, this.f21628f, this.f21626d, this.f21627e, this.f21625c) : new k(this.f21623a, this.f21624b, this.f21628f, this.f21626d, this.f21627e, this.f21625c);
        bVar.j(this.f21624b);
        bVar.t(this.f21634l);
        bVar.o(this.f21628f);
        bVar.d(this.f21631i);
        bVar.q(this.f21630h);
        bVar.r(this.f21629g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f21632j.dismiss();
        }
    }

    public AbstractC5181d c() {
        if (this.f21632j == null) {
            this.f21632j = a();
        }
        return this.f21632j;
    }

    public boolean d() {
        AbstractC5181d abstractC5181d = this.f21632j;
        return abstractC5181d != null && abstractC5181d.a();
    }

    public void e() {
        this.f21632j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f21633k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f21628f = view;
    }

    public void g(boolean z10) {
        this.f21630h = z10;
        AbstractC5181d abstractC5181d = this.f21632j;
        if (abstractC5181d != null) {
            abstractC5181d.q(z10);
        }
    }

    public void h(int i10) {
        this.f21629g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f21633k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.f21631i = aVar;
        AbstractC5181d abstractC5181d = this.f21632j;
        if (abstractC5181d != null) {
            abstractC5181d.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i10, int i11, boolean z10, boolean z11) {
        AbstractC5181d abstractC5181dC = c();
        abstractC5181dC.u(z11);
        if (z10) {
            if ((AbstractC2554h.b(this.f21629g, this.f21628f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f21628f.getWidth();
            }
            abstractC5181dC.s(i10);
            abstractC5181dC.v(i11);
            int i12 = (int) ((this.f21623a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC5181dC.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        abstractC5181dC.show();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f21628f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f21628f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public h(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f21629g = 8388611;
        this.f21634l = new a();
        this.f21623a = context;
        this.f21624b = eVar;
        this.f21628f = view;
        this.f21625c = z10;
        this.f21626d = i10;
        this.f21627e = i11;
    }
}
