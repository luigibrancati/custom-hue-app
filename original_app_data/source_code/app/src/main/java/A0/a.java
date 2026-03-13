package A0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final float a(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }
}
