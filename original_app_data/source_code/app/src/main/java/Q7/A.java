package Q7;

import Q7.E;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f13990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f13991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f13992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f13993d;

    public A(E e10, g8.b bVar, C4160a c4160a, Integer num) {
        this.f13990a = e10;
        this.f13991b = bVar;
        this.f13992c = c4160a;
        this.f13993d = num;
    }

    public static A e(E.a aVar, g8.b bVar, Integer num) throws GeneralSecurityException {
        E.a aVar2 = E.a.f14000d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.c() == 32) {
            E eB = E.b(aVar);
            return new A(eB, bVar, g(eB, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.c());
    }

    public static C4160a g(E e10, Integer num) {
        if (e10.c() == E.a.f14000d) {
            return Z7.y.f20395a;
        }
        if (e10.c() == E.a.f13999c) {
            return Z7.y.a(num.intValue());
        }
        if (e10.c() == E.a.f13998b) {
            return Z7.y.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + e10.c());
    }

    @Override // P7.g
    public Integer a() {
        return this.f13993d;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f13992c;
    }

    public g8.b f() {
        return this.f13991b;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public E b() {
        return this.f13990a;
    }
}
