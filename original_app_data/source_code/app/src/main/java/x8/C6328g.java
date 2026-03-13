package x8;

import java.util.Arrays;
import x8.F;

/* JADX INFO: renamed from: x8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6328g extends F.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f47745b;

    /* JADX INFO: renamed from: x8.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f47747b;

        @Override // x8.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.f47746a;
            if (str != null && (bArr = this.f47747b) != null) {
                return new C6328g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47746a == null) {
                sb2.append(" filename");
            }
            if (this.f47747b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f47747b = bArr;
            return this;
        }

        @Override // x8.F.d.b.a
        public F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f47746a = str;
            return this;
        }
    }

    @Override // x8.F.d.b
    public byte[] b() {
        return this.f47745b;
    }

    @Override // x8.F.d.b
    public String c() {
        return this.f47744a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.d.b) {
            F.d.b bVar = (F.d.b) obj;
            if (this.f47744a.equals(bVar.c())) {
                if (Arrays.equals(this.f47745b, bVar instanceof C6328g ? ((C6328g) bVar).f47745b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f47745b) ^ ((this.f47744a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "File{filename=" + this.f47744a + ", contents=" + Arrays.toString(this.f47745b) + "}";
    }

    public C6328g(String str, byte[] bArr) {
        this.f47744a = str;
        this.f47745b = bArr;
    }
}
