package androidx.room;

import Rd.M;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import android.content.Context;
import android.content.Intent;
import b3.C2808g;
import b3.I;
import b3.t;
import d3.q;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4034q;
import g3.C4132b;
import gc.C4179C;
import gc.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0315a f24594o = new C0315a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f24595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f24596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f24597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f24598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f24599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f24600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f24601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C4132b f24602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC6082a f24603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC6082a f24604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2808g f24605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Intent f24606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MultiInstanceInvalidationClient f24607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f24608n;

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0315a {
        public /* synthetic */ C0315a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0315a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f24609a;

        public b(String[] tables) {
            AbstractC4862t.e(tables, "tables");
            this.f24609a = tables;
        }

        public final String[] a() {
            return this.f24609a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c extends AbstractC4860q implements l {
        public c(Object obj) {
            super(1, obj, a.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }

        public final void i(Set p02) {
            AbstractC4862t.e(p02, "p0");
            ((a) this.receiver).p(p02);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Set) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f24610j;

        public d(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new d(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f24610j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                I i11 = a.this.f24599e;
                this.f24610j = 1;
                if (i11.x(this) == objF) {
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
    public /* synthetic */ class e extends AbstractC4860q implements InterfaceC6082a {
        public e(Object obj) {
            super(0, obj, a.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        }

        public final void i() {
            ((a) this.receiver).r();
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            i();
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f24612j;

        public f(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new f(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f24612j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                a aVar = a.this;
                this.f24612j = 1;
                if (aVar.A(this) == objF) {
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

    public a(t database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        AbstractC4862t.e(database, "database");
        AbstractC4862t.e(shadowTablesMap, "shadowTablesMap");
        AbstractC4862t.e(viewTables, "viewTables");
        AbstractC4862t.e(tableNames, "tableNames");
        this.f24595a = database;
        this.f24596b = shadowTablesMap;
        this.f24597c = viewTables;
        this.f24598d = tableNames;
        I i10 = new I(database, shadowTablesMap, viewTables, tableNames, database.D(), new c(this));
        this.f24599e = i10;
        this.f24600f = new LinkedHashMap();
        this.f24601g = new ReentrantLock();
        this.f24603i = new InterfaceC6082a() { // from class: b3.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return androidx.room.a.t(this.f25181a);
            }
        };
        this.f24604j = new InterfaceC6082a() { // from class: b3.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return androidx.room.a.s(this.f25182a);
            }
        };
        this.f24605k = new C2808g(database);
        this.f24608n = new Object();
        i10.u(new InterfaceC6082a() { // from class: b3.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(androidx.room.a.d(this.f25183a));
            }
        });
    }

    public static final boolean d(a aVar) {
        return !aVar.f24595a.E() || aVar.f24595a.L();
    }

    public static final C4015H s(a aVar) {
        C4132b c4132b = aVar.f24602h;
        if (c4132b != null) {
            c4132b.g();
        }
        return C4015H.f34254a;
    }

    public static final C4015H t(a aVar) {
        C4132b c4132b = aVar.f24602h;
        if (c4132b != null) {
            c4132b.j();
        }
        return C4015H.f34254a;
    }

    public final Object A(InterfaceC4988e interfaceC4988e) throws Throwable {
        if (this.f24595a.E() && !this.f24595a.L()) {
            return C4015H.f34254a;
        }
        Object objX = this.f24599e.x(interfaceC4988e);
        return objX == C5046c.f() ? objX : C4015H.f34254a;
    }

    public final void B() {
        q.a(new f(null));
    }

    public final boolean h(b bVar) {
        C4034q c4034qY = this.f24599e.y(bVar.a());
        String[] strArr = (String[]) c4034qY.a();
        int[] iArr = (int[]) c4034qY.b();
        androidx.room.b bVar2 = new androidx.room.b(bVar, iArr, strArr);
        ReentrantLock reentrantLock = this.f24601g;
        reentrantLock.lock();
        try {
            androidx.room.b bVar3 = this.f24600f.containsKey(bVar) ? (androidx.room.b) Q.j(this.f24600f, bVar) : (androidx.room.b) this.f24600f.put(bVar, bVar2);
            reentrantLock.unlock();
            return bVar3 == null && this.f24599e.p(iArr);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void i(b observer) {
        AbstractC4862t.e(observer, "observer");
        if (!observer.b()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        h(observer);
    }

    public final InterfaceC2313e j(String[] tables, boolean z10) {
        AbstractC4862t.e(tables, "tables");
        C4034q c4034qY = this.f24599e.y(tables);
        String[] strArr = (String[]) c4034qY.a();
        InterfaceC2313e interfaceC2313eM = this.f24599e.m(strArr, (int[]) c4034qY.b(), z10);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f24607m;
        InterfaceC2313e interfaceC2313eH = multiInstanceInvalidationClient != null ? multiInstanceInvalidationClient.h(strArr) : null;
        return interfaceC2313eH != null ? AbstractC2315g.x(interfaceC2313eM, interfaceC2313eH) : interfaceC2313eM;
    }

    public final List k() {
        ReentrantLock reentrantLock = this.f24601g;
        reentrantLock.lock();
        try {
            return C4179C.V0(this.f24600f.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final t l() {
        return this.f24595a;
    }

    public final String[] m() {
        return this.f24598d;
    }

    public final void n(Context context, String name, Intent serviceIntent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(serviceIntent, "serviceIntent");
        this.f24606l = serviceIntent;
        this.f24607m = new MultiInstanceInvalidationClient(context, name, this);
    }

    public final void o(InterfaceC4792b connection) {
        AbstractC4862t.e(connection, "connection");
        this.f24599e.l(connection);
        synchronized (this.f24608n) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f24607m;
                if (multiInstanceInvalidationClient != null) {
                    Intent intent = this.f24606l;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    multiInstanceInvalidationClient.k(intent);
                    C4015H c4015h = C4015H.f34254a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(Set set) {
        ReentrantLock reentrantLock = this.f24601g;
        reentrantLock.lock();
        try {
            List listV0 = C4179C.V0(this.f24600f.values());
            reentrantLock.unlock();
            Iterator it = listV0.iterator();
            while (it.hasNext()) {
                ((androidx.room.b) it.next()).c(set);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void q(Set tables) {
        AbstractC4862t.e(tables, "tables");
        ReentrantLock reentrantLock = this.f24601g;
        reentrantLock.lock();
        try {
            List<androidx.room.b> listV0 = C4179C.V0(this.f24600f.values());
            reentrantLock.unlock();
            for (androidx.room.b bVar : listV0) {
                if (!bVar.a().b()) {
                    bVar.d(tables);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void r() {
        synchronized (this.f24608n) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f24607m;
                if (multiInstanceInvalidationClient != null) {
                    List listK = k();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listK) {
                        if (!((b) obj).b()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        multiInstanceInvalidationClient.l();
                    }
                }
                this.f24599e.s();
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        this.f24599e.r(this.f24603i, this.f24604j);
    }

    public void v() {
        this.f24599e.r(this.f24603i, this.f24604j);
    }

    public void w(b observer) {
        AbstractC4862t.e(observer, "observer");
        if (x(observer)) {
            q.a(new d(null));
        }
    }

    public final boolean x(b bVar) {
        ReentrantLock reentrantLock = this.f24601g;
        reentrantLock.lock();
        try {
            androidx.room.b bVar2 = (androidx.room.b) this.f24600f.remove(bVar);
            return bVar2 != null && this.f24599e.q(bVar2.b());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void y(C4132b autoCloser) {
        AbstractC4862t.e(autoCloser, "autoCloser");
        this.f24602h = autoCloser;
        autoCloser.m(new e(this));
    }

    public final void z() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f24607m;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.l();
        }
    }
}
