package a2;

import G1.AbstractC0853a;
import K1.F0;
import K7.AbstractC1081v;
import java.util.List;

/* JADX INFO: renamed from: a2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2623i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1081v f20842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20843b;

    /* JADX INFO: renamed from: a2.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f20844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC1081v f20845b;

        public a(d0 d0Var, List list) {
            this.f20844a = d0Var;
            this.f20845b = AbstractC1081v.v(list);
        }

        public AbstractC1081v a() {
            return this.f20845b;
        }

        @Override // a2.d0
        public long b() {
            return this.f20844a.b();
        }

        @Override // a2.d0
        public boolean d() {
            return this.f20844a.d();
        }

        @Override // a2.d0
        public boolean e(F0 f02) {
            return this.f20844a.e(f02);
        }

        @Override // a2.d0
        public long g() {
            return this.f20844a.g();
        }

        @Override // a2.d0
        public void h(long j10) {
            this.f20844a.h(j10);
        }
    }

    public C2623i(List list, List list2) {
        AbstractC1081v.a aVarR = AbstractC1081v.r();
        AbstractC0853a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarR.a(new a((d0) list.get(i10), (List) list2.get(i10)));
        }
        this.f20842a = aVarR.k();
        this.f20843b = -9223372036854775807L;
    }

    @Override // a2.d0
    public long b() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f20842a.size(); i10++) {
            long jB = ((a) this.f20842a.get(i10)).b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // a2.d0
    public boolean d() {
        for (int i10 = 0; i10 < this.f20842a.size(); i10++) {
            if (((a) this.f20842a.get(i10)).d()) {
                return true;
            }
        }
        return false;
    }

    @Override // a2.d0
    public boolean e(F0 f02) {
        boolean zE;
        boolean z10 = false;
        do {
            long jB = b();
            if (jB == Long.MIN_VALUE) {
                return z10;
            }
            zE = false;
            for (int i10 = 0; i10 < this.f20842a.size(); i10++) {
                long jB2 = ((a) this.f20842a.get(i10)).b();
                boolean z11 = jB2 != Long.MIN_VALUE && jB2 <= f02.f6848a;
                if (jB2 == jB || z11) {
                    zE |= ((a) this.f20842a.get(i10)).e(f02);
                }
            }
            z10 |= zE;
        } while (zE);
        return z10;
    }

    @Override // a2.d0
    public long g() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f20842a.size(); i10++) {
            a aVar = (a) this.f20842a.get(i10);
            long jG = aVar.g();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && jG != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jG);
            }
            if (jG != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jG);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f20843b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f20843b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // a2.d0
    public void h(long j10) {
        for (int i10 = 0; i10 < this.f20842a.size(); i10++) {
            ((a) this.f20842a.get(i10)).h(j10);
        }
    }
}
