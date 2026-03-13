package com.braze.triggers.managers;

import Od.F;
import android.content.Context;
import android.net.Uri;
import com.braze.storage.j3;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import fc.C4034q;
import gc.C4204q;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k1.AbstractC4785h;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String b(File file) {
        return "Deleting obsolete asset '" + file.getPath() + "' from filesystem.";
    }

    public static final String c(File file) {
        return "Deleting triggers directory at: " + file.getAbsolutePath();
    }

    public final void a(Context context) {
        AbstractC4862t.e(context, "context");
        final File file = new File(context.getCacheDir(), "ab_triggers");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.a.c(file);
            }
        }, 6, (Object) null);
        BrazeFileUtils.deleteFileOrDirectory(file);
    }

    public static final String b() {
        return "Failed to retrieve local assets from DataStore";
    }

    public final String b(final String remoteAssetUrl) {
        int iN0;
        AbstractC4862t.e(remoteAssetUrl, "remoteAssetUrl");
        final L l10 = new L();
        l10.f39776a = "";
        String lastPathSegment = Uri.parse(remoteAssetUrl).getLastPathSegment();
        if (lastPathSegment != null && lastPathSegment.length() != 0 && (iN0 = F.n0(lastPathSegment, '.', 0, false, 6, null)) > -1) {
            String strSubstring = lastPathSegment.substring(iN0);
            AbstractC4862t.d(strSubstring, "substring(...)");
            l10.f39776a = strSubstring;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.a.a(l10, remoteAssetUrl);
                }
            }, 6, (Object) null);
        }
        int requestCode = IntentUtils.getRequestCode();
        Object obj = l10.f39776a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(requestCode);
        sb2.append(obj);
        return sb2.toString();
    }

    public final void a(File triggeredAssetDirectory, ConcurrentHashMap remoteToLocalAssetsMap, LinkedHashMap preservedLocalAssetMap) {
        AbstractC4862t.e(triggeredAssetDirectory, "triggeredAssetDirectory");
        AbstractC4862t.e(remoteToLocalAssetsMap, "remoteToLocalAssetsMap");
        AbstractC4862t.e(preservedLocalAssetMap, "preservedLocalAssetMap");
        final File[] fileArrListFiles = triggeredAssetDirectory.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.triggers.managers.a.a(fileArrListFiles);
            }
        }, 6, (Object) null);
        try {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (!remoteToLocalAssetsMap.containsValue(file.getPath())) {
                    arrayList.add(file);
                }
            }
            ArrayList<File> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!preservedLocalAssetMap.containsValue(((File) obj).getPath())) {
                    arrayList2.add(obj);
                }
            }
            for (final File file2 : arrayList2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.f28722e, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.i
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.a.b(file2);
                    }
                }, 7, (Object) null);
                AbstractC4862t.b(file2);
                BrazeFileUtils.deleteFileOrDirectory(file2);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: w5.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.a.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(File[] fileArr) {
        return "Local triggered asset directory contains files: " + C4204q.q0(fileArr, " , ", null, null, 0, null, new l() { // from class: w5.c
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.braze.triggers.managers.a.a((File) obj);
            }
        }, 30, null);
    }

    public static final CharSequence a(File file) {
        String name = file.getName();
        AbstractC4862t.d(name, "getName(...)");
        return name;
    }

    public static final String a() {
        return "Exception while deleting obsolete assets from filesystem.";
    }

    public final ConcurrentHashMap a(j3 dataStoreProvider) {
        AbstractC4862t.e(dataStoreProvider, "dataStoreProvider");
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<AbstractC4785h.a, Object> entry : dataStoreProvider.readAllData().entrySet()) {
                final AbstractC4785h.a key = entry.getKey();
                final Object value = entry.getValue();
                if (!F.k0(key.a()) && (value instanceof String) && !F.k0((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.d
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.triggers.managers.a.a(value, key);
                        }
                    }, 7, (Object) null);
                    concurrentHashMap.put(key.a(), value);
                }
            }
            return concurrentHashMap;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: w5.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.a.b();
                }
            }, 4, (Object) null);
            return new ConcurrentHashMap();
        }
    }

    public static final String a(Object obj, AbstractC4785h.a aVar) {
        return "Retrieving trigger local asset path '" + obj + "' from DataStore for remote path '" + aVar.a() + "'";
    }

    public final LinkedHashSet a(ConcurrentHashMap localAssetPaths, Set newRemotePathStrings, LinkedHashMap preservedLocalAssetPathMap) {
        AbstractC4862t.e(localAssetPaths, "localAssetPaths");
        AbstractC4862t.e(newRemotePathStrings, "newRemotePathStrings");
        AbstractC4862t.e(preservedLocalAssetPathMap, "preservedLocalAssetPathMap");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new HashSet(localAssetPaths.keySet()).iterator();
        AbstractC4862t.d(it, "iterator(...)");
        while (it.hasNext()) {
            final String str = (String) it.next();
            if (preservedLocalAssetPathMap.containsKey(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.k
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.a.a(str);
                    }
                }, 7, (Object) null);
            } else if (!newRemotePathStrings.contains(str)) {
                final String str2 = (String) localAssetPaths.remove(str);
                AbstractC4862t.b(str);
                linkedHashSet.add(str);
                if (str2 != null && !F.k0(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.l
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.triggers.managers.a.a(str2, str);
                        }
                    }, 7, (Object) null);
                    BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                }
            }
        }
        return linkedHashSet;
    }

    public static final String a(String str) {
        return "Not removing local path for remote path " + str + " from cache because it is being preserved until the end of the app run.";
    }

    public static final String a(String str, String str2) {
        return "Removing obsolete local path " + str + " for obsolete remote path " + str2 + " from cache.";
    }

    public final C4034q a(List triggeredActions) {
        AbstractC4862t.e(triggeredActions, "triggeredActions");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = triggeredActions.iterator();
        while (it.hasNext()) {
            final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) it.next();
            if (!((com.braze.triggers.actions.g) aVar).f28671c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.f
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.a.a(aVar);
                    }
                }, 7, (Object) null);
            } else {
                for (com.braze.triggers.utils.a aVar2 : aVar.b()) {
                    final String str = aVar2.f28758b;
                    if (!F.k0(str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.g
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return com.braze.triggers.managers.a.a(aVar, str);
                            }
                        }, 7, (Object) null);
                        linkedHashSet.add(aVar2);
                        linkedHashSet2.add(str);
                    }
                }
            }
        }
        return new C4034q(linkedHashSet, linkedHashSet2);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Pre-fetch off for triggered action " + ((com.braze.triggers.actions.g) aVar).c() + ". Not pre-fetching assets.";
    }

    public static final String a(com.braze.triggers.actions.a aVar, String str) {
        return "Received new remote path for triggered action " + ((com.braze.triggers.actions.g) aVar).c() + " at " + str + ".";
    }

    public static final String a(L l10, String str) {
        return "Using file extension " + l10.f39776a + " for remote asset url: " + str;
    }
}
