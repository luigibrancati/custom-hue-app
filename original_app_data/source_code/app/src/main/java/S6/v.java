package S6;

import S6.C2197c;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzh;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends zzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.b f15417a;

    public v(C2197c c2197c, C2197c.b bVar) {
        this.f15417a = bVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.S
    public final IObjectWrapper b0(L6.h hVar) {
        return ObjectWrapper.wrap(this.f15417a.b(new U6.r(hVar)));
    }

    @Override // T6.S
    public final IObjectWrapper l(L6.h hVar) {
        return ObjectWrapper.wrap(this.f15417a.c(new U6.r(hVar)));
    }
}
