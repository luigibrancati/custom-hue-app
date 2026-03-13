package x9;

import io.sentry.metrics.MetricsUnit;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import w9.AbstractC6171A;

/* JADX INFO: renamed from: x9.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6344p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final u9.w f48025A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final u9.w f48026B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final u9.x f48027C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final u9.w f48028D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final u9.x f48029E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final u9.w f48030F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final u9.x f48031G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final u9.w f48032H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final u9.x f48033I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final u9.w f48034J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final u9.x f48035K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final u9.w f48036L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final u9.x f48037M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final u9.w f48038N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final u9.x f48039O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final u9.w f48040P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final u9.x f48041Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final u9.w f48042R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final u9.x f48043S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final u9.w f48044T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final u9.x f48045U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final u9.w f48046V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final u9.x f48047W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final u9.x f48048X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u9.w f48049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u9.x f48050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u9.w f48051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u9.x f48052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u9.w f48053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u9.w f48054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u9.x f48055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u9.w f48056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u9.x f48057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u9.w f48058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u9.x f48059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u9.w f48060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u9.x f48061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u9.w f48062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u9.x f48063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u9.w f48064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u9.x f48065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u9.w f48066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u9.x f48067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u9.w f48068t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u9.w f48069u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u9.w f48070v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u9.w f48071w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u9.x f48072x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final u9.w f48073y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u9.w f48074z;

    /* JADX INFO: renamed from: x9.p$A */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class A extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean c(C9.a aVar) throws IOException {
            C9.b bVarC = aVar.C();
            if (bVarC != C9.b.NULL) {
                return bVarC == C9.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.nextString())) : Boolean.valueOf(aVar.nextBoolean());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Boolean bool) throws IOException {
            cVar.v0(bool);
        }
    }

    /* JADX INFO: renamed from: x9.p$B */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class B extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return Boolean.valueOf(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Boolean bool) throws IOException {
            cVar.C0(bool == null ? "null" : bool.toString());
        }
    }

    /* JADX INFO: renamed from: x9.p$C */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Number c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                throw new u9.q("Lossy conversion from " + iNextInt + " to byte; at path " + aVar.h());
            } catch (NumberFormatException e10) {
                throw new u9.q(e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                cVar.p0(number.byteValue());
            }
        }
    }

    /* JADX INFO: renamed from: x9.p$D */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class D extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Number c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                throw new u9.q("Lossy conversion from " + iNextInt + " to short; at path " + aVar.h());
            } catch (NumberFormatException e10) {
                throw new u9.q(e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                cVar.p0(number.shortValue());
            }
        }
    }

    /* JADX INFO: renamed from: x9.p$E */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class E extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Number c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(aVar.nextInt());
            } catch (NumberFormatException e10) {
                throw new u9.q(e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                cVar.p0(number.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: x9.p$F */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class F extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AtomicInteger c(C9.a aVar) {
            try {
                return new AtomicInteger(aVar.nextInt());
            } catch (NumberFormatException e10) {
                throw new u9.q(e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.p0(atomicInteger.get());
        }
    }

    /* JADX INFO: renamed from: x9.p$G */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class G extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean c(C9.a aVar) {
            return new AtomicBoolean(aVar.nextBoolean());
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.G0(atomicBoolean.get());
        }
    }

    /* JADX INFO: renamed from: x9.p$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C6345a extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray c(C9.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.beginArray();
            while (aVar.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.nextInt()));
                } catch (NumberFormatException e10) {
                    throw new u9.q(e10);
                }
            }
            aVar.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.d();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.p0(atomicIntegerArray.get(i10));
            }
            cVar.h();
        }
    }

    /* JADX INFO: renamed from: x9.p$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C6346b extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Number c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                return Long.valueOf(aVar.nextLong());
            } catch (NumberFormatException e10) {
                throw new u9.q(e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                cVar.p0(number.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: x9.p$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C6347c extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Number c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.x0(number);
        }
    }

    /* JADX INFO: renamed from: x9.p$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C6348d extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Number c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                cVar.k0(number.doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: x9.p$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C6349e extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Character c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            if (strNextString.length() == 1) {
                return Character.valueOf(strNextString.charAt(0));
            }
            throw new u9.q("Expecting character, got: " + strNextString + "; at " + aVar.h());
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Character ch) throws IOException {
            cVar.C0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* JADX INFO: renamed from: x9.p$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C6350f extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String c(C9.a aVar) throws IOException {
            C9.b bVarC = aVar.C();
            if (bVarC != C9.b.NULL) {
                return bVarC == C9.b.BOOLEAN ? Boolean.toString(aVar.nextBoolean()) : aVar.nextString();
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, String str) throws IOException {
            cVar.C0(str);
        }
    }

    /* JADX INFO: renamed from: x9.p$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C6351g extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigDecimal c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            try {
                return AbstractC6171A.b(strNextString);
            } catch (NumberFormatException e10) {
                throw new u9.q("Failed parsing '" + strNextString + "' as BigDecimal; at path " + aVar.h(), e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.x0(bigDecimal);
        }
    }

    /* JADX INFO: renamed from: x9.p$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigInteger c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            try {
                return AbstractC6171A.c(strNextString);
            } catch (NumberFormatException e10) {
                throw new u9.q("Failed parsing '" + strNextString + "' as BigInteger; at path " + aVar.h(), e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, BigInteger bigInteger) throws IOException {
            cVar.x0(bigInteger);
        }
    }

    /* JADX INFO: renamed from: x9.p$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public w9.y c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return new w9.y(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, w9.y yVar) throws IOException {
            cVar.x0(yVar);
        }
    }

    /* JADX INFO: renamed from: x9.p$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class j extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public StringBuilder c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return new StringBuilder(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, StringBuilder sb2) throws IOException {
            cVar.C0(sb2 == null ? null : sb2.toString());
        }
    }

    /* JADX INFO: renamed from: x9.p$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class k extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Class c(C9.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + w9.G.a("java-lang-class-unsupported"));
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + w9.G.a("java-lang-class-unsupported"));
        }
    }

    /* JADX INFO: renamed from: x9.p$l */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class l extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public StringBuffer c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return new StringBuffer(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.C0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: x9.p$m */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class m extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public URL c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            if (strNextString.equals("null")) {
                return null;
            }
            return new URL(strNextString);
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, URL url) throws IOException {
            cVar.C0(url == null ? null : url.toExternalForm());
        }
    }

    /* JADX INFO: renamed from: x9.p$n */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class n extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public URI c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            try {
                String strNextString = aVar.nextString();
                if (strNextString.equals("null")) {
                    return null;
                }
                return new URI(strNextString);
            } catch (URISyntaxException e10) {
                throw new u9.k(e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, URI uri) throws IOException {
            cVar.C0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* JADX INFO: renamed from: x9.p$o */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class o extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InetAddress c(C9.a aVar) throws IOException {
            if (aVar.C() != C9.b.NULL) {
                return InetAddress.getByName(aVar.nextString());
            }
            aVar.nextNull();
            return null;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, InetAddress inetAddress) throws IOException {
            cVar.C0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* JADX INFO: renamed from: x9.p$p, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0667p extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public UUID c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            String strNextString = aVar.nextString();
            try {
                return UUID.fromString(strNextString);
            } catch (IllegalArgumentException e10) {
                throw new u9.q("Failed parsing '" + strNextString + "' as UUID; at path " + aVar.h(), e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, UUID uuid) throws IOException {
            cVar.C0(uuid == null ? null : uuid.toString());
        }
    }

    /* JADX INFO: renamed from: x9.p$q */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class q extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Currency c(C9.a aVar) throws IOException {
            String strNextString = aVar.nextString();
            try {
                return Currency.getInstance(strNextString);
            } catch (IllegalArgumentException e10) {
                throw new u9.q("Failed parsing '" + strNextString + "' as Currency; at path " + aVar.h(), e10);
            }
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Currency currency) throws IOException {
            cVar.C0(currency.getCurrencyCode());
        }
    }

    /* JADX INFO: renamed from: x9.p$r */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class r extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Calendar c(C9.a aVar) throws IOException {
            int iNextInt;
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            aVar.beginObject();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.C() != C9.b.END_OBJECT) {
                String strNextName = aVar.nextName();
                iNextInt = aVar.nextInt();
                strNextName.getClass();
                switch (strNextName) {
                    case "dayOfMonth":
                        i12 = iNextInt;
                        break;
                    case "minute":
                        i14 = iNextInt;
                        break;
                    case "second":
                        i15 = iNextInt;
                        break;
                    case "year":
                        i10 = iNextInt;
                        break;
                    case "month":
                        i11 = iNextInt;
                        break;
                    case "hourOfDay":
                        i13 = iNextInt;
                        break;
                }
            }
            aVar.endObject();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.C();
                return;
            }
            cVar.f();
            cVar.q("year");
            cVar.p0(calendar.get(1));
            cVar.q("month");
            cVar.p0(calendar.get(2));
            cVar.q("dayOfMonth");
            cVar.p0(calendar.get(5));
            cVar.q("hourOfDay");
            cVar.p0(calendar.get(11));
            cVar.q(MetricsUnit.Duration.MINUTE);
            cVar.p0(calendar.get(12));
            cVar.q(MetricsUnit.Duration.SECOND);
            cVar.p0(calendar.get(13));
            cVar.i();
        }
    }

    /* JADX INFO: renamed from: x9.p$s */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class s extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Locale c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.nextString(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Locale locale) throws IOException {
            cVar.C0(locale == null ? null : locale.toString());
        }
    }

    /* JADX INFO: renamed from: x9.p$t */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class t implements u9.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B9.a f48075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u9.w f48076b;

        public t(B9.a aVar, u9.w wVar) {
            this.f48075a = aVar;
            this.f48076b = wVar;
        }

        @Override // u9.x
        public u9.w create(u9.e eVar, B9.a aVar) {
            if (aVar.equals(this.f48075a)) {
                return this.f48076b;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: x9.p$u */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class u implements u9.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f48077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u9.w f48078b;

        public u(Class cls, u9.w wVar) {
            this.f48077a = cls;
            this.f48078b = wVar;
        }

        @Override // u9.x
        public u9.w create(u9.e eVar, B9.a aVar) {
            if (aVar.c() == this.f48077a) {
                return this.f48078b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f48077a.getName() + ",adapter=" + this.f48078b + "]";
        }
    }

    /* JADX INFO: renamed from: x9.p$v */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class v extends u9.w {
        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BitSet c(C9.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.beginArray();
            C9.b bVarC = aVar.C();
            int i10 = 0;
            while (bVarC != C9.b.END_ARRAY) {
                int i11 = z.f48089a[bVarC.ordinal()];
                boolean zNextBoolean = true;
                if (i11 == 1 || i11 == 2) {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else if (iNextInt != 1) {
                        throw new u9.q("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + aVar.h());
                    }
                } else {
                    if (i11 != 3) {
                        throw new u9.q("Invalid bitset value type: " + bVarC + "; at path " + aVar.getPath());
                    }
                    zNextBoolean = aVar.nextBoolean();
                }
                if (zNextBoolean) {
                    bitSet.set(i10);
                }
                i10++;
                bVarC = aVar.C();
            }
            aVar.endArray();
            return bitSet;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, BitSet bitSet) throws IOException {
            cVar.d();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.p0(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.h();
        }
    }

    /* JADX INFO: renamed from: x9.p$w */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class w implements u9.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f48079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f48080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u9.w f48081c;

        public w(Class cls, Class cls2, u9.w wVar) {
            this.f48079a = cls;
            this.f48080b = cls2;
            this.f48081c = wVar;
        }

        @Override // u9.x
        public u9.w create(u9.e eVar, B9.a aVar) {
            Class clsC = aVar.c();
            if (clsC == this.f48079a || clsC == this.f48080b) {
                return this.f48081c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f48080b.getName() + "+" + this.f48079a.getName() + ",adapter=" + this.f48081c + "]";
        }
    }

    /* JADX INFO: renamed from: x9.p$x */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class x implements u9.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f48082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f48083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u9.w f48084c;

        public x(Class cls, Class cls2, u9.w wVar) {
            this.f48082a = cls;
            this.f48083b = cls2;
            this.f48084c = wVar;
        }

        @Override // u9.x
        public u9.w create(u9.e eVar, B9.a aVar) {
            Class clsC = aVar.c();
            if (clsC == this.f48082a || clsC == this.f48083b) {
                return this.f48084c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f48082a.getName() + "+" + this.f48083b.getName() + ",adapter=" + this.f48084c + "]";
        }
    }

    /* JADX INFO: renamed from: x9.p$y */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class y implements u9.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f48085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u9.w f48086b;

        /* JADX INFO: renamed from: x9.p$y$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends u9.w {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f48087a;

            public a(Class cls) {
                this.f48087a = cls;
            }

            @Override // u9.w
            public Object c(C9.a aVar) {
                Object objC = y.this.f48086b.c(aVar);
                if (objC == null || this.f48087a.isInstance(objC)) {
                    return objC;
                }
                throw new u9.q("Expected a " + this.f48087a.getName() + " but was " + objC.getClass().getName() + "; at path " + aVar.h());
            }

            @Override // u9.w
            public void e(C9.c cVar, Object obj) {
                y.this.f48086b.e(cVar, obj);
            }
        }

        public y(Class cls, u9.w wVar) {
            this.f48085a = cls;
            this.f48086b = wVar;
        }

        @Override // u9.x
        public u9.w create(u9.e eVar, B9.a aVar) {
            Class<?> clsC = aVar.c();
            if (this.f48085a.isAssignableFrom(clsC)) {
                return new a(clsC);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f48085a.getName() + ",adapter=" + this.f48086b + "]";
        }
    }

    /* JADX INFO: renamed from: x9.p$z */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48089a;

        static {
            int[] iArr = new int[C9.b.values().length];
            f48089a = iArr;
            try {
                iArr[C9.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48089a[C9.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48089a[C9.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        u9.w wVarB = new k().b();
        f48049a = wVarB;
        f48050b = c(Class.class, wVarB);
        u9.w wVarB2 = new v().b();
        f48051c = wVarB2;
        f48052d = c(BitSet.class, wVarB2);
        A a10 = new A();
        f48053e = a10;
        f48054f = new B();
        f48055g = b(Boolean.TYPE, Boolean.class, a10);
        C c10 = new C();
        f48056h = c10;
        f48057i = b(Byte.TYPE, Byte.class, c10);
        D d10 = new D();
        f48058j = d10;
        f48059k = b(Short.TYPE, Short.class, d10);
        E e10 = new E();
        f48060l = e10;
        f48061m = b(Integer.TYPE, Integer.class, e10);
        u9.w wVarB3 = new F().b();
        f48062n = wVarB3;
        f48063o = c(AtomicInteger.class, wVarB3);
        u9.w wVarB4 = new G().b();
        f48064p = wVarB4;
        f48065q = c(AtomicBoolean.class, wVarB4);
        u9.w wVarB5 = new C6345a().b();
        f48066r = wVarB5;
        f48067s = c(AtomicIntegerArray.class, wVarB5);
        f48068t = new C6346b();
        f48069u = new C6347c();
        f48070v = new C6348d();
        C6349e c6349e = new C6349e();
        f48071w = c6349e;
        f48072x = b(Character.TYPE, Character.class, c6349e);
        C6350f c6350f = new C6350f();
        f48073y = c6350f;
        f48074z = new C6351g();
        f48025A = new h();
        f48026B = new i();
        f48027C = c(String.class, c6350f);
        j jVar = new j();
        f48028D = jVar;
        f48029E = c(StringBuilder.class, jVar);
        l lVar = new l();
        f48030F = lVar;
        f48031G = c(StringBuffer.class, lVar);
        m mVar = new m();
        f48032H = mVar;
        f48033I = c(URL.class, mVar);
        n nVar = new n();
        f48034J = nVar;
        f48035K = c(URI.class, nVar);
        o oVar = new o();
        f48036L = oVar;
        f48037M = e(InetAddress.class, oVar);
        C0667p c0667p = new C0667p();
        f48038N = c0667p;
        f48039O = c(UUID.class, c0667p);
        u9.w wVarB6 = new q().b();
        f48040P = wVarB6;
        f48041Q = c(Currency.class, wVarB6);
        r rVar = new r();
        f48042R = rVar;
        f48043S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        f48044T = sVar;
        f48045U = c(Locale.class, sVar);
        C6334f c6334f = C6334f.f47956a;
        f48046V = c6334f;
        f48047W = e(u9.j.class, c6334f);
        f48048X = C6332d.f47948d;
    }

    public static u9.x a(B9.a aVar, u9.w wVar) {
        return new t(aVar, wVar);
    }

    public static u9.x b(Class cls, Class cls2, u9.w wVar) {
        return new w(cls, cls2, wVar);
    }

    public static u9.x c(Class cls, u9.w wVar) {
        return new u(cls, wVar);
    }

    public static u9.x d(Class cls, Class cls2, u9.w wVar) {
        return new x(cls, cls2, wVar);
    }

    public static u9.x e(Class cls, u9.w wVar) {
        return new y(cls, wVar);
    }
}
