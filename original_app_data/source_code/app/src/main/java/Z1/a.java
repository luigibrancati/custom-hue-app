package Z1;

import C2.u;
import D1.C;
import D1.o;
import G1.AbstractC0853a;
import G1.J;
import G1.M;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a implements V1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0258a f20149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f20150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20152h;

    /* JADX INFO: renamed from: Z1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0258a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f20153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f20154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u[] f20155c;

        public C0258a(UUID uuid, byte[] bArr, u[] uVarArr) {
            this.f20153a = uuid;
            this.f20154b = bArr;
            this.f20155c = uVarArr;
        }
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0258a c0258a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : M.a1(j11, 1000000L, j10), j12 != 0 ? M.a1(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0258a, bVarArr);
    }

    @Override // V1.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C c10 = (C) arrayList.get(i10);
            b bVar2 = this.f20150f[c10.f1439b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((o[]) arrayList3.toArray(new o[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f20165j[c10.f1440c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((o[]) arrayList3.toArray(new o[0])));
        }
        return new a(this.f20145a, this.f20146b, this.f20151g, this.f20152h, this.f20147c, this.f20148d, this.f20149e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f20159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f20163h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f20164i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o[] f20165j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f20166k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f20167l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f20168m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List f20169n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final long[] f20170o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f20171p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, o[] oVarArr, List list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, oVarArr, list, M.b1(list, 1000000L, j10), M.a1(j11, 1000000L, j10));
        }

        public Uri a(int i10, int i11) {
            AbstractC0853a.g(this.f20165j != null);
            AbstractC0853a.g(this.f20169n != null);
            AbstractC0853a.g(i11 < this.f20169n.size());
            String string = Integer.toString(this.f20165j[i10].f1800j);
            String string2 = ((Long) this.f20169n.get(i11)).toString();
            return J.g(this.f20167l, this.f20168m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(o[] oVarArr) {
            return new b(this.f20167l, this.f20168m, this.f20156a, this.f20157b, this.f20158c, this.f20159d, this.f20160e, this.f20161f, this.f20162g, this.f20163h, this.f20164i, oVarArr, this.f20169n, this.f20170o, this.f20171p);
        }

        public long c(int i10) {
            if (i10 == this.f20166k - 1) {
                return this.f20171p;
            }
            long[] jArr = this.f20170o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return M.h(this.f20170o, j10, true, true);
        }

        public long e(int i10) {
            return this.f20170o[i10];
        }

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, o[] oVarArr, List list, long[] jArr, long j11) {
            this.f20167l = str;
            this.f20168m = str2;
            this.f20156a = i10;
            this.f20157b = str3;
            this.f20158c = j10;
            this.f20159d = str4;
            this.f20160e = i11;
            this.f20161f = i12;
            this.f20162g = i13;
            this.f20163h = i14;
            this.f20164i = str5;
            this.f20165j = oVarArr;
            this.f20169n = list;
            this.f20170o = jArr;
            this.f20171p = j11;
            this.f20166k = list.size();
        }
    }

    public a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0258a c0258a, b[] bVarArr) {
        this.f20145a = i10;
        this.f20146b = i11;
        this.f20151g = j10;
        this.f20152h = j11;
        this.f20147c = i12;
        this.f20148d = z10;
        this.f20149e = c0258a;
        this.f20150f = bVarArr;
    }
}
