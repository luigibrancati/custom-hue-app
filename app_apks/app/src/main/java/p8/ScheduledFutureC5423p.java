package p8;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: p8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ScheduledFutureC5423p extends B0.a implements ScheduledFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f42291h;

    /* JADX INFO: renamed from: p8.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements b {
        public a() {
        }

        @Override // p8.ScheduledFutureC5423p.b
        public void a(Throwable th) {
            ScheduledFutureC5423p.this.F(th);
        }

        @Override // p8.ScheduledFutureC5423p.b
        public void set(Object obj) {
            ScheduledFutureC5423p.this.E(obj);
        }
    }

    /* JADX INFO: renamed from: p8.p$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    /* JADX INFO: renamed from: p8.p$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        ScheduledFuture a(b bVar);
    }

    public ScheduledFutureC5423p(c cVar) {
        this.f42291h = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f42291h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f42291h.getDelay(timeUnit);
    }

    @Override // B0.a
    public void q() {
        this.f42291h.cancel(H());
    }
}
