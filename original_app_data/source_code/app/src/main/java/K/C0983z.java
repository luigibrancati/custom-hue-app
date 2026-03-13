package K;

import E.C0785e0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: K.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0983z implements U.y {
    @Override // U.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public U.z apply(U.z zVar) throws C0785e0 {
        Rect rectB = zVar.b();
        Bitmap bitmapB = b((byte[]) zVar.c(), rectB);
        M.f fVarD = zVar.d();
        Objects.requireNonNull(fVarD);
        return U.z.i(bitmapB, fVarD, new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight()), zVar.f(), M.y.s(zVar.g(), rectB), zVar.a());
    }

    public final Bitmap b(byte[] bArr, Rect rect) throws C0785e0 {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new C0785e0(1, "Failed to decode JPEG.", e10);
        }
    }
}
