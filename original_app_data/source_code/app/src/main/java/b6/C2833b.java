package b6;

import b6.AbstractC2840i;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: b6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2833b extends AbstractC2840i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f25309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839h f25310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f25312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f25313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f25314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f25316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f25317j;

    /* JADX INFO: renamed from: b6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0330b extends AbstractC2840i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f25319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2839h f25320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f25321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f25322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map f25323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f25324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f25325h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f25326i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f25327j;

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i d() {
            String str = "";
            if (this.f25318a == null) {
                str = " transportName";
            }
            if (this.f25320c == null) {
                str = str + " encodedPayload";
            }
            if (this.f25321d == null) {
                str = str + " eventMillis";
            }
            if (this.f25322e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f25323f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C2833b(this.f25318a, this.f25319b, this.f25320c, this.f25321d.longValue(), this.f25322e.longValue(), this.f25323f, this.f25324g, this.f25325h, this.f25326i, this.f25327j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b6.AbstractC2840i.a
        public Map e() {
            Map map = this.f25323f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f25323f = map;
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a g(Integer num) {
            this.f25319b = num;
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a h(C2839h c2839h) {
            if (c2839h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f25320c = c2839h;
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a i(long j10) {
            this.f25321d = Long.valueOf(j10);
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a j(byte[] bArr) {
            this.f25326i = bArr;
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a k(byte[] bArr) {
            this.f25327j = bArr;
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a l(Integer num) {
            this.f25324g = num;
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a m(String str) {
            this.f25325h = str;
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f25318a = str;
            return this;
        }

        @Override // b6.AbstractC2840i.a
        public AbstractC2840i.a o(long j10) {
            this.f25322e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b6.AbstractC2840i
    public Map c() {
        return this.f25313f;
    }

    @Override // b6.AbstractC2840i
    public Integer d() {
        return this.f25309b;
    }

    @Override // b6.AbstractC2840i
    public C2839h e() {
        return this.f25310c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2840i) {
            AbstractC2840i abstractC2840i = (AbstractC2840i) obj;
            if (this.f25308a.equals(abstractC2840i.n()) && ((num = this.f25309b) != null ? num.equals(abstractC2840i.d()) : abstractC2840i.d() == null) && this.f25310c.equals(abstractC2840i.e()) && this.f25311d == abstractC2840i.f() && this.f25312e == abstractC2840i.o() && this.f25313f.equals(abstractC2840i.c()) && ((num2 = this.f25314g) != null ? num2.equals(abstractC2840i.l()) : abstractC2840i.l() == null) && ((str = this.f25315h) != null ? str.equals(abstractC2840i.m()) : abstractC2840i.m() == null)) {
                boolean z10 = abstractC2840i instanceof C2833b;
                if (Arrays.equals(this.f25316i, z10 ? ((C2833b) abstractC2840i).f25316i : abstractC2840i.g())) {
                    if (Arrays.equals(this.f25317j, z10 ? ((C2833b) abstractC2840i).f25317j : abstractC2840i.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // b6.AbstractC2840i
    public long f() {
        return this.f25311d;
    }

    @Override // b6.AbstractC2840i
    public byte[] g() {
        return this.f25316i;
    }

    @Override // b6.AbstractC2840i
    public byte[] h() {
        return this.f25317j;
    }

    public int hashCode() {
        int iHashCode = (this.f25308a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f25309b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f25310c.hashCode()) * 1000003;
        long j10 = this.f25311d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f25312e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f25313f.hashCode()) * 1000003;
        Integer num2 = this.f25314g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f25315h;
        return Arrays.hashCode(this.f25317j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f25316i)) * 1000003);
    }

    @Override // b6.AbstractC2840i
    public Integer l() {
        return this.f25314g;
    }

    @Override // b6.AbstractC2840i
    public String m() {
        return this.f25315h;
    }

    @Override // b6.AbstractC2840i
    public String n() {
        return this.f25308a;
    }

    @Override // b6.AbstractC2840i
    public long o() {
        return this.f25312e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f25308a + ", code=" + this.f25309b + ", encodedPayload=" + this.f25310c + ", eventMillis=" + this.f25311d + ", uptimeMillis=" + this.f25312e + ", autoMetadata=" + this.f25313f + ", productId=" + this.f25314g + ", pseudonymousId=" + this.f25315h + ", experimentIdsClear=" + Arrays.toString(this.f25316i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f25317j) + "}";
    }

    public C2833b(String str, Integer num, C2839h c2839h, long j10, long j11, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f25308a = str;
        this.f25309b = num;
        this.f25310c = c2839h;
        this.f25311d = j10;
        this.f25312e = j11;
        this.f25313f = map;
        this.f25314g = num2;
        this.f25315h = str2;
        this.f25316i = bArr;
        this.f25317j = bArr2;
    }
}
