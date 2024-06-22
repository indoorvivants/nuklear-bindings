package nuklear

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

val STBTT_PLATFORM_ID_UNICODE: CUnsignedInt = 0.toUInt
val STBTT_PLATFORM_ID_MAC: CUnsignedInt = 1.toUInt
val STBTT_PLATFORM_ID_ISO: CUnsignedInt = 2.toUInt
val STBTT_PLATFORM_ID_MICROSOFT: CUnsignedInt = 3.toUInt

val STBTT_MS_EID_SYMBOL: CUnsignedInt = 0.toUInt
val STBTT_MS_EID_UNICODE_BMP: CUnsignedInt = 1.toUInt
val STBTT_MS_EID_SHIFTJIS: CUnsignedInt = 2.toUInt
val STBTT_MS_EID_UNICODE_FULL: CUnsignedInt = 10.toUInt

val STBTT_MAC_EID_ROMAN: CUnsignedInt = 0.toUInt
val STBTT_MAC_EID_ARABIC: CUnsignedInt = 4.toUInt
val STBTT_MAC_EID_JAPANESE: CUnsignedInt = 1.toUInt
val STBTT_MAC_EID_HEBREW: CUnsignedInt = 5.toUInt
val STBTT_MAC_EID_CHINESE_TRAD: CUnsignedInt = 2.toUInt
val STBTT_MAC_EID_GREEK: CUnsignedInt = 6.toUInt
val STBTT_MAC_EID_KOREAN: CUnsignedInt = 3.toUInt
val STBTT_MAC_EID_RUSSIAN: CUnsignedInt = 7.toUInt

val STBTT_UNICODE_EID_UNICODE_1_0: CUnsignedInt = 0.toUInt
val STBTT_UNICODE_EID_UNICODE_1_1: CUnsignedInt = 1.toUInt
val STBTT_UNICODE_EID_ISO_10646: CUnsignedInt = 2.toUInt
val STBTT_UNICODE_EID_UNICODE_2_0_BMP: CUnsignedInt = 3.toUInt
val STBTT_UNICODE_EID_UNICODE_2_0_FULL: CUnsignedInt = 4.toUInt

val STBTT_MAC_LANG_ENGLISH: CUnsignedInt = 0.toUInt
val STBTT_MAC_LANG_JAPANESE: CUnsignedInt = 11.toUInt
val STBTT_MAC_LANG_ARABIC: CUnsignedInt = 12.toUInt
val STBTT_MAC_LANG_KOREAN: CUnsignedInt = 23.toUInt
val STBTT_MAC_LANG_DUTCH: CUnsignedInt = 4.toUInt
val STBTT_MAC_LANG_RUSSIAN: CUnsignedInt = 32.toUInt
val STBTT_MAC_LANG_FRENCH: CUnsignedInt = 1.toUInt
val STBTT_MAC_LANG_SPANISH: CUnsignedInt = 6.toUInt
val STBTT_MAC_LANG_GERMAN: CUnsignedInt = 2.toUInt
val STBTT_MAC_LANG_SWEDISH: CUnsignedInt = 5.toUInt
val STBTT_MAC_LANG_HEBREW: CUnsignedInt = 10.toUInt
val STBTT_MAC_LANG_CHINESE_SIMPLIFIED: CUnsignedInt = 33.toUInt
val STBTT_MAC_LANG_ITALIAN: CUnsignedInt = 3.toUInt
val STBTT_MAC_LANG_CHINESE_TRAD: CUnsignedInt = 19.toUInt

val nk_false: CUnsignedInt = 0.toUInt
val nk_true: CUnsignedInt = 1.toUInt

val STBRP_HEURISTIC_Skyline_default: CUnsignedInt = 0.toUInt
val STBRP_HEURISTIC_Skyline_BL_sortHeight: CUnsignedInt = 0.toUInt
val STBRP_HEURISTIC_Skyline_BF_sortHeight: CUnsignedInt = 1.toUInt

val STBTT_MS_LANG_ENGLISH: CUnsignedInt = 1033.toUInt
val STBTT_MS_LANG_ITALIAN: CUnsignedInt = 1040.toUInt
val STBTT_MS_LANG_CHINESE: CUnsignedInt = 2052.toUInt
val STBTT_MS_LANG_JAPANESE: CUnsignedInt = 1041.toUInt
val STBTT_MS_LANG_DUTCH: CUnsignedInt = 1043.toUInt
val STBTT_MS_LANG_KOREAN: CUnsignedInt = 1042.toUInt
val STBTT_MS_LANG_FRENCH: CUnsignedInt = 1036.toUInt
val STBTT_MS_LANG_RUSSIAN: CUnsignedInt = 1049.toUInt
val STBTT_MS_LANG_GERMAN: CUnsignedInt = 1031.toUInt
val STBTT_MS_LANG_SPANISH: CUnsignedInt = 1033.toUInt
val STBTT_MS_LANG_HEBREW: CUnsignedInt = 1037.toUInt
val STBTT_MS_LANG_SWEDISH: CUnsignedInt = 1053.toUInt

val STBTT_vmove: CUnsignedInt = 1.toUInt
val STBTT_vline: CUnsignedInt = 2.toUInt
val STBTT_vcurve: CUnsignedInt = 3.toUInt
val STBTT_vcubic: CUnsignedInt = 4.toUInt

val NK_DO_NOT_STOP_ON_NEW_LINE: CUnsignedInt = 0.toUInt
val NK_STOP_ON_NEW_LINE: CUnsignedInt = 1.toUInt