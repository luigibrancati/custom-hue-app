package s7;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: s7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5808a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44193a;

    public C5808a(float f10) {
        this.f44193a = f10;
    }

    @Override // s7.c
    public float a(RectF rectF) {
        return this.f44193a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5808a) && this.f44193a == ((C5808a) obj).f44193a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44193a)});
    }
}
