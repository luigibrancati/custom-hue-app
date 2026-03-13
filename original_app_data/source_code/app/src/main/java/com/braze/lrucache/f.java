package com.braze.lrucache;

import com.braze.support.BrazeLogger;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f27803o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f27804p = BrazeLogger.getBrazeLogTag((Class<?>) f.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f27805q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f27806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f27807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f27808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f27809d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f27814i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27816k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27813h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f27815j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f27817l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f27818m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f27819n = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27810e = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27812g = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27811f = 52428800;

    public f(File file) {
        this.f27806a = file;
        this.f27807b = new File(file, "journal");
        this.f27808c = new File(file, "journal.tmp");
        this.f27809d = new File(file, "journal.bkp");
    }

    public final d a(String str) {
        synchronized (this) {
            try {
                if (this.f27814i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                if (!f27803o.matcher(str).matches()) {
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                g gVar = (g) this.f27815j.get(str);
                if (gVar == null) {
                    gVar = new g(str, this.f27812g, this.f27806a);
                    this.f27815j.put(str, gVar);
                } else if (gVar.f27823d != null) {
                    return null;
                }
                d dVar = new d(this, gVar);
                gVar.f27823d = dVar;
                this.f27814i.write("DIRTY " + str + '\n');
                this.f27814i.flush();
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() throws IOException {
        File file = this.f27808c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f27815j.values().iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            int i10 = 0;
            if (gVar.f27823d == null) {
                while (i10 < this.f27812g) {
                    this.f27813h += gVar.f27821b[i10];
                    i10++;
                }
            } else {
                gVar.f27823d = null;
                while (i10 < this.f27812g) {
                    File file2 = new File(gVar.f27825f, gVar.f27820a + "." + i10);
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    File fileA = gVar.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void c() {
        i iVar = new i(new FileInputStream(this.f27807b), j.f27832a);
        try {
            String strA = iVar.a();
            String strA2 = iVar.a();
            String strA3 = iVar.a();
            String strA4 = iVar.a();
            String strA5 = iVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f27810e).equals(strA3) || !Integer.toString(this.f27812g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    c(iVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f27816k = i10 - this.f27815j.size();
                    if (iVar.f27831e == -1) {
                        d();
                    } else {
                        this.f27814i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27807b, true), j.f27832a));
                    }
                    try {
                        iVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                iVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            BufferedWriter bufferedWriter = this.f27814i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27808c), j.f27832a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f27810e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f27812g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (g gVar : this.f27815j.values()) {
                    if (gVar.f27823d != null) {
                        bufferedWriter2.write("DIRTY " + gVar.f27820a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(gVar.f27820a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : gVar.f27821b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f27807b.exists()) {
                    File file = this.f27807b;
                    File file2 = this.f27809d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f27808c.renameTo(this.f27807b)) {
                    throw new IOException();
                }
                this.f27809d.delete();
                this.f27814i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27807b, true), j.f27832a));
            } finally {
                try {
                    bufferedWriter2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(d dVar, boolean z10) {
        g gVar = dVar.f27798a;
        if (gVar.f27823d == dVar) {
            if (z10 && !gVar.f27822c) {
                for (int i10 = 0; i10 < this.f27812g; i10++) {
                    if (dVar.f27799b[i10]) {
                        if (!gVar.a(i10).exists()) {
                            dVar.f27801d.a(dVar, false);
                            return;
                        }
                    } else {
                        dVar.f27801d.a(dVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f27812g; i11++) {
                File fileA = gVar.a(i11);
                if (z10) {
                    if (fileA.exists()) {
                        File file = new File(gVar.f27825f, gVar.f27820a + "." + i11);
                        fileA.renameTo(file);
                        long j10 = gVar.f27821b[i11];
                        long length = file.length();
                        gVar.f27821b[i11] = length;
                        this.f27813h = (this.f27813h - j10) + length;
                    }
                } else if (fileA.exists() && !fileA.delete()) {
                    throw new IOException();
                }
            }
            this.f27816k++;
            gVar.f27823d = null;
            if (gVar.f27822c | z10) {
                gVar.f27822c = true;
                BufferedWriter bufferedWriter = this.f27814i;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(gVar.f27820a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : gVar.f27821b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    this.f27817l++;
                }
            } else {
                this.f27815j.remove(gVar.f27820a);
                this.f27814i.write("REMOVE " + gVar.f27820a + '\n');
            }
            this.f27814i.flush();
            if (this.f27813h > this.f27811f || a()) {
                this.f27818m.submit(this.f27819n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized e b(String str) {
        InputStream inputStream;
        if (this.f27814i != null) {
            if (f27803o.matcher(str).matches()) {
                g gVar = (g) this.f27815j.get(str);
                if (gVar == null) {
                    return null;
                }
                if (!gVar.f27822c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f27812g];
                for (int i10 = 0; i10 < this.f27812g; i10++) {
                    try {
                        inputStreamArr[i10] = new FileInputStream(new File(gVar.f27825f, gVar.f27820a + "." + i10));
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.f27812g && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            Charset charset = j.f27832a;
                            try {
                                inputStream.close();
                            } catch (RuntimeException e10) {
                                throw e10;
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    }
                }
                this.f27816k++;
                this.f27814i.append((CharSequence) ("READ " + str + '\n'));
                if (a()) {
                    this.f27818m.submit(this.f27819n);
                }
                return new e(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i10);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i10);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.f27815j.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i10, iIndexOf2);
            }
            g gVar = (g) this.f27815j.get(strSubstring);
            if (gVar == null) {
                gVar = new g(strSubstring, this.f27812g, this.f27806a);
                this.f27815j.put(strSubstring, gVar);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(StringUtils.SPACE);
                gVar.f27822c = true;
                gVar.f27823d = null;
                if (strArrSplit.length == gVar.f27824e) {
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        try {
                            gVar.f27821b[i11] = Long.parseLong(strArrSplit[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                gVar.f27823d = new d(this, gVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void d(String str) {
        try {
            if (this.f27814i != null) {
                if (f27803o.matcher(str).matches()) {
                    g gVar = (g) this.f27815j.get(str);
                    if (gVar != null && gVar.f27823d == null) {
                        for (int i10 = 0; i10 < this.f27812g; i10++) {
                            File file = new File(gVar.f27825f, gVar.f27820a + "." + i10);
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.f27813h;
                            long[] jArr = gVar.f27821b;
                            this.f27813h = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f27816k++;
                        this.f27814i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.f27815j.remove(str);
                        if (a()) {
                            this.f27818m.submit(this.f27819n);
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    public final boolean a() {
        int i10 = this.f27816k;
        return i10 >= 2000 && i10 >= this.f27815j.size();
    }
}
