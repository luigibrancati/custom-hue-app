package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.a0;
import androidx.lifecycle.AbstractC2754j;
import io.sentry.protocol.SentryThread;
import org.apache.tika.utils.StringUtils;
import r1.AbstractC5525b;
import s1.C5706c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f23116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f23117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentCallbacksC2736q f23118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23119d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23120e = -1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23123a;

        static {
            int[] iArr = new int[AbstractC2754j.b.values().length];
            f23123a = iArr;
            try {
                iArr[AbstractC2754j.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23123a[AbstractC2754j.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23123a[AbstractC2754j.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23123a[AbstractC2754j.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public P(C c10, Q q10, ComponentCallbacksC2736q componentCallbacksC2736q) {
        this.f23116a = c10;
        this.f23117b = q10;
        this.f23118c = componentCallbacksC2736q;
    }

    public void a() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f23118c);
        }
        Bundle bundle = this.f23118c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f23118c.performActivityCreated(bundle2);
        this.f23116a.a(this.f23118c, bundle2, false);
    }

    public void b() {
        ComponentCallbacksC2736q componentCallbacksC2736qO0 = J.o0(this.f23118c.mContainer);
        ComponentCallbacksC2736q parentFragment = this.f23118c.getParentFragment();
        if (componentCallbacksC2736qO0 != null && !componentCallbacksC2736qO0.equals(parentFragment)) {
            ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
            C5706c.o(componentCallbacksC2736q, componentCallbacksC2736qO0, componentCallbacksC2736q.mContainerId);
        }
        int iJ = this.f23117b.j(this.f23118c);
        ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23118c;
        componentCallbacksC2736q2.mContainer.addView(componentCallbacksC2736q2.mView, iJ);
    }

    public void c() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f23118c);
        }
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        ComponentCallbacksC2736q componentCallbacksC2736q2 = componentCallbacksC2736q.mTarget;
        P pN = null;
        if (componentCallbacksC2736q2 != null) {
            P pN2 = this.f23117b.n(componentCallbacksC2736q2.mWho);
            if (pN2 == null) {
                throw new IllegalStateException("Fragment " + this.f23118c + " declared target fragment " + this.f23118c.mTarget + " that does not belong to this FragmentManager!");
            }
            ComponentCallbacksC2736q componentCallbacksC2736q3 = this.f23118c;
            componentCallbacksC2736q3.mTargetWho = componentCallbacksC2736q3.mTarget.mWho;
            componentCallbacksC2736q3.mTarget = null;
            pN = pN2;
        } else {
            String str = componentCallbacksC2736q.mTargetWho;
            if (str != null && (pN = this.f23117b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f23118c + " declared target fragment " + this.f23118c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (pN != null) {
            pN.m();
        }
        ComponentCallbacksC2736q componentCallbacksC2736q4 = this.f23118c;
        componentCallbacksC2736q4.mHost = componentCallbacksC2736q4.mFragmentManager.y0();
        ComponentCallbacksC2736q componentCallbacksC2736q5 = this.f23118c;
        componentCallbacksC2736q5.mParentFragment = componentCallbacksC2736q5.mFragmentManager.B0();
        this.f23116a.g(this.f23118c, false);
        this.f23118c.performAttach();
        this.f23116a.b(this.f23118c, false);
    }

    public int d() {
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        if (componentCallbacksC2736q.mFragmentManager == null) {
            return componentCallbacksC2736q.mState;
        }
        int iMin = this.f23120e;
        int i10 = b.f23123a[componentCallbacksC2736q.mMaxState.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23118c;
        if (componentCallbacksC2736q2.mFromLayout) {
            if (componentCallbacksC2736q2.mInLayout) {
                iMin = Math.max(this.f23120e, 2);
                View view = this.f23118c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f23120e < 4 ? Math.min(iMin, componentCallbacksC2736q2.mState) : Math.min(iMin, 1);
            }
        }
        ComponentCallbacksC2736q componentCallbacksC2736q3 = this.f23118c;
        if (componentCallbacksC2736q3.mInDynamicContainer && componentCallbacksC2736q3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f23118c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ComponentCallbacksC2736q componentCallbacksC2736q4 = this.f23118c;
        ViewGroup viewGroup = componentCallbacksC2736q4.mContainer;
        a0.d.a aVarS = viewGroup != null ? a0.u(viewGroup, componentCallbacksC2736q4.getParentFragmentManager()).s(this) : null;
        if (aVarS == a0.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == a0.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            ComponentCallbacksC2736q componentCallbacksC2736q5 = this.f23118c;
            if (componentCallbacksC2736q5.mRemoving) {
                iMin = componentCallbacksC2736q5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        ComponentCallbacksC2736q componentCallbacksC2736q6 = this.f23118c;
        if (componentCallbacksC2736q6.mDeferStart && componentCallbacksC2736q6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f23118c.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f23118c);
        }
        return iMin;
    }

    public void e() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f23118c);
        }
        Bundle bundle = this.f23118c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        if (componentCallbacksC2736q.mIsCreated) {
            componentCallbacksC2736q.mState = 1;
            componentCallbacksC2736q.restoreChildFragmentState();
        } else {
            this.f23116a.h(componentCallbacksC2736q, bundle2, false);
            this.f23118c.performCreate(bundle2);
            this.f23116a.c(this.f23118c, bundle2, false);
        }
    }

    public void f() {
        String resourceName;
        if (this.f23118c.mFromLayout) {
            return;
        }
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f23118c);
        }
        Bundle bundle = this.f23118c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f23118c.performGetLayoutInflater(bundle2);
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        ViewGroup viewGroup2 = componentCallbacksC2736q.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = componentCallbacksC2736q.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f23118c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) componentCallbacksC2736q.mFragmentManager.u0().c(this.f23118c.mContainerId);
                if (viewGroup == null) {
                    ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23118c;
                    if (!componentCallbacksC2736q2.mRestored && !componentCallbacksC2736q2.mInDynamicContainer) {
                        try {
                            resourceName = componentCallbacksC2736q2.getResources().getResourceName(this.f23118c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f23118c.mContainerId) + " (" + resourceName + ") for fragment " + this.f23118c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C5706c.n(this.f23118c, viewGroup);
                }
            }
        }
        ComponentCallbacksC2736q componentCallbacksC2736q3 = this.f23118c;
        componentCallbacksC2736q3.mContainer = viewGroup;
        componentCallbacksC2736q3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f23118c.mView != null) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f23118c);
            }
            this.f23118c.mView.setSaveFromParentEnabled(false);
            ComponentCallbacksC2736q componentCallbacksC2736q4 = this.f23118c;
            componentCallbacksC2736q4.mView.setTag(AbstractC5525b.f43504a, componentCallbacksC2736q4);
            if (viewGroup != null) {
                b();
            }
            ComponentCallbacksC2736q componentCallbacksC2736q5 = this.f23118c;
            if (componentCallbacksC2736q5.mHidden) {
                componentCallbacksC2736q5.mView.setVisibility(8);
            }
            if (this.f23118c.mView.isAttachedToWindow()) {
                Y0.E.c0(this.f23118c.mView);
            } else {
                View view = this.f23118c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f23118c.performViewCreated();
            C c10 = this.f23116a;
            ComponentCallbacksC2736q componentCallbacksC2736q6 = this.f23118c;
            c10.m(componentCallbacksC2736q6, componentCallbacksC2736q6.mView, bundle2, false);
            int visibility = this.f23118c.mView.getVisibility();
            this.f23118c.setPostOnViewCreatedAlpha(this.f23118c.mView.getAlpha());
            ComponentCallbacksC2736q componentCallbacksC2736q7 = this.f23118c;
            if (componentCallbacksC2736q7.mContainer != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC2736q7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f23118c.setFocusedView(viewFindFocus);
                    if (J.L0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f23118c);
                    }
                }
                this.f23118c.mView.setAlpha(0.0f);
            }
        }
        this.f23118c.mState = 2;
    }

    public void g() {
        ComponentCallbacksC2736q componentCallbacksC2736qF;
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f23118c);
        }
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = componentCallbacksC2736q.mRemoving && !componentCallbacksC2736q.isInBackStack();
        if (z10) {
            ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23118c;
            if (!componentCallbacksC2736q2.mBeingSaved) {
                this.f23117b.B(componentCallbacksC2736q2.mWho, null);
            }
        }
        if (!z10 && !this.f23117b.p().q(this.f23118c)) {
            String str = this.f23118c.mTargetWho;
            if (str != null && (componentCallbacksC2736qF = this.f23117b.f(str)) != null && componentCallbacksC2736qF.mRetainInstance) {
                this.f23118c.mTarget = componentCallbacksC2736qF;
            }
            this.f23118c.mState = 0;
            return;
        }
        A a10 = this.f23118c.mHost;
        if (a10 instanceof androidx.lifecycle.Q) {
            zIsChangingConfigurations = this.f23117b.p().n();
        } else if (a10.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) a10.f()).isChangingConfigurations();
        }
        if ((z10 && !this.f23118c.mBeingSaved) || zIsChangingConfigurations) {
            this.f23117b.p().f(this.f23118c, false);
        }
        this.f23118c.performDestroy();
        this.f23116a.d(this.f23118c, false);
        for (P p10 : this.f23117b.k()) {
            if (p10 != null) {
                ComponentCallbacksC2736q componentCallbacksC2736qK = p10.k();
                if (this.f23118c.mWho.equals(componentCallbacksC2736qK.mTargetWho)) {
                    componentCallbacksC2736qK.mTarget = this.f23118c;
                    componentCallbacksC2736qK.mTargetWho = null;
                }
            }
        }
        ComponentCallbacksC2736q componentCallbacksC2736q3 = this.f23118c;
        String str2 = componentCallbacksC2736q3.mTargetWho;
        if (str2 != null) {
            componentCallbacksC2736q3.mTarget = this.f23117b.f(str2);
        }
        this.f23117b.s(this);
    }

    public void h() {
        View view;
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f23118c);
        }
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        ViewGroup viewGroup = componentCallbacksC2736q.mContainer;
        if (viewGroup != null && (view = componentCallbacksC2736q.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f23118c.performDestroyView();
        this.f23116a.n(this.f23118c, false);
        ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23118c;
        componentCallbacksC2736q2.mContainer = null;
        componentCallbacksC2736q2.mView = null;
        componentCallbacksC2736q2.mViewLifecycleOwner = null;
        componentCallbacksC2736q2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f23118c.mInLayout = false;
    }

    public void i() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f23118c);
        }
        this.f23118c.performDetach();
        this.f23116a.e(this.f23118c, false);
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        componentCallbacksC2736q.mState = -1;
        componentCallbacksC2736q.mHost = null;
        componentCallbacksC2736q.mParentFragment = null;
        componentCallbacksC2736q.mFragmentManager = null;
        if ((!componentCallbacksC2736q.mRemoving || componentCallbacksC2736q.isInBackStack()) && !this.f23117b.p().q(this.f23118c)) {
            return;
        }
        if (J.L0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f23118c);
        }
        this.f23118c.initState();
    }

    public void j() {
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        if (componentCallbacksC2736q.mFromLayout && componentCallbacksC2736q.mInLayout && !componentCallbacksC2736q.mPerformedCreateView) {
            if (J.L0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f23118c);
            }
            Bundle bundle = this.f23118c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23118c;
            componentCallbacksC2736q2.performCreateView(componentCallbacksC2736q2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f23118c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ComponentCallbacksC2736q componentCallbacksC2736q3 = this.f23118c;
                componentCallbacksC2736q3.mView.setTag(AbstractC5525b.f43504a, componentCallbacksC2736q3);
                ComponentCallbacksC2736q componentCallbacksC2736q4 = this.f23118c;
                if (componentCallbacksC2736q4.mHidden) {
                    componentCallbacksC2736q4.mView.setVisibility(8);
                }
                this.f23118c.performViewCreated();
                C c10 = this.f23116a;
                ComponentCallbacksC2736q componentCallbacksC2736q5 = this.f23118c;
                c10.m(componentCallbacksC2736q5, componentCallbacksC2736q5.mView, bundle2, false);
                this.f23118c.mState = 2;
            }
        }
    }

    public ComponentCallbacksC2736q k() {
        return this.f23118c;
    }

    public final boolean l(View view) {
        if (view == this.f23118c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f23118c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f23119d) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f23119d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
                int i10 = componentCallbacksC2736q.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && componentCallbacksC2736q.mRemoving && !componentCallbacksC2736q.isInBackStack() && !this.f23118c.mBeingSaved) {
                        if (J.L0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f23118c);
                        }
                        this.f23117b.p().f(this.f23118c, true);
                        this.f23117b.s(this);
                        if (J.L0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f23118c);
                        }
                        this.f23118c.initState();
                    }
                    ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23118c;
                    if (componentCallbacksC2736q2.mHiddenChanged) {
                        if (componentCallbacksC2736q2.mView != null && (viewGroup = componentCallbacksC2736q2.mContainer) != null) {
                            a0 a0VarU = a0.u(viewGroup, componentCallbacksC2736q2.getParentFragmentManager());
                            if (this.f23118c.mHidden) {
                                a0VarU.k(this);
                            } else {
                                a0VarU.m(this);
                            }
                        }
                        ComponentCallbacksC2736q componentCallbacksC2736q3 = this.f23118c;
                        J j10 = componentCallbacksC2736q3.mFragmentManager;
                        if (j10 != null) {
                            j10.J0(componentCallbacksC2736q3);
                        }
                        ComponentCallbacksC2736q componentCallbacksC2736q4 = this.f23118c;
                        componentCallbacksC2736q4.mHiddenChanged = false;
                        componentCallbacksC2736q4.onHiddenChanged(componentCallbacksC2736q4.mHidden);
                        this.f23118c.mChildFragmentManager.K();
                    }
                    this.f23119d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (componentCallbacksC2736q.mBeingSaved && this.f23117b.q(componentCallbacksC2736q.mWho) == null) {
                                this.f23117b.B(this.f23118c.mWho, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f23118c.mState = 1;
                            break;
                        case 2:
                            componentCallbacksC2736q.mInLayout = false;
                            componentCallbacksC2736q.mState = 2;
                            break;
                        case 3:
                            if (J.L0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f23118c);
                            }
                            ComponentCallbacksC2736q componentCallbacksC2736q5 = this.f23118c;
                            if (componentCallbacksC2736q5.mBeingSaved) {
                                this.f23117b.B(componentCallbacksC2736q5.mWho, q());
                            } else if (componentCallbacksC2736q5.mView != null && componentCallbacksC2736q5.mSavedViewState == null) {
                                r();
                            }
                            ComponentCallbacksC2736q componentCallbacksC2736q6 = this.f23118c;
                            if (componentCallbacksC2736q6.mView != null && (viewGroup2 = componentCallbacksC2736q6.mContainer) != null) {
                                a0.u(viewGroup2, componentCallbacksC2736q6.getParentFragmentManager()).l(this);
                            }
                            this.f23118c.mState = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            componentCallbacksC2736q.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (componentCallbacksC2736q.mView != null && (viewGroup3 = componentCallbacksC2736q.mContainer) != null) {
                                a0.u(viewGroup3, componentCallbacksC2736q.getParentFragmentManager()).j(a0.d.b.j(this.f23118c.mView.getVisibility()), this);
                            }
                            this.f23118c.mState = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            componentCallbacksC2736q.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th) {
            this.f23119d = false;
            throw th;
        }
    }

    public void n() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f23118c);
        }
        this.f23118c.performPause();
        this.f23116a.f(this.f23118c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f23118c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f23118c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f23118c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
            componentCallbacksC2736q.mSavedViewState = componentCallbacksC2736q.mSavedFragmentState.getSparseParcelableArray("viewState");
            ComponentCallbacksC2736q componentCallbacksC2736q2 = this.f23118c;
            componentCallbacksC2736q2.mSavedViewRegistryState = componentCallbacksC2736q2.mSavedFragmentState.getBundle("viewRegistryState");
            O o10 = (O) this.f23118c.mSavedFragmentState.getParcelable(SentryThread.JsonKeys.STATE);
            if (o10 != null) {
                ComponentCallbacksC2736q componentCallbacksC2736q3 = this.f23118c;
                componentCallbacksC2736q3.mTargetWho = o10.f23113m;
                componentCallbacksC2736q3.mTargetRequestCode = o10.f23114n;
                Boolean bool = componentCallbacksC2736q3.mSavedUserVisibleHint;
                if (bool != null) {
                    componentCallbacksC2736q3.mUserVisibleHint = bool.booleanValue();
                    this.f23118c.mSavedUserVisibleHint = null;
                } else {
                    componentCallbacksC2736q3.mUserVisibleHint = o10.f23115o;
                }
            }
            ComponentCallbacksC2736q componentCallbacksC2736q4 = this.f23118c;
            if (componentCallbacksC2736q4.mUserVisibleHint) {
                return;
            }
            componentCallbacksC2736q4.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    public void p() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f23118c);
        }
        View focusedView = this.f23118c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (J.L0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(StringUtils.SPACE);
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f23118c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f23118c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f23118c.setFocusedView(null);
        this.f23118c.performResume();
        this.f23116a.i(this.f23118c, false);
        this.f23117b.B(this.f23118c.mWho, null);
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        componentCallbacksC2736q.mSavedFragmentState = null;
        componentCallbacksC2736q.mSavedViewState = null;
        componentCallbacksC2736q.mSavedViewRegistryState = null;
    }

    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ComponentCallbacksC2736q componentCallbacksC2736q = this.f23118c;
        if (componentCallbacksC2736q.mState == -1 && (bundle = componentCallbacksC2736q.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(SentryThread.JsonKeys.STATE, new O(this.f23118c));
        if (this.f23118c.mState > 0) {
            Bundle bundle3 = new Bundle();
            this.f23118c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f23116a.j(this.f23118c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f23118c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleO1 = this.f23118c.mChildFragmentManager.o1();
            if (!bundleO1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleO1);
            }
            if (this.f23118c.mView != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f23118c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f23118c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f23118c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void r() {
        if (this.f23118c.mView == null) {
            return;
        }
        if (J.L0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f23118c + " with view " + this.f23118c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f23118c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f23118c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f23118c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f23118c.mSavedViewRegistryState = bundle;
    }

    public void s(int i10) {
        this.f23120e = i10;
    }

    public void t() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f23118c);
        }
        this.f23118c.performStart();
        this.f23116a.k(this.f23118c, false);
    }

    public void u() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f23118c);
        }
        this.f23118c.performStop();
        this.f23116a.l(this.f23118c, false);
    }

    public P(C c10, Q q10, ClassLoader classLoader, C2744z c2744z, Bundle bundle) {
        this.f23116a = c10;
        this.f23117b = q10;
        ComponentCallbacksC2736q componentCallbacksC2736qA = ((O) bundle.getParcelable(SentryThread.JsonKeys.STATE)).a(c2744z, classLoader);
        this.f23118c = componentCallbacksC2736qA;
        componentCallbacksC2736qA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        componentCallbacksC2736qA.setArguments(bundle2);
        if (J.L0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + componentCallbacksC2736qA);
        }
    }

    public P(C c10, Q q10, ComponentCallbacksC2736q componentCallbacksC2736q, Bundle bundle) {
        this.f23116a = c10;
        this.f23117b = q10;
        this.f23118c = componentCallbacksC2736q;
        componentCallbacksC2736q.mSavedViewState = null;
        componentCallbacksC2736q.mSavedViewRegistryState = null;
        componentCallbacksC2736q.mBackStackNesting = 0;
        componentCallbacksC2736q.mInLayout = false;
        componentCallbacksC2736q.mAdded = false;
        ComponentCallbacksC2736q componentCallbacksC2736q2 = componentCallbacksC2736q.mTarget;
        componentCallbacksC2736q.mTargetWho = componentCallbacksC2736q2 != null ? componentCallbacksC2736q2.mWho : null;
        componentCallbacksC2736q.mTarget = null;
        componentCallbacksC2736q.mSavedFragmentState = bundle;
        componentCallbacksC2736q.mArguments = bundle.getBundle("arguments");
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f23121a;

        public a(View view) {
            this.f23121a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f23121a.removeOnAttachStateChangeListener(this);
            Y0.E.c0(this.f23121a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
