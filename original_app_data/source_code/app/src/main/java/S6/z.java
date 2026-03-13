package S6;

import S6.C2197c;
import U6.C2297y;
import com.google.android.gms.maps.internal.zzbi;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends zzbi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.o f15421a;

    public z(C2197c c2197c, C2197c.o oVar) {
        this.f15421a = oVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.B
    public final void v3(L6.m mVar) {
        this.f15421a.onPolylineClick(new C2297y(mVar));
    }
}
