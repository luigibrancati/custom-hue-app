package com.google.android.filament.utils;

import fc.C4032o;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u0000 n2\u00020\u0001:\u0001nB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0017J0\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0019J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001bJ(\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001cJ0\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001aH\u0086\n¢\u0006\u0004\b\u001e\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b \u0010!J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b \u0010\"J0\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b \u0010#J8\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b \u0010$J \u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b \u0010%J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b \u0010&J0\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b \u0010'J8\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b \u0010(J\u0010\u0010)\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b-\u0010,J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b.\u0010,J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b/\u0010,J\"\u00101\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b1\u00102J\"\u00104\u001a\u0002032\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b4\u00105J\u0018\u0010.\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086\n¢\u0006\u0004\b.\u00106J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b+\u00107J\u0018\u0010-\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b-\u00107J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b.\u00107J\"\u00101\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f2\b\b\u0002\u00100\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b1\u00108J\"\u00104\u001a\u0002032\u0006\u0010\n\u001a\u00020\f2\b\b\u0002\u00100\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b4\u00109J'\u0010<\u001a\u00020\u00002\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020:H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\t¢\u0006\u0004\b>\u0010?J\r\u0010A\u001a\u00020@¢\u0006\u0004\bA\u0010BJ\r\u0010D\u001a\u00020C¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010GJ\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010GJ8\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010N\u001a\u00020MHÖ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u00104\u001a\u00020S2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u0010TR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010G\"\u0004\bW\u0010XR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010U\u001a\u0004\bY\u0010G\"\u0004\bZ\u0010XR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010U\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010XR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010U\u001a\u0004\b]\u0010G\"\u0004\b^\u0010XR&\u0010c\u001a\u00020\t2\u0006\u0010_\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010?\"\u0004\ba\u0010bR&\u0010f\u001a\u00020\t2\u0006\u0010_\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010?\"\u0004\be\u0010bR&\u0010i\u001a\u00020\u00022\u0006\u0010_\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010G\"\u0004\bh\u0010XR&\u0010m\u001a\u00020\f2\u0006\u0010_\u001a\u00020\f8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006o"}, d2 = {"Lcom/google/android/filament/utils/Quaternion;", "", "", "x", "y", "z", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "<init>", "(FFFF)V", "Lcom/google/android/filament/utils/Float3;", "v", "(Lcom/google/android/filament/utils/Float3;F)V", "Lcom/google/android/filament/utils/Float4;", "(Lcom/google/android/filament/utils/Float4;)V", "q", "(Lcom/google/android/filament/utils/Quaternion;)V", "Lcom/google/android/filament/utils/QuaternionComponent;", "index", "get", "(Lcom/google/android/filament/utils/QuaternionComponent;)F", "index1", "index2", "index3", "(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;)Lcom/google/android/filament/utils/Float3;", "index4", "(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;)Lcom/google/android/filament/utils/Quaternion;", "", "(I)F", "(III)Lcom/google/android/filament/utils/Float3;", "(IIII)Lcom/google/android/filament/utils/Quaternion;", "invoke", "Lfc/H;", "set", "(IF)V", "(IIF)V", "(IIIF)V", "(IIIIF)V", "(Lcom/google/android/filament/utils/QuaternionComponent;F)V", "(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;F)V", "(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;F)V", "(Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;Lcom/google/android/filament/utils/QuaternionComponent;F)V", "unaryMinus", "()Lcom/google/android/filament/utils/Quaternion;", IPTC.PREFIX_PLUS, "(F)Lcom/google/android/filament/utils/Quaternion;", "minus", "times", "div", "delta", "compareTo", "(FF)Lcom/google/android/filament/utils/Float4;", "Lcom/google/android/filament/utils/Bool4;", "equals", "(FF)Lcom/google/android/filament/utils/Bool4;", "(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float3;", "(Lcom/google/android/filament/utils/Quaternion;)Lcom/google/android/filament/utils/Quaternion;", "(Lcom/google/android/filament/utils/Float4;F)Lcom/google/android/filament/utils/Float4;", "(Lcom/google/android/filament/utils/Float4;F)Lcom/google/android/filament/utils/Bool4;", "Lkotlin/Function1;", "block", "transform", "(Lvc/l;)Lcom/google/android/filament/utils/Quaternion;", "toEulerAngles", "()Lcom/google/android/filament/utils/Float3;", "Lcom/google/android/filament/utils/Mat4;", "toMatrix", "()Lcom/google/android/filament/utils/Mat4;", "", "toFloatArray", "()[F", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lcom/google/android/filament/utils/Quaternion;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "(Ljava/lang/Object;)Z", "F", "getX", "setX", "(F)V", "getY", "setY", "getZ", "setZ", "getW", "setW", "value", "getXyz", "setXyz", "(Lcom/google/android/filament/utils/Float3;)V", "xyz", "getImaginary", "setImaginary", "imaginary", "getReal", "setReal", "real", "getXyzw", "()Lcom/google/android/filament/utils/Float4;", "setXyzw", "xyzw", "Companion", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Quaternion {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private float w;
    private float x;
    private float y;
    private float z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rJ.\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u0011"}, d2 = {"Lcom/google/android/filament/utils/Quaternion$Companion;", "", "<init>", "()V", "fromAxisAngle", "Lcom/google/android/filament/utils/Quaternion;", "axis", "Lcom/google/android/filament/utils/Float3;", "angle", "", "fromEuler", "d", "order", "Lcom/google/android/filament/utils/RotationsOrder;", "yaw", "pitch", "roll", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RotationsOrder.values().length];
                try {
                    iArr[RotationsOrder.XZY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RotationsOrder.XYZ.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RotationsOrder.YXZ.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RotationsOrder.YZX.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[RotationsOrder.ZYX.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[RotationsOrder.ZXY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ Quaternion fromEuler$default(Companion companion, Float3 float3, RotationsOrder rotationsOrder, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                rotationsOrder = RotationsOrder.ZYX;
            }
            return companion.fromEuler(float3, rotationsOrder);
        }

        public final Quaternion fromAxisAngle(Float3 axis, float angle) {
            AbstractC4862t.e(axis, "axis");
            double d10 = angle * 0.017453292f * 0.5f;
            float fSin = (float) Math.sin(d10);
            Float3 float3Normalize = VectorKt.normalize(axis);
            return new Quaternion(new Float3(float3Normalize.getX() * fSin, float3Normalize.getY() * fSin, fSin * float3Normalize.getZ()), (float) Math.cos(d10));
        }

        public final Quaternion fromEuler(float yaw, float pitch, float roll, RotationsOrder order) {
            AbstractC4862t.e(order, "order");
            double d10 = yaw * 0.5f;
            float fCos = (float) Math.cos(d10);
            float fSin = (float) Math.sin(d10);
            double d11 = pitch * 0.5f;
            float fCos2 = (float) Math.cos(d11);
            float fSin2 = (float) Math.sin(d11);
            double d12 = roll * 0.5f;
            float fCos3 = (float) Math.cos(d12);
            float fSin3 = (float) Math.sin(d12);
            switch (WhenMappings.$EnumSwitchMapping$0[order.ordinal()]) {
                case 1:
                    float f10 = fSin * fCos2;
                    float f11 = fCos * fSin2;
                    float f12 = fCos * fCos2;
                    float f13 = fSin * fSin2;
                    return new Quaternion((f10 * fCos3) - (f11 * fSin3), (f12 * fSin3) - (f13 * fCos3), (f10 * fSin3) + (f11 * fCos3), (f13 * fSin3) + (f12 * fCos3));
                case 2:
                    float f14 = (fSin * fCos2 * fCos3) + (fSin2 * fSin3 * fCos);
                    float f15 = ((fSin2 * fCos) * fCos3) - ((fSin * fSin3) * fCos2);
                    float f16 = fSin * fSin2;
                    return new Quaternion(f14, f15, (f16 * fCos3) + (fSin3 * fCos * fCos2), ((fCos * fCos2) * fCos3) - (f16 * fSin3));
                case 3:
                    float f17 = fSin * fCos2;
                    float f18 = fCos * fSin2;
                    float f19 = fCos * fCos2;
                    float f20 = fSin * fSin2;
                    return new Quaternion((f17 * fSin3) + (f18 * fCos3), (f17 * fCos3) - (f18 * fSin3), (f19 * fSin3) - (f20 * fCos3), (f20 * fSin3) + (f19 * fCos3));
                case 4:
                    float f21 = fSin * fSin2;
                    float f22 = fCos * fCos2;
                    float f23 = fSin * fCos2;
                    float f24 = fCos * fSin2;
                    return new Quaternion((f21 * fCos3) + (f22 * fSin3), (f23 * fCos3) + (f24 * fSin3), (f24 * fCos3) - (f23 * fSin3), (f22 * fCos3) - (f21 * fSin3));
                case 5:
                    float f25 = fCos * fCos2;
                    float f26 = fSin * fSin2;
                    float f27 = fSin * fCos2;
                    float f28 = fCos * fSin2;
                    return new Quaternion((f25 * fSin3) - (f26 * fCos3), (f27 * fSin3) + (f28 * fCos3), (f27 * fCos3) - (f28 * fSin3), (f26 * fSin3) + (f25 * fCos3));
                case 6:
                    float f29 = fCos * fSin2;
                    float f30 = fSin * fCos2;
                    float f31 = fSin * fSin2;
                    float f32 = fCos * fCos2;
                    return new Quaternion((f29 * fCos3) - (f30 * fSin3), (f31 * fCos3) + (f32 * fSin3), (f30 * fCos3) + (f29 * fSin3), (f32 * fCos3) - (f31 * fSin3));
                default:
                    throw new C4032o();
            }
        }

        private Companion() {
        }

        public static /* synthetic */ Quaternion fromEuler$default(Companion companion, float f10, float f11, float f12, RotationsOrder rotationsOrder, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i10 & 4) != 0) {
                f12 = 0.0f;
            }
            if ((i10 & 8) != 0) {
                rotationsOrder = RotationsOrder.ZYX;
            }
            return companion.fromEuler(f10, f11, f12, rotationsOrder);
        }

        public final Quaternion fromEuler(Float3 d10, RotationsOrder order) {
            AbstractC4862t.e(d10, "d");
            AbstractC4862t.e(order, "order");
            Float3 float3Copy$default = Float3.copy$default(d10, 0.0f, 0.0f, 0.0f, 7, null);
            float3Copy$default.setX(float3Copy$default.getX() * 0.017453292f);
            float3Copy$default.setY(float3Copy$default.getY() * 0.017453292f);
            float3Copy$default.setZ(float3Copy$default.getZ() * 0.017453292f);
            return fromEuler(float3Copy$default.get(order.getYaw()), float3Copy$default.get(order.getPitch()), float3Copy$default.get(order.getRoll()), order);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuaternionComponent.values().length];
            try {
                iArr[QuaternionComponent.f28973X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuaternionComponent.f28974Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuaternionComponent.f28975Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuaternionComponent.f28972W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Quaternion() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ Float4 compareTo$default(Quaternion quaternion, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new Float4(Math.abs(quaternion.getX() - f10) < f11 ? 0.0f : Float.compare(r0, f10), Math.abs(quaternion.getY() - f10) < f11 ? 0.0f : Float.compare(r1, f10), Math.abs(quaternion.getZ() - f10) < f11 ? 0.0f : Float.compare(r2, f10), Math.abs(quaternion.getW() - f10) >= f11 ? Float.compare(r4, f10) : 0.0f);
    }

    public static /* synthetic */ Quaternion copy$default(Quaternion quaternion, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = quaternion.x;
        }
        if ((i10 & 2) != 0) {
            f11 = quaternion.y;
        }
        if ((i10 & 4) != 0) {
            f12 = quaternion.z;
        }
        if ((i10 & 8) != 0) {
            f13 = quaternion.w;
        }
        return quaternion.copy(f10, f11, f12, f13);
    }

    public static /* synthetic */ Bool4 equals$default(Quaternion quaternion, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new Bool4(Math.abs(quaternion.getX() - f10) < f11, Math.abs(quaternion.getY() - f10) < f11, Math.abs(quaternion.getZ() - f10) < f11, Math.abs(quaternion.getW() - f10) < f11);
    }

    public final Float4 compareTo(float v10, float delta) {
        return new Float4(Math.abs(getX() - v10) < delta ? 0.0f : Float.compare(r1, v10), Math.abs(getY() - v10) < delta ? 0.0f : Float.compare(r2, v10), Math.abs(getZ() - v10) < delta ? 0.0f : Float.compare(r4, v10), Math.abs(getW() - v10) >= delta ? Float.compare(r6, v10) : 0.0f);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getW() {
        return this.w;
    }

    public final Quaternion copy(float x10, float y10, float z10, float w10) {
        return new Quaternion(x10, y10, z10, w10);
    }

    public final Quaternion div(float v10) {
        return new Quaternion(getX() / v10, getY() / v10, getZ() / v10, getW() / v10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) other;
        return Float.compare(this.x, quaternion.x) == 0 && Float.compare(this.y, quaternion.y) == 0 && Float.compare(this.z, quaternion.z) == 0 && Float.compare(this.w, quaternion.w) == 0;
    }

    public final float get(QuaternionComponent index) {
        AbstractC4862t.e(index, "index");
        int i10 = WhenMappings.$EnumSwitchMapping$0[index.ordinal()];
        if (i10 == 1) {
            return this.x;
        }
        if (i10 == 2) {
            return this.y;
        }
        if (i10 == 3) {
            return this.z;
        }
        if (i10 == 4) {
            return this.w;
        }
        throw new C4032o();
    }

    public final Float3 getImaginary() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getReal() {
        return getW();
    }

    public final float getW() {
        return this.w;
    }

    public final float getX() {
        return this.x;
    }

    public final Float3 getXyz() {
        return new Float3(getX(), getY(), getZ());
    }

    public final Float4 getXyzw() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z)) * 31) + Float.hashCode(this.w);
    }

    public final float invoke(int index) {
        return get(index - 1);
    }

    public final Quaternion minus(float v10) {
        return new Quaternion(getX() - v10, getY() - v10, getZ() - v10, getW() - v10);
    }

    public final Quaternion plus(float v10) {
        return new Quaternion(getX() + v10, getY() + v10, getZ() + v10, getW() + v10);
    }

    public final void set(int index, float v10) {
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

    public final void setImaginary(Float3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setReal(float f10) {
        setW(f10);
    }

    public final void setW(float f10) {
        this.w = f10;
    }

    public final void setX(float f10) {
        this.x = f10;
    }

    public final void setXyz(Float3 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setXyzw(Float4 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setY(float f10) {
        this.y = f10;
    }

    public final void setZ(float f10) {
        this.z = f10;
    }

    public final Quaternion times(float v10) {
        return new Quaternion(getX() * v10, getY() * v10, getZ() * v10, getW() * v10);
    }

    public final Float3 toEulerAngles() {
        return QuaternionKt.eulerAngles$default(this, null, 2, null);
    }

    public final float[] toFloatArray() {
        return new float[]{this.x, this.y, this.z, this.w};
    }

    public final Mat4 toMatrix() {
        return MatrixKt.rotation(this);
    }

    public String toString() {
        return "Quaternion(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ")";
    }

    public final Quaternion transform(l block) {
        AbstractC4862t.e(block, "block");
        setX(((Number) block.invoke(Float.valueOf(getX()))).floatValue());
        setY(((Number) block.invoke(Float.valueOf(getY()))).floatValue());
        setZ(((Number) block.invoke(Float.valueOf(getZ()))).floatValue());
        setW(((Number) block.invoke(Float.valueOf(getW()))).floatValue());
        return this;
    }

    public final Quaternion unaryMinus() {
        return new Quaternion(-this.x, -this.y, -this.z, -this.w);
    }

    public Quaternion(float f10, float f11, float f12, float f13) {
        this.x = f10;
        this.y = f11;
        this.z = f12;
        this.w = f13;
    }

    public final Bool4 equals(float v10, float delta) {
        return new Bool4(Math.abs(getX() - v10) < delta, Math.abs(getY() - v10) < delta, Math.abs(getZ() - v10) < delta, Math.abs(getW() - v10) < delta);
    }

    public final Quaternion minus(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion(getX() - q10.getX(), getY() - q10.getY(), getZ() - q10.getZ(), getW() - q10.getW());
    }

    public final Quaternion plus(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion(getX() + q10.getX(), getY() + q10.getY(), getZ() + q10.getZ(), getW() + q10.getW());
    }

    public final Float3 times(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        Quaternion quaternion = new Quaternion(v10, 0.0f);
        Quaternion quaternion2 = new Quaternion((((getW() * quaternion.getX()) + (getX() * quaternion.getW())) + (getY() * quaternion.getZ())) - (getZ() * quaternion.getY()), ((getW() * quaternion.getY()) - (getX() * quaternion.getZ())) + (getY() * quaternion.getW()) + (getZ() * quaternion.getX()), (((getW() * quaternion.getZ()) + (getX() * quaternion.getY())) - (getY() * quaternion.getX())) + (getZ() * quaternion.getW()), (((getW() * quaternion.getW()) - (getX() * quaternion.getX())) - (getY() * quaternion.getY())) - (getZ() * quaternion.getZ()));
        Quaternion quaternionInverse = QuaternionKt.inverse(this);
        Quaternion quaternion3 = new Quaternion((((quaternion2.getW() * quaternionInverse.getX()) + (quaternion2.getX() * quaternionInverse.getW())) + (quaternion2.getY() * quaternionInverse.getZ())) - (quaternion2.getZ() * quaternionInverse.getY()), ((quaternion2.getW() * quaternionInverse.getY()) - (quaternion2.getX() * quaternionInverse.getZ())) + (quaternion2.getY() * quaternionInverse.getW()) + (quaternion2.getZ() * quaternionInverse.getX()), (((quaternion2.getW() * quaternionInverse.getZ()) + (quaternion2.getX() * quaternionInverse.getY())) - (quaternion2.getY() * quaternionInverse.getX())) + (quaternion2.getZ() * quaternionInverse.getW()), (((quaternion2.getW() * quaternionInverse.getW()) - (quaternion2.getX() * quaternionInverse.getX())) - (quaternion2.getY() * quaternionInverse.getY())) - (quaternion2.getZ() * quaternionInverse.getZ()));
        return new Float3(quaternion3.getX(), quaternion3.getY(), quaternion3.getZ());
    }

    public final void set(int index1, int index2, float v10) {
        set(index1, v10);
        set(index2, v10);
    }

    public /* synthetic */ Quaternion(float f10, float f11, float f12, float f13, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 1.0f : f13);
    }

    public final Float3 get(QuaternionComponent index1, QuaternionComponent index2, QuaternionComponent index3) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        return new Float3(get(index1), get(index2), get(index3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(Float3 v10, float f10) {
        this(v10.getX(), v10.getY(), v10.getZ(), f10);
        AbstractC4862t.e(v10, "v");
    }

    public final Quaternion get(QuaternionComponent index1, QuaternionComponent index2, QuaternionComponent index3, QuaternionComponent index4) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        AbstractC4862t.e(index4, "index4");
        return new Quaternion(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(int index1, int index2, int index3, float v10) {
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
    }

    public /* synthetic */ Quaternion(Float3 float3, float f10, int i10, AbstractC4854k abstractC4854k) {
        this(float3, (i10 & 2) != 0 ? 1.0f : f10);
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
        if (index == 3) {
            return this.w;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(Float4 v10) {
        this(v10.getX(), v10.getY(), v10.getZ(), v10.getW());
        AbstractC4862t.e(v10, "v");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(Quaternion q10) {
        this(q10.x, q10.y, q10.z, q10.w);
        AbstractC4862t.e(q10, "q");
    }

    public static /* synthetic */ Bool4 equals$default(Quaternion quaternion, Float4 v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(v10, "v");
        return new Bool4(Math.abs(quaternion.getX() - v10.getX()) < f10, Math.abs(quaternion.getY() - v10.getY()) < f10, Math.abs(quaternion.getZ() - v10.getZ()) < f10, Math.abs(quaternion.getW() - v10.getW()) < f10);
    }

    public final void set(int index1, int index2, int index3, int index4, float v10) {
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
        set(index4, v10);
    }

    public final Bool4 equals(Float4 v10, float delta) {
        AbstractC4862t.e(v10, "v");
        return new Bool4(Math.abs(getX() - v10.getX()) < delta, Math.abs(getY() - v10.getY()) < delta, Math.abs(getZ() - v10.getZ()) < delta, Math.abs(getW() - v10.getW()) < delta);
    }

    public final Float3 get(int index1, int index2, int index3) {
        return new Float3(get(index1), get(index2), get(index3));
    }

    public static /* synthetic */ Float4 compareTo$default(Quaternion quaternion, Float4 v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(v10, "v");
        return new Float4(Math.abs(quaternion.getX() - v10.getX()) < f10 ? 0.0f : Float.compare(r0, r1), Math.abs(quaternion.getY() - v10.getY()) < f10 ? 0.0f : Float.compare(r1, r2), Math.abs(quaternion.getZ() - v10.getZ()) < f10 ? 0.0f : Float.compare(r2, r3), Math.abs(quaternion.getW() - v10.getW()) >= f10 ? Float.compare(r5, r6) : 0.0f);
    }

    public final Float4 compareTo(Float4 v10, float delta) {
        AbstractC4862t.e(v10, "v");
        return new Float4(Math.abs(getX() - v10.getX()) < delta ? 0.0f : Float.compare(r1, r2), Math.abs(getY() - v10.getY()) < delta ? 0.0f : Float.compare(r2, r3), Math.abs(getZ() - v10.getZ()) < delta ? 0.0f : Float.compare(r3, r5), Math.abs(getW() - v10.getW()) >= delta ? Float.compare(r7, r8) : 0.0f);
    }

    public final Quaternion get(int index1, int index2, int index3, int index4) {
        return new Quaternion(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(QuaternionComponent index, float v10) {
        AbstractC4862t.e(index, "index");
        int i10 = WhenMappings.$EnumSwitchMapping$0[index.ordinal()];
        if (i10 == 1) {
            this.x = v10;
            return;
        }
        if (i10 == 2) {
            this.y = v10;
        } else if (i10 == 3) {
            this.z = v10;
        } else {
            if (i10 == 4) {
                this.w = v10;
                return;
            }
            throw new C4032o();
        }
    }

    public final Quaternion times(Quaternion q10) {
        AbstractC4862t.e(q10, "q");
        return new Quaternion((((getW() * q10.getX()) + (getX() * q10.getW())) + (getY() * q10.getZ())) - (getZ() * q10.getY()), ((getW() * q10.getY()) - (getX() * q10.getZ())) + (getY() * q10.getW()) + (getZ() * q10.getX()), (((getW() * q10.getZ()) + (getX() * q10.getY())) - (getY() * q10.getX())) + (getZ() * q10.getW()), (((getW() * q10.getW()) - (getX() * q10.getX())) - (getY() * q10.getY())) - (getZ() * q10.getZ()));
    }

    public final void set(QuaternionComponent index1, QuaternionComponent index2, float v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        set(index1, v10);
        set(index2, v10);
    }

    public final void set(QuaternionComponent index1, QuaternionComponent index2, QuaternionComponent index3, float v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
    }

    public final void set(QuaternionComponent index1, QuaternionComponent index2, QuaternionComponent index3, QuaternionComponent index4, float v10) {
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
