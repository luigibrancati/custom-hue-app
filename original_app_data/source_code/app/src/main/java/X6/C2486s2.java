package X6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.s2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2486s2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f19204b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f19205c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f19206d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2478r2 f19207a;

    public C2486s2(InterfaceC2478r2 interfaceC2478r2) {
        this.f19207a = interfaceC2478r2;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC6056k.l(strArr);
        AbstractC6056k.l(strArr2);
        AbstractC6056k.l(atomicReference);
        AbstractC6056k.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f19207a.zza() ? str : g(str, T3.f18569c, T3.f18567a, f19204b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f19207a.zza() ? str : g(str, U3.f18586b, U3.f18585a, f19205c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f19207a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, V3.f18617b, V3.f18616a, f19206d);
        }
        return "experiment_id(" + str + ")";
    }

    public final String d(I i10) {
        InterfaceC2478r2 interfaceC2478r2 = this.f19207a;
        if (!interfaceC2478r2.zza()) {
            return i10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(i10.f18345c);
        sb2.append(",name=");
        sb2.append(a(i10.f18343a));
        sb2.append(",params=");
        G g10 = i10.f18344b;
        sb2.append(g10 == null ? null : !interfaceC2478r2.zza() ? g10.toString() : e(g10.l()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f19207a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strE);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
