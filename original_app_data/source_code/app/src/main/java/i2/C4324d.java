package i2;

import G1.AbstractC0861i;
import H1.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: i2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4324d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f36959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f36960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f36961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f36962l;

    public C4324d(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f36951a = list;
        this.f36952b = i10;
        this.f36953c = i11;
        this.f36954d = i12;
        this.f36955e = i13;
        this.f36956f = i14;
        this.f36957g = i15;
        this.f36958h = i16;
        this.f36959i = i17;
        this.f36960j = i18;
        this.f36961k = f10;
        this.f36962l = str;
    }

    public static byte[] a(G1.C c10) {
        int iT = c10.T();
        int iG = c10.g();
        c10.b0(iT);
        return AbstractC0861i.j(c10.f(), iG, iT);
    }

    public static C4324d b(G1.C c10) throws D1.w {
        String strF;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            c10.b0(4);
            int iL = (c10.L() & 3) + 1;
            if (iL == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iL2 = c10.L() & 31;
            for (int i18 = 0; i18 < iL2; i18++) {
                arrayList.add(a(c10));
            }
            int iL3 = c10.L();
            for (int i19 = 0; i19 < iL3; i19++) {
                arrayList.add(a(c10));
            }
            if (iL2 > 0) {
                g.m mVarC = H1.g.C((byte[]) arrayList.get(0), H1.g.f5132a.length, ((byte[]) arrayList.get(0)).length);
                int i20 = mVarC.f5199f;
                int i21 = mVarC.f5200g;
                int i22 = mVarC.f5202i + 8;
                int i23 = mVarC.f5203j + 8;
                int i24 = mVarC.f5210q;
                int i25 = mVarC.f5211r;
                int i26 = mVarC.f5212s;
                int i27 = mVarC.f5213t;
                float f11 = mVarC.f5201h;
                strF = AbstractC0861i.f(mVarC.f5194a, mVarC.f5195b, mVarC.f5196c);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strF = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new C4324d(arrayList, iL, i10, i11, i12, i13, i16, i17, i14, i15, f10, strF);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw D1.w.a("Error parsing AVC config", e10);
        }
    }
}
