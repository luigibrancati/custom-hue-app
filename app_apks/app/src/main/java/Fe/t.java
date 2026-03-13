package Fe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class t extends AbstractC0849k {
    @Override // Fe.AbstractC0849k
    public H b(A file, boolean z10) throws IOException {
        AbstractC4862t.e(file, "file");
        if (z10) {
            t(file);
        }
        return v.e(file.toFile(), true);
    }

    @Override // Fe.AbstractC0849k
    public void c(A source, A target) throws IOException {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // Fe.AbstractC0849k
    public void g(A dir, boolean z10) throws IOException {
        AbstractC4862t.e(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C0848j c0848jM = m(dir);
        if (c0848jM == null || !c0848jM.e()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // Fe.AbstractC0849k
    public void i(A path, boolean z10) throws IOException {
        AbstractC4862t.e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // Fe.AbstractC0849k
    public List k(A dir) throws IOException {
        AbstractC4862t.e(dir, "dir");
        List listR = r(dir, true);
        AbstractC4862t.b(listR);
        return listR;
    }

    @Override // Fe.AbstractC0849k
    public C0848j m(A path) {
        AbstractC4862t.e(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new C0848j(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // Fe.AbstractC0849k
    public AbstractC0847i n(A file) {
        AbstractC4862t.e(file, "file");
        return new s(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // Fe.AbstractC0849k
    public H p(A file, boolean z10) throws IOException {
        AbstractC4862t.e(file, "file");
        if (z10) {
            s(file);
        }
        return w.f(file.toFile(), false, 1, null);
    }

    @Override // Fe.AbstractC0849k
    public J q(A file) {
        AbstractC4862t.e(file, "file");
        return v.i(file.toFile());
    }

    public final List r(A a10, boolean z10) throws IOException {
        File file = a10.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                AbstractC4862t.b(str);
                arrayList.add(a10.x(str));
            }
            gc.x.z(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + a10);
        }
        throw new FileNotFoundException("no such file: " + a10);
    }

    public final void s(A a10) throws IOException {
        if (j(a10)) {
            throw new IOException(a10 + " already exists.");
        }
    }

    public final void t(A a10) throws IOException {
        if (j(a10)) {
            return;
        }
        throw new IOException(a10 + " doesn't exist.");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
