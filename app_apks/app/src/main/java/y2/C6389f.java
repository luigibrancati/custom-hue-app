package y2;

import G1.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: y2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6389f extends AbstractC6385b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f48363a;

    /* JADX INFO: renamed from: y2.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48365b;

        public b(int i10, long j10) {
            this.f48364a = i10;
            this.f48365b = j10;
        }
    }

    /* JADX INFO: renamed from: y2.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f48369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f48370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f48371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f48372g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f48373h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f48374i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f48375j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f48376k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f48366a = j10;
            this.f48367b = z10;
            this.f48368c = z11;
            this.f48369d = z12;
            this.f48371f = Collections.unmodifiableList(list);
            this.f48370e = j11;
            this.f48372g = z13;
            this.f48373h = j12;
            this.f48374i = i10;
            this.f48375j = i11;
            this.f48376k = i12;
        }

        public static c b(C c10) {
            boolean z10;
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j10;
            boolean z13;
            long j11;
            int i10;
            int i11;
            int iL;
            boolean z14;
            long jN;
            long jN2 = c10.N();
            boolean z15 = true;
            if ((c10.L() & 128) != 0) {
                z10 = true;
            } else {
                z10 = true;
                z15 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z15) {
                arrayList = arrayList2;
                z11 = false;
                z12 = false;
                j10 = -9223372036854775807L;
                z13 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iL = 0;
            } else {
                int iL2 = c10.L();
                boolean z16 = (iL2 & 128) != 0 ? z10 : false;
                boolean z17 = (iL2 & 64) != 0 ? z10 : false;
                boolean z18 = (iL2 & 32) != 0 ? z10 : false;
                long jN3 = z17 ? c10.N() : -9223372036854775807L;
                if (!z17) {
                    int iL3 = c10.L();
                    ArrayList arrayList3 = new ArrayList(iL3);
                    int i12 = 0;
                    while (i12 < iL3) {
                        arrayList3.add(new b(c10.L(), c10.N()));
                        i12++;
                        iL3 = iL3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long jL = c10.L();
                    boolean z19 = (128 & jL) != 0;
                    jN = ((((jL & 1) << 32) | c10.N()) * 1000) / 90;
                    z14 = z19;
                } else {
                    z14 = false;
                    jN = -9223372036854775807L;
                }
                int iT = c10.T();
                int iL4 = c10.L();
                boolean z20 = z16;
                z13 = z14;
                z11 = z20;
                iL = c10.L();
                long j12 = jN3;
                i10 = iT;
                i11 = iL4;
                long j13 = jN;
                arrayList = arrayList2;
                z12 = z17;
                j10 = j12;
                j11 = j13;
            }
            return new c(jN2, z15, z11, z12, arrayList, j10, z13, j11, i10, i11, iL);
        }
    }

    public C6389f(List list) {
        this.f48363a = Collections.unmodifiableList(list);
    }

    public static C6389f d(C c10) {
        int iL = c10.L();
        ArrayList arrayList = new ArrayList(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            arrayList.add(c.b(c10));
        }
        return new C6389f(arrayList);
    }
}
