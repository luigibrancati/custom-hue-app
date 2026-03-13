package Y;

import K.InterfaceC0967i;
import L.AbstractC1120r0;
import L.C1095e0;
import L.F;
import Y.f;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class o extends AbstractC1120r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.a f19572c;

    public o(F f10, f.a aVar) {
        super(f10);
        this.f19572c = aVar;
    }

    @Override // L.AbstractC1120r0, L.F
    public O7.e d(final List list, int i10, int i11) {
        X0.h.b(list.size() == 1, "Only support one capture config.");
        final O7.e eVarL = l(i10, 1);
        return O.n.k(Collections.singletonList(O.d.c(eVarL).g(new O.a() { // from class: Y.l
            @Override // O.a
            public final O7.e apply(Object obj) {
                return ((InterfaceC0967i) eVarL.get()).a();
            }
        }, N.a.a()).g(new O.a() { // from class: Y.m
            @Override // O.a
            public final O7.e apply(Object obj) {
                o oVar = this.f19569a;
                List list2 = list;
                return oVar.f19572c.a(oVar.q((C1095e0) list2.get(0)), oVar.r((C1095e0) list2.get(0)));
            }
        }, N.a.a()).g(new O.a() { // from class: Y.n
            @Override // O.a
            public final O7.e apply(Object obj) {
                return ((InterfaceC0967i) eVarL.get()).b();
            }
        }, N.a.a())));
    }

    public final int q(C1095e0 c1095e0) {
        Integer num = (Integer) c1095e0.g().c(C1095e0.f8039j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int r(C1095e0 c1095e0) {
        Integer num = (Integer) c1095e0.g().c(C1095e0.f8038i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
