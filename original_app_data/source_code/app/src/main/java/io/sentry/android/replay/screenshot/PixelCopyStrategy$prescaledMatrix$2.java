package io.sentry.android.replay.screenshot;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Matrix;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class PixelCopyStrategy$prescaledMatrix$2 extends v implements InterfaceC6082a {
    final /* synthetic */ PixelCopyStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelCopyStrategy$prescaledMatrix$2(PixelCopyStrategy pixelCopyStrategy) {
        super(0);
        this.this$0 = pixelCopyStrategy;
    }

    @Override // vc.InterfaceC6082a
    public final Matrix invoke() {
        Matrix matrix = new Matrix();
        PixelCopyStrategy pixelCopyStrategy = this.this$0;
        matrix.preScale(pixelCopyStrategy.config.getScaleFactorX(), pixelCopyStrategy.config.getScaleFactorY());
        return matrix;
    }
}
