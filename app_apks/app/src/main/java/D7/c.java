package D7;

import B7.c0;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f2297c = new c0("LocalTestingConfigParser");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f2298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f2299b = i.c();

    public c(XmlPullParser xmlPullParser) {
        this.f2298a = xmlPullParser;
    }

    public static i a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return i.f2307a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                final c cVar = new c(xmlPullParserNewPullParser);
                cVar.e("local-testing-config", new m() { // from class: D7.l
                    @Override // D7.m
                    public final void zza() throws XmlPullParserException, IOException {
                        this.f2310a.d();
                    }
                });
                i iVarE = cVar.f2299b.e();
                fileReader.close();
                return iVarE;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e10) {
            f2297c.d("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e10.getMessage());
            return i.f2307a;
        }
    }

    public static /* synthetic */ void b(final c cVar) throws XmlPullParserException, IOException {
        for (int i10 = 0; i10 < cVar.f2298a.getAttributeCount(); i10++) {
            if ("defaultErrorCode".equals(cVar.f2298a.getAttributeName(i10))) {
                cVar.f2299b.a(C7.a.a(cVar.f2298a.getAttributeValue(i10)));
            }
        }
        cVar.e("split-install-error", new m() { // from class: D7.j
            @Override // D7.m
            public final void zza() throws XmlPullParserException {
                c.c(this.f2308a);
            }
        });
    }

    public static /* synthetic */ void c(c cVar) throws XmlPullParserException {
        String attributeValue = null;
        String attributeValue2 = null;
        for (int i10 = 0; i10 < cVar.f2298a.getAttributeCount(); i10++) {
            if ("module".equals(cVar.f2298a.getAttributeName(i10))) {
                attributeValue = cVar.f2298a.getAttributeValue(i10);
            }
            if ("errorCode".equals(cVar.f2298a.getAttributeName(i10))) {
                attributeValue2 = cVar.f2298a.getAttributeValue(i10);
            }
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), cVar.f2298a, null);
        }
        cVar.f2299b.d().put(attributeValue, Integer.valueOf(C7.a.a(attributeValue2)));
        while (cVar.f2298a.next() != 3) {
        }
    }

    public final /* synthetic */ void d() throws XmlPullParserException, IOException {
        e("split-install-errors", new m() { // from class: D7.k
            @Override // D7.m
            public final void zza() throws XmlPullParserException, IOException {
                c.b(this.f2309a);
            }
        });
    }

    public final void e(String str, m mVar) throws XmlPullParserException, IOException {
        while (true) {
            int next = this.f2298a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.f2298a.getEventType() == 2) {
                if (!this.f2298a.getName().equals(str)) {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.f2298a.getName()), this.f2298a, null);
                }
                mVar.zza();
            }
        }
    }
}
