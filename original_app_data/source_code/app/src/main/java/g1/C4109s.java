package g1;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4109s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4109s f35089a = new C4109s();

    public final IOException a(File file, IOException cause) {
        AbstractC4862t.e(file, "file");
        AbstractC4862t.e(cause, "cause");
        return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? c(file, cause) : c(file, cause) : file.canWrite() ? c(file, cause) : c(file, cause) : file.canRead() ? file.canWrite() ? c(file, cause) : c(file, cause) : file.canWrite() ? c(file, cause) : c(file, cause) : c(file, cause);
    }

    public final IOException b(File file, IOException iOException) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Inoperable file:");
        try {
            sb2.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb2.append(" failed to attach additional metadata");
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return new IOException(string, iOException);
    }

    public final IOException c(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? b(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? b(file, iOException) : b(file, iOException) : parentFile.canWrite() ? b(file, iOException) : b(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? b(file, iOException) : b(file, iOException) : parentFile.canWrite() ? b(file, iOException) : b(file, iOException) : b(file, iOException);
    }
}
