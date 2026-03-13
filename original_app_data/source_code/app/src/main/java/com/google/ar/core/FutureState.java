package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum FutureState {
    PENDING(0),
    CANCELLED(1),
    DONE(2);

    final int nativeCode;

    FutureState(int i10) {
        this.nativeCode = i10;
    }

    public static FutureState forNumber(int i10) {
        for (FutureState futureState : values()) {
            if (futureState.nativeCode == i10) {
                return futureState;
            }
        }
        throw new FatalException(p.b((byte) 47, i10, "Unexpected value for native FutureState, value="));
    }
}
