package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3211h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f29486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f29487b;

    static {
        Charset.forName("US-ASCII");
        f29486a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f29487b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = G4.f29203a;
        try {
            new F4(bArr, 0, 0, false, null).c(0);
        } catch (C3229j5 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int b(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static boolean d(C5 c52) {
        if (c52 instanceof AbstractC3291q4) {
            throw null;
        }
        return false;
    }
}
