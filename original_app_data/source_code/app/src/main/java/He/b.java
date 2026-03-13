package He;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum b implements a {
    UNKNOWN(new String[0]),
    BMP("bmp", "dib"),
    DCX("dcx"),
    GIF("gif"),
    ICNS("icns"),
    ICO("ico"),
    JBIG2(new String[0]),
    JPEG("jpg", "jpeg"),
    PAM("pam"),
    PSD("psd"),
    PBM("pbm"),
    PGM("pgm"),
    PNM("pnm"),
    PPM("ppm"),
    PCX("pcx", "pcc"),
    PNG("png"),
    RGBE("hdr", "pic"),
    TGA(new String[0]),
    TIFF("tif", "tiff"),
    WBMP("wbmp"),
    XBM("xbm"),
    XPM("xpm");

    private final String[] extensions;

    b(String... strArr) {
        this.extensions = strArr;
    }

    @Override // He.a
    public String a() {
        String[] strArr = this.extensions;
        if (strArr != null) {
            return strArr[0];
        }
        return null;
    }

    public String[] b() {
        return (String[]) this.extensions.clone();
    }
}
