package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3706b implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f32218a = D.b();

    public final InterfaceC3717g0 c(InterfaceC3717g0 interfaceC3717g0) throws O {
        if (interfaceC3717g0 == null || interfaceC3717g0.isInitialized()) {
            return interfaceC3717g0;
        }
        throw d(interfaceC3717g0).a().k(interfaceC3717g0);
    }

    public final I0 d(InterfaceC3717g0 interfaceC3717g0) {
        return interfaceC3717g0 instanceof AbstractC3704a ? ((AbstractC3704a) interfaceC3717g0).newUninitializedMessageException() : new I0(interfaceC3717g0);
    }

    @Override // com.google.protobuf.t0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC3717g0 a(AbstractC3722j abstractC3722j, D d10) {
        return c(f(abstractC3722j, d10));
    }

    public InterfaceC3717g0 f(AbstractC3722j abstractC3722j, D d10) throws O {
        AbstractC3724k abstractC3724kW = abstractC3722j.w();
        InterfaceC3717g0 interfaceC3717g0 = (InterfaceC3717g0) b(abstractC3724kW, d10);
        try {
            abstractC3724kW.a(0);
            return interfaceC3717g0;
        } catch (O e10) {
            throw e10.k(interfaceC3717g0);
        }
    }
}
