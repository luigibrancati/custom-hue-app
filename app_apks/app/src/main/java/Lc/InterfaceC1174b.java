package Lc;

import java.util.Collection;

/* JADX INFO: renamed from: Lc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC1174b extends InterfaceC1173a, C {

    /* JADX INFO: renamed from: Lc.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            return this != FAKE_OVERRIDE;
        }
    }

    void C0(Collection collection);

    InterfaceC1174b H0(InterfaceC1185m interfaceC1185m, D d10, AbstractC1192u abstractC1192u, a aVar, boolean z10);

    @Override // Lc.InterfaceC1173a, Lc.InterfaceC1185m
    InterfaceC1174b a();

    @Override // Lc.InterfaceC1173a
    Collection d();

    a f();
}
