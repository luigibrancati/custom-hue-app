package Na;

import La.C;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements e {
    @Override // Na.e
    public boolean b() {
        return c("transactionId") && g() == null;
    }

    @Override // Na.e
    public Boolean d() {
        return h("inTransaction");
    }

    @Override // Na.e
    public C e() {
        return new C(j(), k());
    }

    @Override // Na.e
    public boolean f() {
        return Boolean.TRUE.equals(a("noResult"));
    }

    @Override // Na.e
    public Integer g() {
        return (Integer) a("transactionId");
    }

    public final Boolean h(String str) {
        Object objA = a(str);
        if (objA instanceof Boolean) {
            return (Boolean) objA;
        }
        return null;
    }

    public boolean i() {
        return Boolean.TRUE.equals(a("continueOnError"));
    }

    public final String j() {
        return (String) a("sql");
    }

    public final List k() {
        return (List) a("arguments");
    }

    public String toString() {
        return getMethod() + StringUtils.SPACE + j() + StringUtils.SPACE + k();
    }
}
