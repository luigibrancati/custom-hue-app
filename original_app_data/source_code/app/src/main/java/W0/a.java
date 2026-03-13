package W0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f17633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f17635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f17636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f17637h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f17640c;

    /* JADX INFO: renamed from: W0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0234a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f17643c;

        public C0234a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z10) {
            return z10 ? a.f17637h : a.f17636g;
        }

        public a a() {
            return (this.f17642b == 2 && this.f17643c == a.f17633d) ? b(this.f17641a) : new a(this.f17641a, this.f17642b, this.f17643c);
        }

        public final void c(boolean z10) {
            this.f17641a = z10;
            this.f17643c = a.f17633d;
            this.f17642b = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f17644f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f17645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public char f17649e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f17644f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f17645a = charSequence;
            this.f17646b = z10;
            this.f17647c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f17644f[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char cCharAt = this.f17645a.charAt(this.f17648d - 1);
            this.f17649e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f17645a, this.f17648d);
                this.f17648d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f17648d--;
            byte bC = c(this.f17649e);
            if (this.f17646b) {
                char c10 = this.f17649e;
                if (c10 == '>') {
                    return h();
                }
                if (c10 == ';') {
                    return f();
                }
            }
            return bC;
        }

        public byte b() {
            char cCharAt = this.f17645a.charAt(this.f17648d);
            this.f17649e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f17645a, this.f17648d);
                this.f17648d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f17648d++;
            byte bC = c(this.f17649e);
            if (this.f17646b) {
                char c10 = this.f17649e;
                if (c10 == '<') {
                    return i();
                }
                if (c10 == '&') {
                    return g();
                }
            }
            return bC;
        }

        public int d() {
            this.f17648d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f17648d < this.f17647c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f17648d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f17648d = this.f17647c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f17648d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char cCharAt;
            int i10 = this.f17648d;
            do {
                int i11 = this.f17648d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f17645a;
                int i12 = i11 - 1;
                this.f17648d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f17649e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f17648d = i10;
            this.f17649e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i10 = this.f17648d;
                if (i10 >= this.f17647c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f17645a;
                this.f17648d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f17649e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char cCharAt;
            int i10 = this.f17648d;
            while (true) {
                int i11 = this.f17648d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f17645a;
                int i12 = i11 - 1;
                this.f17648d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f17649e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f17648d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f17645a;
                            int i14 = i13 - 1;
                            this.f17648d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f17649e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f17648d = i10;
            this.f17649e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char cCharAt;
            int i10 = this.f17648d;
            while (true) {
                int i11 = this.f17648d;
                if (i11 >= this.f17647c) {
                    this.f17648d = i10;
                    this.f17649e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f17645a;
                this.f17648d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f17649e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f17648d;
                        if (i12 < this.f17647c) {
                            CharSequence charSequence2 = this.f17645a;
                            this.f17648d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f17649e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        c cVar = d.f17657c;
        f17633d = cVar;
        f17634e = Character.toString((char) 8206);
        f17635f = Character.toString((char) 8207);
        f17636g = new a(false, 2, cVar);
        f17637h = new a(true, 2, cVar);
    }

    public a(boolean z10, int i10, c cVar) {
        this.f17638a = z10;
        this.f17639b = i10;
        this.f17640c = cVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0234a().a();
    }

    public static boolean e(Locale locale) {
        return e.a(locale) == 1;
    }

    public boolean d() {
        return (this.f17639b & 2) != 0;
    }

    public final String f(CharSequence charSequence, c cVar) {
        boolean zIsRtl = cVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f17638a || !(zIsRtl || b(charSequence) == 1)) ? this.f17638a ? (!zIsRtl || b(charSequence) == -1) ? f17635f : "" : "" : f17634e;
    }

    public final String g(CharSequence charSequence, c cVar) {
        boolean zIsRtl = cVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f17638a || !(zIsRtl || a(charSequence) == 1)) ? this.f17638a ? (!zIsRtl || a(charSequence) == -1) ? f17635f : "" : "" : f17634e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f17640c, true);
    }

    public CharSequence i(CharSequence charSequence, c cVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = cVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? d.f17656b : d.f17655a));
        }
        if (zIsRtl != this.f17638a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? d.f17656b : d.f17655a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f17640c, true);
    }

    public String k(String str, c cVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, cVar, z10).toString();
    }
}
