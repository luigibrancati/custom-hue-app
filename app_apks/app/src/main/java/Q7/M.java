package Q7;

import Q7.N;
import g8.C4160a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f14013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4160a f14014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f14015c;

    public M(N n10, C4160a c4160a, Integer num) {
        this.f14013a = n10;
        this.f14014b = c4160a;
        this.f14015c = num;
    }

    public static M e(N n10, Integer num) throws GeneralSecurityException {
        C4160a c4160aA;
        if (n10.d() == N.a.f14018b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c4160aA = C4160a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (n10.d() != N.a.f14019c) {
                throw new GeneralSecurityException("Unknown Variant: " + n10.d());
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c4160aA = C4160a.a(new byte[0]);
        }
        return new M(n10, c4160aA, num);
    }

    @Override // P7.g
    public Integer a() {
        return this.f14015c;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f14014b;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public N b() {
        return this.f14013a;
    }
}
