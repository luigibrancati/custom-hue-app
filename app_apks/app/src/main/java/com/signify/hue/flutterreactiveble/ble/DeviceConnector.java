package com.signify.hue.flutterreactiveble.ble;

import android.bluetooth.BluetoothGatt;
import com.signify.hue.flutterreactiveble.model.ConnectionState;
import com.signify.hue.flutterreactiveble.model.ConnectionStateKt;
import com.signify.hue.flutterreactiveble.utils.Duration;
import dc.C3890a;
import fc.C4015H;
import fc.C4029l;
import fc.C4032o;
import fc.InterfaceC4028k;
import gc.C4179C;
import io.sentry.protocol.Device;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ka.N;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 N2\u00020\u0001:\u0001NB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!JS\u0010$\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e #*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\"0\" #*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e #*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\"0\"\u0018\u00010\u001a0\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*H\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\"\u00105\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010404038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R*\u0010:\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010\u0013\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010B\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010404030A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR#\u0010F\u001a\n #*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\bE\u0010=R\u0016\u0010I\u001a\u0004\u0018\u0001048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR)\u0010\u001e\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010404038@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bJ\u0010K*\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/DeviceConnector;", "", "Lka/P;", Device.TYPE, "Lcom/signify/hue/flutterreactiveble/utils/Duration;", "connectionTimeout", "Lkotlin/Function1;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionUpdate;", "Lfc/H;", "updateListeners", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionQueue;", "connectionQueue", "<init>", "(Lka/P;Lcom/signify/hue/flutterreactiveble/utils/Duration;Lvc/l;Lcom/signify/hue/flutterreactiveble/ble/ConnectionQueue;)V", "", "deviceId", "sendDisconnectedUpdate", "(Ljava/lang/String;)V", "disposeSubscriptions", "()V", "rxBleDevice", "LHb/c;", "establishConnection", "(Lka/P;)LHb/c;", "", "shouldNotTimeout", "LEb/k;", "Lka/N;", "connectDevice", "(Lka/P;Z)LEb/k;", "connection", "LEb/a;", "clearGattCache", "(Lka/N;)LEb/a;", "", "kotlin.jvm.PlatformType", "waitUntilFirstOfQueue", "(Ljava/lang/String;)LEb/k;", "disconnectDevice$reactive_ble_mobile_release", "disconnectDevice", "clearGattCache$reactive_ble_mobile_release", "()LEb/a;", "LEb/r;", "", "readRssi$reactive_ble_mobile_release", "()LEb/r;", "readRssi", "Lka/P;", "Lcom/signify/hue/flutterreactiveble/utils/Duration;", "Lvc/l;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionQueue;", "Ldc/a;", "Lcom/signify/hue/flutterreactiveble/ble/EstablishConnectionResult;", "connectDeviceSubject", "Ldc/a;", "", "timestampEstablishConnection", "J", "connectionDisposable", "LHb/c;", "getConnectionDisposable$reactive_ble_mobile_release", "()LHb/c;", "setConnectionDisposable$reactive_ble_mobile_release", "(LHb/c;)V", "getConnectionDisposable$reactive_ble_mobile_release$annotations", "Lfc/k;", "lazyConnection", "Lfc/k;", "connectionStatusUpdates$delegate", "getConnectionStatusUpdates", "connectionStatusUpdates", "getCurrentConnection", "()Lcom/signify/hue/flutterreactiveble/ble/EstablishConnectionResult;", "currentConnection", "getConnection$reactive_ble_mobile_release", "()Ldc/a;", "getConnection$reactive_ble_mobile_release$delegate", "(Lcom/signify/hue/flutterreactiveble/ble/DeviceConnector;)Ljava/lang/Object;", "Companion", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceConnector {
    private static final long delayMsAfterClearingCache = 300;
    private static final long minTimeMsBeforeDisconnectingIsAllowed = 200;
    private final C3890a connectDeviceSubject;
    private Hb.c connectionDisposable;
    private final ConnectionQueue connectionQueue;

    /* JADX INFO: renamed from: connectionStatusUpdates$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k connectionStatusUpdates;
    private final Duration connectionTimeout;
    private final ka.P device;
    private final InterfaceC4028k lazyConnection;
    private long timestampEstablishConnection;
    private final vc.l updateListeners;

    public DeviceConnector(ka.P device, Duration connectionTimeout, vc.l updateListeners, ConnectionQueue connectionQueue) {
        AbstractC4862t.e(device, "device");
        AbstractC4862t.e(connectionTimeout, "connectionTimeout");
        AbstractC4862t.e(updateListeners, "updateListeners");
        AbstractC4862t.e(connectionQueue, "connectionQueue");
        this.device = device;
        this.connectionTimeout = connectionTimeout;
        this.updateListeners = updateListeners;
        this.connectionQueue = connectionQueue;
        C3890a c3890aQ0 = C3890a.Q0();
        AbstractC4862t.d(c3890aQ0, "create(...)");
        this.connectDeviceSubject = c3890aQ0;
        this.lazyConnection = C4029l.b(new InterfaceC6082a() { // from class: com.signify.hue.flutterreactiveble.ble.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DeviceConnector.lazyConnection$lambda$0(this.f32572a);
            }
        });
        this.connectionStatusUpdates = C4029l.b(new InterfaceC6082a() { // from class: com.signify.hue.flutterreactiveble.ble.y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DeviceConnector.connectionStatusUpdates_delegate$lambda$7(this.f32574a);
            }
        });
    }

    private final Eb.a clearGattCache(ka.N connection) {
        Eb.a aVarW = connection.b(new ka.O() { // from class: com.signify.hue.flutterreactiveble.ble.r
            @Override // ka.O
            public final Eb.k a(BluetoothGatt bluetoothGatt, oa.j0 j0Var, Eb.q qVar) {
                return DeviceConnector.clearGattCache$lambda$27(bluetoothGatt, j0Var, qVar);
            }
        }).W();
        AbstractC4862t.d(aVarW, "ignoreElements(...)");
        return aVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.k clearGattCache$lambda$27(BluetoothGatt bluetoothGatt, oa.j0 j0Var, Eb.q qVar) {
        try {
            Object objInvoke = bluetoothGatt.getClass().getMethod("refresh", null).invoke(bluetoothGatt, null);
            AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue() ? Eb.k.F().p(delayMsAfterClearingCache, TimeUnit.MILLISECONDS) : Eb.k.G(new RuntimeException("BluetoothGatt.refresh() returned false"));
        } catch (ReflectiveOperationException e10) {
            return Eb.k.G(e10);
        }
    }

    private final Eb.k connectDevice(ka.P rxBleDevice, final boolean shouldNotTimeout) {
        Eb.k kVarA = rxBleDevice.a(shouldNotTimeout);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.p
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.connectDevice$lambda$24(shouldNotTimeout, this, (Eb.k) obj);
            }
        };
        Eb.k kVarJ = kVarA.j(new Eb.o() { // from class: com.signify.hue.flutterreactiveble.ble.q
            @Override // Eb.o
            public final Eb.n a(Eb.k kVar) {
                return DeviceConnector.connectDevice$lambda$25(lVar, kVar);
            }
        });
        AbstractC4862t.d(kVarJ, "compose(...)");
        return kVarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n connectDevice$lambda$24(boolean z10, DeviceConnector deviceConnector, Eb.k it) {
        AbstractC4862t.e(it, "it");
        return z10 ? it : it.G0(Eb.k.I0(deviceConnector.connectionTimeout.getValue(), deviceConnector.connectionTimeout.getUnit()), new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.s
            @Override // Jb.e
            public final Object apply(Object obj) {
                return DeviceConnector.connectDevice$lambda$24$lambda$23((ka.N) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.k connectDevice$lambda$24$lambda$23(ka.N it) {
        AbstractC4862t.e(it, "it");
        return Eb.k.e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n connectDevice$lambda$25(vc.l lVar, Eb.k p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.n) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hb.c connectionStatusUpdates_delegate$lambda$7(final DeviceConnector deviceConnector) {
        Eb.k kVarR0 = deviceConnector.device.d().r0(deviceConnector.device.getConnectionState());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.h
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.connectionStatusUpdates_delegate$lambda$7$lambda$1(this.f32541a, (N.a) obj);
            }
        };
        Eb.k kVarZ = kVarR0.Z(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.i
            @Override // Jb.e
            public final Object apply(Object obj) {
                return DeviceConnector.connectionStatusUpdates_delegate$lambda$7$lambda$2(lVar, obj);
            }
        });
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.j
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.connectionStatusUpdates_delegate$lambda$7$lambda$3(this.f32544a, (Throwable) obj);
            }
        };
        Eb.k kVarH0 = kVarZ.h0(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.k
            @Override // Jb.e
            public final Object apply(Object obj) {
                return DeviceConnector.connectionStatusUpdates_delegate$lambda$7$lambda$4(lVar2, obj);
            }
        });
        final vc.l lVar3 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.m
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.connectionStatusUpdates_delegate$lambda$7$lambda$5(this.f32551a, (ConnectionUpdate) obj);
            }
        };
        return kVarH0.s0(new Jb.d() { // from class: com.signify.hue.flutterreactiveble.ble.n
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar3.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionUpdate connectionStatusUpdates_delegate$lambda$7$lambda$1(DeviceConnector deviceConnector, N.a it) {
        AbstractC4862t.e(it, "it");
        String strC = deviceConnector.device.c();
        AbstractC4862t.d(strC, "getMacAddress(...)");
        return new ConnectionUpdateSuccess(strC, ConnectionStateKt.toConnectionState(it).getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionUpdate connectionStatusUpdates_delegate$lambda$7$lambda$2(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (ConnectionUpdate) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionUpdate connectionStatusUpdates_delegate$lambda$7$lambda$3(DeviceConnector deviceConnector, Throwable it) {
        AbstractC4862t.e(it, "it");
        String strC = deviceConnector.device.c();
        AbstractC4862t.d(strC, "getMacAddress(...)");
        String message = it.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        return new ConnectionUpdateError(strC, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionUpdate connectionStatusUpdates_delegate$lambda$7$lambda$4(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (ConnectionUpdate) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H connectionStatusUpdates_delegate$lambda$7$lambda$5(DeviceConnector deviceConnector, ConnectionUpdate connectionUpdate) {
        vc.l lVar = deviceConnector.updateListeners;
        AbstractC4862t.b(connectionUpdate);
        lVar.invoke(connectionUpdate);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disconnectDevice$lambda$8(DeviceConnector deviceConnector, String str) {
        deviceConnector.sendDisconnectedUpdate(str);
        deviceConnector.disposeSubscriptions();
    }

    private final void disposeSubscriptions() {
        Hb.c cVar = this.connectionDisposable;
        if (cVar != null) {
            cVar.dispose();
        }
        this.connectDeviceSubject.a();
        getConnectionStatusUpdates().dispose();
    }

    private final Hb.c establishConnection(final ka.P rxBleDevice) {
        final String strC = rxBleDevice.c();
        final boolean z10 = this.connectionTimeout.getValue() <= 0;
        ConnectionQueue connectionQueue = this.connectionQueue;
        AbstractC4862t.b(strC);
        connectionQueue.addToQueue(strC);
        this.updateListeners.invoke(new ConnectionUpdateSuccess(strC, ConnectionState.CONNECTING.getCode()));
        Eb.k kVarWaitUntilFirstOfQueue = waitUntilFirstOfQueue(strC);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.z
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.establishConnection$lambda$11(strC, this, rxBleDevice, z10, (List) obj);
            }
        };
        Eb.k kVarY0 = kVarWaitUntilFirstOfQueue.y0(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.C
            @Override // Jb.e
            public final Object apply(Object obj) {
                return DeviceConnector.establishConnection$lambda$12(lVar, obj);
            }
        });
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.D
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.establishConnection$lambda$13(rxBleDevice, (Throwable) obj);
            }
        };
        Eb.k kVarH0 = kVarY0.h0(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.E
            @Override // Jb.e
            public final Object apply(Object obj) {
                return DeviceConnector.establishConnection$lambda$14(lVar2, obj);
            }
        });
        final vc.l lVar3 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.b
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.establishConnection$lambda$15(this.f32525a, strC, (EstablishConnectionResult) obj);
            }
        };
        Eb.k kVarZ = kVarH0.z(new Jb.d() { // from class: com.signify.hue.flutterreactiveble.ble.c
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar3.invoke(obj);
            }
        });
        final vc.l lVar4 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.d
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.establishConnection$lambda$17(this.f32530a, strC, (Throwable) obj);
            }
        };
        Eb.k kVarX = kVarZ.x(new Jb.d() { // from class: com.signify.hue.flutterreactiveble.ble.e
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar4.invoke(obj);
            }
        });
        final vc.l lVar5 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.f
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.establishConnection$lambda$19(this.f32535a, (EstablishConnectionResult) obj);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.ble.g
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar5.invoke(obj);
            }
        };
        final vc.l lVar6 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.A
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.establishConnection$lambda$21(this.f32494a, (Throwable) obj);
            }
        };
        Hb.c cVarT0 = kVarX.t0(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.ble.B
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar6.invoke(obj);
            }
        });
        AbstractC4862t.d(cVarT0, "subscribe(...)");
        return cVarT0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n establishConnection$lambda$11(String str, DeviceConnector deviceConnector, final ka.P p10, boolean z10, List queue) {
        AbstractC4862t.e(queue, "queue");
        if (!queue.contains(str)) {
            AbstractC4862t.b(str);
            return Eb.k.Y(new EstablishConnectionFailure(str, "Device is not in queue"));
        }
        Eb.k kVarConnectDevice = deviceConnector.connectDevice(p10, z10);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DeviceConnector.establishConnection$lambda$11$lambda$9(p10, (ka.N) obj);
            }
        };
        return kVarConnectDevice.Z(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.l
            @Override // Jb.e
            public final Object apply(Object obj) {
                return DeviceConnector.establishConnection$lambda$11$lambda$10(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EstablishConnectionResult establishConnection$lambda$11$lambda$10(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (EstablishConnectionResult) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EstablishConnectionResult establishConnection$lambda$11$lambda$9(ka.P p10, ka.N it) {
        AbstractC4862t.e(it, "it");
        String strC = p10.c();
        AbstractC4862t.d(strC, "getMacAddress(...)");
        return new EstablishedConnection(strC, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n establishConnection$lambda$12(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.n) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EstablishConnectionResult establishConnection$lambda$13(ka.P p10, Throwable error) {
        AbstractC4862t.e(error, "error");
        String strC = p10.c();
        AbstractC4862t.d(strC, "getMacAddress(...)");
        String message = error.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        return new EstablishConnectionFailure(strC, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EstablishConnectionResult establishConnection$lambda$14(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (EstablishConnectionResult) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H establishConnection$lambda$15(DeviceConnector deviceConnector, String str, EstablishConnectionResult establishConnectionResult) {
        deviceConnector.getConnectionStatusUpdates();
        deviceConnector.timestampEstablishConnection = System.currentTimeMillis();
        ConnectionQueue connectionQueue = deviceConnector.connectionQueue;
        AbstractC4862t.b(str);
        connectionQueue.removeFromQueue(str);
        if (establishConnectionResult instanceof EstablishConnectionFailure) {
            deviceConnector.updateListeners.invoke(new ConnectionUpdateError(str, ((EstablishConnectionFailure) establishConnectionResult).getErrorMessage()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H establishConnection$lambda$17(DeviceConnector deviceConnector, String str, Throwable th) {
        ConnectionQueue connectionQueue = deviceConnector.connectionQueue;
        AbstractC4862t.b(str);
        connectionQueue.removeFromQueue(str);
        vc.l lVar = deviceConnector.updateListeners;
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        lVar.invoke(new ConnectionUpdateError(str, message));
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H establishConnection$lambda$19(DeviceConnector deviceConnector, EstablishConnectionResult establishConnectionResult) {
        deviceConnector.connectDeviceSubject.c(establishConnectionResult);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H establishConnection$lambda$21(DeviceConnector deviceConnector, Throwable th) {
        deviceConnector.connectDeviceSubject.onError(th);
        return C4015H.f34254a;
    }

    private final Hb.c getConnectionStatusUpdates() {
        return (Hb.c) this.connectionStatusUpdates.getValue();
    }

    private final EstablishConnectionResult getCurrentConnection() {
        if (this.lazyConnection.isInitialized()) {
            return (EstablishConnectionResult) getConnection$reactive_ble_mobile_release().S0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3890a lazyConnection$lambda$0(DeviceConnector deviceConnector) {
        deviceConnector.connectionDisposable = deviceConnector.establishConnection(deviceConnector.device);
        return deviceConnector.connectDeviceSubject;
    }

    private final void sendDisconnectedUpdate(String deviceId) {
        this.updateListeners.invoke(new ConnectionUpdateSuccess(deviceId, ConnectionState.DISCONNECTED.getCode()));
    }

    private final Eb.k waitUntilFirstOfQueue(final String deviceId) {
        C3890a queueSubject = this.connectionQueue.getQueueSubject();
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.t
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DeviceConnector.waitUntilFirstOfQueue$lambda$28(deviceId, (List) obj));
            }
        };
        Eb.k kVarI = queueSubject.I(new Jb.g() { // from class: com.signify.hue.flutterreactiveble.ble.u
            @Override // Jb.g
            public final boolean test(Object obj) {
                return DeviceConnector.waitUntilFirstOfQueue$lambda$29(lVar, obj);
            }
        });
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.v
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DeviceConnector.waitUntilFirstOfQueue$lambda$30(deviceId, (List) obj));
            }
        };
        return kVarI.E0(new Jb.g() { // from class: com.signify.hue.flutterreactiveble.ble.x
            @Override // Jb.g
            public final boolean test(Object obj) {
                return DeviceConnector.waitUntilFirstOfQueue$lambda$31(lVar2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean waitUntilFirstOfQueue$lambda$28(String str, List queue) {
        AbstractC4862t.e(queue, "queue");
        return AbstractC4862t.a(C4179C.j0(queue), str) || !queue.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean waitUntilFirstOfQueue$lambda$29(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return ((Boolean) lVar.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean waitUntilFirstOfQueue$lambda$30(String str, List it) {
        AbstractC4862t.e(it, "it");
        return it.isEmpty() || AbstractC4862t.a(C4179C.h0(it), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean waitUntilFirstOfQueue$lambda$31(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return ((Boolean) lVar.invoke(p02)).booleanValue();
    }

    public final Eb.a clearGattCache$reactive_ble_mobile_release() {
        Eb.a aVarF;
        EstablishConnectionResult currentConnection = getCurrentConnection();
        if (currentConnection != null) {
            if (currentConnection instanceof EstablishedConnection) {
                aVarF = clearGattCache(((EstablishedConnection) currentConnection).getRxConnection());
            } else {
                if (!(currentConnection instanceof EstablishConnectionFailure)) {
                    throw new C4032o();
                }
                aVarF = Eb.a.f(new Throwable(((EstablishConnectionFailure) currentConnection).getErrorMessage()));
                AbstractC4862t.d(aVarF, "error(...)");
            }
            if (aVarF != null) {
                return aVarF;
            }
        }
        Eb.a aVarF2 = Eb.a.f(new IllegalStateException("Connection is not established"));
        AbstractC4862t.d(aVarF2, "error(...)");
        return aVarF2;
    }

    public final void disconnectDevice$reactive_ble_mobile_release(final String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        long jCurrentTimeMillis = System.currentTimeMillis() - this.timestampEstablishConnection;
        if (jCurrentTimeMillis < minTimeMsBeforeDisconnectingIsAllowed) {
            Eb.r.G(minTimeMsBeforeDisconnectingIsAllowed - jCurrentTimeMillis, TimeUnit.MILLISECONDS).j(new Jb.a() { // from class: com.signify.hue.flutterreactiveble.ble.o
                @Override // Jb.a
                public final void run() {
                    DeviceConnector.disconnectDevice$lambda$8(this.f32555a, deviceId);
                }
            }).A();
        } else {
            sendDisconnectedUpdate(deviceId);
            disposeSubscriptions();
        }
    }

    public final C3890a getConnection$reactive_ble_mobile_release() {
        return (C3890a) this.lazyConnection.getValue();
    }

    /* JADX INFO: renamed from: getConnectionDisposable$reactive_ble_mobile_release, reason: from getter */
    public final Hb.c getConnectionDisposable() {
        return this.connectionDisposable;
    }

    public final Eb.r readRssi$reactive_ble_mobile_release() {
        Eb.r rVarN;
        EstablishConnectionResult currentConnection = getCurrentConnection();
        if (currentConnection != null) {
            if (currentConnection instanceof EstablishedConnection) {
                rVarN = ((EstablishedConnection) currentConnection).getRxConnection().h();
            } else {
                if (!(currentConnection instanceof EstablishConnectionFailure)) {
                    throw new C4032o();
                }
                rVarN = Eb.r.n(new Throwable(((EstablishConnectionFailure) currentConnection).getErrorMessage()));
            }
            if (rVarN != null) {
                return rVarN;
            }
        }
        Eb.r rVarN2 = Eb.r.n(new IllegalStateException("Connection is not established"));
        AbstractC4862t.d(rVarN2, "error(...)");
        return rVarN2;
    }

    public final void setConnectionDisposable$reactive_ble_mobile_release(Hb.c cVar) {
        this.connectionDisposable = cVar;
    }

    public static /* synthetic */ void getConnectionDisposable$reactive_ble_mobile_release$annotations() {
    }
}
