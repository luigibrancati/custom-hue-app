package y2;

import G1.C;
import G1.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: y2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6387d extends AbstractC6385b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f48354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f48356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f48357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f48358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f48359m;

    /* JADX INFO: renamed from: y2.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f48362c;

        public b(int i10, long j10, long j11) {
            this.f48360a = i10;
            this.f48361b = j10;
            this.f48362c = j11;
        }
    }

    public C6387d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f48347a = j10;
        this.f48348b = z10;
        this.f48349c = z11;
        this.f48350d = z12;
        this.f48351e = z13;
        this.f48352f = j11;
        this.f48353g = j12;
        this.f48354h = Collections.unmodifiableList(list);
        this.f48355i = z14;
        this.f48356j = j13;
        this.f48357k = i10;
        this.f48358l = i11;
        this.f48359m = i12;
    }

    public static C6387d d(C c10, long j10, H h10) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iL;
        int iL2;
        boolean z14;
        int i11;
        long jE;
        long jN = c10.N();
        boolean z15 = (c10.L() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jN2 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iL = 0;
            iL2 = 0;
        } else {
            int iL3 = c10.L();
            boolean z16 = (iL3 & 128) != 0;
            boolean z17 = (iL3 & 64) != 0;
            boolean z18 = (iL3 & 32) != 0;
            boolean z19 = (iL3 & 16) != 0;
            long jE2 = (!z17 || z19) ? -9223372036854775807L : C6390g.e(c10, j10);
            if (!z17) {
                int iL4 = c10.L();
                ArrayList arrayList = new ArrayList(iL4);
                int i12 = 0;
                while (i12 < iL4) {
                    int iL5 = c10.L();
                    if (z19) {
                        i11 = iL4;
                        jE = -9223372036854775807L;
                    } else {
                        i11 = iL4;
                        jE = C6390g.e(c10, j10);
                    }
                    arrayList.add(new b(iL5, jE, h10.b(jE)));
                    i12++;
                    iL4 = i11;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jL = c10.L();
                boolean z20 = (128 & jL) != 0;
                jN2 = ((((jL & 1) << 32) | c10.N()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iT = c10.T();
            long j12 = jE2;
            j11 = jN2;
            jN2 = j12;
            iL = c10.L();
            iL2 = c10.L();
            i10 = iT;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new C6387d(jN, z15, z10, z11, z12, jN2, h10.b(jN2), list, z13, j11, i10, iL, iL2);
    }

    @Override // y2.AbstractC6385b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f48352f + ", programSplicePlaybackPositionUs= " + this.f48353g + " }";
    }
}
