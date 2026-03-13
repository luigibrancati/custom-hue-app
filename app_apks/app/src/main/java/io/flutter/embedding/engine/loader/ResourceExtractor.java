package io.flutter.embedding.engine.loader;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Build;
import io.flutter.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class ResourceExtractor {
    private static final String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
    private static final String TAG = "ResourceExtractor";
    private static final String TIMESTAMP_PREFIX = "res_timestamp-";
    private final AssetManager mAssetManager;
    private final String mDataDirPath;
    private ExtractTask mExtractTask;
    private final PackageManager mPackageManager;
    private final String mPackageName;
    private final HashSet<String> mResources = new HashSet<>();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ExtractTask extends AsyncTask<Void, Void, Void> {
        private final AssetManager mAssetManager;
        private final String mDataDirPath;
        private final PackageManager mPackageManager;
        private final String mPackageName;
        private final HashSet<String> mResources;

        public ExtractTask(String str, HashSet<String> hashSet, String str2, PackageManager packageManager, AssetManager assetManager) {
            this.mDataDirPath = str;
            this.mResources = hashSet;
            this.mAssetManager = assetManager;
            this.mPackageName = str2;
            this.mPackageManager = packageManager;
        }

        private boolean extractAPK(File file) {
            for (String str : this.mResources) {
                try {
                    File file2 = new File(file, str);
                    if (!file2.exists()) {
                        if (file2.getParentFile() != null) {
                            file2.getParentFile().mkdirs();
                        }
                        InputStream inputStreamOpen = this.mAssetManager.open(str);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                ResourceExtractor.copy(inputStreamOpen, fileOutputStream);
                                fileOutputStream.close();
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    }
                } catch (FileNotFoundException unused) {
                    continue;
                } catch (IOException e10) {
                    Log.w(ResourceExtractor.TAG, "Exception unpacking resources: " + e10.getMessage());
                    ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
                    return false;
                }
            }
            return true;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            File file = new File(this.mDataDirPath);
            String strCheckTimestamp = ResourceExtractor.checkTimestamp(file, this.mPackageManager, this.mPackageName);
            if (strCheckTimestamp == null) {
                return null;
            }
            ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
            if (!extractAPK(file)) {
                return null;
            }
            try {
                new File(file, strCheckTimestamp).createNewFile();
            } catch (IOException unused) {
                Log.w(ResourceExtractor.TAG, "Failed to write resource timestamp");
            }
            return null;
        }
    }

    public ResourceExtractor(String str, String str2, PackageManager packageManager, AssetManager assetManager) {
        this.mDataDirPath = str;
        this.mPackageName = str2;
        this.mPackageManager = packageManager;
        this.mAssetManager = assetManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String checkTimestamp(File file, PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return TIMESTAMP_PREFIX;
            }
            String str2 = TIMESTAMP_PREFIX + getVersionCode(packageInfo) + "-" + packageInfo.lastUpdateTime;
            String[] existingTimestamps = getExistingTimestamps(file);
            if (existingTimestamps != null && existingTimestamps.length == 1 && str2.equals(existingTimestamps[0])) {
                return null;
            }
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return TIMESTAMP_PREFIX;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[16384];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFiles(String str, HashSet<String> hashSet) {
        File file = new File(str);
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            File file2 = new File(file, it.next());
            if (file2.exists()) {
                file2.delete();
            }
        }
        String[] existingTimestamps = getExistingTimestamps(file);
        if (existingTimestamps == null) {
            return;
        }
        for (String str2 : existingTimestamps) {
            new File(file, str2).delete();
        }
    }

    private static String[] getExistingTimestamps(File file) {
        return file.list(new FilenameFilter() { // from class: io.flutter.embedding.engine.loader.ResourceExtractor.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return str.startsWith(ResourceExtractor.TIMESTAMP_PREFIX);
            }
        });
    }

    public static long getVersionCode(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public ResourceExtractor addResource(String str) {
        this.mResources.add(str);
        return this;
    }

    public ResourceExtractor addResources(Collection<String> collection) {
        this.mResources.addAll(collection);
        return this;
    }

    public ResourceExtractor start() {
        ExtractTask extractTask = new ExtractTask(this.mDataDirPath, this.mResources, this.mPackageName, this.mPackageManager, this.mAssetManager);
        this.mExtractTask = extractTask;
        extractTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return this;
    }

    public void waitForCompletion() {
        ExtractTask extractTask = this.mExtractTask;
        if (extractTask == null) {
            return;
        }
        try {
            extractTask.get();
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            deleteFiles(this.mDataDirPath, this.mResources);
        }
    }
}
