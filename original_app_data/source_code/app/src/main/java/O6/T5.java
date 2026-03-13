package O6;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T5 extends N5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U5 f11464c;

    public T5(U5 u52) {
        this.f11464c = u52;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        G1.a(i10, this.f11464c.f11476e, "index");
        U5 u52 = this.f11464c;
        int i11 = i10 + i10;
        Object obj = u52.f11475d[i11];
        obj.getClass();
        Object obj2 = u52.f11475d[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11464c.f11476e;
    }
}
