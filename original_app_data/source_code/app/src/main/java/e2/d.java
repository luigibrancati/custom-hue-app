package e2;

import G1.AbstractC0853a;
import I1.x;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {

        /* JADX INFO: renamed from: e2.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0419a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList f33579a = new CopyOnWriteArrayList();

            /* JADX INFO: renamed from: e2.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0420a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Handler f33580a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f33581b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f33582c;

                public C0420a(Handler handler, a aVar) {
                    this.f33580a = handler;
                    this.f33581b = aVar;
                }

                public void d() {
                    this.f33582c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                AbstractC0853a.e(handler);
                AbstractC0853a.e(aVar);
                d(aVar);
                this.f33579a.add(new C0420a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final C0420a c0420a : this.f33579a) {
                    if (c0420a.f33582c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c0420a.f33580a.post(new Runnable() { // from class: e2.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0420a.f33581b.x(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C0420a c0420a : this.f33579a) {
                    if (c0420a.f33581b == aVar) {
                        c0420a.d();
                        this.f33579a.remove(c0420a);
                    }
                }
            }
        }

        void x(int i10, long j10, long j11);
    }

    default long a() {
        return -9223372036854775807L;
    }

    void c(a aVar);

    x e();

    long f();

    void h(Handler handler, a aVar);
}
