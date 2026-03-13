package qe;

import Od.C;
import Od.C1821a;
import Od.F;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4179C;
import gc.C4204q;
import gc.C4206t;
import gc.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4862t;
import pc.AbstractC5459c;
import pe.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final String a(char c10) {
        String string = Integer.toString(c10, C1821a.a(16));
        AbstractC4862t.d(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    public static final u.a b(u.a aVar, String name, String value) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        r(name);
        s(value, name);
        c(aVar, name, value);
        return aVar;
    }

    public static final u.a c(u.a aVar, String name, String value) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        aVar.f().add(name);
        aVar.f().add(F.e1(value).toString());
        return aVar;
    }

    public static final u d(u.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        return new u((String[]) aVar.f().toArray(new String[0]));
    }

    public static final boolean e(u uVar, Object obj) {
        AbstractC4862t.e(uVar, "<this>");
        return (obj instanceof u) && Arrays.equals(uVar.d(), ((u) obj).d());
    }

    public static final String f(u.a aVar, String name) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        int size = aVar.f().size() - 2;
        int iC = AbstractC5459c.c(size, 0, -2);
        if (iC > size) {
            return null;
        }
        while (!C.E(name, (String) aVar.f().get(size), true)) {
            if (size == iC) {
                return null;
            }
            size -= 2;
        }
        return (String) aVar.f().get(size + 1);
    }

    public static final int g(u uVar) {
        AbstractC4862t.e(uVar, "<this>");
        return Arrays.hashCode(uVar.d());
    }

    public static final String h(String[] namesAndValues, String name) {
        AbstractC4862t.e(namesAndValues, "namesAndValues");
        AbstractC4862t.e(name, "name");
        int length = namesAndValues.length - 2;
        int iC = AbstractC5459c.c(length, 0, -2);
        if (iC > length) {
            return null;
        }
        while (!C.E(name, namesAndValues[length], true)) {
            if (length == iC) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public static final u i(String... inputNamesAndValues) {
        AbstractC4862t.e(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i11] = F.e1(inputNamesAndValues[i11]).toString();
        }
        int iC = AbstractC5459c.c(0, strArr.length - 1, 2);
        if (iC >= 0) {
            while (true) {
                String str = strArr[i10];
                String str2 = strArr[i10 + 1];
                r(str);
                s(str2, str);
                if (i10 == iC) {
                    break;
                }
                i10 += 2;
            }
        }
        return new u(strArr);
    }

    public static final Iterator j(u uVar) {
        AbstractC4862t.e(uVar, "<this>");
        int size = uVar.size();
        C4034q[] c4034qArr = new C4034q[size];
        for (int i10 = 0; i10 < size; i10++) {
            c4034qArr[i10] = AbstractC4040w.a(uVar.e(i10), uVar.h(i10));
        }
        return AbstractC4846c.a(c4034qArr);
    }

    public static final String k(u uVar, int i10) {
        AbstractC4862t.e(uVar, "<this>");
        String str = (String) C4204q.d0(uVar.d(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public static final u.a l(u uVar) {
        AbstractC4862t.e(uVar, "<this>");
        u.a aVar = new u.a();
        y.D(aVar.f(), uVar.d());
        return aVar;
    }

    public static final u.a m(u.a aVar, String name) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        int i10 = 0;
        while (i10 < aVar.f().size()) {
            if (C.E(name, (String) aVar.f().get(i10), true)) {
                aVar.f().remove(i10);
                aVar.f().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return aVar;
    }

    public static final u.a n(u.a aVar, String name, String value) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        r(name);
        s(value, name);
        aVar.g(name);
        c(aVar, name, value);
        return aVar;
    }

    public static final String o(u uVar) {
        AbstractC4862t.e(uVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = uVar.e(i10);
            String strH = uVar.h(i10);
            sb2.append(strE);
            sb2.append(": ");
            if (m.A(strE)) {
                strH = "██";
            }
            sb2.append(strH);
            sb2.append("\n");
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public static final String p(u uVar, int i10) {
        AbstractC4862t.e(uVar, "<this>");
        String str = (String) C4204q.d0(uVar.d(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public static final List q(u uVar, String name) {
        AbstractC4862t.e(uVar, "<this>");
        AbstractC4862t.e(name, "name");
        int size = uVar.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (C.E(name, uVar.e(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(uVar.h(i10));
            }
        }
        List listV0 = arrayList != null ? C4179C.V0(arrayList) : null;
        return listV0 == null ? C4206t.k() : listV0;
    }

    public static final void r(String name) {
        AbstractC4862t.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + a(cCharAt) + " at " + i10 + " in header name: " + name).toString());
            }
        }
    }

    public static final void s(String value, String name) {
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected char 0x");
                sb2.append(a(cCharAt));
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(m.A(name) ? "" : ": " + value);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
