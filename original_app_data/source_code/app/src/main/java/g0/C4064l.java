package g0;

import h0.AbstractC4265a;
import java.util.Map;

/* JADX INFO: renamed from: g0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4064l extends AbstractC4063k {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        AbstractC4265a.a(d());
        i(c() + 2);
        return new C4053a(b()[c() - 2], b()[c() - 1]);
    }
}
