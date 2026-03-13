package pe;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class z {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final a Companion;
    private final String protocol;
    public static final z HTTP_1_0 = new z("HTTP_1_0", 0, "http/1.0");
    public static final z HTTP_1_1 = new z("HTTP_1_1", 1, "http/1.1");
    public static final z SPDY_3 = new z("SPDY_3", 2, "spdy/3.1");
    public static final z HTTP_2 = new z("HTTP_2", 3, "h2");
    public static final z H2_PRIOR_KNOWLEDGE = new z("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final z QUIC = new z("QUIC", 5, "quic");
    public static final z HTTP_3 = new z("HTTP_3", 6, "h3");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final z a(String protocol) throws IOException {
            AbstractC4862t.e(protocol, "protocol");
            z zVar = z.HTTP_1_0;
            if (AbstractC4862t.a(protocol, zVar.protocol)) {
                return zVar;
            }
            z zVar2 = z.HTTP_1_1;
            if (AbstractC4862t.a(protocol, zVar2.protocol)) {
                return zVar2;
            }
            z zVar3 = z.H2_PRIOR_KNOWLEDGE;
            if (AbstractC4862t.a(protocol, zVar3.protocol)) {
                return zVar3;
            }
            z zVar4 = z.HTTP_2;
            if (AbstractC4862t.a(protocol, zVar4.protocol)) {
                return zVar4;
            }
            z zVar5 = z.SPDY_3;
            if (AbstractC4862t.a(protocol, zVar5.protocol)) {
                return zVar5;
            }
            z zVar6 = z.QUIC;
            if (AbstractC4862t.a(protocol, zVar6.protocol)) {
                return zVar6;
            }
            z zVar7 = z.HTTP_3;
            if (Od.C.P(protocol, zVar7.protocol, false, 2, null)) {
                return zVar7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public a() {
        }
    }

    static {
        z[] zVarArrA = a();
        $VALUES = zVarArrA;
        $ENTRIES = AbstractC5277b.a(zVarArrA);
        Companion = new a(null);
    }

    public z(String str, int i10, String str2) {
        this.protocol = str2;
    }

    public static final /* synthetic */ z[] a() {
        return new z[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
