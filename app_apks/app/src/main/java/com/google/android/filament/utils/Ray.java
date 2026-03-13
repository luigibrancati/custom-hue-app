package com.google.android.filament.utils;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/google/android/filament/utils/Ray;", "", "origin", "Lcom/google/android/filament/utils/Float3;", "direction", "<init>", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V", "getOrigin", "()Lcom/google/android/filament/utils/Float3;", "setOrigin", "(Lcom/google/android/filament/utils/Float3;)V", "getDirection", "setDirection", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Ray {
    private Float3 direction;
    private Float3 origin;

    public Ray(Float3 origin, Float3 direction) {
        AbstractC4862t.e(origin, "origin");
        AbstractC4862t.e(direction, "direction");
        this.origin = origin;
        this.direction = direction;
    }

    public static /* synthetic */ Ray copy$default(Ray ray, Float3 float3, Float3 float32, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            float3 = ray.origin;
        }
        if ((i10 & 2) != 0) {
            float32 = ray.direction;
        }
        return ray.copy(float3, float32);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float3 getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float3 getDirection() {
        return this.direction;
    }

    public final Ray copy(Float3 origin, Float3 direction) {
        AbstractC4862t.e(origin, "origin");
        AbstractC4862t.e(direction, "direction");
        return new Ray(origin, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ray)) {
            return false;
        }
        Ray ray = (Ray) other;
        return AbstractC4862t.a(this.origin, ray.origin) && AbstractC4862t.a(this.direction, ray.direction);
    }

    public final Float3 getDirection() {
        return this.direction;
    }

    public final Float3 getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return (this.origin.hashCode() * 31) + this.direction.hashCode();
    }

    public final void setDirection(Float3 float3) {
        AbstractC4862t.e(float3, "<set-?>");
        this.direction = float3;
    }

    public final void setOrigin(Float3 float3) {
        AbstractC4862t.e(float3, "<set-?>");
        this.origin = float3;
    }

    public String toString() {
        return "Ray(origin=" + this.origin + ", direction=" + this.direction + ")";
    }

    public /* synthetic */ Ray(Float3 float3, Float3 float32, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new Float3(0.0f, 0.0f, 0.0f, 7, null) : float3, float32);
    }
}
