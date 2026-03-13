package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3678z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f31577a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f31578b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f31579c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f31580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f31581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC3662i f31582f;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        int getNumber();
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        boolean isInRange(int i10);
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d extends List, RandomAccess {
        d a(int i10);

        void i();

        boolean m();
    }

    static {
        byte[] bArr = new byte[0];
        f31580d = bArr;
        f31581e = ByteBuffer.wrap(bArr);
        f31582f = AbstractC3662i.j(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i10, int i11) {
        int iG = g(i11, bArr, i10, i11);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int g(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
