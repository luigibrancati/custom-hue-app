package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f31426c = new b0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f31427d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f31429b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f31428a = new I();

    public static b0 a() {
        return f31426c;
    }

    public f0 b(Class cls, f0 f0Var) {
        AbstractC3678z.b(cls, "messageType");
        AbstractC3678z.b(f0Var, "schema");
        return (f0) this.f31429b.putIfAbsent(cls, f0Var);
    }

    public f0 c(Class cls) {
        f0 f0VarB;
        AbstractC3678z.b(cls, "messageType");
        f0 f0VarA = (f0) this.f31429b.get(cls);
        return (f0VarA != null || (f0VarB = b(cls, (f0VarA = this.f31428a.a(cls)))) == null) ? f0VarA : f0VarB;
    }

    public f0 d(Object obj) {
        return c(obj.getClass());
    }
}
