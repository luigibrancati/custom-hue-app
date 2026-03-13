package Pd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static final double a(double d10, d sourceUnit, d targetUnit) {
        AbstractC4862t.e(sourceUnit, "sourceUnit");
        AbstractC4862t.e(targetUnit, "targetUnit");
        long jConvert = targetUnit.b().convert(1L, sourceUnit.b());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        AbstractC4862t.e(sourceUnit, "sourceUnit");
        AbstractC4862t.e(targetUnit, "targetUnit");
        return targetUnit.b().convert(j10, sourceUnit.b());
    }

    public static final long c(long j10, d sourceUnit, d targetUnit) {
        AbstractC4862t.e(sourceUnit, "sourceUnit");
        AbstractC4862t.e(targetUnit, "targetUnit");
        return targetUnit.b().convert(j10, sourceUnit.b());
    }
}
