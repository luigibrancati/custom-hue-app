package Bc;

import Bc.d;
import Bc.g;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class k extends j {
    public static double d(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static int e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double g(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static int h(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long i(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double j(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static int k(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long l(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static d m(int i10, int i11) {
        return d.f791d.a(i10, i11, -1);
    }

    public static d n(d dVar, int i10) {
        AbstractC4862t.e(dVar, "<this>");
        j.a(i10 > 0, Integer.valueOf(i10));
        d.a aVar = d.f791d;
        int iC = dVar.c();
        int iD = dVar.d();
        if (dVar.e() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iC, iD, i10);
    }

    public static g o(g gVar, long j10) {
        AbstractC4862t.e(gVar, "<this>");
        j.a(j10 > 0, Long.valueOf(j10));
        g.a aVar = g.f801d;
        long jC = gVar.c();
        long jD = gVar.d();
        if (gVar.e() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jC, jD, j10);
    }

    public static f p(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? f.f799e.a() : new f(i10, i11 - 1);
    }

    public static i q(long j10, long j11) {
        return j11 <= Long.MIN_VALUE ? i.f809e.a() : new i(j10, j11 - 1);
    }
}
