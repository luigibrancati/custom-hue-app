package androidx.emoji2.text;

import U0.m;
import X0.h;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import n1.AbstractC5077h;
import n1.C5079j;
import o1.C5193b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5193b f22991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f22992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f22993c = new a(RecognitionOptions.UPC_E);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f22994d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray f22995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C5079j f22996b;

        public a() {
            this(1);
        }

        public a a(int i10) {
            SparseArray sparseArray = this.f22995a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        public final C5079j b() {
            return this.f22996b;
        }

        public void c(C5079j c5079j, int i10, int i11) {
            a aVarA = a(c5079j.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f22995a.put(c5079j.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(c5079j, i10 + 1, i11);
            } else {
                aVarA.f22996b = c5079j;
            }
        }

        public a(int i10) {
            this.f22995a = new SparseArray(i10);
        }
    }

    public f(Typeface typeface, C5193b c5193b) {
        this.f22994d = typeface;
        this.f22991a = c5193b;
        this.f22992b = new char[c5193b.k() * 2];
        a(c5193b);
    }

    public static f b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            m.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, AbstractC5077h.b(byteBuffer));
        } finally {
            m.b();
        }
    }

    public final void a(C5193b c5193b) {
        int iK = c5193b.k();
        for (int i10 = 0; i10 < iK; i10++) {
            C5079j c5079j = new C5079j(this, i10);
            Character.toChars(c5079j.f(), this.f22992b, i10 * 2);
            h(c5079j);
        }
    }

    public char[] c() {
        return this.f22992b;
    }

    public C5193b d() {
        return this.f22991a;
    }

    public int e() {
        return this.f22991a.l();
    }

    public a f() {
        return this.f22993c;
    }

    public Typeface g() {
        return this.f22994d;
    }

    public void h(C5079j c5079j) {
        h.h(c5079j, "emoji metadata cannot be null");
        h.b(c5079j.c() > 0, "invalid metadata codepoint length");
        this.f22993c.c(c5079j, 0, c5079j.c() - 1);
    }
}
