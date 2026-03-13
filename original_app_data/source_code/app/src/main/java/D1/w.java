package D1;

import java.io.IOException;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class w extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2106b;

    public w(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f2105a = z10;
        this.f2106b = i10;
    }

    public static w a(String str, Throwable th) {
        return new w(str, th, true, 1);
    }

    public static w b(String str, Throwable th) {
        return new w(str, th, true, 0);
    }

    public static w c(String str, Throwable th) {
        return new w(str, th, true, 4);
    }

    public static w d(String str, Throwable th) {
        return new w(str, th, false, 4);
    }

    public static w e(String str) {
        return new w(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + StringUtils.SPACE;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f2105a);
        sb2.append(", dataType=");
        sb2.append(this.f2106b);
        sb2.append("}");
        return sb2.toString();
    }
}
