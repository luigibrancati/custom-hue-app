package Vb;

import Eb.q;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f17432c = new i("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f17433b;

    public g() {
        this(f17432c);
    }

    @Override // Eb.q
    public q.c a() {
        return new h(this.f17433b);
    }

    public g(ThreadFactory threadFactory) {
        this.f17433b = threadFactory;
    }
}
