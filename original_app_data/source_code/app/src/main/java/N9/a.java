package N9;

import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10591a;

    public a(String str, int i10) {
        super(AbstractC6056k.g(str, "Provided message must not be empty."));
        this.f10591a = i10;
    }

    public int a() {
        return this.f10591a;
    }

    public a(String str, int i10, Throwable th) {
        super(AbstractC6056k.g(str, "Provided message must not be empty."), th);
        this.f10591a = i10;
    }
}
