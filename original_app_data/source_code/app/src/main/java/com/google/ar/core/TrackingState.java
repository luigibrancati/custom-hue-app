package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);

    final int nativeCode;

    TrackingState(int i10) {
        this.nativeCode = i10;
    }

    public static TrackingState forNumber(int i10) {
        for (TrackingState trackingState : values()) {
            if (trackingState.nativeCode == i10) {
                return trackingState;
            }
        }
        throw new FatalException(p.b((byte) 49, i10, "Unexpected value for native TrackingState, value="));
    }
}
