package ta;

import java.util.concurrent.TimeUnit;
import ka.E;
import ka.G;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class r extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f44877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.k f44878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Eb.k f44879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f44880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Eb.q f44881e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.e {
        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Long l10) {
            return Boolean.valueOf(l10.longValue() == 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Jb.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f44882a;

        public b(w wVar) {
            this.f44882a = wVar;
        }

        @Override // Jb.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Long l10) {
            return !this.f44882a.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Jb.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Eb.k f44883a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Jb.e {
            public a() {
            }

            @Override // Jb.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public G.a apply(Boolean bool) {
                return bool.booleanValue() ? G.a.READY : G.a.LOCATION_SERVICES_NOT_ENABLED;
            }
        }

        public c(Eb.k kVar) {
            this.f44883a = kVar;
        }

        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Eb.k apply(E.b bVar) {
            return bVar != E.b.f39434c ? Eb.k.Y(G.a.BLUETOOTH_NOT_ENABLED) : this.f44883a.Z(new a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Jb.e {
        public d() {
        }

        @Override // Jb.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Eb.k apply(Boolean bool) {
            r rVar = r.this;
            Eb.k kVarT = r.O0(rVar.f44877a, rVar.f44878b, rVar.f44879c).t();
            return bool.booleanValue() ? kVarT.q0(1L) : kVarT;
        }
    }

    public r(F f10, Eb.k kVar, Eb.k kVar2, w wVar, Eb.q qVar) {
        this.f44877a = f10;
        this.f44878b = kVar;
        this.f44879c = kVar2;
        this.f44880d = wVar;
        this.f44881e = qVar;
    }

    public static Eb.k O0(F f10, Eb.k kVar, Eb.k kVar2) {
        return kVar.r0(f10.c() ? E.b.f39434c : E.b.f39435d).y0(new c(kVar2));
    }

    public static Eb.r P0(w wVar, Eb.q qVar) {
        return Eb.k.X(0L, 1L, TimeUnit.SECONDS, qVar).F0(new b(wVar)).l().u(new a());
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        if (this.f44877a.b()) {
            P0(this.f44880d, this.f44881e).r(new d()).f(pVar);
        } else {
            pVar.b(Hb.d.b());
            pVar.a();
        }
    }
}
