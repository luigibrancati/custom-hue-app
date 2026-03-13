package e8;

import com.google.crypto.tink.shaded.protobuf.AbstractC3678z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum I implements AbstractC3678z.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final int WITH_ID_REQUIREMENT_VALUE = 5;
    private static final AbstractC3678z.b internalValueMap = new AbstractC3678z.b() { // from class: e8.I.a
    };
    private final int value;

    I(int i10) {
        this.value = i10;
    }

    public static I b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 == 4) {
            return CRUNCHY;
        }
        if (i10 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3678z.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
