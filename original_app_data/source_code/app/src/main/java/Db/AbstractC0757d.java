package Db;

import Db.InterfaceC0756c;
import io.sentry.SentryEnvelopeItemHeader;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: Db.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0757d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2459a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f2461c;

    /* JADX INFO: renamed from: Db.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0756c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f2463b;

        public final boolean a(b bVar) {
            return this.f2462a == bVar.f2462a && Objects.equals(this.f2463b, bVar.f2463b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f2462a) + 177573;
            return iHashCode + (iHashCode << 5) + Objects.hashCode(this.f2463b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ByteRange{");
            sb2.append("length=");
            sb2.append(this.f2462a);
            if (this.f2463b != null) {
                sb2.append(", ");
                sb2.append("offset=");
                sb2.append(this.f2463b);
            }
            sb2.append("}");
            return sb2.toString();
        }

        public b(AbstractC0757d abstractC0757d) {
            this.f2462a = abstractC0757d.f2460b;
            this.f2463b = abstractC0757d.f2461c;
        }
    }

    public AbstractC0757d() {
        if (!(this instanceof InterfaceC0756c.a)) {
            throw new UnsupportedOperationException("Use: new ByteRange.Builder()");
        }
    }

    public InterfaceC0756c c() {
        if (this.f2459a == 0) {
            return new b();
        }
        throw new IllegalStateException(d());
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2459a & 1) != 0) {
            arrayList.add(SentryEnvelopeItemHeader.JsonKeys.LENGTH);
        }
        return "Cannot build ByteRange, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0756c.a e(long j10) {
        this.f2460b = j10;
        this.f2459a &= -2;
        return (InterfaceC0756c.a) this;
    }

    public InterfaceC0756c.a f(long j10) {
        this.f2461c = Long.valueOf(j10);
        return (InterfaceC0756c.a) this;
    }
}
