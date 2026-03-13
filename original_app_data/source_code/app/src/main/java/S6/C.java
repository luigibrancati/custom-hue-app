package S6;

import S6.C2197c;
import com.google.android.gms.maps.internal.zzs;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C extends zzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.d f15384a;

    public C(C2197c c2197c, C2197c.d dVar) {
        this.f15384a = dVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.X
    public final void zzb() {
        this.f15384a.onCameraMove();
    }
}
