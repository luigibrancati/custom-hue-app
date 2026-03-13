package p1;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: p1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5380d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f42156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f f42157b;

    /* JADX INFO: renamed from: p1.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends c.f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference f42158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Reference f42159b;

        public a(TextView textView, C5380d c5380d) {
            this.f42158a = new WeakReference(textView);
            this.f42159b = new WeakReference(c5380d);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            Handler handler;
            super.b();
            TextView textView = (TextView) this.f42158a.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence charSequenceP;
            TextView textView = (TextView) this.f42158a.get();
            if (c(textView, (InputFilter) this.f42159b.get()) && textView.isAttachedToWindow() && text != (charSequenceP = androidx.emoji2.text.c.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceP);
                int selectionEnd = Selection.getSelectionEnd(charSequenceP);
                textView.setText(charSequenceP);
                if (charSequenceP instanceof Spannable) {
                    C5380d.b((Spannable) charSequenceP, selectionStart, selectionEnd);
                }
            }
        }
    }

    public C5380d(TextView textView) {
        this.f42156a = textView;
    }

    public static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    public c.f a() {
        if (this.f42157b == null) {
            this.f42157b = new a(this.f42156a, this);
        }
        return this.f42157b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r0 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence filter(java.lang.CharSequence r3, int r4, int r5, android.text.Spanned r6, int r7, int r8) {
        /*
            r2 = this;
            android.widget.TextView r0 = r2.f42156a
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L9
            goto L4a
        L9:
            androidx.emoji2.text.c r0 = androidx.emoji2.text.c.c()
            int r0 = r0.e()
            if (r0 == 0) goto L4b
            r1 = 1
            if (r0 == r1) goto L1a
            r4 = 3
            if (r0 == r4) goto L4b
            goto L4a
        L1a:
            if (r8 != 0) goto L2d
            if (r7 != 0) goto L2d
            int r6 = r6.length()
            if (r6 != 0) goto L2d
            android.widget.TextView r2 = r2.f42156a
            java.lang.CharSequence r2 = r2.getText()
            if (r3 != r2) goto L2d
            return r3
        L2d:
            if (r3 == 0) goto L4a
            if (r4 != 0) goto L38
            int r2 = r3.length()
            if (r5 != r2) goto L38
            goto L3c
        L38:
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
        L3c:
            androidx.emoji2.text.c r2 = androidx.emoji2.text.c.c()
            r4 = 0
            int r5 = r3.length()
            java.lang.CharSequence r2 = r2.q(r3, r4, r5)
            return r2
        L4a:
            return r3
        L4b:
            androidx.emoji2.text.c r4 = androidx.emoji2.text.c.c()
            androidx.emoji2.text.c$f r2 = r2.a()
            r4.t(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.C5380d.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
