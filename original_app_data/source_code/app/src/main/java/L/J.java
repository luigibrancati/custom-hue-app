package L;

import E.InterfaceC0800m;
import E.InterfaceC0802n;
import E.InterfaceC0815u;
import E.W0;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface J extends InterfaceC0800m, W0.c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        a(boolean z10) {
            this.mHoldsCameraSlot = z10;
        }

        public boolean b() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // E.InterfaceC0800m
    default InterfaceC0802n a() {
        return c();
    }

    @Override // E.InterfaceC0800m
    default InterfaceC0815u b() {
        return i();
    }

    F c();

    default B e() {
        return E.a();
    }

    void g(Collection collection);

    void h(Collection collection);

    I i();

    default boolean l() {
        return b().f() == 0;
    }

    default boolean p() {
        return true;
    }

    O7.e release();

    default void o() {
    }

    default void f(boolean z10) {
    }

    default void k(B b10) {
    }

    default void q(boolean z10) {
    }
}
