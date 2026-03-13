package T1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16055a = new u() { // from class: T1.s
        @Override // T1.u
        public final List b(String str, boolean z10, boolean z11) {
            return z.k(str, z10, z11);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f16056b = new u() { // from class: T1.t
        @Override // T1.u
        public final List b(String str, boolean z10, boolean z11) {
            return z.o(u.f16055a.b(str, z10, z11));
        }
    };

    List b(String str, boolean z10, boolean z11);
}
