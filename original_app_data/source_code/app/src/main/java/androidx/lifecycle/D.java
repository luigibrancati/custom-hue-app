package androidx.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC2756l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f23393a;

    public D(H provider) {
        AbstractC4862t.e(provider, "provider");
        this.f23393a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC2756l
    public void d(InterfaceC2758n source, AbstractC2754j.a event) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(event, "event");
        if (event == AbstractC2754j.a.ON_CREATE) {
            source.getLifecycle().c(this);
            this.f23393a.e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
