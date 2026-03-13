package K;

import E.C0785e0;
import L.X0;
import T.b;
import android.graphics.Rect;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: K.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0980w implements U.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S.d f6645a;

    /* JADX INFO: renamed from: K.w$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public static a c(U.z zVar, int i10) {
            return new C0961c(zVar, i10);
        }

        public abstract int a();

        public abstract U.z b();
    }

    public C0980w(X0 x02) {
        this.f6645a = new S.d(x02);
    }

    public static M.f b(byte[] bArr) throws C0785e0 {
        try {
            return M.f.h(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new C0785e0(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    @Override // U.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public U.z apply(a aVar) {
        U.z zVarD;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                zVarD = c(aVar, iE);
            } else {
                zVarD = d(aVar);
            }
            ((androidx.camera.core.d) aVar.b().c()).close();
            return zVarD;
        } catch (Throwable th) {
            ((androidx.camera.core.d) aVar.b().c()).close();
            throw th;
        }
    }

    public final U.z c(a aVar, int i10) {
        U.z zVarB = aVar.b();
        byte[] bArrA = this.f6645a.a((androidx.camera.core.d) zVarB.c());
        M.f fVarD = zVarB.d();
        Objects.requireNonNull(fVarD);
        return U.z.l(bArrA, fVarD, i10, zVarB.h(), zVarB.b(), zVarB.f(), zVarB.g(), zVarB.a());
    }

    public final U.z d(a aVar) throws C0785e0 {
        U.z zVarB = aVar.b();
        androidx.camera.core.d dVar = (androidx.camera.core.d) zVarB.c();
        Rect rectB = zVarB.b();
        try {
            byte[] bArrI = T.b.i(dVar, rectB, aVar.a(), zVarB.f());
            return U.z.l(bArrI, b(bArrI), 256, new Size(rectB.width(), rectB.height()), new Rect(0, 0, rectB.width(), rectB.height()), zVarB.f(), M.y.s(zVarB.g(), rectB), zVarB.a());
        } catch (b.a e10) {
            throw new C0785e0(1, "Failed to encode the image to JPEG.", e10);
        }
    }
}
