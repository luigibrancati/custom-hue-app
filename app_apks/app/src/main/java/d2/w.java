package d2;

import D1.E;
import D1.G;
import K7.AbstractC1081v;
import a2.n0;
import android.os.SystemClock;
import d2.u;
import e2.k;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static G a(u.a aVar, v[] vVarArr) {
        List[] listArr = new List[vVarArr.length];
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            v vVar = vVarArr[i10];
            listArr[i10] = vVar != null ? AbstractC1081v.A(vVar) : AbstractC1081v.z();
        }
        return b(aVar, listArr);
    }

    public static G b(u.a aVar, List[] listArr) {
        boolean z10;
        AbstractC1081v.a aVar2 = new AbstractC1081v.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            n0 n0VarF = aVar.f(i10);
            List list = listArr[i10];
            for (int i11 = 0; i11 < n0VarF.f20863a; i11++) {
                E eB = n0VarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = eB.f1491a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < eB.f1491a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        v vVar = (v) list.get(i14);
                        if (vVar.n().equals(eB) && vVar.l(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new G.a(eB, z11, iArr, zArr));
            }
        }
        n0 n0VarH = aVar.h();
        for (int i15 = 0; i15 < n0VarH.f20863a; i15++) {
            E eB2 = n0VarH.b(i15);
            int[] iArr2 = new int[eB2.f1491a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new G.a(eB2, false, iArr2, new boolean[eB2.f1491a]));
        }
        return new G(aVar2.k());
    }

    public static k.a c(r rVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new k.a(1, 0, length, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point d(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = G1.M.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = G1.M.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.w.d(boolean, int, int, int, int):android.graphics.Point");
    }
}
