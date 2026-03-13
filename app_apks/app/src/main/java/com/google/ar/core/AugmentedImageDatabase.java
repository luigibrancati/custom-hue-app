package com.google.ar.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class AugmentedImageDatabase {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public AugmentedImageDatabase(Session session) {
        this(session, nativeCreate(session.nativeWrapperHandle));
    }

    public static ByteBuffer convertBitmapToGrayscaleDirectBuffer(Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getWidth() * bitmap.getHeight());
        for (int i10 = 0; i10 < bitmap.getHeight(); i10++) {
            for (int i11 = 0; i11 < bitmap.getWidth(); i11++) {
                byteBufferAllocateDirect.put((bitmap.getWidth() * i10) + i11, (byte) Color.red(bitmapCreateBitmap.getPixel(i11, i10)));
            }
        }
        return byteBufferAllocateDirect;
    }

    public static AugmentedImageDatabase deserialize(Session session, InputStream inputStream) throws IOException {
        return new AugmentedImageDatabase(session, nativeDeserialize(session.nativeWrapperHandle, loadDirectByteBuffer(inputStream)));
    }

    private static ByteBuffer loadDirectByteBuffer(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteArray.length);
                byteBufferAllocateDirect.put(byteArray);
                return byteBufferAllocateDirect;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private native int nativeAddImage(long j10, long j11, String str, ByteBuffer byteBuffer, int i10, int i11, int i12);

    private native int nativeAddImageWithPhysicalSize(long j10, long j11, String str, ByteBuffer byteBuffer, int i10, int i11, int i12, float f10);

    private static native long nativeCreate(long j10);

    private static native long nativeDeserialize(long j10, ByteBuffer byteBuffer);

    private native int nativeGetNumImages(long j10, long j11);

    private native void nativeReleaseDatabase(long j10, long j11);

    private native ByteBuffer nativeSerialize(long j10, long j11);

    public int addImage(String str, Bitmap bitmap) {
        Session session = this.session;
        return nativeAddImage(session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
    }

    public void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseDatabase(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public int getNumImages() {
        return nativeGetNumImages(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void serialize(OutputStream outputStream) throws IOException {
        Channels.newChannel(outputStream).write(nativeSerialize(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedImageDatabase(Session session, long j10) {
        this.session = session;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public int addImage(String str, Bitmap bitmap, float f10) {
        Session session = this.session;
        return nativeAddImageWithPhysicalSize(session.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), f10);
    }
}
