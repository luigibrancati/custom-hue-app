package io.flutter.plugin.mouse;

import android.view.PointerIcon;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import io.sentry.MeasurementUnit;
import java.util.HashMap;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class MouseCursorPlugin {
    private static HashMap<String, Integer> systemCursorConstants;
    private final MouseCursorViewDelegate mView;
    private final MouseCursorChannel mouseCursorChannel;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface MouseCursorViewDelegate {
        PointerIcon getSystemPointerIcon(int i10);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public MouseCursorPlugin(MouseCursorViewDelegate mouseCursorViewDelegate, MouseCursorChannel mouseCursorChannel) {
        this.mView = mouseCursorViewDelegate;
        this.mouseCursorChannel = mouseCursorChannel;
        mouseCursorChannel.setMethodHandler(new MouseCursorChannel.MouseCursorMethodHandler() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler
            public void activateSystemCursor(String str) {
                MouseCursorPlugin.this.mView.setPointerIcon(MouseCursorPlugin.this.resolveSystemCursor(str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointerIcon resolveSystemCursor(String str) {
        if (systemCursorConstants == null) {
            systemCursorConstants = new HashMap<String, Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.2
                private static final long serialVersionUID = 1;

                {
                    put(MimeTypesReaderMetKeys.ALIAS_TAG, 1010);
                    put("allScroll", 1013);
                    put("basic", 1000);
                    put("cell", 1006);
                    put("click", 1002);
                    put("contextMenu", 1001);
                    put("copy", 1011);
                    put("forbidden", 1012);
                    put("grab", 1020);
                    put("grabbing", 1021);
                    put("help", 1003);
                    put("move", 1013);
                    put(MeasurementUnit.NONE, 0);
                    put("noDrop", 1012);
                    put("precise", 1007);
                    put("text", 1008);
                    put("resizeColumn", 1014);
                    put("resizeDown", 1015);
                    put("resizeUpLeft", 1016);
                    put("resizeDownRight", 1017);
                    put("resizeLeft", 1014);
                    put("resizeLeftRight", 1014);
                    put("resizeRight", 1014);
                    put("resizeRow", 1015);
                    put("resizeUp", 1015);
                    put("resizeUpDown", 1015);
                    put("resizeUpLeft", 1017);
                    put("resizeUpRight", 1016);
                    put("resizeUpLeftDownRight", 1017);
                    put("resizeUpRightDownLeft", 1016);
                    put("verticalText", 1009);
                    put("wait", 1004);
                    put("zoomIn", 1018);
                    put("zoomOut", 1019);
                }
            };
        }
        return this.mView.getSystemPointerIcon(systemCursorConstants.getOrDefault(str, 1000).intValue());
    }

    public void destroy() {
        this.mouseCursorChannel.setMethodHandler(null);
    }
}
