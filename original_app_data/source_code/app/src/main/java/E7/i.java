package E7;

import com.google.protobuf.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum i implements N.c {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    private static final N.d internalValueMap = new N.d() { // from class: E7.i.a
        @Override // com.google.protobuf.N.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i findValueByNumber(int i10) {
            return i.b(i10);
        }
    };
    private final int value;

    i(int i10) {
        this.value = i10;
    }

    public static i b(int i10) {
        if (i10 == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return EARLY_ACCESS;
        }
        if (i10 == 2) {
            return ALPHA;
        }
        if (i10 == 3) {
            return BETA;
        }
        if (i10 == 4) {
            return GA;
        }
        if (i10 != 5) {
            return null;
        }
        return DEPRECATED;
    }

    @Override // com.google.protobuf.N.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
