package com.bbflight.background_downloader;

import I3.M;
import Q4.Task;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.InterfaceC2166z0;
import Rd.N;
import Rd.X;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import android.content.Context;
import com.google.ar.core.ImageMetadata;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f27064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f27068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f27069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f27070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f27071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f27072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PriorityBlockingQueue f27073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Td.g f27074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC2166z0 f27075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rd.M f27076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Td.g f27077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC2687a f27078p;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27079j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27080k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27081l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27082m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27083n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27084o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f27085p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f27086q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f27087r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f27088s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27089t;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return f.this.new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
        
            r8.f27070h.incrementAndGet();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x013c, code lost:
        
            if (r8.f27071i.containsKey(r14) != false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
        
            r8.f27071i.put(r14, new java.util.concurrent.atomic.AtomicInteger(0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x014a, code lost:
        
            r4 = (java.util.concurrent.atomic.AtomicInteger) r8.f27071i.get(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0154, code lost:
        
            if (r4 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0156, code lost:
        
            nc.AbstractC5158b.c(r4.incrementAndGet());
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0165, code lost:
        
            if (r8.f27072j.containsKey(r15) != false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0167, code lost:
        
            r8.f27072j.put(r15, new java.util.concurrent.atomic.AtomicInteger(0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
        
            r4 = (java.util.concurrent.atomic.AtomicInteger) r8.f27072j.get(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x017d, code lost:
        
            if (r4 == null) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
        
            nc.AbstractC5158b.c(r4.incrementAndGet());
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0186, code lost:
        
            r17.f27079j = r10;
            r17.f27080k = nc.l.a(r11);
            r17.f27081l = r9;
            r17.f27082m = r8;
            r17.f27083n = r12;
            r17.f27084o = nc.l.a(r13);
            r17.f27085p = nc.l.a(r14);
            r17.f27086q = nc.l.a(r15);
            r17.f27087r = r2;
            r17.f27088s = 0;
            r17.f27089t = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01b0, code lost:
        
            if (r13.s(0, r17) != r1) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01b3, code lost:
        
            r2 = r12;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[PHI: r2 r4 r8
          0x0091: PHI (r2v7 Td.i) = (r2v9 Td.i), (r2v14 Td.i) binds: [B:18:0x008d, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
          0x0091: PHI (r4v33 int) = (r4v34 int), (r4v0 int) binds: [B:18:0x008d, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
          0x0091: PHI (r8v1 java.lang.Object) = (r8v7 java.lang.Object), (r8v10 java.lang.Object) binds: [B:18:0x008d, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d2 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:8:0x0035, B:63:0x01bd, B:64:0x01c4, B:26:0x00c4, B:28:0x00d2, B:29:0x00d7, B:31:0x00e1, B:33:0x00ed, B:35:0x0109, B:37:0x010f, B:39:0x0115, B:41:0x0121, B:43:0x0127, B:45:0x012d, B:47:0x013e, B:48:0x014a, B:50:0x0156, B:51:0x015d, B:53:0x0167, B:54:0x0173, B:56:0x017f, B:57:0x0186, B:62:0x01b6), top: B:70:0x0035 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01d2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d0 -> B:64:0x01c4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00df -> B:63:0x01bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01b3 -> B:61:0x01b4). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 469
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27091j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27092k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f27093l;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return f.this.new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            if (r4.q(r8, r7) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0067 -> B:7:0x0019). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r7.f27093l
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f27092k
                Q4.X r1 = (Q4.Task) r1
                java.lang.Object r1 = r7.f27091j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r8)
            L19:
                r8 = r1
                goto L38
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L23:
                java.lang.Object r1 = r7.f27091j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r8)
                goto L49
            L2b:
                fc.AbstractC4036s.b(r8)
                com.bbflight.background_downloader.f r8 = com.bbflight.background_downloader.f.this
                Td.g r8 = com.bbflight.background_downloader.f.i(r8)
                Td.i r8 = r8.iterator()
            L38:
                r7.f27091j = r8
                r1 = 0
                r7.f27092k = r1
                r7.f27093l = r3
                java.lang.Object r1 = r8.a(r7)
                if (r1 != r0) goto L46
                goto L69
            L46:
                r6 = r1
                r1 = r8
                r8 = r6
            L49:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6a
                java.lang.Object r8 = r1.next()
                Q4.X r8 = (Q4.Task) r8
                com.bbflight.background_downloader.f r4 = com.bbflight.background_downloader.f.this
                r7.f27091j = r1
                java.lang.Object r5 = nc.l.a(r8)
                r7.f27092k = r5
                r7.f27093l = r2
                java.lang.Object r8 = com.bbflight.background_downloader.f.c(r4, r8, r7)
                if (r8 != r0) goto L19
            L69:
                return r0
            L6a:
                fc.H r7 = fc.C4015H.f34254a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27095j;

        public c(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return f.this.new c(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f27095j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                f fVar = f.this;
                this.f27095j = 1;
                if (fVar.n(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27097j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27098k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f27099l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f27100m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f27102o;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27100m = obj;
            this.f27102o |= Integer.MIN_VALUE;
            return f.this.j(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27103j;

        public e(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return f.this.new e(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f27103j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                this.f27103j = 1;
                if (X.a(10000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            f.this.k();
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0348f extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27105j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f27106k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f27107l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f27109n;

        public C0348f(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27107l = obj;
            this.f27109n |= Integer.MIN_VALUE;
            return f.this.n(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27110j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27111k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27112l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f27113m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f27115o;

        public g(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27113m = obj;
            this.f27115o |= Integer.MIN_VALUE;
            return f.this.o(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27116j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27117k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27118l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27119m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27120n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27121o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f27122p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f27123q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f27124r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f27125s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f27126t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f27128v;

        public h(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27126t = obj;
            this.f27128v |= Integer.MIN_VALUE;
            return f.this.p(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27129j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27130k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27131l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27132m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f27133n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f27134o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f27136q;

        public i(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27134o = obj;
            this.f27136q |= Integer.MIN_VALUE;
            return f.this.q(null, this);
        }
    }

    public f(Context context, M workManager) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(workManager, "workManager");
        this.f27063a = context;
        this.f27064b = workManager;
        this.f27065c = ImageMetadata.SHADING_MODE;
        this.f27066d = ImageMetadata.SHADING_MODE;
        this.f27067e = ImageMetadata.SHADING_MODE;
        this.f27068f = new ConcurrentHashMap();
        this.f27069g = new ArrayList();
        this.f27070h = new AtomicInteger(0);
        this.f27071i = new ConcurrentHashMap();
        this.f27072j = new ConcurrentHashMap();
        this.f27073k = new PriorityBlockingQueue();
        this.f27074l = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);
        Rd.M mA = N.a(C2123d0.a());
        this.f27076n = mA;
        this.f27077o = Td.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f27078p = AbstractC2693g.b(false, 1, null);
        AbstractC2132i.d(mA, null, null, new a(null), 3, null);
        AbstractC2132i.d(mA, null, null, new b(null), 3, null);
        AbstractC2132i.d(mA, null, null, new c(null), 3, null);
    }

    public final Object A(Task task, InterfaceC4988e interfaceC4988e) {
        Object objP = this.f27074l.p(task, interfaceC4988e);
        return objP == C5046c.f() ? objP : C4015H.f34254a;
    }

    public final Task B(String taskId) {
        AbstractC4862t.e(taskId, "taskId");
        PriorityBlockingQueue priorityBlockingQueue = this.f27073k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : priorityBlockingQueue) {
            if (AbstractC4862t.a(((com.bbflight.background_downloader.d) obj).x().getTaskId(), taskId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.bbflight.background_downloader.d) it.next()).x());
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return (Task) C4179C.h0(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(com.bbflight.background_downloader.d r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.bbflight.background_downloader.f.d
            if (r0 == 0) goto L13
            r0 = r7
            com.bbflight.background_downloader.f$d r0 = (com.bbflight.background_downloader.f.d) r0
            int r1 = r0.f27102o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27102o = r1
            goto L18
        L13:
            com.bbflight.background_downloader.f$d r0 = new com.bbflight.background_downloader.f$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27100m
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f27102o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f27098k
            ae.a r6 = (ae.InterfaceC2687a) r6
            java.lang.Object r0 = r0.f27097j
            com.bbflight.background_downloader.d r0 = (com.bbflight.background_downloader.d) r0
            fc.AbstractC4036s.b(r7)
            r7 = r6
            r6 = r0
            goto L51
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            fc.AbstractC4036s.b(r7)
            ae.a r7 = r5.f27078p
            r0.f27097j = r6
            r0.f27098k = r7
            r2 = 0
            r0.f27099l = r2
            r0.f27102o = r3
            java.lang.Object r0 = r7.a(r4, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            java.util.concurrent.PriorityBlockingQueue r0 = r5.f27073k     // Catch: java.lang.Throwable -> L73
            r0.add(r6)     // Catch: java.lang.Throwable -> L73
            java.util.List r0 = r5.f27069g     // Catch: java.lang.Throwable -> L73
            Q4.X r1 = r6.x()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r1.getTaskId()     // Catch: java.lang.Throwable -> L73
            r0.add(r1)     // Catch: java.lang.Throwable -> L73
            com.bbflight.background_downloader.g r0 = com.bbflight.background_downloader.g.f27137a     // Catch: java.lang.Throwable -> L73
            r0.s(r6, r3)     // Catch: java.lang.Throwable -> L73
            fc.H r6 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L73
            r7.h(r4)
            r5.k()
            fc.H r5 = fc.C4015H.f34254a
            return r5
        L73:
            r5 = move-exception
            r7.h(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.f.j(com.bbflight.background_downloader.d, lc.e):java.lang.Object");
    }

    public final void k() {
        this.f27077o.n(C4015H.f34254a);
        if (this.f27073k.isEmpty()) {
            return;
        }
        l();
    }

    public final void l() {
        InterfaceC2166z0 interfaceC2166z0 = this.f27075m;
        if (interfaceC2166z0 != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        this.f27075m = AbstractC2132i.d(this.f27076n, null, null, new e(null), 3, null);
    }

    public final List m(String str) {
        PriorityBlockingQueue priorityBlockingQueue = this.f27073k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : priorityBlockingQueue) {
            com.bbflight.background_downloader.d dVar = (com.bbflight.background_downloader.d) obj;
            if (str == null || AbstractC4862t.a(dVar.x().getGroup(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.bbflight.background_downloader.d) it.next()).x());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(lc.InterfaceC4988e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.f.n(lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(android.content.Context r7, java.lang.String r8, lc.InterfaceC4988e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.bbflight.background_downloader.f.g
            if (r0 == 0) goto L13
            r0 = r9
            com.bbflight.background_downloader.f$g r0 = (com.bbflight.background_downloader.f.g) r0
            int r1 = r0.f27115o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27115o = r1
            goto L18
        L13:
            com.bbflight.background_downloader.f$g r0 = new com.bbflight.background_downloader.f$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27113m
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f27115o
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f27112l
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f27111k
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f27110j
            android.content.Context r7 = (android.content.Context) r7
            fc.AbstractC4036s.b(r9)
            goto Lae
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            fc.AbstractC4036s.b(r9)
            java.util.concurrent.PriorityBlockingQueue r9 = r6.f27073k
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4c:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r9.next()
            r5 = r4
            com.bbflight.background_downloader.d r5 = (com.bbflight.background_downloader.d) r5
            Q4.X r5 = r5.x()
            java.lang.String r5 = r5.getGroup()
            boolean r5 = kotlin.jvm.internal.AbstractC4862t.a(r5, r8)
            if (r5 == 0) goto L4c
            r2.add(r4)
            goto L4c
        L6b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r4 = 10
            int r4 = gc.C4207u.v(r2, r4)
            r9.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L7a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L92
            java.lang.Object r4 = r2.next()
            com.bbflight.background_downloader.d r4 = (com.bbflight.background_downloader.d) r4
            Q4.X r4 = r4.x()
            java.lang.String r4 = r4.getTaskId()
            r9.add(r4)
            goto L7a
        L92:
            java.util.List r9 = gc.C4179C.X0(r9)
            java.lang.Object r2 = nc.l.a(r7)
            r0.f27110j = r2
            java.lang.Object r8 = nc.l.a(r8)
            r0.f27111k = r8
            r0.f27112l = r9
            r0.f27115o = r3
            java.lang.Object r6 = r6.p(r7, r9, r0)
            if (r6 != r1) goto Lad
            return r1
        Lad:
            r6 = r9
        Lae:
            int r6 = r6.size()
            java.lang.Integer r6 = nc.AbstractC5158b.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.f.o(android.content.Context, java.lang.String, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0111 -> B:27:0x011b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(android.content.Context r26, java.lang.Iterable r27, lc.InterfaceC4988e r28) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.f.p(android.content.Context, java.lang.Iterable, lc.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(Q4.Task r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.bbflight.background_downloader.f.i
            if (r0 == 0) goto L13
            r0 = r8
            com.bbflight.background_downloader.f$i r0 = (com.bbflight.background_downloader.f.i) r0
            int r1 = r0.f27136q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27136q = r1
            goto L18
        L13:
            com.bbflight.background_downloader.f$i r0 = new com.bbflight.background_downloader.f$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27134o
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f27136q
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f27132m
            ae.a r7 = (ae.InterfaceC2687a) r7
            java.lang.Object r1 = r0.f27131l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f27130k
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.f27129j
            Q4.X r0 = (Q4.Task) r0
            fc.AbstractC4036s.b(r8)
            goto L7b
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            fc.AbstractC4036s.b(r8)
            java.util.concurrent.ConcurrentHashMap r8 = r6.f27068f
            java.lang.String r2 = r7.getTaskId()
            r8.remove(r2)
            java.util.List r8 = r6.f27069g
            java.lang.String r2 = r7.getTaskId()
            r8.remove(r2)
            java.lang.String r2 = r7.P()
            java.lang.String r8 = r7.getGroup()
            ae.a r5 = r6.f27078p
            java.lang.Object r7 = nc.l.a(r7)
            r0.f27129j = r7
            r0.f27130k = r2
            r0.f27131l = r8
            r0.f27132m = r5
            r7 = 0
            r0.f27133n = r7
            r0.f27136q = r3
            java.lang.Object r7 = r5.a(r4, r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            r1 = r8
            r7 = r5
        L7b:
            java.util.concurrent.atomic.AtomicInteger r8 = r6.f27070h     // Catch: java.lang.Throwable -> L92
            r8.decrementAndGet()     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.ConcurrentHashMap r8 = r6.f27071i     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = r8.get(r2)     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.atomic.AtomicInteger r8 = (java.util.concurrent.atomic.AtomicInteger) r8     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L94
            int r8 = r8.decrementAndGet()     // Catch: java.lang.Throwable -> L92
            nc.AbstractC5158b.c(r8)     // Catch: java.lang.Throwable -> L92
            goto L94
        L92:
            r6 = move-exception
            goto Lae
        L94:
            java.util.concurrent.ConcurrentHashMap r8 = r6.f27072j     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.atomic.AtomicInteger r8 = (java.util.concurrent.atomic.AtomicInteger) r8     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto La5
            int r8 = r8.decrementAndGet()     // Catch: java.lang.Throwable -> L92
            nc.AbstractC5158b.c(r8)     // Catch: java.lang.Throwable -> L92
        La5:
            r7.h(r4)
            r6.k()
            fc.H r6 = fc.C4015H.f34254a
            return r6
        Lae:
            r7.h(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.f.q(Q4.X, lc.e):java.lang.Object");
    }

    public final List r() {
        return this.f27069g;
    }

    public final ConcurrentHashMap s() {
        return this.f27068f;
    }

    public final int t() {
        return this.f27065c;
    }

    public final int u() {
        return this.f27067e;
    }

    public final int v() {
        return this.f27066d;
    }

    public final InterfaceC2687a w() {
        return this.f27078p;
    }

    public final void x(int i10) {
        this.f27065c = i10;
    }

    public final void y(int i10) {
        this.f27067e = i10;
    }

    public final void z(int i10) {
        this.f27066d = i10;
    }
}
