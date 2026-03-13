package ra;

import java.util.concurrent.TimeUnit;
import ua.EnumC6012c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.q f43912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.o f43913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Eb.o f43914c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Eb.o f43915d = new g();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Eb.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Eb.k f43917b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Eb.q f43920e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Jb.e f43916a = x.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Jb.e f43918c = new C0587a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Jb.e f43919d = new b();

        /* JADX INFO: renamed from: ra.x$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0587a implements Jb.e {
            public C0587a() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Eb.k apply(o oVar) {
                return a.this.f43917b;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Jb.e {
            public b() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Eb.k apply(Eb.k kVar) {
                return kVar.B0(1L);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class c implements Jb.e {
            public c() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Eb.n apply(Eb.k kVar) {
                return kVar.L0(kVar.y0(a.this.f43918c)).M(a.this.f43919d).Z(a.this.f43916a);
            }
        }

        public a(Eb.q qVar) {
            this.f43920e = qVar;
            this.f43917b = Eb.k.J0(10L, TimeUnit.SECONDS, qVar);
        }

        @Override // Eb.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Eb.k a(Eb.k kVar) {
            return kVar.i0(new c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Eb.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f43925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f43926b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Jb.e {
            public a() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Eb.n apply(Eb.k kVar) {
                b bVar = b.this;
                return kVar.q(bVar.f43926b, TimeUnit.MILLISECONDS, x.this.f43912a);
            }
        }

        public b(int i10, long j10) {
            this.f43925a = i10;
            this.f43926b = j10;
        }

        @Override // Eb.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Eb.k a(Eb.k kVar) {
            return kVar.C0(this.f43925a, TimeUnit.MILLISECONDS, x.this.f43912a).k0(new a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Eb.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Eb.o f43929a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Jb.e {
            public a() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Eb.k apply(Zb.b bVar) {
                return bVar.j(c.this.f43929a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Jb.e {
            public b() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String apply(o oVar) {
                return oVar.c().getAddress();
            }
        }

        public c(Eb.o oVar) {
            this.f43929a = oVar;
        }

        @Override // Eb.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Eb.k a(Eb.k kVar) {
            return kVar.U(new b()).M(new a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Jb.e {
        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o apply(o oVar) {
            return new o(oVar.c(), oVar.d(), oVar.f(), oVar.b(), EnumC6012c.CALLBACK_TYPE_FIRST_MATCH, oVar.g());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Eb.o {
        public e() {
        }

        @Override // Eb.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Eb.k a(Eb.k kVar) {
            return kVar.n(10L, TimeUnit.SECONDS, x.this.f43912a).Z(x.h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements Jb.e {
        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o apply(o oVar) {
            return new o(oVar.c(), oVar.d(), oVar.f(), oVar.b(), EnumC6012c.CALLBACK_TYPE_MATCH_LOST, oVar.g());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g implements Eb.o {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Jb.e {
            public a() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Eb.k apply(Eb.k kVar) {
                return Eb.k.a0(kVar.j(x.this.f43913b), kVar.j(x.this.f43914c));
            }
        }

        public g() {
        }

        @Override // Eb.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Eb.k a(Eb.k kVar) {
            return kVar.i0(new a());
        }
    }

    public x(Eb.q qVar) {
        this.f43912a = qVar;
        this.f43913b = new a(qVar);
    }

    public static Eb.o f(Eb.o oVar) {
        return new c(oVar);
    }

    public static Jb.e g() {
        return new d();
    }

    public static Jb.e h() {
        return new f();
    }

    public Eb.o a(int i10) {
        return i10 != 2 ? i10 != 4 ? i10 != 6 ? ta.D.a() : f(this.f43915d) : f(this.f43914c) : f(this.f43913b);
    }

    public Eb.o b(int i10) {
        if (i10 == -1) {
            ma.q.q("Cannot emulate opportunistic scan mode since it is OS dependent - fallthrough to low power", new Object[0]);
        } else if (i10 != 0) {
            return i10 != 1 ? ta.D.a() : d();
        }
        return e();
    }

    public final Eb.o c(int i10) {
        return new b(i10, Math.max(TimeUnit.SECONDS.toMillis(5L) - ((long) i10), 0L));
    }

    public final Eb.o d() {
        return c(2500);
    }

    public final Eb.o e() {
        return c(500);
    }
}
