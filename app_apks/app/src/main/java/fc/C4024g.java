package fc;

import java.io.Serializable;

/* JADX INFO: renamed from: fc.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4024g implements InterfaceC4028k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34263a;

    public C4024g(Object obj) {
        this.f34263a = obj;
    }

    @Override // fc.InterfaceC4028k
    public Object getValue() {
        return this.f34263a;
    }

    @Override // fc.InterfaceC4028k
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
