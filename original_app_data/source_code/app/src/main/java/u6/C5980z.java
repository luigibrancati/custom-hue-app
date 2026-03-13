package u6;

import com.google.android.gms.common.internal.a;
import java.util.Objects;

/* JADX INFO: renamed from: u6.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5980z implements a.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5919A f45230a;

    public C5980z(C5919A c5919a) {
        Objects.requireNonNull(c5919a);
        this.f45230a = c5919a;
    }

    @Override // com.google.android.gms.common.internal.a.e
    public final void a() {
        this.f45230a.f45083D.f().post(new RunnableC5979y(this));
    }
}
