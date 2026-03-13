package oa;

import android.bluetooth.BluetoothGattCharacteristic;
import ma.C5035a;

/* JADX INFO: renamed from: oa.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5244B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5246D f41324a;

    /* JADX INFO: renamed from: oa.B$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BluetoothGattCharacteristic f41325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f41326b;

        public a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            this.f41325a = bluetoothGattCharacteristic;
            this.f41326b = i10;
        }

        @Override // Jb.a
        public void run() {
            C5035a c5035aA;
            int properties = this.f41325a.getProperties();
            int i10 = this.f41326b;
            if ((properties & i10) == 0 && (c5035aA = C5244B.this.f41324a.a(this.f41325a, i10)) != null) {
                throw c5035aA;
            }
        }
    }

    public C5244B(AbstractC5246D abstractC5246D) {
        this.f41324a = abstractC5246D;
    }

    public Eb.a a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return Eb.a.g(new a(bluetoothGattCharacteristic, i10));
    }
}
