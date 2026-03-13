package S6;

import S6.C2197c;
import U6.C2280g;
import com.google.android.gms.maps.internal.zzw;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends zzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.f f15419a;

    public x(C2197c c2197c, C2197c.f fVar) {
        this.f15419a = fVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.Z
    public final void L4(L6.w wVar) {
        this.f15419a.onCircleClick(new C2280g(wVar));
    }
}
