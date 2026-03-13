package G2;

import F1.a;
import F2.k;
import F2.p;
import F2.q;
import G1.AbstractC0853a;
import G1.C;
import G1.t;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.api.Endpoint;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f4373l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f4376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f4377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4381t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f4382u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f4383v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4385x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4386y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f4368z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f4361A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f4362B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f4363C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, Endpoint.TARGET_FIELD_NUMBER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f4364D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f4365E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f4366F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final boolean[] f4367G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f4369h = new C();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f4374m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0068a f4375n = new C0068a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4384w = 0;

    /* JADX INFO: renamed from: G2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0068a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f4387a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f4388b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StringBuilder f4389c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4393g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4394h;

        /* JADX INFO: renamed from: G2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0069a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f4395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f4396b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f4397c;

            public C0069a(int i10, boolean z10, int i11) {
                this.f4395a = i10;
                this.f4396b = z10;
                this.f4397c = i11;
            }
        }

        public C0068a(int i10, int i11) {
            j(i10);
            this.f4394h = i11;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f4389c.length() < 32) {
                this.f4389c.append(c10);
            }
        }

        public void f() {
            int length = this.f4389c.length();
            if (length > 0) {
                this.f4389c.delete(length - 1, length);
                for (int size = this.f4387a.size() - 1; size >= 0; size--) {
                    C0069a c0069a = (C0069a) this.f4387a.get(size);
                    int i10 = c0069a.f4397c;
                    if (i10 != length) {
                        return;
                    }
                    c0069a.f4397c = i10 - 1;
                }
            }
        }

        public F1.a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f4388b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f4388b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f4391e + this.f4392f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f4393g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f4393g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f4390d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f4393g == 1) {
                i14 -= this.f4394h - 1;
            }
            return new a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f4389c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f4387a.size()) {
                C0069a c0069a = (C0069a) this.f4387a.get(i14);
                boolean z11 = c0069a.f4396b;
                int i16 = c0069a.f4395a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.f4362B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0069a.f4397c;
                i14++;
                if (i17 != (i14 < this.f4387a.size() ? ((C0069a) this.f4387a.get(i14)).f4397c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f4387a.isEmpty() && this.f4388b.isEmpty() && this.f4389c.length() == 0;
        }

        public void j(int i10) {
            this.f4393g = i10;
            this.f4387a.clear();
            this.f4388b.clear();
            this.f4389c.setLength(0);
            this.f4390d = 15;
            this.f4391e = 0;
            this.f4392f = 0;
        }

        public void k() {
            this.f4388b.add(h());
            this.f4389c.setLength(0);
            this.f4387a.clear();
            int iMin = Math.min(this.f4394h, this.f4390d);
            while (this.f4388b.size() >= iMin) {
                this.f4388b.remove(0);
            }
        }

        public void l(int i10) {
            this.f4393g = i10;
        }

        public void m(int i10) {
            this.f4394h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f4387a.add(new C0069a(i10, z10, this.f4389c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            AbstractC0853a.a(j10 >= 16000);
            this.f4373l = j10 * 1000;
        } else {
            this.f4373l = -9223372036854775807L;
        }
        this.f4370i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f4372k = 0;
            this.f4371j = 0;
        } else if (i10 == 2) {
            this.f4372k = 1;
            this.f4371j = 0;
        } else if (i10 == 3) {
            this.f4372k = 0;
            this.f4371j = 1;
        } else if (i10 != 4) {
            t.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f4372k = 0;
            this.f4371j = 0;
        } else {
            this.f4372k = 1;
            this.f4371j = 1;
        }
        O(0);
        N();
        this.f4385x = true;
        this.f4386y = -9223372036854775807L;
    }

    public static boolean B(byte b10) {
        return (b10 & 224) == 0;
    }

    public static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    public static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean E(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    public static boolean F(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public static boolean G(byte b10) {
        return (b10 & 240) == 16;
    }

    public static boolean I(byte b10) {
        return (b10 & 246) == 20;
    }

    public static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    public static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    public static boolean L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    public static char r(byte b10) {
        return (char) f4363C[(b10 & 127) - 32];
    }

    public static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    public static char u(byte b10) {
        return (char) f4365E[b10 & 31];
    }

    public static char v(byte b10) {
        return (char) f4366F[b10 & 31];
    }

    public static char w(byte b10, byte b11) {
        return (b10 & 1) == 0 ? u(b11) : v(b11);
    }

    public static char x(byte b10) {
        return (char) f4364D[b10 & 15];
    }

    public final void A(byte b10, byte b11) {
        int i10 = f4368z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f4375n.f4390d) {
            if (this.f4378q != 1 && !this.f4375n.i()) {
                C0068a c0068a = new C0068a(this.f4378q, this.f4379r);
                this.f4375n = c0068a;
                this.f4374m.add(c0068a);
            }
            this.f4375n.f4390d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f4375n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f4375n.f4391e = f4361A[i11];
        }
    }

    public final boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f4381t = false;
        } else {
            if (this.f4381t && this.f4382u == b10 && this.f4383v == b11) {
                this.f4381t = false;
                return true;
            }
            this.f4381t = true;
            this.f4382u = b10;
            this.f4383v = b11;
        }
        return false;
    }

    public final void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f4385x = false;
            return;
        }
        if (I(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        break;
                    default:
                        switch (b11) {
                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            case 43:
                                this.f4385x = false;
                                break;
                        }
                        return;
                }
            }
            this.f4385x = true;
        }
    }

    public final void N() {
        this.f4375n.j(this.f4378q);
        this.f4374m.clear();
        this.f4374m.add(this.f4375n);
    }

    public final void O(int i10) {
        int i11 = this.f4378q;
        if (i11 == i10) {
            return;
        }
        this.f4378q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f4374m.size(); i12++) {
                ((C0068a) this.f4374m.get(i12)).l(i10);
            }
            return;
        }
        N();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f4376o = Collections.EMPTY_LIST;
        }
    }

    public final void P(int i10) {
        this.f4379r = i10;
        this.f4375n.m(i10);
    }

    public final boolean Q() {
        return (this.f4373l == -9223372036854775807L || this.f4386y == -9223372036854775807L || l() - this.f4386y < this.f4373l) ? false : true;
    }

    public final boolean R(byte b10) {
        if (B(b10)) {
            this.f4384w = s(b10);
        }
        return this.f4384w == this.f4372k;
    }

    @Override // G2.e, F2.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // G2.e, J1.d
    public void flush() {
        super.flush();
        this.f4376o = null;
        this.f4377p = null;
        O(0);
        P(4);
        N();
        this.f4380s = false;
        this.f4381t = false;
        this.f4382u = (byte) 0;
        this.f4383v = (byte) 0;
        this.f4384w = 0;
        this.f4385x = true;
        this.f4386y = -9223372036854775807L;
    }

    @Override // G2.e
    public k g() {
        List list = this.f4376o;
        this.f4377p = list;
        return new f((List) AbstractC0853a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // G2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(F2.p r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.a.h(F2.p):void");
    }

    @Override // G2.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ p e() {
        return super.e();
    }

    @Override // G2.e, J1.d
    /* JADX INFO: renamed from: j */
    public q a() {
        q qVarK;
        q qVarA = super.a();
        if (qVarA != null) {
            return qVarA;
        }
        if (!Q() || (qVarK = k()) == null) {
            return null;
        }
        this.f4376o = Collections.EMPTY_LIST;
        this.f4386y = -9223372036854775807L;
        qVarK.D(l(), g(), Long.MAX_VALUE);
        return qVarK;
    }

    @Override // G2.e
    public boolean m() {
        return this.f4376o != this.f4377p;
    }

    @Override // G2.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void c(p pVar) {
        super.c(pVar);
    }

    public final List t() {
        int size = this.f4374m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            F1.a aVarG = ((C0068a) this.f4374m.get(i10)).g(Integer.MIN_VALUE);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f3608i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            F1.a aVar = (F1.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f3608i != iMin) {
                    aVar = (F1.a) AbstractC0853a.e(((C0068a) this.f4374m.get(i11)).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    public final void y(byte b10) {
        this.f4375n.e(' ');
        this.f4375n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    public final void z(byte b10) {
        if (b10 == 32) {
            O(2);
            return;
        }
        if (b10 == 41) {
            O(3);
            return;
        }
        switch (b10) {
            case 37:
                O(1);
                P(2);
                break;
            case 38:
                O(1);
                P(3);
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                O(1);
                P(4);
                break;
            default:
                int i10 = this.f4378q;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                this.f4376o = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    N();
                                }
                                break;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                if (i10 == 1 && !this.f4375n.i()) {
                                    this.f4375n.k();
                                    break;
                                }
                                break;
                            case 46:
                                N();
                                break;
                            case 47:
                                this.f4376o = t();
                                N();
                                break;
                        }
                    } else {
                        this.f4375n.f();
                        break;
                    }
                }
                break;
        }
    }

    @Override // G2.e, J1.d
    public void release() {
    }
}
