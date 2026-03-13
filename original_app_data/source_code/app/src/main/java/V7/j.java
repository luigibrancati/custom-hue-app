package V7;

import Z7.B;
import Z7.C;
import Z7.C2601k;
import Z7.C2603m;
import Z7.F;
import Z7.InterfaceC2599i;
import Z7.InterfaceC2604n;
import Z7.o;
import Z7.s;
import Z7.u;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class j implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f17293a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f17294b = C.b(new C.b() { // from class: V7.i
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return W7.f.c((C2601k) gVar);
        }
    }, C2601k.class, P7.e.class);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P7.e f17295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17296b;

        public a(P7.e eVar, int i10) {
            this.f17295a = eVar;
            this.f17296b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements P7.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f17297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f17298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC2604n.a f17299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC2604n.a f17300d;

        public b(a aVar, B b10, InterfaceC2604n.a aVar2, InterfaceC2604n.a aVar3) {
            this.f17297a = aVar;
            this.f17298b = b10;
            this.f17299c = aVar2;
            this.f17300d = aVar3;
        }

        @Override // P7.e
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f17297a.f17295a.a(bArr, bArr2);
                this.f17299c.a(this.f17297a.f17296b, bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f17299c.c();
                throw e10;
            }
        }

        @Override // P7.e
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (a aVar : this.f17298b.a(bArr)) {
                try {
                    byte[] bArrB = aVar.f17295a.b(bArr, bArr2);
                    this.f17300d.a(aVar.f17296b, bArr.length);
                    return bArrB;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f17300d.c();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    private static C4160a d(P7.g gVar) throws GeneralSecurityException {
        if (gVar instanceof g) {
            return ((g) gVar).c();
        }
        if (gVar instanceof C2601k) {
            return ((C2601k) gVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + gVar.getClass().getName() + " with parameters " + gVar.b());
    }

    public static void e() {
        u.b().d(f17293a);
        u.b().c(f17294b);
    }

    @Override // Z7.F
    public Class a() {
        return P7.e.class;
    }

    @Override // Z7.F
    public Class c() {
        return P7.e.class;
    }

    @Override // Z7.F
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public P7.e b(InterfaceC2599i interfaceC2599i, C2603m c2603m, F.a aVar) throws GeneralSecurityException {
        InterfaceC2604n.a aVarA;
        InterfaceC2604n.a aVarA2;
        B.b bVar = new B.b();
        for (int i10 = 0; i10 < interfaceC2599i.size(); i10++) {
            InterfaceC2599i.a aVarA3 = interfaceC2599i.a(i10);
            if (aVarA3.getStatus().equals(P7.i.f13132b)) {
                bVar.b(d(aVarA3.getKey()), new a((P7.e) aVar.a(aVarA3), aVarA3.getId()));
            }
        }
        if (c2603m.a()) {
            aVarA = o.f20380a;
            aVarA2 = aVarA;
        } else {
            InterfaceC2604n interfaceC2604nA = s.b().a();
            aVarA = interfaceC2604nA.a(interfaceC2599i, c2603m, "daead", "encrypt");
            aVarA2 = interfaceC2604nA.a(interfaceC2599i, c2603m, "daead", "decrypt");
        }
        return new b(new a((P7.e) aVar.a(interfaceC2599i.b()), interfaceC2599i.b().getId()), bVar.a(), aVarA, aVarA2);
    }
}
