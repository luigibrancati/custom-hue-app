package ie;

import fc.C4025h;
import fc.C4032o;
import gc.C4179C;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4379a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37518a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37520c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f37519b = new x();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StringBuilder f37521d = new StringBuilder();

    public static /* synthetic */ boolean O(AbstractC4379a abstractC4379a, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractC4379a.N(z10);
    }

    public static final double o(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new C4032o();
    }

    public static /* synthetic */ Void z(AbstractC4379a abstractC4379a, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractC4379a.f37518a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return abstractC4379a.y(str, i10, str2);
    }

    public final void A(String key) {
        AbstractC4862t.e(key, "key");
        int iO0 = Od.F.o0(K(0, this.f37518a), key, 0, false, 6, null);
        throw new q("Encountered an unknown key '" + key + "' at offset " + iO0 + " at path: " + this.f37519b.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) u.h(C(), iO0)));
    }

    public final int B(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        z(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new C4025h();
    }

    public abstract CharSequence C();

    public final boolean D(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public abstract String E(String str, boolean z10);

    public byte F() {
        CharSequence charSequenceC = C();
        int i10 = this.f37518a;
        while (true) {
            int iH = H(i10);
            if (iH == -1) {
                this.f37518a = iH;
                return (byte) 10;
            }
            char cCharAt = charSequenceC.charAt(iH);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f37518a = iH;
                return AbstractC4380b.a(cCharAt);
            }
            i10 = iH + 1;
        }
    }

    public final String G(boolean z10) {
        String strQ;
        byte bF = F();
        if (z10) {
            if (bF != 1 && bF != 0) {
                return null;
            }
            strQ = s();
        } else {
            if (bF != 1) {
                return null;
            }
            strQ = q();
        }
        this.f37520c = strQ;
        return strQ;
    }

    public abstract int H(int i10);

    public final void I(boolean z10) {
        AbstractC4379a abstractC4379a;
        ArrayList arrayList = new ArrayList();
        byte bF = F();
        if (bF != 8 && bF != 6) {
            s();
            return;
        }
        while (true) {
            byte bF2 = this.F();
            if (bF2 != 1) {
                if (bF2 == 8 || bF2 == 6) {
                    abstractC4379a = this;
                    arrayList.add(Byte.valueOf(bF2));
                } else {
                    if (bF2 == 9) {
                        if (((Number) C4179C.s0(arrayList)).byteValue() != 8) {
                            throw u.e(this.f37518a, "found ] instead of } at path: " + this.f37519b, this.C());
                        }
                        gc.y.K(arrayList);
                    } else if (bF2 == 7) {
                        if (((Number) C4179C.s0(arrayList)).byteValue() != 6) {
                            throw u.e(this.f37518a, "found } instead of ] at path: " + this.f37519b, this.C());
                        }
                        gc.y.K(arrayList);
                    } else if (bF2 == 10) {
                        z(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                        throw new C4025h();
                    }
                    abstractC4379a = this;
                }
                abstractC4379a.k();
                if (arrayList.size() == 0) {
                    return;
                } else {
                    this = abstractC4379a;
                }
            } else if (z10) {
                this.s();
            } else {
                this.j();
            }
        }
    }

    public abstract int J();

    public String K(int i10, int i11) {
        return C().subSequence(i10, i11).toString();
    }

    public final String L() {
        String str = this.f37520c;
        AbstractC4862t.b(str);
        this.f37520c = null;
        return str;
    }

    public final boolean M() {
        int iJ = J();
        CharSequence charSequenceC = C();
        if (iJ >= charSequenceC.length() || iJ == -1 || charSequenceC.charAt(iJ) != ',') {
            return false;
        }
        this.f37518a++;
        return true;
    }

    public final boolean N(boolean z10) {
        int iH = H(J());
        int length = C().length() - iH;
        if (length < 4 || iH == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != C().charAt(iH + i10)) {
                return false;
            }
        }
        if (length > 4 && AbstractC4380b.a(C().charAt(iH + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f37518a = iH + 4;
        return true;
    }

    public final void P(char c10) {
        int i10 = this.f37518a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f37518a = i10 - 1;
                String strS = s();
                this.f37518a = i10;
                if (AbstractC4862t.a(strS, "null")) {
                    y("Expected string literal but 'null' literal was found", this.f37518a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new C4025h();
                }
            } catch (Throwable th) {
                this.f37518a = i10;
                throw th;
            }
        }
        String strC = AbstractC4380b.c(AbstractC4380b.a(c10));
        int i11 = this.f37518a;
        int i12 = i11 - 1;
        z(this, "Expected " + strC + ", but had '" + ((i11 == C().length() || i12 < 0) ? "EOF" : String.valueOf(C().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new C4025h();
    }

    public final boolean Q() {
        return C().charAt(this.f37518a - 1) != '\"';
    }

    public final int b(int i10) {
        int iH = H(i10);
        if (iH == -1) {
            z(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new C4025h();
        }
        int i11 = iH + 1;
        char cCharAt = C().charAt(iH);
        if (cCharAt == 'u') {
            return d(C(), i11);
        }
        char cB = AbstractC4380b.b(cCharAt);
        if (cB != 0) {
            this.f37521d.append(cB);
            return i11;
        }
        z(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new C4025h();
    }

    public final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    public final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f37521d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f37518a = i10;
        w();
        if (this.f37518a + 4 < charSequence.length()) {
            return d(charSequence, this.f37518a);
        }
        z(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new C4025h();
    }

    public void e(int i10, int i11) {
        this.f37521d.append(C(), i10, i11);
    }

    public abstract boolean f();

    public final boolean g(int i10) {
        int iH = H(i10);
        if (iH >= C().length() || iH == -1) {
            z(this, "EOF", 0, null, 6, null);
            throw new C4025h();
        }
        int i11 = iH + 1;
        int iCharAt = C().charAt(iH) | ' ';
        if (iCharAt == 102) {
            i("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            i("rue", i11);
            return true;
        }
        z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new C4025h();
    }

    public final boolean h() {
        boolean z10;
        int iJ = J();
        if (iJ == C().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new C4025h();
        }
        if (C().charAt(iJ) == '\"') {
            iJ++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zG = g(iJ);
        if (!z10) {
            return zG;
        }
        if (this.f37518a == C().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new C4025h();
        }
        if (C().charAt(this.f37518a) == '\"') {
            this.f37518a++;
            return zG;
        }
        z(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new C4025h();
    }

    public final void i(String str, int i10) {
        if (C().length() - i10 < str.length()) {
            z(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new C4025h();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (C().charAt(i10 + i11) | ' ')) {
                z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new C4025h();
            }
        }
        this.f37518a = i10 + str.length();
    }

    public abstract String j();

    public abstract byte k();

    public final byte l(byte b10) {
        byte bK = k();
        if (bK == b10) {
            return bK;
        }
        String strC = AbstractC4380b.c(b10);
        int i10 = this.f37518a;
        int i11 = i10 - 1;
        z(this, "Expected " + strC + ", but had '" + ((i10 == C().length() || i11 < 0) ? "EOF" : String.valueOf(C().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new C4025h();
    }

    public abstract void m(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        z(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0201, code lost:
    
        throw new fc.C4025h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        z(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
    
        throw new fc.C4025h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        if (r1 == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        if (r1 == (r2 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
    
        if (C().charAt(r2) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        z(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        throw new fc.C4025h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
    
        z(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        throw new fc.C4025h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        r18.f37518a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
    
        if (r8 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r1 = r10 * o(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        z(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        throw new fc.C4025h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        z(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d4, code lost:
    
        throw new fc.C4025h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d5, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e0, code lost:
    
        z(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        throw new fc.C4025h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n() {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.AbstractC4379a.n():long");
    }

    public final long p() {
        long jN = n();
        if (k() == 10) {
            return jN;
        }
        AbstractC4380b.c((byte) 10);
        int i10 = this.f37518a;
        int i11 = i10 - 1;
        z(this, "Expected input to contain a single valid number, but got '" + ((i10 == C().length() || i11 < 0) ? "EOF" : String.valueOf(C().charAt(i11))) + "' after it", i11, null, 4, null);
        throw new C4025h();
    }

    public final String q() {
        return this.f37520c != null ? L() : j();
    }

    public final String r(CharSequence source, int i10, int i11) {
        AbstractC4379a abstractC4379a;
        AbstractC4862t.e(source, "source");
        char cCharAt = source.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iH = this.H(this.c(i10, i11));
                if (iH == -1) {
                    z(this, "Unexpected EOF", iH, null, 4, null);
                    throw new C4025h();
                }
                abstractC4379a = this;
                z10 = true;
                i10 = iH;
                i11 = i10;
            } else {
                abstractC4379a = this;
                i11++;
                if (i11 >= source.length()) {
                    abstractC4379a.e(i10, i11);
                    int iH2 = abstractC4379a.H(i11);
                    if (iH2 == -1) {
                        z(abstractC4379a, "Unexpected EOF", iH2, null, 4, null);
                        throw new C4025h();
                    }
                    i10 = iH2;
                    i11 = i10;
                    z10 = true;
                } else {
                    continue;
                }
            }
            AbstractC4379a abstractC4379a2 = abstractC4379a;
            cCharAt = source.charAt(i11);
            this = abstractC4379a2;
        }
        AbstractC4379a abstractC4379a3 = this;
        String strK = !z10 ? abstractC4379a3.K(i10, i11) : abstractC4379a3.u(i10, i11);
        abstractC4379a3.f37518a = i11 + 1;
        return strK;
    }

    public final String s() {
        if (this.f37520c != null) {
            return L();
        }
        int iJ = J();
        if (iJ >= C().length() || iJ == -1) {
            z(this, "EOF", iJ, null, 4, null);
            throw new C4025h();
        }
        byte bA = AbstractC4380b.a(C().charAt(iJ));
        if (bA == 1) {
            return q();
        }
        if (bA != 0) {
            z(this, "Expected beginning of the string, but got " + C().charAt(iJ), 0, null, 6, null);
            throw new C4025h();
        }
        boolean z10 = false;
        while (AbstractC4380b.a(C().charAt(iJ)) == 0) {
            iJ++;
            if (iJ >= C().length()) {
                e(this.f37518a, iJ);
                int iH = H(iJ);
                if (iH == -1) {
                    this.f37518a = iJ;
                    return u(0, 0);
                }
                iJ = iH;
                z10 = true;
            }
        }
        String strK = !z10 ? K(this.f37518a, iJ) : u(this.f37518a, iJ);
        this.f37518a = iJ;
        return strK;
    }

    public final String t() {
        String strS = s();
        if (!AbstractC4862t.a(strS, "null") || !Q()) {
            return strS;
        }
        z(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new C4025h();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.f37518a + ')';
    }

    public final String u(int i10, int i11) {
        e(i10, i11);
        String string = this.f37521d.toString();
        AbstractC4862t.d(string, "toString(...)");
        this.f37521d.setLength(0);
        return string;
    }

    public final void v() {
        this.f37520c = null;
    }

    public final void x() {
        if (k() == 10) {
            return;
        }
        z(this, "Expected EOF after parsing, but had " + C().charAt(this.f37518a - 1) + " instead", 0, null, 6, null);
        throw new C4025h();
    }

    public final Void y(String message, int i10, String hint) {
        String str;
        AbstractC4862t.e(message, "message");
        AbstractC4862t.e(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw u.e(i10, message + " at path: " + this.f37519b.a() + str, C());
    }

    public void w() {
    }
}
