package com.signify.hue.flutterreactiveble.ble.extensions;

import Eb.r;
import Eb.v;
import Jb.e;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.signify.hue.flutterreactiveble.ble.extensions.RxBleConnectionExtensionKt;
import gc.C4179C;
import gc.y;
import io.sentry.protocol.DebugImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ka.N;
import ka.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lka/N;", "Ljava/util/UUID;", DebugImage.JsonKeys.UUID, "", "instanceId", "LEb/r;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "resolveCharacteristic", "(Lka/N;Ljava/util/UUID;I)LEb/r;", "characteristic", "", "value", "writeCharWithResponse", "(Lka/N;Landroid/bluetooth/BluetoothGattCharacteristic;[B)LEb/r;", "writeCharWithoutResponse", "reactive_ble_mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RxBleConnectionExtensionKt {
    public static final r resolveCharacteristic(N n10, final UUID uuid, final int i10) {
        AbstractC4862t.e(n10, "<this>");
        AbstractC4862t.e(uuid, "uuid");
        r rVarF = n10.f();
        final l lVar = new l() { // from class: Ba.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return RxBleConnectionExtensionKt.resolveCharacteristic$lambda$2(uuid, i10, (Q) obj);
            }
        };
        r rVarQ = rVarF.q(new e() { // from class: Ba.b
            @Override // Jb.e
            public final Object apply(Object obj) {
                return RxBleConnectionExtensionKt.resolveCharacteristic$lambda$3(lVar, obj);
            }
        });
        AbstractC4862t.d(rVarQ, "flatMap(...)");
        return rVarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v resolveCharacteristic$lambda$2(UUID uuid, int i10, Q services) {
        AbstractC4862t.e(services, "services");
        List listA = services.a();
        AbstractC4862t.d(listA, "getBluetoothGattServices(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            List<BluetoothGattCharacteristic> characteristics = ((BluetoothGattService) it.next()).getCharacteristics();
            AbstractC4862t.d(characteristics, "getCharacteristics(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : characteristics) {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                if (AbstractC4862t.a(bluetoothGattCharacteristic.getUuid(), uuid) && bluetoothGattCharacteristic.getInstanceId() == i10) {
                    arrayList2.add(obj);
                }
            }
            y.C(arrayList, arrayList2);
        }
        return r.t(C4179C.F0(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v resolveCharacteristic$lambda$3(l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (v) lVar.invoke(p02);
    }

    public static final r writeCharWithResponse(N n10, BluetoothGattCharacteristic characteristic, byte[] value) {
        AbstractC4862t.e(n10, "<this>");
        AbstractC4862t.e(characteristic, "characteristic");
        AbstractC4862t.e(value, "value");
        characteristic.setWriteType(2);
        r rVarD = n10.d(characteristic, value);
        AbstractC4862t.d(rVarD, "writeCharacteristic(...)");
        return rVarD;
    }

    public static final r writeCharWithoutResponse(N n10, BluetoothGattCharacteristic characteristic, byte[] value) {
        AbstractC4862t.e(n10, "<this>");
        AbstractC4862t.e(characteristic, "characteristic");
        AbstractC4862t.e(value, "value");
        characteristic.setWriteType(1);
        r rVarD = n10.d(characteristic, value);
        AbstractC4862t.d(rVarD, "writeCharacteristic(...)");
        return rVarD;
    }
}
