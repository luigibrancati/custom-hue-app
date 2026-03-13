package Fe;

import Fe.C0843e;
import kotlin.jvm.internal.AbstractC4862t;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: renamed from: Fe.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0840b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0843e.a f4093a = new C0843e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4094b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f4094b;
    }

    public static final int d(C0846h c0846h, int i10) {
        AbstractC4862t.e(c0846h, "<this>");
        return i10 == f4094b ? c0846h.size() : i10;
    }

    public static final int e(byte[] bArr, int i10) {
        AbstractC4862t.e(bArr, "<this>");
        return i10 == f4094b ? bArr.length : i10;
    }

    public static final int f(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long g(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short h(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String i(byte b10) {
        return Od.C.y(new char[]{Ge.b.f()[(b10 >> 4) & 15], Ge.b.f()[b10 & 15]});
    }

    public static final String j(int i10) {
        if (i10 == 0) {
            return WebrtcBuildVersion.maint_version;
        }
        int i11 = 0;
        char[] cArr = {Ge.b.f()[(i10 >> 28) & 15], Ge.b.f()[(i10 >> 24) & 15], Ge.b.f()[(i10 >> 20) & 15], Ge.b.f()[(i10 >> 16) & 15], Ge.b.f()[(i10 >> 12) & 15], Ge.b.f()[(i10 >> 8) & 15], Ge.b.f()[(i10 >> 4) & 15], Ge.b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return Od.C.z(cArr, i11, 8);
    }
}
