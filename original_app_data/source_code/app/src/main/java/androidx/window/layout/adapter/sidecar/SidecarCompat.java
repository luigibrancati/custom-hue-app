package androidx.window.layout.adapter.sidecar;

import C3.s;
import F3.e;
import L0.d;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import fc.C4015H;
import gc.C4206t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import z3.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f24682f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f24683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f24684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f24685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f24686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f24687e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lfc/H;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterfaceH;
            AbstractC4862t.e(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = SidecarCompat.this.f24685c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.f24682f.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterfaceH = sidecarCompat.h()) != null) {
                    windowLayoutInfo = sidecarInterfaceH.getWindowLayoutInfo(iBinderA);
                }
                b bVar = sidecarCompat.f24687e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f24684b.i(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState sidecarDeviceState;
            AbstractC4862t.e(windowToken, "windowToken");
            AbstractC4862t.e(newLayout, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f24685c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            e eVar = SidecarCompat.this.f24684b;
            SidecarInterface sidecarInterfaceH = SidecarCompat.this.h();
            if (sidecarInterfaceH == null || (sidecarDeviceState = sidecarInterfaceH.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            s sVarI = eVar.i(newLayout, sidecarDeviceState);
            b bVar = SidecarCompat.this.f24687e;
            if (bVar != null) {
                bVar.a(activity, sVarI);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            AbstractC4862t.e(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final l c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return l.f48733f.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements a.InterfaceC0316a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0316a f24689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReentrantLock f24690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakHashMap f24691c;

        public b(a.InterfaceC0316a callbackInterface) {
            AbstractC4862t.e(callbackInterface, "callbackInterface");
            this.f24689a = callbackInterface;
            this.f24690b = new ReentrantLock();
            this.f24691c = new WeakHashMap();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0316a
        public void a(Activity activity, s newLayout) {
            AbstractC4862t.e(activity, "activity");
            AbstractC4862t.e(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f24690b;
            reentrantLock.lock();
            try {
                if (AbstractC4862t.a(newLayout, (s) this.f24691c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.f24689a.a(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            AbstractC4862t.e(activity, "activity");
            ReentrantLock reentrantLock = this.f24690b;
            reentrantLock.lock();
            try {
                this.f24691c.put(activity, null);
                C4015H c4015h = C4015H.f34254a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SidecarCompat f24692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference f24693b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            AbstractC4862t.e(sidecarCompat, "sidecarCompat");
            AbstractC4862t.e(activity, "activity");
            this.f24692a = sidecarCompat;
            this.f24693b = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC4862t.e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f24693b.get();
            IBinder iBinderA = SidecarCompat.f24682f.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f24692a.j(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC4862t.e(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, e sidecarAdapter) {
        AbstractC4862t.e(sidecarAdapter, "sidecarAdapter");
        this.f24683a = sidecarInterface;
        this.f24684b = sidecarAdapter;
        this.f24685c = new LinkedHashMap();
        this.f24686d = new LinkedHashMap();
    }

    public static final void l(SidecarCompat sidecarCompat, Activity activity, Configuration configuration) {
        b bVar = sidecarCompat.f24687e;
        if (bVar != null) {
            bVar.a(activity, sidecarCompat.i(activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(a.InterfaceC0316a extensionCallback) {
        AbstractC4862t.e(extensionCallback, "extensionCallback");
        this.f24687e = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.f24683a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f24684b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        AbstractC4862t.e(activity, "activity");
        IBinder iBinderA = f24682f.a(activity);
        if (iBinderA != null) {
            j(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        AbstractC4862t.e(activity, "activity");
        IBinder iBinderA = f24682f.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f24683a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        m(activity);
        b bVar = this.f24687e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z10 = this.f24685c.size() == 1;
        this.f24685c.remove(iBinderA);
        if (!z10 || (sidecarInterface = this.f24683a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface h() {
        return this.f24683a;
    }

    public final s i(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        AbstractC4862t.e(activity, "activity");
        IBinder iBinderA = f24682f.a(activity);
        if (iBinderA == null) {
            return new s(C4206t.k());
        }
        SidecarInterface sidecarInterface = this.f24683a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        e eVar = this.f24684b;
        SidecarInterface sidecarInterface2 = this.f24683a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return eVar.i(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        AbstractC4862t.e(windowToken, "windowToken");
        AbstractC4862t.e(activity, "activity");
        this.f24685c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f24683a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f24685c.size() == 1 && (sidecarInterface = this.f24683a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f24687e;
        if (bVar != null) {
            bVar.a(activity, i(activity));
        }
        k(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(final Activity activity) {
        if (this.f24686d.get(activity) == null && (activity instanceof d)) {
            X0.a aVar = new X0.a() { // from class: F3.f
                @Override // X0.a
                public final void accept(Object obj) {
                    SidecarCompat.l(this.f3710a, activity, (Configuration) obj);
                }
            };
            this.f24686d.put(activity, aVar);
            ((d) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(Activity activity) {
        X0.a aVar = (X0.a) this.f24686d.get(activity);
        if (aVar == null) {
            return;
        }
        if (activity instanceof d) {
            ((d) activity).removeOnConfigurationChangedListener(aVar);
        }
        this.f24686d.remove(activity);
    }

    public boolean n() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f24683a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!AbstractC4862t.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f24683a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f24683a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f24683a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!AbstractC4862t.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f24683a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!AbstractC4862t.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f24683a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!AbstractC4862t.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            AbstractC4862t.d(rect, "getRect(...)");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                AbstractC4862t.c(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (AbstractC4862t.a(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f24682f.b(context), new e(null, 1, null));
        AbstractC4862t.e(context, "context");
    }
}
