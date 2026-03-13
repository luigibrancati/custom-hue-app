package V7;

import e8.J;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17290a = a("type.googleapis.com/google.crypto.tink.AesSivKey");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f17291b = J.P();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f17292c = J.P();

    static {
        try {
            b();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void b() {
        j.e();
        if (T7.b.a()) {
            return;
        }
        d.f(true);
    }

    public static String a(String str) {
        return str;
    }
}
