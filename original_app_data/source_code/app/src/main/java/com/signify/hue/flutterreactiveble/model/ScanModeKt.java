package com.signify.hue.flutterreactiveble.model;

import fc.C4032o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"toScanSettings", "", "Lcom/signify/hue/flutterreactiveble/model/ScanMode;", "createScanMode", "mode", "reactive_ble_mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ScanModeKt {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScanMode.values().length];
            try {
                iArr[ScanMode.OPPORTUNISTIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanMode.LOW_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanMode.BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanMode.LOW_LATENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ScanMode createScanMode(int i10) {
        return i10 != -1 ? i10 != 0 ? i10 != 1 ? i10 != 2 ? ScanMode.LOW_POWER : ScanMode.LOW_LATENCY : ScanMode.BALANCED : ScanMode.LOW_POWER : ScanMode.OPPORTUNISTIC;
    }

    public static final int toScanSettings(ScanMode scanMode) {
        AbstractC4862t.e(scanMode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[scanMode.ordinal()];
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        throw new C4032o();
    }
}
