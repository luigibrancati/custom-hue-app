package org.apache.tika.config;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.protocol.Message;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Param<T> implements Serializable {
    private static final String CLASS = "class";
    private static final String LIST = "list";
    private static final String MAP = "map";
    private static final Map<Class<?>, String> map;
    private static final Map<String, Class<?>> reverseMap;
    private static final Map<String, Class<?>> wellKnownMap;
    private T actualValue;
    private String name;
    private Class<T> type;
    private final List<String> valueStrings;

    static {
        HashMap map2 = new HashMap();
        map = map2;
        reverseMap = new HashMap();
        wellKnownMap = new HashMap();
        map2.put(Boolean.class, "bool");
        map2.put(String.class, "string");
        map2.put(Byte.class, "byte");
        map2.put(Short.class, "short");
        map2.put(Integer.class, "int");
        map2.put(Long.class, "long");
        map2.put(BigInteger.class, "bigint");
        map2.put(Float.class, "float");
        map2.put(Double.class, "double");
        map2.put(File.class, Constants.FILE);
        map2.put(URI.class, "uri");
        map2.put(URL.class, "url");
        map2.put(ArrayList.class, LIST);
        map2.put(Map.class, MAP);
        for (Map.Entry entry : map2.entrySet()) {
            reverseMap.put((String) entry.getValue(), (Class) entry.getKey());
        }
        wellKnownMap.put("metadataPolicy", AbstractMultipleParser.MetadataPolicy.class);
    }

    public Param() {
        this.valueStrings = new ArrayList();
    }

    private static <T> Class<T> classFromType(String str) {
        Map<String, Class<?>> map2 = reverseMap;
        if (map2.containsKey(str)) {
            return (Class) map2.get(str);
        }
        try {
            return (Class<T>) Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static <T> T getTypedValue(Class<T> cls, String str) {
        try {
            if (cls.isEnum()) {
                return (T) Enum.valueOf(cls, str);
            }
            Constructor<T> constructor = cls.getConstructor(String.class);
            constructor.setAccessible(true);
            return constructor.newInstance(str);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(String.valueOf(cls) + " doesnt have a constructor that takes String arg", e11);
        }
    }

    public static <T> Param<T> load(InputStream inputStream) {
        return load(XMLReaderUtils.getDocumentBuilder().parse(inputStream).getFirstChild());
    }

    private static <T> void loadList(Param<T> param, Node node) {
        ((Param) param).actualValue = (T) new ArrayList();
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1) {
                ((List) ((Param) param).actualValue).add(getTypedValue(classFromType(firstChild.getLocalName()), firstChild.getTextContent()));
                ((Param) param).valueStrings.add(firstChild.getTextContent());
            }
        }
    }

    private static <T> void loadMap(Param<T> param, Node node) throws TikaConfigException {
        String localName;
        String textContent;
        ((Param) param).actualValue = (T) new HashMap();
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == 1) {
                if (firstChild.getAttributes().getNamedItem("key") != null) {
                    localName = firstChild.getAttributes().getNamedItem("key").getNodeValue();
                    textContent = firstChild.getAttributes().getNamedItem("value") != null ? firstChild.getAttributes().getNamedItem("value").getNodeValue() : firstChild.getTextContent();
                } else {
                    localName = firstChild.getLocalName();
                    textContent = firstChild.getTextContent();
                }
                if (((Map) ((Param) param).actualValue).containsKey(localName)) {
                    throw new TikaConfigException("Duplicate keys are not allowed: " + localName);
                }
                ((Map) ((Param) param).actualValue).put(localName, textContent);
            }
        }
    }

    private static <T> void loadObject(Param<T> param, Node node, Class cls) throws TikaConfigException {
        try {
            ((Param) param).actualValue = cls.getDeclaredConstructor(null).newInstance(null);
            NodeList childNodes = node.getChildNodes();
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if (Message.JsonKeys.PARAMS.equals(nodeItem.getLocalName())) {
                    NodeList childNodes2 = nodeItem.getChildNodes();
                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                        if ("param".equals(childNodes2.item(i11).getLocalName())) {
                            Param paramLoad = load(childNodes2.item(i11));
                            String str = "set" + paramLoad.getName().substring(0, 1).toUpperCase(Locale.US) + paramLoad.getName().substring(1);
                            try {
                                try {
                                    ((Param) param).actualValue.getClass().getMethod(str, paramLoad.getType()).invoke(((Param) param).actualValue, paramLoad.getValue());
                                } catch (IllegalAccessException | InvocationTargetException e10) {
                                    throw new TikaConfigException("can't set param value: " + paramLoad.getName(), e10);
                                }
                            } catch (NoSuchMethodException e11) {
                                throw new TikaConfigException("can't find method: " + str, e11);
                            }
                        }
                    }
                }
            }
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e12) {
            throw new TikaConfigException("can't build class: " + String.valueOf(cls), e12);
        }
    }

    public String getName() {
        return this.name;
    }

    public Class<T> getType() {
        return this.type;
    }

    public String getTypeString() {
        Class<T> cls = this.type;
        if (cls == null) {
            return null;
        }
        if (List.class.isAssignableFrom(cls)) {
            return LIST;
        }
        Map<Class<?>, String> map2 = map;
        return map2.containsKey(this.type) ? map2.get(this.type) : this.type.getName();
    }

    public T getValue() {
        return this.actualValue;
    }

    public void save(OutputStream outputStream) throws TransformerException {
        Document documentNewDocument = XMLReaderUtils.getDocumentBuilder().newDocument();
        Element elementCreateElement = documentNewDocument.createElement("param");
        documentNewDocument.appendChild(elementCreateElement);
        save(documentNewDocument, elementCreateElement);
        XMLReaderUtils.getTransformer().transform(new DOMSource(elementCreateElement), new StreamResult(outputStream));
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(Class<T> cls) {
        this.type = cls;
    }

    public void setTypeString(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.type = classFromType(str);
        this.actualValue = null;
    }

    public String toString() {
        return "Param{name='" + this.name + "', valueStrings='" + String.valueOf(this.valueStrings) + "', actualValue=" + String.valueOf(this.actualValue) + "}";
    }

    public Param(String str, Class<T> cls, T t10) {
        ArrayList arrayList = new ArrayList();
        this.valueStrings = arrayList;
        this.name = str;
        this.type = cls;
        this.actualValue = t10;
        if (List.class.isAssignableFrom(t10.getClass())) {
            arrayList.addAll((List) t10);
        } else if (!Map.class.isAssignableFrom(t10.getClass())) {
            arrayList.add(t10.toString());
        }
        if (this.type == null) {
            this.type = (Class) wellKnownMap.get(str);
        }
    }

    public static <T> Param<T> load(Node node) throws TikaConfigException {
        Class<T> cls;
        String textContent;
        Node namedItem = node.getAttributes().getNamedItem("name");
        Node namedItem2 = node.getAttributes().getNamedItem("type");
        Node namedItem3 = node.getAttributes().getNamedItem("value");
        Node namedItem4 = node.getAttributes().getNamedItem("class");
        if (namedItem4 != null) {
            try {
                cls = (Class<T>) Class.forName(namedItem4.getTextContent());
            } catch (ClassNotFoundException e10) {
                throw new TikaConfigException("can't find class: " + namedItem4.getTextContent(), e10);
            }
        } else {
            cls = null;
        }
        Node firstChild = node.getFirstChild();
        if ((firstChild instanceof NodeList) && namedItem3 != null) {
            throw new TikaConfigException("can't specify a value attr _and_ a node list");
        }
        if (namedItem3 == null || (firstChild != null && firstChild.getTextContent() != null)) {
            namedItem3 = firstChild;
        }
        Param<T> param = new Param<>();
        String textContent2 = namedItem.getTextContent();
        ((Param) param).name = textContent2;
        if (namedItem2 != null) {
            if (!"class".equals(namedItem2.getTextContent())) {
                param.setTypeString(namedItem2.getTextContent());
            } else if (namedItem4 != null) {
                param.setType(cls);
            } else {
                throw new TikaConfigException("must specify a class attribute if type=\"class\"");
            }
        } else {
            Class<T> cls2 = (Class) wellKnownMap.get(textContent2);
            ((Param) param).type = cls2;
            if (cls2 == null) {
                ((Param) param).type = cls;
            }
            if (((Param) param).type == null) {
                throw new TikaConfigException("Must specify a \"type\" in: " + node.getLocalName());
            }
        }
        if (cls != null) {
            loadObject(param, node, cls);
            return param;
        }
        if (List.class.isAssignableFrom(((Param) param).type)) {
            loadList(param, node);
            return param;
        }
        if (Map.class.isAssignableFrom(((Param) param).type)) {
            loadMap(param, node);
            return param;
        }
        if (namedItem3 != null) {
            textContent = namedItem3.getTextContent();
        } else {
            textContent = "";
        }
        ((Param) param).actualValue = (T) getTypedValue(((Param) param).type, textContent);
        ((Param) param).valueStrings.add(textContent);
        return param;
    }

    public void save(Document document, Node node) {
        if (node instanceof Element) {
            Element element = (Element) node;
            element.setAttribute("name", getName());
            element.setAttribute("type", getTypeString());
            if (List.class.isAssignableFrom(this.actualValue.getClass())) {
                for (int i10 = 0; i10 < this.valueStrings.size(); i10++) {
                    String str = this.valueStrings.get(i10);
                    Element elementCreateElement = document.createElement(map.get(((List) this.actualValue).get(i10).getClass()));
                    elementCreateElement.setTextContent(str);
                    element.appendChild(elementCreateElement);
                }
                return;
            }
            if (Map.class.isAssignableFrom(this.actualValue.getClass())) {
                for (String str2 : ((Map) this.actualValue).keySet()) {
                    String str3 = (String) ((Map) this.actualValue).get(str2);
                    Element elementCreateElement2 = document.createElement(str2);
                    elementCreateElement2.setTextContent(str3);
                    element.appendChild(elementCreateElement2);
                }
                return;
            }
            element.setTextContent(this.valueStrings.get(0));
            return;
        }
        throw new IllegalArgumentException("Not an Element : " + String.valueOf(node));
    }

    public Param(String str, T t10) {
        this(str, t10.getClass(), t10);
    }
}
