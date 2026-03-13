package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W extends X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f30107b = new W();

    public W() {
        super("");
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final int a(X x10) {
        return x10 == this ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final void b(StringBuilder sb2) {
        sb2.append("(-∞");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((X) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final void j(StringBuilder sb2) {
        throw new AssertionError();
    }

    public final String toString() {
        return "-∞";
    }
}
