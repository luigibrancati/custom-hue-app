package v6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: v6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6055j {

    /* JADX INFO: renamed from: v6.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f45864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f45865b;

        public /* synthetic */ a(Object obj, byte[] bArr) {
            AbstractC6056k.l(obj);
            this.f45865b = obj;
            this.f45864a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC6056k.l(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + strValueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(strValueOf);
            this.f45864a.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f45865b.getClass().getSimpleName());
            sb2.append('{');
            List list = this.f45864a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) list.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
