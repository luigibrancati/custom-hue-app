package ta;

import android.bluetooth.BluetoothGattDescriptor;
import java.util.UUID;

/* JADX INFO: renamed from: ta.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5868f {

    /* JADX INFO: renamed from: ta.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UUID f44851a;

        public a(UUID uuid) {
            this.f44851a = uuid;
        }

        @Override // Jb.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(C5867e c5867e) {
            return ((UUID) c5867e.f44849a).equals(this.f44851a);
        }
    }

    /* JADX INFO: renamed from: ta.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Jb.e {
        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] apply(C5867e c5867e) {
            return c5867e.f44850b;
        }
    }

    /* JADX INFO: renamed from: ta.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Jb.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BluetoothGattDescriptor f44852a;

        public c(BluetoothGattDescriptor bluetoothGattDescriptor) {
            this.f44852a = bluetoothGattDescriptor;
        }

        @Override // Jb.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(C5867e c5867e) {
            return ((BluetoothGattDescriptor) c5867e.f44849a).equals(this.f44852a);
        }
    }

    public static Jb.g a(UUID uuid) {
        return new a(uuid);
    }

    public static Jb.g b(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new c(bluetoothGattDescriptor);
    }

    public static Jb.e c() {
        return new b();
    }
}
