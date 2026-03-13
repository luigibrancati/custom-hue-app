package c3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: c3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2941c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileChannel f25588b;

    public C2941c(String filename) {
        AbstractC4862t.e(filename, "filename");
        this.f25587a = filename + ".lck";
    }

    public final void a() throws IOException {
        if (this.f25588b != null) {
            return;
        }
        try {
            File file = new File(this.f25587a);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f25588b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = this.f25588b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f25588b = null;
            throw new IllegalStateException("Unable to lock file: '" + this.f25587a + "'.", th);
        }
    }

    public final void b() {
        FileChannel fileChannel = this.f25588b;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.f25588b = null;
        }
    }
}
