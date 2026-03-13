package Od;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Od.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C1826f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f12414d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1826f f12415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1826f f12416f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f12419c;

    /* JADX INFO: renamed from: Od.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C0163a f12420j = new C0163a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f12421k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f12424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f12425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f12426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f12427f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f12428g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f12429h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f12430i;

        /* JADX INFO: renamed from: Od.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0163a {
            public /* synthetic */ C0163a(AbstractC4854k abstractC4854k) {
                this();
            }

            public final a a() {
                return a.f12421k;
            }

            public C0163a() {
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            AbstractC4862t.e(groupSeparator, "groupSeparator");
            AbstractC4862t.e(byteSeparator, "byteSeparator");
            AbstractC4862t.e(bytePrefix, "bytePrefix");
            AbstractC4862t.e(byteSuffix, "byteSuffix");
            this.f12422a = i10;
            this.f12423b = i11;
            this.f12424c = groupSeparator;
            this.f12425d = byteSeparator;
            this.f12426e = bytePrefix;
            this.f12427f = byteSuffix;
            this.f12428g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f12429h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f12430i = AbstractC1827g.b(groupSeparator) || AbstractC1827g.b(byteSeparator) || AbstractC1827g.b(bytePrefix) || AbstractC1827g.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            AbstractC4862t.e(sb2, "sb");
            AbstractC4862t.e(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f12422a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f12423b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f12424c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f12425d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f12426e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f12427f);
            sb2.append("\"");
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: Od.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C1826f a() {
            return C1826f.f12415e;
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: Od.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f12431h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f12432i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f12435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f12436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f12437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f12438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f12439g;

        /* JADX INFO: renamed from: Od.f$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public final c a() {
                return c.f12432i;
            }

            public a() {
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            AbstractC4862t.e(prefix, "prefix");
            AbstractC4862t.e(suffix, "suffix");
            this.f12433a = prefix;
            this.f12434b = suffix;
            this.f12435c = z10;
            this.f12436d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f12437e = z11;
            this.f12438f = z11 && i10 == 1;
            this.f12439g = AbstractC1827g.b(prefix) || AbstractC1827g.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            AbstractC4862t.e(sb2, "sb");
            AbstractC4862t.e(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f12433a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f12434b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f12435c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f12436d);
            return sb2;
        }

        public final boolean c() {
            return this.f12439g;
        }

        public final String d() {
            return this.f12433a;
        }

        public final String e() {
            return this.f12434b;
        }

        public final boolean f() {
            return this.f12437e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C0163a c0163a = a.f12420j;
        a aVarA = c0163a.a();
        c.a aVar = c.f12431h;
        f12415e = new C1826f(false, aVarA, aVar.a());
        f12416f = new C1826f(true, c0163a.a(), aVar.a());
    }

    public C1826f(boolean z10, a bytes, c number) {
        AbstractC4862t.e(bytes, "bytes");
        AbstractC4862t.e(number, "number");
        this.f12417a = z10;
        this.f12418b = bytes;
        this.f12419c = number;
    }

    public final c b() {
        return this.f12419c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f12417a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f12418b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f12419c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
