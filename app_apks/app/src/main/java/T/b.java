package T;

import M.i;
import X0.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.d;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC0196a f15877a;

        /* JADX INFO: renamed from: T.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum EnumC0196a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public a(String str, EnumC0196a enumC0196a) {
            super(str);
            this.f15877a = enumC0196a;
        }
    }

    public static Bitmap a(androidx.camera.core.d dVar) {
        int format = dVar.getFormat();
        if (format == 1) {
            return c(dVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(dVar);
        }
        if (format == 256 || format == 4101) {
            return b(dVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    public static Bitmap b(androidx.camera.core.d dVar) {
        byte[] bArrG = g(dVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrG, 0, bArrG.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap c(androidx.camera.core.d dVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dVar.getWidth(), dVar.getHeight(), Bitmap.Config.ARGB_8888);
        dVar.n0()[0].e().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, dVar.n0()[0].e(), dVar.n0()[0].a());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer d(Bitmap bitmap) {
        h.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static boolean e(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    public static boolean f(int i10) {
        return i10 == 32;
    }

    public static byte[] g(androidx.camera.core.d dVar) {
        if (!e(dVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat());
        }
        ByteBuffer byteBufferE = dVar.n0()[0].e();
        byte[] bArr = new byte[byteBufferE.capacity()];
        byteBufferE.rewind();
        byteBufferE.get(bArr);
        return bArr;
    }

    public static Bitmap h(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] i(androidx.camera.core.d dVar, Rect rect, int i10, int i11) throws a {
        if (dVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(j(dVar), 17, dVar.getWidth(), dVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i iVar = new i(byteArrayOutputStream, M.h.c(dVar, i11));
        if (rect == null) {
            rect = new Rect(0, 0, dVar.getWidth(), dVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i10, iVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0196a.ENCODE_FAILED);
    }

    public static byte[] j(androidx.camera.core.d dVar) {
        d.a aVar = dVar.n0()[0];
        d.a aVar2 = dVar.n0()[1];
        d.a aVar3 = dVar.n0()[2];
        ByteBuffer byteBufferE = aVar.e();
        ByteBuffer byteBufferE2 = aVar2.e();
        ByteBuffer byteBufferE3 = aVar3.e();
        byteBufferE.rewind();
        byteBufferE2.rewind();
        byteBufferE3.rewind();
        int iRemaining = byteBufferE.remaining();
        byte[] bArr = new byte[((dVar.getWidth() * dVar.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i10 = 0; i10 < dVar.getHeight(); i10++) {
            byteBufferE.get(bArr, width, dVar.getWidth());
            width += dVar.getWidth();
            byteBufferE.position(Math.min(iRemaining, (byteBufferE.position() - dVar.getWidth()) + aVar.a()));
        }
        int height = dVar.getHeight() / 2;
        int width2 = dVar.getWidth() / 2;
        int iA = aVar3.a();
        int iA2 = aVar2.a();
        int iB = aVar3.b();
        int iB2 = aVar2.b();
        byte[] bArr2 = new byte[iA];
        byte[] bArr3 = new byte[iA2];
        for (int i11 = 0; i11 < height; i11++) {
            byteBufferE3.get(bArr2, 0, Math.min(iA, byteBufferE3.remaining()));
            byteBufferE2.get(bArr3, 0, Math.min(iA2, byteBufferE2.remaining()));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < width2; i14++) {
                int i15 = width + 1;
                bArr[width] = bArr2[i12];
                width += 2;
                bArr[i15] = bArr3[i13];
                i12 += iB;
                i13 += iB2;
            }
        }
        return bArr;
    }
}
