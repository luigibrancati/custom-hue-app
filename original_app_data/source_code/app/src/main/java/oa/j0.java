package oa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;
import ka.InterfaceC4816B;
import ka.N;
import la.C4973e;
import la.C4977i;
import la.C4978j;
import la.C4979k;
import la.C4980l;
import pa.AbstractC5451b;
import ta.C5867e;
import ta.C5869g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.q f41432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5249a f41433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5272y f41434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f41435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ea.c f41436e = ea.c.R0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f41437f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f41438g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f41439h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ea.d f41440i = ea.c.R0().P0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f41441j = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f41442k = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f41443l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f41444m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f41445n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Jb.e f41446o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BluetoothGattCallback f41447p = new b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.e {
        public a() {
        }

        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Eb.k apply(C4979k c4979k) {
            return Eb.k.G(c4979k);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends BluetoothGattCallback {
        public b() {
        }

        public final boolean a(int i10) {
            return i10 == 0 || i10 == 3;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            AbstractC5451b.l("onCharacteristicChanged", bluetoothGatt, bluetoothGattCharacteristic, true);
            j0.this.f41435d.a(bluetoothGatt, bluetoothGattCharacteristic);
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (j0.this.f41440i.O0()) {
                j0.this.f41440i.accept(new C5869g(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            AbstractC5451b.j("onCharacteristicRead", bluetoothGatt, i10, bluetoothGattCharacteristic, true);
            j0.this.f41435d.g(bluetoothGatt, bluetoothGattCharacteristic, i10);
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i10);
            if (!j0.this.f41438g.a() || j0.n(j0.this.f41438g, bluetoothGatt, bluetoothGattCharacteristic, i10, C4980l.f40004d)) {
                return;
            }
            j0.this.f41438g.f41450a.accept(new C5867e(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            AbstractC5451b.j("onCharacteristicWrite", bluetoothGatt, i10, bluetoothGattCharacteristic, false);
            j0.this.f41435d.k(bluetoothGatt, bluetoothGattCharacteristic, i10);
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i10);
            if (!j0.this.f41439h.a() || j0.n(j0.this.f41439h, bluetoothGatt, bluetoothGattCharacteristic, i10, C4980l.f40005e)) {
                return;
            }
            j0.this.f41439h.f41450a.accept(new C5867e(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
            AbstractC5451b.i("onConnectionStateChange", bluetoothGatt, i10, i11);
            j0.this.f41435d.b(bluetoothGatt, i10, i11);
            super.onConnectionStateChange(bluetoothGatt, i10, i11);
            j0.this.f41433b.b(bluetoothGatt);
            if (a(i11)) {
                j0.this.f41434c.d(new C4973e(bluetoothGatt.getDevice().getAddress(), i10));
            } else if (i10 != 0) {
                j0.this.f41434c.e(new C4979k(bluetoothGatt, i10, C4980l.f40002b));
            }
            j0.this.f41436e.accept(j0.k(i11));
        }

        public void onConnectionUpdated(BluetoothGatt bluetoothGatt, int i10, int i11, int i12, int i13) {
            AbstractC5451b.m("onConnectionUpdated", bluetoothGatt, i13, i10, i11, i12);
            j0.this.f41435d.f(bluetoothGatt, i10, i11, i12, i13);
            if (!j0.this.f41445n.a() || j0.m(j0.this.f41445n, bluetoothGatt, i13, C4980l.f40013m)) {
                return;
            }
            j0.this.f41445n.f41450a.accept(new C5259k(i10, i11, i12));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            AbstractC5451b.k("onDescriptorRead", bluetoothGatt, i10, bluetoothGattDescriptor, true);
            j0.this.f41435d.c(bluetoothGatt, bluetoothGattDescriptor, i10);
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i10);
            if (!j0.this.f41441j.a() || j0.o(j0.this.f41441j, bluetoothGatt, bluetoothGattDescriptor, i10, C4980l.f40008h)) {
                return;
            }
            j0.this.f41441j.f41450a.accept(new C5867e(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            AbstractC5451b.k("onDescriptorWrite", bluetoothGatt, i10, bluetoothGattDescriptor, false);
            j0.this.f41435d.d(bluetoothGatt, bluetoothGattDescriptor, i10);
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i10);
            if (!j0.this.f41442k.a() || j0.o(j0.this.f41442k, bluetoothGatt, bluetoothGattDescriptor, i10, C4980l.f40009i)) {
                return;
            }
            j0.this.f41442k.f41450a.accept(new C5867e(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            AbstractC5451b.i("onMtuChanged", bluetoothGatt, i11, i10);
            j0.this.f41435d.e(bluetoothGatt, i10, i11);
            super.onMtuChanged(bluetoothGatt, i10, i11);
            if (!j0.this.f41444m.a() || j0.m(j0.this.f41444m, bluetoothGatt, i11, C4980l.f40012l)) {
                return;
            }
            j0.this.f41444m.f41450a.accept(Integer.valueOf(i10));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i10, int i11) {
            AbstractC5451b.i("onReadRemoteRssi", bluetoothGatt, i11, i10);
            j0.this.f41435d.h(bluetoothGatt, i10, i11);
            super.onReadRemoteRssi(bluetoothGatt, i10, i11);
            if (!j0.this.f41443l.a() || j0.m(j0.this.f41443l, bluetoothGatt, i11, C4980l.f40011k)) {
                return;
            }
            j0.this.f41443l.f41450a.accept(Integer.valueOf(i10));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i10) {
            AbstractC5451b.h("onReliableWriteCompleted", bluetoothGatt, i10);
            j0.this.f41435d.i(bluetoothGatt, i10);
            super.onReliableWriteCompleted(bluetoothGatt, i10);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            AbstractC5451b.h("onServicesDiscovered", bluetoothGatt, i10);
            j0.this.f41435d.j(bluetoothGatt, i10);
            super.onServicesDiscovered(bluetoothGatt, i10);
            if (!j0.this.f41437f.a() || j0.m(j0.this.f41437f, bluetoothGatt, i10, C4980l.f40003c)) {
                return;
            }
            j0.this.f41437f.f41450a.accept(new ka.Q(bluetoothGatt.getServices()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ea.c f41450a = ea.c.R0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ea.c f41451b = ea.c.R0();

        public boolean a() {
            return this.f41450a.O0() || this.f41451b.O0();
        }
    }

    public j0(Eb.q qVar, C5249a c5249a, C5272y c5272y, Q q10) {
        this.f41432a = qVar;
        this.f41433b = c5249a;
        this.f41434c = c5272y;
        this.f41435d = q10;
    }

    public static boolean j(int i10) {
        return i10 != 0;
    }

    public static N.a k(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? N.a.DISCONNECTED : N.a.DISCONNECTING : N.a.CONNECTED : N.a.CONNECTING;
    }

    public static boolean m(c cVar, BluetoothGatt bluetoothGatt, int i10, C4980l c4980l) {
        return j(i10) && p(cVar, new C4979k(bluetoothGatt, i10, c4980l));
    }

    public static boolean n(c cVar, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10, C4980l c4980l) {
        return j(i10) && p(cVar, new C4977i(bluetoothGatt, bluetoothGattCharacteristic, i10, c4980l));
    }

    public static boolean o(c cVar, BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10, C4980l c4980l) {
        return j(i10) && p(cVar, new C4978j(bluetoothGatt, bluetoothGattDescriptor, i10, c4980l));
    }

    public static boolean p(c cVar, C4979k c4979k) {
        cVar.f41451b.accept(c4979k);
        return true;
    }

    public BluetoothGattCallback a() {
        return this.f41447p;
    }

    public Eb.k b() {
        return Eb.k.a0(this.f41434c.b(), this.f41440i).q(0L, TimeUnit.SECONDS, this.f41432a);
    }

    public Eb.k c() {
        return s(this.f41438g).q(0L, TimeUnit.SECONDS, this.f41432a);
    }

    public Eb.k d() {
        return s(this.f41439h).q(0L, TimeUnit.SECONDS, this.f41432a);
    }

    public Eb.k e() {
        return this.f41436e.q(0L, TimeUnit.SECONDS, this.f41432a);
    }

    public Eb.k f() {
        return s(this.f41442k).q(0L, TimeUnit.SECONDS, this.f41432a);
    }

    public Eb.k g() {
        return s(this.f41444m).q(0L, TimeUnit.SECONDS, this.f41432a);
    }

    public Eb.k h() {
        return s(this.f41443l).q(0L, TimeUnit.SECONDS, this.f41432a);
    }

    public Eb.k i() {
        return s(this.f41437f).q(0L, TimeUnit.SECONDS, this.f41432a);
    }

    public Eb.k l() {
        return this.f41434c.b();
    }

    public void q(InterfaceC4816B interfaceC4816B) {
        this.f41435d.m(interfaceC4816B);
    }

    public void r(BluetoothGattCallback bluetoothGattCallback) {
        this.f41435d.l(bluetoothGattCallback);
    }

    public final Eb.k s(c cVar) {
        return Eb.k.b0(this.f41434c.b(), cVar.f41450a, cVar.f41451b.M(this.f41446o));
    }
}
