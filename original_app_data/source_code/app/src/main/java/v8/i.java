package v8;

import Od.F;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import v8.i;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45899e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f45900f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f45901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f45902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f45903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f45904d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: v8.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class C0626a extends AbstractC4860q implements InterfaceC6082a {
            public C0626a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).p());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class b extends AbstractC4860q implements InterfaceC6082a {
            public b(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).q());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class c extends AbstractC4860q implements InterfaceC6082a {
            public c(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).r());
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final String h() {
            return "Must be called on a background thread, was called on " + i.f45899e.o() + '.';
        }

        public static final String j() {
            return "Must be called on a blocking thread, was called on " + i.f45899e.o() + '.';
        }

        public static final String l() {
            return "Must not be called on a main thread, was called on " + i.f45899e.o() + '.';
        }

        public final void g() {
            m(new C0626a(this), new InterfaceC6082a() { // from class: v8.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return i.a.h();
                }
            });
        }

        public final void i() {
            m(new b(this), new InterfaceC6082a() { // from class: v8.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return i.a.j();
                }
            });
        }

        public final void k() {
            m(new c(this), new InterfaceC6082a() { // from class: v8.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return i.a.l();
                }
            });
        }

        public final void m(InterfaceC6082a interfaceC6082a, InterfaceC6082a interfaceC6082a2) {
            if (((Boolean) interfaceC6082a.invoke()).booleanValue()) {
                return;
            }
            r8.g.f().b((String) interfaceC6082a2.invoke());
            n();
        }

        public final boolean n() {
            return i.f45900f;
        }

        public final String o() {
            return Thread.currentThread().getName();
        }

        public final boolean p() {
            String strO = o();
            AbstractC4862t.d(strO, "<get-threadName>(...)");
            return F.V(strO, "Firebase Background Thread #", false, 2, null);
        }

        public final boolean q() {
            String strO = o();
            AbstractC4862t.d(strO, "<get-threadName>(...)");
            return F.V(strO, "Firebase Blocking Thread #", false, 2, null);
        }

        public final boolean r() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void s(boolean z10) {
            i.f45900f = z10;
        }

        public a() {
        }
    }

    public i(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        AbstractC4862t.e(backgroundExecutorService, "backgroundExecutorService");
        AbstractC4862t.e(blockingExecutorService, "blockingExecutorService");
        this.f45901a = new e(backgroundExecutorService);
        this.f45902b = new e(backgroundExecutorService);
        this.f45903c = new e(backgroundExecutorService);
        this.f45904d = new e(blockingExecutorService);
    }

    public static final void c() {
        f45899e.g();
    }

    public static final void d() {
        f45899e.i();
    }

    public static final void e() {
        f45899e.k();
    }

    public static final void f(boolean z10) {
        f45899e.s(z10);
    }
}
