package P;

import E.AbstractC0807p0;
import L.I;
import L.InterfaceC1132x0;
import L.s1;
import M.a;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f12532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rational f12535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f12536e;

    public o(I i10, Size size) {
        this.f12532a = i10;
        this.f12533b = i10.c();
        this.f12534c = i10.f();
        Rational rationalH = size != null ? h(size) : i(i10);
        this.f12535d = rationalH;
        this.f12536e = new p(i10, rationalH);
    }

    public static LinkedHashMap a(List list, X.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    public static LinkedHashMap b(Map map, X.a aVar, Rational rational) {
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        Rational rationalN = n(aVar.b(), z10);
        if (aVar.a() == 0) {
            Rational rationalN2 = n(aVar.b(), z10);
            for (Rational rational2 : new ArrayList(map.keySet())) {
                if (!rational2.equals(rationalN2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new a.C0133a(rationalN, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, (List) map.get(rational3));
        }
        return linkedHashMap;
    }

    public static void d(LinkedHashMap linkedHashMap, Size size) {
        int iB = T.d.b(size);
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = (List) linkedHashMap.get((Rational) it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (T.d.b(size2) <= iB) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    public static List e(List list, X.b bVar, int i10, int i11, int i12) {
        if (bVar == null) {
            return list;
        }
        List listA = bVar.a(new ArrayList(list), M.c.a(M.c.b(i10), i11, i12 == 1));
        if (list.containsAll(listA)) {
            return listA;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    public static void f(LinkedHashMap linkedHashMap, X.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g((List) linkedHashMap.get((Rational) it.next()), dVar);
        }
    }

    public static void g(List list, X.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int iB = dVar.b();
        if (dVar.equals(X.d.f17983c)) {
            return;
        }
        Size sizeA = dVar.a();
        if (iB == 0) {
            s(list, sizeA);
            return;
        }
        if (iB == 1) {
            q(list, sizeA, true);
            return;
        }
        if (iB == 2) {
            q(list, sizeA, false);
        } else if (iB == 3) {
            r(list, sizeA, true);
        } else {
            if (iB != 4) {
                return;
            }
            r(list, sizeA, false);
        }
    }

    public static List k(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(M.a.f8804a);
        arrayList.add(M.a.f8806c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (M.a.a(size, (Rational) it2.next())) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static Rational n(int i10, boolean z10) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return z10 ? M.a.f8804a : M.a.f8805b;
        }
        if (i10 == 1) {
            return z10 ? M.a.f8806c : M.a.f8807d;
        }
        AbstractC0807p0.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        return null;
    }

    public static Map o(List list) {
        HashMap map = new HashMap();
        Iterator it = k(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (M.a.a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List p(X.c cVar, List list, Size size, int i10, Rational rational, int i11, int i12) {
        LinkedHashMap linkedHashMapA = a(list, cVar.b(), rational);
        if (size != null) {
            d(linkedHashMapA, size);
        }
        f(linkedHashMapA, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMapA.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : (List) it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i10, i11, i12);
    }

    public static void q(List list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public static void r(List list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = (Size) list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public static void s(List list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    public final List c(List list, X.c cVar, int i10) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f12532a.g(i10));
        Collections.sort(arrayList, new M.d(true));
        return arrayList;
    }

    public final Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final Rational i(I i10) {
        List listL = i10.l(256);
        if (listL.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listL, new M.d());
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List j(List list, int i10) {
        List listL = l(list, i10);
        if (listL == null) {
            listL = this.f12532a.l(i10);
        }
        ArrayList arrayList = new ArrayList(listL);
        Collections.sort(arrayList, new M.d(true));
        if (arrayList.isEmpty()) {
            AbstractC0807p0.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i10 + ".");
        }
        return arrayList;
    }

    public final List l(List list, int i10) {
        Size[] sizeArr;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == i10) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    public List m(s1 s1Var) {
        InterfaceC1132x0 interfaceC1132x0 = (InterfaceC1132x0) s1Var;
        List listD = interfaceC1132x0.D(null);
        if (listD != null) {
            return listD;
        }
        X.c cVarN = interfaceC1132x0.N(null);
        List listJ = j(interfaceC1132x0.l(null), s1Var.getInputFormat());
        if (cVarN == null) {
            return this.f12536e.f(listJ, s1Var);
        }
        Size sizeI = ((InterfaceC1132x0) s1Var).i(null);
        int iB = interfaceC1132x0.B(0);
        if (!s1Var.Z(false)) {
            listJ = c(listJ, cVarN, s1Var.getInputFormat());
        }
        List list = listJ;
        AbstractC0807p0.a("SupportedOutputSizesCollector", "useCaseConfig = " + s1Var + ", candidateSizes = " + list);
        return p(interfaceC1132x0.m(), list, sizeI, iB, this.f12535d, this.f12533b, this.f12534c);
    }
}
