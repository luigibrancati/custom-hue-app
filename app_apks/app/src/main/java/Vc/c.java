package Vc;

import Ic.j;
import Uc.B;
import bd.InterfaceC2909a;
import bd.InterfaceC2912d;
import fc.AbstractC4040w;
import gc.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f17481a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.f f17482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kd.f f17483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kd.f f17484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f17485e;

    static {
        kd.f fVarS = kd.f.s("message");
        AbstractC4862t.d(fVarS, "identifier(\"message\")");
        f17482b = fVarS;
        kd.f fVarS2 = kd.f.s("allowedTargets");
        AbstractC4862t.d(fVarS2, "identifier(\"allowedTargets\")");
        f17483c = fVarS2;
        kd.f fVarS3 = kd.f.s("value");
        AbstractC4862t.d(fVarS3, "identifier(\"value\")");
        f17484d = fVarS3;
        f17485e = Q.l(AbstractC4040w.a(j.a.f5759H, B.f16842d), AbstractC4040w.a(j.a.f5766L, B.f16844f), AbstractC4040w.a(j.a.f5770P, B.f16847i));
    }

    public static /* synthetic */ Mc.c f(c cVar, InterfaceC2909a interfaceC2909a, Xc.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return cVar.e(interfaceC2909a, gVar, z10);
    }

    public final Mc.c a(kd.c kotlinName, InterfaceC2912d annotationOwner, Xc.g c10) {
        InterfaceC2909a interfaceC2909aJ;
        AbstractC4862t.e(kotlinName, "kotlinName");
        AbstractC4862t.e(annotationOwner, "annotationOwner");
        AbstractC4862t.e(c10, "c");
        if (AbstractC4862t.a(kotlinName, j.a.f5829y)) {
            kd.c DEPRECATED_ANNOTATION = B.f16846h;
            AbstractC4862t.d(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC2909a interfaceC2909aJ2 = annotationOwner.j(DEPRECATED_ANNOTATION);
            if (interfaceC2909aJ2 != null || annotationOwner.D()) {
                return new e(interfaceC2909aJ2, c10);
            }
        }
        kd.c cVar = (kd.c) f17485e.get(kotlinName);
        if (cVar == null || (interfaceC2909aJ = annotationOwner.j(cVar)) == null) {
            return null;
        }
        return f(f17481a, interfaceC2909aJ, c10, false, 4, null);
    }

    public final kd.f b() {
        return f17482b;
    }

    public final kd.f c() {
        return f17484d;
    }

    public final kd.f d() {
        return f17483c;
    }

    public final Mc.c e(InterfaceC2909a annotation, Xc.g c10, boolean z10) {
        AbstractC4862t.e(annotation, "annotation");
        AbstractC4862t.e(c10, "c");
        kd.b bVarC = annotation.c();
        if (AbstractC4862t.a(bVarC, kd.b.m(B.f16842d))) {
            return new i(annotation, c10);
        }
        if (AbstractC4862t.a(bVarC, kd.b.m(B.f16844f))) {
            return new h(annotation, c10);
        }
        if (AbstractC4862t.a(bVarC, kd.b.m(B.f16847i))) {
            return new b(c10, annotation, j.a.f5770P);
        }
        if (AbstractC4862t.a(bVarC, kd.b.m(B.f16846h))) {
            return null;
        }
        return new Yc.e(c10, annotation, z10);
    }
}
