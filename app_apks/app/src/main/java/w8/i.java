package w8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
import u8.C5992i;
import w8.h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i implements InterfaceC6167d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f46363d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f46364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f46366c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f46367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f46368b;

        public a(byte[] bArr, int[] iArr) {
            this.f46367a = bArr;
            this.f46368b = iArr;
        }

        @Override // w8.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f46367a, this.f46368b[0], i10);
                int[] iArr = this.f46368b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f46370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46371b;

        public b(byte[] bArr, int i10) {
            this.f46370a = bArr;
            this.f46371b = i10;
        }
    }

    public i(File file, int i10) {
        this.f46364a = file;
        this.f46365b = i10;
    }

    @Override // w8.InterfaceC6167d
    public void a() {
        C5992i.f(this.f46366c, "There was a problem closing the Crashlytics log file.");
        this.f46366c = null;
    }

    @Override // w8.InterfaceC6167d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f46363d);
        }
        return null;
    }

    @Override // w8.InterfaceC6167d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f46371b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f46370a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // w8.InterfaceC6167d
    public void d() {
        a();
        this.f46364a.delete();
    }

    @Override // w8.InterfaceC6167d
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }

    public final void f(long j10, String str) {
        if (this.f46366c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f46365b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f46366c.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", StringUtils.SPACE).replaceAll("\n", StringUtils.SPACE)).getBytes(f46363d));
            while (!this.f46366c.m() && this.f46366c.Y() > this.f46365b) {
                this.f46366c.G();
            }
        } catch (IOException e10) {
            r8.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    public final b g() {
        if (!this.f46364a.exists()) {
            return null;
        }
        h();
        h hVar = this.f46366c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.Y()];
        try {
            this.f46366c.j(new a(bArr, iArr));
        } catch (IOException e10) {
            r8.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    public final void h() {
        if (this.f46366c == null) {
            try {
                this.f46366c = new h(this.f46364a);
            } catch (IOException e10) {
                r8.g.f().e("Could not open log file: " + this.f46364a, e10);
            }
        }
    }
}
