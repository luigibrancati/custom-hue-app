package U7;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f16765a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f16766b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: U7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class EnumC0207b {
        public static final EnumC0207b ALGORITHM_NOT_FIPS = new a("ALGORITHM_NOT_FIPS", 0);
        public static final EnumC0207b ALGORITHM_REQUIRES_BORINGCRYPTO = new C0208b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
        private static final /* synthetic */ EnumC0207b[] $VALUES = a();

        /* JADX INFO: renamed from: U7.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum a extends EnumC0207b {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // U7.b.EnumC0207b
            public boolean b() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: U7.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum C0208b extends EnumC0207b {
            public C0208b(String str, int i10) {
                super(str, i10);
            }

            @Override // U7.b.EnumC0207b
            public boolean b() {
                return !b.c() || b.b();
            }
        }

        public EnumC0207b(String str, int i10) {
        }

        public static /* synthetic */ EnumC0207b[] a() {
            return new EnumC0207b[]{ALGORITHM_NOT_FIPS, ALGORITHM_REQUIRES_BORINGCRYPTO};
        }

        public static EnumC0207b valueOf(String str) {
            return (EnumC0207b) Enum.valueOf(EnumC0207b.class, str);
        }

        public static EnumC0207b[] values() {
            return (EnumC0207b[]) $VALUES.clone();
        }

        public abstract boolean b();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f16765a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return U7.a.a() || f16766b.get();
    }
}
