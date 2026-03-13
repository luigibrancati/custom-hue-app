package O1;

import D1.C;
import G1.M;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c implements V1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f10774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f10775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f10776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f10777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f10778m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f10766a = j10;
        this.f10767b = j11;
        this.f10768c = j12;
        this.f10769d = z10;
        this.f10770e = j13;
        this.f10771f = j14;
        this.f10772g = j15;
        this.f10773h = j16;
        this.f10777l = hVar;
        this.f10774i = oVar;
        this.f10776k = uri;
        this.f10775j = lVar;
        this.f10778m = list == null ? Collections.EMPTY_LIST : list;
    }

    public static ArrayList c(List list, LinkedList linkedList) {
        C c10 = (C) linkedList.poll();
        int i10 = c10.f1438a;
        ArrayList arrayList = new ArrayList();
        do {
            int i11 = c10.f1439b;
            a aVar = (a) list.get(i11);
            List list2 = aVar.f10758c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(c10.f1440c));
                c10 = (C) linkedList.poll();
                if (c10.f1438a != i10) {
                    break;
                }
            } while (c10.f1439b == i11);
            arrayList.add(new a(aVar.f10756a, aVar.f10757b, arrayList2, aVar.f10759d, aVar.f10760e, aVar.f10761f));
        } while (c10.f1438a == i10);
        linkedList.addFirst(c10);
        return arrayList;
    }

    @Override // V1.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((C) linkedList.peek()).f1438a != i10) {
                long jF = f(i10);
                if (jF != -9223372036854775807L) {
                    j10 += jF;
                }
            } else {
                g gVarD = d(i10);
                arrayList.add(new g(gVarD.f10802a, gVarD.f10803b - j10, c(gVarD.f10804c, linkedList), gVarD.f10805d));
            }
            i10++;
        }
        long j11 = this.f10767b;
        return new c(this.f10766a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f10768c, this.f10769d, this.f10770e, this.f10771f, this.f10772g, this.f10773h, this.f10777l, this.f10774i, this.f10775j, this.f10776k, arrayList);
    }

    public final g d(int i10) {
        return (g) this.f10778m.get(i10);
    }

    public final int e() {
        return this.f10778m.size();
    }

    public final long f(int i10) {
        long j10;
        long j11;
        if (i10 == this.f10778m.size() - 1) {
            j10 = this.f10767b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((g) this.f10778m.get(i10)).f10803b;
        } else {
            j10 = ((g) this.f10778m.get(i10 + 1)).f10803b;
            j11 = ((g) this.f10778m.get(i10)).f10803b;
        }
        return j10 - j11;
    }

    public final long g(int i10) {
        return M.M0(f(i10));
    }
}
