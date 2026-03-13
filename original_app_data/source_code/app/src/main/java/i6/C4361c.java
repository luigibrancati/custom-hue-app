package i6;

import i6.AbstractC4364f;
import java.util.Set;

/* JADX INFO: renamed from: i6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4361c extends AbstractC4364f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f37246c;

    /* JADX INFO: renamed from: i6.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC4364f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f37247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f37248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f37249c;

        @Override // i6.AbstractC4364f.b.a
        public AbstractC4364f.b a() {
            String str = "";
            if (this.f37247a == null) {
                str = " delta";
            }
            if (this.f37248b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f37249c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C4361c(this.f37247a.longValue(), this.f37248b.longValue(), this.f37249c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i6.AbstractC4364f.b.a
        public AbstractC4364f.b.a b(long j10) {
            this.f37247a = Long.valueOf(j10);
            return this;
        }

        @Override // i6.AbstractC4364f.b.a
        public AbstractC4364f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f37249c = set;
            return this;
        }

        @Override // i6.AbstractC4364f.b.a
        public AbstractC4364f.b.a d(long j10) {
            this.f37248b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // i6.AbstractC4364f.b
    public long b() {
        return this.f37244a;
    }

    @Override // i6.AbstractC4364f.b
    public Set c() {
        return this.f37246c;
    }

    @Override // i6.AbstractC4364f.b
    public long d() {
        return this.f37245b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4364f.b) {
            AbstractC4364f.b bVar = (AbstractC4364f.b) obj;
            if (this.f37244a == bVar.b() && this.f37245b == bVar.d() && this.f37246c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f37244a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f37245b;
        return this.f37246c.hashCode() ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f37244a + ", maxAllowedDelay=" + this.f37245b + ", flags=" + this.f37246c + "}";
    }

    public C4361c(long j10, long j11, Set set) {
        this.f37244a = j10;
        this.f37245b = j11;
        this.f37246c = set;
    }
}
