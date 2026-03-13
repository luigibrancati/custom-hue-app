package K7;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: K7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1063c extends AbstractC1064d implements C {
    public AbstractC1063c(Map map) {
        super(map);
    }

    @Override // K7.AbstractC1064d, K7.G
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // K7.AbstractC1066f, K7.G
    public Map b() {
        return super.b();
    }

    @Override // K7.AbstractC1066f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // K7.AbstractC1064d, K7.G
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // K7.AbstractC1064d
    public Collection x(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // K7.AbstractC1064d
    public Collection y(Object obj, Collection collection) {
        return z(obj, (List) collection, null);
    }
}
