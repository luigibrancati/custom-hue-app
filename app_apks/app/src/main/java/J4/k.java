package J4;

import Rd.AbstractC2132i;
import Rd.I;
import Rd.M;
import Rd.X;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4206t;
import io.sentry.TransactionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k implements K4.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6209e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F4.b f6210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D4.b f6211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f6212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f6213d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f6214j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f6215k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f6216l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6217m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f6219o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6219o = list;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return k.this.new b(this.f6219o, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:14:0x005b). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r7.f6217m
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f6216l
                E4.a r1 = (E4.a) r1
                java.lang.Object r3 = r7.f6215k
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.f6214j
                J4.k r4 = (J4.k) r4
                fc.AbstractC4036s.b(r8)
                goto L5b
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L23:
                fc.AbstractC4036s.b(r8)
                J4.k r8 = J4.k.this
                F4.b r8 = J4.k.h(r8)
                java.util.concurrent.atomic.AtomicInteger r8 = r8.q()
                r8.incrementAndGet()
                java.util.List r8 = r7.f6219o
                J4.k r1 = J4.k.this
                java.util.Iterator r8 = r8.iterator()
                r3 = r8
                r4 = r1
            L3d:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L63
                java.lang.Object r8 = r3.next()
                r1 = r8
                E4.a r1 = (E4.a) r1
                r7.f6214j = r4
                r7.f6215k = r3
                r7.f6216l = r1
                r7.f6217m = r2
                r5 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r8 = Rd.X.a(r5, r7)
                if (r8 != r0) goto L5b
                return r0
            L5b:
                F4.b r8 = J4.k.h(r4)
                r8.s(r1)
                goto L3d
            L63:
                fc.H r7 = fc.C4015H.f34254a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: J4.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6220j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f6221k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f6222l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, k kVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6221k = list;
            this.f6222l = kVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new c(this.f6221k, this.f6222l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f6220j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                this.f6220j = 1;
                if (X.a(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            List list = this.f6221k;
            k kVar = this.f6222l;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.f6210a.s((E4.a) it.next());
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6223j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f6224k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f6225l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, k kVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6224k = list;
            this.f6225l = kVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new d(this.f6224k, this.f6225l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f6223j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                this.f6223j = 1;
                if (X.a(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            List list = this.f6224k;
            k kVar = this.f6225l;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.f6210a.s((E4.a) it.next());
            }
            return C4015H.f34254a;
        }
    }

    public k(F4.b eventPipeline, D4.b configuration, M scope, I storageDispatcher) {
        AbstractC4862t.e(eventPipeline, "eventPipeline");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(storageDispatcher, "storageDispatcher");
        this.f6210a = eventPipeline;
        this.f6211b = configuration;
        this.f6212c = scope;
        this.f6213d = storageDispatcher;
    }

    private final void i(List list, int i10, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E4.a aVar = (E4.a) it.next();
            vc.q qVarC = this.f6211b.c();
            if (qVarC != null) {
                qVarC.invoke(aVar, Integer.valueOf(i10), str);
            }
            vc.q qVarF = aVar.f();
            if (qVarF != null) {
                qVarF.invoke(aVar, Integer.valueOf(i10), str);
            }
        }
    }

    @Override // K4.i
    public void a(K4.k timeoutResponse, Object events, String eventsString) {
        AbstractC4862t.e(timeoutResponse, "timeoutResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        AbstractC2132i.d(this.f6212c, this.f6213d, null, new c((List) events, this, null), 2, null);
    }

    @Override // K4.i
    public boolean b(K4.c badRequestResponse, Object events, String eventsString) {
        AbstractC4862t.e(badRequestResponse, "badRequestResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        List list = (List) events;
        int i10 = 0;
        if (badRequestResponse.e()) {
            i(list, K4.g.BAD_REQUEST.j(), badRequestResponse.b());
            return false;
        }
        Set setC = badRequestResponse.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            E4.a aVar = (E4.a) obj;
            if (setC.contains(Integer.valueOf(i10)) || badRequestResponse.d(aVar)) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
            i10 = i11;
        }
        i(arrayList, K4.g.BAD_REQUEST.j(), badRequestResponse.b());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f6210a.s((E4.a) it.next());
        }
        return arrayList.isEmpty();
    }

    @Override // K4.i
    public void c(K4.l tooManyRequestsResponse, Object events, String eventsString) {
        AbstractC4862t.e(tooManyRequestsResponse, "tooManyRequestsResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        for (Object obj : (List) events) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            E4.a aVar = (E4.a) obj;
            if (tooManyRequestsResponse.d(aVar)) {
                arrayList.add(aVar);
            } else if (tooManyRequestsResponse.c().contains(Integer.valueOf(i10))) {
                arrayList3.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
            i10 = i11;
        }
        i(arrayList, K4.g.TOO_MANY_REQUESTS.j(), tooManyRequestsResponse.b());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f6210a.s((E4.a) it.next());
        }
        AbstractC2132i.d(this.f6212c, this.f6213d, null, new d(arrayList3, this, null), 2, null);
    }

    @Override // K4.i
    public void d(K4.d failedResponse, Object events, String eventsString) {
        AbstractC4862t.e(failedResponse, "failedResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (E4.a aVar : (List) events) {
            if (aVar.e() >= this.f6211b.e()) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        i(arrayList, K4.g.FAILED.j(), failedResponse.b());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f6210a.s((E4.a) it.next());
        }
    }

    @Override // K4.i
    public void f(K4.h payloadTooLargeResponse, Object events, String eventsString) {
        AbstractC4862t.e(payloadTooLargeResponse, "payloadTooLargeResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        List list = (List) events;
        if (list.size() == 1) {
            i(list, K4.g.PAYLOAD_TOO_LARGE.j(), payloadTooLargeResponse.b());
        } else {
            AbstractC2132i.d(this.f6212c, this.f6213d, null, new b(list, null), 2, null);
        }
    }

    @Override // K4.i
    public void g(K4.j successResponse, Object events, String eventsString) {
        AbstractC4862t.e(successResponse, "successResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        i((List) events, K4.g.SUCCESS.j(), "Event sent success.");
    }
}
