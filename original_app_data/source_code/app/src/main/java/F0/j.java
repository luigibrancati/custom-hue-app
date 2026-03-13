package F0;

import F0.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean[] f3564a = new boolean[3];

    public static void a(f fVar, E0.d dVar, e eVar) {
        eVar.f3500j = -1;
        eVar.f3502k = -1;
        e.b bVar = fVar.f3468M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f3468M[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f3457B.f3451e;
            int iN = fVar.N() - eVar.f3459D.f3451e;
            d dVar2 = eVar.f3457B;
            dVar2.f3453g = dVar.q(dVar2);
            d dVar3 = eVar.f3459D;
            dVar3.f3453g = dVar.q(dVar3);
            dVar.f(eVar.f3457B.f3453g, i10);
            dVar.f(eVar.f3459D.f3453g, iN);
            eVar.f3500j = 2;
            eVar.h0(i10, iN);
        }
        if (fVar.f3468M[1] == bVar2 || eVar.f3468M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f3458C.f3451e;
        int iT = fVar.t() - eVar.f3460E.f3451e;
        d dVar4 = eVar.f3458C;
        dVar4.f3453g = dVar.q(dVar4);
        d dVar5 = eVar.f3460E;
        dVar5.f3453g = dVar.q(dVar5);
        dVar.f(eVar.f3458C.f3453g, i11);
        dVar.f(eVar.f3460E.f3453g, iT);
        if (eVar.f3480Y > 0 || eVar.M() == 8) {
            d dVar6 = eVar.f3461F;
            dVar6.f3453g = dVar.q(dVar6);
            dVar.f(eVar.f3461F.f3453g, eVar.f3480Y + i11);
        }
        eVar.f3502k = 2;
        eVar.w0(i11, iT);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
