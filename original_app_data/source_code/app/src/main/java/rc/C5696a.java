package rc;

import qc.C5514a;
import zc.AbstractC6558c;

/* JADX INFO: renamed from: rc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5696a extends C5514a {

    /* JADX INFO: renamed from: rc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0588a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0588a f43973a = new C0588a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f43974b;

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
            f43974b = num;
        }
    }

    @Override // pc.C5457a
    public AbstractC6558c b() {
        return c(34) ? new Ac.a() : super.b();
    }

    public final boolean c(int i10) {
        Integer num = C0588a.f43974b;
        return num == null || num.intValue() >= i10;
    }
}
