package S6;

import S6.C2197c;
import com.google.android.gms.maps.internal.zzaq;
import com.google.android.gms.maps.model.LatLng;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends zzaq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.k f15402a;

    public l(C2197c c2197c, C2197c.k kVar) {
        this.f15402a = kVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.r
    public final void B(LatLng latLng) {
        this.f15402a.onMapLongClick(latLng);
    }
}
