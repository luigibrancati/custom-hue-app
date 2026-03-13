package Q7;

import Q7.u0;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f14161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f14162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f14163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f14164d;

    public q0(u0 u0Var, g8.b bVar, C4160a c4160a, Integer num) {
        this.f14161a = u0Var;
        this.f14162b = bVar;
        this.f14163c = c4160a;
        this.f14164d = num;
    }

    public static q0 e(u0.a aVar, g8.b bVar, Integer num) throws GeneralSecurityException {
        u0.a aVar2 = u0.a.f14189d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.c() == 32) {
            u0 u0VarB = u0.b(aVar);
            return new q0(u0VarB, bVar, g(u0VarB, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.c());
    }

    public static C4160a g(u0 u0Var, Integer num) {
        if (u0Var.c() == u0.a.f14189d) {
            return Z7.y.f20395a;
        }
        if (u0Var.c() == u0.a.f14188c) {
            return Z7.y.a(num.intValue());
        }
        if (u0Var.c() == u0.a.f14187b) {
            return Z7.y.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + u0Var.c());
    }

    @Override // P7.g
    public Integer a() {
        return this.f14164d;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f14163c;
    }

    public g8.b f() {
        return this.f14162b;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public u0 b() {
        return this.f14161a;
    }
}
