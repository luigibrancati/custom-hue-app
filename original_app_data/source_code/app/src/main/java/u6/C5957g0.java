package u6;

import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: renamed from: u6.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5957g0 implements InterfaceC2872f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2878l f45180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5973s f45181b;

    public C5957g0(C5973s c5973s, C2878l c2878l) {
        this.f45180a = c2878l;
        Objects.requireNonNull(c5973s);
        this.f45181b = c5973s;
    }

    @Override // b7.InterfaceC2872f
    public final void a(Task task) {
        this.f45181b.e().remove(this.f45180a);
    }
}
