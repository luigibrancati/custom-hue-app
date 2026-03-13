package com.google.ar.core;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ColorCorrectionGains {
    private final float blue;
    private final float greenEven;
    private final float greenOdd;
    private final float red;

    public ColorCorrectionGains(float f10, float f11, float f12, float f13) {
        this.red = f10;
        this.greenEven = f11;
        this.greenOdd = f12;
        this.blue = f13;
    }

    public float blue() {
        return this.blue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorCorrectionGains)) {
            return false;
        }
        ColorCorrectionGains colorCorrectionGains = (ColorCorrectionGains) obj;
        return this.red == colorCorrectionGains.red && this.greenEven == colorCorrectionGains.greenEven && this.greenOdd == colorCorrectionGains.greenOdd && this.blue == colorCorrectionGains.blue;
    }

    public float greenEven() {
        return this.greenEven;
    }

    public float greenOdd() {
        return this.greenOdd;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.red), Float.valueOf(this.greenEven), Float.valueOf(this.greenOdd), Float.valueOf(this.blue));
    }

    public float red() {
        return this.red;
    }
}
