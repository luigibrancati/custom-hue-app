package d0;

import fc.C4029l;
import fc.InterfaceC4028k;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4028k f32787a;

    public e(InterfaceC6082a interfaceC6082a) {
        this.f32787a = C4029l.b(interfaceC6082a);
    }

    @Override // d0.i
    public Object a(f fVar) {
        return b();
    }

    public final Object b() {
        return this.f32787a.getValue();
    }
}
