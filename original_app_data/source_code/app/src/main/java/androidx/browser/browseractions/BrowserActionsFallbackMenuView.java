package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import t.AbstractC5825a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21933b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21932a = getResources().getDimensionPixelOffset(AbstractC5825a.f44553b);
        this.f21933b = getResources().getDimensionPixelOffset(AbstractC5825a.f44552a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f21932a * 2), this.f21933b), 1073741824), i11);
    }
}
