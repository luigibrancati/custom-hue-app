package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I3 implements E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f29224a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f29225b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f29226c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f29227d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f29228e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f29229f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f29230g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29231h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f29232i = new String[0];

    @Override // com.google.android.gms.internal.measurement.E3
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f29225b == null) {
                    this.f29224a.set(false);
                    this.f29225b = new HashMap(16, 1.0f);
                    this.f29230g = new Object();
                    contentResolver.registerContentObserver(D3.f29155a, true, new G3(this, null));
                } else if (this.f29224a.getAndSet(false)) {
                    this.f29225b.clear();
                    this.f29226c.clear();
                    this.f29227d.clear();
                    this.f29228e.clear();
                    this.f29229f.clear();
                    this.f29230g = new Object();
                    this.f29231h = false;
                }
                Object obj = this.f29230g;
                if (this.f29225b.containsKey(str)) {
                    String str4 = (String) this.f29225b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = D3.f29155a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new H3("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new H3("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f29230g) {
                                            this.f29225b.put(str, string);
                                        }
                                    } finally {
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } finally {
                            }
                        } catch (RemoteException e10) {
                            throw new H3("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th;
                    }
                } catch (H3 unused) {
                    return null;
                }
            } finally {
            }
        }
    }

    public final /* synthetic */ AtomicBoolean b() {
        return this.f29224a;
    }
}
