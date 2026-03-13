package Vb;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Future {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hb.c f17386a;

    public c(Hb.c cVar) {
        this.f17386a = cVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        this.f17386a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return null;
    }
}
