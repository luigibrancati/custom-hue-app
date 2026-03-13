package L4;

import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8566d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayBlockingQueue f8569c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public c(f channel) {
        AbstractC4862t.e(channel, "channel");
        this.f8567a = channel;
        this.f8568b = new Object();
        this.f8569c = new ArrayBlockingQueue(512);
    }

    public final void a(L4.a event) {
        AbstractC4862t.e(event, "event");
        synchronized (this.f8568b) {
            this.f8569c.offer(event);
        }
    }
}
