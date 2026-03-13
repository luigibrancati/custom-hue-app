package Te;

import java.net.URL;
import java.net.URLClassLoader;
import javax.annotation.processing.Processor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Processor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ClassLoader f16428b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Processor f16429a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends URLClassLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClassLoader f16430a;

        public a(URL[] urlArr, ClassLoader classLoader) {
            super(urlArr, classLoader);
            this.f16430a = classLoader;
        }

        @Override // java.lang.ClassLoader
        public Class loadClass(String str, boolean z10) {
            Class<?> clsFindClass;
            synchronized (getClassLoadingLock(str)) {
                try {
                    if (str.startsWith("org.eclipse.")) {
                        clsFindClass = this.f16430a.loadClass(str);
                    } else {
                        Class<?> clsFindLoadedClass = findLoadedClass(str);
                        if (clsFindLoadedClass == null) {
                            try {
                                clsFindClass = findClass(str);
                            } catch (ClassNotFoundException unused) {
                                return super.loadClass(str, z10);
                            }
                        } else {
                            clsFindClass = clsFindLoadedClass;
                        }
                    }
                    if (z10) {
                        resolveClass(clsFindClass);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return clsFindClass;
        }
    }

    public b() {
        this.f16429a = c() ? a() : b();
    }

    public static Processor a() {
        try {
            if (f16428b == null) {
                Te.a aVar = new Te.a();
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                Class[] clsArrA = aVar.a();
                int length = clsArrA.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Class cls = clsArrA[i10];
                    if (cls.getClassLoader() != null && cls.getClassLoader().getClass().getName().startsWith("org.eclipse.")) {
                        contextClassLoader = cls.getClassLoader();
                        break;
                    }
                    i10++;
                }
                f16428b = new a(((URLClassLoader) b.class.getClassLoader()).getURLs(), contextClassLoader);
            }
            return (Processor) f16428b.loadClass("org.immutables.value.internal.$processor$.$Processor").newInstance();
        } catch (Error | RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    public static Processor b() {
        return new Ye.a();
    }

    public static boolean c() {
        if (System.getProperty("osgi.arch") != null) {
            for (Class cls : new Te.a().a()) {
                if (cls.getClassLoader() != null && cls.getClassLoader().getClass().getName().startsWith("org.eclipse.")) {
                    return true;
                }
            }
        }
        return false;
    }
}
