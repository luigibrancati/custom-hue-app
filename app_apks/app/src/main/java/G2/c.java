package G2;

import F1.a;
import F2.k;
import F2.p;
import F2.q;
import G1.AbstractC0853a;
import G1.AbstractC0861i;
import G1.B;
import G1.C;
import G1.t;
import G2.c;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f4398h = new C();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B f4399i = new B();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4400j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b[] f4403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f4404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f4405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f4406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0070c f4407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4408r;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Comparator f4409c = new Comparator() { // from class: G2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f4411b, ((c.a) obj).f4411b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final F1.a f4410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4411b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            a.b bVarN = new a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f4410a = bVarN.a();
            this.f4411b = i14;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int[] f4412A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final boolean[] f4413B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final int[] f4414C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final int[] f4415D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int[] f4416E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final int[] f4417F;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f4418v = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f4419w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f4420x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int[] f4421y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f4422z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f4423a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f4424b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4428f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4429g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4430h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4431i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f4432j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f4433k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f4434l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4435m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f4436n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f4437o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f4438p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f4439q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f4440r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f4441s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4442t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4443u;

        static {
            int iH = h(0, 0, 0, 0);
            f4419w = iH;
            int iH2 = h(0, 0, 0, 3);
            f4420x = iH2;
            f4421y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f4422z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f4412A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f4413B = new boolean[]{false, false, false, true, true, true, false};
            f4414C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f4415D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f4416E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f4417F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                G1.AbstractC0853a.c(r4, r0, r1)
                G1.AbstractC0853a.c(r5, r0, r1)
                G1.AbstractC0853a.c(r6, r0, r1)
                G1.AbstractC0853a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: G2.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f4424b.append(c10);
                return;
            }
            this.f4423a.add(d());
            this.f4424b.clear();
            if (this.f4437o != -1) {
                this.f4437o = 0;
            }
            if (this.f4438p != -1) {
                this.f4438p = 0;
            }
            if (this.f4439q != -1) {
                this.f4439q = 0;
            }
            if (this.f4441s != -1) {
                this.f4441s = 0;
            }
            while (true) {
                if (this.f4423a.size() < this.f4432j && this.f4423a.size() < 15) {
                    this.f4443u = this.f4423a.size();
                    return;
                }
                this.f4423a.remove(0);
            }
        }

        public void b() {
            int length = this.f4424b.length();
            if (length > 0) {
                this.f4424b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8, types: [int] */
        /* JADX WARN: Type inference failed for: r7v9 */
        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            boolean z10;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f4423a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f4423a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f4433k;
            int i12 = 1;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f4433k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f4428f) {
                f10 = this.f4430h / 99.0f;
                f11 = this.f4429g / 99.0f;
            } else {
                f10 = this.f4430h / 209.0f;
                f11 = this.f4429g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i13 = this.f4431i;
            if (i13 / 3 == 0) {
                z10 = true;
                i12 = 0;
            } else if (i13 / 3 == 1) {
                z10 = true;
            } else {
                z10 = true;
                i12 = 2;
            }
            ?? r72 = i13 % 3 == 0 ? 0 : i13 % 3 == z10 ? z10 : 2;
            if (this.f4436n == f4419w) {
                z10 = false;
            }
            return new a(spannableStringBuilder, alignment, f13, 0, i12, f12, r72, -3.4028235E38f, z10, this.f4436n, this.f4427e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f4424b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f4437o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f4437o, length, 33);
                }
                if (this.f4438p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f4438p, length, 33);
                }
                if (this.f4439q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f4440r), this.f4439q, length, 33);
                }
                if (this.f4441s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f4442t), this.f4441s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f4423a.clear();
            this.f4424b.clear();
            this.f4437o = -1;
            this.f4438p = -1;
            this.f4439q = -1;
            this.f4441s = -1;
            this.f4443u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f4425c = true;
            this.f4426d = z10;
            this.f4427e = i10;
            this.f4428f = z11;
            this.f4429g = i11;
            this.f4430h = i12;
            this.f4431i = i14;
            int i17 = i13 + 1;
            if (this.f4432j != i17) {
                this.f4432j = i17;
                while (true) {
                    if (this.f4423a.size() < this.f4432j && this.f4423a.size() < 15) {
                        break;
                    } else {
                        this.f4423a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f4434l != i15) {
                this.f4434l = i15;
                int i18 = i15 - 1;
                q(f4414C[i18], f4420x, f4413B[i18], 0, f4422z[i18], f4412A[i18], f4421y[i18]);
            }
            if (i16 == 0 || this.f4435m == i16) {
                return;
            }
            this.f4435m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, f4416E[i19], f4415D[i19]);
            n(f4418v, f4417F[i19], f4419w);
        }

        public boolean i() {
            return this.f4425c;
        }

        public boolean j() {
            if (i()) {
                return this.f4423a.isEmpty() && this.f4424b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f4426d;
        }

        public void l() {
            e();
            this.f4425c = false;
            this.f4426d = false;
            this.f4427e = 4;
            this.f4428f = false;
            this.f4429g = 0;
            this.f4430h = 0;
            this.f4431i = 0;
            this.f4432j = 15;
            this.f4433k = 0;
            this.f4434l = 0;
            this.f4435m = 0;
            int i10 = f4419w;
            this.f4436n = i10;
            this.f4440r = f4418v;
            this.f4442t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f4437o != -1) {
                if (!z10) {
                    this.f4424b.setSpan(new StyleSpan(2), this.f4437o, this.f4424b.length(), 33);
                    this.f4437o = -1;
                }
            } else if (z10) {
                this.f4437o = this.f4424b.length();
            }
            if (this.f4438p == -1) {
                if (z11) {
                    this.f4438p = this.f4424b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f4424b.setSpan(new UnderlineSpan(), this.f4438p, this.f4424b.length(), 33);
                this.f4438p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f4439q != -1 && this.f4440r != i10) {
                this.f4424b.setSpan(new ForegroundColorSpan(this.f4440r), this.f4439q, this.f4424b.length(), 33);
            }
            if (i10 != f4418v) {
                this.f4439q = this.f4424b.length();
                this.f4440r = i10;
            }
            if (this.f4441s != -1 && this.f4442t != i11) {
                this.f4424b.setSpan(new BackgroundColorSpan(this.f4442t), this.f4441s, this.f4424b.length(), 33);
            }
            if (i11 != f4419w) {
                this.f4441s = this.f4424b.length();
                this.f4442t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f4443u != i10) {
                a('\n');
            }
            this.f4443u = i10;
        }

        public void p(boolean z10) {
            this.f4426d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f4436n = i10;
            this.f4433k = i15;
        }
    }

    /* JADX INFO: renamed from: G2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0070c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f4446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4447d = 0;

        public C0070c(int i10, int i11) {
            this.f4444a = i10;
            this.f4445b = i11;
            this.f4446c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List list) {
        this.f4402l = i10 == -1 ? 1 : i10;
        this.f4401k = list != null && AbstractC0861i.D(list);
        this.f4403m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f4403m[i11] = new b();
        }
        this.f4404n = this.f4403m[0];
    }

    private void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f4403m[i10].l();
        }
    }

    private List r() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f4403m[i10].j() && this.f4403m[i10].k() && (aVarC = this.f4403m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f4409c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f4410a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void A(int i10) {
        if (i10 == 160) {
            this.f4404n.a((char) 13252);
            return;
        }
        t.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f4404n.a('_');
    }

    public final void B() {
        this.f4404n.m(this.f4399i.h(4), this.f4399i.h(2), this.f4399i.h(2), this.f4399i.g(), this.f4399i.g(), this.f4399i.h(3), this.f4399i.h(3));
    }

    public final void C() {
        int iH = b.h(this.f4399i.h(2), this.f4399i.h(2), this.f4399i.h(2), this.f4399i.h(2));
        int iH2 = b.h(this.f4399i.h(2), this.f4399i.h(2), this.f4399i.h(2), this.f4399i.h(2));
        this.f4399i.r(2);
        this.f4404n.n(iH, iH2, b.g(this.f4399i.h(2), this.f4399i.h(2), this.f4399i.h(2)));
    }

    public final void D() {
        this.f4399i.r(4);
        int iH = this.f4399i.h(4);
        this.f4399i.r(2);
        this.f4404n.o(iH, this.f4399i.h(6));
    }

    public final void E() {
        int iH = b.h(this.f4399i.h(2), this.f4399i.h(2), this.f4399i.h(2), this.f4399i.h(2));
        int iH2 = this.f4399i.h(2);
        int iG = b.g(this.f4399i.h(2), this.f4399i.h(2), this.f4399i.h(2));
        if (this.f4399i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f4399i.g();
        int iH3 = this.f4399i.h(2);
        int iH4 = this.f4399i.h(2);
        int iH5 = this.f4399i.h(2);
        this.f4399i.r(8);
        this.f4404n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    public final void F() {
        C0070c c0070c = this.f4407q;
        if (c0070c.f4447d != (c0070c.f4445b * 2) - 1) {
            t.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f4407q.f4445b * 2) - 1) + ", but current index is " + this.f4407q.f4447d + " (sequence number " + this.f4407q.f4444a + ");");
        }
        B b10 = this.f4399i;
        C0070c c0070c2 = this.f4407q;
        b10.o(c0070c2.f4446c, c0070c2.f4447d);
        boolean z10 = false;
        while (true) {
            if (this.f4399i.b() <= 0) {
                break;
            }
            int iH = this.f4399i.h(3);
            int iH2 = this.f4399i.h(5);
            if (iH == 7) {
                this.f4399i.r(2);
                iH = this.f4399i.h(6);
                if (iH < 7) {
                    t.h("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH != 0) {
                    t.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                }
            } else if (iH != this.f4402l) {
                this.f4399i.s(iH2);
            } else {
                int iE = this.f4399i.e() + (iH2 * 8);
                while (this.f4399i.e() < iE) {
                    int iH3 = this.f4399i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f4399i.h(8);
                        if (iH4 <= 31) {
                            u(iH4);
                        } else {
                            if (iH4 <= 127) {
                                z(iH4);
                            } else if (iH4 <= 159) {
                                v(iH4);
                            } else if (iH4 <= 255) {
                                A(iH4);
                            } else {
                                t.h("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        s(iH3);
                    } else {
                        if (iH3 <= 127) {
                            x(iH3);
                        } else if (iH3 <= 159) {
                            t(iH3);
                        } else if (iH3 <= 255) {
                            y(iH3);
                        } else {
                            t.h("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f4405o = r();
        }
    }

    @Override // G2.e, F2.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // G2.e, J1.d
    public void flush() {
        super.flush();
        this.f4405o = null;
        this.f4406p = null;
        this.f4408r = 0;
        this.f4404n = this.f4403m[0];
        G();
        this.f4407q = null;
    }

    @Override // G2.e
    public k g() {
        List list = this.f4405o;
        this.f4406p = list;
        return new f((List) AbstractC0853a.e(list));
    }

    @Override // G2.e
    public void h(p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC0853a.e(pVar.f5878d);
        this.f4398h.Y(byteBuffer.array(), byteBuffer.limit());
        while (this.f4398h.a() >= 3) {
            int iL = this.f4398h.L();
            int i10 = iL & 3;
            boolean z10 = (iL & 4) == 4;
            byte bL = (byte) this.f4398h.L();
            byte bL2 = (byte) this.f4398h.L();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        q();
                        int i11 = (bL & 192) >> 6;
                        int i12 = this.f4400j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            G();
                            t.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f4400j + " current=" + i11);
                        }
                        this.f4400j = i11;
                        int i13 = bL & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0070c c0070c = new C0070c(i11, i13);
                        this.f4407q = c0070c;
                        byte[] bArr = c0070c.f4446c;
                        int i14 = c0070c.f4447d;
                        c0070c.f4447d = i14 + 1;
                        bArr[i14] = bL2;
                    } else {
                        AbstractC0853a.a(i10 == 2);
                        C0070c c0070c2 = this.f4407q;
                        if (c0070c2 == null) {
                            t.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0070c2.f4446c;
                            int i15 = c0070c2.f4447d;
                            int i16 = i15 + 1;
                            c0070c2.f4447d = i16;
                            bArr2[i15] = bL;
                            c0070c2.f4447d = i15 + 2;
                            bArr2[i16] = bL2;
                        }
                    }
                    C0070c c0070c3 = this.f4407q;
                    if (c0070c3.f4447d == (c0070c3.f4445b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // G2.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ p e() {
        return super.e();
    }

    @Override // G2.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ q a() {
        return super.a();
    }

    @Override // G2.e
    public boolean m() {
        return this.f4405o != this.f4406p;
    }

    @Override // G2.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void c(p pVar) {
        super.c(pVar);
    }

    public final void q() {
        if (this.f4407q == null) {
            return;
        }
        F();
        this.f4407q = null;
    }

    @Override // G2.e, J1.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f4405o = r();
                return;
            }
            if (i10 == 8) {
                this.f4404n.b();
                return;
            }
            switch (i10) {
                case 12:
                    G();
                    break;
                case 13:
                    this.f4404n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        t.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f4399i.r(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        t.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f4399i.r(16);
                    } else {
                        t.h("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void t(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f4408r != i12) {
                    this.f4408r = i12;
                    this.f4404n = this.f4403m[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f4399i.g()) {
                        this.f4403m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f4399i.g()) {
                        this.f4403m[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f4399i.g()) {
                        this.f4403m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f4399i.g()) {
                        this.f4403m[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f4399i.g()) {
                        this.f4403m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f4399i.r(8);
                break;
            case 142:
                break;
            case 143:
                G();
                break;
            case 144:
                if (this.f4404n.i()) {
                    B();
                } else {
                    this.f4399i.r(16);
                }
                break;
            case 145:
                if (this.f4404n.i()) {
                    C();
                } else {
                    this.f4399i.r(24);
                }
                break;
            case 146:
                if (this.f4404n.i()) {
                    D();
                } else {
                    this.f4399i.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                t.h("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f4404n.i()) {
                    E();
                } else {
                    this.f4399i.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                w(i15);
                if (this.f4408r != i15) {
                    this.f4408r = i15;
                    this.f4404n = this.f4403m[i15];
                }
                break;
        }
    }

    public final void u(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f4399i.r(8);
        } else if (i10 <= 23) {
            this.f4399i.r(16);
        } else if (i10 <= 31) {
            this.f4399i.r(24);
        }
    }

    public final void v(int i10) {
        if (i10 <= 135) {
            this.f4399i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f4399i.r(40);
        } else if (i10 <= 159) {
            this.f4399i.r(2);
            this.f4399i.r(this.f4399i.h(6) * 8);
        }
    }

    public final void w(int i10) {
        b bVar = this.f4403m[i10];
        this.f4399i.r(2);
        boolean zG = this.f4399i.g();
        this.f4399i.r(2);
        int iH = this.f4399i.h(3);
        boolean zG2 = this.f4399i.g();
        int iH2 = this.f4399i.h(7);
        int iH3 = this.f4399i.h(8);
        int iH4 = this.f4399i.h(4);
        int iH5 = this.f4399i.h(4);
        this.f4399i.r(2);
        this.f4399i.r(6);
        this.f4399i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f4399i.h(3), this.f4399i.h(3));
    }

    public final void x(int i10) {
        if (i10 == 127) {
            this.f4404n.a((char) 9835);
        } else {
            this.f4404n.a((char) (i10 & 255));
        }
    }

    public final void y(int i10) {
        this.f4404n.a((char) (i10 & 255));
    }

    public final void z(int i10) {
        if (i10 == 32) {
            this.f4404n.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f4404n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f4404n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f4404n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f4404n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f4404n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f4404n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f4404n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f4404n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f4404n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f4404n.a((char) 9608);
                break;
            case 49:
                this.f4404n.a((char) 8216);
                break;
            case 50:
                this.f4404n.a((char) 8217);
                break;
            case 51:
                this.f4404n.a((char) 8220);
                break;
            case 52:
                this.f4404n.a((char) 8221);
                break;
            case 53:
                this.f4404n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f4404n.a((char) 8539);
                        break;
                    case 119:
                        this.f4404n.a((char) 8540);
                        break;
                    case 120:
                        this.f4404n.a((char) 8541);
                        break;
                    case 121:
                        this.f4404n.a((char) 8542);
                        break;
                    case 122:
                        this.f4404n.a((char) 9474);
                        break;
                    case 123:
                        this.f4404n.a((char) 9488);
                        break;
                    case 124:
                        this.f4404n.a((char) 9492);
                        break;
                    case 125:
                        this.f4404n.a((char) 9472);
                        break;
                    case 126:
                        this.f4404n.a((char) 9496);
                        break;
                    case 127:
                        this.f4404n.a((char) 9484);
                        break;
                    default:
                        t.h("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
                break;
        }
    }
}
