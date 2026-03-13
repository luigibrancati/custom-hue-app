package z4;

import D4.f;
import Od.F;
import Rd.AbstractC2132i;
import Rd.M;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.view.Window;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.P;
import gc.Q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4844a;
import kotlin.jvm.internal.v;
import lc.InterfaceC4988e;
import nc.m;
import q4.C5485a;
import q4.C5487c;
import q4.C5492h;
import t4.C5841b;
import u4.C5914b;
import u4.C5915c;
import u4.WindowCallbackC5916d;
import v4.C6040c;
import vc.InterfaceC6082a;
import vc.p;

/* JADX INFO: renamed from: z4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6510i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48764c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5485a f48765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4028k f48766b;

    /* JADX INFO: renamed from: z4.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String a(Activity activity) {
            AbstractC4862t.e(activity, "<this>");
            try {
                ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
                AbstractC4862t.d(activityInfo, "getActivityInfo(...)");
                CharSequence title = activity.getTitle();
                AbstractC4862t.d(title, "getTitle(...)");
                if (!F.k0(title)) {
                    return activity.getTitle().toString();
                }
                int i10 = activityInfo.labelRes;
                if (i10 != 0) {
                    String string = activity.getString(i10);
                    AbstractC4862t.d(string, "getString(...)");
                    return string;
                }
                CharSequence nonLocalizedLabel = activityInfo.nonLocalizedLabel;
                AbstractC4862t.d(nonLocalizedLabel, "nonLocalizedLabel");
                if (!F.k0(nonLocalizedLabel)) {
                    return activityInfo.nonLocalizedLabel.toString();
                }
                String name = activityInfo.name;
                AbstractC4862t.d(name, "name");
                if (F.k0(name)) {
                    String localClassName = activity.getLocalClassName();
                    AbstractC4862t.d(localClassName, "getLocalClassName(...)");
                    return localClassName;
                }
                String name2 = activityInfo.name;
                AbstractC4862t.d(name2, "name");
                return name2;
            } catch (Exception unused) {
                return activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString();
            }
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: z4.i$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public final Boolean invoke() {
            return Boolean.valueOf(C6512k.f48773a.a("androidx.fragment.app.FragmentActivity", C6510i.this.f48765a.r()));
        }
    }

    /* JADX INFO: renamed from: z4.i$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c extends C4844a implements p {
        public c(Object obj) {
            super(2, obj, C5485a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
        }

        public final void a(String p02, Map map) {
            AbstractC4862t.e(p02, "p0");
            D4.a.H((C5485a) this.receiver, p02, map, null, 4, null);
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Map) obj2);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: z4.i$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class d extends C4844a implements p {
        public d(Object obj) {
            super(2, obj, C5485a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
        }

        public final void a(String p02, Map map) {
            AbstractC4862t.e(p02, "p0");
            D4.a.H((C5485a) this.receiver, p02, map, null, 4, null);
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Map) obj2);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: z4.i$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class e extends C4844a implements p {
        public e(Object obj) {
            super(2, obj, C5485a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
        }

        public final void a(String p02, Map map) {
            AbstractC4862t.e(p02, "p0");
            D4.a.H((C5485a) this.receiver, p02, map, null, 4, null);
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (Map) obj2);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: z4.i$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f48768j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ D4.f f48770l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f48771m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f48772n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(D4.f fVar, String str, String str2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f48770l = fVar;
            this.f48771m = str;
            this.f48772n = str2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C6510i.this.new f(this.f48770l, this.f48771m, this.f48772n, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r6.k(r1, r3, r5) != r0) goto L21;
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
                int r1 = r5.f48768j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                fc.AbstractC4036s.b(r6)
                goto L59
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1d:
                fc.AbstractC4036s.b(r6)
                goto L4a
            L21:
                fc.AbstractC4036s.b(r6)
                goto L3b
            L25:
                fc.AbstractC4036s.b(r6)
                z4.i r6 = z4.C6510i.this
                q4.a r6 = z4.C6510i.a(r6)
                Rd.U r6 = r6.z()
                r5.f48768j = r4
                java.lang.Object r6 = r6.i(r5)
                if (r6 != r0) goto L3b
                goto L58
            L3b:
                D4.f r6 = r5.f48770l
                D4.f$a r1 = D4.f.a.APP_VERSION
                java.lang.String r4 = r5.f48771m
                r5.f48768j = r3
                java.lang.Object r6 = r6.k(r1, r4, r5)
                if (r6 != r0) goto L4a
                goto L58
            L4a:
                D4.f r6 = r5.f48770l
                D4.f$a r1 = D4.f.a.APP_BUILD
                java.lang.String r3 = r5.f48772n
                r5.f48768j = r2
                java.lang.Object r5 = r6.k(r1, r3, r5)
                if (r5 != r0) goto L59
            L58:
                return r0
            L59:
                fc.H r5 = fc.C4015H.f34254a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: z4.C6510i.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C6510i(C5485a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        this.f48765a = amplitude;
        this.f48766b = C4029l.b(new b());
    }

    public final Uri b(Activity activity) {
        return activity.getReferrer();
    }

    public final boolean c() {
        return ((Boolean) this.f48766b.getValue()).booleanValue();
    }

    public final void d(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        if (c()) {
            C5841b.f44746a.a(activity, new c(this.f48765a), this.f48765a.r());
        }
    }

    public final void e(Activity activity, C5492h c5492h, C5487c autocaptureState) {
        C4015H c4015h;
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(autocaptureState, "autocaptureState");
        Window window = activity.getWindow();
        if (window != null) {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new WindowCallbackC5916d();
            } else {
                AbstractC4862t.b(callback);
            }
            Window.Callback callback2 = callback;
            window.setCallback(c5492h != null ? new C5915c(callback2, activity, new d(this.f48765a), (List) C6040c.f45772a.a().invoke(this.f48765a.r()), this.f48765a.r(), autocaptureState, c5492h) : new C5914b(callback2, activity, new e(this.f48765a), (List) C6040c.f45772a.a().invoke(this.f48765a.r()), this.f48765a.r(), autocaptureState, null, null, null, 448, null));
            c4015h = C4015H.f34254a;
        } else {
            c4015h = null;
        }
        if (c4015h == null) {
            this.f48765a.r().d("Failed to track user interaction event: Activity window is null");
        }
    }

    public final void f(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        if (c()) {
            C5841b.f44746a.b(activity, this.f48765a.r());
        }
    }

    public final void g(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        Window window = activity.getWindow();
        if (window == null) {
            this.f48765a.r().d("Failed to stop user interaction event tracking: Activity window is null");
            return;
        }
        Window.Callback callback = window.getCallback();
        C5914b c5914b = callback instanceof C5914b ? (C5914b) callback : null;
        if (c5914b != null) {
            Window.Callback callbackA = c5914b.a();
            window.setCallback(callbackA instanceof WindowCallbackC5916d ? null : callbackA);
        }
    }

    public final void h() {
        D4.a.H(this.f48765a, "[Amplitude] Application Backgrounded", null, null, 6, null);
    }

    public final void i(PackageInfo packageInfo, boolean z10) {
        AbstractC4862t.e(packageInfo, "packageInfo");
        D4.a.H(this.f48765a, "[Amplitude] Application Opened", Q.l(AbstractC4040w.a("[Amplitude] From Background", Boolean.valueOf(z10)), AbstractC4040w.a("[Amplitude] Version", packageInfo.versionName), AbstractC4040w.a("[Amplitude] Build", AbstractC6511j.b(packageInfo).toString())), null, 4, null);
    }

    public final void j(PackageInfo packageInfo) {
        AbstractC4862t.e(packageInfo, "packageInfo");
        String str = packageInfo.versionName;
        if (str == null) {
            str = "Unknown";
        }
        String str2 = str;
        String string = AbstractC6511j.b(packageInfo).toString();
        D4.f fVarU = this.f48765a.u();
        String strI = fVarU.i(f.a.APP_VERSION);
        String strI2 = fVarU.i(f.a.APP_BUILD);
        if (strI2 == null) {
            D4.a.H(this.f48765a, "[Amplitude] Application Installed", Q.l(AbstractC4040w.a("[Amplitude] Version", str2), AbstractC4040w.a("[Amplitude] Build", string)), null, 4, null);
        } else if (!AbstractC4862t.a(string, strI2)) {
            D4.a.H(this.f48765a, "[Amplitude] Application Updated", Q.l(AbstractC4040w.a("[Amplitude] Previous Version", strI), AbstractC4040w.a("[Amplitude] Previous Build", strI2), AbstractC4040w.a("[Amplitude] Version", str2), AbstractC4040w.a("[Amplitude] Build", string)), null, 4, null);
        }
        AbstractC2132i.d(this.f48765a.k(), this.f48765a.v(), null, new f(fVarU, str2, string, null), 2, null);
    }

    public final void k(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent != null) {
            Uri uriB = b(activity);
            String string = uriB != null ? uriB.toString() : null;
            Uri data = intent.getData();
            if (data != null) {
                String string2 = data.toString();
                AbstractC4862t.d(string2, "toString(...)");
                D4.a.H(this.f48765a, "[Amplitude] Deep Link Opened", Q.l(AbstractC4040w.a("[Amplitude] Link URL", string2), AbstractC4040w.a("[Amplitude] Link Referrer", string)), null, 4, null);
            }
        }
    }

    public final void l(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        try {
            D4.a.H(this.f48765a, "[Amplitude] Screen Viewed", P.f(AbstractC4040w.a("[Amplitude] Screen Name", f48764c.a(activity))), null, 4, null);
        } catch (Exception e10) {
            this.f48765a.r().d("Failed to track screen viewed event: " + e10);
        }
    }
}
