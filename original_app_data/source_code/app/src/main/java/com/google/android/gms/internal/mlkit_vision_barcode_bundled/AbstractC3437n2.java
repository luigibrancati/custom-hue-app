package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3437n2 {
    public static String a(G0 g02) {
        StringBuilder sb2 = new StringBuilder(g02.f());
        for (int i10 = 0; i10 < g02.f(); i10++) {
            byte bC = g02.c(i10);
            if (bC == 34) {
                sb2.append("\\\"");
            } else if (bC == 39) {
                sb2.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bC >>> 6) & 3) + 48));
                            sb2.append((char) (((bC >>> 3) & 7) + 48));
                            sb2.append((char) ((bC & 7) + 48));
                        } else {
                            sb2.append((char) bC);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
