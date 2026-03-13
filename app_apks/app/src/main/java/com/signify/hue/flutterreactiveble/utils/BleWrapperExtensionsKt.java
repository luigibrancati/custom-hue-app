package com.signify.hue.flutterreactiveble.utils;

import com.signify.hue.flutterreactiveble.ble.BleStatus;
import com.signify.hue.flutterreactiveble.ble.ConnectionPriority;
import fc.C4032o;
import ka.G;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lka/G$a;", "Lcom/signify/hue/flutterreactiveble/ble/BleStatus;", "toBleState", "(Lka/G$a;)Lcom/signify/hue/flutterreactiveble/ble/BleStatus;", "", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionPriority;", "toConnectionPriority", "(I)Lcom/signify/hue/flutterreactiveble/ble/ConnectionPriority;", "reactive_ble_mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BleWrapperExtensionsKt {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[G.a.values().length];
            try {
                iArr[G.a.BLUETOOTH_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.a.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.a.BLUETOOTH_NOT_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.a.LOCATION_SERVICES_NOT_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[G.a.READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BleStatus toBleState(G.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i10 == 1) {
            return BleStatus.UNSUPPORTED;
        }
        if (i10 == 2) {
            return BleStatus.UNAUTHORIZED;
        }
        if (i10 == 3) {
            return BleStatus.POWERED_OFF;
        }
        if (i10 == 4) {
            return BleStatus.LOCATION_SERVICES_DISABLED;
        }
        if (i10 == 5) {
            return BleStatus.READY;
        }
        throw new C4032o();
    }

    public static final ConnectionPriority toConnectionPriority(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? ConnectionPriority.BALANCED : ConnectionPriority.LOW_POWER : ConnectionPriority.HIGH_PERFORMACE : ConnectionPriority.BALANCED;
    }
}
