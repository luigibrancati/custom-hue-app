package I1;

import G1.AbstractC0853a;
import G1.M;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f5514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f5515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InputStream f5516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5518j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends g {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public v(Context context) {
        super(false);
        this.f5513e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    public static AssetFileDescriptor x(Context context, j jVar) throws a {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = jVar.f5437a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = y(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) AbstractC0853a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = y(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, 2005);
        }
    }

    public static int y(String str) throws a {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // I1.f
    public void close() {
        this.f5514f = null;
        try {
            try {
                InputStream inputStream = this.f5516h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f5516h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5515g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f5515g = null;
                    if (this.f5518j) {
                        this.f5518j = false;
                        u();
                    }
                }
            } catch (Throwable th) {
                this.f5516h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f5515g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f5515g = null;
                        if (this.f5518j) {
                            this.f5518j = false;
                            u();
                        }
                        throw th;
                    } finally {
                        this.f5515g = null;
                        if (this.f5518j) {
                            this.f5518j = false;
                            u();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(null, e12, 2000);
        }
    }

    @Override // I1.f
    public long f(j jVar) throws a {
        this.f5514f = jVar;
        v(jVar);
        AssetFileDescriptor assetFileDescriptorX = x(this.f5513e, jVar);
        this.f5515g = assetFileDescriptorX;
        long length = assetFileDescriptorX.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f5515g.getFileDescriptor());
        this.f5516h = fileInputStream;
        if (length != -1) {
            try {
                if (jVar.f5443g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        }
        long startOffset = this.f5515g.getStartOffset();
        long jSkip = fileInputStream.skip(jVar.f5443g + startOffset) - startOffset;
        if (jSkip != jVar.f5443g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f5517i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f5517i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f5517i = j10;
            if (j10 < 0) {
                throw new g(2008);
            }
        }
        long jMin = jVar.f5444h;
        if (jMin != -1) {
            long j11 = this.f5517i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f5517i = jMin;
        }
        this.f5518j = true;
        w(jVar);
        long j12 = jVar.f5444h;
        return j12 != -1 ? j12 : this.f5517i;
    }

    @Override // I1.f
    public Uri getUri() {
        j jVar = this.f5514f;
        if (jVar != null) {
            return jVar.f5437a;
        }
        return null;
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5517i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) M.i(this.f5516h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f5517i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f5517i;
        if (j11 != -1) {
            this.f5517i = j11 - ((long) i12);
        }
        t(i12);
        return i12;
    }
}
