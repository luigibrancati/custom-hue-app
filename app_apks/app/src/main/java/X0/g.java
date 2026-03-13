package X0;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17990c;

    public g(int i10) {
        super(i10);
        this.f17990c = new Object();
    }

    @Override // X0.f, X0.e
    public boolean a(Object instance) {
        boolean zA;
        AbstractC4862t.e(instance, "instance");
        synchronized (this.f17990c) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override // X0.f, X0.e
    public Object b() {
        Object objB;
        synchronized (this.f17990c) {
            objB = super.b();
        }
        return objB;
    }
}
