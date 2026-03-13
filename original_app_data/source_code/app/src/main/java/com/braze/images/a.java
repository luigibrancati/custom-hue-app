package com.braze.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.braze.lrucache.j;
import com.braze.support.BrazeLogger;
import fc.C4015H;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.lrucache.f f27770a;

    public a(File file) throws IOException {
        Pattern pattern = com.braze.lrucache.f.f27803o;
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        com.braze.lrucache.f fVar = new com.braze.lrucache.f(file);
        if (fVar.f27807b.exists()) {
            try {
                fVar.c();
                fVar.b();
            } catch (IOException e10) {
                BrazeLogger.w(com.braze.lrucache.f.f27804p, "DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                synchronized (fVar) {
                    try {
                        if (fVar.f27814i != null) {
                            Iterator it = new ArrayList(fVar.f27815j.values()).iterator();
                            while (it.hasNext()) {
                                com.braze.lrucache.d dVar = ((com.braze.lrucache.g) it.next()).f27823d;
                                if (dVar != null) {
                                    dVar.f27801d.a(dVar, false);
                                }
                            }
                            while (fVar.f27813h > fVar.f27811f) {
                                fVar.d((String) ((Map.Entry) fVar.f27815j.entrySet().iterator().next()).getKey());
                            }
                            fVar.f27814i.close();
                            fVar.f27814i = null;
                        }
                        j.a(fVar.f27806a);
                        file.mkdirs();
                        fVar = new com.braze.lrucache.f(file);
                        fVar.d();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } else {
            file.mkdirs();
            fVar = new com.braze.lrucache.f(file);
            fVar.d();
        }
        AbstractC4862t.d(fVar, "open(...)");
        this.f27770a = fVar;
    }

    public static final String c(String str, String str2) {
        return "Failed to load image from disk cache: " + str + "/" + str2;
    }

    public static final String d(String str, String str2) {
        return "Error while producing output stream or compressing bitmap for key " + str + " diskKey " + str2;
    }

    public final boolean a(final String key) {
        AbstractC4862t.e(key, "key");
        final String strValueOf = String.valueOf(key.hashCode());
        try {
            com.braze.lrucache.e eVarB = this.f27770a.b(strValueOf);
            boolean z10 = eVarB != null;
            sc.c.a(eVarB, null);
            return z10;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, th, false, new InterfaceC6082a() { // from class: b5.r
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.images.a.a(key, strValueOf);
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final Bitmap b(final String key) {
        AbstractC4862t.e(key, "key");
        final String strValueOf = String.valueOf(key.hashCode());
        try {
            com.braze.lrucache.e eVarB = this.f27770a.b(strValueOf);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(eVarB.f27802a[0]);
                sc.c.a(eVarB, null);
                return bitmapDecodeStream;
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28625E, th, false, new InterfaceC6082a() { // from class: b5.t
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.images.a.b(key, strValueOf);
                }
            }, 4, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: b5.u
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.images.a.c(key, strValueOf);
                }
            }, 7, (Object) null);
            return null;
        }
    }

    public static final String a(String str, String str2) {
        return "Error while retrieving disk for key " + str + " diskKey " + str2;
    }

    public final void a() {
        try {
            com.braze.lrucache.f fVar = this.f27770a;
            synchronized (fVar) {
                try {
                    if (fVar.f27814i == null) {
                        return;
                    }
                    Iterator it = new ArrayList(fVar.f27815j.values()).iterator();
                    while (it.hasNext()) {
                        com.braze.lrucache.d dVar = ((com.braze.lrucache.g) it.next()).f27823d;
                        if (dVar != null) {
                            dVar.f27801d.a(dVar, false);
                        }
                    }
                    while (fVar.f27813h > fVar.f27811f) {
                        fVar.d((String) ((Map.Entry) fVar.f27815j.entrySet().iterator().next()).getKey());
                    }
                    fVar.f27814i.close();
                    fVar.f27814i = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, th2, false, new InterfaceC6082a() { // from class: b5.q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.images.a.b();
                }
            }, 4, (Object) null);
        }
    }

    public static final String b(String str, String str2) {
        return "Failed to get bitmap from disk cache for key " + str + " diskKey " + str2;
    }

    public static final String b() {
        return "Failed to shutdown disk cache";
    }

    public final void a(final String key, Bitmap bitmap) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(bitmap, "bitmap");
        final String strValueOf = String.valueOf(key.hashCode());
        try {
            com.braze.lrucache.d dVarA = this.f27770a.a(strValueOf);
            OutputStream outputStreamA = dVarA.a();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamA);
                outputStreamA.flush();
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(outputStreamA, null);
                if (dVarA.f27800c) {
                    dVarA.f27801d.a(dVarA, false);
                    dVarA.f27801d.d(dVarA.f27798a.f27820a);
                } else {
                    dVarA.f27801d.a(dVarA, true);
                }
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, th, false, new InterfaceC6082a() { // from class: b5.s
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.images.a.d(key, strValueOf);
                }
            }, 4, (Object) null);
        }
    }
}
