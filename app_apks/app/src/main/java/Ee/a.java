package Ee;

import Fe.C0843e;
import Od.C1823c;
import Od.F;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.fork.ForkServer;
import qe.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f3421a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(encodeSet, "encodeSet");
        return d(str, i10, i11, encodeSet, z10, z11, z12, z13, null, 128, null);
    }

    public static /* synthetic */ String b(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        return a(str, i10, i11, str2, z10, z11, z12, z13);
    }

    public static final String c(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(encodeSet, "encodeSet");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || F.U(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                C0843e c0843e = new C0843e();
                c0843e.W(str, i10, iCharCount);
                h(c0843e, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return c0843e.p0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String d(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        if ((i12 & 128) != 0) {
            charset = null;
        }
        return c(str, i10, i11, str2, z10, z11, z12, z13, charset);
    }

    public static final boolean e(String str, int i10, int i11) {
        AbstractC4862t.e(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && m.C(str.charAt(i10 + 1)) != -1 && m.C(str.charAt(i12)) != -1;
    }

    public static final String f(String str, int i10, int i11, boolean z10) {
        AbstractC4862t.e(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                C0843e c0843e = new C0843e();
                c0843e.W(str, i10, i12);
                i(c0843e, str, i12, i11, z10);
                return c0843e.p0();
            }
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String g(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return f(str, i10, i11, z10);
    }

    public static final void h(C0843e c0843e, String input, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        AbstractC4862t.e(c0843e, "<this>");
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(encodeSet, "encodeSet");
        C0843e c0843e2 = null;
        while (i10 < i11) {
            int iCodePointAt = input.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    c0843e.T("+");
                } else if (iCodePointAt == 43 && z12) {
                    c0843e.T(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || F.U(encodeSet, (char) iCodePointAt, false, 2, null) || (iCodePointAt == 37 && (!z10 || (z11 && !e(input, i10, i11)))))) {
                    if (c0843e2 == null) {
                        c0843e2 = new C0843e();
                    }
                    if (charset == null || AbstractC4862t.a(charset, C1823c.f12394b)) {
                        c0843e2.B(iCodePointAt);
                    } else {
                        c0843e2.l1(input, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!c0843e2.z0()) {
                        byte b10 = c0843e2.readByte();
                        int i12 = b10 & ForkServer.ERROR;
                        c0843e.writeByte(37);
                        char[] cArr = f3421a;
                        c0843e.writeByte(cArr[(i12 >> 4) & 15]);
                        c0843e.writeByte(cArr[b10 & 15]);
                    }
                } else {
                    c0843e.B(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static final void i(C0843e c0843e, String encoded, int i10, int i11, boolean z10) {
        int i12;
        AbstractC4862t.e(c0843e, "<this>");
        AbstractC4862t.e(encoded, "encoded");
        while (i10 < i11) {
            int iCodePointAt = encoded.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iC = m.C(encoded.charAt(i10 + 1));
                int iC2 = m.C(encoded.charAt(i12));
                if (iC == -1 || iC2 == -1) {
                    c0843e.B(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                } else {
                    c0843e.writeByte((iC << 4) + iC2);
                    i10 = Character.charCount(iCodePointAt) + i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                c0843e.writeByte(32);
                i10++;
            } else {
                c0843e.B(iCodePointAt);
                i10 += Character.charCount(iCodePointAt);
            }
        }
    }
}
