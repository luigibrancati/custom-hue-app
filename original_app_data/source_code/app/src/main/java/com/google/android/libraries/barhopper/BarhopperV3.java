package com.google.android.libraries.barhopper;

import H7.C0867a;
import aa.C2663a;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3455r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class BarhopperV3 implements Closeable {
    private static final long NULLPTR = 0;
    private static final String TAG = "BarhopperV3";
    private long nativePointer;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j10);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j10, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j10, int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j10, int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j10, int i10, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j10, int i10, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions);

    private static C2663a toProto(byte[] bArr) {
        bArr.getClass();
        try {
            return C2663a.K(bArr, S0.a());
        } catch (C3455r1 e10) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.nativePointer;
        if (j10 != 0) {
            closeNative(j10);
            this.nativePointer = 0L;
        }
    }

    public void create() {
        if (this.nativePointer != 0) {
            Log.w(TAG, "Native pointer already exists.");
            return;
        }
        long jCreateNative = createNative();
        this.nativePointer = jCreateNative;
        if (jCreateNative == 0) {
            throw new IllegalStateException("Failed to create native pointer.");
        }
    }

    public C2663a recognize(int i10, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j10 = this.nativePointer;
        if (j10 != 0) {
            return toProto(recognizeStridedBufferNative(j10, i10, i11, i12, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public void create(C0867a c0867a) {
        if (this.nativePointer != 0) {
            Log.w(TAG, "Native pointer already exists.");
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(c0867a.d());
        this.nativePointer = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    public C2663a recognize(int i10, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j10 = this.nativePointer;
        if (j10 != 0) {
            return toProto(recognizeStridedNative(j10, i10, i11, i12, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public C2663a recognize(int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j10 = this.nativePointer;
        if (j10 != 0) {
            return toProto(recognizeBufferNative(j10, i10, i11, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public C2663a recognize(int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j10 = this.nativePointer;
        if (j10 != 0) {
            return toProto(recognizeNative(j10, i10, i11, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public C2663a recognize(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.nativePointer != 0) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                Log.d(TAG, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
                bitmap = bitmap.copy(config2, bitmap.isMutable());
            }
            return toProto(recognizeBitmapNative(this.nativePointer, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }
}
