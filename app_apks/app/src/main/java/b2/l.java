package b2;

import I1.w;
import b2.InterfaceC2796f;
import i2.C4327g;
import i2.C4330j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC2795e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2796f f25043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC2796f.b f25044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C4327g f25045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f25046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f25047n;

    public l(I1.f fVar, I1.j jVar, D1.o oVar, int i10, Object obj, InterfaceC2796f interfaceC2796f) {
        super(fVar, jVar, 2, oVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f25043j = interfaceC2796f;
    }

    @Override // e2.m.e
    public void b() {
        this.f25047n = true;
    }

    public void f(InterfaceC2796f.b bVar) {
        this.f25044k = bVar;
    }

    @Override // e2.m.e
    public void load() {
        if (this.f25046m == 0) {
            this.f25043j.b(this.f25044k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            I1.j jVarE = this.f24995b.e(this.f25046m);
            w wVar = this.f25002i;
            C4330j c4330j = new C4330j(wVar, jVarE.f5443g, wVar.f(jVarE));
            while (!this.f25047n && this.f25043j.a(c4330j)) {
                try {
                } finally {
                    this.f25046m = c4330j.getPosition() - this.f24995b.f5443g;
                    this.f25045l = this.f25043j.c();
                }
            }
        } finally {
            I1.i.a(this.f25002i);
        }
    }
}
