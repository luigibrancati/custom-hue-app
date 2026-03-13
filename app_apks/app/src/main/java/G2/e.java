package G2;

import F2.k;
import F2.l;
import F2.p;
import F2.q;
import G1.AbstractC0853a;
import G1.M;
import G2.e;
import J1.g;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f4449a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f4451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f4452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4455g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends p implements Comparable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f4456k;

        public b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (w() != bVar.w()) {
                return w() ? 1 : -1;
            }
            long j10 = this.f5880f - bVar.f5880f;
            if (j10 == 0) {
                j10 = this.f4456k - bVar.f4456k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends q {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public g.a f4457g;

        public c(g.a aVar) {
            this.f4457g = aVar;
        }

        @Override // J1.g
        public final void C() {
            this.f4457g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f4449a.add(new b());
        }
        this.f4450b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f4450b.add(new c(new g.a() { // from class: G2.d
                @Override // J1.g.a
                public final void a(g gVar) {
                    this.f4448a.p((e.c) gVar);
                }
            }));
        }
        this.f4451c = new ArrayDeque();
        this.f4455g = -9223372036854775807L;
    }

    @Override // F2.l
    public void b(long j10) {
        this.f4453e = j10;
    }

    @Override // J1.d
    public final void d(long j10) {
        this.f4455g = j10;
    }

    @Override // J1.d
    public void flush() {
        this.f4454f = 0L;
        this.f4453e = 0L;
        while (!this.f4451c.isEmpty()) {
            o((b) M.i((b) this.f4451c.poll()));
        }
        b bVar = this.f4452d;
        if (bVar != null) {
            o(bVar);
            this.f4452d = null;
        }
    }

    public abstract k g();

    public abstract void h(p pVar);

    @Override // J1.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p e() {
        AbstractC0853a.g(this.f4452d == null);
        if (this.f4449a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f4449a.pollFirst();
        this.f4452d = bVar;
        return bVar;
    }

    @Override // J1.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public q a() {
        if (this.f4450b.isEmpty()) {
            return null;
        }
        while (!this.f4451c.isEmpty() && ((b) M.i((b) this.f4451c.peek())).f5880f <= this.f4453e) {
            b bVar = (b) M.i((b) this.f4451c.poll());
            if (bVar.w()) {
                q qVar = (q) M.i((q) this.f4450b.pollFirst());
                qVar.q(4);
                o(bVar);
                return qVar;
            }
            h(bVar);
            if (m()) {
                k kVarG = g();
                q qVar2 = (q) M.i((q) this.f4450b.pollFirst());
                qVar2.D(bVar.f5880f, kVarG, Long.MAX_VALUE);
                o(bVar);
                return qVar2;
            }
            o(bVar);
        }
        return null;
    }

    public final q k() {
        return (q) this.f4450b.pollFirst();
    }

    public final long l() {
        return this.f4453e;
    }

    public abstract boolean m();

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // J1.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(F2.p r7) {
        /*
            r6 = this;
            G2.e$b r0 = r6.f4452d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            G1.AbstractC0853a.a(r0)
            G2.e$b r7 = (G2.e.b) r7
            boolean r0 = r7.w()
            if (r0 != 0) goto L2d
            long r0 = r7.f5880f
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2d
            long r2 = r6.f4455g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r6.o(r7)
            goto L3c
        L2d:
            long r0 = r6.f4454f
            r2 = 1
            long r2 = r2 + r0
            r6.f4454f = r2
            G2.e.b.I(r7, r0)
            java.util.ArrayDeque r0 = r6.f4451c
            r0.add(r7)
        L3c:
            r7 = 0
            r6.f4452d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.e.c(F2.p):void");
    }

    public final void o(b bVar) {
        bVar.s();
        this.f4449a.add(bVar);
    }

    public void p(q qVar) {
        qVar.s();
        this.f4450b.add(qVar);
    }

    @Override // J1.d
    public void release() {
    }
}
