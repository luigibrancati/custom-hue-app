package F2;

import G1.InterfaceC0864l;
import K7.AbstractC1081v;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface s {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3686a = new C0053a();

        /* JADX INFO: renamed from: F2.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0053a implements a {
            @Override // F2.s.a
            public boolean a(D1.o oVar) {
                return false;
            }

            @Override // F2.s.a
            public s b(D1.o oVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // F2.s.a
            public int c(D1.o oVar) {
                return 1;
            }
        }

        boolean a(D1.o oVar);

        s b(D1.o oVar);

        int c(D1.o oVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f3687c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f3688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3689b;

        public b(long j10, boolean z10) {
            this.f3688a = j10;
            this.f3689b = z10;
        }

        public static b b() {
            return f3687c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    default k a(byte[] bArr, int i10, int i11) {
        final AbstractC1081v.a aVarR = AbstractC1081v.r();
        b bVar = b.f3687c;
        Objects.requireNonNull(aVarR);
        c(bArr, i10, i11, bVar, new InterfaceC0864l() { // from class: F2.r
            @Override // G1.InterfaceC0864l
            public final void accept(Object obj) {
                aVarR.a((e) obj);
            }
        });
        return new g(aVarR.k());
    }

    int b();

    void c(byte[] bArr, int i10, int i11, b bVar, InterfaceC0864l interfaceC0864l);

    default void reset() {
    }
}
