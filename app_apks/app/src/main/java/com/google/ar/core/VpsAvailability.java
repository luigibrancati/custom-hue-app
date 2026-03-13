package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum VpsAvailability {
    UNKNOWN(0),
    AVAILABLE(1),
    UNAVAILABLE(2),
    ERROR_INTERNAL(-1),
    ERROR_NETWORK_CONNECTION(-2),
    ERROR_NOT_AUTHORIZED(-3),
    ERROR_RESOURCE_EXHAUSTED(-4);

    final int nativeCode;

    VpsAvailability(int i10) {
        this.nativeCode = i10;
    }

    public static VpsAvailability forNumber(int i10) {
        for (VpsAvailability vpsAvailability : values()) {
            if (vpsAvailability.nativeCode == i10) {
                return vpsAvailability;
            }
        }
        throw new FatalException(p.b((byte) 51, i10, "Unexpected value for native VpsAvailability, value="));
    }
}
