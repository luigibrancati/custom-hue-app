package X6;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import s6.C5783b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5783b f18448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O5 f18449b;

    public N5(O5 o52, C5783b c5783b) {
        this.f18448a = c5783b;
        Objects.requireNonNull(o52);
        this.f18449b = o52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f18449b.f18465c;
        u52.O(null);
        if (this.f18448a.e() != 7777) {
            u52.L();
            return;
        }
        if (u52.P() == null) {
            u52.Q(Executors.newScheduledThreadPool(1));
        }
        u52.P().schedule(new Runnable() { // from class: X6.L5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final U5 u53 = this.f18402a.f18449b.f18465c;
                u53.f18400a.b().t(new Runnable() { // from class: X6.M5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        u53.w();
                    }
                });
            }
        }, ((Long) AbstractC2383f2.f18870a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
