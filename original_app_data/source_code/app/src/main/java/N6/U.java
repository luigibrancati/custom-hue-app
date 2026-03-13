package N6;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class U extends I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f10074a;

    public U(V v10) {
        this.f10074a = v10;
    }

    @Override // N6.I0
    public final H0 c() {
        return this.f10074a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f10074a.c();
    }
}
