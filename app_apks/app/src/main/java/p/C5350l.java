package p;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p1.C5377a;

/* JADX INFO: renamed from: p.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5350l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f41960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5377a f41961b;

    public C5350l(EditText editText) {
        this.f41960a = editText;
        this.f41961b = new C5377a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f41961b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f41960a.getContext().obtainStyledAttributes(attributeSet, h.j.f36077g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(h.j.f36147u0) ? typedArrayObtainStyledAttributes.getBoolean(h.j.f36147u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f41961b.b(inputConnection, editorInfo);
    }

    public void e(boolean z10) {
        this.f41961b.c(z10);
    }
}
