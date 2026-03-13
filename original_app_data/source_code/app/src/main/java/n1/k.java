package n1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC5074e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Paint f40515g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextPaint f40516f;

    public k(C5079j c5079j) {
        super(c5079j);
    }

    public static Paint e() {
        if (f40515g == null) {
            TextPaint textPaint = new TextPaint();
            f40515g = textPaint;
            textPaint.setColor(androidx.emoji2.text.c.c().d());
            f40515g.setStyle(Paint.Style.FILL);
        }
        return f40515g;
    }

    public final TextPaint c(CharSequence charSequence, int i10, int i11, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f40516f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f40516f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    public void d(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaintC = c(charSequence, i10, i11, paint);
        if (textPaintC != null && textPaintC.bgColor != 0) {
            d(canvas, textPaintC, f10, f10 + b(), i12, i14);
        }
        Paint paint2 = textPaintC;
        if (androidx.emoji2.text.c.c().j()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, e());
        }
        C5079j c5079jA = a();
        float f11 = i13;
        if (paint2 == null) {
            paint2 = paint;
        }
        c5079jA.a(canvas, f10, f11, paint2);
    }
}
