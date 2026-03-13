package b6;

import android.util.Base64;
import b6.C2835d;

/* JADX INFO: renamed from: b6.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2847p {

    /* JADX INFO: renamed from: b6.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public abstract AbstractC2847p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(Y5.f fVar);
    }

    public static a a() {
        return new C2835d.b().d(Y5.f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Y5.f d();

    public boolean e() {
        return c() != null;
    }

    public AbstractC2847p f(Y5.f fVar) {
        return a().b(b()).d(fVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
