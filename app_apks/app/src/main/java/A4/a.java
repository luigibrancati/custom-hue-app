package A4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: A4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class EnumC0004a {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ EnumC0004a[] $VALUES;
        public static final EnumC0004a DEBUG = new EnumC0004a("DEBUG", 0, 1);
        public static final EnumC0004a INFO = new EnumC0004a("INFO", 1, 2);
        public static final EnumC0004a WARN = new EnumC0004a("WARN", 2, 3);
        public static final EnumC0004a ERROR = new EnumC0004a("ERROR", 3, 4);
        public static final EnumC0004a OFF = new EnumC0004a("OFF", 4, 5);

        static {
            EnumC0004a[] enumC0004aArrA = a();
            $VALUES = enumC0004aArrA;
            $ENTRIES = AbstractC5277b.a(enumC0004aArrA);
        }

        public EnumC0004a(String str, int i10, int i11) {
        }

        public static final /* synthetic */ EnumC0004a[] a() {
            return new EnumC0004a[]{DEBUG, INFO, WARN, ERROR, OFF};
        }

        public static EnumC0004a valueOf(String str) {
            return (EnumC0004a) Enum.valueOf(EnumC0004a.class, str);
        }

        public static EnumC0004a[] values() {
            return (EnumC0004a[]) $VALUES.clone();
        }
    }

    void a(String str);

    void b(String str);

    void c(String str);

    void d(String str);

    void e(EnumC0004a enumC0004a);
}
