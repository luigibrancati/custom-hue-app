package I1;

import G1.AbstractC0853a;
import G1.M;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f5498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f5499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5501h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends g {
        public a(Throwable th, int i10) {
            super(th, i10);
        }

        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public o() {
        super(false);
    }

    public static RandomAccessFile x(Uri uri) throws a {
        try {
            return new RandomAccessFile((String) AbstractC0853a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new a(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        } catch (RuntimeException e12) {
            throw new a(e12, 2000);
        }
    }

    @Override // I1.f
    public void close() {
        this.f5499f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f5498e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f5498e = null;
            if (this.f5501h) {
                this.f5501h = false;
                u();
            }
        }
    }

    @Override // I1.f
    public long f(j jVar) throws a {
        Uri uri = jVar.f5437a;
        this.f5499f = uri;
        v(jVar);
        RandomAccessFile randomAccessFileX = x(uri);
        this.f5498e = randomAccessFileX;
        try {
            randomAccessFileX.seek(jVar.f5443g);
            long length = jVar.f5444h;
            if (length == -1) {
                length = this.f5498e.length() - jVar.f5443g;
            }
            this.f5500g = length;
            if (length < 0) {
                throw new a(null, null, 2008);
            }
            this.f5501h = true;
            w(jVar);
            return this.f5500g;
        } catch (IOException e10) {
            throw new a(e10, 2000);
        }
    }

    @Override // I1.f
    public Uri getUri() {
        return this.f5499f;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f5500g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) M.i(this.f5498e)).read(bArr, i10, (int) Math.min(this.f5500g, i11));
            if (i12 > 0) {
                this.f5500g -= (long) i12;
                t(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new a(e10, 2000);
        }
    }
}
