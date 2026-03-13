package pe;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class F {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ F[] $VALUES;
    public static final a Companion;
    private final String javaName;
    public static final F TLS_1_3 = new F("TLS_1_3", 0, "TLSv1.3");
    public static final F TLS_1_2 = new F("TLS_1_2", 1, "TLSv1.2");
    public static final F TLS_1_1 = new F("TLS_1_1", 2, "TLSv1.1");
    public static final F TLS_1_0 = new F("TLS_1_0", 3, "TLSv1");
    public static final F SSL_3_0 = new F("SSL_3_0", 4, "SSLv3");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final F a(String javaName) {
            AbstractC4862t.e(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return F.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return F.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return F.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return F.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return F.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        public a() {
        }
    }

    static {
        F[] fArrA = a();
        $VALUES = fArrA;
        $ENTRIES = AbstractC5277b.a(fArrA);
        Companion = new a(null);
    }

    public F(String str, int i10, String str2) {
        this.javaName = str2;
    }

    public static final /* synthetic */ F[] a() {
        return new F[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }

    public final String b() {
        return this.javaName;
    }
}
