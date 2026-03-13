package com.google.android.filament.utils;

import Od.v;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u0000 E2\u00020\u0001:\u0001EB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\f\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0012J \u0010\f\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\u0013J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0010J(\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0017J \u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b \u0010\u001fJ\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\"\u0010\u001fJ\"\u0010$\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b$\u0010%J\"\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b'\u0010(J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010)J\"\u0010$\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b$\u0010*J\"\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b'\u0010+J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b!\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00104J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u00104J.\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010'\u001a\u00020&2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010<R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u00104\"\u0004\b?\u0010@R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010=\u001a\u0004\bA\u00104\"\u0004\bB\u0010@R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010=\u001a\u0004\bC\u00104\"\u0004\bD\u0010@¨\u0006F"}, d2 = {"Lcom/google/android/filament/utils/Mat3;", "", "Lcom/google/android/filament/utils/Float3;", "x", "y", "z", "<init>", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V", "m", "(Lcom/google/android/filament/utils/Mat3;)V", "", "column", "get", "(I)Lcom/google/android/filament/utils/Float3;", "row", "", "(II)F", "Lcom/google/android/filament/utils/MatrixColumn;", "(Lcom/google/android/filament/utils/MatrixColumn;)Lcom/google/android/filament/utils/Float3;", "(Lcom/google/android/filament/utils/MatrixColumn;I)F", "invoke", "v", "Lfc/H;", "(IIF)V", "set", "(ILcom/google/android/filament/utils/Float3;)V", "unaryMinus", "()Lcom/google/android/filament/utils/Mat3;", "inc", "dec", IPTC.PREFIX_PLUS, "(F)Lcom/google/android/filament/utils/Mat3;", "minus", "times", "div", "delta", "compareTo", "(FF)Lcom/google/android/filament/utils/Mat3;", "", "equals", "(FF)Z", "(Lcom/google/android/filament/utils/Mat3;)Lcom/google/android/filament/utils/Mat3;", "(Lcom/google/android/filament/utils/Mat3;F)Lcom/google/android/filament/utils/Mat3;", "(Lcom/google/android/filament/utils/Mat3;F)Z", "(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Float3;", "", "toFloatArray", "()[F", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/google/android/filament/utils/Float3;", "component2", "component3", "copy", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Mat3;", "hashCode", "()I", Request.JsonKeys.OTHER, "(Ljava/lang/Object;)Z", "Lcom/google/android/filament/utils/Float3;", "getX", "setX", "(Lcom/google/android/filament/utils/Float3;)V", "getY", "setY", "getZ", "setZ", "Companion", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Mat3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float3 x;
    private Float3 y;
    private Float3 z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00020\u0007\"\u00020\bJ\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/google/android/filament/utils/Mat3$Companion;", "", "<init>", "()V", "of", "Lcom/google/android/filament/utils/Mat3;", "a", "", "", "identity", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Mat3 identity() {
            return new Mat3(null, null, null, 7, null);
        }

        public final Mat3 of(float... a10) {
            AbstractC4862t.e(a10, "a");
            if (a10.length >= 9) {
                return new Mat3(new Float3(a10[0], a10[3], a10[6]), new Float3(a10[1], a10[4], a10[7]), new Float3(a10[2], a10[5], a10[8]));
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Mat3() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Mat3 compareTo$default(Mat3 mat3, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        Float3 x10 = mat3.getX();
        Float3 float3 = new Float3(Math.abs(x10.getX() - f10) < f11 ? 0.0f : Float.compare(r2, f10), Math.abs(x10.getY() - f10) < f11 ? 0.0f : Float.compare(r3, f10), Math.abs(x10.getZ() - f10) < f11 ? 0.0f : Float.compare(r0, f10));
        Float3 y10 = mat3.getY();
        Float3 float32 = new Float3(Math.abs(y10.getX() - f10) < f11 ? 0.0f : Float.compare(r3, f10), Math.abs(y10.getY() - f10) < f11 ? 0.0f : Float.compare(r4, f10), Math.abs(y10.getZ() - f10) < f11 ? 0.0f : Float.compare(r0, f10));
        Float3 z10 = mat3.getZ();
        return new Mat3(float3, float32, new Float3(Math.abs(z10.getX() - f10) < f11 ? 0.0f : Float.compare(r3, f10), Math.abs(z10.getY() - f10) < f11 ? 0.0f : Float.compare(r4, f10), Math.abs(z10.getZ() - f10) >= f11 ? Float.compare(r6, f10) : 0.0f));
    }

    public static /* synthetic */ Mat3 copy$default(Mat3 mat3, Float3 float3, Float3 float32, Float3 float33, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            float3 = mat3.x;
        }
        if ((i10 & 2) != 0) {
            float32 = mat3.y;
        }
        if ((i10 & 4) != 0) {
            float33 = mat3.z;
        }
        return mat3.copy(float3, float32, float33);
    }

    public static /* synthetic */ boolean equals$default(Mat3 mat3, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        Float3 x10 = mat3.getX();
        if (Math.abs(x10.getX() - f10) >= f11 || Math.abs(x10.getY() - f10) >= f11 || Math.abs(x10.getZ() - f10) >= f11) {
            return false;
        }
        Float3 y10 = mat3.getY();
        if (Math.abs(y10.getX() - f10) >= f11 || Math.abs(y10.getY() - f10) >= f11 || Math.abs(y10.getZ() - f10) >= f11) {
            return false;
        }
        Float3 z10 = mat3.getZ();
        return Math.abs(z10.getX() - f10) < f11 && Math.abs(z10.getY() - f10) < f11 && Math.abs(z10.getZ() - f10) < f11;
    }

    public final Mat3 compareTo(float v10, float delta) {
        Float3 x10 = getX();
        Float3 float3 = new Float3(Math.abs(x10.getX() - v10) < delta ? 0.0f : Float.compare(r3, v10), Math.abs(x10.getY() - v10) < delta ? 0.0f : Float.compare(r4, v10), Math.abs(x10.getZ() - v10) < delta ? 0.0f : Float.compare(r1, v10));
        Float3 y10 = getY();
        Float3 float32 = new Float3(Math.abs(y10.getX() - v10) < delta ? 0.0f : Float.compare(r4, v10), Math.abs(y10.getY() - v10) < delta ? 0.0f : Float.compare(r6, v10), Math.abs(y10.getZ() - v10) < delta ? 0.0f : Float.compare(r1, v10));
        Float3 z10 = getZ();
        return new Mat3(float3, float32, new Float3(Math.abs(z10.getX() - v10) < delta ? 0.0f : Float.compare(r4, v10), Math.abs(z10.getY() - v10) < delta ? 0.0f : Float.compare(r6, v10), Math.abs(z10.getZ() - v10) >= delta ? Float.compare(r8, v10) : 0.0f));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float3 getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float3 getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float3 getZ() {
        return this.z;
    }

    public final Mat3 copy(Float3 x10, Float3 y10, Float3 z10) {
        AbstractC4862t.e(x10, "x");
        AbstractC4862t.e(y10, "y");
        AbstractC4862t.e(z10, "z");
        return new Mat3(x10, y10, z10);
    }

    public final Mat3 dec() {
        Float3 float3 = this.x;
        this.x = float3.dec();
        Float3 float32 = this.y;
        this.y = float32.dec();
        Float3 float33 = this.z;
        this.z = float33.dec();
        return new Mat3(float3, float32, float33);
    }

    public final Mat3 div(float v10) {
        Float3 float3 = this.x;
        Float3 float32 = new Float3(float3.getX() / v10, float3.getY() / v10, float3.getZ() / v10);
        Float3 float33 = this.y;
        Float3 float34 = new Float3(float33.getX() / v10, float33.getY() / v10, float33.getZ() / v10);
        Float3 float35 = this.z;
        return new Mat3(float32, float34, new Float3(float35.getX() / v10, float35.getY() / v10, float35.getZ() / v10));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mat3)) {
            return false;
        }
        Mat3 mat3 = (Mat3) other;
        return AbstractC4862t.a(this.x, mat3.x) && AbstractC4862t.a(this.y, mat3.y) && AbstractC4862t.a(this.z, mat3.z);
    }

    public final Float3 get(int column) {
        if (column == 0) {
            return this.x;
        }
        if (column == 1) {
            return this.y;
        }
        if (column == 2) {
            return this.z;
        }
        throw new IllegalArgumentException("column must be in 0..2");
    }

    public final Float3 getX() {
        return this.x;
    }

    public final Float3 getY() {
        return this.y;
    }

    public final Float3 getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((this.x.hashCode() * 31) + this.y.hashCode()) * 31) + this.z.hashCode();
    }

    public final Mat3 inc() {
        Float3 float3 = this.x;
        this.x = float3.inc();
        Float3 float32 = this.y;
        this.y = float32.inc();
        Float3 float33 = this.z;
        this.z = float33.inc();
        return new Mat3(float3, float32, float33);
    }

    public final float invoke(int row, int column) {
        return get(column - 1).get(row - 1);
    }

    public final Mat3 minus(float v10) {
        Float3 float3 = this.x;
        Float3 float32 = new Float3(float3.getX() - v10, float3.getY() - v10, float3.getZ() - v10);
        Float3 float33 = this.y;
        Float3 float34 = new Float3(float33.getX() - v10, float33.getY() - v10, float33.getZ() - v10);
        Float3 float35 = this.z;
        return new Mat3(float32, float34, new Float3(float35.getX() - v10, float35.getY() - v10, float35.getZ() - v10));
    }

    public final Mat3 plus(float v10) {
        Float3 float3 = this.x;
        Float3 float32 = new Float3(float3.getX() + v10, float3.getY() + v10, float3.getZ() + v10);
        Float3 float33 = this.y;
        Float3 float34 = new Float3(float33.getX() + v10, float33.getY() + v10, float33.getZ() + v10);
        Float3 float35 = this.z;
        return new Mat3(float32, float34, new Float3(float35.getX() + v10, float35.getY() + v10, float35.getZ() + v10));
    }

    public final void set(int column, Float3 v10) {
        AbstractC4862t.e(v10, "v");
        Float3 float3 = get(column);
        float3.setX(v10.getX());
        float3.setY(v10.getY());
        float3.setZ(v10.getZ());
    }

    public final void setX(Float3 float3) {
        AbstractC4862t.e(float3, "<set-?>");
        this.x = float3;
    }

    public final void setY(Float3 float3) {
        AbstractC4862t.e(float3, "<set-?>");
        this.y = float3;
    }

    public final void setZ(Float3 float3) {
        AbstractC4862t.e(float3, "<set-?>");
        this.z = float3;
    }

    public final Mat3 times(float v10) {
        Float3 float3 = this.x;
        Float3 float32 = new Float3(float3.getX() * v10, float3.getY() * v10, float3.getZ() * v10);
        Float3 float33 = this.y;
        Float3 float34 = new Float3(float33.getX() * v10, float33.getY() * v10, float33.getZ() * v10);
        Float3 float35 = this.z;
        return new Mat3(float32, float34, new Float3(float35.getX() * v10, float35.getY() * v10, float35.getZ() * v10));
    }

    public final float[] toFloatArray() {
        return new float[]{this.x.getX(), this.y.getX(), this.z.getX(), this.x.getY(), this.y.getY(), this.z.getY(), this.x.getZ(), this.y.getZ(), this.z.getZ()};
    }

    public String toString() {
        return v.n("\n            |" + this.x.getX() + StringUtils.SPACE + this.y.getX() + StringUtils.SPACE + this.z.getX() + "|\n            |" + this.x.getY() + StringUtils.SPACE + this.y.getY() + StringUtils.SPACE + this.z.getY() + "|\n            |" + this.x.getZ() + StringUtils.SPACE + this.y.getZ() + StringUtils.SPACE + this.z.getZ() + "|\n            ");
    }

    public final Mat3 unaryMinus() {
        return new Mat3(this.x.unaryMinus(), this.y.unaryMinus(), this.z.unaryMinus());
    }

    public Mat3(Float3 x10, Float3 y10, Float3 z10) {
        AbstractC4862t.e(x10, "x");
        AbstractC4862t.e(y10, "y");
        AbstractC4862t.e(z10, "z");
        this.x = x10;
        this.y = y10;
        this.z = z10;
    }

    public final boolean equals(float v10, float delta) {
        Float3 x10 = getX();
        if (Math.abs(x10.getX() - v10) >= delta || Math.abs(x10.getY() - v10) >= delta || Math.abs(x10.getZ() - v10) >= delta) {
            return false;
        }
        Float3 y10 = getY();
        if (Math.abs(y10.getX() - v10) >= delta || Math.abs(y10.getY() - v10) >= delta || Math.abs(y10.getZ() - v10) >= delta) {
            return false;
        }
        Float3 z10 = getZ();
        return Math.abs(z10.getX() - v10) < delta && Math.abs(z10.getY() - v10) < delta && Math.abs(z10.getZ() - v10) < delta;
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

    public /* synthetic */ Mat3(Float3 float3, Float3 float32, Float3 float33, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new Float3(1.0f, 0.0f, 0.0f, 6, null) : float3, (i10 & 2) != 0 ? new Float3(0.0f, 1.0f, 0.0f, 5, null) : float32, (i10 & 4) != 0 ? new Float3(0.0f, 0.0f, 1.0f, 3, null) : float33);
    }

    public final Float3 get(MatrixColumn column) {
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
        throw new IllegalArgumentException("column must be X, Y or Z");
    }

    public final Mat3 times(Mat3 m10) {
        AbstractC4862t.e(m10, "m");
        return new Mat3(new Float3((this.x.getX() * m10.x.getX()) + (this.y.getX() * m10.x.getY()) + (this.z.getX() * m10.x.getZ()), (this.x.getY() * m10.x.getX()) + (this.y.getY() * m10.x.getY()) + (this.z.getY() * m10.x.getZ()), (this.x.getZ() * m10.x.getX()) + (this.y.getZ() * m10.x.getY()) + (this.z.getZ() * m10.x.getZ())), new Float3((this.x.getX() * m10.y.getX()) + (this.y.getX() * m10.y.getY()) + (this.z.getX() * m10.y.getZ()), (this.x.getY() * m10.y.getX()) + (this.y.getY() * m10.y.getY()) + (this.z.getY() * m10.y.getZ()), (this.x.getZ() * m10.y.getX()) + (this.y.getZ() * m10.y.getY()) + (this.z.getZ() * m10.y.getZ())), new Float3((this.x.getX() * m10.z.getX()) + (this.y.getX() * m10.z.getY()) + (this.z.getX() * m10.z.getZ()), (this.x.getY() * m10.z.getX()) + (this.y.getY() * m10.z.getY()) + (this.z.getY() * m10.z.getZ()), (this.x.getZ() * m10.z.getX()) + (this.y.getZ() * m10.z.getY()) + (this.z.getZ() * m10.z.getZ())));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat3(Mat3 m10) {
        this(Float3.copy$default(m10.x, 0.0f, 0.0f, 0.0f, 7, null), Float3.copy$default(m10.y, 0.0f, 0.0f, 0.0f, 7, null), Float3.copy$default(m10.z, 0.0f, 0.0f, 0.0f, 7, null));
        AbstractC4862t.e(m10, "m");
    }

    public final float get(MatrixColumn column, int row) {
        AbstractC4862t.e(column, "column");
        return get(column).get(row);
    }

    public static /* synthetic */ boolean equals$default(Mat3 mat3, Mat3 m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(m10, "m");
        Float3 x10 = mat3.getX();
        Float3 x11 = m10.getX();
        if (Math.abs(x10.getX() - x11.getX()) >= f10 || Math.abs(x10.getY() - x11.getY()) >= f10 || Math.abs(x10.getZ() - x11.getZ()) >= f10) {
            return false;
        }
        Float3 y10 = mat3.getY();
        Float3 y11 = m10.getY();
        if (Math.abs(y10.getX() - y11.getX()) >= f10 || Math.abs(y10.getY() - y11.getY()) >= f10 || Math.abs(y10.getZ() - y11.getZ()) >= f10) {
            return false;
        }
        Float3 z10 = mat3.getZ();
        Float3 z11 = m10.getZ();
        return Math.abs(z10.getX() - z11.getX()) < f10 && Math.abs(z10.getY() - z11.getY()) < f10 && Math.abs(z10.getZ() - z11.getZ()) < f10;
    }

    public final boolean equals(Mat3 m10, float delta) {
        AbstractC4862t.e(m10, "m");
        Float3 x10 = getX();
        Float3 x11 = m10.getX();
        if (Math.abs(x10.getX() - x11.getX()) >= delta || Math.abs(x10.getY() - x11.getY()) >= delta || Math.abs(x10.getZ() - x11.getZ()) >= delta) {
            return false;
        }
        Float3 y10 = getY();
        Float3 y11 = m10.getY();
        if (Math.abs(y10.getX() - y11.getX()) >= delta || Math.abs(y10.getY() - y11.getY()) >= delta || Math.abs(y10.getZ() - y11.getZ()) >= delta) {
            return false;
        }
        Float3 z10 = getZ();
        Float3 z11 = m10.getZ();
        return Math.abs(z10.getX() - z11.getX()) < delta && Math.abs(z10.getY() - z11.getY()) < delta && Math.abs(z10.getZ() - z11.getZ()) < delta;
    }

    public final Float3 times(Float3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float3((this.x.getX() * v10.getX()) + (this.y.getX() * v10.getY()) + (this.z.getX() * v10.getZ()), (this.x.getY() * v10.getX()) + (this.y.getY() * v10.getY()) + (this.z.getY() * v10.getZ()), (this.x.getZ() * v10.getX()) + (this.y.getZ() * v10.getY()) + (this.z.getZ() * v10.getZ()));
    }

    public static /* synthetic */ Mat3 compareTo$default(Mat3 mat3, Mat3 m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(m10, "m");
        Float3 x10 = mat3.getX();
        Float3 x11 = m10.getX();
        Float3 float3 = new Float3(Math.abs(x10.getX() - x11.getX()) < f10 ? 0.0f : Float.compare(r3, r4), Math.abs(x10.getY() - x11.getY()) < f10 ? 0.0f : Float.compare(r4, r5), Math.abs(x10.getZ() - x11.getZ()) < f10 ? 0.0f : Float.compare(r0, r1));
        Float3 y10 = mat3.getY();
        Float3 y11 = m10.getY();
        Float3 float32 = new Float3(Math.abs(y10.getX() - y11.getX()) < f10 ? 0.0f : Float.compare(r4, r5), Math.abs(y10.getY() - y11.getY()) < f10 ? 0.0f : Float.compare(r5, r6), Math.abs(y10.getZ() - y11.getZ()) < f10 ? 0.0f : Float.compare(r0, r1));
        Float3 z10 = mat3.getZ();
        Float3 z11 = m10.getZ();
        return new Mat3(float3, float32, new Float3(Math.abs(z10.getX() - z11.getX()) < f10 ? 0.0f : Float.compare(r1, r4), Math.abs(z10.getY() - z11.getY()) < f10 ? 0.0f : Float.compare(r4, r5), Math.abs(z10.getZ() - z11.getZ()) >= f10 ? Float.compare(r8, r9) : 0.0f));
    }

    public final Mat3 compareTo(Mat3 m10, float delta) {
        AbstractC4862t.e(m10, "m");
        Float3 x10 = getX();
        Float3 x11 = m10.getX();
        Float3 float3 = new Float3(Math.abs(x10.getX() - x11.getX()) < delta ? 0.0f : Float.compare(r4, r5), Math.abs(x10.getY() - x11.getY()) < delta ? 0.0f : Float.compare(r5, r6), Math.abs(x10.getZ() - x11.getZ()) < delta ? 0.0f : Float.compare(r1, r2));
        Float3 y10 = getY();
        Float3 y11 = m10.getY();
        Float3 float32 = new Float3(Math.abs(y10.getX() - y11.getX()) < delta ? 0.0f : Float.compare(r5, r6), Math.abs(y10.getY() - y11.getY()) < delta ? 0.0f : Float.compare(r6, r8), Math.abs(y10.getZ() - y11.getZ()) < delta ? 0.0f : Float.compare(r1, r2));
        Float3 z10 = getZ();
        Float3 z11 = m10.getZ();
        return new Mat3(float3, float32, new Float3(Math.abs(z10.getX() - z11.getX()) < delta ? 0.0f : Float.compare(r2, r5), Math.abs(z10.getY() - z11.getY()) < delta ? 0.0f : Float.compare(r5, r6), Math.abs(z10.getZ() - z11.getZ()) >= delta ? Float.compare(r10, r11) : 0.0f));
    }
}
