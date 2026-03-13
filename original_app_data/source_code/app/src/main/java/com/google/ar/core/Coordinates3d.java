package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum Coordinates3d {
    EIS_TEXTURE_NORMALIZED(0),
    EIS_NORMALIZED_DEVICE_COORDINATES(1);

    final int nativeCode;

    Coordinates3d(int i10) {
        this.nativeCode = i10;
    }

    public static Coordinates3d forNumber(int i10) {
        for (Coordinates3d coordinates3d : values()) {
            if (coordinates3d.nativeCode == i10) {
                return coordinates3d;
            }
        }
        throw new FatalException(p.b((byte) 51, i10, "Unexpected value for native Coordinates3d, value = "));
    }
}
