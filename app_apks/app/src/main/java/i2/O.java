package i2;

import D1.InterfaceC0749g;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface O {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f36889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36891d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f36888a = i10;
            this.f36889b = bArr;
            this.f36890c = i11;
            this.f36891d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f36888a == aVar.f36888a && this.f36890c == aVar.f36890c && this.f36891d == aVar.f36891d && Arrays.equals(this.f36889b, aVar.f36889b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f36888a * 31) + Arrays.hashCode(this.f36889b)) * 31) + this.f36890c) * 31) + this.f36891d;
        }
    }

    default int a(InterfaceC0749g interfaceC0749g, int i10, boolean z10) {
        return c(interfaceC0749g, i10, z10, 0);
    }

    default void b(G1.C c10, int i10) {
        g(c10, i10, 0);
    }

    int c(InterfaceC0749g interfaceC0749g, int i10, boolean z10, int i11);

    void d(long j10, int i10, int i11, int i12, a aVar);

    void e(D1.o oVar);

    void g(G1.C c10, int i10, int i11);

    default void f(long j10) {
    }
}
