package com.google.android.filament.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"pointAt", "Lcom/google/android/filament/utils/Float3;", "r", "Lcom/google/android/filament/utils/Ray;", "t", "", "filament-utils-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RayKt {
    public static final Float3 pointAt(Ray r10, float f10) {
        AbstractC4862t.e(r10, "r");
        Float3 origin = r10.getOrigin();
        Float3 direction = r10.getDirection();
        Float3 float3 = new Float3(direction.getX() * f10, direction.getY() * f10, direction.getZ() * f10);
        return new Float3(origin.getX() + float3.getX(), origin.getY() + float3.getY(), origin.getZ() + float3.getZ());
    }
}
