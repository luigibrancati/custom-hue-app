package com.braze.support;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f28629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f28630b;

    public a() {
        this.f28629a = null;
        this.f28630b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC4862t.a(this.f28629a, aVar.f28629a) && AbstractC4862t.a(this.f28630b, aVar.f28630b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f28629a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Map map = this.f28630b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BitmapAndHeaders(bitmap=" + this.f28629a + ", headers=" + this.f28630b + ")";
    }

    public a(Bitmap bitmap, Map map) {
        this.f28629a = bitmap;
        this.f28630b = map;
    }
}
