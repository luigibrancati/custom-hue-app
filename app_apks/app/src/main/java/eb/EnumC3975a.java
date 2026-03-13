package eb;

import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: eb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC3975a {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC3975a[] $VALUES;
    public static final C0428a Companion;
    private final int intValue;
    public static final EnumC3975a UNKNOWN = new EnumC3975a("UNKNOWN", 0, -1);
    public static final EnumC3975a ALL_FORMATS = new EnumC3975a("ALL_FORMATS", 1, 0);
    public static final EnumC3975a CODE_128 = new EnumC3975a("CODE_128", 2, 1);
    public static final EnumC3975a CODE_39 = new EnumC3975a("CODE_39", 3, 2);
    public static final EnumC3975a CODE_93 = new EnumC3975a("CODE_93", 4, 4);
    public static final EnumC3975a CODABAR = new EnumC3975a("CODABAR", 5, 8);
    public static final EnumC3975a DATA_MATRIX = new EnumC3975a("DATA_MATRIX", 6, 16);
    public static final EnumC3975a EAN_13 = new EnumC3975a("EAN_13", 7, 32);
    public static final EnumC3975a EAN_8 = new EnumC3975a("EAN_8", 8, 64);
    public static final EnumC3975a ITF = new EnumC3975a("ITF", 9, 128);
    public static final EnumC3975a QR_CODE = new EnumC3975a("QR_CODE", 10, 256);
    public static final EnumC3975a UPC_A = new EnumC3975a("UPC_A", 11, 512);
    public static final EnumC3975a UPC_E = new EnumC3975a("UPC_E", 12, RecognitionOptions.UPC_E);
    public static final EnumC3975a PDF417 = new EnumC3975a("PDF417", 13, RecognitionOptions.PDF417);
    public static final EnumC3975a AZTEC = new EnumC3975a("AZTEC", 14, RecognitionOptions.AZTEC);

    /* JADX INFO: renamed from: eb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0428a {
        public /* synthetic */ C0428a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final EnumC3975a a(int i10) {
            if (i10 == -1) {
                return EnumC3975a.UNKNOWN;
            }
            if (i10 == 0) {
                return EnumC3975a.ALL_FORMATS;
            }
            if (i10 == 1) {
                return EnumC3975a.CODE_128;
            }
            if (i10 == 2) {
                return EnumC3975a.CODE_39;
            }
            switch (i10) {
                case 4:
                    return EnumC3975a.CODE_93;
                case 8:
                    return EnumC3975a.CODABAR;
                case 16:
                    return EnumC3975a.DATA_MATRIX;
                case 32:
                    return EnumC3975a.EAN_13;
                case 64:
                    return EnumC3975a.EAN_8;
                case 128:
                    return EnumC3975a.ITF;
                case 256:
                    return EnumC3975a.QR_CODE;
                case 512:
                    return EnumC3975a.UPC_A;
                case RecognitionOptions.UPC_E /* 1024 */:
                    return EnumC3975a.UPC_E;
                case RecognitionOptions.PDF417 /* 2048 */:
                    return EnumC3975a.PDF417;
                case RecognitionOptions.AZTEC /* 4096 */:
                    return EnumC3975a.AZTEC;
                default:
                    return EnumC3975a.UNKNOWN;
            }
        }

        public C0428a() {
        }
    }

    static {
        EnumC3975a[] enumC3975aArrA = a();
        $VALUES = enumC3975aArrA;
        $ENTRIES = AbstractC5277b.a(enumC3975aArrA);
        Companion = new C0428a(null);
    }

    public EnumC3975a(String str, int i10, int i11) {
        this.intValue = i11;
    }

    public static final /* synthetic */ EnumC3975a[] a() {
        return new EnumC3975a[]{UNKNOWN, ALL_FORMATS, CODE_128, CODE_39, CODE_93, CODABAR, DATA_MATRIX, EAN_13, EAN_8, ITF, QR_CODE, UPC_A, UPC_E, PDF417, AZTEC};
    }

    public static EnumC3975a valueOf(String str) {
        return (EnumC3975a) Enum.valueOf(EnumC3975a.class, str);
    }

    public static EnumC3975a[] values() {
        return (EnumC3975a[]) $VALUES.clone();
    }

    public final int b() {
        return this.intValue;
    }
}
