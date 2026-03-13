package oa;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.Locale;
import pa.AbstractC5451b;
import ta.C5871i;

/* JADX INFO: renamed from: oa.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5247E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5871i f41330a;

    public C5247E(C5871i c5871i) {
        this.f41330a = c5871i;
    }

    public String a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return String.format(Locale.getDefault(), "Characteristic %s supports properties: %s (%d) does not have any property matching %s (%d)", AbstractC5451b.g(bluetoothGattCharacteristic.getUuid()), this.f41330a.c(bluetoothGattCharacteristic.getProperties()), Integer.valueOf(bluetoothGattCharacteristic.getProperties()), this.f41330a.c(i10), Integer.valueOf(i10));
    }
}
