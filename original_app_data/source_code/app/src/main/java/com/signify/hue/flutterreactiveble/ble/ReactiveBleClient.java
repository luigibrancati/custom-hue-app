package com.signify.hue.flutterreactiveble.ble;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.ParcelUuid;
import com.signify.hue.flutterreactiveble.ble.extensions.RxBleConnectionExtensionKt;
import com.signify.hue.flutterreactiveble.converters.ManufacturerDataConverterKt;
import com.signify.hue.flutterreactiveble.model.ScanMode;
import com.signify.hue.flutterreactiveble.model.ScanModeKt;
import com.signify.hue.flutterreactiveble.utils.BleWrapperExtensionsKt;
import com.signify.hue.flutterreactiveble.utils.Duration;
import dc.C3890a;
import fc.C4015H;
import fc.C4032o;
import gc.C4202o;
import gc.C4206t;
import gc.C4207u;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Device;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ka.C;
import ka.G;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import ua.C6013d;
import ua.EnumC6011b;
import ua.g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 ^2\u00020\u0001:\u0001^B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ[\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122$\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00170\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\n2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!J3\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001fH\u0016¢\u0006\u0004\b1\u0010!J\u0017\u00103\u001a\u0002022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00104J\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J-\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b8\u00109J5\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b:\u0010;J5\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u0010;J-\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u0010>J%\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0010H\u0016¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\nH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010K\u001a\u00020H2\u0006\u0010G\u001a\u00020F2\u0006\u0010\t\u001a\u00020\bH\u0011¢\u0006\u0004\bI\u0010JJ%\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bO\u0010PJ\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/ReactiveBleClient;", "Lcom/signify/hue/flutterreactiveble/ble/BleClient;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "deviceId", "Lcom/signify/hue/flutterreactiveble/utils/Duration;", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, "LEb/k;", "Lcom/signify/hue/flutterreactiveble/ble/EstablishConnectionResult;", "getConnection", "(Ljava/lang/String;Lcom/signify/hue/flutterreactiveble/utils/Duration;)LEb/k;", "Ljava/util/UUID;", "characteristicId", "", "characteristicInstanceId", "", "value", "Lkotlin/Function3;", "Lka/N;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "LEb/r;", "bleOperation", "Lcom/signify/hue/flutterreactiveble/ble/CharOperationResult;", "executeWriteOperation", "(Ljava/lang/String;Ljava/util/UUID;I[BLvc/q;)LEb/r;", "deviceConnection", "setupNotificationOrIndication", "(Lcom/signify/hue/flutterreactiveble/ble/EstablishConnectionResult;Ljava/util/UUID;I)LEb/k;", "Lfc/H;", "enableDebugLogging", "()V", "initializeClient", "", "Landroid/os/ParcelUuid;", "services", "Lcom/signify/hue/flutterreactiveble/model/ScanMode;", "scanMode", "", "requireLocationServicesEnabled", "Lcom/signify/hue/flutterreactiveble/ble/ScanInfo;", "scanForDevices", "(Ljava/util/List;Lcom/signify/hue/flutterreactiveble/model/ScanMode;Z)LEb/k;", "connectToDevice", "(Ljava/lang/String;Lcom/signify/hue/flutterreactiveble/utils/Duration;)V", "disconnectDevice", "(Ljava/lang/String;)V", "disconnectAllDevices", "LEb/a;", "clearGattCache", "(Ljava/lang/String;)LEb/a;", "Lka/Q;", "discoverServices", "(Ljava/lang/String;)LEb/r;", "readCharacteristic", "(Ljava/lang/String;Ljava/util/UUID;I)LEb/r;", "writeCharacteristicWithResponse", "(Ljava/lang/String;Ljava/util/UUID;I[B)LEb/r;", "writeCharacteristicWithoutResponse", "setupNotification", "(Ljava/lang/String;Ljava/util/UUID;I)LEb/k;", RRWebVideoEvent.JsonKeys.SIZE, "Lcom/signify/hue/flutterreactiveble/ble/MtuNegotiateResult;", "negotiateMtuSize", "(Ljava/lang/String;I)LEb/r;", "Lcom/signify/hue/flutterreactiveble/ble/BleStatus;", "observeBleStatus", "()LEb/k;", "Lka/P;", Device.TYPE, "Lcom/signify/hue/flutterreactiveble/ble/DeviceConnector;", "createDeviceConnector$reactive_ble_mobile_release", "(Lka/P;Lcom/signify/hue/flutterreactiveble/utils/Duration;)Lcom/signify/hue/flutterreactiveble/ble/DeviceConnector;", "createDeviceConnector", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionPriority;", "priority", "Lcom/signify/hue/flutterreactiveble/ble/RequestConnectionPriorityResult;", "requestConnectionPriority", "(Ljava/lang/String;Lcom/signify/hue/flutterreactiveble/ble/ConnectionPriority;)LEb/r;", "readRssi", "Landroid/content/Context;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionQueue;", "connectionQueue", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionQueue;", "LHb/b;", "allConnections", "LHb/b;", "Ldc/a;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionUpdate;", "getConnectionUpdateSubject", "()Ldc/a;", "connectionUpdateSubject", "Companion", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ReactiveBleClient implements BleClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Map<String, DeviceConnector> activeConnections;
    private static final C3890a connectionUpdateBehaviorSubject;
    public static ka.G rxBleClient;
    private final Hb.b allConnections;
    private final ConnectionQueue connectionQueue;
    private final Context context;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ble/ReactiveBleClient$Companion;", "", "<init>", "()V", "Lka/G;", "value", "rxBleClient", "Lka/G;", "getRxBleClient", "()Lka/G;", "setRxBleClient$reactive_ble_mobile_release", "(Lka/G;)V", "", "", "Lcom/signify/hue/flutterreactiveble/ble/DeviceConnector;", "activeConnections", "Ljava/util/Map;", "getActiveConnections$reactive_ble_mobile_release", "()Ljava/util/Map;", "setActiveConnections$reactive_ble_mobile_release", "(Ljava/util/Map;)V", "Ldc/a;", "Lcom/signify/hue/flutterreactiveble/ble/ConnectionUpdate;", "connectionUpdateBehaviorSubject", "Ldc/a;", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Map<String, DeviceConnector> getActiveConnections$reactive_ble_mobile_release() {
            return ReactiveBleClient.activeConnections;
        }

        public final ka.G getRxBleClient() {
            ka.G g10 = ReactiveBleClient.rxBleClient;
            if (g10 != null) {
                return g10;
            }
            AbstractC4862t.p("rxBleClient");
            return null;
        }

        public final void setActiveConnections$reactive_ble_mobile_release(Map<String, DeviceConnector> map) {
            AbstractC4862t.e(map, "<set-?>");
            ReactiveBleClient.activeConnections = map;
        }

        public final void setRxBleClient$reactive_ble_mobile_release(ka.G g10) {
            AbstractC4862t.e(g10, "<set-?>");
            ReactiveBleClient.rxBleClient = g10;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6011b.values().length];
            try {
                iArr[EnumC6011b.LEGACY_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6011b.NOT_CONNECTABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6011b.CONNECTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.signify.hue.flutterreactiveble.ble.ReactiveBleClient$writeCharacteristicWithResponse$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass1 extends AbstractC4860q implements vc.q {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3, RxBleConnectionExtensionKt.class, "writeCharWithResponse", "writeCharWithResponse(Lcom/polidea/rxandroidble2/RxBleConnection;Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lio/reactivex/Single;", 1);
        }

        @Override // vc.q
        public final Eb.r invoke(ka.N p02, BluetoothGattCharacteristic p12, byte[] p22) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            AbstractC4862t.e(p22, "p2");
            return RxBleConnectionExtensionKt.writeCharWithResponse(p02, p12, p22);
        }
    }

    /* JADX INFO: renamed from: com.signify.hue.flutterreactiveble.ble.ReactiveBleClient$writeCharacteristicWithoutResponse$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C37551 extends AbstractC4860q implements vc.q {
        public static final C37551 INSTANCE = new C37551();

        public C37551() {
            super(3, RxBleConnectionExtensionKt.class, "writeCharWithoutResponse", "writeCharWithoutResponse(Lcom/polidea/rxandroidble2/RxBleConnection;Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lio/reactivex/Single;", 1);
        }

        @Override // vc.q
        public final Eb.r invoke(ka.N p02, BluetoothGattCharacteristic p12, byte[] p22) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            AbstractC4862t.e(p22, "p2");
            return RxBleConnectionExtensionKt.writeCharWithoutResponse(p02, p12, p22);
        }
    }

    static {
        C3890a c3890aQ0 = C3890a.Q0();
        AbstractC4862t.d(c3890aQ0, "create(...)");
        connectionUpdateBehaviorSubject = c3890aQ0;
        activeConnections = new LinkedHashMap();
    }

    public ReactiveBleClient(Context context) {
        AbstractC4862t.e(context, "context");
        this.context = context;
        this.connectionQueue = new ConnectionQueue();
        this.allConnections = new Hb.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H connectToDevice$lambda$5(String str, EstablishConnectionResult establishConnectionResult) {
        if (!(establishConnectionResult instanceof EstablishedConnection)) {
            if (!(establishConnectionResult instanceof EstablishConnectionFailure)) {
                throw new C4032o();
            }
            connectionUpdateBehaviorSubject.c(new ConnectionUpdateError(str, ((EstablishConnectionFailure) establishConnectionResult).getErrorMessage()));
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H connectToDevice$lambda$7(String str, Throwable th) {
        String message;
        C3890a c3890a = connectionUpdateBehaviorSubject;
        if (th == null || (message = th.getMessage()) == null) {
            message = "unknown error";
        }
        c3890a.c(new ConnectionUpdateError(str, message));
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v discoverServices$lambda$10(EstablishConnectionResult connectionResult) {
        AbstractC4862t.e(connectionResult, "connectionResult");
        if (connectionResult instanceof EstablishedConnection) {
            EstablishedConnection establishedConnection = (EstablishedConnection) connectionResult;
            return INSTANCE.getRxBleClient().b(establishedConnection.getDeviceId()).b().getBondState() == 11 ? Eb.r.n(new Exception("Bonding is in progress wait for bonding to be finished before executing more operations on the device")) : establishedConnection.getRxConnection().f();
        }
        if (connectionResult instanceof EstablishConnectionFailure) {
            return Eb.r.n(new Exception(((EstablishConnectionFailure) connectionResult).getErrorMessage()));
        }
        throw new C4032o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v discoverServices$lambda$11(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.v) lVar.invoke(p02);
    }

    private final void enableDebugLogging() {
        ka.G.f(new C.a().b(2).c(2).e(2).d(Boolean.TRUE).a());
    }

    private final Eb.r executeWriteOperation(final String deviceId, final UUID characteristicId, final int characteristicInstanceId, final byte[] value, final vc.q bleOperation) {
        Eb.k connection$default = getConnection$default(this, deviceId, null, 2, null);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.O
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.executeWriteOperation$lambda$35(characteristicId, characteristicInstanceId, deviceId, bleOperation, value, (EstablishConnectionResult) obj);
            }
        };
        Eb.r rVarJ = connection$default.Q(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.P
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.executeWriteOperation$lambda$36(lVar, obj);
            }
        }).J(new CharOperationFailed(deviceId, "Writechar timed-out"));
        AbstractC4862t.d(rVarJ, "first(...)");
        return rVarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v executeWriteOperation$lambda$35(UUID uuid, int i10, final String str, final vc.q qVar, final byte[] bArr, final EstablishConnectionResult connectionResult) {
        AbstractC4862t.e(connectionResult, "connectionResult");
        if (connectionResult instanceof EstablishedConnection) {
            Eb.r rVarResolveCharacteristic = RxBleConnectionExtensionKt.resolveCharacteristic(((EstablishedConnection) connectionResult).getRxConnection(), uuid, i10);
            final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.o0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return ReactiveBleClient.executeWriteOperation$lambda$35$lambda$33(qVar, connectionResult, bArr, str, (BluetoothGattCharacteristic) obj);
                }
            };
            Eb.r rVarQ = rVarResolveCharacteristic.q(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.p0
                @Override // Jb.e
                public final Object apply(Object obj) {
                    return ReactiveBleClient.executeWriteOperation$lambda$35$lambda$34(lVar, obj);
                }
            });
            AbstractC4862t.b(rVarQ);
            return rVarQ;
        }
        if (!(connectionResult instanceof EstablishConnectionFailure)) {
            throw new C4032o();
        }
        Eb.r rVarT = Eb.r.t(new CharOperationFailed(str, "failed to connect " + ((EstablishConnectionFailure) connectionResult).getErrorMessage()));
        AbstractC4862t.b(rVarT);
        return rVarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v executeWriteOperation$lambda$35$lambda$33(vc.q qVar, EstablishConnectionResult establishConnectionResult, byte[] bArr, final String str, BluetoothGattCharacteristic characteristic) {
        AbstractC4862t.e(characteristic, "characteristic");
        Eb.r rVar = (Eb.r) qVar.invoke(((EstablishedConnection) establishConnectionResult).getRxConnection(), characteristic, bArr);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.d0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.executeWriteOperation$lambda$35$lambda$33$lambda$31(str, (byte[]) obj);
            }
        };
        return rVar.u(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.e0
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.executeWriteOperation$lambda$35$lambda$33$lambda$32(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharOperationSuccessful executeWriteOperation$lambda$35$lambda$33$lambda$31(String str, byte[] value) {
        AbstractC4862t.e(value, "value");
        return new CharOperationSuccessful(str, C4202o.e(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharOperationSuccessful executeWriteOperation$lambda$35$lambda$33$lambda$32(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (CharOperationSuccessful) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v executeWriteOperation$lambda$35$lambda$34(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.v) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v executeWriteOperation$lambda$36(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.v) lVar.invoke(p02);
    }

    private final Eb.k getConnection(String deviceId, Duration timeout) {
        ka.P pB = INSTANCE.getRxBleClient().b(deviceId);
        Map<String, DeviceConnector> map = activeConnections;
        DeviceConnector deviceConnectorCreateDeviceConnector$reactive_ble_mobile_release = map.get(deviceId);
        if (deviceConnectorCreateDeviceConnector$reactive_ble_mobile_release == null) {
            AbstractC4862t.b(pB);
            deviceConnectorCreateDeviceConnector$reactive_ble_mobile_release = createDeviceConnector$reactive_ble_mobile_release(pB, timeout);
            map.put(deviceId, deviceConnectorCreateDeviceConnector$reactive_ble_mobile_release);
        }
        return deviceConnectorCreateDeviceConnector$reactive_ble_mobile_release.getConnection$reactive_ble_mobile_release();
    }

    public static /* synthetic */ Eb.k getConnection$default(ReactiveBleClient reactiveBleClient, String str, Duration duration, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConnection");
        }
        if ((i10 & 2) != 0) {
            duration = new Duration(0L, TimeUnit.MILLISECONDS);
        }
        return reactiveBleClient.getConnection(str, duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v negotiateMtuSize$lambda$26(int i10, final String str, EstablishConnectionResult connectionResult) {
        AbstractC4862t.e(connectionResult, "connectionResult");
        if (connectionResult instanceof EstablishedConnection) {
            Eb.r rVarC = ((EstablishedConnection) connectionResult).getRxConnection().c(i10);
            final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.G
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return ReactiveBleClient.negotiateMtuSize$lambda$26$lambda$24(str, (Integer) obj);
                }
            };
            Eb.r rVarU = rVarC.u(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.H
                @Override // Jb.e
                public final Object apply(Object obj) {
                    return ReactiveBleClient.negotiateMtuSize$lambda$26$lambda$25(lVar, obj);
                }
            });
            AbstractC4862t.d(rVarU, "map(...)");
            return rVarU;
        }
        if (!(connectionResult instanceof EstablishConnectionFailure)) {
            throw new C4032o();
        }
        Eb.r rVarT = Eb.r.t(new MtuNegotiateFailed(str, "failed to connect " + ((EstablishConnectionFailure) connectionResult).getErrorMessage()));
        AbstractC4862t.d(rVarT, "just(...)");
        return rVarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MtuNegotiateSuccessful negotiateMtuSize$lambda$26$lambda$24(String str, Integer value) {
        AbstractC4862t.e(value, "value");
        return new MtuNegotiateSuccessful(str, value.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MtuNegotiateSuccessful negotiateMtuSize$lambda$26$lambda$25(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (MtuNegotiateSuccessful) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v negotiateMtuSize$lambda$27(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.v) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BleStatus observeBleStatus$lambda$28(G.a it) {
        AbstractC4862t.e(it, "it");
        return BleWrapperExtensionsKt.toBleState(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BleStatus observeBleStatus$lambda$29(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (BleStatus) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v readCharacteristic$lambda$18(UUID uuid, int i10, final String str, final EstablishConnectionResult connectionResult) {
        AbstractC4862t.e(connectionResult, "connectionResult");
        if (connectionResult instanceof EstablishedConnection) {
            Eb.r rVarResolveCharacteristic = RxBleConnectionExtensionKt.resolveCharacteristic(((EstablishedConnection) connectionResult).getRxConnection(), uuid, i10);
            final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.s0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return ReactiveBleClient.readCharacteristic$lambda$18$lambda$16(connectionResult, str, (BluetoothGattCharacteristic) obj);
                }
            };
            Eb.r rVarQ = rVarResolveCharacteristic.q(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.t0
                @Override // Jb.e
                public final Object apply(Object obj) {
                    return ReactiveBleClient.readCharacteristic$lambda$18$lambda$17(lVar, obj);
                }
            });
            AbstractC4862t.b(rVarQ);
            return rVarQ;
        }
        if (!(connectionResult instanceof EstablishConnectionFailure)) {
            throw new C4032o();
        }
        Eb.r rVarT = Eb.r.t(new CharOperationFailed(str, "failed to connect " + ((EstablishConnectionFailure) connectionResult).getErrorMessage()));
        AbstractC4862t.d(rVarT, "just(...)");
        return rVarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v readCharacteristic$lambda$18$lambda$16(EstablishConnectionResult establishConnectionResult, final String str, BluetoothGattCharacteristic c10) {
        AbstractC4862t.e(c10, "c");
        Eb.r rVarA = ((EstablishedConnection) establishConnectionResult).getRxConnection().a(c10);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.F
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ReactiveBleClient.readCharacteristic$lambda$18$lambda$16$lambda$12((Throwable) obj));
            }
        };
        Eb.r rVarZ = rVarA.z(1L, new Jb.g() { // from class: com.signify.hue.flutterreactiveble.ble.Q
            @Override // Jb.g
            public final boolean test(Object obj) {
                return ReactiveBleClient.readCharacteristic$lambda$18$lambda$16$lambda$13(lVar, obj);
            }
        });
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.c0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.readCharacteristic$lambda$18$lambda$16$lambda$14(str, (byte[]) obj);
            }
        };
        return rVarZ.u(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.n0
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.readCharacteristic$lambda$18$lambda$16$lambda$15(lVar2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean readCharacteristic$lambda$18$lambda$16$lambda$12(Throwable it) {
        AbstractC4862t.e(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean readCharacteristic$lambda$18$lambda$16$lambda$13(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return ((Boolean) lVar.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharOperationSuccessful readCharacteristic$lambda$18$lambda$16$lambda$14(String str, byte[] value) {
        AbstractC4862t.e(value, "value");
        return new CharOperationSuccessful(str, C4202o.e(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharOperationSuccessful readCharacteristic$lambda$18$lambda$16$lambda$15(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (CharOperationSuccessful) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v readCharacteristic$lambda$18$lambda$17(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.v) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v readCharacteristic$lambda$19(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.v) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v readRssi$lambda$43(EstablishConnectionResult connectionResult) {
        AbstractC4862t.e(connectionResult, "connectionResult");
        if (connectionResult instanceof EstablishedConnection) {
            return ((EstablishedConnection) connectionResult).getRxConnection().h();
        }
        if (connectionResult instanceof EstablishConnectionFailure) {
            return Eb.r.n(new IllegalStateException("Reading RSSI failed. Device is not connected"));
        }
        throw new C4032o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v readRssi$lambda$44(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.v) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v requestConnectionPriority$lambda$41(ConnectionPriority connectionPriority, final String str, final EstablishConnectionResult connectionResult) {
        AbstractC4862t.e(connectionResult, "connectionResult");
        if (connectionResult instanceof EstablishedConnection) {
            Eb.r rVarP = ((EstablishedConnection) connectionResult).getRxConnection().g(connectionPriority.getCode(), 2L, TimeUnit.SECONDS).p(new Callable() { // from class: com.signify.hue.flutterreactiveble.ble.U
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ReactiveBleClient.requestConnectionPriority$lambda$41$lambda$39(str);
                }
            });
            AbstractC4862t.d(rVarP, "toSingle(...)");
            return rVarP;
        }
        if (!(connectionResult instanceof EstablishConnectionFailure)) {
            throw new C4032o();
        }
        Eb.r rVarS = Eb.r.s(new Callable() { // from class: com.signify.hue.flutterreactiveble.ble.V
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactiveBleClient.requestConnectionPriority$lambda$41$lambda$40(str, connectionResult);
            }
        });
        AbstractC4862t.d(rVarS, "fromCallable(...)");
        return rVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestConnectionPrioritySuccess requestConnectionPriority$lambda$41$lambda$39(String str) {
        return new RequestConnectionPrioritySuccess(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestConnectionPriorityFailed requestConnectionPriority$lambda$41$lambda$40(String str, EstablishConnectionResult establishConnectionResult) {
        return new RequestConnectionPriorityFailed(str, ((EstablishConnectionFailure) establishConnectionResult).getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.v requestConnectionPriority$lambda$42(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.v) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanInfo scanForDevices$lambda$3(ua.f result) {
        Connectable connectable;
        Map mapI;
        List listK;
        AbstractC4862t.e(result, "result");
        String strC = result.a().c();
        AbstractC4862t.d(strC, "getMacAddress(...)");
        String strA = result.c().a();
        if (strA == null && (strA = result.a().getName()) == null) {
            strA = "";
        }
        String str = strA;
        int iB = result.b();
        EnumC6011b enumC6011bD = result.d();
        int i10 = enumC6011bD == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC6011bD.ordinal()];
        if (i10 == -1 || i10 == 1) {
            connectable = Connectable.UNKNOWN;
        } else if (i10 == 2) {
            connectable = Connectable.NOT_CONNECTABLE;
        } else {
            if (i10 != 3) {
                throw new C4032o();
            }
            connectable = Connectable.CONNECTABLE;
        }
        Connectable connectable2 = connectable;
        Map mapE = result.c().e();
        if (mapE != null) {
            mapI = new LinkedHashMap(gc.P.e(mapE.size()));
            for (Map.Entry entry : mapE.entrySet()) {
                UUID uuid = ((ParcelUuid) entry.getKey()).getUuid();
                AbstractC4862t.d(uuid, "getUuid(...)");
                mapI.put(uuid, entry.getValue());
            }
        } else {
            mapI = gc.Q.i();
        }
        Map map = mapI;
        List listD = result.c().d();
        if (listD != null) {
            listK = new ArrayList(C4207u.v(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                listK.add(((ParcelUuid) it.next()).getUuid());
            }
        } else {
            listK = C4206t.k();
        }
        return new ScanInfo(strC, str, iB, connectable2, map, listK, ManufacturerDataConverterKt.extractManufacturerData(result.c().c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanInfo scanForDevices$lambda$4(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (ScanInfo) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n setupNotification$lambda$20(ReactiveBleClient reactiveBleClient, UUID uuid, int i10, EstablishConnectionResult deviceConnection) {
        AbstractC4862t.e(deviceConnection, "deviceConnection");
        return reactiveBleClient.setupNotificationOrIndication(deviceConnection, uuid, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n setupNotification$lambda$21(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.n) lVar.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n setupNotification$lambda$22(Eb.k notificationObservable) {
        AbstractC4862t.e(notificationObservable, "notificationObservable");
        return notificationObservable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n setupNotification$lambda$23(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.n) lVar.invoke(p02);
    }

    private final Eb.k setupNotificationOrIndication(final EstablishConnectionResult deviceConnection, UUID characteristicId, int characteristicInstanceId) {
        Eb.k kVarR;
        if (!(deviceConnection instanceof EstablishedConnection)) {
            if (!(deviceConnection instanceof EstablishConnectionFailure)) {
                throw new C4032o();
            }
            Eb.k kVarY = Eb.k.Y(Eb.k.F());
            AbstractC4862t.b(kVarY);
            return kVarY;
        }
        EstablishedConnection establishedConnection = (EstablishedConnection) deviceConnection;
        if (INSTANCE.getRxBleClient().b(establishedConnection.getDeviceId()).b().getBondState() == 11) {
            kVarR = Eb.k.G(new Exception("Bonding is in progress wait for bonding to be finished before executing more operations on the device"));
        } else {
            Eb.r rVarResolveCharacteristic = RxBleConnectionExtensionKt.resolveCharacteristic(establishedConnection.getRxConnection(), characteristicId, characteristicInstanceId);
            final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.j0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return ReactiveBleClient.setupNotificationOrIndication$lambda$37(deviceConnection, (BluetoothGattCharacteristic) obj);
                }
            };
            kVarR = rVarResolveCharacteristic.r(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.k0
                @Override // Jb.e
                public final Object apply(Object obj) {
                    return ReactiveBleClient.setupNotificationOrIndication$lambda$38(lVar, obj);
                }
            });
        }
        AbstractC4862t.b(kVarR);
        return kVarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n setupNotificationOrIndication$lambda$37(EstablishConnectionResult establishConnectionResult, BluetoothGattCharacteristic characteristic) {
        AbstractC4862t.e(characteristic, "characteristic");
        ka.D d10 = characteristic.getDescriptors().isEmpty() ? ka.D.COMPAT : ka.D.DEFAULT;
        return (characteristic.getProperties() & 16) > 0 ? ((EstablishedConnection) establishConnectionResult).getRxConnection().e(characteristic, d10) : ((EstablishedConnection) establishConnectionResult).getRxConnection().i(characteristic, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Eb.n setupNotificationOrIndication$lambda$38(vc.l lVar, Object p02) {
        AbstractC4862t.e(p02, "p0");
        return (Eb.n) lVar.invoke(p02);
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.a clearGattCache(String deviceId) {
        Eb.a aVarClearGattCache$reactive_ble_mobile_release;
        AbstractC4862t.e(deviceId, "deviceId");
        DeviceConnector deviceConnector = activeConnections.get(deviceId);
        if (deviceConnector != null && (aVarClearGattCache$reactive_ble_mobile_release = deviceConnector.clearGattCache$reactive_ble_mobile_release()) != null) {
            return aVarClearGattCache$reactive_ble_mobile_release;
        }
        Eb.a aVarF = Eb.a.f(new IllegalStateException("Device is not connected"));
        AbstractC4862t.d(aVarF, "error(...)");
        return aVarF;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public void connectToDevice(final String deviceId, Duration timeout) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(timeout, "timeout");
        Hb.b bVar = this.allConnections;
        Eb.k connection = getConnection(deviceId, timeout);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.Y
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.connectToDevice$lambda$5(deviceId, (EstablishConnectionResult) obj);
            }
        };
        Jb.d dVar = new Jb.d() { // from class: com.signify.hue.flutterreactiveble.ble.Z
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        };
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.a0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.connectToDevice$lambda$7(deviceId, (Throwable) obj);
            }
        };
        bVar.a(connection.t0(dVar, new Jb.d() { // from class: com.signify.hue.flutterreactiveble.ble.b0
            @Override // Jb.d
            public final void accept(Object obj) {
                lVar2.invoke(obj);
            }
        }));
    }

    public DeviceConnector createDeviceConnector$reactive_ble_mobile_release(ka.P device, Duration timeout) {
        AbstractC4862t.e(device, "device");
        AbstractC4862t.e(timeout, "timeout");
        return new DeviceConnector(device, timeout, new ReactiveBleClient$createDeviceConnector$1(connectionUpdateBehaviorSubject), this.connectionQueue);
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public void disconnectAllDevices() {
        for (Map.Entry<String, DeviceConnector> entry : activeConnections.entrySet()) {
            entry.getValue().disconnectDevice$reactive_ble_mobile_release(entry.getKey());
        }
        this.allConnections.dispose();
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public void disconnectDevice(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        DeviceConnector deviceConnector = activeConnections.get(deviceId);
        if (deviceConnector != null) {
            deviceConnector.disconnectDevice$reactive_ble_mobile_release(deviceId);
        }
        activeConnections.remove(deviceId);
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.r discoverServices(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        Eb.k connection$default = getConnection$default(this, deviceId, null, 2, null);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.M
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.discoverServices$lambda$10((EstablishConnectionResult) obj);
            }
        };
        Eb.r rVarL = connection$default.Q(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.N
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.discoverServices$lambda$11(lVar, obj);
            }
        }).L();
        AbstractC4862t.d(rVarL, "firstOrError(...)");
        return rVarL;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public C3890a getConnectionUpdateSubject() {
        return connectionUpdateBehaviorSubject;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public void initializeClient() {
        activeConnections = new LinkedHashMap();
        Companion companion = INSTANCE;
        ka.G gA = ka.G.a(this.context);
        AbstractC4862t.d(gA, "create(...)");
        companion.setRxBleClient$reactive_ble_mobile_release(gA);
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.r negotiateMtuSize(final String deviceId, final int size) {
        AbstractC4862t.e(deviceId, "deviceId");
        Eb.k connection$default = getConnection$default(this, deviceId, null, 2, null);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.l0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.negotiateMtuSize$lambda$26(size, deviceId, (EstablishConnectionResult) obj);
            }
        };
        Eb.r rVarJ = connection$default.Q(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.m0
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.negotiateMtuSize$lambda$27(lVar, obj);
            }
        }).J(new MtuNegotiateFailed(deviceId, "negotiate mtu timed out"));
        AbstractC4862t.d(rVarJ, "first(...)");
        return rVarJ;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.k observeBleStatus() {
        Companion companion = INSTANCE;
        Eb.k kVarR0 = companion.getRxBleClient().d().r0(companion.getRxBleClient().c());
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.q0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.observeBleStatus$lambda$28((G.a) obj);
            }
        };
        Eb.k kVarZ = kVarR0.Z(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.r0
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.observeBleStatus$lambda$29(lVar, obj);
            }
        });
        AbstractC4862t.d(kVarZ, "map(...)");
        return kVarZ;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.r readCharacteristic(final String deviceId, final UUID characteristicId, final int characteristicInstanceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(characteristicId, "characteristicId");
        Eb.k connection$default = getConnection$default(this, deviceId, null, 2, null);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.K
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.readCharacteristic$lambda$18(characteristicId, characteristicInstanceId, deviceId, (EstablishConnectionResult) obj);
            }
        };
        Eb.r rVarJ = connection$default.Q(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.L
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.readCharacteristic$lambda$19(lVar, obj);
            }
        }).J(new CharOperationFailed(deviceId, "read char failed"));
        AbstractC4862t.d(rVarJ, "first(...)");
        return rVarJ;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.r readRssi(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        Eb.k connection$default = getConnection$default(this, deviceId, null, 2, null);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.I
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.readRssi$lambda$43((EstablishConnectionResult) obj);
            }
        };
        Eb.r rVarL = connection$default.Q(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.J
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.readRssi$lambda$44(lVar, obj);
            }
        }).L();
        AbstractC4862t.d(rVarL, "firstOrError(...)");
        return rVarL;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.r requestConnectionPriority(final String deviceId, final ConnectionPriority priority) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(priority, "priority");
        Eb.k connection$default = getConnection$default(this, deviceId, null, 2, null);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.W
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.requestConnectionPriority$lambda$41(priority, deviceId, (EstablishConnectionResult) obj);
            }
        };
        Eb.r rVarJ = connection$default.A0(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.X
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.requestConnectionPriority$lambda$42(lVar, obj);
            }
        }).J(new RequestConnectionPriorityFailed(deviceId, "Unknown failure"));
        AbstractC4862t.d(rVarJ, "first(...)");
        return rVarJ;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.k scanForDevices(List<ParcelUuid> services, ScanMode scanMode, boolean requireLocationServicesEnabled) {
        AbstractC4862t.e(services, "services");
        AbstractC4862t.e(scanMode, "scanMode");
        ArrayList arrayList = new ArrayList(C4207u.v(services, 10));
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            arrayList.add(new C6013d.b().j((ParcelUuid) it.next()).a());
        }
        C6013d[] c6013dArr = (C6013d[]) arrayList.toArray(new C6013d[0]);
        Eb.k kVarE = INSTANCE.getRxBleClient().e(new g.b().e(ScanModeKt.toScanSettings(scanMode)).d(false).c(1).f(requireLocationServicesEnabled).a(), (C6013d[]) Arrays.copyOf(c6013dArr, c6013dArr.length));
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.S
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.scanForDevices$lambda$3((ua.f) obj);
            }
        };
        Eb.k kVarZ = kVarE.Z(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.T
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.scanForDevices$lambda$4(lVar, obj);
            }
        });
        AbstractC4862t.d(kVarZ, "map(...)");
        return kVarZ;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.k setupNotification(String deviceId, final UUID characteristicId, final int characteristicInstanceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(characteristicId, "characteristicId");
        Eb.k connection$default = getConnection$default(this, deviceId, null, 2, null);
        final vc.l lVar = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.f0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.setupNotification$lambda$20(this.f32536a, characteristicId, characteristicInstanceId, (EstablishConnectionResult) obj);
            }
        };
        Eb.k kVarM = connection$default.M(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.g0
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.setupNotification$lambda$21(lVar, obj);
            }
        });
        final vc.l lVar2 = new vc.l() { // from class: com.signify.hue.flutterreactiveble.ble.h0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return ReactiveBleClient.setupNotification$lambda$22((Eb.k) obj);
            }
        };
        Eb.k kVarM2 = kVarM.M(new Jb.e() { // from class: com.signify.hue.flutterreactiveble.ble.i0
            @Override // Jb.e
            public final Object apply(Object obj) {
                return ReactiveBleClient.setupNotification$lambda$23(lVar2, obj);
            }
        });
        AbstractC4862t.d(kVarM2, "flatMap(...)");
        return kVarM2;
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.r writeCharacteristicWithResponse(String deviceId, UUID characteristicId, int characteristicInstanceId, byte[] value) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(characteristicId, "characteristicId");
        AbstractC4862t.e(value, "value");
        return executeWriteOperation(deviceId, characteristicId, characteristicInstanceId, value, AnonymousClass1.INSTANCE);
    }

    @Override // com.signify.hue.flutterreactiveble.ble.BleClient
    public Eb.r writeCharacteristicWithoutResponse(String deviceId, UUID characteristicId, int characteristicInstanceId, byte[] value) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC4862t.e(characteristicId, "characteristicId");
        AbstractC4862t.e(value, "value");
        return executeWriteOperation(deviceId, characteristicId, characteristicInstanceId, value, C37551.INSTANCE);
    }
}
