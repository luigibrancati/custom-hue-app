package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugins.webviewflutter.WebViewProxyApi;
import io.sentry.protocol.Request;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 <2\u00020\u0001:\u0003=><B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u001d\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\rJ\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000f*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\bJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR&\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010!\u0012\u0004\u0012\u00020\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R<\u0010&\u001a*\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010!0$j\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010!`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010$j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R<\u0010,\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010!\u0012\u0004\u0012\u00020\n0$j\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010!\u0012\u0004\u0012\u00020\n`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010'R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R*\u00107\u001a\u00020\n2\u0006\u00106\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00104\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;", "finalizationListener", "<init>", "(Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;)V", "Lfc/H;", "releaseAllFinalizedInstances", "()V", "instance", "", "identifier", "addInstance", "(Ljava/lang/Object;J)V", "logWarningIfFinalizationListenerHasStopped", "T", "remove", "(J)Ljava/lang/Object;", "getIdentifierForStrongReference", "(Ljava/lang/Object;)Ljava/lang/Long;", "addDartCreatedInstance", "addHostCreatedInstance", "(Ljava/lang/Object;)J", "getInstance", "", "containsInstance", "(Ljava/lang/Object;)Z", "stopFinalizationListener", "clear", "hasFinalizationListenerStopped", "()Z", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;", "Ljava/util/WeakHashMap;", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$IdentityWeakReference;", "identifiers", "Ljava/util/WeakHashMap;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "weakInstances", "Ljava/util/HashMap;", "strongInstances", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "weakReferencesToIdentifiers", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "releaseAllFinalizedInstancesRunnable", "Ljava/lang/Runnable;", "nextIdentifier", "J", "Z", "value", "clearFinalizedWeakReferencesInterval", "getClearFinalizedWeakReferencesInterval", "()J", "setClearFinalizedWeakReferencesInterval", "(J)V", "Companion", "PigeonFinalizationListener", "IdentityWeakReference", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AndroidWebkitLibraryPigeonInstanceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long minHostCreatedIdentifier = 65536;
    private static final String tag = "PigeonInstanceManager";
    private long clearFinalizedWeakReferencesInterval;
    private final PigeonFinalizationListener finalizationListener;
    private final Handler handler;
    private boolean hasFinalizationListenerStopped;
    private final WeakHashMap<IdentityWeakReference<Object>, Long> identifiers;
    private long nextIdentifier;
    private final ReferenceQueue<Object> referenceQueue;
    private final Runnable releaseAllFinalizedInstancesRunnable;
    private final HashMap<Long, Object> strongInstances;
    private final HashMap<Long, IdentityWeakReference<Object>> weakInstances;
    private final HashMap<IdentityWeakReference<Object>, Long> weakReferencesToIdentifiers;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$Companion;", "", "<init>", "()V", "minHostCreatedIdentifier", "", "tag", "", "create", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager;", "finalizationListener", "Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final AndroidWebkitLibraryPigeonInstanceManager create(PigeonFinalizationListener finalizationListener) {
            AbstractC4862t.e(finalizationListener, "finalizationListener");
            return new AndroidWebkitLibraryPigeonInstanceManager(finalizationListener);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$IdentityWeakReference;", "T", "", "Ljava/lang/ref/WeakReference;", "instance", "<init>", "(Ljava/lang/Object;)V", "queue", "Ljava/lang/ref/ReferenceQueue;", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", "savedHashCode", "", "equals", "", Request.JsonKeys.OTHER, "hashCode", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IdentityWeakReference<T> extends WeakReference<T> {
        private final int savedHashCode;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IdentityWeakReference(T instance) {
            this(instance, null);
            AbstractC4862t.e(instance, "instance");
        }

        public boolean equals(Object other) {
            T t10 = get();
            return t10 != null ? (other instanceof IdentityWeakReference) && ((IdentityWeakReference) other).get() == t10 : other == this;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public int getSavedHashCode() {
            return this.savedHashCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityWeakReference(T instance, ReferenceQueue<T> referenceQueue) {
            super(instance, referenceQueue);
            AbstractC4862t.e(instance, "instance");
            this.savedHashCode = System.identityHashCode(instance);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/flutter/plugins/webviewflutter/AndroidWebkitLibraryPigeonInstanceManager$PigeonFinalizationListener;", "", "", "identifier", "Lfc/H;", "onFinalize", "(J)V", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PigeonFinalizationListener {
        void onFinalize(long identifier);
    }

    public AndroidWebkitLibraryPigeonInstanceManager(PigeonFinalizationListener finalizationListener) {
        AbstractC4862t.e(finalizationListener, "finalizationListener");
        this.finalizationListener = finalizationListener;
        this.identifiers = new WeakHashMap<>();
        this.weakInstances = new HashMap<>();
        this.strongInstances = new HashMap<>();
        this.referenceQueue = new ReferenceQueue<>();
        this.weakReferencesToIdentifiers = new HashMap<>();
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        Runnable runnable = new Runnable() { // from class: io.flutter.plugins.webviewflutter.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f38198a.releaseAllFinalizedInstances();
            }
        };
        this.releaseAllFinalizedInstancesRunnable = runnable;
        this.nextIdentifier = minHostCreatedIdentifier;
        this.clearFinalizedWeakReferencesInterval = 3000L;
        handler.postDelayed(runnable, 3000L);
    }

    private final void addInstance(Object instance, long identifier) {
        if (identifier < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + identifier).toString());
        }
        if (this.weakInstances.containsKey(Long.valueOf(identifier))) {
            throw new IllegalArgumentException(("Identifier has already been added: " + identifier).toString());
        }
        IdentityWeakReference<Object> identityWeakReference = new IdentityWeakReference<>(instance, this.referenceQueue);
        this.identifiers.put(identityWeakReference, Long.valueOf(identifier));
        this.weakInstances.put(Long.valueOf(identifier), identityWeakReference);
        this.weakReferencesToIdentifiers.put(identityWeakReference, Long.valueOf(identifier));
        this.strongInstances.put(Long.valueOf(identifier), instance);
    }

    private final void logWarningIfFinalizationListenerHasStopped() {
        if (getHasFinalizationListenerStopped()) {
            Log.w(tag, "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseAllFinalizedInstances() {
        if (getHasFinalizationListenerStopped()) {
            return;
        }
        while (true) {
            IdentityWeakReference identityWeakReference = (IdentityWeakReference) this.referenceQueue.poll();
            if (identityWeakReference == null) {
                this.handler.postDelayed(this.releaseAllFinalizedInstancesRunnable, this.clearFinalizedWeakReferencesInterval);
                return;
            }
            Long l10 = (Long) kotlin.jvm.internal.T.c(this.weakReferencesToIdentifiers).remove(identityWeakReference);
            if (l10 != null) {
                this.weakInstances.remove(l10);
                this.strongInstances.remove(l10);
                this.finalizationListener.onFinalize(l10.longValue());
            }
        }
    }

    public final void addDartCreatedInstance(Object instance, long identifier) {
        AbstractC4862t.e(instance, "instance");
        logWarningIfFinalizationListenerHasStopped();
        addInstance(instance, identifier);
    }

    public final long addHostCreatedInstance(Object instance) {
        AbstractC4862t.e(instance, "instance");
        logWarningIfFinalizationListenerHasStopped();
        if (!containsInstance(instance)) {
            long j10 = this.nextIdentifier;
            this.nextIdentifier = 1 + j10;
            addInstance(instance, j10);
            return j10;
        }
        throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
    }

    public final void clear() {
        this.identifiers.clear();
        this.weakInstances.clear();
        this.strongInstances.clear();
        this.weakReferencesToIdentifiers.clear();
    }

    public final boolean containsInstance(Object instance) {
        logWarningIfFinalizationListenerHasStopped();
        return instance != null && this.identifiers.containsKey(new IdentityWeakReference(instance));
    }

    public final long getClearFinalizedWeakReferencesInterval() {
        return this.clearFinalizedWeakReferencesInterval;
    }

    public final Long getIdentifierForStrongReference(Object instance) {
        logWarningIfFinalizationListenerHasStopped();
        if (instance == null) {
            return null;
        }
        Long l10 = this.identifiers.get(new IdentityWeakReference(instance));
        if (l10 != null) {
            this.strongInstances.put(l10, instance);
        }
        return l10;
    }

    public final <T> T getInstance(long identifier) {
        logWarningIfFinalizationListenerHasStopped();
        IdentityWeakReference<Object> identityWeakReference = this.weakInstances.get(Long.valueOf(identifier));
        if (identityWeakReference != null) {
            return (T) identityWeakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: hasFinalizationListenerStopped, reason: from getter */
    public final boolean getHasFinalizationListenerStopped() {
        return this.hasFinalizationListenerStopped;
    }

    public final <T> T remove(long identifier) {
        logWarningIfFinalizationListenerHasStopped();
        Object androidWebkitLibraryPigeonInstanceManager = getInstance(identifier);
        if (androidWebkitLibraryPigeonInstanceManager instanceof WebViewProxyApi.WebViewPlatformView) {
            ((WebViewProxyApi.WebViewPlatformView) androidWebkitLibraryPigeonInstanceManager).destroy();
        }
        return (T) this.strongInstances.remove(Long.valueOf(identifier));
    }

    public final void setClearFinalizedWeakReferencesInterval(long j10) {
        this.handler.removeCallbacks(this.releaseAllFinalizedInstancesRunnable);
        this.clearFinalizedWeakReferencesInterval = j10;
        releaseAllFinalizedInstances();
    }

    public final void stopFinalizationListener() {
        this.handler.removeCallbacks(this.releaseAllFinalizedInstancesRunnable);
        this.hasFinalizationListenerStopped = true;
    }
}
