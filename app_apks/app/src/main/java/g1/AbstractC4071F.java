package g1;

import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4071F {
    public static final InterfaceC4069D a(File file) {
        AbstractC4862t.e(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        AbstractC4862t.d(absolutePath, "getAbsolutePath(...)");
        return AbstractC4070E.a(absolutePath);
    }
}
