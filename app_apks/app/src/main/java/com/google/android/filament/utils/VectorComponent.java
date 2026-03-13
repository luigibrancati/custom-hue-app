package com.google.android.filament.utils;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/android/filament/utils/VectorComponent;", "", "<init>", "(Ljava/lang/String;I)V", "X", "Y", "Z", "W", "R", "G", "B", "A", "S", "T", "P", "Q", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VectorComponent {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ VectorComponent[] $VALUES;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final VectorComponent f28985X = new VectorComponent("X", 0);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final VectorComponent f28986Y = new VectorComponent("Y", 1);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final VectorComponent f28987Z = new VectorComponent("Z", 2);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final VectorComponent f28984W = new VectorComponent("W", 3);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final VectorComponent f28981R = new VectorComponent("R", 4);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final VectorComponent f28978G = new VectorComponent("G", 5);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final VectorComponent f28977B = new VectorComponent("B", 6);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final VectorComponent f28976A = new VectorComponent("A", 7);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final VectorComponent f28982S = new VectorComponent("S", 8);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final VectorComponent f28983T = new VectorComponent("T", 9);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final VectorComponent f28979P = new VectorComponent("P", 10);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final VectorComponent f28980Q = new VectorComponent("Q", 11);

    private static final /* synthetic */ VectorComponent[] $values() {
        return new VectorComponent[]{f28985X, f28986Y, f28987Z, f28984W, f28981R, f28978G, f28977B, f28976A, f28982S, f28983T, f28979P, f28980Q};
    }

    static {
        VectorComponent[] vectorComponentArr$values = $values();
        $VALUES = vectorComponentArr$values;
        $ENTRIES = AbstractC5277b.a(vectorComponentArr$values);
    }

    private VectorComponent(String str, int i10) {
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static VectorComponent valueOf(String str) {
        return (VectorComponent) Enum.valueOf(VectorComponent.class, str);
    }

    public static VectorComponent[] values() {
        return (VectorComponent[]) $VALUES.clone();
    }
}
