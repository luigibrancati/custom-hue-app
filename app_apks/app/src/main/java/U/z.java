package U;

import L.InterfaceC1133y;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static z i(Bitmap bitmap, M.f fVar, Rect rect, int i10, Matrix matrix, InterfaceC1133y interfaceC1133y) {
        return new C2254b(bitmap, fVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, interfaceC1133y);
    }

    public static z j(androidx.camera.core.d dVar, M.f fVar, Rect rect, int i10, Matrix matrix, InterfaceC1133y interfaceC1133y) {
        return k(dVar, fVar, new Size(dVar.getWidth(), dVar.getHeight()), rect, i10, matrix, interfaceC1133y);
    }

    public static z k(androidx.camera.core.d dVar, M.f fVar, Size size, Rect rect, int i10, Matrix matrix, InterfaceC1133y interfaceC1133y) {
        if (T.b.e(dVar.getFormat())) {
            X0.h.h(fVar, "JPEG image must have Exif.");
        }
        return new C2254b(dVar, fVar, dVar.getFormat(), size, rect, i10, matrix, interfaceC1133y);
    }

    public static z l(byte[] bArr, M.f fVar, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC1133y interfaceC1133y) {
        return new C2254b(bArr, fVar, i10, size, rect, i11, matrix, interfaceC1133y);
    }

    public abstract InterfaceC1133y a();

    public abstract Rect b();

    public abstract Object c();

    public abstract M.f d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();
}
