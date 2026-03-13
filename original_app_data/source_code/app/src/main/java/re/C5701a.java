package re;

import gc.C4179C;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C;
import pe.C5464A;
import pe.C5465a;
import pe.E;
import pe.InterfaceC5466b;
import pe.h;
import pe.p;
import pe.r;
import pe.v;

/* JADX INFO: renamed from: re.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5701a implements InterfaceC5466b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f43976d;

    /* JADX INFO: renamed from: re.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class C0589a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43977a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43977a = iArr;
        }
    }

    public C5701a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // pe.InterfaceC5466b
    public C5464A a(E e10, C response) {
        Proxy proxyB;
        r rVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C5465a c5465aA;
        AbstractC4862t.e(response, "response");
        List<h> listF = response.f();
        C5464A c5464aK = response.K();
        v vVarK = c5464aK.k();
        boolean z10 = response.g() == 407;
        if (e10 == null || (proxyB = e10.b()) == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (h hVar : listF) {
            if (Od.C.E("Basic", hVar.d(), true)) {
                if (e10 == null || (c5465aA = e10.a()) == null || (rVarC = c5465aA.c()) == null) {
                    rVarC = this.f43976d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    AbstractC4862t.c(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    AbstractC4862t.b(proxyB);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxyB, vVarK, rVarC), inetSocketAddress.getPort(), vVarK.q(), hVar.c(), hVar.d(), vVarK.s(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = vVarK.h();
                    AbstractC4862t.b(proxyB);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxyB, vVarK, rVarC), vVarK.m(), vVarK.q(), hVar.c(), hVar.d(), vVarK.s(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    AbstractC4862t.d(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    AbstractC4862t.d(password, "getPassword(...)");
                    return c5464aK.j().l(str, p.a(userName, new String(password), hVar.b())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, v vVar, r rVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0589a.f43977a[type.ordinal()]) == 1) {
            return (InetAddress) C4179C.h0(rVar.a(vVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        AbstractC4862t.c(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        AbstractC4862t.d(address, "getAddress(...)");
        return address;
    }

    public C5701a(r defaultDns) {
        AbstractC4862t.e(defaultDns, "defaultDns");
        this.f43976d = defaultDns;
    }

    public /* synthetic */ C5701a(r rVar, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? r.f42858b : rVar);
    }
}
