package u6;

import java.util.Objects;

/* JADX INFO: renamed from: u6.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5979y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5980z f45229a;

    public RunnableC5979y(C5980z c5980z) {
        Objects.requireNonNull(c5980z);
        this.f45229a = c5980z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5919A c5919a = this.f45229a.f45230a;
        c5919a.L().a(c5919a.L().getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
