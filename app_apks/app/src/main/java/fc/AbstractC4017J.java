package fc;

import Od.C1821a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fc.J, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4017J {
    public static final int a(int i10, int i11) {
        return AbstractC4862t.f(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j10, long j11) {
        return AbstractC4862t.g(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double c(long j10) {
        return ((j10 >>> 11) * ((double) RecognitionOptions.PDF417)) + (j10 & 2047);
    }

    public static final String d(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, C1821a.a(i10));
            AbstractC4862t.d(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, C1821a.a(i10));
        AbstractC4862t.d(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, C1821a.a(i10));
        AbstractC4862t.d(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
