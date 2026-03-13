package S6;

import S6.C2197c;
import U6.C2295w;
import com.google.android.gms.maps.internal.zzbg;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends zzbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.n f15420a;

    public y(C2197c c2197c, C2197c.n nVar) {
        this.f15420a = nVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.A
    public final void K4(L6.k kVar) {
        this.f15420a.onPolygonClick(new C2295w(kVar));
    }
}
