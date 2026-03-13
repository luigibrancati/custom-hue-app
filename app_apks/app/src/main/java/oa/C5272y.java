package oa;

import ea.C3974b;
import ka.E;
import la.C4973e;
import la.C4974f;
import la.C4979k;

/* JADX INFO: renamed from: oa.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5272y implements InterfaceC5273z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3974b f41496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.k f41497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Eb.k f41498c;

    /* JADX INFO: renamed from: oa.y$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.d {
        public a() {
        }

        @Override // Jb.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            ma.q.e(th, "Failed to monitor adapter state.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: oa.y$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Jb.d {
        public b() {
        }

        @Override // Jb.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C4974f c4974f) {
            ma.q.p("An exception received, indicating that the adapter has became unusable.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: oa.y$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Jb.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41501a;

        public c(String str) {
            this.f41501a = str;
        }

        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4974f apply(Boolean bool) {
            return C4973e.a(this.f41501a);
        }
    }

    /* JADX INFO: renamed from: oa.y$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Jb.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Hb.c f41503a;

        public d(Hb.c cVar) {
            this.f41503a = cVar;
        }

        @Override // Jb.a
        public void run() {
            this.f41503a.dispose();
        }
    }

    /* JADX INFO: renamed from: oa.y$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Jb.e {
        public e() {
        }

        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Eb.n apply(C4974f c4974f) {
            return Eb.k.G(c4974f);
        }
    }

    /* JADX INFO: renamed from: oa.y$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements Jb.g {
        @Override // Jb.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: oa.y$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g implements Jb.e {
        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(E.b bVar) {
            return Boolean.valueOf(bVar.a());
        }
    }

    public C5272y(String str, ta.F f10, Eb.k kVar) {
        C3974b c3974bR0 = C3974b.R0();
        this.f41496a = c3974bR0;
        Eb.k kVarO0 = c3974bR0.K().h().B(new d(c(f10, kVar).Z(new c(str)).z(new b()).t0(c3974bR0, new a()))).l0().O0(0);
        this.f41497b = kVarO0;
        this.f41498c = kVarO0.M(new e());
    }

    public static Eb.k c(ta.F f10, Eb.k kVar) {
        return kVar.Z(new g()).r0(Boolean.valueOf(f10.c())).I(new f());
    }

    @Override // oa.InterfaceC5273z
    public Eb.k a() {
        return this.f41497b;
    }

    public Eb.k b() {
        return this.f41498c;
    }

    public void d(C4973e c4973e) {
        this.f41496a.accept(c4973e);
    }

    public void e(C4979k c4979k) {
        this.f41496a.accept(c4979k);
    }
}
