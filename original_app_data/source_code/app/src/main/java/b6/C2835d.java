package b6;

import b6.AbstractC2847p;
import java.util.Arrays;

/* JADX INFO: renamed from: b6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2835d extends AbstractC2847p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y5.f f25340c;

    /* JADX INFO: renamed from: b6.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC2847p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f25342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Y5.f f25343c;

        @Override // b6.AbstractC2847p.a
        public AbstractC2847p a() {
            String str = "";
            if (this.f25341a == null) {
                str = " backendName";
            }
            if (this.f25343c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C2835d(this.f25341a, this.f25342b, this.f25343c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b6.AbstractC2847p.a
        public AbstractC2847p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f25341a = str;
            return this;
        }

        @Override // b6.AbstractC2847p.a
        public AbstractC2847p.a c(byte[] bArr) {
            this.f25342b = bArr;
            return this;
        }

        @Override // b6.AbstractC2847p.a
        public AbstractC2847p.a d(Y5.f fVar) {
            if (fVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f25343c = fVar;
            return this;
        }
    }

    @Override // b6.AbstractC2847p
    public String b() {
        return this.f25338a;
    }

    @Override // b6.AbstractC2847p
    public byte[] c() {
        return this.f25339b;
    }

    @Override // b6.AbstractC2847p
    public Y5.f d() {
        return this.f25340c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2847p) {
            AbstractC2847p abstractC2847p = (AbstractC2847p) obj;
            if (this.f25338a.equals(abstractC2847p.b())) {
                if (Arrays.equals(this.f25339b, abstractC2847p instanceof C2835d ? ((C2835d) abstractC2847p).f25339b : abstractC2847p.c()) && this.f25340c.equals(abstractC2847p.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f25340c.hashCode() ^ ((((this.f25338a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25339b)) * 1000003);
    }

    public C2835d(String str, byte[] bArr, Y5.f fVar) {
        this.f25338a = str;
        this.f25339b = bArr;
        this.f25340c = fVar;
    }
}
