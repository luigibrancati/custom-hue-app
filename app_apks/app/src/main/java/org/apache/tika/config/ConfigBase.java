package org.apache.tika.config;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ConfigBase {
    private static Class[] SUPPORTED_PRIMITIVES = {String.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Double.TYPE, Float.TYPE};

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SetterClassPair {
        private final Class itemClass;
        private final Method setterMethod;

        public SetterClassPair(Method method, Class cls) {
            this.setterMethod = method;
            this.itemClass = cls;
        }

        public String toString() {
            return "SetterClassPair{setterMethod=" + String.valueOf(this.setterMethod) + ", itemClass=" + String.valueOf(this.itemClass) + "}";
        }
    }

    private static <T> T buildClass(Node node, String str, Class cls) throws TikaConfigException {
        String name = cls.getName();
        Node namedItem = node.getAttributes().getNamedItem(Constants.CLASS);
        if (namedItem != null) {
            name = namedItem.getTextContent();
        }
        try {
            Class<?> cls2 = Class.forName(name);
            if (cls.isAssignableFrom(cls2)) {
                return (T) cls2.getDeclaredConstructor(null).newInstance(null);
            }
            throw new TikaConfigException(str + " with class name " + name + " must be of type '" + cls.getName() + "'");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new TikaConfigException("problem loading " + str + " with class " + cls.getName(), e10);
        }
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, InputStream inputStream) throws IOException, TikaConfigException {
        try {
            return (P) buildComposite(str, cls, str2, cls2, XMLReaderUtils.buildDOM(inputStream).getDocumentElement());
        } catch (TikaException e10) {
            throw new TikaConfigException("problem loading xml to dom", e10);
        } catch (SAXException e11) {
            throw new IOException(e11);
        }
    }

    public static <T> T buildSingle(String str, Class<T> cls, InputStream inputStream) throws IOException, TikaConfigException {
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (documentElement.getLocalName().equals("properties")) {
                return (T) buildSingle(str, cls, documentElement, null);
            }
            throw new TikaConfigException("expect properties as root node");
        } catch (TikaException e10) {
            throw new TikaConfigException("problem loading xml to dom", e10);
        } catch (SAXException e11) {
            throw new IOException(e11);
        }
    }

    private static SetterClassPair findSetterClassPair(Object obj, String str) throws TikaConfigException {
        String str2 = "set" + str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
        Method method = null;
        Class<?> cls = null;
        for (Method method2 : obj.getClass().getMethods()) {
            if (str2.equals(method2.getName())) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1 && (cls == null || parameterTypes[0].equals(String.class))) {
                    cls = parameterTypes[0];
                    method = method2;
                }
            }
        }
        if (method != null && cls != null) {
            return new SetterClassPair(method, cls);
        }
        String str3 = "add" + str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
        for (Method method3 : obj.getClass().getMethods()) {
            if (str3.equals(method3.getName())) {
                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                if (parameterTypes2.length == 1 && (cls == null || parameterTypes2[0].equals(String.class))) {
                    cls = parameterTypes2[0];
                    method = method3;
                }
            }
        }
        if (method != null || cls != null) {
            return new SetterClassPair(method, cls);
        }
        throw new TikaConfigException("Couldn't find setter '" + str2 + "' or adder '" + str3 + "' for " + str + " of class: " + String.valueOf(obj.getClass()));
    }

    private static boolean hasChildNodes(Node node) {
        if (!node.hasChildNodes()) {
            return false;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            if (childNodes.item(i10).getNodeType() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasClass(Node node) {
        return node.hasAttributes() && node.getAttributes().getNamedItem(Constants.CLASS) != null;
    }

    private static boolean isMap(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && nodeItem.hasAttributes()) {
                if (nodeItem.getAttributes().getNamedItem("from") != null && nodeItem.getAttributes().getNamedItem("to") != null) {
                    return true;
                }
                if (nodeItem.getAttributes().getNamedItem("k") != null && nodeItem.getAttributes().getNamedItem("v") != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isPrimitive(Class cls) {
        int i10 = 0;
        while (true) {
            Class[] clsArr = SUPPORTED_PRIMITIVES;
            if (i10 >= clsArr.length) {
                return false;
            }
            if (clsArr[i10].equals(cls)) {
                return true;
            }
            i10++;
        }
    }

    private static <T> List<T> loadComposite(Node node, String str, Class<? extends T> cls) throws TikaConfigException {
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                Object objBuildClass = buildClass(nodeItem, str, cls);
                setParams(objBuildClass, nodeItem, new HashSet());
                arrayList.add(objBuildClass);
            }
        }
        return arrayList;
    }

    private static void setParams(Object obj, Node node, Set<String> set) throws TikaConfigException {
        setParams(obj, node, set, null);
    }

    private static void tryToSetClassList(Object obj, Node node) throws TikaConfigException {
        String localName = node.getLocalName();
        try {
            Class<?> cls = Class.forName(node.getAttributes().getNamedItem(Constants.CLASS).getTextContent());
            ArrayList arrayList = new ArrayList();
            NodeList childNodes = node.getChildNodes();
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if (nodeItem.getNodeType() == 1) {
                    Object objBuildClass = buildClass(nodeItem, nodeItem.getLocalName(), cls);
                    setParams(objBuildClass, nodeItem, new HashSet());
                    arrayList.add(objBuildClass);
                }
            }
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), List.class).invoke(obj, arrayList);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new TikaConfigException("couldn't build class for " + localName, e10);
        }
    }

    private static void tryToSetList(Object obj, Node node) throws TikaConfigException {
        if (hasClass(node)) {
            tryToSetClassList(obj, node);
        } else {
            tryToSetStringList(obj, node);
        }
    }

    private static void tryToSetMap(Object obj, Node node) throws TikaConfigException {
        String localName = node.getLocalName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1) {
                NamedNodeMap attributes = nodeItem.getAttributes();
                String textContent = null;
                String textContent2 = attributes.getNamedItem("from") != null ? attributes.getNamedItem("from").getTextContent() : attributes.getNamedItem("key") != null ? attributes.getNamedItem("key").getTextContent() : attributes.getNamedItem("k") != null ? attributes.getNamedItem("k").getTextContent() : null;
                if (attributes.getNamedItem("to") != null) {
                    textContent = attributes.getNamedItem("to").getTextContent();
                } else if (attributes.getNamedItem("value") != null) {
                    textContent = attributes.getNamedItem("value").getTextContent();
                } else if (attributes.getNamedItem("v") != null) {
                    textContent = attributes.getNamedItem("v").getTextContent();
                }
                if (textContent2 == null) {
                    throw new TikaConfigException("must specify a 'key' or 'from' value in a map object : " + String.valueOf(node));
                }
                if (textContent == null) {
                    throw new TikaConfigException("must specify a 'value' or 'to' value in a map object : " + String.valueOf(node));
                }
                linkedHashMap.put(textContent2, textContent);
            }
        }
        try {
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), Map.class).invoke(obj, linkedHashMap);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new TikaConfigException("can't set " + localName, e10);
        }
    }

    private static void tryToSetPrimitive(Object obj, SetterClassPair setterClassPair, String str) throws TikaConfigException {
        try {
            if (setterClassPair.itemClass == Integer.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Integer.valueOf(Integer.parseInt(str)));
                return;
            }
            if (setterClassPair.itemClass == Long.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Long.valueOf(Long.parseLong(str)));
                return;
            }
            if (setterClassPair.itemClass == Float.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Float.valueOf(Float.parseFloat(str)));
                return;
            }
            if (setterClassPair.itemClass == Double.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Double.valueOf(Double.parseDouble(str)));
            } else if (setterClassPair.itemClass == Boolean.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                setterClassPair.setterMethod.invoke(obj, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new TikaConfigException("bad parameter " + String.valueOf(setterClassPair) + StringUtils.SPACE + str, e10);
        }
    }

    private static void tryToSetStringList(Object obj, Node node) throws TikaConfigException {
        String textContent;
        String localName = node.getLocalName();
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && (textContent = nodeItem.getTextContent()) != null) {
                arrayList.add(textContent);
            }
        }
        try {
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), List.class).invoke(obj, arrayList);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new TikaConfigException("can't set " + localName, e10);
        }
    }

    public Set<String> configure(String str, InputStream inputStream) throws IOException, TikaConfigException {
        HashSet hashSet = new HashSet();
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (!documentElement.getLocalName().equals("properties")) {
                throw new TikaConfigException("expect properties as root node");
            }
            NodeList childNodes = documentElement.getChildNodes();
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if (str.equals(nodeItem.getLocalName())) {
                    setParams(this, nodeItem, hashSet);
                }
            }
            return hashSet;
        } catch (TikaException e10) {
            throw new TikaConfigException("problem loading xml to dom", e10);
        } catch (SAXException e11) {
            throw new IOException(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void setParams(java.lang.Object r9, org.w3c.dom.Node r10, java.util.Set<java.lang.String> r11, java.lang.String r12) throws org.apache.tika.exception.TikaConfigException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.ConfigBase.setParams(java.lang.Object, org.w3c.dom.Node, java.util.Set, java.lang.String):void");
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, Element element) throws TikaConfigException {
        if (element.getLocalName().equals("properties")) {
            NodeList childNodes = element.getChildNodes();
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                    try {
                        P pNewInstance = cls.getConstructor(List.class).newInstance(loadComposite(nodeItem, str2, cls2));
                        setParams(pNewInstance, nodeItem, new HashSet(), str2);
                        return pNewInstance;
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                        throw new TikaConfigException("can't build composite class", e10);
                    }
                }
            }
            throw new TikaConfigException("could not find " + str);
        }
        throw new TikaConfigException("expect properties as root node");
    }

    public static <T> T buildSingle(String str, Class<T> cls, Element element, T t10) throws TikaConfigException {
        NodeList childNodes = element.getChildNodes();
        T t11 = null;
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeType() == 1 && str.equals(nodeItem.getLocalName())) {
                if (t11 == null) {
                    t11 = (T) buildClass(nodeItem, str, cls);
                    setParams(t11, nodeItem, new HashSet());
                } else {
                    throw new TikaConfigException("There can only be one " + str + " in a config");
                }
            }
        }
        if (t11 != null) {
            return t11;
        }
        if (t10 != null) {
            return t10;
        }
        throw new TikaConfigException("could not find " + str);
    }

    public void handleSettings(Set<String> set) {
    }
}
