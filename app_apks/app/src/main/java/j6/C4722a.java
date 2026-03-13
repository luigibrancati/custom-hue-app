package j6;

import j6.AbstractC4726e;

/* JADX INFO: renamed from: j6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4722a extends AbstractC4726e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39055f;

    /* JADX INFO: renamed from: j6.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC4726e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f39056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f39057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f39058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f39059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f39060e;

        @Override // j6.AbstractC4726e.a
        public AbstractC4726e a() {
            String str = "";
            if (this.f39056a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f39057b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f39058c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f39059d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f39060e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C4722a(this.f39056a.longValue(), this.f39057b.intValue(), this.f39058c.intValue(), this.f39059d.longValue(), this.f39060e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j6.AbstractC4726e.a
        public AbstractC4726e.a b(int i10) {
            this.f39058c = Integer.valueOf(i10);
            return this;
        }

        @Override // j6.AbstractC4726e.a
        public AbstractC4726e.a c(long j10) {
            this.f39059d = Long.valueOf(j10);
            return this;
        }

        @Override // j6.AbstractC4726e.a
        public AbstractC4726e.a d(int i10) {
            this.f39057b = Integer.valueOf(i10);
            return this;
        }

        @Override // j6.AbstractC4726e.a
        public AbstractC4726e.a e(int i10) {
            this.f39060e = Integer.valueOf(i10);
            return this;
        }

        @Override // j6.AbstractC4726e.a
        public AbstractC4726e.a f(long j10) {
            this.f39056a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // j6.AbstractC4726e
    public int b() {
        return this.f39053d;
    }

    @Override // j6.AbstractC4726e
    public long c() {
        return this.f39054e;
    }

    @Override // j6.AbstractC4726e
    public int d() {
        return this.f39052c;
    }

    @Override // j6.AbstractC4726e
    public int e() {
        return this.f39055f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4726e) {
            AbstractC4726e abstractC4726e = (AbstractC4726e) obj;
            if (this.f39051b == abstractC4726e.f() && this.f39052c == abstractC4726e.d() && this.f39053d == abstractC4726e.b() && this.f39054e == abstractC4726e.c() && this.f39055f == abstractC4726e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // j6.AbstractC4726e
    public long f() {
        return this.f39051b;
    }

    public int hashCode() {
        long j10 = this.f39051b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f39052c) * 1000003) ^ this.f39053d) * 1000003;
        long j11 = this.f39054e;
        return this.f39055f ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f39051b + ", loadBatchSize=" + this.f39052c + ", criticalSectionEnterTimeoutMs=" + this.f39053d + ", eventCleanUpAge=" + this.f39054e + ", maxBlobByteSizePerRow=" + this.f39055f + "}";
    }

    public C4722a(long j10, int i10, int i11, long j11, int i12) {
        this.f39051b = j10;
        this.f39052c = i10;
        this.f39053d = i11;
        this.f39054e = j11;
        this.f39055f = i12;
    }
}
