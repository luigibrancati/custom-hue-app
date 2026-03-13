package K;

import E.C0785e0;
import K.P;
import L.InterfaceC1133y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G implements U.y {
    public static U.z b(Q q10, M.f fVar, androidx.camera.core.d dVar) {
        return U.z.j(dVar, fVar, q10.b(), q10.f(), q10.h(), d(dVar));
    }

    public static U.z c(Q q10, M.f fVar, androidx.camera.core.d dVar) {
        Size size = new Size(dVar.getWidth(), dVar.getHeight());
        int iF = q10.f() - fVar.n();
        Size sizeE = e(iF, size);
        Matrix matrixC = M.y.c(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight()), iF);
        return U.z.k(dVar, fVar, sizeE, f(q10.b(), matrixC), fVar.n(), g(q10.h(), matrixC), d(dVar));
    }

    public static InterfaceC1133y d(androidx.camera.core.d dVar) {
        return dVar.L0() instanceof P.c ? ((P.c) dVar.L0()).e() : InterfaceC1133y.a.k();
    }

    public static Size e(int i10, Size size) {
        return M.y.h(M.y.t(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // U.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public U.z apply(P.b bVar) throws C0785e0 {
        M.f fVarG;
        androidx.camera.core.d dVarA = bVar.a();
        Q qB = bVar.b();
        if (T.b.e(dVarA.getFormat())) {
            try {
                fVarG = M.f.g(dVarA);
                dVarA.n0()[0].e().rewind();
            } catch (IOException e10) {
                throw new C0785e0(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            fVarG = null;
        }
        if (!C0982y.f6647g.b(dVarA)) {
            return b(qB, fVarG, dVarA);
        }
        X0.h.h(fVarG, "JPEG image must have exif.");
        return c(qB, fVarG, dVarA);
    }
}
