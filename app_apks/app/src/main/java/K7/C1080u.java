package K7;

import java.io.Serializable;

/* JADX INFO: renamed from: K7.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C1080u extends AbstractC1065e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7714b;

    public C1080u(Object obj, Object obj2) {
        this.f7713a = obj;
        this.f7714b = obj2;
    }

    @Override // K7.AbstractC1065e, java.util.Map.Entry
    public final Object getKey() {
        return this.f7713a;
    }

    @Override // K7.AbstractC1065e, java.util.Map.Entry
    public final Object getValue() {
        return this.f7714b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
