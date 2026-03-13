package s7;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static d a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new e() : new j();
    }

    public static d b() {
        return new j();
    }

    public static f c() {
        return new f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).T(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.M()) {
            gVar.X(n7.n.d(view));
        }
    }
}
