package B7;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import z7.C6529a;
import z7.C6535g;
import z7.C6549u;

/* JADX INFO: renamed from: B7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0699g implements A7.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6535g f737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0701i f738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6549u f740e;

    public C0699g(Context context, Executor executor, C0701i c0701i, C6535g c6535g, C6549u c6549u) {
        this.f736a = context;
        this.f737b = c6535g;
        this.f738c = c0701i;
        this.f739d = executor;
        this.f740e = c6549u;
    }

    public static /* bridge */ /* synthetic */ void c(C0699g c0699g, List list, A7.y yVar) {
        Integer numE = c0699g.e(list);
        if (numE == null) {
            return;
        }
        if (numE.intValue() == 0) {
            yVar.b();
        } else {
            yVar.y(numE.intValue());
        }
    }

    public static /* bridge */ /* synthetic */ void d(C0699g c0699g, A7.y yVar) {
        try {
            if (C6529a.e(E.a(c0699g.f736a))) {
                Log.i("SplitCompat", "Splits installed.");
                yVar.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                yVar.y(-12);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error emulating splits.", e10);
            yVar.y(-12);
        }
    }

    @Override // A7.A
    public final void a(List list, A7.y yVar) {
        if (!C6529a.f()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f739d.execute(new RunnableC0698f(this, list, yVar));
    }

    public final Integer e(List list) {
        FileChannel channel;
        Integer numValueOf;
        FileLock fileLockTryLock;
        int i10;
        File[] fileArrListFiles;
        try {
            channel = new RandomAccessFile(this.f737b.d(), "rw").getChannel();
            numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } finally {
                }
            } catch (OverlappingFileLockException unused) {
                fileLockTryLock = null;
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error locking files.", e10);
            return -13;
        }
        if (fileLockTryLock != null) {
            try {
                Log.i("SplitCompat", "Copying splits.");
                Iterator it = list.iterator();
                while (true) {
                    i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Intent intent = (Intent) it.next();
                    String stringExtra = intent.getStringExtra("split_id");
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f736a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                    try {
                        File fileE = this.f737b.e(stringExtra);
                        if ((fileE.exists() && fileE.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileE.exists()) {
                            if (!this.f737b.g(stringExtra).exists()) {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                                    try {
                                        byte[] bArr = new byte[RecognitionOptions.AZTEC];
                                        while (true) {
                                            int i11 = bufferedInputStream.read(bArr);
                                            if (i11 <= 0) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, i11);
                                        }
                                        fileOutputStream.close();
                                        bufferedInputStream.close();
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        }
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            assetFileDescriptorOpenAssetFileDescriptor.close();
                        }
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            try {
                                assetFileDescriptorOpenAssetFileDescriptor.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                        }
                        throw th;
                    }
                    Log.e("SplitCompat", "Error locking files.", e10);
                    return -13;
                }
                Log.i("SplitCompat", "Splits copied.");
                try {
                    fileArrListFiles = this.f737b.b().listFiles();
                    try {
                    } catch (Exception e11) {
                        Log.e("SplitCompat", "Error verifying splits.", e11);
                    }
                } catch (IOException e12) {
                    Log.e("SplitCompat", "Cannot access directory for unverified splits.", e12);
                }
            } catch (Exception e13) {
                Log.e("SplitCompat", "Error copying splits.", e13);
            }
            if (this.f738c.c(fileArrListFiles)) {
                if (this.f738c.a(fileArrListFiles)) {
                    try {
                        File[] fileArrListFiles2 = this.f737b.b().listFiles();
                        Arrays.sort(fileArrListFiles2);
                        int length = fileArrListFiles2.length;
                        while (true) {
                            length--;
                            if (length < 0) {
                                break;
                            }
                            C6535g.m(fileArrListFiles2[length]);
                            File file = fileArrListFiles2[length];
                            file.renameTo(this.f737b.f(file));
                        }
                        Log.i("SplitCompat", "Splits verified.");
                    } catch (IOException e14) {
                        Log.e("SplitCompat", "Cannot write verified split.", e14);
                        i10 = -13;
                    }
                    numValueOf = Integer.valueOf(i10);
                    fileLockTryLock.release();
                }
            }
            Log.e("SplitCompat", "Split verification failed.");
            i10 = -11;
            numValueOf = Integer.valueOf(i10);
            fileLockTryLock.release();
        }
        if (channel != null) {
            channel.close();
        }
        return numValueOf;
    }
}
