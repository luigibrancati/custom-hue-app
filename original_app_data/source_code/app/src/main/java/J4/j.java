package J4;

import Od.F;
import Rd.AbstractC2132i;
import Rd.I;
import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements K4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J4.h f6161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F4.b f6162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4.b f6163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f6164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f6165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A4.a f6166f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6167j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f6169l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6169l = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new a(this.f6169l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6167j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            j.this.f6161a.f(this.f6169l);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6170j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f6172l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6172l = obj;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new b(this.f6172l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6170j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            j.this.f6161a.j((String) this.f6172l);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6173j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f6175l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List f6176m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f6177n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List list, List list2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6175l = str;
            this.f6176m = list;
            this.f6177n = list2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new c(this.f6175l, this.f6176m, this.f6177n, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6173j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            A4.a aVar = j.this.f6166f;
            if (aVar != null) {
                aVar.a("--> remove file: " + C4179C.N0(F.I0(this.f6175l, new String[]{"-"}, false, 0, 6, null), 2) + ", dropped events: " + this.f6176m.size() + ", retry events: " + this.f6177n.size());
            }
            j.this.f6161a.f(this.f6175l);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6178j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f6180l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6180l = obj;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new d(this.f6180l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6178j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            J4.h hVar = j.this.f6161a;
            Object obj2 = this.f6180l;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            hVar.j((String) obj2);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6181j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f6183l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6183l = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new e(this.f6183l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6181j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            j.this.f6161a.f(this.f6183l);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6184j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f6186l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ JSONArray f6187m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, JSONArray jSONArray, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6186l = str;
            this.f6187m = jSONArray;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new f(this.f6186l, this.f6187m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6184j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            j.this.f6161a.g(this.f6186l, this.f6187m);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6188j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f6190l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6190l = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new g(this.f6190l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((g) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6188j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            j.this.f6161a.f(this.f6190l);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6191j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f6193l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6193l = obj;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new h(this.f6193l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((h) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6191j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            J4.h hVar = j.this.f6161a;
            Object obj2 = this.f6193l;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            hVar.j((String) obj2);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6194j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f6196l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6196l = obj;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new i(this.f6196l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((i) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6194j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            J4.h hVar = j.this.f6161a;
            Object obj2 = this.f6196l;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
            hVar.j((String) obj2);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: J4.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0103j extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6197j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f6199l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0103j(String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6199l = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new C0103j(this.f6199l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C0103j) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6197j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            j.this.f6161a.f(this.f6199l);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6200j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Od.k f6202l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Od.k kVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6202l = kVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new k(this.f6202l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((k) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6200j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            j.this.f6161a.e((String) this.f6202l.b().get(1));
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class l extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6203j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f6205l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ E4.a f6206m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f6207n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f6208o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, E4.a aVar, int i10, String str2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6205l = str;
            this.f6206m = aVar;
            this.f6207n = i10;
            this.f6208o = str2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return j.this.new l(this.f6205l, this.f6206m, this.f6207n, this.f6208o, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((l) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f6203j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            vc.q qVarH = j.this.f6161a.h(this.f6205l);
            if (qVarH != null) {
                E4.a aVar = this.f6206m;
                int i10 = this.f6207n;
                String str = this.f6208o;
                j jVar = j.this;
                String str2 = this.f6205l;
                qVarH.invoke(aVar, AbstractC5158b.c(i10), str);
                jVar.f6161a.e(str2);
            }
            return C4015H.f34254a;
        }
    }

    public j(J4.h storage, F4.b eventPipeline, D4.b configuration, M scope, I storageDispatcher, A4.a aVar) {
        AbstractC4862t.e(storage, "storage");
        AbstractC4862t.e(eventPipeline, "eventPipeline");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(storageDispatcher, "storageDispatcher");
        this.f6161a = storage;
        this.f6162b = eventPipeline;
        this.f6163c = configuration;
        this.f6164d = scope;
        this.f6165e = storageDispatcher;
        this.f6166f = aVar;
    }

    @Override // K4.i
    public void a(K4.k timeoutResponse, Object events, String eventsString) {
        AbstractC4862t.e(timeoutResponse, "timeoutResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        A4.a aVar = this.f6166f;
        if (aVar != null) {
            aVar.a("Handle response, status: " + timeoutResponse.a());
        }
        AbstractC2132i.d(this.f6164d, this.f6165e, null, new h(events, null), 2, null);
    }

    @Override // K4.i
    public boolean b(K4.c badRequestResponse, Object events, String eventsString) throws JSONException {
        AbstractC4862t.e(badRequestResponse, "badRequestResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        A4.a aVar = this.f6166f;
        if (aVar != null) {
            aVar.a("Handle response, status: " + badRequestResponse.a() + ", error: " + badRequestResponse.b());
        }
        String str = (String) events;
        List listH = p.h(j(eventsString, str));
        if (badRequestResponse.e()) {
            l(listH, K4.g.BAD_REQUEST.j(), badRequestResponse.b());
            AbstractC2132i.d(this.f6164d, this.f6165e, null, new a(str, null), 2, null);
            return false;
        }
        Set setC = badRequestResponse.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (Object obj : listH) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            E4.a aVar2 = (E4.a) obj;
            if (setC.contains(Integer.valueOf(i10)) || badRequestResponse.d(aVar2)) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
            i10 = i11;
        }
        if (arrayList.isEmpty()) {
            AbstractC2132i.d(this.f6164d, this.f6165e, null, new b(events, null), 2, null);
            return true;
        }
        l(arrayList, K4.g.BAD_REQUEST.j(), badRequestResponse.b());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f6162b.s((E4.a) it.next());
        }
        AbstractC2132i.d(this.f6164d, this.f6165e, null, new c(str, arrayList, arrayList2, null), 2, null);
        return false;
    }

    @Override // K4.i
    public void c(K4.l tooManyRequestsResponse, Object events, String eventsString) {
        AbstractC4862t.e(tooManyRequestsResponse, "tooManyRequestsResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        A4.a aVar = this.f6166f;
        if (aVar != null) {
            aVar.a("Handle response, status: " + tooManyRequestsResponse.a() + ", error: " + tooManyRequestsResponse.b());
        }
        AbstractC2132i.d(this.f6164d, this.f6165e, null, new i(events, null), 2, null);
    }

    @Override // K4.i
    public void d(K4.d failedResponse, Object events, String eventsString) {
        AbstractC4862t.e(failedResponse, "failedResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        A4.a aVar = this.f6166f;
        if (aVar != null) {
            aVar.a("Handle response, status: " + failedResponse.a() + ", error: " + failedResponse.b());
        }
        AbstractC2132i.d(this.f6164d, this.f6165e, null, new d(events, null), 2, null);
    }

    @Override // K4.i
    public void f(K4.h payloadTooLargeResponse, Object events, String eventsString) throws JSONException {
        AbstractC4862t.e(payloadTooLargeResponse, "payloadTooLargeResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        A4.a aVar = this.f6166f;
        if (aVar != null) {
            aVar.a("Handle response, status: " + payloadTooLargeResponse.a() + ", error: " + payloadTooLargeResponse.b());
        }
        String str = (String) events;
        JSONArray jSONArrayJ = j(eventsString, str);
        if (jSONArrayJ.length() != 1) {
            AbstractC2132i.d(this.f6164d, this.f6165e, null, new f(str, jSONArrayJ, null), 2, null);
        } else {
            l(p.h(jSONArrayJ), K4.g.PAYLOAD_TOO_LARGE.j(), payloadTooLargeResponse.b());
            AbstractC2132i.d(this.f6164d, this.f6165e, null, new e(str, null), 2, null);
        }
    }

    @Override // K4.i
    public void g(K4.j successResponse, Object events, String eventsString) {
        AbstractC4862t.e(successResponse, "successResponse");
        AbstractC4862t.e(events, "events");
        AbstractC4862t.e(eventsString, "eventsString");
        String str = (String) events;
        A4.a aVar = this.f6166f;
        if (aVar != null) {
            aVar.a("Handle response, status: " + successResponse.a());
        }
        l(p.h(j(eventsString, str)), K4.g.SUCCESS.j(), "Event sent success.");
        AbstractC2132i.d(this.f6164d, this.f6165e, null, new g(str, null), 2, null);
    }

    public final JSONArray j(String str, String str2) throws JSONException {
        try {
            return new JSONArray(str);
        } catch (JSONException e10) {
            AbstractC2132i.d(this.f6164d, this.f6165e, null, new C0103j(str2, null), 2, null);
            k(str);
            throw e10;
        }
    }

    public final void k(String str) {
        Iterator it = Od.o.f(new Od.o("\"insert_id\":\"(.{36})\","), str, 0, 2, null).iterator();
        while (it.hasNext()) {
            AbstractC2132i.d(this.f6164d, this.f6165e, null, new k((Od.k) it.next(), null), 2, null);
        }
    }

    public final void l(List list, int i10, String str) {
        j jVar;
        int i11;
        String str2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E4.a aVar = (E4.a) it.next();
            vc.q qVarC = this.f6163c.c();
            if (qVarC != null) {
                qVarC.invoke(aVar, Integer.valueOf(i10), str);
            }
            String strU = aVar.u();
            if (strU != null) {
                jVar = this;
                int i12 = i10;
                String str3 = str;
                i11 = i12;
                str2 = str3;
                AbstractC2132i.d(this.f6164d, this.f6165e, null, jVar.new l(strU, aVar, i12, str3, null), 2, null);
            } else {
                jVar = this;
                i11 = i10;
                str2 = str;
            }
            str = str2;
            i10 = i11;
            this = jVar;
        }
    }
}
