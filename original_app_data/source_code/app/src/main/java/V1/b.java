package V1;

import android.net.Uri;
import e2.o;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.a f17245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17246b;

    public b(o.a aVar, List list) {
        this.f17245a = aVar;
        this.f17246b = list;
    }

    @Override // e2.o.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(Uri uri, InputStream inputStream) {
        a aVar = (a) this.f17245a.a(uri, inputStream);
        List list = this.f17246b;
        return (list == null || list.isEmpty()) ? aVar : (a) aVar.a(this.f17246b);
    }
}
