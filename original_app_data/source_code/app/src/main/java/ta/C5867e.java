package ta;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: ta.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5867e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f44850b;

    public C5867e(Object obj, byte[] bArr) {
        this.f44849a = obj;
        this.f44850b = bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5867e)) {
            return false;
        }
        C5867e c5867e = (C5867e) obj;
        return Arrays.equals(c5867e.f44850b, this.f44850b) && c5867e.f44849a.equals(this.f44849a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f44850b) ^ this.f44849a.hashCode();
    }

    public String toString() {
        String simpleName;
        Object obj = this.f44849a;
        if (obj instanceof BluetoothGattCharacteristic) {
            simpleName = BluetoothGattCharacteristic.class.getSimpleName() + "(" + ((BluetoothGattCharacteristic) this.f44849a).getUuid().toString() + ")";
        } else if (obj instanceof BluetoothGattDescriptor) {
            simpleName = BluetoothGattDescriptor.class.getSimpleName() + "(" + ((BluetoothGattDescriptor) this.f44849a).getUuid().toString() + ")";
        } else if (obj instanceof UUID) {
            simpleName = UUID.class.getSimpleName() + "(" + this.f44849a.toString() + ")";
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "[first=" + simpleName + ", second=" + Arrays.toString(this.f44850b) + "]";
    }
}
