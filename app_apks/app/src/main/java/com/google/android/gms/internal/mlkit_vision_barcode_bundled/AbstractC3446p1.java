package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3446p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f29896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f29897b;

    static {
        Charset.forName("US-ASCII");
        f29896a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f29897b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = K0.f29759a;
        try {
            new I0(bArr, 0, 0, false, null).c(0);
        } catch (C3455r1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
