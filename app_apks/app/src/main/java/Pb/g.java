package Pb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends Eb.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f13264b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ze.b f13265d;

        public a(Ze.b bVar, Object[] objArr) {
            super(objArr);
            this.f13265d = bVar;
        }

        @Override // Pb.g.b
        public void a() {
            Object[] objArr = this.f13266a;
            int length = objArr.length;
            Ze.b bVar = this.f13265d;
            for (int i10 = this.f13267b; i10 != length; i10++) {
                if (this.f13268c) {
                    return;
                }
                Object obj = objArr[i10];
                if (obj == null) {
                    bVar.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                bVar.c(obj);
            }
            if (this.f13268c) {
                return;
            }
            bVar.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            r10.f13267b = r2;
            r11 = addAndGet(-r6);
         */
        @Override // Pb.g.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(long r11) {
            /*
                r10 = this;
                java.lang.Object[] r0 = r10.f13266a
                int r1 = r0.length
                int r2 = r10.f13267b
                Ze.b r3 = r10.f13265d
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L41
                if (r2 == r1) goto L41
                boolean r8 = r10.f13268c
                if (r8 == 0) goto L15
                goto L5e
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L38
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "The element at index "
                r11.append(r12)
                r11.append(r2)
                java.lang.String r12 = " is null"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r10.<init>(r11)
                r3.onError(r10)
                return
            L38:
                r3.c(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L41:
                if (r2 != r1) goto L4b
                boolean r10 = r10.f13268c
                if (r10 != 0) goto L5e
                r3.a()
                return
            L4b:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f13267b = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
            L5e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pb.g.a.b(long):void");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b extends Xb.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f13266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f13268c;

        public b(Object[] objArr) {
            this.f13266a = objArr;
        }

        public abstract void a();

        public abstract void b(long j10);

        @Override // Ze.c
        public final void cancel() {
            this.f13268c = true;
        }

        @Override // Mb.h
        public final void clear() {
            this.f13267b = this.f13266a.length;
        }

        @Override // Mb.h
        public final boolean isEmpty() {
            return this.f13267b == this.f13266a.length;
        }

        @Override // Ze.c
        public final void p(long j10) {
            if (Xb.g.v(j10) && Yb.c.a(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j10);
                }
            }
        }

        @Override // Mb.h
        public final Object poll() {
            int i10 = this.f13267b;
            Object[] objArr = this.f13266a;
            if (i10 == objArr.length) {
                return null;
            }
            this.f13267b = i10 + 1;
            return Lb.b.e(objArr[i10], "array element is null");
        }

        @Override // Mb.d
        public final int q(int i10) {
            return i10 & 1;
        }
    }

    public g(Object[] objArr) {
        this.f13264b = objArr;
    }

    @Override // Eb.f
    public void j(Ze.b bVar) {
        bVar.d(new a(bVar, this.f13264b));
    }
}
