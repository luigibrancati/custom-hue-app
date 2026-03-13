package u6;

import java.util.Objects;

/* JADX INFO: renamed from: u6.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5978x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5919A f45228b;

    public RunnableC5978x(C5919A c5919a, int i10) {
        this.f45227a = i10;
        Objects.requireNonNull(c5919a);
        this.f45228b = c5919a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45228b.G(this.f45227a);
    }
}
