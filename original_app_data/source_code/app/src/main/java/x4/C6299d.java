package x4;

import F4.f;
import Rd.InterfaceC2166z0;
import Rd.M;
import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import fc.C4015H;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.m;
import q4.C5485a;
import q4.C5487c;
import q4.C5488d;
import q4.C5492h;
import vc.p;
import z4.C6504c;
import z4.C6510i;
import z4.EnumC6503b;

/* JADX INFO: renamed from: x4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6299d implements Application.ActivityLifecycleCallbacks, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6504c f47449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.a f47450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D4.a f47451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PackageInfo f47452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5485a f47453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C5487c f47454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C5492h f47455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f47456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f47457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f47458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC2166z0 f47459k;

    /* JADX INFO: renamed from: x4.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f47460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f47461k;

        /* JADX INFO: renamed from: x4.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class C0645a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47463a;

            static {
                int[] iArr = new int[EnumC6503b.values().length];
                try {
                    iArr[EnumC6503b.Created.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6503b.Started.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6503b.Resumed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC6503b.Paused.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC6503b.Stopped.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC6503b.Destroyed.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f47463a = iArr;
            }
        }

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C6299d.this.new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:12:0x0038). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r6.f47461k
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r6.f47460j
                Td.i r1 = (Td.i) r1
                fc.AbstractC4036s.b(r7)
                goto L38
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1b:
                fc.AbstractC4036s.b(r7)
                x4.d r7 = x4.C6299d.this
                z4.c r7 = x4.C6299d.h(r7)
                Td.g r7 = r7.a()
                Td.i r7 = r7.iterator()
                r1 = r7
            L2d:
                r6.f47460j = r1
                r6.f47461k = r2
                java.lang.Object r7 = r1.a(r6)
                if (r7 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L88
                java.lang.Object r7 = r1.next()
                z4.a r7 = (z4.C6502a) r7
                java.lang.ref.WeakReference r3 = r7.a()
                java.lang.Object r3 = r3.get()
                android.app.Activity r3 = (android.app.Activity) r3
                if (r3 == 0) goto L2d
                x4.d r4 = x4.C6299d.this
                z4.b r7 = r7.b()
                int[] r5 = x4.C6299d.a.C0645a.f47463a
                int r7 = r7.ordinal()
                r7 = r5[r7]
                switch(r7) {
                    case 1: goto L78;
                    case 2: goto L74;
                    case 3: goto L70;
                    case 4: goto L6c;
                    case 5: goto L68;
                    case 6: goto L64;
                    default: goto L63;
                }
            L63:
                goto L2d
            L64:
                r4.onActivityDestroyed(r3)
                goto L2d
            L68:
                r4.onActivityStopped(r3)
                goto L2d
            L6c:
                r4.onActivityPaused(r3)
                goto L2d
            L70:
                r4.onActivityResumed(r3)
                goto L2d
            L74:
                r4.onActivityStarted(r3)
                goto L2d
            L78:
                android.content.Intent r7 = r3.getIntent()
                if (r7 == 0) goto L83
                android.os.Bundle r7 = r7.getExtras()
                goto L84
            L83:
                r7 = 0
            L84:
                r4.onActivityCreated(r3, r7)
                goto L2d
            L88:
                fc.H r6 = fc.C4015H.f34254a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.C6299d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C6299d(C6504c activityLifecycleObserver) {
        AbstractC4862t.e(activityLifecycleObserver, "activityLifecycleObserver");
        this.f47449a = activityLifecycleObserver;
        this.f47450b = f.a.Utility;
        this.f47456h = new LinkedHashSet();
        this.f47457i = new LinkedHashSet();
    }

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f47451c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    @Override // F4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(D4.a r11) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C6299d.e(D4.a):void");
    }

    @Override // F4.f
    public f.a getType() {
        return this.f47450b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC4862t.e(activity, "activity");
        this.f47456h.add(Integer.valueOf(activity.hashCode()));
        C5487c c5487c = this.f47454f;
        C5485a c5485a = null;
        if (c5487c == null) {
            AbstractC4862t.p("autocaptureState");
            c5487c = null;
        }
        if (c5487c.d()) {
            C5485a c5485a2 = this.f47453e;
            if (c5485a2 == null) {
                AbstractC4862t.p("androidAmplitude");
            } else {
                c5485a = c5485a2;
            }
            new C6510i(c5485a).d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        this.f47456h.remove(Integer.valueOf(activity.hashCode()));
        C5487c c5487c = this.f47454f;
        C5485a c5485a = null;
        if (c5487c == null) {
            AbstractC4862t.p("autocaptureState");
            c5487c = null;
        }
        if (c5487c.d()) {
            C5485a c5485a2 = this.f47453e;
            if (c5485a2 == null) {
                AbstractC4862t.p("androidAmplitude");
            } else {
                c5485a = c5485a2;
            }
            new C6510i(c5485a).f(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        C5487c c5487c = this.f47454f;
        C5485a c5485a = null;
        if (c5487c == null) {
            AbstractC4862t.p("autocaptureState");
            c5487c = null;
        }
        if (c5487c.c().isEmpty()) {
            return;
        }
        C5485a c5485a2 = this.f47453e;
        if (c5485a2 == null) {
            AbstractC4862t.p("androidAmplitude");
        } else {
            c5485a = c5485a2;
        }
        new C6510i(c5485a).g(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        C5487c c5487c = this.f47454f;
        C5487c c5487c2 = null;
        if (c5487c == null) {
            AbstractC4862t.p("autocaptureState");
            c5487c = null;
        }
        if (c5487c.c().isEmpty()) {
            return;
        }
        C5485a c5485a = this.f47453e;
        if (c5485a == null) {
            AbstractC4862t.p("androidAmplitude");
            c5485a = null;
        }
        C6510i c6510i = new C6510i(c5485a);
        C5492h c5492h = this.f47455g;
        C5487c c5487c3 = this.f47454f;
        if (c5487c3 == null) {
            AbstractC4862t.p("autocaptureState");
        } else {
            c5487c2 = c5487c3;
        }
        c6510i.e(activity, c5492h, c5487c2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        if (!this.f47456h.contains(Integer.valueOf(activity.hashCode()))) {
            onActivityCreated(activity, activity.getIntent().getExtras());
        }
        C5485a c5485a = null;
        if (this.f47457i.isEmpty()) {
            C5485a c5485a2 = this.f47453e;
            if (c5485a2 == null) {
                AbstractC4862t.p("androidAmplitude");
                c5485a2 = null;
            }
            c5485a2.N(System.currentTimeMillis());
        }
        this.f47457i.add(Integer.valueOf(activity.hashCode()));
        C5487c c5487c = this.f47454f;
        if (c5487c == null) {
            AbstractC4862t.p("autocaptureState");
            c5487c = null;
        }
        if (c5487c.a() && this.f47457i.size() == 1) {
            C5485a c5485a3 = this.f47453e;
            if (c5485a3 == null) {
                AbstractC4862t.p("androidAmplitude");
                c5485a3 = null;
            }
            C6510i c6510i = new C6510i(c5485a3);
            PackageInfo packageInfo = this.f47452d;
            if (packageInfo == null) {
                AbstractC4862t.p("packageInfo");
                packageInfo = null;
            }
            c6510i.i(packageInfo, this.f47458j);
            this.f47458j = false;
        }
        C5487c c5487c2 = this.f47454f;
        if (c5487c2 == null) {
            AbstractC4862t.p("autocaptureState");
            c5487c2 = null;
        }
        if (c5487c2.b()) {
            C5485a c5485a4 = this.f47453e;
            if (c5485a4 == null) {
                AbstractC4862t.p("androidAmplitude");
                c5485a4 = null;
            }
            new C6510i(c5485a4).k(activity);
        }
        C5487c c5487c3 = this.f47454f;
        if (c5487c3 == null) {
            AbstractC4862t.p("autocaptureState");
            c5487c3 = null;
        }
        if (c5487c3.d()) {
            C5485a c5485a5 = this.f47453e;
            if (c5485a5 == null) {
                AbstractC4862t.p("androidAmplitude");
            } else {
                c5485a = c5485a5;
            }
            new C6510i(c5485a).l(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        this.f47457i.remove(Integer.valueOf(activity.hashCode()));
        C5487c c5487c = this.f47454f;
        C5485a c5485a = null;
        if (c5487c == null) {
            AbstractC4862t.p("autocaptureState");
            c5487c = null;
        }
        if (c5487c.a() && this.f47457i.isEmpty()) {
            C5485a c5485a2 = this.f47453e;
            if (c5485a2 == null) {
                AbstractC4862t.p("androidAmplitude");
                c5485a2 = null;
            }
            new C6510i(c5485a2).h();
            this.f47458j = true;
        }
        if (this.f47457i.isEmpty()) {
            C5485a c5485a3 = this.f47453e;
            if (c5485a3 == null) {
                AbstractC4862t.p("androidAmplitude");
            } else {
                c5485a = c5485a3;
            }
            c5485a.O(System.currentTimeMillis());
            D4.b bVarL = c5485a.l();
            AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            if (((C5488d) bVarL).G()) {
                c5485a.i();
            }
        }
    }
}
