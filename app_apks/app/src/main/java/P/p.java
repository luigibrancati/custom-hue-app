package P;

import L.I;
import L.InterfaceC1132x0;
import L.s1;
import M.a;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f12539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12540d;

    public p(I i10, Rational rational) {
        this.f12537a = i10.c();
        this.f12538b = i10.f();
        this.f12539c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f12540d = z10;
    }

    public static Size a(Size size, int i10, int i11, int i12) {
        return (size == null || !e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static Rational b(Size size, List list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : o.k(list)) {
            if (M.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static boolean e(int i10, int i11, int i12) {
        int iA = M.c.a(M.c.b(i10), i12, 1 == i11);
        return iA == 90 || iA == 270;
    }

    public final Rational c(InterfaceC1132x0 interfaceC1132x0, List list) {
        if (interfaceC1132x0.w()) {
            return o.n(interfaceC1132x0.y(), this.f12540d);
        }
        Size sizeD = d(interfaceC1132x0);
        if (sizeD != null) {
            return b(sizeD, list);
        }
        return null;
    }

    public final Size d(InterfaceC1132x0 interfaceC1132x0) {
        return a(interfaceC1132x0.O(null), interfaceC1132x0.B(0), this.f12538b, this.f12537a);
    }

    public List f(List list, s1 s1Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new M.d(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC1132x0 interfaceC1132x0 = (InterfaceC1132x0) s1Var;
        Size sizeI = interfaceC1132x0.i(null);
        Size size = (Size) arrayList.get(0);
        if (sizeI == null || T.d.b(size) < T.d.b(sizeI)) {
            sizeI = size;
        }
        Size sizeD = d(interfaceC1132x0);
        Size size2 = T.d.f15880c;
        int iB = T.d.b(size2);
        if (T.d.b(sizeI) < iB) {
            size2 = T.d.f15878a;
        } else if (sizeD != null && T.d.b(sizeD) < iB) {
            size2 = sizeD;
        }
        for (Size size3 : arrayList) {
            if (T.d.b(size3) <= T.d.b(sizeI) && T.d.b(size3) >= T.d.b(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeI + "\ninitial size list: " + arrayList);
        }
        Rational rationalC = c(interfaceC1132x0, arrayList2);
        if (sizeD == null) {
            sizeD = interfaceC1132x0.I(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalC == null) {
            arrayList3.addAll(arrayList2);
            if (sizeD != null) {
                o.q(arrayList3, sizeD, true);
                return arrayList3;
            }
        } else {
            Map mapO = o.o(arrayList2);
            if (sizeD != null) {
                Iterator it = mapO.keySet().iterator();
                while (it.hasNext()) {
                    o.q((List) mapO.get((Rational) it.next()), sizeD, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapO.keySet());
            Collections.sort(arrayList4, new a.C0133a(rationalC, this.f12539c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : (List) mapO.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
