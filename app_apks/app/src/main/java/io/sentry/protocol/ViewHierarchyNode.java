package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewHierarchyNode implements JsonUnknown, JsonSerializable {
    private Double alpha;
    private List<ViewHierarchyNode> children;
    private Double height;
    private String identifier;
    private String renderingSystem;
    private String tag;
    private String type;
    private Map<String, Object> unknown;
    private String visibility;
    private Double width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Double f38785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Double f38786y;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<ViewHierarchyNode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ViewHierarchyNode deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            ViewHierarchyNode viewHierarchyNode = new ViewHierarchyNode();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "rendering_system":
                        viewHierarchyNode.renderingSystem = objectReader.nextStringOrNull();
                        break;
                    case "identifier":
                        viewHierarchyNode.identifier = objectReader.nextStringOrNull();
                        break;
                    case "height":
                        viewHierarchyNode.height = objectReader.nextDoubleOrNull();
                        break;
                    case "x":
                        viewHierarchyNode.f38785x = objectReader.nextDoubleOrNull();
                        break;
                    case "y":
                        viewHierarchyNode.f38786y = objectReader.nextDoubleOrNull();
                        break;
                    case "tag":
                        viewHierarchyNode.tag = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        viewHierarchyNode.type = objectReader.nextStringOrNull();
                        break;
                    case "alpha":
                        viewHierarchyNode.alpha = objectReader.nextDoubleOrNull();
                        break;
                    case "width":
                        viewHierarchyNode.width = objectReader.nextDoubleOrNull();
                        break;
                    case "children":
                        viewHierarchyNode.children = objectReader.nextListOrNull(iLogger, this);
                        break;
                    case "visibility":
                        viewHierarchyNode.visibility = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            viewHierarchyNode.setUnknown(map);
            return viewHierarchyNode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String ALPHA = "alpha";
        public static final String CHILDREN = "children";
        public static final String HEIGHT = "height";
        public static final String IDENTIFIER = "identifier";
        public static final String RENDERING_SYSTEM = "rendering_system";
        public static final String TAG = "tag";
        public static final String TYPE = "type";
        public static final String VISIBILITY = "visibility";
        public static final String WIDTH = "width";

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final String f38787X = "x";

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final String f38788Y = "y";
    }

    public Double getAlpha() {
        return this.alpha;
    }

    public List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public Double getHeight() {
        return this.height;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getRenderingSystem() {
        return this.renderingSystem;
    }

    public String getTag() {
        return this.tag;
    }

    public String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public Double getWidth() {
        return this.width;
    }

    public Double getX() {
        return this.f38785x;
    }

    public Double getY() {
        return this.f38786y;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.renderingSystem != null) {
            objectWriter.name("rendering_system").value(this.renderingSystem);
        }
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.identifier != null) {
            objectWriter.name("identifier").value(this.identifier);
        }
        if (this.tag != null) {
            objectWriter.name("tag").value(this.tag);
        }
        if (this.width != null) {
            objectWriter.name("width").value(this.width);
        }
        if (this.height != null) {
            objectWriter.name("height").value(this.height);
        }
        if (this.f38785x != null) {
            objectWriter.name("x").value(this.f38785x);
        }
        if (this.f38786y != null) {
            objectWriter.name("y").value(this.f38786y);
        }
        if (this.visibility != null) {
            objectWriter.name(JsonKeys.VISIBILITY).value(this.visibility);
        }
        if (this.alpha != null) {
            objectWriter.name(JsonKeys.ALPHA).value(this.alpha);
        }
        List<ViewHierarchyNode> list = this.children;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.CHILDREN).value(iLogger, this.children);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAlpha(Double d10) {
        this.alpha = d10;
    }

    public void setChildren(List<ViewHierarchyNode> list) {
        this.children = list;
    }

    public void setHeight(Double d10) {
        this.height = d10;
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }

    public void setRenderingSystem(String str) {
        this.renderingSystem = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVisibility(String str) {
        this.visibility = str;
    }

    public void setWidth(Double d10) {
        this.width = d10;
    }

    public void setX(Double d10) {
        this.f38785x = d10;
    }

    public void setY(Double d10) {
        this.f38786y = d10;
    }
}
