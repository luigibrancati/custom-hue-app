package sc;

import Od.F;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class l extends k {
    public static final File l(File file, File target, boolean z10, int i10) throws IOException {
        AbstractC4862t.e(file, "<this>");
        AbstractC4862t.e(target, "target");
        if (!file.exists()) {
            throw new n(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new e(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new e(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new f(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                b.a(fileInputStream, fileOutputStream, i10);
                c.a(fileOutputStream, null);
                c.a(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File m(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return l(file, file2, z10, i10);
    }

    public static boolean n(File file) {
        AbstractC4862t.e(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : k.k(file)) {
                if (!file2.delete() && file2.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public static String o(File file) {
        AbstractC4862t.e(file, "<this>");
        String name = file.getName();
        AbstractC4862t.d(name, "getName(...)");
        return F.S0(name, '.', "");
    }

    public static String p(File file) {
        AbstractC4862t.e(file, "<this>");
        String name = file.getName();
        AbstractC4862t.d(name, "getName(...)");
        return F.c1(name, ".", null, 2, null);
    }

    public static final File q(File file, File relative) {
        AbstractC4862t.e(file, "<this>");
        AbstractC4862t.e(relative, "relative");
        if (i.b(relative)) {
            return relative;
        }
        String string = file.toString();
        AbstractC4862t.d(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!F.Y(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    public static File r(File file, String relative) {
        AbstractC4862t.e(file, "<this>");
        AbstractC4862t.e(relative, "relative");
        return q(file, new File(relative));
    }
}
