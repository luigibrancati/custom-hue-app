package t3;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f44565a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property f44566b = new a(Float.class, "translationAlpha");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property f44567c = new b(Rect.class, "clipBounds");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(B.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            B.e(view, f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static void a(View view) {
        f44565a.a(view);
    }

    public static float b(View view) {
        return f44565a.b(view);
    }

    public static void c(View view) {
        f44565a.c(view);
    }

    public static void d(View view, int i10, int i11, int i12, int i13) {
        f44565a.d(view, i10, i11, i12, i13);
    }

    public static void e(View view, float f10) {
        f44565a.e(view, f10);
    }

    public static void f(View view, int i10) {
        f44565a.f(view, i10);
    }

    public static void g(View view, Matrix matrix) {
        f44565a.g(view, matrix);
    }

    public static void h(View view, Matrix matrix) {
        f44565a.h(view, matrix);
    }
}
