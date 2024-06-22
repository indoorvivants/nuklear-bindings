package nuklear

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[nuklear] trait CEnumU[T](using eq: T =:= UInt):
  given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
  extension (inline t: T)
   inline def int: CInt = eq.apply(t).toInt
   inline def uint: CUnsignedInt = eq.apply(t)
   inline def value: CUnsignedInt = eq.apply(t)
/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_allocation_type = CUnsignedInt
object nk_allocation_type extends CEnumU[nk_allocation_type]:
  given _tag: Tag[nk_allocation_type] = Tag.UInt
  inline def define(inline a: Long): nk_allocation_type = a.toUInt
  val NK_BUFFER_FIXED = define(0)
  val NK_BUFFER_DYNAMIC = define(1)
  inline def getName(inline value: nk_allocation_type): Option[String] =
    inline value match
      case NK_BUFFER_FIXED => Some("NK_BUFFER_FIXED")
      case NK_BUFFER_DYNAMIC => Some("NK_BUFFER_DYNAMIC")
      case _ => None
  extension (a: nk_allocation_type)
    inline def &(b: nk_allocation_type): nk_allocation_type = a & b
    inline def |(b: nk_allocation_type): nk_allocation_type = a | b
    inline def is(b: nk_allocation_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_anti_aliasing = CUnsignedInt
object nk_anti_aliasing extends CEnumU[nk_anti_aliasing]:
  given _tag: Tag[nk_anti_aliasing] = Tag.UInt
  inline def define(inline a: Long): nk_anti_aliasing = a.toUInt
  val NK_ANTI_ALIASING_OFF = define(0)
  val NK_ANTI_ALIASING_ON = define(1)
  inline def getName(inline value: nk_anti_aliasing): Option[String] =
    inline value match
      case NK_ANTI_ALIASING_OFF => Some("NK_ANTI_ALIASING_OFF")
      case NK_ANTI_ALIASING_ON => Some("NK_ANTI_ALIASING_ON")
      case _ => None
  extension (a: nk_anti_aliasing)
    inline def &(b: nk_anti_aliasing): nk_anti_aliasing = a & b
    inline def |(b: nk_anti_aliasing): nk_anti_aliasing = a | b
    inline def is(b: nk_anti_aliasing): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_buffer_allocation_type = CUnsignedInt
object nk_buffer_allocation_type extends CEnumU[nk_buffer_allocation_type]:
  given _tag: Tag[nk_buffer_allocation_type] = Tag.UInt
  inline def define(inline a: Long): nk_buffer_allocation_type = a.toUInt
  val NK_BUFFER_FRONT = define(0)
  val NK_BUFFER_BACK = define(1)
  val NK_BUFFER_MAX = define(2)
  inline def getName(inline value: nk_buffer_allocation_type): Option[String] =
    inline value match
      case NK_BUFFER_FRONT => Some("NK_BUFFER_FRONT")
      case NK_BUFFER_BACK => Some("NK_BUFFER_BACK")
      case NK_BUFFER_MAX => Some("NK_BUFFER_MAX")
      case _ => None
  extension (a: nk_buffer_allocation_type)
    inline def &(b: nk_buffer_allocation_type): nk_buffer_allocation_type = a & b
    inline def |(b: nk_buffer_allocation_type): nk_buffer_allocation_type = a | b
    inline def is(b: nk_buffer_allocation_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_button_behavior = CUnsignedInt
object nk_button_behavior extends CEnumU[nk_button_behavior]:
  given _tag: Tag[nk_button_behavior] = Tag.UInt
  inline def define(inline a: Long): nk_button_behavior = a.toUInt
  val NK_BUTTON_DEFAULT = define(0)
  val NK_BUTTON_REPEATER = define(1)
  inline def getName(inline value: nk_button_behavior): Option[String] =
    inline value match
      case NK_BUTTON_DEFAULT => Some("NK_BUTTON_DEFAULT")
      case NK_BUTTON_REPEATER => Some("NK_BUTTON_REPEATER")
      case _ => None
  extension (a: nk_button_behavior)
    inline def &(b: nk_button_behavior): nk_button_behavior = a & b
    inline def |(b: nk_button_behavior): nk_button_behavior = a | b
    inline def is(b: nk_button_behavior): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_buttons = CUnsignedInt
object nk_buttons extends CEnumU[nk_buttons]:
  given _tag: Tag[nk_buttons] = Tag.UInt
  inline def define(inline a: Long): nk_buttons = a.toUInt
  val NK_BUTTON_LEFT = define(0)
  val NK_BUTTON_MIDDLE = define(1)
  val NK_BUTTON_RIGHT = define(2)
  val NK_BUTTON_DOUBLE = define(3)
  val NK_BUTTON_MAX = define(4)
  inline def getName(inline value: nk_buttons): Option[String] =
    inline value match
      case NK_BUTTON_LEFT => Some("NK_BUTTON_LEFT")
      case NK_BUTTON_MIDDLE => Some("NK_BUTTON_MIDDLE")
      case NK_BUTTON_RIGHT => Some("NK_BUTTON_RIGHT")
      case NK_BUTTON_DOUBLE => Some("NK_BUTTON_DOUBLE")
      case NK_BUTTON_MAX => Some("NK_BUTTON_MAX")
      case _ => None
  extension (a: nk_buttons)
    inline def &(b: nk_buttons): nk_buttons = a & b
    inline def |(b: nk_buttons): nk_buttons = a | b
    inline def is(b: nk_buttons): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_chart_event = CUnsignedInt
object nk_chart_event extends CEnumU[nk_chart_event]:
  given _tag: Tag[nk_chart_event] = Tag.UInt
  inline def define(inline a: Long): nk_chart_event = a.toUInt
  val NK_CHART_HOVERING = define(1)
  val NK_CHART_CLICKED = define(2)
  inline def getName(inline value: nk_chart_event): Option[String] =
    inline value match
      case NK_CHART_HOVERING => Some("NK_CHART_HOVERING")
      case NK_CHART_CLICKED => Some("NK_CHART_CLICKED")
      case _ => None
  extension (a: nk_chart_event)
    inline def &(b: nk_chart_event): nk_chart_event = a & b
    inline def |(b: nk_chart_event): nk_chart_event = a | b
    inline def is(b: nk_chart_event): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_chart_type = CUnsignedInt
object nk_chart_type extends CEnumU[nk_chart_type]:
  given _tag: Tag[nk_chart_type] = Tag.UInt
  inline def define(inline a: Long): nk_chart_type = a.toUInt
  val NK_CHART_LINES = define(0)
  val NK_CHART_COLUMN = define(1)
  val NK_CHART_MAX = define(2)
  inline def getName(inline value: nk_chart_type): Option[String] =
    inline value match
      case NK_CHART_LINES => Some("NK_CHART_LINES")
      case NK_CHART_COLUMN => Some("NK_CHART_COLUMN")
      case NK_CHART_MAX => Some("NK_CHART_MAX")
      case _ => None
  extension (a: nk_chart_type)
    inline def &(b: nk_chart_type): nk_chart_type = a & b
    inline def |(b: nk_chart_type): nk_chart_type = a | b
    inline def is(b: nk_chart_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_collapse_states = CUnsignedInt
object nk_collapse_states extends CEnumU[nk_collapse_states]:
  given _tag: Tag[nk_collapse_states] = Tag.UInt
  inline def define(inline a: Long): nk_collapse_states = a.toUInt
  val NK_MINIMIZED = define(0)
  val NK_MAXIMIZED = define(1)
  inline def getName(inline value: nk_collapse_states): Option[String] =
    inline value match
      case NK_MINIMIZED => Some("NK_MINIMIZED")
      case NK_MAXIMIZED => Some("NK_MAXIMIZED")
      case _ => None
  extension (a: nk_collapse_states)
    inline def &(b: nk_collapse_states): nk_collapse_states = a & b
    inline def |(b: nk_collapse_states): nk_collapse_states = a | b
    inline def is(b: nk_collapse_states): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_color_format = CUnsignedInt
object nk_color_format extends CEnumU[nk_color_format]:
  given _tag: Tag[nk_color_format] = Tag.UInt
  inline def define(inline a: Long): nk_color_format = a.toUInt
  val NK_RGB = define(0)
  val NK_RGBA = define(1)
  inline def getName(inline value: nk_color_format): Option[String] =
    inline value match
      case NK_RGB => Some("NK_RGB")
      case NK_RGBA => Some("NK_RGBA")
      case _ => None
  extension (a: nk_color_format)
    inline def &(b: nk_color_format): nk_color_format = a & b
    inline def |(b: nk_color_format): nk_color_format = a | b
    inline def is(b: nk_color_format): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_command_clipping = CUnsignedInt
object nk_command_clipping extends CEnumU[nk_command_clipping]:
  given _tag: Tag[nk_command_clipping] = Tag.UInt
  inline def define(inline a: Long): nk_command_clipping = a.toUInt
  val NK_CLIPPING_OFF = define(0)
  val NK_CLIPPING_ON = define(1)
  inline def getName(inline value: nk_command_clipping): Option[String] =
    inline value match
      case NK_CLIPPING_OFF => Some("NK_CLIPPING_OFF")
      case NK_CLIPPING_ON => Some("NK_CLIPPING_ON")
      case _ => None
  extension (a: nk_command_clipping)
    inline def &(b: nk_command_clipping): nk_command_clipping = a & b
    inline def |(b: nk_command_clipping): nk_command_clipping = a | b
    inline def is(b: nk_command_clipping): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_command_type = CUnsignedInt
object nk_command_type extends CEnumU[nk_command_type]:
  given _tag: Tag[nk_command_type] = Tag.UInt
  inline def define(inline a: Long): nk_command_type = a.toUInt
  val NK_COMMAND_NOP = define(0)
  val NK_COMMAND_SCISSOR = define(1)
  val NK_COMMAND_LINE = define(2)
  val NK_COMMAND_CURVE = define(3)
  val NK_COMMAND_RECT = define(4)
  val NK_COMMAND_RECT_FILLED = define(5)
  val NK_COMMAND_RECT_MULTI_COLOR = define(6)
  val NK_COMMAND_CIRCLE = define(7)
  val NK_COMMAND_CIRCLE_FILLED = define(8)
  val NK_COMMAND_ARC = define(9)
  val NK_COMMAND_ARC_FILLED = define(10)
  val NK_COMMAND_TRIANGLE = define(11)
  val NK_COMMAND_TRIANGLE_FILLED = define(12)
  val NK_COMMAND_POLYGON = define(13)
  val NK_COMMAND_POLYGON_FILLED = define(14)
  val NK_COMMAND_POLYLINE = define(15)
  val NK_COMMAND_TEXT = define(16)
  val NK_COMMAND_IMAGE = define(17)
  val NK_COMMAND_CUSTOM = define(18)
  inline def getName(inline value: nk_command_type): Option[String] =
    inline value match
      case NK_COMMAND_NOP => Some("NK_COMMAND_NOP")
      case NK_COMMAND_SCISSOR => Some("NK_COMMAND_SCISSOR")
      case NK_COMMAND_LINE => Some("NK_COMMAND_LINE")
      case NK_COMMAND_CURVE => Some("NK_COMMAND_CURVE")
      case NK_COMMAND_RECT => Some("NK_COMMAND_RECT")
      case NK_COMMAND_RECT_FILLED => Some("NK_COMMAND_RECT_FILLED")
      case NK_COMMAND_RECT_MULTI_COLOR => Some("NK_COMMAND_RECT_MULTI_COLOR")
      case NK_COMMAND_CIRCLE => Some("NK_COMMAND_CIRCLE")
      case NK_COMMAND_CIRCLE_FILLED => Some("NK_COMMAND_CIRCLE_FILLED")
      case NK_COMMAND_ARC => Some("NK_COMMAND_ARC")
      case NK_COMMAND_ARC_FILLED => Some("NK_COMMAND_ARC_FILLED")
      case NK_COMMAND_TRIANGLE => Some("NK_COMMAND_TRIANGLE")
      case NK_COMMAND_TRIANGLE_FILLED => Some("NK_COMMAND_TRIANGLE_FILLED")
      case NK_COMMAND_POLYGON => Some("NK_COMMAND_POLYGON")
      case NK_COMMAND_POLYGON_FILLED => Some("NK_COMMAND_POLYGON_FILLED")
      case NK_COMMAND_POLYLINE => Some("NK_COMMAND_POLYLINE")
      case NK_COMMAND_TEXT => Some("NK_COMMAND_TEXT")
      case NK_COMMAND_IMAGE => Some("NK_COMMAND_IMAGE")
      case NK_COMMAND_CUSTOM => Some("NK_COMMAND_CUSTOM")
      case _ => None
  extension (a: nk_command_type)
    inline def &(b: nk_command_type): nk_command_type = a & b
    inline def |(b: nk_command_type): nk_command_type = a | b
    inline def is(b: nk_command_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_convert_result = CUnsignedInt
object nk_convert_result extends CEnumU[nk_convert_result]:
  given _tag: Tag[nk_convert_result] = Tag.UInt
  inline def define(inline a: Long): nk_convert_result = a.toUInt
  val NK_CONVERT_SUCCESS = define(0)
  val NK_CONVERT_INVALID_PARAM = define(1)
  val NK_CONVERT_COMMAND_BUFFER_FULL = define(2)
  val NK_CONVERT_VERTEX_BUFFER_FULL = define(4)
  val NK_CONVERT_ELEMENT_BUFFER_FULL = define(8)
  inline def getName(inline value: nk_convert_result): Option[String] =
    inline value match
      case NK_CONVERT_SUCCESS => Some("NK_CONVERT_SUCCESS")
      case NK_CONVERT_INVALID_PARAM => Some("NK_CONVERT_INVALID_PARAM")
      case NK_CONVERT_COMMAND_BUFFER_FULL => Some("NK_CONVERT_COMMAND_BUFFER_FULL")
      case NK_CONVERT_VERTEX_BUFFER_FULL => Some("NK_CONVERT_VERTEX_BUFFER_FULL")
      case NK_CONVERT_ELEMENT_BUFFER_FULL => Some("NK_CONVERT_ELEMENT_BUFFER_FULL")
      case _ => None
  extension (a: nk_convert_result)
    inline def &(b: nk_convert_result): nk_convert_result = a & b
    inline def |(b: nk_convert_result): nk_convert_result = a | b
    inline def is(b: nk_convert_result): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_edit_events = CUnsignedInt
object nk_edit_events extends CEnumU[nk_edit_events]:
  given _tag: Tag[nk_edit_events] = Tag.UInt
  inline def define(inline a: Long): nk_edit_events = a.toUInt
  val NK_EDIT_ACTIVE = define(1)
  val NK_EDIT_INACTIVE = define(2)
  val NK_EDIT_ACTIVATED = define(4)
  val NK_EDIT_DEACTIVATED = define(8)
  val NK_EDIT_COMMITED = define(16)
  inline def getName(inline value: nk_edit_events): Option[String] =
    inline value match
      case NK_EDIT_ACTIVE => Some("NK_EDIT_ACTIVE")
      case NK_EDIT_INACTIVE => Some("NK_EDIT_INACTIVE")
      case NK_EDIT_ACTIVATED => Some("NK_EDIT_ACTIVATED")
      case NK_EDIT_DEACTIVATED => Some("NK_EDIT_DEACTIVATED")
      case NK_EDIT_COMMITED => Some("NK_EDIT_COMMITED")
      case _ => None
  extension (a: nk_edit_events)
    inline def &(b: nk_edit_events): nk_edit_events = a & b
    inline def |(b: nk_edit_events): nk_edit_events = a | b
    inline def is(b: nk_edit_events): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_edit_flags = CUnsignedInt
object nk_edit_flags extends CEnumU[nk_edit_flags]:
  given _tag: Tag[nk_edit_flags] = Tag.UInt
  inline def define(inline a: Long): nk_edit_flags = a.toUInt
  val NK_EDIT_DEFAULT = define(0)
  val NK_EDIT_READ_ONLY = define(1)
  val NK_EDIT_AUTO_SELECT = define(2)
  val NK_EDIT_SIG_ENTER = define(4)
  val NK_EDIT_ALLOW_TAB = define(8)
  val NK_EDIT_NO_CURSOR = define(16)
  val NK_EDIT_SELECTABLE = define(32)
  val NK_EDIT_CLIPBOARD = define(64)
  val NK_EDIT_CTRL_ENTER_NEWLINE = define(128)
  val NK_EDIT_NO_HORIZONTAL_SCROLL = define(256)
  val NK_EDIT_ALWAYS_INSERT_MODE = define(512)
  val NK_EDIT_MULTILINE = define(1024)
  val NK_EDIT_GOTO_END_ON_ACTIVATE = define(2048)
  inline def getName(inline value: nk_edit_flags): Option[String] =
    inline value match
      case NK_EDIT_DEFAULT => Some("NK_EDIT_DEFAULT")
      case NK_EDIT_READ_ONLY => Some("NK_EDIT_READ_ONLY")
      case NK_EDIT_AUTO_SELECT => Some("NK_EDIT_AUTO_SELECT")
      case NK_EDIT_SIG_ENTER => Some("NK_EDIT_SIG_ENTER")
      case NK_EDIT_ALLOW_TAB => Some("NK_EDIT_ALLOW_TAB")
      case NK_EDIT_NO_CURSOR => Some("NK_EDIT_NO_CURSOR")
      case NK_EDIT_SELECTABLE => Some("NK_EDIT_SELECTABLE")
      case NK_EDIT_CLIPBOARD => Some("NK_EDIT_CLIPBOARD")
      case NK_EDIT_CTRL_ENTER_NEWLINE => Some("NK_EDIT_CTRL_ENTER_NEWLINE")
      case NK_EDIT_NO_HORIZONTAL_SCROLL => Some("NK_EDIT_NO_HORIZONTAL_SCROLL")
      case NK_EDIT_ALWAYS_INSERT_MODE => Some("NK_EDIT_ALWAYS_INSERT_MODE")
      case NK_EDIT_MULTILINE => Some("NK_EDIT_MULTILINE")
      case NK_EDIT_GOTO_END_ON_ACTIVATE => Some("NK_EDIT_GOTO_END_ON_ACTIVATE")
      case _ => None
  extension (a: nk_edit_flags)
    inline def &(b: nk_edit_flags): nk_edit_flags = a & b
    inline def |(b: nk_edit_flags): nk_edit_flags = a | b
    inline def is(b: nk_edit_flags): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_edit_types = CUnsignedInt
object nk_edit_types extends CEnumU[nk_edit_types]:
  given _tag: Tag[nk_edit_types] = Tag.UInt
  inline def define(inline a: Long): nk_edit_types = a.toUInt
  val NK_EDIT_SIMPLE = define(512)
  val NK_EDIT_FIELD = define(608)
  val NK_EDIT_BOX = define(1640)
  val NK_EDIT_EDITOR = define(1128)
  inline def getName(inline value: nk_edit_types): Option[String] =
    inline value match
      case NK_EDIT_SIMPLE => Some("NK_EDIT_SIMPLE")
      case NK_EDIT_FIELD => Some("NK_EDIT_FIELD")
      case NK_EDIT_BOX => Some("NK_EDIT_BOX")
      case NK_EDIT_EDITOR => Some("NK_EDIT_EDITOR")
      case _ => None
  extension (a: nk_edit_types)
    inline def &(b: nk_edit_types): nk_edit_types = a & b
    inline def |(b: nk_edit_types): nk_edit_types = a | b
    inline def is(b: nk_edit_types): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_heading = CUnsignedInt
object nk_heading extends CEnumU[nk_heading]:
  given _tag: Tag[nk_heading] = Tag.UInt
  inline def define(inline a: Long): nk_heading = a.toUInt
  val NK_UP = define(0)
  val NK_RIGHT = define(1)
  val NK_DOWN = define(2)
  val NK_LEFT = define(3)
  inline def getName(inline value: nk_heading): Option[String] =
    inline value match
      case NK_UP => Some("NK_UP")
      case NK_RIGHT => Some("NK_RIGHT")
      case NK_DOWN => Some("NK_DOWN")
      case NK_LEFT => Some("NK_LEFT")
      case _ => None
  extension (a: nk_heading)
    inline def &(b: nk_heading): nk_heading = a & b
    inline def |(b: nk_heading): nk_heading = a | b
    inline def is(b: nk_heading): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_keys = CUnsignedInt
object nk_keys extends CEnumU[nk_keys]:
  given _tag: Tag[nk_keys] = Tag.UInt
  inline def define(inline a: Long): nk_keys = a.toUInt
  val NK_KEY_NONE = define(0)
  val NK_KEY_SHIFT = define(1)
  val NK_KEY_CTRL = define(2)
  val NK_KEY_DEL = define(3)
  val NK_KEY_ENTER = define(4)
  val NK_KEY_TAB = define(5)
  val NK_KEY_BACKSPACE = define(6)
  val NK_KEY_COPY = define(7)
  val NK_KEY_CUT = define(8)
  val NK_KEY_PASTE = define(9)
  val NK_KEY_UP = define(10)
  val NK_KEY_DOWN = define(11)
  val NK_KEY_LEFT = define(12)
  val NK_KEY_RIGHT = define(13)
  val NK_KEY_TEXT_INSERT_MODE = define(14)
  val NK_KEY_TEXT_REPLACE_MODE = define(15)
  val NK_KEY_TEXT_RESET_MODE = define(16)
  val NK_KEY_TEXT_LINE_START = define(17)
  val NK_KEY_TEXT_LINE_END = define(18)
  val NK_KEY_TEXT_START = define(19)
  val NK_KEY_TEXT_END = define(20)
  val NK_KEY_TEXT_UNDO = define(21)
  val NK_KEY_TEXT_REDO = define(22)
  val NK_KEY_TEXT_SELECT_ALL = define(23)
  val NK_KEY_TEXT_WORD_LEFT = define(24)
  val NK_KEY_TEXT_WORD_RIGHT = define(25)
  val NK_KEY_SCROLL_START = define(26)
  val NK_KEY_SCROLL_END = define(27)
  val NK_KEY_SCROLL_DOWN = define(28)
  val NK_KEY_SCROLL_UP = define(29)
  val NK_KEY_MAX = define(30)
  inline def getName(inline value: nk_keys): Option[String] =
    inline value match
      case NK_KEY_NONE => Some("NK_KEY_NONE")
      case NK_KEY_SHIFT => Some("NK_KEY_SHIFT")
      case NK_KEY_CTRL => Some("NK_KEY_CTRL")
      case NK_KEY_DEL => Some("NK_KEY_DEL")
      case NK_KEY_ENTER => Some("NK_KEY_ENTER")
      case NK_KEY_TAB => Some("NK_KEY_TAB")
      case NK_KEY_BACKSPACE => Some("NK_KEY_BACKSPACE")
      case NK_KEY_COPY => Some("NK_KEY_COPY")
      case NK_KEY_CUT => Some("NK_KEY_CUT")
      case NK_KEY_PASTE => Some("NK_KEY_PASTE")
      case NK_KEY_UP => Some("NK_KEY_UP")
      case NK_KEY_DOWN => Some("NK_KEY_DOWN")
      case NK_KEY_LEFT => Some("NK_KEY_LEFT")
      case NK_KEY_RIGHT => Some("NK_KEY_RIGHT")
      case NK_KEY_TEXT_INSERT_MODE => Some("NK_KEY_TEXT_INSERT_MODE")
      case NK_KEY_TEXT_REPLACE_MODE => Some("NK_KEY_TEXT_REPLACE_MODE")
      case NK_KEY_TEXT_RESET_MODE => Some("NK_KEY_TEXT_RESET_MODE")
      case NK_KEY_TEXT_LINE_START => Some("NK_KEY_TEXT_LINE_START")
      case NK_KEY_TEXT_LINE_END => Some("NK_KEY_TEXT_LINE_END")
      case NK_KEY_TEXT_START => Some("NK_KEY_TEXT_START")
      case NK_KEY_TEXT_END => Some("NK_KEY_TEXT_END")
      case NK_KEY_TEXT_UNDO => Some("NK_KEY_TEXT_UNDO")
      case NK_KEY_TEXT_REDO => Some("NK_KEY_TEXT_REDO")
      case NK_KEY_TEXT_SELECT_ALL => Some("NK_KEY_TEXT_SELECT_ALL")
      case NK_KEY_TEXT_WORD_LEFT => Some("NK_KEY_TEXT_WORD_LEFT")
      case NK_KEY_TEXT_WORD_RIGHT => Some("NK_KEY_TEXT_WORD_RIGHT")
      case NK_KEY_SCROLL_START => Some("NK_KEY_SCROLL_START")
      case NK_KEY_SCROLL_END => Some("NK_KEY_SCROLL_END")
      case NK_KEY_SCROLL_DOWN => Some("NK_KEY_SCROLL_DOWN")
      case NK_KEY_SCROLL_UP => Some("NK_KEY_SCROLL_UP")
      case NK_KEY_MAX => Some("NK_KEY_MAX")
      case _ => None
  extension (a: nk_keys)
    inline def &(b: nk_keys): nk_keys = a & b
    inline def |(b: nk_keys): nk_keys = a | b
    inline def is(b: nk_keys): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_layout_format = CUnsignedInt
object nk_layout_format extends CEnumU[nk_layout_format]:
  given _tag: Tag[nk_layout_format] = Tag.UInt
  inline def define(inline a: Long): nk_layout_format = a.toUInt
  val NK_DYNAMIC = define(0)
  val NK_STATIC = define(1)
  inline def getName(inline value: nk_layout_format): Option[String] =
    inline value match
      case NK_DYNAMIC => Some("NK_DYNAMIC")
      case NK_STATIC => Some("NK_STATIC")
      case _ => None
  extension (a: nk_layout_format)
    inline def &(b: nk_layout_format): nk_layout_format = a & b
    inline def |(b: nk_layout_format): nk_layout_format = a | b
    inline def is(b: nk_layout_format): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_modify = CUnsignedInt
object nk_modify extends CEnumU[nk_modify]:
  given _tag: Tag[nk_modify] = Tag.UInt
  inline def define(inline a: Long): nk_modify = a.toUInt
  val NK_FIXED = define(0)
  val NK_MODIFIABLE = define(1)
  inline def getName(inline value: nk_modify): Option[String] =
    inline value match
      case NK_FIXED => Some("NK_FIXED")
      case NK_MODIFIABLE => Some("NK_MODIFIABLE")
      case _ => None
  extension (a: nk_modify)
    inline def &(b: nk_modify): nk_modify = a & b
    inline def |(b: nk_modify): nk_modify = a | b
    inline def is(b: nk_modify): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_orientation = CUnsignedInt
object nk_orientation extends CEnumU[nk_orientation]:
  given _tag: Tag[nk_orientation] = Tag.UInt
  inline def define(inline a: Long): nk_orientation = a.toUInt
  val NK_VERTICAL = define(0)
  val NK_HORIZONTAL = define(1)
  inline def getName(inline value: nk_orientation): Option[String] =
    inline value match
      case NK_VERTICAL => Some("NK_VERTICAL")
      case NK_HORIZONTAL => Some("NK_HORIZONTAL")
      case _ => None
  extension (a: nk_orientation)
    inline def &(b: nk_orientation): nk_orientation = a & b
    inline def |(b: nk_orientation): nk_orientation = a | b
    inline def is(b: nk_orientation): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_panel_flags = CUnsignedInt
object nk_panel_flags extends CEnumU[nk_panel_flags]:
  given _tag: Tag[nk_panel_flags] = Tag.UInt
  inline def define(inline a: Long): nk_panel_flags = a.toUInt
  val NK_WINDOW_BORDER = define(1)
  val NK_WINDOW_MOVABLE = define(2)
  val NK_WINDOW_SCALABLE = define(4)
  val NK_WINDOW_CLOSABLE = define(8)
  val NK_WINDOW_MINIMIZABLE = define(16)
  val NK_WINDOW_NO_SCROLLBAR = define(32)
  val NK_WINDOW_TITLE = define(64)
  val NK_WINDOW_SCROLL_AUTO_HIDE = define(128)
  val NK_WINDOW_BACKGROUND = define(256)
  val NK_WINDOW_SCALE_LEFT = define(512)
  val NK_WINDOW_NO_INPUT = define(1024)
  inline def getName(inline value: nk_panel_flags): Option[String] =
    inline value match
      case NK_WINDOW_BORDER => Some("NK_WINDOW_BORDER")
      case NK_WINDOW_MOVABLE => Some("NK_WINDOW_MOVABLE")
      case NK_WINDOW_SCALABLE => Some("NK_WINDOW_SCALABLE")
      case NK_WINDOW_CLOSABLE => Some("NK_WINDOW_CLOSABLE")
      case NK_WINDOW_MINIMIZABLE => Some("NK_WINDOW_MINIMIZABLE")
      case NK_WINDOW_NO_SCROLLBAR => Some("NK_WINDOW_NO_SCROLLBAR")
      case NK_WINDOW_TITLE => Some("NK_WINDOW_TITLE")
      case NK_WINDOW_SCROLL_AUTO_HIDE => Some("NK_WINDOW_SCROLL_AUTO_HIDE")
      case NK_WINDOW_BACKGROUND => Some("NK_WINDOW_BACKGROUND")
      case NK_WINDOW_SCALE_LEFT => Some("NK_WINDOW_SCALE_LEFT")
      case NK_WINDOW_NO_INPUT => Some("NK_WINDOW_NO_INPUT")
      case _ => None
  extension (a: nk_panel_flags)
    inline def &(b: nk_panel_flags): nk_panel_flags = a & b
    inline def |(b: nk_panel_flags): nk_panel_flags = a | b
    inline def is(b: nk_panel_flags): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_panel_row_layout_type = CUnsignedInt
object nk_panel_row_layout_type extends CEnumU[nk_panel_row_layout_type]:
  given _tag: Tag[nk_panel_row_layout_type] = Tag.UInt
  inline def define(inline a: Long): nk_panel_row_layout_type = a.toUInt
  val NK_LAYOUT_DYNAMIC_FIXED = define(0)
  val NK_LAYOUT_DYNAMIC_ROW = define(1)
  val NK_LAYOUT_DYNAMIC_FREE = define(2)
  val NK_LAYOUT_DYNAMIC = define(3)
  val NK_LAYOUT_STATIC_FIXED = define(4)
  val NK_LAYOUT_STATIC_ROW = define(5)
  val NK_LAYOUT_STATIC_FREE = define(6)
  val NK_LAYOUT_STATIC = define(7)
  val NK_LAYOUT_TEMPLATE = define(8)
  val NK_LAYOUT_COUNT = define(9)
  inline def getName(inline value: nk_panel_row_layout_type): Option[String] =
    inline value match
      case NK_LAYOUT_DYNAMIC_FIXED => Some("NK_LAYOUT_DYNAMIC_FIXED")
      case NK_LAYOUT_DYNAMIC_ROW => Some("NK_LAYOUT_DYNAMIC_ROW")
      case NK_LAYOUT_DYNAMIC_FREE => Some("NK_LAYOUT_DYNAMIC_FREE")
      case NK_LAYOUT_DYNAMIC => Some("NK_LAYOUT_DYNAMIC")
      case NK_LAYOUT_STATIC_FIXED => Some("NK_LAYOUT_STATIC_FIXED")
      case NK_LAYOUT_STATIC_ROW => Some("NK_LAYOUT_STATIC_ROW")
      case NK_LAYOUT_STATIC_FREE => Some("NK_LAYOUT_STATIC_FREE")
      case NK_LAYOUT_STATIC => Some("NK_LAYOUT_STATIC")
      case NK_LAYOUT_TEMPLATE => Some("NK_LAYOUT_TEMPLATE")
      case NK_LAYOUT_COUNT => Some("NK_LAYOUT_COUNT")
      case _ => None
  extension (a: nk_panel_row_layout_type)
    inline def &(b: nk_panel_row_layout_type): nk_panel_row_layout_type = a & b
    inline def |(b: nk_panel_row_layout_type): nk_panel_row_layout_type = a | b
    inline def is(b: nk_panel_row_layout_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_panel_set = CUnsignedInt
object nk_panel_set extends CEnumU[nk_panel_set]:
  given _tag: Tag[nk_panel_set] = Tag.UInt
  inline def define(inline a: Long): nk_panel_set = a.toUInt
  val NK_PANEL_SET_NONBLOCK = define(240)
  val NK_PANEL_SET_POPUP = define(244)
  val NK_PANEL_SET_SUB = define(246)
  inline def getName(inline value: nk_panel_set): Option[String] =
    inline value match
      case NK_PANEL_SET_NONBLOCK => Some("NK_PANEL_SET_NONBLOCK")
      case NK_PANEL_SET_POPUP => Some("NK_PANEL_SET_POPUP")
      case NK_PANEL_SET_SUB => Some("NK_PANEL_SET_SUB")
      case _ => None
  extension (a: nk_panel_set)
    inline def &(b: nk_panel_set): nk_panel_set = a & b
    inline def |(b: nk_panel_set): nk_panel_set = a | b
    inline def is(b: nk_panel_set): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_panel_type = CUnsignedInt
object nk_panel_type extends CEnumU[nk_panel_type]:
  given _tag: Tag[nk_panel_type] = Tag.UInt
  inline def define(inline a: Long): nk_panel_type = a.toUInt
  val NK_PANEL_NONE = define(0)
  val NK_PANEL_WINDOW = define(1)
  val NK_PANEL_GROUP = define(2)
  val NK_PANEL_POPUP = define(4)
  val NK_PANEL_CONTEXTUAL = define(16)
  val NK_PANEL_COMBO = define(32)
  val NK_PANEL_MENU = define(64)
  val NK_PANEL_TOOLTIP = define(128)
  inline def getName(inline value: nk_panel_type): Option[String] =
    inline value match
      case NK_PANEL_NONE => Some("NK_PANEL_NONE")
      case NK_PANEL_WINDOW => Some("NK_PANEL_WINDOW")
      case NK_PANEL_GROUP => Some("NK_PANEL_GROUP")
      case NK_PANEL_POPUP => Some("NK_PANEL_POPUP")
      case NK_PANEL_CONTEXTUAL => Some("NK_PANEL_CONTEXTUAL")
      case NK_PANEL_COMBO => Some("NK_PANEL_COMBO")
      case NK_PANEL_MENU => Some("NK_PANEL_MENU")
      case NK_PANEL_TOOLTIP => Some("NK_PANEL_TOOLTIP")
      case _ => None
  extension (a: nk_panel_type)
    inline def &(b: nk_panel_type): nk_panel_type = a & b
    inline def |(b: nk_panel_type): nk_panel_type = a | b
    inline def is(b: nk_panel_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_popup_type = CUnsignedInt
object nk_popup_type extends CEnumU[nk_popup_type]:
  given _tag: Tag[nk_popup_type] = Tag.UInt
  inline def define(inline a: Long): nk_popup_type = a.toUInt
  val NK_POPUP_STATIC = define(0)
  val NK_POPUP_DYNAMIC = define(1)
  inline def getName(inline value: nk_popup_type): Option[String] =
    inline value match
      case NK_POPUP_STATIC => Some("NK_POPUP_STATIC")
      case NK_POPUP_DYNAMIC => Some("NK_POPUP_DYNAMIC")
      case _ => None
  extension (a: nk_popup_type)
    inline def &(b: nk_popup_type): nk_popup_type = a & b
    inline def |(b: nk_popup_type): nk_popup_type = a | b
    inline def is(b: nk_popup_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_property_filter = CUnsignedInt
object nk_property_filter extends CEnumU[nk_property_filter]:
  given _tag: Tag[nk_property_filter] = Tag.UInt
  inline def define(inline a: Long): nk_property_filter = a.toUInt
  val NK_FILTER_INT = define(0)
  val NK_FILTER_FLOAT = define(1)
  inline def getName(inline value: nk_property_filter): Option[String] =
    inline value match
      case NK_FILTER_INT => Some("NK_FILTER_INT")
      case NK_FILTER_FLOAT => Some("NK_FILTER_FLOAT")
      case _ => None
  extension (a: nk_property_filter)
    inline def &(b: nk_property_filter): nk_property_filter = a & b
    inline def |(b: nk_property_filter): nk_property_filter = a | b
    inline def is(b: nk_property_filter): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_property_kind = CUnsignedInt
object nk_property_kind extends CEnumU[nk_property_kind]:
  given _tag: Tag[nk_property_kind] = Tag.UInt
  inline def define(inline a: Long): nk_property_kind = a.toUInt
  val NK_PROPERTY_INT = define(0)
  val NK_PROPERTY_FLOAT = define(1)
  val NK_PROPERTY_DOUBLE = define(2)
  inline def getName(inline value: nk_property_kind): Option[String] =
    inline value match
      case NK_PROPERTY_INT => Some("NK_PROPERTY_INT")
      case NK_PROPERTY_FLOAT => Some("NK_PROPERTY_FLOAT")
      case NK_PROPERTY_DOUBLE => Some("NK_PROPERTY_DOUBLE")
      case _ => None
  extension (a: nk_property_kind)
    inline def &(b: nk_property_kind): nk_property_kind = a & b
    inline def |(b: nk_property_kind): nk_property_kind = a | b
    inline def is(b: nk_property_kind): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_property_status = CUnsignedInt
object nk_property_status extends CEnumU[nk_property_status]:
  given _tag: Tag[nk_property_status] = Tag.UInt
  inline def define(inline a: Long): nk_property_status = a.toUInt
  val NK_PROPERTY_DEFAULT = define(0)
  val NK_PROPERTY_EDIT = define(1)
  val NK_PROPERTY_DRAG = define(2)
  inline def getName(inline value: nk_property_status): Option[String] =
    inline value match
      case NK_PROPERTY_DEFAULT => Some("NK_PROPERTY_DEFAULT")
      case NK_PROPERTY_EDIT => Some("NK_PROPERTY_EDIT")
      case NK_PROPERTY_DRAG => Some("NK_PROPERTY_DRAG")
      case _ => None
  extension (a: nk_property_status)
    inline def &(b: nk_property_status): nk_property_status = a & b
    inline def |(b: nk_property_status): nk_property_status = a | b
    inline def is(b: nk_property_status): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_show_states = CUnsignedInt
object nk_show_states extends CEnumU[nk_show_states]:
  given _tag: Tag[nk_show_states] = Tag.UInt
  inline def define(inline a: Long): nk_show_states = a.toUInt
  val NK_HIDDEN = define(0)
  val NK_SHOWN = define(1)
  inline def getName(inline value: nk_show_states): Option[String] =
    inline value match
      case NK_HIDDEN => Some("NK_HIDDEN")
      case NK_SHOWN => Some("NK_SHOWN")
      case _ => None
  extension (a: nk_show_states)
    inline def &(b: nk_show_states): nk_show_states = a & b
    inline def |(b: nk_show_states): nk_show_states = a | b
    inline def is(b: nk_show_states): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_style_colors = CUnsignedInt
object nk_style_colors extends CEnumU[nk_style_colors]:
  given _tag: Tag[nk_style_colors] = Tag.UInt
  inline def define(inline a: Long): nk_style_colors = a.toUInt
  val NK_COLOR_TEXT = define(0)
  val NK_COLOR_WINDOW = define(1)
  val NK_COLOR_HEADER = define(2)
  val NK_COLOR_BORDER = define(3)
  val NK_COLOR_BUTTON = define(4)
  val NK_COLOR_BUTTON_HOVER = define(5)
  val NK_COLOR_BUTTON_ACTIVE = define(6)
  val NK_COLOR_TOGGLE = define(7)
  val NK_COLOR_TOGGLE_HOVER = define(8)
  val NK_COLOR_TOGGLE_CURSOR = define(9)
  val NK_COLOR_SELECT = define(10)
  val NK_COLOR_SELECT_ACTIVE = define(11)
  val NK_COLOR_SLIDER = define(12)
  val NK_COLOR_SLIDER_CURSOR = define(13)
  val NK_COLOR_SLIDER_CURSOR_HOVER = define(14)
  val NK_COLOR_SLIDER_CURSOR_ACTIVE = define(15)
  val NK_COLOR_PROPERTY = define(16)
  val NK_COLOR_EDIT = define(17)
  val NK_COLOR_EDIT_CURSOR = define(18)
  val NK_COLOR_COMBO = define(19)
  val NK_COLOR_CHART = define(20)
  val NK_COLOR_CHART_COLOR = define(21)
  val NK_COLOR_CHART_COLOR_HIGHLIGHT = define(22)
  val NK_COLOR_SCROLLBAR = define(23)
  val NK_COLOR_SCROLLBAR_CURSOR = define(24)
  val NK_COLOR_SCROLLBAR_CURSOR_HOVER = define(25)
  val NK_COLOR_SCROLLBAR_CURSOR_ACTIVE = define(26)
  val NK_COLOR_TAB_HEADER = define(27)
  val NK_COLOR_COUNT = define(28)
  inline def getName(inline value: nk_style_colors): Option[String] =
    inline value match
      case NK_COLOR_TEXT => Some("NK_COLOR_TEXT")
      case NK_COLOR_WINDOW => Some("NK_COLOR_WINDOW")
      case NK_COLOR_HEADER => Some("NK_COLOR_HEADER")
      case NK_COLOR_BORDER => Some("NK_COLOR_BORDER")
      case NK_COLOR_BUTTON => Some("NK_COLOR_BUTTON")
      case NK_COLOR_BUTTON_HOVER => Some("NK_COLOR_BUTTON_HOVER")
      case NK_COLOR_BUTTON_ACTIVE => Some("NK_COLOR_BUTTON_ACTIVE")
      case NK_COLOR_TOGGLE => Some("NK_COLOR_TOGGLE")
      case NK_COLOR_TOGGLE_HOVER => Some("NK_COLOR_TOGGLE_HOVER")
      case NK_COLOR_TOGGLE_CURSOR => Some("NK_COLOR_TOGGLE_CURSOR")
      case NK_COLOR_SELECT => Some("NK_COLOR_SELECT")
      case NK_COLOR_SELECT_ACTIVE => Some("NK_COLOR_SELECT_ACTIVE")
      case NK_COLOR_SLIDER => Some("NK_COLOR_SLIDER")
      case NK_COLOR_SLIDER_CURSOR => Some("NK_COLOR_SLIDER_CURSOR")
      case NK_COLOR_SLIDER_CURSOR_HOVER => Some("NK_COLOR_SLIDER_CURSOR_HOVER")
      case NK_COLOR_SLIDER_CURSOR_ACTIVE => Some("NK_COLOR_SLIDER_CURSOR_ACTIVE")
      case NK_COLOR_PROPERTY => Some("NK_COLOR_PROPERTY")
      case NK_COLOR_EDIT => Some("NK_COLOR_EDIT")
      case NK_COLOR_EDIT_CURSOR => Some("NK_COLOR_EDIT_CURSOR")
      case NK_COLOR_COMBO => Some("NK_COLOR_COMBO")
      case NK_COLOR_CHART => Some("NK_COLOR_CHART")
      case NK_COLOR_CHART_COLOR => Some("NK_COLOR_CHART_COLOR")
      case NK_COLOR_CHART_COLOR_HIGHLIGHT => Some("NK_COLOR_CHART_COLOR_HIGHLIGHT")
      case NK_COLOR_SCROLLBAR => Some("NK_COLOR_SCROLLBAR")
      case NK_COLOR_SCROLLBAR_CURSOR => Some("NK_COLOR_SCROLLBAR_CURSOR")
      case NK_COLOR_SCROLLBAR_CURSOR_HOVER => Some("NK_COLOR_SCROLLBAR_CURSOR_HOVER")
      case NK_COLOR_SCROLLBAR_CURSOR_ACTIVE => Some("NK_COLOR_SCROLLBAR_CURSOR_ACTIVE")
      case NK_COLOR_TAB_HEADER => Some("NK_COLOR_TAB_HEADER")
      case NK_COLOR_COUNT => Some("NK_COLOR_COUNT")
      case _ => None
  extension (a: nk_style_colors)
    inline def &(b: nk_style_colors): nk_style_colors = a & b
    inline def |(b: nk_style_colors): nk_style_colors = a | b
    inline def is(b: nk_style_colors): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_style_cursor = CUnsignedInt
object nk_style_cursor extends CEnumU[nk_style_cursor]:
  given _tag: Tag[nk_style_cursor] = Tag.UInt
  inline def define(inline a: Long): nk_style_cursor = a.toUInt
  val NK_CURSOR_ARROW = define(0)
  val NK_CURSOR_TEXT = define(1)
  val NK_CURSOR_MOVE = define(2)
  val NK_CURSOR_RESIZE_VERTICAL = define(3)
  val NK_CURSOR_RESIZE_HORIZONTAL = define(4)
  val NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT = define(5)
  val NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT = define(6)
  val NK_CURSOR_COUNT = define(7)
  inline def getName(inline value: nk_style_cursor): Option[String] =
    inline value match
      case NK_CURSOR_ARROW => Some("NK_CURSOR_ARROW")
      case NK_CURSOR_TEXT => Some("NK_CURSOR_TEXT")
      case NK_CURSOR_MOVE => Some("NK_CURSOR_MOVE")
      case NK_CURSOR_RESIZE_VERTICAL => Some("NK_CURSOR_RESIZE_VERTICAL")
      case NK_CURSOR_RESIZE_HORIZONTAL => Some("NK_CURSOR_RESIZE_HORIZONTAL")
      case NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT => Some("NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT")
      case NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT => Some("NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT")
      case NK_CURSOR_COUNT => Some("NK_CURSOR_COUNT")
      case _ => None
  extension (a: nk_style_cursor)
    inline def &(b: nk_style_cursor): nk_style_cursor = a & b
    inline def |(b: nk_style_cursor): nk_style_cursor = a | b
    inline def is(b: nk_style_cursor): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_style_header_align = CUnsignedInt
object nk_style_header_align extends CEnumU[nk_style_header_align]:
  given _tag: Tag[nk_style_header_align] = Tag.UInt
  inline def define(inline a: Long): nk_style_header_align = a.toUInt
  val NK_HEADER_LEFT = define(0)
  val NK_HEADER_RIGHT = define(1)
  inline def getName(inline value: nk_style_header_align): Option[String] =
    inline value match
      case NK_HEADER_LEFT => Some("NK_HEADER_LEFT")
      case NK_HEADER_RIGHT => Some("NK_HEADER_RIGHT")
      case _ => None
  extension (a: nk_style_header_align)
    inline def &(b: nk_style_header_align): nk_style_header_align = a & b
    inline def |(b: nk_style_header_align): nk_style_header_align = a | b
    inline def is(b: nk_style_header_align): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_style_item_type = CUnsignedInt
object nk_style_item_type extends CEnumU[nk_style_item_type]:
  given _tag: Tag[nk_style_item_type] = Tag.UInt
  inline def define(inline a: Long): nk_style_item_type = a.toUInt
  val NK_STYLE_ITEM_COLOR = define(0)
  val NK_STYLE_ITEM_IMAGE = define(1)
  val NK_STYLE_ITEM_NINE_SLICE = define(2)
  inline def getName(inline value: nk_style_item_type): Option[String] =
    inline value match
      case NK_STYLE_ITEM_COLOR => Some("NK_STYLE_ITEM_COLOR")
      case NK_STYLE_ITEM_IMAGE => Some("NK_STYLE_ITEM_IMAGE")
      case NK_STYLE_ITEM_NINE_SLICE => Some("NK_STYLE_ITEM_NINE_SLICE")
      case _ => None
  extension (a: nk_style_item_type)
    inline def &(b: nk_style_item_type): nk_style_item_type = a & b
    inline def |(b: nk_style_item_type): nk_style_item_type = a | b
    inline def is(b: nk_style_item_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_symbol_type = CUnsignedInt
object nk_symbol_type extends CEnumU[nk_symbol_type]:
  given _tag: Tag[nk_symbol_type] = Tag.UInt
  inline def define(inline a: Long): nk_symbol_type = a.toUInt
  val NK_SYMBOL_NONE = define(0)
  val NK_SYMBOL_X = define(1)
  val NK_SYMBOL_UNDERSCORE = define(2)
  val NK_SYMBOL_CIRCLE_SOLID = define(3)
  val NK_SYMBOL_CIRCLE_OUTLINE = define(4)
  val NK_SYMBOL_RECT_SOLID = define(5)
  val NK_SYMBOL_RECT_OUTLINE = define(6)
  val NK_SYMBOL_TRIANGLE_UP = define(7)
  val NK_SYMBOL_TRIANGLE_DOWN = define(8)
  val NK_SYMBOL_TRIANGLE_LEFT = define(9)
  val NK_SYMBOL_TRIANGLE_RIGHT = define(10)
  val NK_SYMBOL_PLUS = define(11)
  val NK_SYMBOL_MINUS = define(12)
  val NK_SYMBOL_MAX = define(13)
  inline def getName(inline value: nk_symbol_type): Option[String] =
    inline value match
      case NK_SYMBOL_NONE => Some("NK_SYMBOL_NONE")
      case NK_SYMBOL_X => Some("NK_SYMBOL_X")
      case NK_SYMBOL_UNDERSCORE => Some("NK_SYMBOL_UNDERSCORE")
      case NK_SYMBOL_CIRCLE_SOLID => Some("NK_SYMBOL_CIRCLE_SOLID")
      case NK_SYMBOL_CIRCLE_OUTLINE => Some("NK_SYMBOL_CIRCLE_OUTLINE")
      case NK_SYMBOL_RECT_SOLID => Some("NK_SYMBOL_RECT_SOLID")
      case NK_SYMBOL_RECT_OUTLINE => Some("NK_SYMBOL_RECT_OUTLINE")
      case NK_SYMBOL_TRIANGLE_UP => Some("NK_SYMBOL_TRIANGLE_UP")
      case NK_SYMBOL_TRIANGLE_DOWN => Some("NK_SYMBOL_TRIANGLE_DOWN")
      case NK_SYMBOL_TRIANGLE_LEFT => Some("NK_SYMBOL_TRIANGLE_LEFT")
      case NK_SYMBOL_TRIANGLE_RIGHT => Some("NK_SYMBOL_TRIANGLE_RIGHT")
      case NK_SYMBOL_PLUS => Some("NK_SYMBOL_PLUS")
      case NK_SYMBOL_MINUS => Some("NK_SYMBOL_MINUS")
      case NK_SYMBOL_MAX => Some("NK_SYMBOL_MAX")
      case _ => None
  extension (a: nk_symbol_type)
    inline def &(b: nk_symbol_type): nk_symbol_type = a & b
    inline def |(b: nk_symbol_type): nk_symbol_type = a | b
    inline def is(b: nk_symbol_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_text_align = CUnsignedInt
object nk_text_align extends CEnumU[nk_text_align]:
  given _tag: Tag[nk_text_align] = Tag.UInt
  inline def define(inline a: Long): nk_text_align = a.toUInt
  val NK_TEXT_ALIGN_LEFT = define(1)
  val NK_TEXT_ALIGN_CENTERED = define(2)
  val NK_TEXT_ALIGN_RIGHT = define(4)
  val NK_TEXT_ALIGN_TOP = define(8)
  val NK_TEXT_ALIGN_MIDDLE = define(16)
  val NK_TEXT_ALIGN_BOTTOM = define(32)
  inline def getName(inline value: nk_text_align): Option[String] =
    inline value match
      case NK_TEXT_ALIGN_LEFT => Some("NK_TEXT_ALIGN_LEFT")
      case NK_TEXT_ALIGN_CENTERED => Some("NK_TEXT_ALIGN_CENTERED")
      case NK_TEXT_ALIGN_RIGHT => Some("NK_TEXT_ALIGN_RIGHT")
      case NK_TEXT_ALIGN_TOP => Some("NK_TEXT_ALIGN_TOP")
      case NK_TEXT_ALIGN_MIDDLE => Some("NK_TEXT_ALIGN_MIDDLE")
      case NK_TEXT_ALIGN_BOTTOM => Some("NK_TEXT_ALIGN_BOTTOM")
      case _ => None
  extension (a: nk_text_align)
    inline def &(b: nk_text_align): nk_text_align = a & b
    inline def |(b: nk_text_align): nk_text_align = a | b
    inline def is(b: nk_text_align): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_text_alignment = CUnsignedInt
object nk_text_alignment extends CEnumU[nk_text_alignment]:
  given _tag: Tag[nk_text_alignment] = Tag.UInt
  inline def define(inline a: Long): nk_text_alignment = a.toUInt
  val NK_TEXT_LEFT = define(17)
  val NK_TEXT_CENTERED = define(18)
  val NK_TEXT_RIGHT = define(20)
  inline def getName(inline value: nk_text_alignment): Option[String] =
    inline value match
      case NK_TEXT_LEFT => Some("NK_TEXT_LEFT")
      case NK_TEXT_CENTERED => Some("NK_TEXT_CENTERED")
      case NK_TEXT_RIGHT => Some("NK_TEXT_RIGHT")
      case _ => None
  extension (a: nk_text_alignment)
    inline def &(b: nk_text_alignment): nk_text_alignment = a & b
    inline def |(b: nk_text_alignment): nk_text_alignment = a | b
    inline def is(b: nk_text_alignment): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_text_edit_mode = CUnsignedInt
object nk_text_edit_mode extends CEnumU[nk_text_edit_mode]:
  given _tag: Tag[nk_text_edit_mode] = Tag.UInt
  inline def define(inline a: Long): nk_text_edit_mode = a.toUInt
  val NK_TEXT_EDIT_MODE_VIEW = define(0)
  val NK_TEXT_EDIT_MODE_INSERT = define(1)
  val NK_TEXT_EDIT_MODE_REPLACE = define(2)
  inline def getName(inline value: nk_text_edit_mode): Option[String] =
    inline value match
      case NK_TEXT_EDIT_MODE_VIEW => Some("NK_TEXT_EDIT_MODE_VIEW")
      case NK_TEXT_EDIT_MODE_INSERT => Some("NK_TEXT_EDIT_MODE_INSERT")
      case NK_TEXT_EDIT_MODE_REPLACE => Some("NK_TEXT_EDIT_MODE_REPLACE")
      case _ => None
  extension (a: nk_text_edit_mode)
    inline def &(b: nk_text_edit_mode): nk_text_edit_mode = a & b
    inline def |(b: nk_text_edit_mode): nk_text_edit_mode = a | b
    inline def is(b: nk_text_edit_mode): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_text_edit_type = CUnsignedInt
object nk_text_edit_type extends CEnumU[nk_text_edit_type]:
  given _tag: Tag[nk_text_edit_type] = Tag.UInt
  inline def define(inline a: Long): nk_text_edit_type = a.toUInt
  val NK_TEXT_EDIT_SINGLE_LINE = define(0)
  val NK_TEXT_EDIT_MULTI_LINE = define(1)
  inline def getName(inline value: nk_text_edit_type): Option[String] =
    inline value match
      case NK_TEXT_EDIT_SINGLE_LINE => Some("NK_TEXT_EDIT_SINGLE_LINE")
      case NK_TEXT_EDIT_MULTI_LINE => Some("NK_TEXT_EDIT_MULTI_LINE")
      case _ => None
  extension (a: nk_text_edit_type)
    inline def &(b: nk_text_edit_type): nk_text_edit_type = a & b
    inline def |(b: nk_text_edit_type): nk_text_edit_type = a | b
    inline def is(b: nk_text_edit_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_toggle_type = CUnsignedInt
object nk_toggle_type extends CEnumU[nk_toggle_type]:
  given _tag: Tag[nk_toggle_type] = Tag.UInt
  inline def define(inline a: Long): nk_toggle_type = a.toUInt
  val NK_TOGGLE_CHECK = define(0)
  val NK_TOGGLE_OPTION = define(1)
  inline def getName(inline value: nk_toggle_type): Option[String] =
    inline value match
      case NK_TOGGLE_CHECK => Some("NK_TOGGLE_CHECK")
      case NK_TOGGLE_OPTION => Some("NK_TOGGLE_OPTION")
      case _ => None
  extension (a: nk_toggle_type)
    inline def &(b: nk_toggle_type): nk_toggle_type = a & b
    inline def |(b: nk_toggle_type): nk_toggle_type = a | b
    inline def is(b: nk_toggle_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_tree_type = CUnsignedInt
object nk_tree_type extends CEnumU[nk_tree_type]:
  given _tag: Tag[nk_tree_type] = Tag.UInt
  inline def define(inline a: Long): nk_tree_type = a.toUInt
  val NK_TREE_NODE = define(0)
  val NK_TREE_TAB = define(1)
  inline def getName(inline value: nk_tree_type): Option[String] =
    inline value match
      case NK_TREE_NODE => Some("NK_TREE_NODE")
      case NK_TREE_TAB => Some("NK_TREE_TAB")
      case _ => None
  extension (a: nk_tree_type)
    inline def &(b: nk_tree_type): nk_tree_type = a & b
    inline def |(b: nk_tree_type): nk_tree_type = a | b
    inline def is(b: nk_tree_type): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_widget_align = CUnsignedInt
object nk_widget_align extends CEnumU[nk_widget_align]:
  given _tag: Tag[nk_widget_align] = Tag.UInt
  inline def define(inline a: Long): nk_widget_align = a.toUInt
  val NK_WIDGET_ALIGN_LEFT = define(1)
  val NK_WIDGET_ALIGN_CENTERED = define(2)
  val NK_WIDGET_ALIGN_RIGHT = define(4)
  val NK_WIDGET_ALIGN_TOP = define(8)
  val NK_WIDGET_ALIGN_MIDDLE = define(16)
  val NK_WIDGET_ALIGN_BOTTOM = define(32)
  inline def getName(inline value: nk_widget_align): Option[String] =
    inline value match
      case NK_WIDGET_ALIGN_LEFT => Some("NK_WIDGET_ALIGN_LEFT")
      case NK_WIDGET_ALIGN_CENTERED => Some("NK_WIDGET_ALIGN_CENTERED")
      case NK_WIDGET_ALIGN_RIGHT => Some("NK_WIDGET_ALIGN_RIGHT")
      case NK_WIDGET_ALIGN_TOP => Some("NK_WIDGET_ALIGN_TOP")
      case NK_WIDGET_ALIGN_MIDDLE => Some("NK_WIDGET_ALIGN_MIDDLE")
      case NK_WIDGET_ALIGN_BOTTOM => Some("NK_WIDGET_ALIGN_BOTTOM")
      case _ => None
  extension (a: nk_widget_align)
    inline def &(b: nk_widget_align): nk_widget_align = a & b
    inline def |(b: nk_widget_align): nk_widget_align = a | b
    inline def is(b: nk_widget_align): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_widget_alignment = CUnsignedInt
object nk_widget_alignment extends CEnumU[nk_widget_alignment]:
  given _tag: Tag[nk_widget_alignment] = Tag.UInt
  inline def define(inline a: Long): nk_widget_alignment = a.toUInt
  val NK_WIDGET_LEFT = define(17)
  val NK_WIDGET_CENTERED = define(18)
  val NK_WIDGET_RIGHT = define(20)
  inline def getName(inline value: nk_widget_alignment): Option[String] =
    inline value match
      case NK_WIDGET_LEFT => Some("NK_WIDGET_LEFT")
      case NK_WIDGET_CENTERED => Some("NK_WIDGET_CENTERED")
      case NK_WIDGET_RIGHT => Some("NK_WIDGET_RIGHT")
      case _ => None
  extension (a: nk_widget_alignment)
    inline def &(b: nk_widget_alignment): nk_widget_alignment = a & b
    inline def |(b: nk_widget_alignment): nk_widget_alignment = a | b
    inline def is(b: nk_widget_alignment): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_widget_layout_states = CUnsignedInt
object nk_widget_layout_states extends CEnumU[nk_widget_layout_states]:
  given _tag: Tag[nk_widget_layout_states] = Tag.UInt
  inline def define(inline a: Long): nk_widget_layout_states = a.toUInt
  val NK_WIDGET_INVALID = define(0)
  val NK_WIDGET_VALID = define(1)
  val NK_WIDGET_ROM = define(2)
  val NK_WIDGET_DISABLED = define(3)
  inline def getName(inline value: nk_widget_layout_states): Option[String] =
    inline value match
      case NK_WIDGET_INVALID => Some("NK_WIDGET_INVALID")
      case NK_WIDGET_VALID => Some("NK_WIDGET_VALID")
      case NK_WIDGET_ROM => Some("NK_WIDGET_ROM")
      case NK_WIDGET_DISABLED => Some("NK_WIDGET_DISABLED")
      case _ => None
  extension (a: nk_widget_layout_states)
    inline def &(b: nk_widget_layout_states): nk_widget_layout_states = a & b
    inline def |(b: nk_widget_layout_states): nk_widget_layout_states = a | b
    inline def is(b: nk_widget_layout_states): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_widget_states = CUnsignedInt
object nk_widget_states extends CEnumU[nk_widget_states]:
  given _tag: Tag[nk_widget_states] = Tag.UInt
  inline def define(inline a: Long): nk_widget_states = a.toUInt
  val NK_WIDGET_STATE_MODIFIED = define(2)
  val NK_WIDGET_STATE_INACTIVE = define(4)
  val NK_WIDGET_STATE_ENTERED = define(8)
  val NK_WIDGET_STATE_HOVER = define(16)
  val NK_WIDGET_STATE_ACTIVED = define(32)
  val NK_WIDGET_STATE_LEFT = define(64)
  val NK_WIDGET_STATE_HOVERED = define(18)
  val NK_WIDGET_STATE_ACTIVE = define(34)
  inline def getName(inline value: nk_widget_states): Option[String] =
    inline value match
      case NK_WIDGET_STATE_MODIFIED => Some("NK_WIDGET_STATE_MODIFIED")
      case NK_WIDGET_STATE_INACTIVE => Some("NK_WIDGET_STATE_INACTIVE")
      case NK_WIDGET_STATE_ENTERED => Some("NK_WIDGET_STATE_ENTERED")
      case NK_WIDGET_STATE_HOVER => Some("NK_WIDGET_STATE_HOVER")
      case NK_WIDGET_STATE_ACTIVED => Some("NK_WIDGET_STATE_ACTIVED")
      case NK_WIDGET_STATE_LEFT => Some("NK_WIDGET_STATE_LEFT")
      case NK_WIDGET_STATE_HOVERED => Some("NK_WIDGET_STATE_HOVERED")
      case NK_WIDGET_STATE_ACTIVE => Some("NK_WIDGET_STATE_ACTIVE")
      case _ => None
  extension (a: nk_widget_states)
    inline def &(b: nk_widget_states): nk_widget_states = a & b
    inline def |(b: nk_widget_states): nk_widget_states = a | b
    inline def is(b: nk_widget_states): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_window_flags = CUnsignedInt
object nk_window_flags extends CEnumU[nk_window_flags]:
  given _tag: Tag[nk_window_flags] = Tag.UInt
  inline def define(inline a: Long): nk_window_flags = a.toUInt
  val NK_WINDOW_PRIVATE = define(2048)
  val NK_WINDOW_DYNAMIC = define(2048)
  val NK_WINDOW_ROM = define(4096)
  val NK_WINDOW_NOT_INTERACTIVE = define(5120)
  val NK_WINDOW_HIDDEN = define(8192)
  val NK_WINDOW_CLOSED = define(16384)
  val NK_WINDOW_MINIMIZED = define(32768)
  val NK_WINDOW_REMOVE_ROM = define(65536)
  inline def getName(inline value: nk_window_flags): Option[String] =
    inline value match
      case NK_WINDOW_PRIVATE => Some("NK_WINDOW_PRIVATE")
      case NK_WINDOW_DYNAMIC => Some("NK_WINDOW_DYNAMIC")
      case NK_WINDOW_ROM => Some("NK_WINDOW_ROM")
      case NK_WINDOW_NOT_INTERACTIVE => Some("NK_WINDOW_NOT_INTERACTIVE")
      case NK_WINDOW_HIDDEN => Some("NK_WINDOW_HIDDEN")
      case NK_WINDOW_CLOSED => Some("NK_WINDOW_CLOSED")
      case NK_WINDOW_MINIMIZED => Some("NK_WINDOW_MINIMIZED")
      case NK_WINDOW_REMOVE_ROM => Some("NK_WINDOW_REMOVE_ROM")
      case _ => None
  extension (a: nk_window_flags)
    inline def &(b: nk_window_flags): nk_window_flags = a & b
    inline def |(b: nk_window_flags): nk_window_flags = a | b
    inline def is(b: nk_window_flags): Boolean = (a & b) == b

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_window_insert_location = CUnsignedInt
object nk_window_insert_location extends CEnumU[nk_window_insert_location]:
  given _tag: Tag[nk_window_insert_location] = Tag.UInt
  inline def define(inline a: Long): nk_window_insert_location = a.toUInt
  val NK_INSERT_BACK = define(0)
  val NK_INSERT_FRONT = define(1)
  inline def getName(inline value: nk_window_insert_location): Option[String] =
    inline value match
      case NK_INSERT_BACK => Some("NK_INSERT_BACK")
      case NK_INSERT_FRONT => Some("NK_INSERT_FRONT")
      case _ => None
  extension (a: nk_window_insert_location)
    inline def &(b: nk_window_insert_location): nk_window_insert_location = a & b
    inline def |(b: nk_window_insert_location): nk_window_insert_location = a | b
    inline def is(b: nk_window_insert_location): Boolean = (a & b) == b