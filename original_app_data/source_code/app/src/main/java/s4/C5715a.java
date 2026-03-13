package s4;

import Rd.AbstractC2128g;
import Rd.AbstractC2130h;
import Rd.C2123d0;
import Rd.J0;
import Rd.M;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4034q;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import s4.C5717c;
import vc.p;

/* JADX INFO: renamed from: s4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5715a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5715a f44001a = new C5715a();

    /* JADX INFO: renamed from: s4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0592a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f44002j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ View f44003k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ A4.a f44004l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C4034q f44005m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C5717c.a f44006n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f44007o;

        /* JADX INFO: renamed from: s4.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0593a extends m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f44008j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ View f44009k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C4034q f44010l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C5717c.a f44011m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ List f44012n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ A4.a f44013o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0593a(View view, C4034q c4034q, C5717c.a aVar, List list, A4.a aVar2, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f44009k = view;
                this.f44010l = c4034q;
                this.f44011m = aVar;
                this.f44012n = list;
                this.f44013o = aVar2;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new C0593a(this.f44009k, this.f44010l, this.f44011m, this.f44012n, this.f44013o, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((C0593a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f44008j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return C5715a.f44001a.c(this.f44009k, this.f44010l, this.f44011m, this.f44012n, this.f44013o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0592a(View view, A4.a aVar, C4034q c4034q, C5717c.a aVar2, List list, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f44003k = view;
            this.f44004l = aVar;
            this.f44005m = c4034q;
            this.f44006n = aVar2;
            this.f44007o = list;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C0592a(this.f44003k, this.f44004l, this.f44005m, this.f44006n, this.f44007o, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C0592a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Looper mainLooper;
            Object objF = C5046c.f();
            int i10 = this.f44002j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                Handler handler = this.f44003k.getHandler();
                if ((handler == null || (mainLooper = handler.getLooper()) == null) && (mainLooper = Looper.getMainLooper()) == null) {
                    this.f44004l.d("Unable to get main looper");
                    return null;
                }
                if (AbstractC4862t.a(mainLooper.getThread(), Thread.currentThread())) {
                    return C5715a.f44001a.c(this.f44003k, this.f44005m, this.f44006n, this.f44007o, this.f44004l);
                }
                J0 j0C = C2123d0.c();
                C0593a c0593a = new C0593a(this.f44003k, this.f44005m, this.f44006n, this.f44007o, this.f44004l, null);
                this.f44002j = 1;
                obj = AbstractC2128g.g(j0C, c0593a, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return (C5717c) obj;
        }
    }

    public static final C5717c b(View view, C4034q targetPosition, List viewTargetLocators, C5717c.a targetType, A4.a logger) {
        AbstractC4862t.e(view, "<this>");
        AbstractC4862t.e(targetPosition, "targetPosition");
        AbstractC4862t.e(viewTargetLocators, "viewTargetLocators");
        AbstractC4862t.e(targetType, "targetType");
        AbstractC4862t.e(logger, "logger");
        return (C5717c) AbstractC2130h.b(null, new C0592a(view, logger, targetPosition, targetType, viewTargetLocators, null), 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0009, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s4.C5717c c(android.view.View r5, fc.C4034q r6, s4.C5717c.a r7, java.util.List r8, A4.a r9) {
        /*
            r4 = this;
            gc.l r4 = new gc.l
            r4.<init>()
            r4.add(r5)
            r5 = 0
        L9:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L70
            java.lang.Object r0 = r4.removeFirst()     // Catch: java.util.NoSuchElementException -> L6a
            android.view.View r0 = (android.view.View) r0     // Catch: java.util.NoSuchElementException -> L6a
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L23
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            Nd.h r1 = Y0.J.a(r1)
            gc.y.B(r4, r1)
        L23:
            if (r8 == 0) goto L2e
            boolean r1 = r8.isEmpty()     // Catch: java.lang.ClassCastException -> L2c
            if (r1 != 0) goto L9
            goto L2e
        L2c:
            r0 = move-exception
            goto L55
        L2e:
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.ClassCastException -> L2c
        L32:
            boolean r2 = r1.hasNext()     // Catch: java.lang.ClassCastException -> L2c
            if (r2 == 0) goto L9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.ClassCastException -> L2c
            v4.b r2 = (v4.InterfaceC6039b) r2     // Catch: java.lang.ClassCastException -> L2c
            s4.c r2 = r2.a(r0, r6, r7)     // Catch: java.lang.ClassCastException -> L2c
            if (r2 == 0) goto L4b
            s4.c$a r5 = s4.C5717c.a.Clickable     // Catch: java.lang.ClassCastException -> L2c
            if (r7 != r5) goto L4a
            r5 = 1
            goto L4f
        L4a:
            return r2
        L4b:
            r2 = 0
            r3 = r2
            r2 = r5
            r5 = r3
        L4f:
            if (r5 == 0) goto L53
            r5 = r2
            goto L9
        L53:
            r5 = r2
            goto L32
        L55:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while locating target in view hierarchy: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.d(r0)
            goto L9
        L6a:
            java.lang.String r0 = "Unable to get view from queue"
            r9.d(r0)
            goto L9
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C5715a.c(android.view.View, fc.q, s4.c$a, java.util.List, A4.a):s4.c");
    }
}
