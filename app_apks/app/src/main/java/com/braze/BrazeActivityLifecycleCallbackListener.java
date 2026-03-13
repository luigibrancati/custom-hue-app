package com.braze;

import Rd.AbstractC2132i;
import Rd.M;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.U;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ!\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001dR*\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/braze/BrazeActivityLifecycleCallbackListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "", "sessionHandlingEnabled", "registerInAppMessageManager", "", "Ljava/lang/Class;", "inAppMessagingRegistrationBlocklist", "sessionHandlingBlocklist", "<init>", "(ZZLjava/util/Set;Ljava/util/Set;)V", "Landroid/app/Activity;", "activity", "Lfc/H;", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "onActivityResumed", "onActivityPaused", "Landroid/os/Bundle;", "bundle", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivitySaveInstanceState", "onActivityDestroyed", "forSessionHandling", "shouldHandleLifecycleMethodsInActivity", "(Landroid/app/Activity;Z)Z", "Z", "Ljava/util/Set;", "shouldPersistWebView", "Ljava/lang/Boolean;", "getShouldPersistWebView", "()Ljava/lang/Boolean;", "setShouldPersistWebView", "(Ljava/lang/Boolean;)V", "getShouldPersistWebView$annotations", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoadingShouldPersistWebView", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/lang/ref/WeakReference;", "currentActivityRef", "Ljava/lang/ref/WeakReference;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    private WeakReference<Activity> currentActivityRef;
    private Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;
    private final AtomicBoolean isLoadingShouldPersistWebView;
    private final boolean registerInAppMessageManager;
    private Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;
    private volatile Boolean shouldPersistWebView;

    /* JADX INFO: renamed from: com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 0, 0})
    @nc.f(c = "com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$2", f = "BrazeActivityLifecycleCallbackListener.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends nc.m implements vc.p {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BrazeActivityLifecycleCallbackListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$context = context;
            this.this$0 = brazeActivityLifecycleCallbackListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Error while reading shouldPersistWebViewWhenBackgroundingApp from BrazeConfigurationProvider";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
            return "Async load of shouldPersistWebView completed: " + brazeActivityLifecycleCallbackListener.getShouldPersistWebView();
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.this$0, interfaceC4988e);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass2) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            M m10 = (M) this.L$0;
            try {
                Context context = this.$context;
                AbstractC4862t.b(context);
                this.this$0.setShouldPersistWebView(AbstractC5158b.a(new BrazeConfigurationProvider(context).getShouldPersistWebViewWhenBackgroundingApp()));
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: com.braze.b
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeActivityLifecycleCallbackListener.AnonymousClass2.invokeSuspend$lambda$0();
                    }
                }, 4, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
            final BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener = this.this$0;
            BrazeLogger.brazelog$default(brazeLogger, (Object) m10, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: com.braze.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeActivityLifecycleCallbackListener.AnonymousClass2.invokeSuspend$lambda$1(brazeActivityLifecycleCallbackListener);
                }
            }, 6, (Object) null);
            return C4015H.f34254a;
        }
    }

    public BrazeActivityLifecycleCallbackListener() {
        this(false, false, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: " + brazeActivityLifecycleCallbackListener.inAppMessagingRegistrationBlocklist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "BrazeActivityLifecycleCallbackListener using session handling blocklist: " + brazeActivityLifecycleCallbackListener.sessionHandlingBlocklist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityCreated$lambda$10(Activity activity) {
        return "Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityPaused$lambda$8(Activity activity) {
        return "Automatically calling lifecycle method: unregisterInAppMessageManager for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityPaused$lambda$9(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "Skipping unregisterInAppMessageManager in onActivityPaused. shouldPersistWebView=" + brazeActivityLifecycleCallbackListener.shouldPersistWebView + " (null means async load incomplete, defaulting to persist)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityResumed$lambda$6() {
        return "Activity is different from previous activity. Unregistering in-app message manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityResumed$lambda$7(Activity activity) {
        return "Automatically calling lifecycle method: registerInAppMessageManager for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityStarted$lambda$4(Activity activity) {
        return "Automatically calling lifecycle method: openSession for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityStopped$lambda$5(Activity activity) {
        return "Automatically calling lifecycle method: closeSession for class: " + activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldHandleLifecycleMethodsInActivity$lambda$11() {
        return "Skipping automatic registration for notification trampoline activity class.";
    }

    public final Boolean getShouldPersistWebView() {
        return this.shouldPersistWebView;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        AbstractC4862t.e(activity, "activity");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.g3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeActivityLifecycleCallbackListener.onActivityCreated$lambda$10(activity);
            }
        }, 6, (Object) null);
        BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
        Context applicationContext = activity.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        companion.ensureSubscribedToInAppMessageEvents(applicationContext);
        if (this.registerInAppMessageManager && this.shouldPersistWebView == null && this.isLoadingShouldPersistWebView.compareAndSet(false, true)) {
            AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass2(activity.getApplicationContext(), this, null), 3, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC4862t.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        AbstractC4862t.e(activity, "activity");
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            if (AbstractC4862t.a(this.shouldPersistWebView, Boolean.FALSE)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.d3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeActivityLifecycleCallbackListener.onActivityPaused$lambda$8(activity);
                    }
                }, 6, (Object) null);
                BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
            } else {
                BrazeInAppMessageManager.INSTANCE.getInstance().pauseWebviewIfNecessary$android_sdk_ui_release();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.e3
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeActivityLifecycleCallbackListener.onActivityPaused$lambda$9(this.f14679a);
                    }
                }, 6, (Object) null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        AbstractC4862t.e(activity, "activity");
        if (this.registerInAppMessageManager) {
            if (shouldHandleLifecycleMethodsInActivity(activity, false)) {
                WeakReference<Activity> weakReference = this.currentActivityRef;
                Activity activity2 = weakReference != null ? weakReference.get() : null;
                Boolean bool = this.shouldPersistWebView;
                Boolean bool2 = Boolean.TRUE;
                if (AbstractC4862t.a(bool, bool2) && activity2 != null && !AbstractC4862t.a(activity2, activity)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.h3
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeActivityLifecycleCallbackListener.onActivityResumed$lambda$6();
                        }
                    }, 6, (Object) null);
                    BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
                }
                if (AbstractC4862t.a(this.shouldPersistWebView, bool2) && activity2 != null && AbstractC4862t.a(activity2, activity)) {
                    BrazeInAppMessageManager.INSTANCE.getInstance().resumeWebviewIfNecessary$android_sdk_ui_release();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.i3
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeActivityLifecycleCallbackListener.onActivityResumed$lambda$7(activity);
                        }
                    }, 6, (Object) null);
                    BrazeInAppMessageManager.INSTANCE.getInstance().registerInAppMessageManager(activity);
                }
            } else {
                BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
            }
        }
        this.currentActivityRef = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        AbstractC4862t.e(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.f3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeActivityLifecycleCallbackListener.onActivityStarted$lambda$4(activity);
                }
            }, 6, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
            companion.getInstance(applicationContext).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        AbstractC4862t.e(activity, "activity");
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.c3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeActivityLifecycleCallbackListener.onActivityStopped$lambda$5(activity);
                }
            }, 6, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
            companion.getInstance(applicationContext).closeSession(activity);
        }
    }

    public final void setShouldPersistWebView(Boolean bool) {
        this.shouldPersistWebView = bool;
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean forSessionHandling) {
        AbstractC4862t.e(activity, "activity");
        Class<?> cls = activity.getClass();
        if (!AbstractC4862t.a(cls, NotificationTrampolineActivity.class)) {
            return forSessionHandling ? !this.sessionHandlingBlocklist.contains(cls) : !this.inAppMessagingRegistrationBlocklist.contains(cls);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.l3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeActivityLifecycleCallbackListener.shouldHandleLifecycleMethodsInActivity$lambda$11();
            }
        }, 6, (Object) null);
        return false;
    }

    public BrazeActivityLifecycleCallbackListener(boolean z10, boolean z11, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z10;
        this.registerInAppMessageManager = z11;
        this.isLoadingShouldPersistWebView = new AtomicBoolean(false);
        this.inAppMessagingRegistrationBlocklist = set == null ? U.d() : set;
        this.sessionHandlingBlocklist = set2 == null ? U.d() : set2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.j3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeActivityLifecycleCallbackListener._init_$lambda$0(this.f14702a);
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.k3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeActivityLifecycleCallbackListener._init_$lambda$1(this.f14707a);
            }
        }, 6, (Object) null);
    }

    public /* synthetic */ BrazeActivityLifecycleCallbackListener(boolean z10, boolean z11, Set set, Set set2, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? U.d() : set, (i10 & 8) != 0 ? U.d() : set2);
    }
}
