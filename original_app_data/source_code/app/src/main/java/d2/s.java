package d2;

import D1.E;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC3809c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f32966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f32967j;

    public s(E e10, int i10, int i11) {
        this(e10, i10, i11, 0, null);
    }

    @Override // d2.r
    public int b() {
        return 0;
    }

    @Override // d2.r
    public Object j() {
        return this.f32967j;
    }

    @Override // d2.r
    public int t() {
        return this.f32966i;
    }

    public s(E e10, int i10, int i11, int i12, Object obj) {
        super(e10, new int[]{i10}, i11);
        this.f32966i = i12;
        this.f32967j = obj;
    }

    @Override // d2.r
    public void g(long j10, long j11, long j12, List list, b2.n[] nVarArr) {
    }
}
