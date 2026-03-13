package We;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends e implements Set {
    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || h().equals(obj);
    }

    public abstract Set h();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return h().hashCode();
    }
}
