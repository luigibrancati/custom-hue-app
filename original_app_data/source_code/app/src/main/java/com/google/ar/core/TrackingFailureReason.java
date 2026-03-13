package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);

    final int nativeCode;

    TrackingFailureReason(int i10) {
        this.nativeCode = i10;
    }

    public static TrackingFailureReason forNumber(int i10) {
        for (TrackingFailureReason trackingFailureReason : values()) {
            if (trackingFailureReason.nativeCode == i10) {
                return trackingFailureReason;
            }
        }
        throw new FatalException(p.b((byte) 57, i10, "Unexpected value for native TrackingFailureReason, value="));
    }
}
