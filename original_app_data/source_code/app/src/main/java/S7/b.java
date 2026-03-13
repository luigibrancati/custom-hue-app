package S7;

import Q7.C1926v;
import R7.C2095q;
import f8.i;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements P7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f15422a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher cipher = (Cipher) i.f34202b.a("AES/GCM-SIV/NoPadding");
                if (C2095q.f(cipher)) {
                    return cipher;
                }
                return null;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static Cipher d() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) f15422a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }

    public static P7.a e(C1926v c1926v) {
        return C2095q.c(c1926v, new C2095q.a() { // from class: S7.a
            @Override // R7.C2095q.a
            public final Object get() {
                return b.d();
            }
        });
    }
}
