package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class KeyChannelResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyChannelResponder";
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();
    private final KeyEventChannel keyEventChannel;

    public KeyChannelResponder(KeyEventChannel keyEventChannel) {
        this.keyEventChannel = keyEventChannel;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(KeyEvent keyEvent, final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            onKeyEventHandledCallback.onKeyEventHandled(false);
            return;
        }
        KeyEventChannel.FlutterKeyEvent flutterKeyEvent = new KeyEventChannel.FlutterKeyEvent(keyEvent, this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()));
        boolean z10 = action != 0;
        KeyEventChannel keyEventChannel = this.keyEventChannel;
        Objects.requireNonNull(onKeyEventHandledCallback);
        keyEventChannel.sendFlutterKeyEvent(flutterKeyEvent, z10, new KeyEventChannel.EventResponseHandler() { // from class: io.flutter.embedding.android.c
            @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
            public final void onFrameworkResponse(boolean z11) {
                onKeyEventHandledCallback.onKeyEventHandled(z11);
            }
        });
    }
}
