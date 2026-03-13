package qe;

import Fe.C0843e;
import Od.C;
import Od.F;
import gc.C4204q;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.TikaCoreProperties;
import ze.AbstractC6563b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Od.o f43460a = new Od.o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean a(String str) {
        AbstractC4862t.e(str, "<this>");
        return f43460a.i(str);
    }

    public static final byte[] b(byte[] address) {
        AbstractC4862t.e(address, "address");
        return j(address) ? C4204q.B0(address, Bc.k.p(12, 16)) : address;
    }

    public static final boolean c(String str) {
        AbstractC4862t.e(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC4862t.f(cCharAt, 31) <= 0 || AbstractC4862t.f(cCharAt, 127) >= 0 || F.h0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(String str) {
        AbstractC4862t.e(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i10 = 0;
            while (true) {
                String str2 = str;
                int iH0 = F.h0(str2, '.', i10, false, 4, null);
                int length2 = iH0 == -1 ? str2.length() - i10 : iH0 - i10;
                if (1 > length2 || length2 >= 64) {
                    break;
                }
                if (iH0 == -1 || iH0 == str2.length() - 1) {
                    break;
                }
                i10 = iH0 + 1;
                str = str2;
            }
            return false;
        }
        return true;
    }

    public static final boolean e(String input, int i10, int i11, byte[] address, int i12) {
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(address, "address");
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == address.length) {
                return false;
            }
            if (i13 != i12) {
                if (input.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = input.charAt(i14);
                if (AbstractC4862t.f(cCharAt, 48) < 0 || AbstractC4862t.f(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            address[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        gc.C4202o.i(r8, r8, 16 - (r11 - r12), r12, r11);
        gc.C4202o.v(r8, (byte) 0, r12, (16 - r11) + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte[] f(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r6 = r18
            java.lang.String r1 = "input"
            kotlin.jvm.internal.AbstractC4862t.e(r0, r1)
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = r9
            r12 = r10
            r13 = r12
        L14:
            r14 = 0
            if (r2 >= r6) goto L95
            if (r11 != r7) goto L1a
            return r14
        L1a:
            int r15 = r2 + 2
            if (r15 > r6) goto L38
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            boolean r1 = Od.C.O(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L38
            if (r12 == r10) goto L2c
            return r14
        L2c:
            int r11 = r11 + 2
            if (r15 != r6) goto L33
            r12 = r11
            goto L95
        L33:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L67
        L38:
            if (r11 == 0) goto L49
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = Od.C.O(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L4d
            int r2 = r2 + 1
        L49:
            r0 = r16
            r13 = r2
            goto L67
        L4d:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = Od.C.O(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L66
            int r1 = r11 + (-2)
            boolean r0 = e(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L63
            return r14
        L63:
            int r11 = r11 + 2
            goto L95
        L66:
            return r14
        L67:
            r1 = r9
            r2 = r13
        L69:
            if (r2 >= r6) goto L7b
            char r3 = r0.charAt(r2)
            int r3 = qe.m.C(r3)
            if (r3 == r10) goto L7b
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L69
        L7b:
            int r3 = r2 - r13
            if (r3 == 0) goto L94
            r4 = 4
            if (r3 <= r4) goto L83
            goto L94
        L83:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto L14
        L94:
            return r14
        L95:
            if (r11 == r7) goto La6
            if (r12 != r10) goto L9a
            return r14
        L9a:
            int r0 = r11 - r12
            int r0 = 16 - r0
            gc.C4202o.i(r8, r8, r0, r12, r11)
            int r7 = r7 - r11
            int r7 = r7 + r12
            gc.C4202o.v(r8, r9, r12, r7)
        La6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.f.f(java.lang.String, int, int):byte[]");
    }

    public static final String g(String host) throws EOFException {
        AbstractC4862t.e(host, "host");
        C0843e c0843eT = new C0843e().T(host);
        C0843e c0843e = new C0843e();
        while (!c0843eT.z0()) {
            if (!AbstractC6563b.a().c(c0843eT.x0(), c0843e)) {
                return null;
            }
        }
        c0843eT.T(h.a(c0843e.p0()));
        ze.d dVar = ze.d.f48902a;
        String strC = dVar.c(c0843eT.p0());
        if (strC != null && AbstractC4862t.a(strC, h.a(strC))) {
            return dVar.e(strC);
        }
        return null;
    }

    public static final String h(byte[] address) {
        AbstractC4862t.e(address, "address");
        if (address.length == 4) {
            return new C0843e().l0(m.b(address[0], 255)).writeByte(46).l0(m.b(address[1], 255)).writeByte(46).l0(m.b(address[2], 255)).writeByte(46).l0(m.b(address[3], 255)).p0();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final String i(byte[] address) {
        AbstractC4862t.e(address, "address");
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C0843e c0843e = new C0843e();
        while (i11 < address.length) {
            if (i11 == i10) {
                c0843e.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    c0843e.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    c0843e.writeByte(58);
                }
                c0843e.I0((m.b(address[i11], 255) << 8) | m.b(address[i11 + 1], 255));
                i11 += 2;
            }
        }
        return c0843e.p0();
    }

    public static final boolean j(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i10 = 0; i10 < 10; i10++) {
            if (bArr[i10] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    public static final String k(String str) {
        AbstractC4862t.e(str, "<this>");
        if (!F.V(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, false, 2, null)) {
            String strG = g(str);
            if (strG == null || strG.length() == 0 || c(strG) || d(strG)) {
                return null;
            }
            return strG;
        }
        byte[] bArrF = (C.P(str, "[", false, 2, null) && C.D(str, "]", false, 2, null)) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (bArrF == null) {
            return null;
        }
        byte[] bArrB = b(bArrF);
        if (bArrB.length == 16) {
            return i(bArrB);
        }
        if (bArrB.length == 4) {
            return h(bArrB);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
