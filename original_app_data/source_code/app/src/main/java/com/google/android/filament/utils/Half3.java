package com.google.android.filament.utils;

import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.IPTC;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u000b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0014J(\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0018J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0019J(\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0017H\u0086\n¢\u0006\u0004\b\u001b\u0010\u0018J \u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010 \u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b!\u0010\"J0\u0010 \u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b#\u0010$J \u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u001e\u0010%J(\u0010 \u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b!\u0010&J0\u0010 \u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b#\u0010'J\u0010\u0010(\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010)J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b,\u0010-J\u0018\u00100\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b/\u0010-J\u0018\u00102\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b1\u0010-J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b3\u0010-J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b.\u00105J\u0018\u00100\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b0\u00105J\u0018\u00102\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b2\u00105J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b4\u00105J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b.\u00106J\u0018\u00100\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b0\u00106J\u0018\u00102\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b2\u00106J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b4\u00106J'\u00109\u001a\u00020\u00002\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000507H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0010\u0010@\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010B\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bA\u0010?J\u0010\u0010D\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bC\u0010?J.\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010I\u001a\u00020HHÖ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010O\u001a\u00020N2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bO\u0010PR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010Q\u001a\u0004\bR\u0010?\"\u0004\bS\u0010TR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010Q\u001a\u0004\bU\u0010?\"\u0004\bV\u0010TR\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010Q\u001a\u0004\bW\u0010?\"\u0004\bX\u0010TR&\u0010\\\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010?\"\u0004\b[\u0010TR&\u0010_\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010?\"\u0004\b^\u0010TR&\u0010b\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010?\"\u0004\ba\u0010TR&\u0010e\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010?\"\u0004\bd\u0010TR&\u0010h\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010?\"\u0004\bg\u0010TR&\u0010k\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010?\"\u0004\bj\u0010TR&\u0010p\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR&\u0010s\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010m\"\u0004\br\u0010oR&\u0010v\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010m\"\u0004\bu\u0010oR&\u0010y\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010)\"\u0004\bx\u0010\u0004R&\u0010|\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010)\"\u0004\b{\u0010\u0004R&\u0010\u007f\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010)\"\u0004\b~\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0080\u0001"}, d2 = {"Lcom/google/android/filament/utils/Half3;", "", "v", "<init>", "(Lcom/google/android/filament/utils/Half3;)V", "Lcom/google/android/filament/utils/Half;", "x", "y", "z", "(SSSLkotlin/jvm/internal/k;)V", "(SLkotlin/jvm/internal/k;)V", "Lcom/google/android/filament/utils/Half2;", "(Lcom/google/android/filament/utils/Half2;SLkotlin/jvm/internal/k;)V", "Lcom/google/android/filament/utils/VectorComponent;", "index", "get-YoEgL-c", "(Lcom/google/android/filament/utils/VectorComponent;)S", "get", "index1", "index2", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Half2;", "index3", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;)Lcom/google/android/filament/utils/Half3;", "", "(I)S", "(II)Lcom/google/android/filament/utils/Half2;", "(III)Lcom/google/android/filament/utils/Half3;", "invoke-YoEgL-c", "invoke", "Lfc/H;", "set-2gewN4s", "(IS)V", "set", "set-Zf4qYnQ", "(IIS)V", "set-lJVBvKs", "(IIIS)V", "(Lcom/google/android/filament/utils/VectorComponent;S)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;S)V", "(Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;Lcom/google/android/filament/utils/VectorComponent;S)V", "unaryMinus", "()Lcom/google/android/filament/utils/Half3;", "inc", "dec", "plus-FqSqZzs", "(S)Lcom/google/android/filament/utils/Half3;", IPTC.PREFIX_PLUS, "minus-FqSqZzs", "minus", "times-FqSqZzs", "times", "div-FqSqZzs", "div", "(Lcom/google/android/filament/utils/Half2;)Lcom/google/android/filament/utils/Half3;", "(Lcom/google/android/filament/utils/Half3;)Lcom/google/android/filament/utils/Half3;", "Lkotlin/Function1;", "block", "transform", "(Lvc/l;)Lcom/google/android/filament/utils/Half3;", "", "toFloatArray", "()[F", "component1-SjiOe_E", "()S", "component1", "component2-SjiOe_E", "component2", "component3-SjiOe_E", "component3", "copy-rDq7ZDw", "(SSS)Lcom/google/android/filament/utils/Half3;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "S", "getX-SjiOe_E", "setX-FqSqZzs", "(S)V", "getY-SjiOe_E", "setY-FqSqZzs", "getZ-SjiOe_E", "setZ-FqSqZzs", "value", "getR-SjiOe_E", "setR-FqSqZzs", "r", "getG-SjiOe_E", "setG-FqSqZzs", "g", "getB-SjiOe_E", "setB-FqSqZzs", "b", "getS-SjiOe_E", "setS-FqSqZzs", "s", "getT-SjiOe_E", "setT-FqSqZzs", "t", "getP-SjiOe_E", "setP-FqSqZzs", "p", "getXy", "()Lcom/google/android/filament/utils/Half2;", "setXy", "(Lcom/google/android/filament/utils/Half2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "getRgb", "setRgb", "rgb", "getXyz", "setXyz", "xyz", "getStp", "setStp", "stp", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Half3 {
    private short x;
    private short y;
    private short z;

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

    public /* synthetic */ Half3(Half2 half2, short s10, AbstractC4854k abstractC4854k) {
        this(half2, s10);
    }

    /* JADX INFO: renamed from: copy-rDq7ZDw$default, reason: not valid java name */
    public static /* synthetic */ Half3 m88copyrDq7ZDw$default(Half3 half3, short s10, short s11, short s12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s10 = half3.x;
        }
        if ((i10 & 2) != 0) {
            s11 = half3.y;
        }
        if ((i10 & 4) != 0) {
            s12 = half3.z;
        }
        return half3.m92copyrDq7ZDw(s10, s11, s12);
    }

    /* JADX INFO: renamed from: component1-SjiOe_E, reason: not valid java name and from getter */
    public final short getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2-SjiOe_E, reason: not valid java name and from getter */
    public final short getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3-SjiOe_E, reason: not valid java name and from getter */
    public final short getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: copy-rDq7ZDw, reason: not valid java name */
    public final Half3 m92copyrDq7ZDw(short x10, short y10, short z10) {
        return new Half3(x10, y10, z10, (AbstractC4854k) null);
    }

    public final Half3 dec() {
        short s10 = this.x;
        this.x = Half.m12decSjiOe_E(s10);
        short s11 = this.y;
        this.y = Half.m12decSjiOe_E(s11);
        short s12 = this.z;
        this.z = Half.m12decSjiOe_E(s12);
        return new Half3(s10, s11, s12, (AbstractC4854k) null);
    }

    public final Half3 div(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half3(Half.m13div5SPjhV8(m102getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m13div5SPjhV8(m103getYSjiOe_E(), v10.m73getYSjiOe_E()), m104getZSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: div-FqSqZzs, reason: not valid java name */
    public final Half3 m93divFqSqZzs(short v10) {
        return new Half3(Half.m13div5SPjhV8(m102getXSjiOe_E(), v10), Half.m13div5SPjhV8(m103getYSjiOe_E(), v10), Half.m13div5SPjhV8(m104getZSjiOe_E(), v10), (AbstractC4854k) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Half3)) {
            return false;
        }
        Half3 half3 = (Half3) other;
        return Half.m15equalsimpl0(this.x, half3.x) && Half.m15equalsimpl0(this.y, half3.y) && Half.m15equalsimpl0(this.z, half3.z);
    }

    public final Half2 get(VectorComponent index1, VectorComponent index2) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        return new Half2(m95getYoEgLc(index1), m95getYoEgLc(index2), null);
    }

    /* JADX INFO: renamed from: get-YoEgL-c, reason: not valid java name */
    public final short m95getYoEgLc(VectorComponent index) {
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

    /* JADX INFO: renamed from: getB-SjiOe_E, reason: not valid java name */
    public final short m96getBSjiOe_E() {
        return m104getZSjiOe_E();
    }

    /* JADX INFO: renamed from: getG-SjiOe_E, reason: not valid java name */
    public final short m97getGSjiOe_E() {
        return m103getYSjiOe_E();
    }

    /* JADX INFO: renamed from: getP-SjiOe_E, reason: not valid java name */
    public final short m98getPSjiOe_E() {
        return m104getZSjiOe_E();
    }

    /* JADX INFO: renamed from: getR-SjiOe_E, reason: not valid java name */
    public final short m99getRSjiOe_E() {
        return m102getXSjiOe_E();
    }

    public final Half2 getRg() {
        return new Half2(m102getXSjiOe_E(), m103getYSjiOe_E(), null);
    }

    public final Half3 getRgb() {
        return new Half3(m102getXSjiOe_E(), m103getYSjiOe_E(), m104getZSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: getS-SjiOe_E, reason: not valid java name */
    public final short m100getSSjiOe_E() {
        return m102getXSjiOe_E();
    }

    public final Half2 getSt() {
        return new Half2(m102getXSjiOe_E(), m103getYSjiOe_E(), null);
    }

    public final Half3 getStp() {
        return new Half3(m102getXSjiOe_E(), m103getYSjiOe_E(), m104getZSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: getT-SjiOe_E, reason: not valid java name */
    public final short m101getTSjiOe_E() {
        return m103getYSjiOe_E();
    }

    /* JADX INFO: renamed from: getX-SjiOe_E, reason: not valid java name */
    public final short m102getXSjiOe_E() {
        return this.x;
    }

    public final Half2 getXy() {
        return new Half2(m102getXSjiOe_E(), m103getYSjiOe_E(), null);
    }

    public final Half3 getXyz() {
        return new Half3(m102getXSjiOe_E(), m103getYSjiOe_E(), m104getZSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: getY-SjiOe_E, reason: not valid java name */
    public final short m103getYSjiOe_E() {
        return this.y;
    }

    /* JADX INFO: renamed from: getZ-SjiOe_E, reason: not valid java name */
    public final short m104getZSjiOe_E() {
        return this.z;
    }

    public int hashCode() {
        return (((Half.m21hashCodeimpl(this.x) * 31) + Half.m21hashCodeimpl(this.y)) * 31) + Half.m21hashCodeimpl(this.z);
    }

    public final Half3 inc() {
        short s10 = this.x;
        this.x = Half.m22incSjiOe_E(s10);
        short s11 = this.y;
        this.y = Half.m22incSjiOe_E(s11);
        short s12 = this.z;
        this.z = Half.m22incSjiOe_E(s12);
        return new Half3(s10, s11, s12, (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: invoke-YoEgL-c, reason: not valid java name */
    public final short m105invokeYoEgLc(int index) {
        return m94getYoEgLc(index - 1);
    }

    public final Half3 minus(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half3(Half.m28minus5SPjhV8(m102getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m28minus5SPjhV8(m103getYSjiOe_E(), v10.m73getYSjiOe_E()), m104getZSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: minus-FqSqZzs, reason: not valid java name */
    public final Half3 m106minusFqSqZzs(short v10) {
        return new Half3(Half.m28minus5SPjhV8(m102getXSjiOe_E(), v10), Half.m28minus5SPjhV8(m103getYSjiOe_E(), v10), Half.m28minus5SPjhV8(m104getZSjiOe_E(), v10), (AbstractC4854k) null);
    }

    public final Half3 plus(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half3(Half.m32plus5SPjhV8(m102getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m32plus5SPjhV8(m103getYSjiOe_E(), v10.m73getYSjiOe_E()), m104getZSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: plus-FqSqZzs, reason: not valid java name */
    public final Half3 m107plusFqSqZzs(short v10) {
        return new Half3(Half.m32plus5SPjhV8(m102getXSjiOe_E(), v10), Half.m32plus5SPjhV8(m103getYSjiOe_E(), v10), Half.m32plus5SPjhV8(m104getZSjiOe_E(), v10), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: set-2gewN4s, reason: not valid java name */
    public final void m108set2gewN4s(int index, short v10) {
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

    /* JADX INFO: renamed from: set-Zf4qYnQ, reason: not valid java name */
    public final void m110setZf4qYnQ(int index1, int index2, short v10) {
        m108set2gewN4s(index1, v10);
        m108set2gewN4s(index2, v10);
    }

    /* JADX INFO: renamed from: set-lJVBvKs, reason: not valid java name */
    public final void m112setlJVBvKs(int index1, int index2, int index3, short v10) {
        m108set2gewN4s(index1, v10);
        m108set2gewN4s(index2, v10);
        m108set2gewN4s(index3, v10);
    }

    /* JADX INFO: renamed from: setB-FqSqZzs, reason: not valid java name */
    public final void m114setBFqSqZzs(short s10) {
        m122setZFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setG-FqSqZzs, reason: not valid java name */
    public final void m115setGFqSqZzs(short s10) {
        m121setYFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setP-FqSqZzs, reason: not valid java name */
    public final void m116setPFqSqZzs(short s10) {
        m122setZFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setR-FqSqZzs, reason: not valid java name */
    public final void m117setRFqSqZzs(short s10) {
        m120setXFqSqZzs(s10);
    }

    public final void setRg(Half2 value) {
        AbstractC4862t.e(value, "value");
        m120setXFqSqZzs(value.m72getXSjiOe_E());
        m121setYFqSqZzs(value.m73getYSjiOe_E());
    }

    public final void setRgb(Half3 value) {
        AbstractC4862t.e(value, "value");
        m120setXFqSqZzs(value.m102getXSjiOe_E());
        m121setYFqSqZzs(value.m103getYSjiOe_E());
        m122setZFqSqZzs(value.m104getZSjiOe_E());
    }

    /* JADX INFO: renamed from: setS-FqSqZzs, reason: not valid java name */
    public final void m118setSFqSqZzs(short s10) {
        m120setXFqSqZzs(s10);
    }

    public final void setSt(Half2 value) {
        AbstractC4862t.e(value, "value");
        m120setXFqSqZzs(value.m72getXSjiOe_E());
        m121setYFqSqZzs(value.m73getYSjiOe_E());
    }

    public final void setStp(Half3 value) {
        AbstractC4862t.e(value, "value");
        m120setXFqSqZzs(value.m102getXSjiOe_E());
        m121setYFqSqZzs(value.m103getYSjiOe_E());
        m122setZFqSqZzs(value.m104getZSjiOe_E());
    }

    /* JADX INFO: renamed from: setT-FqSqZzs, reason: not valid java name */
    public final void m119setTFqSqZzs(short s10) {
        m121setYFqSqZzs(s10);
    }

    /* JADX INFO: renamed from: setX-FqSqZzs, reason: not valid java name */
    public final void m120setXFqSqZzs(short s10) {
        this.x = s10;
    }

    public final void setXy(Half2 value) {
        AbstractC4862t.e(value, "value");
        m120setXFqSqZzs(value.m72getXSjiOe_E());
        m121setYFqSqZzs(value.m73getYSjiOe_E());
    }

    public final void setXyz(Half3 value) {
        AbstractC4862t.e(value, "value");
        m120setXFqSqZzs(value.m102getXSjiOe_E());
        m121setYFqSqZzs(value.m103getYSjiOe_E());
        m122setZFqSqZzs(value.m104getZSjiOe_E());
    }

    /* JADX INFO: renamed from: setY-FqSqZzs, reason: not valid java name */
    public final void m121setYFqSqZzs(short s10) {
        this.y = s10;
    }

    /* JADX INFO: renamed from: setZ-FqSqZzs, reason: not valid java name */
    public final void m122setZFqSqZzs(short s10) {
        this.z = s10;
    }

    public final Half3 times(Half2 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half3(Half.m35times5SPjhV8(m102getXSjiOe_E(), v10.m72getXSjiOe_E()), Half.m35times5SPjhV8(m103getYSjiOe_E(), v10.m73getYSjiOe_E()), m104getZSjiOe_E(), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: times-FqSqZzs, reason: not valid java name */
    public final Half3 m123timesFqSqZzs(short v10) {
        return new Half3(Half.m35times5SPjhV8(m102getXSjiOe_E(), v10), Half.m35times5SPjhV8(m103getYSjiOe_E(), v10), Half.m35times5SPjhV8(m104getZSjiOe_E(), v10), (AbstractC4854k) null);
    }

    public final float[] toFloatArray() {
        return new float[]{Half.m39toFloatimpl(this.x), Half.m39toFloatimpl(this.y), Half.m39toFloatimpl(this.z)};
    }

    public String toString() {
        return "Half3(x=" + Half.m44toStringimpl(this.x) + ", y=" + Half.m44toStringimpl(this.y) + ", z=" + Half.m44toStringimpl(this.z) + ")";
    }

    public final Half3 transform(l block) {
        AbstractC4862t.e(block, "block");
        m120setXFqSqZzs(((Half) block.invoke(Half.m9boximpl(m102getXSjiOe_E()))).getV());
        m121setYFqSqZzs(((Half) block.invoke(Half.m9boximpl(m103getYSjiOe_E()))).getV());
        m122setZFqSqZzs(((Half) block.invoke(Half.m9boximpl(m104getZSjiOe_E()))).getV());
        return this;
    }

    public final Half3 unaryMinus() {
        return new Half3(Half.m45unaryMinusSjiOe_E(this.x), Half.m45unaryMinusSjiOe_E(this.y), Half.m45unaryMinusSjiOe_E(this.z), (AbstractC4854k) null);
    }

    public /* synthetic */ Half3(short s10, AbstractC4854k abstractC4854k) {
        this(s10);
    }

    public final Half3 div(Half3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half3(Half.m13div5SPjhV8(m102getXSjiOe_E(), v10.m102getXSjiOe_E()), Half.m13div5SPjhV8(m103getYSjiOe_E(), v10.m103getYSjiOe_E()), Half.m13div5SPjhV8(m104getZSjiOe_E(), v10.m104getZSjiOe_E()), (AbstractC4854k) null);
    }

    public final Half3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        return new Half3(m95getYoEgLc(index1), m95getYoEgLc(index2), m95getYoEgLc(index3), (AbstractC4854k) null);
    }

    public final Half3 minus(Half3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half3(Half.m28minus5SPjhV8(m102getXSjiOe_E(), v10.m102getXSjiOe_E()), Half.m28minus5SPjhV8(m103getYSjiOe_E(), v10.m103getYSjiOe_E()), Half.m28minus5SPjhV8(m104getZSjiOe_E(), v10.m104getZSjiOe_E()), (AbstractC4854k) null);
    }

    public final Half3 plus(Half3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half3(Half.m32plus5SPjhV8(m102getXSjiOe_E(), v10.m102getXSjiOe_E()), Half.m32plus5SPjhV8(m103getYSjiOe_E(), v10.m103getYSjiOe_E()), Half.m32plus5SPjhV8(m104getZSjiOe_E(), v10.m104getZSjiOe_E()), (AbstractC4854k) null);
    }

    public final Half3 times(Half3 v10) {
        AbstractC4862t.e(v10, "v");
        return new Half3(Half.m35times5SPjhV8(m102getXSjiOe_E(), v10.m102getXSjiOe_E()), Half.m35times5SPjhV8(m103getYSjiOe_E(), v10.m103getYSjiOe_E()), Half.m35times5SPjhV8(m104getZSjiOe_E(), v10.m104getZSjiOe_E()), (AbstractC4854k) null);
    }

    public /* synthetic */ Half3(short s10, short s11, short s12, AbstractC4854k abstractC4854k) {
        this(s10, s11, s12);
    }

    public final Half2 get(int index1, int index2) {
        return new Half2(m94getYoEgLc(index1), m94getYoEgLc(index2), null);
    }

    /* JADX INFO: renamed from: set-Zf4qYnQ, reason: not valid java name */
    public final void m111setZf4qYnQ(VectorComponent index1, VectorComponent index2, short v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        m109set2gewN4s(index1, v10);
        m109set2gewN4s(index2, v10);
    }

    private Half3(short s10, short s11, short s12) {
        this.x = s10;
        this.y = s11;
        this.z = s12;
    }

    public final Half3 get(int index1, int index2, int index3) {
        return new Half3(m94getYoEgLc(index1), m94getYoEgLc(index2), m94getYoEgLc(index3), (AbstractC4854k) null);
    }

    /* JADX INFO: renamed from: set-lJVBvKs, reason: not valid java name */
    public final void m113setlJVBvKs(VectorComponent index1, VectorComponent index2, VectorComponent index3, short v10) {
        AbstractC4862t.e(index1, "index1");
        AbstractC4862t.e(index2, "index2");
        AbstractC4862t.e(index3, "index3");
        m109set2gewN4s(index1, v10);
        m109set2gewN4s(index2, v10);
        m109set2gewN4s(index3, v10);
    }

    /* JADX INFO: renamed from: set-2gewN4s, reason: not valid java name */
    public final void m109set2gewN4s(VectorComponent index, short v10) {
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

    /* JADX INFO: renamed from: get-YoEgL-c, reason: not valid java name */
    public final short m94getYoEgLc(int index) {
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

    public /* synthetic */ Half3(short s10, short s11, short s12, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s10, (i10 & 2) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s11, (i10 & 4) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s12, (AbstractC4854k) null);
    }

    private Half3(short s10) {
        this(s10, s10, s10, (AbstractC4854k) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private Half3(Half2 v10, short s10) {
        this(v10.m72getXSjiOe_E(), v10.m73getYSjiOe_E(), s10, (AbstractC4854k) null);
        AbstractC4862t.e(v10, "v");
    }

    public /* synthetic */ Half3(Half2 half2, short s10, int i10, AbstractC4854k abstractC4854k) {
        this(half2, (i10 & 2) != 0 ? Half.INSTANCE.m60getPOSITIVE_ZEROSjiOe_E() : s10, (AbstractC4854k) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Half3(Half3 v10) {
        this(v10.x, v10.y, v10.z, (AbstractC4854k) null);
        AbstractC4862t.e(v10, "v");
    }
}
