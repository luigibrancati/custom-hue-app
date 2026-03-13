package ta;

import android.content.Context;
import android.os.Process;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f44871b = new HashSet();

    public n(Context context) {
        this.f44870a = context;
    }

    public boolean a(String[] strArr) {
        for (String str : strArr) {
            if (b(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        if (this.f44871b.contains(str)) {
            return true;
        }
        boolean z10 = this.f44870a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        if (z10) {
            this.f44871b.add(str);
        }
        return z10;
    }
}
