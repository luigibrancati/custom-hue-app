package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3717g0 extends InterfaceC3719h0 {

    /* JADX INFO: renamed from: com.google.protobuf.g0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a extends InterfaceC3719h0, Cloneable {
        InterfaceC3717g0 build();

        InterfaceC3717g0 buildPartial();

        a mergeFrom(InterfaceC3717g0 interfaceC3717g0);

        a mergeFrom(AbstractC3722j abstractC3722j, D d10);

        a mergeFrom(AbstractC3724k abstractC3724k, D d10);
    }

    t0 getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    AbstractC3722j toByteString();

    void writeTo(AbstractC3728m abstractC3728m);
}
