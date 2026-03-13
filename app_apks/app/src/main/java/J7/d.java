package J7;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements o {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a extends d {
        @Override // J7.o
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f6284a;

        public b(char c10) {
            this.f6284a = c10;
        }

        @Override // J7.d
        public boolean e(char c10) {
            return c10 == this.f6284a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f6284a) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6285a;

        public c(String str) {
            this.f6285a = (String) n.j(str);
        }

        public final String toString() {
            return this.f6285a;
        }
    }

    /* JADX INFO: renamed from: J7.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0104d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f6286b = new C0104d();

        public C0104d() {
            super("CharMatcher.none()");
        }

        @Override // J7.d
        public int c(CharSequence charSequence, int i10) {
            n.l(i10, charSequence.length());
            return -1;
        }

        @Override // J7.d
        public boolean e(char c10) {
            return false;
        }
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0104d.f6286b;
    }

    public static String g(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        n.l(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
