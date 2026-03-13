package p1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: p1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5377a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f42146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42147b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42148c = 0;

    /* JADX INFO: renamed from: p1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0559a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f42149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5383g f42150b;

        public C0559a(EditText editText, boolean z10) {
            this.f42149a = editText;
            C5383g c5383g = new C5383g(editText, z10);
            this.f42150b = c5383g;
            editText.addTextChangedListener(c5383g);
            editText.setEditableFactory(C5378b.getInstance());
        }

        @Override // p1.C5377a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof C5381e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C5381e(keyListener);
        }

        @Override // p1.C5377a.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C5379c ? inputConnection : new C5379c(this.f42149a, inputConnection, editorInfo);
        }

        @Override // p1.C5377a.b
        public void c(boolean z10) {
            this.f42150b.c(z10);
        }
    }

    /* JADX INFO: renamed from: p1.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void c(boolean z10);
    }

    public C5377a(EditText editText, boolean z10) {
        X0.h.h(editText, "editText cannot be null");
        this.f42146a = new C0559a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f42146a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f42146a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f42146a.c(z10);
    }
}
