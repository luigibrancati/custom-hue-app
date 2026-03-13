package pe;

import gc.C4206t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import qe.AbstractC5518a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f42816e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f42817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f42818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f42819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f42820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m f42821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f42822k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f42825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f42826d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    static {
        i iVar = i.f42776o1;
        i iVar2 = i.f42779p1;
        i iVar3 = i.f42782q1;
        i iVar4 = i.f42734a1;
        i iVar5 = i.f42746e1;
        i iVar6 = i.f42737b1;
        i iVar7 = i.f42749f1;
        i iVar8 = i.f42767l1;
        i iVar9 = i.f42764k1;
        List listN = C4206t.n(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
        f42817f = listN;
        List listN2 = C4206t.n(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.f42704L0, i.f42706M0, i.f42760j0, i.f42763k0, i.f42695H, i.f42703L, i.f42765l);
        f42818g = listN2;
        a aVar = new a(true);
        i[] iVarArr = (i[]) listN.toArray(new i[0]);
        a aVarC = aVar.c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        F f10 = F.TLS_1_3;
        F f11 = F.TLS_1_2;
        f42819h = aVarC.f(f10, f11).d(true).a();
        a aVar2 = new a(true);
        i[] iVarArr2 = (i[]) listN2.toArray(new i[0]);
        f42820i = aVar2.c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(f10, f11).d(true).a();
        a aVar3 = new a(true);
        i[] iVarArr3 = (i[]) listN2.toArray(new i[0]);
        f42821j = aVar3.c((i[]) Arrays.copyOf(iVarArr3, iVarArr3.length)).f(f10, f11, F.TLS_1_1, F.TLS_1_0).d(true).a();
        f42822k = new a(false).a();
    }

    public m(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f42823a = z10;
        this.f42824b = z11;
        this.f42825c = strArr;
        this.f42826d = strArr2;
    }

    public final void b(SSLSocket sslSocket, boolean z10) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        m mVarG = g(sslSocket, z10);
        if (mVarG.i() != null) {
            sslSocket.setEnabledProtocols(mVarG.f42826d);
        }
        if (mVarG.c() != null) {
            sslSocket.setEnabledCipherSuites(mVarG.f42825c);
        }
    }

    public final List c() {
        String[] strArr = this.f42825c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f42735b.b(str));
        }
        return arrayList;
    }

    public final String[] d() {
        return this.f42825c;
    }

    public final boolean e(SSLSocket socket) {
        AbstractC4862t.e(socket, "socket");
        if (!this.f42823a) {
            return false;
        }
        String[] strArr = this.f42826d;
        if (strArr != null && !qe.m.p(strArr, socket.getEnabledProtocols(), C4757a.d())) {
            return false;
        }
        String[] strArr2 = this.f42825c;
        return strArr2 == null || qe.m.p(strArr2, socket.getEnabledCipherSuites(), i.f42735b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f42823a;
        m mVar = (m) obj;
        if (z10 != mVar.f42823a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f42825c, mVar.f42825c) && Arrays.equals(this.f42826d, mVar.f42826d) && this.f42824b == mVar.f42824b);
    }

    public final boolean f() {
        return this.f42823a;
    }

    public final m g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        AbstractC4862t.b(enabledCipherSuites);
        String[] strArrA = AbstractC5518a.a(this, enabledCipherSuites);
        if (this.f42826d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC4862t.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = qe.m.y(enabledProtocols2, this.f42826d, C4757a.d());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC4862t.b(supportedCipherSuites);
        int iQ = qe.m.q(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f42735b.c());
        if (z10 && iQ != -1) {
            String str = supportedCipherSuites[iQ];
            AbstractC4862t.d(str, "get(...)");
            strArrA = qe.m.g(strArrA, str);
        }
        a aVarB = new a(this).b((String[]) Arrays.copyOf(strArrA, strArrA.length));
        AbstractC4862t.b(enabledProtocols);
        return aVarB.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final boolean h() {
        return this.f42824b;
    }

    public int hashCode() {
        if (!this.f42823a) {
            return 17;
        }
        String[] strArr = this.f42825c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f42826d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f42824b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f42826d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(F.Companion.a(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.f42823a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f42824b + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f42827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f42828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f42829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f42830d;

        public a(boolean z10) {
            this.f42827a = z10;
        }

        public final m a() {
            return new m(this.f42827a, this.f42830d, this.f42828b, this.f42829c);
        }

        public final a b(String... cipherSuites) {
            AbstractC4862t.e(cipherSuites, "cipherSuites");
            if (!this.f42827a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
            this.f42828b = (String[]) objArrCopyOf;
            return this;
        }

        public final a c(i... cipherSuites) {
            AbstractC4862t.e(cipherSuites, "cipherSuites");
            if (!this.f42827a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a d(boolean z10) {
            if (!this.f42827a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f42830d = z10;
            return this;
        }

        public final a e(String... tlsVersions) {
            AbstractC4862t.e(tlsVersions, "tlsVersions");
            if (!this.f42827a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
            this.f42829c = (String[]) objArrCopyOf;
            return this;
        }

        public final a f(F... tlsVersions) {
            AbstractC4862t.e(tlsVersions, "tlsVersions");
            if (!this.f42827a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (F f10 : tlsVersions) {
                arrayList.add(f10.b());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(m connectionSpec) {
            AbstractC4862t.e(connectionSpec, "connectionSpec");
            this.f42827a = connectionSpec.f();
            this.f42828b = connectionSpec.d();
            this.f42829c = connectionSpec.f42826d;
            this.f42830d = connectionSpec.h();
        }
    }
}
