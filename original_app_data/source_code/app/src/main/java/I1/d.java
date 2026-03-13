package I1;

import G1.M;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f5420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f5421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f5422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f5423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5425j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends g {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public d(Context context) {
        super(false);
        this.f5420e = context.getContentResolver();
    }

    @Override // I1.f
    public void close() {
        this.f5421f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f5423h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f5423h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5422g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, 2000);
                    }
                } finally {
                    this.f5422g = null;
                    if (this.f5425j) {
                        this.f5425j = false;
                        u();
                    }
                }
            } catch (Throwable th) {
                this.f5423h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f5422g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f5422g = null;
                        if (this.f5425j) {
                            this.f5425j = false;
                            u();
                        }
                        throw th;
                    } finally {
                        this.f5422g = null;
                        if (this.f5425j) {
                            this.f5425j = false;
                            u();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(e12, 2000);
        }
    }

    @Override // I1.f
    public long f(j jVar) throws a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = jVar.f5437a.normalizeScheme();
            this.f5421f = uriNormalizeScheme;
            v(jVar);
            if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f5420e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f5420e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f5422g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f5423h = fileInputStream;
            if (length != -1 && jVar.f5443g > length) {
                throw new a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(jVar.f5443g + startOffset) - startOffset;
            if (jSkip != jVar.f5443g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f5424i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f5424i = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f5424i = j10;
                if (j10 < 0) {
                    throw new a(null, 2008);
                }
            }
            long jMin = jVar.f5444h;
            if (jMin != -1) {
                long j11 = this.f5424i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f5424i = jMin;
            }
            this.f5425j = true;
            w(jVar);
            long j12 = jVar.f5444h;
            return j12 != -1 ? j12 : this.f5424i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // I1.f
    public Uri getUri() {
        return this.f5421f;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5424i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) M.i(this.f5423h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f5424i;
        if (j11 != -1) {
            this.f5424i = j11 - ((long) i12);
        }
        t(i12);
        return i12;
    }
}
