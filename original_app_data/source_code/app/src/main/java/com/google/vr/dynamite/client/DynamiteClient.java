package com.google.vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import ba.d;
import ba.e;
import dalvik.system.DexClassLoader;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative
public final class DynamiteClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayMap f32370a = new ArrayMap();

    private DynamiteClient() {
    }

    @UsedByNative
    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        e eVar = new e(str, str2);
        d remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(eVar);
        try {
            INativeLibraryLoader iNativeLibraryLoaderNewNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(ObjectWrapper.b(remoteLibraryLoaderFromInfo.b(context)), ObjectWrapper.b(context));
            if (iNativeLibraryLoaderNewNativeLibraryLoader != null) {
                return iNativeLibraryLoaderNewNativeLibraryLoader.checkVersion(str3);
            }
            String string = eVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 72);
            sb2.append("Failed to load native library ");
            sb2.append(string);
            sb2.append(" from remote package: no loader available.");
            Log.e("DynamiteClient", sb2.toString());
            return -1;
        } catch (RemoteException | ba.c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e10) {
            String string2 = eVar.toString();
            StringBuilder sb3 = new StringBuilder(string2.length() + 54);
            sb3.append("Failed to load native library ");
            sb3.append(string2);
            sb3.append(" from remote package:\n  ");
            Log.e("DynamiteClient", sb3.toString(), e10);
            return -1;
        }
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        Context remoteContext = getRemoteContext(context, str, str2);
        if (remoteContext == null) {
            return null;
        }
        return remoteContext.getClassLoader();
    }

    @UsedByNative
    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        e eVar;
        eVar = new e(str, str2);
        try {
        } catch (ba.c e10) {
            String string = eVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 52);
            sb2.append("Failed to get remote Context");
            sb2.append(string);
            sb2.append(" from remote package:\n  ");
            Log.e("DynamiteClient", sb2.toString(), e10);
            return null;
        }
        return getRemoteLibraryLoaderFromInfo(eVar).b(context);
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        Context remoteContext = getRemoteContext(context, str, null);
        if (remoteContext == null) {
            return null;
        }
        try {
            return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
        } catch (RuntimeException e10) {
            Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e10);
            return null;
        }
    }

    @UsedByNative
    private static synchronized d getRemoteLibraryLoaderFromInfo(e eVar) {
        ArrayMap arrayMap = f32370a;
        d dVar = (d) arrayMap.get(eVar);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(eVar);
        arrayMap.put(eVar, dVar2);
        return dVar2;
    }

    @UsedByNative
    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        e eVar = new e(str, str2);
        d remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(eVar);
        try {
            INativeLibraryLoader iNativeLibraryLoaderNewNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(ObjectWrapper.b(remoteLibraryLoaderFromInfo.b(context)), ObjectWrapper.b(context));
            if (iNativeLibraryLoaderNewNativeLibraryLoader != null) {
                return iNativeLibraryLoaderNewNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
            }
            String string = eVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 72);
            sb2.append("Failed to load native library ");
            sb2.append(string);
            sb2.append(" from remote package: no loader available.");
            Log.e("DynamiteClient", sb2.toString());
            return 0L;
        } catch (RemoteException | ba.c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e10) {
            String string2 = eVar.toString();
            StringBuilder sb3 = new StringBuilder(string2.length() + 54);
            sb3.append("Failed to load native library ");
            sb3.append(string2);
            sb3.append(" from remote package:\n  ");
            Log.e("DynamiteClient", sb3.toString(), e10);
            return 0L;
        }
    }
}
