package E;

import E.C0790h;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3055a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {

        /* JADX INFO: renamed from: E.z0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static abstract class AbstractC0044a {
            public abstract a a();

            public abstract AbstractC0044a b(Rect rect);

            public abstract AbstractC0044a c(int i10);
        }

        public abstract Rect a();

        public abstract Size b();

        public abstract int c();
    }

    public z0(Size size, Rect rect, int i10) {
        this.f3055a = new C0790h.b().d(size).b(rect).c(i10).a();
    }

    public Size a() {
        return this.f3055a.b();
    }

    public boolean equals(Object obj) {
        return this.f3055a.equals(obj);
    }

    public int hashCode() {
        return this.f3055a.hashCode();
    }

    public String toString() {
        return this.f3055a.toString();
    }
}
