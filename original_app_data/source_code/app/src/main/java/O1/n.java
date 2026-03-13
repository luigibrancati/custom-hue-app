package O1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10855c;

    public n(List list, List list2, List list3) {
        this.f10853a = list;
        this.f10854b = list2;
        this.f10855c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    public static void c(String str, List list, List list2, List list3) {
        String strSubstring;
        list.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(length));
                length = str.length();
            } else if (iIndexOf != length) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                list.set(list2.size(), ((String) list.get(list2.size())) + "$");
                length += 2;
            } else {
                list3.add("");
                int i10 = length + 1;
                int iIndexOf2 = str.indexOf("$", i10);
                String strSubstring2 = str.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring + "d";
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, strSubstring);
                }
                list.add("");
                length = iIndexOf2 + 1;
            }
        }
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f10854b.size(); i11++) {
            sb2.append((String) this.f10853a.get(i11));
            if (((Integer) this.f10854b.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) this.f10854b.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) this.f10855c.get(i11), Long.valueOf(j10)));
            } else if (((Integer) this.f10854b.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) this.f10855c.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) this.f10854b.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) this.f10855c.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append((String) this.f10853a.get(this.f10854b.size()));
        return sb2.toString();
    }
}
