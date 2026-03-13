package Z9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import java.nio.ByteBuffer;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f20412a = new c();

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static c d() {
        return f20412a;
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, boolean z10) {
        int i10;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z10 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i12 = 0;
        while (true) {
            i10 = i11 * 4;
            if (i12 >= i10) {
                break;
            }
            byteBufferAllocate.put(i12, byteBuffer.get(i12));
            i12++;
        }
        for (int i13 = 0; i13 < i11 + i11; i13++) {
            byteBufferAllocate.put(i10 + i13, byteBuffer.get(((i13 % 2) * i11) + i10 + (i13 / 2)));
        }
        return byteBufferAllocate;
    }

    public static Bitmap g(Bitmap bitmap, int i10, int i11, int i12) {
        if (i10 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i11, i12);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, i11, i12, matrix, true);
    }

    public static final void h(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i14 = i10 / (i11 / iLimit);
        int rowStride = 0;
        for (int i15 = 0; i15 < iLimit; i15++) {
            int pixelStride = rowStride;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i12] = buffer.get(pixelStride);
                i12 += i13;
                pixelStride += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }

    public Bitmap b(Image image, int i10) {
        AbstractC6056k.b(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return g(bitmapDecodeByteArray, i10, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer c(Y9.a aVar, boolean z10) throws N9.a {
        int iG = aVar.g();
        if (iG != -1) {
            if (iG == 17) {
                return z10 ? a((ByteBuffer) AbstractC6056k.l(aVar.e())) : (ByteBuffer) AbstractC6056k.l(aVar.e());
            }
            if (iG == 35) {
                return e((Image.Plane[]) AbstractC6056k.l(aVar.j()), aVar.l(), aVar.h());
            }
            if (iG == 842094169) {
                return f((ByteBuffer) AbstractC6056k.l(aVar.e()), z10);
            }
            throw new N9.a("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) AbstractC6056k.l(aVar.d());
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i10;
        ByteBuffer byteBufferAllocate = z10 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = 0;
            while (i14 < width) {
                int i15 = iArr[i12];
                int i16 = i15 >> 16;
                int i17 = i15 >> 8;
                int i18 = i15 & 255;
                int i19 = i11 + 1;
                int i20 = i16 & 255;
                int i21 = i17 & 255;
                byteBufferAllocate.put(i11, (byte) Math.min(255, (((((i20 * 66) + (i21 * 129)) + (i18 * 25)) + 128) >> 8) + 16));
                if (i13 % 2 == 0 && i12 % 2 == 0) {
                    int i22 = ((((i20 * 112) - (i21 * 94)) - (i18 * 18)) + 128) >> 8;
                    int i23 = (((((i20 * (-38)) - (i21 * 74)) + (i18 * 112)) + 128) >> 8) + 128;
                    int i24 = i10 + 1;
                    byteBufferAllocate.put(i10, (byte) Math.min(255, i22 + 128));
                    i10 += 2;
                    byteBufferAllocate.put(i24, (byte) Math.min(255, i23));
                }
                i12++;
                i14++;
                i11 = i19;
            }
        }
        return byteBufferAllocate;
    }

    public ByteBuffer e(Image.Plane[] planeArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        byte[] bArr = new byte[i13 + i13 + i12];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i14 = (i12 + i12) / 4;
        boolean z10 = buffer2.remaining() == i14 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z10) {
            planeArr[0].getBuffer().get(bArr, 0, i12);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i12, 1);
            buffer3.get(bArr, i12 + 1, i14 - 1);
        } else {
            h(planeArr[0], i10, i11, bArr, 0, 1);
            h(planeArr[1], i10, i11, bArr, i12 + 1, 2);
            h(planeArr[2], i10, i11, bArr, i12, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
