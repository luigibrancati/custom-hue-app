package com.google.android.filament.utils;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0013J \u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0012H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u001dJ(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010 J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b&\u0010$J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b(\u0010$J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b*\u0010$J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b%\u0010,J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b'\u0010,J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b)\u0010,J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b+\u0010,J'\u0010/\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050-H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0010\u00106\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00108\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b7\u00105J$\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bC\u0010DR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u00105\"\u0004\bG\u0010HR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010E\u001a\u0004\bI\u00105\"\u0004\bJ\u0010HR&\u0010N\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bL\u00105\"\u0004\bM\u0010HR&\u0010Q\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bO\u00105\"\u0004\bP\u0010HR&\u0010T\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bR\u00105\"\u0004\bS\u0010HR&\u0010W\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bU\u00105\"\u0004\bV\u0010HR&\u0010Z\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010 \"\u0004\bY\u0010\u0004R&\u0010]\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010 \"\u0004\b\\\u0010\u0004R&\u0010`\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010 \"\u0004\b_\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006a"}, d2 = {"Lcom/google/android/filament/utils/Half2;", "", "v", "<init>", "(Lcom/google/android/filament/utils/Half2;)V", "Lcom/google/android/filament/utils/Half;", "x", "y", "(SSLkotlin/jvm/internal/k;)V", "(SLkotlin/jvm/internal/k;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get-YoEgL-c", "(Lcom/google/android/filament/utils/VectorComponent;)S", "get", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Half2;", "", "(I)S", "(II)Lcom/google/android/filament/utils/Half2;", "invoke-YoEgL-c", "invoke", "Lfc/H;", "set-2gewN4s", "(IS)V", "set", "set-Zf4qYnQ", "(IIS)V", "(Lcom/google/android/filament/utils/VectorComponent;S)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;S)V", "unaryMinus", "()Lcom/google/android/filament/utils/Half2;", "inc", "dec", "plus-FqSqZzs", "(S)Lcom/google/android/filament/utils/Half2;", IPTC.PREFIX_PLUS, "minus-FqSqZzs", "minus", "times-FqSqZzs", "times", "div-FqSqZzs", "div", "(Lcom/google/android/filament/utils/Half2;)Lcom/google/android/filament/utils/Half2;", "Lkotlin/Function1;", "block", "transform", "(Lvc/l;)Lcom/google/android/filament/utils/Half2;", "", "toFloatArray", "()[F", "component1-SjiOe_E", "()S", "component1", "component2-SjiOe_E", "component2", "copy-IX2I5L0", "(SS)Lcom/google/android/filament/utils/Half2;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "S", "getX-SjiOe_E", "setX-FqSqZzs", "(S)V", "getY-SjiOe_E", "setY-FqSqZzs", "value", "getR-SjiOe_E", "setR-FqSqZzs", "r", "getG-SjiOe_E", "setG-FqSqZzs", "g", "getS-SjiOe_E", "setS-FqSqZzs", "s", "getT-SjiOe_E", "setT-FqSqZzs", "t", "getXy", "setXy", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Half2 {
    private short x;
    private short y;

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

    public /* synthetic */ Half2(short s10, AbstractC4854k abstractC4854k) {
        this(s10);
    }

    /* JADX INFO: renamed from: copy-IX2I5L0$default, reason: not valid java name */
    public static /* synthetic */ Half2 m61copyIX2I5L0$default(Half2 half2, short s10, short s11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = half2.x;
        }
        if ((i10 & 2) != 0) {
            s11 = half2.y;
        }
        return half2.m64copyIX2I5L0(s10, s11);
    }

    /* JADX INFO: renamed from: component1-SjiOe_E, reason: not valid java name and from getter */
    public final short getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2-SjiOe_E, reason: not valid java name and from getter */
    public final short getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: copy-IX2I5L0, reason: not valid java name */
    public final Half2 m64copyIX2I5L0(short x10, short y10) {
        return new Half2(x10, y10, null);
    }

    public final Half2 dec() {
        short s10 = this.x;
        this.x = Half.m12decSjiOe_E(s10);
        short s11 = this.y;
        this.y = Half.m12decSjiOe_E(s11);
        return new Half2(s10, s11, null);
    }

    public final Half2 div(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half2(Half.m13div5SPjhV8(m72getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m13div5SPjhV8(m73getYSjiOe_E(), v10.m73getYSjiOe_E()), null);
    }

    /* JADX INFO: renamed from: div-FqSqZzs, reason: not valid java name */
    public final Half2 m65divFqSqZzs(short v10) {
        return new Half2(Half.m13div5SPjhV8(m72getXSjiOe_E(), v10), Half.m13div5SPjhV8(m73getYSjiOe_E(), v10), null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Half2)) {
            return false;
        }
        Half2 half2 = (Half2) other;
        return Half.m15equalsimpl0(this.x, half2.x) && Half.m15equalsimpl0(this.y, half2.y);
    }

    public final Half2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Half2(m67getYoEgLc(index1), m67getYoEgLc(index2), null);
    }

    /* JADX INFO: renamed from: get-YoEgL-c, reason: not valid java name */
    public final short m67getYoEgLc(VectorComponent index) {
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

    /* JADX INFO: renamed from: getG-SjiOe_E, reason: not valid java name */
    public final short m68getGSjiOe_E() {
        return m73getYSjiOe_E();
    }

    /* JADX INFO: renamed from: getR-SjiOe_E, reason: not valid java name */
    public final short m69getRSjiOe_E() {
        return m72getXSjiOe_E();
    }

    public final Half2 getRg() {
        return new Half2(m72getXSjiOe_E(), m73getYSjiOe_E(), null);
    }

    /* JADX INFO: renamed from: getS-SjiOe_E, reason: not valid java name */
    public final short m70getSSjiOe_E() {
        return m72getXSjiOe_E();
    }

    public final Half2 getSt() {
        return new Half2(m72getXSjiOe_E(), m73getYSjiOe_E(), null);
    }

    /* JADX INFO: renamed from: getT-SjiOe_E, reason: not valid java name */
    public final short m71getTSjiOe_E() {
        return m73getYSjiOe_E();
    }

    /* JADX INFO: renamed from: getX-SjiOe_E, reason: not valid java name */
    public final short m72getXSjiOe_E() {
        return this.x;
    }

    public final Half2 getXy() {
        return new Half2(m72getXSjiOe_E(), m73getYSjiOe_E(), null);
    }

    /* JADX INFO: renamed from: getY-SjiOe_E, reason: not valid java name */
    public final short m73getYSjiOe_E() {
        return this.y;
    }

    public int hashCode() {
        return (Half.m21hashCodeimpl(this.x) * 31) + Half.m21hashCodeimpl(this.y);
    }

    public final Half2 inc() {
        short s10 = this.x;
        this.x = Half.m22incSjiOe_E(s10);
        short s11 = this.y;
        this.y = Half.m22incSjiOe_E(s11);
        return new Half2(s10, s11, null);
    }

    /* JADX INFO: renamed from: invoke-YoEgL-c, reason: not valid java name */
    public final short m74invokeYoEgLc(int index) {
        return m66getYoEgLc(index - 1);
    }

    public final Half2 minus(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half2(Half.m28minus5SPjhV8(m72getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m28minus5SPjhV8(m73getYSjiOe_E(), v10.m73getYSjiOe_E()), null);
    }

    /* JADX INFO: renamed from: minus-FqSqZzs, reason: not valid java name */
    public final Half2 m75minusFqSqZzs(short v10) {
        return new Half2(Half.m28minus5SPjhV8(m72getXSjiOe_E(), v10), Half.m28minus5SPjhV8(m73getYSjiOe_E(), v10), null);
    }

    public final Half2 plus(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half2(Half.m32plus5SPjhV8(m72getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m32plus5SPjhV8(m73getYSjiOe_E(), v10.m73getYSjiOe_E()), null);
    }

    /* JADX INFO: renamed from: plus-FqSqZzs, reason: not valid java name */
    public final Half2 m76plusFqSqZzs(short v10) {
        return new Half2(Half.m32plus5SPjhV8(m72getXSjiOe_E(), v10), Half.m32plus5SPjhV8(m73getYSjiOe_E(), v10), null);
    }

    /* JADX INFO: renamed from: set-2gewN4s, reason: not valid java name */
    public final void m77set2gewN4s(int index, short v10) {
        if (index == 0) {
            this.x = v10;
        } else {
            if (index != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.y = v10;
        }
    }

    /* JADX INFO: renamed from: set-Zf4qYnQ, reason: not valid java name */
    public final void m79setZf4qYnQ(int index1, int index2, short v10) {
        m77set2gewN4s(index1, v10);
        m77set2gewN4s(index2, v10);
    }

    /* JADX INFO: renamed from: setG-FqSqZzs, reason: not valid java name */
    public final void m81setGFqSqZzs(short s10) {
        m86setYFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setR-FqSqZzs, reason: not valid java name */
    public final void m82setRFqSqZzs(short s10) {
        m85setXFqSqZzs(s10);
    }

    public final void setRg(Half2 value) {
        AbstractC4862t.e(value, "value");
        m85setXFqSqZzs(value.m72getXSjiOe_E());
        m86setYFqSqZzs(value.m73getYSjiOe_E());
    }

    /* JADX INFO: renamed from: setS-FqSqZzs, reason: not valid java name */
    public final void m83setSFqSqZzs(short s10) {
        m85setXFqSqZzs(s10);
    }

    public final void setSt(Half2 value) {
        AbstractC4862t.e(value, "value");
        m85setXFqSqZzs(value.m72getXSjiOe_E());
        m86setYFqSqZzs(value.m73getYSjiOe_E());
    }

    /* JADX INFO: renamed from: setT-FqSqZzs, reason: not valid java name */
    public final void m84setTFqSqZzs(short s10) {
        m86setYFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setX-FqSqZzs, reason: not valid java name */
    public final void m85setXFqSqZzs(short s10) {
        this.x = s10;
    }

    public final void setXy(Half2 value) {
        AbstractC4862t.e(value, "value");
        m85setXFqSqZzs(value.m72getXSjiOe_E());
        m86setYFqSqZzs(value.m73getYSjiOe_E());
    }

    /* JADX INFO: renamed from: setY-FqSqZzs, reason: not valid java name */
    public final void m86setYFqSqZzs(short s10) {
        this.y = s10;
    }

    public final Half2 times(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half2(Half.m35times5SPjhV8(m72getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m35times5SPjhV8(m73getYSjiOe_E(), v10.m73getYSjiOe_E()), null);
    }

    /* JADX INFO: renamed from: times-FqSqZzs, reason: not valid java name */
    public final Half2 m87timesFqSqZzs(short v10) {
        return new Half2(Half.m35times5SPjhV8(m72getXSjiOe_E(), v10), Half.m35times5SPjhV8(m73getYSjiOe_E(), v10), null);
    }

    public final float[] toFloatArray() {
        return new float[]{Half.m39toFloatimpl(this.x), Half.m39toFloatimpl(this.y)};
    }

    public String toString() {
        return "Half2(x=" + Half.m44toStringimpl(this.x) + ", y=" + Half.m44toStringimpl(this.y) + ")";
    }

    public final Half2 transform(l block) {
        AbstractC4862t.e(block, "block");
        m85setXFqSqZzs(((Half) block.invoke(Half.m9boximpl(m72getXSjiOe_E()))).getV());
        m86setYFqSqZzs(((Half) block.invoke(Half.m9boximpl(m73getYSjiOe_E()))).getV());
        return this;
    }

    public final Half2 unaryMinus() {
        return new Half2(Half.m45unaryMinusSjiOe_E(this.x), Half.m45unaryMinusSjiOe_E(this.y), null);
    }

    public /* synthetic */ Half2(short s10, short s11, AbstractC4854k abstractC4854k) {
        this(s10, s11);
    }

    public final Half2 get(int index1, int index2) {
        return new Half2(m66getYoEgLc(index1), m66getYoEgLc(index2), null);
    }

    private Half2(short s10, short s11) {
        this.x = s10;
        this.y = s11;
    }

    /* JADX INFO: renamed from: set-Zf4qYnQ, reason: not valid java name */
    public final void m80setZf4qYnQ(VectorComponent index1, VectorComponent index2, short v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        m78set2gewN4s(index1, v10);
        m78set2gewN4s(index2, v10);
    }

    public /* synthetic */ Half2(short s10, short s11, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s10, (i10 & 2) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s11, null);
    }

    /* JADX INFO: renamed from: set-2gewN4s, reason: not valid java name */
    public final void m78set2gewN4s(VectorComponent index, short v10) {
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

    private Half2(short s10) {
        this(s10, s10, null);
    }

    /* JADX INFO: renamed from: get-YoEgL-c, reason: not valid java name */
    public final short m66getYoEgLc(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        throw new IllegalArgumentException("index must be in 0..1");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Half2(Half2 v10) {
        this(v10.x, v10.y, null);
        AbstractC4862t.e(v10, "v");
    }
}
