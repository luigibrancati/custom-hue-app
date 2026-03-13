package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.braze.ui.R$styleable;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBoundedLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", Session.JsonKeys.ATTRS, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Lfc/H;", "onMeasure", "(II)V", "maxDefinedWidthPixels", "I", "minDefinedWidthPixels", "maxDefinedHeightPixels", "minDefinedHeightPixels", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class InAppMessageBoundedLayout extends RelativeLayout {
    private int maxDefinedHeightPixels;
    private int maxDefinedWidthPixels;
    private int minDefinedHeightPixels;
    private int minDefinedWidthPixels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC4862t.e(context, "context");
        int[] InAppMessageBoundedLayout = R$styleable.InAppMessageBoundedLayout;
        AbstractC4862t.d(InAppMessageBoundedLayout, "InAppMessageBoundedLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, InAppMessageBoundedLayout, 0, 0);
        this.maxDefinedWidthPixels = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxWidth, 0);
        this.minDefinedWidthPixels = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinWidth, 0);
        this.maxDefinedHeightPixels = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxHeight, 0);
        this.minDefinedHeightPixels = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i10 = this.minDefinedWidthPixels;
        if (i10 <= 0 || size >= i10) {
            int i11 = this.maxDefinedWidthPixels;
            if (i11 > 0 && size > i11) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.maxDefinedWidthPixels, View.MeasureSpec.getMode(widthMeasureSpec));
            }
        } else {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.minDefinedWidthPixels, View.MeasureSpec.getMode(widthMeasureSpec));
        }
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int i12 = this.minDefinedHeightPixels;
        if (i12 <= 0 || size2 >= i12) {
            int i13 = this.maxDefinedHeightPixels;
            if (i13 > 0 && size2 > i13) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.maxDefinedHeightPixels, View.MeasureSpec.getMode(heightMeasureSpec));
            }
        } else {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.minDefinedHeightPixels, View.MeasureSpec.getMode(heightMeasureSpec));
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
