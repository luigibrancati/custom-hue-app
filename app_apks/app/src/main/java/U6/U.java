package U6;

import com.google.android.gms.internal.maps.zzay;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U extends zzay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f16666a;

    public U(K k10, L l10) {
        this.f16666a = l10;
        Objects.requireNonNull(k10);
    }

    @Override // L6.r
    public final I z2(int i10, int i11, int i12) {
        return this.f16666a.getTile(i10, i11, i12);
    }
}
