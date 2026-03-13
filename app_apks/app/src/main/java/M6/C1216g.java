package M6;

/* JADX INFO: renamed from: M6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1216g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9335c;

    public C1216g(Object obj, Object obj2, Object obj3) {
        this.f9333a = obj;
        this.f9334b = obj2;
        this.f9335c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f9335c;
        Object obj2 = this.f9334b;
        Object obj3 = this.f9333a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
