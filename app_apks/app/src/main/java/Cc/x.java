package Cc;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements WildcardType, Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1250c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f1251d = new x(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f1252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f1253b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final x a() {
            return x.f1251d;
        }

        public a() {
        }
    }

    public x(Type type, Type type2) {
        this.f1252a = type;
        this.f1253b = type2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f1253b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.f1253b != null) {
            return "? super " + w.h(this.f1253b);
        }
        Type type = this.f1252a;
        if (type == null || AbstractC4862t.a(type, Object.class)) {
            return "?";
        }
        return "? extends " + w.h(this.f1252a);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f1252a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
