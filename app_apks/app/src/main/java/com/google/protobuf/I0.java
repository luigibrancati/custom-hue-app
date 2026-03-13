package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class I0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32110a;

    public I0(InterfaceC3717g0 interfaceC3717g0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f32110a = null;
    }

    public O a() {
        return new O(getMessage());
    }
}
