package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class SingleViewFakeWindowViewGroup extends ViewGroup {
    private final Rect childRect;
    private final Rect viewBounds;

    public SingleViewFakeWindowViewGroup(Context context) {
        super(context);
        this.viewBounds = new Rect();
        this.childRect = new Rect();
    }

    private static int atMost(int i10) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.viewBounds.set(i10, i11, i12, i13);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.viewBounds, layoutParams.x, layoutParams.y, this.childRect);
            Rect rect = this.childRect;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(atMost(i10), atMost(i11));
        }
        super.onMeasure(i10, i11);
    }
}
