package com.google.protobuf;

import com.google.protobuf.N;

/* JADX INFO: renamed from: com.google.protobuf.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3738r0 implements N.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final N.d internalValueMap = new N.d() { // from class: com.google.protobuf.r0.a
        @Override // com.google.protobuf.N.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC3738r0 findValueByNumber(int i10) {
            return EnumC3738r0.a(i10);
        }
    };
    private final int value;

    EnumC3738r0(int i10) {
        this.value = i10;
    }

    public static EnumC3738r0 a(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    @Override // com.google.protobuf.N.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
