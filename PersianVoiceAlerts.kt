package net.osmand.plus.ai

import android.content.Context
import android.speech.tts.TextToSpeech
import java.util.*

class PersianVoiceAlerts(private val context: Context) {
    private var tts: TextToSpeech? = null
    
    init {
        tts = TextToSpeech(context) { status ->
            if (status == TextToSpeech.SUCCESS) {
                tts?.setLanguage(Locale("fa", "IR"))
            }
        }
    }
    
    fun alertSpeed(currentSpeed: Int, limit: Int) {
        if (currentSpeed > limit) {
            speak("ÓÑÚÊ ÔãÇ  ÇÓÊ. ãÍÏæÏíÊ  ˜íáæãÊÑ ÈÑ ÓÇÚÊ")
        }
    }
    
    fun alertSpeedCamera(distance: Int) {
        when {
            distance < 100 -> speak("ÏæÑÈíä ÓÑÚÊ")
            distance < 300 -> speak("ÏæÑÈíä ÓÑÚÊ ÏÑ  ãÊÑ Ìáæ")
        }
    }
    
    private fun speak(text: String) {
        tts?.speak(text, TextToSpeech.QUEUE_ADD, null, null)
    }
    
    fun shutdown() {
        tts?.stop()
        tts?.shutdown()
    }
}
