package W5;

import W5.c;
import X5.i;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f17826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.b f17827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f17828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.d f17831f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17834c;

        public a(Context context, String str, String str2, c.InterfaceC0240c interfaceC0240c) {
            this.f17832a = context;
            this.f17833b = str;
            this.f17834c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                r4 = this;
                r0 = 0
                W5.d r1 = W5.d.this     // Catch: W5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r4.f17832a     // Catch: W5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r4.f17833b     // Catch: W5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r4.f17834c     // Catch: W5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                W5.d.a(r1, r2, r3, r4)     // Catch: W5.b -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: W5.d.a.run():void");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17836a;

        public b(String str) {
            this.f17836a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f17836a);
        }
    }

    public d() {
        this(new e(), new W5.a());
    }

    public void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f17827b.b(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f17829d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String strB = this.f17827b.b(str);
        if (f.a(str2)) {
            return new File(c(context), strB);
        }
        return new File(c(context), strB + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0240c interfaceC0240c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        j("Beginning load of %s...", str);
        if (interfaceC0240c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0240c)).start();
        }
    }

    public final void g(Context context, String str, String str2) throws Throwable {
        d dVar;
        Context context2;
        i iVar;
        Throwable th;
        if (this.f17826a.contains(str) && !this.f17829d) {
            j("%s already loaded previously!", str);
            return;
        }
        try {
            this.f17827b.a(str);
            this.f17826a.add(str);
            j("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            j("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            j("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f17829d) {
                if (this.f17829d) {
                    j("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                dVar = this;
                context2 = context;
                this.f17828c.a(context2, this.f17827b.d(), this.f17827b.b(str), fileD, dVar);
            } else {
                dVar = this;
                context2 = context;
            }
            try {
                if (dVar.f17830e) {
                    try {
                        iVar = new i(fileD);
                    } catch (Throwable th2) {
                        iVar = null;
                        th = th2;
                    }
                    try {
                        List listC = iVar.c();
                        iVar.close();
                        Iterator it = listC.iterator();
                        while (it.hasNext()) {
                            dVar.e(context2, dVar.f17827b.c((String) it.next()));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (iVar == null) {
                            throw th;
                        }
                        iVar.close();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
            dVar.f17827b.e(fileD.getAbsolutePath());
            dVar.f17826a.add(str);
            dVar.j("%s (%s) was re-linked!", str, str2);
        }
    }

    public d h(c.d dVar) {
        this.f17831f = dVar;
        return this;
    }

    public void i(String str) {
        c.d dVar = this.f17831f;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public void j(String str, Object... objArr) {
        i(String.format(Locale.US, str, objArr));
    }

    public d(c.b bVar, c.a aVar) {
        this.f17826a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f17827b = bVar;
        this.f17828c = aVar;
    }
}
