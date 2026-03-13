package com.google.android.filament.utils;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0012J \u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0011H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0012J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0018J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0019J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b!\u0010 J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\"\u0010 J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b#\u0010 J\"\u0010%\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b%\u0010&J\"\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b(\u0010)J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u001f\u0010*J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b!\u0010*J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\"\u0010*J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b#\u0010*J\"\u0010%\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b%\u0010+J\"\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b(\u0010,J'\u0010/\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u00105J$\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b7\u0010&J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010(\u001a\u00020'2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010>R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u00105\"\u0004\bA\u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010?\u001a\u0004\bB\u00105\"\u0004\bC\u0010\bR&\u0010G\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bE\u00105\"\u0004\bF\u0010\bR&\u0010J\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bH\u00105\"\u0004\bI\u0010\bR&\u0010M\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bK\u00105\"\u0004\bL\u0010\bR&\u0010P\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bN\u00105\"\u0004\bO\u0010\bR&\u0010S\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010\u001c\"\u0004\bR\u0010\tR&\u0010V\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010\u001c\"\u0004\bU\u0010\tR&\u0010Y\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\u001c\"\u0004\bX\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Z"}, d2 = {"Lcom/google/android/filament/utils/Float2;", "", "", "x", "y", "<init>", "(FF)V", "v", "(F)V", "(Lcom/google/android/filament/utils/Float2;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get", "(Lcom/google/android/filament/utils/VectorComponent;)F", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Float2;", "", "(I)F", "(II)Lcom/google/android/filament/utils/Float2;", "invoke", "Lfc/H;", "set", "(IF)V", "(IIF)V", "(Lcom/google/android/filament/utils/VectorComponent;F)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;F)V", "unaryMinus", "()Lcom/google/android/filament/utils/Float2;", "inc", "dec", IPTC.PREFIX_PLUS, "(F)Lcom/google/android/filament/utils/Float2;", "minus", "times", "div", "delta", "compareTo", "(FF)Lcom/google/android/filament/utils/Float2;", "", "equals", "(FF)Z", "(Lcom/google/android/filament/utils/Float2;)Lcom/google/android/filament/utils/Float2;", "(Lcom/google/android/filament/utils/Float2;F)Lcom/google/android/filament/utils/Float2;", "(Lcom/google/android/filament/utils/Float2;F)Z", "Lkotlin/Function1;", "block", "transform", "(Lvc/l;)Lcom/google/android/filament/utils/Float2;", "", "toFloatArray", "()[F", "component1", "()F", "component2", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "(Ljava/lang/Object;)Z", "F", "getX", "setX", "getY", "setY", "value", "getR", "setR", "r", "getG", "setG", "g", "getS", "setS", "s", "getT", "setT", "t", "getXy", "setXy", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Float2 {
    private float x;
    private float y;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Float2() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public static /* synthetic */ Float2 compareTo$default(Float2 float2, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new Float2(Math.abs(float2.getX() - f10) < f11 ? 0.0f : Float.compare(r0, f10), Math.abs(float2.getY() - f10) >= f11 ? Float.compare(r2, f10) : 0.0f);
    }

    public static /* synthetic */ Float2 copy$default(Float2 float2, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = float2.x;
        }
        if ((i10 & 2) != 0) {
            f11 = float2.y;
        }
        return float2.copy(f10, f11);
    }

    public static /* synthetic */ boolean equals$default(Float2 float2, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return Math.abs(float2.getX() - f10) < f11 && Math.abs(float2.getY() - f10) < f11;
    }

    public final Float2 compareTo(float v10, float delta) {
        return new Float2(Math.abs(getX() - v10) < delta ? 0.0f : Float.compare(r1, v10), Math.abs(getY() - v10) >= delta ? Float.compare(r4, v10) : 0.0f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final Float2 copy(float x10, float y10) {
        return new Float2(x10, y10);
    }

    public final Float2 dec() {
        float f10 = this.x;
        this.x = f10 - 1.0f;
        float f11 = this.y;
        this.y = (-1.0f) + f11;
        return new Float2(f10, f11);
    }

    public final Float2 div(float v10) {
        return new Float2(getX() / v10, getY() / v10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Float2)) {
            return false;
        }
        Float2 float2 = (Float2) other;
        return Float.compare(this.x, float2.x) == 0 && Float.compare(this.y, float2.y) == 0;
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
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final float getG() {
        return getY();
    }

    public final float getR() {
        return getX();
    }

    public final Float2 getRg() {
        return new Float2(getX(), getY());
    }

    public final float getS() {
        return getX();
    }

    public final Float2 getSt() {
        return new Float2(getX(), getY());
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

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
    }

    public final Float2 inc() {
        float f10 = this.x;
        this.x = f10 + 1.0f;
        float f11 = this.y;
        this.y = 1.0f + f11;
        return new Float2(f10, f11);
    }

    public final float invoke(int index) {
        return get(index - 1);
    }

    public final Float2 minus(float v10) {
        return new Float2(getX() - v10, getY() - v10);
    }

    public final Float2 plus(float v10) {
        return new Float2(getX() + v10, getY() + v10);
    }

    public final void set(int index, float v10) {
        if (index == 0) {
            this.x = v10;
        } else {
            if (index != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.y = v10;
        }
    }

    public final void setG(float f10) {
        setY(f10);
    }

    public final void setR(float f10) {
        setX(f10);
    }

    public final void setRg(Float2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setS(float f10) {
        setX(f10);
    }

    public final void setSt(Float2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
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

    public final void setY(float f10) {
        this.y = f10;
    }

    public final Float2 times(float v10) {
        return new Float2(getX() * v10, getY() * v10);
    }

    public final float[] toFloatArray() {
        return new float[]{this.x, this.y};
    }

    public String toString() {
        return "Float2(x=" + this.x + ", y=" + this.y + ")";
    }

    public final Float2 transform(l block) {
        AbstractC4862t.e(block, "block");
        setX(((Number) block.invoke(Float.valueOf(getX()))).floatValue());
        setY(((Number) block.invoke(Float.valueOf(getY()))).floatValue());
        return this;
    }

    public final Float2 unaryMinus() {
        return new Float2(-this.x, -this.y);
    }

    public Float2(float f10, float f11) {
        this.x = f10;
        this.y = f11;
    }

    public final Float2 div(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float2(getX() / v10.getX(), getY() / v10.getY());
    }

    public final boolean equals(float v10, float delta) {
        return Math.abs(getX() - v10) < delta && Math.abs(getY() - v10) < delta;
    }

    public final Float2 minus(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float2(getX() - v10.getX(), getY() - v10.getY());
    }

    public final Float2 plus(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float2(getX() + v10.getX(), getY() + v10.getY());
    }

    public final Float2 times(Float2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Float2(getX() * v10.getX(), getY() * v10.getY());
    }

    public /* synthetic */ Float2(float f10, float f11, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }

    public Float2(float f10) {
        this(f10, f10);
    }

    public final void set(int index1, int index2, float v10) {
        set(index1, v10);
        set(index2, v10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float2(Float2 v10) {
        this(v10.x, v10.y);
        AbstractC4862t.e(v10, "v");
    }

    public static /* synthetic */ boolean equals$default(Float2 float2, Float2 v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(v10, "v");
        return Math.abs(float2.getX() - v10.getX()) < f10 && Math.abs(float2.getY() - v10.getY()) < f10;
    }

    public final Float2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    public final boolean equals(Float2 v10, float delta) {
        AbstractC4862t.e(v10, "v");
        return Math.abs(getX() - v10.getX()) < delta && Math.abs(getY() - v10.getY()) < delta;
    }

    public final float get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        throw new IllegalArgumentException("index must be in 0..1");
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
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public static /* synthetic */ Float2 compareTo$default(Float2 float2, Float2 v10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        AbstractC4862t.e(v10, "v");
        return new Float2(Math.abs(float2.getX() - v10.getX()) < f10 ? 0.0f : Float.compare(r0, r1), Math.abs(float2.getY() - v10.getY()) >= f10 ? Float.compare(r3, r4) : 0.0f);
    }

    public final Float2 compareTo(Float2 v10, float delta) {
        AbstractC4862t.e(v10, "v");
        return new Float2(Math.abs(getX() - v10.getX()) < delta ? 0.0f : Float.compare(r1, r2), Math.abs(getY() - v10.getY()) >= delta ? Float.compare(r5, r6) : 0.0f);
    }

    public final Float2 get(int index1, int index2) {
        return new Float2(get(index1), get(index2));
    }

    public final void set(VectorComponent index1, VectorComponent index2, float v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        set(index1, v10);
        set(index2, v10);
    }
}
