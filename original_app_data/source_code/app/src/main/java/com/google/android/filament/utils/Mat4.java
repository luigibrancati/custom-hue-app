package com.google.android.filament.utils;

import Od.v;
import fc.C4032o;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 k2\u00020\u0001:\u0001kB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB+\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0017J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0019J \u0010\u0013\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u001aJ \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u0017J(\u0010\u001b\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ \u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J(\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010!\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b$\u0010\"J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b'\u0010&J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b(\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b)\u0010&J\"\u0010+\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b+\u0010,J\"\u0010.\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b.\u0010/J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b(\u00100J\"\u0010+\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b+\u00101J\"\u0010.\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u0016H\u0086\b¢\u0006\u0004\b.\u00102J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b(\u00103J\u0017\u00106\u001a\u00020\t2\b\b\u0002\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010BJ\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010BJ8\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010.\u001a\u00020-2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010KR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010B\"\u0004\bN\u0010OR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010L\u001a\u0004\bP\u0010B\"\u0004\bQ\u0010OR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010L\u001a\u0004\bR\u0010B\"\u0004\bS\u0010OR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010L\u001a\u0004\bT\u0010B\"\u0004\bU\u0010OR&\u0010\n\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR&\u0010\u000b\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010X\"\u0004\b\\\u0010ZR&\u0010\f\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010X\"\u0004\b^\u0010ZR&\u0010\r\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010X\"\u0004\b`\u0010ZR\u0012\u0010b\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\ba\u0010XR\u0012\u0010d\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\bc\u0010XR\u0011\u0010f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\be\u0010XR\u0012\u0010j\u001a\u00020g8Æ\u0002¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006l"}, d2 = {"Lcom/google/android/filament/utils/Mat4;", "", "Lcom/google/android/filament/utils/Float4;", "x", "y", "z", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "<init>", "(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V", "Lcom/google/android/filament/utils/Float3;", "right", "up", "forward", "position", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V", "m", "(Lcom/google/android/filament/utils/Mat4;)V", "", "column", "get", "(I)Lcom/google/android/filament/utils/Float4;", "row", "", "(II)F", "Lcom/google/android/filament/utils/MatrixColumn;", "(Lcom/google/android/filament/utils/MatrixColumn;)Lcom/google/android/filament/utils/Float4;", "(Lcom/google/android/filament/utils/MatrixColumn;I)F", "invoke", "v", "Lfc/H;", "(IIF)V", "set", "(ILcom/google/android/filament/utils/Float4;)V", "unaryMinus", "()Lcom/google/android/filament/utils/Mat4;", "inc", "dec", IPTC.PREFIX_PLUS, "(F)Lcom/google/android/filament/utils/Mat4;", "minus", "times", "div", "delta", "compareTo", "(FF)Lcom/google/android/filament/utils/Mat4;", "", "equals", "(FF)Z", "(Lcom/google/android/filament/utils/Mat4;)Lcom/google/android/filament/utils/Mat4;", "(Lcom/google/android/filament/utils/Mat4;F)Lcom/google/android/filament/utils/Mat4;", "(Lcom/google/android/filament/utils/Mat4;F)Z", "(Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Float4;", "Lcom/google/android/filament/utils/RotationsOrder;", "order", "toEulerAngles", "(Lcom/google/android/filament/utils/RotationsOrder;)Lcom/google/android/filament/utils/Float3;", "Lcom/google/android/filament/utils/Quaternion;", "toQuaternion", "()Lcom/google/android/filament/utils/Quaternion;", "", "toFloatArray", "()[F", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/google/android/filament/utils/Float4;", "component2", "component3", "component4", "copy", "(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)Lcom/google/android/filament/utils/Mat4;", "hashCode", "()I", Request.JsonKeys.OTHER, "(Ljava/lang/Object;)Z", "Lcom/google/android/filament/utils/Float4;", "getX", "setX", "(Lcom/google/android/filament/utils/Float4;)V", "getY", "setY", "getZ", "setZ", "getW", "setW", "value", "getRight", "()Lcom/google/android/filament/utils/Float3;", "setRight", "(Lcom/google/android/filament/utils/Float3;)V", "getUp", "setUp", "getForward", "setForward", "getPosition", "setPosition", "getScale", "scale", "getTranslation", "translation", "getRotation", "rotation", "Lcom/google/android/filament/utils/Mat3;", "getUpperLeft", "()Lcom/google/android/filament/utils/Mat3;", "upperLeft", "Companion", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Mat4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float4 w;
    private Float4 x;
    private Float4 y;
    private Float4 z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00020\u0007\"\u00020\bJ\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/google/android/filament/utils/Mat4$Companion;", "", "<init>", "()V", "of", "Lcom/google/android/filament/utils/Mat4;", "a", "", "", "identity", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Mat4 identity() {
            return new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (AbstractC4854k) null);
        }

        public final Mat4 of(float... a10) {
            AbstractC4862t.e(a10, "a");
            if (a10.length >= 16) {
                return new Mat4(new Float4(a10[0], a10[4], a10[8], a10[12]), new Float4(a10[1], a10[5], a10[9], a10[13]), new Float4(a10[2], a10[6], a10[10], a10[14]), new Float4(a10[3], a10[7], a10[11], a10[15]));
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatrixColumn.values().length];
            try {
                iArr[MatrixColumn.f28965X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatrixColumn.f28966Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatrixColumn.f28967Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MatrixColumn.f28964W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Mat4() {
        this((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (AbstractC4854k) null);
    }

    public static /* synthetic */ Mat4 compareTo$default(Mat4 mat4, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        Float4 x10 = mat4.getX();
        Float4 float4 = new Float4(Math.abs(x10.getX() - f10) < f11 ? 0.0f : Float.compare(r2, f10), Math.abs(x10.getY() - f10) < f11 ? 0.0f : Float.compare(r3, f10), Math.abs(x10.getZ() - f10) < f11 ? 0.0f : Float.compare(r4, f10), Math.abs(x10.getW() - f10) < f11 ? 0.0f : Float.compare(r0, f10));
        Float4 y10 = mat4.getY();
        Float4 float42 = new Float4(Math.abs(y10.getX() - f10) < f11 ? 0.0f : Float.compare(r3, f10), Math.abs(y10.getY() - f10) < f11 ? 0.0f : Float.compare(r4, f10), Math.abs(y10.getZ() - f10) < f11 ? 0.0f : Float.compare(r5, f10), Math.abs(y10.getW() - f10) < f11 ? 0.0f : Float.compare(r0, f10));
        Float4 z10 = mat4.getZ();
        Float4 float43 = new Float4(Math.abs(z10.getX() - f10) < f11 ? 0.0f : Float.compare(r4, f10), Math.abs(z10.getY() - f10) < f11 ? 0.0f : Float.compare(r5, f10), Math.abs(z10.getZ() - f10) < f11 ? 0.0f : Float.compare(r6, f10), Math.abs(z10.getW() - f10) < f11 ? 0.0f : Float.compare(r0, f10));
        Float4 w10 = mat4.getW();
        return new Mat4(float4, float42, float43, new Float4(Math.abs(w10.getX() - f10) < f11 ? 0.0f : Float.compare(r4, f10), Math.abs(w10.getY() - f10) < f11 ? 0.0f : Float.compare(r5, f10), Math.abs(w10.getZ() - f10) < f11 ? 0.0f : Float.compare(r6, f10), Math.abs(w10.getW() - f10) >= f11 ? Float.compare(r8, f10) : 0.0f));
    }

    public static /* synthetic */ Mat4 copy$default(Mat4 mat4, Float4 float4, Float4 float42, Float4 float43, Float4 float44, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            float4 = mat4.x;
        }
        if ((i10 & 2) != 0) {
            float42 = mat4.y;
        }
        if ((i10 & 4) != 0) {
            float43 = mat4.z;
        }
        if ((i10 & 8) != 0) {
            float44 = mat4.w;
        }
        return mat4.copy(float4, float42, float43, float44);
    }

    public static /* synthetic */ boolean equals$default(Mat4 mat4, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        Float4 x10 = mat4.getX();
        if (Math.abs(x10.getX() - f10) >= f11 || Math.abs(x10.getY() - f10) >= f11 || Math.abs(x10.getZ() - f10) >= f11 || Math.abs(x10.getW() - f10) >= f11) {
            return false;
        }
        Float4 y10 = mat4.getY();
        if (Math.abs(y10.getX() - f10) >= f11 || Math.abs(y10.getY() - f10) >= f11 || Math.abs(y10.getZ() - f10) >= f11 || Math.abs(y10.getW() - f10) >= f11) {
            return false;
        }
        Float4 z10 = mat4.getZ();
        if (Math.abs(z10.getX() - f10) >= f11 || Math.abs(z10.getY() - f10) >= f11 || Math.abs(z10.getZ() - f10) >= f11 || Math.abs(z10.getW() - f10) >= f11) {
            return false;
        }
        Float4 w10 = mat4.getW();
        return Math.abs(w10.getX() - f10) < f11 && Math.abs(w10.getY() - f10) < f11 && Math.abs(w10.getZ() - f10) < f11 && Math.abs(w10.getW() - f10) < f11;
    }

    public static /* synthetic */ Float3 toEulerAngles$default(Mat4 mat4, RotationsOrder rotationsOrder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rotationsOrder = RotationsOrder.ZYX;
        }
        return mat4.toEulerAngles(rotationsOrder);
    }

    public final Mat4 compareTo(float v10, float delta) {
        Float4 x10 = getX();
        Float4 float4 = new Float4(Math.abs(x10.getX() - v10) < delta ? 0.0f : Float.compare(r3, v10), Math.abs(x10.getY() - v10) < delta ? 0.0f : Float.compare(r4, v10), Math.abs(x10.getZ() - v10) < delta ? 0.0f : Float.compare(r6, v10), Math.abs(x10.getW() - v10) < delta ? 0.0f : Float.compare(r1, v10));
        Float4 y10 = getY();
        Float4 float42 = new Float4(Math.abs(y10.getX() - v10) < delta ? 0.0f : Float.compare(r4, v10), Math.abs(y10.getY() - v10) < delta ? 0.0f : Float.compare(r6, v10), Math.abs(y10.getZ() - v10) < delta ? 0.0f : Float.compare(r7, v10), Math.abs(y10.getW() - v10) < delta ? 0.0f : Float.compare(r1, v10));
        Float4 z10 = getZ();
        Float4 float43 = new Float4(Math.abs(z10.getX() - v10) < delta ? 0.0f : Float.compare(r6, v10), Math.abs(z10.getY() - v10) < delta ? 0.0f : Float.compare(r7, v10), Math.abs(z10.getZ() - v10) < delta ? 0.0f : Float.compare(r8, v10), Math.abs(z10.getW() - v10) < delta ? 0.0f : Float.compare(r1, v10));
        Float4 w10 = getW();
        return new Mat4(float4, float42, float43, new Float4(Math.abs(w10.getX() - v10) < delta ? 0.0f : Float.compare(r6, v10), Math.abs(w10.getY() - v10) < delta ? 0.0f : Float.compare(r7, v10), Math.abs(w10.getZ() - v10) < delta ? 0.0f : Float.compare(r8, v10), Math.abs(w10.getW() - v10) >= delta ? Float.compare(r10, v10) : 0.0f));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float4 getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float4 getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float4 getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float4 getW() {
        return this.w;
    }

    public final Mat4 copy(Float4 x10, Float4 y10, Float4 z10, Float4 w10) {
        AbstractC4862t.e(x10, "x");
        AbstractC4862t.e(y10, "y");
        AbstractC4862t.e(z10, "z");
        AbstractC4862t.e(w10, "w");
        return new Mat4(x10, y10, z10, w10);
    }

    public final Mat4 dec() {
        Float4 float4 = this.x;
        this.x = float4.dec();
        Float4 float42 = this.y;
        this.y = float42.dec();
        Float4 float43 = this.z;
        this.z = float43.dec();
        Float4 float44 = this.w;
        this.w = float44.dec();
        return new Mat4(float4, float42, float43, float44);
    }

    public final Mat4 div(float v10) {
        Float4 float4 = this.x;
        Float4 float42 = new Float4(float4.getX() / v10, float4.getY() / v10, float4.getZ() / v10, float4.getW() / v10);
        Float4 float43 = this.y;
        Float4 float44 = new Float4(float43.getX() / v10, float43.getY() / v10, float43.getZ() / v10, float43.getW() / v10);
        Float4 float45 = this.z;
        Float4 float46 = new Float4(float45.getX() / v10, float45.getY() / v10, float45.getZ() / v10, float45.getW() / v10);
        Float4 float47 = this.w;
        return new Mat4(float42, float44, float46, new Float4(float47.getX() / v10, float47.getY() / v10, float47.getZ() / v10, float47.getW() / v10));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mat4)) {
            return false;
        }
        Mat4 mat4 = (Mat4) other;
        return AbstractC4862t.a(this.x, mat4.x) && AbstractC4862t.a(this.y, mat4.y) && AbstractC4862t.a(this.z, mat4.z) && AbstractC4862t.a(this.w, mat4.w);
    }

    public final Float4 get(int column) {
        if (column == 0) {
            return this.x;
        }
        if (column == 1) {
            return this.y;
        }
        if (column == 2) {
            return this.z;
        }
        if (column == 3) {
            return this.w;
        }
        throw new IllegalArgumentException("column must be in 0..3");
    }

    public final Float3 getForward() {
        Float4 z10 = getZ();
        return new Float3(z10.getX(), z10.getY(), z10.getZ());
    }

    public final Float3 getPosition() {
        Float4 w10 = getW();
        return new Float3(w10.getX(), w10.getY(), w10.getZ());
    }

    public final Float3 getRight() {
        Float4 x10 = getX();
        return new Float3(x10.getX(), x10.getY(), x10.getZ());
    }

    public final Float3 getRotation() {
        Float4 x10 = getX();
        Float3 float3Normalize = VectorKt.normalize(new Float3(x10.getX(), x10.getY(), x10.getZ()));
        Float4 y10 = getY();
        Float3 float3Normalize2 = VectorKt.normalize(new Float3(y10.getX(), y10.getY(), y10.getZ()));
        Float4 z10 = getZ();
        Float3 float3Normalize3 = VectorKt.normalize(new Float3(z10.getX(), z10.getY(), z10.getZ()));
        return float3Normalize3.getY() <= -1.0f ? new Float3(-90.0f, 0.0f, ((float) Math.atan2(float3Normalize.getZ(), float3Normalize2.getZ())) * 57.295776f) : float3Normalize3.getY() >= 1.0f ? new Float3(90.0f, 0.0f, ((float) Math.atan2(-float3Normalize.getZ(), -float3Normalize2.getZ())) * 57.295776f) : new Float3((-((float) Math.asin(float3Normalize3.getY()))) * 57.295776f, (-((float) Math.atan2(float3Normalize3.getX(), float3Normalize3.getZ()))) * 57.295776f, ((float) Math.atan2(float3Normalize.getY(), float3Normalize2.getY())) * 57.295776f);
    }

    public final Float3 getScale() {
        Float4 x10 = getX();
        Float3 float3 = new Float3(x10.getX(), x10.getY(), x10.getZ());
        float fSqrt = (float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ()));
        Float4 y10 = getY();
        Float3 float32 = new Float3(y10.getX(), y10.getY(), y10.getZ());
        float fSqrt2 = (float) Math.sqrt((float32.getX() * float32.getX()) + (float32.getY() * float32.getY()) + (float32.getZ() * float32.getZ()));
        Float4 z10 = getZ();
        Float3 float33 = new Float3(z10.getX(), z10.getY(), z10.getZ());
        return new Float3(fSqrt, fSqrt2, (float) Math.sqrt((float33.getX() * float33.getX()) + (float33.getY() * float33.getY()) + (float33.getZ() * float33.getZ())));
    }

    public final Float3 getTranslation() {
        Float4 w10 = getW();
        return new Float3(w10.getX(), w10.getY(), w10.getZ());
    }

    public final Float3 getUp() {
        Float4 y10 = getY();
        return new Float3(y10.getX(), y10.getY(), y10.getZ());
    }

    public final Mat3 getUpperLeft() {
        Float4 x10 = getX();
        Float3 float3 = new Float3(x10.getX(), x10.getY(), x10.getZ());
        Float4 y10 = getY();
        Float3 float32 = new Float3(y10.getX(), y10.getY(), y10.getZ());
        Float4 z10 = getZ();
        return new Mat3(float3, float32, new Float3(z10.getX(), z10.getY(), z10.getZ()));
    }

    public final Float4 getW() {
        return this.w;
    }

    public final Float4 getX() {
        return this.x;
    }

    public final Float4 getY() {
        return this.y;
    }

    public final Float4 getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((this.x.hashCode() * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.w.hashCode();
    }

    public final Mat4 inc() {
        Float4 float4 = this.x;
        this.x = float4.inc();
        Float4 float42 = this.y;
        this.y = float42.inc();
        Float4 float43 = this.z;
        this.z = float43.inc();
        Float4 float44 = this.w;
        this.w = float44.inc();
        return new Mat4(float4, float42, float43, float44);
    }

    public final float invoke(int row, int column) {
        return get(column - 1).get(row - 1);
    }

    public final Mat4 minus(float v10) {
        Float4 float4 = this.x;
        Float4 float42 = new Float4(float4.getX() - v10, float4.getY() - v10, float4.getZ() - v10, float4.getW() - v10);
        Float4 float43 = this.y;
        Float4 float44 = new Float4(float43.getX() - v10, float43.getY() - v10, float43.getZ() - v10, float43.getW() - v10);
        Float4 float45 = this.z;
        Float4 float46 = new Float4(float45.getX() - v10, float45.getY() - v10, float45.getZ() - v10, float45.getW() - v10);
        Float4 float47 = this.w;
        return new Mat4(float42, float44, float46, new Float4(float47.getX() - v10, float47.getY() - v10, float47.getZ() - v10, float47.getW() - v10));
    }

    public final Mat4 plus(float v10) {
        Float4 float4 = this.x;
        Float4 float42 = new Float4(float4.getX() + v10, float4.getY() + v10, float4.getZ() + v10, float4.getW() + v10);
        Float4 float43 = this.y;
        Float4 float44 = new Float4(float43.getX() + v10, float43.getY() + v10, float43.getZ() + v10, float43.getW() + v10);
        Float4 float45 = this.z;
        Float4 float46 = new Float4(float45.getX() + v10, float45.getY() + v10, float45.getZ() + v10, float45.getW() + v10);
        Float4 float47 = this.w;
        return new Mat4(float42, float44, float46, new Float4(float47.getX() + v10, float47.getY() + v10, float47.getZ() + v10, float47.getW() + v10));
    }

    public final void set(int column, Float4 v10) {
        AbstractC4862t.e(v10, "v");
        Float4 float4 = get(column);
        float4.setX(v10.getX());
        float4.setY(v10.getY());
        float4.setZ(v10.getZ());
        float4.setW(v10.getW());
    }

    public final void setForward(Float3 value) {
        AbstractC4862t.e(value, "value");
        Float4 z10 = getZ();
        z10.setX(value.getX());
        z10.setY(value.getY());
        z10.setZ(value.getZ());
    }

    public final void setPosition(Float3 value) {
        AbstractC4862t.e(value, "value");
        Float4 w10 = getW();
        w10.setX(value.getX());
        w10.setY(value.getY());
        w10.setZ(value.getZ());
    }

    public final void setRight(Float3 value) {
        AbstractC4862t.e(value, "value");
        Float4 x10 = getX();
        x10.setX(value.getX());
        x10.setY(value.getY());
        x10.setZ(value.getZ());
    }

    public final void setUp(Float3 value) {
        AbstractC4862t.e(value, "value");
        Float4 y10 = getY();
        y10.setX(value.getX());
        y10.setY(value.getY());
        y10.setZ(value.getZ());
    }

    public final void setW(Float4 float4) {
        AbstractC4862t.e(float4, "<set-?>");
        this.w = float4;
    }

    public final void setX(Float4 float4) {
        AbstractC4862t.e(float4, "<set-?>");
        this.x = float4;
    }

    public final void setY(Float4 float4) {
        AbstractC4862t.e(float4, "<set-?>");
        this.y = float4;
    }

    public final void setZ(Float4 float4) {
        AbstractC4862t.e(float4, "<set-?>");
        this.z = float4;
    }

    public final Mat4 times(float v10) {
        Float4 float4 = this.x;
        Float4 float42 = new Float4(float4.getX() * v10, float4.getY() * v10, float4.getZ() * v10, float4.getW() * v10);
        Float4 float43 = this.y;
        Float4 float44 = new Float4(float43.getX() * v10, float43.getY() * v10, float43.getZ() * v10, float43.getW() * v10);
        Float4 float45 = this.z;
        Float4 float46 = new Float4(float45.getX() * v10, float45.getY() * v10, float45.getZ() * v10, float45.getW() * v10);
        Float4 float47 = this.w;
        return new Mat4(float42, float44, float46, new Float4(float47.getX() * v10, float47.getY() * v10, float47.getZ() * v10, float47.getW() * v10));
    }

    public final Float3 toEulerAngles(RotationsOrder order) {
        AbstractC4862t.e(order, "order");
        return MatrixKt.eulerAngles(this, order);
    }

    public final float[] toFloatArray() {
        return new float[]{this.x.getX(), this.y.getX(), this.z.getX(), this.w.getX(), this.x.getY(), this.y.getY(), this.z.getY(), this.w.getY(), this.x.getZ(), this.y.getZ(), this.z.getZ(), this.w.getZ(), this.x.getW(), this.y.getW(), this.z.getW(), this.w.getW()};
    }

    public final Quaternion toQuaternion() {
        return MatrixKt.quaternion(this);
    }

    public String toString() {
        return v.n("\n            |" + this.x.getX() + StringUtils.SPACE + this.y.getX() + StringUtils.SPACE + this.z.getX() + StringUtils.SPACE + this.w.getX() + "|\n            |" + this.x.getY() + StringUtils.SPACE + this.y.getY() + StringUtils.SPACE + this.z.getY() + StringUtils.SPACE + this.w.getY() + "|\n            |" + this.x.getZ() + StringUtils.SPACE + this.y.getZ() + StringUtils.SPACE + this.z.getZ() + StringUtils.SPACE + this.w.getZ() + "|\n            |" + this.x.getW() + StringUtils.SPACE + this.y.getW() + StringUtils.SPACE + this.z.getW() + StringUtils.SPACE + this.w.getW() + "|\n            ");
    }

    public final Mat4 unaryMinus() {
        return new Mat4(this.x.unaryMinus(), this.y.unaryMinus(), this.z.unaryMinus(), this.w.unaryMinus());
    }

    public Mat4(Float4 x10, Float4 y10, Float4 z10, Float4 w10) {
        AbstractC4862t.e(x10, "x");
        AbstractC4862t.e(y10, "y");
        AbstractC4862t.e(z10, "z");
        AbstractC4862t.e(w10, "w");
        this.x = x10;
        this.y = y10;
        this.z = z10;
        this.w = w10;
    }

    public final boolean equals(float v10, float delta) {
        Float4 x10 = getX();
        if (Math.abs(x10.getX() - v10) >= delta || Math.abs(x10.getY() - v10) >= delta || Math.abs(x10.getZ() - v10) >= delta || Math.abs(x10.getW() - v10) >= delta) {
            return false;
        }
        Float4 y10 = getY();
        if (Math.abs(y10.getX() - v10) >= delta || Math.abs(y10.getY() - v10) >= delta || Math.abs(y10.getZ() - v10) >= delta || Math.abs(y10.getW() - v10) >= delta) {
            return false;
        }
        Float4 z10 = getZ();
        if (Math.abs(z10.getX() - v10) >= delta || Math.abs(z10.getY() - v10) >= delta || Math.abs(z10.getZ() - v10) >= delta || Math.abs(z10.getW() - v10) >= delta) {
            return false;
        }
        Float4 w10 = getW();
        return Math.abs(w10.getX() - v10) < delta && Math.abs(w10.getY() - v10) < delta && Math.abs(w10.getZ() - v10) < delta && Math.abs(w10.getW() - v10) < delta;
    }

    public final void invoke(int row, int column, float v10) {
        set(column - 1, row - 1, v10);
    }

    public final float get(int column, int row) {
        return get(column).get(row);
    }

    public final void set(int column, int row, float v10) {
        get(column).set(row, v10);
    }

    public /* synthetic */ Mat4(Float4 float4, Float4 float42, Float4 float43, Float4 float44, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new Float4(1.0f, 0.0f, 0.0f, 0.0f, 14, null) : float4, (i10 & 2) != 0 ? new Float4(0.0f, 1.0f, 0.0f, 0.0f, 13, null) : float42, (i10 & 4) != 0 ? new Float4(0.0f, 0.0f, 1.0f, 0.0f, 11, null) : float43, (i10 & 8) != 0 ? new Float4(0.0f, 0.0f, 0.0f, 1.0f, 7, null) : float44);
    }

    public final Float4 get(MatrixColumn column) {
        AbstractC4862t.e(column, "column");
        int i10 = WhenMappings.$EnumSwitchMapping$0[column.ordinal()];
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

    public final Mat4 times(Mat4 m10) {
        AbstractC4862t.e(m10, "m");
        return new Mat4(new Float4((this.x.getX() * m10.x.getX()) + (this.y.getX() * m10.x.getY()) + (this.z.getX() * m10.x.getZ()) + (this.w.getX() * m10.x.getW()), (this.x.getY() * m10.x.getX()) + (this.y.getY() * m10.x.getY()) + (this.z.getY() * m10.x.getZ()) + (this.w.getY() * m10.x.getW()), (this.x.getZ() * m10.x.getX()) + (this.y.getZ() * m10.x.getY()) + (this.z.getZ() * m10.x.getZ()) + (this.w.getZ() * m10.x.getW()), (this.x.getW() * m10.x.getX()) + (this.y.getW() * m10.x.getY()) + (this.z.getW() * m10.x.getZ()) + (this.w.getW() * m10.x.getW())), new Float4((this.x.getX() * m10.y.getX()) + (this.y.getX() * m10.y.getY()) + (this.z.getX() * m10.y.getZ()) + (this.w.getX() * m10.y.getW()), (this.x.getY() * m10.y.getX()) + (this.y.getY() * m10.y.getY()) + (this.z.getY() * m10.y.getZ()) + (this.w.getY() * m10.y.getW()), (this.x.getZ() * m10.y.getX()) + (this.y.getZ() * m10.y.getY()) + (this.z.getZ() * m10.y.getZ()) + (this.w.getZ() * m10.y.getW()), (this.x.getW() * m10.y.getX()) + (this.y.getW() * m10.y.getY()) + (this.z.getW() * m10.y.getZ()) + (this.w.getW() * m10.y.getW())), new Float4((this.x.getX() * m10.z.getX()) + (this.y.getX() * m10.z.getY()) + (this.z.getX() * m10.z.getZ()) + (this.w.getX() * m10.z.getW()), (this.x.getY() * m10.z.getX()) + (this.y.getY() * m10.z.getY()) + (this.z.getY() * m10.z.getZ()) + (this.w.getY() * m10.z.getW()), (this.x.getZ() * m10.z.getX()) + (this.y.getZ() * m10.z.getY()) + (this.z.getZ() * m10.z.getZ()) + (this.w.getZ() * m10.z.getW()), (this.x.getW() * m10.z.getX()) + (this.y.getW() * m10.z.getY()) + (this.z.getW() * m10.z.getZ()) + (this.w.getW() * m10.z.getW())), new Float4((this.x.getX() * m10.w.getX()) + (this.y.getX() * m10.w.getY()) + (this.z.getX() * m10.w.getZ()) + (this.w.getX() * m10.w.getW()), (this.x.getY() * m10.w.getX()) + (this.y.getY() * m10.w.getY()) + (this.z.getY() * m10.w.getZ()) + (this.w.getY() * m10.w.getW()), (this.x.getZ() * m10.w.getX()) + (this.y.getZ() * m10.w.getY()) + (this.z.getZ() * m10.w.getZ()) + (this.w.getZ() * m10.w.getW()), (this.x.getW() * m10.w.getX()) + (this.y.getW() * m10.w.getY()) + (this.z.getW() * m10.w.getZ()) + (this.w.getW() * m10.w.getW())));
    }

    public /* synthetic */ Mat4(Float3 float3, Float3 float32, Float3 float33, Float3 float34, int i10, AbstractC4854k abstractC4854k) {
        this(float3, float32, float33, (i10 & 8) != 0 ? new Float3(0.0f, 0.0f, 0.0f, 7, null) : float34);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat4(Float3 right, Float3 up, Float3 forward, Float3 position) {
        this(new Float4(right, 0.0f, 2, (AbstractC4854k) null), new Float4(up, 0.0f, 2, (AbstractC4854k) null), new Float4(forward, 0.0f, 2, (AbstractC4854k) null), new Float4(position, 1.0f));
        AbstractC4862t.e(right, "right");
        AbstractC4862t.e(up, "up");
        AbstractC4862t.e(forward, "forward");
        AbstractC4862t.e(position, "position");
    }

    public final float get(MatrixColumn column, int row) {
        AbstractC4862t.e(column, "column");
        return get(column).get(row);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat4(Mat4 m10) {
        this(Float4.copy$default(m10.x, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(m10.y, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(m10.z, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(m10.w, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
        AbstractC4862t.e(m10, "m");
    }

    public final Float4 times(Float4 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float4((this.x.getX() * v10.getX()) + (this.y.getX() * v10.getY()) + (this.z.getX() * v10.getZ()) + (this.w.getX() * v10.getW()), (this.x.getY() * v10.getX()) + (this.y.getY() * v10.getY()) + (this.z.getY() * v10.getZ()) + (this.w.getY() * v10.getW()), (this.x.getZ() * v10.getX()) + (this.y.getZ() * v10.getY()) + (this.z.getZ() * v10.getZ()) + (this.w.getZ() * v10.getW()), (this.x.getW() * v10.getX()) + (this.y.getW() * v10.getY()) + (this.z.getW() * v10.getZ()) + (this.w.getW() * v10.getW()));
    }

    public static /* synthetic */ boolean equals$default(Mat4 mat4, Mat4 m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(m10, "m");
        Float4 x10 = mat4.getX();
        Float4 x11 = m10.getX();
        if (Math.abs(x10.getX() - x11.getX()) >= f10 || Math.abs(x10.getY() - x11.getY()) >= f10 || Math.abs(x10.getZ() - x11.getZ()) >= f10 || Math.abs(x10.getW() - x11.getW()) >= f10) {
            return false;
        }
        Float4 y10 = mat4.getY();
        Float4 y11 = m10.getY();
        if (Math.abs(y10.getX() - y11.getX()) >= f10 || Math.abs(y10.getY() - y11.getY()) >= f10 || Math.abs(y10.getZ() - y11.getZ()) >= f10 || Math.abs(y10.getW() - y11.getW()) >= f10) {
            return false;
        }
        Float4 z10 = mat4.getZ();
        Float4 z11 = m10.getZ();
        if (Math.abs(z10.getX() - z11.getX()) >= f10 || Math.abs(z10.getY() - z11.getY()) >= f10 || Math.abs(z10.getZ() - z11.getZ()) >= f10 || Math.abs(z10.getW() - z11.getW()) >= f10) {
            return false;
        }
        Float4 w10 = mat4.getW();
        Float4 w11 = m10.getW();
        return Math.abs(w10.getX() - w11.getX()) < f10 && Math.abs(w10.getY() - w11.getY()) < f10 && Math.abs(w10.getZ() - w11.getZ()) < f10 && Math.abs(w10.getW() - w11.getW()) < f10;
    }

    public final boolean equals(Mat4 m10, float delta) {
        AbstractC4862t.e(m10, "m");
        Float4 x10 = getX();
        Float4 x11 = m10.getX();
        if (Math.abs(x10.getX() - x11.getX()) >= delta || Math.abs(x10.getY() - x11.getY()) >= delta || Math.abs(x10.getZ() - x11.getZ()) >= delta || Math.abs(x10.getW() - x11.getW()) >= delta) {
            return false;
        }
        Float4 y10 = getY();
        Float4 y11 = m10.getY();
        if (Math.abs(y10.getX() - y11.getX()) >= delta || Math.abs(y10.getY() - y11.getY()) >= delta || Math.abs(y10.getZ() - y11.getZ()) >= delta || Math.abs(y10.getW() - y11.getW()) >= delta) {
            return false;
        }
        Float4 z10 = getZ();
        Float4 z11 = m10.getZ();
        if (Math.abs(z10.getX() - z11.getX()) >= delta || Math.abs(z10.getY() - z11.getY()) >= delta || Math.abs(z10.getZ() - z11.getZ()) >= delta || Math.abs(z10.getW() - z11.getW()) >= delta) {
            return false;
        }
        Float4 w10 = getW();
        Float4 w11 = m10.getW();
        return Math.abs(w10.getX() - w11.getX()) < delta && Math.abs(w10.getY() - w11.getY()) < delta && Math.abs(w10.getZ() - w11.getZ()) < delta && Math.abs(w10.getW() - w11.getW()) < delta;
    }

    public static /* synthetic */ Mat4 compareTo$default(Mat4 mat4, Mat4 m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(m10, "m");
        Float4 x10 = mat4.getX();
        Float4 x11 = m10.getX();
        Float4 float4 = new Float4(Math.abs(x10.getX() - x11.getX()) < f10 ? 0.0f : Float.compare(r3, r4), Math.abs(x10.getY() - x11.getY()) < f10 ? 0.0f : Float.compare(r4, r5), Math.abs(x10.getZ() - x11.getZ()) < f10 ? 0.0f : Float.compare(r5, r6), Math.abs(x10.getW() - x11.getW()) < f10 ? 0.0f : Float.compare(r0, r1));
        Float4 y10 = mat4.getY();
        Float4 y11 = m10.getY();
        Float4 float42 = new Float4(Math.abs(y10.getX() - y11.getX()) < f10 ? 0.0f : Float.compare(r4, r5), Math.abs(y10.getY() - y11.getY()) < f10 ? 0.0f : Float.compare(r5, r6), Math.abs(y10.getZ() - y11.getZ()) < f10 ? 0.0f : Float.compare(r6, r7), Math.abs(y10.getW() - y11.getW()) < f10 ? 0.0f : Float.compare(r0, r1));
        Float4 z10 = mat4.getZ();
        Float4 z11 = m10.getZ();
        Float4 float43 = new Float4(Math.abs(z10.getX() - z11.getX()) < f10 ? 0.0f : Float.compare(r5, r6), Math.abs(z10.getY() - z11.getY()) < f10 ? 0.0f : Float.compare(r6, r7), Math.abs(z10.getZ() - z11.getZ()) < f10 ? 0.0f : Float.compare(r7, r8), Math.abs(z10.getW() - z11.getW()) < f10 ? 0.0f : Float.compare(r0, r1));
        Float4 w10 = mat4.getW();
        Float4 w11 = m10.getW();
        return new Mat4(float4, float42, float43, new Float4(Math.abs(w10.getX() - w11.getX()) < f10 ? 0.0f : Float.compare(r1, r5), Math.abs(w10.getY() - w11.getY()) < f10 ? 0.0f : Float.compare(r5, r6), Math.abs(w10.getZ() - w11.getZ()) < f10 ? 0.0f : Float.compare(r6, r7), Math.abs(w10.getW() - w11.getW()) >= f10 ? Float.compare(r10, r11) : 0.0f));
    }

    public final Mat4 compareTo(Mat4 m10, float delta) {
        AbstractC4862t.e(m10, "m");
        Float4 x10 = getX();
        Float4 x11 = m10.getX();
        Float4 float4 = new Float4(Math.abs(x10.getX() - x11.getX()) < delta ? 0.0f : Float.compare(r4, r5), Math.abs(x10.getY() - x11.getY()) < delta ? 0.0f : Float.compare(r5, r6), Math.abs(x10.getZ() - x11.getZ()) < delta ? 0.0f : Float.compare(r6, r8), Math.abs(x10.getW() - x11.getW()) < delta ? 0.0f : Float.compare(r1, r2));
        Float4 y10 = getY();
        Float4 y11 = m10.getY();
        Float4 float42 = new Float4(Math.abs(y10.getX() - y11.getX()) < delta ? 0.0f : Float.compare(r5, r6), Math.abs(y10.getY() - y11.getY()) < delta ? 0.0f : Float.compare(r6, r8), Math.abs(y10.getZ() - y11.getZ()) < delta ? 0.0f : Float.compare(r8, r9), Math.abs(y10.getW() - y11.getW()) < delta ? 0.0f : Float.compare(r1, r2));
        Float4 z10 = getZ();
        Float4 z11 = m10.getZ();
        Float4 float43 = new Float4(Math.abs(z10.getX() - z11.getX()) < delta ? 0.0f : Float.compare(r6, r8), Math.abs(z10.getY() - z11.getY()) < delta ? 0.0f : Float.compare(r8, r9), Math.abs(z10.getZ() - z11.getZ()) < delta ? 0.0f : Float.compare(r9, r10), Math.abs(z10.getW() - z11.getW()) < delta ? 0.0f : Float.compare(r1, r2));
        Float4 w10 = getW();
        Float4 w11 = m10.getW();
        return new Mat4(float4, float42, float43, new Float4(Math.abs(w10.getX() - w11.getX()) < delta ? 0.0f : Float.compare(r2, r6), Math.abs(w10.getY() - w11.getY()) < delta ? 0.0f : Float.compare(r6, r8), Math.abs(w10.getZ() - w11.getZ()) < delta ? 0.0f : Float.compare(r8, r9), Math.abs(w10.getW() - w11.getW()) >= delta ? Float.compare(r12, r13) : 0.0f));
    }
}
