package Be;

import Be.i;
import Od.C;
import Od.C1823c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.a f850g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f855e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: Be.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0025a implements i.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f856a;

            public C0025a(String str) {
                this.f856a = str;
            }

            @Override // Be.i.a
            public boolean a(SSLSocket sslSocket) {
                AbstractC4862t.e(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                AbstractC4862t.d(name, "getName(...)");
                return C.P(name, this.f856a + '.', false, 2, null);
            }

            @Override // Be.i.a
            public j b(SSLSocket sslSocket) {
                AbstractC4862t.e(sslSocket, "sslSocket");
                return f.f849f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final f b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !AbstractC4862t.a(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            AbstractC4862t.b(superclass);
            return new f(superclass);
        }

        public final i.a c(String packageName) {
            AbstractC4862t.e(packageName, "packageName");
            return new C0025a(packageName);
        }

        public final i.a d() {
            return f.f850g;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f849f = aVar;
        f850g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class sslSocketClass) throws NoSuchMethodException {
        AbstractC4862t.e(sslSocketClass, "sslSocketClass");
        this.f851a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC4862t.d(declaredMethod, "getDeclaredMethod(...)");
        this.f852b = declaredMethod;
        this.f853c = sslSocketClass.getMethod("setHostname", String.class);
        this.f854d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f855e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // Be.j
    public boolean a(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        return this.f851a.isInstance(sslSocket);
    }

    @Override // Be.j
    public String b(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f854d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, C1823c.f12394b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && AbstractC4862t.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // Be.j
    public void c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f852b.invoke(sslSocket, Boolean.TRUE);
                this.f855e.invoke(sslSocket, Ae.h.f493a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // Be.j
    public boolean isSupported() {
        return Ae.b.f466e.b();
    }
}
