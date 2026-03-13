package s7;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: s7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5809b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f44194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f44195b;

    public C5809b(float f10, c cVar) {
        while (cVar instanceof C5809b) {
            cVar = ((C5809b) cVar).f44194a;
            f10 += ((C5809b) cVar).f44195b;
        }
        this.f44194a = cVar;
        this.f44195b = f10;
    }

    @Override // s7.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f44194a.a(rectF) + this.f44195b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5809b)) {
            return false;
        }
        C5809b c5809b = (C5809b) obj;
        return this.f44194a.equals(c5809b.f44194a) && this.f44195b == c5809b.f44195b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44194a, Float.valueOf(this.f44195b)});
    }
}
