package L8;

import o8.D;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8588b;

    public a(Class cls, Object obj) {
        this.f8587a = (Class) D.b(cls);
        this.f8588b = D.b(obj);
    }

    public Object a() {
        return this.f8588b;
    }

    public Class b() {
        return this.f8587a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f8587a, this.f8588b);
    }
}
