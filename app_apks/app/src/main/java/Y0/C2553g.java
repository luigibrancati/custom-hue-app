package Y0;

import android.view.DisplayCutout;

/* JADX INFO: renamed from: Y0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2553g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f19652a;

    /* JADX INFO: renamed from: Y0.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C2553g(DisplayCutout displayCutout) {
        this.f19652a = displayCutout;
    }

    public static C2553g e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C2553g(displayCutout);
    }

    public int a() {
        return a.a(this.f19652a);
    }

    public int b() {
        return a.b(this.f19652a);
    }

    public int c() {
        return a.c(this.f19652a);
    }

    public int d() {
        return a.d(this.f19652a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2553g.class != obj.getClass()) {
            return false;
        }
        return X0.c.a(this.f19652a, ((C2553g) obj).f19652a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f19652a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f19652a + "}";
    }
}
