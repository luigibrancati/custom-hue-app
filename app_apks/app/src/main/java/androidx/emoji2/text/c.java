package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import b0.C2778b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n1.AbstractC5073d;
import n1.AbstractC5074e;
import n1.C5079j;
import n1.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f22928o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f22929p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile c f22930q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f22932b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f22935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f22936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f22937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f22940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f22941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f22942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f22943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f22944n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f22931a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f22933c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f22934d = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.d f22945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f22946c;

        /* JADX INFO: renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0289a extends i {
            public C0289a() {
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th) {
                a.this.f22948a.n(th);
            }

            @Override // androidx.emoji2.text.c.i
            public void b(androidx.emoji2.text.f fVar) {
                a.this.d(fVar);
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.b
        public void a() {
            try {
                this.f22948a.f22936f.a(new C0289a());
            } catch (Throwable th) {
                this.f22948a.n(th);
            }
        }

        @Override // androidx.emoji2.text.c.b
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f22945b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.c.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f22946c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f22948a.f22938h);
        }

        public void d(androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.f22948a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f22946c = fVar;
            androidx.emoji2.text.f fVar2 = this.f22946c;
            j jVar = this.f22948a.f22937g;
            e eVar = this.f22948a.f22944n;
            c cVar = this.f22948a;
            this.f22945b = new androidx.emoji2.text.d(fVar2, jVar, eVar, cVar.f22939i, cVar.f22940j, AbstractC5073d.a());
            this.f22948a.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f22948a;

        public b(c cVar) {
            this.f22948a = cVar;
        }

        public abstract void a();

        public abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        public abstract void c(EditorInfo editorInfo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0290c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f22949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f22950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f22953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set f22954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f22955g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22956h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22957i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public e f22958j = new androidx.emoji2.text.b();

        public AbstractC0290c(h hVar) {
            X0.h.h(hVar, "metadataLoader cannot be null.");
            this.f22949a = hVar;
        }

        public final h a() {
            return this.f22949a;
        }

        public AbstractC0290c b(int i10) {
            this.f22957i = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d implements j {
        @Override // androidx.emoji2.text.c.j
        public AbstractC5074e a(C5079j c5079j) {
            return new k(c5079j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f22959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f22960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22961c;

        public g(f fVar, int i10) {
            this(Arrays.asList((f) X0.h.h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f22959a.size();
            int i10 = 0;
            if (this.f22961c != 1) {
                while (i10 < size) {
                    ((f) this.f22959a.get(i10)).a(this.f22960b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) this.f22959a.get(i10)).b();
                    i10++;
                }
            }
        }

        public g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        public g(Collection collection, int i10, Throwable th) {
            X0.h.h(collection, "initCallbacks cannot be null");
            this.f22959a = new ArrayList(collection);
            this.f22961c = i10;
            this.f22960b = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface h {
        void a(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.f fVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface j {
        AbstractC5074e a(C5079j c5079j);
    }

    public c(AbstractC0290c abstractC0290c) {
        this.f22938h = abstractC0290c.f22951c;
        this.f22939i = abstractC0290c.f22952d;
        this.f22940j = abstractC0290c.f22953e;
        this.f22941k = abstractC0290c.f22955g;
        this.f22942l = abstractC0290c.f22956h;
        this.f22936f = abstractC0290c.f22949a;
        this.f22943m = abstractC0290c.f22957i;
        this.f22944n = abstractC0290c.f22958j;
        C2778b c2778b = new C2778b();
        this.f22932b = c2778b;
        j jVar = abstractC0290c.f22950b;
        this.f22937g = jVar == null ? new d() : jVar;
        Set set = abstractC0290c.f22954f;
        if (set != null && !set.isEmpty()) {
            c2778b.addAll(abstractC0290c.f22954f);
        }
        this.f22935e = new a(this);
        m();
    }

    public static c c() {
        c cVar;
        synchronized (f22928o) {
            cVar = f22930q;
            X0.h.j(cVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.d.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.d.c(editable, i10, keyEvent);
    }

    public static c h(AbstractC0290c abstractC0290c) {
        c cVar;
        c cVar2 = f22930q;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (f22928o) {
            try {
                cVar = f22930q;
                if (cVar == null) {
                    cVar = new c(abstractC0290c);
                    f22930q = cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static boolean i() {
        return f22930q != null;
    }

    public int d() {
        return this.f22942l;
    }

    public int e() {
        this.f22931a.readLock().lock();
        try {
            return this.f22933c;
        } finally {
            this.f22931a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f22941k;
    }

    public final boolean k() {
        return e() == 1;
    }

    public void l() {
        X0.h.j(this.f22943m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f22931a.writeLock().lock();
        try {
            if (this.f22933c == 0) {
                return;
            }
            this.f22933c = 0;
            this.f22931a.writeLock().unlock();
            this.f22935e.a();
        } finally {
            this.f22931a.writeLock().unlock();
        }
    }

    public final void m() {
        this.f22931a.writeLock().lock();
        try {
            if (this.f22943m == 0) {
                this.f22933c = 0;
            }
            this.f22931a.writeLock().unlock();
            if (e() == 0) {
                this.f22935e.a();
            }
        } catch (Throwable th) {
            this.f22931a.writeLock().unlock();
            throw th;
        }
    }

    public void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f22931a.writeLock().lock();
        try {
            this.f22933c = 2;
            arrayList.addAll(this.f22932b);
            this.f22932b.clear();
            this.f22931a.writeLock().unlock();
            this.f22934d.post(new g(arrayList, this.f22933c, th));
        } catch (Throwable th2) {
            this.f22931a.writeLock().unlock();
            throw th2;
        }
    }

    public void o() {
        ArrayList arrayList = new ArrayList();
        this.f22931a.writeLock().lock();
        try {
            this.f22933c = 1;
            arrayList.addAll(this.f22932b);
            this.f22932b.clear();
            this.f22931a.writeLock().unlock();
            this.f22934d.post(new g(arrayList, this.f22933c));
        } catch (Throwable th) {
            this.f22931a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        X0.h.j(k(), "Not initialized yet");
        X0.h.f(i10, "start cannot be negative");
        X0.h.f(i11, "end cannot be negative");
        X0.h.f(i12, "maxEmojiCount cannot be negative");
        X0.h.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        X0.h.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        X0.h.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f22938h : false;
        } else {
            z10 = true;
        }
        return this.f22935e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(f fVar) {
        X0.h.h(fVar, "initCallback cannot be null");
        this.f22931a.writeLock().lock();
        try {
            if (this.f22933c == 1 || this.f22933c == 2) {
                this.f22934d.post(new g(fVar, this.f22933c));
            } else {
                this.f22932b.add(fVar);
            }
            this.f22931a.writeLock().unlock();
        } catch (Throwable th) {
            this.f22931a.writeLock().unlock();
            throw th;
        }
    }

    public void u(f fVar) {
        X0.h.h(fVar, "initCallback cannot be null");
        this.f22931a.writeLock().lock();
        try {
            this.f22932b.remove(fVar);
        } finally {
            this.f22931a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f22935e.c(editorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f {
        public void b() {
        }

        public void a(Throwable th) {
        }
    }
}
