package sc;

import Od.F;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static final int a(String str) {
        int iH0;
        char c10 = File.separatorChar;
        int iH02 = F.h0(str, c10, 0, false, 4, null);
        if (iH02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iH0 = F.h0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iH03 = F.h0(str, c10, iH0 + 1, false, 4, null);
            return iH03 >= 0 ? iH03 + 1 : str.length();
        }
        if (iH02 > 0 && str.charAt(iH02 - 1) == ':') {
            return iH02 + 1;
        }
        if (iH02 == -1 && F.Y(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        AbstractC4862t.e(file, "<this>");
        String path = file.getPath();
        AbstractC4862t.d(path, "getPath(...)");
        return a(path) > 0;
    }
}
