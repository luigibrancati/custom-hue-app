package com.signify.hue.dnsservicediscovery;

import fc.AbstractC4040w;
import gc.Q;
import io.sentry.protocol.Request;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/signify/hue/dnsservicediscovery/ServiceInfo;", "", "name", "", "ipAddress", "port", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getIpAddress", "getPort", "toMap", "", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "dns_service_discovery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServiceInfo {
    private final String ipAddress;
    private final String name;
    private final String port;

    public ServiceInfo(String name, String ipAddress, String port) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(ipAddress, "ipAddress");
        AbstractC4862t.e(port, "port");
        this.name = name;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public static /* synthetic */ ServiceInfo copy$default(ServiceInfo serviceInfo, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = serviceInfo.name;
        }
        if ((i10 & 2) != 0) {
            str2 = serviceInfo.ipAddress;
        }
        if ((i10 & 4) != 0) {
            str3 = serviceInfo.port;
        }
        return serviceInfo.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    public final ServiceInfo copy(String name, String ipAddress, String port) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(ipAddress, "ipAddress");
        AbstractC4862t.e(port, "port");
        return new ServiceInfo(name, ipAddress, port);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceInfo)) {
            return false;
        }
        ServiceInfo serviceInfo = (ServiceInfo) other;
        return AbstractC4862t.a(this.name, serviceInfo.name) && AbstractC4862t.a(this.ipAddress, serviceInfo.ipAddress) && AbstractC4862t.a(this.port, serviceInfo.port);
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPort() {
        return this.port;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.ipAddress.hashCode()) * 31) + this.port.hashCode();
    }

    public final Map<String, String> toMap() {
        return Q.l(AbstractC4040w.a("name", this.name), AbstractC4040w.a("ipAddress", this.ipAddress), AbstractC4040w.a("port", this.port));
    }

    public String toString() {
        return "ServiceInfo(name=" + this.name + ", ipAddress=" + this.ipAddress + ", port=" + this.port + ')';
    }
}
