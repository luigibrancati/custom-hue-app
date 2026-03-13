package q9;

import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;
import q9.InterfaceC5510c;

/* JADX INFO: renamed from: q9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5509b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5509b f43313a = new C5509b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f43314b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: q9.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2687a f43315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC5510c f43316b;

        public a(InterfaceC2687a mutex, InterfaceC5510c interfaceC5510c) {
            AbstractC4862t.e(mutex, "mutex");
            this.f43315a = mutex;
            this.f43316b = interfaceC5510c;
        }

        public final InterfaceC2687a a() {
            return this.f43315a;
        }

        public final InterfaceC5510c b() {
            return this.f43316b;
        }

        public final void c(InterfaceC5510c interfaceC5510c) {
            this.f43316b = interfaceC5510c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f43315a, aVar.f43315a) && AbstractC4862t.a(this.f43316b, aVar.f43316b);
        }

        public int hashCode() {
            int iHashCode = this.f43315a.hashCode() * 31;
            InterfaceC5510c interfaceC5510c = this.f43316b;
            return iHashCode + (interfaceC5510c == null ? 0 : interfaceC5510c.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f43315a + ", subscriber=" + this.f43316b + ')';
        }

        public /* synthetic */ a(InterfaceC2687a interfaceC2687a, InterfaceC5510c interfaceC5510c, int i10, AbstractC4854k abstractC4854k) {
            this(interfaceC2687a, (i10 & 2) != 0 ? null : interfaceC5510c);
        }
    }

    /* JADX INFO: renamed from: q9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0577b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f43317j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f43318k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f43319l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f43320m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f43321n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f43322o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f43323p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f43325r;

        public C0577b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f43323p = obj;
            this.f43325r |= Integer.MIN_VALUE;
            return C5509b.this.c(this);
        }
    }

    public static final void a(InterfaceC5510c.a subscriberName) {
        AbstractC4862t.e(subscriberName, "subscriberName");
        Map dependencies = f43314b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("FirebaseSessions", "Dependency " + subscriberName + " already added.");
            return;
        }
        AbstractC4862t.d(dependencies, "dependencies");
        dependencies.put(subscriberName, new a(AbstractC2693g.a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("FirebaseSessions", "Dependency to " + subscriberName + " added.");
    }

    public static final void e(InterfaceC5510c subscriber) {
        AbstractC4862t.e(subscriber, "subscriber");
        InterfaceC5510c.a aVarB = subscriber.b();
        a aVarB2 = f43313a.b(aVarB);
        if (aVarB2.b() != null) {
            Log.d("FirebaseSessions", "Subscriber " + aVarB + " already registered.");
            return;
        }
        aVarB2.c(subscriber);
        Log.d("FirebaseSessions", "Subscriber " + aVarB + " registered.");
        InterfaceC2687a.C0267a.c(aVarB2.a(), null, 1, null);
    }

    public final a b(InterfaceC5510c.a aVar) {
        Map dependencies = f43314b;
        AbstractC4862t.d(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            AbstractC4862t.d(obj, "getOrElse(...)");
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(lc.InterfaceC4988e r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof q9.C5509b.C0577b
            if (r0 == 0) goto L13
            r0 = r10
            q9.b$b r0 = (q9.C5509b.C0577b) r0
            int r1 = r0.f43325r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43325r = r1
            goto L18
        L13:
            q9.b$b r0 = new q9.b$b
            r0.<init>(r10)
        L18:
            java.lang.Object r9 = r0.f43323p
            java.lang.Object r10 = mc.C5046c.f()
            int r1 = r0.f43325r
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L48
            if (r1 != r2) goto L40
            java.lang.Object r1 = r0.f43322o
            java.lang.Object r4 = r0.f43321n
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f43320m
            ae.a r5 = (ae.InterfaceC2687a) r5
            java.lang.Object r6 = r0.f43319l
            q9.c$a r6 = (q9.InterfaceC5510c.a) r6
            java.lang.Object r7 = r0.f43318k
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f43317j
            java.util.Map r8 = (java.util.Map) r8
            fc.AbstractC4036s.b(r9)
            goto La0
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L48:
            fc.AbstractC4036s.b(r9)
            java.util.Map r9 = q9.C5509b.f43314b
            java.lang.String r1 = "dependencies"
            kotlin.jvm.internal.AbstractC4862t.d(r9, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = gc.P.e(r4)
            r1.<init>(r4)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            r7 = r9
            r4 = r1
        L69:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lb3
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            r6 = r5
            q9.c$a r6 = (q9.InterfaceC5510c.a) r6
            java.lang.Object r9 = r9.getValue()
            q9.b$a r9 = (q9.C5509b.a) r9
            ae.a r5 = r9.a()
            r0.f43317j = r4
            r0.f43318k = r7
            r0.f43319l = r6
            r0.f43320m = r5
            r0.f43321n = r4
            r0.f43322o = r1
            r0.f43325r = r2
            java.lang.Object r9 = r5.a(r3, r0)
            if (r9 != r10) goto L9f
            return r10
        L9f:
            r8 = r4
        La0:
            q9.b r9 = q9.C5509b.f43313a     // Catch: java.lang.Throwable -> Lae
            q9.c r9 = r9.d(r6)     // Catch: java.lang.Throwable -> Lae
            r5.h(r3)
            r4.put(r1, r9)
            r4 = r8
            goto L69
        Lae:
            r9 = move-exception
            r5.h(r3)
            throw r9
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.C5509b.c(lc.e):java.lang.Object");
    }

    public final InterfaceC5510c d(InterfaceC5510c.a subscriberName) {
        AbstractC4862t.e(subscriberName, "subscriberName");
        InterfaceC5510c interfaceC5510cB = b(subscriberName).b();
        if (interfaceC5510cB != null) {
            return interfaceC5510cB;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
