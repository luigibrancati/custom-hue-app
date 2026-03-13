package Uc;

import Lc.InterfaceC1177e;
import gc.C4205s;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import qd.C5516b;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: Uc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2302d extends AbstractC2299a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2302d(x javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        AbstractC4862t.e(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    @Override // Uc.AbstractC2299a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterable b(Mc.c cVar, boolean z10) {
        AbstractC4862t.e(cVar, "<this>");
        Map mapA = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapA.entrySet()) {
            gc.y.C(arrayList, (!z10 || AbstractC4862t.a((kd.f) entry.getKey(), B.f16841c)) ? y((qd.g) entry.getValue()) : C4206t.k());
        }
        return arrayList;
    }

    @Override // Uc.AbstractC2299a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public kd.c i(Mc.c cVar) {
        AbstractC4862t.e(cVar, "<this>");
        return cVar.e();
    }

    @Override // Uc.AbstractC2299a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object j(Mc.c cVar) {
        AbstractC4862t.e(cVar, "<this>");
        InterfaceC1177e interfaceC1177eI = AbstractC5823c.i(cVar);
        AbstractC4862t.b(interfaceC1177eI);
        return interfaceC1177eI;
    }

    @Override // Uc.AbstractC2299a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable k(Mc.c cVar) {
        Mc.g annotations;
        AbstractC4862t.e(cVar, "<this>");
        InterfaceC1177e interfaceC1177eI = AbstractC5823c.i(cVar);
        return (interfaceC1177eI == null || (annotations = interfaceC1177eI.getAnnotations()) == null) ? C4206t.k() : annotations;
    }

    public final List y(qd.g gVar) {
        if (!(gVar instanceof C5516b)) {
            return gVar instanceof qd.j ? C4205s.d(((qd.j) gVar).c().p()) : C4206t.k();
        }
        Iterable iterable = (Iterable) ((C5516b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            gc.y.C(arrayList, y((qd.g) it.next()));
        }
        return arrayList;
    }
}
