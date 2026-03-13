package androidx.profileinstaller;

import Y2.i;
import Y2.j;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f23989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f23990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0307c f23991c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f23993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f23995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23996h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Y2.b[] f23998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f23999k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23997i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23992d = d();

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0307c interfaceC0307c, String str, String str2, String str3, File file) {
        this.f23989a = assetManager;
        this.f23990b = executor;
        this.f23991c = interfaceC0307c;
        this.f23994f = str;
        this.f23995g = str2;
        this.f23996h = str3;
        this.f23993e = file;
    }

    public static byte[] d() {
        return j.f19697a;
    }

    public static boolean j() {
        return true;
    }

    public final b b(Y2.b[] bVarArr, byte[] bArr) {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f23989a, this.f23996h);
        } catch (FileNotFoundException e10) {
            this.f23991c.a(9, e10);
        } catch (IOException e11) {
            this.f23991c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f23998j = null;
            this.f23991c.a(8, e12);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f23998j = i.r(inputStreamG, i.p(inputStreamG, i.f19696b), bArr, bVarArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.f23997i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f23992d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f23993e.exists()) {
            try {
                if (!this.f23993e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f23993e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f23997i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f23995g);
        } catch (FileNotFoundException e10) {
            this.f23991c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f23991c.a(7, e11);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f23991c.b(5, null);
            }
            return null;
        }
    }

    public b h() {
        b bVarB;
        c();
        if (this.f23992d != null) {
            InputStream inputStreamF = f(this.f23989a);
            if (inputStreamF != null) {
                this.f23998j = i(inputStreamF);
            }
            Y2.b[] bVarArr = this.f23998j;
            if (bVarArr != null && j() && (bVarB = b(bVarArr, this.f23992d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public final Y2.b[] i(InputStream inputStream) {
        try {
            try {
                try {
                    Y2.b[] bVarArrX = i.x(inputStream, i.p(inputStream, i.f19695a), this.f23994f);
                    try {
                        inputStream.close();
                        return bVarArrX;
                    } catch (IOException e10) {
                        this.f23991c.a(7, e10);
                        return bVarArrX;
                    }
                } catch (IOException e11) {
                    this.f23991c.a(7, e11);
                    return null;
                }
            } catch (IllegalStateException e12) {
                this.f23991c.a(8, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f23991c.a(7, e13);
            }
        }
    }

    public final void k(final int i10, final Object obj) {
        this.f23990b.execute(new Runnable() { // from class: Y2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f19676a.f23991c.a(i10, obj);
            }
        });
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        Y2.b[] bVarArr = this.f23998j;
        byte[] bArr = this.f23992d;
        if (bVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                this.f23991c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f23991c.a(8, e11);
            }
            try {
                i.F(byteArrayOutputStream, bArr);
                if (!i.C(byteArrayOutputStream, bArr, bVarArr)) {
                    this.f23991c.a(5, null);
                    this.f23998j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f23999k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f23998j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f23999k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f23993e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                Y2.c.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                return false;
            } catch (IOException e11) {
                k(7, e11);
                return false;
            }
        } finally {
            this.f23999k = null;
            this.f23998j = null;
        }
    }
}
