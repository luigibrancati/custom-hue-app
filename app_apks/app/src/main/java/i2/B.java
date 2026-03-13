package i2;

import D1.u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f36833c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36834a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36835b = -1;

    public boolean a() {
        return (this.f36834a == -1 || this.f36835b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f36833c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) G1.M.i(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) G1.M.i(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f36834a = i10;
            this.f36835b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(D1.u uVar) {
        for (int i10 = 0; i10 < uVar.e(); i10++) {
            u.a aVarD = uVar.d(i10);
            if (aVarD instanceof w2.e) {
                w2.e eVar = (w2.e) aVarD;
                if ("iTunSMPB".equals(eVar.f46110c) && b(eVar.f46111d)) {
                    return true;
                }
            } else if (aVarD instanceof w2.k) {
                w2.k kVar = (w2.k) aVarD;
                if ("com.apple.iTunes".equals(kVar.f46123b) && "iTunSMPB".equals(kVar.f46124c) && b(kVar.f46125d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
