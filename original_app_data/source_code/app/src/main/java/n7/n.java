package n7;

import Y0.E;
import Y0.S;
import Y0.w;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f40733a;

        public a(View view) {
            this.f40733a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f40733a.getContext().getSystemService("input_method")).showSoftInput(this.f40733a, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f40734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f40735b;

        public b(d dVar, e eVar) {
            this.f40734a = dVar;
            this.f40735b = eVar;
        }

        @Override // Y0.w
        public S a(View view, S s10) {
            return this.f40734a.a(view, s10, new e(this.f40735b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        S a(View view, S s10, e eVar);
    }

    public static void a(View view, d dVar) {
        E.q0(view, new b(dVar, new e(E.A(view), view.getPaddingTop(), E.z(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float fS = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fS += E.s((View) parent);
        }
        return fS;
    }

    public static boolean e(View view) {
        return E.w(view) == 1;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(View view) {
        if (E.K(view)) {
            E.c0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f40739d;

        public e(int i10, int i11, int i12, int i13) {
            this.f40736a = i10;
            this.f40737b = i11;
            this.f40738c = i12;
            this.f40739d = i13;
        }

        public e(e eVar) {
            this.f40736a = eVar.f40736a;
            this.f40737b = eVar.f40737b;
            this.f40738c = eVar.f40738c;
            this.f40739d = eVar.f40739d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            E.c0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
