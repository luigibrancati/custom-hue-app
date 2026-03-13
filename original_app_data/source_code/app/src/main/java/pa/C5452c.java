package pa;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.Iterator;
import ka.Q;
import ma.q;
import ta.C5871i;

/* JADX INFO: renamed from: pa.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5452c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5871i f42514a;

    public C5452c(C5871i c5871i) {
        this.f42514a = c5871i;
    }

    public static void a(StringBuilder sb2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb2.append('\n');
        sb2.append('\t');
        sb2.append("* ");
        sb2.append(i(bluetoothGattCharacteristic));
        sb2.append(" (");
        sb2.append(AbstractC5451b.g(bluetoothGattCharacteristic.getUuid()));
        sb2.append(")");
    }

    public static void c(StringBuilder sb2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        sb2.append('\n');
        sb2.append('\t');
        sb2.append('\t');
        sb2.append("* ");
        sb2.append(j(bluetoothGattDescriptor));
        sb2.append(" (");
        sb2.append(AbstractC5451b.g(bluetoothGattDescriptor.getUuid()));
        sb2.append(")");
    }

    public static void d(StringBuilder sb2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic.getDescriptors().isEmpty()) {
            return;
        }
        e(sb2);
        Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
        while (it.hasNext()) {
            c(sb2, it.next());
        }
    }

    public static void e(StringBuilder sb2) {
        sb2.append('\n');
        sb2.append('\t');
        sb2.append("  ");
        sb2.append("-> Descriptors: ");
    }

    public static void f(BluetoothDevice bluetoothDevice, StringBuilder sb2) {
        sb2.append("--------------- ====== Printing peripheral content ====== ---------------\n");
        sb2.append(AbstractC5451b.d(bluetoothDevice.getAddress()));
        sb2.append('\n');
        sb2.append("PERIPHERAL NAME: ");
        sb2.append(bluetoothDevice.getName());
        sb2.append('\n');
        sb2.append("-------------------------------------------------------------------------");
    }

    public static void h(StringBuilder sb2, BluetoothGattService bluetoothGattService) {
        sb2.append("\n");
        sb2.append(l(bluetoothGattService));
        sb2.append(" - ");
        sb2.append(k(bluetoothGattService));
        sb2.append(" (");
        sb2.append(AbstractC5451b.g(bluetoothGattService.getUuid()));
        sb2.append(")\n");
        sb2.append("Instance ID: ");
        sb2.append(bluetoothGattService.getInstanceId());
        sb2.append('\n');
    }

    public static String i(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String strA = va.b.a(bluetoothGattCharacteristic.getUuid());
        return strA == null ? "Unknown characteristic" : strA;
    }

    public static String j(BluetoothGattDescriptor bluetoothGattDescriptor) {
        String strB = va.b.b(bluetoothGattDescriptor.getUuid());
        return strB == null ? "Unknown descriptor" : strB;
    }

    public static String k(BluetoothGattService bluetoothGattService) {
        String strC = va.b.c(bluetoothGattService.getUuid());
        return strC == null ? "Unknown service" : strC;
    }

    public static String l(BluetoothGattService bluetoothGattService) {
        return bluetoothGattService.getType() == 0 ? "Primary Service" : "Secondary Service";
    }

    public final void b(StringBuilder sb2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb2.append('\n');
        sb2.append('\t');
        sb2.append("  ");
        sb2.append("Properties: ");
        sb2.append(this.f42514a.c(bluetoothGattCharacteristic.getProperties()));
    }

    public final void g(StringBuilder sb2, BluetoothGattService bluetoothGattService) {
        h(sb2, bluetoothGattService);
        sb2.append("-> Characteristics:");
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            a(sb2, bluetoothGattCharacteristic);
            b(sb2, bluetoothGattCharacteristic);
            d(sb2, bluetoothGattCharacteristic);
        }
    }

    public void m(Q q10, BluetoothDevice bluetoothDevice) {
        if (q.l(2)) {
            q.p("Preparing services description", new Object[0]);
            q.p(n(q10, bluetoothDevice), new Object[0]);
        }
    }

    public final String n(Q q10, BluetoothDevice bluetoothDevice) {
        StringBuilder sb2 = new StringBuilder();
        f(bluetoothDevice, sb2);
        for (BluetoothGattService bluetoothGattService : q10.a()) {
            sb2.append('\n');
            g(sb2, bluetoothGattService);
        }
        sb2.append("\n--------------- ====== Finished peripheral content ====== ---------------");
        return sb2.toString();
    }
}
