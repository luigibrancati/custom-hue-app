package Xc;

import Ic.j;
import Mc.g;
import Nd.t;
import bd.InterfaceC2909a;
import bd.InterfaceC2912d;
import gc.C4179C;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Mc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f19484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2912d f19485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.h f19487d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements l {
        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mc.c invoke(InterfaceC2909a annotation) {
            AbstractC4862t.e(annotation, "annotation");
            return Vc.c.f17481a.e(annotation, d.this.f19484a, d.this.f19486c);
        }
    }

    public d(g c10, InterfaceC2912d annotationOwner, boolean z10) {
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(annotationOwner, "annotationOwner");
        this.f19484a = c10;
        this.f19485b = annotationOwner;
        this.f19486c = z10;
        this.f19487d = c10.a().u().b(new a());
    }

    @Override // Mc.g
    public boolean K(kd.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // Mc.g
    public boolean isEmpty() {
        return this.f19485b.getAnnotations().isEmpty() && !this.f19485b.D();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return t.A(t.L(t.I(C4179C.X(this.f19485b.getAnnotations()), this.f19487d), Vc.c.f17481a.a(j.a.f5829y, this.f19485b, this.f19484a))).iterator();
    }

    @Override // Mc.g
    public Mc.c j(kd.c fqName) {
        Mc.c cVar;
        AbstractC4862t.e(fqName, "fqName");
        InterfaceC2909a interfaceC2909aJ = this.f19485b.j(fqName);
        return (interfaceC2909aJ == null || (cVar = (Mc.c) this.f19487d.invoke(interfaceC2909aJ)) == null) ? Vc.c.f17481a.a(fqName, this.f19485b, this.f19484a) : cVar;
    }

    public /* synthetic */ d(g gVar, InterfaceC2912d interfaceC2912d, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(gVar, interfaceC2912d, (i10 & 4) != 0 ? false : z10);
    }
}
