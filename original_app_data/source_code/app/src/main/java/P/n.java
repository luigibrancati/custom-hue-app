package P;

import E.C0822x0;
import E.J;
import E.W0;
import L.AbstractC1096f;
import L.B;
import L.G;
import L.I;
import L.InterfaceC1099g0;
import L.e1;
import L.h1;
import L.j1;
import L.s1;
import L.t1;
import M.y;
import P.f;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import gc.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f12530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G f12531d;

    public n(t1 useCaseConfigFactory, G g10) {
        AbstractC4862t.e(useCaseConfigFactory, "useCaseConfigFactory");
        this.f12530c = useCaseConfigFactory;
        this.f12531d = g10;
    }

    @Override // P.m
    public void a(G cameraDeviceSurfaceManager) {
        AbstractC4862t.e(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
        this.f12531d = cameraDeviceSurfaceManager;
    }

    @Override // P.m
    public l b(int i10, I cameraInfoInternal, List newUseCases, List attachedUseCases, B cameraConfig, int i11, Range targetFrameRate, boolean z10, boolean z11) {
        AbstractC4862t.e(cameraInfoInternal, "cameraInfoInternal");
        AbstractC4862t.e(newUseCases, "newUseCases");
        AbstractC4862t.e(attachedUseCases, "attachedUseCases");
        AbstractC4862t.e(cameraConfig, "cameraConfig");
        AbstractC4862t.e(targetFrameRate, "targetFrameRate");
        Pair pairC = c(i10, cameraInfoInternal, attachedUseCases);
        Object second = pairC.second;
        AbstractC4862t.d(second, "second");
        Map mapJ = f.J(newUseCases, cameraConfig.j(), this.f12530c, i11, targetFrameRate);
        AbstractC4862t.d(mapJ, "getConfigs(...)");
        l lVarD = d(i10, cameraInfoInternal, newUseCases, (Map) second, mapJ, z10, z11);
        Object first = pairC.first;
        AbstractC4862t.d(first, "first");
        return new l(Q.p((Map) first, lVarD.b()), lVarD.a());
    }

    public final Pair c(int i10, I i11, List list) {
        ArrayList arrayList = new ArrayList();
        String strD = i11.d();
        AbstractC4862t.d(strD, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            e1 e1VarG = w02.g();
            if (e1VarG == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            G g10 = this.f12531d;
            if (g10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iP = w02.p();
            Size sizeH = w02.h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            h1 h1VarH = g10.h(i10, strD, iP, sizeH, w02.l().R());
            AbstractC4862t.d(h1VarH, "transformSurfaceConfig(...)");
            int iP2 = w02.p();
            Size sizeH2 = w02.h();
            AbstractC4862t.b(sizeH2);
            J jB = e1VarG.b();
            List listO0 = Y.f.o0(w02);
            InterfaceC1099g0 interfaceC1099g0D = e1VarG.d();
            int iN = w02.l().n(0);
            Range rangeV = w02.l().v(e1.f8057a);
            if (rangeV == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AbstractC1096f abstractC1096fA = AbstractC1096f.a(h1VarH, iP2, sizeH2, jB, listO0, interfaceC1099g0D, iN, rangeV, w02.l().A());
            AbstractC4862t.d(abstractC1096fA, "create(...)");
            arrayList.add(abstractC1096fA);
            linkedHashMap2.put(abstractC1096fA, w02);
            linkedHashMap.put(w02, e1VarG);
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    public final l d(int i10, I i11, List list, Map map, Map map2, boolean z10, boolean z11) {
        int iC;
        Rect rectE;
        String strD = i11.d();
        AbstractC4862t.d(strD, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.isEmpty()) {
            iC = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                rectE = i11.e();
            } catch (NullPointerException unused) {
                rectE = null;
            }
            o oVar = new o(i11, rectE != null ? y.l(rectE) : null);
            Iterator it = list.iterator();
            while (true) {
                boolean z12 = false;
                while (it.hasNext()) {
                    W0 w02 = (W0) it.next();
                    Object obj = map2.get(w02);
                    if (obj == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    f.b bVar = (f.b) obj;
                    s1 s1VarI = w02.I(i11, bVar.f12515a, bVar.f12516b);
                    AbstractC4862t.d(s1VarI, "mergeConfigs(...)");
                    linkedHashMap2.put(s1VarI, w02);
                    List listM = oVar.m(s1VarI);
                    AbstractC4862t.d(listM, "getSortedSupportedOutputSizes(...)");
                    linkedHashMap3.put(s1VarI, listM);
                    if ((w02 instanceof C0822x0) || (w02 instanceof Y.f)) {
                        if (s1VarI.z() == 2) {
                            z12 = true;
                        }
                    }
                }
                G g10 = this.f12531d;
                if (g10 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                j1 j1VarE = g10.e(i10, strD, new ArrayList(map.keySet()), linkedHashMap3, z12, f.S(list), z10, z11);
                AbstractC4862t.d(j1VarE, "getSuggestedStreamSpecs(...)");
                Map mapA = j1VarE.a();
                Map mapB = j1VarE.b();
                iC = j1VarE.c();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    Object value = entry.getValue();
                    Object obj2 = mapA.get(entry.getKey());
                    if (obj2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(value, obj2);
                }
                for (Map.Entry entry2 : mapB.entrySet()) {
                    if (map.containsKey(entry2.getKey())) {
                        Object obj3 = map.get(entry2.getKey());
                        if (obj3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        linkedHashMap.put(obj3, entry2.getValue());
                    }
                }
            }
        }
        return new l(linkedHashMap, iC);
    }
}
