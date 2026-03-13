package W0;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Spannable {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f17650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f17651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f17654e;

        public a(PrecomputedText.Params params) {
            this.f17650a = params.getTextPaint();
            this.f17651b = params.getTextDirection();
            this.f17652c = params.getBreakStrategy();
            this.f17653d = params.getHyphenationFrequency();
            this.f17654e = params;
        }

        public boolean a(a aVar) {
            if (this.f17652c == aVar.b() && this.f17653d == aVar.c() && this.f17650a.getTextSize() == aVar.e().getTextSize() && this.f17650a.getTextScaleX() == aVar.e().getTextScaleX() && this.f17650a.getTextSkewX() == aVar.e().getTextSkewX() && this.f17650a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f17650a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f17650a.getFlags() == aVar.e().getFlags() && this.f17650a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f17650a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f17650a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f17652c;
        }

        public int c() {
            return this.f17653d;
        }

        public TextDirectionHeuristic d() {
            return this.f17651b;
        }

        public TextPaint e() {
            return this.f17650a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f17651b == aVar.d();
        }

        public int hashCode() {
            return X0.c.b(Float.valueOf(this.f17650a.getTextSize()), Float.valueOf(this.f17650a.getTextScaleX()), Float.valueOf(this.f17650a.getTextSkewX()), Float.valueOf(this.f17650a.getLetterSpacing()), Integer.valueOf(this.f17650a.getFlags()), this.f17650a.getTextLocales(), this.f17650a.getTypeface(), Boolean.valueOf(this.f17650a.isElegantTextHeight()), this.f17651b, Integer.valueOf(this.f17652c), Integer.valueOf(this.f17653d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f17650a.getTextSize());
            sb2.append(", textScaleX=" + this.f17650a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f17650a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f17650a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f17650a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f17650a.getTextLocales());
            sb2.append(", typeface=" + this.f17650a.getTypeface());
            sb2.append(", variationSettings=" + this.f17650a.getFontVariationSettings());
            sb2.append(", textDir=" + this.f17651b);
            sb2.append(", breakStrategy=" + this.f17652c);
            sb2.append(", hyphenationFrequency=" + this.f17653d);
            sb2.append("}");
            return sb2.toString();
        }
    }
}
