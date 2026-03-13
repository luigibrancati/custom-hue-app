package z6;

import b7.C2878l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import java.util.Objects;
import u6.C5971q;

/* JADX INFO: renamed from: z6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC6526i extends zaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2878l f48791a;

    public BinderC6526i(l lVar, C2878l c2878l) {
        this.f48791a = c2878l;
        Objects.requireNonNull(lVar);
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, z6.InterfaceC6521d
    public final void k6(Status status, y6.g gVar) {
        C5971q.c(status, gVar, this.f48791a);
    }
}
