package ve;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f46042a = new f();

    public static final boolean a(String method) {
        AbstractC4862t.e(method, "method");
        return AbstractC4862t.a(method, "POST") || AbstractC4862t.a(method, "PATCH") || AbstractC4862t.a(method, "PUT") || AbstractC4862t.a(method, "DELETE") || AbstractC4862t.a(method, "MOVE");
    }

    public static final boolean b(String method) {
        AbstractC4862t.e(method, "method");
        return (AbstractC4862t.a(method, "GET") || AbstractC4862t.a(method, "HEAD")) ? false : true;
    }

    public static final boolean e(String method) {
        AbstractC4862t.e(method, "method");
        return AbstractC4862t.a(method, "POST") || AbstractC4862t.a(method, "PUT") || AbstractC4862t.a(method, "PATCH") || AbstractC4862t.a(method, "PROPPATCH") || AbstractC4862t.a(method, "REPORT");
    }

    public final boolean c(String method) {
        AbstractC4862t.e(method, "method");
        return !AbstractC4862t.a(method, "PROPFIND");
    }

    public final boolean d(String method) {
        AbstractC4862t.e(method, "method");
        return AbstractC4862t.a(method, "PROPFIND");
    }
}
