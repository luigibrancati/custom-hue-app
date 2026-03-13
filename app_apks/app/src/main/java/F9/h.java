package F9;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h implements E9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f3785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f3786b = new LinkedHashSet();

    public h(LatLng latLng) {
        this.f3785a = latLng;
    }

    public boolean a(E9.b bVar) {
        return this.f3786b.add(bVar);
    }

    @Override // E9.a
    public Collection b() {
        return this.f3786b;
    }

    public boolean c(E9.b bVar) {
        return this.f3786b.remove(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f3785a.equals(this.f3785a) && hVar.f3786b.equals(this.f3786b);
    }

    @Override // E9.a
    public LatLng getPosition() {
        return this.f3785a;
    }

    @Override // E9.a
    public int getSize() {
        return this.f3786b.size();
    }

    public int hashCode() {
        return this.f3785a.hashCode() + this.f3786b.hashCode();
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f3785a + ", mItems.size=" + this.f3786b.size() + '}';
    }
}
