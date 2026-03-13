package B7;

import android.util.Log;
import java.util.List;

/* JADX INFO: renamed from: B7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0698f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A7.y f734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0699g f735c;

    public RunnableC0698f(C0699g c0699g, List list, A7.y yVar) {
        this.f735c = c0699g;
        this.f733a = list;
        this.f734b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f735c.f738c.b(this.f733a)) {
                C0699g.d(this.f735c, this.f734b);
            } else {
                C0699g.c(this.f735c, this.f733a, this.f734b);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error checking verified files.", e10);
            this.f734b.y(-11);
        }
    }
}
