package com.braze.managers;

import Od.F;
import android.app.PendingIntent;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import ge.C4231e;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 s2\u00020\u00012\u00020\u0001:\u0001sB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010\u0012J\u0019\u0010,\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b,\u0010 J\u000f\u0010-\u001a\u00020\u0010H\u0007¢\u0006\u0004\b-\u0010\u0012J%\u0010.\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010=\u001a\u00020<8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010\u0012\u001a\u0004\b?\u0010@R \u0010C\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010\u0012\u001a\u0004\bE\u0010FR\u001c\u0010I\u001a\n H*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR&\u0010O\u001a\b\u0012\u0004\u0012\u00020'0N8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bR\u0010\u0012\u001a\u0004\bQ\u00101R\"\u0010S\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010\u0012\u001a\u0004\bU\u0010VR(\u0010Y\u001a\u00020X8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b_\u0010\u0012\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010`\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b`\u0010a\u0012\u0004\be\u0010\u0012\u001a\u0004\bb\u0010c\"\u0004\bd\u0010 R(\u0010f\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bj\u0010\u0012\u001a\u0004\bf\u0010h\"\u0004\bi\u0010\u0018R(\u0010l\u001a\u00020k8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bl\u0010m\u0012\u0004\br\u0010\u0012\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager;", "", "Landroid/content/Context;", "context", "", "apiKey", "Lcom/braze/managers/m0;", "brazeManager", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/storage/b3;", "serverConfigStorageProvider", "Lcom/braze/events/e;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/managers/m0;Lcom/braze/configuration/BrazeConfigurationProvider;Lcom/braze/storage/b3;Lcom/braze/events/e;)V", "Lfc/H;", "initializeGeofences", "()V", "", "isGeofencesEnabledFromEnvironment", "(Landroid/content/Context;)Z", "reRegisterGeofences", "setUpGeofences", "(Z)V", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "tearDownGeofences", "(Landroid/app/PendingIntent;)V", "Lcom/braze/models/IBrazeLocation;", "location", "requestGeofenceRefresh", "(Lcom/braze/models/IBrazeLocation;)V", "ignoreRateLimit", "Lcom/braze/models/response/m;", "serverConfig", "configureFromServerConfig", "(Lcom/braze/models/response/m;)V", "", "Lcom/braze/models/BrazeGeofence;", "geofenceList", "registerGeofences", "(Ljava/util/List;)V", "unregisterGeofences", "onLocationRequestComplete", "requestSingleLocationUpdateFromGooglePlay", "registerGeofencesWithGooglePlay", "(Ljava/util/List;Landroid/app/PendingIntent;)V", "retrieveBrazeGeofencesFromLocalStorage", "()Ljava/util/List;", "Lcom/braze/managers/m0;", "getBrazeManager", "()Lcom/braze/managers/m0;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/storage/b3;", "Lcom/braze/storage/GeofenceDataStoreProvider;", "geofenceDataStoreProvider", "Lcom/braze/storage/GeofenceDataStoreProvider;", "getGeofenceDataStoreProvider", "()Lcom/braze/storage/GeofenceDataStoreProvider;", "Lcom/braze/location/a;", "brazeGeofenceApi", "Lcom/braze/location/a;", "getBrazeGeofenceApi", "()Lcom/braze/location/a;", "getBrazeGeofenceApi$annotations", "Lcom/braze/location/b;", "brazeLocationApi", "Lcom/braze/location/b;", "getBrazeLocationApi", "()Lcom/braze/location/b;", "getBrazeLocationApi$annotations", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "geofenceListLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "brazeGeofences", "Ljava/util/List;", "getBrazeGeofences", "getBrazeGeofences$annotations", "geofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "()Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent$annotations", "Lcom/braze/managers/n;", "brazeGeofenceReEligibilityManager", "Lcom/braze/managers/n;", "getBrazeGeofenceReEligibilityManager", "()Lcom/braze/managers/n;", "setBrazeGeofenceReEligibilityManager", "(Lcom/braze/managers/n;)V", "getBrazeGeofenceReEligibilityManager$annotations", "geofenceRequestLocation", "Lcom/braze/models/IBrazeLocation;", "getGeofenceRequestLocation", "()Lcom/braze/models/IBrazeLocation;", "setGeofenceRequestLocation", "getGeofenceRequestLocation$annotations", "isGeofencesEnabled", "Z", "()Z", "setGeofencesEnabled", "isGeofencesEnabled$annotations", "", "maxNumToRegister", "I", "getMaxNumToRegister", "()I", "setMaxNumToRegister", "(I)V", "getMaxNumToRegister$annotations", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeGeofenceManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context applicationContext;
    private final com.braze.location.a brazeGeofenceApi;
    private n brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final com.braze.location.b brazeLocationApi;
    private final m0 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final GeofenceDataStoreProvider geofenceDataStoreProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final b3 serverConfigStorageProvider;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager$Companion;", "", "<init>", "()V", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getGeofencesEnabledFromConfiguration", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Z", "Lcom/braze/storage/b3;", "serverConfigStorageProvider", "getGeofencesEnabledFromServerConfig", "(Lcom/braze/storage/b3;)Z", "", "getMaxNumToRegister", "(Lcom/braze/storage/b3;)I", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$0() {
            return "Geofences enabled in server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$1() {
            return "Geofences explicitly disabled via server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$2() {
            return "Geofences implicitly disabled via server configuration.";
        }

        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider configurationProvider) {
            AbstractC4862t.e(configurationProvider, "configurationProvider");
            return configurationProvider.isGeofencesEnabled();
        }

        public final boolean getGeofencesEnabledFromServerConfig(b3 serverConfigStorageProvider) {
            AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (!serverConfigStorageProvider.J()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.I
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$2();
                    }
                }, 6, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.I()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.G
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$0();
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.H
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$1();
                }
            }, 6, (Object) null);
            return false;
        }

        public final int getMaxNumToRegister(b3 serverConfigStorageProvider) {
            AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (serverConfigStorageProvider.q() > 0) {
                return serverConfigStorageProvider.q();
            }
            return 20;
        }

        private Companion() {
        }
    }

    public BrazeGeofenceManager(Context context, String apiKey, m0 brazeManager, BrazeConfigurationProvider configurationProvider, b3 serverConfigStorageProvider, com.braze.events.e internalIEventMessenger) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(internalIEventMessenger, "internalIEventMessenger");
        this.brazeManager = brazeManager;
        this.configurationProvider = configurationProvider;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        GeofenceDataStoreProvider geofenceDataStoreProvider = new GeofenceDataStoreProvider(context, apiKey);
        this.geofenceDataStoreProvider = geofenceDataStoreProvider;
        this.brazeGeofenceApi = new com.braze.location.a(geofenceDataStoreProvider);
        this.brazeLocationApi = new com.braze.location.b(context, p.f27959d.a(configurationProvider), configurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        this.brazeGeofences = C4179C.X0(retrieveBrazeGeofencesFromLocalStorage());
        AbstractC4862t.e(context, "context");
        this.geofenceTransitionPendingIntent = null;
        this.brazeGeofenceReEligibilityManager = new n(serverConfigStorageProvider, internalIEventMessenger, geofenceDataStoreProvider);
        Companion companion = INSTANCE;
        if (companion.getGeofencesEnabledFromServerConfig(serverConfigStorageProvider)) {
            isGeofencesEnabledFromEnvironment(context);
        }
        this.isGeofencesEnabled = false;
        this.maxNumToRegister = companion.getMaxNumToRegister(serverConfigStorageProvider);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeGeofenceManager._init_$lambda$0();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.z
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeGeofenceManager._init_$lambda$1();
            }
        }, 6, (Object) null);
        setUpGeofences(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "***Geofence API not found. Please include the android-sdk-location module***";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1() {
        return "Calling setUpGeofences on geofence manager init";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$27(boolean z10) {
        return "Geofences enabled server config value " + z10 + " received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$28(BrazeGeofenceManager brazeGeofenceManager) {
        return "Geofences enabled status newly set to " + brazeGeofenceManager.isGeofencesEnabled + " during server config update.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$29(boolean z10) {
        return "Geofences enabled status of `" + z10 + "` was unchanged during server config update.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$30(BrazeGeofenceManager brazeGeofenceManager) {
        return "Max number to register newly set to " + brazeGeofenceManager.maxNumToRegister + " via server config.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$2() {
        return "Request to set up geofences received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$3() {
        return "Not automatically requesting Geofences on initialization due to configuration.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$4() {
        return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$5() {
        return "Fine grained location permissions not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$6() {
        return "Background location access permission not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$7() {
        return "Google Play Services not available. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$8() {
        return "Braze Geofence API is not available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$40(IBrazeLocation iBrazeLocation) {
        return "Single location request was successful, requesting Geofence refresh. Location:\n " + iBrazeLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$41() {
        return "Single location request was unsuccessful, not storing last updated time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$31() {
        return "Braze geofences not enabled. Not adding new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$33(List list) {
        return "Received new geofence list of size: " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$34(BrazeGeofenceManager brazeGeofenceManager) {
        return "Reached maximum number of new geofences: " + brazeGeofenceManager.maxNumToRegister;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$35(BrazeGeofence brazeGeofence) {
        return "Adding new geofence to local storage: " + brazeGeofence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$36(BrazeGeofenceManager brazeGeofenceManager) {
        return "Added " + brazeGeofenceManager.brazeGeofences.size() + " new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$24() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$26() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H requestSingleLocationUpdateFromGooglePlay$lambda$42(BrazeGeofenceManager brazeGeofenceManager, IBrazeLocation location) {
        AbstractC4862t.e(location, "location");
        brazeGeofenceManager.onLocationRequestComplete(location);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$43() {
        return "Did not find stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$11() {
        return "Braze geofences not enabled. Geofences not set up.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$12(boolean z10) {
        return "Setting up geofences in setUpGeofences with reRegisterGeofences: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$13() {
        return "Could not get pending intent to setup geofences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$15() {
        return "Tearing down geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$16() {
        return "Unregistering any Braze geofences from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$18$lambda$17() {
        return "Deleting locally stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$38() {
        return "Braze geofences not enabled. Not un-registering geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$39() {
        return "Tearing down all geofences.";
    }

    public void configureFromServerConfig(com.braze.models.response.m serverConfig) {
        AbstractC4862t.e(serverConfig, "serverConfig");
        final boolean z10 = serverConfig.f28167i;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeGeofenceManager.configureFromServerConfig$lambda$27(z10);
            }
        }, 7, (Object) null);
        if (z10) {
            Context applicationContext = this.applicationContext;
            AbstractC4862t.d(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext)) {
                this.brazeGeofenceApi.getClass();
            }
        }
        final boolean z11 = false;
        if (this.isGeofencesEnabled) {
            this.isGeofencesEnabled = false;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.configureFromServerConfig$lambda$28(this.f25748a);
                }
            }, 6, (Object) null);
            if (this.isGeofencesEnabled) {
                setUpGeofences(false);
                if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                    requestGeofenceRefresh(true);
                }
            } else {
                tearDownGeofences(this.geofenceTransitionPendingIntent);
            }
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.configureFromServerConfig$lambda$29(z11);
                }
            }, 7, (Object) null);
        }
        int i10 = serverConfig.f28165g;
        if (i10 >= 0) {
            this.maxNumToRegister = i10;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.o
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.configureFromServerConfig$lambda$30(this.f25759a);
                }
            }, 6, (Object) null);
        }
        this.brazeGeofenceReEligibilityManager.a(serverConfig);
    }

    public final void initializeGeofences() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeGeofenceManager.initializeGeofences$lambda$2();
            }
        }, 7, (Object) null);
        if (INSTANCE.getGeofencesEnabledFromServerConfig(this.serverConfigStorageProvider)) {
            Context applicationContext = this.applicationContext;
            AbstractC4862t.d(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext)) {
                this.brazeGeofenceApi.getClass();
            }
        }
        this.isGeofencesEnabled = false;
        if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
            requestGeofenceRefresh(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.l
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.initializeGeofences$lambda$3();
                }
            }, 7, (Object) null);
        }
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        AbstractC4862t.e(context, "context");
        if (!INSTANCE.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.F
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$4();
                }
            }, 7, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$5();
                }
            }, 6, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.c
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$6();
                }
            }, 6, (Object) null);
            return false;
        }
        if (!com.braze.support.p.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$7();
                }
            }, 7, (Object) null);
            return false;
        }
        this.brazeGeofenceApi.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$8();
            }
        }, 7, (Object) null);
        return false;
    }

    public void onLocationRequestComplete(final IBrazeLocation location) {
        if (location == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.x
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.onLocationRequestComplete$lambda$41();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.v
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeGeofenceManager.onLocationRequestComplete$lambda$40(location);
            }
        }, 7, (Object) null);
        requestGeofenceRefresh(location);
        this.brazeGeofenceReEligibilityManager.b(DateTimeUtils.nowInSeconds());
    }

    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        String strB;
        AbstractC4862t.e(geofenceList, "geofenceList");
        final List<BrazeGeofence> listX0 = C4179C.X0(geofenceList);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.registerGeofences$lambda$31();
                }
            }, 6, (Object) null);
            return;
        }
        if (this.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : listX0) {
                IBrazeLocation iBrazeLocation = this.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    double d10 = iBrazeLocation.get_latitude();
                    double d11 = iBrazeLocation.get_longitude();
                    double latitude = brazeGeofence.getLatitude();
                    double longitude = brazeGeofence.getLongitude();
                    double radians = Math.toRadians(latitude - d10);
                    double radians2 = Math.toRadians(longitude - d11);
                    double d12 = 2;
                    brazeGeofence.setDistanceFromGeofenceRefresh(Math.asin(Math.sqrt((Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(d10)) * Math.pow(Math.sin(radians2 / d12), 2.0d)) + Math.pow(Math.sin(radians / d12), 2.0d))) * 1.2742E7d);
                }
            }
            gc.x.z(listX0);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.r
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.registerGeofences$lambda$37$lambda$33(listX0);
                }
            }, 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
            Iterator it = listX0.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final BrazeGeofence brazeGeofence2 = (BrazeGeofence) it.next();
                if (i10 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.s
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeGeofenceManager.registerGeofences$lambda$37$lambda$34(this.f25773a);
                        }
                    }, 7, (Object) null);
                    break;
                } else {
                    this.brazeGeofences.add(brazeGeofence2);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.t
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazeGeofenceManager.registerGeofences$lambda$37$lambda$35(brazeGeofence2);
                        }
                    }, 7, (Object) null);
                    i10++;
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.registerGeofences$lambda$37$lambda$36(this.f25780a);
                }
            }, 7, (Object) null);
            GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
            DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
            List<BrazeGeofence> list = this.brazeGeofences;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                        aVar.d();
                        strB = aVar.b(new C4231e(BrazeGeofence.Companion.serializer()), list);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) com.braze.support.i.f28638a, 4, (Object) null);
                        strB = ((list instanceof Map) || list == null) ? "{}" : "[]";
                    }
                    geofenceDataStoreProvider.writeData(dataStoreKey, strB);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(listX0);
            setUpGeofences(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        AbstractC4862t.e(geofenceList, "geofenceList");
        AbstractC4862t.e(geofenceRequestIntent, "geofenceRequestIntent");
        com.braze.location.a aVar = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        AbstractC4862t.d(context, "applicationContext");
        aVar.getClass();
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(geofenceList, "geofenceList");
        AbstractC4862t.e(geofenceRequestIntent, "geofenceRequestIntent");
    }

    public void requestGeofenceRefresh(IBrazeLocation location) {
        AbstractC4862t.e(location, "location");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.y
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.requestGeofenceRefresh$lambda$24();
                }
            }, 7, (Object) null);
            return;
        }
        this.geofenceRequestLocation = location;
        if (location != null) {
            ((r) this.brazeManager).a(location);
        }
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        com.braze.location.b bVar = this.brazeLocationApi;
        l locationUpdateCallback = new l() { // from class: c5.p
            @Override // vc.l
            public final Object invoke(Object obj) {
                return BrazeGeofenceManager.requestSingleLocationUpdateFromGooglePlay$lambda$42(this.f25762a, (IBrazeLocation) obj);
            }
        };
        bVar.getClass();
        AbstractC4862t.e(locationUpdateCallback, "locationUpdateCallback");
    }

    public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage() {
        List<BrazeGeofence> arrayList;
        List listK;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
        DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList<>();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    arrayList = new ArrayList<>();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        listK = C4206t.k();
                    } else {
                        try {
                            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                            aVar.d();
                            listK = (List) aVar.a(new C4231e(BrazeGeofence.Companion.serializer()), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                            listK = C4206t.k();
                        }
                    }
                    arrayList = C4179C.X0(listK);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new com.braze.storage.i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList<>();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.retrieveBrazeGeofencesFromLocalStorage$lambda$43();
                }
            }, 7, (Object) null);
        }
        return arrayList;
    }

    public final void setUpGeofences(final boolean reRegisterGeofences) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.setUpGeofences$lambda$11();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeGeofenceManager.setUpGeofences$lambda$12(reRegisterGeofences);
            }
        }, 6, (Object) null);
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.setUpGeofences$lambda$13();
                }
            }, 7, (Object) null);
            return;
        }
        if (reRegisterGeofences) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
                C4015H c4015h = C4015H.f34254a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent geofenceRequestIntent) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.C
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeGeofenceManager.tearDownGeofences$lambda$15();
            }
        }, 7, (Object) null);
        if (geofenceRequestIntent != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.D
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.tearDownGeofences$lambda$16();
                }
            }, 7, (Object) null);
            com.braze.location.a aVar = this.brazeGeofenceApi;
            Context applicationContext = this.applicationContext;
            AbstractC4862t.d(applicationContext, "applicationContext");
            aVar.getClass();
            AbstractC4862t.e(applicationContext, "applicationContext");
            AbstractC4862t.e(geofenceRequestIntent, "intent");
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.E
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.tearDownGeofences$lambda$18$lambda$17();
                }
            }, 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
            C4015H c4015h = C4015H.f34254a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.unregisterGeofences$lambda$38();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.B
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.unregisterGeofences$lambda$39();
                }
            }, 7, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    public void requestGeofenceRefresh(boolean ignoreRateLimit) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeGeofenceManager.requestGeofenceRefresh$lambda$26();
                }
            }, 7, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(ignoreRateLimit, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }
}
