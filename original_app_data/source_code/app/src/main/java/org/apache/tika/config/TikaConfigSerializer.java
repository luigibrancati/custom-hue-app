package org.apache.tika.config;

import af.e;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.protocol.Message;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.tika.detect.CompositeDetector;
import org.apache.tika.detect.CompositeEncodingDetector;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.detect.EncodingDetector;
import org.apache.tika.exception.TikaException;
import org.apache.tika.language.translate.DefaultTranslator;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TikaConfigSerializer {
    private static final af.c LOG = e.l(TikaConfigSerializer.class);
    private static Map<Class, String> PRIMITIVES;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class MethodTuple {
        Method method;
        String name;
        Class singleParam;

        public MethodTuple(String str, Method method, Class cls) {
            this.name = str;
            this.method = method;
            this.singleParam = cls;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MethodTuple methodTuple = (MethodTuple) obj;
                if (this.name.equals(methodTuple.name) && this.method.equals(methodTuple.method) && this.singleParam.equals(methodTuple.singleParam)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.name, this.method, this.singleParam);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class MethodTuples {
        Map<String, Set<MethodTuple>> tuples;

        public void add(MethodTuple methodTuple) {
            Set<MethodTuple> hashSet = this.tuples.get(methodTuple.name);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.tuples.put(methodTuple.name, hashSet);
            }
            hashSet.add(methodTuple);
        }

        public int getSize() {
            return this.tuples.size();
        }

        private MethodTuples() {
            this.tuples = new TreeMap();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Mode {
        MINIMAL,
        CURRENT,
        STATIC,
        STATIC_FULL
    }

    static {
        HashMap map = new HashMap();
        PRIMITIVES = map;
        map.put(Integer.class, "int");
        PRIMITIVES.put(Integer.TYPE, "int");
        PRIMITIVES.put(String.class, "string");
        PRIMITIVES.put(Boolean.class, "bool");
        PRIMITIVES.put(Boolean.TYPE, "bool");
        PRIMITIVES.put(Float.class, "float");
        PRIMITIVES.put(Float.TYPE, "float");
        PRIMITIVES.put(Double.class, "double");
        PRIMITIVES.put(Double.TYPE, "double");
        PRIMITIVES.put(Long.class, "long");
        PRIMITIVES.put(Long.TYPE, "long");
        PRIMITIVES.put(Map.class, "map");
        PRIMITIVES.put(List.class, "list");
    }

    private static void addDetectors(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        Detector detector = tikaConfig.getDetector();
        if (mode == Mode.MINIMAL && (detector instanceof DefaultDetector)) {
            element.appendChild(document.createComment("for example: <detectors><detector class=\"org.apache.tika.detector.MimeTypes\"></detectors>"));
            return;
        }
        Element elementCreateElement = document.createElement("detectors");
        if (!(mode == Mode.CURRENT && (detector instanceof DefaultDetector)) && (detector instanceof CompositeDetector)) {
            for (Detector detector2 : ((CompositeDetector) detector).getDetectors()) {
                Element elementCreateElement2 = document.createElement("detector");
                elementCreateElement2.setAttribute(Constants.CLASS, detector2.getClass().getCanonicalName());
                serializeParams(document, elementCreateElement2, detector2);
                elementCreateElement.appendChild(elementCreateElement2);
            }
        } else {
            Element elementCreateElement3 = document.createElement("detector");
            elementCreateElement3.setAttribute(Constants.CLASS, detector.getClass().getCanonicalName());
            elementCreateElement.appendChild(elementCreateElement3);
        }
        element.appendChild(elementCreateElement);
    }

    private static void addEncodingDetectors(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        EncodingDetector encodingDetector = tikaConfig.getEncodingDetector();
        if (mode == Mode.MINIMAL && (encodingDetector instanceof DefaultEncodingDetector)) {
            element.appendChild(document.createComment("for example: <encodingDetectors><encodingDetector class=\"org.apache.tika.detect.DefaultEncodingDetector\"></encodingDetectors>"));
            return;
        }
        Element elementCreateElement = document.createElement("encodingDetectors");
        if (!(mode == Mode.CURRENT && (encodingDetector instanceof DefaultEncodingDetector)) && (encodingDetector instanceof CompositeEncodingDetector)) {
            for (EncodingDetector encodingDetector2 : ((CompositeEncodingDetector) encodingDetector).getDetectors()) {
                Element elementCreateElement2 = document.createElement("encodingDetector");
                elementCreateElement2.setAttribute(Constants.CLASS, encodingDetector2.getClass().getCanonicalName());
                serializeParams(document, elementCreateElement2, encodingDetector2);
                elementCreateElement.appendChild(elementCreateElement2);
            }
        } else {
            Element elementCreateElement3 = document.createElement("encodingDetector");
            elementCreateElement3.setAttribute(Constants.CLASS, encodingDetector.getClass().getCanonicalName());
            elementCreateElement.appendChild(elementCreateElement3);
        }
        element.appendChild(elementCreateElement);
    }

    private static void addExecutorService(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        tikaConfig.getExecutorService();
    }

    private static void addList(Element element, Document document, MethodTuple methodTuple, List<String> list) {
        for (String str : list) {
            Element elementCreateElement = document.createElement("string");
            elementCreateElement.setTextContent(str);
            element.appendChild(elementCreateElement);
        }
    }

    private static void addMap(Element element, Document document, MethodTuple methodTuple, Map<String, String> map) {
        for (Map.Entry entry : new TreeMap(map).entrySet()) {
            Element elementCreateElement = document.createElement("string");
            elementCreateElement.setAttribute("key", (String) entry.getKey());
            elementCreateElement.setAttribute("value", (String) entry.getValue());
            element.appendChild(elementCreateElement);
        }
    }

    private static void addMimeComment(Mode mode, Element element, Document document) {
        element.appendChild(document.createComment("for example: <mimeTypeRepository resource=\"/org/apache/tika/mime/tika-mimetypes.xml\"/>"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void addParser(org.apache.tika.config.TikaConfigSerializer.Mode r6, org.w3c.dom.Element r7, org.w3c.dom.Document r8, org.apache.tika.parser.Parser r9) {
        /*
            boolean r0 = r9 instanceof org.apache.tika.parser.ParserDecorator
            if (r0 == 0) goto L33
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class<org.apache.tika.parser.ParserDecorator> r1 = org.apache.tika.parser.ParserDecorator.class
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "$"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L33
            org.apache.tika.parser.ParserDecorator r9 = (org.apache.tika.parser.ParserDecorator) r9
            org.apache.tika.parser.Parser r0 = r9.getWrappedParser()
            r5 = r0
            r0 = r9
            r9 = r5
            goto L34
        L33:
            r0 = 0
        L34:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            org.apache.tika.config.TikaConfigSerializer$Mode r2 = org.apache.tika.config.TikaConfigSerializer.Mode.CURRENT
            r3 = 1
            if (r6 != r2) goto L40
            boolean r2 = r9 instanceof org.apache.tika.parser.DefaultParser
            if (r2 == 0) goto L40
            goto L6f
        L40:
            boolean r2 = r9 instanceof org.apache.tika.parser.CompositeParser
            if (r2 == 0) goto L64
            r1 = r9
            org.apache.tika.parser.CompositeParser r1 = (org.apache.tika.parser.CompositeParser) r1
            java.util.List r1 = r1.getAllComponentParsers()
            java.lang.Class r2 = r9.getClass()
            java.lang.Class<org.apache.tika.parser.CompositeParser> r4 = org.apache.tika.parser.CompositeParser.class
            boolean r2 = r2.equals(r4)
            r3 = r3 ^ r2
            boolean r2 = r9 instanceof org.apache.tika.parser.DefaultParser
            if (r2 == 0) goto L6f
            org.apache.tika.config.TikaConfigSerializer$Mode r2 = org.apache.tika.config.TikaConfigSerializer.Mode.STATIC
            if (r6 == r2) goto L62
            org.apache.tika.config.TikaConfigSerializer$Mode r2 = org.apache.tika.config.TikaConfigSerializer.Mode.STATIC_FULL
            if (r6 != r2) goto L6f
        L62:
            r3 = 0
            goto L6f
        L64:
            boolean r2 = r9 instanceof org.apache.tika.parser.multiple.AbstractMultipleParser
            if (r2 == 0) goto L6f
            r1 = r9
            org.apache.tika.parser.multiple.AbstractMultipleParser r1 = (org.apache.tika.parser.multiple.AbstractMultipleParser) r1
            java.util.List r1 = r1.getAllParsers()
        L6f:
            if (r3 == 0) goto L75
            org.w3c.dom.Element r7 = addParser(r6, r7, r8, r9, r0)
        L75:
            java.util.Iterator r9 = r1.iterator()
        L79:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r9.next()
            org.apache.tika.parser.Parser r0 = (org.apache.tika.parser.Parser) r0
            addParser(r6, r7, r8, r0)
            goto L79
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.TikaConfigSerializer.addParser(org.apache.tika.config.TikaConfigSerializer$Mode, org.w3c.dom.Element, org.w3c.dom.Document, org.apache.tika.parser.Parser):void");
    }

    private static void addParsers(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        Parser parser = tikaConfig.getParser();
        Mode mode2 = Mode.MINIMAL;
        if (mode == mode2 && (parser instanceof DefaultParser)) {
            return;
        }
        if (mode == mode2) {
            mode = Mode.CURRENT;
        }
        Element elementCreateElement = document.createElement("parsers");
        element.appendChild(elementCreateElement);
        addParser(mode, elementCreateElement, document, parser);
    }

    private static void addServiceLoader(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        ServiceLoader serviceLoader = tikaConfig.getServiceLoader();
        if (mode == Mode.MINIMAL && serviceLoader.isDynamic() && serviceLoader.getLoadErrorHandler() == LoadErrorHandler.IGNORE) {
            return;
        }
        Element elementCreateElement = document.createElement("service-loader");
        elementCreateElement.setAttribute("dynamic", Boolean.toString(serviceLoader.isDynamic()));
        elementCreateElement.setAttribute("loadErrorHandler", serviceLoader.getLoadErrorHandler().toString());
        element.appendChild(elementCreateElement);
    }

    private static void addTranslator(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        Translator translator = tikaConfig.getTranslator();
        if (mode == Mode.MINIMAL && (translator instanceof DefaultTranslator)) {
            element.appendChild(document.createComment("for example: <translator class=\"org.apache.tika.language.translate.GoogleTranslator\"/>"));
            return;
        }
        if ((translator instanceof DefaultTranslator) && (mode == Mode.STATIC || mode == Mode.STATIC_FULL)) {
            translator = ((DefaultTranslator) translator).getTranslator();
        }
        if (translator == null) {
            element.appendChild(document.createComment("No translators available"));
            return;
        }
        Element elementCreateElement = document.createElement("translator");
        elementCreateElement.setAttribute(Constants.CLASS, translator.getClass().getCanonicalName());
        element.appendChild(elementCreateElement);
    }

    private static Method findGetter(MethodTuple methodTuple, Object obj) {
        Matcher matcher = Pattern.compile("\\A(?:get|is)([A-Z].+)\\Z").matcher("");
        for (Method method : obj.getClass().getMethods()) {
            if (obj.getClass().getName().contains("PDF")) {
                System.out.println(method.getName());
            }
            if (matcher.reset(method.getName()).find()) {
                if (obj.getClass().getName().contains("PDF")) {
                    System.out.println("2: " + method.getName());
                }
                if (methodTuple.name.equals(matcher.group(1))) {
                    if (methodTuple.singleParam.equals(method.getReturnType())) {
                        return method;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static String methodToParamName(String str) {
        if (StringUtils.isBlank(str)) {
            return str;
        }
        return str.substring(0, 1).toLowerCase(Locale.US) + str.substring(1);
    }

    private static MethodTuple pickBestSetter(Set<MethodTuple> set) {
        Iterator<MethodTuple> it = set.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    private static void processNonPrimitive(String str, Set<MethodTuple> set, Set<MethodTuple> set2, Document document, Element element, Object obj) {
        for (MethodTuple methodTuple : set) {
            for (MethodTuple methodTuple2 : set2) {
                if (methodTuple.singleParam.equals(methodTuple2.singleParam)) {
                    serializeObject(str, document, element, methodTuple, methodTuple2, obj);
                    return;
                }
            }
        }
    }

    public static void serialize(TikaConfig tikaConfig, Mode mode, Writer writer, Charset charset) throws TransformerException, TikaException {
        Document documentNewDocument = XMLReaderUtils.getDocumentBuilder().newDocument();
        Element elementCreateElement = documentNewDocument.createElement("properties");
        documentNewDocument.appendChild(elementCreateElement);
        addMimeComment(mode, elementCreateElement, documentNewDocument);
        addServiceLoader(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addExecutorService(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addEncodingDetectors(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addTranslator(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addDetectors(mode, elementCreateElement, documentNewDocument, tikaConfig);
        addParsers(mode, elementCreateElement, documentNewDocument, tikaConfig);
        Transformer transformer = XMLReaderUtils.getTransformer();
        transformer.setOutputProperty("indent", "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty(RRWebVideoEvent.JsonKeys.ENCODING, charset.name());
        transformer.transform(new DOMSource(documentNewDocument), new StreamResult(writer));
    }

    private static void serializeNonPrimitives(Document document, Element element, Object obj, MethodTuples methodTuples, MethodTuples methodTuples2) {
        for (Map.Entry<String, Set<MethodTuple>> entry : methodTuples.tuples.entrySet()) {
            Document document2 = document;
            Element element2 = element;
            Object obj2 = obj;
            processNonPrimitive(entry.getKey(), entry.getValue(), methodTuples2.tuples.get(entry.getKey()), document2, element2, obj2);
            if (!methodTuples2.tuples.containsKey(entry.getKey())) {
                LOG.i("no getter for setter non-primitive: {} in {}", entry.getKey(), obj2.getClass());
            }
            document = document2;
            element = element2;
            obj = obj2;
        }
    }

    private static void serializeObject(String str, Document document, Element element, MethodTuple methodTuple, MethodTuple methodTuple2, Object obj) {
        try {
            Object objInvoke = methodTuple2.method.invoke(obj, null);
            if (objInvoke == null) {
                LOG.i("Getter {} on {} returned null", methodTuple2.name, obj.getClass());
            }
            Element elementCreateElement = document.createElement(str);
            elementCreateElement.setAttribute(Constants.CLASS, objInvoke.getClass().getCanonicalName());
            element.appendChild(elementCreateElement);
            serializeParams(document, element, objInvoke);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            LOG.l("couldn't get " + str + " on " + String.valueOf(obj.getClass()), e10);
        }
    }

    public static void serializeParams(Document document, Element element, Object obj) {
        Method[] methodArr;
        Matcher matcher = Pattern.compile("\\Aset([A-Z].*)").matcher("");
        Matcher matcher2 = Pattern.compile("\\A(?:get|is)([A-Z].+)\\Z").matcher("");
        MethodTuples methodTuples = new MethodTuples();
        MethodTuples methodTuples2 = new MethodTuples();
        MethodTuples methodTuples3 = new MethodTuples();
        MethodTuples methodTuples4 = new MethodTuples();
        Method[] methods = obj.getClass().getMethods();
        int length = methods.length;
        int i10 = 0;
        while (i10 < length) {
            Method method = methods[i10];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (matcher.reset(method.getName()).find()) {
                if (!Modifier.isPublic(method.getModifiers())) {
                    LOG.g("inaccessible setter: {} in {}", method.getName(), obj.getClass());
                } else if (method.getAnnotation(Field.class) != null) {
                    if (parameterTypes.length != 1) {
                        af.c cVar = LOG;
                        String name = method.getName();
                        int length2 = parameterTypes.length;
                        StringBuilder sb2 = new StringBuilder();
                        methodArr = methods;
                        sb2.append("setter with wrong number of params ");
                        sb2.append(name);
                        sb2.append(StringUtils.SPACE);
                        sb2.append(length2);
                        cVar.c(sb2.toString());
                    } else {
                        methodArr = methods;
                        String strMethodToParamName = methodToParamName(matcher.group(1));
                        if (PRIMITIVES.containsKey(parameterTypes[0])) {
                            methodTuples2.add(new MethodTuple(strMethodToParamName, method, parameterTypes[0]));
                        } else {
                            methodTuples.add(new MethodTuple(strMethodToParamName, method, parameterTypes[0]));
                        }
                    }
                }
                methodArr = methods;
            } else {
                methodArr = methods;
                if (matcher2.reset(method.getName()).find() && parameterTypes.length == 0) {
                    String strMethodToParamName2 = methodToParamName(matcher2.group(1));
                    if (PRIMITIVES.containsKey(method.getReturnType())) {
                        methodTuples4.add(new MethodTuple(strMethodToParamName2, method, method.getReturnType()));
                    } else {
                        methodTuples3.add(new MethodTuple(strMethodToParamName2, method, method.getReturnType()));
                    }
                }
            }
            i10++;
            methods = methodArr;
        }
        serializePrimitives(document, element, obj, methodTuples2, methodTuples4);
        serializeNonPrimitives(document, element, obj, methodTuples, methodTuples3);
    }

    private static void serializePrimitives(Document document, Element element, Object obj, MethodTuples methodTuples, MethodTuples methodTuples2) {
        Element elementCreateElement;
        Map.Entry<String, Set<MethodTuple>> entry;
        if (obj instanceof AbstractMultipleParser) {
            elementCreateElement = document.createElement(Message.JsonKeys.PARAMS);
            Element elementCreateElement2 = document.createElement("param");
            elementCreateElement2.setAttribute("name", "metadataPolicy");
            elementCreateElement2.setAttribute("value", ((AbstractMultipleParser) obj).getMetadataPolicy().toString());
            elementCreateElement.appendChild(elementCreateElement2);
            element.appendChild(elementCreateElement);
        } else {
            elementCreateElement = null;
        }
        Iterator<Map.Entry<String, Set<MethodTuple>>> it = methodTuples.tuples.entrySet().iterator();
        Element element2 = elementCreateElement;
        while (it.hasNext()) {
            Map.Entry<String, Set<MethodTuple>> next = it.next();
            if (methodTuples2.tuples.containsKey(next.getKey())) {
                Set<MethodTuple> set = methodTuples2.tuples.get(next.getKey());
                Set<MethodTuple> value = next.getValue();
                MethodTuple methodTuple = null;
                for (MethodTuple methodTuple2 : set) {
                    Iterator<MethodTuple> it2 = value.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            entry = next;
                            break;
                        }
                        entry = next;
                        if (methodTuple2.singleParam.equals(it2.next().singleParam)) {
                            methodTuple = methodTuple2;
                            break;
                        }
                        next = entry;
                    }
                    next = entry;
                }
                Map.Entry<String, Set<MethodTuple>> entry2 = next;
                if (methodTuple == null) {
                    LOG.t("Could not find getter to match setter for: {}", entry2.getKey());
                } else {
                    try {
                        Object objInvoke = methodTuple.method.invoke(obj, null);
                        if (objInvoke == null) {
                            LOG.e("null value: {} in {}", methodTuple.name, obj.getClass());
                        }
                        String string = objInvoke == null ? "" : objInvoke.toString();
                        Element elementCreateElement3 = document.createElement("param");
                        elementCreateElement3.setAttribute("name", methodTuple.name);
                        elementCreateElement3.setAttribute("type", PRIMITIVES.get(methodTuple.singleParam));
                        if (List.class.isAssignableFrom(methodTuple.singleParam)) {
                            addList(elementCreateElement3, document, methodTuple, (List) objInvoke);
                        } else if (Map.class.isAssignableFrom(methodTuple.singleParam)) {
                            addMap(elementCreateElement3, document, methodTuple, (Map) objInvoke);
                        } else {
                            elementCreateElement3.setTextContent(string);
                        }
                        if (element2 == null) {
                            Element elementCreateElement4 = document.createElement(Message.JsonKeys.PARAMS);
                            element.appendChild(elementCreateElement4);
                            element2 = elementCreateElement4;
                        }
                        element2.appendChild(elementCreateElement3);
                    } catch (IllegalAccessException e10) {
                        LOG.q("couldn't invoke " + String.valueOf(methodTuple), e10);
                    } catch (InvocationTargetException e11) {
                        LOG.q("couldn't invoke " + String.valueOf(methodTuple), e11);
                    }
                }
            } else {
                LOG.m("no getter for setter: {} in {}", next.getKey(), obj.getClass());
            }
        }
    }

    private static Element addParser(Mode mode, Element element, Document document, Parser parser, ParserDecorator parserDecorator) {
        ParseContext parseContext = new ParseContext();
        TreeSet<MediaType> treeSet = new TreeSet();
        TreeSet<MediaType> treeSet2 = new TreeSet();
        if (parserDecorator != null) {
            TreeSet treeSet3 = new TreeSet(parserDecorator.getSupportedTypes(parseContext));
            treeSet.addAll(treeSet3);
            for (MediaType mediaType : parser.getSupportedTypes(parseContext)) {
                if (!treeSet3.contains(mediaType)) {
                    treeSet2.add(mediaType);
                }
                treeSet.remove(mediaType);
            }
        } else if (mode == Mode.STATIC_FULL) {
            treeSet.addAll(parser.getSupportedTypes(parseContext));
        }
        String canonicalName = parser.getClass().getCanonicalName();
        Element elementCreateElement = document.createElement(ExternalParsersConfigReaderMetKeys.PARSER_TAG);
        elementCreateElement.setAttribute(Constants.CLASS, canonicalName);
        element.appendChild(elementCreateElement);
        serializeParams(document, elementCreateElement, parser);
        for (MediaType mediaType2 : treeSet) {
            Element elementCreateElement2 = document.createElement("mime");
            elementCreateElement2.appendChild(document.createTextNode(mediaType2.toString()));
            elementCreateElement.appendChild(elementCreateElement2);
        }
        for (MediaType mediaType3 : treeSet2) {
            Element elementCreateElement3 = document.createElement("mime-exclude");
            elementCreateElement3.appendChild(document.createTextNode(mediaType3.toString()));
            elementCreateElement.appendChild(elementCreateElement3);
        }
        return elementCreateElement;
    }
}
