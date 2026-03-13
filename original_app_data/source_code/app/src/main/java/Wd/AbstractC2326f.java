package Wd;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: Wd.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2326f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f17922a = Nd.t.O(Nd.q.g(ServiceLoader.load(Rd.J.class, Rd.J.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f17922a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
