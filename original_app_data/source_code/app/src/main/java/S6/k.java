package S6;

import S6.C2197c;
import com.google.android.gms.maps.internal.zzau;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends zzau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.l f15401a;

    public k(C2197c c2197c, C2197c.l lVar) {
        this.f15401a = lVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.InterfaceC2246t
    public final boolean l(L6.h hVar) {
        return this.f15401a.onMarkerClick(new U6.r(hVar));
    }
}
