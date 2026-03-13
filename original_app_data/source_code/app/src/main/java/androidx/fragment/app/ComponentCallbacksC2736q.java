package androidx.fragment.app;

import Y0.AbstractC2556j;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.AbstractC2763t;
import androidx.lifecycle.C2759o;
import androidx.lifecycle.InterfaceC2752h;
import androidx.lifecycle.InterfaceC2756l;
import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.O;
import g.AbstractC4051a;
import i3.AbstractC4352m;
import i3.C4345f;
import i3.C4347h;
import i3.InterfaceC4348i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.metadata.TikaCoreProperties;
import s.InterfaceC5702a;
import s1.C5706c;
import y1.AbstractC6382a;
import y1.C6383b;

/* JADX INFO: renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacksC2736q implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC2758n, androidx.lifecycle.Q, InterfaceC2752h, InterfaceC4348i {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    O.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    J mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    A mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C2759o mLifecycleRegistry;
    ComponentCallbacksC2736q mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C4347h mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    ComponentCallbacksC2736q mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    W mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    J mChildFragmentManager = new K();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new b();
    AbstractC2754j.b mMaxState = AbstractC2754j.b.RESUMED;
    androidx.lifecycle.w mViewLifecycleOwnerLiveData = new androidx.lifecycle.w();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<m> mOnPreAttachedListeners = new ArrayList<>();
    private final m mSavedStateAttachListener = new c();

    /* JADX INFO: renamed from: androidx.fragment.app.q$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f23329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC4051a f23330b;

        public a(AtomicReference atomicReference, AbstractC4051a abstractC4051a) {
            this.f23329a = atomicReference;
            this.f23330b = abstractC4051a;
        }

        @Override // f.c
        public void b(Object obj, androidx.core.app.c cVar) {
            f.c cVar2 = (f.c) this.f23329a.get();
            if (cVar2 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar2.b(obj, cVar);
        }

        @Override // f.c
        public void c() {
            f.c cVar = (f.c) this.f23329a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC2736q.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends m {
        public c() {
            super(null);
        }

        @Override // androidx.fragment.app.ComponentCallbacksC2736q.m
        public void a() {
            ComponentCallbacksC2736q.this.mSavedStateRegistryController.c();
            androidx.lifecycle.F.c(ComponentCallbacksC2736q.this);
            Bundle bundle = ComponentCallbacksC2736q.this.mSavedFragmentState;
            ComponentCallbacksC2736q.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC2736q.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f23335a;

        public e(a0 a0Var) {
            this.f23335a = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23335a.y()) {
                this.f23335a.n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends AbstractC2742x {
        public f() {
        }

        @Override // androidx.fragment.app.AbstractC2742x
        public View c(int i10) {
            View view = ComponentCallbacksC2736q.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + ComponentCallbacksC2736q.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC2742x
        public boolean d() {
            return ComponentCallbacksC2736q.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g implements InterfaceC2756l {
        public g() {
        }

        @Override // androidx.lifecycle.InterfaceC2756l
        public void d(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
            View view;
            if (aVar != AbstractC2754j.a.ON_STOP || (view = ComponentCallbacksC2736q.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h implements InterfaceC5702a {
        public h() {
        }

        @Override // s.InterfaceC5702a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f.f apply(Void r22) {
            ComponentCallbacksC2736q componentCallbacksC2736q = ComponentCallbacksC2736q.this;
            Object obj = componentCallbacksC2736q.mHost;
            return obj instanceof f.g ? ((f.g) obj).getActivityResultRegistry() : componentCallbacksC2736q.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i implements InterfaceC5702a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f.f f23340a;

        public i(f.f fVar) {
            this.f23340a = fVar;
        }

        @Override // s.InterfaceC5702a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f.f apply(Void r12) {
            return this.f23340a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class j extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5702a f23342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f23343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC4051a f23344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f.b f23345d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC5702a interfaceC5702a, AtomicReference atomicReference, AbstractC4051a abstractC4051a, f.b bVar) {
            super(null);
            this.f23342a = interfaceC5702a;
            this.f23343b = atomicReference;
            this.f23344c = abstractC4051a;
            this.f23345d = bVar;
        }

        @Override // androidx.fragment.app.ComponentCallbacksC2736q.m
        public void a() {
            String strGenerateActivityResultKey = ComponentCallbacksC2736q.this.generateActivityResultKey();
            this.f23343b.set(((f.f) this.f23342a.apply(null)).n(strGenerateActivityResultKey, ComponentCallbacksC2736q.this, this.f23344c, this.f23345d));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f23347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f23352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23353g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList f23354h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList f23355i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f23356j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f23357k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f23358l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f23359m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f23360n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f23361o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f23362p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f23363q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public androidx.core.app.x f23364r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public androidx.core.app.x f23365s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f23366t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public View f23367u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f23368v;

        public k() {
            Object obj = ComponentCallbacksC2736q.USE_DEFAULT_TRANSITION;
            this.f23357k = obj;
            this.f23358l = null;
            this.f23359m = obj;
            this.f23360n = null;
            this.f23361o = obj;
            this.f23364r = null;
            this.f23365s = null;
            this.f23366t = 1.0f;
            this.f23367u = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$l */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$m */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class m {
        public m() {
        }

        public abstract void a();

        public /* synthetic */ m(b bVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$n */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f23369a;

        /* JADX INFO: renamed from: androidx.fragment.app.q$n$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        public n(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f23369a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f23369a);
        }
    }

    public ComponentCallbacksC2736q() {
        h();
    }

    public static /* synthetic */ void d(ComponentCallbacksC2736q componentCallbacksC2736q) {
        componentCallbacksC2736q.mViewLifecycleOwner.d(componentCallbacksC2736q.mSavedViewRegistryState);
        componentCallbacksC2736q.mSavedViewRegistryState = null;
    }

    @Deprecated
    public static ComponentCallbacksC2736q instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        J j10;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f23368v = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (j10 = this.mFragmentManager) == null) {
            return;
        }
        a0 a0VarU = a0.u(viewGroup, j10);
        a0VarU.z();
        if (z10) {
            this.mHost.h().post(new e(a0VarU));
        } else {
            a0VarU.n();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC2742x createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        ComponentCallbacksC2736q componentCallbacksC2736qG = g(false);
        if (componentCallbacksC2736qG != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC2736qG);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            A1.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        this.mChildFragmentManager.Y(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final k e() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int f() {
        AbstractC2754j.b bVar = this.mMaxState;
        return (bVar == AbstractC2754j.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.f());
    }

    public ComponentCallbacksC2736q findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m0(str);
    }

    public final ComponentCallbacksC2736q g(boolean z10) {
        String str;
        if (z10) {
            C5706c.j(this);
        }
        ComponentCallbacksC2736q componentCallbacksC2736q = this.mTarget;
        if (componentCallbacksC2736q != null) {
            return componentCallbacksC2736q;
        }
        J j10 = this.mFragmentManager;
        if (j10 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return j10.h0(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC2740v getActivity() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return (ActivityC2740v) a10.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f23363q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f23362p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f23347a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final J getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return a10.f();
    }

    @Override // androidx.lifecycle.InterfaceC2752h
    public AbstractC6382a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && J.L0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C6383b c6383b = new C6383b();
        if (application != null) {
            c6383b.c(O.a.f23425h, application);
        }
        c6383b.c(androidx.lifecycle.F.f23397a, this);
        c6383b.c(androidx.lifecycle.F.f23398b, this);
        if (getArguments() != null) {
            c6383b.c(androidx.lifecycle.F.f23399c, getArguments());
        }
        return c6383b;
    }

    @Override // androidx.lifecycle.InterfaceC2752h
    public O.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && J.L0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.J(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f23349c;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f23356j;
    }

    public androidx.core.app.x getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f23364r;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f23350d;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f23358l;
    }

    public androidx.core.app.x getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f23365s;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f23367u;
    }

    @Deprecated
    public final J getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return a10.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC2758n
    public AbstractC2754j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public A1.a getLoaderManager() {
        return A1.a.b(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f23353g;
    }

    public final ComponentCallbacksC2736q getParentFragment() {
        return this.mParentFragment;
    }

    public final J getParentFragmentManager() {
        J j10 = this.mFragmentManager;
        if (j10 != null) {
            return j10;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f23348b;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f23351e;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f23352f;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f23366t;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f23359m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C5706c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f23357k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // i3.InterfaceC4348i
    public final C4345f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f23360n;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f23361o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f23354h) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f23355i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final ComponentCallbacksC2736q getTargetFragment() {
        return g(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C5706c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC2758n getViewLifecycleOwner() {
        W w10 = this.mViewLifecycleOwner;
        if (w10 != null) {
            return w10;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AbstractC2763t getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.Q
    public androidx.lifecycle.P getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (f() != AbstractC2754j.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.G0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final void h() {
        this.mLifecycleRegistry = new C2759o(this);
        this.mSavedStateRegistryController = C4347h.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        j(this.mSavedStateAttachListener);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final f.c i(AbstractC4051a abstractC4051a, InterfaceC5702a interfaceC5702a, f.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            j(new j(interfaceC5702a, atomicReference, abstractC4051a, bVar));
            return new a(atomicReference, abstractC4051a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public void initState() {
        h();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new K();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        J j10 = this.mFragmentManager;
        return j10 != null && j10.O0(this.mParentFragment);
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        J j10 = this.mFragmentManager;
        return j10 == null || j10.P0(this.mParentFragment);
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f23368v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        J j10 = this.mFragmentManager;
        if (j10 == null) {
            return false;
        }
        return j10.S0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final void j(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    public final void k() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.X0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (J.L0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        A a10 = this.mHost;
        Activity activityE = a10 == null ? null : a10.e();
        if (activityE != null) {
            this.mCalled = false;
            onAttach(activityE);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.R0(1)) {
            return;
        }
        this.mChildFragmentManager.D();
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        A a10 = this.mHost;
        Activity activityE = a10 == null ? null : a10.e();
        if (activityE != null) {
            this.mCalled = false;
            onInflate(activityE, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.X0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            k();
            this.mChildFragmentManager.z();
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.J(this);
            this.mChildFragmentManager.A();
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.C(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.X0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.h(AbstractC2754j.a.ON_CREATE);
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return this.mChildFragmentManager.E(menu, menuInflater) | z10;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.X0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new W(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.p
            @Override // java.lang.Runnable
            public final void run() {
                ComponentCallbacksC2736q.d(this.f23328a);
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (J.L0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.S.b(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.T.a(this.mView, this.mViewLifecycleOwner);
        AbstractC4352m.a(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.F();
        this.mLifecycleRegistry.h(AbstractC2754j.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().b(AbstractC2754j.b.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC2754j.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            A1.a.b(this).c();
            this.mPerformedCreateView = false;
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.K0()) {
                return;
            }
            this.mChildFragmentManager.F();
            this.mChildFragmentManager = new K();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.L(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.M(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.O();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC2754j.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.h(AbstractC2754j.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return this.mChildFragmentManager.Q(menu) | z10;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zQ0 = this.mFragmentManager.Q0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zQ0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zQ0);
            onPrimaryNavigationFragmentChanged(zQ0);
            this.mChildFragmentManager.R();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.X0();
        this.mChildFragmentManager.c0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onResume()");
        }
        C2759o c2759o = this.mLifecycleRegistry;
        AbstractC2754j.a aVar = AbstractC2754j.a.ON_RESUME;
        c2759o.h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.S();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.X0();
        this.mChildFragmentManager.c0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onStart()");
        }
        C2759o c2759o = this.mLifecycleRegistry;
        AbstractC2754j.a aVar = AbstractC2754j.a.ON_START;
        c2759o.h(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.T();
    }

    public void performStop() {
        this.mChildFragmentManager.V();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC2754j.a.ON_STOP);
        }
        this.mLifecycleRegistry.h(AbstractC2754j.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.W();
    }

    public void postponeEnterTransition() {
        e().f23368v = true;
    }

    public final <I, O> f.c registerForActivityResult(AbstractC4051a abstractC4051a, f.b bVar) {
        return i(abstractC4051a, new h(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().T0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final ActivityC2740v requireActivity() {
        ActivityC2740v activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final J requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final ComponentCallbacksC2736q requireParentFragment() {
        ComponentCallbacksC2736q parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.m1(bundle);
        this.mChildFragmentManager.D();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(AbstractC2754j.a.ON_CREATE);
            }
        } else {
            throw new c0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        e().f23363q = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        e().f23362p = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        e().f23349c = i10;
        e().f23350d = i11;
        e().f23351e = i12;
        e().f23352f = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.x xVar) {
        e().f23364r = xVar;
    }

    public void setEnterTransition(Object obj) {
        e().f23356j = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.x xVar) {
        e().f23365s = xVar;
    }

    public void setExitTransition(Object obj) {
        e().f23358l = obj;
    }

    public void setFocusedView(View view) {
        e().f23367u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.p();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f23369a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.p();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        e();
        this.mAnimationInfo.f23353g = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        e().f23348b = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        e().f23366t = f10;
    }

    public void setReenterTransition(Object obj) {
        e().f23359m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        C5706c.k(this);
        this.mRetainInstance = z10;
        J j10 = this.mFragmentManager;
        if (j10 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            j10.l(this);
        } else {
            j10.k1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        e().f23357k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        e().f23360n = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        e();
        k kVar = this.mAnimationInfo;
        kVar.f23354h = arrayList;
        kVar.f23355i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        e().f23361o = obj;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC2736q componentCallbacksC2736q, int i10) {
        if (componentCallbacksC2736q != null) {
            C5706c.l(this, componentCallbacksC2736q, i10);
        }
        J j10 = this.mFragmentManager;
        J j11 = componentCallbacksC2736q != null ? componentCallbacksC2736q.mFragmentManager : null;
        if (j10 != null && j11 != null && j10 != j11) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC2736q + " must share the same FragmentManager to be set as a target fragment");
        }
        for (ComponentCallbacksC2736q componentCallbacksC2736qG = componentCallbacksC2736q; componentCallbacksC2736qG != null; componentCallbacksC2736qG = componentCallbacksC2736qG.g(false)) {
            if (componentCallbacksC2736qG.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC2736q + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC2736q == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC2736q.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC2736q;
        } else {
            this.mTargetWho = componentCallbacksC2736q.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        C5706c.m(this, z10);
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            J j10 = this.mFragmentManager;
            j10.Z0(j10.x(this));
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        A a10 = this.mHost;
        if (a10 != null) {
            return a10.m(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Bundle bundle2;
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (J.L0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fragment ");
            sb2.append(this);
            sb2.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb2.append(i10);
            sb2.append(" IntentSender: ");
            sb2.append(intentSender);
            sb2.append(" fillInIntent: ");
            sb2.append(intent);
            sb2.append(" options: ");
            bundle2 = bundle;
            sb2.append(bundle2);
            Log.v("FragmentManager", sb2.toString());
        } else {
            bundle2 = bundle;
        }
        getParentFragmentManager().V0(this, intentSender, i10, intent, i11, i12, i13, bundle2);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !e().f23368v) {
            return;
        }
        if (this.mHost == null) {
            e().f23368v = false;
        } else if (Looper.myLooper() != this.mHost.h().getLooper()) {
            this.mHost.h().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static ComponentCallbacksC2736q instantiate(Context context, String str, Bundle bundle) {
        try {
            ComponentCallbacksC2736q componentCallbacksC2736q = (ComponentCallbacksC2736q) C2744z.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return componentCallbacksC2736q;
            }
            bundle.setClassLoader(componentCallbacksC2736q.getClass().getClassLoader());
            componentCallbacksC2736q.setArguments(bundle);
            return componentCallbacksC2736q;
        } catch (IllegalAccessException e10) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        e().f23368v = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        J j11 = this.mFragmentManager;
        if (j11 != null) {
            this.mPostponedHandler = j11.y0().h();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> f.c registerForActivityResult(AbstractC4051a abstractC4051a, f.f fVar, f.b bVar) {
        return i(abstractC4051a, new i(fVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        A a10 = this.mHost;
        if (a10 != null) {
            a10.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().U0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        A a10 = this.mHost;
        if (a10 != null) {
            LayoutInflater layoutInflaterK = a10.k();
            AbstractC2556j.a(layoutInflaterK, this.mChildFragmentManager.z0());
            return layoutInflaterK;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC2736q componentCallbacksC2736q) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }
}
