package W5;

import W5.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a implements c.a {

    /* JADX INFO: renamed from: W5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0239a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ZipFile f17824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ZipEntry f17825b;

        public C0239a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f17824a = zipFile;
            this.f17825b = zipEntry;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return;
     */
    @Override // W5.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r9, java.lang.String[] r10, java.lang.String r11, java.io.File r12, W5.d r13) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 0
            W5.a$a r1 = r8.d(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto L8f
            r9 = 0
            r10 = r9
        L9:
            int r2 = r10 + 1
            r3 = 5
            if (r10 >= r3) goto L84
            java.lang.String r10 = "Found %s! Extracting..."
            java.lang.Object[] r3 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> L25
            r13.j(r10, r3)     // Catch: java.lang.Throwable -> L25
            boolean r10 = r12.exists()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L82
            if (r10 != 0) goto L29
            boolean r10 = r12.createNewFile()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L82
            if (r10 != 0) goto L29
            goto L82
        L25:
            r8 = move-exception
            r0 = r1
            goto La4
        L29:
            java.util.zip.ZipFile r10 = r1.f17824a     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.util.zip.ZipEntry r3 = r1.f17825b     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.io.InputStream r10 = r10.getInputStream(r3)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75 java.io.FileNotFoundException -> L78
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6e java.io.FileNotFoundException -> L70
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6e java.io.FileNotFoundException -> L70
            long r4 = r8.c(r10, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L68
            java.io.FileDescriptor r6 = r3.getFD()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L68
            r6.sync()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L68
            long r6 = r12.length()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L68
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L50
        L49:
            r8.b(r10)     // Catch: java.lang.Throwable -> L25
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            goto L82
        L50:
            r8.b(r10)     // Catch: java.lang.Throwable -> L25
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            r8 = 1
            r12.setReadable(r8, r9)     // Catch: java.lang.Throwable -> L25
            r12.setExecutable(r8, r9)     // Catch: java.lang.Throwable -> L25
            r12.setWritable(r8)     // Catch: java.lang.Throwable -> L25
            java.util.zip.ZipFile r8 = r1.f17824a     // Catch: java.io.IOException -> L8e
            if (r8 == 0) goto L8e
        L64:
            r8.close()     // Catch: java.io.IOException -> L8e
            goto L8e
        L68:
            r9 = move-exception
        L69:
            r0 = r10
            goto L7b
        L6b:
            r9 = move-exception
            r3 = r0
            goto L69
        L6e:
            r3 = r0
            goto L49
        L70:
            r3 = r0
            goto L49
        L72:
            r9 = move-exception
            r3 = r0
            goto L7b
        L75:
            r10 = r0
            r3 = r10
            goto L49
        L78:
            r10 = r0
            r3 = r10
            goto L49
        L7b:
            r8.b(r0)     // Catch: java.lang.Throwable -> L25
            r8.b(r3)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L82:
            r10 = r2
            goto L9
        L84:
            java.lang.String r8 = "FATAL! Couldn't extract the library from the APK!"
            r13.i(r8)     // Catch: java.lang.Throwable -> L25
            java.util.zip.ZipFile r8 = r1.f17824a     // Catch: java.io.IOException -> L8e
            if (r8 == 0) goto L8e
            goto L64
        L8e:
            return
        L8f:
            java.lang.String[] r8 = r8.e(r9, r11)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L94
            goto L9d
        L94:
            r8 = move-exception
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L25
        L9d:
            W5.b r9 = new W5.b     // Catch: java.lang.Throwable -> L25
            r9.<init>(r11, r10, r8)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        La3:
            r8 = move-exception
        La4:
            if (r0 == 0) goto Lad
            java.util.zip.ZipFile r9 = r0.f17824a     // Catch: java.io.IOException -> Lad
            if (r9 == 0) goto Lad
            r9.close()     // Catch: java.io.IOException -> Lad
        Lad:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.a.a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, W5.d):void");
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                outputStream.flush();
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public final C0239a d(Context context, String[] strArr, String str, d dVar) {
        String[] strArrF = f(context);
        int length = strArrF.length;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = strArrF[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("lib");
                            char c10 = File.separatorChar;
                            sb2.append(c10);
                            sb2.append(str3);
                            sb2.append(c10);
                            sb2.append(str);
                            String string = sb2.toString();
                            dVar.j("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                return new C0239a(zipFile, entry);
                            }
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
        }
    }

    public final String[] e(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lib");
        char c10 = File.separatorChar;
        sb2.append(c10);
        sb2.append("([^\\");
        sb2.append(c10);
        sb2.append("]*)");
        sb2.append(c10);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
