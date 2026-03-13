package c6;

import c6.f;
import java.util.Arrays;

/* JADX INFO: renamed from: c6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3076a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f25798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25799b;

    /* JADX INFO: renamed from: c6.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable f25800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f25801b;

        @Override // c6.f.a
        public f a() {
            String str = "";
            if (this.f25800a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C3076a(this.f25800a, this.f25801b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c6.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f25800a = iterable;
            return this;
        }

        @Override // c6.f.a
        public f.a c(byte[] bArr) {
            this.f25801b = bArr;
            return this;
        }
    }

    @Override // c6.f
    public Iterable b() {
        return this.f25798a;
    }

    @Override // c6.f
    public byte[] c() {
        return this.f25799b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f25798a.equals(fVar.b())) {
                if (Arrays.equals(this.f25799b, fVar instanceof C3076a ? ((C3076a) fVar).f25799b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25799b) ^ ((this.f25798a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f25798a + ", extras=" + Arrays.toString(this.f25799b) + "}";
    }

    public C3076a(Iterable iterable, byte[] bArr) {
        this.f25798a = iterable;
        this.f25799b = bArr;
    }
}
