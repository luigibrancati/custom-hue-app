package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f30091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f30092b;

    static {
        Charset.forName("US-ASCII");
        f30091a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f30092b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = AbstractC3614t2.f30245a;
        try {
            new C3602r2(bArr, 0, 0, false, null).c(0);
        } catch (V2 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
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
