package S6;

import S6.C2197c;
import com.google.android.gms.maps.internal.zzaw;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends zzaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.m f15414a;

    public s(C2197c c2197c, C2197c.m mVar) {
        this.f15414a = mVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.InterfaceC2247u
    public final void C5(L6.h hVar) {
        this.f15414a.onMarkerDragStart(new U6.r(hVar));
    }

    @Override // T6.InterfaceC2247u
    public final void b0(L6.h hVar) {
        this.f15414a.onMarkerDragEnd(new U6.r(hVar));
    }

    @Override // T6.InterfaceC2247u
    public final void l(L6.h hVar) {
        this.f15414a.onMarkerDrag(new U6.r(hVar));
    }
}
