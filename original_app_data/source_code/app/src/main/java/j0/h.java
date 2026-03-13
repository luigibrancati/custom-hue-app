package j0;

import fc.C4015H;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38880e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f38881f = new h(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f38885d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final h a() {
            return h.f38881f;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.k implements vc.p {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f38886k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f38887l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f38888m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f38889n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f38890o;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Nd.j jVar, InterfaceC4988e interfaceC4988e) {
            return ((b) create(jVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            b bVar = h.this.new b(interfaceC4988e);
            bVar.f38890o = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.a(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        
            if (r13.a(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f3). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(long j10, long j11, long j12, long[] jArr) {
        this.f38882a = j10;
        this.f38883b = j11;
        this.f38884c = j12;
        this.f38885d = jArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Nd.k.b(new b(null)).iterator();
    }

    public final boolean k(long j10) {
        long[] jArr;
        long j11 = j10 - this.f38884c;
        long j12 = 0;
        return (AbstractC4862t.g(j11, j12) < 0 || AbstractC4862t.g(j11, (long) 64) >= 0) ? (AbstractC4862t.g(j11, (long) 64) < 0 || AbstractC4862t.g(j11, (long) 128) >= 0) ? AbstractC4862t.g(j11, j12) <= 0 && (jArr = this.f38885d) != null && i.a(jArr, j10) >= 0 : ((1 << (((int) j11) - 64)) & this.f38882a) != 0 : ((1 << ((int) j11)) & this.f38883b) != 0;
    }

    public final long l(long j10) {
        long[] jArr = this.f38885d;
        if (jArr != null) {
            return jArr[0];
        }
        long j11 = this.f38883b;
        if (j11 != 0) {
            return this.f38884c + ((long) Long.numberOfTrailingZeros(j11));
        }
        long j12 = this.f38882a;
        return j12 != 0 ? this.f38884c + ((long) 64) + ((long) Long.numberOfTrailingZeros(j12)) : j10;
    }

    public final h n(long j10) {
        long j11;
        long j12;
        long[] jArrB;
        long j13 = j10 - this.f38884c;
        long j14 = 0;
        if (AbstractC4862t.g(j13, j14) < 0 || AbstractC4862t.g(j13, 64) >= 0) {
            long j15 = 64;
            if (AbstractC4862t.g(j13, j15) < 0 || AbstractC4862t.g(j13, 128) >= 0) {
                long j16 = 128;
                if (AbstractC4862t.g(j13, j16) < 0) {
                    long[] jArr = this.f38885d;
                    if (jArr == null) {
                        return new h(this.f38882a, this.f38883b, this.f38884c, new long[]{j10});
                    }
                    int iA = i.a(jArr, j10);
                    if (iA < 0) {
                        return new h(this.f38882a, this.f38883b, this.f38884c, i.d(jArr, -(iA + 1), j10));
                    }
                } else if (!k(j10)) {
                    long j17 = this.f38882a;
                    long j18 = this.f38883b;
                    long j19 = this.f38884c;
                    long j20 = 1;
                    long j21 = ((j10 + j20) / j15) * j15;
                    if (AbstractC4862t.g(j21, j14) < 0) {
                        j21 = (Long.MAX_VALUE - j16) + j20;
                    }
                    g gVar = null;
                    long j22 = j17;
                    while (true) {
                        if (AbstractC4862t.g(j19, j21) >= 0) {
                            j11 = j18;
                            j12 = j19;
                            break;
                        }
                        if (j18 != 0) {
                            if (gVar == null) {
                                gVar = new g(this.f38885d);
                            }
                            int i10 = 0;
                            while (i10 < 64) {
                                long j23 = j18;
                                if ((j18 & (1 << i10)) != 0) {
                                    gVar.a(((long) i10) + j19);
                                }
                                i10++;
                                j18 = j23;
                            }
                        }
                        if (j22 == 0) {
                            j12 = j21;
                            j11 = 0;
                            break;
                        }
                        j19 += j15;
                        j18 = j22;
                        j22 = 0;
                    }
                    if (gVar == null || (jArrB = gVar.b()) == null) {
                        jArrB = this.f38885d;
                    }
                    return new h(j22, j11, j12, jArrB).n(j10);
                }
            } else {
                long j24 = 1 << (((int) j13) - 64);
                long j25 = this.f38882a;
                if ((j25 & j24) == 0) {
                    return new h(j25 | j24, this.f38883b, this.f38884c, this.f38885d);
                }
            }
        } else {
            long j26 = 1 << ((int) j13);
            long j27 = this.f38883b;
            if ((j27 & j26) == 0) {
                return new h(this.f38882a, j27 | j26, this.f38884c, this.f38885d);
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(C4207u.v(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        sb2.append(c.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}
