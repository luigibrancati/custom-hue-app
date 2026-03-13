package N7;

import J7.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static int a(long j10) {
        n.g((j10 >> 32) == 0, "out of range: %s", j10);
        return (int) j10;
    }
}
