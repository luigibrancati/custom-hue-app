package com.signify.hue.dnsservicediscovery;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.signify.hue.dnsservicediscovery.NetworkServiceDiscovery;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJK\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\b\u0018\u00010\u001dR\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/signify/hue/dnsservicediscovery/NetworkServiceDiscovery;", "", "Landroid/content/Context;", "context", "", "", "serviceTypes", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Lkotlin/Function1;", "Lcom/signify/hue/dnsservicediscovery/ServiceInfo;", "Lfc/H;", "onServiceResolved", "onNsdServiceLost", "onDiscoveryFailed", "startDiscovery", "(Lvc/l;Lvc/l;Lvc/l;)V", "resolveNextServiceInQueue", "()V", "onServiceLost", "start", "stop", "Ljava/util/List;", "Landroid/net/nsd/NsdManager;", "nsdManager", "Landroid/net/nsd/NsdManager;", "Landroid/net/wifi/WifiManager;", "wifi", "Landroid/net/wifi/WifiManager;", "Landroid/net/wifi/WifiManager$MulticastLock;", "multicastLock", "Landroid/net/wifi/WifiManager$MulticastLock;", "", "Landroid/net/nsd/NsdManager$DiscoveryListener;", "discoveryListeners", "Ljava/util/Map;", "Landroid/net/nsd/NsdManager$ResolveListener;", "resolveListener", "Landroid/net/nsd/NsdManager$ResolveListener;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "resolveListenerIsBusy", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Landroid/net/nsd/NsdServiceInfo;", "pendingNsdServices", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Landroid/os/HandlerThread;", "startHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "startHandler", "Landroid/os/Handler;", "dns_service_discovery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkServiceDiscovery {
    private Map<String, NsdManager.DiscoveryListener> discoveryListeners;
    private WifiManager.MulticastLock multicastLock;
    private final NsdManager nsdManager;
    private ConcurrentLinkedQueue<NsdServiceInfo> pendingNsdServices;
    private NsdManager.ResolveListener resolveListener;
    private AtomicBoolean resolveListenerIsBusy;
    private final List<String> serviceTypes;
    private Handler startHandler;
    private HandlerThread startHandlerThread;
    private final WifiManager wifi;

    /* JADX INFO: renamed from: com.signify.hue.dnsservicediscovery.NetworkServiceDiscovery$startDiscovery$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/signify/hue/dnsservicediscovery/NetworkServiceDiscovery$startDiscovery$1", "Landroid/net/nsd/NsdManager$ResolveListener;", "Landroid/net/nsd/NsdServiceInfo;", "service", "Lfc/H;", "onServiceResolved", "(Landroid/net/nsd/NsdServiceInfo;)V", "serviceInfo", "", "errorCode", "onResolveFailed", "(Landroid/net/nsd/NsdServiceInfo;I)V", "dns_service_discovery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 implements NsdManager.ResolveListener {
        final /* synthetic */ l $onServiceResolved;

        public AnonymousClass1(l lVar) {
            this.$onServiceResolved = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onServiceResolved$lambda$0(l lVar, NsdServiceInfo nsdServiceInfo) {
            String hostAddress;
            String serviceName = nsdServiceInfo.getServiceName();
            AbstractC4862t.d(serviceName, "getServiceName(...)");
            InetAddress host = nsdServiceInfo.getHost();
            if (host == null || (hostAddress = host.getHostAddress()) == null) {
                hostAddress = "";
            }
            lVar.invoke(new ServiceInfo(serviceName, hostAddress, String.valueOf(nsdServiceInfo.getPort())));
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo serviceInfo, int errorCode) {
            AbstractC4862t.e(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(final NsdServiceInfo service) {
            AbstractC4862t.e(service, "service");
            Handler handler = new Handler(Looper.getMainLooper());
            final l lVar = this.$onServiceResolved;
            handler.post(new Runnable() { // from class: com.signify.hue.dnsservicediscovery.e
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkServiceDiscovery.AnonymousClass1.onServiceResolved$lambda$0(lVar, service);
                }
            });
            NetworkServiceDiscovery.this.resolveNextServiceInQueue();
        }
    }

    public NetworkServiceDiscovery(Context context, List<String> serviceTypes) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(serviceTypes, "serviceTypes");
        this.serviceTypes = serviceTypes;
        this.nsdManager = (NsdManager) context.getSystemService("servicediscovery");
        this.wifi = (WifiManager) context.getSystemService("wifi");
        this.discoveryListeners = new LinkedHashMap();
        this.resolveListenerIsBusy = new AtomicBoolean(false);
        this.pendingNsdServices = new ConcurrentLinkedQueue<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveNextServiceInQueue() {
        NsdManager.ResolveListener resolveListener;
        NsdServiceInfo nsdServiceInfoPoll = this.pendingNsdServices.poll();
        if (nsdServiceInfoPoll == null || (resolveListener = this.resolveListener) == null) {
            this.resolveListenerIsBusy.set(false);
            return;
        }
        NsdManager nsdManager = this.nsdManager;
        if (nsdManager != null) {
            nsdManager.resolveService(nsdServiceInfoPoll, resolveListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startDiscovery(l onServiceResolved, l onNsdServiceLost, l onDiscoveryFailed) {
        this.resolveListener = new AnonymousClass1(onServiceResolved);
        for (String str : this.serviceTypes) {
            NetworkServiceDiscovery$startDiscovery$discoveryListener$1 networkServiceDiscovery$startDiscovery$discoveryListener$1 = new NetworkServiceDiscovery$startDiscovery$discoveryListener$1(this, onNsdServiceLost, onDiscoveryFailed);
            this.discoveryListeners.put(str, networkServiceDiscovery$startDiscovery$discoveryListener$1);
            NsdManager nsdManager = this.nsdManager;
            if (nsdManager != null) {
                nsdManager.discoverServices(str, 1, networkServiceDiscovery$startDiscovery$discoveryListener$1);
            }
        }
    }

    public final void start(final l onServiceResolved, final l onServiceLost, final l onDiscoveryFailed) {
        AbstractC4862t.e(onServiceResolved, "onServiceResolved");
        AbstractC4862t.e(onServiceLost, "onServiceLost");
        AbstractC4862t.e(onDiscoveryFailed, "onDiscoveryFailed");
        stop();
        WifiManager wifiManager = this.wifi;
        WifiManager.MulticastLock multicastLockCreateMulticastLock = wifiManager != null ? wifiManager.createMulticastLock("multicastLock") : null;
        this.multicastLock = multicastLockCreateMulticastLock;
        if (multicastLockCreateMulticastLock != null) {
            multicastLockCreateMulticastLock.setReferenceCounted(true);
        }
        WifiManager.MulticastLock multicastLock = this.multicastLock;
        if (multicastLock != null) {
            multicastLock.acquire();
        }
        HandlerThread handlerThread = new HandlerThread("startHandlerThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        handler.post(new Runnable() { // from class: com.signify.hue.dnsservicediscovery.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f32478a.startDiscovery(onServiceResolved, onServiceLost, onDiscoveryFailed);
            }
        });
        this.startHandler = handler;
        this.startHandlerThread = handlerThread;
    }

    public final void stop() {
        Handler handler = this.startHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.startHandler = null;
        HandlerThread handlerThread = this.startHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.startHandlerThread = null;
        WifiManager.MulticastLock multicastLock = this.multicastLock;
        if (multicastLock != null) {
            multicastLock.release();
        }
        this.multicastLock = null;
        if (this.discoveryListeners.isEmpty()) {
            return;
        }
        for (NsdManager.DiscoveryListener discoveryListener : this.discoveryListeners.values()) {
            NsdManager nsdManager = this.nsdManager;
            if (nsdManager != null) {
                nsdManager.stopServiceDiscovery(discoveryListener);
            }
        }
        this.discoveryListeners.clear();
        this.resolveListener = null;
    }
}
