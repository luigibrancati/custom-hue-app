package com.google.android.filament.utils;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0013J(\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0017J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0018J(\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0016H\u0086\n¢\u0006\u0004\b\u001a\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ0\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001fJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010 J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010!J0\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\"J\u0010\u0010#\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010$J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b)\u0010(J\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b*\u0010(J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b+\u0010(J\"\u0010-\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b-\u0010.J\"\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b0\u00101J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b'\u00102J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b)\u00102J\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b*\u00102J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b+\u00102J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b'\u00103J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b)\u00103J\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b*\u00103J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b+\u00103J\"\u0010-\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b-\u00104J\"\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b0\u00105J'\u00108\u001a\u00020\u00002\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010>J.\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010D\u001a\u00020CHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u00100\u001a\u00020/2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u0010IR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010>\"\u0004\bL\u0010\tR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010J\u001a\u0004\bM\u0010>\"\u0004\bN\u0010\tR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010J\u001a\u0004\bO\u0010>\"\u0004\bP\u0010\tR&\u0010T\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010>\"\u0004\bS\u0010\tR&\u0010W\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010>\"\u0004\bV\u0010\tR&\u0010Z\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010>\"\u0004\bY\u0010\tR&\u0010]\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010>\"\u0004\b\\\u0010\tR&\u0010`\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010>\"\u0004\b_\u0010\tR&\u0010c\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010>\"\u0004\bb\u0010\tR&\u0010h\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR&\u0010k\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010e\"\u0004\bj\u0010gR&\u0010n\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010e\"\u0004\bm\u0010gR&\u0010q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010$\"\u0004\bp\u0010\fR&\u0010t\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010$\"\u0004\bs\u0010\fR&\u0010w\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010$\"\u0004\bv\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006x"}, d2 = {"Lcom/google/android/filament/utils/Float3;", "", "", "x", "y", "z", "<init>", "(FFF)V", "v", "(F)V", "Lcom/google/android/filament/utils/Float2;", "(Lcom/google/android/filament/utils/Float2;F)V", "(Lcom/google/android/filament/utils/Float3;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get", "(Lcom/google/android/filament/utils/VectorComponent;)F", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float2;", "index3", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float3;", "", "(I)F", "(II)Lcom/google/android/filament/utils/Float2;", "(III)Lcom/google/android/filament/utils/Float3;", "invoke", "Lfc/H;", "set", "(IF)V", "(IIF)V", "(IIIF)V", "(Lcom/google/android/filament/utils/VectorComponent;F)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V", "unaryMinus", "()Lcom/google/android/filament/utils/Float3;", "inc", "dec", IPTC.PREFIX_PLUS, "(F)Lcom/google/android/filament/utils/Float3;", "minus", "times", "div", "delta", "compareTo", "(FF)Lcom/google/android/filament/utils/Float3;", "", "equals", "(FF)Z", "(Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Float3;", "(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float3;", "(Lcom/google/android/filament/utils/Float3;F)Lcom/google/android/filament/utils/Float3;", "(Lcom/google/android/filament/utils/Float3;F)Z", "Lkotlin/Function1;", "block", "transform", "(Lvc/l;)Lcom/google/android/filament/utils/Float3;", "", "toFloatArray", "()[F", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/google/android/filament/utils/Float3;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "(Ljava/lang/Object;)Z", "F", "getX", "setX", "getY", "setY", "getZ", "setZ", "value", "getR", "setR", "r", "getG", "setG", "g", "getB", "setB", "b", "getS", "setS", "s", "getT", "setT", "t", "getP", "setP", "p", "getXy", "()Lcom/google/android/filament/utils/Float2;", "setXy", "(Lcom/google/android/filament/utils/Float2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "getRgb", "setRgb", "rgb", "getXyz", "setXyz", "xyz", "getStp", "setStp", "stp", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Float3 {
    private float x;
    private float y;
    private float z;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Float3() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public static /* synthetic */ Float3 compareTo$default(Float3 float3, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new Float3(Math.abs(float3.getX() - f10) < f11 ? 0.0f : Float.compare(r0, f10), Math.abs(float3.getY() - f10) < f11 ? 0.0f : Float.compare(r1, f10), Math.abs(float3.getZ() - f10) >= f11 ? Float.compare(r3, f10) : 0.0f);
    }

    public static /* synthetic */ Float3 copy$default(Float3 float3, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = float3.x;
        }
        if ((i10 & 2) != 0) {
            f11 = float3.y;
        }
        if ((i10 & 4) != 0) {
            f12 = float3.z;
        }
        return float3.copy(f10, f11, f12);
    }

    public static /* synthetic */ boolean equals$default(Float3 float3, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return Math.abs(float3.getX() - f10) < f11 && Math.abs(float3.getY() - f10) < f11 && Math.abs(float3.getZ() - f10) < f11;
    }

    public final Float3 compareTo(float v10, float delta) {
        return new Float3(Math.abs(getX() - v10) < delta ? 0.0f : Float.compare(r1, v10), Math.abs(getY() - v10) < delta ? 0.0f : Float.compare(r2, v10), Math.abs(getZ() - v10) >= delta ? Float.compare(r5, v10) : 0.0f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    public final Float3 copy(float x10, float y10, float z10) {
        return new Float3(x10, y10, z10);
    }

    public final Float3 dec() {
        float f10 = this.x;
        this.x = f10 - 1.0f;
        float f11 = this.y;
        this.y = f11 - 1.0f;
        float f12 = this.z;
        this.z = (-1.0f) + f12;
        return new Float3(f10, f11, f12);
    }

    public final Float3 div(float v10) {
        return new Float3(getX() / v10, getY() / v10, getZ() / v10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Float3)) {
            return false;
        }
        Float3 float3 = (Float3) other;
        return Float.compare(this.x, float3.x) == 0 && Float.compare(this.y, float3.y) == 0 && Float.compare(this.z, float3.z) == 0;
    }

    public final float get(VectorComponent index) {
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
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final float getB() {
        return getZ();
    }

    public final float getG() {
        return getY();
    }

    public final float getP() {
        return getZ();
    }

    public final float getR() {
        return getX();
    }

    public final Float2 getRg() {
        return new Float2(getX(), getY());
    }

    public final Float3 getRgb() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getS() {
        return getX();
    }

    public final Float2 getSt() {
        return new Float2(getX(), getY());
    }

    public final Float3 getStp() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getT() {
        return getY();
    }

    public final float getX() {
        return this.x;
    }

    public final Float2 getXy() {
        return new Float2(getX(), getY());
    }

    public final Float3 getXyz() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z);
    }

    public final Float3 inc() {
        float f10 = this.x;
        this.x = f10 + 1.0f;
        float f11 = this.y;
        this.y = f11 + 1.0f;
        float f12 = this.z;
        this.z = 1.0f + f12;
        return new Float3(f10, f11, f12);
    }

    public final float invoke(int index) {
        return get(index - 1);
    }

    public final Float3 minus(float v10) {
        return new Float3(getX() - v10, getY() - v10, getZ() - v10);
    }

    public final Float3 plus(float v10) {
        return new Float3(getX() + v10, getY() + v10, getZ() + v10);
    }

    public final void set(int index, float v10) {
        if (index == 0) {
            this.x = v10;
        } else if (index == 1) {
            this.y = v10;
        } else {
            if (index != 2) {
                throw new IllegalArgumentException("index must be in 0..2");
            }
            this.z = v10;
        }
    }

    public final void setB(float f10) {
        setZ(f10);
    }

    public final void setG(float f10) {
        setY(f10);
    }

    public final void setP(float f10) {
        setZ(f10);
    }

    public final void setR(float f10) {
        setX(f10);
    }

    public final void setRg(Float2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setRgb(Float3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setS(float f10) {
        setX(f10);
    }

    public final void setSt(Float2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setStp(Float3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setT(float f10) {
        setY(f10);
    }

    public final void setX(float f10) {
        this.x = f10;
    }

    public final void setXy(Float2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setXyz(Float3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setY(float f10) {
        this.y = f10;
    }

    public final void setZ(float f10) {
        this.z = f10;
    }

    public final Float3 times(float v10) {
        return new Float3(getX() * v10, getY() * v10, getZ() * v10);
    }

    public final float[] toFloatArray() {
        return new float[]{this.x, this.y, this.z};
    }

    public String toString() {
        return "Float3(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
    }

    public final Float3 transform(l block) {
        AbstractC4862t.e(block, "block");
        setX(((Number) block.invoke(Float.valueOf(getX()))).floatValue());
        setY(((Number) block.invoke(Float.valueOf(getY()))).floatValue());
        setZ(((Number) block.invoke(Float.valueOf(getZ()))).floatValue());
        return this;
    }

    public final Float3 unaryMinus() {
        return new Float3(-this.x, -this.y, -this.z);
    }

    public Float3(float f10, float f11, float f12) {
        this.x = f10;
        this.y = f11;
        this.z = f12;
    }

    public final Float3 div(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3(getX() / v10.getX(), getY() / v10.getY(), getZ());
    }

    public final boolean equals(float v10, float delta) {
        return Math.abs(getX() - v10) < delta && Math.abs(getY() - v10) < delta && Math.abs(getZ() - v10) < delta;
    }

    public final Float3 minus(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3(getX() - v10.getX(), getY() - v10.getY(), getZ());
    }

    public final Float3 plus(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3(getX() + v10.getX(), getY() + v10.getY(), getZ());
    }

    public final Float3 times(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3(getX() * v10.getX(), getY() * v10.getY(), getZ());
    }

    public /* synthetic */ Float3(float f10, float f11, float f12, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12);
    }

    public final Float3 div(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3(getX() / v10.getX(), getY() / v10.getY(), getZ() / v10.getZ());
    }

    public final Float3 minus(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3(getX() - v10.getX(), getY() - v10.getY(), getZ() - v10.getZ());
    }

    public final Float3 plus(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3(getX() + v10.getX(), getY() + v10.getY(), getZ() + v10.getZ());
    }

    public final Float3 times(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3(getX() * v10.getX(), getY() * v10.getY(), getZ() * v10.getZ());
    }

    public Float3(float f10) {
        this(f10, f10, f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float3(Float2 v10, float f10) {
        this(v10.getX(), v10.getY(), f10);
        AbstractC4862t.e(v10, "v");
    }

    public final void set(int index1, int index2, float v10) {
        set(index1, v10);
        set(index2, v10);
    }

    public /* synthetic */ Float3(Float2 float2, float f10, int i10, AbstractC4854k abstractC4854k) {
        this(float2, (i10 & 2) != 0 ? 0.0f : f10);
    }

    public final Float2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float3(Float3 v10) {
        this(v10.x, v10.y, v10.z);
        AbstractC4862t.e(v10, "v");
    }

    public static /* synthetic */ boolean equals$default(Float3 float3, Float3 v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(v10, "v");
        return Math.abs(float3.getX() - v10.getX()) < f10 && Math.abs(float3.getY() - v10.getY()) < f10 && Math.abs(float3.getZ() - v10.getZ()) < f10;
    }

    public final Float3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        return new Float3(get(index1), get(index2), get(index3));
    }

    public final void set(int index1, int index2, int index3, float v10) {
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
    }

    public final boolean equals(Float3 v10, float delta) {
        AbstractC4862t.e(v10, "v");
        return Math.abs(getX() - v10.getX()) < delta && Math.abs(getY() - v10.getY()) < delta && Math.abs(getZ() - v10.getZ()) < delta;
    }

    public final float get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        if (index == 2) {
            return this.z;
        }
        throw new IllegalArgumentException("index must be in 0..2");
    }

    public final void set(VectorComponent index, float v10) {
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
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public static /* synthetic */ Float3 compareTo$default(Float3 float3, Float3 v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(v10, "v");
        return new Float3(Math.abs(float3.getX() - v10.getX()) < f10 ? 0.0f : Float.compare(r0, r1), Math.abs(float3.getY() - v10.getY()) < f10 ? 0.0f : Float.compare(r1, r2), Math.abs(float3.getZ() - v10.getZ()) >= f10 ? Float.compare(r4, r5) : 0.0f);
    }

    public final Float3 compareTo(Float3 v10, float delta) {
        AbstractC4862t.e(v10, "v");
        return new Float3(Math.abs(getX() - v10.getX()) < delta ? 0.0f : Float.compare(r1, r2), Math.abs(getY() - v10.getY()) < delta ? 0.0f : Float.compare(r2, r3), Math.abs(getZ() - v10.getZ()) >= delta ? Float.compare(r6, r7) : 0.0f);
    }

    public final Float2 get(int index1, int index2) {
        return new Float2(get(index1), get(index2));
    }

    public final Float3 get(int index1, int index2, int index3) {
        return new Float3(get(index1), get(index2), get(index3));
    }

    public final void set(VectorComponent index1, VectorComponent index2, float v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        set(index1, v10);
        set(index2, v10);
    }

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, float v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
    }
}
