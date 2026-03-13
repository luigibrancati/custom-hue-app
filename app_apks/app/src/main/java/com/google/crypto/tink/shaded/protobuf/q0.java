package com.google.crypto.tink.shaded.protobuf;

import com.fasterxml.jackson.core.base.GeneratorBase;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f31558a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws A {
            if (m(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m(b12) || m(b13)) {
                throw A.d();
            }
            int iR = ((b10 & 7) << 18) | (r(b11) << 12) | (r(b12) << 6) | r(b13);
            cArr[i10] = l(iR);
            cArr[i10 + 1] = q(iR);
        }

        public static void i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        public static void j(byte b10, byte b11, byte b12, char[] cArr, int i10) throws A {
            if (m(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m(b12)))) {
                throw A.d();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
        }

        public static void k(byte b10, byte b11, char[] cArr, int i10) throws A {
            if (b10 < -62 || m(b11)) {
                throw A.d();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | r(b11));
        }

        public static char l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        public static boolean m(byte b10) {
            return b10 > -65;
        }

        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        public static boolean o(byte b10) {
            return b10 < -16;
        }

        public static boolean p(byte b10) {
            return b10 < -32;
        }

        public static char q(int i10) {
            return (char) ((i10 & 1023) + GeneratorBase.SURR2_FIRST);
        }

        public static int r(byte b10) {
            return b10 & 63;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public abstract String a(byte[] bArr, int i10, int i11);

        public abstract int b(String str, byte[] bArr, int i10, int i11);

        public final boolean c(byte[] bArr, int i10, int i11) {
            return d(0, bArr, i10, i11) == 0;
        }

        public abstract int d(int i10, byte[] bArr, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends b {
        public static int e(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return f(bArr, i10, i11);
        }

        public static int f(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 += 2;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i12 >= i11 - 2) {
                            return q0.l(bArr, i12, i11);
                        }
                        int i13 = i10 + 2;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i14 = i10 + 3;
                            if (bArr[i13] <= -65) {
                                i10 += 4;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 1) {
                        return q0.l(bArr, i12, i11);
                    }
                    int i15 = i10 + 2;
                    byte b12 = bArr[i12];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        i10 += 3;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        public String a(byte[] bArr, int i10, int i11) throws A {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!a.n(b10)) {
                    break;
                }
                i10++;
                a.i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (a.n(b11)) {
                    int i16 = i14 + 1;
                    a.i(b11, cArr, i14);
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b12 = bArr[i17];
                        if (!a.n(b12)) {
                            break;
                        }
                        i17++;
                        a.i(b12, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (a.p(b11)) {
                    if (i15 >= i12) {
                        throw A.d();
                    }
                    i10 += 2;
                    a.k(b11, bArr[i15], cArr, i14);
                    i14++;
                } else if (a.o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw A.d();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    a.j(b11, bArr[i15], bArr[i18], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw A.d();
                    }
                    byte b13 = bArr[i15];
                    int i19 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    a.h(b11, b13, b14, bArr[i19], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        public int b(String str, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            char cCharAt;
            int length = str.length();
            int i14 = i11 + i10;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                bArr[i13] = (byte) cCharAt;
                i15++;
            }
            if (i15 == length) {
                return i10 + length;
            }
            int i16 = i10 + i15;
            while (i15 < length) {
                char cCharAt2 = str.charAt(i15);
                if (cCharAt2 < 128 && i16 < i14) {
                    bArr[i16] = (byte) cCharAt2;
                    i16++;
                } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                    i16 += 2;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                        if (i16 > i14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new d(i15, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                        }
                        int i18 = i15 + 1;
                        if (i18 != str.length()) {
                            char cCharAt3 = str.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new d(i15 - 1, length);
                    }
                    bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i20 = i16 + 2;
                    bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i16 += 3;
                    bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
                }
                i15++;
            }
            return i16;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r7[r8] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r7[r8] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r7[r6] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r6, byte[] r7, int r8, int r9) {
            /*
                r5 = this;
                if (r6 == 0) goto L86
                if (r8 < r9) goto L5
                return r6
            L5:
                byte r5 = (byte) r6
                r0 = -32
                r1 = -1
                r2 = -65
                if (r5 >= r0) goto L1c
                r6 = -62
                if (r5 < r6) goto L1b
                int r5 = r8 + 1
                r6 = r7[r8]
                if (r6 <= r2) goto L18
                goto L1b
            L18:
                r8 = r5
                goto L86
            L1b:
                return r1
            L1c:
                r3 = -16
                if (r5 >= r3) goto L49
                int r6 = r6 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L34
                int r6 = r8 + 1
                r8 = r7[r8]
                if (r6 < r9) goto L31
                int r5 = com.google.crypto.tink.shaded.protobuf.q0.a(r5, r8)
                return r5
            L31:
                r4 = r8
                r8 = r6
                r6 = r4
            L34:
                if (r6 > r2) goto L48
                r3 = -96
                if (r5 != r0) goto L3c
                if (r6 < r3) goto L48
            L3c:
                r0 = -19
                if (r5 != r0) goto L42
                if (r6 >= r3) goto L48
            L42:
                int r5 = r8 + 1
                r6 = r7[r8]
                if (r6 <= r2) goto L18
            L48:
                return r1
            L49:
                int r0 = r6 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L5c
                int r6 = r8 + 1
                r0 = r7[r8]
                if (r6 < r9) goto L5a
                int r5 = com.google.crypto.tink.shaded.protobuf.q0.a(r5, r0)
                return r5
            L5a:
                r8 = 0
                goto L62
            L5c:
                int r6 = r6 >> 16
                byte r6 = (byte) r6
                r4 = r8
                r8 = r6
                r6 = r4
            L62:
                if (r8 != 0) goto L72
                int r8 = r6 + 1
                r6 = r7[r6]
                if (r8 < r9) goto L6f
                int r5 = com.google.crypto.tink.shaded.protobuf.q0.b(r5, r0, r6)
                return r5
            L6f:
                r4 = r8
                r8 = r6
                r6 = r4
            L72:
                if (r0 > r2) goto L85
                int r5 = r5 << 28
                int r0 = r0 + 112
                int r5 = r5 + r0
                int r5 = r5 >> 30
                if (r5 != 0) goto L85
                if (r8 > r2) goto L85
                int r8 = r6 + 1
                r5 = r7[r6]
                if (r5 <= r2) goto L86
            L85:
                return r1
            L86:
                int r5 = e(r7, r8, r9)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q0.c.d(int, byte[], int, int):int");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends b {
        public static boolean e() {
            return p0.E() && p0.F();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int f(byte[] r10, long r11, int r13) {
            /*
                int r0 = g(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.p0.u(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.crypto.tink.shaded.protobuf.p0.u(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = h(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.p0.u(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.crypto.tink.shaded.protobuf.p0.u(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = h(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.p0.u(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.p0.u(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.p0.u(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q0.e.f(byte[], long, int):int");
        }

        public static int g(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            int i12 = 8 - (((int) j10) & 7);
            while (i11 < i12) {
                long j11 = 1 + j10;
                if (p0.u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            while (true) {
                int i13 = i11 + 8;
                if (i13 > i10 || (p0.A(bArr, p0.f31541h + j10) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j10 += 8;
                i11 = i13;
            }
            while (i11 < i10) {
                long j12 = j10 + 1;
                if (p0.u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j12;
            }
            return i10;
        }

        public static int h(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return q0.i(i10);
            }
            if (i11 == 1) {
                return q0.j(i10, p0.u(bArr, j10));
            }
            if (i11 == 2) {
                return q0.k(i10, p0.u(bArr, j10), p0.u(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        public String a(byte[] bArr, int i10, int i11) throws A {
            Charset charset = AbstractC3678z.f31578b;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw A.d();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        public int b(String str, byte[] bArr, int i10, int i11) {
            long j10;
            long j11;
            long j12;
            int i12;
            char cCharAt;
            long j13 = i10;
            long j14 = ((long) i11) + j13;
            int length = str.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                if (i13 >= length || (cCharAt = str.charAt(i13)) >= 128) {
                    break;
                }
                p0.K(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 < 128 && j13 < j14) {
                    p0.K(bArr, j13, (byte) cCharAt2);
                    j12 = j14;
                    j11 = j10;
                    j13 += j10;
                } else if (cCharAt2 >= 2048 || j13 > j14 - 2) {
                    j11 = j10;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        j12 = j14;
                        if (j13 > j12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                p0.K(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                p0.K(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                p0.K(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                p0.K(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    p0.K(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j16 = j13 + 2;
                    j12 = j14;
                    p0.K(bArr, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    p0.K(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    p0.K(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    p0.K(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j14;
                }
                i13++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.p0.u(r11, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.p0.u(r11, r0) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r10, byte[] r11, int r12, int r13) {
            /*
                r9 = this;
                r9 = r12 | r13
                int r0 = r11.length
                int r0 = r0 - r13
                r9 = r9 | r0
                if (r9 < 0) goto La8
                long r0 = (long) r12
                long r12 = (long) r13
                if (r10 == 0) goto La1
                int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                if (r9 < 0) goto L10
                return r10
            L10:
                byte r9 = (byte) r10
                r2 = -32
                r3 = -1
                r4 = -65
                r5 = 1
                if (r9 >= r2) goto L2a
                r10 = -62
                if (r9 < r10) goto L29
                long r5 = r5 + r0
                byte r9 = com.google.crypto.tink.shaded.protobuf.p0.u(r11, r0)
                if (r9 <= r4) goto L26
                goto L29
            L26:
                r0 = r5
                goto La1
            L29:
                return r3
            L2a:
                r7 = -16
                if (r9 >= r7) goto L5e
                int r10 = r10 >> 8
                int r10 = ~r10
                byte r10 = (byte) r10
                if (r10 != 0) goto L44
                long r7 = r0 + r5
                byte r10 = com.google.crypto.tink.shaded.protobuf.p0.u(r11, r0)
                int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r0 < 0) goto L43
                int r9 = com.google.crypto.tink.shaded.protobuf.q0.a(r9, r10)
                return r9
            L43:
                r0 = r7
            L44:
                if (r10 > r4) goto L5d
                r7 = -96
                if (r9 != r2) goto L4c
                if (r10 < r7) goto L5d
            L4c:
                r2 = -19
                if (r9 != r2) goto L52
                if (r10 >= r7) goto L5d
            L52:
                long r9 = r0 + r5
                byte r0 = com.google.crypto.tink.shaded.protobuf.p0.u(r11, r0)
                if (r0 <= r4) goto L5b
                goto L5d
            L5b:
                r0 = r9
                goto La1
            L5d:
                return r3
            L5e:
                int r2 = r10 >> 8
                int r2 = ~r2
                byte r2 = (byte) r2
                if (r2 != 0) goto L76
                long r7 = r0 + r5
                byte r2 = com.google.crypto.tink.shaded.protobuf.p0.u(r11, r0)
                int r10 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r10 < 0) goto L73
                int r9 = com.google.crypto.tink.shaded.protobuf.q0.a(r9, r2)
                return r9
            L73:
                r10 = 0
                r0 = r7
                goto L79
            L76:
                int r10 = r10 >> 16
                byte r10 = (byte) r10
            L79:
                if (r10 != 0) goto L8b
                long r7 = r0 + r5
                byte r10 = com.google.crypto.tink.shaded.protobuf.p0.u(r11, r0)
                int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r9 = com.google.crypto.tink.shaded.protobuf.q0.b(r9, r2, r10)
                return r9
            L8a:
                r0 = r7
            L8b:
                if (r2 > r4) goto La0
                int r9 = r9 << 28
                int r2 = r2 + 112
                int r9 = r9 + r2
                int r9 = r9 >> 30
                if (r9 != 0) goto La0
                if (r10 > r4) goto La0
                long r9 = r0 + r5
                byte r0 = com.google.crypto.tink.shaded.protobuf.p0.u(r11, r0)
                if (r0 <= r4) goto L5b
            La0:
                return r3
            La1:
                long r12 = r12 - r0
                int r9 = (int) r12
                int r9 = f(r11, r0, r9)
                return r9
            La8:
                java.lang.ArrayIndexOutOfBoundsException r9 = new java.lang.ArrayIndexOutOfBoundsException
                int r10 = r11.length
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
                java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r12}
                java.lang.String r11 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r10 = java.lang.String.format(r11, r10)
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q0.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f31558a = (!e.e() || AbstractC3657d.c()) ? new c() : new e();
    }

    public static String e(byte[] bArr, int i10, int i11) {
        return f31558a.a(bArr, i10, i11);
    }

    public static int f(String str, byte[] bArr, int i10, int i11) {
        return f31558a.b(str, bArr, i10, i11);
    }

    public static int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int iH = length;
        while (true) {
            if (i10 < length) {
                char cCharAt = str.charAt(i10);
                if (cCharAt >= 2048) {
                    iH += h(str, i10);
                    break;
                }
                iH += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (iH >= length) {
            return iH;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iH) + 4294967296L));
    }

    public static int h(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    public static int i(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    public static int j(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int k(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static int l(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return i(b10);
        }
        if (i12 == 1) {
            return j(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return k(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr, int i10, int i11) {
        return f31558a.c(bArr, i10, i11);
    }
}
