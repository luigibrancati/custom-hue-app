package M;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f8823e = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f8824f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f8825g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f8826h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8830d;

    public g(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static g a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new g(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f8823e);
        return new g(1, bytes.length, bytes);
    }

    public static g b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f8825g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d10 : dArr) {
            byteBufferWrap.putDouble(d10);
        }
        return new g(12, dArr.length, byteBufferWrap.array());
    }

    public static g c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f8825g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putInt(i10);
        }
        return new g(9, iArr.length, byteBufferWrap.array());
    }

    public static g d(l[] lVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f8825g[10] * lVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (l lVar : lVarArr) {
            byteBufferWrap.putInt((int) lVar.b());
            byteBufferWrap.putInt((int) lVar.a());
        }
        return new g(10, lVarArr.length, byteBufferWrap.array());
    }

    public static g e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f8823e);
        return new g(2, bytes.length, bytes);
    }

    public static g f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    public static g g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f8825g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new g(4, jArr.length, byteBufferWrap.array());
    }

    public static g h(l[] lVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f8825g[5] * lVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (l lVar : lVarArr) {
            byteBufferWrap.putInt((int) lVar.b());
            byteBufferWrap.putInt((int) lVar.a());
        }
        return new g(5, lVarArr.length, byteBufferWrap.array());
    }

    public static g i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f8825g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putShort((short) i10);
        }
        return new g(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return f8825g[this.f8827a] * this.f8828b;
    }

    public String toString() {
        return "(" + f8824f[this.f8827a] + ", data length:" + this.f8830d.length + ")";
    }

    public g(int i10, int i11, long j10, byte[] bArr) {
        this.f8827a = i10;
        this.f8828b = i11;
        this.f8829c = j10;
        this.f8830d = bArr;
    }
}
