package X6;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f18338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O5 f18339b;

    public H5(O5 o52, ComponentName componentName) {
        this.f18338a = componentName;
        Objects.requireNonNull(o52);
        this.f18339b = o52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18339b.f18465c.K(this.f18338a);
    }
}
