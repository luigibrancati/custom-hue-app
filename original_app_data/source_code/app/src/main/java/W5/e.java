package W5;

import W5.c;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements c.b {
    @Override // W5.c.b
    public void a(String str) {
        System.loadLibrary(str);
    }

    @Override // W5.c.b
    public String b(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // W5.c.b
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // W5.c.b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // W5.c.b
    public void e(String str) {
        System.load(str);
    }
}
