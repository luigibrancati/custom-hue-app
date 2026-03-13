package p1;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: p1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5383g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f42167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f f42169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42170d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42171e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42172f = true;

    /* JADX INFO: renamed from: p1.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends c.f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference f42173a;

        public a(EditText editText) {
            this.f42173a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            Handler handler;
            super.b();
            EditText editText = (EditText) this.f42173a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C5383g.b((EditText) this.f42173a.get(), 1);
        }
    }

    public C5383g(EditText editText, boolean z10) {
        this.f42167a = editText;
        this.f42168b = z10;
    }

    public static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.c().p(editableText);
            C5380d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public c.f a() {
        if (this.f42169c == null) {
            this.f42169c = new a(this.f42167a);
        }
        return this.f42169c;
    }

    public void c(boolean z10) {
        if (this.f42172f != z10) {
            if (this.f42169c != null) {
                androidx.emoji2.text.c.c().u(this.f42169c);
            }
            this.f42172f = z10;
            if (z10) {
                b(this.f42167a, androidx.emoji2.text.c.c().e());
            }
        }
    }

    public final boolean d() {
        if (this.f42172f) {
            return (this.f42168b || androidx.emoji2.text.c.i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f42167a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.c.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.c.c().s((Spannable) charSequence, i10, i10 + i12, this.f42170d, this.f42171e);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.c.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
