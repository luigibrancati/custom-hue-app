package q9;

import kotlin.jvm.internal.AbstractC4862t;
import p9.T;

/* JADX INFO: renamed from: q9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5508a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5508a f43311a = new C5508a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static T f43312b;

    public static final void b() {
        try {
            if (f43312b == null) {
                f43311a.c(T.f42372a.a());
            }
            C5508a c5508a = f43311a;
            if (c5508a.a().a()) {
                c5508a.a().b();
            }
        } catch (Exception unused) {
        }
    }

    public final T a() {
        T t10 = f43312b;
        if (t10 != null) {
            return t10;
        }
        AbstractC4862t.p("sharedSessionRepository");
        return null;
    }

    public final void c(T t10) {
        AbstractC4862t.e(t10, "<set-?>");
        f43312b = t10;
    }
}
