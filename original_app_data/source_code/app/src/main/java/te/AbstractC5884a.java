package te;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: te.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5884a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f44927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44928d;

    public AbstractC5884a(String name, boolean z10) {
        AbstractC4862t.e(name, "name");
        this.f44925a = name;
        this.f44926b = z10;
        this.f44928d = -1L;
    }

    public final boolean a() {
        return this.f44926b;
    }

    public final String b() {
        return this.f44925a;
    }

    public final long c() {
        return this.f44928d;
    }

    public final c d() {
        return this.f44927c;
    }

    public final void e(c queue) {
        AbstractC4862t.e(queue, "queue");
        c cVar = this.f44927c;
        if (cVar == queue) {
            return;
        }
        if (cVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f44927c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f44928d = j10;
    }

    public String toString() {
        return this.f44925a;
    }

    public /* synthetic */ AbstractC5884a(String str, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
