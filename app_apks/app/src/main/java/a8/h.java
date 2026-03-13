package a8;

import Z7.B;
import Z7.C2601k;
import Z7.C2603m;
import Z7.F;
import Z7.InterfaceC2599i;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f21139a = new h();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements InterfaceC2655g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B f21140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2655g f21141b;

        public b(B b10, InterfaceC2655g interfaceC2655g) {
            this.f21140a = b10;
            this.f21141b = interfaceC2655g;
        }
    }

    private static C4160a d(P7.g gVar) throws GeneralSecurityException {
        if (gVar instanceof p) {
            return ((p) gVar).c();
        }
        if (gVar instanceof C2601k) {
            return ((C2601k) gVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + gVar.getClass().getName() + " with parameters " + gVar.b());
    }

    public static void e() {
        Z7.u.b().d(f21139a);
    }

    @Override // Z7.F
    public Class a() {
        return InterfaceC2655g.class;
    }

    @Override // Z7.F
    public Class c() {
        return InterfaceC2655g.class;
    }

    @Override // Z7.F
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC2655g b(InterfaceC2599i interfaceC2599i, C2603m c2603m, F.a aVar) throws GeneralSecurityException {
        InterfaceC2599i.a aVarB = interfaceC2599i.b();
        if (aVarB == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        B.b bVar = new B.b();
        for (int i10 = 0; i10 < interfaceC2599i.size(); i10++) {
            InterfaceC2599i.a aVarA = interfaceC2599i.a(i10);
            if (aVarA.getStatus().equals(P7.i.f13132b)) {
                bVar.b(d(aVarA.getKey()), (InterfaceC2655g) aVar.a(aVarA));
            }
        }
        return new b(bVar.a(), (InterfaceC2655g) aVar.a(aVarB));
    }
}
