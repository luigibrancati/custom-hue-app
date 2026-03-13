package Vb;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17438c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public i(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f17436a + '-' + incrementAndGet();
        Thread aVar = this.f17438c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f17437b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f17436a + "]";
    }

    public i(String str, int i10) {
        this(str, i10, false);
    }

    public i(String str, int i10, boolean z10) {
        this.f17436a = str;
        this.f17437b = i10;
        this.f17438c = z10;
    }
}
