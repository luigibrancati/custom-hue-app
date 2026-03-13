package org.apache.tika.concurrent;

import d.AbstractC3783B;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SimpleThreadPoolExecutor extends ThreadPoolExecutor implements ConfigurableThreadPoolExecutor, AutoCloseable {
    public SimpleThreadPoolExecutor() {
        super(1, 2, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: Pe.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return SimpleThreadPoolExecutor.a(runnable);
            }
        });
    }

    public static /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "Tika Executor Thread");
    }

    @Override // org.apache.tika.concurrent.ConfigurableThreadPoolExecutor, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC3783B.a(this);
    }
}
