package d;

import Y0.C2561o;
import Y0.InterfaceC2558l;
import Y0.InterfaceC2563q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.C2759o;
import androidx.lifecycle.InterfaceC2752h;
import androidx.lifecycle.InterfaceC2756l;
import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import d.p;
import e.C3919a;
import e.InterfaceC3920b;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import g.AbstractC4051a;
import i3.AbstractC4352m;
import i3.C4345f;
import i3.C4347h;
import i3.InterfaceC4348i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import s3.AbstractC5712a;
import vc.InterfaceC6082a;
import y1.AbstractC6382a;
import y1.C6383b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class p extends androidx.core.app.g implements InterfaceC2758n, Q, InterfaceC2752h, InterfaceC4348i, InterfaceC3789H, S2.d, f.g, L0.d, L0.e, androidx.core.app.r, androidx.core.app.s, InterfaceC2558l, z {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private P _viewModelStore;
    private final f.f activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC4028k defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC4028k fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC4028k onBackPressedDispatcher$delegate;
    private final InterfaceC4028k onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<X0.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<X0.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<X0.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<X0.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<X0.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final C4347h savedStateRegistryController;
    private final C3919a contextAwareHelper = new C3919a();
    private final C2561o menuHostHelper = new C2561o(new Runnable() { // from class: d.c
        @Override // java.lang.Runnable
        public final void run() {
            p.E(this.f32737a);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2756l {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC2756l
        public void d(InterfaceC2758n source, AbstractC2754j.a event) {
            AbstractC4862t.e(source, "source");
            AbstractC4862t.e(event, "event");
            p.this.A();
            p.this.getLifecycle().c(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f32753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public P f32754b;

        public final Object a() {
            return this.f32753a;
        }

        public final P b() {
            return this.f32754b;
        }

        public final void c(Object obj) {
            this.f32753a = obj;
        }

        public final void d(P p10) {
            this.f32754b = p10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d extends Executor {
        void b();

        void j(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f32755a = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f32756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f32757c;

        public e() {
        }

        public static final void c(e eVar) {
            Runnable runnable = eVar.f32756b;
            if (runnable != null) {
                AbstractC4862t.b(runnable);
                runnable.run();
                eVar.f32756b = null;
            }
        }

        @Override // d.p.d
        public void b() {
            p.this.getWindow().getDecorView().removeCallbacks(this);
            p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC4862t.e(runnable, "runnable");
            this.f32756b = runnable;
            View decorView = p.this.getWindow().getDecorView();
            AbstractC4862t.d(decorView, "getDecorView(...)");
            if (!this.f32757c) {
                decorView.postOnAnimation(new Runnable() { // from class: d.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.e.c(this.f32760a);
                    }
                });
            } else if (AbstractC4862t.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // d.p.d
        public void j(View view) {
            AbstractC4862t.e(view, "view");
            if (this.f32757c) {
                return;
            }
            this.f32757c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f32756b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f32755a) {
                    this.f32757c = false;
                    p.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f32756b = null;
            if (p.this.getFullyDrawnReporter().c()) {
                this.f32757c = false;
                p.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends f.f {
        public f() {
        }

        public static final void u(f fVar, int i10, AbstractC4051a.C0450a c0450a) {
            fVar.g(i10, c0450a.a());
        }

        public static final void v(f fVar, int i10, IntentSender.SendIntentException sendIntentException) {
            fVar.f(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // f.f
        public void k(final int i10, AbstractC4051a contract, Object obj, androidx.core.app.c cVar) {
            Bundle bundleExtra;
            final int i11;
            AbstractC4862t.e(contract, "contract");
            p pVar = p.this;
            final AbstractC4051a.C0450a c0450aB = contract.b(pVar, obj);
            if (c0450aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.f.u(this.f32761a, i10, c0450aB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(pVar, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                AbstractC4862t.b(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(pVar.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (AbstractC4862t.a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.v(pVar, stringArrayExtra, i10);
                return;
            }
            if (!AbstractC4862t.a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                androidx.core.app.a.z(pVar, intentA, i10, bundle);
                return;
            }
            f.h hVar = (f.h) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC4862t.b(hVar);
                i11 = i10;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i11 = i10;
            }
            try {
                androidx.core.app.a.A(pVar, hVar.d(), i11, hVar.a(), hVar.b(), hVar.c(), 0, bundle);
                C4015H c4015h = C4015H.f34254a;
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                final IntentSender.SendIntentException sendIntentException = e;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.f.v(this.f32764a, i11, sendIntentException);
                    }
                });
            }
        }
    }

    public p() {
        C4347h c4347hB = C4347h.f37074c.b(this);
        this.savedStateRegistryController = c4347hB;
        this.reportFullyDrawnExecutor = y();
        this.fullyDrawnReporter$delegate = C4029l.b(new InterfaceC6082a() { // from class: d.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.B(this.f32743a);
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = C4029l.b(new InterfaceC6082a() { // from class: d.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.I(this.f32744a);
            }
        });
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC2756l() { // from class: d.i
            @Override // androidx.lifecycle.InterfaceC2756l
            public final void d(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
                p.s(this.f32745a, interfaceC2758n, aVar);
            }
        });
        getLifecycle().a(new InterfaceC2756l() { // from class: d.j
            @Override // androidx.lifecycle.InterfaceC2756l
            public final void d(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
                p.t(this.f32746a, interfaceC2758n, aVar);
            }
        });
        getLifecycle().a(new a());
        c4347hB.c();
        androidx.lifecycle.F.c(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C4345f.b() { // from class: d.k
            @Override // i3.C4345f.b
            public final Bundle a() {
                return p.u(this.f32747a);
            }
        });
        addOnContextAvailableListener(new InterfaceC3920b() { // from class: d.l
            @Override // e.InterfaceC3920b
            public final void a(Context context) {
                p.v(this.f32748a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = C4029l.b(new InterfaceC6082a() { // from class: d.m
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.z(this.f32749a);
            }
        });
        this.onBackPressedDispatcher$delegate = C4029l.b(new InterfaceC6082a() { // from class: d.n
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.F(this.f32750a);
            }
        });
    }

    public static final y B(final p pVar) {
        return new y(pVar.reportFullyDrawnExecutor, new InterfaceC6082a() { // from class: d.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return p.C(this.f32740a);
            }
        });
    }

    public static final C4015H C(p pVar) {
        pVar.reportFullyDrawn();
        return C4015H.f34254a;
    }

    public static final void E(p pVar) {
        pVar.invalidateMenu();
    }

    public static final C3788G F(final p pVar) {
        final C3788G c3788g = new C3788G(new Runnable() { // from class: d.o
            @Override // java.lang.Runnable
            public final void run() {
                p.G(this.f32751a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!AbstractC4862t.a(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.H(this.f32738a, c3788g);
                    }
                });
                return c3788g;
            }
            pVar.w(c3788g);
        }
        return c3788g;
    }

    public static final void G(p pVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!AbstractC4862t.a(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!AbstractC4862t.a(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    public static final void H(p pVar, C3788G c3788g) {
        pVar.w(c3788g);
    }

    public static final S2.a I(p pVar) {
        S2.a aVar = new S2.a();
        pVar.getNavigationEventDispatcher().c(aVar);
        return aVar;
    }

    public static final void s(p pVar, InterfaceC2758n interfaceC2758n, AbstractC2754j.a event) {
        Window window;
        View viewPeekDecorView;
        AbstractC4862t.e(interfaceC2758n, "<unused var>");
        AbstractC4862t.e(event, "event");
        if (event != AbstractC2754j.a.ON_STOP || (window = pVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void t(p pVar, InterfaceC2758n interfaceC2758n, AbstractC2754j.a event) {
        AbstractC4862t.e(interfaceC2758n, "<unused var>");
        AbstractC4862t.e(event, "event");
        if (event == AbstractC2754j.a.ON_DESTROY) {
            pVar.contextAwareHelper.b();
            if (!pVar.isChangingConfigurations()) {
                pVar.getViewModelStore().a();
            }
            pVar.reportFullyDrawnExecutor.b();
        }
    }

    public static final Bundle u(p pVar) {
        Bundle bundle = new Bundle();
        pVar.activityResultRegistry.m(bundle);
        return bundle;
    }

    public static final void v(p pVar, Context it) {
        AbstractC4862t.e(it, "it");
        Bundle bundleA = pVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            pVar.activityResultRegistry.l(bundleA);
        }
    }

    public static final void x(C3788G c3788g, p pVar, InterfaceC2758n interfaceC2758n, AbstractC2754j.a event) {
        AbstractC4862t.e(interfaceC2758n, "<unused var>");
        AbstractC4862t.e(event, "event");
        if (event == AbstractC2754j.a.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = pVar.getOnBackInvokedDispatcher();
            AbstractC4862t.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            c3788g.i(onBackInvokedDispatcher);
        }
    }

    public static final androidx.lifecycle.J z(p pVar) {
        return new androidx.lifecycle.J(pVar.getApplication(), pVar, pVar.getIntent() != null ? pVar.getIntent().getExtras() : null);
    }

    public final void A() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new P();
            }
        }
    }

    public final S2.a D() {
        return (S2.a) this.onBackPressedInput$delegate.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC4862t.d(decorView, "getDecorView(...)");
        dVar.j(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // Y0.InterfaceC2558l
    public void addMenuProvider(InterfaceC2563q provider) {
        AbstractC4862t.e(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // L0.d
    public final void addOnConfigurationChangedListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC3920b listener) {
        AbstractC4862t.e(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.r
    public final void addOnMultiWindowModeChangedListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.s
    public final void addOnPictureInPictureModeChangedListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // L0.e
    public final void addOnTrimMemoryListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        AbstractC4862t.e(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // f.g
    public final f.f getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC2752h
    public AbstractC6382a getDefaultViewModelCreationExtras() {
        C6383b c6383b = new C6383b(null, 1, null);
        if (getApplication() != null) {
            c6383b.c(O.a.f23425h, getApplication());
        }
        c6383b.c(androidx.lifecycle.F.f23397a, this);
        c6383b.c(androidx.lifecycle.F.f23398b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c6383b.c(androidx.lifecycle.F.f23399c, extras);
        }
        return c6383b;
    }

    @Override // androidx.lifecycle.InterfaceC2752h
    public O.c getDefaultViewModelProviderFactory() {
        return (O.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public y getFullyDrawnReporter() {
        return (y) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.g, androidx.lifecycle.InterfaceC2758n
    public AbstractC2754j getLifecycle() {
        return super.getLifecycle();
    }

    public S2.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().g();
    }

    @Override // d.InterfaceC3789H
    public final C3788G getOnBackPressedDispatcher() {
        return (C3788G) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // i3.InterfaceC4348i
    public final C4345f getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.Q
    public P getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        A();
        P p10 = this._viewModelStore;
        AbstractC4862t.b(p10);
        return p10;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC4862t.d(decorView, "getDecorView(...)");
        S.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC4862t.d(decorView2, "getDecorView(...)");
        T.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC4862t.d(decorView3, "getDecorView(...)");
        AbstractC4352m.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC4862t.d(decorView4, "getDecorView(...)");
        AbstractC3792K.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC4862t.d(decorView5, "getDecorView(...)");
        AbstractC3791J.a(decorView5, this);
        View decorView6 = getWindow().getDecorView();
        AbstractC4862t.d(decorView6, "getDecorView(...)");
        S2.r.a(decorView6, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.f(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        D().m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC4862t.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<X0.a> it = this.onConfigurationChangedListeners.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.B.INSTANCE.b(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        AbstractC4862t.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        AbstractC4862t.e(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<X0.a> it = this.onMultiWindowModeChangedListeners.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.h(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC4862t.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<X0.a> it = this.onNewIntentListeners.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        AbstractC4862t.e(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<X0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.v(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        AbstractC4862t.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC4862t.e(permissions, "permissions");
        AbstractC4862t.e(grantResults, "grantResults");
        if (this.activityResultRegistry.f(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        P pB = this._viewModelStore;
        if (pB == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            pB = cVar.b();
        }
        if (pB == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.c(objOnRetainCustomNonConfigurationInstance);
        cVar2.d(pB);
        return cVar2;
    }

    @Override // androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC4862t.e(outState, "outState");
        if (getLifecycle() instanceof C2759o) {
            AbstractC2754j lifecycle = getLifecycle();
            AbstractC4862t.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C2759o) lifecycle).m(AbstractC2754j.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<X0.a> it = this.onTrimMemoryListeners.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> f.c registerForActivityResult(AbstractC4051a contract, f.f registry, f.b callback) {
        AbstractC4862t.e(contract, "contract");
        AbstractC4862t.e(registry, "registry");
        AbstractC4862t.e(callback, "callback");
        return registry.n("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // Y0.InterfaceC2558l
    public void removeMenuProvider(InterfaceC2563q provider) {
        AbstractC4862t.e(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // L0.d
    public final void removeOnConfigurationChangedListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC3920b listener) {
        AbstractC4862t.e(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.r
    public final void removeOnMultiWindowModeChangedListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.s
    public final void removeOnPictureInPictureModeChangedListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // L0.e
    public final void removeOnTrimMemoryListener(X0.a listener) {
        AbstractC4862t.e(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        AbstractC4862t.e(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC5712a.e()) {
                AbstractC5712a.b("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
        } finally {
            AbstractC5712a.d();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC4862t.d(decorView, "getDecorView(...)");
        dVar.j(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        AbstractC4862t.e(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        AbstractC4862t.e(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    public final void w(final C3788G c3788g) {
        getLifecycle().a(new InterfaceC2756l() { // from class: d.f
            @Override // androidx.lifecycle.InterfaceC2756l
            public final void d(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
                p.x(c3788g, this, interfaceC2758n, aVar);
            }
        });
    }

    public final d y() {
        return new e();
    }

    public void addMenuProvider(InterfaceC2563q provider, InterfaceC2758n owner) {
        AbstractC4862t.e(provider, "provider");
        AbstractC4862t.e(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        AbstractC4862t.e(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC4862t.e(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC2563q provider, InterfaceC2758n owner, AbstractC2754j.b state) {
        AbstractC4862t.e(provider, "provider");
        AbstractC4862t.e(owner, "owner");
        AbstractC4862t.e(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    public final <I, O> f.c registerForActivityResult(AbstractC4051a contract, f.b callback) {
        AbstractC4862t.e(contract, "contract");
        AbstractC4862t.e(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        AbstractC4862t.e(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<X0.a> it = this.onMultiWindowModeChangedListeners.iterator();
            AbstractC4862t.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.h(z10, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        AbstractC4862t.e(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<X0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            AbstractC4862t.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.v(z10, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC4862t.d(decorView, "getDecorView(...)");
        dVar.j(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC4862t.d(decorView, "getDecorView(...)");
        dVar.j(decorView);
        super.setContentView(view, layoutParams);
    }
}
