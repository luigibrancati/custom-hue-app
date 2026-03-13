package androidx.work;

import I3.C0880j;
import O7.e;
import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f24772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WorkerParameters f24773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f24774c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24775d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0320a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.b f24776a;

            public C0320a() {
                this(androidx.work.b.f24769c);
            }

            public androidx.work.b c() {
                return this.f24776a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0320a.class != obj.getClass()) {
                    return false;
                }
                return this.f24776a.equals(((C0320a) obj).f24776a);
            }

            public int hashCode() {
                return (C0320a.class.getName().hashCode() * 31) + this.f24776a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f24776a + '}';
            }

            public C0320a(androidx.work.b bVar) {
                this.f24776a = bVar;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0321c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.b f24777a;

            public C0321c() {
                this(androidx.work.b.f24769c);
            }

            public androidx.work.b c() {
                return this.f24777a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0321c.class != obj.getClass()) {
                    return false;
                }
                return this.f24777a.equals(((C0321c) obj).f24777a);
            }

            public int hashCode() {
                return (C0321c.class.getName().hashCode() * 31) + this.f24777a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f24777a + '}';
            }

            public C0321c(androidx.work.b bVar) {
                this.f24777a = bVar;
            }
        }

        public static a a() {
            return new C0320a();
        }

        public static a b() {
            return new C0321c();
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f24772a = context;
        this.f24773b = workerParameters;
    }

    public Executor A() {
        return this.f24773b.a();
    }

    public final UUID B() {
        return this.f24773b.c();
    }

    public final b C() {
        return this.f24773b.d();
    }

    public final boolean D() {
        return this.f24774c.get() != -256;
    }

    public final boolean E() {
        return this.f24775d;
    }

    public final e G(C0880j c0880j) {
        return this.f24773b.b().a(z(), B(), c0880j);
    }

    public final void H() {
        this.f24775d = true;
    }

    public abstract e I();

    public final void J(int i10) {
        if (this.f24774c.compareAndSet(-256, i10)) {
            F();
        }
    }

    public final Context z() {
        return this.f24772a;
    }

    public void F() {
    }
}
