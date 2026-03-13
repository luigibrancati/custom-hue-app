package K;

import E.AbstractC0799l0;
import E.C0785e0;
import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: K.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C0979v implements U.y {
    @Override // U.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(U.z zVar) throws Throwable {
        androidx.camera.core.f fVar;
        Bitmap bitmapH;
        androidx.camera.core.f fVar2 = null;
        try {
            try {
                int iE = zVar.e();
                if (iE == 35) {
                    androidx.camera.core.d dVar = (androidx.camera.core.d) zVar.c();
                    boolean z10 = zVar.f() % 180 != 0;
                    fVar = new androidx.camera.core.f(AbstractC0799l0.a(z10 ? dVar.getHeight() : dVar.getWidth(), z10 ? dVar.getWidth() : dVar.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.d dVarG = ImageProcessingUtil.g(dVar, fVar, ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight() * 4), zVar.f(), false);
                        dVar.close();
                        if (dVarG == null) {
                            throw new C0785e0(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapH = T.b.a(dVarG);
                        dVarG.close();
                    } catch (UnsupportedOperationException e10) {
                        e = e10;
                        throw new C0785e0(0, "Can't convert " + (zVar.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        fVar2 = fVar;
                        if (fVar2 != null) {
                            fVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (iE != 256 && iE != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + zVar.e());
                    }
                    androidx.camera.core.d dVar2 = (androidx.camera.core.d) zVar.c();
                    Bitmap bitmapA = T.b.a(dVar2);
                    dVar2.close();
                    fVar = null;
                    bitmapH = T.b.h(bitmapA, zVar.f());
                }
                if (fVar != null) {
                    fVar.close();
                }
                return bitmapH;
            } catch (UnsupportedOperationException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
