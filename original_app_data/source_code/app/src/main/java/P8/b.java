package P8;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f13174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileLock f13175b;

    public b(FileChannel fileChannel, FileLock fileLock) {
        this.f13174a = fileChannel;
        this.f13175b = fileLock;
    }

    public static b a(Context context, String str) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new b(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException e10) {
                    e = e10;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e11) {
                e = e11;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e12) {
            e = e12;
            channel = null;
            fileLockLock = null;
        }
    }

    public void b() {
        try {
            this.f13175b.release();
            this.f13174a.close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }
}
