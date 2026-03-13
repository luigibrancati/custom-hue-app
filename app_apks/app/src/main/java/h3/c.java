package h3;

import Rd.M;
import b3.C;
import b3.D;
import b3.t;
import b3.z;
import fc.AbstractC4036s;
import fc.C4015H;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f36181j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t f36182k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f36183l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f36184m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ vc.l f36185n;

        /* JADX INFO: renamed from: h3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0467a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Object f36186j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f36187k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f36188l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ boolean f36189m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ boolean f36190n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ t f36191o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ vc.l f36192p;

            /* JADX INFO: renamed from: h3.c$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0468a extends nc.m implements vc.p {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public int f36193j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public /* synthetic */ Object f36194k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ vc.l f36195l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0468a(InterfaceC4988e interfaceC4988e, vc.l lVar) {
                    super(2, interfaceC4988e);
                    this.f36195l = lVar;
                }

                @Override // vc.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C c10, InterfaceC4988e interfaceC4988e) {
                    return ((C0468a) create(c10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
                }

                @Override // nc.AbstractC5157a
                public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                    C0468a c0468a = new C0468a(interfaceC4988e, this.f36195l);
                    c0468a.f36194k = obj;
                    return c0468a;
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C5046c.f();
                    if (this.f36193j != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                    C c10 = (C) this.f36194k;
                    AbstractC4862t.c(c10, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f36195l.invoke(((d3.p) c10).d());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0467a(boolean z10, boolean z11, t tVar, InterfaceC4988e interfaceC4988e, vc.l lVar) {
                super(2, interfaceC4988e);
                this.f36189m = z10;
                this.f36190n = z11;
                this.f36191o = tVar;
                this.f36192p = lVar;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, InterfaceC4988e interfaceC4988e) {
                return ((C0467a) create(d10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C0467a c0467a = new C0467a(this.f36189m, this.f36190n, this.f36191o, interfaceC4988e, this.f36192p);
                c0467a.f36188l = obj;
                return c0467a;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r1 r8
              0x00a2: PHI (r1v11 b3.D) = (r1v8 b3.D), (r1v18 b3.D) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
              0x00a2: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[RETURN] */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 216
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: h3.c.a.C0467a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, boolean z10, boolean z11, vc.l lVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f36182k = tVar;
            this.f36183l = z10;
            this.f36184m = z11;
            this.f36185n = lVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new a(this.f36182k, this.f36183l, this.f36184m, this.f36185n, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f36181j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            t tVar = this.f36182k;
            boolean z10 = this.f36183l;
            C0467a c0467a = new C0467a(this.f36184m, z10, tVar, null, this.f36185n);
            this.f36181j = 1;
            Object objQ = tVar.Q(z10, c0467a, this);
            return objQ == objF ? objF : objQ;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f36196j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ t f36197k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f36198l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f36199m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ vc.l f36200n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4988e interfaceC4988e, t tVar, boolean z10, boolean z11, vc.l lVar) {
            super(2, interfaceC4988e);
            this.f36197k = tVar;
            this.f36198l = z10;
            this.f36199m = z11;
            this.f36200n = lVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(interfaceC4988e, this.f36197k, this.f36198l, this.f36199m, this.f36200n);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f36196j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            t tVar = this.f36197k;
            boolean z10 = this.f36198l;
            d dVar = new d(this.f36199m, z10, tVar, null, this.f36200n);
            this.f36196j = 1;
            Object objQ = tVar.Q(z10, dVar, this);
            return objQ == objF ? objF : objQ;
        }
    }

    /* JADX INFO: renamed from: h3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0469c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f36201j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f36202k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f36203l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f36204m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f36205n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f36206o;

        public C0469c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f36205n = obj;
            this.f36206o |= Integer.MIN_VALUE;
            return AbstractC4270a.d(null, false, false, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f36207j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f36208k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f36209l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f36210m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f36211n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ t f36212o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ vc.l f36213p;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f36214j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f36215k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ vc.l f36216l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC4988e interfaceC4988e, vc.l lVar) {
                super(2, interfaceC4988e);
                this.f36216l = lVar;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C c10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(c10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                a aVar = new a(interfaceC4988e, this.f36216l);
                aVar.f36215k = obj;
                return aVar;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f36214j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                C c10 = (C) this.f36215k;
                AbstractC4862t.c(c10, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f36216l.invoke(((d3.p) c10).d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, boolean z11, t tVar, InterfaceC4988e interfaceC4988e, vc.l lVar) {
            super(2, interfaceC4988e);
            this.f36210m = z10;
            this.f36211n = z11;
            this.f36212o = tVar;
            this.f36213p = lVar;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D d10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(d10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            d dVar = new d(this.f36210m, this.f36211n, this.f36212o, interfaceC4988e, this.f36213p);
            dVar.f36209l = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r1 r8
          0x00a2: PHI (r1v11 b3.D) = (r1v8 b3.D), (r1v18 b3.D) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[RETURN] */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h3.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(t tVar, boolean z10, InterfaceC4988e interfaceC4988e) {
        if (!tVar.E()) {
            return tVar.t().getCoroutineContext();
        }
        android.support.v4.media.session.a.a(interfaceC4988e.getContext().get(z.f25252a));
        return z10 ? tVar.C() : tVar.w();
    }

    public static final Object b(t db2, boolean z10, boolean z11, vc.l block) {
        AbstractC4862t.e(db2, "db");
        AbstractC4862t.e(block, "block");
        db2.f();
        db2.g();
        return d3.q.a(new a(db2, z10, z11, block, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(b3.t r14, boolean r15, boolean r16, vc.l r17, lc.InterfaceC4988e r18) throws java.lang.Throwable {
        /*
            r0 = r18
            boolean r1 = r0 instanceof h3.c.C0469c
            if (r1 == 0) goto L16
            r1 = r0
            h3.c$c r1 = (h3.c.C0469c) r1
            int r2 = r1.f36206o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f36206o = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            h3.c$c r1 = new h3.c$c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.f36205n
            java.lang.Object r7 = mc.C5046c.f()
            int r1 = r6.f36206o
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            fc.AbstractC4036s.b(r0)
            return r0
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            boolean r14 = r6.f36204m
            boolean r15 = r6.f36203l
            java.lang.Object r1 = r6.f36202k
            vc.l r1 = (vc.l) r1
            java.lang.Object r3 = r6.f36201j
            b3.t r3 = (b3.t) r3
            fc.AbstractC4036s.b(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4d:
            r11 = r15
            goto L99
        L4f:
            fc.AbstractC4036s.b(r0)
            return r0
        L53:
            fc.AbstractC4036s.b(r0)
            boolean r0 = r14.E()
            if (r0 == 0) goto L7f
            boolean r0 = r14.L()
            if (r0 == 0) goto L7f
            boolean r0 = r14.F()
            if (r0 == 0) goto L7f
            h3.c$d r0 = new h3.c$d
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r6.f36206o = r8
            java.lang.Object r14 = r14.Q(r15, r2, r6)
            if (r14 != r7) goto L7e
            goto Lae
        L7e:
            return r14
        L7f:
            r4 = r16
            r6.f36201j = r14
            r5 = r17
            r6.f36202k = r5
            r6.f36203l = r15
            r6.f36204m = r4
            r6.f36206o = r3
            java.lang.Object r3 = h3.AbstractC4270a.b(r14, r4, r6)
            if (r3 != r7) goto L94
            goto Lae
        L94:
            r10 = r14
            r0 = r3
            r12 = r4
            r13 = r5
            goto L4d
        L99:
            lc.i r0 = (lc.InterfaceC4992i) r0
            h3.c$b r8 = new h3.c$b
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.f36201j = r14
            r6.f36202k = r14
            r6.f36206o = r2
            java.lang.Object r14 = Rd.AbstractC2128g.g(r0, r8, r6)
            if (r14 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.c.c(b3.t, boolean, boolean, vc.l, lc.e):java.lang.Object");
    }

    public static final int d(File databaseFile) throws IOException {
        AbstractC4862t.e(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            sc.c.a(channel, null);
            return i10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sc.c.a(channel, th);
                throw th2;
            }
        }
    }
}
