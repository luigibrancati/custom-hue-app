package rb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static boolean a(float f10, float f11) {
        float fAbs = Math.abs(f10 - f11);
        return fAbs <= 1.0E-10f || fAbs <= Math.max(Math.abs(f10), Math.abs(f11)) * 1.1920929E-7f;
    }
}
