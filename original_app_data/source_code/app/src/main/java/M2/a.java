package M2;

import F1.a;
import F2.e;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.InterfaceC0864l;
import G1.M;
import G1.t;
import K7.AbstractC1081v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f9222a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9228g;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f9224c = 0;
            this.f9225d = -1;
            this.f9226e = "sans-serif";
            this.f9223b = false;
            this.f9227f = 0.85f;
            this.f9228g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f9224c = bArr[24];
        this.f9225d = ((bArr[26] & ForkServer.ERROR) << 24) | ((bArr[27] & ForkServer.ERROR) << 16) | ((bArr[28] & ForkServer.ERROR) << 8) | (bArr[29] & ForkServer.ERROR);
        this.f9226e = "Serif".equals(M.I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f9228g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f9223b = z10;
        if (z10) {
            this.f9227f = M.n(((bArr[11] & ForkServer.ERROR) | ((bArr[10] & ForkServer.ERROR) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f9227f = 0.85f;
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    public static String h(C c10) {
        AbstractC0853a.a(c10.a() >= 2);
        int iT = c10.T();
        if (iT == 0) {
            return "";
        }
        int iG = c10.g();
        Charset charsetV = c10.V();
        int iG2 = iT - (c10.g() - iG);
        if (charsetV == null) {
            charsetV = StandardCharsets.UTF_8;
        }
        return c10.J(iG2, charsetV);
    }

    @Override // F2.s
    public int b() {
        return 2;
    }

    @Override // F2.s
    public void c(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC0864l interfaceC0864l) {
        this.f9222a.Y(bArr, i11 + i10);
        this.f9222a.a0(i10);
        String strH = h(this.f9222a);
        if (strH.isEmpty()) {
            interfaceC0864l.accept(new e(AbstractC1081v.z(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strH);
        f(spannableStringBuilder, this.f9224c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f9225d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f9226e, 0, spannableStringBuilder.length());
        float fN = this.f9227f;
        while (this.f9222a.a() >= 8) {
            int iG = this.f9222a.g();
            int iU = this.f9222a.u();
            int iU2 = this.f9222a.u();
            if (iU2 == 1937013100) {
                AbstractC0853a.a(this.f9222a.a() >= 2);
                int iT = this.f9222a.T();
                for (int i12 = 0; i12 < iT; i12++) {
                    d(this.f9222a, spannableStringBuilder);
                }
            } else if (iU2 == 1952608120 && this.f9223b) {
                AbstractC0853a.a(this.f9222a.a() >= 2);
                fN = M.n(this.f9222a.T() / this.f9228g, 0.0f, 0.95f);
            }
            this.f9222a.a0(iG + iU);
        }
        interfaceC0864l.accept(new e(AbstractC1081v.A(new a.b().o(spannableStringBuilder).h(fN, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    public final void d(C c10, SpannableStringBuilder spannableStringBuilder) {
        AbstractC0853a.a(c10.a() >= 12);
        int iT = c10.T();
        int iT2 = c10.T();
        c10.b0(2);
        int iL = c10.L();
        c10.b0(1);
        int iU = c10.u();
        if (iT2 > spannableStringBuilder.length()) {
            t.h("Tx3gParser", "Truncating styl end (" + iT2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iT2 = spannableStringBuilder.length();
        }
        int i10 = iT2;
        if (iT < i10) {
            f(spannableStringBuilder, iL, this.f9224c, iT, i10, 0);
            e(spannableStringBuilder, iU, this.f9225d, iT, i10, 0);
            return;
        }
        t.h("Tx3gParser", "Ignoring styl with start (" + iT + ") >= end (" + i10 + ").");
    }
}
