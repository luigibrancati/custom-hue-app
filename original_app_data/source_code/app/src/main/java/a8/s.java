package a8;

import Z7.B;
import Z7.C;
import Z7.C2601k;
import Z7.C2603m;
import Z7.F;
import Z7.InterfaceC2599i;
import Z7.InterfaceC2604n;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class s implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f21178a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f21179b = C.b(new C.b() { // from class: a8.r
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return b8.o.c((C2601k) gVar);
        }
    }, C2601k.class, P7.u.class);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P7.u f21180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21181b;

        public b(P7.u uVar, int i10) {
            this.f21180a = uVar;
            this.f21181b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements P7.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f21182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f21183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC2604n.a f21184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC2604n.a f21185d;

        @Override // P7.u
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (b bVar : this.f21183b.a(bArr)) {
                try {
                    bVar.f21180a.a(bArr, bArr2);
                    this.f21185d.a(bVar.f21181b, bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f21185d.c();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // P7.u
        public byte[] b(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrB = this.f21182a.f21180a.b(bArr);
                this.f21184c.a(this.f21182a.f21181b, bArr.length);
                return bArrB;
            } catch (GeneralSecurityException e10) {
                this.f21184c.c();
                throw e10;
            }
        }

        public c(b bVar, B b10, InterfaceC2604n.a aVar, InterfaceC2604n.a aVar2) {
            this.f21182a = bVar;
            this.f21183b = b10;
            this.f21184c = aVar;
            this.f21185d = aVar2;
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
        Z7.u.b().d(f21178a);
        Z7.u.b().c(f21179b);
    }

    @Override // Z7.F
    public Class a() {
        return P7.u.class;
    }

    @Override // Z7.F
    public Class c() {
        return P7.u.class;
    }

    @Override // Z7.F
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public P7.u b(InterfaceC2599i interfaceC2599i, C2603m c2603m, F.a aVar) throws GeneralSecurityException {
        InterfaceC2604n.a aVar2;
        InterfaceC2604n.a aVarA;
        B.b bVar = new B.b();
        for (int i10 = 0; i10 < interfaceC2599i.size(); i10++) {
            InterfaceC2599i.a aVarA2 = interfaceC2599i.a(i10);
            if (aVarA2.getStatus().equals(P7.i.f13132b)) {
                bVar.b(d(aVarA2.getKey()), new b((P7.u) aVar.a(aVarA2), aVarA2.getId()));
            }
        }
        if (c2603m.a()) {
            aVar2 = Z7.o.f20380a;
            aVarA = aVar2;
        } else {
            InterfaceC2604n interfaceC2604nA = Z7.s.b().a();
            InterfaceC2604n.a aVarA3 = interfaceC2604nA.a(interfaceC2599i, c2603m, "mac", "compute");
            aVarA = interfaceC2604nA.a(interfaceC2599i, c2603m, "mac", "verify");
            aVar2 = aVarA3;
        }
        return new c(new b((P7.u) aVar.a(interfaceC2599i.b()), interfaceC2599i.b().getId()), bVar.a(), aVar2, aVarA);
    }
}
