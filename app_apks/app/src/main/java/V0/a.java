package V0;

import V0.f;
import V0.g;
import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.c f17189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f17190b;

    /* JADX INFO: renamed from: V0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class RunnableC0218a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f17191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f17192b;

        public RunnableC0218a(g.c cVar, Typeface typeface) {
            this.f17191a = cVar;
            this.f17192b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17191a.b(this.f17192b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.c f17194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17195b;

        public b(g.c cVar, int i10) {
            this.f17194a = cVar;
            this.f17195b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17194a.a(this.f17195b);
        }
    }

    public a(g.c cVar, Executor executor) {
        this.f17189a = cVar;
        this.f17190b = executor;
    }

    public final void a(int i10) {
        this.f17190b.execute(new b(this.f17189a, i10));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f17225a);
        } else {
            a(eVar.f17226b);
        }
    }

    public final void c(Typeface typeface) {
        this.f17190b.execute(new RunnableC0218a(this.f17189a, typeface));
    }
}
