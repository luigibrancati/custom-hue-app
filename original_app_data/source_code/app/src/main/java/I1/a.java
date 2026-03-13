package I1;

import G1.AbstractC0853a;
import G1.M;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f5411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f5412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f5413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5415i;

    /* JADX INFO: renamed from: I1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0091a extends g {
        public C0091a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public a(Context context) {
        super(false);
        this.f5411e = context.getAssets();
    }

    @Override // I1.f
    public void close() {
        this.f5412f = null;
        try {
            try {
                InputStream inputStream = this.f5413g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new C0091a(e10, 2000);
            }
        } finally {
            this.f5413g = null;
            if (this.f5415i) {
                this.f5415i = false;
                u();
            }
        }
    }

    @Override // I1.f
    public long f(j jVar) throws C0091a {
        try {
            Uri uri = jVar.f5437a;
            this.f5412f = uri;
            String strSubstring = (String) AbstractC0853a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            v(jVar);
            InputStream inputStreamOpen = this.f5411e.open(strSubstring, 1);
            this.f5413g = inputStreamOpen;
            if (inputStreamOpen.skip(jVar.f5443g) < jVar.f5443g) {
                throw new C0091a(null, 2008);
            }
            long j10 = jVar.f5444h;
            if (j10 != -1) {
                this.f5414h = j10;
            } else {
                long jAvailable = this.f5413g.available();
                this.f5414h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f5414h = -1L;
                }
            }
            this.f5415i = true;
            w(jVar);
            return this.f5414h;
        } catch (C0091a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C0091a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // I1.f
    public Uri getUri() {
        return this.f5412f;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) throws C0091a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5414h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C0091a(e10, 2000);
            }
        }
        int i12 = ((InputStream) M.i(this.f5413g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f5414h;
        if (j11 != -1) {
            this.f5414h = j11 - ((long) i12);
        }
        t(i12);
        return i12;
    }
}
