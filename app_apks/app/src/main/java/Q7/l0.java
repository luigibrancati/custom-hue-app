package Q7;

import Q7.p0;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f14128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f14129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f14130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f14131d;

    public l0(p0 p0Var, g8.b bVar, C4160a c4160a, Integer num) {
        this.f14128a = p0Var;
        this.f14129b = bVar;
        this.f14130c = c4160a;
        this.f14131d = num;
    }

    public static l0 e(p0 p0Var, g8.b bVar, Integer num) throws GeneralSecurityException {
        p0.a aVarD = p0Var.d();
        p0.a aVar = p0.a.f14152c;
        if (aVarD != aVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + p0Var.d() + " the value of idRequirement must be non-null");
        }
        if (p0Var.d() == aVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.c() == 32) {
            return new l0(p0Var, bVar, g(p0Var, num), num);
        }
        throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + bVar.c());
    }

    public static C4160a g(p0 p0Var, Integer num) {
        if (p0Var.d() == p0.a.f14152c) {
            return Z7.y.f20395a;
        }
        if (p0Var.d() == p0.a.f14151b) {
            return Z7.y.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + p0Var.d());
    }

    @Override // P7.g
    public Integer a() {
        return this.f14131d;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f14130c;
    }

    public g8.b f() {
        return this.f14129b;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p0 b() {
        return this.f14128a;
    }
}
