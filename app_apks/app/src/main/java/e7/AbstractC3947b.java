package e7;

import Y0.AbstractC2554h;
import Y0.E;
import Y0.S;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: renamed from: e7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3947b extends C3948c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f33789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f33790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33792g;

    public AbstractC3947b() {
        this.f33789d = new Rect();
        this.f33790e = new Rect();
        this.f33791f = 0;
    }

    public static int M(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // e7.C3948c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewH = H(coordinatorLayout.q(view));
        if (viewH == null) {
            super.F(coordinatorLayout, view, i10);
            this.f33791f = 0;
            return;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        Rect rect = this.f33789d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        S lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && E.t(coordinatorLayout) && !E.t(view)) {
            rect.left += lastWindowInsets.i();
            rect.right -= lastWindowInsets.j();
        }
        Rect rect2 = this.f33790e;
        AbstractC2554h.a(M(eVar.f22429c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int I10 = I(viewH);
        view.layout(rect2.left, rect2.top - I10, rect2.right, rect2.bottom - I10);
        this.f33791f = rect2.top - viewH.getBottom();
    }

    public abstract View H(List list);

    public final int I(View view) {
        if (this.f33792g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i10 = this.f33792g;
        return S0.a.c((int) (fJ * i10), 0, i10);
    }

    public float J(View view) {
        return 1.0f;
    }

    public int K(View view) {
        return view.getMeasuredHeight();
    }

    public final int L() {
        return this.f33791f;
    }

    public final void N(int i10) {
        this.f33792g = i10;
    }

    public boolean O() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewH;
        S lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewH = H(coordinatorLayout.q(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (E.t(viewH) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.k() + lastWindowInsets.h();
        }
        int iK = size + K(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (O()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iK -= measuredHeight;
        }
        coordinatorLayout.H(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iK, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public AbstractC3947b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33789d = new Rect();
        this.f33790e = new Rect();
        this.f33791f = 0;
    }
}
