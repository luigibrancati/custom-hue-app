package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P {
    public static void a(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    public static void b(Buffer buffer, int i10) {
        buffer.position(i10);
    }
}
