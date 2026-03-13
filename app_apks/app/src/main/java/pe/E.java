package pe;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5465a f42597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f42598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f42599c;

    public E(C5465a address, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC4862t.e(address, "address");
        AbstractC4862t.e(proxy, "proxy");
        AbstractC4862t.e(socketAddress, "socketAddress");
        this.f42597a = address;
        this.f42598b = proxy;
        this.f42599c = socketAddress;
    }

    public final C5465a a() {
        return this.f42597a;
    }

    public final Proxy b() {
        return this.f42598b;
    }

    public final boolean c() {
        if (this.f42598b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f42597a.k() != null || this.f42597a.f().contains(z.H2_PRIOR_KNOWLEDGE);
    }

    public final InetSocketAddress d() {
        return this.f42599c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return AbstractC4862t.a(e10.f42597a, this.f42597a) && AbstractC4862t.a(e10.f42598b, this.f42598b) && AbstractC4862t.a(e10.f42599c, this.f42599c);
    }

    public int hashCode() {
        return ((((527 + this.f42597a.hashCode()) * 31) + this.f42598b.hashCode()) * 31) + this.f42599c.hashCode();
    }

    public String toString() {
        String strK;
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String strH = this.f42597a.l().h();
        InetAddress address = this.f42599c.getAddress();
        if (address == null || (hostAddress = address.getHostAddress()) == null) {
            strK = null;
        } else {
            AbstractC4862t.b(hostAddress);
            strK = qe.f.k(hostAddress);
        }
        if (Od.F.U(strH, ':', false, 2, null)) {
            sb2.append("[");
            sb2.append(strH);
            sb2.append("]");
        } else {
            sb2.append(strH);
        }
        if (this.f42597a.l().m() != this.f42599c.getPort() || AbstractC4862t.a(strH, strK)) {
            sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(this.f42597a.l().m());
        }
        if (!AbstractC4862t.a(strH, strK)) {
            if (AbstractC4862t.a(this.f42598b, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strK == null) {
                sb2.append("<unresolved>");
            } else if (Od.F.U(strK, ':', false, 2, null)) {
                sb2.append("[");
                sb2.append(strK);
                sb2.append("]");
            } else {
                sb2.append(strK);
            }
            sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(this.f42599c.getPort());
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
