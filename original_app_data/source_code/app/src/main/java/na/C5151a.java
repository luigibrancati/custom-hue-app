package na;

import java.util.Map;

/* JADX INFO: renamed from: na.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5151a implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5154d f40741b;

    public C5151a(String str, C5154d c5154d) {
        this.f40740a = str;
        this.f40741b = c5154d;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f40740a;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ma.b getValue() {
        return (ma.b) this.f40741b.get();
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ma.b setValue(ma.b bVar) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5151a)) {
            return false;
        }
        C5151a c5151a = (C5151a) obj;
        return this.f40740a.equals(c5151a.getKey()) && this.f40741b.equals(c5151a.f40741b);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (this.f40740a.hashCode() * 31) + this.f40741b.hashCode();
    }
}
