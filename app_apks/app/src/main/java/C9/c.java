package C9;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import u9.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f1221l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f1222m = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f1223n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f1224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1225b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1226c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u9.d f1227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f1231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1234k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f1222m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f1222m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f1223n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        G(6);
        this.f1231h = t.LEGACY_STRICT;
        this.f1234k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f1224a = writer;
        K(u9.d.f45409d);
    }

    public static boolean a(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public c C() throws IOException {
        if (this.f1233j != null) {
            if (!this.f1234k) {
                this.f1233j = null;
                return this;
            }
            J0();
        }
        c();
        this.f1224a.write("null");
        return this;
    }

    public c C0(String str) throws IOException {
        if (str == null) {
            return C();
        }
        J0();
        c();
        g0(str);
        return this;
    }

    public final c D(int i10, char c10) throws IOException {
        c();
        G(i10);
        this.f1224a.write(c10);
        return this;
    }

    public final int F() {
        int i10 = this.f1226c;
        if (i10 != 0) {
            return this.f1225b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void G(int i10) {
        int i11 = this.f1226c;
        int[] iArr = this.f1225b;
        if (i11 == iArr.length) {
            this.f1225b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f1225b;
        int i12 = this.f1226c;
        this.f1226c = i12 + 1;
        iArr2[i12] = i10;
    }

    public c G0(boolean z10) throws IOException {
        J0();
        c();
        this.f1224a.write(z10 ? "true" : "false");
        return this;
    }

    public final void H(int i10) {
        this.f1225b[this.f1226c - 1] = i10;
    }

    public final void J0() throws IOException {
        if (this.f1233j != null) {
            b();
            g0(this.f1233j);
            this.f1233j = null;
        }
    }

    public final void K(u9.d dVar) {
        Objects.requireNonNull(dVar);
        this.f1227d = dVar;
        this.f1229f = ",";
        if (dVar.c()) {
            this.f1228e = ": ";
            if (this.f1227d.b().isEmpty()) {
                this.f1229f = ", ";
            }
        } else {
            this.f1228e = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
        }
        this.f1230g = this.f1227d.b().isEmpty() && this.f1227d.a().isEmpty();
    }

    public final void S(boolean z10) {
        this.f1232i = z10;
    }

    public final void Y(boolean z10) {
        this.f1234k = z10;
    }

    public final void a0(t tVar) {
        Objects.requireNonNull(tVar);
        this.f1231h = tVar;
    }

    public final void b() throws IOException {
        int iF = F();
        if (iF == 5) {
            this.f1224a.write(this.f1229f);
        } else if (iF != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        u();
        H(4);
    }

    public final void c() throws IOException {
        int iF = F();
        if (iF == 1) {
            H(2);
            u();
            return;
        }
        if (iF == 2) {
            this.f1224a.append((CharSequence) this.f1229f);
            u();
        } else {
            if (iF == 4) {
                this.f1224a.append((CharSequence) this.f1228e);
                H(5);
                return;
            }
            if (iF != 6) {
                if (iF != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f1231h != t.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            H(7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1224a.close();
        int i10 = this.f1226c;
        if (i10 > 1 || (i10 == 1 && this.f1225b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1226c = 0;
    }

    public c d() throws IOException {
        J0();
        return D(1, '[');
    }

    public c f() throws IOException {
        J0();
        return D(3, '{');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f1226c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1224a.flush();
    }

    public final c g(int i10, int i11, char c10) throws IOException {
        int iF = F();
        if (iF != i11 && iF != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f1233j != null) {
            throw new IllegalStateException("Dangling name: " + this.f1233j);
        }
        this.f1226c--;
        if (iF == i11) {
            u();
        }
        this.f1224a.write(c10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f1232i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = C9.c.f1223n
            goto L9
        L7:
            java.lang.String[] r0 = C9.c.f1222m
        L9:
            java.io.Writer r1 = r8.f1224a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f1224a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f1224a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f1224a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r8 = r8.f1224a
            r8.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.c.g0(java.lang.String):void");
    }

    public c h() {
        return g(1, 2, ']');
    }

    public c i() {
        return g(3, 5, '}');
    }

    public final boolean j() {
        return this.f1234k;
    }

    public final t k() {
        return this.f1231h;
    }

    public c k0(double d10) throws IOException {
        J0();
        if (this.f1231h == t.LENIENT || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            c();
            this.f1224a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public final boolean m() {
        return this.f1232i;
    }

    public boolean o() {
        return this.f1231h == t.LENIENT;
    }

    public c p0(long j10) throws IOException {
        J0();
        c();
        this.f1224a.write(Long.toString(j10));
        return this;
    }

    public c q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f1233j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iF = F();
        if (iF != 3 && iF != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f1233j = str;
        return this;
    }

    public final void u() throws IOException {
        if (this.f1230g) {
            return;
        }
        this.f1224a.write(this.f1227d.b());
        int i10 = this.f1226c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f1224a.write(this.f1227d.a());
        }
    }

    public c v0(Boolean bool) throws IOException {
        if (bool == null) {
            return C();
        }
        J0();
        c();
        this.f1224a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c x0(Number number) throws IOException {
        if (number == null) {
            return C();
        }
        J0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f1231h != t.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f1221l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        c();
        this.f1224a.append((CharSequence) string);
        return this;
    }
}
