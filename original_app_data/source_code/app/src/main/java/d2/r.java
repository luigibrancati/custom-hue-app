package d2;

import D1.D;
import D1.E;
import a2.InterfaceC2611D;
import b2.AbstractC2795e;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface r extends v {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f32963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f32964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f32965c;

        public a(E e10, int... iArr) {
            this(e10, iArr, 0);
        }

        public a(E e10, int[] iArr, int i10) {
            if (iArr.length == 0) {
                G1.t.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f32963a = e10;
            this.f32964b = iArr;
            this.f32965c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        r[] a(a[] aVarArr, e2.d dVar, InterfaceC2611D.b bVar, D d10);
    }

    boolean a(int i10, long j10);

    int b();

    void c();

    void g(long j10, long j11, long j12, List list, b2.n[] nVarArr);

    boolean h(int i10, long j10);

    void i(float f10);

    Object j();

    default boolean m(long j10, AbstractC2795e abstractC2795e, List list) {
        return false;
    }

    void o(boolean z10);

    void p();

    int q(long j10, List list);

    int r();

    D1.o s();

    int t();

    default void k() {
    }

    default void u() {
    }
}
