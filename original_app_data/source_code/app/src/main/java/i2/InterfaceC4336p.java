package i2;

import K7.AbstractC1081v;
import java.util.List;

/* JADX INFO: renamed from: i2.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4336p {
    void a(long j10, long j11);

    void c(r rVar);

    int i(InterfaceC4337q interfaceC4337q, I i10);

    boolean j(InterfaceC4337q interfaceC4337q);

    default List k() {
        return AbstractC1081v.z();
    }

    void release();

    default InterfaceC4336p f() {
        return this;
    }
}
