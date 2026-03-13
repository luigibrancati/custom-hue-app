package h3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36220d;

    public e(int i10, int i11, String from, String to) {
        AbstractC4862t.e(from, "from");
        AbstractC4862t.e(to, "to");
        this.f36217a = i10;
        this.f36218b = i11;
        this.f36219c = from;
        this.f36220d = to;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e other) {
        AbstractC4862t.e(other, "other");
        int i10 = this.f36217a - other.f36217a;
        return i10 == 0 ? this.f36218b - other.f36218b : i10;
    }

    public final String b() {
        return this.f36219c;
    }

    public final int j() {
        return this.f36217a;
    }

    public final String p() {
        return this.f36220d;
    }
}
