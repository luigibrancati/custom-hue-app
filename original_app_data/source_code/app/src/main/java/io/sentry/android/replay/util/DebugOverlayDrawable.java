package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.fasterxml.jackson.core.JsonPointer;
import gc.C4206t;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&¨\u0006("}, d2 = {"Lio/sentry/android/replay/util/DebugOverlayDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "bottomRightLabel", "", "x", "y", "Lfc/H;", "drawTextWithOutline", "(Landroid/graphics/Canvas;Ljava/lang/String;FF)V", "draw", "(Landroid/graphics/Canvas;)V", "", ViewHierarchyNode.JsonKeys.ALPHA, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "", "Landroid/graphics/Rect;", "masks", "updateMasks", "(Ljava/util/List;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "padding", "F", "tmpRect", "Landroid/graphics/Rect;", "Ljava/util/List;", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebugOverlayDrawable extends Drawable {
    private static final float STROKE_WIDTH = 6.0f;
    private static final int TEXT_COLOR = -16777216;
    private static final int TEXT_OUTLINE_COLOR = -1;
    private static final float TEXT_SIZE = 32.0f;
    public static final int $stable = 8;
    private static final int maskBackgroundColor = Color.argb(32, 255, 20, 20);
    private static final int maskBorderColor = Color.argb(128, 255, 20, 20);
    private final Paint paint = new Paint(1);
    private final float padding = STROKE_WIDTH;
    private final Rect tmpRect = new Rect();
    private List<Rect> masks = C4206t.k();

    private final void drawTextWithOutline(Canvas canvas, String bottomRightLabel, float x10, float y10) {
        this.paint.setColor(-1);
        this.paint.setStyle(Paint.Style.STROKE);
        canvas.drawText(bottomRightLabel, x10, y10, this.paint);
        this.paint.setColor(TEXT_COLOR);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawText(bottomRightLabel, x10, y10, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC4862t.e(canvas, "canvas");
        this.paint.setTextSize(TEXT_SIZE);
        this.paint.setColor(TEXT_COLOR);
        this.paint.setStrokeWidth(STROKE_WIDTH);
        for (Rect rect : this.masks) {
            this.paint.setColor(maskBackgroundColor);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, this.paint);
            this.paint.setColor(maskBorderColor);
            this.paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, this.paint);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append(JsonPointer.SEPARATOR);
            sb2.append(rect.top);
            String string = sb2.toString();
            this.paint.getTextBounds(string, 0, string.length(), this.tmpRect);
            drawTextWithOutline(canvas, string, rect.left, rect.top);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rect.right);
            sb3.append(JsonPointer.SEPARATOR);
            sb3.append(rect.bottom);
            String string2 = sb3.toString();
            this.paint.getTextBounds(string2, 0, string2.length(), this.tmpRect);
            drawTextWithOutline(canvas, string2, rect.right - this.tmpRect.width(), rect.bottom + this.tmpRect.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void updateMasks(List<Rect> masks) {
        AbstractC4862t.e(masks, "masks");
        this.masks = masks;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
