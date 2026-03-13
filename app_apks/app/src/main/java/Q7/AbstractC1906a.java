package Q7;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Q7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1906a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14048a = b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14049b = b("type.googleapis.com/google.crypto.tink.AesGcmKey");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14050c = b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14051d = b("type.googleapis.com/google.crypto.tink.AesEaxKey");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14052e = b("type.googleapis.com/google.crypto.tink.KmsAeadKey");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14053f = b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14054g = b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14055h = b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e8.J f14056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e8.J f14057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e8.J f14058k;

    static {
        e8.J jP = e8.J.P();
        f14056i = jP;
        f14057j = jP;
        f14058k = jP;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        c();
    }

    public static void c() {
        C1910e.e();
        a8.o.c();
        AbstractC1915j.d(true);
        AbstractC1924t.e(true);
        if (T7.b.a()) {
            return;
        }
        AbstractC1920o.e(true);
        AbstractC1929y.d(true);
        D.f(true);
        H.f(true);
        L.f(true);
        t0.f(true);
        o0.d(true);
    }

    public static String b(String str) {
        return str;
    }
}
