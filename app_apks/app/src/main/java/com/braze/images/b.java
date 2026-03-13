package com.braze.images;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends LruCache {
    public b(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        String key = (String) obj;
        Bitmap image = (Bitmap) obj2;
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(image, "image");
        return image.getByteCount();
    }
}
