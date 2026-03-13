package qc;

import kotlin.jvm.internal.AbstractC4862t;
import pc.C5457a;

/* JADX INFO: renamed from: qc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5514a extends C5457a {

    /* JADX INFO: renamed from: qc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0581a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0581a f43433a = new C0581a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f43434b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f43434b = num;
        }
    }

    private final boolean c(int i10) {
        Integer num = C0581a.f43434b;
        return num == null || num.intValue() >= i10;
    }

    @Override // pc.C5457a
    public void a(Throwable cause, Throwable exception) {
        AbstractC4862t.e(cause, "cause");
        AbstractC4862t.e(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
