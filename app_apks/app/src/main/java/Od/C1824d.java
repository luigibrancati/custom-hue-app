package Od;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: Od.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C1824d implements Nd.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f12400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.p f12403d;

    /* JADX INFO: renamed from: Od.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12404a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bc.f f12407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12408e;

        public a() {
            int iK = Bc.k.k(C1824d.this.f12401b, 0, C1824d.this.f12400a.length());
            this.f12405b = iK;
            this.f12406c = iK;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f12406c
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f12404a = r1
                r0 = 0
                r6.f12407d = r0
                return
            Lb:
                Od.d r0 = Od.C1824d.this
                int r0 = Od.C1824d.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f12408e
                int r0 = r0 + r3
                r6.f12408e = r0
                Od.d r4 = Od.C1824d.this
                int r4 = Od.C1824d.d(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f12406c
                Od.d r4 = Od.C1824d.this
                java.lang.CharSequence r4 = Od.C1824d.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                Bc.f r0 = new Bc.f
                int r1 = r6.f12405b
                Od.d r4 = Od.C1824d.this
                java.lang.CharSequence r4 = Od.C1824d.c(r4)
                int r4 = Od.F.c0(r4)
                r0.<init>(r1, r4)
                r6.f12407d = r0
                r6.f12406c = r2
                goto L9b
            L46:
                Od.d r0 = Od.C1824d.this
                vc.p r0 = Od.C1824d.b(r0)
                Od.d r4 = Od.C1824d.this
                java.lang.CharSequence r4 = Od.C1824d.c(r4)
                int r5 = r6.f12406c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                fc.q r0 = (fc.C4034q) r0
                if (r0 != 0) goto L76
                Bc.f r0 = new Bc.f
                int r1 = r6.f12405b
                Od.d r4 = Od.C1824d.this
                java.lang.CharSequence r4 = Od.C1824d.c(r4)
                int r4 = Od.F.c0(r4)
                r0.<init>(r1, r4)
                r6.f12407d = r0
                r6.f12406c = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f12405b
                Bc.f r4 = Bc.k.p(r4, r2)
                r6.f12407d = r4
                int r2 = r2 + r0
                r6.f12405b = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f12406c = r2
            L9b:
                r6.f12404a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Od.C1824d.a.a():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bc.f next() {
            if (this.f12404a == -1) {
                a();
            }
            if (this.f12404a == 0) {
                throw new NoSuchElementException();
            }
            Bc.f fVar = this.f12407d;
            AbstractC4862t.c(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f12407d = null;
            this.f12404a = -1;
            return fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12404a == -1) {
                a();
            }
            return this.f12404a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1824d(CharSequence input, int i10, int i11, vc.p getNextMatch) {
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(getNextMatch, "getNextMatch");
        this.f12400a = input;
        this.f12401b = i10;
        this.f12402c = i11;
        this.f12403d = getNextMatch;
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new a();
    }
}
