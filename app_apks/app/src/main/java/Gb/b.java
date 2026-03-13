package Gb;

import Eb.q;
import Hb.c;
import Hb.d;
import android.os.Handler;
import android.os.Message;
import bc.AbstractC2904a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f4680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4681c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f4682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f4684c;

        public a(Handler handler, boolean z10) {
            this.f4682a = handler;
            this.f4683b = z10;
        }

        @Override // Eb.q.c
        public c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f4684c) {
                return d.a();
            }
            RunnableC0076b runnableC0076b = new RunnableC0076b(this.f4682a, AbstractC2904a.r(runnable));
            Message messageObtain = Message.obtain(this.f4682a, runnableC0076b);
            messageObtain.obj = this;
            if (this.f4683b) {
                messageObtain.setAsynchronous(true);
            }
            this.f4682a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f4684c) {
                return runnableC0076b;
            }
            this.f4682a.removeCallbacks(runnableC0076b);
            return d.a();
        }

        @Override // Hb.c
        public void dispose() {
            this.f4684c = true;
            this.f4682a.removeCallbacksAndMessages(this);
        }

        @Override // Hb.c
        public boolean j() {
            return this.f4684c;
        }
    }

    /* JADX INFO: renamed from: Gb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class RunnableC0076b implements Runnable, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f4685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f4686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f4687c;

        public RunnableC0076b(Handler handler, Runnable runnable) {
            this.f4685a = handler;
            this.f4686b = runnable;
        }

        @Override // Hb.c
        public void dispose() {
            this.f4685a.removeCallbacks(this);
            this.f4687c = true;
        }

        @Override // Hb.c
        public boolean j() {
            return this.f4687c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4686b.run();
            } catch (Throwable th) {
                AbstractC2904a.q(th);
            }
        }
    }

    public b(Handler handler, boolean z10) {
        this.f4680b = handler;
        this.f4681c = z10;
    }

    @Override // Eb.q
    public q.c a() {
        return new a(this.f4680b, this.f4681c);
    }

    @Override // Eb.q
    public c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0076b runnableC0076b = new RunnableC0076b(this.f4680b, AbstractC2904a.r(runnable));
        Message messageObtain = Message.obtain(this.f4680b, runnableC0076b);
        if (this.f4681c) {
            messageObtain.setAsynchronous(true);
        }
        this.f4680b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return runnableC0076b;
    }
}
