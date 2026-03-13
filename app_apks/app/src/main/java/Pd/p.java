package Pd;

import Pd.g;
import com.fasterxml.jackson.core.JsonFactory;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface p {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f13311b;

        public a(String error, CharSequence input) {
            AbstractC4862t.e(error, "error");
            AbstractC4862t.e(input, "input");
            this.f13310a = error;
            this.f13311b = input;
        }

        @Override // Pd.p
        public g toInstant() {
            throw new h(this.f13310a + " when parsing an Instant from \"" + o.x(this.f13311b, 64) + JsonFactory.DEFAULT_QUOTE_CHAR);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13313b;

        public b(long j10, int i10) {
            this.f13312a = j10;
            this.f13313b = i10;
        }

        @Override // Pd.p
        public g toInstant() {
            long j10 = this.f13312a;
            g.a aVar = g.f13301c;
            if (j10 >= aVar.d().p() && this.f13312a <= aVar.c().p()) {
                return aVar.a(this.f13312a, this.f13313b);
            }
            throw new h("The parsed date is outside the range representable by Instant (Unix epoch second " + this.f13312a + ')');
        }
    }

    g toInstant();
}
