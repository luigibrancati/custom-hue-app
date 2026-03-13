package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class l0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31520a;

    public l0(Q q10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f31520a = null;
    }

    public A a() {
        return new A(getMessage());
    }
}
