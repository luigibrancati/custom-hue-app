package Z7;

import e8.C3950A;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2595e f20381b = new InterfaceC2595e() { // from class: Z7.p
        @Override // Z7.InterfaceC2595e
        public final P7.g a(P7.v vVar, Integer num) {
            return q.e((C2602l) vVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f20382c = g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20383a = new HashMap();

    public static C2601k e(C2602l c2602l, Integer num) throws GeneralSecurityException {
        C3950A c3950aD = c2602l.b().d();
        P7.h hVarC = C2596f.d().c(c3950aD.U());
        if (!C2596f.d().f(c3950aD.U())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        e8.y yVarB = hVarC.b(c3950aD.V());
        return new C2601k(G.b(yVarB.U(), yVarB.V(), yVarB.T(), c3950aD.T(), num), P7.f.a());
    }

    public static q f() {
        return f20382c;
    }

    public static q g() {
        q qVar = new q();
        try {
            qVar.b(f20381b, C2602l.class);
            return qVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public synchronized void b(InterfaceC2595e interfaceC2595e, Class cls) {
        try {
            InterfaceC2595e interfaceC2595e2 = (InterfaceC2595e) this.f20383a.get(cls);
            if (interfaceC2595e2 != null && !interfaceC2595e2.equals(interfaceC2595e)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f20383a.put(cls, interfaceC2595e);
        } catch (Throwable th) {
            throw th;
        }
    }

    public P7.g c(P7.v vVar, Integer num) {
        return d(vVar, num);
    }

    public final synchronized P7.g d(P7.v vVar, Integer num) {
        InterfaceC2595e interfaceC2595e;
        interfaceC2595e = (InterfaceC2595e) this.f20383a.get(vVar.getClass());
        if (interfaceC2595e == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + vVar + ": no key creator for this class was registered.");
        }
        return interfaceC2595e.a(vVar, num);
    }
}
