package j6;

import b6.AbstractC2840i;
import b6.AbstractC2847p;

/* JADX INFO: renamed from: j6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4723b extends AbstractC4732k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2847p f39062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2840i f39063c;

    public C4723b(long j10, AbstractC2847p abstractC2847p, AbstractC2840i abstractC2840i) {
        this.f39061a = j10;
        if (abstractC2847p == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f39062b = abstractC2847p;
        if (abstractC2840i == null) {
            throw new NullPointerException("Null event");
        }
        this.f39063c = abstractC2840i;
    }

    @Override // j6.AbstractC4732k
    public AbstractC2840i b() {
        return this.f39063c;
    }

    @Override // j6.AbstractC4732k
    public long c() {
        return this.f39061a;
    }

    @Override // j6.AbstractC4732k
    public AbstractC2847p d() {
        return this.f39062b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4732k) {
            AbstractC4732k abstractC4732k = (AbstractC4732k) obj;
            if (this.f39061a == abstractC4732k.c() && this.f39062b.equals(abstractC4732k.d()) && this.f39063c.equals(abstractC4732k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f39061a;
        return this.f39063c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f39062b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f39061a + ", transportContext=" + this.f39062b + ", event=" + this.f39063c + "}";
    }
}
