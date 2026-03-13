package Ae;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f478i = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f483h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f486c;

        public a(List protocols) {
            AbstractC4862t.e(protocols, "protocols");
            this.f484a = protocols;
        }

        public final String a() {
            return this.f486c;
        }

        public final boolean b() {
            return this.f485b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            AbstractC4862t.e(proxy, "proxy");
            AbstractC4862t.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (AbstractC4862t.a(name, "supports") && AbstractC4862t.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (AbstractC4862t.a(name, "unsupported") && AbstractC4862t.a(Void.TYPE, returnType)) {
                this.f485b = true;
                return null;
            }
            if (AbstractC4862t.a(name, "protocols") && objArr.length == 0) {
                return this.f484a;
            }
            if ((AbstractC4862t.a(name, "selectProtocol") || AbstractC4862t.a(name, "select")) && AbstractC4862t.a(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f484a.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f486c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f484a.get(0);
                    this.f486c = str2;
                    return str2;
                }
            }
            if ((!AbstractC4862t.a(name, "protocolSelected") && !AbstractC4862t.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f486c = (String) obj3;
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final h a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                AbstractC4862t.b(property);
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                AbstractC4862t.b(method);
                AbstractC4862t.b(method2);
                AbstractC4862t.b(method3);
                AbstractC4862t.b(cls3);
                AbstractC4862t.b(cls4);
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public b() {
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        AbstractC4862t.e(putMethod, "putMethod");
        AbstractC4862t.e(getMethod, "getMethod");
        AbstractC4862t.e(removeMethod, "removeMethod");
        AbstractC4862t.e(clientProviderClass, "clientProviderClass");
        AbstractC4862t.e(serverProviderClass, "serverProviderClass");
        this.f479d = putMethod;
        this.f480e = getMethod;
        this.f481f = removeMethod;
        this.f482g = clientProviderClass;
        this.f483h = serverProviderClass;
    }

    @Override // Ae.h
    public void b(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        try {
            this.f481f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // Ae.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        AbstractC4862t.e(protocols, "protocols");
        try {
            this.f479d.invoke(null, sslSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f482g, this.f483h}, new a(h.f493a.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // Ae.h
    public String h(SSLSocket sslSocket) {
        AbstractC4862t.e(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f480e.invoke(null, sslSocket));
            AbstractC4862t.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                h.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
