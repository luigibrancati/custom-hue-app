package x;

import E.AbstractC0807p0;
import L.AbstractC1096f;
import L.C1128v0;
import L.InterfaceC1099g0;
import L.InterfaceC1130w0;
import L.t1;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import w.C6107a;
import x.T1;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q1 f46703a = new Q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1099g0.a f46704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f46705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f46706d;

    static {
        Class cls = Long.TYPE;
        AbstractC4862t.b(cls);
        InterfaceC1099g0.a aVarA = InterfaceC1099g0.a.a("camera2.streamSpec.streamUseCase", cls);
        AbstractC4862t.d(aVarA, "create(...)");
        f46704b = aVarA;
        Map mapC = gc.P.c();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            t1.b bVar = t1.b.PREVIEW;
            t1.b bVar2 = t1.b.METERING_REPEATING;
            t1.b bVar3 = t1.b.IMAGE_ANALYSIS;
            mapC.put(4L, gc.U.h(bVar, bVar2, bVar3));
            mapC.put(1L, gc.U.h(bVar, bVar2, bVar3));
            mapC.put(2L, gc.T.c(t1.b.IMAGE_CAPTURE));
            mapC.put(3L, gc.T.c(t1.b.VIDEO_CAPTURE));
        }
        f46705c = gc.P.b(mapC);
        Map mapC2 = gc.P.c();
        if (i10 >= 33) {
            t1.b bVar4 = t1.b.PREVIEW;
            t1.b bVar5 = t1.b.IMAGE_CAPTURE;
            t1.b bVar6 = t1.b.VIDEO_CAPTURE;
            mapC2.put(4L, gc.U.h(bVar4, bVar5, bVar6));
            mapC2.put(3L, gc.U.h(bVar4, bVar6));
        }
        f46706d = gc.P.b(mapC2);
    }

    public static final boolean a(Map surfaceConfigIndexAttachedSurfaceInfoMap, Map surfaceConfigIndexUseCaseConfigMap, List surfaceConfigsWithStreamUseCase) {
        List listK;
        AbstractC4862t.e(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        AbstractC4862t.e(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        AbstractC4862t.e(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jB = ((L.h1) surfaceConfigsWithStreamUseCase.get(i10)).i().b();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i10))) {
                AbstractC1096f abstractC1096f = (AbstractC1096f) surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i10));
                Q1 q12 = f46703a;
                AbstractC4862t.b(abstractC1096f);
                t1.b bVar = abstractC1096f.b().size() == 1 ? (t1.b) abstractC1096f.b().get(0) : t1.b.STREAM_SHARING;
                AbstractC4862t.b(bVar);
                List listB = abstractC1096f.b();
                AbstractC4862t.d(listB, "getCaptureTypes(...)");
                if (!q12.g(bVar, jB, listB)) {
                    return false;
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                Object obj = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i10));
                AbstractC4862t.b(obj);
                L.s1 s1Var = (L.s1) obj;
                Q1 q13 = f46703a;
                t1.b bVarS = s1Var.S();
                AbstractC4862t.d(bVarS, "getCaptureType(...)");
                if (s1Var.S() == t1.b.STREAM_SHARING) {
                    listK = ((Y.h) s1Var).d0();
                    AbstractC4862t.d(listK, "getCaptureTypes(...)");
                } else {
                    listK = C4206t.k();
                }
                if (!q13.g(bVarS, jB, listK)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(C6378n characteristicsCompat, List surfaceConfigs) {
        long[] jArr;
        AbstractC4862t.e(characteristicsCompat, "characteristicsCompat");
        AbstractC4862t.e(surfaceConfigs, "surfaceConfigs");
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j10 : jArr) {
            hashSet.add(Long.valueOf(j10));
        }
        Iterator it = surfaceConfigs.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(((L.h1) it.next()).i().b()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(List attachedSurfaces, List newUseCaseConfigs) {
        AbstractC4862t.e(attachedSurfaces, "attachedSurfaces");
        AbstractC4862t.e(newUseCaseConfigs, "newUseCaseConfigs");
        Iterator it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            AbstractC1096f abstractC1096f = (AbstractC1096f) it.next();
            List listB = abstractC1096f.b();
            AbstractC4862t.d(listB, "getCaptureTypes(...)");
            t1.b bVar = (t1.b) listB.get(0);
            Q1 q12 = f46703a;
            InterfaceC1099g0 interfaceC1099g0E = abstractC1096f.e();
            AbstractC4862t.b(interfaceC1099g0E);
            AbstractC4862t.b(bVar);
            if (q12.j(interfaceC1099g0E, bVar)) {
                return true;
            }
        }
        Iterator it2 = newUseCaseConfigs.iterator();
        while (it2.hasNext()) {
            L.s1 s1Var = (L.s1) it2.next();
            Q1 q13 = f46703a;
            t1.b bVarS = s1Var.S();
            AbstractC4862t.d(bVarS, "getCaptureType(...)");
            if (q13.j(s1Var, bVarS)) {
                return true;
            }
        }
        return false;
    }

    public static final C6107a e(L.s1 useCaseConfig) {
        AbstractC4862t.e(useCaseConfig, "useCaseConfig");
        L.M0 m0G0 = L.M0.g0();
        AbstractC4862t.d(m0G0, "create(...)");
        InterfaceC1099g0.a aVar = C6107a.f46063R;
        if (useCaseConfig.d(aVar)) {
            m0G0.H(aVar, useCaseConfig.a(aVar));
        }
        InterfaceC1099g0.a aVar2 = L.s1.f8179E;
        if (useCaseConfig.d(aVar2)) {
            m0G0.H(aVar2, useCaseConfig.a(aVar2));
        }
        InterfaceC1099g0.a aVar3 = C1128v0.f8199Q;
        if (useCaseConfig.d(aVar3)) {
            m0G0.H(aVar3, useCaseConfig.a(aVar3));
        }
        InterfaceC1099g0.a aVar4 = InterfaceC1130w0.f8213j;
        if (useCaseConfig.d(aVar4)) {
            m0G0.H(aVar4, useCaseConfig.a(aVar4));
        }
        return new C6107a(m0G0);
    }

    public static final boolean h(C6378n characteristicsCompat) {
        long[] jArr;
        AbstractC4862t.e(characteristicsCompat, "characteristicsCompat");
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public static final boolean k(C6378n characteristicsCompat, List attachedSurfaces, Map suggestedStreamSpecMap, Map attachedSurfaceStreamSpecMap) {
        AbstractC4862t.e(characteristicsCompat, "characteristicsCompat");
        AbstractC4862t.e(attachedSurfaces, "attachedSurfaces");
        AbstractC4862t.e(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        AbstractC4862t.e(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<L.s1> arrayList = new ArrayList(suggestedStreamSpecMap.keySet());
        Iterator it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            X0.h.g(((AbstractC1096f) it.next()).e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            X0.h.g(((L.e1) X0.h.g(suggestedStreamSpecMap.get((L.s1) it2.next()))).d());
        }
        long[] jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j10 : jArr) {
                hashSet.add(Long.valueOf(j10));
            }
            if (f46703a.i(attachedSurfaces, arrayList, hashSet)) {
                Iterator it3 = attachedSurfaces.iterator();
                while (it3.hasNext()) {
                    AbstractC1096f abstractC1096f = (AbstractC1096f) it3.next();
                    InterfaceC1099g0 interfaceC1099g0E = abstractC1096f.e();
                    Q1 q12 = f46703a;
                    AbstractC4862t.b(interfaceC1099g0E);
                    InterfaceC1099g0 interfaceC1099g0F = q12.f(interfaceC1099g0E, (Long) interfaceC1099g0E.a(C6107a.f46063R));
                    if (interfaceC1099g0F != null) {
                        attachedSurfaceStreamSpecMap.put(abstractC1096f, abstractC1096f.k(interfaceC1099g0F));
                    }
                }
                for (L.s1 s1Var : arrayList) {
                    L.e1 e1Var = (L.e1) suggestedStreamSpecMap.get(s1Var);
                    AbstractC4862t.b(e1Var);
                    InterfaceC1099g0 interfaceC1099g0D = e1Var.d();
                    Q1 q13 = f46703a;
                    AbstractC4862t.b(interfaceC1099g0D);
                    InterfaceC1099g0 interfaceC1099g0F2 = q13.f(interfaceC1099g0D, (Long) interfaceC1099g0D.a(C6107a.f46063R));
                    if (interfaceC1099g0F2 != null) {
                        suggestedStreamSpecMap.put(s1Var, e1Var.i().d(interfaceC1099g0F2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void l(Map suggestedStreamSpecMap, Map attachedSurfaceStreamSpecMap, Map surfaceConfigIndexAttachedSurfaceInfoMap, Map surfaceConfigIndexUseCaseConfigMap, List surfaceConfigsWithStreamUseCase) {
        AbstractC4862t.e(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        AbstractC4862t.e(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        AbstractC4862t.e(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        AbstractC4862t.e(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        AbstractC4862t.e(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jB = ((L.h1) surfaceConfigsWithStreamUseCase.get(i10)).i().b();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i10))) {
                AbstractC1096f abstractC1096f = (AbstractC1096f) surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i10));
                AbstractC4862t.b(abstractC1096f);
                InterfaceC1099g0 interfaceC1099g0E = abstractC1096f.e();
                Q1 q12 = f46703a;
                AbstractC4862t.b(interfaceC1099g0E);
                InterfaceC1099g0 interfaceC1099g0F = q12.f(interfaceC1099g0E, Long.valueOf(jB));
                if (interfaceC1099g0F != null) {
                    attachedSurfaceStreamSpecMap.put(abstractC1096f, abstractC1096f.k(interfaceC1099g0F));
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                Object obj = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i10));
                AbstractC4862t.b(obj);
                L.s1 s1Var = (L.s1) obj;
                L.e1 e1Var = (L.e1) suggestedStreamSpecMap.get(s1Var);
                AbstractC4862t.b(e1Var);
                InterfaceC1099g0 interfaceC1099g0D = e1Var.d();
                Q1 q13 = f46703a;
                AbstractC4862t.b(interfaceC1099g0D);
                InterfaceC1099g0 interfaceC1099g0F2 = q13.f(interfaceC1099g0D, Long.valueOf(jB));
                if (interfaceC1099g0F2 != null) {
                    L.e1 e1VarA = e1Var.i().d(interfaceC1099g0F2).a();
                    AbstractC4862t.d(e1VarA, "build(...)");
                    suggestedStreamSpecMap.put(s1Var, e1VarA);
                }
            }
        }
    }

    public static final void m(Collection sessionConfigs, Collection useCaseConfigs, Map streamUseCaseMap) {
        AbstractC4862t.e(sessionConfigs, "sessionConfigs");
        AbstractC4862t.e(useCaseConfigs, "useCaseConfigs");
        AbstractC4862t.e(streamUseCaseMap, "streamUseCaseMap");
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        Iterator it = sessionConfigs.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            L.a1 a1Var = (L.a1) it.next();
            InterfaceC1099g0 interfaceC1099g0G = a1Var.g();
            InterfaceC1099g0.a aVar = f46704b;
            if (interfaceC1099g0G.d(aVar) && a1Var.o().size() != 1) {
                kotlin.jvm.internal.S s10 = kotlin.jvm.internal.S.f39781a;
                String str = String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(a1Var.o().size())}, 1));
                AbstractC4862t.d(str, "format(...)");
                AbstractC0807p0.c("StreamUseCaseUtil", str);
                return;
            }
            if (a1Var.g().d(aVar)) {
                Iterator it2 = sessionConfigs.iterator();
                int i10 = 0;
                while (it2.hasNext()) {
                    L.a1 a1Var2 = (L.a1) it2.next();
                    if (((L.s1) arrayList.get(i10)).S() == t1.b.METERING_REPEATING) {
                        AbstractC4862t.d(a1Var2.o(), "getSurfaces(...)");
                        X0.h.j(!r4.isEmpty(), "MeteringRepeating should contain a surface");
                        streamUseCaseMap.put(a1Var2.o().get(0), 1L);
                    } else {
                        InterfaceC1099g0 interfaceC1099g0G2 = a1Var2.g();
                        InterfaceC1099g0.a aVar2 = f46704b;
                        if (interfaceC1099g0G2.d(aVar2)) {
                            List listO = a1Var2.o();
                            AbstractC4862t.d(listO, "getSurfaces(...)");
                            if (!listO.isEmpty()) {
                                Object obj = a1Var2.o().get(0);
                                Object objA = a1Var2.g().a(aVar2);
                                AbstractC4862t.b(objA);
                                streamUseCaseMap.put(obj, objA);
                            }
                        }
                    }
                    i10++;
                }
            }
        }
        AbstractC0807p0.a("StreamUseCaseUtil", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + streamUseCaseMap);
    }

    public static final boolean n(T1.d featureSettings) {
        AbstractC4862t.e(featureSettings, "featureSettings");
        return featureSettings.a() == 0 && featureSettings.b() == 8 && !featureSettings.f();
    }

    public final boolean b(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(Long.valueOf(((Number) it.next()).longValue()))) {
                return false;
            }
        }
        return true;
    }

    public final InterfaceC1099g0 f(InterfaceC1099g0 interfaceC1099g0, Long l10) {
        InterfaceC1099g0.a aVar = f46704b;
        if (interfaceC1099g0.d(aVar) && AbstractC4862t.a(interfaceC1099g0.a(aVar), l10)) {
            return null;
        }
        L.M0 m0H0 = L.M0.h0(interfaceC1099g0);
        AbstractC4862t.d(m0H0, "from(...)");
        m0H0.H(aVar, l10);
        return new C6107a(m0H0);
    }

    public final boolean g(t1.b bVar, long j10, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != t1.b.STREAM_SHARING) {
            Map map = f46705c;
            if (map.containsKey(Long.valueOf(j10))) {
                Object obj = map.get(Long.valueOf(j10));
                AbstractC4862t.b(obj);
                if (((Set) obj).contains(bVar)) {
                    return true;
                }
            }
            return false;
        }
        Map map2 = f46706d;
        if (!map2.containsKey(Long.valueOf(j10))) {
            return false;
        }
        Object obj2 = map2.get(Long.valueOf(j10));
        AbstractC4862t.b(obj2);
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((t1.b) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.util.List r10, java.util.List r11, java.util.Set r12) {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
            boolean r1 = r10.hasNext()
            r2 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L47
            java.lang.Object r10 = r10.next()
            L.f r10 = (L.AbstractC1096f) r10
            L.g0 r1 = r10.e()
            kotlin.jvm.internal.AbstractC4862t.b(r1)
            L.g0$a r6 = w.C6107a.f46063R
            boolean r1 = r1.d(r6)
            if (r1 != 0) goto L2b
        L28:
            r1 = r4
            r10 = r5
            goto L49
        L2b:
            L.g0 r10 = r10.e()
            kotlin.jvm.internal.AbstractC4862t.b(r10)
            java.lang.Object r10 = r10.a(r6)
            kotlin.jvm.internal.AbstractC4862t.b(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            long r6 = r10.longValue()
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 != 0) goto L44
            goto L28
        L44:
            r10 = r4
            r1 = r5
            goto L49
        L47:
            r10 = r5
            r1 = r10
        L49:
            java.util.Iterator r11 = r11.iterator()
        L4d:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r11.next()
            L.s1 r6 = (L.s1) r6
            L.g0$a r7 = w.C6107a.f46063R
            boolean r8 = r6.d(r7)
            if (r8 != 0) goto L68
            if (r10 == 0) goto L66
            r9.o()
        L66:
            r1 = r4
            goto L4d
        L68:
            java.lang.Object r6 = r6.a(r7)
            kotlin.jvm.internal.AbstractC4862t.b(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L7f
            if (r10 == 0) goto L66
            r9.o()
            goto L66
        L7f:
            if (r1 == 0) goto L84
            r9.o()
        L84:
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            r0.add(r10)
            r10 = r4
            goto L4d
        L8d:
            if (r1 != 0) goto L96
            boolean r9 = r9.b(r12, r0)
            if (r9 == 0) goto L96
            return r4
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.Q1.i(java.util.List, java.util.List, java.util.Set):boolean");
    }

    public final boolean j(InterfaceC1099g0 interfaceC1099g0, t1.b bVar) {
        Object objC = interfaceC1099g0.c(L.s1.f8179E, Boolean.FALSE);
        AbstractC4862t.b(objC);
        if (((Boolean) objC).booleanValue()) {
            return false;
        }
        InterfaceC1099g0.a aVar = C1128v0.f8199Q;
        if (!interfaceC1099g0.d(aVar)) {
            return false;
        }
        Object objA = interfaceC1099g0.a(aVar);
        AbstractC4862t.b(objA);
        return g2.b(bVar, ((Number) objA).intValue()) == 5;
    }

    public final void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
