# 🤖 مسیریاب هوشمند فارسی - بر پایه OsmAnd

## 📁 نام پروژه:
```
C:\Users\Admin\CascadeProjects\PersianSmartNavigator
```

## ✅ ماژول‌های هوش مصنوعی اضافه شده:

### 1. KeyManager.kt
- دانلود و رمزگشایی کلیدهای API از Google Drive
- لینک: https://drive.google.com/file/d/17iwkjyGcxJeDgwQWEcsOdfbOxOah_0u0
- رمزنگاری: PBKDF2 + AES-GCM
- پشتیبانی از چند کلید API

### 2. RouteAnalyzer.kt
- تحلیل هوشمند مسیر
- تشخیص ترافیک بر اساس ساعت
- پیشنهاد مسیر جایگزین

### 3. PersianVoiceAlerts.kt
- هشدارهای صوتی فارسی
- هشدار سرعت
- هشدار دوربین سرعت
- TTS فارسی

### 4. RouteLearning.kt (در حال ساخت)
- یادگیری مسیرهای پرتکرار
- پیشنهاد مسیر بر اساس تاریخچه

### 5. ChatFragment.kt (در حال ساخت)
- چت با مدل AI
- پاسخ به سوالات مسیریابی

## 🔧 تنظیمات پیش‌فرض:

```xml
زبان: فارسی
راهنمای صوتی: فعال
هشدار سرعت: فعال
نوع نقشه: شب
مسیرهای جایگزین: فعال
```

## 🗑️ حذف شده:
- پلاگین‌های غیرضروری (Wikivoyage, 3D Maps, ...)
- زبان‌های غیرفارسی
- تنظیمات پیچیده

## 🚀 نحوه استفاده:

### Build پروژه:
```bash
cd C:\Users\Admin\CascadeProjects\PersianSmartNavigator
gradlew assembleDebug
```

### استفاده از KeyManager:
```kotlin
val keyManager = KeyManager(context)
keyManager.unlockKeys("your_password")
val apiKey = keyManager.getCurrentKey()
```

### استفاده از هشدارهای صوتی:
```kotlin
val voiceAlerts = PersianVoiceAlerts(context)
voiceAlerts.alertSpeed(120, 100)
voiceAlerts.alertSpeedCamera(200)
```

## 📊 وضعیت:
✅ OsmAnd کپی شد
✅ KeyManager اضافه شد
✅ RouteAnalyzer اضافه شد
✅ PersianVoiceAlerts اضافه شد
⏳ RouteLearning (در حال ساخت)
⏳ ChatFragment (در حال ساخت)
⏳ تنظیمات پیش‌فرض
⏳ حذف پلاگین‌ها

**پروژه در حال تکمیل است...**
