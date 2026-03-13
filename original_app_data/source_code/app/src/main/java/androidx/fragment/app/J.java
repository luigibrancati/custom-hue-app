package androidx.fragment.app;

import Y0.InterfaceC2558l;
import Y0.InterfaceC2563q;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.S;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2758n;
import d.AbstractC3785D;
import d.C3788G;
import d.C3794b;
import d.InterfaceC3789H;
import f.C3982a;
import f.h;
import g.AbstractC4051a;
import i3.C4345f;
import i3.InterfaceC4348i;
import io.sentry.protocol.SentryThread;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.TikaCoreProperties;
import r1.AbstractC5525b;
import s1.C5706c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static boolean f23020U = false;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static boolean f23021V = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ComponentCallbacksC2736q f23022A;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public f.c f23027F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public f.c f23028G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public f.c f23029H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f23031J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f23032K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f23033L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f23034M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f23035N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList f23036O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList f23037P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayList f23038Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public M f23039R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C5706c.C0591c f23040S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23043b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f23046e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3788G f23048g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public A f23065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractC2742x f23066y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ComponentCallbacksC2736q f23067z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23042a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f23044c = new Q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f23045d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B f23047f = new B(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2720a f23049h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23050i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3785D f23051j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f23052k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f23053l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f23054m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f23055n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f23056o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C f23057p = new C(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f23058q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X0.a f23059r = new X0.a() { // from class: androidx.fragment.app.D
        @Override // X0.a
        public final void accept(Object obj) {
            J.f(this.f23009a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final X0.a f23060s = new X0.a() { // from class: androidx.fragment.app.E
        @Override // X0.a
        public final void accept(Object obj) {
            J.a(this.f23010a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final X0.a f23061t = new X0.a() { // from class: androidx.fragment.app.F
        @Override // X0.a
        public final void accept(Object obj) {
            J.e(this.f23011a, (androidx.core.app.h) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final X0.a f23062u = new X0.a() { // from class: androidx.fragment.app.G
        @Override // X0.a
        public final void accept(Object obj) {
            J.d(this.f23017a, (androidx.core.app.v) obj);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC2563q f23063v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23064w = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C2744z f23023B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C2744z f23024C = new d();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public b0 f23025D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public b0 f23026E = new e();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayDeque f23030I = new ArrayDeque();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Runnable f23041T = new f();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements f.b {
        public a() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l lVar = (l) J.this.f23030I.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVar.f23078a;
            int i11 = lVar.f23079b;
            ComponentCallbacksC2736q componentCallbacksC2736qI = J.this.f23044c.i(str);
            if (componentCallbacksC2736qI != null) {
                componentCallbacksC2736qI.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractC3785D {
        public b(boolean z10) {
            super(z10);
        }

        @Override // d.AbstractC3785D
        public void handleOnBackCancelled() {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + J.f23021V + " fragment manager " + J.this);
            }
            if (J.f23021V) {
                J.this.q();
            }
        }

        @Override // d.AbstractC3785D
        public void handleOnBackPressed() {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + J.f23021V + " fragment manager " + J.this);
            }
            J.this.H0();
        }

        @Override // d.AbstractC3785D
        public void handleOnBackProgressed(C3794b c3794b) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + J.f23021V + " fragment manager " + J.this);
            }
            J j10 = J.this;
            if (j10.f23049h != null) {
                Iterator it = j10.w(new ArrayList(Collections.singletonList(J.this.f23049h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((a0) it.next()).A(c3794b);
                }
                Iterator it2 = J.this.f23056o.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.a.a(it2.next());
                    throw null;
                }
            }
        }

        @Override // d.AbstractC3785D
        public void handleOnBackStarted(C3794b c3794b) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + J.f23021V + " fragment manager " + J.this);
            }
            if (J.f23021V) {
                J.this.Z();
                J.this.g1();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements InterfaceC2563q {
        public c() {
        }

        @Override // Y0.InterfaceC2563q
        public void a(Menu menu) {
            J.this.M(menu);
        }

        @Override // Y0.InterfaceC2563q
        public void b(Menu menu) {
            J.this.Q(menu);
        }

        @Override // Y0.InterfaceC2563q
        public boolean c(MenuItem menuItem) {
            return J.this.L(menuItem);
        }

        @Override // Y0.InterfaceC2563q
        public void d(Menu menu, MenuInflater menuInflater) {
            J.this.E(menu, menuInflater);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends C2744z {
        public d() {
        }

        @Override // androidx.fragment.app.C2744z
        public ComponentCallbacksC2736q a(ClassLoader classLoader, String str) {
            return J.this.y0().b(J.this.y0().f(), str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements b0 {
        public e() {
        }

        @Override // androidx.fragment.app.b0
        public a0 a(ViewGroup viewGroup) {
            return new C2725f(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            J.this.c0(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g implements N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacksC2736q f23074a;

        public g(ComponentCallbacksC2736q componentCallbacksC2736q) {
            this.f23074a = componentCallbacksC2736q;
        }

        @Override // androidx.fragment.app.N
        public void a(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
            this.f23074a.onAttachFragment(componentCallbacksC2736q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h implements f.b {
        public h() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3982a c3982a) {
            l lVar = (l) J.this.f23030I.pollLast();
            if (lVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVar.f23078a;
            int i10 = lVar.f23079b;
            ComponentCallbacksC2736q componentCallbacksC2736qI = J.this.f23044c.i(str);
            if (componentCallbacksC2736qI != null) {
                componentCallbacksC2736qI.onActivityResult(i10, c3982a.b(), c3982a.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i implements f.b {
        public i() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3982a c3982a) {
            l lVar = (l) J.this.f23030I.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVar.f23078a;
            int i10 = lVar.f23079b;
            ComponentCallbacksC2736q componentCallbacksC2736qI = J.this.f23044c.i(str);
            if (componentCallbacksC2736qI != null) {
                componentCallbacksC2736qI.onActivityResult(i10, c3982a.b(), c3982a.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j extends AbstractC4051a {
        @Override // g.AbstractC4051a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, f.h hVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = hVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new h.a(hVar.d()).b(null).c(hVar.c(), hVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (J.L0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // g.AbstractC4051a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C3982a c(int i10, Intent intent) {
            return new C3982a(i10, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class n implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23082c;

        public n(String str, int i10, int i11) {
            this.f23080a = str;
            this.f23081b = i10;
            this.f23082c = i11;
        }

        @Override // androidx.fragment.app.J.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            ComponentCallbacksC2736q componentCallbacksC2736q = J.this.f23022A;
            if (componentCallbacksC2736q == null || this.f23081b >= 0 || this.f23080a != null || !componentCallbacksC2736q.getChildFragmentManager().b1()) {
                return J.this.e1(arrayList, arrayList2, this.f23080a, this.f23081b, this.f23082c);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class o implements m {
        public o() {
        }

        @Override // androidx.fragment.app.J.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean zF1 = J.this.f1(arrayList, arrayList2);
            if (!J.this.f23056o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(J.this.q0((C2720a) it.next()));
                }
                Iterator it2 = J.this.f23056o.iterator();
                while (it2.hasNext()) {
                    android.support.v4.media.session.a.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
            }
            return zF1;
        }
    }

    public static ComponentCallbacksC2736q F0(View view) {
        Object tag = view.getTag(AbstractC5525b.f43504a);
        if (tag instanceof ComponentCallbacksC2736q) {
            return (ComponentCallbacksC2736q) tag;
        }
        return null;
    }

    public static boolean L0(int i10) {
        return f23020U || Log.isLoggable("FragmentManager", i10);
    }

    public static /* synthetic */ void a(J j10, Integer num) {
        if (j10.N0() && num.intValue() == 80) {
            j10.H(false);
        }
    }

    public static /* synthetic */ void c(J j10) {
        Iterator it = j10.f23056o.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.a.a(it.next());
            throw null;
        }
    }

    public static /* synthetic */ void d(J j10, androidx.core.app.v vVar) {
        if (j10.N0()) {
            j10.P(vVar.a(), false);
        }
    }

    public static /* synthetic */ void e(J j10, androidx.core.app.h hVar) {
        if (j10.N0()) {
            j10.I(hVar.a(), false);
        }
    }

    public static void e0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C2720a c2720a = (C2720a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c2720a.q(-1);
                c2720a.w();
            } else {
                c2720a.q(1);
                c2720a.v();
            }
            i10++;
        }
    }

    public static /* synthetic */ void f(J j10, Configuration configuration) {
        if (j10.N0()) {
            j10.B(configuration, false);
        }
    }

    public static ComponentCallbacksC2736q j0(View view) {
        ComponentCallbacksC2736q componentCallbacksC2736qO0 = o0(view);
        if (componentCallbacksC2736qO0 != null) {
            return componentCallbacksC2736qO0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static J n0(View view) {
        ActivityC2740v activityC2740v;
        ComponentCallbacksC2736q componentCallbacksC2736qO0 = o0(view);
        if (componentCallbacksC2736qO0 != null) {
            if (componentCallbacksC2736qO0.isAdded()) {
                return componentCallbacksC2736qO0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + componentCallbacksC2736qO0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activityC2740v = null;
                break;
            }
            if (context instanceof ActivityC2740v) {
                activityC2740v = (ActivityC2740v) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activityC2740v != null) {
            return activityC2740v.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static int n1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static ComponentCallbacksC2736q o0(View view) {
        while (view != null) {
            ComponentCallbacksC2736q componentCallbacksC2736qF0 = F0(view);
            if (componentCallbacksC2736qF0 != null) {
                return componentCallbacksC2736qF0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public void A() {
        this.f23032K = false;
        this.f23033L = false;
        this.f23039R.p(false);
        U(0);
    }

    public C A0() {
        return this.f23057p;
    }

    public void B(Configuration configuration, boolean z10) {
        if (z10 && (this.f23065x instanceof L0.d)) {
            w1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.performConfigurationChanged(configuration);
                if (z10) {
                    componentCallbacksC2736q.mChildFragmentManager.B(configuration, true);
                }
            }
        }
    }

    public ComponentCallbacksC2736q B0() {
        return this.f23067z;
    }

    public boolean C(MenuItem menuItem) {
        if (this.f23064w < 1) {
            return false;
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null && componentCallbacksC2736q.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public ComponentCallbacksC2736q C0() {
        return this.f23022A;
    }

    public void D() {
        this.f23032K = false;
        this.f23033L = false;
        this.f23039R.p(false);
        U(1);
    }

    public b0 D0() {
        b0 b0Var = this.f23025D;
        if (b0Var != null) {
            return b0Var;
        }
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23067z;
        return componentCallbacksC2736q != null ? componentCallbacksC2736q.mFragmentManager.D0() : this.f23026E;
    }

    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f23064w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null && P0(componentCallbacksC2736q) && componentCallbacksC2736q.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC2736q);
                z10 = true;
            }
        }
        if (this.f23046e != null) {
            for (int i10 = 0; i10 < this.f23046e.size(); i10++) {
                ComponentCallbacksC2736q componentCallbacksC2736q2 = (ComponentCallbacksC2736q) this.f23046e.get(i10);
                if (arrayList == null || !arrayList.contains(componentCallbacksC2736q2)) {
                    componentCallbacksC2736q2.onDestroyOptionsMenu();
                }
            }
        }
        this.f23046e = arrayList;
        return z10;
    }

    public C5706c.C0591c E0() {
        return this.f23040S;
    }

    public void F() {
        this.f23034M = true;
        c0(true);
        Z();
        u();
        U(-1);
        Object obj = this.f23065x;
        if (obj instanceof L0.e) {
            ((L0.e) obj).removeOnTrimMemoryListener(this.f23060s);
        }
        Object obj2 = this.f23065x;
        if (obj2 instanceof L0.d) {
            ((L0.d) obj2).removeOnConfigurationChangedListener(this.f23059r);
        }
        Object obj3 = this.f23065x;
        if (obj3 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj3).removeOnMultiWindowModeChangedListener(this.f23061t);
        }
        Object obj4 = this.f23065x;
        if (obj4 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj4).removeOnPictureInPictureModeChangedListener(this.f23062u);
        }
        Object obj5 = this.f23065x;
        if ((obj5 instanceof InterfaceC2558l) && this.f23067z == null) {
            ((InterfaceC2558l) obj5).removeMenuProvider(this.f23063v);
        }
        this.f23065x = null;
        this.f23066y = null;
        this.f23067z = null;
        if (this.f23048g != null) {
            this.f23051j.remove();
            this.f23048g = null;
        }
        f.c cVar = this.f23027F;
        if (cVar != null) {
            cVar.c();
            this.f23028G.c();
            this.f23029H.c();
        }
    }

    public void G() {
        U(1);
    }

    public androidx.lifecycle.P G0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        return this.f23039R.m(componentCallbacksC2736q);
    }

    public void H(boolean z10) {
        if (z10 && (this.f23065x instanceof L0.e)) {
            w1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.performLowMemory();
                if (z10) {
                    componentCallbacksC2736q.mChildFragmentManager.H(true);
                }
            }
        }
    }

    public void H0() {
        this.f23050i = true;
        c0(true);
        this.f23050i = false;
        if (!f23021V || this.f23049h == null) {
            if (this.f23051j.isEnabled()) {
                if (L0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                b1();
                return;
            } else {
                if (L0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f23048g.h();
                return;
            }
        }
        if (!this.f23056o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(q0(this.f23049h));
            Iterator it = this.f23056o.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.a.a(it.next());
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = this.f23049h.f23130c.iterator();
        while (it3.hasNext()) {
            ComponentCallbacksC2736q componentCallbacksC2736q = ((S.a) it3.next()).f23148b;
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.mTransitioning = false;
            }
        }
        Iterator it4 = w(new ArrayList(Collections.singletonList(this.f23049h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((a0) it4.next()).f();
        }
        Iterator it5 = this.f23049h.f23130c.iterator();
        while (it5.hasNext()) {
            ComponentCallbacksC2736q componentCallbacksC2736q2 = ((S.a) it5.next()).f23148b;
            if (componentCallbacksC2736q2 != null && componentCallbacksC2736q2.mContainer == null) {
                x(componentCallbacksC2736q2).m();
            }
        }
        this.f23049h = null;
        y1();
        if (L0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f23051j.isEnabled() + " for  FragmentManager " + this);
        }
    }

    public void I(boolean z10, boolean z11) {
        if (z11 && (this.f23065x instanceof androidx.core.app.r)) {
            w1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.performMultiWindowModeChanged(z10);
                if (z11) {
                    componentCallbacksC2736q.mChildFragmentManager.I(z10, true);
                }
            }
        }
    }

    public void I0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (L0(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC2736q);
        }
        if (componentCallbacksC2736q.mHidden) {
            return;
        }
        componentCallbacksC2736q.mHidden = true;
        componentCallbacksC2736q.mHiddenChanged = true ^ componentCallbacksC2736q.mHiddenChanged;
        t1(componentCallbacksC2736q);
    }

    public void J(ComponentCallbacksC2736q componentCallbacksC2736q) {
        Iterator it = this.f23058q.iterator();
        while (it.hasNext()) {
            ((N) it.next()).a(this, componentCallbacksC2736q);
        }
    }

    public void J0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (componentCallbacksC2736q.mAdded && M0(componentCallbacksC2736q)) {
            this.f23031J = true;
        }
    }

    public void K() {
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.l()) {
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.onHiddenChanged(componentCallbacksC2736q.isHidden());
                componentCallbacksC2736q.mChildFragmentManager.K();
            }
        }
    }

    public boolean K0() {
        return this.f23034M;
    }

    public boolean L(MenuItem menuItem) {
        if (this.f23064w < 1) {
            return false;
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null && componentCallbacksC2736q.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void M(Menu menu) {
        if (this.f23064w < 1) {
            return;
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.performOptionsMenuClosed(menu);
            }
        }
    }

    public final boolean M0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        return (componentCallbacksC2736q.mHasMenu && componentCallbacksC2736q.mMenuVisible) || componentCallbacksC2736q.mChildFragmentManager.r();
    }

    public final void N(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (componentCallbacksC2736q == null || !componentCallbacksC2736q.equals(h0(componentCallbacksC2736q.mWho))) {
            return;
        }
        componentCallbacksC2736q.performPrimaryNavigationFragmentChanged();
    }

    public final boolean N0() {
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23067z;
        if (componentCallbacksC2736q == null) {
            return true;
        }
        return componentCallbacksC2736q.isAdded() && this.f23067z.getParentFragmentManager().N0();
    }

    public void O() {
        U(5);
    }

    public boolean O0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (componentCallbacksC2736q == null) {
            return false;
        }
        return componentCallbacksC2736q.isHidden();
    }

    public void P(boolean z10, boolean z11) {
        if (z11 && (this.f23065x instanceof androidx.core.app.s)) {
            w1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.performPictureInPictureModeChanged(z10);
                if (z11) {
                    componentCallbacksC2736q.mChildFragmentManager.P(z10, true);
                }
            }
        }
    }

    public boolean P0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (componentCallbacksC2736q == null) {
            return true;
        }
        return componentCallbacksC2736q.isMenuVisible();
    }

    public boolean Q(Menu menu) {
        boolean z10 = false;
        if (this.f23064w < 1) {
            return false;
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null && P0(componentCallbacksC2736q) && componentCallbacksC2736q.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean Q0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (componentCallbacksC2736q == null) {
            return true;
        }
        J j10 = componentCallbacksC2736q.mFragmentManager;
        return componentCallbacksC2736q.equals(j10.C0()) && Q0(j10.f23067z);
    }

    public void R() {
        y1();
        N(this.f23022A);
    }

    public boolean R0(int i10) {
        return this.f23064w >= i10;
    }

    public void S() {
        this.f23032K = false;
        this.f23033L = false;
        this.f23039R.p(false);
        U(7);
    }

    public boolean S0() {
        return this.f23032K || this.f23033L;
    }

    public void T() {
        this.f23032K = false;
        this.f23033L = false;
        this.f23039R.p(false);
        U(5);
    }

    public void T0(ComponentCallbacksC2736q componentCallbacksC2736q, String[] strArr, int i10) {
        if (this.f23029H == null) {
            this.f23065x.l(componentCallbacksC2736q, strArr, i10);
            return;
        }
        this.f23030I.addLast(new l(componentCallbacksC2736q.mWho, i10));
        this.f23029H.a(strArr);
    }

    public final void U(int i10) {
        try {
            this.f23043b = true;
            this.f23044c.d(i10);
            W0(i10, false);
            Iterator it = v().iterator();
            while (it.hasNext()) {
                ((a0) it.next()).q();
            }
            this.f23043b = false;
            c0(true);
        } catch (Throwable th) {
            this.f23043b = false;
            throw th;
        }
    }

    public void U0(ComponentCallbacksC2736q componentCallbacksC2736q, Intent intent, int i10, Bundle bundle) {
        if (this.f23027F == null) {
            this.f23065x.n(componentCallbacksC2736q, intent, i10, bundle);
            return;
        }
        this.f23030I.addLast(new l(componentCallbacksC2736q.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f23027F.a(intent);
    }

    public void V() {
        this.f23033L = true;
        this.f23039R.p(true);
        U(4);
    }

    public void V0(ComponentCallbacksC2736q componentCallbacksC2736q, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.f23028G == null) {
            this.f23065x.o(componentCallbacksC2736q, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (L0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + componentCallbacksC2736q);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        f.h hVarA = new h.a(intentSender).b(intent).c(i12, i11).a();
        this.f23030I.addLast(new l(componentCallbacksC2736q.mWho, i10));
        if (L0(2)) {
            Log.v("FragmentManager", "Fragment " + componentCallbacksC2736q + "is launching an IntentSender for result ");
        }
        this.f23028G.a(hVarA);
    }

    public void W() {
        U(2);
    }

    public void W0(int i10, boolean z10) {
        A a10;
        if (this.f23065x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f23064w) {
            this.f23064w = i10;
            this.f23044c.t();
            v1();
            if (this.f23031J && (a10 = this.f23065x) != null && this.f23064w == 7) {
                a10.p();
                this.f23031J = false;
            }
        }
    }

    public final void X() {
        if (this.f23035N) {
            this.f23035N = false;
            v1();
        }
    }

    public void X0() {
        if (this.f23065x == null) {
            return;
        }
        this.f23032K = false;
        this.f23033L = false;
        this.f23039R.p(false);
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.o()) {
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.noteStateNotSaved();
            }
        }
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f23044c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f23046e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                ComponentCallbacksC2736q componentCallbacksC2736q = (ComponentCallbacksC2736q) this.f23046e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC2736q.toString());
            }
        }
        int size2 = this.f23045d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C2720a c2720a = (C2720a) this.f23045d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c2720a.toString());
                c2720a.t(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f23052k.get());
        synchronized (this.f23042a) {
            try {
                int size3 = this.f23042a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        m mVar = (m) this.f23042a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f23065x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f23066y);
        if (this.f23067z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f23067z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f23064w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f23032K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f23033L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f23034M);
        if (this.f23031J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f23031J);
        }
    }

    public final void Y0(FragmentContainerView fragmentContainerView) {
        View view;
        for (P p10 : this.f23044c.k()) {
            ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
            if (componentCallbacksC2736qK.mContainerId == fragmentContainerView.getId() && (view = componentCallbacksC2736qK.mView) != null && view.getParent() == null) {
                componentCallbacksC2736qK.mContainer = fragmentContainerView;
                p10.b();
                p10.m();
            }
        }
    }

    public final void Z() {
        Iterator it = v().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).q();
        }
    }

    public void Z0(P p10) {
        ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
        if (componentCallbacksC2736qK.mDeferStart) {
            if (this.f23043b) {
                this.f23035N = true;
            } else {
                componentCallbacksC2736qK.mDeferStart = false;
                p10.m();
            }
        }
    }

    public void a0(m mVar, boolean z10) {
        if (!z10) {
            if (this.f23065x == null) {
                if (!this.f23034M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            s();
        }
        synchronized (this.f23042a) {
            try {
                if (this.f23065x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f23042a.add(mVar);
                    p1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            a0(new n(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public final void b0(boolean z10) {
        if (this.f23043b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f23065x == null) {
            if (!this.f23034M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f23065x.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            s();
        }
        if (this.f23036O == null) {
            this.f23036O = new ArrayList();
            this.f23037P = new ArrayList();
        }
    }

    public boolean b1() {
        return d1(null, -1, 0);
    }

    public boolean c0(boolean z10) {
        C2720a c2720a;
        b0(z10);
        boolean z11 = false;
        if (!this.f23050i && (c2720a = this.f23049h) != null) {
            c2720a.f23194u = false;
            c2720a.r();
            if (L0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f23049h + " as part of execPendingActions for actions " + this.f23042a);
            }
            this.f23049h.s(false, false);
            this.f23042a.add(0, this.f23049h);
            Iterator it = this.f23049h.f23130c.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC2736q componentCallbacksC2736q = ((S.a) it.next()).f23148b;
                if (componentCallbacksC2736q != null) {
                    componentCallbacksC2736q.mTransitioning = false;
                }
            }
            this.f23049h = null;
        }
        while (r0(this.f23036O, this.f23037P)) {
            z11 = true;
            this.f23043b = true;
            try {
                j1(this.f23036O, this.f23037P);
            } finally {
                t();
            }
        }
        y1();
        X();
        this.f23044c.b();
        return z11;
    }

    public boolean c1(int i10, int i11) {
        if (i10 >= 0) {
            return d1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void d0(m mVar, boolean z10) {
        if (z10 && (this.f23065x == null || this.f23034M)) {
            return;
        }
        b0(z10);
        C2720a c2720a = this.f23049h;
        boolean z11 = false;
        if (c2720a != null) {
            c2720a.f23194u = false;
            c2720a.r();
            if (L0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f23049h + " as part of execSingleAction for action " + mVar);
            }
            this.f23049h.s(false, false);
            boolean zA = this.f23049h.a(this.f23036O, this.f23037P);
            Iterator it = this.f23049h.f23130c.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC2736q componentCallbacksC2736q = ((S.a) it.next()).f23148b;
                if (componentCallbacksC2736q != null) {
                    componentCallbacksC2736q.mTransitioning = false;
                }
            }
            this.f23049h = null;
            z11 = zA;
        }
        boolean zA2 = mVar.a(this.f23036O, this.f23037P);
        if (z11 || zA2) {
            this.f23043b = true;
            try {
                j1(this.f23036O, this.f23037P);
            } finally {
                t();
            }
        }
        y1();
        X();
        this.f23044c.b();
    }

    public final boolean d1(String str, int i10, int i11) {
        c0(false);
        b0(true);
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23022A;
        if (componentCallbacksC2736q != null && i10 < 0 && str == null && componentCallbacksC2736q.getChildFragmentManager().b1()) {
            return true;
        }
        boolean zE1 = e1(this.f23036O, this.f23037P, str, i10, i11);
        if (zE1) {
            this.f23043b = true;
            try {
                j1(this.f23036O, this.f23037P);
            } finally {
                t();
            }
        }
        y1();
        X();
        this.f23044c.b();
        return zE1;
    }

    public boolean e1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iI0 = i0(str, i10, (i11 & 1) != 0);
        if (iI0 < 0) {
            return false;
        }
        for (int size = this.f23045d.size() - 1; size >= iI0; size--) {
            arrayList.add((C2720a) this.f23045d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void f0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = ((C2720a) arrayList.get(i10)).f23145r;
        ArrayList arrayList3 = this.f23038Q;
        if (arrayList3 == null) {
            this.f23038Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f23038Q.addAll(this.f23044c.o());
        ComponentCallbacksC2736q componentCallbacksC2736qC0 = C0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C2720a c2720a = (C2720a) arrayList.get(i12);
            componentCallbacksC2736qC0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? c2720a.x(this.f23038Q, componentCallbacksC2736qC0) : c2720a.A(this.f23038Q, componentCallbacksC2736qC0);
            z11 = z11 || c2720a.f23136i;
        }
        this.f23038Q.clear();
        if (!z10 && this.f23064w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((C2720a) arrayList.get(i13)).f23130c.iterator();
                while (it.hasNext()) {
                    ComponentCallbacksC2736q componentCallbacksC2736q = ((S.a) it.next()).f23148b;
                    if (componentCallbacksC2736q != null && componentCallbacksC2736q.mFragmentManager != null) {
                        this.f23044c.r(x(componentCallbacksC2736q));
                    }
                }
            }
        }
        e0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && !this.f23056o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(q0((C2720a) it2.next()));
            }
            if (this.f23049h == null) {
                Iterator it3 = this.f23056o.iterator();
                while (it3.hasNext()) {
                    android.support.v4.media.session.a.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = this.f23056o.iterator();
                while (it5.hasNext()) {
                    android.support.v4.media.session.a.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C2720a c2720a2 = (C2720a) arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = c2720a2.f23130c.size() - 1; size >= 0; size--) {
                    ComponentCallbacksC2736q componentCallbacksC2736q2 = ((S.a) c2720a2.f23130c.get(size)).f23148b;
                    if (componentCallbacksC2736q2 != null) {
                        x(componentCallbacksC2736q2).m();
                    }
                }
            } else {
                Iterator it7 = c2720a2.f23130c.iterator();
                while (it7.hasNext()) {
                    ComponentCallbacksC2736q componentCallbacksC2736q3 = ((S.a) it7.next()).f23148b;
                    if (componentCallbacksC2736q3 != null) {
                        x(componentCallbacksC2736q3).m();
                    }
                }
            }
        }
        W0(this.f23064w, true);
        for (a0 a0Var : w(arrayList, i10, i11)) {
            a0Var.D(zBooleanValue);
            a0Var.z();
            a0Var.n();
        }
        while (i10 < i11) {
            C2720a c2720a3 = (C2720a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && c2720a3.f23195v >= 0) {
                c2720a3.f23195v = -1;
            }
            c2720a3.z();
            i10++;
        }
        if (z11) {
            l1();
        }
    }

    public boolean f1(ArrayList arrayList, ArrayList arrayList2) {
        if (L0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f23042a);
        }
        if (this.f23045d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList arrayList3 = this.f23045d;
        C2720a c2720a = (C2720a) arrayList3.get(arrayList3.size() - 1);
        this.f23049h = c2720a;
        Iterator it = c2720a.f23130c.iterator();
        while (it.hasNext()) {
            ComponentCallbacksC2736q componentCallbacksC2736q = ((S.a) it.next()).f23148b;
            if (componentCallbacksC2736q != null) {
                componentCallbacksC2736q.mTransitioning = true;
            }
        }
        return e1(arrayList, arrayList2, null, -1, 0);
    }

    public boolean g0() {
        boolean zC0 = c0(true);
        p0();
        return zC0;
    }

    public void g1() {
        a0(new o(), false);
    }

    public ComponentCallbacksC2736q h0(String str) {
        return this.f23044c.f(str);
    }

    public void h1(k kVar, boolean z10) {
        this.f23057p.o(kVar, z10);
    }

    public void i(C2720a c2720a) {
        this.f23045d.add(c2720a);
    }

    public final int i0(String str, int i10, boolean z10) {
        if (this.f23045d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f23045d.size() - 1;
        }
        int size = this.f23045d.size() - 1;
        while (size >= 0) {
            C2720a c2720a = (C2720a) this.f23045d.get(size);
            if ((str != null && str.equals(c2720a.y())) || (i10 >= 0 && i10 == c2720a.f23195v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f23045d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2720a c2720a2 = (C2720a) this.f23045d.get(size - 1);
            if ((str == null || !str.equals(c2720a2.y())) && (i10 < 0 || i10 != c2720a2.f23195v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void i1(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (L0(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC2736q + " nesting=" + componentCallbacksC2736q.mBackStackNesting);
        }
        boolean zIsInBackStack = componentCallbacksC2736q.isInBackStack();
        if (componentCallbacksC2736q.mDetached && zIsInBackStack) {
            return;
        }
        this.f23044c.u(componentCallbacksC2736q);
        if (M0(componentCallbacksC2736q)) {
            this.f23031J = true;
        }
        componentCallbacksC2736q.mRemoving = true;
        t1(componentCallbacksC2736q);
    }

    public P j(ComponentCallbacksC2736q componentCallbacksC2736q) {
        String str = componentCallbacksC2736q.mPreviousWho;
        if (str != null) {
            C5706c.f(componentCallbacksC2736q, str);
        }
        if (L0(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC2736q);
        }
        P pX = x(componentCallbacksC2736q);
        componentCallbacksC2736q.mFragmentManager = this;
        this.f23044c.r(pX);
        if (!componentCallbacksC2736q.mDetached) {
            this.f23044c.a(componentCallbacksC2736q);
            componentCallbacksC2736q.mRemoving = false;
            if (componentCallbacksC2736q.mView == null) {
                componentCallbacksC2736q.mHiddenChanged = false;
            }
            if (M0(componentCallbacksC2736q)) {
                this.f23031J = true;
            }
        }
        return pX;
    }

    public final void j1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C2720a) arrayList.get(i10)).f23145r) {
                if (i11 != i10) {
                    f0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C2720a) arrayList.get(i11)).f23145r) {
                        i11++;
                    }
                }
                f0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            f0(arrayList, arrayList2, i11, size);
        }
    }

    public void k(N n10) {
        this.f23058q.add(n10);
    }

    public ComponentCallbacksC2736q k0(int i10) {
        return this.f23044c.g(i10);
    }

    public void k1(ComponentCallbacksC2736q componentCallbacksC2736q) {
        this.f23039R.o(componentCallbacksC2736q);
    }

    public void l(ComponentCallbacksC2736q componentCallbacksC2736q) {
        this.f23039R.e(componentCallbacksC2736q);
    }

    public ComponentCallbacksC2736q l0(String str) {
        return this.f23044c.h(str);
    }

    public final void l1() {
        if (this.f23056o.size() <= 0) {
            return;
        }
        android.support.v4.media.session.a.a(this.f23056o.get(0));
        throw null;
    }

    public int m() {
        return this.f23052k.getAndIncrement();
    }

    public ComponentCallbacksC2736q m0(String str) {
        return this.f23044c.i(str);
    }

    public void m1(Parcelable parcelable) {
        P p10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f23065x.f().getClassLoader());
                this.f23054m.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f23065x.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f23044c.x(map);
        L l10 = (L) bundle3.getParcelable(SentryThread.JsonKeys.STATE);
        if (l10 == null) {
            return;
        }
        this.f23044c.v();
        Iterator it = l10.f23085a.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f23044c.B((String) it.next(), null);
            if (bundleB != null) {
                ComponentCallbacksC2736q componentCallbacksC2736qI = this.f23039R.i(((O) bundleB.getParcelable(SentryThread.JsonKeys.STATE)).f23102b);
                if (componentCallbacksC2736qI != null) {
                    if (L0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + componentCallbacksC2736qI);
                    }
                    p10 = new P(this.f23057p, this.f23044c, componentCallbacksC2736qI, bundleB);
                } else {
                    p10 = new P(this.f23057p, this.f23044c, this.f23065x.f().getClassLoader(), w0(), bundleB);
                }
                ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
                componentCallbacksC2736qK.mSavedFragmentState = bundleB;
                componentCallbacksC2736qK.mFragmentManager = this;
                if (L0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + componentCallbacksC2736qK.mWho + "): " + componentCallbacksC2736qK);
                }
                p10.o(this.f23065x.f().getClassLoader());
                this.f23044c.r(p10);
                p10.s(this.f23064w);
            }
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23039R.l()) {
            if (!this.f23044c.c(componentCallbacksC2736q.mWho)) {
                if (L0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC2736q + " that was not found in the set of active Fragments " + l10.f23085a);
                }
                this.f23039R.o(componentCallbacksC2736q);
                componentCallbacksC2736q.mFragmentManager = this;
                P p11 = new P(this.f23057p, this.f23044c, componentCallbacksC2736q);
                p11.s(1);
                p11.m();
                componentCallbacksC2736q.mRemoving = true;
                p11.m();
            }
        }
        this.f23044c.w(l10.f23086b);
        if (l10.f23087c != null) {
            this.f23045d = new ArrayList(l10.f23087c.length);
            int i10 = 0;
            while (true) {
                C2721b[] c2721bArr = l10.f23087c;
                if (i10 >= c2721bArr.length) {
                    break;
                }
                C2720a c2720aB = c2721bArr[i10].b(this);
                if (L0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + c2720aB.f23195v + "): " + c2720aB);
                    PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
                    c2720aB.u("  ", printWriter, false);
                    printWriter.close();
                }
                this.f23045d.add(c2720aB);
                i10++;
            }
        } else {
            this.f23045d = new ArrayList();
        }
        this.f23052k.set(l10.f23088d);
        String str3 = l10.f23089e;
        if (str3 != null) {
            ComponentCallbacksC2736q componentCallbacksC2736qH0 = h0(str3);
            this.f23022A = componentCallbacksC2736qH0;
            N(componentCallbacksC2736qH0);
        }
        ArrayList arrayList = l10.f23090f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f23053l.put((String) arrayList.get(i11), (C2722c) l10.f23091g.get(i11));
            }
        }
        this.f23030I = new ArrayDeque(l10.f23092h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(A a10, AbstractC2742x abstractC2742x, ComponentCallbacksC2736q componentCallbacksC2736q) {
        String str;
        if (this.f23065x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f23065x = a10;
        this.f23066y = abstractC2742x;
        this.f23067z = componentCallbacksC2736q;
        if (componentCallbacksC2736q != null) {
            k(new g(componentCallbacksC2736q));
        } else if (a10 instanceof N) {
            k((N) a10);
        }
        if (this.f23067z != null) {
            y1();
        }
        if (a10 instanceof InterfaceC3789H) {
            InterfaceC3789H interfaceC3789H = (InterfaceC3789H) a10;
            C3788G onBackPressedDispatcher = interfaceC3789H.getOnBackPressedDispatcher();
            this.f23048g = onBackPressedDispatcher;
            InterfaceC2758n interfaceC2758n = interfaceC3789H;
            if (componentCallbacksC2736q != null) {
                interfaceC2758n = componentCallbacksC2736q;
            }
            onBackPressedDispatcher.d(interfaceC2758n, this.f23051j);
        }
        if (componentCallbacksC2736q != null) {
            this.f23039R = componentCallbacksC2736q.mFragmentManager.t0(componentCallbacksC2736q);
        } else if (a10 instanceof androidx.lifecycle.Q) {
            this.f23039R = M.k(((androidx.lifecycle.Q) a10).getViewModelStore());
        } else {
            this.f23039R = new M(false);
        }
        this.f23039R.p(S0());
        this.f23044c.A(this.f23039R);
        Object obj = this.f23065x;
        if ((obj instanceof InterfaceC4348i) && componentCallbacksC2736q == null) {
            C4345f savedStateRegistry = ((InterfaceC4348i) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C4345f.b() { // from class: androidx.fragment.app.H
                @Override // i3.C4345f.b
                public final Bundle a() {
                    return this.f23018a.o1();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                m1(bundleA);
            }
        }
        Object obj2 = this.f23065x;
        if (obj2 instanceof f.g) {
            f.f activityResultRegistry = ((f.g) obj2).getActivityResultRegistry();
            if (componentCallbacksC2736q != null) {
                str = componentCallbacksC2736q.mWho + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f23027F = activityResultRegistry.o(str2 + "StartActivityForResult", new g.g(), new h());
            this.f23028G = activityResultRegistry.o(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f23029H = activityResultRegistry.o(str2 + "RequestPermissions", new g.e(), new a());
        }
        Object obj3 = this.f23065x;
        if (obj3 instanceof L0.d) {
            ((L0.d) obj3).addOnConfigurationChangedListener(this.f23059r);
        }
        Object obj4 = this.f23065x;
        if (obj4 instanceof L0.e) {
            ((L0.e) obj4).addOnTrimMemoryListener(this.f23060s);
        }
        Object obj5 = this.f23065x;
        if (obj5 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj5).addOnMultiWindowModeChangedListener(this.f23061t);
        }
        Object obj6 = this.f23065x;
        if (obj6 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj6).addOnPictureInPictureModeChangedListener(this.f23062u);
        }
        Object obj7 = this.f23065x;
        if ((obj7 instanceof InterfaceC2558l) && componentCallbacksC2736q == null) {
            ((InterfaceC2558l) obj7).addMenuProvider(this.f23063v);
        }
    }

    public void o(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (L0(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC2736q);
        }
        if (componentCallbacksC2736q.mDetached) {
            componentCallbacksC2736q.mDetached = false;
            if (componentCallbacksC2736q.mAdded) {
                return;
            }
            this.f23044c.a(componentCallbacksC2736q);
            if (L0(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC2736q);
            }
            if (M0(componentCallbacksC2736q)) {
                this.f23031J = true;
            }
        }
    }

    public Bundle o1() {
        C2721b[] c2721bArr;
        Bundle bundle = new Bundle();
        p0();
        Z();
        c0(true);
        this.f23032K = true;
        this.f23039R.p(true);
        ArrayList arrayListY = this.f23044c.y();
        HashMap mapM = this.f23044c.m();
        if (!mapM.isEmpty()) {
            ArrayList arrayListZ = this.f23044c.z();
            int size = this.f23045d.size();
            if (size > 0) {
                c2721bArr = new C2721b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c2721bArr[i10] = new C2721b((C2720a) this.f23045d.get(i10));
                    if (L0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f23045d.get(i10));
                    }
                }
            } else {
                c2721bArr = null;
            }
            L l10 = new L();
            l10.f23085a = arrayListY;
            l10.f23086b = arrayListZ;
            l10.f23087c = c2721bArr;
            l10.f23088d = this.f23052k.get();
            ComponentCallbacksC2736q componentCallbacksC2736q = this.f23022A;
            if (componentCallbacksC2736q != null) {
                l10.f23089e = componentCallbacksC2736q.mWho;
            }
            l10.f23090f.addAll(this.f23053l.keySet());
            l10.f23091g.addAll(this.f23053l.values());
            l10.f23092h = new ArrayList(this.f23030I);
            bundle.putParcelable(SentryThread.JsonKeys.STATE, l10);
            for (String str : this.f23054m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f23054m.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
            }
        } else if (L0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public S p() {
        return new C2720a(this);
    }

    public final void p0() {
        Iterator it = v().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).r();
        }
    }

    public void p1() {
        synchronized (this.f23042a) {
            try {
                if (this.f23042a.size() == 1) {
                    this.f23065x.h().removeCallbacks(this.f23041T);
                    this.f23065x.h().post(this.f23041T);
                    y1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q() {
        if (L0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f23049h);
        }
        C2720a c2720a = this.f23049h;
        if (c2720a != null) {
            c2720a.f23194u = false;
            c2720a.r();
            this.f23049h.o(true, new Runnable() { // from class: androidx.fragment.app.I
                @Override // java.lang.Runnable
                public final void run() {
                    J.c(this.f23019a);
                }
            });
            this.f23049h.f();
            this.f23050i = true;
            g0();
            this.f23050i = false;
            this.f23049h = null;
        }
    }

    public Set q0(C2720a c2720a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c2720a.f23130c.size(); i10++) {
            ComponentCallbacksC2736q componentCallbacksC2736q = ((S.a) c2720a.f23130c.get(i10)).f23148b;
            if (componentCallbacksC2736q != null && c2720a.f23136i) {
                hashSet.add(componentCallbacksC2736q);
            }
        }
        return hashSet;
    }

    public void q1(ComponentCallbacksC2736q componentCallbacksC2736q, boolean z10) {
        ViewGroup viewGroupV0 = v0(componentCallbacksC2736q);
        if (viewGroupV0 == null || !(viewGroupV0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupV0).setDrawDisappearingViewsLast(!z10);
    }

    public boolean r() {
        boolean zM0 = false;
        for (ComponentCallbacksC2736q componentCallbacksC2736q : this.f23044c.l()) {
            if (componentCallbacksC2736q != null) {
                zM0 = M0(componentCallbacksC2736q);
            }
            if (zM0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f23042a) {
            if (this.f23042a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f23042a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((m) this.f23042a.get(i10)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f23042a.clear();
                this.f23065x.h().removeCallbacks(this.f23041T);
            }
        }
    }

    public void r1(ComponentCallbacksC2736q componentCallbacksC2736q, AbstractC2754j.b bVar) {
        if (componentCallbacksC2736q.equals(h0(componentCallbacksC2736q.mWho)) && (componentCallbacksC2736q.mHost == null || componentCallbacksC2736q.mFragmentManager == this)) {
            componentCallbacksC2736q.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC2736q + " is not an active fragment of FragmentManager " + this);
    }

    public final void s() {
        if (S0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public int s0() {
        return this.f23045d.size() + (this.f23049h != null ? 1 : 0);
    }

    public void s1(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (componentCallbacksC2736q == null || (componentCallbacksC2736q.equals(h0(componentCallbacksC2736q.mWho)) && (componentCallbacksC2736q.mHost == null || componentCallbacksC2736q.mFragmentManager == this))) {
            ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23022A;
            this.f23022A = componentCallbacksC2736q;
            N(componentCallbacksC2736q2);
            N(this.f23022A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC2736q + " is not an active fragment of FragmentManager " + this);
    }

    public final void t() {
        this.f23043b = false;
        this.f23037P.clear();
        this.f23036O.clear();
    }

    public final M t0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        return this.f23039R.j(componentCallbacksC2736q);
    }

    public final void t1(ComponentCallbacksC2736q componentCallbacksC2736q) {
        ViewGroup viewGroupV0 = v0(componentCallbacksC2736q);
        if (viewGroupV0 == null || componentCallbacksC2736q.getEnterAnim() + componentCallbacksC2736q.getExitAnim() + componentCallbacksC2736q.getPopEnterAnim() + componentCallbacksC2736q.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupV0.getTag(AbstractC5525b.f43506c) == null) {
            viewGroupV0.setTag(AbstractC5525b.f43506c, componentCallbacksC2736q);
        }
        ((ComponentCallbacksC2736q) viewGroupV0.getTag(AbstractC5525b.f43506c)).setPopDirection(componentCallbacksC2736q.getPopDirection());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23067z;
        if (componentCallbacksC2736q != null) {
            sb2.append(componentCallbacksC2736q.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f23067z)));
            sb2.append("}");
        } else {
            A a10 = this.f23065x;
            if (a10 != null) {
                sb2.append(a10.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f23065x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u() {
        A a10 = this.f23065x;
        if (a10 instanceof androidx.lifecycle.Q ? this.f23044c.p().n() : a10.f() instanceof Activity ? !((Activity) this.f23065x.f()).isChangingConfigurations() : true) {
            Iterator it = this.f23053l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C2722c) it.next()).f23236a.iterator();
                while (it2.hasNext()) {
                    this.f23044c.p().g((String) it2.next(), false);
                }
            }
        }
    }

    public AbstractC2742x u0() {
        return this.f23066y;
    }

    public void u1(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (L0(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC2736q);
        }
        if (componentCallbacksC2736q.mHidden) {
            componentCallbacksC2736q.mHidden = false;
            componentCallbacksC2736q.mHiddenChanged = !componentCallbacksC2736q.mHiddenChanged;
        }
    }

    public final Set v() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f23044c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((P) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(a0.v(viewGroup, D0()));
            }
        }
        return hashSet;
    }

    public final ViewGroup v0(ComponentCallbacksC2736q componentCallbacksC2736q) {
        ViewGroup viewGroup = componentCallbacksC2736q.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC2736q.mContainerId > 0 && this.f23066y.d()) {
            View viewC = this.f23066y.c(componentCallbacksC2736q.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    public final void v1() {
        Iterator it = this.f23044c.k().iterator();
        while (it.hasNext()) {
            Z0((P) it.next());
        }
    }

    public Set w(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C2720a) arrayList.get(i10)).f23130c.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC2736q componentCallbacksC2736q = ((S.a) it.next()).f23148b;
                if (componentCallbacksC2736q != null && (viewGroup = componentCallbacksC2736q.mContainer) != null) {
                    hashSet.add(a0.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public C2744z w0() {
        C2744z c2744z = this.f23023B;
        if (c2744z != null) {
            return c2744z;
        }
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23067z;
        return componentCallbacksC2736q != null ? componentCallbacksC2736q.mFragmentManager.w0() : this.f23024C;
    }

    public final void w1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
        A a10 = this.f23065x;
        if (a10 != null) {
            try {
                a10.i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            Y("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public P x(ComponentCallbacksC2736q componentCallbacksC2736q) {
        P pN = this.f23044c.n(componentCallbacksC2736q.mWho);
        if (pN != null) {
            return pN;
        }
        P p10 = new P(this.f23057p, this.f23044c, componentCallbacksC2736q);
        p10.o(this.f23065x.f().getClassLoader());
        p10.s(this.f23064w);
        return p10;
    }

    public List x0() {
        return this.f23044c.o();
    }

    public void x1(k kVar) {
        this.f23057p.p(kVar);
    }

    public void y(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (L0(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC2736q);
        }
        if (componentCallbacksC2736q.mDetached) {
            return;
        }
        componentCallbacksC2736q.mDetached = true;
        if (componentCallbacksC2736q.mAdded) {
            if (L0(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC2736q);
            }
            this.f23044c.u(componentCallbacksC2736q);
            if (M0(componentCallbacksC2736q)) {
                this.f23031J = true;
            }
            t1(componentCallbacksC2736q);
        }
    }

    public A y0() {
        return this.f23065x;
    }

    public final void y1() {
        synchronized (this.f23042a) {
            try {
                if (!this.f23042a.isEmpty()) {
                    this.f23051j.setEnabled(true);
                    if (L0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = s0() > 0 && Q0(this.f23067z);
                if (L0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f23051j.setEnabled(z10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        this.f23032K = false;
        this.f23033L = false;
        this.f23039R.p(false);
        U(4);
    }

    public LayoutInflater.Factory2 z0() {
        return this.f23047f;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f23078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23079b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(String str, int i10) {
            this.f23078a = str;
            this.f23079b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f23078a);
            parcel.writeInt(this.f23079b);
        }

        public l(Parcel parcel) {
            this.f23078a = parcel.readString();
            this.f23079b = parcel.readInt();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class k {
        public void d(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        }

        public void e(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        }

        public void f(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        }

        public void i(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        }

        public void k(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        }

        public void l(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        }

        public void n(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        }

        public void a(J j10, ComponentCallbacksC2736q componentCallbacksC2736q, Bundle bundle) {
        }

        public void b(J j10, ComponentCallbacksC2736q componentCallbacksC2736q, Context context) {
        }

        public void c(J j10, ComponentCallbacksC2736q componentCallbacksC2736q, Bundle bundle) {
        }

        public void g(J j10, ComponentCallbacksC2736q componentCallbacksC2736q, Context context) {
        }

        public void h(J j10, ComponentCallbacksC2736q componentCallbacksC2736q, Bundle bundle) {
        }

        public void j(J j10, ComponentCallbacksC2736q componentCallbacksC2736q, Bundle bundle) {
        }

        public void m(J j10, ComponentCallbacksC2736q componentCallbacksC2736q, View view, Bundle bundle) {
        }
    }
}
