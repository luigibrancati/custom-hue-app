package We;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends h implements Map.Entry {
    public abstract Map.Entry d();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return d().equals(obj);
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return d().getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return d().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return d().hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        return d().setValue(obj);
    }
}
