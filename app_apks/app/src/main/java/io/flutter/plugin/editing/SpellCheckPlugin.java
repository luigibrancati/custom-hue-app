package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.localization.LocalizationPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SpellCheckPlugin implements SpellCheckChannel.SpellCheckMethodHandler, SpellCheckerSession.SpellCheckerSessionListener {
    public static final String END_INDEX_KEY = "endIndex";
    private static final int MAX_SPELL_CHECK_SUGGESTIONS = 5;
    public static final String START_INDEX_KEY = "startIndex";
    public static final String SUGGESTIONS_KEY = "suggestions";
    private final SpellCheckChannel mSpellCheckChannel;
    private SpellCheckerSession mSpellCheckerSession;
    private final TextServicesManager mTextServicesManager;
    MethodChannel.Result pendingResult;

    public SpellCheckPlugin(TextServicesManager textServicesManager, SpellCheckChannel spellCheckChannel) {
        this.mTextServicesManager = textServicesManager;
        this.mSpellCheckChannel = spellCheckChannel;
        spellCheckChannel.setSpellCheckMethodHandler(this);
    }

    public void destroy() {
        this.mSpellCheckChannel.setSpellCheckMethodHandler(null);
        SpellCheckerSession spellCheckerSession = this.mSpellCheckerSession;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.SpellCheckChannel.SpellCheckMethodHandler
    public void initiateSpellCheck(String str, String str2, MethodChannel.Result result) {
        if (this.pendingResult != null) {
            result.error("error", "Previous spell check request still pending.", null);
        } else {
            this.pendingResult = result;
            performSpellCheck(str, str2);
        }
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.pendingResult.success(new ArrayList());
            this.pendingResult = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.pendingResult.success(new ArrayList());
            this.pendingResult = null;
            return;
        }
        for (int i10 = 0; i10 < sentenceSuggestionsInfo.getSuggestionsCount(); i10++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i10);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap map = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i10);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i10) + offsetAt;
                map.put(START_INDEX_KEY, Integer.valueOf(offsetAt));
                map.put(END_INDEX_KEY, Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = false;
                for (int i11 = 0; i11 < suggestionsCount; i11++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i11);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z10 = true;
                    }
                }
                if (z10) {
                    map.put(SUGGESTIONS_KEY, arrayList2);
                    arrayList.add(map);
                }
            }
        }
        this.pendingResult.success(arrayList);
        this.pendingResult = null;
    }

    public void performSpellCheck(String str, String str2) {
        Locale localeLocaleFromString = LocalizationPlugin.localeFromString(str);
        if (this.mSpellCheckerSession == null) {
            this.mSpellCheckerSession = this.mTextServicesManager.newSpellCheckerSession(null, localeLocaleFromString, this, true);
        }
        this.mSpellCheckerSession.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
