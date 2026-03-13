package androidx.recyclerview.widget;

import a3.C2640a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f24380a = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f24383a - dVar2.f24383a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i10, int i11);

        public abstract boolean areItemsTheSame(int i10, int i11);

        public Object getChangePayload(int i10, int i11) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f24381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24382b;

        public c(int i10) {
            int[] iArr = new int[i10];
            this.f24381a = iArr;
            this.f24382b = iArr.length / 2;
        }

        public int[] a() {
            return this.f24381a;
        }

        public int b(int i10) {
            return this.f24381a[i10 + this.f24382b];
        }

        public void c(int i10, int i11) {
            this.f24381a[i10 + this.f24382b] = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24385c;

        public d(int i10, int i11, int i12) {
            this.f24383a = i10;
            this.f24384b = i11;
            this.f24385c = i12;
        }

        public int a() {
            return this.f24383a + this.f24385c;
        }

        public int b() {
            return this.f24384b + this.f24385c;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0311e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f24386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f24387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f24388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f24389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f24390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f24391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f24392g;

        public C0311e(b bVar, List list, int[] iArr, int[] iArr2, boolean z10) {
            this.f24386a = list;
            this.f24387b = iArr;
            this.f24388c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f24389d = bVar;
            this.f24390e = bVar.getOldListSize();
            this.f24391f = bVar.getNewListSize();
            this.f24392g = z10;
            a();
            e();
        }

        public static f g(Collection collection, int i10, boolean z10) {
            f fVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f24393a == i10 && fVar.f24395c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z10) {
                    fVar2.f24394b--;
                } else {
                    fVar2.f24394b++;
                }
            }
            return fVar;
        }

        public final void a() {
            d dVar = this.f24386a.isEmpty() ? null : (d) this.f24386a.get(0);
            if (dVar == null || dVar.f24383a != 0 || dVar.f24384b != 0) {
                this.f24386a.add(0, new d(0, 0, 0));
            }
            this.f24386a.add(new d(this.f24390e, this.f24391f, 0));
        }

        public void b(a3.d dVar) {
            int i10;
            C2640a c2640a = dVar instanceof C2640a ? (C2640a) dVar : new C2640a(dVar);
            int i11 = this.f24390e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f24390e;
            int i13 = this.f24391f;
            for (int size = this.f24386a.size() - 1; size >= 0; size--) {
                d dVar2 = (d) this.f24386a.get(size);
                int iA = dVar2.a();
                int iB = dVar2.b();
                while (true) {
                    if (i12 <= iA) {
                        break;
                    }
                    i12--;
                    int i14 = this.f24387b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        f fVarG = g(arrayDeque, i15, false);
                        if (fVarG != null) {
                            int i16 = (i11 - fVarG.f24394b) - 1;
                            c2640a.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                c2640a.c(i16, 1, this.f24389d.getChangePayload(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new f(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        c2640a.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iB) {
                    i13--;
                    int i17 = this.f24388c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        f fVarG2 = g(arrayDeque, i18, true);
                        if (fVarG2 == null) {
                            arrayDeque.add(new f(i13, i11 - i12, false));
                        } else {
                            c2640a.d((i11 - fVarG2.f24394b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                c2640a.c(i12, 1, this.f24389d.getChangePayload(i18, i13));
                            }
                        }
                    } else {
                        c2640a.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar2.f24383a;
                int i20 = dVar2.f24384b;
                for (i10 = 0; i10 < dVar2.f24385c; i10++) {
                    if ((this.f24387b[i19] & 15) == 2) {
                        c2640a.c(i19, 1, this.f24389d.getChangePayload(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar2.f24383a;
                i13 = dVar2.f24384b;
            }
            c2640a.e();
        }

        public void c(RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }

        public final void d(int i10) {
            int size = this.f24386a.size();
            int iB = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = (d) this.f24386a.get(i11);
                while (iB < dVar.f24384b) {
                    if (this.f24388c[iB] == 0 && this.f24389d.areItemsTheSame(i10, iB)) {
                        int i12 = this.f24389d.areContentsTheSame(i10, iB) ? 8 : 4;
                        this.f24387b[i10] = (iB << 4) | i12;
                        this.f24388c[iB] = (i10 << 4) | i12;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        public final void e() {
            for (d dVar : this.f24386a) {
                for (int i10 = 0; i10 < dVar.f24385c; i10++) {
                    int i11 = dVar.f24383a + i10;
                    int i12 = dVar.f24384b + i10;
                    int i13 = this.f24389d.areContentsTheSame(i11, i12) ? 1 : 2;
                    this.f24387b[i11] = (i12 << 4) | i13;
                    this.f24388c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f24392g) {
                f();
            }
        }

        public final void f() {
            int iA = 0;
            for (d dVar : this.f24386a) {
                while (iA < dVar.f24383a) {
                    if (this.f24387b[iA] == 0) {
                        d(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24395c;

        public f(int i10, int i11, boolean z10) {
            this.f24393a = i10;
            this.f24394b = i11;
            this.f24395c = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24399d;

        public g() {
        }

        public int a() {
            return this.f24399d - this.f24398c;
        }

        public int b() {
            return this.f24397b - this.f24396a;
        }

        public g(int i10, int i11, int i12, int i13) {
            this.f24396a = i10;
            this.f24397b = i11;
            this.f24398c = i12;
            this.f24399d = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24404e;

        public int a() {
            return Math.min(this.f24402c - this.f24400a, this.f24403d - this.f24401b);
        }

        public boolean b() {
            return this.f24403d - this.f24401b != this.f24402c - this.f24400a;
        }

        public boolean c() {
            return this.f24403d - this.f24401b > this.f24402c - this.f24400a;
        }

        public d d() {
            if (b()) {
                return this.f24404e ? new d(this.f24400a, this.f24401b, a()) : c() ? new d(this.f24400a, this.f24401b + 1, a()) : new d(this.f24400a + 1, this.f24401b, a());
            }
            int i10 = this.f24400a;
            return new d(i10, this.f24401b, this.f24402c - i10);
        }
    }

    public static h a(g gVar, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = (gVar.b() - gVar.a()) % 2 == 0;
        int iB2 = gVar.b() - gVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.b(i14 + 1) < cVar2.b(i14 - 1))) {
                iB = cVar2.b(i14 + 1);
                i11 = iB;
            } else {
                iB = cVar2.b(i14 - 1);
                i11 = iB - 1;
            }
            int i15 = gVar.f24399d - ((gVar.f24397b - i11) - i14);
            int i16 = (i10 == 0 || i11 != iB) ? i15 : i15 + 1;
            while (i11 > gVar.f24396a && i15 > gVar.f24398c && bVar.areItemsTheSame(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 && i12 <= i10 && cVar.b(i12) >= i11) {
                h hVar = new h();
                hVar.f24400a = i11;
                hVar.f24401b = i15;
                hVar.f24402c = iB;
                hVar.f24403d = i16;
                hVar.f24404e = true;
                return hVar;
            }
        }
        return null;
    }

    public static C0311e b(b bVar) {
        return c(bVar, true);
    }

    public static C0311e c(b bVar, boolean z10) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new g(0, oldListSize, 0, newListSize));
        int i10 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar = (g) arrayList2.remove(arrayList2.size() - 1);
            h hVarE = e(gVar, bVar, cVar, cVar2);
            if (hVarE != null) {
                if (hVarE.a() > 0) {
                    arrayList.add(hVarE.d());
                }
                g gVar2 = arrayList3.isEmpty() ? new g() : (g) arrayList3.remove(arrayList3.size() - 1);
                gVar2.f24396a = gVar.f24396a;
                gVar2.f24398c = gVar.f24398c;
                gVar2.f24397b = hVarE.f24400a;
                gVar2.f24399d = hVarE.f24401b;
                arrayList2.add(gVar2);
                gVar.f24397b = gVar.f24397b;
                gVar.f24399d = gVar.f24399d;
                gVar.f24396a = hVarE.f24402c;
                gVar.f24398c = hVarE.f24403d;
                arrayList2.add(gVar);
            } else {
                arrayList3.add(gVar);
            }
        }
        Collections.sort(arrayList, f24380a);
        return new C0311e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    public static h d(g gVar, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = Math.abs(gVar.b() - gVar.a()) % 2 == 1;
        int iB2 = gVar.b() - gVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.b(i14 + 1) > cVar.b(i14 - 1))) {
                iB = cVar.b(i14 + 1);
                i11 = iB;
            } else {
                iB = cVar.b(i14 - 1);
                i11 = iB + 1;
            }
            int i15 = (gVar.f24398c + (i11 - gVar.f24396a)) - i14;
            int i16 = (i10 == 0 || i11 != iB) ? i15 : i15 - 1;
            while (i11 < gVar.f24397b && i15 < gVar.f24399d && bVar.areItemsTheSame(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                h hVar = new h();
                hVar.f24400a = iB;
                hVar.f24401b = i16;
                hVar.f24402c = i11;
                hVar.f24403d = i15;
                hVar.f24404e = false;
                return hVar;
            }
        }
        return null;
    }

    public static h e(g gVar, b bVar, c cVar, c cVar2) {
        if (gVar.b() >= 1 && gVar.a() >= 1) {
            int iB = ((gVar.b() + gVar.a()) + 1) / 2;
            cVar.c(1, gVar.f24396a);
            cVar2.c(1, gVar.f24397b);
            for (int i10 = 0; i10 < iB; i10++) {
                h hVarD = d(gVar, bVar, cVar, cVar2, i10);
                if (hVarD != null) {
                    return hVarD;
                }
                h hVarA = a(gVar, bVar, cVar, cVar2, i10);
                if (hVarA != null) {
                    return hVarA;
                }
            }
        }
        return null;
    }
}
