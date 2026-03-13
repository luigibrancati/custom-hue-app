package Cc;

import gc.C4204q;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f1244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f1245c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a extends AbstractC4860q implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1246a = new a();

        public a() {
            super(1, w.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p02) {
            AbstractC4862t.e(p02, "p0");
            return w.h(p02);
        }
    }

    public u(Class rawType, Type type, List typeArguments) {
        AbstractC4862t.e(rawType, "rawType");
        AbstractC4862t.e(typeArguments, "typeArguments");
        this.f1243a = rawType;
        this.f1244b = type;
        this.f1245c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC4862t.a(this.f1243a, parameterizedType.getRawType()) && AbstractC4862t.a(this.f1244b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f1245c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f1244b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f1243a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f1244b;
        if (type != null) {
            sb2.append(w.h(type));
            sb2.append("$");
            sb2.append(this.f1243a.getSimpleName());
        } else {
            sb2.append(w.h(this.f1243a));
        }
        Type[] typeArr = this.f1245c;
        if (!(typeArr.length == 0)) {
            C4204q.l0(typeArr, sb2, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f1246a);
        }
        return sb2.toString();
    }

    public int hashCode() {
        int iHashCode = this.f1243a.hashCode();
        Type type = this.f1244b;
        return Arrays.hashCode(getActualTypeArguments()) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public String toString() {
        return getTypeName();
    }
}
