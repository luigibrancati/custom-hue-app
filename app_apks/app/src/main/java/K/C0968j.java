package K;

import java.util.List;

/* JADX INFO: renamed from: K.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0968j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f6619b;

    public C0968j(List list, W w10) {
        this.f6618a = list;
        this.f6619b = w10;
    }

    public List a() {
        return this.f6618a;
    }

    public boolean b() {
        return this.f6619b.isAborted();
    }
}
