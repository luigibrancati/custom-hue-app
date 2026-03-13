package S6;

import S6.C2197c;
import U6.C2287n;
import com.google.android.gms.maps.internal.zzy;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends zzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2197c.g f15418a;

    public w(C2197c c2197c, C2197c.g gVar) {
        this.f15418a = gVar;
        Objects.requireNonNull(c2197c);
    }

    @Override // T6.a0
    public final void N5(L6.D d10) {
        this.f15418a.onGroundOverlayClick(new C2287n(d10));
    }
}
