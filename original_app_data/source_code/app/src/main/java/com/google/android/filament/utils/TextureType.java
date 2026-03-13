package com.google.android.filament.utils;

import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/filament/utils/TextureType;", "", "<init>", "(Ljava/lang/String;I)V", "COLOR", "NORMAL", "DATA", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextureType {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ TextureType[] $VALUES;
    public static final TextureType COLOR = new TextureType("COLOR", 0);
    public static final TextureType NORMAL = new TextureType("NORMAL", 1);
    public static final TextureType DATA = new TextureType("DATA", 2);

    private static final /* synthetic */ TextureType[] $values() {
        return new TextureType[]{COLOR, NORMAL, DATA};
    }

    static {
        TextureType[] textureTypeArr$values = $values();
        $VALUES = textureTypeArr$values;
        $ENTRIES = AbstractC5277b.a(textureTypeArr$values);
    }

    private TextureType(String str, int i10) {
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static TextureType valueOf(String str) {
        return (TextureType) Enum.valueOf(TextureType.class, str);
    }

    public static TextureType[] values() {
        return (TextureType[]) $VALUES.clone();
    }
}
