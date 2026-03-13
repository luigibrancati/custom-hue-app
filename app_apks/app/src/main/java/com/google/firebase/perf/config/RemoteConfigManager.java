package com.google.firebase.perf.config;

import O8.b;
import Y8.d;
import Y8.x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import b7.InterfaceC2873g;
import b7.InterfaceC2874h;
import b9.C2898a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.g;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k9.o;
import k9.v;
import k9.z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, v> allRcConfigMap;
    private final x cache;
    private final Executor executor;
    private o firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private b firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final C2898a logger = C2898a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.e(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS)) + MIN_CONFIG_FETCH_DELAY_MS);
    }

    public static /* synthetic */ void a(RemoteConfigManager remoteConfigManager, Exception exc) {
        remoteConfigManager.getClass();
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        remoteConfigManager.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private v getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        v vVar = this.allRcConfigMap.get(str);
        if (vVar.j() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", vVar.b(), str);
        return vVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j10) {
        return j10 - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.m().i(this.executor, new InterfaceC2874h() { // from class: Y8.y
            @Override // b7.InterfaceC2874h
            public final void onSuccess(Object obj) {
                RemoteConfigManager remoteConfigManager = this.f19858a;
                remoteConfigManager.syncConfigValues(remoteConfigManager.firebaseRemoteConfig.n());
            }
        }).f(this.executor, new InterfaceC2873g() { // from class: Y8.z
            @Override // b7.InterfaceC2873g
            public final void c(Exception exc) {
                RemoteConfigManager.a(this.f19859a, exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.n());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public g getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return g.a();
        }
        v remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Boolean.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return g.a();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public g getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return g.a();
        }
        v remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Double.valueOf(remoteConfigValue.d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return g.a();
    }

    public g getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return g.a();
        }
        v remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Long.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return g.a();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        v remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t10 instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.e());
                }
                if (t10 instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.d());
                }
                if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                    if (t10 instanceof String) {
                        return (T) remoteConfigValue.b();
                    }
                    T t11 = (T) remoteConfigValue.b();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                        return t11;
                    } catch (IllegalArgumentException unused) {
                        t10 = t11;
                        if (!remoteConfigValue.b().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                        }
                        return t10;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t10;
    }

    public g getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return g.a();
        }
        v remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? g.e(remoteConfigValue.b()) : g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        b bVar;
        z zVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (zVar = (z) bVar.get()) != null) {
            this.firebaseRemoteConfig = zVar.e(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        o oVar = this.firebaseRemoteConfig;
        return oVar == null || oVar.o().c() == 1 || this.firebaseRemoteConfig.o().c() == 2;
    }

    public void setFirebaseRemoteConfigProvider(b bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    public void syncConfigValues(Map<String, v> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d dVarE = d.e();
        v vVar = this.allRcConfigMap.get(dVarE.c());
        if (vVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.l(dVarE.a(), vVar.e());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    public RemoteConfigManager(x xVar, Executor executor, o oVar, long j10) {
        ConcurrentHashMap<String, v> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = xVar;
        this.executor = executor;
        this.firebaseRemoteConfig = oVar;
        if (oVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>((Map<? extends String, ? extends v>) oVar.n());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j10;
    }
}
