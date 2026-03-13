package td;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Vc.g;
import Yc.h;
import bd.EnumC2908D;
import bd.InterfaceC2915g;
import gc.C4179C;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: td.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5880c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xc.f f44918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f44919b;

    public C5880c(Xc.f packageFragmentProvider, g javaResolverCache) {
        AbstractC4862t.e(packageFragmentProvider, "packageFragmentProvider");
        AbstractC4862t.e(javaResolverCache, "javaResolverCache");
        this.f44918a = packageFragmentProvider;
        this.f44919b = javaResolverCache;
    }

    public final Xc.f a() {
        return this.f44918a;
    }

    public final InterfaceC1177e b(InterfaceC2915g javaClass) {
        AbstractC4862t.e(javaClass, "javaClass");
        kd.c cVarE = javaClass.e();
        if (cVarE != null && javaClass.K() == EnumC2908D.SOURCE) {
            return this.f44919b.e(cVarE);
        }
        InterfaceC2915g interfaceC2915gF = javaClass.f();
        if (interfaceC2915gF != null) {
            InterfaceC1177e interfaceC1177eB = b(interfaceC2915gF);
            InterfaceC6099h interfaceC6099hR = interfaceC1177eB != null ? interfaceC1177eB.R() : null;
            InterfaceC1180h interfaceC1180hE = interfaceC6099hR != null ? interfaceC6099hR.e(javaClass.getName(), Tc.d.FROM_JAVA_LOADER) : null;
            if (interfaceC1180hE instanceof InterfaceC1177e) {
                return (InterfaceC1177e) interfaceC1180hE;
            }
            return null;
        }
        if (cVarE == null) {
            return null;
        }
        Xc.f fVar = this.f44918a;
        kd.c cVarE2 = cVarE.e();
        AbstractC4862t.d(cVarE2, "fqName.parent()");
        h hVar = (h) C4179C.j0(fVar.a(cVarE2));
        if (hVar != null) {
            return hVar.L0(javaClass);
        }
        return null;
    }
}
