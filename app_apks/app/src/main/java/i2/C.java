package i2;

import G1.AbstractC0861i;
import H1.g;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f36844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f36845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f36846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f36847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f36848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f36849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f36850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f36851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g.k f36852q;

    public C(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, String str, g.k kVar) {
        this.f36836a = list;
        this.f36837b = i10;
        this.f36838c = i11;
        this.f36839d = i12;
        this.f36840e = i13;
        this.f36841f = i14;
        this.f36842g = i15;
        this.f36843h = i16;
        this.f36844i = i17;
        this.f36845j = i18;
        this.f36846k = i19;
        this.f36847l = i20;
        this.f36848m = i21;
        this.f36849n = f10;
        this.f36850o = i22;
        this.f36851p = str;
        this.f36852q = kVar;
    }

    public static C a(G1.C c10) {
        return b(c10, false, null);
    }

    public static C b(G1.C c10, boolean z10, g.k kVar) throws D1.w {
        boolean z11;
        int i10;
        g.C0084g c0084gT;
        int i11;
        try {
            if (z10) {
                c10.b0(4);
            } else {
                c10.b0(21);
            }
            int iL = c10.L() & 3;
            int iL2 = c10.L();
            int iG = c10.g();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= iL2) {
                    break;
                }
                c10.b0(1);
                int iT = c10.T();
                for (int i15 = 0; i15 < iT; i15++) {
                    int iT2 = c10.T();
                    i14 += iT2 + 4;
                    c10.b0(iT2);
                }
                i13++;
            }
            c10.a0(iG);
            byte[] bArr = new byte[i14];
            g.k kVar2 = kVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            float f10 = 1.0f;
            String strH = null;
            int i28 = 0;
            int i29 = 0;
            while (i28 < iL2) {
                int iL3 = c10.L() & 63;
                int iT3 = c10.T();
                int i30 = i12;
                g.k kVarY = kVar2;
                while (i30 < iT3) {
                    int iT4 = c10.T();
                    boolean z12 = z11;
                    byte[] bArr2 = H1.g.f5132a;
                    int i31 = iL;
                    System.arraycopy(bArr2, i12, bArr, i29, bArr2.length);
                    int length = i29 + bArr2.length;
                    System.arraycopy(c10.f(), c10.g(), bArr, length, iT4);
                    if (iL3 == 32 && i30 == 0) {
                        kVarY = H1.g.y(bArr, length, length + iT4);
                        i10 = iL2;
                    } else {
                        if (iL3 == 33 && i30 == 0) {
                            g.h hVarU = H1.g.u(bArr, length, length + iT4, kVarY);
                            i16 = hVarU.f5166b + 1;
                            i17 = hVarU.f5172h;
                            int i32 = hVarU.f5173i;
                            int i33 = hVarU.f5174j;
                            i10 = iL2;
                            int i34 = hVarU.f5175k;
                            i21 = hVarU.f5169e + 8;
                            i22 = hVarU.f5170f + 8;
                            int i35 = hVarU.f5178n;
                            int i36 = hVarU.f5179o;
                            int i37 = hVarU.f5180p;
                            float f11 = hVarU.f5176l;
                            int i38 = hVarU.f5177m;
                            g.c cVar = hVarU.f5167c;
                            if (cVar != null) {
                                i11 = i38;
                                strH = AbstractC0861i.h(cVar.f5141a, cVar.f5142b, cVar.f5143c, cVar.f5144d, cVar.f5145e, cVar.f5146f);
                            } else {
                                i11 = i38;
                            }
                            f10 = f11;
                            i27 = i11;
                            i24 = i36;
                            i25 = i37;
                            i20 = i34;
                            i23 = i35;
                            i19 = i33;
                            i18 = i32;
                        } else {
                            i10 = iL2;
                            if (iL3 == 39 && i30 == 0 && (c0084gT = H1.g.t(bArr, length, length + iT4)) != null && kVarY != null) {
                                i12 = 0;
                                i26 = c0084gT.f5159d == ((g.a) kVarY.f5187b.get(0)).f5137b ? 4 : 5;
                            }
                        }
                        i12 = 0;
                    }
                    i29 = length + iT4;
                    c10.b0(iT4);
                    i30++;
                    z11 = z12;
                    iL = i31;
                    iL2 = i10;
                }
                i28++;
                kVar2 = kVarY;
            }
            return new C(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iL + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, f10, i27, strH, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw D1.w.a(sb2.toString(), e10);
        }
    }

    public static C c(G1.C c10, g.k kVar) {
        return b(c10, true, kVar);
    }
}
