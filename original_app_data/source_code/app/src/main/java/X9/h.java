package X9;

import N6.AbstractC1460qb;
import N6.C1262b8;
import N6.C1418n8;
import N6.C1421nb;
import N6.C1444p8;
import N6.EnumC1249a8;
import N6.F1;
import N6.Sa;
import N6.Va;
import N6.Y7;
import R9.C2111i;
import T9.b;
import android.graphics.Point;
import b7.InterfaceC2877k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import s6.C5785d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends Z9.e implements T9.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final T9.b f19392l = new b.a().a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T9.b f19394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1421nb f19395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19397k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(T9.b bVar, l lVar, Executor executor, Sa sa2, C2111i c2111i) {
        C1421nb c1421nbD;
        super(lVar, executor);
        T9.d dVarB = bVar.b();
        if (dVarB == null) {
            c1421nbD = null;
        } else {
            c1421nbD = C1421nb.d(c2111i.b(), c2111i.b().getPackageName());
            c1421nbD.o(new e(dVarB), F1.a());
            if (dVarB.a() >= 1.0f) {
                c1421nbD.k(dVarB.a());
            }
            c1421nbD.m();
        }
        this.f19394h = bVar;
        boolean zF = b.f();
        this.f19393g = zF;
        C1418n8 c1418n8 = new C1418n8();
        c1418n8.i(b.c(bVar));
        C1444p8 c1444p8J = c1418n8.j();
        C1262b8 c1262b8 = new C1262b8();
        c1262b8.e(zF ? Y7.TYPE_THICK : Y7.TYPE_THIN);
        c1262b8.g(c1444p8J);
        sa2.d(Va.f(c1262b8, 1), EnumC1249a8.ON_DEVICE_BARCODE_CREATE);
        this.f19395i = c1421nbD;
    }

    @Override // t6.InterfaceC5848f
    public final C5785d[] a() {
        return this.f19393g ? R9.l.f14968a : new C5785d[]{R9.l.f14969b};
    }

    @Override // T9.a
    public final Task c0(Y9.a aVar) {
        return i(super.b(aVar), aVar.l(), aVar.h());
    }

    @Override // Z9.e, java.io.Closeable, java.lang.AutoCloseable, T9.a
    public final synchronized void close() {
        try {
            C1421nb c1421nb = this.f19395i;
            if (c1421nb != null) {
                c1421nb.n(this.f19397k);
                this.f19395i.j();
            }
            super.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ Task g(int i10, int i11, List list) {
        if (this.f19395i == null) {
            return Tasks.e(list);
        }
        this.f19396j++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            V9.a aVar = (V9.a) it.next();
            if (aVar.h() == -1) {
                arrayList2.add(aVar);
            } else {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                Point[] pointArrD = ((V9.a) arrayList2.get(i12)).d();
                if (pointArrD != null) {
                    this.f19395i.i(this.f19396j, AbstractC1460qb.g(Arrays.asList(pointArrD), i10, i11, 0.0f));
                }
            }
        } else {
            this.f19397k = true;
        }
        if (true != this.f19394h.d()) {
            list = arrayList;
        }
        return Tasks.e(list);
    }

    public final Task i(Task task, final int i10, final int i11) {
        return task.r(new InterfaceC2877k() { // from class: X9.f
            @Override // b7.InterfaceC2877k
            public final Task a(Object obj) {
                return this.f19386a.g(i10, i11, (List) obj);
            }
        });
    }
}
