package Q2;

import D1.w;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import android.util.Pair;
import i2.InterfaceC4337q;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f13565a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f13566b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f13568b;

        public a(int i10, long j10) {
            this.f13567a = i10;
            this.f13568b = j10;
        }

        public static a a(InterfaceC4337q interfaceC4337q, C c10) {
            interfaceC4337q.s(c10.f(), 0, 8);
            c10.a0(0);
            return new a(c10.u(), c10.B());
        }
    }

    public static boolean a(InterfaceC4337q interfaceC4337q) {
        C c10 = new C(8);
        int i10 = a.a(interfaceC4337q, c10).f13567a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC4337q.s(c10.f(), 0, 4);
        c10.a0(0);
        int iU = c10.u();
        if (iU == 1463899717) {
            return true;
        }
        t.c("WavHeaderReader", "Unsupported form type: " + iU);
        return false;
    }

    public static c b(InterfaceC4337q interfaceC4337q) throws w {
        byte[] bArr;
        C c10 = new C(16);
        a aVarD = d(1718449184, interfaceC4337q, c10);
        AbstractC0853a.g(aVarD.f13568b >= 16);
        interfaceC4337q.s(c10.f(), 0, 16);
        c10.a0(0);
        int iD = c10.D();
        int iD2 = c10.D();
        int iC = c10.C();
        int iC2 = c10.C();
        int iD3 = c10.D();
        int iD4 = c10.D();
        int i10 = ((int) aVarD.f13568b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC4337q.s(bArr, 0, i10);
            if (iD == 65534 && i10 == 24) {
                C c11 = new C(bArr);
                c11.D();
                int iD5 = c11.D();
                if (iD5 != 0 && iD5 != iD4) {
                    throw w.e("validBits ( " + iD5 + ")  != bitsPerSample( " + iD4 + ") are not supported");
                }
                int iC3 = c11.C();
                if ((iC3 >> 18) != 0) {
                    throw w.e("invalid channel mask " + iC3);
                }
                if (iC3 != 0 && Integer.bitCount(iC3) != iD2) {
                    throw w.e("invalid number of channels (" + Integer.bitCount(iC3) + ") in channel mask " + iC3);
                }
                iD = c11.D();
                byte[] bArr2 = new byte[14];
                c11.q(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, f13565a) && !Arrays.equals(bArr2, f13566b)) {
                    throw w.e("invalid wav format extension guid");
                }
            }
        } else {
            bArr = M.f4267f;
        }
        byte[] bArr3 = bArr;
        int i11 = iD;
        interfaceC4337q.q((int) (interfaceC4337q.m() - interfaceC4337q.getPosition()));
        return new c(i11, iD2, iC, iC2, iD3, iD4, bArr3);
    }

    public static long c(InterfaceC4337q interfaceC4337q) {
        C c10 = new C(8);
        a aVarA = a.a(interfaceC4337q, c10);
        if (aVarA.f13567a != 1685272116) {
            interfaceC4337q.i();
            return -1L;
        }
        interfaceC4337q.o(8);
        c10.a0(0);
        interfaceC4337q.s(c10.f(), 0, 8);
        long jZ = c10.z();
        interfaceC4337q.q(((int) aVarA.f13568b) + 8);
        return jZ;
    }

    public static a d(int i10, InterfaceC4337q interfaceC4337q, C c10) throws w {
        a aVarA = a.a(interfaceC4337q, c10);
        while (aVarA.f13567a != i10) {
            t.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f13567a);
            long j10 = aVarA.f13568b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw w.e("Chunk is too large (~2GB+) to skip; id: " + aVarA.f13567a);
            }
            interfaceC4337q.q((int) j11);
            aVarA = a.a(interfaceC4337q, c10);
        }
        return aVarA;
    }

    public static Pair e(InterfaceC4337q interfaceC4337q) throws w {
        interfaceC4337q.i();
        a aVarD = d(1684108385, interfaceC4337q, new C(8));
        interfaceC4337q.q(8);
        return Pair.create(Long.valueOf(interfaceC4337q.getPosition()), Long.valueOf(aVarD.f13568b));
    }
}
