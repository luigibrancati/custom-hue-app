package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum Coordinates2d {
    TEXTURE_TEXELS(0),
    TEXTURE_NORMALIZED(1),
    IMAGE_PIXELS(2),
    IMAGE_NORMALIZED(3),
    OPENGL_NORMALIZED_DEVICE_COORDINATES(6),
    VIEW(7),
    VIEW_NORMALIZED(8);

    final int nativeCode;

    Coordinates2d(int i10) {
        this.nativeCode = i10;
    }

    public static Coordinates2d forNumber(int i10) {
        for (Coordinates2d coordinates2d : values()) {
            if (coordinates2d.nativeCode == i10) {
                return coordinates2d;
            }
        }
        throw new FatalException(p.b((byte) 49, i10, "Unexpected value for native Coordinates2d, value="));
    }
}
