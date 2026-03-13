package N6;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: renamed from: N6.l8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1392l8 implements O1 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(512),
    FORMAT_UPC_E(RecognitionOptions.UPC_E),
    FORMAT_PDF417(RecognitionOptions.PDF417),
    FORMAT_AZTEC(RecognitionOptions.AZTEC);

    private final int zzp;

    EnumC1392l8(int i10) {
        this.zzp = i10;
    }

    @Override // N6.O1
    public final int zza() {
        return this.zzp;
    }
}
