package gc;

import java.lang.reflect.Array;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gc.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4200m {
    public static final Object[] a(Object[] reference, int i10) {
        AbstractC4862t.e(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        AbstractC4862t.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static int b(Object[] objArr) {
        return Arrays.deepHashCode(objArr);
    }

    public static final void c(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
