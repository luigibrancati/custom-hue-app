package x;

import E.AbstractC0807p0;
import L.AbstractC1096f;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import fc.AbstractC4036s;
import fc.C4029l;
import fc.C4035r;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4204q;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46621e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range f46622f = new Range(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6378n f46623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4028k f46624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f46625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f46626d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final boolean a(Collection attachedSurfaces, Collection newUseCaseConfigs) {
            boolean z10;
            AbstractC4862t.e(attachedSurfaces, "attachedSurfaces");
            AbstractC4862t.e(newUseCaseConfigs, "newUseCaseConfigs");
            ArrayList arrayList = new ArrayList(C4207u.v(attachedSurfaces, 10));
            Iterator it = attachedSurfaces.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AbstractC1096f) it.next()).f()));
            }
            ArrayList arrayList2 = new ArrayList(C4207u.v(newUseCaseConfigs, 10));
            Iterator it2 = newUseCaseConfigs.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                arrayList2.add(Integer.valueOf(((L.s1) it2.next()).n(0)));
            }
            List listC0 = C4179C.C0(arrayList, arrayList2);
            if (listC0 == null || !listC0.isEmpty()) {
                Iterator it3 = listC0.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((Number) it3.next()).intValue() == 1) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10 || (listC0 != null && listC0.isEmpty())) {
                return z10;
            }
            Iterator it4 = listC0.iterator();
            while (it4.hasNext()) {
                if (((Number) it4.next()).intValue() != 1) {
                    throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                }
            }
            return z10;
        }

        public a() {
        }
    }

    public G1(C6378n characteristics) {
        AbstractC4862t.e(characteristics, "characteristics");
        this.f46623a = characteristics;
        this.f46624b = C4029l.b(new InterfaceC6082a() { // from class: x.D1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(G1.n(this.f46613a));
            }
        });
        this.f46625c = C4029l.b(new InterfaceC6082a() { // from class: x.E1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return G1.o(this.f46616a);
            }
        });
        this.f46626d = C4029l.b(new InterfaceC6082a() { // from class: x.F1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return G1.p(this.f46619a);
            }
        });
    }

    public static final boolean l(Collection collection, Collection collection2) {
        return f46621e.a(collection, collection2);
    }

    public static final boolean n(G1 g12) {
        int[] iArr = (int[]) g12.f46623a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Size o(G1 g12) {
        List listK = g12.k();
        if (listK.isEmpty()) {
            listK = null;
        }
        if (listK == null) {
            return null;
        }
        Iterator it = listK.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iB = T.d.b((Size) next);
            do {
                Object next2 = it.next();
                int iB2 = T.d.b((Size) next2);
                if (iB < iB2) {
                    next = next2;
                    iB = iB2;
                }
            } while (it.hasNext());
        }
        return (Size) next;
    }

    public static final List p(G1 g12) {
        List listS;
        Size[] sizeArrC = g12.f46623a.e().c();
        return (sizeArrC == null || (listS = C4204q.S(sizeArrC)) == null) ? C4206t.k() : listS;
    }

    public final Map d(Map sizesMap) {
        AbstractC4862t.e(sizesMap, "sizesMap");
        List listE = e(C4179C.V0(sizesMap.values()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (k().contains((Size) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(gc.P.e(sizesMap.size()));
        for (Map.Entry entry : sizesMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (arrayList.contains((Size) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        return linkedHashMap;
    }

    public final List e(List list) {
        if (list.isEmpty()) {
            return C4206t.k();
        }
        List listX0 = C4179C.X0((Collection) C4179C.h0(list));
        Iterator it = C4179C.b0(list, 1).iterator();
        while (it.hasNext()) {
            listX0.retainAll((List) it.next());
        }
        return listX0;
    }

    public final Range[] f(List surfaceSizes) {
        AbstractC4862t.e(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 > size || size >= 3 || C4179C.a0(surfaceSizes).size() != 1) {
            return null;
        }
        List listG = g((Size) surfaceSizes.get(0));
        if (listG.isEmpty()) {
            listG = null;
        }
        if (listG == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                Range range = (Range) obj;
                if (AbstractC4862t.a(range.getLower(), range.getUpper())) {
                    arrayList.add(obj);
                }
            }
            listG = arrayList;
        }
        return (Range[]) listG.toArray(new Range[0]);
    }

    public final List g(Size size) {
        Object objB;
        List listS;
        List listV0;
        try {
            C4035r.a aVar = C4035r.f34274b;
            objB = C4035r.b(this.f46623a.e().b(size));
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        if (C4035r.g(objB)) {
            objB = null;
        }
        Range[] rangeArr = (Range[]) objB;
        return (rangeArr == null || (listS = C4204q.S(rangeArr)) == null || (listV0 = C4179C.V0(listS)) == null) ? C4206t.k() : listV0;
    }

    public final int h(Size size) {
        AbstractC4862t.e(size, "size");
        List listG = g(size);
        if (listG.isEmpty()) {
            listG = null;
        }
        if (listG == null) {
            AbstractC0807p0.l("HighSpeedResolver", "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator it = listG.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        AbstractC4862t.d(num, "maxOf(...)");
        return num.intValue();
    }

    public final Size i() {
        return (Size) this.f46625c.getValue();
    }

    public final List j(List sizesList) {
        AbstractC4862t.e(sizesList, "sizesList");
        if (sizesList.isEmpty()) {
            return C4206t.k();
        }
        List<Size> listE = e(sizesList);
        ArrayList arrayList = new ArrayList(C4207u.v(listE, 10));
        for (Size size : listE) {
            int size2 = sizesList.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final List k() {
        return (List) this.f46626d.getValue();
    }

    public final boolean m() {
        return ((Boolean) this.f46624b.getValue()).booleanValue();
    }
}
