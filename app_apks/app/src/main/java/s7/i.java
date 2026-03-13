package s7;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44247a;

    public i(float f10) {
        this.f44247a = f10;
    }

    @Override // s7.c
    public float a(RectF rectF) {
        return this.f44247a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f44247a == ((i) obj).f44247a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44247a)});
    }
}
