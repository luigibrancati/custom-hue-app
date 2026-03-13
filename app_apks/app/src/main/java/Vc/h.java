package Vc;

import Bd.m;
import Cc.l;
import Ic.j;
import bd.InterfaceC2909a;
import fc.AbstractC4040w;
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
public final class h extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l[] f17495h = {M.g(new E(M.b(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bd.i f17496g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            qd.g gVarA = d.f17486a.a(h.this.b());
            Map mapF = gVarA != null ? P.f(AbstractC4040w.a(c.f17481a.c(), gVarA)) : null;
            return mapF == null ? Q.i() : mapF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC2909a annotation, Xc.g c10) {
        super(c10, annotation, j.a.f5766L);
        AbstractC4862t.e(annotation, "annotation");
        AbstractC4862t.e(c10, "c");
        this.f17496g = c10.e().f(new a());
    }

    @Override // Vc.b, Mc.c
    public Map a() {
        return (Map) m.a(this.f17496g, this, f17495h[0]);
    }
}
