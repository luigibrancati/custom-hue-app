package A8;

import C8.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import u8.C5996m;
import u8.E;
import w8.p;
import x8.F;
import y8.C6454j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f232e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f233f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C6454j f234g = new C6454j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f235h = new Comparator() { // from class: A8.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FilenameFilter f236i = new FilenameFilter() { // from class: A8.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f237a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5996m f240d;

    public e(g gVar, j jVar, C5996m c5996m) {
        this.f238b = gVar;
        this.f239c = jVar;
        this.f240d = c5996m;
    }

    public static void D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f232e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f232e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int f(List list, int i10) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i10) {
                break;
            }
            g.u(file);
            size--;
        }
        return size;
    }

    public static long h(long j10) {
        return j10 * 1000;
    }

    public static String m(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    public static String o(String str) {
        return str.substring(0, f233f);
    }

    public static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static int v(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public static String y(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f232e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void A(String str, long j10) {
        boolean z10;
        List<File> listR = this.f238b.r(str, f236i);
        if (listR.isEmpty()) {
            r8.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : listR) {
                try {
                    arrayList.add(f234g.j(y(file)));
                } catch (IOException e10) {
                    r8.g.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            B(this.f238b.q(str, "report"), arrayList, j10, z10, p.l(str, this.f238b), this.f240d.d(str));
        } else {
            r8.g.f().k("Could not parse event files for session " + str);
        }
    }

    public final void B(File file, List list, long j10, boolean z10, String str, String str2) {
        try {
            C6454j c6454j = f234g;
            F fR = c6454j.L(y(file)).v(j10, z10, str).p(str2).r(list);
            F.e eVarN = fR.n();
            if (eVarN == null) {
                return;
            }
            r8.g.f().b("appQualitySessionId: " + str2);
            D(z10 ? this.f238b.l(eVarN.i()) : this.f238b.n(eVarN.i()), c6454j.M(fR));
        } catch (IOException e10) {
            r8.g.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    public final int C(String str, int i10) {
        List listR = this.f238b.r(str, new FilenameFilter() { // from class: A8.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: A8.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.v((File) obj, (File) obj2);
            }
        });
        return f(listR, i10);
    }

    public final SortedSet e(String str) {
        this.f238b.d();
        SortedSet sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() > 8) {
            while (sortedSetP.size() > 8) {
                String str2 = (String) sortedSetP.last();
                r8.g.f().b("Removing session over cap: " + str2);
                this.f238b.e(str2);
                sortedSetP.remove(str2);
            }
        }
        return sortedSetP;
    }

    public final void g() {
        int i10 = this.f239c.b().f1170a.f1182b;
        List listN = n();
        int size = listN.size();
        if (size <= i10) {
            return;
        }
        Iterator it = listN.subList(i10, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void i() {
        j(this.f238b.o());
        j(this.f238b.m());
        j(this.f238b.j());
    }

    public final void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            r8.g.f().i("Finalizing report for session " + str2);
            A(str2, j10);
            this.f238b.e(str2);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File fileQ = this.f238b.q(str, "report");
        r8.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        z(fileQ, dVar, str, aVar);
    }

    public final List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f238b.m());
        arrayList.addAll(this.f238b.j());
        Comparator comparator = f235h;
        Collections.sort(arrayList, comparator);
        List listO = this.f238b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    public SortedSet p() {
        return new TreeSet(this.f238b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f238b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f238b.o().isEmpty() && this.f238b.m().isEmpty() && this.f238b.j().isEmpty()) ? false : true;
    }

    public List u() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(E.a(f234g.L(y(file)), file.getName(), file));
            } catch (IOException e10) {
                r8.g.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(F.e.d dVar, String str, boolean z10) {
        int i10 = this.f239c.b().f1170a.f1181a;
        try {
            D(this.f238b.q(str, m(this.f237a.getAndIncrement(), z10)), f234g.k(dVar));
        } catch (IOException e10) {
            r8.g.f().l("Could not persist event for session " + str, e10);
        }
        C(str, i10);
    }

    public void x(F f10) {
        F.e eVarN = f10.n();
        if (eVarN == null) {
            r8.g.f().b("Could not get session for report");
            return;
        }
        String strI = eVarN.i();
        try {
            D(this.f238b.q(strI, "report"), f234g.M(f10));
            E(this.f238b.q(strI, "start-time"), "", eVarN.l());
        } catch (IOException e10) {
            r8.g.f().c("Could not persist report for session " + strI, e10);
        }
    }

    public final void z(File file, F.d dVar, String str, F.a aVar) {
        String strD = this.f240d.d(str);
        try {
            C6454j c6454j = f234g;
            D(this.f238b.i(str), c6454j.M(c6454j.L(y(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e10) {
            r8.g.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }
}
