package com.google.protobuf;

import com.google.protobuf.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum F0 implements N.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final N.d internalValueMap = new N.d() { // from class: com.google.protobuf.F0.a
        @Override // com.google.protobuf.N.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public F0 findValueByNumber(int i10) {
            return F0.a(i10);
        }
    };
    private final int value;

    F0(int i10) {
        this.value = i10;
    }

    public static F0 a(int i10) {
        if (i10 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i10 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i10 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    @Override // com.google.protobuf.N.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
