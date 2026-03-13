package C9;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import u9.t;
import w9.G;
import w9.x;
import x9.C6335g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f1205a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f1214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f1217m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f1219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f1220p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f1206b = t.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1207c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f1208d = new char[RecognitionOptions.UPC_E];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1209e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1210f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1211g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1212h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1213i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1218n = 1;

    /* JADX INFO: renamed from: C9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0029a extends x {
        @Override // w9.x
        public void a(a aVar) throws IOException {
            if (aVar instanceof C6335g) {
                ((C6335g) aVar).M0();
                return;
            }
            int iD = aVar.f1213i;
            if (iD == 0) {
                iD = aVar.d();
            }
            if (iD == 13) {
                aVar.f1213i = 9;
            } else if (iD == 12) {
                aVar.f1213i = 8;
            } else {
                if (iD != 14) {
                    throw aVar.p0("a name");
                }
                aVar.f1213i = 10;
            }
        }
    }

    static {
        x.f46439a = new C0029a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f1217m = iArr;
        iArr[0] = 6;
        this.f1219o = new String[32];
        this.f1220p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f1205a = reader;
    }

    private String g(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f1218n;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f1217m[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f1220p[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f1219o[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    public b C() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int D() {
        String str;
        String str2;
        int i10;
        char c10 = this.f1208d[this.f1209e];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        boolean z10 = this.f1206b != t.STRICT;
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f1209e + i11 >= this.f1210f && !f(i11 + 1)) {
                return 0;
            }
            char c11 = this.f1208d[this.f1209e + i11];
            if (c11 != str.charAt(i11) && (!z10 || c11 != str2.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f1209e + length < this.f1210f || f(length + 1)) && k(this.f1208d[this.f1209e + length])) {
            return 0;
        }
        this.f1209e += length;
        this.f1213i = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (k(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        r19.f1214j = r11;
        r19.f1209e += r8;
        r19.f1213i = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r19.f1215k = r8;
        r19.f1213i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        return r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int F() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.a.F():int");
    }

    public final void G(int i10) throws d {
        int i11 = this.f1218n;
        if (i11 - 1 >= this.f1207c) {
            throw new d("Nesting limit " + this.f1207c + " reached" + m());
        }
        int[] iArr = this.f1217m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f1217m = Arrays.copyOf(iArr, i12);
            this.f1220p = Arrays.copyOf(this.f1220p, i12);
            this.f1219o = (String[]) Arrays.copyOf(this.f1219o, i12);
        }
        int[] iArr2 = this.f1217m;
        int i13 = this.f1218n;
        this.f1218n = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char H() throws d {
        int i10;
        if (this.f1209e == this.f1210f && !f(1)) {
            throw k0("Unterminated escape sequence");
        }
        char[] cArr = this.f1208d;
        int i11 = this.f1209e;
        int i12 = i11 + 1;
        this.f1209e = i12;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            throw k0("Invalid escape sequence");
                        }
                        if (i11 + 5 > this.f1210f && !f(4)) {
                            throw k0("Unterminated escape sequence");
                        }
                        int i13 = this.f1209e;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = this.f1208d[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    throw k0("Malformed Unicode escape \\u" + new String(this.f1208d, this.f1209e, 4));
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i16 + i10;
                            i13++;
                        }
                        this.f1209e += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.f1206b == t.STRICT) {
            throw k0("Cannot escape a newline character in strict mode");
        }
        this.f1211g++;
        this.f1212h = i12;
        if (this.f1206b == t.STRICT) {
            throw k0("Invalid escaped character \"'\" in strict mode");
        }
        return c10;
    }

    public final void K(t tVar) {
        Objects.requireNonNull(tVar);
        this.f1206b = tVar;
    }

    public final void S(char c10) throws d {
        char[] cArr = this.f1208d;
        do {
            int i10 = this.f1209e;
            int i11 = this.f1210f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f1209e = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f1209e = i12;
                    H();
                    i10 = this.f1209e;
                    i11 = this.f1210f;
                } else {
                    if (c11 == '\n') {
                        this.f1211g++;
                        this.f1212h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f1209e = i10;
        } while (f(1));
        throw k0("Unterminated string");
    }

    public final boolean Y(String str) {
        int length = str.length();
        while (true) {
            if (this.f1209e + length > this.f1210f && !f(length)) {
                return false;
            }
            char[] cArr = this.f1208d;
            int i10 = this.f1209e;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f1208d[this.f1209e + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f1211g++;
            this.f1212h = i10 + 1;
            this.f1209e++;
        }
    }

    public final void a0() {
        char c10;
        do {
            if (this.f1209e >= this.f1210f && !f(1)) {
                return;
            }
            char[] cArr = this.f1208d;
            int i10 = this.f1209e;
            int i11 = i10 + 1;
            this.f1209e = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f1211g++;
                this.f1212h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public final void b() throws d {
        if (this.f1206b != t.LENIENT) {
            throw k0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    public void beginArray() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 3) {
            throw p0("BEGIN_ARRAY");
        }
        G(1);
        this.f1220p[this.f1218n - 1] = 0;
        this.f1213i = 0;
    }

    public void beginObject() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 1) {
            throw p0("BEGIN_OBJECT");
        }
        G(3);
        this.f1213i = 0;
    }

    public final void c() throws IOException {
        o(true);
        int i10 = this.f1209e;
        this.f1209e = i10 - 1;
        if (i10 + 4 <= this.f1210f || f(5)) {
            int i11 = this.f1209e;
            char[] cArr = this.f1208d;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f1209e = i11 + 5;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1213i = 0;
        this.f1217m[0] = 8;
        this.f1218n = 1;
        this.f1205a.close();
    }

    public int d() throws IOException {
        int iO;
        int[] iArr = this.f1217m;
        int i10 = this.f1218n;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iO2 = o(true);
            if (iO2 != 44) {
                if (iO2 != 59) {
                    if (iO2 != 93) {
                        throw k0("Unterminated array");
                    }
                    this.f1213i = 4;
                    return 4;
                }
                b();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iO = o(true)) != 44) {
                    if (iO != 59) {
                        if (iO != 125) {
                            throw k0("Unterminated object");
                        }
                        this.f1213i = 2;
                        return 2;
                    }
                    b();
                }
                int iO3 = o(true);
                if (iO3 == 34) {
                    this.f1213i = 13;
                    return 13;
                }
                if (iO3 == 39) {
                    b();
                    this.f1213i = 12;
                    return 12;
                }
                if (iO3 == 125) {
                    if (i11 == 5) {
                        throw k0("Expected name");
                    }
                    this.f1213i = 2;
                    return 2;
                }
                b();
                this.f1209e--;
                if (!k((char) iO3)) {
                    throw k0("Expected name");
                }
                this.f1213i = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iO4 = o(true);
                if (iO4 != 58) {
                    if (iO4 != 61) {
                        throw k0("Expected ':'");
                    }
                    b();
                    if (this.f1209e < this.f1210f || f(1)) {
                        char[] cArr = this.f1208d;
                        int i12 = this.f1209e;
                        if (cArr[i12] == '>') {
                            this.f1209e = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f1206b == t.LENIENT) {
                    c();
                }
                this.f1217m[this.f1218n - 1] = 7;
            } else if (i11 == 7) {
                if (o(false) == -1) {
                    this.f1213i = 17;
                    return 17;
                }
                b();
                this.f1209e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iO5 = o(true);
        if (iO5 == 34) {
            this.f1213i = 9;
            return 9;
        }
        if (iO5 == 39) {
            b();
            this.f1213i = 8;
            return 8;
        }
        if (iO5 != 44 && iO5 != 59) {
            if (iO5 == 91) {
                this.f1213i = 3;
                return 3;
            }
            if (iO5 != 93) {
                if (iO5 == 123) {
                    this.f1213i = 1;
                    return 1;
                }
                this.f1209e--;
                int iD = D();
                if (iD != 0) {
                    return iD;
                }
                int iF = F();
                if (iF != 0) {
                    return iF;
                }
                if (!k(this.f1208d[this.f1209e])) {
                    throw k0("Expected value");
                }
                b();
                this.f1213i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f1213i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw k0("Unexpected value");
        }
        b();
        this.f1209e--;
        this.f1213i = 7;
        return 7;
    }

    public void endArray() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 4) {
            throw p0("END_ARRAY");
        }
        int i10 = this.f1218n;
        this.f1218n = i10 - 1;
        int[] iArr = this.f1220p;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f1213i = 0;
    }

    public void endObject() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 2) {
            throw p0("END_OBJECT");
        }
        int i10 = this.f1218n;
        int i11 = i10 - 1;
        this.f1218n = i11;
        this.f1219o[i11] = null;
        int[] iArr = this.f1220p;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f1213i = 0;
    }

    public final boolean f(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f1208d;
        int i13 = this.f1212h;
        int i14 = this.f1209e;
        this.f1212h = i13 - i14;
        int i15 = this.f1210f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f1210f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f1210f = 0;
        }
        this.f1209e = 0;
        do {
            Reader reader = this.f1205a;
            int i17 = this.f1210f;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f1210f + i18;
            this.f1210f = i11;
            if (this.f1211g == 0 && (i12 = this.f1212h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f1209e++;
                this.f1212h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0() throws C9.d {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f1209e
            int r2 = r1 + r0
            int r3 = r4.f1210f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f1208d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.b()
        L4b:
            int r1 = r4.f1209e
            int r1 = r1 + r0
            r4.f1209e = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f1209e = r1
            r0 = 1
            boolean r0 = r4.f(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.a.g0():void");
    }

    public String getPath() {
        return g(false);
    }

    public String h() {
        return g(true);
    }

    public boolean hasNext() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4 || iD == 17) ? false : true;
    }

    public final t i() {
        return this.f1206b;
    }

    public final boolean j() {
        return this.f1206b == t.LENIENT;
    }

    public final boolean k(char c10) throws d {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b();
        return false;
    }

    public final d k0(String str) throws d {
        throw new d(str + m() + "\nSee " + G.a("malformed-json"));
    }

    public String m() {
        return " at line " + (this.f1211g + 1) + " column " + ((this.f1209e - this.f1212h) + 1) + " path " + getPath();
    }

    public boolean nextBoolean() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.f1213i = 0;
            int[] iArr = this.f1220p;
            int i10 = this.f1218n - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iD != 6) {
            throw p0("a boolean");
        }
        this.f1213i = 0;
        int[] iArr2 = this.f1220p;
        int i11 = this.f1218n - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.f1213i = 0;
            int[] iArr = this.f1220p;
            int i10 = this.f1218n - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f1214j;
        }
        if (iD == 16) {
            this.f1216l = new String(this.f1208d, this.f1209e, this.f1215k);
            this.f1209e += this.f1215k;
        } else if (iD == 8 || iD == 9) {
            this.f1216l = q(iD == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
        } else if (iD == 10) {
            this.f1216l = u();
        } else if (iD != 11) {
            throw p0("a double");
        }
        this.f1213i = 11;
        double d10 = Double.parseDouble(this.f1216l);
        if (this.f1206b != t.LENIENT && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw k0("JSON forbids NaN and infinities: " + d10);
        }
        this.f1216l = null;
        this.f1213i = 0;
        int[] iArr2 = this.f1220p;
        int i11 = this.f1218n - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int nextInt() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            long j10 = this.f1214j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f1213i = 0;
                int[] iArr = this.f1220p;
                int i11 = this.f1218n - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f1214j + m());
        }
        if (iD == 16) {
            this.f1216l = new String(this.f1208d, this.f1209e, this.f1215k);
            this.f1209e += this.f1215k;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw p0("an int");
            }
            if (iD == 10) {
                this.f1216l = u();
            } else {
                this.f1216l = q(iD == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
            }
            try {
                int i12 = Integer.parseInt(this.f1216l);
                this.f1213i = 0;
                int[] iArr2 = this.f1220p;
                int i13 = this.f1218n - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1213i = 11;
        double d10 = Double.parseDouble(this.f1216l);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f1216l + m());
        }
        this.f1216l = null;
        this.f1213i = 0;
        int[] iArr3 = this.f1220p;
        int i15 = this.f1218n - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long nextLong() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 15) {
            this.f1213i = 0;
            int[] iArr = this.f1220p;
            int i10 = this.f1218n - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f1214j;
        }
        if (iD == 16) {
            this.f1216l = new String(this.f1208d, this.f1209e, this.f1215k);
            this.f1209e += this.f1215k;
        } else {
            if (iD != 8 && iD != 9 && iD != 10) {
                throw p0("a long");
            }
            if (iD == 10) {
                this.f1216l = u();
            } else {
                this.f1216l = q(iD == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
            }
            try {
                long j10 = Long.parseLong(this.f1216l);
                this.f1213i = 0;
                int[] iArr2 = this.f1220p;
                int i11 = this.f1218n - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1213i = 11;
        double d10 = Double.parseDouble(this.f1216l);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f1216l + m());
        }
        this.f1216l = null;
        this.f1213i = 0;
        int[] iArr3 = this.f1220p;
        int i12 = this.f1218n - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String nextName() throws IOException {
        String strQ;
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strQ = u();
        } else if (iD == 12) {
            strQ = q('\'');
        } else {
            if (iD != 13) {
                throw p0("a name");
            }
            strQ = q(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        this.f1213i = 0;
        this.f1219o[this.f1218n - 1] = strQ;
        return strQ;
    }

    public void nextNull() throws IOException {
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD != 7) {
            throw p0("null");
        }
        this.f1213i = 0;
        int[] iArr = this.f1220p;
        int i10 = this.f1218n - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int iD = this.f1213i;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = u();
        } else if (iD == 8) {
            str = q('\'');
        } else if (iD == 9) {
            str = q(JsonFactory.DEFAULT_QUOTE_CHAR);
        } else if (iD == 11) {
            str = this.f1216l;
            this.f1216l = null;
        } else if (iD == 15) {
            str = Long.toString(this.f1214j);
        } else {
            if (iD != 16) {
                throw p0("a string");
            }
            str = new String(this.f1208d, this.f1209e, this.f1215k);
            this.f1209e += this.f1215k;
        }
        this.f1213i = 0;
        int[] iArr = this.f1220p;
        int i10 = this.f1218n - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.f1208d
            int r1 = r8.f1209e
            int r2 = r8.f1210f
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r8.f1209e = r1
            boolean r1 = r8.f(r3)
            if (r1 != 0) goto L30
            if (r9 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r8 = r8.m()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L30:
            int r1 = r8.f1209e
            int r2 = r8.f1210f
        L34:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L45
            int r1 = r8.f1211g
            int r1 = r1 + r3
            r8.f1211g = r1
            r8.f1212h = r4
            goto Lb2
        L45:
            r6 = 32
            if (r5 == r6) goto Lb2
            r6 = 13
            if (r5 == r6) goto Lb2
            r6 = 9
            if (r5 != r6) goto L52
            goto Lb2
        L52:
            r6 = 47
            if (r5 != r6) goto L9d
            r8.f1209e = r4
            r7 = 2
            if (r4 != r2) goto L69
            r8.f1209e = r1
            boolean r1 = r8.f(r7)
            int r2 = r8.f1209e
            int r2 = r2 + r3
            r8.f1209e = r2
            if (r1 != 0) goto L69
            goto L76
        L69:
            r8.b()
            int r1 = r8.f1209e
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L83
            if (r2 == r6) goto L77
        L76:
            return r5
        L77:
            int r1 = r1 + 1
            r8.f1209e = r1
            r8.a0()
            int r1 = r8.f1209e
            int r2 = r8.f1210f
            goto L6
        L83:
            int r1 = r1 + 1
            r8.f1209e = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.Y(r1)
            if (r1 == 0) goto L96
            int r1 = r8.f1209e
            int r1 = r1 + r7
            int r2 = r8.f1210f
            goto L6
        L96:
            java.lang.String r9 = "Unterminated comment"
            C9.d r8 = r8.k0(r9)
            throw r8
        L9d:
            r1 = 35
            if (r5 != r1) goto Laf
            r8.f1209e = r4
            r8.b()
            r8.a0()
            int r1 = r8.f1209e
            int r2 = r8.f1210f
            goto L6
        Laf:
            r8.f1209e = r4
            return r5
        Lb2:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.a.o(boolean):int");
    }

    public final IllegalStateException p0(String str) {
        return new IllegalStateException("Expected " + str + " but was " + C() + m() + "\nSee " + G.a(C() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.f1209e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q(char r11) throws C9.d {
        /*
            r10 = this;
            char[] r0 = r10.f1208d
            r1 = 0
        L3:
            int r2 = r10.f1209e
            int r3 = r10.f1210f
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L6c
            int r7 = r2 + 1
            char r2 = r0[r2]
            u9.t r8 = r10.f1206b
            u9.t r9 = u9.t.STRICT
            if (r8 != r9) goto L24
            r8 = 32
            if (r2 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            C9.d r10 = r10.k0(r11)
            throw r10
        L24:
            if (r2 != r11) goto L3a
            r10.f1209e = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L32
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L32:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L3a:
            r8 = 92
            if (r2 != r8) goto L5f
            r10.f1209e = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L50
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L50:
            r1.append(r0, r3, r2)
            char r2 = r10.H()
            r1.append(r2)
            int r2 = r10.f1209e
            int r3 = r10.f1210f
            goto L7
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r10.f1211g
            int r2 = r2 + r6
            r10.f1211g = r2
            r10.f1212h = r7
        L6a:
            r2 = r7
            goto L9
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f1209e = r2
            boolean r2 = r10.f(r6)
            if (r2 == 0) goto L8b
            goto L3
        L8b:
            java.lang.String r11 = "Unterminated string"
            C9.d r10 = r10.k0(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.a.q(char):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i10 = 0;
        do {
            int iD = this.f1213i;
            if (iD == 0) {
                iD = d();
            }
            switch (iD) {
                case 1:
                    G(3);
                    i10++;
                    this.f1213i = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f1219o[this.f1218n - 1] = null;
                    }
                    this.f1218n--;
                    i10--;
                    this.f1213i = 0;
                    break;
                case 3:
                    G(1);
                    i10++;
                    this.f1213i = 0;
                    break;
                case 4:
                    this.f1218n--;
                    i10--;
                    this.f1213i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f1213i = 0;
                    break;
                case 8:
                    S('\'');
                    this.f1213i = 0;
                    break;
                case 9:
                    S(JsonFactory.DEFAULT_QUOTE_CHAR);
                    this.f1213i = 0;
                    break;
                case 10:
                    g0();
                    this.f1213i = 0;
                    break;
                case 12:
                    S('\'');
                    if (i10 == 0) {
                        this.f1219o[this.f1218n - 1] = "<skipped>";
                    }
                    this.f1213i = 0;
                    break;
                case 13:
                    S(JsonFactory.DEFAULT_QUOTE_CHAR);
                    if (i10 == 0) {
                        this.f1219o[this.f1218n - 1] = "<skipped>";
                    }
                    this.f1213i = 0;
                    break;
                case 14:
                    g0();
                    if (i10 == 0) {
                        this.f1219o[this.f1218n - 1] = "<skipped>";
                    }
                    this.f1213i = 0;
                    break;
                case 16:
                    this.f1209e += this.f1215k;
                    this.f1213i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f1220p;
        int i11 = this.f1218n - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        b();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u() throws C9.d {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f1209e
            int r4 = r3 + r2
            int r5 = r6.f1210f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f1208d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.b()
            goto L5c
        L4e:
            char[] r3 = r6.f1208d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.f(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f1208d
            int r4 = r6.f1209e
            r0.append(r3, r4, r2)
            int r3 = r6.f1209e
            int r3 = r3 + r2
            r6.f1209e = r3
            r2 = 1
            boolean r2 = r6.f(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f1208d
            int r3 = r6.f1209e
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f1208d
            int r3 = r6.f1209e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f1209e
            int r2 = r2 + r1
            r6.f1209e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.a.u():java.lang.String");
    }
}
