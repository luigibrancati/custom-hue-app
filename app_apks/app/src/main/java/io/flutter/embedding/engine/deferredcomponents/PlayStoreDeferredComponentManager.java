package io.flutter.embedding.engine.deferredcomponents;

import A7.AbstractC0678b;
import A7.AbstractC0679c;
import A7.InterfaceC0677a;
import A7.InterfaceC0680d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.ApplicationInfoLoader;
import io.flutter.embedding.engine.loader.FlutterApplicationInfo;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlayStoreDeferredComponentManager implements DeferredComponentManager {
    public static final String MAPPING_KEY = DeferredComponentManager.class.getName() + ".loadingUnitMapping";
    private static final String TAG = "PlayStoreDeferredComponentManager";
    private DeferredComponentChannel channel;
    private Context context;
    private FlutterApplicationInfo flutterApplicationInfo;
    private FlutterJNI flutterJNI;
    private FeatureInstallStateUpdatedListener listener;
    protected SparseArray<String> loadingUnitIdToComponentNames;
    protected SparseArray<String> loadingUnitIdToSharedLibraryNames;
    private Map<String, Integer> nameToSessionId;
    private SparseIntArray sessionIdToLoadingUnitId;
    private SparseArray<String> sessionIdToName;
    private SparseArray<String> sessionIdToState;
    private InterfaceC0677a splitInstallManager;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class FeatureInstallStateUpdatedListener implements InterfaceC0680d {
        private FeatureInstallStateUpdatedListener() {
        }

        @Override // v7.InterfaceC6071a
        @SuppressLint({"DefaultLocale"})
        public void onStateUpdate(AbstractC0679c abstractC0679c) {
            int iD = abstractC0679c.d();
            if (PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD) != null) {
                switch (abstractC0679c.e()) {
                    case 1:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install pending.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "pending");
                        break;
                    case 2:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) downloading.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "downloading");
                        break;
                    case 3:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) downloaded.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "downloaded");
                        break;
                    case 4:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) installing.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "installing");
                        break;
                    case 5:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install successfully.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD)));
                        PlayStoreDeferredComponentManager playStoreDeferredComponentManager = PlayStoreDeferredComponentManager.this;
                        playStoreDeferredComponentManager.loadAssets(playStoreDeferredComponentManager.sessionIdToLoadingUnitId.get(iD), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD));
                        if (PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iD) > 0) {
                            PlayStoreDeferredComponentManager playStoreDeferredComponentManager2 = PlayStoreDeferredComponentManager.this;
                            playStoreDeferredComponentManager2.loadDartLibrary(playStoreDeferredComponentManager2.sessionIdToLoadingUnitId.get(iD), (String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD));
                        }
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallSuccess((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD));
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iD);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iD);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "installed");
                        break;
                    case 6:
                        Log.e(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install failed with: %s", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD), Integer.valueOf(abstractC0679c.b())));
                        PlayStoreDeferredComponentManager.this.flutterJNI.deferredComponentInstallFailure(PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.get(iD), "Module install failed with " + abstractC0679c.b(), true);
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), "Android Deferred Component failed to install.");
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iD);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iD);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "failed");
                        break;
                    case 7:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install canceled.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD)));
                        if (PlayStoreDeferredComponentManager.this.channel != null) {
                            PlayStoreDeferredComponentManager.this.channel.completeInstallError((String) PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), "Android Deferred Component installation canceled.");
                        }
                        PlayStoreDeferredComponentManager.this.sessionIdToName.delete(iD);
                        PlayStoreDeferredComponentManager.this.sessionIdToLoadingUnitId.delete(iD);
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "cancelled");
                        break;
                    case 8:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install requires user confirmation.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "requiresUserConfirmation");
                        break;
                    case 9:
                        Log.d(PlayStoreDeferredComponentManager.TAG, String.format("Module \"%s\" (sessionId %d) install canceling.", PlayStoreDeferredComponentManager.this.sessionIdToName.get(iD), Integer.valueOf(iD)));
                        PlayStoreDeferredComponentManager.this.sessionIdToState.put(iD, "canceling");
                        break;
                    default:
                        Log.d(PlayStoreDeferredComponentManager.TAG, "Unknown status: " + abstractC0679c.e());
                        break;
                }
            }
        }
    }

    public PlayStoreDeferredComponentManager(Context context, FlutterJNI flutterJNI) {
        this.context = context;
        this.flutterJNI = flutterJNI;
        this.flutterApplicationInfo = ApplicationInfoLoader.load(context);
        this.splitInstallManager = AbstractC0678b.a(context);
        FeatureInstallStateUpdatedListener featureInstallStateUpdatedListener = new FeatureInstallStateUpdatedListener();
        this.listener = featureInstallStateUpdatedListener;
        this.splitInstallManager.c(featureInstallStateUpdatedListener);
        this.sessionIdToName = new SparseArray<>();
        this.sessionIdToLoadingUnitId = new SparseIntArray();
        this.sessionIdToState = new SparseArray<>();
        this.nameToSessionId = new HashMap();
        this.loadingUnitIdToComponentNames = new SparseArray<>();
        this.loadingUnitIdToSharedLibraryNames = new SparseArray<>();
        initLoadingUnitMappingToComponentNames();
    }

    private ApplicationInfo getApplicationInfo() {
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void initLoadingUnitMappingToComponentNames() {
        Bundle bundle;
        ApplicationInfo applicationInfo = getApplicationInfo();
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return;
        }
        String str = MAPPING_KEY;
        String string = bundle.getString(str, null);
        if (string == null) {
            Log.e(TAG, "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
            return;
        }
        if (string.equals("")) {
            return;
        }
        for (String str2 : string.split(",")) {
            String[] strArrSplit = str2.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1);
            int i10 = Integer.parseInt(strArrSplit[0]);
            this.loadingUnitIdToComponentNames.put(i10, strArrSplit[1]);
            if (strArrSplit.length > 2) {
                this.loadingUnitIdToSharedLibraryNames.put(i10, strArrSplit[2]);
            }
        }
    }

    private /* synthetic */ void lambda$installDeferredComponent$0(String str, int i10, Integer num) {
        this.sessionIdToName.put(num.intValue(), str);
        this.sessionIdToLoadingUnitId.put(num.intValue(), i10);
        if (this.nameToSessionId.containsKey(str)) {
            this.sessionIdToState.remove(this.nameToSessionId.get(str).intValue());
        }
        this.nameToSessionId.put(str, num);
        this.sessionIdToState.put(num.intValue(), "Requested");
    }

    private /* synthetic */ void lambda$installDeferredComponent$1(int i10, String str, Exception exc) {
        android.support.v4.media.session.a.a(exc);
        throw null;
    }

    private boolean verifyJNI() {
        if (this.flutterJNI != null) {
            return true;
        }
        Log.e(TAG, "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
        return false;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void destroy() {
        this.splitInstallManager.a(this.listener);
        this.channel = null;
        this.flutterJNI = null;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public String getDeferredComponentInstallState(int i10, String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i10);
        }
        if (str == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return "unknown";
        }
        if (this.nameToSessionId.containsKey(str)) {
            return this.sessionIdToState.get(this.nameToSessionId.get(str).intValue());
        }
        return this.splitInstallManager.b().contains(str) ? "installedPendingLoad" : "unknown";
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void installDeferredComponent(final int i10, final String str) {
        final String str2 = str != null ? str : this.loadingUnitIdToComponentNames.get(i10);
        if (str2 == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
        } else if (!str2.equals("") || i10 <= 0) {
            this.splitInstallManager.startInstall(SplitInstallRequest.a().a(str2).b()).addOnSuccessListener(new OnSuccessListener() { // from class: io.flutter.embedding.engine.deferredcomponents.a
            }).addOnFailureListener(new OnFailureListener() { // from class: io.flutter.embedding.engine.deferredcomponents.b
            });
        } else {
            loadDartLibrary(i10, str2);
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadAssets(int i10, String str) {
        if (verifyJNI()) {
            try {
                Context context = this.context;
                Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 0);
                this.context = contextCreatePackageContext;
                this.flutterJNI.updateJavaAssetManager(contextCreatePackageContext.getAssets(), this.flutterApplicationInfo.flutterAssetsDir);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void loadDartLibrary(int i10, String str) {
        if (verifyJNI() && i10 >= 0) {
            String str2 = this.loadingUnitIdToSharedLibraryNames.get(i10);
            if (str2 == null) {
                str2 = this.flutterApplicationInfo.aotSharedLibraryName + "-" + i10 + ".part.so";
            }
            String str3 = Build.SUPPORTED_ABIS[0];
            String strReplace = str3.replace("-", "_");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.context.getFilesDir());
            for (String str4 : this.context.getApplicationInfo().splitSourceDirs) {
                linkedList.add(new File(str4));
            }
            while (!linkedList.isEmpty()) {
                File file = (File) linkedList.remove();
                if (file == null || !file.isDirectory() || file.listFiles() == null) {
                    String name = file.getName();
                    if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(strReplace))) {
                        arrayList.add(file.getAbsolutePath());
                    } else if (name.equals(str2)) {
                        arrayList2.add(file.getAbsolutePath());
                    }
                } else {
                    for (File file2 : file.listFiles()) {
                        linkedList.add(file2);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(str2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((String) it.next()) + "!lib/" + str3 + "/" + str2);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add((String) it2.next());
            }
            this.flutterJNI.loadDartDeferredLibrary(i10, (String[]) arrayList3.toArray(new String[arrayList3.size()]));
        }
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setDeferredComponentChannel(DeferredComponentChannel deferredComponentChannel) {
        this.channel = deferredComponentChannel;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public void setJNI(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    @Override // io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager
    public boolean uninstallDeferredComponent(int i10, String str) {
        if (str == null) {
            str = this.loadingUnitIdToComponentNames.get(i10);
        }
        if (str == null) {
            Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.splitInstallManager.deferredUninstall(arrayList);
        if (this.nameToSessionId.get(str) == null) {
            return true;
        }
        this.sessionIdToState.delete(this.nameToSessionId.get(str).intValue());
        return true;
    }
}
