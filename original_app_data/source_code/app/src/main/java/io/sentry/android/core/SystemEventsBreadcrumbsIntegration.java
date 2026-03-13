package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.AppState;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.protocol.Device;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SystemEventsBreadcrumbsIntegration implements Integration, Closeable, AppState.AppStateListener {
    private final String[] actions;
    private final Context context;
    Handler customHandler;
    private volatile IntentFilter filter;
    private volatile HandlerThread handlerThread;
    private volatile boolean isClosed;
    private final AtomicBoolean isReceiverRegistered;
    private volatile boolean isStopped;
    private SentryAndroidOptions options;
    private BatteryState previousBatteryState;
    volatile SystemEventsBroadcastReceiver receiver;
    private final AutoClosableReentrantLock receiverLock;
    private IScopes scopes;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class BatteryState {
        private final Boolean charging;
        private final Integer level;

        public BatteryState(Integer num, Boolean bool) {
            this.level = num;
            this.charging = bool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BatteryState)) {
                return false;
            }
            BatteryState batteryState = (BatteryState) obj;
            return Objects.equals(this.level, batteryState.level) && Objects.equals(this.charging, batteryState.charging);
        }

        public int hashCode() {
            return Objects.hash(this.level, this.charging);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class SystemEventsBroadcastReceiver extends BroadcastReceiver {
        private static final long DEBOUNCE_WAIT_TIME_MS = 60000;
        private final Debouncer batteryChangedDebouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), 60000, 0);
        private final char[] buf = new char[64];
        private final SentryAndroidOptions options;
        private final IScopes scopes;

        public SystemEventsBroadcastReceiver(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
            this.scopes = iScopes;
            this.options = sentryAndroidOptions;
        }

        private Breadcrumb createBreadcrumb(long j10, Intent intent, String str, BatteryState batteryState) {
            Bundle extras;
            Breadcrumb breadcrumb = new Breadcrumb(j10);
            breadcrumb.setType("system");
            breadcrumb.setCategory("device.event");
            String stringAfterDotFast = getStringAfterDotFast(str);
            if (stringAfterDotFast != null) {
                breadcrumb.setData("action", stringAfterDotFast);
            }
            if (batteryState != null) {
                if (batteryState.level != null) {
                    breadcrumb.setData("level", batteryState.level);
                }
                if (batteryState.charging != null) {
                    breadcrumb.setData(Device.JsonKeys.CHARGING, batteryState.charging);
                }
            } else if (this.options.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th) {
                        this.options.getLogger().log(SentryLevel.ERROR, th, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                breadcrumb.setData("extras", map);
            }
            breadcrumb.setLevel(SentryLevel.INFO);
            return breadcrumb;
        }

        public String getStringAfterDotFast(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.buf.length;
            for (int i10 = length - 1; i10 >= 0; i10--) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '.') {
                    char[] cArr = this.buf;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return StringUtils.getStringAfterDot(str);
                }
                length2--;
                this.buf[length2] = cCharAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BatteryState batteryState;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                batteryState = null;
            } else {
                if (this.batteryChangedDebouncer.checkForDebounce()) {
                    return;
                }
                Float batteryLevel = DeviceInfoUtil.getBatteryLevel(intent, this.options);
                BatteryState batteryState2 = new BatteryState(batteryLevel != null ? Integer.valueOf(batteryLevel.intValue()) : null, DeviceInfoUtil.isCharging(intent, this.options));
                if (batteryState2.equals(SystemEventsBreadcrumbsIntegration.this.previousBatteryState)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.previousBatteryState = batteryState2;
                batteryState = batteryState2;
            }
            Breadcrumb breadcrumbCreateBreadcrumb = createBreadcrumb(System.currentTimeMillis(), intent, action, batteryState);
            Hint hint = new Hint();
            hint.set(TypeCheckHint.ANDROID_INTENT, intent);
            this.scopes.addBreadcrumb(breadcrumbCreateBreadcrumb, hint);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, getDefaultActionsInternal(), null);
    }

    public static /* synthetic */ void a(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = systemEventsBreadcrumbsIntegration.receiverLock.acquire();
        try {
            if (!systemEventsBreadcrumbsIntegration.isClosed && !systemEventsBreadcrumbsIntegration.isStopped && systemEventsBreadcrumbsIntegration.receiver == null) {
                systemEventsBreadcrumbsIntegration.receiver = systemEventsBreadcrumbsIntegration.new SystemEventsBroadcastReceiver(iScopes, sentryAndroidOptions);
                if (systemEventsBreadcrumbsIntegration.filter == null) {
                    systemEventsBreadcrumbsIntegration.filter = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.actions) {
                        systemEventsBreadcrumbsIntegration.filter.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.customHandler == null && systemEventsBreadcrumbsIntegration.handlerThread == null) {
                    systemEventsBreadcrumbsIntegration.handlerThread = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.handlerThread.start();
                }
                try {
                    Handler handler = systemEventsBreadcrumbsIntegration.customHandler;
                    if (handler == null) {
                        handler = new Handler(systemEventsBreadcrumbsIntegration.handlerThread.getLooper());
                    }
                    ContextUtils.registerReceiver(systemEventsBreadcrumbsIntegration.context, sentryAndroidOptions, systemEventsBreadcrumbsIntegration.receiver, systemEventsBreadcrumbsIntegration.filter, handler);
                    if (!systemEventsBreadcrumbsIntegration.isReceiverRegistered.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        IntegrationUtils.addIntegrationToSdkVersion("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static List<String> getDefaultActions() {
        return Arrays.asList(getDefaultActionsInternal());
    }

    private static String[] getDefaultActionsInternal() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    private void registerReceiver(final IScopes iScopes, final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.isClosed && !this.isStopped && this.receiver == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.a(this.f38594a, iScopes, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    private void scheduleUnregisterReceiver() {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38590a.unregisterReceiver();
                }
            });
        } catch (RejectedExecutionException unused) {
            unregisterReceiver();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterReceiver() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.receiverLock.acquire();
        try {
            this.isStopped = true;
            SystemEventsBroadcastReceiver systemEventsBroadcastReceiver = this.receiver;
            this.receiver = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (systemEventsBroadcastReceiver != null) {
                this.context.unregisterReceiver(systemEventsBroadcastReceiver);
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.receiverLock.acquire();
        try {
            this.isClosed = true;
            this.filter = null;
            if (this.handlerThread != null) {
                this.handlerThread.quit();
            }
            this.handlerThread = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            AppState.getInstance().removeAppStateListener(this);
            scheduleUnregisterReceiver();
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        scheduleUnregisterReceiver();
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
        if (this.scopes == null || this.options == null) {
            return;
        }
        this.isStopped = false;
        registerReceiver(this.scopes, this.options);
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        this.scopes = iScopes;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.options.isEnableSystemEventBreadcrumbs()));
        if (this.options.isEnableSystemEventBreadcrumbs()) {
            AppState.getInstance().addAppStateListener(this);
            if (ContextUtils.isForegroundImportance()) {
                registerReceiver(this.scopes, this.options);
            }
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context, Handler handler) {
        this(context, getDefaultActionsInternal(), handler);
    }

    public SystemEventsBreadcrumbsIntegration(Context context, String[] strArr, Handler handler) {
        this.isClosed = false;
        this.isStopped = false;
        this.filter = null;
        this.handlerThread = null;
        this.isReceiverRegistered = new AtomicBoolean(false);
        this.receiverLock = new AutoClosableReentrantLock();
        this.customHandler = null;
        this.context = ContextUtils.getApplicationContext(context);
        this.actions = strArr;
        this.customHandler = handler;
    }

    public SystemEventsBreadcrumbsIntegration(Context context, List<String> list) {
        this.isClosed = false;
        this.isStopped = false;
        this.filter = null;
        this.handlerThread = null;
        this.isReceiverRegistered = new AtomicBoolean(false);
        this.receiverLock = new AutoClosableReentrantLock();
        this.customHandler = null;
        this.context = ContextUtils.getApplicationContext(context);
        String[] strArr = new String[list.size()];
        this.actions = strArr;
        list.toArray(strArr);
    }
}
