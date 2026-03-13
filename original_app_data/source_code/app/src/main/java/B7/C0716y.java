package B7;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: B7.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C0716y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f750c;

    public C0716y(Object obj, Field field, Class cls) {
        this.f748a = obj;
        this.f749b = field;
        this.f750c = cls;
    }

    public final Object a() {
        try {
            return this.f750c.cast(this.f749b.get(this.f748a));
        } catch (Exception e10) {
            throw new A(String.format("Failed to get value of field %s of type %s on object of type %s", this.f749b.getName(), this.f748a.getClass().getName(), this.f750c.getName()), e10);
        }
    }

    public final Field b() {
        return this.f749b;
    }

    public final void c(Object obj) {
        try {
            this.f749b.set(this.f748a, obj);
        } catch (Exception e10) {
            throw new A(String.format("Failed to set value of field %s of type %s on object of type %s", this.f749b.getName(), this.f748a.getClass().getName(), this.f750c.getName()), e10);
        }
    }
}
