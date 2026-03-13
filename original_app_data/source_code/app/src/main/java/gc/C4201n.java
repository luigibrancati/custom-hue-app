package gc;

import fc.C4008A;
import fc.C4010C;
import fc.C4013F;
import fc.C4042y;
import ic.C4375b;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gc.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4201n extends C4200m {
    public static boolean d(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!d((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof C4042y) && (obj2 instanceof C4042y)) {
                    if (!C4375b.c(((C4042y) obj).y(), ((C4042y) obj2).y())) {
                        return false;
                    }
                } else if ((obj instanceof C4013F) && (obj2 instanceof C4013F)) {
                    if (!C4375b.a(((C4013F) obj).y(), ((C4013F) obj2).y())) {
                        return false;
                    }
                } else if ((obj instanceof C4008A) && (obj2 instanceof C4008A)) {
                    if (!C4375b.b(((C4008A) obj).y(), ((C4008A) obj2).y())) {
                        return false;
                    }
                } else if ((obj instanceof C4010C) && (obj2 instanceof C4010C)) {
                    if (!C4375b.d(((C4010C) obj).y(), ((C4010C) obj2).y())) {
                        return false;
                    }
                } else if (!AbstractC4862t.a(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
