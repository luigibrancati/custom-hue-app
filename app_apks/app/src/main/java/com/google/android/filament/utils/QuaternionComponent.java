package com.google.android.filament.utils;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/filament/utils/QuaternionComponent;", "", "<init>", "(Ljava/lang/String;I)V", "X", "Y", "Z", "W", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuaternionComponent {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ QuaternionComponent[] $VALUES;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final QuaternionComponent f28973X = new QuaternionComponent("X", 0);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final QuaternionComponent f28974Y = new QuaternionComponent("Y", 1);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final QuaternionComponent f28975Z = new QuaternionComponent("Z", 2);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final QuaternionComponent f28972W = new QuaternionComponent("W", 3);

    private static final /* synthetic */ QuaternionComponent[] $values() {
        return new QuaternionComponent[]{f28973X, f28974Y, f28975Z, f28972W};
    }

    static {
        QuaternionComponent[] quaternionComponentArr$values = $values();
        $VALUES = quaternionComponentArr$values;
        $ENTRIES = AbstractC5277b.a(quaternionComponentArr$values);
    }

    private QuaternionComponent(String str, int i10) {
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static QuaternionComponent valueOf(String str) {
        return (QuaternionComponent) Enum.valueOf(QuaternionComponent.class, str);
    }

    public static QuaternionComponent[] values() {
        return (QuaternionComponent[]) $VALUES.clone();
    }
}
