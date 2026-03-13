package com.google.android.filament.utils;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b8\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0012J(\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0014J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0017J(\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0015H\u0086\n¢\u0006\u0004\b\u0019\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001dJ0\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001fJ(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001b\u0010 J0\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001b\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J.\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010#\"\u0004\b2\u00103R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00100\u001a\u0004\b4\u0010#\"\u0004\b5\u00103R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b6\u0010#\"\u0004\b7\u00103R&\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010#\"\u0004\b:\u00103R&\u0010>\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010#\"\u0004\b=\u00103R&\u0010A\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010#\"\u0004\b@\u00103R&\u0010D\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010#\"\u0004\bC\u00103R&\u0010G\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010#\"\u0004\bF\u00103R&\u0010J\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010#\"\u0004\bI\u00103R&\u0010O\u001a\u00020\b2\u0006\u00108\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR&\u0010R\u001a\u00020\b2\u0006\u00108\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010L\"\u0004\bQ\u0010NR&\u0010U\u001a\u00020\b2\u0006\u00108\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010L\"\u0004\bT\u0010NR&\u0010Y\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010\u000bR&\u0010\\\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010W\"\u0004\b[\u0010\u000bR&\u0010_\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010W\"\u0004\b^\u0010\u000b¨\u0006`"}, d2 = {"Lcom/google/android/filament/utils/Bool3;", "", "", "x", "y", "z", "<init>", "(ZZZ)V", "Lcom/google/android/filament/utils/Bool2;", "v", "(Lcom/google/android/filament/utils/Bool2;Z)V", "(Lcom/google/android/filament/utils/Bool3;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get", "(Lcom/google/android/filament/utils/VectorComponent;)Z", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Bool2;", "index3", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Bool3;", "", "(I)Z", "(II)Lcom/google/android/filament/utils/Bool2;", "(III)Lcom/google/android/filament/utils/Bool3;", "invoke", "Lfc/H;", "set", "(IZ)V", "(IIZ)V", "(IIIZ)V", "(Lcom/google/android/filament/utils/VectorComponent;Z)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Z)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Z)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/google/android/filament/utils/Bool3;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getX", "setX", "(Z)V", "getY", "setY", "getZ", "setZ", "value", "getR", "setR", "r", "getG", "setG", "g", "getB", "setB", "b", "getS", "setS", "s", "getT", "setT", "t", "getP", "setP", "p", "getXy", "()Lcom/google/android/filament/utils/Bool2;", "setXy", "(Lcom/google/android/filament/utils/Bool2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "getRgb", "()Lcom/google/android/filament/utils/Bool3;", "setRgb", "rgb", "getXyz", "setXyz", "xyz", "getStp", "setStp", "stp", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Bool3 {
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Bool3() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ Bool3 copy$default(Bool3 bool3, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = bool3.x;
        }
        if ((i10 & 2) != 0) {
            z11 = bool3.y;
        }
        if ((i10 & 4) != 0) {
            z12 = bool3.z;
        }
        return bool3.copy(z10, z11, z12);
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

    public final Bool3 copy(boolean x10, boolean y10, boolean z10) {
        return new Bool3(x10, y10, z10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bool3)) {
            return false;
        }
        Bool3 bool3 = (Bool3) other;
        return this.x == bool3.x && this.y == bool3.y && this.z == bool3.z;
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
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
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

    public final boolean getR() {
        return getX();
    }

    public final Bool2 getRg() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getRgb() {
        return new Bool3(getX(), getY(), getZ());
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

    public final boolean getT() {
        return getY();
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

    public final boolean getY() {
        return this.y;
    }

    public final boolean getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.x) * 31) + Boolean.hashCode(this.y)) * 31) + Boolean.hashCode(this.z);
    }

    public final boolean invoke(int index) {
        return get(index - 1);
    }

    public final void set(int index, boolean v10) {
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

    public final void setB(boolean z10) {
        setZ(z10);
    }

    public final void setG(boolean z10) {
        setY(z10);
    }

    public final void setP(boolean z10) {
        setZ(z10);
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

    public final void setT(boolean z10) {
        setY(z10);
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

    public final void setY(boolean z10) {
        this.y = z10;
    }

    public final void setZ(boolean z10) {
        this.z = z10;
    }

    public String toString() {
        return "Bool3(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
    }

    public Bool3(boolean z10, boolean z11, boolean z12) {
        this.x = z10;
        this.y = z11;
        this.z = z12;
    }

    public /* synthetic */ Bool3(boolean z10, boolean z11, boolean z12, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool3(Bool2 v10, boolean z10) {
        this(v10.getX(), v10.getY(), z10);
        AbstractC4862t.e(v10, "v");
    }

    public /* synthetic */ Bool3(Bool2 bool2, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(bool2, (i10 & 2) != 0 ? false : z10);
    }

    public final void set(int index1, int index2, boolean v10) {
        set(index1, v10);
        set(index2, v10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool3(Bool3 v10) {
        this(v10.x, v10.y, v10.z);
        AbstractC4862t.e(v10, "v");
    }

    public final Bool2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Bool2(get(index1), get(index2));
    }

    public final Bool3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        return new Bool3(get(index1), get(index2), get(index3));
    }

    public final void set(int index1, int index2, int index3, boolean v10) {
        set(index1, v10);
        set(index2, v10);
        set(index3, v10);
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
        throw new IllegalArgumentException("index must be in 0..2");
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
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final Bool2 get(int index1, int index2) {
        return new Bool2(get(index1), get(index2));
    }

    public final Bool3 get(int index1, int index2, int index3) {
        return new Bool3(get(index1), get(index2), get(index3));
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
}
