package w2;

import D1.t;
import G1.AbstractC0853a;
import G1.M;
import K7.AbstractC1081v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1081v f46135d;

    public n(String str, String str2, List list) {
        super(str);
        AbstractC0853a.a(!list.isEmpty());
        this.f46133b = str2;
        AbstractC1081v abstractC1081vV = AbstractC1081v.v(list);
        this.f46135d = abstractC1081vV;
        this.f46134c = (String) abstractC1081vV.get(0);
    }

    public static List d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // D1.u.a
    public void b(t.b bVar) {
        String str = this.f46121a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b10 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b10 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b10 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b10 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b10 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b10 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b10 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b10 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b10 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b10 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b10 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b10 = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = 22;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    bVar.P((CharSequence) this.f46135d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.U((CharSequence) this.f46135d.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = (String) this.f46135d.get(0);
                    bVar.h0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).g0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q((CharSequence) this.f46135d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O((CharSequence) this.f46135d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.V((CharSequence) this.f46135d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrH1 = M.h1((String) this.f46135d.get(0), "/");
                    bVar.s0(Integer.valueOf(Integer.parseInt(strArrH1[0]))).r0(strArrH1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrH1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.p0((CharSequence) this.f46135d.get(0));
                    break;
                case 8:
                case 16:
                    bVar.t0((CharSequence) this.f46135d.get(0));
                    break;
                case 9:
                case 22:
                    bVar.i0(Integer.valueOf(Integer.parseInt((String) this.f46135d.get(0))));
                    break;
                case 12:
                    Integer numP = N7.g.p((String) this.f46135d.get(0));
                    if (numP != null) {
                        String strA = j.a(numP.intValue());
                        if (strA != null) {
                            bVar.c0(strA);
                        }
                    } else {
                        bVar.c0((CharSequence) this.f46135d.get(0));
                    }
                    break;
                case 14:
                    List listD = d((String) this.f46135d.get(0));
                    int size = listD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.g0((Integer) listD.get(2));
                            }
                        }
                        bVar.h0((Integer) listD.get(1));
                    }
                    bVar.i0((Integer) listD.get(0));
                    break;
                case 15:
                    List listD2 = d((String) this.f46135d.get(0));
                    int size2 = listD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.j0((Integer) listD2.get(2));
                            }
                        }
                        bVar.k0((Integer) listD2.get(1));
                    }
                    bVar.l0((Integer) listD2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f46121a, nVar.f46121a) && Objects.equals(this.f46133b, nVar.f46133b) && this.f46135d.equals(nVar.f46135d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f46121a.hashCode()) * 31;
        String str = this.f46133b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f46135d.hashCode();
    }

    @Override // w2.i
    public String toString() {
        return this.f46121a + ": description=" + this.f46133b + ": values=" + this.f46135d;
    }
}
