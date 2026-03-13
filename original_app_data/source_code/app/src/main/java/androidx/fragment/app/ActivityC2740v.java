package androidx.fragment.app;

import Y0.InterfaceC2558l;
import Y0.InterfaceC2563q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.a;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.C2759o;
import d.C3788G;
import d.InterfaceC3789H;
import e.InterfaceC3920b;
import i3.C4345f;
import i3.InterfaceC4348i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC2740v extends d.p implements a.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final C2743y mFragments = C2743y.b(new a());
    final C2759o mFragmentLifecycleRegistry = new C2759o(this);
    boolean mStopped = true;

    /* JADX INFO: renamed from: androidx.fragment.app.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends A implements L0.d, L0.e, androidx.core.app.r, androidx.core.app.s, androidx.lifecycle.Q, InterfaceC3789H, f.g, InterfaceC4348i, N, InterfaceC2558l {
        public a() {
            super(ActivityC2740v.this);
        }

        @Override // androidx.fragment.app.N
        public void a(J j10, ComponentCallbacksC2736q componentCallbacksC2736q) {
            ActivityC2740v.this.onAttachFragment(componentCallbacksC2736q);
        }

        @Override // Y0.InterfaceC2558l
        public void addMenuProvider(InterfaceC2563q interfaceC2563q) {
            ActivityC2740v.this.addMenuProvider(interfaceC2563q);
        }

        @Override // L0.d
        public void addOnConfigurationChangedListener(X0.a aVar) {
            ActivityC2740v.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.r
        public void addOnMultiWindowModeChangedListener(X0.a aVar) {
            ActivityC2740v.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.s
        public void addOnPictureInPictureModeChangedListener(X0.a aVar) {
            ActivityC2740v.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // L0.e
        public void addOnTrimMemoryListener(X0.a aVar) {
            ActivityC2740v.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.AbstractC2742x
        public View c(int i10) {
            return ActivityC2740v.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC2742x
        public boolean d() {
            Window window = ActivityC2740v.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // f.g
        public f.f getActivityResultRegistry() {
            return ActivityC2740v.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC2758n
        public AbstractC2754j getLifecycle() {
            return ActivityC2740v.this.mFragmentLifecycleRegistry;
        }

        @Override // d.InterfaceC3789H
        public C3788G getOnBackPressedDispatcher() {
            return ActivityC2740v.this.getOnBackPressedDispatcher();
        }

        @Override // i3.InterfaceC4348i
        public C4345f getSavedStateRegistry() {
            return ActivityC2740v.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.Q
        public androidx.lifecycle.P getViewModelStore() {
            return ActivityC2740v.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.A
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC2740v.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.A
        public LayoutInflater k() {
            return ActivityC2740v.this.getLayoutInflater().cloneInContext(ActivityC2740v.this);
        }

        @Override // androidx.fragment.app.A
        public boolean m(String str) {
            return androidx.core.app.a.y(ActivityC2740v.this, str);
        }

        @Override // androidx.fragment.app.A
        public void p() {
            q();
        }

        public void q() {
            ActivityC2740v.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.A
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ActivityC2740v j() {
            return ActivityC2740v.this;
        }

        @Override // Y0.InterfaceC2558l
        public void removeMenuProvider(InterfaceC2563q interfaceC2563q) {
            ActivityC2740v.this.removeMenuProvider(interfaceC2563q);
        }

        @Override // L0.d
        public void removeOnConfigurationChangedListener(X0.a aVar) {
            ActivityC2740v.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.r
        public void removeOnMultiWindowModeChangedListener(X0.a aVar) {
            ActivityC2740v.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.s
        public void removeOnPictureInPictureModeChangedListener(X0.a aVar) {
            ActivityC2740v.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // L0.e
        public void removeOnTrimMemoryListener(X0.a aVar) {
            ActivityC2740v.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public ActivityC2740v() {
        N();
    }

    public static /* synthetic */ Bundle L(ActivityC2740v activityC2740v) {
        activityC2740v.markFragmentsCreated();
        activityC2740v.mFragmentLifecycleRegistry.h(AbstractC2754j.a.ON_STOP);
        return new Bundle();
    }

    public static boolean O(J j10, AbstractC2754j.b bVar) {
        boolean zO = false;
        for (ComponentCallbacksC2736q componentCallbacksC2736q : j10.x0()) {
            if (componentCallbacksC2736q != null) {
                if (componentCallbacksC2736q.getHost() != null) {
                    zO |= O(componentCallbacksC2736q.getChildFragmentManager(), bVar);
                }
                W w10 = componentCallbacksC2736q.mViewLifecycleOwner;
                if (w10 != null && w10.getLifecycle().b().b(AbstractC2754j.b.STARTED)) {
                    componentCallbacksC2736q.mViewLifecycleOwner.f(bVar);
                    zO = true;
                }
                if (componentCallbacksC2736q.mLifecycleRegistry.b().b(AbstractC2754j.b.STARTED)) {
                    componentCallbacksC2736q.mLifecycleRegistry.m(bVar);
                    zO = true;
                }
            }
        }
        return zO;
    }

    public final void N() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new C4345f.b() { // from class: androidx.fragment.app.r
            @Override // i3.C4345f.b
            public final Bundle a() {
                return ActivityC2740v.L(this.f23370a);
            }
        });
        addOnConfigurationChangedListener(new X0.a() { // from class: androidx.fragment.app.s
            @Override // X0.a
            public final void accept(Object obj) {
                this.f23371a.mFragments.m();
            }
        });
        addOnNewIntentListener(new X0.a() { // from class: androidx.fragment.app.t
            @Override // X0.a
            public final void accept(Object obj) {
                this.f23372a.mFragments.m();
            }
        });
        addOnContextAvailableListener(new InterfaceC3920b() { // from class: androidx.fragment.app.u
            @Override // e.InterfaceC3920b
            public final void a(Context context) {
                this.f23373a.mFragments.a(null);
            }
        });
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                A1.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().Y(str, fileDescriptor, printWriter, strArr);
        }
    }

    public J getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public A1.a getSupportLoaderManager() {
        return A1.a.b(this);
    }

    public void markFragmentsCreated() {
        while (O(getSupportFragmentManager(), AbstractC2754j.b.CREATED)) {
        }
    }

    @Override // d.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // d.p, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(AbstractC2754j.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.h(AbstractC2754j.a.ON_DESTROY);
    }

    @Override // d.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.h(AbstractC2754j.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // d.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(AbstractC2754j.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.h(AbstractC2754j.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.h(AbstractC2754j.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.x xVar) {
        androidx.core.app.a.w(this, xVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.x xVar) {
        androidx.core.app.a.x(this, xVar);
    }

    public void startActivityFromFragment(ComponentCallbacksC2736q componentCallbacksC2736q, Intent intent, int i10) {
        startActivityFromFragment(componentCallbacksC2736q, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(ComponentCallbacksC2736q componentCallbacksC2736q, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.a.A(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            componentCallbacksC2736q.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.a.s(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.a.t(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.a.B(this);
    }

    public void startActivityFromFragment(ComponentCallbacksC2736q componentCallbacksC2736q, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.a.z(this, intent, -1, bundle);
        } else {
            componentCallbacksC2736q.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC2736q componentCallbacksC2736q) {
    }

    @Override // androidx.core.app.a.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
