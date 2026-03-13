package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.B;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0002\u0013\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/n;", "<init>", "()V", "Lfc/H;", "e", "d", "c", "f", "i", "j", "Landroid/content/Context;", "context", "g", "(Landroid/content/Context;)V", "", "a", "I", "startedCounter", "b", "resumedCounter", "", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/o;", "Landroidx/lifecycle/o;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/B$a;", "h", "Landroidx/lifecycle/B$a;", "initializationListener", "Landroidx/lifecycle/j;", "getLifecycle", "()Landroidx/lifecycle/j;", "lifecycle", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleOwner implements InterfaceC2758n {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProcessLifecycleOwner f23434j = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int startedCounter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int resumedCounter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Handler handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean pauseSent = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean stopSent = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final C2759o registry = new C2759o(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.z
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.h(this.f23494a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final B.a initializationListener = new d();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23443a = new a();

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            AbstractC4862t.e(activity, "activity");
            AbstractC4862t.e(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.ProcessLifecycleOwner$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final InterfaceC2758n a() {
            return ProcessLifecycleOwner.f23434j;
        }

        public final void b(Context context) {
            AbstractC4862t.e(context, "context");
            ProcessLifecycleOwner.f23434j.g(context);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends C2750f {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends C2750f {
            final /* synthetic */ ProcessLifecycleOwner this$0;

            public a(ProcessLifecycleOwner processLifecycleOwner) {
                this.this$0 = processLifecycleOwner;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                AbstractC4862t.e(activity, "activity");
                this.this$0.d();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                AbstractC4862t.e(activity, "activity");
                this.this$0.e();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.C2750f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC4862t.e(activity, "activity");
        }

        @Override // androidx.lifecycle.C2750f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC4862t.e(activity, "activity");
            ProcessLifecycleOwner.this.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            AbstractC4862t.e(activity, "activity");
            a.a(activity, new a(ProcessLifecycleOwner.this));
        }

        @Override // androidx.lifecycle.C2750f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC4862t.e(activity, "activity");
            ProcessLifecycleOwner.this.f();
        }
    }

    private ProcessLifecycleOwner() {
    }

    public static final void h(ProcessLifecycleOwner processLifecycleOwner) {
        processLifecycleOwner.i();
        processLifecycleOwner.j();
    }

    public static final InterfaceC2758n k() {
        return INSTANCE.a();
    }

    public final void c() {
        int i10 = this.resumedCounter - 1;
        this.resumedCounter = i10;
        if (i10 == 0) {
            Handler handler = this.handler;
            AbstractC4862t.b(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void d() {
        int i10 = this.resumedCounter + 1;
        this.resumedCounter = i10;
        if (i10 == 1) {
            if (this.pauseSent) {
                this.registry.h(AbstractC2754j.a.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                AbstractC4862t.b(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void e() {
        int i10 = this.startedCounter + 1;
        this.startedCounter = i10;
        if (i10 == 1 && this.stopSent) {
            this.registry.h(AbstractC2754j.a.ON_START);
            this.stopSent = false;
        }
    }

    public final void f() {
        this.startedCounter--;
        j();
    }

    public final void g(Context context) {
        AbstractC4862t.e(context, "context");
        this.handler = new Handler();
        this.registry.h(AbstractC2754j.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    @Override // androidx.lifecycle.InterfaceC2758n
    public AbstractC2754j getLifecycle() {
        return this.registry;
    }

    public final void i() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.h(AbstractC2754j.a.ON_PAUSE);
        }
    }

    public final void j() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.h(AbstractC2754j.a.ON_STOP);
            this.stopSent = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements B.a {
        public d() {
        }

        @Override // androidx.lifecycle.B.a
        public void onResume() {
            ProcessLifecycleOwner.this.d();
        }

        @Override // androidx.lifecycle.B.a
        public void v() {
            ProcessLifecycleOwner.this.e();
        }

        @Override // androidx.lifecycle.B.a
        public void onCreate() {
        }
    }
}
