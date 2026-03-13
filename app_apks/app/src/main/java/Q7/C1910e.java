package Q7;

import Z7.B;
import Z7.C;
import Z7.C2601k;
import Z7.C2603m;
import Z7.F;
import Z7.InterfaceC2599i;
import Z7.InterfaceC2604n;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Q7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C1910e implements Z7.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1910e f14065a = new C1910e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z7.C f14066b = Z7.C.b(new C.b() { // from class: Q7.d
        @Override // Z7.C.b
        public final Object a(P7.g gVar) {
            return R7.K.d((C2601k) gVar);
        }
    }, C2601k.class, P7.a.class);

    /* JADX INFO: renamed from: Q7.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P7.a f14067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14068b;

        public b(P7.a aVar, int i10) {
            this.f14067a = aVar;
            this.f14068b = i10;
        }
    }

    /* JADX INFO: renamed from: Q7.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements P7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f14069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Z7.B f14070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC2604n.a f14071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC2604n.a f14072d;

        @Override // P7.a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = this.f14069a.f14067a.a(bArr, bArr2);
                this.f14071c.a(this.f14069a.f14068b, bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f14071c.c();
                throw e10;
            }
        }

        @Override // P7.a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            for (b bVar : this.f14070b.a(bArr)) {
                try {
                    byte[] bArrB = bVar.f14067a.b(bArr, bArr2);
                    this.f14072d.a(bVar.f14068b, bArr.length);
                    return bArrB;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f14072d.c();
            throw new GeneralSecurityException("decryption failed");
        }

        public c(b bVar, Z7.B b10, InterfaceC2604n.a aVar, InterfaceC2604n.a aVar2) {
            this.f14069a = bVar;
            this.f14070b = b10;
            this.f14071c = aVar;
            this.f14072d = aVar2;
        }
    }

    public static C4160a d(P7.g gVar) throws GeneralSecurityException {
        if (gVar instanceof AbstractC1907b) {
            return ((AbstractC1907b) gVar).c();
        }
        if (gVar instanceof C2601k) {
            return ((C2601k) gVar).d();
        }
        throw new GeneralSecurityException("Cannot get output prefix for key of class " + gVar.getClass().getName() + " with parameters " + gVar.b());
    }

    public static void e() {
        Z7.u.b().d(f14065a);
        Z7.u.b().c(f14066b);
    }

    @Override // Z7.F
    public Class a() {
        return P7.a.class;
    }

    @Override // Z7.F
    public Class c() {
        return P7.a.class;
    }

    @Override // Z7.F
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public P7.a b(InterfaceC2599i interfaceC2599i, C2603m c2603m, F.a aVar) throws GeneralSecurityException {
        InterfaceC2604n.a aVar2;
        InterfaceC2604n.a aVarA;
        B.b bVar = new B.b();
        for (int i10 = 0; i10 < interfaceC2599i.size(); i10++) {
            InterfaceC2599i.a aVarA2 = interfaceC2599i.a(i10);
            if (aVarA2.getStatus().equals(P7.i.f13132b)) {
                bVar.b(d(aVarA2.getKey()), new b((P7.a) aVar.a(aVarA2), aVarA2.getId()));
            }
        }
        if (c2603m.a()) {
            aVar2 = Z7.o.f20380a;
            aVarA = aVar2;
        } else {
            InterfaceC2604n interfaceC2604nA = Z7.s.b().a();
            InterfaceC2604n.a aVarA3 = interfaceC2604nA.a(interfaceC2599i, c2603m, "aead", "encrypt");
            aVarA = interfaceC2604nA.a(interfaceC2599i, c2603m, "aead", "decrypt");
            aVar2 = aVarA3;
        }
        return new c(new b((P7.a) aVar.a(interfaceC2599i.b()), interfaceC2599i.b().getId()), bVar.a(), aVar2, aVarA);
    }
}
