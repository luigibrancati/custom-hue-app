package n1;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: n1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5074e extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5079j f40498b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f40497a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f40499c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f40500d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f40501e = 1.0f;

    public AbstractC5074e(C5079j c5079j) {
        X0.h.h(c5079j, "rasterizer cannot be null");
        this.f40498b = c5079j;
    }

    public final C5079j a() {
        return this.f40498b;
    }

    public final int b() {
        return this.f40499c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f40497a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f40497a;
        this.f40501e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f40498b.e();
        this.f40500d = (short) (this.f40498b.e() * this.f40501e);
        short sI = (short) (this.f40498b.i() * this.f40501e);
        this.f40499c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f40497a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
