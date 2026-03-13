package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b implements c.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f22926b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f22927a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f22927a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = f22926b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return O0.c.a(this.f22927a, sbB.toString());
    }
}
