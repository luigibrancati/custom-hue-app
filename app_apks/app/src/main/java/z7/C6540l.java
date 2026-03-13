package z7;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: z7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6540l implements InterfaceC6542n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f48819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC6550v f48820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipFile f48821c;

    public C6540l(C6544p c6544p, Set set, AbstractC6550v abstractC6550v, ZipFile zipFile) {
        this.f48819a = set;
        this.f48820b = abstractC6550v;
        this.f48821c = zipFile;
    }

    @Override // z7.InterfaceC6542n
    public final void a(C6543o c6543o, File file, boolean z10) throws IllegalAccessException, IOException, InvocationTargetException {
        this.f48819a.add(file);
        if (z10) {
            return;
        }
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f48820b.b(), c6543o.f48822a, this.f48820b.a().getAbsolutePath(), c6543o.f48823b.getName(), file.getAbsolutePath()));
        ZipFile zipFile = this.f48821c;
        ZipEntry zipEntry = c6543o.f48823b;
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                C6535g.m(file);
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }
}
