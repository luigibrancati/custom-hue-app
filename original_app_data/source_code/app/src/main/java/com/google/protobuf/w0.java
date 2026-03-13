package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f32329c = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f32331b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0 f32330a = new Y();

    public static w0 a() {
        return f32329c;
    }

    public A0 b(Class cls, A0 a02) {
        N.b(cls, "messageType");
        N.b(a02, "schema");
        return (A0) this.f32331b.putIfAbsent(cls, a02);
    }

    public A0 c(Class cls) {
        A0 a0B;
        N.b(cls, "messageType");
        A0 a0A = (A0) this.f32331b.get(cls);
        return (a0A != null || (a0B = b(cls, (a0A = this.f32330a.a(cls)))) == null) ? a0A : a0B;
    }

    public A0 d(Object obj) {
        return c(obj.getClass());
    }
}
