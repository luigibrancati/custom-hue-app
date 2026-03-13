package u9;

import java.io.IOException;
import java.math.BigDecimal;
import w9.AbstractC6171A;
import w9.y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u implements v {
    private static final /* synthetic */ u[] $VALUES;
    public static final u BIG_DECIMAL;
    public static final u DOUBLE;
    public static final u LAZILY_PARSED_NUMBER;
    public static final u LONG_OR_DOUBLE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends u {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // u9.v
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(C9.a aVar) {
            return Double.valueOf(aVar.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        u uVar = new u("LAZILY_PARSED_NUMBER", 1) { // from class: u9.u.b
            {
                a aVar2 = null;
            }

            @Override // u9.v
            public Number a(C9.a aVar2) {
                return new y(aVar2.nextString());
            }
        };
        LAZILY_PARSED_NUMBER = uVar;
        u uVar2 = new u("LONG_OR_DOUBLE", 2) { // from class: u9.u.c
            {
                a aVar2 = null;
            }

            @Override // u9.v
            public Number a(C9.a aVar2) throws IOException {
                String strNextString = aVar2.nextString();
                if (strNextString.indexOf(46) >= 0) {
                    return b(strNextString, aVar2);
                }
                try {
                    return Long.valueOf(Long.parseLong(strNextString));
                } catch (NumberFormatException unused) {
                    return this.b(strNextString, aVar2);
                }
            }

            public final Number b(String str, C9.a aVar2) throws C9.d {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!aVar2.j()) {
                            throw new C9.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar2.h());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e10) {
                    throw new n("Cannot parse " + str + "; at path " + aVar2.h(), e10);
                }
            }
        };
        LONG_OR_DOUBLE = uVar2;
        u uVar3 = new u("BIG_DECIMAL", 3) { // from class: u9.u.d
            {
                a aVar2 = null;
            }

            @Override // u9.v
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public BigDecimal a(C9.a aVar2) throws IOException {
                String strNextString = aVar2.nextString();
                try {
                    return AbstractC6171A.b(strNextString);
                } catch (NumberFormatException e10) {
                    throw new n("Cannot parse " + strNextString + "; at path " + aVar2.h(), e10);
                }
            }
        };
        BIG_DECIMAL = uVar3;
        $VALUES = new u[]{aVar, uVar, uVar2, uVar3};
    }

    public u(String str, int i10) {
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public /* synthetic */ u(String str, int i10, a aVar) {
        this(str, i10);
    }
}
