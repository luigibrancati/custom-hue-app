package oa;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.DeadObjectException;
import java.util.concurrent.TimeUnit;
import la.C4973e;
import la.C4974f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h0 implements ka.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa.d f41401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f41402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BluetoothGatt f41403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qa.k f41404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X3.a f41405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Eb.q f41406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f41407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f41408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N f41409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5268u f41410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5244B f41411k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ma.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ka.O f41412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ma.i f41413b;

        /* JADX INFO: renamed from: oa.h0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0551a implements Jb.a {
            public C0551a() {
            }

            @Override // Jb.a
            public void run() {
                h0.this.f41402b.r(null);
                h0.this.f41402b.q(null);
            }
        }

        public a(ka.O o10, ma.i iVar) {
            this.f41412a = o10;
            this.f41413b = iVar;
        }

        @Override // ma.j
        public void b(Eb.l lVar, sa.i iVar) {
            try {
                ka.O o10 = this.f41412a;
                h0 h0Var = h0.this;
                Eb.k kVarA = o10.a(h0Var.f41403c, h0Var.f41402b, h0Var.f41406f);
                if (kVarA == null) {
                    iVar.release();
                    throw new IllegalArgumentException("The custom operation asObservable method must return a non-null observable");
                }
                kVarA.B(p()).f(new ta.E(lVar, iVar));
            } catch (Throwable th) {
                iVar.release();
                throw th;
            }
        }

        @Override // ma.j
        public C4974f j(DeadObjectException deadObjectException) {
            return new C4973e(deadObjectException, h0.this.f41403c.getDevice().getAddress(), -1);
        }

        @Override // ma.j, qa.j
        public ma.i m() {
            return this.f41413b;
        }

        public final Jb.a p() {
            return new C0551a();
        }
    }

    public h0(sa.d dVar, j0 j0Var, BluetoothGatt bluetoothGatt, l0 l0Var, e0 e0Var, N n10, C5268u c5268u, qa.k kVar, X3.a aVar, Eb.q qVar, C5244B c5244b) {
        this.f41401a = dVar;
        this.f41402b = j0Var;
        this.f41403c = bluetoothGatt;
        this.f41407g = l0Var;
        this.f41408h = e0Var;
        this.f41409i = n10;
        this.f41410j = c5268u;
        this.f41404d = kVar;
        this.f41405e = aVar;
        this.f41406f = qVar;
        this.f41411k = c5244b;
    }

    @Override // ka.N
    public Eb.r a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f41411k.a(bluetoothGattCharacteristic, 2).d(this.f41401a.a(this.f41404d.b(bluetoothGattCharacteristic))).L();
    }

    @Override // ka.N
    public Eb.k b(ka.O o10) {
        return j(o10, ma.i.f40240c);
    }

    @Override // ka.N
    public Eb.r c(int i10) {
        return this.f41401a.a(this.f41404d.a(i10)).L();
    }

    @Override // ka.N
    public Eb.r d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return this.f41411k.a(bluetoothGattCharacteristic, 76).d(this.f41401a.a(this.f41404d.g(bluetoothGattCharacteristic, bArr))).L();
    }

    @Override // ka.N
    public Eb.k e(BluetoothGattCharacteristic bluetoothGattCharacteristic, ka.D d10) {
        return this.f41411k.a(bluetoothGattCharacteristic, 16).d(this.f41408h.n(bluetoothGattCharacteristic, d10, false));
    }

    @Override // ka.N
    public Eb.r f() {
        return this.f41407g.a(20L, TimeUnit.SECONDS);
    }

    @Override // ka.N
    public Eb.a g(int i10, long j10, TimeUnit timeUnit) {
        if (i10 == 2 || i10 == 0 || i10 == 1) {
            return j10 <= 0 ? Eb.a.f(new IllegalArgumentException("Delay must be bigger than 0")) : this.f41401a.a(this.f41404d.d(i10, j10, timeUnit)).W();
        }
        return Eb.a.f(new IllegalArgumentException("Connection priority must have valid value from BluetoothGatt (received " + i10 + ")"));
    }

    @Override // ka.N
    public Eb.r h() {
        return this.f41401a.a(this.f41404d.c()).L();
    }

    @Override // ka.N
    public Eb.k i(BluetoothGattCharacteristic bluetoothGattCharacteristic, ka.D d10) {
        return this.f41411k.a(bluetoothGattCharacteristic, 32).d(this.f41408h.n(bluetoothGattCharacteristic, d10, true));
    }

    public Eb.k j(ka.O o10, ma.i iVar) {
        return this.f41401a.a(new a(o10, iVar));
    }
}
