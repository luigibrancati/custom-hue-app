package com.braze.images;

import android.content.Context;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final void a(Context context) {
        AbstractC4862t.e(context, "context");
        try {
            final File file = new File(context.getCacheDir(), "appboy.imageloader.lru.cache");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: b5.v
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.images.c.a(file);
                }
            }, 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(file);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: b5.w
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.images.c.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(File file) {
        return "Deleting lru image cache directory at: " + file.getAbsolutePath();
    }

    public static final String a() {
        return "Failed to delete stored data in image loader";
    }

    public static File a(Context context, String uniqueName) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uniqueName, "uniqueName");
        return new File(context.getCacheDir().getPath() + File.separator + uniqueName);
    }
}
