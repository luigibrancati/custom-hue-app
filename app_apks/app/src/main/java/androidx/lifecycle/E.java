package androidx.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import i3.C4345f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC2756l, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f23395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23396c;

    public E(String key, C handle) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(handle, "handle");
        this.f23394a = key;
        this.f23395b = handle;
    }

    public final void a(C4345f registry, AbstractC2754j lifecycle) {
        AbstractC4862t.e(registry, "registry");
        AbstractC4862t.e(lifecycle, "lifecycle");
        if (this.f23396c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f23396c = true;
        lifecycle.a(this);
        registry.c(this.f23394a, this.f23395b.a());
    }

    public final C b() {
        return this.f23395b;
    }

    public final boolean c() {
        return this.f23396c;
    }

    @Override // androidx.lifecycle.InterfaceC2756l
    public void d(InterfaceC2758n source, AbstractC2754j.a event) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(event, "event");
        if (event == AbstractC2754j.a.ON_DESTROY) {
            this.f23396c = false;
            source.getLifecycle().c(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
