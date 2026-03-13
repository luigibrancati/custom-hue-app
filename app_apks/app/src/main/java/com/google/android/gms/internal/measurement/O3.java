package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import b0.C2777a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O3 implements R3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConcurrentMap f29297i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f29298j = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f29299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f29300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f29301c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Map f29305g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentObserver f29302d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f29303e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f29304f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f29306h = new ArrayList();

    public O3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        J7.n.j(contentResolver);
        J7.n.j(uri);
        this.f29299a = contentResolver;
        this.f29300b = uri;
        this.f29301c = runnable;
    }

    public static O3 c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        O3 o32 = (O3) f29297i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.N3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return O3.g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!o32.f29303e) {
                return o32;
            }
            synchronized (o32) {
                try {
                    if (o32.f29303e) {
                        L3 l32 = new L3(o32, null);
                        o32.f29299a.registerContentObserver(o32.f29300b, false, l32);
                        o32.f29302d = l32;
                        o32.f29303e = false;
                    }
                } finally {
                }
            }
            return o32;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void f() {
        Iterator it = f29297i.values().iterator();
        while (it.hasNext()) {
            O3 o32 = (O3) it.next();
            synchronized (o32) {
                try {
                    if (o32.f29303e) {
                        o32.f29303e = false;
                    } else {
                        ContentObserver contentObserver = o32.f29302d;
                        if (contentObserver != null) {
                            o32.f29299a.unregisterContentObserver(contentObserver);
                            o32.f29302d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    public static /* synthetic */ O3 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new O3(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.R3
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f29305g;
        if (map2 == null) {
            synchronized (this.f29304f) {
                map2 = this.f29305g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) R3.a(new Q3() { // from class: com.google.android.gms.internal.measurement.M3
                                @Override // com.google.android.gms.internal.measurement.Q3
                                public final /* synthetic */ Object zza() {
                                    return this.f29269a.h();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                            map = Collections.EMPTY_MAP;
                        }
                        this.f29305g = map;
                        map2 = map;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void e() {
        synchronized (this.f29304f) {
            this.f29305g = null;
            this.f29301c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f29306h.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Map h() {
        ContentResolver contentResolver = this.f29299a;
        Uri uri = this.f29300b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f29298j, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map c2777a = count <= 256 ? new C2777a(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        c2777a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return c2777a;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } finally {
                }
            } catch (RemoteException e10) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th;
        }
    }
}
