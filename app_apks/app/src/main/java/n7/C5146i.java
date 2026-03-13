package n7;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: n7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5146i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f40709n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f40710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f40711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40712c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40714e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40721l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40713d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Layout.Alignment f40715f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40716g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f40717h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f40718i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40719j = f40709n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40720k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f40722m = null;

    /* JADX INFO: renamed from: n7.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends Exception {
    }

    public C5146i(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f40710a = charSequence;
        this.f40711b = textPaint;
        this.f40712c = i10;
        this.f40714e = charSequence.length();
    }

    public static C5146i b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new C5146i(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f40710a == null) {
            this.f40710a = "";
        }
        int iMax = Math.max(0, this.f40712c);
        CharSequence charSequenceEllipsize = this.f40710a;
        if (this.f40716g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f40711b, iMax, this.f40722m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f40714e);
        this.f40714e = iMin;
        if (this.f40721l && this.f40716g == 1) {
            this.f40715f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f40713d, iMin, this.f40711b, iMax);
        builderObtain.setAlignment(this.f40715f);
        builderObtain.setIncludePad(this.f40720k);
        builderObtain.setTextDirection(this.f40721l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f40722m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f40716g);
        float f10 = this.f40717h;
        if (f10 != 0.0f || this.f40718i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f40718i);
        }
        if (this.f40716g > 1) {
            builderObtain.setHyphenationFrequency(this.f40719j);
        }
        return builderObtain.build();
    }

    public C5146i c(Layout.Alignment alignment) {
        this.f40715f = alignment;
        return this;
    }

    public C5146i d(TextUtils.TruncateAt truncateAt) {
        this.f40722m = truncateAt;
        return this;
    }

    public C5146i e(int i10) {
        this.f40719j = i10;
        return this;
    }

    public C5146i f(boolean z10) {
        this.f40720k = z10;
        return this;
    }

    public C5146i g(boolean z10) {
        this.f40721l = z10;
        return this;
    }

    public C5146i h(float f10, float f11) {
        this.f40717h = f10;
        this.f40718i = f11;
        return this;
    }

    public C5146i i(int i10) {
        this.f40716g = i10;
        return this;
    }
}
