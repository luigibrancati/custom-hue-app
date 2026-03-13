package com.google.android.filament.utils;

import fc.C4032o;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\bK\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0015J(\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0017J0\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0019J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u001bJ \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u001cJ(\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u001dJ0\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u001aH\u0086\n¢\u0006\u0004\b\u001f\u0010\u001bJ \u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010\"J(\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010#J0\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010$J8\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010%J \u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010&J(\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010'J0\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010(J8\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010+J8\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010+\"\u0004\b;\u0010<R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00109\u001a\u0004\b=\u0010+\"\u0004\b>\u0010<R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00109\u001a\u0004\b?\u0010+\"\u0004\b@\u0010<R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00109\u001a\u0004\bA\u0010+\"\u0004\bB\u0010<R&\u0010F\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010+\"\u0004\bE\u0010<R&\u0010I\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010+\"\u0004\bH\u0010<R&\u0010L\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010<R&\u0010O\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010+\"\u0004\bN\u0010<R&\u0010R\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010<R&\u0010U\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010+\"\u0004\bT\u0010<R&\u0010X\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010+\"\u0004\bW\u0010<R&\u0010[\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010+\"\u0004\bZ\u0010<R&\u0010`\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R&\u0010c\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R&\u0010f\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010]\"\u0004\be\u0010_R&\u0010k\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR&\u0010n\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR&\u0010q\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010h\"\u0004\bp\u0010jR&\u0010u\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010\u000eR&\u0010x\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010s\"\u0004\bw\u0010\u000eR&\u0010{\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010s\"\u0004\bz\u0010\u000e¨\u0006|"}, d2 = {"Lcom/google/android/filament/utils/Bool4;", "", "", "x", "y", "z", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "<init>", "(ZZZZ)V", "Lcom/google/android/filament/utils/Bool2;", "v", "(Lcom/google/android/filament/utils/Bool2;ZZ)V", "Lcom/google/android/filament/utils/Bool3;", "(Lcom/google/android/filament/utils/Bool3;Z)V", "(Lcom/google/android/filament/utils/Bool4;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get", "(Lcom/google/android/filament/utils/VectorComponent;)Z", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Bool2;", "index3", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Bool3;", "index4", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Bool4;", "", "(I)Z", "(II)Lcom/google/android/filament/utils/Bool2;", "(III)Lcom/google/android/filament/utils/Bool3;", "(IIII)Lcom/google/android/filament/utils/Bool4;", "invoke", "Lfc/H;", "set", "(IZ)V", "(IIZ)V", "(IIIZ)V", "(IIIIZ)V", "(Lcom/google/android/filament/utils/VectorComponent;Z)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Z)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Z)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Z)V", "component1", "()Z", "component2", "component3", "component4", "copy", "(ZZZZ)Lcom/google/android/filament/utils/Bool4;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getX", "setX", "(Z)V", "getY", "setY", "getZ", "setZ", "getW", "setW", "value", "getR", "setR", "r", "getG", "setG", "g", "getB", "setB", "b", "getA", "setA", "a", "getS", "setS", "s", "getT", "setT", "t", "getP", "setP", "p", "getQ", "setQ", "q", "getXy", "()Lcom/google/android/filament/utils/Bool2;", "setXy", "(Lcom/google/android/filament/utils/Bool2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "getRgb", "()Lcom/google/android/filament/utils/Bool3;", "setRgb", "(Lcom/google/android/filament/utils/Bool3;)V", "rgb", "getXyz", "setXyz", "xyz", "getStp", "setStp", "stp", "getRgba", "()Lcom/google/android/filament/utils/Bool4;", "setRgba", "rgba", "getXyzw", "setXyzw", "xyzw", "getStpq", "setStpq", "stpq", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Bool4 {
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VectorComponent.values().length];
            try {
                iArr[VectorComponent.f28985X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VectorComponent.f28981R.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VectorComponent.f28982S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VectorComponent.f28986Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VectorComponent.f28978G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VectorComponent.f28983T.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VectorComponent.f28987Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VectorComponent.f28977B.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VectorComponent.f28979P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VectorComponent.f28984W.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VectorComponent.f28976A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VectorComponent.f28980Q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Bool4() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ Bool4 copy$default(Bool4 bool4, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = bool4.x;
        }
        if ((i10 & 2) != 0) {
            z11 = bool4.y;
        }
        if ((i10 & 4) != 0) {
            z12 = bool4.z;
        }
        if ((i10 & 8) != 0) {
            z13 = bool4.w;
        }
        return bool4.copy(z10, z11, z12, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    public final Bool4 copy(boolean x10, boolean y10, boolean z10, boolean w10) {
        return new Bool4(x10, y10, z10, w10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bool4)) {
            return false;
        }
        Bool4 bool4 = (Bool4) other;
        return this.x == bool4.x && this.y == bool4.y && this.z == bool4.z && this.w == bool4.w;
    }

    public final boolean get(VectorComponent index) {
        AbstractC4862t.e(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.x;
            case 4:
            case 5:
            case 6:
                return this.y;
            case 7:
            case 8:
            case 9:
                return this.z;
            case 10:
            case 11:
            case 12:
                return this.w;
            default:
                throw new C4032o();
        }
    }

    public final boolean getA() {
        return getW();
    }

    public final boolean getB() {
        return getZ();
    }

    public final boolean getG() {
        return getY();
    }

    public final boolean getP() {
        return getZ();
    }

    public final boolean getQ() {
        return getW();
    }

    public final boolean getR() {
        return getX();
    }

    public final Bool2 getRg() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getRgb() {
        return new Bool3(getX(), getY(), getZ());
    }

    public final Bool4 getRgba() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getS() {
        return getX();
    }

    public final Bool2 getSt() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getStp() {
        return new Bool3(getX(), getY(), getZ());
    }

    public final Bool4 getStpq() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getT() {
        return getY();
    }

    public final boolean getW() {
        return this.w;
    }

    public final boolean getX() {
        return this.x;
    }

    public final Bool2 getXy() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getXyz() {
        return new Bool3(getX(), getY(), getZ());
    }

    public final Bool4 getXyzw() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getY() {
        return this.y;
    }

    public final boolean getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.x) * 31) + Boolean.hashCode(this.y)) * 31) + Boolean.hashCode(this.z)) * 31) + Boolean.hashCode(this.w);
    }

    public final boolean invoke(int index) {
        return get(index - 1);
    }

    public final void set(int index, boolean v10) {
        if (index == 0) {
            this.x = v10;
            return;
        }
        if (index == 1) {
            this.y = v10;
        } else if (index == 2) {
            this.z = v10;
        } else {
            if (index != 3) {
                throw new IllegalArgumentException("index must be in 0..3");
            }
            this.w = v10;
        }
    }

    public final void setA(boolean z10) {
        setW(z10);
    }

    public final void setB(boolean z10) {
        setZ(z10);
    }

    public final void setG(boolean z10) {
        setY(z10);
    }

    public final void setP(boolean z10) {
        setZ(z10);
    }

    public final void setQ(boolean z10) {
        setW(z10);
    }

    public final void setR(boolean z10) {
        setX(z10);
    }

    public final void setRg(Bool2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setRgb(Bool3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setRgba(Bool4 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setS(boolean z10) {
        setX(z10);
    }

    public final void setSt(Bool2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setStp(Bool3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setStpq(Bool4 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setT(boolean z10) {
        setY(z10);
    }

    public final void setW(boolean z10) {
        this.w = z10;
    }

    public final void setX(boolean z10) {
        this.x = z10;
    }

    public final void setXy(Bool2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setXyz(Bool3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setXyzw(Bool4 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setY(boolean z10) {
        this.y = z10;
    }

    public final void setZ(boolean z10) {
        this.z = z10;
    }

    public String toString() {
        return "Bool4(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ")";
    }

    public Bool4(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.x = z10;
        this.y = z11;
        this.z = z12;
        this.w = z13;
    }

    public final Bool2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Bool2(get(index1), get(index2));
    }

    public final void set(int index1, int index2, boolean v10) {
        set(index1, v10);
        set(index2, v10);
    }

    public /* synthetic */ Bool4(boolean z10, boolean z11, boolean z12, boolean z13, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13);
    }

    public final Bool3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        return new Bool3(get(index1), get(index2), get(index3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(Bool2 v10, boolean z10, boolean z11) {
        this(v10.getX(), v10.getY(), z10, z11);
        AbstractC4862t.e(v10, "v");
    }

    public final Bool4 get(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        AbstractC4862t.e(index4, "index4");
        return new Bool4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(int index1, int index2, int index3, boolean v10) {
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
    }

    public /* synthetic */ Bool4(Bool2 bool2, boolean z10, boolean z11, int i10, AbstractC4854k abstractC4854k) {
        this(bool2, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }

    public final boolean get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        if (index == 2) {
            return this.z;
        }
        if (index == 3) {
            return this.w;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(Bool3 v10, boolean z10) {
        this(v10.getX(), v10.getY(), v10.getZ(), z10);
        AbstractC4862t.e(v10, "v");
    }

    public /* synthetic */ Bool4(Bool3 bool3, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(bool3, (i10 & 2) != 0 ? false : z10);
    }

    public final void set(int index1, int index2, int index3, int index4, boolean v10) {
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
        set(index4, v10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(Bool4 v10) {
        this(v10.x, v10.y, v10.z, v10.w);
        AbstractC4862t.e(v10, "v");
    }

    public final Bool2 get(int index1, int index2) {
        return new Bool2(get(index1), get(index2));
    }

    public final Bool3 get(int index1, int index2, int index3) {
        return new Bool3(get(index1), get(index2), get(index3));
    }

    public final void set(VectorComponent index, boolean v10) {
        AbstractC4862t.e(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.x = v10;
                return;
            case 4:
            case 5:
            case 6:
                this.y = v10;
                return;
            case 7:
            case 8:
            case 9:
                this.z = v10;
                return;
            case 10:
            case 11:
            case 12:
                this.w = v10;
                return;
            default:
                throw new C4032o();
        }
    }

    public final Bool4 get(int index1, int index2, int index3, int index4) {
        return new Bool4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(VectorComponent index1, VectorComponent index2, boolean v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        set(index1, v10);
        set(index2, v10);
    }

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, boolean v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
    }

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4, boolean v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        AbstractC4862t.e(index4, "index4");
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
        set(index4, v10);
    }
}
