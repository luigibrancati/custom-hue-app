package Fe;

import Od.C1823c;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class N {
    public static final byte[] a(String str) {
        AbstractC4862t.e(str, "<this>");
        byte[] bytes = str.getBytes(C1823c.f12394b);
        AbstractC4862t.d(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        AbstractC4862t.e(bArr, "<this>");
        return new String(bArr, C1823c.f12394b);
    }
}
