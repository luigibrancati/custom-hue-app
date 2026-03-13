package com.google.android.filament.utils;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/filament/utils/RotationsOrder;", "", "yaw", "Lcom/google/android/filament/utils/VectorComponent;", "pitch", "roll", "<init>", "(Ljava/lang/String;ILcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)V", "getYaw", "()Lcom/google/android/filament/utils/VectorComponent;", "getPitch", "getRoll", "XYZ", "XZY", "YXZ", "YZX", "ZXY", "ZYX", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RotationsOrder {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ RotationsOrder[] $VALUES;
    public static final RotationsOrder XYZ;
    public static final RotationsOrder XZY;
    public static final RotationsOrder YXZ;
    public static final RotationsOrder YZX;
    public static final RotationsOrder ZXY;
    public static final RotationsOrder ZYX;
    private final VectorComponent pitch;
    private final VectorComponent roll;
    private final VectorComponent yaw;

    private static final /* synthetic */ RotationsOrder[] $values() {
        return new RotationsOrder[]{XYZ, XZY, YXZ, YZX, ZXY, ZYX};
    }

    static {
        VectorComponent vectorComponent = VectorComponent.f28985X;
        VectorComponent vectorComponent2 = VectorComponent.f28986Y;
        VectorComponent vectorComponent3 = VectorComponent.f28987Z;
        XYZ = new RotationsOrder("XYZ", 0, vectorComponent, vectorComponent2, vectorComponent3);
        XZY = new RotationsOrder("XZY", 1, vectorComponent, vectorComponent3, vectorComponent2);
        YXZ = new RotationsOrder("YXZ", 2, vectorComponent2, vectorComponent, vectorComponent3);
        YZX = new RotationsOrder("YZX", 3, vectorComponent2, vectorComponent3, vectorComponent);
        ZXY = new RotationsOrder("ZXY", 4, vectorComponent3, vectorComponent, vectorComponent2);
        ZYX = new RotationsOrder("ZYX", 5, vectorComponent3, vectorComponent2, vectorComponent);
        RotationsOrder[] rotationsOrderArr$values = $values();
        $VALUES = rotationsOrderArr$values;
        $ENTRIES = AbstractC5277b.a(rotationsOrderArr$values);
    }

    private RotationsOrder(String str, int i10, VectorComponent vectorComponent, VectorComponent vectorComponent2, VectorComponent vectorComponent3) {
        this.yaw = vectorComponent;
        this.pitch = vectorComponent2;
        this.roll = vectorComponent3;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static RotationsOrder valueOf(String str) {
        return (RotationsOrder) Enum.valueOf(RotationsOrder.class, str);
    }

    public static RotationsOrder[] values() {
        return (RotationsOrder[]) $VALUES.clone();
    }

    public final VectorComponent getPitch() {
        return this.pitch;
    }

    public final VectorComponent getRoll() {
        return this.roll;
    }

    public final VectorComponent getYaw() {
        return this.yaw;
    }
}
