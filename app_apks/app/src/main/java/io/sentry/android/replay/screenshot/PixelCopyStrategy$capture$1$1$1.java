package io.sentry.android.replay.screenshot;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4205s;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "node", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "invoke", "(Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class PixelCopyStrategy$capture$1$1$1 extends v implements l {
    final /* synthetic */ Canvas $canvas;
    final /* synthetic */ List<Rect> $debugMasks;
    final /* synthetic */ PixelCopyStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelCopyStrategy$capture$1$1$1(PixelCopyStrategy pixelCopyStrategy, List<Rect> list, Canvas canvas) {
        super(1);
        this.this$0 = pixelCopyStrategy;
        this.$debugMasks = list;
        this.$canvas = canvas;
    }

    @Override // vc.l
    public final Boolean invoke(ViewHierarchyNode node) {
        C4034q c4034qA;
        Integer dominantColor;
        AbstractC4862t.e(node, "node");
        if (node.getShouldMask() && node.getWidth() > 0 && node.getHeight() > 0) {
            if (node.getVisibleRect() == null) {
                return Boolean.FALSE;
            }
            if (node instanceof ViewHierarchyNode.ImageViewHierarchyNode) {
                List listD = C4205s.d(node.getVisibleRect());
                PixelCopyStrategy pixelCopyStrategy = this.this$0;
                c4034qA = AbstractC4040w.a(listD, Integer.valueOf(pixelCopyStrategy.dominantColorForRect(pixelCopyStrategy.screenshot, node.getVisibleRect())));
            } else {
                if (node instanceof ViewHierarchyNode.TextViewHierarchyNode) {
                    ViewHierarchyNode.TextViewHierarchyNode textViewHierarchyNode = (ViewHierarchyNode.TextViewHierarchyNode) node;
                    TextLayout layout = textViewHierarchyNode.getLayout();
                    c4034qA = AbstractC4040w.a(ViewsKt.getVisibleRects(textViewHierarchyNode.getLayout(), node.getVisibleRect(), textViewHierarchyNode.getPaddingLeft(), textViewHierarchyNode.getPaddingTop()), Integer.valueOf(((layout == null || (dominantColor = layout.getDominantTextColor()) == null) && (dominantColor = textViewHierarchyNode.getDominantColor()) == null) ? -16777216 : dominantColor.intValue()));
                } else {
                    c4034qA = AbstractC4040w.a(C4205s.d(node.getVisibleRect()), -16777216);
                }
            }
            List list = (List) c4034qA.a();
            this.this$0.getMaskingPaint().setColor(((Number) c4034qA.b()).intValue());
            Canvas canvas = this.$canvas;
            PixelCopyStrategy pixelCopyStrategy2 = this.this$0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, pixelCopyStrategy2.getMaskingPaint());
            }
            if (this.this$0.options.getReplayController().isDebugMaskingOverlayEnabled()) {
                this.$debugMasks.addAll(list);
            }
        }
        return Boolean.TRUE;
    }
}
