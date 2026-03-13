package com.braze.images;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f27775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f27776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f27777c;

    public f(BrazeViewBounds brazeViewBounds, ImageView imageView, Bitmap bitmap) {
        this.f27775a = brazeViewBounds;
        this.f27776b = imageView;
        this.f27777c = bitmap;
    }

    public static final void a(Bitmap bitmap, ImageView imageView) {
        BrazeImageUtils.resizeImageViewToBitmapDimensions(bitmap, imageView);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        AbstractC4862t.e(v10, "v");
        if (this.f27775a == BrazeViewBounds.BASE_CARD_VIEW) {
            final ImageView imageView = this.f27776b;
            final Bitmap bitmap = this.f27777c;
            imageView.post(new Runnable() { // from class: b5.B
                @Override // java.lang.Runnable
                public final void run() {
                    com.braze.images.f.a(bitmap, imageView);
                }
            });
        }
        v10.removeOnLayoutChangeListener(this);
    }
}
