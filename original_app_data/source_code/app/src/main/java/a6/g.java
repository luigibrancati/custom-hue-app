package a6;

import a6.q;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21050b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f21051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f21052b;

        @Override // a6.q.a
        public q a() {
            return new g(this.f21051a, this.f21052b);
        }

        @Override // a6.q.a
        public q.a b(byte[] bArr) {
            this.f21051a = bArr;
            return this;
        }

        @Override // a6.q.a
        public q.a c(byte[] bArr) {
            this.f21052b = bArr;
            return this;
        }
    }

    @Override // a6.q
    public byte[] b() {
        return this.f21049a;
    }

    @Override // a6.q
    public byte[] c() {
        return this.f21050b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z10 = qVar instanceof g;
            if (Arrays.equals(this.f21049a, z10 ? ((g) qVar).f21049a : qVar.b())) {
                if (Arrays.equals(this.f21050b, z10 ? ((g) qVar).f21050b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f21050b) ^ ((Arrays.hashCode(this.f21049a) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f21049a) + ", encryptedBlob=" + Arrays.toString(this.f21050b) + "}";
    }

    public g(byte[] bArr, byte[] bArr2) {
        this.f21049a = bArr;
        this.f21050b = bArr2;
    }
}
