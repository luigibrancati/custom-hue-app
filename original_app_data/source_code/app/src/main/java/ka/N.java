package ka;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface N {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        CONNECTING("CONNECTING"),
        CONNECTED("CONNECTED"),
        DISCONNECTED("DISCONNECTED"),
        DISCONNECTING("DISCONNECTING");

        private final String description;

        a(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "RxBleConnectionState{" + this.description + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends Eb.o {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c extends Eb.o {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {
        }
    }

    Eb.r a(BluetoothGattCharacteristic bluetoothGattCharacteristic);

    Eb.k b(O o10);

    Eb.r c(int i10);

    Eb.r d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    Eb.k e(BluetoothGattCharacteristic bluetoothGattCharacteristic, D d10);

    Eb.r f();

    Eb.a g(int i10, long j10, TimeUnit timeUnit);

    Eb.r h();

    Eb.k i(BluetoothGattCharacteristic bluetoothGattCharacteristic, D d10);
}
