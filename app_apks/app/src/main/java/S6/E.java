package S6;

import S6.C2197c;
import com.google.android.gms.maps.internal.zzam;
import com.google.android.gms.maps.model.LatLng;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends zzam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.j f15386a;

    public E(C2197c c2197c, C2197c.j jVar) {
        this.f15386a = jVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.InterfaceC2243p
    public final void B(LatLng latLng) {
        this.f15386a.onMapClick(latLng);
    }
}
