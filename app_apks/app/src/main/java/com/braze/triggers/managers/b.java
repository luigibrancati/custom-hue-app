package com.braze.triggers.managers;

import Od.F;
import android.content.Context;
import android.net.Uri;
import com.braze.storage.j3;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.support.q;
import fc.C4032o;
import fc.C4034q;
import gc.Q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28722e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3 f28723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f28724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f28725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f28726d;

    public b(Context context, String apiKey) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        j3 j3Var = new j3(context, apiKey);
        this.f28723a = j3Var;
        this.f28724b = f28722e.a(j3Var);
        this.f28725c = new LinkedHashMap();
        this.f28726d = new File(context.getCacheDir().getPath() + "/ab_triggers");
    }

    public static final String b(com.braze.triggers.actions.a aVar) {
        return "Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: " + ((com.braze.triggers.actions.g) aVar).c();
    }

    public static final String c(String str, String str2) {
        return "Adding new local path '" + str + "' for remote path '" + str2 + "' to cache.";
    }

    public static final String d(String str) {
        return "Could not find local asset for remote path " + str;
    }

    public static final String e(String str) {
        return "Failed to add new local path for remote path " + str;
    }

    public static final String f(String str) {
        return "Removed from DataStore: " + str;
    }

    public final String a(com.braze.triggers.utils.a remotePath) {
        Long lA;
        AbstractC4862t.e(remotePath, "remotePath");
        final String str = remotePath.f28758b;
        int iOrdinal = remotePath.f28757a.ordinal();
        if (iOrdinal == 0) {
            final String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.f28726d, str);
            if (localHtmlUrlFromRemoteUrl == null || F.k0(localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.o
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.c(str);
                    }
                }, 7, (Object) null);
                return null;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.b.a(localHtmlUrlFromRemoteUrl, str);
                }
            }, 6, (Object) null);
            return localHtmlUrlFromRemoteUrl;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            throw new C4032o();
        }
        String strB = f28722e.b(str);
        try {
            String string = this.f28726d.toString();
            AbstractC4862t.d(string, "toString(...)");
            C4034q c4034qDownloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(string, str, strB, null, 8, null);
            File file = (File) c4034qDownloadFileToPath$default.a();
            final Map map = (Map) c4034qDownloadFileToPath$default.b();
            String str2 = (String) map.get("expires");
            if (str2 != null && (lA = q.a(str2)) != null && lA.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.x
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.a(str, map);
                    }
                }, 7, (Object) null);
                return null;
            }
            final Uri uriFromFile = Uri.fromFile(file);
            if (uriFromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.y
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.a(uriFromFile, str);
                    }
                }, 6, (Object) null);
                return uriFromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.z
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.b.b(str);
                }
            }, 7, (Object) null);
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: w5.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.b.a(str);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String b(String str, String str2) {
        return "Found local asset at path " + str + " for remote asset at path: " + str2;
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return "No local assets found for action id: " + ((com.braze.triggers.actions.g) aVar).c();
    }

    public static final String d(String str, String str2) {
        return "Added to DataStore: " + str + " -> " + str2;
    }

    public static final String b(String str) {
        return "Failed to store asset for remote path " + str + ". Not storing local asset";
    }

    public static final String c(String str) {
        return "Failed to store html zip asset for remote path " + str + ". Not storing local asset";
    }

    public final void a(List triggeredActions) {
        AbstractC4862t.e(triggeredActions, "triggeredActions");
        a aVar = f28722e;
        C4034q c4034qA = aVar.a(triggeredActions);
        Set set = (Set) c4034qA.a();
        LinkedHashSet linkedHashSetA = aVar.a(this.f28724b, (Set) c4034qA.b(), this.f28725c);
        aVar.a(this.f28726d, this.f28724b, this.f28725c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<com.braze.triggers.utils.a> arrayList = new ArrayList();
        for (Object obj : set) {
            if (!this.f28724b.containsKey(((com.braze.triggers.utils.a) obj).f28758b)) {
                arrayList.add(obj);
            }
        }
        for (com.braze.triggers.utils.a aVar2 : arrayList) {
            final String str = aVar2.f28758b;
            try {
                final String strA = a(aVar2);
                if (strA != null && !F.k0(strA)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.v
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.triggers.managers.b.c(strA, str);
                        }
                    }, 7, (Object) null);
                    this.f28724b.put(str, strA);
                    linkedHashMap.put(str, strA);
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: w5.w
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.e(str);
                    }
                }, 4, (Object) null);
            }
        }
        a(linkedHashMap, linkedHashSetA);
    }

    public final Map a(final com.braze.triggers.actions.a triggeredAction) {
        AbstractC4862t.e(triggeredAction, "triggeredAction");
        if (!((com.braze.triggers.actions.g) triggeredAction).f28671c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.m
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.b.b(triggeredAction);
                }
            }, 7, (Object) null);
            return Q.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = triggeredAction.b().iterator();
        while (it.hasNext()) {
            final String str = ((com.braze.triggers.utils.a) it.next()).f28758b;
            final String path = (String) this.f28724b.get(str);
            if (path != null) {
                AbstractC4862t.e(path, "path");
                if (new File(path).exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.s
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return com.braze.triggers.managers.b.b(path, str);
                        }
                    }, 7, (Object) null);
                    this.f28725c.put(str, path);
                    linkedHashMap.put(str, path);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.t
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.b.d(str);
                }
            }, 6, (Object) null);
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.b.c(triggeredAction);
                }
            }, 6, (Object) null);
        }
        return linkedHashMap;
    }

    public static final String a(String str, String str2) {
        return "Storing local triggered action html zip asset at local path " + str + " for remote path " + str2;
    }

    public static final String a(String str) {
        return "Could not download " + str;
    }

    public static final String a(String str, Map map) {
        return "Not caching " + str + " due to headers " + map;
    }

    public static final String a(Uri uri, String str) {
        return "Storing local triggered action asset at local path " + uri.getPath() + " for remote path " + str;
    }

    public final void a(LinkedHashMap assetsToAdd, LinkedHashSet remoteUrlsToRemove) {
        AbstractC4862t.e(assetsToAdd, "assetsToAdd");
        AbstractC4862t.e(remoteUrlsToRemove, "remoteUrlsToRemove");
        if (assetsToAdd.isEmpty() && remoteUrlsToRemove.isEmpty()) {
            return;
        }
        try {
            this.f28723a.batchUpdate(assetsToAdd, remoteUrlsToRemove);
            for (Map.Entry entry : assetsToAdd.entrySet()) {
                final String str = (String) entry.getKey();
                final String str2 = (String) entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.p
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.d(str, str2);
                    }
                }, 7, (Object) null);
            }
            Iterator it = remoteUrlsToRemove.iterator();
            while (it.hasNext()) {
                final String str3 = (String) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: w5.q
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.triggers.managers.b.f(str3);
                    }
                }, 7, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: w5.r
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.triggers.managers.b.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to update DataStore";
    }
}
