package com.braze.enums;

import com.braze.models.IPutIntoJson;
import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0010\n\u0002\b+\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/braze/enums/BrazeSdkMetadata;", "Lcom/braze/models/IPutIntoJson;", "", "", "jsonKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "forJsonPut", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "com/braze/enums/a", "ADJUST", "AIRBRIDGE", "APPSFLYER", "BLUEDOT", "BRANCH", "CORDOVA", "EXPO", "FACTUAL", "FOURSQUARE", "FLUTTER", "GRADLE", "GOOGLE", "GIMBAL", "IONIC", "KOCHAVA", "MANUAL", "MPARTICLE", "NPM", "NATIVESCRIPT", "NUGET", "PUB", "RADAR", "REACTNATIVE", "REACTNATIVENEWARCH", "SEGMENT", "SINGULAR", "SPM", "TEALIUM", "UNREAL", "UNITY_PACKAGE_MANAGER", "UNITY", "VIZBEE", "WEBCDN", "XAMARIN", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeSdkMetadata implements IPutIntoJson<String> {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ BrazeSdkMetadata[] $VALUES;
    public static final a Companion;
    private final String jsonKey;
    public static final BrazeSdkMetadata ADJUST = new BrazeSdkMetadata("ADJUST", 0, "adj");
    public static final BrazeSdkMetadata AIRBRIDGE = new BrazeSdkMetadata("AIRBRIDGE", 1, "air");
    public static final BrazeSdkMetadata APPSFLYER = new BrazeSdkMetadata("APPSFLYER", 2, "apf");
    public static final BrazeSdkMetadata BLUEDOT = new BrazeSdkMetadata("BLUEDOT", 3, "blt");
    public static final BrazeSdkMetadata BRANCH = new BrazeSdkMetadata("BRANCH", 4, "brc");
    public static final BrazeSdkMetadata CORDOVA = new BrazeSdkMetadata("CORDOVA", 5, "cdva");
    public static final BrazeSdkMetadata EXPO = new BrazeSdkMetadata("EXPO", 6, "expo");
    public static final BrazeSdkMetadata FACTUAL = new BrazeSdkMetadata("FACTUAL", 7, "fct");
    public static final BrazeSdkMetadata FOURSQUARE = new BrazeSdkMetadata("FOURSQUARE", 8, "fsq");
    public static final BrazeSdkMetadata FLUTTER = new BrazeSdkMetadata("FLUTTER", 9, "ft");
    public static final BrazeSdkMetadata GRADLE = new BrazeSdkMetadata("GRADLE", 10, "gd");
    public static final BrazeSdkMetadata GOOGLE = new BrazeSdkMetadata("GOOGLE", 11, "gg");
    public static final BrazeSdkMetadata GIMBAL = new BrazeSdkMetadata("GIMBAL", 12, "gmb");
    public static final BrazeSdkMetadata IONIC = new BrazeSdkMetadata("IONIC", 13, "ionc");
    public static final BrazeSdkMetadata KOCHAVA = new BrazeSdkMetadata("KOCHAVA", 14, "kch");
    public static final BrazeSdkMetadata MANUAL = new BrazeSdkMetadata("MANUAL", 15, "manu");
    public static final BrazeSdkMetadata MPARTICLE = new BrazeSdkMetadata("MPARTICLE", 16, "mp");
    public static final BrazeSdkMetadata NPM = new BrazeSdkMetadata("NPM", 17, "npm");
    public static final BrazeSdkMetadata NATIVESCRIPT = new BrazeSdkMetadata("NATIVESCRIPT", 18, "ns");
    public static final BrazeSdkMetadata NUGET = new BrazeSdkMetadata("NUGET", 19, "nugt");
    public static final BrazeSdkMetadata PUB = new BrazeSdkMetadata("PUB", 20, "pub");
    public static final BrazeSdkMetadata RADAR = new BrazeSdkMetadata("RADAR", 21, "rdr");
    public static final BrazeSdkMetadata REACTNATIVE = new BrazeSdkMetadata("REACTNATIVE", 22, "rn");
    public static final BrazeSdkMetadata REACTNATIVENEWARCH = new BrazeSdkMetadata("REACTNATIVENEWARCH", 23, "rnna");
    public static final BrazeSdkMetadata SEGMENT = new BrazeSdkMetadata("SEGMENT", 24, "sg");
    public static final BrazeSdkMetadata SINGULAR = new BrazeSdkMetadata("SINGULAR", 25, "sng");
    public static final BrazeSdkMetadata SPM = new BrazeSdkMetadata("SPM", 26, "spm");
    public static final BrazeSdkMetadata TEALIUM = new BrazeSdkMetadata("TEALIUM", 27, "tl");
    public static final BrazeSdkMetadata UNREAL = new BrazeSdkMetadata("UNREAL", 28, "un");
    public static final BrazeSdkMetadata UNITY_PACKAGE_MANAGER = new BrazeSdkMetadata("UNITY_PACKAGE_MANAGER", 29, "unpm");
    public static final BrazeSdkMetadata UNITY = new BrazeSdkMetadata("UNITY", 30, "ut");
    public static final BrazeSdkMetadata VIZBEE = new BrazeSdkMetadata("VIZBEE", 31, "vzb");
    public static final BrazeSdkMetadata WEBCDN = new BrazeSdkMetadata("WEBCDN", 32, "wcd");
    public static final BrazeSdkMetadata XAMARIN = new BrazeSdkMetadata("XAMARIN", 33, "xam");

    private static final /* synthetic */ BrazeSdkMetadata[] $values() {
        return new BrazeSdkMetadata[]{ADJUST, AIRBRIDGE, APPSFLYER, BLUEDOT, BRANCH, CORDOVA, EXPO, FACTUAL, FOURSQUARE, FLUTTER, GRADLE, GOOGLE, GIMBAL, IONIC, KOCHAVA, MANUAL, MPARTICLE, NPM, NATIVESCRIPT, NUGET, PUB, RADAR, REACTNATIVE, REACTNATIVENEWARCH, SEGMENT, SINGULAR, SPM, TEALIUM, UNREAL, UNITY_PACKAGE_MANAGER, UNITY, VIZBEE, WEBCDN, XAMARIN};
    }

    static {
        BrazeSdkMetadata[] brazeSdkMetadataArr$values = $values();
        $VALUES = brazeSdkMetadataArr$values;
        $ENTRIES = AbstractC5277b.a(brazeSdkMetadataArr$values);
        Companion = new a();
    }

    private BrazeSdkMetadata(String str, int i10, String str2) {
        this.jsonKey = str2;
    }

    public static BrazeSdkMetadata valueOf(String str) {
        return (BrazeSdkMetadata) Enum.valueOf(BrazeSdkMetadata.class, str);
    }

    public static BrazeSdkMetadata[] values() {
        return (BrazeSdkMetadata[]) $VALUES.clone();
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public String getJsonKey() {
        return this.jsonKey;
    }
}
