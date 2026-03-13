package ra;

import ua.C6013d;

/* JADX INFO: renamed from: ra.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5684B implements InterfaceC5683A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.F f43841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5690f f43842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f43843c;

    /* JADX INFO: renamed from: ra.B$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Eb.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Eb.o f43844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Eb.o f43845b;

        public a(Eb.o oVar, Eb.o oVar2) {
            this.f43844a = oVar;
            this.f43845b = oVar2;
        }

        @Override // Eb.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Eb.k a(Eb.k kVar) {
            return kVar.j(this.f43844a).j(this.f43845b);
        }
    }

    public C5684B(ta.F f10, C5690f c5690f, x xVar) {
        this.f43841a = f10;
        this.f43842b = c5690f;
        this.f43843c = xVar;
    }

    @Override // ra.InterfaceC5683A
    public z a(ua.g gVar, C6013d... c6013dArr) {
        return new z(new qa.q(this.f43841a, this.f43842b, new C5689e(c6013dArr)), new a(this.f43843c.b(gVar.g()), this.f43843c.a(gVar.b())));
    }
}
