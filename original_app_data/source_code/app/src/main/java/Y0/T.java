package Y0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f19629a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends a {
        public b(Window window, T t10, A a10) {
            super(window, t10, a10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends b {
        public c(Window window, T t10, A a10) {
            super(window, t10, a10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {
        public abstract void a(boolean z10);

        public abstract void b(boolean z10);
    }

    public T(Window window, View view) {
        A a10 = new A(view);
        if (Build.VERSION.SDK_INT >= 35) {
            this.f19629a = new c(window, this, a10);
        } else {
            this.f19629a = new a(window, this, a10);
        }
    }

    public void a(boolean z10) {
        this.f19629a.a(z10);
    }

    public void b(boolean z10) {
        this.f19629a.b(z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f19630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f19631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final A f19632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b0.J f19633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Window f19634e;

        public a(Window window, T t10, A a10) {
            this(window.getInsetsController(), t10, a10);
            this.f19634e = window;
        }

        @Override // Y0.T.d
        public void a(boolean z10) {
            if (z10) {
                if (this.f19634e != null) {
                    c(16);
                }
                this.f19631b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f19634e != null) {
                    d(16);
                }
                this.f19631b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // Y0.T.d
        public void b(boolean z10) {
            if (z10) {
                if (this.f19634e != null) {
                    c(8192);
                }
                this.f19631b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f19634e != null) {
                    d(8192);
                }
                this.f19631b.setSystemBarsAppearance(0, 8);
            }
        }

        public void c(int i10) {
            View decorView = this.f19634e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void d(int i10) {
            View decorView = this.f19634e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public a(WindowInsetsController windowInsetsController, T t10, A a10) {
            this.f19633d = new b0.J();
            this.f19631b = windowInsetsController;
            this.f19630a = t10;
            this.f19632c = a10;
        }
    }
}
