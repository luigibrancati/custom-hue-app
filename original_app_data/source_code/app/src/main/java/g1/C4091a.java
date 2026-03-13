package g1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4091a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4091a f34895a = new C4091a();

    public final boolean a(File srcFile, File dstFile) {
        AbstractC4862t.e(srcFile, "srcFile");
        AbstractC4862t.e(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
