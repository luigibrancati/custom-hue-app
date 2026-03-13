package Od;

import gc.C4205s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12459b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f12460a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        public final String c(String literal) {
            AbstractC4862t.e(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            AbstractC4862t.d(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class b extends AbstractC4860q implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12461a = new b();

        public b() {
            super(1, k.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final k invoke(k p02) {
            AbstractC4862t.e(p02, "p0");
            return p02.next();
        }
    }

    public o(Pattern nativePattern) {
        AbstractC4862t.e(nativePattern, "nativePattern");
        this.f12460a = nativePattern;
    }

    public static /* synthetic */ k d(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.c(charSequence, i10);
    }

    public static /* synthetic */ Nd.h f(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.e(charSequence, i10);
    }

    public static final k g(o oVar, CharSequence charSequence, int i10) {
        return oVar.c(charSequence, i10);
    }

    public final boolean b(CharSequence input) {
        AbstractC4862t.e(input, "input");
        return this.f12460a.matcher(input).find();
    }

    public final k c(CharSequence input, int i10) {
        AbstractC4862t.e(input, "input");
        Matcher matcher = this.f12460a.matcher(input);
        AbstractC4862t.d(matcher, "matcher(...)");
        return p.e(matcher, i10, input);
    }

    public final Nd.h e(final CharSequence input, final int i10) {
        AbstractC4862t.e(input, "input");
        if (i10 >= 0 && i10 <= input.length()) {
            return Nd.q.p(new InterfaceC6082a() { // from class: Od.n
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return o.g(this.f12456a, input, i10);
                }
            }, b.f12461a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + input.length());
    }

    public final k h(CharSequence input) {
        AbstractC4862t.e(input, "input");
        Matcher matcher = this.f12460a.matcher(input);
        AbstractC4862t.d(matcher, "matcher(...)");
        return p.f(matcher, input);
    }

    public final boolean i(CharSequence input) {
        AbstractC4862t.e(input, "input");
        return this.f12460a.matcher(input).matches();
    }

    public final String j(CharSequence input, String replacement) {
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(replacement, "replacement");
        String strReplaceAll = this.f12460a.matcher(input).replaceAll(replacement);
        AbstractC4862t.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String k(CharSequence input, vc.l transform) {
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(transform, "transform");
        int iIntValue = 0;
        k kVarD = d(this, input, 0, 2, null);
        if (kVarD == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, kVarD.c().n().intValue());
            sb2.append((CharSequence) transform.invoke(kVarD));
            iIntValue = kVarD.c().l().intValue() + 1;
            kVarD = kVarD.next();
            if (iIntValue >= length) {
                break;
            }
        } while (kVarD != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public final String l(CharSequence input, String replacement) {
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(replacement, "replacement");
        String strReplaceFirst = this.f12460a.matcher(input).replaceFirst(replacement);
        AbstractC4862t.d(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List m(CharSequence input, int i10) {
        AbstractC4862t.e(input, "input");
        F.D0(i10);
        Matcher matcher = this.f12460a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return C4205s.d(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? Bc.k.h(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f12460a.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String pattern) {
        AbstractC4862t.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC4862t.d(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String pattern, q option) {
        AbstractC4862t.e(pattern, "pattern");
        AbstractC4862t.e(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f12459b.b(option.b()));
        AbstractC4862t.d(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
