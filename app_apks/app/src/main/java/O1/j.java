package O1;

import G1.AbstractC0853a;
import K7.AbstractC1081v;
import O1.k;
import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D1.o f10817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1081v f10818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f10821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f10822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f10823h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f10825i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f10826j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f10827k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final i f10828l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final m f10829m;

        public c(long j10, D1.o oVar, List list, k.e eVar, List list2, List list3, List list4, String str, long j11) {
            super(j10, oVar, list, eVar, list2, list3, list4);
            this.f10825i = Uri.parse(((O1.b) list.get(0)).f10762a);
            i iVarC = eVar.c();
            this.f10828l = iVarC;
            this.f10827k = str;
            this.f10826j = j11;
            this.f10829m = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // O1.j
        public String k() {
            return this.f10827k;
        }

        @Override // O1.j
        public N1.g l() {
            return this.f10829m;
        }

        @Override // O1.j
        public i m() {
            return this.f10828l;
        }
    }

    public static j o(long j10, D1.o oVar, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, oVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, oVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract N1.g l();

    public abstract i m();

    public i n() {
        return this.f10823h;
    }

    public j(long j10, D1.o oVar, List list, k kVar, List list2, List list3, List list4) {
        AbstractC0853a.a(!list.isEmpty());
        this.f10816a = j10;
        this.f10817b = oVar;
        this.f10818c = AbstractC1081v.v(list);
        this.f10820e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f10821f = list3;
        this.f10822g = list4;
        this.f10823h = kVar.a(this);
        this.f10819d = kVar.b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends j implements N1.g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final k.a f10824i;

        public b(long j10, D1.o oVar, List list, k.a aVar, List list2, List list3, List list4) {
            super(j10, oVar, list, aVar, list2, list3, list4);
            this.f10824i = aVar;
        }

        @Override // N1.g
        public long a(long j10, long j11) {
            return this.f10824i.h(j10, j11);
        }

        @Override // N1.g
        public long b(long j10) {
            return this.f10824i.j(j10);
        }

        @Override // N1.g
        public long c(long j10, long j11) {
            return this.f10824i.d(j10, j11);
        }

        @Override // N1.g
        public long d(long j10, long j11) {
            return this.f10824i.f(j10, j11);
        }

        @Override // N1.g
        public i e(long j10) {
            return this.f10824i.k(this, j10);
        }

        @Override // N1.g
        public long f(long j10, long j11) {
            return this.f10824i.i(j10, j11);
        }

        @Override // N1.g
        public long g(long j10) {
            return this.f10824i.g(j10);
        }

        @Override // N1.g
        public boolean h() {
            return this.f10824i.l();
        }

        @Override // N1.g
        public long i() {
            return this.f10824i.e();
        }

        @Override // N1.g
        public long j(long j10, long j11) {
            return this.f10824i.c(j10, j11);
        }

        @Override // O1.j
        public String k() {
            return null;
        }

        @Override // O1.j
        public i m() {
            return null;
        }

        @Override // O1.j
        public N1.g l() {
            return this;
        }
    }
}
