package Be;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f863j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f865i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ j b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final j a(String packageName) {
            AbstractC4862t.e(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                AbstractC4862t.c(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                AbstractC4862t.c(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                AbstractC4862t.b(cls3);
                return new k(cls, cls2, cls3);
            } catch (Exception e10) {
                c cVar = c.f845a;
                String name = y.class.getName();
                AbstractC4862t.d(name, "getName(...)");
                cVar.a(name, 5, "unable to load android socket classes", e10);
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        AbstractC4862t.e(sslSocketClass, "sslSocketClass");
        AbstractC4862t.e(sslSocketFactoryClass, "sslSocketFactoryClass");
        AbstractC4862t.e(paramClass, "paramClass");
        this.f864h = sslSocketFactoryClass;
        this.f865i = paramClass;
    }
}
