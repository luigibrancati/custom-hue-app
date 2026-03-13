package Uc;

import Ic.j;
import cd.C3105i;
import cd.EnumC3102f;
import fc.C4034q;
import gc.C4179C;
import gc.C4204q;
import gc.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Uc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2299a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0212a f16901c = new C0212a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f16902d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f16903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16904b;

    /* JADX INFO: renamed from: Uc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0212a {
        public /* synthetic */ C0212a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0212a() {
        }
    }

    /* JADX INFO: renamed from: Uc.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16905a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object extractNullability) {
            AbstractC4862t.e(extractNullability, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC2300b enumC2300b : EnumC2300b.values()) {
            String strB = enumC2300b.b();
            if (linkedHashMap.get(strB) == null) {
                linkedHashMap.put(strB, enumC2300b);
            }
        }
        f16902d = linkedHashMap;
    }

    public AbstractC2299a(x javaTypeEnhancementState) {
        AbstractC4862t.e(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f16903a = javaTypeEnhancementState;
        this.f16904b = new ConcurrentHashMap();
    }

    public final Set a(Set set) {
        return set.contains(EnumC2300b.TYPE_USE) ? V.k(V.j(C4204q.b1(EnumC2300b.values()), EnumC2300b.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    public abstract Iterable b(Object obj, boolean z10);

    public final y c(y yVar, Iterable annotations) {
        EnumMap enumMapB;
        AbstractC4862t.e(annotations, "annotations");
        if (!this.f16903a.b()) {
            ArrayList<r> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (it.hasNext()) {
                r rVarD = d(it.next());
                if (rVarD != null) {
                    arrayList.add(rVarD);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = (yVar == null || (enumMapB = yVar.b()) == null) ? new EnumMap(EnumC2300b.class) : new EnumMap(enumMapB);
                boolean z10 = false;
                for (r rVar : arrayList) {
                    Iterator it2 = rVar.e().iterator();
                    while (it2.hasNext()) {
                        enumMap.put((EnumC2300b) it2.next(), rVar);
                        z10 = true;
                    }
                }
                if (z10) {
                    return new y(enumMap);
                }
            }
        }
        return yVar;
    }

    public final r d(Object obj) {
        C3105i c3105iG;
        r rVarR = r(obj);
        if (rVarR != null) {
            return rVarR;
        }
        C4034q c4034qT = t(obj);
        if (c4034qT == null) {
            return null;
        }
        Object objA = c4034qT.a();
        Set set = (Set) c4034qT.b();
        G gQ = q(obj);
        if (gQ == null) {
            gQ = p(objA);
        }
        if (gQ.j() || (c3105iG = g(objA, b.f16905a)) == null) {
            return null;
        }
        return new r(C3105i.b(c3105iG, null, gQ.p(), 1, null), set, false, 4, null);
    }

    public final EnumC3102f e(Iterable annotations) {
        EnumC3102f enumC3102f;
        AbstractC4862t.e(annotations, "annotations");
        Iterator it = annotations.iterator();
        EnumC3102f enumC3102f2 = null;
        while (it.hasNext()) {
            kd.c cVarI = i(it.next());
            if (C.m().contains(cVarI)) {
                enumC3102f = EnumC3102f.READ_ONLY;
            } else if (C.j().contains(cVarI)) {
                enumC3102f = EnumC3102f.MUTABLE;
            } else {
                continue;
            }
            if (enumC3102f2 != null && enumC3102f2 != enumC3102f) {
                return null;
            }
            enumC3102f2 = enumC3102f;
        }
        return enumC3102f2;
    }

    public final C3105i f(Iterable annotations, vc.l forceWarning) {
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(forceWarning, "forceWarning");
        Iterator it = annotations.iterator();
        C3105i c3105i = null;
        while (it.hasNext()) {
            C3105i c3105iG = g(it.next(), forceWarning);
            if (c3105i != null) {
                if (c3105iG != null && !AbstractC4862t.a(c3105iG, c3105i) && (!c3105iG.d() || c3105i.d())) {
                    if (c3105iG.d() || !c3105i.d()) {
                        return null;
                    }
                }
            }
            c3105i = c3105iG;
        }
        return c3105i;
    }

    public final C3105i g(Object obj, vc.l lVar) {
        C3105i c3105iN;
        C3105i c3105iN2 = n(obj, ((Boolean) lVar.invoke(obj)).booleanValue());
        if (c3105iN2 != null) {
            return c3105iN2;
        }
        Object objS = s(obj);
        if (objS == null) {
            return null;
        }
        G gP = p(obj);
        if (gP.j() || (c3105iN = n(objS, ((Boolean) lVar.invoke(objS)).booleanValue())) == null) {
            return null;
        }
        return C3105i.b(c3105iN, null, gP.p(), 1, null);
    }

    public final Object h(Object obj, kd.c cVar) {
        for (Object obj2 : k(obj)) {
            if (AbstractC4862t.a(i(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public abstract kd.c i(Object obj);

    public abstract Object j(Object obj);

    public abstract Iterable k(Object obj);

    public final boolean l(Object obj, kd.c cVar) {
        Iterable iterableK = k(obj);
        if ((iterableK instanceof Collection) && ((Collection) iterableK).isEmpty()) {
            return false;
        }
        Iterator it = iterableK.iterator();
        while (it.hasNext()) {
            if (AbstractC4862t.a(i(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(Object annotation) {
        AbstractC4862t.e(annotation, "annotation");
        Object objH = h(annotation, j.a.f5759H);
        if (objH == null) {
            return false;
        }
        Iterable iterableB = b(objH, false);
        if ((iterableB instanceof Collection) && ((Collection) iterableB).isEmpty()) {
            return false;
        }
        Iterator it = iterableB.iterator();
        while (it.hasNext()) {
            if (AbstractC4862t.a((String) it.next(), Mc.n.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r5.equals("ALWAYS") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r5.equals("NEVER") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r5.equals("MAYBE") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        r5 = cd.EnumC3104h.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cd.C3105i n(java.lang.Object r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Uc.AbstractC2299a.n(java.lang.Object, boolean):cd.i");
    }

    public final G o(Object obj) {
        kd.c cVarI = i(obj);
        return (cVarI == null || !AbstractC2301c.c().containsKey(cVarI)) ? p(obj) : (G) this.f16903a.c().invoke(cVarI);
    }

    public final G p(Object obj) {
        G gQ = q(obj);
        return gQ != null ? gQ : this.f16903a.d().a();
    }

    public final G q(Object obj) {
        Iterable iterableB;
        String str;
        G g10 = (G) this.f16903a.d().c().get(i(obj));
        if (g10 != null) {
            return g10;
        }
        Object objH = h(obj, AbstractC2301c.d());
        if (objH == null || (iterableB = b(objH, false)) == null || (str = (String) C4179C.i0(iterableB)) == null) {
            return null;
        }
        G gB = this.f16903a.d().b();
        if (gB != null) {
            return gB;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return G.WARN;
                }
            } else if (str.equals("STRICT")) {
                return G.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return G.IGNORE;
        }
        return null;
    }

    public final r r(Object obj) {
        r rVar;
        if (this.f16903a.b() || (rVar = (r) AbstractC2301c.a().get(i(obj))) == null) {
            return null;
        }
        G gO = o(obj);
        if (gO == G.IGNORE) {
            gO = null;
        }
        if (gO == null) {
            return null;
        }
        return r.b(rVar, C3105i.b(rVar.d(), null, gO.p(), 1, null), null, false, 6, null);
    }

    public final Object s(Object annotation) {
        Object objS;
        AbstractC4862t.e(annotation, "annotation");
        if (this.f16903a.d().d()) {
            return null;
        }
        if (C4179C.Y(AbstractC2301c.b(), i(annotation)) || l(annotation, AbstractC2301c.f())) {
            return annotation;
        }
        if (!l(annotation, AbstractC2301c.g())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f16904b;
        Object objJ = j(annotation);
        Object obj = concurrentHashMap.get(objJ);
        if (obj != null) {
            return obj;
        }
        Iterator it = k(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                objS = null;
                break;
            }
            objS = s(it.next());
            if (objS != null) {
                break;
            }
        }
        if (objS == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objJ, objS);
        return objPutIfAbsent == null ? objS : objPutIfAbsent;
    }

    public final C4034q t(Object obj) {
        Object objH;
        Object next;
        if (this.f16903a.d().d() || (objH = h(obj, AbstractC2301c.e())) == null) {
            return null;
        }
        Iterator it = k(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (s(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable iterableB = b(objH, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterableB.iterator();
        while (it2.hasNext()) {
            EnumC2300b enumC2300b = (EnumC2300b) f16902d.get((String) it2.next());
            if (enumC2300b != null) {
                linkedHashSet.add(enumC2300b);
            }
        }
        return new C4034q(next, a(linkedHashSet));
    }
}
