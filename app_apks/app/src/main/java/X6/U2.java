package X6;

import com.google.android.gms.internal.measurement.InterfaceC3311s7;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U2 implements InterfaceC3311s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2344a3 f18584a;

    public U2(C2344a3 c2344a3) {
        Objects.requireNonNull(c2344a3);
        this.f18584a = c2344a3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3311s7
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        int i11 = i10 - 1;
        C2526x2 c2526x2U = i11 != 0 ? i11 != 1 ? i11 != 3 ? i11 != 4 ? this.f18584a.f18400a.a().u() : z10 ? this.f18584a.f18400a.a().s() : !z11 ? this.f18584a.f18400a.a().t() : this.f18584a.f18400a.a().r() : this.f18584a.f18400a.a().w() : z10 ? this.f18584a.f18400a.a().p() : !z11 ? this.f18584a.f18400a.a().q() : this.f18584a.f18400a.a().o() : this.f18584a.f18400a.a().v();
        int size = list.size();
        if (size == 1) {
            c2526x2U.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c2526x2U.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c2526x2U.a(str);
        } else {
            c2526x2U.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
