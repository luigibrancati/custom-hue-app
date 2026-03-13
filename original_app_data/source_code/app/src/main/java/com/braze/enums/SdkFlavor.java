package com.braze.enums;

import com.braze.models.IPutIntoJson;
import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/braze/enums/SdkFlavor;", "Lcom/braze/models/IPutIntoJson;", "", "", "jsonKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UNITY", "REACT", "CORDOVA", "XAMARIN", "FLUTTER", "SEGMENT", "TEALIUM", "MPARTICLE", "forJsonPut", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SdkFlavor implements IPutIntoJson<String> {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ SdkFlavor[] $VALUES;
    private final String jsonKey;
    public static final SdkFlavor UNITY = new SdkFlavor("UNITY", 0, "unity");
    public static final SdkFlavor REACT = new SdkFlavor("REACT", 1, "react");
    public static final SdkFlavor CORDOVA = new SdkFlavor("CORDOVA", 2, "cordova");
    public static final SdkFlavor XAMARIN = new SdkFlavor("XAMARIN", 3, "xamarin");
    public static final SdkFlavor FLUTTER = new SdkFlavor("FLUTTER", 4, "flutter");
    public static final SdkFlavor SEGMENT = new SdkFlavor("SEGMENT", 5, "segment");
    public static final SdkFlavor TEALIUM = new SdkFlavor("TEALIUM", 6, "tealium");
    public static final SdkFlavor MPARTICLE = new SdkFlavor("MPARTICLE", 7, "mparticle");

    private static final /* synthetic */ SdkFlavor[] $values() {
        return new SdkFlavor[]{UNITY, REACT, CORDOVA, XAMARIN, FLUTTER, SEGMENT, TEALIUM, MPARTICLE};
    }

    static {
        SdkFlavor[] sdkFlavorArr$values = $values();
        $VALUES = sdkFlavorArr$values;
        $ENTRIES = AbstractC5277b.a(sdkFlavorArr$values);
    }

    private SdkFlavor(String str, int i10, String str2) {
        this.jsonKey = str2;
    }

    public static SdkFlavor valueOf(String str) {
        return (SdkFlavor) Enum.valueOf(SdkFlavor.class, str);
    }

    public static SdkFlavor[] values() {
        return (SdkFlavor[]) $VALUES.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public String getJsonKey() {
        return this.jsonKey;
    }
}
