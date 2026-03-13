package com.google.android.filament.utils;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0011J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0013\u0010\u0011J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0017J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0018J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010'\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010*R&\u00100\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010*R&\u00103\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010*R&\u00106\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010*R&\u00109\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010*R&\u0010=\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\bR&\u0010@\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010;\"\u0004\b?\u0010\bR&\u0010C\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010;\"\u0004\bB\u0010\b¨\u0006D"}, d2 = {"Lcom/google/android/filament/utils/Bool2;", "", "", "x", "y", "<init>", "(ZZ)V", "v", "(Lcom/google/android/filament/utils/Bool2;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get", "(Lcom/google/android/filament/utils/VectorComponent;)Z", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Bool2;", "", "(I)Z", "(II)Lcom/google/android/filament/utils/Bool2;", "invoke", "Lfc/H;", "set", "(IZ)V", "(IIZ)V", "(Lcom/google/android/filament/utils/VectorComponent;Z)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Z)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/google/android/filament/utils/Bool2;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getX", "setX", "(Z)V", "getY", "setY", "value", "getR", "setR", "r", "getG", "setG", "g", "getS", "setS", "s", "getT", "setT", "t", "getXy", "()Lcom/google/android/filament/utils/Bool2;", "setXy", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Bool2 {
    private boolean x;
    private boolean y;

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
    public Bool2() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public static /* synthetic */ Bool2 copy$default(Bool2 bool2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = bool2.x;
        }
        if ((i10 & 2) != 0) {
            z11 = bool2.y;
        }
        return bool2.copy(z10, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    public final Bool2 copy(boolean x10, boolean y10) {
        return new Bool2(x10, y10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bool2)) {
            return false;
        }
        Bool2 bool2 = (Bool2) other;
        return this.x == bool2.x && this.y == bool2.y;
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
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final boolean getG() {
        return getY();
    }

    public final boolean getR() {
        return getX();
    }

    public final Bool2 getRg() {
        return new Bool2(getX(), getY());
    }

    public final boolean getS() {
        return getX();
    }

    public final Bool2 getSt() {
        return new Bool2(getX(), getY());
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

    public final boolean getY() {
        return this.y;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.x) * 31) + Boolean.hashCode(this.y);
    }

    public final boolean invoke(int index) {
        return get(index - 1);
    }

    public final void set(int index, boolean v10) {
        if (index == 0) {
            this.x = v10;
        } else {
            if (index != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.y = v10;
        }
    }

    public final void setG(boolean z10) {
        setY(z10);
    }

    public final void setR(boolean z10) {
        setX(z10);
    }

    public final void setRg(Bool2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setS(boolean z10) {
        setX(z10);
    }

    public final void setSt(Bool2 value) {
        AbstractC4862t.e(value, "value");
        setX(value.getX());
        setY(value.getY());
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

    public final void setY(boolean z10) {
        this.y = z10;
    }

    public String toString() {
        return "Bool2(x=" + this.x + ", y=" + this.y + ")";
    }

    public Bool2(boolean z10, boolean z11) {
        this.x = z10;
        this.y = z11;
    }

    public /* synthetic */ Bool2(boolean z10, boolean z11, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool2(Bool2 v10) {
        this(v10.x, v10.y);
        AbstractC4862t.e(v10, "v");
    }

    public final void set(int index1, int index2, boolean v10) {
        set(index1, v10);
        set(index2, v10);
    }

    public final Bool2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Bool2(get(index1), get(index2));
    }

    public final boolean get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        throw new IllegalArgumentException("index must be in 0..1");
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
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final Bool2 get(int index1, int index2) {
        return new Bool2(get(index1), get(index2));
    }

    public final void set(VectorComponent index1, VectorComponent index2, boolean v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        set(index1, v10);
        set(index2, v10);
    }
}
