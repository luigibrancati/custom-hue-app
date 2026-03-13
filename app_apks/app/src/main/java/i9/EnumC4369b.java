package i9;

import com.google.protobuf.N;

/* JADX INFO: renamed from: i9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4369b implements N.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final N.d internalValueMap = new N.d() { // from class: i9.b.a
        @Override // com.google.protobuf.N.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC4369b findValueByNumber(int i10) {
            return EnumC4369b.b(i10);
        }
    };
    private final int value;

    /* JADX INFO: renamed from: i9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0487b implements N.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N.e f37321a = new C0487b();

        @Override // com.google.protobuf.N.e
        public boolean isInRange(int i10) {
            return EnumC4369b.b(i10) != null;
        }
    }

    EnumC4369b(int i10) {
        this.value = i10;
    }

    public static EnumC4369b b(int i10) {
        if (i10 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i10 == 1) {
            return FOREGROUND;
        }
        if (i10 == 2) {
            return BACKGROUND;
        }
        if (i10 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static N.e j() {
        return C0487b.f37321a;
    }

    @Override // com.google.protobuf.N.c
    public final int getNumber() {
        return this.value;
    }
}
