package com.signify.hue.dnsservicediscovery;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"com/signify/hue/dnsservicediscovery/NetworkServiceDiscovery$startDiscovery$discoveryListener$1", "Landroid/net/nsd/NsdManager$DiscoveryListener;", "", "regType", "Lfc/H;", "onDiscoveryStarted", "(Ljava/lang/String;)V", "Landroid/net/nsd/NsdServiceInfo;", "service", "onServiceFound", "(Landroid/net/nsd/NsdServiceInfo;)V", "onServiceLost", "serviceType", "onDiscoveryStopped", "", "errorCode", "onStartDiscoveryFailed", "(Ljava/lang/String;I)V", "onStopDiscoveryFailed", "dns_service_discovery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkServiceDiscovery$startDiscovery$discoveryListener$1 implements NsdManager.DiscoveryListener {
    final /* synthetic */ l $onDiscoveryFailed;
    final /* synthetic */ l $onNsdServiceLost;
    final /* synthetic */ NetworkServiceDiscovery this$0;

    public NetworkServiceDiscovery$startDiscovery$discoveryListener$1(NetworkServiceDiscovery networkServiceDiscovery, l lVar, l lVar2) {
        this.this$0 = networkServiceDiscovery;
        this.$onNsdServiceLost = lVar;
        this.$onDiscoveryFailed = lVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onServiceLost$lambda$0(l lVar, NsdServiceInfo nsdServiceInfo) {
        String serviceName = nsdServiceInfo.getServiceName();
        AbstractC4862t.d(serviceName, "getServiceName(...)");
        lVar.invoke(serviceName);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStarted(String regType) {
        AbstractC4862t.e(regType, "regType");
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStopped(String serviceType) {
        AbstractC4862t.e(serviceType, "serviceType");
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceFound(NsdServiceInfo service) {
        AbstractC4862t.e(service, "service");
        if (this.this$0.resolveListener != null) {
            if (!this.this$0.resolveListenerIsBusy.compareAndSet(false, true)) {
                this.this$0.pendingNsdServices.add(service);
                return;
            }
            NsdManager nsdManager = this.this$0.nsdManager;
            if (nsdManager != null) {
                nsdManager.resolveService(service, this.this$0.resolveListener);
            }
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceLost(final NsdServiceInfo service) {
        AbstractC4862t.e(service, "service");
        Iterator it = this.this$0.pendingNsdServices.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            if (AbstractC4862t.a(((NsdServiceInfo) it.next()).getServiceName(), service.getServiceName())) {
                it.remove();
            }
        }
        Handler handler = new Handler(Looper.getMainLooper());
        final l lVar = this.$onNsdServiceLost;
        handler.post(new Runnable() { // from class: com.signify.hue.dnsservicediscovery.g
            @Override // java.lang.Runnable
            public final void run() {
                NetworkServiceDiscovery$startDiscovery$discoveryListener$1.onServiceLost$lambda$0(lVar, service);
            }
        });
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStartDiscoveryFailed(final String serviceType, int errorCode) {
        AbstractC4862t.e(serviceType, "serviceType");
        this.this$0.discoveryListeners.remove(serviceType);
        Handler handler = new Handler(Looper.getMainLooper());
        final l lVar = this.$onDiscoveryFailed;
        handler.post(new Runnable() { // from class: com.signify.hue.dnsservicediscovery.f
            @Override // java.lang.Runnable
            public final void run() {
                lVar.invoke(serviceType);
            }
        });
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStopDiscoveryFailed(String serviceType, int errorCode) {
        AbstractC4862t.e(serviceType, "serviceType");
        this.this$0.stop();
    }
}
