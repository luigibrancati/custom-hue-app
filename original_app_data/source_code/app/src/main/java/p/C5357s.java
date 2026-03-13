package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: p.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5357s extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f41979b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41980a;

    public C5357s(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        W wV = W.v(context, attributeSet, h.j.f36040Y1, i10, i11);
        if (wV.s(h.j.f36049a2)) {
            b(wV.a(h.j.f36049a2, false));
        }
        setBackgroundDrawable(wV.g(h.j.f36044Z1));
        wV.x();
    }

    public final void b(boolean z10) {
        if (f41979b) {
            this.f41980a = z10;
        } else {
            c1.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f41979b && this.f41980a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f41979b && this.f41980a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f41979b && this.f41980a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
