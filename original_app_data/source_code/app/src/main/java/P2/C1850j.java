package P2;

import D1.o;
import G1.AbstractC0861i;
import K7.AbstractC1081v;
import P2.L;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: P2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1850j implements L.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12852b;

    public C1850j() {
        this(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    @Override // P2.L.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P2.L a(int r6, P2.L.b r7) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.C1850j.a(int, P2.L$b):P2.L");
    }

    @Override // P2.L.c
    public SparseArray b() {
        return new SparseArray();
    }

    public final G c(L.b bVar) {
        return new G(e(bVar), "video/mp2t");
    }

    public final O d(L.b bVar) {
        return new O(e(bVar), "video/mp2t");
    }

    public final List e(L.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f12852b;
        }
        G1.C c10 = new G1.C(bVar.f12766e);
        List arrayList = this.f12852b;
        while (c10.a() > 0) {
            int iL = c10.L();
            int iG = c10.g() + c10.L();
            if (iL == 134) {
                arrayList = new ArrayList();
                int iL2 = c10.L() & 31;
                for (int i11 = 0; i11 < iL2; i11++) {
                    String strI = c10.I(3);
                    int iL3 = c10.L();
                    boolean z10 = (iL3 & 128) != 0;
                    if (z10) {
                        i10 = iL3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bL = (byte) c10.L();
                    c10.b0(1);
                    arrayList.add(new o.b().y0(str).n0(strI).Q(i10).k0(z10 ? AbstractC0861i.g((bL & 64) != 0) : null).P());
                }
            }
            c10.a0(iG);
        }
        return arrayList;
    }

    public final boolean f(int i10) {
        return (this.f12851a & i10) != 0;
    }

    public C1850j(int i10) {
        this(i10, AbstractC1081v.z());
    }

    public C1850j(int i10, List list) {
        this.f12851a = i10;
        this.f12852b = list;
    }
}
