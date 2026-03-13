package Db;

/* JADX INFO: renamed from: Db.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC0764k {
    NONE,
    AES_128,
    SAMPLE_AES,
    SAMPLE_AES_CTR;

    private static final String AES_128_STRING = "AES-128";
    private static final String SAMPLE_AES_CTR_STRING = "SAMPLE-AES-CTR";
    private static final String SAMPLE_AES_STRING = "SAMPLE-AES";

    /* JADX INFO: renamed from: Db.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2522a;

        static {
            int[] iArr = new int[EnumC0764k.values().length];
            f2522a = iArr;
            try {
                iArr[EnumC0764k.AES_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2522a[EnumC0764k.SAMPLE_AES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2522a[EnumC0764k.SAMPLE_AES_CTR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static EnumC0764k b(String str) {
        str.getClass();
        switch (str) {
            case "AES-128":
                return AES_128;
            case "SAMPLE-AES":
                return SAMPLE_AES;
            case "SAMPLE-AES-CTR":
                return SAMPLE_AES_CTR;
            default:
                return valueOf(str);
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = a.f2522a[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? super.toString() : SAMPLE_AES_CTR_STRING : SAMPLE_AES_STRING : AES_128_STRING;
    }
}
