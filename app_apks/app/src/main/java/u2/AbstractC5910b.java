package u2;

import D1.t;
import D1.u;
import J7.c;
import N7.g;

/* JADX INFO: renamed from: u2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5910b implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45054b;

    public AbstractC5910b(String str, String str2) {
        this.f45053a = c.f(str);
        this.f45054b = str2;
    }

    @Override // D1.u.a
    public void b(t.b bVar) {
        String str = this.f45053a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numP = g.p(this.f45054b);
                if (numP != null) {
                    bVar.r0(numP);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numP2 = g.p(this.f45054b);
                if (numP2 != null) {
                    bVar.q0(numP2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numP3 = g.p(this.f45054b);
                if (numP3 != null) {
                    bVar.s0(numP3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f45054b);
                break;
            case "GENRE":
                bVar.c0(this.f45054b);
                break;
            case "TITLE":
                bVar.p0(this.f45054b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f45054b);
                break;
            case "DISCNUMBER":
                Integer numP4 = g.p(this.f45054b);
                if (numP4 != null) {
                    bVar.X(numP4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f45054b);
                break;
            case "ARTIST":
                bVar.Q(this.f45054b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC5910b abstractC5910b = (AbstractC5910b) obj;
            if (this.f45053a.equals(abstractC5910b.f45053a) && this.f45054b.equals(abstractC5910b.f45054b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f45053a.hashCode()) * 31) + this.f45054b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f45053a + "=" + this.f45054b;
    }
}
