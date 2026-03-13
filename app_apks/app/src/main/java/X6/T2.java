package X6;

import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T2 extends b0.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C2344a3 f18566j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(C2344a3 c2344a3, int i10) {
        super(20);
        Objects.requireNonNull(c2344a3);
        this.f18566j = c2344a3;
    }

    @Override // b0.t
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        AbstractC6056k.f(str);
        return this.f18566j.o(str);
    }
}
