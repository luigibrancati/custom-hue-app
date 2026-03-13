package Y;

import E.AbstractC0807p0;
import L.I;
import L.InterfaceC1132x0;
import L.J;
import L.L0;
import L.s1;
import M.y;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f19511h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f19512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rational f19513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f19514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f19515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P.o f19516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I f19517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f19518g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rational f19519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19520b;

        public a(Rational rational, boolean z10) {
            this.f19519a = rational;
            this.f19520b = z10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fC = c.c(rational, this.f19519a);
            float fC2 = c.c(rational2, this.f19519a);
            return this.f19520b ? Float.compare(fC2, fC) : Float.compare(fC, fC2);
        }
    }

    public c(J j10, Set set) {
        this(y.l(j10.i().e()), j10.i(), set);
    }

    public static boolean A(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!y((Size) it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    public static List E(List list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    public static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    public static void M(List list) {
        Collections.sort(list, new M.d(true));
    }

    public static Rational N(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static Rational O(Size size) {
        Rational rational = M.a.f8804a;
        if (M.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = M.a.f8806c;
        return M.a.a(size, rational2) ? rational2 : N(size);
    }

    public static float c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    public static List e(List list) {
        Rational rationalN;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = map.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rationalN = null;
                    break;
                }
                rationalN = (Rational) it2.next();
                if (M.a.a(size, rationalN)) {
                    break;
                }
            }
            if (rationalN != null) {
                Size size2 = (Size) map.get(rationalN);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalN = N(size);
            }
            arrayList.add(size);
            map.put(rationalN, size);
        }
        return arrayList;
    }

    public static List f(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static List g(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (M.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f19511h ? M.a.f8806c : M.a.f8804a;
    }

    public static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalN = N(size);
        if (rational.floatValue() == rationalN.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalN.floatValue()) {
                float f10 = width;
                float fFloatValue = f10 / rational.floatValue();
                float f11 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, fFloatValue + f11);
            } else {
                float f12 = height;
                float fFloatValue2 = rational.floatValue() * f12;
                float f13 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, fFloatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static Rect m(Size size, Size size2) {
        return k(N(size2), size);
    }

    public static Rational n(Rational rational) {
        Rational rational2 = M.a.f8804a;
        if (rational.equals(rational2)) {
            return M.a.f8806c;
        }
        if (rational.equals(M.a.f8806c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    public static List p(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listE = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    public static Rational u(Size size) {
        Rational rationalH = h(size);
        AbstractC0807p0.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalH + ".");
        return rationalH;
    }

    public static List w(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    public static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static boolean z(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (y((Size) it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(Rational rational, Size size) {
        if (this.f19513b.equals(rational) || M.a.a(size, rational)) {
            return false;
        }
        return b(this.f19513b.floatValue(), rational.floatValue(), O(size).floatValue());
    }

    public final boolean C(Size size, Size size2) {
        return B(O(size), size2);
    }

    public final boolean D() {
        Iterator it = l().iterator();
        while (it.hasNext()) {
            if (!M.a.a((Size) it.next(), this.f19514c)) {
                return true;
            }
        }
        return false;
    }

    public final List G(List list, boolean z10) {
        Map mapX = x(list);
        ArrayList<Rational> arrayList = new ArrayList(mapX.keySet());
        L(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(M.a.f8806c) && !rational.equals(M.a.f8804a)) {
                List list2 = (List) mapX.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z10));
            }
        }
        return arrayList2;
    }

    public final List H(List list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f19513b, list, false));
        }
        int size = arrayList.size();
        if (K()) {
            size = 0;
        }
        arrayList.addAll(size, I(this.f19514c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            AbstractC0807p0.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        AbstractC0807p0.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    public final List I(Rational rational, List list, boolean z10) {
        List<Size> listG = g(rational, list);
        M(listG);
        HashSet hashSet = new HashSet(listG);
        Iterator it = this.f19515d.iterator();
        while (it.hasNext()) {
            List listV = v((s1) it.next());
            if (!z10) {
                listV = d(rational, listV);
            }
            if (listV.isEmpty()) {
                return new ArrayList();
            }
            listG = f(listV, listG);
            hashSet.retainAll(p(listV, listG));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listG) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public final boolean J() {
        boolean z10;
        X.c cVarN;
        Iterator it = this.f19515d.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            s1 s1Var = (s1) it.next();
            if (!s1Var.Z(false) && (s1Var instanceof InterfaceC1132x0) && (cVarN = ((InterfaceC1132x0) s1Var).N(null)) != null) {
                z10 = true;
                if (cVarN.a() == 1) {
                    break;
                }
            }
        }
        return z10;
    }

    public final boolean K() {
        if (this.f19515d.isEmpty()) {
            return false;
        }
        Iterator it = this.f19515d.iterator();
        while (it.hasNext()) {
            Iterator it2 = v((s1) it.next()).iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (it2.hasNext()) {
                boolean zA = M.a.a((Size) it2.next(), this.f19514c);
                if (zA) {
                    z10 = true;
                }
                if (z11 && zA) {
                    return false;
                }
                if (!zA) {
                    z11 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void L(List list) {
        Collections.sort(list, new a(N(this.f19512a), true));
    }

    public final boolean b(float f10, float f11, float f12) {
        if (f10 != f11 && f11 != f12) {
            if (f10 > f11) {
                return f11 < f12;
            }
            if (f11 > f12) {
                return true;
            }
        }
        return false;
    }

    public final List d(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public final List i() {
        return this.f19517f.g(34);
    }

    public final List j() {
        return this.f19517f.l(34);
    }

    public final Set l() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f19515d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v((s1) it.next()));
        }
        return hashSet;
    }

    public List o(L0 l02) {
        List listJ = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(listJ);
            arrayList.addAll(i());
            listJ = arrayList;
        }
        List list = (List) l02.c(InterfaceC1132x0.f8223t, null);
        if (list != null) {
            listJ = w(list);
        }
        return H(listJ);
    }

    public b q(s1 s1Var, Rect rect, int i10, boolean z10) {
        boolean z11;
        if (y.h(i10)) {
            rect = F(rect);
            z11 = true;
        } else {
            z11 = false;
        }
        b bVarT = t(rect, s1Var, z10);
        return z11 ? new b(F(bVarT.b()), y.m(bVarT.a()), bVarT.c()) : bVarT;
    }

    public Size r(Size size, s1 s1Var) {
        List<Size> listV = v(s1Var);
        for (Size size2 : listV) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listV) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    public Pair s(Size size, s1 s1Var) {
        for (Size size2 : v(s1Var)) {
            Size sizeL = y.l(m(size2, size));
            if (!y(sizeL, size)) {
                return Pair.create(size2, sizeL);
            }
        }
        return Pair.create(size, size);
    }

    public final b t(Rect rect, s1 s1Var, boolean z10) {
        Size sizeR;
        Size size;
        if (z10) {
            Pair pairS = s(y.l(rect), s1Var);
            sizeR = (Size) pairS.first;
            size = (Size) pairS.second;
        } else {
            Size sizeL = y.l(rect);
            sizeR = r(sizeL, s1Var);
            rect = m(sizeL, sizeR);
            size = sizeR;
        }
        return new b(rect, size, sizeR);
    }

    public final List v(s1 s1Var) {
        if (!this.f19515d.contains(s1Var)) {
            throw new IllegalArgumentException("Invalid child config: " + s1Var);
        }
        if (this.f19518g.containsKey(s1Var)) {
            List list = (List) this.f19518g.get(s1Var);
            Objects.requireNonNull(list);
            return list;
        }
        List listE = e(this.f19516e.m(s1Var));
        this.f19518g.put(s1Var, listE);
        return listE;
    }

    public final Map x(List list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = M.a.f8804a;
        map.put(rational, new ArrayList());
        Rational rational2 = M.a.f8806c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (M.a.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalN = N(size);
                    arrayList2.add(rationalN);
                    map.put(rationalN, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    public c(Size size, I i10, Set set) {
        this(size, i10, set, new P.o(i10, size));
    }

    public c(Size size, I i10, Set set, P.o oVar) {
        this.f19518g = new HashMap();
        this.f19512a = size;
        Rational rationalU = u(size);
        this.f19513b = rationalU;
        this.f19514c = n(rationalU);
        this.f19517f = i10;
        this.f19515d = set;
        this.f19516e = oVar;
    }
}
