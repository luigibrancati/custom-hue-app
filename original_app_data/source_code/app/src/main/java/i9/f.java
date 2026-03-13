package i9;

import com.google.protobuf.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum f implements N.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final N.d internalValueMap = new N.d() { // from class: i9.f.a
        @Override // com.google.protobuf.N.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f findValueByNumber(int i10) {
            return f.b(i10);
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements N.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N.e f37322a = new b();

        @Override // com.google.protobuf.N.e
        public boolean isInRange(int i10) {
            return f.b(i10) != null;
        }
    }

    f(int i10) {
        this.value = i10;
    }

    public static f b(int i10) {
        if (i10 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static N.e j() {
        return b.f37322a;
    }

    @Override // com.google.protobuf.N.c
    public final int getNumber() {
        return this.value;
    }
}
