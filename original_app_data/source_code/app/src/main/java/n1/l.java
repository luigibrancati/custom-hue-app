package n1;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40517a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f40518b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public abstract boolean a(CharSequence charSequence);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends b {
        @Override // n1.l.b
        public boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof W0.b);
        }
    }

    public l(Spannable spannable) {
        this.f40518b = spannable;
    }

    public static b c() {
        return new c();
    }

    public final void a() {
        Spannable spannable = this.f40518b;
        if (!this.f40517a && c().a(spannable)) {
            this.f40518b = new SpannableString(spannable);
        }
        this.f40517a = true;
    }

    public Spannable b() {
        return this.f40518b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f40518b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f40518b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f40518b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f40518b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f40518b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f40518b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f40518b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f40518b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f40518b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f40518b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f40518b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f40518b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f40518b.toString();
    }

    public l(CharSequence charSequence) {
        this.f40518b = new SpannableString(charSequence);
    }
}
