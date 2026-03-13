package u9;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements u9.c {
    private static final /* synthetic */ b[] $VALUES;
    public static final b IDENTITY;
    public static final b LOWER_CASE_WITH_DASHES;
    public static final b LOWER_CASE_WITH_DOTS;
    public static final b LOWER_CASE_WITH_UNDERSCORES;
    public static final b UPPER_CAMEL_CASE;
    public static final b UPPER_CAMEL_CASE_WITH_SPACES;
    public static final b UPPER_CASE_WITH_UNDERSCORES;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends b {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // u9.c
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        b bVar = new b("UPPER_CAMEL_CASE", 1) { // from class: u9.b.b
            {
                a aVar2 = null;
            }

            @Override // u9.c
            public String a(Field field) {
                return b.j(field.getName());
            }
        };
        UPPER_CAMEL_CASE = bVar;
        b bVar2 = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: u9.b.c
            {
                a aVar2 = null;
            }

            @Override // u9.c
            public String a(Field field) {
                return b.j(b.b(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = bVar2;
        b bVar3 = new b("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: u9.b.d
            {
                a aVar2 = null;
            }

            @Override // u9.c
            public String a(Field field) {
                return b.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = bVar3;
        b bVar4 = new b("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: u9.b.e
            {
                a aVar2 = null;
            }

            @Override // u9.c
            public String a(Field field) {
                return b.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = bVar4;
        b bVar5 = new b("LOWER_CASE_WITH_DASHES", 5) { // from class: u9.b.f
            {
                a aVar2 = null;
            }

            @Override // u9.c
            public String a(Field field) {
                return b.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = bVar5;
        b bVar6 = new b("LOWER_CASE_WITH_DOTS", 6) { // from class: u9.b.g
            {
                a aVar2 = null;
            }

            @Override // u9.c
            public String a(Field field) {
                return b.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = bVar6;
        $VALUES = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    public b(String str, int i10) {
    }

    public static String b(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String j(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (!Character.isLetter(cCharAt)) {
                i10++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public /* synthetic */ b(String str, int i10, a aVar) {
        this(str, i10);
    }
}
