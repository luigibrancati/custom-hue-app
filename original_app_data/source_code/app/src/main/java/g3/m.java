package g3;

import android.content.Context;
import android.util.Log;
import b3.C2804c;
import b3.InterfaceC2805d;
import b3.t;
import fc.C4015H;
import h3.AbstractC4270a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;
import l3.InterfaceC4878d;
import m3.C5017i;
import o3.C5203a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC4878d, InterfaceC2805d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f35427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable f35428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4878d f35430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2804c f35431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35432h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends InterfaceC4878d.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11) {
            super(i11);
            this.f35433c = i10;
        }

        @Override // l3.InterfaceC4878d.a
        public void d(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
        }

        @Override // l3.InterfaceC4878d.a
        public void f(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
            int i10 = this.f35433c;
            if (i10 < 1) {
                db2.r0(i10);
            }
        }

        @Override // l3.InterfaceC4878d.a
        public void g(InterfaceC4877c db2, int i10, int i11) {
            AbstractC4862t.e(db2, "db");
        }
    }

    public m(Context context, String str, File file, Callable callable, int i10, InterfaceC4878d delegate) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(delegate, "delegate");
        this.f35425a = context;
        this.f35426b = str;
        this.f35427c = file;
        this.f35428d = callable;
        this.f35429e = i10;
        this.f35430f = delegate;
    }

    @Override // l3.InterfaceC4878d
    public InterfaceC4877c E0() {
        if (!this.f35432h) {
            g(false);
            this.f35432h = true;
        }
        return a().E0();
    }

    @Override // l3.InterfaceC4878d
    public InterfaceC4877c F0() {
        if (!this.f35432h) {
            g(true);
            this.f35432h = true;
        }
        return a().F0();
    }

    @Override // b3.InterfaceC2805d
    public InterfaceC4878d a() {
        return this.f35430f;
    }

    public final void b(File file, boolean z10) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f35426b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f35425a.getAssets().open(this.f35426b));
        } else if (this.f35427c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f35427c).getChannel();
        } else {
            Callable callable = this.f35428d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f35425a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        AbstractC4862t.b(channel);
        h3.d.a(readableByteChannelNewChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        AbstractC4862t.b(fileCreateTempFile);
        d(fileCreateTempFile, z10);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public final InterfaceC4878d c(File file) {
        try {
            int iE = AbstractC4270a.e(file);
            return new C5017i().a(InterfaceC4878d.b.f39842f.a(this.f35425a).d(file.getAbsolutePath()).c(new a(iE, Bc.k.e(iE, 1))).b());
        } catch (IOException e10) {
            throw new RuntimeException("Malformed database file, unable to read version.", e10);
        }
    }

    @Override // l3.InterfaceC4878d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f35432h = false;
    }

    public final void d(File file, boolean z10) throws IOException {
        C2804c c2804c = this.f35431g;
        if (c2804c == null) {
            AbstractC4862t.p("databaseConfiguration");
            c2804c = null;
        }
        if (c2804c.f25171q == null) {
            return;
        }
        InterfaceC4878d interfaceC4878dC = c(file);
        try {
            InterfaceC4877c interfaceC4877cF0 = z10 ? interfaceC4878dC.F0() : interfaceC4878dC.E0();
            C2804c c2804c2 = this.f35431g;
            if (c2804c2 == null) {
                AbstractC4862t.p("databaseConfiguration");
                c2804c2 = null;
            }
            t.f fVar = c2804c2.f25171q;
            AbstractC4862t.b(fVar);
            fVar.a(interfaceC4877cF0);
            C4015H c4015h = C4015H.f34254a;
            sc.c.a(interfaceC4878dC, null);
        } finally {
        }
    }

    public final void f(C2804c databaseConfiguration) {
        AbstractC4862t.e(databaseConfiguration, "databaseConfiguration");
        this.f35431g = databaseConfiguration;
    }

    public final void g(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.f35425a.getDatabasePath(databaseName);
        C2804c c2804c = this.f35431g;
        C2804c c2804c2 = null;
        if (c2804c == null) {
            AbstractC4862t.p("databaseConfiguration");
            c2804c = null;
        }
        C5203a c5203a = new C5203a(databaseName, this.f35425a.getFilesDir(), c2804c.f25177w);
        try {
            C5203a.c(c5203a, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    AbstractC4862t.b(databasePath);
                    b(databasePath, z10);
                    c5203a.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                AbstractC4862t.b(databasePath);
                int iE = AbstractC4270a.e(databasePath);
                if (iE == this.f35429e) {
                    c5203a.d();
                    return;
                }
                C2804c c2804c3 = this.f35431g;
                if (c2804c3 == null) {
                    AbstractC4862t.p("databaseConfiguration");
                } else {
                    c2804c2 = c2804c3;
                }
                if (c2804c2.e(iE, this.f35429e)) {
                    c5203a.d();
                    return;
                }
                if (this.f35425a.deleteDatabase(databaseName)) {
                    try {
                        b(databasePath, z10);
                        C4015H c4015h = C4015H.f34254a;
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c5203a.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                c5203a.d();
                return;
            }
        } catch (Throwable th) {
            c5203a.d();
            throw th;
        }
        c5203a.d();
        throw th;
    }

    @Override // l3.InterfaceC4878d
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // l3.InterfaceC4878d
    public void setWriteAheadLoggingEnabled(boolean z10) {
        a().setWriteAheadLoggingEnabled(z10);
    }
}
