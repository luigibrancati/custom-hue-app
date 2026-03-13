package S6;

import S6.C2197c;
import com.google.android.gms.maps.internal.zzo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends zzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.InterfaceC0186c f15385a;

    public D(C2197c c2197c, C2197c.InterfaceC0186c interfaceC0186c) {
        this.f15385a = interfaceC0186c;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.V
    public final void zzb() {
        this.f15385a.onCameraIdle();
    }
}
