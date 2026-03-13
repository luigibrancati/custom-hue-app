package N6;

import java.io.Serializable;

/* JADX INFO: renamed from: N6.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1436p0 extends T implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10412b;

    public C1436p0(Object obj, Object obj2) {
        this.f10411a = obj;
        this.f10412b = obj2;
    }

    @Override // N6.T, java.util.Map.Entry
    public final Object getKey() {
        return this.f10411a;
    }

    @Override // N6.T, java.util.Map.Entry
    public final Object getValue() {
        return this.f10412b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
