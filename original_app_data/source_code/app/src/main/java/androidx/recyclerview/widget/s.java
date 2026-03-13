package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import b0.J;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f24553a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.r f24554b = new b0.r();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static X0.e f24555d = new X0.f(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.m.c f24557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.m.c f24558c;

        public static void a() {
            while (f24555d.b() != null) {
            }
        }

        public static a b() {
            a aVar = (a) f24555d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.f24556a = 0;
            aVar.f24557b = null;
            aVar.f24558c = null;
            f24555d.a(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(RecyclerView.E e10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.E e10);

        void c(RecyclerView.E e10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.E e10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    public void a(RecyclerView.E e10, RecyclerView.m.c cVar) {
        a aVarB = (a) this.f24553a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f24553a.put(e10, aVarB);
        }
        aVarB.f24556a |= 2;
        aVarB.f24557b = cVar;
    }

    public void b(RecyclerView.E e10) {
        a aVarB = (a) this.f24553a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f24553a.put(e10, aVarB);
        }
        aVarB.f24556a |= 1;
    }

    public void c(long j10, RecyclerView.E e10) {
        this.f24554b.m(j10, e10);
    }

    public void d(RecyclerView.E e10, RecyclerView.m.c cVar) {
        a aVarB = (a) this.f24553a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f24553a.put(e10, aVarB);
        }
        aVarB.f24558c = cVar;
        aVarB.f24556a |= 8;
    }

    public void e(RecyclerView.E e10, RecyclerView.m.c cVar) {
        a aVarB = (a) this.f24553a.get(e10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f24553a.put(e10, aVarB);
        }
        aVarB.f24557b = cVar;
        aVarB.f24556a |= 4;
    }

    public void f() {
        this.f24553a.clear();
        this.f24554b.a();
    }

    public RecyclerView.E g(long j10) {
        return (RecyclerView.E) this.f24554b.g(j10);
    }

    public boolean h(RecyclerView.E e10) {
        a aVar = (a) this.f24553a.get(e10);
        return (aVar == null || (aVar.f24556a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.E e10) {
        a aVar = (a) this.f24553a.get(e10);
        return (aVar == null || (aVar.f24556a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.E e10) {
        p(e10);
    }

    public final RecyclerView.m.c l(RecyclerView.E e10, int i10) {
        a aVar;
        RecyclerView.m.c cVar;
        int iD = this.f24553a.d(e10);
        if (iD >= 0 && (aVar = (a) this.f24553a.j(iD)) != null) {
            int i11 = aVar.f24556a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f24556a = i12;
                if (i10 == 4) {
                    cVar = aVar.f24557b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.f24558c;
                }
                if ((i12 & 12) == 0) {
                    this.f24553a.h(iD);
                    a.c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.m.c m(RecyclerView.E e10) {
        return l(e10, 8);
    }

    public RecyclerView.m.c n(RecyclerView.E e10) {
        return l(e10, 4);
    }

    public void o(b bVar) {
        for (int size = this.f24553a.size() - 1; size >= 0; size--) {
            RecyclerView.E e10 = (RecyclerView.E) this.f24553a.f(size);
            a aVar = (a) this.f24553a.h(size);
            int i10 = aVar.f24556a;
            if ((i10 & 3) == 3) {
                bVar.b(e10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.c cVar = aVar.f24557b;
                if (cVar == null) {
                    bVar.b(e10);
                } else {
                    bVar.c(e10, cVar, aVar.f24558c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(e10, aVar.f24557b, aVar.f24558c);
            } else if ((i10 & 12) == 12) {
                bVar.d(e10, aVar.f24557b, aVar.f24558c);
            } else if ((i10 & 4) != 0) {
                bVar.c(e10, aVar.f24557b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(e10, aVar.f24557b, aVar.f24558c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.E e10) {
        a aVar = (a) this.f24553a.get(e10);
        if (aVar == null) {
            return;
        }
        aVar.f24556a &= -2;
    }

    public void q(RecyclerView.E e10) {
        int iP = this.f24554b.p() - 1;
        while (true) {
            if (iP < 0) {
                break;
            }
            if (e10 == this.f24554b.q(iP)) {
                this.f24554b.o(iP);
                break;
            }
            iP--;
        }
        a aVar = (a) this.f24553a.remove(e10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
