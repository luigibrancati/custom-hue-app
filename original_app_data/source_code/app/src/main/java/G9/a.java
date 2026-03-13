package G9;

import E9.c;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    void onAdd();

    void onClustersChanged(Set set);

    void onRemove();

    void setOnClusterClickListener(c.b bVar);

    void setOnClusterInfoWindowClickListener(c.InterfaceC0049c interfaceC0049c);

    void setOnClusterInfoWindowLongClickListener(c.d dVar);

    void setOnClusterItemClickListener(c.e eVar);

    void setOnClusterItemInfoWindowClickListener(c.f fVar);

    void setOnClusterItemInfoWindowLongClickListener(c.g gVar);
}
