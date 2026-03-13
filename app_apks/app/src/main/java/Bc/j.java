package Bc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class j {
    public static final void a(boolean z10, Number step) {
        AbstractC4862t.e(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static c b(double d10, double d11) {
        return new a(d10, d11);
    }

    public static c c(float f10, float f11) {
        return new b(f10, f11);
    }
}
