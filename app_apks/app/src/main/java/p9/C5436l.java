package p9;

import Rd.AbstractC2132i;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import fc.C4015H;
import h8.C4288f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: p9.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5436l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f42478c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4288f f42479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s9.j f42480b;

    /* JADX INFO: renamed from: p9.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f42481j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Q f42483l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q q10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f42483l = q10;
        }

        public static final void f(Q q10, String str, h8.n nVar) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            q10.a();
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C5436l.this.new a(this.f42483l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        
            if (r6.f(r5) == r0) goto L25;
         */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r5.f42481j
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                fc.AbstractC4036s.b(r6)
                goto L62
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1c:
                fc.AbstractC4036s.b(r6)
                goto L2e
            L20:
                fc.AbstractC4036s.b(r6)
                q9.b r6 = q9.C5509b.f43313a
                r5.f42481j = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                goto L61
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                if (r6 == 0) goto L3d
                boolean r1 = r6.isEmpty()
                if (r1 == 0) goto L3d
                goto L8b
            L3d:
                java.util.Iterator r6 = r6.iterator()
            L41:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L8b
                java.lang.Object r1 = r6.next()
                q9.c r1 = (q9.InterfaceC5510c) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L41
                p9.l r6 = p9.C5436l.this
                s9.j r6 = p9.C5436l.b(r6)
                r5.f42481j = r3
                java.lang.Object r6 = r6.f(r5)
                if (r6 != r0) goto L62
            L61:
                return r0
            L62:
                p9.l r6 = p9.C5436l.this
                s9.j r6 = p9.C5436l.b(r6)
                boolean r6 = r6.c()
                if (r6 != 0) goto L78
                java.lang.String r5 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r5 = android.util.Log.d(r2, r5)
                nc.AbstractC5158b.c(r5)
                goto L94
            L78:
                p9.l r6 = p9.C5436l.this
                h8.f r6 = p9.C5436l.a(r6)
                p9.Q r5 = r5.f42483l
                p9.k r0 = new p9.k
                r0.<init>()
                r6.h(r0)
                fc.H r5 = fc.C4015H.f34254a
                goto L94
            L8b:
                java.lang.String r5 = "No Sessions subscribers. Not listening to lifecycle events."
                int r5 = android.util.Log.d(r2, r5)
                nc.AbstractC5158b.c(r5)
            L94:
                fc.H r5 = fc.C4015H.f34254a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.C5436l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: p9.l$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    public C5436l(C4288f firebaseApp, s9.j settings, InterfaceC4992i backgroundDispatcher, Q sessionsActivityLifecycleCallbacks) {
        AbstractC4862t.e(firebaseApp, "firebaseApp");
        AbstractC4862t.e(settings, "settings");
        AbstractC4862t.e(backgroundDispatcher, "backgroundDispatcher");
        AbstractC4862t.e(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f42479a = firebaseApp;
        this.f42480b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.3.");
        Context applicationContext = firebaseApp.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            AbstractC2132i.d(Rd.N.a(backgroundDispatcher), null, null, new a(sessionsActivityLifecycleCallbacks, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
