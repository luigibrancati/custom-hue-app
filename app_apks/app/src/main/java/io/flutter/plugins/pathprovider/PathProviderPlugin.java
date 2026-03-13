package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.pathprovider.Messages;
import io.flutter.util.PathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PathProviderPlugin implements FlutterPlugin, Messages.PathProviderApi {
    static final String TAG = "PathProviderPlugin";
    private Context context;

    /* JADX INFO: renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory;

        static {
            int[] iArr = new int[Messages.StorageDirectory.values().length];
            $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory = iArr;
            try {
                iArr[Messages.StorageDirectory.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[Messages.StorageDirectory.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void setUp(BinaryMessenger binaryMessenger, Context context) {
        try {
            Messages.PathProviderApi.setUp(binaryMessenger, this);
        } catch (Exception e10) {
            Log.e(TAG, "Received exception while setting up PathProviderPlugin", e10);
        }
        this.context = context;
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getApplicationCachePath() {
        return this.context.getCacheDir().getPath();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getApplicationDocumentsPath() {
        return PathUtils.getDataDirectory(this.context);
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getApplicationSupportPath() {
        return PathUtils.getFilesDir(this.context);
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public List<String> getExternalCachePaths() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.context.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getExternalStoragePath() {
        File externalFilesDir = this.context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public List<String> getExternalStoragePaths(Messages.StorageDirectory storageDirectory) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.context.getExternalFilesDirs(getStorageDirectoryString(storageDirectory))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public String getStorageDirectoryString(Messages.StorageDirectory storageDirectory) {
        switch (AnonymousClass1.$SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[storageDirectory.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + storageDirectory);
        }
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getTemporaryPath() {
        return this.context.getCacheDir().getPath();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Messages.PathProviderApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
    }
}
