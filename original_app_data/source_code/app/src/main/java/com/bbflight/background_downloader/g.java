package com.bbflight.background_downloader;

import I3.x;
import Od.o;
import Od.q;
import Q4.B;
import Q4.F;
import Q4.G;
import Q4.K;
import Q4.Notification;
import Q4.NotificationConfig;
import Q4.Task;
import Q4.b0;
import Q4.g0;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.M;
import Rd.N;
import Rd.X;
import ae.AbstractC2693g;
import ae.InterfaceC2687a;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.m;
import androidx.work.b;
import com.bbflight.background_downloader.a;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4032o;
import he.AbstractC4304b;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.S;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import vc.p;
import xc.C6361d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f27137a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ConcurrentHashMap f27138b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC2687a f27139c = AbstractC2693g.b(false, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Td.g f27140d = Td.j.b(-1, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ArrayDeque f27141e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M f27142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f27143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f27144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f27145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f27146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f27147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o f27148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o f27149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f27150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o f27151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o f27152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o f27153q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27154j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27155k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f27156l;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (r4.r(r6) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0064 -> B:7:0x0019). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r6.f27156l
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.f27155k
                fc.H r1 = (fc.C4015H) r1
                java.lang.Object r1 = r6.f27154j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r7)
            L19:
                r7 = r1
                goto L36
            L1b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L23:
                java.lang.Object r1 = r6.f27154j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r7)
                goto L47
            L2b:
                fc.AbstractC4036s.b(r7)
                Td.g r7 = com.bbflight.background_downloader.g.c()
                Td.i r7 = r7.iterator()
            L36:
                r6.f27154j = r7
                r1 = 0
                r6.f27155k = r1
                r6.f27156l = r3
                java.lang.Object r1 = r7.a(r6)
                if (r1 != r0) goto L44
                goto L66
            L44:
                r5 = r1
                r1 = r7
                r7 = r5
            L47:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L67
                r1.next()
                fc.H r7 = fc.C4015H.f34254a
                com.bbflight.background_downloader.g r4 = com.bbflight.background_downloader.g.f27137a
                r6.f27154j = r1
                java.lang.Object r7 = nc.l.a(r7)
                r6.f27155k = r7
                r6.f27156l = r2
                java.lang.Object r7 = com.bbflight.background_downloader.g.d(r4, r6)
                if (r7 != r0) goto L19
            L66:
                return r0
            L67:
                fc.H r6 = fc.C4015H.f34254a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27158b;

        static {
            int[] iArr = new int[G.values().length];
            try {
                iArr[G.running.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.complete.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[G.canceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27157a = iArr;
            int[] iArr2 = new int[g0.values().length];
            try {
                iArr2[g0.enqueued.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[g0.running.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[g0.complete.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[g0.paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[g0.canceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f27158b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27159j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27160k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27161l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27162m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f27163n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f27164o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f27166q;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27164o = obj;
            this.f27166q |= Integer.MIN_VALUE;
            return g.this.i(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27167j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27168k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27169l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27170m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27171n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f27172o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f27173p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f27175r;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27173p = obj;
            this.f27175r |= Integer.MIN_VALUE;
            return g.this.m(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f27176j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27177k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f27178l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f27179m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f27181o;

        public e(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27179m = obj;
            this.f27181o |= Integer.MIN_VALUE;
            return g.this.r(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27182j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27183k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27184l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27185m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27186n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f27187o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f27188p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f27189q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f27190r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f27191s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27192t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f27193u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f27194v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public double f27195w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f27196x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f27198z;

        public f(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27196x = obj;
            this.f27198z |= Integer.MIN_VALUE;
            return g.this.v(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbflight.background_downloader.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0349g extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27199j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f27200k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ L f27201l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f27202m;

        /* JADX INFO: renamed from: com.bbflight.background_downloader.g$g$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f27203j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ L f27204k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f27205l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(L l10, String str, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f27204k = l10;
                this.f27205l = str;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f27204k, this.f27205l, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f27203j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    this.f27203j = 1;
                    if (X.a(5000L, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                if (((B) this.f27204k.f39776a).k()) {
                    g.f27137a.n().remove(this.f27205l);
                }
                return C4015H.f34254a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0349g(L l10, String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27201l = l10;
            this.f27202m = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            C0349g c0349g = new C0349g(this.f27201l, this.f27202m, interfaceC4988e);
            c0349g.f27200k = obj;
            return c0349g;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C0349g) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            M m10 = (M) this.f27200k;
            C5046c.f();
            if (this.f27199j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return AbstractC2132i.d(m10, null, null, new a(this.f27201l, this.f27202m, null), 3, null);
        }
    }

    static {
        M mA = N.a(C2123d0.a());
        f27142f = mA;
        AbstractC2132i.d(mA, null, null, new a(null), 3, null);
        q qVar = q.IGNORE_CASE;
        f27145i = new o("\\{displayName\\}", qVar);
        f27146j = new o("\\{filename\\}", qVar);
        f27147k = new o("\\{progress\\}", qVar);
        f27148l = new o("\\{networkSpeed\\}", qVar);
        f27149m = new o("\\{timeRemaining\\}", qVar);
        f27150n = new o("\\{metadata\\}", qVar);
        f27151o = new o("\\{numFinished\\}", qVar);
        f27152p = new o("\\{numFailed\\}", qVar);
        f27153q = new o("\\{numTotal\\}", qVar);
    }

    public static /* synthetic */ Object j(g gVar, b0 b0Var, G g10, m.e eVar, InterfaceC4988e interfaceC4988e, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g10 = null;
        }
        if ((i10 & 4) != 0) {
            eVar = null;
        }
        return gVar.i(b0Var, g10, eVar, interfaceC4988e);
    }

    public static /* synthetic */ String u(g gVar, String str, Task task, double d10, double d11, Long l10, B b10, int i10, Object obj) {
        return gVar.t(str, task, d10, (i10 & 8) != 0 ? -1.0d : d11, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? null : b10);
    }

    public static /* synthetic */ Object x(g gVar, b0 b0Var, g0 g0Var, double d10, long j10, InterfaceC4988e interfaceC4988e, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            d10 = 2.0d;
        }
        return gVar.w(b0Var, g0Var, d10, (i10 & 8) != 0 ? -1000L : j10, interfaceC4988e);
    }

    public final void f(b0 b0Var, G g10, B b10, m.e eVar) {
        h(b0Var, "", g10, eVar);
        if (g10 == G.running) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationReceiver.keyGroupNotificationName, b10.c());
            Intent intent = new Intent(b0Var.t(), (Class<?>) NotificationReceiver.class);
            intent.setAction(NotificationReceiver.actionCancelActive);
            intent.putExtra(NotificationReceiver.keyBundle, bundle);
            PendingIntent broadcast = PendingIntent.getBroadcast(b0Var.t(), b10.e(), intent, 67108864);
            AbstractC4862t.d(broadcast, "getBroadcast(...)");
            eVar.a(K.f13777a, (CharSequence) com.bbflight.background_downloader.a.INSTANCE.r().get("Cancel"), broadcast);
        }
    }

    public final void g(b0 b0Var, G g10, m.e eVar) {
        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
        Task taskP = b0Var.p();
        aVar.d();
        String strB = aVar.b(Task.INSTANCE.serializer(), taskP);
        h(b0Var, strB, g10, eVar);
        int i10 = b.f27157a[g10.ordinal()];
        if (i10 == 1) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationReceiver.keyTaskId, b0Var.p().getTaskId());
            Intent intent = new Intent(b0Var.t(), (Class<?>) NotificationReceiver.class);
            intent.setAction(NotificationReceiver.actionCancelActive);
            intent.putExtra(NotificationReceiver.keyBundle, bundle);
            PendingIntent broadcast = PendingIntent.getBroadcast(b0Var.t(), b0Var.getNotificationId(), intent, 67108864);
            AbstractC4862t.d(broadcast, "getBroadcast(...)");
            int i11 = K.f13777a;
            a.Companion companion = com.bbflight.background_downloader.a.INSTANCE;
            eVar.a(i11, (CharSequence) companion.r().get("Cancel"), broadcast);
            if (b0Var.getTaskCanResume()) {
                NotificationConfig notificationConfig = b0Var.getNotificationConfig();
                if ((notificationConfig != null ? notificationConfig.getPaused() : null) != null) {
                    Intent intent2 = new Intent(b0Var.t(), (Class<?>) NotificationReceiver.class);
                    intent2.setAction(NotificationReceiver.actionPause);
                    intent2.putExtra(NotificationReceiver.keyBundle, bundle);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(b0Var.t(), b0Var.getNotificationId(), intent2, 67108864);
                    AbstractC4862t.d(broadcast2, "getBroadcast(...)");
                    eVar.a(K.f13782f, (CharSequence) companion.r().get("Pause"), broadcast2);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 2 || i10 == 3) {
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                throw new C4032o();
            }
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(NotificationReceiver.keyTaskId, b0Var.p().getTaskId());
        bundle2.putString(NotificationReceiver.keyTask, strB);
        Intent intent3 = new Intent(b0Var.t(), (Class<?>) NotificationReceiver.class);
        intent3.setAction(NotificationReceiver.actionCancelInactive);
        intent3.putExtra(NotificationReceiver.keyBundle, bundle2);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(b0Var.t(), b0Var.getNotificationId(), intent3, 67108864);
        AbstractC4862t.d(broadcast3, "getBroadcast(...)");
        int i12 = K.f13777a;
        a.Companion companion2 = com.bbflight.background_downloader.a.INSTANCE;
        eVar.a(i12, (CharSequence) companion2.r().get("Cancel"), broadcast3);
        Bundle bundle3 = new Bundle();
        bundle3.putString(NotificationReceiver.keyTaskId, b0Var.p().getTaskId());
        bundle3.putString(NotificationReceiver.keyTask, strB);
        bundle3.putString(NotificationReceiver.keyNotificationConfig, b0Var.getNotificationConfigJsonString());
        Intent intent4 = new Intent(b0Var.t(), (Class<?>) NotificationReceiver.class);
        intent4.setAction(NotificationReceiver.actionResume);
        intent4.putExtra(NotificationReceiver.keyBundle, bundle3);
        PendingIntent broadcast4 = PendingIntent.getBroadcast(b0Var.t(), b0Var.getNotificationId(), intent4, 67108864);
        AbstractC4862t.d(broadcast4, "getBroadcast(...)");
        AbstractC4862t.b(eVar.a(K.f13783g, (CharSequence) companion2.r().get("Resume"), broadcast4));
    }

    public final void h(b0 b0Var, String str, G g10, m.e eVar) {
        Intent launchIntentForPackage = b0Var.t().getPackageManager().getLaunchIntentForPackage(b0Var.t().getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setAction(NotificationReceiver.actionTap);
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            launchIntentForPackage.addFlags(536870912);
            launchIntentForPackage.putExtra(NotificationReceiver.keyTask, str);
            launchIntentForPackage.putExtra(NotificationReceiver.keyNotificationConfig, b0Var.getNotificationConfigJsonString());
            launchIntentForPackage.putExtra(NotificationReceiver.keyNotificationType, g10.ordinal());
            launchIntentForPackage.putExtra(NotificationReceiver.keyNotificationId, b0Var.getNotificationId());
            PendingIntent activity = PendingIntent.getActivity(b0Var.t(), b0Var.getNotificationId(), launchIntentForPackage, 201326592);
            AbstractC4862t.d(activity, "getActivity(...)");
            eVar.m(activity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        if (r5.p(r1, r0) == r9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(Q4.b0 r6, Q4.G r7, androidx.core.app.m.e r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.bbflight.background_downloader.g.c
            if (r0 == 0) goto L13
            r0 = r9
            com.bbflight.background_downloader.g$c r0 = (com.bbflight.background_downloader.g.c) r0
            int r1 = r0.f27166q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27166q = r1
            goto L18
        L13:
            com.bbflight.background_downloader.g$c r0 = new com.bbflight.background_downloader.g$c
            r0.<init>(r9)
        L18:
            java.lang.Object r5 = r0.f27164o
            java.lang.Object r9 = mc.C5046c.f()
            int r1 = r0.f27166q
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L58
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            java.lang.Object r6 = r0.f27161l
            androidx.core.app.m$e r6 = (androidx.core.app.m.e) r6
            java.lang.Object r6 = r0.f27160k
            Q4.G r6 = (Q4.G) r6
            java.lang.Object r6 = r0.f27159j
            Q4.b0 r6 = (Q4.b0) r6
            fc.AbstractC4036s.b(r5)
            goto L9f
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            java.lang.Object r6 = r0.f27162m
            ae.a r6 = (ae.InterfaceC2687a) r6
            java.lang.Object r7 = r0.f27161l
            r8 = r7
            androidx.core.app.m$e r8 = (androidx.core.app.m.e) r8
            java.lang.Object r7 = r0.f27160k
            Q4.G r7 = (Q4.G) r7
            java.lang.Object r1 = r0.f27159j
            Q4.b0 r1 = (Q4.b0) r1
            fc.AbstractC4036s.b(r5)
            r5 = r6
            r6 = r1
            goto L71
        L58:
            fc.AbstractC4036s.b(r5)
            ae.a r5 = com.bbflight.background_downloader.g.f27139c
            r0.f27159j = r6
            r0.f27160k = r7
            r0.f27161l = r8
            r0.f27162m = r5
            r1 = 0
            r0.f27163n = r1
            r0.f27166q = r3
            java.lang.Object r1 = r5.a(r4, r0)
            if (r1 != r9) goto L71
            goto L9e
        L71:
            java.util.ArrayDeque r1 = com.bbflight.background_downloader.g.f27141e     // Catch: java.lang.Throwable -> La2
            Q4.F r3 = new Q4.F     // Catch: java.lang.Throwable -> La2
            r3.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> La2
            r1.add(r3)     // Catch: java.lang.Throwable -> La2
            r5.h(r4)
            Td.g r5 = com.bbflight.background_downloader.g.f27140d
            fc.H r1 = fc.C4015H.f34254a
            java.lang.Object r6 = nc.l.a(r6)
            r0.f27159j = r6
            java.lang.Object r6 = nc.l.a(r7)
            r0.f27160k = r6
            java.lang.Object r6 = nc.l.a(r8)
            r0.f27161l = r6
            r0.f27162m = r4
            r0.f27166q = r2
            java.lang.Object r5 = r5.p(r1, r0)
            if (r5 != r9) goto L9f
        L9e:
            return r9
        L9f:
            fc.H r5 = fc.C4015H.f34254a
            return r5
        La2:
            r6 = move-exception
            r5.h(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.g.i(Q4.b0, Q4.G, androidx.core.app.m$e, lc.e):java.lang.Object");
    }

    public final void k(Context context) {
        String string = context.getString(Q4.L.f13786c);
        AbstractC4862t.d(string, "getString(...)");
        String string2 = context.getString(Q4.L.f13785b);
        AbstractC4862t.d(string2, "getString(...)");
        NotificationChannel notificationChannel = new NotificationChannel("background_downloader", string, 2);
        notificationChannel.setDescription(string2);
        Object systemService = context.getSystemService("notification");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        f27144h = true;
    }

    public final void l(Context context, String taskJson, String str, Integer num) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(taskJson, "taskJson");
        x.a aVar = new x.a(UpdateNotificationWorker.class);
        b.a aVarH = new b.a().h("Task", taskJson).h("notificationConfig", str);
        if (num != null) {
            aVarH.f("taskStatusOrdinal", num.intValue());
        }
        aVar.m(aVarH.a());
        I3.M.f5571a.a(context).c(aVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        if (r11.s(r1, r6, 1, r0) == r14) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
    
        if (r11.s(r1, r6, 0, r0) == r14) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(Q4.b0 r11, Q4.G r12, androidx.core.app.m.e r13, lc.InterfaceC4988e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.g.m(Q4.b0, Q4.G, androidx.core.app.m$e, lc.e):java.lang.Object");
    }

    public final ConcurrentHashMap n() {
        return f27138b;
    }

    public final B o(String taskId) {
        AbstractC4862t.e(taskId, "taskId");
        for (Object obj : f27138b.values()) {
            AbstractC4862t.d(obj, "next(...)");
            B b10 = (B) obj;
            Set setJ = b10.j();
            if (setJ == null || !setJ.isEmpty()) {
                Iterator it = setJ.iterator();
                while (it.hasNext()) {
                    if (AbstractC4862t.a(((Task) it.next()).getTaskId(), taskId)) {
                        return b10;
                    }
                }
            }
        }
        return null;
    }

    public final G p(g0 g0Var) {
        int i10 = b.f27158b[g0Var.ordinal()];
        return (i10 == 1 || i10 == 2) ? G.running : i10 != 3 ? i10 != 4 ? i10 != 5 ? G.error : G.canceled : G.paused : G.complete;
    }

    public final Object q(F f10, InterfaceC4988e interfaceC4988e) throws Throwable {
        if (f10.b() == null || f10.a() == null) {
            NotificationManagerCompat.from(f10.c().t()).cancel(f10.c().getNotificationId());
            return C4015H.f34254a;
        }
        Object objM = m(f10.c(), f10.b(), f10.a(), interfaceC4988e);
        return objM == C5046c.f() ? objM : C4015H.f34254a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[PHI: r7
      0x006c: PHI (r7v1 long) = (r7v3 long), (r7v3 long), (r7v5 long) binds: [B:20:0x005b, B:22:0x0068, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00df -> B:48:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(lc.InterfaceC4988e r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.g.r(lc.e):java.lang.Object");
    }

    public final void s(com.bbflight.background_downloader.d item, boolean z10) {
        AbstractC4862t.e(item, "item");
        String strW = item.w();
        if (strW == null) {
            return;
        }
        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
        aVar.d();
        if (((NotificationConfig) aVar.a(NotificationConfig.INSTANCE.serializer(), strW)).getGroupNotificationId().length() > 0) {
            Context contextV = item.v();
            Task taskX = item.x();
            aVar.d();
            l(contextV, aVar.b(Task.INSTANCE.serializer(), taskX), strW, Integer.valueOf((z10 ? g0.enqueued : g0.failed).ordinal()));
        }
    }

    public final String t(String str, Task task, double d10, double d11, Long l10, B b10) {
        String str2;
        StringBuilder sb2;
        String str3;
        String string;
        String str4;
        o oVar = f27145i;
        o oVar2 = f27146j;
        o oVar3 = f27150n;
        o.a aVar = o.f12459b;
        String strJ = oVar.j(oVar2.j(oVar3.j(str, aVar.c(task.getMetaData())), aVar.c(task.getFilename())), aVar.c(task.getDisplayName()));
        if (0.0d > d10 || d10 > 1.0d) {
            str2 = "";
        } else {
            str2 = C6361d.b(d10 * ((double) 100)) + "%";
        }
        String strJ2 = f27147k.j(strJ, str2);
        if (d11 <= 0.0d) {
            string = "-- MB/s";
        } else {
            if (d11 > 1.0d) {
                int iB = C6361d.b(d11);
                sb2 = new StringBuilder();
                sb2.append(iB);
                str3 = " MB/s";
            } else {
                int iB2 = C6361d.b(d11 * ((double) 1000));
                sb2 = new StringBuilder();
                sb2.append(iB2);
                str3 = " kB/s";
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        String strJ3 = f27148l.j(strJ2, string);
        if (l10 != null) {
            long jLongValue = l10.longValue() / 3600000;
            long jLongValue2 = l10.longValue() % 3600000;
            long j10 = (jLongValue2 + (3600000 & (((jLongValue2 ^ 3600000) & ((-jLongValue2) | jLongValue2)) >> 63))) / 60000;
            long jLongValue3 = l10.longValue() % 60000;
            long j11 = (jLongValue3 + (60000 & (((jLongValue3 ^ 60000) & ((-jLongValue3) | jLongValue3)) >> 63))) / 1000;
            if (l10.longValue() < 0) {
                str4 = "--:--";
            } else if (jLongValue > 0) {
                S s10 = S.f39781a;
                str4 = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue), Long.valueOf(j10), Long.valueOf(j11)}, 3));
                AbstractC4862t.d(str4, "format(...)");
            } else {
                S s11 = S.f39781a;
                str4 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10), Long.valueOf(j11)}, 2));
                AbstractC4862t.d(str4, "format(...)");
            }
            strJ3 = f27149m.j(strJ3, str4);
        }
        return b10 != null ? f27152p.j(f27151o.j(f27153q.j(strJ3, String.valueOf(b10.h())), String.valueOf(b10.g())), String.valueOf(b10.f())) : strJ3;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(Q4.b0 r28, java.lang.String r29, Q4.G r30, lc.InterfaceC4988e r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.g.v(Q4.b0, java.lang.String, Q4.G, lc.e):java.lang.Object");
    }

    public final Object w(b0 b0Var, g0 g0Var, double d10, long j10, InterfaceC4988e interfaceC4988e) {
        int i10;
        Object objV;
        G gP = p(g0Var);
        NotificationConfig notificationConfig = b0Var.getNotificationConfig();
        Notification running = null;
        String groupNotificationId = notificationConfig != null ? notificationConfig.getGroupNotificationId() : null;
        if (groupNotificationId != null && groupNotificationId.length() > 0) {
            return (d10 == 2.0d && j10 == -1000 && (objV = v(b0Var, groupNotificationId, gP, interfaceC4988e)) == C5046c.f()) ? objV : C4015H.f34254a;
        }
        if (g0Var == g0.enqueued) {
            return C4015H.f34254a;
        }
        int[] iArr = b.f27157a;
        int i11 = iArr[gP.ordinal()];
        if (i11 == 1) {
            NotificationConfig notificationConfig2 = b0Var.getNotificationConfig();
            if (notificationConfig2 != null) {
                running = notificationConfig2.getRunning();
            }
        } else if (i11 == 2) {
            NotificationConfig notificationConfig3 = b0Var.getNotificationConfig();
            if (notificationConfig3 != null) {
                running = notificationConfig3.getComplete();
            }
        } else if (i11 == 3) {
            NotificationConfig notificationConfig4 = b0Var.getNotificationConfig();
            if (notificationConfig4 != null) {
                running = notificationConfig4.getError();
            }
        } else if (i11 == 4) {
            NotificationConfig notificationConfig5 = b0Var.getNotificationConfig();
            if (notificationConfig5 != null) {
                running = notificationConfig5.getPaused();
            }
        } else {
            if (i11 != 5) {
                throw new C4032o();
            }
            NotificationConfig notificationConfig6 = b0Var.getNotificationConfig();
            if (notificationConfig6 != null) {
                running = notificationConfig6.getCanceled();
            }
        }
        Notification notification = running;
        if (notification == null) {
            Object objJ = j(this, b0Var, null, null, interfaceC4988e, 6, null);
            return objJ == C5046c.f() ? objJ : C4015H.f34254a;
        }
        b0Var.w(b0Var.p().getTaskId().hashCode());
        if (!f27144h) {
            k(b0Var.t());
        }
        int i12 = iArr[gP.ordinal()];
        if (i12 == 1) {
            i10 = b0Var.p().R() ? K.f13780d : K.f13781e;
        } else if (i12 == 2) {
            i10 = K.f13778b;
        } else if (i12 == 3) {
            i10 = K.f13779c;
        } else if (i12 == 4) {
            i10 = K.f13782f;
        } else {
            if (i12 != 5) {
                throw new C4032o();
            }
            i10 = K.f13777a;
        }
        m.e eVarL = new m.e(b0Var.t(), "background_downloader").F(-1).L(i10);
        G g10 = G.running;
        m.e eVarJ = eVarL.J(gP != g10);
        AbstractC4862t.d(eVarJ, "setShowWhen(...)");
        G g11 = G.paused;
        b0Var.x(gP == g11 ? b0Var.getNotificationProgress() : d10);
        String strU = u(this, notification.getTitle(), b0Var.p(), b0Var.getNotificationProgress(), b0Var.getNetworkSpeed(), AbstractC5158b.d(j10), null, 32, null);
        if (strU.length() > 0) {
            eVarJ.o(strU);
        }
        String strU2 = u(this, notification.getBody(), b0Var.p(), b0Var.getNotificationProgress(), b0Var.getNetworkSpeed(), AbstractC5158b.d(j10), null, 32, null);
        if (strU2.length() > 0) {
            eVarJ.n(strU2);
        }
        NotificationConfig notificationConfig7 = b0Var.getNotificationConfig();
        if (notificationConfig7 != null && notificationConfig7.getProgressBar() && ((gP == g10 || gP == g11) && b0Var.getNotificationProgress() >= 0.0d)) {
            if (b0Var.getNotificationProgress() <= 1.0d) {
                eVarJ.G(100, C6361d.b(b0Var.getNotificationProgress() * ((double) 100)), false);
            } else {
                eVarJ.G(100, 0, true);
            }
        }
        g(b0Var, gP, eVarJ);
        Object objI = i(b0Var, gP, eVarJ, interfaceC4988e);
        return objI == C5046c.f() ? objI : C4015H.f34254a;
    }
}
