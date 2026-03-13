package Qc;

import bd.InterfaceC2915g;
import dd.InterfaceC3911p;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4862t;
import zd.C6561a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements InterfaceC3911p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f14268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd.d f14269b;

    public g(ClassLoader classLoader) {
        AbstractC4862t.e(classLoader, "classLoader");
        this.f14268a = classLoader;
        this.f14269b = new zd.d();
    }

    @Override // dd.InterfaceC3911p
    public InterfaceC3911p.a a(InterfaceC2915g javaClass) {
        String strB;
        AbstractC4862t.e(javaClass, "javaClass");
        kd.c cVarE = javaClass.e();
        if (cVarE == null || (strB = cVarE.b()) == null) {
            return null;
        }
        return d(strB);
    }

    @Override // dd.InterfaceC3911p
    public InterfaceC3911p.a b(kd.b classId) {
        AbstractC4862t.e(classId, "classId");
        return d(h.b(classId));
    }

    @Override // yd.u
    public InputStream c(kd.c packageFqName) {
        AbstractC4862t.e(packageFqName, "packageFqName");
        if (packageFqName.i(Ic.j.f5738t)) {
            return this.f14269b.a(C6561a.f48894n.n(packageFqName));
        }
        return null;
    }

    public final InterfaceC3911p.a d(String str) {
        f fVarA;
        Class clsA = e.a(this.f14268a, str);
        if (clsA == null || (fVarA = f.f14265c.a(clsA)) == null) {
            return null;
        }
        return new InterfaceC3911p.a.C0413a(fVarA, null, 2, null);
    }
}
