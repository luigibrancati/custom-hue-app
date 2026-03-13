package E;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface J0 extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public static a f(Size size, Rect rect, L.J j10, int i10, boolean z10) {
            return new C0792i(size, rect, j10, i10, z10);
        }

        public abstract L.J a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public static b c(int i10, J0 j02) {
            return new C0794j(i10, j02);
        }

        public abstract int a();

        public abstract J0 b();
    }

    void A(float[] fArr, float[] fArr2, boolean z10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getFormat();

    Size getSize();

    Surface m0(Executor executor, X0.a aVar);

    void t0(float[] fArr, float[] fArr2);
}
