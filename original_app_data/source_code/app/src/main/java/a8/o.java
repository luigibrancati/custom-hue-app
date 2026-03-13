package a8;

import e8.J;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f21174a = b("type.googleapis.com/google.crypto.tink.HmacKey");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J f21175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f21176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f21177d;

    static {
        J jP = J.P();
        f21175b = jP;
        f21176c = jP;
        f21177d = jP;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        c();
    }

    public static void c() throws GeneralSecurityException {
        s.e();
        h.e();
        m.c(true);
        if (T7.b.a()) {
            return;
        }
        AbstractC2653e.h(true);
    }

    public static String b(String str) {
        return str;
    }
}
