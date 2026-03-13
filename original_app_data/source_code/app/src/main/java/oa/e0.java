package oa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import dc.C3891b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import la.C4971c;
import la.C4972d;
import ta.C5863a;
import ta.C5869g;
import ta.C5870h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final UUID f41383h = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f41384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f41385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f41386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BluetoothGatt f41387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0 f41388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5268u f41389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f41390g = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41391a;

        static {
            int[] iArr = new int[ka.D.values().length];
            f41391a = iArr;
            try {
                iArr[ka.D.COMPAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41391a[ka.D.QUICK_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41391a[ka.D.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e0(byte[] bArr, byte[] bArr2, byte[] bArr3, BluetoothGatt bluetoothGatt, j0 j0Var, C5268u c5268u) {
        this.f41384a = bArr;
        this.f41385b = bArr2;
        this.f41386c = bArr3;
        this.f41387d = bluetoothGatt;
        this.f41388e = j0Var;
        this.f41389f = c5268u;
    }

    public static /* synthetic */ Eb.n c(final e0 e0Var, final BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10, final ka.D d10) {
        synchronized (e0Var.f41390g) {
            try {
                final C5870h c5870h = new C5870h(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()));
                C5863a c5863a = (C5863a) e0Var.f41390g.get(c5870h);
                if (c5863a != null) {
                    if (c5863a.f44845b == z10) {
                        return c5863a.f44844a;
                    }
                    return Eb.k.G(new C4972d(bluetoothGattCharacteristic.getUuid(), !z10));
                }
                byte[] bArr = z10 ? e0Var.f41385b : e0Var.f41384a;
                final C3891b c3891bQ0 = C3891b.Q0();
                Eb.k kVarS0 = l(e0Var.f41387d, bluetoothGattCharacteristic, true).d(ta.D.b(k(e0Var.f41388e, c5870h))).j(m(e0Var.f41389f, bluetoothGattCharacteristic, bArr, d10)).Z(new Jb.e() { // from class: oa.V
                    @Override // Jb.e
                    public final Object apply(Object obj) {
                        C3891b c3891b = c3891bQ0;
                        return Eb.k.g(Arrays.asList(c3891b.i(byte[].class), ((Eb.k) obj).D0(c3891b)));
                    }
                }).v(new Jb.a() { // from class: oa.W
                    @Override // Jb.a
                    public final void run() {
                        e0.h(this.f41361a, c3891bQ0, c5870h, bluetoothGattCharacteristic, d10);
                    }
                }).d0(e0Var.f41388e.l()).m0(1).S0();
                e0Var.f41390g.put(c5870h, new C5863a(kVarS0, z10));
                return kVarS0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void f(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10) {
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z10)) {
            throw new C4971c(bluetoothGattCharacteristic, 1, null);
        }
    }

    public static /* synthetic */ void h(e0 e0Var, C3891b c3891b, C5870h c5870h, BluetoothGattCharacteristic bluetoothGattCharacteristic, ka.D d10) {
        e0Var.getClass();
        c3891b.a();
        synchronized (e0Var.f41390g) {
            e0Var.f41390g.remove(c5870h);
        }
        l(e0Var.f41387d, bluetoothGattCharacteristic, false).e(o(e0Var.f41389f, bluetoothGattCharacteristic, e0Var.f41386c, d10)).l(Lb.a.f8702c, Lb.a.d());
    }

    public static /* synthetic */ Eb.n i(ka.D d10, BluetoothGattCharacteristic bluetoothGattCharacteristic, C5268u c5268u, byte[] bArr, Eb.k kVar) {
        int i10 = a.f41391a[d10.ordinal()];
        if (i10 == 1) {
            return kVar;
        }
        if (i10 != 2) {
            return p(bluetoothGattCharacteristic, c5268u, bArr).d(kVar);
        }
        final Eb.a aVarW = p(bluetoothGattCharacteristic, c5268u, bArr).o().j0().O0(2).W();
        return kVar.c0(aVarW).Z(new Jb.e() { // from class: oa.c0
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ((Eb.k) obj).c0(aVarW.i());
            }
        });
    }

    public static /* synthetic */ Eb.c j(ka.D d10, BluetoothGattCharacteristic bluetoothGattCharacteristic, C5268u c5268u, byte[] bArr, Eb.a aVar) {
        return d10 == ka.D.COMPAT ? aVar : aVar.c(p(bluetoothGattCharacteristic, c5268u, bArr));
    }

    public static Eb.k k(j0 j0Var, final C5870h c5870h) {
        return j0Var.b().I(new Jb.g() { // from class: oa.X
            @Override // Jb.g
            public final boolean test(Object obj) {
                return ((C5869g) obj).equals(c5870h);
            }
        }).Z(new Jb.e() { // from class: oa.Y
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ((C5869g) obj).f44853a;
            }
        });
    }

    public static Eb.a l(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final boolean z10) {
        return Eb.a.g(new Jb.a() { // from class: oa.a0
            @Override // Jb.a
            public final void run() {
                e0.f(bluetoothGatt, bluetoothGattCharacteristic, z10);
            }
        });
    }

    public static Eb.o m(final C5268u c5268u, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final ka.D d10) {
        return new Eb.o() { // from class: oa.Z
            @Override // Eb.o
            public final Eb.n a(Eb.k kVar) {
                return e0.i(d10, bluetoothGattCharacteristic, c5268u, bArr, kVar);
            }
        };
    }

    public static Eb.d o(final C5268u c5268u, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final ka.D d10) {
        return new Eb.d() { // from class: oa.b0
            @Override // Eb.d
            public final Eb.c a(Eb.a aVar) {
                return e0.j(d10, bluetoothGattCharacteristic, c5268u, bArr, aVar);
            }
        };
    }

    public static Eb.a p(final BluetoothGattCharacteristic bluetoothGattCharacteristic, C5268u c5268u, byte[] bArr) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(f41383h);
        return descriptor == null ? Eb.a.f(new C4971c(bluetoothGattCharacteristic, 2, null)) : c5268u.a(descriptor, bArr).k(new Jb.e() { // from class: oa.d0
            @Override // Jb.e
            public final Object apply(Object obj) {
                return Eb.a.f(new C4971c(bluetoothGattCharacteristic, 3, (Throwable) obj));
            }
        });
    }

    public Eb.k n(final BluetoothGattCharacteristic bluetoothGattCharacteristic, final ka.D d10, final boolean z10) {
        return Eb.k.o(new Callable() { // from class: oa.U
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e0.c(this.f41356a, bluetoothGattCharacteristic, z10, d10);
            }
        });
    }
}
