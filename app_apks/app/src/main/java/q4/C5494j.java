package q4;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: q4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5494j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5495k f43225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5489e f43226b;

    public C5494j() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final C5489e a() {
        return this.f43226b;
    }

    public final C5495k b() {
        return this.f43225a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5494j)) {
            return false;
        }
        C5494j c5494j = (C5494j) obj;
        return AbstractC4862t.a(this.f43225a, c5494j.f43225a) && AbstractC4862t.a(this.f43226b, c5494j.f43226b);
    }

    public int hashCode() {
        return (this.f43225a.hashCode() * 31) + this.f43226b.hashCode();
    }

    public String toString() {
        return "InteractionsOptions(rageClick=" + this.f43225a + ", deadClick=" + this.f43226b + ')';
    }

    public C5494j(C5495k rageClick, C5489e deadClick) {
        AbstractC4862t.e(rageClick, "rageClick");
        AbstractC4862t.e(deadClick, "deadClick");
        this.f43225a = rageClick;
        this.f43226b = deadClick;
    }

    public /* synthetic */ C5494j(C5495k c5495k, C5489e c5489e, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? new C5495k(false, 1, null) : c5495k, (i10 & 2) != 0 ? new C5489e(false, 1, null) : c5489e);
    }
}
