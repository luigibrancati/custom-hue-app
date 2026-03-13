package C6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f1161b = Executors.defaultThreadFactory();

    public b(String str) {
        AbstractC6056k.m(str, "Name must not be null");
        this.f1160a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f1161b.newThread(new c(runnable, 0));
        threadNewThread.setName(this.f1160a);
        return threadNewThread;
    }
}
