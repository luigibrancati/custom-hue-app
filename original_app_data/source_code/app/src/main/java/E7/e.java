package E7;

import com.google.protobuf.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum e implements N.c {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final N.d internalValueMap = new N.d() { // from class: E7.e.a
        @Override // com.google.protobuf.N.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e findValueByNumber(int i10) {
            return e.b(i10);
        }
    };
    private final int value;

    e(int i10) {
        this.value = i10;
    }

    public static e b(int i10) {
        if (i10 == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return ADDED;
        }
        if (i10 == 2) {
            return REMOVED;
        }
        if (i10 != 3) {
            return null;
        }
        return MODIFIED;
    }

    @Override // com.google.protobuf.N.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
