package x;

import E.AbstractC0807p0;
import L.AbstractC1096f;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y.C6378n;
import z.AbstractC6483c;
import z.C6485e;

/* JADX INFO: renamed from: x.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6239l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6378n f47068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6485e f47069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47070c;

    /* JADX INFO: renamed from: x.l1$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static E.J a(C6378n c6378n) {
            Long l10 = (Long) c6378n.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return AbstractC6483c.b(l10.longValue());
            }
            return null;
        }
    }

    public C6239l1(C6378n c6378n) {
        this.f47068a = c6378n;
        this.f47069b = C6485e.a(c6378n);
        int[] iArr = (int[]) c6378n.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (iArr[i10] == 18) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f47070c = z10;
    }

    public static boolean a(E.J j10, E.J j11) {
        X0.h.j(j11.e(), "Fully specified range is not actually fully specified.");
        if (j10.b() == 2 && j11.b() == 1) {
            return false;
        }
        if (j10.b() == 2 || j10.b() == 0 || j10.b() == j11.b()) {
            return j10.a() == 0 || j10.a() == j11.a();
        }
        return false;
    }

    public static boolean b(E.J j10, E.J j11, Set set) {
        if (set.contains(j11)) {
            return a(j10, j11);
        }
        AbstractC0807p0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", j10, j11));
        return false;
    }

    public static E.J c(E.J j10, Collection collection, Set set) {
        if (j10.b() == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            E.J j11 = (E.J) it.next();
            X0.h.h(j11, "Fully specified DynamicRange cannot be null.");
            int iB = j11.b();
            X0.h.j(j11.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iB != 1 && b(j10, j11, set)) {
                return j11;
            }
        }
        return null;
    }

    public static boolean e(E.J j10) {
        return Objects.equals(j10, E.J.f2793c);
    }

    public static boolean f(E.J j10) {
        if (j10.b() == 2) {
            return true;
        }
        if (j10.b() == 0 || j10.a() != 0) {
            return j10.b() == 0 && j10.a() != 0;
        }
        return true;
    }

    public static void j(Set set, E.J j10, C6485e c6485e) {
        X0.h.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set setB = c6485e.b(j10);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setB);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", j10, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
        }
    }

    public boolean d() {
        return this.f47070c;
    }

    public Map g(List list, List list2, List list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AbstractC1096f) it.next()).c());
        }
        Set setC = this.f47069b.c();
        HashSet hashSet = new HashSet(setC);
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, (E.J) it2.next(), this.f47069b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            L.s1 s1Var = (L.s1) list2.get(((Integer) it3.next()).intValue());
            E.J jC = s1Var.C();
            if (e(jC)) {
                arrayList3.add(s1Var);
            } else if (f(jC)) {
                arrayList2.add(s1Var);
            } else {
                arrayList.add(s1Var);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<L.s1> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (L.s1 s1Var2 : arrayList4) {
            C6239l1 c6239l1 = this;
            E.J jI = c6239l1.i(setC, linkedHashSet, linkedHashSet2, s1Var2, hashSet);
            map.put(s1Var2, jI);
            if (!linkedHashSet.contains(jI)) {
                linkedHashSet2.add(jI);
            }
            this = c6239l1;
        }
        return map;
    }

    public final E.J h(E.J j10, Set set, Set set2, Set set3, String str) {
        E.J jA;
        if (j10.e()) {
            if (set.contains(j10)) {
                return j10;
            }
            return null;
        }
        int iB = j10.b();
        int iA = j10.a();
        if (iB == 1 && iA == 0) {
            E.J j11 = E.J.f2794d;
            if (set.contains(j11)) {
                return j11;
            }
            return null;
        }
        E.J jC = c(j10, set2, set);
        if (jC != null) {
            AbstractC0807p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, j10, jC));
            return jC;
        }
        E.J jC2 = c(j10, set3, set);
        if (jC2 != null) {
            AbstractC0807p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, j10, jC2));
            return jC2;
        }
        E.J j12 = E.J.f2794d;
        if (b(j10, j12, set)) {
            AbstractC0807p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, j10, j12));
            return j12;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                jA = a.a(this.f47068a);
                if (jA != null) {
                    linkedHashSet.add(jA);
                }
            } else {
                jA = null;
            }
            linkedHashSet.add(E.J.f2796f);
            E.J jC3 = c(j10, linkedHashSet, set);
            if (jC3 != null) {
                AbstractC0807p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, jC3.equals(jA) ? "recommended" : "required", j10, jC3));
                return jC3;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            E.J j13 = (E.J) it.next();
            X0.h.j(j13.e(), "Candidate dynamic range must be fully specified.");
            if (!j13.equals(E.J.f2794d) && a(j10, j13)) {
                AbstractC0807p0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, j10, j13));
                return j13;
            }
        }
        return null;
    }

    public final E.J i(Set set, Set set2, Set set3, L.s1 s1Var, Set set4) {
        E.J jC = s1Var.C();
        E.J jH = h(jC, set4, set2, set3, s1Var.U());
        if (jH == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", s1Var.U(), jC, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        j(set4, jH, this.f47069b);
        return jH;
    }
}
