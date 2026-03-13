package W0;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0.c f17655a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W0.c f17656b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W0.c f17657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W0.c f17658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W0.c f17659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W0.c f17660f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f17661b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f17662a;

        public a(boolean z10) {
            this.f17662a = z10;
        }

        @Override // W0.d.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = d.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f17662a) {
                        return 1;
                    }
                } else if (this.f17662a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f17662a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17663a = new b();

        @Override // W0.d.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = d.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX INFO: renamed from: W0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0235d implements W0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f17664a;

        public AbstractC0235d(c cVar) {
            this.f17664a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f17664a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        @Override // W0.c
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f17664a == null ? a() : b(charSequence, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends AbstractC0235d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17665b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f17665b = z10;
        }

        @Override // W0.d.AbstractC0235d
        public boolean a() {
            return this.f17665b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f extends AbstractC0235d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f17666b = new f();

        public f() {
            super(null);
        }

        @Override // W0.d.AbstractC0235d
        public boolean a() {
            return W0.e.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f17663a;
        f17657c = new e(bVar, false);
        f17658d = new e(bVar, true);
        f17659e = new e(a.f17661b, false);
        f17660f = f.f17666b;
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
