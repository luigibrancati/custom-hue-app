package S6;

import T6.InterfaceC2229b;
import com.google.android.gms.maps.internal.zzas;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends zzas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f15403a;

    public o(p pVar, g gVar) {
        this.f15403a = gVar;
        Objects.requireNonNull(pVar);
    }

    @Override // T6.InterfaceC2245s
    public final void y2(InterfaceC2229b interfaceC2229b) {
        this.f15403a.onMapReady(new C2197c(interfaceC2229b));
    }
}
