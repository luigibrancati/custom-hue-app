package Vc;

import Bd.m;
import Cc.l;
import Ic.j;
import bd.InterfaceC2909a;
import bd.InterfaceC2910b;
import bd.InterfaceC2913e;
import bd.InterfaceC2921m;
import fc.AbstractC4040w;
import gc.C4205s;
import gc.P;
import gc.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l[] f17498h = {M.g(new E(M.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bd.i f17499g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            InterfaceC2910b interfaceC2910bB = i.this.b();
            qd.g gVarC = interfaceC2910bB instanceof InterfaceC2913e ? d.f17486a.c(((InterfaceC2913e) i.this.b()).getElements()) : interfaceC2910bB instanceof InterfaceC2921m ? d.f17486a.c(C4205s.d(i.this.b())) : null;
            Map mapF = gVarC != null ? P.f(AbstractC4040w.a(c.f17481a.d(), gVarC)) : null;
            return mapF == null ? Q.i() : mapF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC2909a annotation, Xc.g c10) {
        super(c10, annotation, j.a.f5759H);
        AbstractC4862t.e(annotation, "annotation");
        AbstractC4862t.e(c10, "c");
        this.f17499g = c10.e().f(new a());
    }

    @Override // Vc.b, Mc.c
    public Map a() {
        return (Map) m.a(this.f17499g, this, f17498h[0]);
    }
}
