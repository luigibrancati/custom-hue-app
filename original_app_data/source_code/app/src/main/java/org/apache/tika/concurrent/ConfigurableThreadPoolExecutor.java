package org.apache.tika.concurrent;

import d.AbstractC3783B;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ConfigurableThreadPoolExecutor extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        AbstractC3783B.a(this);
    }

    void setCorePoolSize(int i10);

    void setMaximumPoolSize(int i10);
}
