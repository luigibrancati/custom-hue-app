package Q7;

import Q7.V;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f14027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4160a f14028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f14029c;

    public U(V v10, C4160a c4160a, Integer num) {
        this.f14027a = v10;
        this.f14028b = c4160a;
        this.f14029c = num;
    }

    public static U e(V v10, Integer num) throws GeneralSecurityException {
        C4160a c4160aB;
        if (v10.e() == V.d.f14046c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c4160aB = Z7.y.f20395a;
        } else {
            if (v10.e() != V.d.f14045b) {
                throw new GeneralSecurityException("Unknown Variant: " + v10.e());
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c4160aB = Z7.y.b(num.intValue());
        }
        return new U(v10, c4160aB, num);
    }

    @Override // P7.g
    public Integer a() {
        return this.f14029c;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f14028b;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public V b() {
        return this.f14027a;
    }
}
