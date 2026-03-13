package oa;

import la.C4979k;
import la.C4980l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class O implements InterfaceC5261m, N, Jb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f41347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.k f41348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hb.g f41349c = new Hb.g();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Jb.g {
        public a() {
        }

        @Override // Jb.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Throwable th) {
            return (th instanceof C4979k) && ((C4979k) th).b() == C4980l.f40012l;
        }
    }

    public O(j0 j0Var, int i10) {
        this.f41348b = j0Var.g().o0(new a());
        this.f41347a = Integer.valueOf(i10);
    }

    @Override // Jb.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Integer num) {
        this.f41347a = num;
    }

    @Override // oa.InterfaceC5261m
    public void b() {
        this.f41349c.dispose();
    }

    @Override // oa.InterfaceC5261m
    public void c() {
        this.f41349c.a(this.f41348b.t0(this, Lb.a.d()));
    }
}
