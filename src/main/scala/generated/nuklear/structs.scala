package nuklear

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type nk_allocator = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object nk_allocator:
  given _tag: Tag[nk_allocator] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_allocator] = scala.scalanative.unsafe.alloc[nk_allocator](1)
  def apply(userdata : nk_handle, alloc : nk_plugin_alloc, free : nk_plugin_free)(using Zone): Ptr[nk_allocator] = 
    val ____ptr = apply()
    (!____ptr).userdata = userdata
    (!____ptr).alloc = alloc
    (!____ptr).free = free
    ____ptr
  extension (struct: nk_allocator)
    def userdata: nk_handle = !struct.at(0).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(0).asInstanceOf[Ptr[nk_handle]] = value
    def alloc: nk_plugin_alloc = !struct.at(8).asInstanceOf[Ptr[nk_plugin_alloc]]
    def alloc_=(value: nk_plugin_alloc): Unit = !struct.at(8).asInstanceOf[Ptr[nk_plugin_alloc]] = value
    def free: nk_plugin_free = !struct.at(16).asInstanceOf[Ptr[nk_plugin_free]]
    def free_=(value: nk_plugin_free): Unit = !struct.at(16).asInstanceOf[Ptr[nk_plugin_free]] = value

opaque type nk_buffer = CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._0]]
object nk_buffer:
  given _tag: Tag[nk_buffer] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._0](Tag.Nat1, Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_buffer] = scala.scalanative.unsafe.alloc[nk_buffer](1)
  def apply(marker : CArray[nk_buffer_marker, Nat._2], pool : nk_allocator, `type` : nk_allocation_type, memory : nk_memory, grow_factor : Float, allocated : nk_size, needed : nk_size, calls : nk_size, size : nk_size)(using Zone): Ptr[nk_buffer] = 
    val ____ptr = apply()
    (!____ptr).marker = marker
    (!____ptr).pool = pool
    (!____ptr).`type` = `type`
    (!____ptr).memory = memory
    (!____ptr).grow_factor = grow_factor
    (!____ptr).allocated = allocated
    (!____ptr).needed = needed
    (!____ptr).calls = calls
    (!____ptr).size = size
    ____ptr
  extension (struct: nk_buffer)
    def marker: CArray[nk_buffer_marker, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[nk_buffer_marker, Nat._2]]]
    def marker_=(value: CArray[nk_buffer_marker, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[nk_buffer_marker, Nat._2]]] = value
    def pool: nk_allocator = !struct.at(32).asInstanceOf[Ptr[nk_allocator]]
    def pool_=(value: nk_allocator): Unit = !struct.at(32).asInstanceOf[Ptr[nk_allocator]] = value
    def `type`: nk_allocation_type = !struct.at(56).asInstanceOf[Ptr[nk_allocation_type]]
    def type_=(value: nk_allocation_type): Unit = !struct.at(56).asInstanceOf[Ptr[nk_allocation_type]] = value
    def memory: nk_memory = !struct.at(64).asInstanceOf[Ptr[nk_memory]]
    def memory_=(value: nk_memory): Unit = !struct.at(64).asInstanceOf[Ptr[nk_memory]] = value
    def grow_factor: Float = !struct.at(80).asInstanceOf[Ptr[Float]]
    def grow_factor_=(value: Float): Unit = !struct.at(80).asInstanceOf[Ptr[Float]] = value
    def allocated: nk_size = !struct.at(88).asInstanceOf[Ptr[nk_size]]
    def allocated_=(value: nk_size): Unit = !struct.at(88).asInstanceOf[Ptr[nk_size]] = value
    def needed: nk_size = !struct.at(96).asInstanceOf[Ptr[nk_size]]
    def needed_=(value: nk_size): Unit = !struct.at(96).asInstanceOf[Ptr[nk_size]] = value
    def calls: nk_size = !struct.at(104).asInstanceOf[Ptr[nk_size]]
    def calls_=(value: nk_size): Unit = !struct.at(104).asInstanceOf[Ptr[nk_size]] = value
    def size: nk_size = !struct.at(112).asInstanceOf[Ptr[nk_size]]
    def size_=(value: nk_size): Unit = !struct.at(112).asInstanceOf[Ptr[nk_size]] = value

opaque type nk_buffer_marker = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_buffer_marker:
  given _tag: Tag[nk_buffer_marker] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_buffer_marker] = scala.scalanative.unsafe.alloc[nk_buffer_marker](1)
  def apply(active : nk_bool, offset : nk_size)(using Zone): Ptr[nk_buffer_marker] = 
    val ____ptr = apply()
    (!____ptr).active = active
    (!____ptr).offset = offset
    ____ptr
  extension (struct: nk_buffer_marker)
    def active: nk_bool = !struct.at(0).asInstanceOf[Ptr[nk_bool]]
    def active_=(value: nk_bool): Unit = !struct.at(0).asInstanceOf[Ptr[nk_bool]] = value
    def offset: nk_size = !struct.at(8).asInstanceOf[Ptr[nk_size]]
    def offset_=(value: nk_size): Unit = !struct.at(8).asInstanceOf[Ptr[nk_size]] = value

opaque type nk_chart = CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._6]]
object nk_chart:
  given _tag: Tag[nk_chart] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._9, Nat._6](Tag.Nat1, Tag.Nat9, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_chart] = scala.scalanative.unsafe.alloc[nk_chart](1)
  def apply(slot : CInt, x : Float, y : Float, w : Float, h : Float, slots : CArray[nk_chart_slot, Nat._4])(using Zone): Ptr[nk_chart] = 
    val ____ptr = apply()
    (!____ptr).slot = slot
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).slots = slots
    ____ptr
  extension (struct: nk_chart)
    def slot: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def slot_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def x: Float = !struct.at(4).asInstanceOf[Ptr[Float]]
    def x_=(value: Float): Unit = !struct.at(4).asInstanceOf[Ptr[Float]] = value
    def y: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def y_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def w: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def w_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value
    def h: Float = !struct.at(16).asInstanceOf[Ptr[Float]]
    def h_=(value: Float): Unit = !struct.at(16).asInstanceOf[Ptr[Float]] = value
    def slots: CArray[nk_chart_slot, Nat._4] = !struct.at(20).asInstanceOf[Ptr[CArray[nk_chart_slot, Nat._4]]]
    def slots_=(value: CArray[nk_chart_slot, Nat._4]): Unit = !struct.at(20).asInstanceOf[Ptr[CArray[nk_chart_slot, Nat._4]]] = value

opaque type nk_chart_slot = CArray[CChar, Nat.Digit2[Nat._4, Nat._4]]
object nk_chart_slot:
  given _tag: Tag[nk_chart_slot] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._4]](Tag.Byte, Tag.Digit2[Nat._4, Nat._4](Tag.Nat4, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_chart_slot] = scala.scalanative.unsafe.alloc[nk_chart_slot](1)
  def apply(`type` : nk_chart_type, color : nk_color, highlight : nk_color, min : Float, max : Float, range : Float, count : CInt, last : nk_vec2, index : CInt, show_markers : nk_bool)(using Zone): Ptr[nk_chart_slot] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).color = color
    (!____ptr).highlight = highlight
    (!____ptr).min = min
    (!____ptr).max = max
    (!____ptr).range = range
    (!____ptr).count = count
    (!____ptr).last = last
    (!____ptr).index = index
    (!____ptr).show_markers = show_markers
    ____ptr
  extension (struct: nk_chart_slot)
    def `type`: nk_chart_type = !struct.at(0).asInstanceOf[Ptr[nk_chart_type]]
    def type_=(value: nk_chart_type): Unit = !struct.at(0).asInstanceOf[Ptr[nk_chart_type]] = value
    def color: nk_color = !struct.at(4).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(4).asInstanceOf[Ptr[nk_color]] = value
    def highlight: nk_color = !struct.at(8).asInstanceOf[Ptr[nk_color]]
    def highlight_=(value: nk_color): Unit = !struct.at(8).asInstanceOf[Ptr[nk_color]] = value
    def min: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def min_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value
    def max: Float = !struct.at(16).asInstanceOf[Ptr[Float]]
    def max_=(value: Float): Unit = !struct.at(16).asInstanceOf[Ptr[Float]] = value
    def range: Float = !struct.at(20).asInstanceOf[Ptr[Float]]
    def range_=(value: Float): Unit = !struct.at(20).asInstanceOf[Ptr[Float]] = value
    def count: CInt = !struct.at(24).asInstanceOf[Ptr[CInt]]
    def count_=(value: CInt): Unit = !struct.at(24).asInstanceOf[Ptr[CInt]] = value
    def last: nk_vec2 = !struct.at(28).asInstanceOf[Ptr[nk_vec2]]
    def last_=(value: nk_vec2): Unit = !struct.at(28).asInstanceOf[Ptr[nk_vec2]] = value
    def index: CInt = !struct.at(36).asInstanceOf[Ptr[CInt]]
    def index_=(value: CInt): Unit = !struct.at(36).asInstanceOf[Ptr[CInt]] = value
    def show_markers: nk_bool = !struct.at(40).asInstanceOf[Ptr[nk_bool]]
    def show_markers_=(value: nk_bool): Unit = !struct.at(40).asInstanceOf[Ptr[nk_bool]] = value

opaque type nk_clipboard = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object nk_clipboard:
  given _tag: Tag[nk_clipboard] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_clipboard] = scala.scalanative.unsafe.alloc[nk_clipboard](1)
  def apply(userdata : nk_handle, paste : nk_plugin_paste, copy : nk_plugin_copy)(using Zone): Ptr[nk_clipboard] = 
    val ____ptr = apply()
    (!____ptr).userdata = userdata
    (!____ptr).paste = paste
    (!____ptr).copy = copy
    ____ptr
  extension (struct: nk_clipboard)
    def userdata: nk_handle = !struct.at(0).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(0).asInstanceOf[Ptr[nk_handle]] = value
    def paste: nk_plugin_paste = !struct.at(8).asInstanceOf[Ptr[nk_plugin_paste]]
    def paste_=(value: nk_plugin_paste): Unit = !struct.at(8).asInstanceOf[Ptr[nk_plugin_paste]] = value
    def copy: nk_plugin_copy = !struct.at(16).asInstanceOf[Ptr[nk_plugin_copy]]
    def copy_=(value: nk_plugin_copy): Unit = !struct.at(16).asInstanceOf[Ptr[nk_plugin_copy]] = value

opaque type nk_color = CArray[CChar, Nat._4]
object nk_color:
  given _tag: Tag[nk_color] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
  def apply()(using Zone): Ptr[nk_color] = scala.scalanative.unsafe.alloc[nk_color](1)
  def apply(r : nk_byte, g : nk_byte, b : nk_byte, a : nk_byte)(using Zone): Ptr[nk_color] = 
    val ____ptr = apply()
    (!____ptr).r = r
    (!____ptr).g = g
    (!____ptr).b = b
    (!____ptr).a = a
    ____ptr
  extension (struct: nk_color)
    def r: nk_byte = !struct.at(0).asInstanceOf[Ptr[nk_byte]]
    def r_=(value: nk_byte): Unit = !struct.at(0).asInstanceOf[Ptr[nk_byte]] = value
    def g: nk_byte = !struct.at(1).asInstanceOf[Ptr[nk_byte]]
    def g_=(value: nk_byte): Unit = !struct.at(1).asInstanceOf[Ptr[nk_byte]] = value
    def b: nk_byte = !struct.at(2).asInstanceOf[Ptr[nk_byte]]
    def b_=(value: nk_byte): Unit = !struct.at(2).asInstanceOf[Ptr[nk_byte]] = value
    def a: nk_byte = !struct.at(3).asInstanceOf[Ptr[nk_byte]]
    def a_=(value: nk_byte): Unit = !struct.at(3).asInstanceOf[Ptr[nk_byte]] = value

opaque type nk_colorf = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_colorf:
  given _tag: Tag[nk_colorf] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_colorf] = scala.scalanative.unsafe.alloc[nk_colorf](1)
  def apply(r : Float, g : Float, b : Float, a : Float)(using Zone): Ptr[nk_colorf] = 
    val ____ptr = apply()
    (!____ptr).r = r
    (!____ptr).g = g
    (!____ptr).b = b
    (!____ptr).a = a
    ____ptr
  extension (struct: nk_colorf)
    def r: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def r_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def g: Float = !struct.at(4).asInstanceOf[Ptr[Float]]
    def g_=(value: Float): Unit = !struct.at(4).asInstanceOf[Ptr[Float]] = value
    def b: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def b_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def a: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def a_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value

opaque type nk_command = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_command:
  given _tag: Tag[nk_command] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_command] = scala.scalanative.unsafe.alloc[nk_command](1)
  def apply(`type` : nk_command_type, next : nk_size)(using Zone): Ptr[nk_command] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).next = next
    ____ptr
  extension (struct: nk_command)
    def `type`: nk_command_type = !struct.at(0).asInstanceOf[Ptr[nk_command_type]]
    def type_=(value: nk_command_type): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command_type]] = value
    def next: nk_size = !struct.at(8).asInstanceOf[Ptr[nk_size]]
    def next_=(value: nk_size): Unit = !struct.at(8).asInstanceOf[Ptr[nk_size]] = value

opaque type nk_command_arc = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_command_arc:
  given _tag: Tag[nk_command_arc] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_command_arc] = scala.scalanative.unsafe.alloc[nk_command_arc](1)
  def apply(header : nk_command, cx : CShort, cy : CShort, r : CUnsignedShort, line_thickness : CUnsignedShort, a : CArray[Float, Nat._2], color : nk_color)(using Zone): Ptr[nk_command_arc] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).cx = cx
    (!____ptr).cy = cy
    (!____ptr).r = r
    (!____ptr).line_thickness = line_thickness
    (!____ptr).a = a
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_arc)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def cx: CShort = !struct.at(16).asInstanceOf[Ptr[CShort]]
    def cx_=(value: CShort): Unit = !struct.at(16).asInstanceOf[Ptr[CShort]] = value
    def cy: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def cy_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def r: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def r_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def line_thickness: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def line_thickness_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def a: CArray[Float, Nat._2] = !struct.at(24).asInstanceOf[Ptr[CArray[Float, Nat._2]]]
    def a_=(value: CArray[Float, Nat._2]): Unit = !struct.at(24).asInstanceOf[Ptr[CArray[Float, Nat._2]]] = value
    def color: nk_color = !struct.at(32).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(32).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_arc_filled = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_command_arc_filled:
  given _tag: Tag[nk_command_arc_filled] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_command_arc_filled] = scala.scalanative.unsafe.alloc[nk_command_arc_filled](1)
  def apply(header : nk_command, cx : CShort, cy : CShort, r : CUnsignedShort, a : CArray[Float, Nat._2], color : nk_color)(using Zone): Ptr[nk_command_arc_filled] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).cx = cx
    (!____ptr).cy = cy
    (!____ptr).r = r
    (!____ptr).a = a
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_arc_filled)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def cx: CShort = !struct.at(16).asInstanceOf[Ptr[CShort]]
    def cx_=(value: CShort): Unit = !struct.at(16).asInstanceOf[Ptr[CShort]] = value
    def cy: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def cy_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def r: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def r_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def a: CArray[Float, Nat._2] = !struct.at(24).asInstanceOf[Ptr[CArray[Float, Nat._2]]]
    def a_=(value: CArray[Float, Nat._2]): Unit = !struct.at(24).asInstanceOf[Ptr[CArray[Float, Nat._2]]] = value
    def color: nk_color = !struct.at(32).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(32).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_buffer = CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]
object nk_command_buffer:
  given _tag: Tag[nk_command_buffer] = Tag.CArray[CChar, Nat.Digit2[Nat._6, Nat._4]](Tag.Byte, Tag.Digit2[Nat._6, Nat._4](Tag.Nat6, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_command_buffer] = scala.scalanative.unsafe.alloc[nk_command_buffer](1)
  def apply(base : Ptr[nk_buffer], clip : nk_rect, use_clipping : CInt, userdata : nk_handle, begin : nk_size, end : nk_size, last : nk_size)(using Zone): Ptr[nk_command_buffer] = 
    val ____ptr = apply()
    (!____ptr).base = base
    (!____ptr).clip = clip
    (!____ptr).use_clipping = use_clipping
    (!____ptr).userdata = userdata
    (!____ptr).begin = begin
    (!____ptr).end = end
    (!____ptr).last = last
    ____ptr
  extension (struct: nk_command_buffer)
    def base: Ptr[nk_buffer] = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_buffer]]]
    def base_=(value: Ptr[nk_buffer]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_buffer]]] = value
    def clip: nk_rect = !struct.at(8).asInstanceOf[Ptr[nk_rect]]
    def clip_=(value: nk_rect): Unit = !struct.at(8).asInstanceOf[Ptr[nk_rect]] = value
    def use_clipping: CInt = !struct.at(24).asInstanceOf[Ptr[CInt]]
    def use_clipping_=(value: CInt): Unit = !struct.at(24).asInstanceOf[Ptr[CInt]] = value
    def userdata: nk_handle = !struct.at(28).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(28).asInstanceOf[Ptr[nk_handle]] = value
    def begin: nk_size = !struct.at(40).asInstanceOf[Ptr[nk_size]]
    def begin_=(value: nk_size): Unit = !struct.at(40).asInstanceOf[Ptr[nk_size]] = value
    def end: nk_size = !struct.at(48).asInstanceOf[Ptr[nk_size]]
    def end_=(value: nk_size): Unit = !struct.at(48).asInstanceOf[Ptr[nk_size]] = value
    def last: nk_size = !struct.at(56).asInstanceOf[Ptr[nk_size]]
    def last_=(value: nk_size): Unit = !struct.at(56).asInstanceOf[Ptr[nk_size]] = value

opaque type nk_command_circle = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_circle:
  given _tag: Tag[nk_command_circle] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_circle] = scala.scalanative.unsafe.alloc[nk_command_circle](1)
  def apply(header : nk_command, x : CShort, y : CShort, line_thickness : CUnsignedShort, w : CUnsignedShort, h : CUnsignedShort, color : nk_color)(using Zone): Ptr[nk_command_circle] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).line_thickness = line_thickness
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_circle)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def x: CShort = !struct.at(16).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(16).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def line_thickness: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def line_thickness_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def w: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(24).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(24).asInstanceOf[Ptr[CUnsignedShort]] = value
    def color: nk_color = !struct.at(26).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(26).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_circle_filled = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_circle_filled:
  given _tag: Tag[nk_command_circle_filled] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_circle_filled] = scala.scalanative.unsafe.alloc[nk_command_circle_filled](1)
  def apply(header : nk_command, x : CShort, y : CShort, w : CUnsignedShort, h : CUnsignedShort, color : nk_color)(using Zone): Ptr[nk_command_circle_filled] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_circle_filled)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def x: CShort = !struct.at(16).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(16).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def w: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def color: nk_color = !struct.at(24).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(24).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_curve = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_command_curve:
  given _tag: Tag[nk_command_curve] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_command_curve] = scala.scalanative.unsafe.alloc[nk_command_curve](1)
  def apply(header : nk_command, line_thickness : CUnsignedShort, begin : nk_vec2i, end : nk_vec2i, ctrl : CArray[nk_vec2i, Nat._2], color : nk_color)(using Zone): Ptr[nk_command_curve] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).line_thickness = line_thickness
    (!____ptr).begin = begin
    (!____ptr).end = end
    (!____ptr).ctrl = ctrl
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_curve)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def line_thickness: CUnsignedShort = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]]
    def line_thickness_=(value: CUnsignedShort): Unit = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]] = value
    def begin: nk_vec2i = !struct.at(18).asInstanceOf[Ptr[nk_vec2i]]
    def begin_=(value: nk_vec2i): Unit = !struct.at(18).asInstanceOf[Ptr[nk_vec2i]] = value
    def end: nk_vec2i = !struct.at(22).asInstanceOf[Ptr[nk_vec2i]]
    def end_=(value: nk_vec2i): Unit = !struct.at(22).asInstanceOf[Ptr[nk_vec2i]] = value
    def ctrl: CArray[nk_vec2i, Nat._2] = !struct.at(26).asInstanceOf[Ptr[CArray[nk_vec2i, Nat._2]]]
    def ctrl_=(value: CArray[nk_vec2i, Nat._2]): Unit = !struct.at(26).asInstanceOf[Ptr[CArray[nk_vec2i, Nat._2]]] = value
    def color: nk_color = !struct.at(34).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(34).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_custom = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_command_custom:
  given _tag: Tag[nk_command_custom] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_command_custom] = scala.scalanative.unsafe.alloc[nk_command_custom](1)
  def apply(header : nk_command, x : CShort, y : CShort, w : CUnsignedShort, h : CUnsignedShort, callback_data : nk_handle, callback : nk_command_custom_callback)(using Zone): Ptr[nk_command_custom] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).callback_data = callback_data
    (!____ptr).callback = callback
    ____ptr
  extension (struct: nk_command_custom)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def x: CShort = !struct.at(16).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(16).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def w: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def callback_data: nk_handle = !struct.at(24).asInstanceOf[Ptr[nk_handle]]
    def callback_data_=(value: nk_handle): Unit = !struct.at(24).asInstanceOf[Ptr[nk_handle]] = value
    def callback: nk_command_custom_callback = !struct.at(32).asInstanceOf[Ptr[nk_command_custom_callback]]
    def callback_=(value: nk_command_custom_callback): Unit = !struct.at(32).asInstanceOf[Ptr[nk_command_custom_callback]] = value

opaque type nk_command_image = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]
object nk_command_image:
  given _tag: Tag[nk_command_image] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  def apply()(using Zone): Ptr[nk_command_image] = scala.scalanative.unsafe.alloc[nk_command_image](1)
  def apply(header : nk_command, x : CShort, y : CShort, w : CUnsignedShort, h : CUnsignedShort, img : nk_image, col : nk_color)(using Zone): Ptr[nk_command_image] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).img = img
    (!____ptr).col = col
    ____ptr
  extension (struct: nk_command_image)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def x: CShort = !struct.at(16).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(16).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def w: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def img: nk_image = !struct.at(24).asInstanceOf[Ptr[nk_image]]
    def img_=(value: nk_image): Unit = !struct.at(24).asInstanceOf[Ptr[nk_image]] = value
    def col: nk_color = !struct.at(44).asInstanceOf[Ptr[nk_color]]
    def col_=(value: nk_color): Unit = !struct.at(44).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_line = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_line:
  given _tag: Tag[nk_command_line] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_line] = scala.scalanative.unsafe.alloc[nk_command_line](1)
  def apply(header : nk_command, line_thickness : CUnsignedShort, begin : nk_vec2i, end : nk_vec2i, color : nk_color)(using Zone): Ptr[nk_command_line] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).line_thickness = line_thickness
    (!____ptr).begin = begin
    (!____ptr).end = end
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_line)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def line_thickness: CUnsignedShort = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]]
    def line_thickness_=(value: CUnsignedShort): Unit = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]] = value
    def begin: nk_vec2i = !struct.at(18).asInstanceOf[Ptr[nk_vec2i]]
    def begin_=(value: nk_vec2i): Unit = !struct.at(18).asInstanceOf[Ptr[nk_vec2i]] = value
    def end: nk_vec2i = !struct.at(22).asInstanceOf[Ptr[nk_vec2i]]
    def end_=(value: nk_vec2i): Unit = !struct.at(22).asInstanceOf[Ptr[nk_vec2i]] = value
    def color: nk_color = !struct.at(26).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(26).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_polygon = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_polygon:
  given _tag: Tag[nk_command_polygon] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_polygon] = scala.scalanative.unsafe.alloc[nk_command_polygon](1)
  def apply(header : nk_command, color : nk_color, line_thickness : CUnsignedShort, point_count : CUnsignedShort, points : CArray[nk_vec2i, Nat._1])(using Zone): Ptr[nk_command_polygon] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).color = color
    (!____ptr).line_thickness = line_thickness
    (!____ptr).point_count = point_count
    (!____ptr).points = points
    ____ptr
  extension (struct: nk_command_polygon)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def color: nk_color = !struct.at(16).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(16).asInstanceOf[Ptr[nk_color]] = value
    def line_thickness: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def line_thickness_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def point_count: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def point_count_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def points: CArray[nk_vec2i, Nat._1] = !struct.at(24).asInstanceOf[Ptr[CArray[nk_vec2i, Nat._1]]]
    def points_=(value: CArray[nk_vec2i, Nat._1]): Unit = !struct.at(24).asInstanceOf[Ptr[CArray[nk_vec2i, Nat._1]]] = value

opaque type nk_command_polygon_filled = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_polygon_filled:
  given _tag: Tag[nk_command_polygon_filled] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_polygon_filled] = scala.scalanative.unsafe.alloc[nk_command_polygon_filled](1)
  def apply(header : nk_command, color : nk_color, point_count : CUnsignedShort, points : CArray[nk_vec2i, Nat._1])(using Zone): Ptr[nk_command_polygon_filled] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).color = color
    (!____ptr).point_count = point_count
    (!____ptr).points = points
    ____ptr
  extension (struct: nk_command_polygon_filled)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def color: nk_color = !struct.at(16).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(16).asInstanceOf[Ptr[nk_color]] = value
    def point_count: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def point_count_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def points: CArray[nk_vec2i, Nat._1] = !struct.at(22).asInstanceOf[Ptr[CArray[nk_vec2i, Nat._1]]]
    def points_=(value: CArray[nk_vec2i, Nat._1]): Unit = !struct.at(22).asInstanceOf[Ptr[CArray[nk_vec2i, Nat._1]]] = value

opaque type nk_command_polyline = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_polyline:
  given _tag: Tag[nk_command_polyline] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_polyline] = scala.scalanative.unsafe.alloc[nk_command_polyline](1)
  def apply(header : nk_command, color : nk_color, line_thickness : CUnsignedShort, point_count : CUnsignedShort, points : CArray[nk_vec2i, Nat._1])(using Zone): Ptr[nk_command_polyline] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).color = color
    (!____ptr).line_thickness = line_thickness
    (!____ptr).point_count = point_count
    (!____ptr).points = points
    ____ptr
  extension (struct: nk_command_polyline)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def color: nk_color = !struct.at(16).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(16).asInstanceOf[Ptr[nk_color]] = value
    def line_thickness: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def line_thickness_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def point_count: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def point_count_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def points: CArray[nk_vec2i, Nat._1] = !struct.at(24).asInstanceOf[Ptr[CArray[nk_vec2i, Nat._1]]]
    def points_=(value: CArray[nk_vec2i, Nat._1]): Unit = !struct.at(24).asInstanceOf[Ptr[CArray[nk_vec2i, Nat._1]]] = value

opaque type nk_command_rect = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_rect:
  given _tag: Tag[nk_command_rect] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_rect] = scala.scalanative.unsafe.alloc[nk_command_rect](1)
  def apply(header : nk_command, rounding : CUnsignedShort, line_thickness : CUnsignedShort, x : CShort, y : CShort, w : CUnsignedShort, h : CUnsignedShort, color : nk_color)(using Zone): Ptr[nk_command_rect] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).rounding = rounding
    (!____ptr).line_thickness = line_thickness
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_rect)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def rounding: CUnsignedShort = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]]
    def rounding_=(value: CUnsignedShort): Unit = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]] = value
    def line_thickness: CUnsignedShort = !struct.at(18).asInstanceOf[Ptr[CUnsignedShort]]
    def line_thickness_=(value: CUnsignedShort): Unit = !struct.at(18).asInstanceOf[Ptr[CUnsignedShort]] = value
    def x: CShort = !struct.at(20).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(20).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(22).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(22).asInstanceOf[Ptr[CShort]] = value
    def w: CUnsignedShort = !struct.at(24).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(24).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(26).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(26).asInstanceOf[Ptr[CUnsignedShort]] = value
    def color: nk_color = !struct.at(28).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(28).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_rect_filled = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_rect_filled:
  given _tag: Tag[nk_command_rect_filled] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_rect_filled] = scala.scalanative.unsafe.alloc[nk_command_rect_filled](1)
  def apply(header : nk_command, rounding : CUnsignedShort, x : CShort, y : CShort, w : CUnsignedShort, h : CUnsignedShort, color : nk_color)(using Zone): Ptr[nk_command_rect_filled] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).rounding = rounding
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_rect_filled)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def rounding: CUnsignedShort = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]]
    def rounding_=(value: CUnsignedShort): Unit = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]] = value
    def x: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(20).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(20).asInstanceOf[Ptr[CShort]] = value
    def w: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(24).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(24).asInstanceOf[Ptr[CUnsignedShort]] = value
    def color: nk_color = !struct.at(26).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(26).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_rect_multi_color = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_command_rect_multi_color:
  given _tag: Tag[nk_command_rect_multi_color] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_command_rect_multi_color] = scala.scalanative.unsafe.alloc[nk_command_rect_multi_color](1)
  def apply(header : nk_command, x : CShort, y : CShort, w : CUnsignedShort, h : CUnsignedShort, left : nk_color, top : nk_color, bottom : nk_color, right : nk_color)(using Zone): Ptr[nk_command_rect_multi_color] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).left = left
    (!____ptr).top = top
    (!____ptr).bottom = bottom
    (!____ptr).right = right
    ____ptr
  extension (struct: nk_command_rect_multi_color)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def x: CShort = !struct.at(16).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(16).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def w: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value
    def left: nk_color = !struct.at(24).asInstanceOf[Ptr[nk_color]]
    def left_=(value: nk_color): Unit = !struct.at(24).asInstanceOf[Ptr[nk_color]] = value
    def top: nk_color = !struct.at(28).asInstanceOf[Ptr[nk_color]]
    def top_=(value: nk_color): Unit = !struct.at(28).asInstanceOf[Ptr[nk_color]] = value
    def bottom: nk_color = !struct.at(32).asInstanceOf[Ptr[nk_color]]
    def bottom_=(value: nk_color): Unit = !struct.at(32).asInstanceOf[Ptr[nk_color]] = value
    def right: nk_color = !struct.at(36).asInstanceOf[Ptr[nk_color]]
    def right_=(value: nk_color): Unit = !struct.at(36).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_scissor = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object nk_command_scissor:
  given _tag: Tag[nk_command_scissor] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_command_scissor] = scala.scalanative.unsafe.alloc[nk_command_scissor](1)
  def apply(header : nk_command, x : CShort, y : CShort, w : CUnsignedShort, h : CUnsignedShort)(using Zone): Ptr[nk_command_scissor] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    ____ptr
  extension (struct: nk_command_scissor)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def x: CShort = !struct.at(16).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(16).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(18).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(18).asInstanceOf[Ptr[CShort]] = value
    def w: CUnsignedShort = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(22).asInstanceOf[Ptr[CUnsignedShort]] = value

opaque type nk_command_text = CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]
object nk_command_text:
  given _tag: Tag[nk_command_text] = Tag.CArray[CChar, Nat.Digit2[Nat._5, Nat._6]](Tag.Byte, Tag.Digit2[Nat._5, Nat._6](Tag.Nat5, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_command_text] = scala.scalanative.unsafe.alloc[nk_command_text](1)
  def apply(header : nk_command, font : Ptr[nk_user_font], background : nk_color, foreground : nk_color, x : CShort, y : CShort, w : CUnsignedShort, h : CUnsignedShort, height : Float, _length : CInt, string : CArray[CChar, Nat._1])(using Zone): Ptr[nk_command_text] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).font = font
    (!____ptr).background = background
    (!____ptr).foreground = foreground
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).height = height
    (!____ptr)._length = _length
    (!____ptr).string = string
    ____ptr
  extension (struct: nk_command_text)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def font: Ptr[nk_user_font] = !struct.at(16).asInstanceOf[Ptr[Ptr[nk_user_font]]]
    def font_=(value: Ptr[nk_user_font]): Unit = !struct.at(16).asInstanceOf[Ptr[Ptr[nk_user_font]]] = value
    def background: nk_color = !struct.at(24).asInstanceOf[Ptr[nk_color]]
    def background_=(value: nk_color): Unit = !struct.at(24).asInstanceOf[Ptr[nk_color]] = value
    def foreground: nk_color = !struct.at(28).asInstanceOf[Ptr[nk_color]]
    def foreground_=(value: nk_color): Unit = !struct.at(28).asInstanceOf[Ptr[nk_color]] = value
    def x: CShort = !struct.at(32).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(32).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(34).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(34).asInstanceOf[Ptr[CShort]] = value
    def w: CUnsignedShort = !struct.at(36).asInstanceOf[Ptr[CUnsignedShort]]
    def w_=(value: CUnsignedShort): Unit = !struct.at(36).asInstanceOf[Ptr[CUnsignedShort]] = value
    def h: CUnsignedShort = !struct.at(38).asInstanceOf[Ptr[CUnsignedShort]]
    def h_=(value: CUnsignedShort): Unit = !struct.at(38).asInstanceOf[Ptr[CUnsignedShort]] = value
    def height: Float = !struct.at(40).asInstanceOf[Ptr[Float]]
    def height_=(value: Float): Unit = !struct.at(40).asInstanceOf[Ptr[Float]] = value
    def _length: CInt = !struct.at(44).asInstanceOf[Ptr[CInt]]
    def _length_=(value: CInt): Unit = !struct.at(44).asInstanceOf[Ptr[CInt]] = value
    def string: CArray[CChar, Nat._1] = !struct.at(48).asInstanceOf[Ptr[CArray[CChar, Nat._1]]]
    def string_=(value: CArray[CChar, Nat._1]): Unit = !struct.at(48).asInstanceOf[Ptr[CArray[CChar, Nat._1]]] = value

opaque type nk_command_triangle = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_command_triangle:
  given _tag: Tag[nk_command_triangle] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_command_triangle] = scala.scalanative.unsafe.alloc[nk_command_triangle](1)
  def apply(header : nk_command, line_thickness : CUnsignedShort, a : nk_vec2i, b : nk_vec2i, c : nk_vec2i, color : nk_color)(using Zone): Ptr[nk_command_triangle] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).line_thickness = line_thickness
    (!____ptr).a = a
    (!____ptr).b = b
    (!____ptr).c = c
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_triangle)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def line_thickness: CUnsignedShort = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]]
    def line_thickness_=(value: CUnsignedShort): Unit = !struct.at(16).asInstanceOf[Ptr[CUnsignedShort]] = value
    def a: nk_vec2i = !struct.at(18).asInstanceOf[Ptr[nk_vec2i]]
    def a_=(value: nk_vec2i): Unit = !struct.at(18).asInstanceOf[Ptr[nk_vec2i]] = value
    def b: nk_vec2i = !struct.at(22).asInstanceOf[Ptr[nk_vec2i]]
    def b_=(value: nk_vec2i): Unit = !struct.at(22).asInstanceOf[Ptr[nk_vec2i]] = value
    def c: nk_vec2i = !struct.at(26).asInstanceOf[Ptr[nk_vec2i]]
    def c_=(value: nk_vec2i): Unit = !struct.at(26).asInstanceOf[Ptr[nk_vec2i]] = value
    def color: nk_color = !struct.at(30).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(30).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_command_triangle_filled = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_command_triangle_filled:
  given _tag: Tag[nk_command_triangle_filled] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_command_triangle_filled] = scala.scalanative.unsafe.alloc[nk_command_triangle_filled](1)
  def apply(header : nk_command, a : nk_vec2i, b : nk_vec2i, c : nk_vec2i, color : nk_color)(using Zone): Ptr[nk_command_triangle_filled] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).a = a
    (!____ptr).b = b
    (!____ptr).c = c
    (!____ptr).color = color
    ____ptr
  extension (struct: nk_command_triangle_filled)
    def header: nk_command = !struct.at(0).asInstanceOf[Ptr[nk_command]]
    def header_=(value: nk_command): Unit = !struct.at(0).asInstanceOf[Ptr[nk_command]] = value
    def a: nk_vec2i = !struct.at(16).asInstanceOf[Ptr[nk_vec2i]]
    def a_=(value: nk_vec2i): Unit = !struct.at(16).asInstanceOf[Ptr[nk_vec2i]] = value
    def b: nk_vec2i = !struct.at(20).asInstanceOf[Ptr[nk_vec2i]]
    def b_=(value: nk_vec2i): Unit = !struct.at(20).asInstanceOf[Ptr[nk_vec2i]] = value
    def c: nk_vec2i = !struct.at(24).asInstanceOf[Ptr[nk_vec2i]]
    def c_=(value: nk_vec2i): Unit = !struct.at(24).asInstanceOf[Ptr[nk_vec2i]] = value
    def color: nk_color = !struct.at(28).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(28).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_config_stack_button_behavior = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object nk_config_stack_button_behavior:
  given _tag: Tag[nk_config_stack_button_behavior] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_config_stack_button_behavior] = scala.scalanative.unsafe.alloc[nk_config_stack_button_behavior](1)
  def apply(head : CInt, elements : CArray[nk_config_stack_button_behavior_element, Nat._8])(using Zone): Ptr[nk_config_stack_button_behavior] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).elements = elements
    ____ptr
  extension (struct: nk_config_stack_button_behavior)
    def head: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def head_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def elements: CArray[nk_config_stack_button_behavior_element, Nat._8] = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_button_behavior_element, Nat._8]]]
    def elements_=(value: CArray[nk_config_stack_button_behavior_element, Nat._8]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_button_behavior_element, Nat._8]]] = value

opaque type nk_config_stack_button_behavior_element = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_config_stack_button_behavior_element:
  given _tag: Tag[nk_config_stack_button_behavior_element] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_config_stack_button_behavior_element] = scala.scalanative.unsafe.alloc[nk_config_stack_button_behavior_element](1)
  def apply(address : Ptr[nk_button_behavior], old_value : nk_button_behavior)(using Zone): Ptr[nk_config_stack_button_behavior_element] = 
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).old_value = old_value
    ____ptr
  extension (struct: nk_config_stack_button_behavior_element)
    def address: Ptr[nk_button_behavior] = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_button_behavior]]]
    def address_=(value: Ptr[nk_button_behavior]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_button_behavior]]] = value
    def old_value: nk_button_behavior = !struct.at(8).asInstanceOf[Ptr[nk_button_behavior]]
    def old_value_=(value: nk_button_behavior): Unit = !struct.at(8).asInstanceOf[Ptr[nk_button_behavior]] = value

opaque type nk_config_stack_color = CArray[CChar, Nat.Digit3[Nat._5, Nat._2, Nat._0]]
object nk_config_stack_color:
  given _tag: Tag[nk_config_stack_color] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._5, Nat._2, Nat._0](Tag.Nat5, Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_config_stack_color] = scala.scalanative.unsafe.alloc[nk_config_stack_color](1)
  def apply(head : CInt, elements : CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[nk_config_stack_color] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).elements = elements
    ____ptr
  extension (struct: nk_config_stack_color)
    def head: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def head_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def elements: CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]] = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]]]]
    def elements_=(value: CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]]]] = value

opaque type nk_config_stack_color_element = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_config_stack_color_element:
  given _tag: Tag[nk_config_stack_color_element] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_config_stack_color_element] = scala.scalanative.unsafe.alloc[nk_config_stack_color_element](1)
  def apply(address : Ptr[nk_color], old_value : nk_color)(using Zone): Ptr[nk_config_stack_color_element] = 
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).old_value = old_value
    ____ptr
  extension (struct: nk_config_stack_color_element)
    def address: Ptr[nk_color] = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_color]]]
    def address_=(value: Ptr[nk_color]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_color]]] = value
    def old_value: nk_color = !struct.at(8).asInstanceOf[Ptr[nk_color]]
    def old_value_=(value: nk_color): Unit = !struct.at(8).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_config_stack_flags = CArray[CChar, Nat.Digit3[Nat._5, Nat._2, Nat._0]]
object nk_config_stack_flags:
  given _tag: Tag[nk_config_stack_flags] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._5, Nat._2, Nat._0](Tag.Nat5, Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_config_stack_flags] = scala.scalanative.unsafe.alloc[nk_config_stack_flags](1)
  def apply(head : CInt, elements : CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[nk_config_stack_flags] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).elements = elements
    ____ptr
  extension (struct: nk_config_stack_flags)
    def head: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def head_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def elements: CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]] = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]]]]
    def elements_=(value: CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]]]] = value

opaque type nk_config_stack_flags_element = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_config_stack_flags_element:
  given _tag: Tag[nk_config_stack_flags_element] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_config_stack_flags_element] = scala.scalanative.unsafe.alloc[nk_config_stack_flags_element](1)
  def apply(address : Ptr[nk_flags], old_value : nk_flags)(using Zone): Ptr[nk_config_stack_flags_element] = 
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).old_value = old_value
    ____ptr
  extension (struct: nk_config_stack_flags_element)
    def address: Ptr[nk_flags] = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_flags]]]
    def address_=(value: Ptr[nk_flags]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_flags]]] = value
    def old_value: nk_flags = !struct.at(8).asInstanceOf[Ptr[nk_flags]]
    def old_value_=(value: nk_flags): Unit = !struct.at(8).asInstanceOf[Ptr[nk_flags]] = value

opaque type nk_config_stack_float = CArray[CChar, Nat.Digit3[Nat._5, Nat._2, Nat._0]]
object nk_config_stack_float:
  given _tag: Tag[nk_config_stack_float] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._5, Nat._2, Nat._0](Tag.Nat5, Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_config_stack_float] = scala.scalanative.unsafe.alloc[nk_config_stack_float](1)
  def apply(head : CInt, elements : CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[nk_config_stack_float] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).elements = elements
    ____ptr
  extension (struct: nk_config_stack_float)
    def head: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def head_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def elements: CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]] = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]]]]
    def elements_=(value: CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]]]] = value

opaque type nk_config_stack_float_element = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_config_stack_float_element:
  given _tag: Tag[nk_config_stack_float_element] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_config_stack_float_element] = scala.scalanative.unsafe.alloc[nk_config_stack_float_element](1)
  def apply(address : Ptr[Float], old_value : Float)(using Zone): Ptr[nk_config_stack_float_element] = 
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).old_value = old_value
    ____ptr
  extension (struct: nk_config_stack_float_element)
    def address: Ptr[Float] = !struct.at(0).asInstanceOf[Ptr[Ptr[Float]]]
    def address_=(value: Ptr[Float]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Float]]] = value
    def old_value: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def old_value_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value

opaque type nk_config_stack_style_item = CArray[CChar, Nat.Digit3[Nat._6, Nat._4, Nat._8]]
object nk_config_stack_style_item:
  given _tag: Tag[nk_config_stack_style_item] = Tag.CArray[CChar, Nat.Digit3[Nat._6, Nat._4, Nat._8]](Tag.Byte, Tag.Digit3[Nat._6, Nat._4, Nat._8](Tag.Nat6, Tag.Nat4, Tag.Nat8))
  def apply()(using Zone): Ptr[nk_config_stack_style_item] = scala.scalanative.unsafe.alloc[nk_config_stack_style_item](1)
  def apply(head : CInt, elements : CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[nk_config_stack_style_item] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).elements = elements
    ____ptr
  extension (struct: nk_config_stack_style_item)
    def head: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def head_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def elements: CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]]]]
    def elements_=(value: CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]]]] = value

opaque type nk_config_stack_style_item_element = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_config_stack_style_item_element:
  given _tag: Tag[nk_config_stack_style_item_element] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_config_stack_style_item_element] = scala.scalanative.unsafe.alloc[nk_config_stack_style_item_element](1)
  def apply(address : Ptr[nk_style_item], old_value : nk_style_item)(using Zone): Ptr[nk_config_stack_style_item_element] = 
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).old_value = old_value
    ____ptr
  extension (struct: nk_config_stack_style_item_element)
    def address: Ptr[nk_style_item] = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_style_item]]]
    def address_=(value: Ptr[nk_style_item]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_style_item]]] = value
    def old_value: nk_style_item = !struct.at(8).asInstanceOf[Ptr[nk_style_item]]
    def old_value_=(value: nk_style_item): Unit = !struct.at(8).asInstanceOf[Ptr[nk_style_item]] = value

opaque type nk_config_stack_user_font = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object nk_config_stack_user_font:
  given _tag: Tag[nk_config_stack_user_font] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_config_stack_user_font] = scala.scalanative.unsafe.alloc[nk_config_stack_user_font](1)
  def apply(head : CInt, elements : CArray[nk_config_stack_user_font_element, Nat._8])(using Zone): Ptr[nk_config_stack_user_font] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).elements = elements
    ____ptr
  extension (struct: nk_config_stack_user_font)
    def head: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def head_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def elements: CArray[nk_config_stack_user_font_element, Nat._8] = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_user_font_element, Nat._8]]]
    def elements_=(value: CArray[nk_config_stack_user_font_element, Nat._8]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_user_font_element, Nat._8]]] = value

opaque type nk_config_stack_user_font_element = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_config_stack_user_font_element:
  given _tag: Tag[nk_config_stack_user_font_element] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_config_stack_user_font_element] = scala.scalanative.unsafe.alloc[nk_config_stack_user_font_element](1)
  def apply(address : Ptr[Ptr[nk_user_font]], old_value : Ptr[nk_user_font])(using Zone): Ptr[nk_config_stack_user_font_element] = 
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).old_value = old_value
    ____ptr
  extension (struct: nk_config_stack_user_font_element)
    def address: Ptr[Ptr[nk_user_font]] = !struct.at(0).asInstanceOf[Ptr[Ptr[Ptr[nk_user_font]]]]
    def address_=(value: Ptr[Ptr[nk_user_font]]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Ptr[nk_user_font]]]] = value
    def old_value: Ptr[nk_user_font] = !struct.at(8).asInstanceOf[Ptr[Ptr[nk_user_font]]]
    def old_value_=(value: Ptr[nk_user_font]): Unit = !struct.at(8).asInstanceOf[Ptr[Ptr[nk_user_font]]] = value

opaque type nk_config_stack_vec2 = CArray[CChar, Nat.Digit3[Nat._2, Nat._6, Nat._4]]
object nk_config_stack_vec2:
  given _tag: Tag[nk_config_stack_vec2] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._6, Nat._4]](Tag.Byte, Tag.Digit3[Nat._2, Nat._6, Nat._4](Tag.Nat2, Tag.Nat6, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_config_stack_vec2] = scala.scalanative.unsafe.alloc[nk_config_stack_vec2](1)
  def apply(head : CInt, elements : CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[nk_config_stack_vec2] = 
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).elements = elements
    ____ptr
  extension (struct: nk_config_stack_vec2)
    def head: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def head_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def elements: CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]]]]
    def elements_=(value: CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]]]] = value

opaque type nk_config_stack_vec2_element = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_config_stack_vec2_element:
  given _tag: Tag[nk_config_stack_vec2_element] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_config_stack_vec2_element] = scala.scalanative.unsafe.alloc[nk_config_stack_vec2_element](1)
  def apply(address : Ptr[nk_vec2], old_value : nk_vec2)(using Zone): Ptr[nk_config_stack_vec2_element] = 
    val ____ptr = apply()
    (!____ptr).address = address
    (!____ptr).old_value = old_value
    ____ptr
  extension (struct: nk_config_stack_vec2_element)
    def address: Ptr[nk_vec2] = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_vec2]]]
    def address_=(value: Ptr[nk_vec2]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_vec2]]] = value
    def old_value: nk_vec2 = !struct.at(8).asInstanceOf[Ptr[nk_vec2]]
    def old_value_=(value: nk_vec2): Unit = !struct.at(8).asInstanceOf[Ptr[nk_vec2]] = value

opaque type nk_configuration_stacks = CArray[CChar, Nat.Digit4[Nat._2, Nat._7, Nat._4, Nat._4]]
object nk_configuration_stacks:
  given _tag: Tag[nk_configuration_stacks] = Tag.CArray[CChar, Nat.Digit4[Nat._2, Nat._7, Nat._4, Nat._4]](Tag.Byte, Tag.Digit4[Nat._2, Nat._7, Nat._4, Nat._4](Tag.Nat2, Tag.Nat7, Tag.Nat4, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_configuration_stacks] = scala.scalanative.unsafe.alloc[nk_configuration_stacks](1)
  def apply(style_items : nk_config_stack_style_item, floats : nk_config_stack_float, vectors : nk_config_stack_vec2, flags : nk_config_stack_flags, colors : nk_config_stack_color, fonts : nk_config_stack_user_font, button_behaviors : nk_config_stack_button_behavior)(using Zone): Ptr[nk_configuration_stacks] = 
    val ____ptr = apply()
    (!____ptr).style_items = style_items
    (!____ptr).floats = floats
    (!____ptr).vectors = vectors
    (!____ptr).flags = flags
    (!____ptr).colors = colors
    (!____ptr).fonts = fonts
    (!____ptr).button_behaviors = button_behaviors
    ____ptr
  extension (struct: nk_configuration_stacks)
    def style_items: nk_config_stack_style_item = !struct.at(0).asInstanceOf[Ptr[nk_config_stack_style_item]]
    def style_items_=(value: nk_config_stack_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_config_stack_style_item]] = value
    def floats: nk_config_stack_float = !struct.at(648).asInstanceOf[Ptr[nk_config_stack_float]]
    def floats_=(value: nk_config_stack_float): Unit = !struct.at(648).asInstanceOf[Ptr[nk_config_stack_float]] = value
    def vectors: nk_config_stack_vec2 = !struct.at(1168).asInstanceOf[Ptr[nk_config_stack_vec2]]
    def vectors_=(value: nk_config_stack_vec2): Unit = !struct.at(1168).asInstanceOf[Ptr[nk_config_stack_vec2]] = value
    def flags: nk_config_stack_flags = !struct.at(1432).asInstanceOf[Ptr[nk_config_stack_flags]]
    def flags_=(value: nk_config_stack_flags): Unit = !struct.at(1432).asInstanceOf[Ptr[nk_config_stack_flags]] = value
    def colors: nk_config_stack_color = !struct.at(1952).asInstanceOf[Ptr[nk_config_stack_color]]
    def colors_=(value: nk_config_stack_color): Unit = !struct.at(1952).asInstanceOf[Ptr[nk_config_stack_color]] = value
    def fonts: nk_config_stack_user_font = !struct.at(2472).asInstanceOf[Ptr[nk_config_stack_user_font]]
    def fonts_=(value: nk_config_stack_user_font): Unit = !struct.at(2472).asInstanceOf[Ptr[nk_config_stack_user_font]] = value
    def button_behaviors: nk_config_stack_button_behavior = !struct.at(2608).asInstanceOf[Ptr[nk_config_stack_button_behavior]]
    def button_behaviors_=(value: nk_config_stack_button_behavior): Unit = !struct.at(2608).asInstanceOf[Ptr[nk_config_stack_button_behavior]] = value

opaque type nk_context = CArray[CChar, Nat.Digit5[Nat._1, Nat._6, Nat._8, Nat._4, Nat._0]]
object nk_context:
  given _tag: Tag[nk_context] = Tag.CArray[CChar, Nat.Digit5[Nat._1, Nat._6, Nat._8, Nat._4, Nat._0]](Tag.Byte, Tag.Digit5[Nat._1, Nat._6, Nat._8, Nat._4, Nat._0](Tag.Nat1, Tag.Nat6, Tag.Nat8, Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_context] = scala.scalanative.unsafe.alloc[nk_context](1)
  def apply(input : nk_input, style : nk_style, memory : nk_buffer, clip : nk_clipboard, last_widget_state : nk_flags, button_behavior : nk_button_behavior, stacks : nk_configuration_stacks, delta_time_seconds : Float, text_edit : nk_text_edit, overlay : nk_command_buffer, build : CInt, use_pool : CInt, pool : nk_pool, begin : Ptr[nk_window], end : Ptr[nk_window], active : Ptr[nk_window], current : Ptr[nk_window], freelist : Ptr[nk_page_element], count : CUnsignedInt, seq : CUnsignedInt)(using Zone): Ptr[nk_context] = 
    val ____ptr = apply()
    (!____ptr).input = input
    (!____ptr).style = style
    (!____ptr).memory = memory
    (!____ptr).clip = clip
    (!____ptr).last_widget_state = last_widget_state
    (!____ptr).button_behavior = button_behavior
    (!____ptr).stacks = stacks
    (!____ptr).delta_time_seconds = delta_time_seconds
    (!____ptr).text_edit = text_edit
    (!____ptr).overlay = overlay
    (!____ptr).build = build
    (!____ptr).use_pool = use_pool
    (!____ptr).pool = pool
    (!____ptr).begin = begin
    (!____ptr).end = end
    (!____ptr).active = active
    (!____ptr).current = current
    (!____ptr).freelist = freelist
    (!____ptr).count = count
    (!____ptr).seq = seq
    ____ptr
  extension (struct: nk_context)
    def input: nk_input = !struct.at(0).asInstanceOf[Ptr[nk_input]]
    def input_=(value: nk_input): Unit = !struct.at(0).asInstanceOf[Ptr[nk_input]] = value
    def style: nk_style = !struct.at(360).asInstanceOf[Ptr[nk_style]]
    def style_=(value: nk_style): Unit = !struct.at(360).asInstanceOf[Ptr[nk_style]] = value
    def memory: nk_buffer = !struct.at(8360).asInstanceOf[Ptr[nk_buffer]]
    def memory_=(value: nk_buffer): Unit = !struct.at(8360).asInstanceOf[Ptr[nk_buffer]] = value
    def clip: nk_clipboard = !struct.at(8480).asInstanceOf[Ptr[nk_clipboard]]
    def clip_=(value: nk_clipboard): Unit = !struct.at(8480).asInstanceOf[Ptr[nk_clipboard]] = value
    def last_widget_state: nk_flags = !struct.at(8504).asInstanceOf[Ptr[nk_flags]]
    def last_widget_state_=(value: nk_flags): Unit = !struct.at(8504).asInstanceOf[Ptr[nk_flags]] = value
    def button_behavior: nk_button_behavior = !struct.at(8508).asInstanceOf[Ptr[nk_button_behavior]]
    def button_behavior_=(value: nk_button_behavior): Unit = !struct.at(8508).asInstanceOf[Ptr[nk_button_behavior]] = value
    def stacks: nk_configuration_stacks = !struct.at(8512).asInstanceOf[Ptr[nk_configuration_stacks]]
    def stacks_=(value: nk_configuration_stacks): Unit = !struct.at(8512).asInstanceOf[Ptr[nk_configuration_stacks]] = value
    def delta_time_seconds: Float = !struct.at(11256).asInstanceOf[Ptr[Float]]
    def delta_time_seconds_=(value: Float): Unit = !struct.at(11256).asInstanceOf[Ptr[Float]] = value
    def text_edit: nk_text_edit = !struct.at(11264).asInstanceOf[Ptr[nk_text_edit]]
    def text_edit_=(value: nk_text_edit): Unit = !struct.at(11264).asInstanceOf[Ptr[nk_text_edit]] = value
    def overlay: nk_command_buffer = !struct.at(16648).asInstanceOf[Ptr[nk_command_buffer]]
    def overlay_=(value: nk_command_buffer): Unit = !struct.at(16648).asInstanceOf[Ptr[nk_command_buffer]] = value
    def build: CInt = !struct.at(16712).asInstanceOf[Ptr[CInt]]
    def build_=(value: CInt): Unit = !struct.at(16712).asInstanceOf[Ptr[CInt]] = value
    def use_pool: CInt = !struct.at(16716).asInstanceOf[Ptr[CInt]]
    def use_pool_=(value: CInt): Unit = !struct.at(16716).asInstanceOf[Ptr[CInt]] = value
    def pool: nk_pool = !struct.at(16720).asInstanceOf[Ptr[nk_pool]]
    def pool_=(value: nk_pool): Unit = !struct.at(16720).asInstanceOf[Ptr[nk_pool]] = value
    def begin: Ptr[nk_window] = !struct.at(16792).asInstanceOf[Ptr[Ptr[nk_window]]]
    def begin_=(value: Ptr[nk_window]): Unit = !struct.at(16792).asInstanceOf[Ptr[Ptr[nk_window]]] = value
    def end: Ptr[nk_window] = !struct.at(16800).asInstanceOf[Ptr[Ptr[nk_window]]]
    def end_=(value: Ptr[nk_window]): Unit = !struct.at(16800).asInstanceOf[Ptr[Ptr[nk_window]]] = value
    def active: Ptr[nk_window] = !struct.at(16808).asInstanceOf[Ptr[Ptr[nk_window]]]
    def active_=(value: Ptr[nk_window]): Unit = !struct.at(16808).asInstanceOf[Ptr[Ptr[nk_window]]] = value
    def current: Ptr[nk_window] = !struct.at(16816).asInstanceOf[Ptr[Ptr[nk_window]]]
    def current_=(value: Ptr[nk_window]): Unit = !struct.at(16816).asInstanceOf[Ptr[Ptr[nk_window]]] = value
    def freelist: Ptr[nk_page_element] = !struct.at(16824).asInstanceOf[Ptr[Ptr[nk_page_element]]]
    def freelist_=(value: Ptr[nk_page_element]): Unit = !struct.at(16824).asInstanceOf[Ptr[Ptr[nk_page_element]]] = value
    def count: CUnsignedInt = !struct.at(16832).asInstanceOf[Ptr[CUnsignedInt]]
    def count_=(value: CUnsignedInt): Unit = !struct.at(16832).asInstanceOf[Ptr[CUnsignedInt]] = value
    def seq: CUnsignedInt = !struct.at(16836).asInstanceOf[Ptr[CUnsignedInt]]
    def seq_=(value: CUnsignedInt): Unit = !struct.at(16836).asInstanceOf[Ptr[CUnsignedInt]] = value

opaque type nk_convert_config = CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]
object nk_convert_config:
  given _tag: Tag[nk_convert_config] = Tag.CArray[CChar, Nat.Digit2[Nat._6, Nat._4]](Tag.Byte, Tag.Digit2[Nat._6, Nat._4](Tag.Nat6, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_convert_config] = scala.scalanative.unsafe.alloc[nk_convert_config](1)
  def apply(global_alpha : Float, line_AA : nk_anti_aliasing, shape_AA : nk_anti_aliasing, circle_segment_count : CUnsignedInt, arc_segment_count : CUnsignedInt, curve_segment_count : CUnsignedInt, tex_null : nk_draw_null_texture, vertex_layout : Ptr[nk_draw_vertex_layout_element], vertex_size : nk_size, vertex_alignment : nk_size)(using Zone): Ptr[nk_convert_config] = 
    val ____ptr = apply()
    (!____ptr).global_alpha = global_alpha
    (!____ptr).line_AA = line_AA
    (!____ptr).shape_AA = shape_AA
    (!____ptr).circle_segment_count = circle_segment_count
    (!____ptr).arc_segment_count = arc_segment_count
    (!____ptr).curve_segment_count = curve_segment_count
    (!____ptr).tex_null = tex_null
    (!____ptr).vertex_layout = vertex_layout
    (!____ptr).vertex_size = vertex_size
    (!____ptr).vertex_alignment = vertex_alignment
    ____ptr
  extension (struct: nk_convert_config)
    def global_alpha: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def global_alpha_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def line_AA: nk_anti_aliasing = !struct.at(4).asInstanceOf[Ptr[nk_anti_aliasing]]
    def line_AA_=(value: nk_anti_aliasing): Unit = !struct.at(4).asInstanceOf[Ptr[nk_anti_aliasing]] = value
    def shape_AA: nk_anti_aliasing = !struct.at(8).asInstanceOf[Ptr[nk_anti_aliasing]]
    def shape_AA_=(value: nk_anti_aliasing): Unit = !struct.at(8).asInstanceOf[Ptr[nk_anti_aliasing]] = value
    def circle_segment_count: CUnsignedInt = !struct.at(12).asInstanceOf[Ptr[CUnsignedInt]]
    def circle_segment_count_=(value: CUnsignedInt): Unit = !struct.at(12).asInstanceOf[Ptr[CUnsignedInt]] = value
    def arc_segment_count: CUnsignedInt = !struct.at(16).asInstanceOf[Ptr[CUnsignedInt]]
    def arc_segment_count_=(value: CUnsignedInt): Unit = !struct.at(16).asInstanceOf[Ptr[CUnsignedInt]] = value
    def curve_segment_count: CUnsignedInt = !struct.at(20).asInstanceOf[Ptr[CUnsignedInt]]
    def curve_segment_count_=(value: CUnsignedInt): Unit = !struct.at(20).asInstanceOf[Ptr[CUnsignedInt]] = value
    def tex_null: nk_draw_null_texture = !struct.at(24).asInstanceOf[Ptr[nk_draw_null_texture]]
    def tex_null_=(value: nk_draw_null_texture): Unit = !struct.at(24).asInstanceOf[Ptr[nk_draw_null_texture]] = value
    def vertex_layout: Ptr[nk_draw_vertex_layout_element] = !struct.at(40).asInstanceOf[Ptr[Ptr[nk_draw_vertex_layout_element]]]
    def vertex_layout_=(value: Ptr[nk_draw_vertex_layout_element]): Unit = !struct.at(40).asInstanceOf[Ptr[Ptr[nk_draw_vertex_layout_element]]] = value
    def vertex_size: nk_size = !struct.at(48).asInstanceOf[Ptr[nk_size]]
    def vertex_size_=(value: nk_size): Unit = !struct.at(48).asInstanceOf[Ptr[nk_size]] = value
    def vertex_alignment: nk_size = !struct.at(56).asInstanceOf[Ptr[nk_size]]
    def vertex_alignment_=(value: nk_size): Unit = !struct.at(56).asInstanceOf[Ptr[nk_size]] = value

opaque type nk_cursor = CArray[CChar, Nat.Digit2[Nat._3, Nat._6]]
object nk_cursor:
  given _tag: Tag[nk_cursor] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._6]](Tag.Byte, Tag.Digit2[Nat._3, Nat._6](Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_cursor] = scala.scalanative.unsafe.alloc[nk_cursor](1)
  def apply(img : nk_image, size : nk_vec2, offset : nk_vec2)(using Zone): Ptr[nk_cursor] = 
    val ____ptr = apply()
    (!____ptr).img = img
    (!____ptr).size = size
    (!____ptr).offset = offset
    ____ptr
  extension (struct: nk_cursor)
    def img: nk_image = !struct.at(0).asInstanceOf[Ptr[nk_image]]
    def img_=(value: nk_image): Unit = !struct.at(0).asInstanceOf[Ptr[nk_image]] = value
    def size: nk_vec2 = !struct.at(20).asInstanceOf[Ptr[nk_vec2]]
    def size_=(value: nk_vec2): Unit = !struct.at(20).asInstanceOf[Ptr[nk_vec2]] = value
    def offset: nk_vec2 = !struct.at(28).asInstanceOf[Ptr[nk_vec2]]
    def offset_=(value: nk_vec2): Unit = !struct.at(28).asInstanceOf[Ptr[nk_vec2]] = value

opaque type nk_draw_command = CStruct0
object nk_draw_command:
  given _tag: Tag[nk_draw_command] = Tag.materializeCStruct0Tag

opaque type nk_draw_list = CStruct0
object nk_draw_list:
  given _tag: Tag[nk_draw_list] = Tag.materializeCStruct0Tag

opaque type nk_draw_null_texture = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_draw_null_texture:
  given _tag: Tag[nk_draw_null_texture] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_draw_null_texture] = scala.scalanative.unsafe.alloc[nk_draw_null_texture](1)
  def apply(texture : nk_handle, uv : nk_vec2)(using Zone): Ptr[nk_draw_null_texture] = 
    val ____ptr = apply()
    (!____ptr).texture = texture
    (!____ptr).uv = uv
    ____ptr
  extension (struct: nk_draw_null_texture)
    def texture: nk_handle = !struct.at(0).asInstanceOf[Ptr[nk_handle]]
    def texture_=(value: nk_handle): Unit = !struct.at(0).asInstanceOf[Ptr[nk_handle]] = value
    def uv: nk_vec2 = !struct.at(8).asInstanceOf[Ptr[nk_vec2]]
    def uv_=(value: nk_vec2): Unit = !struct.at(8).asInstanceOf[Ptr[nk_vec2]] = value

opaque type nk_draw_vertex_layout_element = CStruct0
object nk_draw_vertex_layout_element:
  given _tag: Tag[nk_draw_vertex_layout_element] = Tag.materializeCStruct0Tag

opaque type nk_edit_state = CArray[CChar, Nat.Digit2[Nat._4, Nat._4]]
object nk_edit_state:
  given _tag: Tag[nk_edit_state] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._4]](Tag.Byte, Tag.Digit2[Nat._4, Nat._4](Tag.Nat4, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_edit_state] = scala.scalanative.unsafe.alloc[nk_edit_state](1)
  def apply(name : nk_hash, seq : CUnsignedInt, old : CUnsignedInt, active : CInt, prev : CInt, cursor : CInt, sel_start : CInt, sel_end : CInt, scrollbar : nk_scroll, mode : CUnsignedChar, single_line : CUnsignedChar)(using Zone): Ptr[nk_edit_state] = 
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).seq = seq
    (!____ptr).old = old
    (!____ptr).active = active
    (!____ptr).prev = prev
    (!____ptr).cursor = cursor
    (!____ptr).sel_start = sel_start
    (!____ptr).sel_end = sel_end
    (!____ptr).scrollbar = scrollbar
    (!____ptr).mode = mode
    (!____ptr).single_line = single_line
    ____ptr
  extension (struct: nk_edit_state)
    def name: nk_hash = !struct.at(0).asInstanceOf[Ptr[nk_hash]]
    def name_=(value: nk_hash): Unit = !struct.at(0).asInstanceOf[Ptr[nk_hash]] = value
    def seq: CUnsignedInt = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]]
    def seq_=(value: CUnsignedInt): Unit = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]] = value
    def old: CUnsignedInt = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]]
    def old_=(value: CUnsignedInt): Unit = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]] = value
    def active: CInt = !struct.at(12).asInstanceOf[Ptr[CInt]]
    def active_=(value: CInt): Unit = !struct.at(12).asInstanceOf[Ptr[CInt]] = value
    def prev: CInt = !struct.at(16).asInstanceOf[Ptr[CInt]]
    def prev_=(value: CInt): Unit = !struct.at(16).asInstanceOf[Ptr[CInt]] = value
    def cursor: CInt = !struct.at(20).asInstanceOf[Ptr[CInt]]
    def cursor_=(value: CInt): Unit = !struct.at(20).asInstanceOf[Ptr[CInt]] = value
    def sel_start: CInt = !struct.at(24).asInstanceOf[Ptr[CInt]]
    def sel_start_=(value: CInt): Unit = !struct.at(24).asInstanceOf[Ptr[CInt]] = value
    def sel_end: CInt = !struct.at(28).asInstanceOf[Ptr[CInt]]
    def sel_end_=(value: CInt): Unit = !struct.at(28).asInstanceOf[Ptr[CInt]] = value
    def scrollbar: nk_scroll = !struct.at(32).asInstanceOf[Ptr[nk_scroll]]
    def scrollbar_=(value: nk_scroll): Unit = !struct.at(32).asInstanceOf[Ptr[nk_scroll]] = value
    def mode: CUnsignedChar = !struct.at(40).asInstanceOf[Ptr[CUnsignedChar]]
    def mode_=(value: CUnsignedChar): Unit = !struct.at(40).asInstanceOf[Ptr[CUnsignedChar]] = value
    def single_line: CUnsignedChar = !struct.at(41).asInstanceOf[Ptr[CUnsignedChar]]
    def single_line_=(value: CUnsignedChar): Unit = !struct.at(41).asInstanceOf[Ptr[CUnsignedChar]] = value

opaque type nk_image = CArray[CChar, Nat.Digit2[Nat._2, Nat._0]]
object nk_image:
  given _tag: Tag[nk_image] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._0]](Tag.Byte, Tag.Digit2[Nat._2, Nat._0](Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_image] = scala.scalanative.unsafe.alloc[nk_image](1)
  def apply(handle : nk_handle, w : nk_ushort, h : nk_ushort, region : CArray[nk_ushort, Nat._4])(using Zone): Ptr[nk_image] = 
    val ____ptr = apply()
    (!____ptr).handle = handle
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).region = region
    ____ptr
  extension (struct: nk_image)
    def handle: nk_handle = !struct.at(0).asInstanceOf[Ptr[nk_handle]]
    def handle_=(value: nk_handle): Unit = !struct.at(0).asInstanceOf[Ptr[nk_handle]] = value
    def w: nk_ushort = !struct.at(8).asInstanceOf[Ptr[nk_ushort]]
    def w_=(value: nk_ushort): Unit = !struct.at(8).asInstanceOf[Ptr[nk_ushort]] = value
    def h: nk_ushort = !struct.at(10).asInstanceOf[Ptr[nk_ushort]]
    def h_=(value: nk_ushort): Unit = !struct.at(10).asInstanceOf[Ptr[nk_ushort]] = value
    def region: CArray[nk_ushort, Nat._4] = !struct.at(12).asInstanceOf[Ptr[CArray[nk_ushort, Nat._4]]]
    def region_=(value: CArray[nk_ushort, Nat._4]): Unit = !struct.at(12).asInstanceOf[Ptr[CArray[nk_ushort, Nat._4]]] = value

opaque type nk_input = CArray[CChar, Nat.Digit3[Nat._3, Nat._6, Nat._0]]
object nk_input:
  given _tag: Tag[nk_input] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._6, Nat._0]](Tag.Byte, Tag.Digit3[Nat._3, Nat._6, Nat._0](Tag.Nat3, Tag.Nat6, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_input] = scala.scalanative.unsafe.alloc[nk_input](1)
  def apply(keyboard : nk_keyboard, mouse : nk_mouse)(using Zone): Ptr[nk_input] = 
    val ____ptr = apply()
    (!____ptr).keyboard = keyboard
    (!____ptr).mouse = mouse
    ____ptr
  extension (struct: nk_input)
    def keyboard: nk_keyboard = !struct.at(0).asInstanceOf[Ptr[nk_keyboard]]
    def keyboard_=(value: nk_keyboard): Unit = !struct.at(0).asInstanceOf[Ptr[nk_keyboard]] = value
    def mouse: nk_mouse = !struct.at(260).asInstanceOf[Ptr[nk_mouse]]
    def mouse_=(value: nk_mouse): Unit = !struct.at(260).asInstanceOf[Ptr[nk_mouse]] = value

opaque type nk_key = CArray[CChar, Nat._8]
object nk_key:
  given _tag: Tag[nk_key] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[nk_key] = scala.scalanative.unsafe.alloc[nk_key](1)
  def apply(down : nk_bool, clicked : CUnsignedInt)(using Zone): Ptr[nk_key] = 
    val ____ptr = apply()
    (!____ptr).down = down
    (!____ptr).clicked = clicked
    ____ptr
  extension (struct: nk_key)
    def down: nk_bool = !struct.at(0).asInstanceOf[Ptr[nk_bool]]
    def down_=(value: nk_bool): Unit = !struct.at(0).asInstanceOf[Ptr[nk_bool]] = value
    def clicked: CUnsignedInt = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]]
    def clicked_=(value: CUnsignedInt): Unit = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]] = value

opaque type nk_keyboard = CArray[CChar, Nat.Digit3[Nat._2, Nat._6, Nat._0]]
object nk_keyboard:
  given _tag: Tag[nk_keyboard] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._6, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._6, Nat._0](Tag.Nat2, Tag.Nat6, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_keyboard] = scala.scalanative.unsafe.alloc[nk_keyboard](1)
  def apply(keys : CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]], text : CArray[CChar, Nat.Digit2[Nat._1, Nat._6]], text_len : CInt)(using Zone): Ptr[nk_keyboard] = 
    val ____ptr = apply()
    (!____ptr).keys = keys
    (!____ptr).text = text
    (!____ptr).text_len = text_len
    ____ptr
  extension (struct: nk_keyboard)
    def keys: CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]] = !struct.at(0).asInstanceOf[Ptr[CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]]]]
    def keys_=(value: CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]]]] = value
    def text: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(240).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]]]
    def text_=(value: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(240).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]]] = value
    def text_len: CInt = !struct.at(256).asInstanceOf[Ptr[CInt]]
    def text_len_=(value: CInt): Unit = !struct.at(256).asInstanceOf[Ptr[CInt]] = value

opaque type nk_list_view = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_list_view:
  given _tag: Tag[nk_list_view] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_list_view] = scala.scalanative.unsafe.alloc[nk_list_view](1)
  def apply(begin : CInt, end : CInt, count : CInt, total_height : CInt, ctx : Ptr[nk_context], scroll_pointer : Ptr[nk_uint], scroll_value : nk_uint)(using Zone): Ptr[nk_list_view] = 
    val ____ptr = apply()
    (!____ptr).begin = begin
    (!____ptr).end = end
    (!____ptr).count = count
    (!____ptr).total_height = total_height
    (!____ptr).ctx = ctx
    (!____ptr).scroll_pointer = scroll_pointer
    (!____ptr).scroll_value = scroll_value
    ____ptr
  extension (struct: nk_list_view)
    def begin: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def begin_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def end: CInt = !struct.at(4).asInstanceOf[Ptr[CInt]]
    def end_=(value: CInt): Unit = !struct.at(4).asInstanceOf[Ptr[CInt]] = value
    def count: CInt = !struct.at(8).asInstanceOf[Ptr[CInt]]
    def count_=(value: CInt): Unit = !struct.at(8).asInstanceOf[Ptr[CInt]] = value
    def total_height: CInt = !struct.at(12).asInstanceOf[Ptr[CInt]]
    def total_height_=(value: CInt): Unit = !struct.at(12).asInstanceOf[Ptr[CInt]] = value
    def ctx: Ptr[nk_context] = !struct.at(16).asInstanceOf[Ptr[Ptr[nk_context]]]
    def ctx_=(value: Ptr[nk_context]): Unit = !struct.at(16).asInstanceOf[Ptr[Ptr[nk_context]]] = value
    def scroll_pointer: Ptr[nk_uint] = !struct.at(24).asInstanceOf[Ptr[Ptr[nk_uint]]]
    def scroll_pointer_=(value: Ptr[nk_uint]): Unit = !struct.at(24).asInstanceOf[Ptr[Ptr[nk_uint]]] = value
    def scroll_value: nk_uint = !struct.at(32).asInstanceOf[Ptr[nk_uint]]
    def scroll_value_=(value: nk_uint): Unit = !struct.at(32).asInstanceOf[Ptr[nk_uint]] = value

opaque type nk_memory = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_memory:
  given _tag: Tag[nk_memory] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_memory] = scala.scalanative.unsafe.alloc[nk_memory](1)
  def apply(ptr : Ptr[Byte], size : nk_size)(using Zone): Ptr[nk_memory] = 
    val ____ptr = apply()
    (!____ptr).ptr = ptr
    (!____ptr).size = size
    ____ptr
  extension (struct: nk_memory)
    def ptr: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
    def ptr_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
    def size: nk_size = !struct.at(8).asInstanceOf[Ptr[nk_size]]
    def size_=(value: nk_size): Unit = !struct.at(8).asInstanceOf[Ptr[nk_size]] = value

opaque type nk_memory_status = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]
object nk_memory_status:
  given _tag: Tag[nk_memory_status] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  def apply()(using Zone): Ptr[nk_memory_status] = scala.scalanative.unsafe.alloc[nk_memory_status](1)
  def apply(memory : Ptr[Byte], `type` : CUnsignedInt, size : nk_size, allocated : nk_size, needed : nk_size, calls : nk_size)(using Zone): Ptr[nk_memory_status] = 
    val ____ptr = apply()
    (!____ptr).memory = memory
    (!____ptr).`type` = `type`
    (!____ptr).size = size
    (!____ptr).allocated = allocated
    (!____ptr).needed = needed
    (!____ptr).calls = calls
    ____ptr
  extension (struct: nk_memory_status)
    def memory: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
    def memory_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
    def `type`: CUnsignedInt = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]]
    def type_=(value: CUnsignedInt): Unit = !struct.at(8).asInstanceOf[Ptr[CUnsignedInt]] = value
    def size: nk_size = !struct.at(16).asInstanceOf[Ptr[nk_size]]
    def size_=(value: nk_size): Unit = !struct.at(16).asInstanceOf[Ptr[nk_size]] = value
    def allocated: nk_size = !struct.at(24).asInstanceOf[Ptr[nk_size]]
    def allocated_=(value: nk_size): Unit = !struct.at(24).asInstanceOf[Ptr[nk_size]] = value
    def needed: nk_size = !struct.at(32).asInstanceOf[Ptr[nk_size]]
    def needed_=(value: nk_size): Unit = !struct.at(32).asInstanceOf[Ptr[nk_size]] = value
    def calls: nk_size = !struct.at(40).asInstanceOf[Ptr[nk_size]]
    def calls_=(value: nk_size): Unit = !struct.at(40).asInstanceOf[Ptr[nk_size]] = value

opaque type nk_menu_state = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object nk_menu_state:
  given _tag: Tag[nk_menu_state] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_menu_state] = scala.scalanative.unsafe.alloc[nk_menu_state](1)
  def apply(x : Float, y : Float, w : Float, h : Float, offset : nk_scroll)(using Zone): Ptr[nk_menu_state] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).offset = offset
    ____ptr
  extension (struct: nk_menu_state)
    def x: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def x_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def y: Float = !struct.at(4).asInstanceOf[Ptr[Float]]
    def y_=(value: Float): Unit = !struct.at(4).asInstanceOf[Ptr[Float]] = value
    def w: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def w_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def h: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def h_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value
    def offset: nk_scroll = !struct.at(16).asInstanceOf[Ptr[nk_scroll]]
    def offset_=(value: nk_scroll): Unit = !struct.at(16).asInstanceOf[Ptr[nk_scroll]] = value

opaque type nk_mouse = CArray[CChar, Nat.Digit3[Nat._1, Nat._0, Nat._0]]
object nk_mouse:
  given _tag: Tag[nk_mouse] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._0, Nat._0]](Tag.Byte, Tag.Digit3[Nat._1, Nat._0, Nat._0](Tag.Nat1, Tag.Nat0, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_mouse] = scala.scalanative.unsafe.alloc[nk_mouse](1)
  def apply(buttons : CArray[nk_mouse_button, Nat._4], pos : nk_vec2, prev : nk_vec2, delta : nk_vec2, scroll_delta : nk_vec2, grab : CUnsignedChar, grabbed : CUnsignedChar, ungrab : CUnsignedChar)(using Zone): Ptr[nk_mouse] = 
    val ____ptr = apply()
    (!____ptr).buttons = buttons
    (!____ptr).pos = pos
    (!____ptr).prev = prev
    (!____ptr).delta = delta
    (!____ptr).scroll_delta = scroll_delta
    (!____ptr).grab = grab
    (!____ptr).grabbed = grabbed
    (!____ptr).ungrab = ungrab
    ____ptr
  extension (struct: nk_mouse)
    def buttons: CArray[nk_mouse_button, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[nk_mouse_button, Nat._4]]]
    def buttons_=(value: CArray[nk_mouse_button, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[nk_mouse_button, Nat._4]]] = value
    def pos: nk_vec2 = !struct.at(64).asInstanceOf[Ptr[nk_vec2]]
    def pos_=(value: nk_vec2): Unit = !struct.at(64).asInstanceOf[Ptr[nk_vec2]] = value
    def prev: nk_vec2 = !struct.at(72).asInstanceOf[Ptr[nk_vec2]]
    def prev_=(value: nk_vec2): Unit = !struct.at(72).asInstanceOf[Ptr[nk_vec2]] = value
    def delta: nk_vec2 = !struct.at(80).asInstanceOf[Ptr[nk_vec2]]
    def delta_=(value: nk_vec2): Unit = !struct.at(80).asInstanceOf[Ptr[nk_vec2]] = value
    def scroll_delta: nk_vec2 = !struct.at(88).asInstanceOf[Ptr[nk_vec2]]
    def scroll_delta_=(value: nk_vec2): Unit = !struct.at(88).asInstanceOf[Ptr[nk_vec2]] = value
    def grab: CUnsignedChar = !struct.at(96).asInstanceOf[Ptr[CUnsignedChar]]
    def grab_=(value: CUnsignedChar): Unit = !struct.at(96).asInstanceOf[Ptr[CUnsignedChar]] = value
    def grabbed: CUnsignedChar = !struct.at(97).asInstanceOf[Ptr[CUnsignedChar]]
    def grabbed_=(value: CUnsignedChar): Unit = !struct.at(97).asInstanceOf[Ptr[CUnsignedChar]] = value
    def ungrab: CUnsignedChar = !struct.at(98).asInstanceOf[Ptr[CUnsignedChar]]
    def ungrab_=(value: CUnsignedChar): Unit = !struct.at(98).asInstanceOf[Ptr[CUnsignedChar]] = value

opaque type nk_mouse_button = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_mouse_button:
  given _tag: Tag[nk_mouse_button] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_mouse_button] = scala.scalanative.unsafe.alloc[nk_mouse_button](1)
  def apply(down : nk_bool, clicked : CUnsignedInt, clicked_pos : nk_vec2)(using Zone): Ptr[nk_mouse_button] = 
    val ____ptr = apply()
    (!____ptr).down = down
    (!____ptr).clicked = clicked
    (!____ptr).clicked_pos = clicked_pos
    ____ptr
  extension (struct: nk_mouse_button)
    def down: nk_bool = !struct.at(0).asInstanceOf[Ptr[nk_bool]]
    def down_=(value: nk_bool): Unit = !struct.at(0).asInstanceOf[Ptr[nk_bool]] = value
    def clicked: CUnsignedInt = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]]
    def clicked_=(value: CUnsignedInt): Unit = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]] = value
    def clicked_pos: nk_vec2 = !struct.at(8).asInstanceOf[Ptr[nk_vec2]]
    def clicked_pos_=(value: nk_vec2): Unit = !struct.at(8).asInstanceOf[Ptr[nk_vec2]] = value

opaque type nk_nine_slice = CArray[CChar, Nat.Digit2[Nat._2, Nat._8]]
object nk_nine_slice:
  given _tag: Tag[nk_nine_slice] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._8]](Tag.Byte, Tag.Digit2[Nat._2, Nat._8](Tag.Nat2, Tag.Nat8))
  def apply()(using Zone): Ptr[nk_nine_slice] = scala.scalanative.unsafe.alloc[nk_nine_slice](1)
  def apply(img : nk_image, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): Ptr[nk_nine_slice] = 
    val ____ptr = apply()
    (!____ptr).img = img
    (!____ptr).l = l
    (!____ptr).t = t
    (!____ptr).r = r
    (!____ptr).b = b
    ____ptr
  extension (struct: nk_nine_slice)
    def img: nk_image = !struct.at(0).asInstanceOf[Ptr[nk_image]]
    def img_=(value: nk_image): Unit = !struct.at(0).asInstanceOf[Ptr[nk_image]] = value
    def l: nk_ushort = !struct.at(20).asInstanceOf[Ptr[nk_ushort]]
    def l_=(value: nk_ushort): Unit = !struct.at(20).asInstanceOf[Ptr[nk_ushort]] = value
    def t: nk_ushort = !struct.at(22).asInstanceOf[Ptr[nk_ushort]]
    def t_=(value: nk_ushort): Unit = !struct.at(22).asInstanceOf[Ptr[nk_ushort]] = value
    def r: nk_ushort = !struct.at(24).asInstanceOf[Ptr[nk_ushort]]
    def r_=(value: nk_ushort): Unit = !struct.at(24).asInstanceOf[Ptr[nk_ushort]] = value
    def b: nk_ushort = !struct.at(26).asInstanceOf[Ptr[nk_ushort]]
    def b_=(value: nk_ushort): Unit = !struct.at(26).asInstanceOf[Ptr[nk_ushort]] = value

opaque type nk_page = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object nk_page:
  given _tag: Tag[nk_page] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_page] = scala.scalanative.unsafe.alloc[nk_page](1)
  def apply(size : CUnsignedInt, next : Ptr[nk_page], win : CArray[nk_page_element, Nat._1])(using Zone): Ptr[nk_page] = 
    val ____ptr = apply()
    (!____ptr).size = size
    (!____ptr).next = next
    (!____ptr).win = win
    ____ptr
  extension (struct: nk_page)
    def size: CUnsignedInt = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
    def size_=(value: CUnsignedInt): Unit = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
    def next: Ptr[nk_page] = !struct.at(8).asInstanceOf[Ptr[Ptr[nk_page]]]
    def next_=(value: Ptr[nk_page]): Unit = !struct.at(8).asInstanceOf[Ptr[Ptr[nk_page]]] = value
    def win: CArray[nk_page_element, Nat._1] = !struct.at(16).asInstanceOf[Ptr[CArray[nk_page_element, Nat._1]]]
    def win_=(value: CArray[nk_page_element, Nat._1]): Unit = !struct.at(16).asInstanceOf[Ptr[CArray[nk_page_element, Nat._1]]] = value

opaque type nk_page_element = CArray[CChar, Nat.Digit3[Nat._5, Nat._2, Nat._0]]
object nk_page_element:
  given _tag: Tag[nk_page_element] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._5, Nat._2, Nat._0](Tag.Nat5, Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_page_element] = scala.scalanative.unsafe.alloc[nk_page_element](1)
  def apply(data : nk_page_data, next : Ptr[nk_page_element], prev : Ptr[nk_page_element])(using Zone): Ptr[nk_page_element] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    ____ptr
  extension (struct: nk_page_element)
    def data: nk_page_data = !struct.at(0).asInstanceOf[Ptr[nk_page_data]]
    def data_=(value: nk_page_data): Unit = !struct.at(0).asInstanceOf[Ptr[nk_page_data]] = value
    def next: Ptr[nk_page_element] = !struct.at(504).asInstanceOf[Ptr[Ptr[nk_page_element]]]
    def next_=(value: Ptr[nk_page_element]): Unit = !struct.at(504).asInstanceOf[Ptr[Ptr[nk_page_element]]] = value
    def prev: Ptr[nk_page_element] = !struct.at(512).asInstanceOf[Ptr[Ptr[nk_page_element]]]
    def prev_=(value: Ptr[nk_page_element]): Unit = !struct.at(512).asInstanceOf[Ptr[Ptr[nk_page_element]]] = value

opaque type nk_panel = CArray[CChar, Nat.Digit3[Nat._4, Nat._6, Nat._4]]
object nk_panel:
  given _tag: Tag[nk_panel] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._6, Nat._4]](Tag.Byte, Tag.Digit3[Nat._4, Nat._6, Nat._4](Tag.Nat4, Tag.Nat6, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_panel] = scala.scalanative.unsafe.alloc[nk_panel](1)
  def apply(`type` : nk_panel_type, flags : nk_flags, bounds : nk_rect, offset_x : Ptr[nk_uint], offset_y : Ptr[nk_uint], at_x : Float, at_y : Float, max_x : Float, footer_height : Float, header_height : Float, border : Float, has_scrolling : CUnsignedInt, clip : nk_rect, menu : nk_menu_state, row : nk_row_layout, chart : nk_chart, buffer : Ptr[nk_command_buffer], parent : Ptr[nk_panel])(using Zone): Ptr[nk_panel] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).flags = flags
    (!____ptr).bounds = bounds
    (!____ptr).offset_x = offset_x
    (!____ptr).offset_y = offset_y
    (!____ptr).at_x = at_x
    (!____ptr).at_y = at_y
    (!____ptr).max_x = max_x
    (!____ptr).footer_height = footer_height
    (!____ptr).header_height = header_height
    (!____ptr).border = border
    (!____ptr).has_scrolling = has_scrolling
    (!____ptr).clip = clip
    (!____ptr).menu = menu
    (!____ptr).row = row
    (!____ptr).chart = chart
    (!____ptr).buffer = buffer
    (!____ptr).parent = parent
    ____ptr
  extension (struct: nk_panel)
    def `type`: nk_panel_type = !struct.at(0).asInstanceOf[Ptr[nk_panel_type]]
    def type_=(value: nk_panel_type): Unit = !struct.at(0).asInstanceOf[Ptr[nk_panel_type]] = value
    def flags: nk_flags = !struct.at(4).asInstanceOf[Ptr[nk_flags]]
    def flags_=(value: nk_flags): Unit = !struct.at(4).asInstanceOf[Ptr[nk_flags]] = value
    def bounds: nk_rect = !struct.at(8).asInstanceOf[Ptr[nk_rect]]
    def bounds_=(value: nk_rect): Unit = !struct.at(8).asInstanceOf[Ptr[nk_rect]] = value
    def offset_x: Ptr[nk_uint] = !struct.at(24).asInstanceOf[Ptr[Ptr[nk_uint]]]
    def offset_x_=(value: Ptr[nk_uint]): Unit = !struct.at(24).asInstanceOf[Ptr[Ptr[nk_uint]]] = value
    def offset_y: Ptr[nk_uint] = !struct.at(32).asInstanceOf[Ptr[Ptr[nk_uint]]]
    def offset_y_=(value: Ptr[nk_uint]): Unit = !struct.at(32).asInstanceOf[Ptr[Ptr[nk_uint]]] = value
    def at_x: Float = !struct.at(40).asInstanceOf[Ptr[Float]]
    def at_x_=(value: Float): Unit = !struct.at(40).asInstanceOf[Ptr[Float]] = value
    def at_y: Float = !struct.at(44).asInstanceOf[Ptr[Float]]
    def at_y_=(value: Float): Unit = !struct.at(44).asInstanceOf[Ptr[Float]] = value
    def max_x: Float = !struct.at(48).asInstanceOf[Ptr[Float]]
    def max_x_=(value: Float): Unit = !struct.at(48).asInstanceOf[Ptr[Float]] = value
    def footer_height: Float = !struct.at(52).asInstanceOf[Ptr[Float]]
    def footer_height_=(value: Float): Unit = !struct.at(52).asInstanceOf[Ptr[Float]] = value
    def header_height: Float = !struct.at(56).asInstanceOf[Ptr[Float]]
    def header_height_=(value: Float): Unit = !struct.at(56).asInstanceOf[Ptr[Float]] = value
    def border: Float = !struct.at(60).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(60).asInstanceOf[Ptr[Float]] = value
    def has_scrolling: CUnsignedInt = !struct.at(64).asInstanceOf[Ptr[CUnsignedInt]]
    def has_scrolling_=(value: CUnsignedInt): Unit = !struct.at(64).asInstanceOf[Ptr[CUnsignedInt]] = value
    def clip: nk_rect = !struct.at(68).asInstanceOf[Ptr[nk_rect]]
    def clip_=(value: nk_rect): Unit = !struct.at(68).asInstanceOf[Ptr[nk_rect]] = value
    def menu: nk_menu_state = !struct.at(84).asInstanceOf[Ptr[nk_menu_state]]
    def menu_=(value: nk_menu_state): Unit = !struct.at(84).asInstanceOf[Ptr[nk_menu_state]] = value
    def row: nk_row_layout = !struct.at(112).asInstanceOf[Ptr[nk_row_layout]]
    def row_=(value: nk_row_layout): Unit = !struct.at(112).asInstanceOf[Ptr[nk_row_layout]] = value
    def chart: nk_chart = !struct.at(248).asInstanceOf[Ptr[nk_chart]]
    def chart_=(value: nk_chart): Unit = !struct.at(248).asInstanceOf[Ptr[nk_chart]] = value
    def buffer: Ptr[nk_command_buffer] = !struct.at(448).asInstanceOf[Ptr[Ptr[nk_command_buffer]]]
    def buffer_=(value: Ptr[nk_command_buffer]): Unit = !struct.at(448).asInstanceOf[Ptr[Ptr[nk_command_buffer]]] = value
    def parent: Ptr[nk_panel] = !struct.at(456).asInstanceOf[Ptr[Ptr[nk_panel]]]
    def parent_=(value: Ptr[nk_panel]): Unit = !struct.at(456).asInstanceOf[Ptr[Ptr[nk_panel]]] = value

opaque type nk_pool = CArray[CChar, Nat.Digit2[Nat._7, Nat._2]]
object nk_pool:
  given _tag: Tag[nk_pool] = Tag.CArray[CChar, Nat.Digit2[Nat._7, Nat._2]](Tag.Byte, Tag.Digit2[Nat._7, Nat._2](Tag.Nat7, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_pool] = scala.scalanative.unsafe.alloc[nk_pool](1)
  def apply(alloc : nk_allocator, `type` : nk_allocation_type, page_count : CUnsignedInt, pages : Ptr[nk_page], freelist : Ptr[nk_page_element], capacity : CUnsignedInt, size : nk_size, cap : nk_size)(using Zone): Ptr[nk_pool] = 
    val ____ptr = apply()
    (!____ptr).alloc = alloc
    (!____ptr).`type` = `type`
    (!____ptr).page_count = page_count
    (!____ptr).pages = pages
    (!____ptr).freelist = freelist
    (!____ptr).capacity = capacity
    (!____ptr).size = size
    (!____ptr).cap = cap
    ____ptr
  extension (struct: nk_pool)
    def alloc: nk_allocator = !struct.at(0).asInstanceOf[Ptr[nk_allocator]]
    def alloc_=(value: nk_allocator): Unit = !struct.at(0).asInstanceOf[Ptr[nk_allocator]] = value
    def `type`: nk_allocation_type = !struct.at(24).asInstanceOf[Ptr[nk_allocation_type]]
    def type_=(value: nk_allocation_type): Unit = !struct.at(24).asInstanceOf[Ptr[nk_allocation_type]] = value
    def page_count: CUnsignedInt = !struct.at(28).asInstanceOf[Ptr[CUnsignedInt]]
    def page_count_=(value: CUnsignedInt): Unit = !struct.at(28).asInstanceOf[Ptr[CUnsignedInt]] = value
    def pages: Ptr[nk_page] = !struct.at(32).asInstanceOf[Ptr[Ptr[nk_page]]]
    def pages_=(value: Ptr[nk_page]): Unit = !struct.at(32).asInstanceOf[Ptr[Ptr[nk_page]]] = value
    def freelist: Ptr[nk_page_element] = !struct.at(40).asInstanceOf[Ptr[Ptr[nk_page_element]]]
    def freelist_=(value: Ptr[nk_page_element]): Unit = !struct.at(40).asInstanceOf[Ptr[Ptr[nk_page_element]]] = value
    def capacity: CUnsignedInt = !struct.at(48).asInstanceOf[Ptr[CUnsignedInt]]
    def capacity_=(value: CUnsignedInt): Unit = !struct.at(48).asInstanceOf[Ptr[CUnsignedInt]] = value
    def size: nk_size = !struct.at(56).asInstanceOf[Ptr[nk_size]]
    def size_=(value: nk_size): Unit = !struct.at(56).asInstanceOf[Ptr[nk_size]] = value
    def cap: nk_size = !struct.at(64).asInstanceOf[Ptr[nk_size]]
    def cap_=(value: nk_size): Unit = !struct.at(64).asInstanceOf[Ptr[nk_size]] = value

opaque type nk_popup_buffer = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]
object nk_popup_buffer:
  given _tag: Tag[nk_popup_buffer] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_popup_buffer] = scala.scalanative.unsafe.alloc[nk_popup_buffer](1)
  def apply(begin : nk_size, parent : nk_size, last : nk_size, end : nk_size, active : nk_bool)(using Zone): Ptr[nk_popup_buffer] = 
    val ____ptr = apply()
    (!____ptr).begin = begin
    (!____ptr).parent = parent
    (!____ptr).last = last
    (!____ptr).end = end
    (!____ptr).active = active
    ____ptr
  extension (struct: nk_popup_buffer)
    def begin: nk_size = !struct.at(0).asInstanceOf[Ptr[nk_size]]
    def begin_=(value: nk_size): Unit = !struct.at(0).asInstanceOf[Ptr[nk_size]] = value
    def parent: nk_size = !struct.at(8).asInstanceOf[Ptr[nk_size]]
    def parent_=(value: nk_size): Unit = !struct.at(8).asInstanceOf[Ptr[nk_size]] = value
    def last: nk_size = !struct.at(16).asInstanceOf[Ptr[nk_size]]
    def last_=(value: nk_size): Unit = !struct.at(16).asInstanceOf[Ptr[nk_size]] = value
    def end: nk_size = !struct.at(24).asInstanceOf[Ptr[nk_size]]
    def end_=(value: nk_size): Unit = !struct.at(24).asInstanceOf[Ptr[nk_size]] = value
    def active: nk_bool = !struct.at(32).asInstanceOf[Ptr[nk_bool]]
    def active_=(value: nk_bool): Unit = !struct.at(32).asInstanceOf[Ptr[nk_bool]] = value

opaque type nk_popup_state = CArray[CChar, Nat.Digit2[Nat._9, Nat._6]]
object nk_popup_state:
  given _tag: Tag[nk_popup_state] = Tag.CArray[CChar, Nat.Digit2[Nat._9, Nat._6]](Tag.Byte, Tag.Digit2[Nat._9, Nat._6](Tag.Nat9, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_popup_state] = scala.scalanative.unsafe.alloc[nk_popup_state](1)
  def apply(win : Ptr[nk_window], `type` : nk_panel_type, buf : nk_popup_buffer, name : nk_hash, active : nk_bool, combo_count : CUnsignedInt, con_count : CUnsignedInt, con_old : CUnsignedInt, active_con : CUnsignedInt, header : nk_rect)(using Zone): Ptr[nk_popup_state] = 
    val ____ptr = apply()
    (!____ptr).win = win
    (!____ptr).`type` = `type`
    (!____ptr).buf = buf
    (!____ptr).name = name
    (!____ptr).active = active
    (!____ptr).combo_count = combo_count
    (!____ptr).con_count = con_count
    (!____ptr).con_old = con_old
    (!____ptr).active_con = active_con
    (!____ptr).header = header
    ____ptr
  extension (struct: nk_popup_state)
    def win: Ptr[nk_window] = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_window]]]
    def win_=(value: Ptr[nk_window]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_window]]] = value
    def `type`: nk_panel_type = !struct.at(8).asInstanceOf[Ptr[nk_panel_type]]
    def type_=(value: nk_panel_type): Unit = !struct.at(8).asInstanceOf[Ptr[nk_panel_type]] = value
    def buf: nk_popup_buffer = !struct.at(16).asInstanceOf[Ptr[nk_popup_buffer]]
    def buf_=(value: nk_popup_buffer): Unit = !struct.at(16).asInstanceOf[Ptr[nk_popup_buffer]] = value
    def name: nk_hash = !struct.at(56).asInstanceOf[Ptr[nk_hash]]
    def name_=(value: nk_hash): Unit = !struct.at(56).asInstanceOf[Ptr[nk_hash]] = value
    def active: nk_bool = !struct.at(60).asInstanceOf[Ptr[nk_bool]]
    def active_=(value: nk_bool): Unit = !struct.at(60).asInstanceOf[Ptr[nk_bool]] = value
    def combo_count: CUnsignedInt = !struct.at(64).asInstanceOf[Ptr[CUnsignedInt]]
    def combo_count_=(value: CUnsignedInt): Unit = !struct.at(64).asInstanceOf[Ptr[CUnsignedInt]] = value
    def con_count: CUnsignedInt = !struct.at(68).asInstanceOf[Ptr[CUnsignedInt]]
    def con_count_=(value: CUnsignedInt): Unit = !struct.at(68).asInstanceOf[Ptr[CUnsignedInt]] = value
    def con_old: CUnsignedInt = !struct.at(72).asInstanceOf[Ptr[CUnsignedInt]]
    def con_old_=(value: CUnsignedInt): Unit = !struct.at(72).asInstanceOf[Ptr[CUnsignedInt]] = value
    def active_con: CUnsignedInt = !struct.at(76).asInstanceOf[Ptr[CUnsignedInt]]
    def active_con_=(value: CUnsignedInt): Unit = !struct.at(76).asInstanceOf[Ptr[CUnsignedInt]] = value
    def header: nk_rect = !struct.at(80).asInstanceOf[Ptr[nk_rect]]
    def header_=(value: nk_rect): Unit = !struct.at(80).asInstanceOf[Ptr[nk_rect]] = value

opaque type nk_property_state = CArray[CChar, Nat.Digit3[Nat._1, Nat._0, Nat._4]]
object nk_property_state:
  given _tag: Tag[nk_property_state] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._0, Nat._4]](Tag.Byte, Tag.Digit3[Nat._1, Nat._0, Nat._4](Tag.Nat1, Tag.Nat0, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_property_state] = scala.scalanative.unsafe.alloc[nk_property_state](1)
  def apply(active : CInt, prev : CInt, buffer : CArray[CChar, Nat.Digit2[Nat._6, Nat._4]], _length : CInt, cursor : CInt, select_start : CInt, select_end : CInt, name : nk_hash, seq : CUnsignedInt, old : CUnsignedInt, state : CInt)(using Zone): Ptr[nk_property_state] = 
    val ____ptr = apply()
    (!____ptr).active = active
    (!____ptr).prev = prev
    (!____ptr).buffer = buffer
    (!____ptr)._length = _length
    (!____ptr).cursor = cursor
    (!____ptr).select_start = select_start
    (!____ptr).select_end = select_end
    (!____ptr).name = name
    (!____ptr).seq = seq
    (!____ptr).old = old
    (!____ptr).state = state
    ____ptr
  extension (struct: nk_property_state)
    def active: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def active_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def prev: CInt = !struct.at(4).asInstanceOf[Ptr[CInt]]
    def prev_=(value: CInt): Unit = !struct.at(4).asInstanceOf[Ptr[CInt]] = value
    def buffer: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]] = !struct.at(8).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]]
    def buffer_=(value: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]] = value
    def _length: CInt = !struct.at(72).asInstanceOf[Ptr[CInt]]
    def _length_=(value: CInt): Unit = !struct.at(72).asInstanceOf[Ptr[CInt]] = value
    def cursor: CInt = !struct.at(76).asInstanceOf[Ptr[CInt]]
    def cursor_=(value: CInt): Unit = !struct.at(76).asInstanceOf[Ptr[CInt]] = value
    def select_start: CInt = !struct.at(80).asInstanceOf[Ptr[CInt]]
    def select_start_=(value: CInt): Unit = !struct.at(80).asInstanceOf[Ptr[CInt]] = value
    def select_end: CInt = !struct.at(84).asInstanceOf[Ptr[CInt]]
    def select_end_=(value: CInt): Unit = !struct.at(84).asInstanceOf[Ptr[CInt]] = value
    def name: nk_hash = !struct.at(88).asInstanceOf[Ptr[nk_hash]]
    def name_=(value: nk_hash): Unit = !struct.at(88).asInstanceOf[Ptr[nk_hash]] = value
    def seq: CUnsignedInt = !struct.at(92).asInstanceOf[Ptr[CUnsignedInt]]
    def seq_=(value: CUnsignedInt): Unit = !struct.at(92).asInstanceOf[Ptr[CUnsignedInt]] = value
    def old: CUnsignedInt = !struct.at(96).asInstanceOf[Ptr[CUnsignedInt]]
    def old_=(value: CUnsignedInt): Unit = !struct.at(96).asInstanceOf[Ptr[CUnsignedInt]] = value
    def state: CInt = !struct.at(100).asInstanceOf[Ptr[CInt]]
    def state_=(value: CInt): Unit = !struct.at(100).asInstanceOf[Ptr[CInt]] = value

opaque type nk_property_variant = CArray[CChar, Nat.Digit2[Nat._3, Nat._6]]
object nk_property_variant:
  given _tag: Tag[nk_property_variant] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._6]](Tag.Byte, Tag.Digit2[Nat._3, Nat._6](Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_property_variant] = scala.scalanative.unsafe.alloc[nk_property_variant](1)
  def apply(kind : nk_property_kind, value : nk_property, min_value : nk_property, max_value : nk_property, step : nk_property)(using Zone): Ptr[nk_property_variant] = 
    val ____ptr = apply()
    (!____ptr).kind = kind
    (!____ptr).value = value
    (!____ptr).min_value = min_value
    (!____ptr).max_value = max_value
    (!____ptr).step = step
    ____ptr
  extension (struct: nk_property_variant)
    def kind: nk_property_kind = !struct.at(0).asInstanceOf[Ptr[nk_property_kind]]
    def kind_=(value: nk_property_kind): Unit = !struct.at(0).asInstanceOf[Ptr[nk_property_kind]] = value
    def value: nk_property = !struct.at(4).asInstanceOf[Ptr[nk_property]]
    def value_=(value: nk_property): Unit = !struct.at(4).asInstanceOf[Ptr[nk_property]] = value
    def min_value: nk_property = !struct.at(12).asInstanceOf[Ptr[nk_property]]
    def min_value_=(value: nk_property): Unit = !struct.at(12).asInstanceOf[Ptr[nk_property]] = value
    def max_value: nk_property = !struct.at(20).asInstanceOf[Ptr[nk_property]]
    def max_value_=(value: nk_property): Unit = !struct.at(20).asInstanceOf[Ptr[nk_property]] = value
    def step: nk_property = !struct.at(28).asInstanceOf[Ptr[nk_property]]
    def step_=(value: nk_property): Unit = !struct.at(28).asInstanceOf[Ptr[nk_property]] = value

opaque type nk_rect = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_rect:
  given _tag: Tag[nk_rect] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_rect] = scala.scalanative.unsafe.alloc[nk_rect](1)
  def apply(x : Float, y : Float, w : Float, h : Float)(using Zone): Ptr[nk_rect] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    ____ptr
  extension (struct: nk_rect)
    def x: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def x_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def y: Float = !struct.at(4).asInstanceOf[Ptr[Float]]
    def y_=(value: Float): Unit = !struct.at(4).asInstanceOf[Ptr[Float]] = value
    def w: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def w_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def h: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def h_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value

opaque type nk_recti = CArray[CChar, Nat._8]
object nk_recti:
  given _tag: Tag[nk_recti] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[nk_recti] = scala.scalanative.unsafe.alloc[nk_recti](1)
  def apply(x : CShort, y : CShort, w : CShort, h : CShort)(using Zone): Ptr[nk_recti] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).w = w
    (!____ptr).h = h
    ____ptr
  extension (struct: nk_recti)
    def x: CShort = !struct.at(0).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(0).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(2).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(2).asInstanceOf[Ptr[CShort]] = value
    def w: CShort = !struct.at(4).asInstanceOf[Ptr[CShort]]
    def w_=(value: CShort): Unit = !struct.at(4).asInstanceOf[Ptr[CShort]] = value
    def h: CShort = !struct.at(6).asInstanceOf[Ptr[CShort]]
    def h_=(value: CShort): Unit = !struct.at(6).asInstanceOf[Ptr[CShort]] = value

opaque type nk_row_layout = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]
object nk_row_layout:
  given _tag: Tag[nk_row_layout] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_row_layout] = scala.scalanative.unsafe.alloc[nk_row_layout](1)
  def apply(`type` : nk_panel_row_layout_type, index : CInt, height : Float, min_height : Float, columns : CInt, ratio : Ptr[Float], item_width : Float, item_height : Float, item_offset : Float, filled : Float, item : nk_rect, tree_depth : CInt, templates : CArray[Float, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[nk_row_layout] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).index = index
    (!____ptr).height = height
    (!____ptr).min_height = min_height
    (!____ptr).columns = columns
    (!____ptr).ratio = ratio
    (!____ptr).item_width = item_width
    (!____ptr).item_height = item_height
    (!____ptr).item_offset = item_offset
    (!____ptr).filled = filled
    (!____ptr).item = item
    (!____ptr).tree_depth = tree_depth
    (!____ptr).templates = templates
    ____ptr
  extension (struct: nk_row_layout)
    def `type`: nk_panel_row_layout_type = !struct.at(0).asInstanceOf[Ptr[nk_panel_row_layout_type]]
    def type_=(value: nk_panel_row_layout_type): Unit = !struct.at(0).asInstanceOf[Ptr[nk_panel_row_layout_type]] = value
    def index: CInt = !struct.at(4).asInstanceOf[Ptr[CInt]]
    def index_=(value: CInt): Unit = !struct.at(4).asInstanceOf[Ptr[CInt]] = value
    def height: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def height_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def min_height: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def min_height_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value
    def columns: CInt = !struct.at(16).asInstanceOf[Ptr[CInt]]
    def columns_=(value: CInt): Unit = !struct.at(16).asInstanceOf[Ptr[CInt]] = value
    def ratio: Ptr[Float] = !struct.at(24).asInstanceOf[Ptr[Ptr[Float]]]
    def ratio_=(value: Ptr[Float]): Unit = !struct.at(24).asInstanceOf[Ptr[Ptr[Float]]] = value
    def item_width: Float = !struct.at(32).asInstanceOf[Ptr[Float]]
    def item_width_=(value: Float): Unit = !struct.at(32).asInstanceOf[Ptr[Float]] = value
    def item_height: Float = !struct.at(36).asInstanceOf[Ptr[Float]]
    def item_height_=(value: Float): Unit = !struct.at(36).asInstanceOf[Ptr[Float]] = value
    def item_offset: Float = !struct.at(40).asInstanceOf[Ptr[Float]]
    def item_offset_=(value: Float): Unit = !struct.at(40).asInstanceOf[Ptr[Float]] = value
    def filled: Float = !struct.at(44).asInstanceOf[Ptr[Float]]
    def filled_=(value: Float): Unit = !struct.at(44).asInstanceOf[Ptr[Float]] = value
    def item: nk_rect = !struct.at(48).asInstanceOf[Ptr[nk_rect]]
    def item_=(value: nk_rect): Unit = !struct.at(48).asInstanceOf[Ptr[nk_rect]] = value
    def tree_depth: CInt = !struct.at(64).asInstanceOf[Ptr[CInt]]
    def tree_depth_=(value: CInt): Unit = !struct.at(64).asInstanceOf[Ptr[CInt]] = value
    def templates: CArray[Float, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(68).asInstanceOf[Ptr[CArray[Float, Nat.Digit2[Nat._1, Nat._6]]]]
    def templates_=(value: CArray[Float, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(68).asInstanceOf[Ptr[CArray[Float, Nat.Digit2[Nat._1, Nat._6]]]] = value

opaque type nk_scroll = CArray[CChar, Nat._8]
object nk_scroll:
  given _tag: Tag[nk_scroll] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[nk_scroll] = scala.scalanative.unsafe.alloc[nk_scroll](1)
  def apply(x : nk_uint, y : nk_uint)(using Zone): Ptr[nk_scroll] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr
  extension (struct: nk_scroll)
    def x: nk_uint = !struct.at(0).asInstanceOf[Ptr[nk_uint]]
    def x_=(value: nk_uint): Unit = !struct.at(0).asInstanceOf[Ptr[nk_uint]] = value
    def y: nk_uint = !struct.at(4).asInstanceOf[Ptr[nk_uint]]
    def y_=(value: nk_uint): Unit = !struct.at(4).asInstanceOf[Ptr[nk_uint]] = value

opaque type nk_str = CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
object nk_str:
  given _tag: Tag[nk_str] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
  def apply()(using Zone): Ptr[nk_str] = scala.scalanative.unsafe.alloc[nk_str](1)
  def apply(buffer : nk_buffer, len : CInt)(using Zone): Ptr[nk_str] = 
    val ____ptr = apply()
    (!____ptr).buffer = buffer
    (!____ptr).len = len
    ____ptr
  extension (struct: nk_str)
    def buffer: nk_buffer = !struct.at(0).asInstanceOf[Ptr[nk_buffer]]
    def buffer_=(value: nk_buffer): Unit = !struct.at(0).asInstanceOf[Ptr[nk_buffer]] = value
    def len: CInt = !struct.at(120).asInstanceOf[Ptr[CInt]]
    def len_=(value: CInt): Unit = !struct.at(120).asInstanceOf[Ptr[CInt]] = value

opaque type nk_style = CArray[CChar, Nat.Digit4[Nat._8, Nat._0, Nat._0, Nat._0]]
object nk_style:
  given _tag: Tag[nk_style] = Tag.CArray[CChar, Nat.Digit4[Nat._8, Nat._0, Nat._0, Nat._0]](Tag.Byte, Tag.Digit4[Nat._8, Nat._0, Nat._0, Nat._0](Tag.Nat8, Tag.Nat0, Tag.Nat0, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_style] = scala.scalanative.unsafe.alloc[nk_style](1)
  def apply(font : Ptr[nk_user_font], cursors : CArray[Ptr[nk_cursor], Nat._7], cursor_active : Ptr[nk_cursor], cursor_last : Ptr[nk_cursor], cursor_visible : CInt, text : nk_style_text, button : nk_style_button, contextual_button : nk_style_button, menu_button : nk_style_button, option : nk_style_toggle, checkbox : nk_style_toggle, selectable : nk_style_selectable, slider : nk_style_slider, progress : nk_style_progress, property : nk_style_property, edit : nk_style_edit, chart : nk_style_chart, scrollh : nk_style_scrollbar, scrollv : nk_style_scrollbar, tab : nk_style_tab, combo : nk_style_combo, window : nk_style_window)(using Zone): Ptr[nk_style] = 
    val ____ptr = apply()
    (!____ptr).font = font
    (!____ptr).cursors = cursors
    (!____ptr).cursor_active = cursor_active
    (!____ptr).cursor_last = cursor_last
    (!____ptr).cursor_visible = cursor_visible
    (!____ptr).text = text
    (!____ptr).button = button
    (!____ptr).contextual_button = contextual_button
    (!____ptr).menu_button = menu_button
    (!____ptr).option = option
    (!____ptr).checkbox = checkbox
    (!____ptr).selectable = selectable
    (!____ptr).slider = slider
    (!____ptr).progress = progress
    (!____ptr).property = property
    (!____ptr).edit = edit
    (!____ptr).chart = chart
    (!____ptr).scrollh = scrollh
    (!____ptr).scrollv = scrollv
    (!____ptr).tab = tab
    (!____ptr).combo = combo
    (!____ptr).window = window
    ____ptr
  extension (struct: nk_style)
    def font: Ptr[nk_user_font] = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_user_font]]]
    def font_=(value: Ptr[nk_user_font]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[nk_user_font]]] = value
    def cursors: CArray[Ptr[nk_cursor], Nat._7] = !struct.at(8).asInstanceOf[Ptr[CArray[Ptr[nk_cursor], Nat._7]]]
    def cursors_=(value: CArray[Ptr[nk_cursor], Nat._7]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[Ptr[nk_cursor], Nat._7]]] = value
    def cursor_active: Ptr[nk_cursor] = !struct.at(64).asInstanceOf[Ptr[Ptr[nk_cursor]]]
    def cursor_active_=(value: Ptr[nk_cursor]): Unit = !struct.at(64).asInstanceOf[Ptr[Ptr[nk_cursor]]] = value
    def cursor_last: Ptr[nk_cursor] = !struct.at(72).asInstanceOf[Ptr[Ptr[nk_cursor]]]
    def cursor_last_=(value: Ptr[nk_cursor]): Unit = !struct.at(72).asInstanceOf[Ptr[Ptr[nk_cursor]]] = value
    def cursor_visible: CInt = !struct.at(80).asInstanceOf[Ptr[CInt]]
    def cursor_visible_=(value: CInt): Unit = !struct.at(80).asInstanceOf[Ptr[CInt]] = value
    def text: nk_style_text = !struct.at(84).asInstanceOf[Ptr[nk_style_text]]
    def text_=(value: nk_style_text): Unit = !struct.at(84).asInstanceOf[Ptr[nk_style_text]] = value
    def button: nk_style_button = !struct.at(104).asInstanceOf[Ptr[nk_style_button]]
    def button_=(value: nk_style_button): Unit = !struct.at(104).asInstanceOf[Ptr[nk_style_button]] = value
    def contextual_button: nk_style_button = !struct.at(296).asInstanceOf[Ptr[nk_style_button]]
    def contextual_button_=(value: nk_style_button): Unit = !struct.at(296).asInstanceOf[Ptr[nk_style_button]] = value
    def menu_button: nk_style_button = !struct.at(488).asInstanceOf[Ptr[nk_style_button]]
    def menu_button_=(value: nk_style_button): Unit = !struct.at(488).asInstanceOf[Ptr[nk_style_button]] = value
    def option: nk_style_toggle = !struct.at(680).asInstanceOf[Ptr[nk_style_toggle]]
    def option_=(value: nk_style_toggle): Unit = !struct.at(680).asInstanceOf[Ptr[nk_style_toggle]] = value
    def checkbox: nk_style_toggle = !struct.at(920).asInstanceOf[Ptr[nk_style_toggle]]
    def checkbox_=(value: nk_style_toggle): Unit = !struct.at(920).asInstanceOf[Ptr[nk_style_toggle]] = value
    def selectable: nk_style_selectable = !struct.at(1160).asInstanceOf[Ptr[nk_style_selectable]]
    def selectable_=(value: nk_style_selectable): Unit = !struct.at(1160).asInstanceOf[Ptr[nk_style_selectable]] = value
    def slider: nk_style_slider = !struct.at(1448).asInstanceOf[Ptr[nk_style_slider]]
    def slider_=(value: nk_style_slider): Unit = !struct.at(1448).asInstanceOf[Ptr[nk_style_slider]] = value
    def progress: nk_style_progress = !struct.at(2128).asInstanceOf[Ptr[nk_style_progress]]
    def progress_=(value: nk_style_progress): Unit = !struct.at(2128).asInstanceOf[Ptr[nk_style_progress]] = value
    def property: nk_style_property = !struct.at(2384).asInstanceOf[Ptr[nk_style_property]]
    def property_=(value: nk_style_property): Unit = !struct.at(2384).asInstanceOf[Ptr[nk_style_property]] = value
    def edit: nk_style_edit = !struct.at(3784).asInstanceOf[Ptr[nk_style_edit]]
    def edit_=(value: nk_style_edit): Unit = !struct.at(3784).asInstanceOf[Ptr[nk_style_edit]] = value
    def chart: nk_style_chart = !struct.at(4632).asInstanceOf[Ptr[nk_style_chart]]
    def chart_=(value: nk_style_chart): Unit = !struct.at(4632).asInstanceOf[Ptr[nk_style_chart]] = value
    def scrollh: nk_style_scrollbar = !struct.at(4704).asInstanceOf[Ptr[nk_style_scrollbar]]
    def scrollh_=(value: nk_style_scrollbar): Unit = !struct.at(4704).asInstanceOf[Ptr[nk_style_scrollbar]] = value
    def scrollv: nk_style_scrollbar = !struct.at(5360).asInstanceOf[Ptr[nk_style_scrollbar]]
    def scrollv_=(value: nk_style_scrollbar): Unit = !struct.at(5360).asInstanceOf[Ptr[nk_style_scrollbar]] = value
    def tab: nk_style_tab = !struct.at(6016).asInstanceOf[Ptr[nk_style_tab]]
    def tab_=(value: nk_style_tab): Unit = !struct.at(6016).asInstanceOf[Ptr[nk_style_tab]] = value
    def combo: nk_style_combo = !struct.at(6872).asInstanceOf[Ptr[nk_style_combo]]
    def combo_=(value: nk_style_combo): Unit = !struct.at(6872).asInstanceOf[Ptr[nk_style_combo]] = value
    def window: nk_style_window = !struct.at(7248).asInstanceOf[Ptr[nk_style_window]]
    def window_=(value: nk_style_window): Unit = !struct.at(7248).asInstanceOf[Ptr[nk_style_window]] = value

opaque type nk_style_button = CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]
object nk_style_button:
  given _tag: Tag[nk_style_button] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]](Tag.Byte, Tag.Digit3[Nat._1, Nat._9, Nat._2](Tag.Nat1, Tag.Nat9, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_style_button] = scala.scalanative.unsafe.alloc[nk_style_button](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, border_color : nk_color, color_factor_background : Float, text_background : nk_color, text_normal : nk_color, text_hover : nk_color, text_active : nk_color, text_alignment : nk_flags, color_factor_text : Float, border : Float, rounding : Float, padding : nk_vec2, image_padding : nk_vec2, touch_padding : nk_vec2, disabled_factor : Float, userdata : nk_handle, draw_begin : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit], draw_end : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit])(using Zone): Ptr[nk_style_button] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).border_color = border_color
    (!____ptr).color_factor_background = color_factor_background
    (!____ptr).text_background = text_background
    (!____ptr).text_normal = text_normal
    (!____ptr).text_hover = text_hover
    (!____ptr).text_active = text_active
    (!____ptr).text_alignment = text_alignment
    (!____ptr).color_factor_text = color_factor_text
    (!____ptr).border = border
    (!____ptr).rounding = rounding
    (!____ptr).padding = padding
    (!____ptr).image_padding = image_padding
    (!____ptr).touch_padding = touch_padding
    (!____ptr).disabled_factor = disabled_factor
    (!____ptr).userdata = userdata
    (!____ptr).draw_begin = draw_begin
    (!____ptr).draw_end = draw_end
    ____ptr
  extension (struct: nk_style_button)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(96).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(96).asInstanceOf[Ptr[nk_color]] = value
    def color_factor_background: Float = !struct.at(100).asInstanceOf[Ptr[Float]]
    def color_factor_background_=(value: Float): Unit = !struct.at(100).asInstanceOf[Ptr[Float]] = value
    def text_background: nk_color = !struct.at(104).asInstanceOf[Ptr[nk_color]]
    def text_background_=(value: nk_color): Unit = !struct.at(104).asInstanceOf[Ptr[nk_color]] = value
    def text_normal: nk_color = !struct.at(108).asInstanceOf[Ptr[nk_color]]
    def text_normal_=(value: nk_color): Unit = !struct.at(108).asInstanceOf[Ptr[nk_color]] = value
    def text_hover: nk_color = !struct.at(112).asInstanceOf[Ptr[nk_color]]
    def text_hover_=(value: nk_color): Unit = !struct.at(112).asInstanceOf[Ptr[nk_color]] = value
    def text_active: nk_color = !struct.at(116).asInstanceOf[Ptr[nk_color]]
    def text_active_=(value: nk_color): Unit = !struct.at(116).asInstanceOf[Ptr[nk_color]] = value
    def text_alignment: nk_flags = !struct.at(120).asInstanceOf[Ptr[nk_flags]]
    def text_alignment_=(value: nk_flags): Unit = !struct.at(120).asInstanceOf[Ptr[nk_flags]] = value
    def color_factor_text: Float = !struct.at(124).asInstanceOf[Ptr[Float]]
    def color_factor_text_=(value: Float): Unit = !struct.at(124).asInstanceOf[Ptr[Float]] = value
    def border: Float = !struct.at(128).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(128).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(132).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(132).asInstanceOf[Ptr[Float]] = value
    def padding: nk_vec2 = !struct.at(136).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(136).asInstanceOf[Ptr[nk_vec2]] = value
    def image_padding: nk_vec2 = !struct.at(144).asInstanceOf[Ptr[nk_vec2]]
    def image_padding_=(value: nk_vec2): Unit = !struct.at(144).asInstanceOf[Ptr[nk_vec2]] = value
    def touch_padding: nk_vec2 = !struct.at(152).asInstanceOf[Ptr[nk_vec2]]
    def touch_padding_=(value: nk_vec2): Unit = !struct.at(152).asInstanceOf[Ptr[nk_vec2]] = value
    def disabled_factor: Float = !struct.at(160).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(160).asInstanceOf[Ptr[Float]] = value
    def userdata: nk_handle = !struct.at(164).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(164).asInstanceOf[Ptr[nk_handle]] = value
    def draw_begin: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(176).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_begin_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(176).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value
    def draw_end: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(184).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_end_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(184).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value

opaque type nk_style_chart = CArray[CChar, Nat.Digit2[Nat._7, Nat._2]]
object nk_style_chart:
  given _tag: Tag[nk_style_chart] = Tag.CArray[CChar, Nat.Digit2[Nat._7, Nat._2]](Tag.Byte, Tag.Digit2[Nat._7, Nat._2](Tag.Nat7, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_style_chart] = scala.scalanative.unsafe.alloc[nk_style_chart](1)
  def apply(background : nk_style_item, border_color : nk_color, selected_color : nk_color, color : nk_color, border : Float, rounding : Float, padding : nk_vec2, color_factor : Float, disabled_factor : Float, show_markers : nk_bool)(using Zone): Ptr[nk_style_chart] = 
    val ____ptr = apply()
    (!____ptr).background = background
    (!____ptr).border_color = border_color
    (!____ptr).selected_color = selected_color
    (!____ptr).color = color
    (!____ptr).border = border
    (!____ptr).rounding = rounding
    (!____ptr).padding = padding
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    (!____ptr).show_markers = show_markers
    ____ptr
  extension (struct: nk_style_chart)
    def background: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def background_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(32).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(32).asInstanceOf[Ptr[nk_color]] = value
    def selected_color: nk_color = !struct.at(36).asInstanceOf[Ptr[nk_color]]
    def selected_color_=(value: nk_color): Unit = !struct.at(36).asInstanceOf[Ptr[nk_color]] = value
    def color: nk_color = !struct.at(40).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(40).asInstanceOf[Ptr[nk_color]] = value
    def border: Float = !struct.at(44).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(44).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(48).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(48).asInstanceOf[Ptr[Float]] = value
    def padding: nk_vec2 = !struct.at(52).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(52).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(60).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(60).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(64).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(64).asInstanceOf[Ptr[Float]] = value
    def show_markers: nk_bool = !struct.at(68).asInstanceOf[Ptr[nk_bool]]
    def show_markers_=(value: nk_bool): Unit = !struct.at(68).asInstanceOf[Ptr[nk_bool]] = value

opaque type nk_style_combo = CArray[CChar, Nat.Digit3[Nat._3, Nat._7, Nat._6]]
object nk_style_combo:
  given _tag: Tag[nk_style_combo] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._7, Nat._6]](Tag.Byte, Tag.Digit3[Nat._3, Nat._7, Nat._6](Tag.Nat3, Tag.Nat7, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_style_combo] = scala.scalanative.unsafe.alloc[nk_style_combo](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, border_color : nk_color, label_normal : nk_color, label_hover : nk_color, label_active : nk_color, symbol_normal : nk_color, symbol_hover : nk_color, symbol_active : nk_color, button : nk_style_button, sym_normal : nk_symbol_type, sym_hover : nk_symbol_type, sym_active : nk_symbol_type, border : Float, rounding : Float, content_padding : nk_vec2, button_padding : nk_vec2, spacing : nk_vec2, color_factor : Float, disabled_factor : Float)(using Zone): Ptr[nk_style_combo] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).border_color = border_color
    (!____ptr).label_normal = label_normal
    (!____ptr).label_hover = label_hover
    (!____ptr).label_active = label_active
    (!____ptr).symbol_normal = symbol_normal
    (!____ptr).symbol_hover = symbol_hover
    (!____ptr).symbol_active = symbol_active
    (!____ptr).button = button
    (!____ptr).sym_normal = sym_normal
    (!____ptr).sym_hover = sym_hover
    (!____ptr).sym_active = sym_active
    (!____ptr).border = border
    (!____ptr).rounding = rounding
    (!____ptr).content_padding = content_padding
    (!____ptr).button_padding = button_padding
    (!____ptr).spacing = spacing
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    ____ptr
  extension (struct: nk_style_combo)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(96).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(96).asInstanceOf[Ptr[nk_color]] = value
    def label_normal: nk_color = !struct.at(100).asInstanceOf[Ptr[nk_color]]
    def label_normal_=(value: nk_color): Unit = !struct.at(100).asInstanceOf[Ptr[nk_color]] = value
    def label_hover: nk_color = !struct.at(104).asInstanceOf[Ptr[nk_color]]
    def label_hover_=(value: nk_color): Unit = !struct.at(104).asInstanceOf[Ptr[nk_color]] = value
    def label_active: nk_color = !struct.at(108).asInstanceOf[Ptr[nk_color]]
    def label_active_=(value: nk_color): Unit = !struct.at(108).asInstanceOf[Ptr[nk_color]] = value
    def symbol_normal: nk_color = !struct.at(112).asInstanceOf[Ptr[nk_color]]
    def symbol_normal_=(value: nk_color): Unit = !struct.at(112).asInstanceOf[Ptr[nk_color]] = value
    def symbol_hover: nk_color = !struct.at(116).asInstanceOf[Ptr[nk_color]]
    def symbol_hover_=(value: nk_color): Unit = !struct.at(116).asInstanceOf[Ptr[nk_color]] = value
    def symbol_active: nk_color = !struct.at(120).asInstanceOf[Ptr[nk_color]]
    def symbol_active_=(value: nk_color): Unit = !struct.at(120).asInstanceOf[Ptr[nk_color]] = value
    def button: nk_style_button = !struct.at(128).asInstanceOf[Ptr[nk_style_button]]
    def button_=(value: nk_style_button): Unit = !struct.at(128).asInstanceOf[Ptr[nk_style_button]] = value
    def sym_normal: nk_symbol_type = !struct.at(320).asInstanceOf[Ptr[nk_symbol_type]]
    def sym_normal_=(value: nk_symbol_type): Unit = !struct.at(320).asInstanceOf[Ptr[nk_symbol_type]] = value
    def sym_hover: nk_symbol_type = !struct.at(324).asInstanceOf[Ptr[nk_symbol_type]]
    def sym_hover_=(value: nk_symbol_type): Unit = !struct.at(324).asInstanceOf[Ptr[nk_symbol_type]] = value
    def sym_active: nk_symbol_type = !struct.at(328).asInstanceOf[Ptr[nk_symbol_type]]
    def sym_active_=(value: nk_symbol_type): Unit = !struct.at(328).asInstanceOf[Ptr[nk_symbol_type]] = value
    def border: Float = !struct.at(332).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(332).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(336).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(336).asInstanceOf[Ptr[Float]] = value
    def content_padding: nk_vec2 = !struct.at(340).asInstanceOf[Ptr[nk_vec2]]
    def content_padding_=(value: nk_vec2): Unit = !struct.at(340).asInstanceOf[Ptr[nk_vec2]] = value
    def button_padding: nk_vec2 = !struct.at(348).asInstanceOf[Ptr[nk_vec2]]
    def button_padding_=(value: nk_vec2): Unit = !struct.at(348).asInstanceOf[Ptr[nk_vec2]] = value
    def spacing: nk_vec2 = !struct.at(356).asInstanceOf[Ptr[nk_vec2]]
    def spacing_=(value: nk_vec2): Unit = !struct.at(356).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(364).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(364).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(368).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(368).asInstanceOf[Ptr[Float]] = value

opaque type nk_style_edit = CArray[CChar, Nat.Digit3[Nat._8, Nat._4, Nat._8]]
object nk_style_edit:
  given _tag: Tag[nk_style_edit] = Tag.CArray[CChar, Nat.Digit3[Nat._8, Nat._4, Nat._8]](Tag.Byte, Tag.Digit3[Nat._8, Nat._4, Nat._8](Tag.Nat8, Tag.Nat4, Tag.Nat8))
  def apply()(using Zone): Ptr[nk_style_edit] = scala.scalanative.unsafe.alloc[nk_style_edit](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, border_color : nk_color, scrollbar : nk_style_scrollbar, cursor_normal : nk_color, cursor_hover : nk_color, cursor_text_normal : nk_color, cursor_text_hover : nk_color, text_normal : nk_color, text_hover : nk_color, text_active : nk_color, selected_normal : nk_color, selected_hover : nk_color, selected_text_normal : nk_color, selected_text_hover : nk_color, border : Float, rounding : Float, cursor_size : Float, scrollbar_size : nk_vec2, padding : nk_vec2, row_padding : Float, color_factor : Float, disabled_factor : Float)(using Zone): Ptr[nk_style_edit] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).border_color = border_color
    (!____ptr).scrollbar = scrollbar
    (!____ptr).cursor_normal = cursor_normal
    (!____ptr).cursor_hover = cursor_hover
    (!____ptr).cursor_text_normal = cursor_text_normal
    (!____ptr).cursor_text_hover = cursor_text_hover
    (!____ptr).text_normal = text_normal
    (!____ptr).text_hover = text_hover
    (!____ptr).text_active = text_active
    (!____ptr).selected_normal = selected_normal
    (!____ptr).selected_hover = selected_hover
    (!____ptr).selected_text_normal = selected_text_normal
    (!____ptr).selected_text_hover = selected_text_hover
    (!____ptr).border = border
    (!____ptr).rounding = rounding
    (!____ptr).cursor_size = cursor_size
    (!____ptr).scrollbar_size = scrollbar_size
    (!____ptr).padding = padding
    (!____ptr).row_padding = row_padding
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    ____ptr
  extension (struct: nk_style_edit)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(96).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(96).asInstanceOf[Ptr[nk_color]] = value
    def scrollbar: nk_style_scrollbar = !struct.at(104).asInstanceOf[Ptr[nk_style_scrollbar]]
    def scrollbar_=(value: nk_style_scrollbar): Unit = !struct.at(104).asInstanceOf[Ptr[nk_style_scrollbar]] = value
    def cursor_normal: nk_color = !struct.at(760).asInstanceOf[Ptr[nk_color]]
    def cursor_normal_=(value: nk_color): Unit = !struct.at(760).asInstanceOf[Ptr[nk_color]] = value
    def cursor_hover: nk_color = !struct.at(764).asInstanceOf[Ptr[nk_color]]
    def cursor_hover_=(value: nk_color): Unit = !struct.at(764).asInstanceOf[Ptr[nk_color]] = value
    def cursor_text_normal: nk_color = !struct.at(768).asInstanceOf[Ptr[nk_color]]
    def cursor_text_normal_=(value: nk_color): Unit = !struct.at(768).asInstanceOf[Ptr[nk_color]] = value
    def cursor_text_hover: nk_color = !struct.at(772).asInstanceOf[Ptr[nk_color]]
    def cursor_text_hover_=(value: nk_color): Unit = !struct.at(772).asInstanceOf[Ptr[nk_color]] = value
    def text_normal: nk_color = !struct.at(776).asInstanceOf[Ptr[nk_color]]
    def text_normal_=(value: nk_color): Unit = !struct.at(776).asInstanceOf[Ptr[nk_color]] = value
    def text_hover: nk_color = !struct.at(780).asInstanceOf[Ptr[nk_color]]
    def text_hover_=(value: nk_color): Unit = !struct.at(780).asInstanceOf[Ptr[nk_color]] = value
    def text_active: nk_color = !struct.at(784).asInstanceOf[Ptr[nk_color]]
    def text_active_=(value: nk_color): Unit = !struct.at(784).asInstanceOf[Ptr[nk_color]] = value
    def selected_normal: nk_color = !struct.at(788).asInstanceOf[Ptr[nk_color]]
    def selected_normal_=(value: nk_color): Unit = !struct.at(788).asInstanceOf[Ptr[nk_color]] = value
    def selected_hover: nk_color = !struct.at(792).asInstanceOf[Ptr[nk_color]]
    def selected_hover_=(value: nk_color): Unit = !struct.at(792).asInstanceOf[Ptr[nk_color]] = value
    def selected_text_normal: nk_color = !struct.at(796).asInstanceOf[Ptr[nk_color]]
    def selected_text_normal_=(value: nk_color): Unit = !struct.at(796).asInstanceOf[Ptr[nk_color]] = value
    def selected_text_hover: nk_color = !struct.at(800).asInstanceOf[Ptr[nk_color]]
    def selected_text_hover_=(value: nk_color): Unit = !struct.at(800).asInstanceOf[Ptr[nk_color]] = value
    def border: Float = !struct.at(804).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(804).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(808).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(808).asInstanceOf[Ptr[Float]] = value
    def cursor_size: Float = !struct.at(812).asInstanceOf[Ptr[Float]]
    def cursor_size_=(value: Float): Unit = !struct.at(812).asInstanceOf[Ptr[Float]] = value
    def scrollbar_size: nk_vec2 = !struct.at(816).asInstanceOf[Ptr[nk_vec2]]
    def scrollbar_size_=(value: nk_vec2): Unit = !struct.at(816).asInstanceOf[Ptr[nk_vec2]] = value
    def padding: nk_vec2 = !struct.at(824).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(824).asInstanceOf[Ptr[nk_vec2]] = value
    def row_padding: Float = !struct.at(832).asInstanceOf[Ptr[Float]]
    def row_padding_=(value: Float): Unit = !struct.at(832).asInstanceOf[Ptr[Float]] = value
    def color_factor: Float = !struct.at(836).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(836).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(840).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(840).asInstanceOf[Ptr[Float]] = value

opaque type nk_style_item = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]
object nk_style_item:
  given _tag: Tag[nk_style_item] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_style_item] = scala.scalanative.unsafe.alloc[nk_style_item](1)
  def apply(`type` : nk_style_item_type, data : nk_style_item_data)(using Zone): Ptr[nk_style_item] = 
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).data = data
    ____ptr
  extension (struct: nk_style_item)
    def `type`: nk_style_item_type = !struct.at(0).asInstanceOf[Ptr[nk_style_item_type]]
    def type_=(value: nk_style_item_type): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item_type]] = value
    def data: nk_style_item_data = !struct.at(4).asInstanceOf[Ptr[nk_style_item_data]]
    def data_=(value: nk_style_item_data): Unit = !struct.at(4).asInstanceOf[Ptr[nk_style_item_data]] = value

opaque type nk_style_progress = CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]
object nk_style_progress:
  given _tag: Tag[nk_style_progress] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]](Tag.Byte, Tag.Digit3[Nat._2, Nat._5, Nat._6](Tag.Nat2, Tag.Nat5, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_style_progress] = scala.scalanative.unsafe.alloc[nk_style_progress](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, border_color : nk_color, cursor_normal : nk_style_item, cursor_hover : nk_style_item, cursor_active : nk_style_item, cursor_border_color : nk_color, rounding : Float, border : Float, cursor_border : Float, cursor_rounding : Float, padding : nk_vec2, color_factor : Float, disabled_factor : Float, userdata : nk_handle, draw_begin : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit], draw_end : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit])(using Zone): Ptr[nk_style_progress] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).border_color = border_color
    (!____ptr).cursor_normal = cursor_normal
    (!____ptr).cursor_hover = cursor_hover
    (!____ptr).cursor_active = cursor_active
    (!____ptr).cursor_border_color = cursor_border_color
    (!____ptr).rounding = rounding
    (!____ptr).border = border
    (!____ptr).cursor_border = cursor_border
    (!____ptr).cursor_rounding = cursor_rounding
    (!____ptr).padding = padding
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    (!____ptr).userdata = userdata
    (!____ptr).draw_begin = draw_begin
    (!____ptr).draw_end = draw_end
    ____ptr
  extension (struct: nk_style_progress)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(96).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(96).asInstanceOf[Ptr[nk_color]] = value
    def cursor_normal: nk_style_item = !struct.at(100).asInstanceOf[Ptr[nk_style_item]]
    def cursor_normal_=(value: nk_style_item): Unit = !struct.at(100).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_hover: nk_style_item = !struct.at(132).asInstanceOf[Ptr[nk_style_item]]
    def cursor_hover_=(value: nk_style_item): Unit = !struct.at(132).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_active: nk_style_item = !struct.at(164).asInstanceOf[Ptr[nk_style_item]]
    def cursor_active_=(value: nk_style_item): Unit = !struct.at(164).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_border_color: nk_color = !struct.at(196).asInstanceOf[Ptr[nk_color]]
    def cursor_border_color_=(value: nk_color): Unit = !struct.at(196).asInstanceOf[Ptr[nk_color]] = value
    def rounding: Float = !struct.at(200).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(200).asInstanceOf[Ptr[Float]] = value
    def border: Float = !struct.at(204).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(204).asInstanceOf[Ptr[Float]] = value
    def cursor_border: Float = !struct.at(208).asInstanceOf[Ptr[Float]]
    def cursor_border_=(value: Float): Unit = !struct.at(208).asInstanceOf[Ptr[Float]] = value
    def cursor_rounding: Float = !struct.at(212).asInstanceOf[Ptr[Float]]
    def cursor_rounding_=(value: Float): Unit = !struct.at(212).asInstanceOf[Ptr[Float]] = value
    def padding: nk_vec2 = !struct.at(216).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(216).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(224).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(224).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(228).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(228).asInstanceOf[Ptr[Float]] = value
    def userdata: nk_handle = !struct.at(232).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(232).asInstanceOf[Ptr[nk_handle]] = value
    def draw_begin: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_begin_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(240).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value
    def draw_end: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(248).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_end_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(248).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value

opaque type nk_style_property = CArray[CChar, Nat.Digit4[Nat._1, Nat._4, Nat._0, Nat._0]]
object nk_style_property:
  given _tag: Tag[nk_style_property] = Tag.CArray[CChar, Nat.Digit4[Nat._1, Nat._4, Nat._0, Nat._0]](Tag.Byte, Tag.Digit4[Nat._1, Nat._4, Nat._0, Nat._0](Tag.Nat1, Tag.Nat4, Tag.Nat0, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_style_property] = scala.scalanative.unsafe.alloc[nk_style_property](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, border_color : nk_color, label_normal : nk_color, label_hover : nk_color, label_active : nk_color, sym_left : nk_symbol_type, sym_right : nk_symbol_type, border : Float, rounding : Float, padding : nk_vec2, color_factor : Float, disabled_factor : Float, edit : nk_style_edit, inc_button : nk_style_button, dec_button : nk_style_button, userdata : nk_handle, draw_begin : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit], draw_end : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit])(using Zone): Ptr[nk_style_property] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).border_color = border_color
    (!____ptr).label_normal = label_normal
    (!____ptr).label_hover = label_hover
    (!____ptr).label_active = label_active
    (!____ptr).sym_left = sym_left
    (!____ptr).sym_right = sym_right
    (!____ptr).border = border
    (!____ptr).rounding = rounding
    (!____ptr).padding = padding
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    (!____ptr).edit = edit
    (!____ptr).inc_button = inc_button
    (!____ptr).dec_button = dec_button
    (!____ptr).userdata = userdata
    (!____ptr).draw_begin = draw_begin
    (!____ptr).draw_end = draw_end
    ____ptr
  extension (struct: nk_style_property)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(96).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(96).asInstanceOf[Ptr[nk_color]] = value
    def label_normal: nk_color = !struct.at(100).asInstanceOf[Ptr[nk_color]]
    def label_normal_=(value: nk_color): Unit = !struct.at(100).asInstanceOf[Ptr[nk_color]] = value
    def label_hover: nk_color = !struct.at(104).asInstanceOf[Ptr[nk_color]]
    def label_hover_=(value: nk_color): Unit = !struct.at(104).asInstanceOf[Ptr[nk_color]] = value
    def label_active: nk_color = !struct.at(108).asInstanceOf[Ptr[nk_color]]
    def label_active_=(value: nk_color): Unit = !struct.at(108).asInstanceOf[Ptr[nk_color]] = value
    def sym_left: nk_symbol_type = !struct.at(112).asInstanceOf[Ptr[nk_symbol_type]]
    def sym_left_=(value: nk_symbol_type): Unit = !struct.at(112).asInstanceOf[Ptr[nk_symbol_type]] = value
    def sym_right: nk_symbol_type = !struct.at(116).asInstanceOf[Ptr[nk_symbol_type]]
    def sym_right_=(value: nk_symbol_type): Unit = !struct.at(116).asInstanceOf[Ptr[nk_symbol_type]] = value
    def border: Float = !struct.at(120).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(120).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(124).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(124).asInstanceOf[Ptr[Float]] = value
    def padding: nk_vec2 = !struct.at(128).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(128).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(136).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(136).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(140).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(140).asInstanceOf[Ptr[Float]] = value
    def edit: nk_style_edit = !struct.at(144).asInstanceOf[Ptr[nk_style_edit]]
    def edit_=(value: nk_style_edit): Unit = !struct.at(144).asInstanceOf[Ptr[nk_style_edit]] = value
    def inc_button: nk_style_button = !struct.at(992).asInstanceOf[Ptr[nk_style_button]]
    def inc_button_=(value: nk_style_button): Unit = !struct.at(992).asInstanceOf[Ptr[nk_style_button]] = value
    def dec_button: nk_style_button = !struct.at(1184).asInstanceOf[Ptr[nk_style_button]]
    def dec_button_=(value: nk_style_button): Unit = !struct.at(1184).asInstanceOf[Ptr[nk_style_button]] = value
    def userdata: nk_handle = !struct.at(1376).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(1376).asInstanceOf[Ptr[nk_handle]] = value
    def draw_begin: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(1384).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_begin_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(1384).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value
    def draw_end: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(1392).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_end_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(1392).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value

opaque type nk_style_scrollbar = CArray[CChar, Nat.Digit3[Nat._6, Nat._5, Nat._6]]
object nk_style_scrollbar:
  given _tag: Tag[nk_style_scrollbar] = Tag.CArray[CChar, Nat.Digit3[Nat._6, Nat._5, Nat._6]](Tag.Byte, Tag.Digit3[Nat._6, Nat._5, Nat._6](Tag.Nat6, Tag.Nat5, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_style_scrollbar] = scala.scalanative.unsafe.alloc[nk_style_scrollbar](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, border_color : nk_color, cursor_normal : nk_style_item, cursor_hover : nk_style_item, cursor_active : nk_style_item, cursor_border_color : nk_color, border : Float, rounding : Float, border_cursor : Float, rounding_cursor : Float, padding : nk_vec2, color_factor : Float, disabled_factor : Float, show_buttons : CInt, inc_button : nk_style_button, dec_button : nk_style_button, inc_symbol : nk_symbol_type, dec_symbol : nk_symbol_type, userdata : nk_handle, draw_begin : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit], draw_end : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit])(using Zone): Ptr[nk_style_scrollbar] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).border_color = border_color
    (!____ptr).cursor_normal = cursor_normal
    (!____ptr).cursor_hover = cursor_hover
    (!____ptr).cursor_active = cursor_active
    (!____ptr).cursor_border_color = cursor_border_color
    (!____ptr).border = border
    (!____ptr).rounding = rounding
    (!____ptr).border_cursor = border_cursor
    (!____ptr).rounding_cursor = rounding_cursor
    (!____ptr).padding = padding
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    (!____ptr).show_buttons = show_buttons
    (!____ptr).inc_button = inc_button
    (!____ptr).dec_button = dec_button
    (!____ptr).inc_symbol = inc_symbol
    (!____ptr).dec_symbol = dec_symbol
    (!____ptr).userdata = userdata
    (!____ptr).draw_begin = draw_begin
    (!____ptr).draw_end = draw_end
    ____ptr
  extension (struct: nk_style_scrollbar)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(96).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(96).asInstanceOf[Ptr[nk_color]] = value
    def cursor_normal: nk_style_item = !struct.at(100).asInstanceOf[Ptr[nk_style_item]]
    def cursor_normal_=(value: nk_style_item): Unit = !struct.at(100).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_hover: nk_style_item = !struct.at(132).asInstanceOf[Ptr[nk_style_item]]
    def cursor_hover_=(value: nk_style_item): Unit = !struct.at(132).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_active: nk_style_item = !struct.at(164).asInstanceOf[Ptr[nk_style_item]]
    def cursor_active_=(value: nk_style_item): Unit = !struct.at(164).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_border_color: nk_color = !struct.at(196).asInstanceOf[Ptr[nk_color]]
    def cursor_border_color_=(value: nk_color): Unit = !struct.at(196).asInstanceOf[Ptr[nk_color]] = value
    def border: Float = !struct.at(200).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(200).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(204).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(204).asInstanceOf[Ptr[Float]] = value
    def border_cursor: Float = !struct.at(208).asInstanceOf[Ptr[Float]]
    def border_cursor_=(value: Float): Unit = !struct.at(208).asInstanceOf[Ptr[Float]] = value
    def rounding_cursor: Float = !struct.at(212).asInstanceOf[Ptr[Float]]
    def rounding_cursor_=(value: Float): Unit = !struct.at(212).asInstanceOf[Ptr[Float]] = value
    def padding: nk_vec2 = !struct.at(216).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(216).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(224).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(224).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(228).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(228).asInstanceOf[Ptr[Float]] = value
    def show_buttons: CInt = !struct.at(232).asInstanceOf[Ptr[CInt]]
    def show_buttons_=(value: CInt): Unit = !struct.at(232).asInstanceOf[Ptr[CInt]] = value
    def inc_button: nk_style_button = !struct.at(240).asInstanceOf[Ptr[nk_style_button]]
    def inc_button_=(value: nk_style_button): Unit = !struct.at(240).asInstanceOf[Ptr[nk_style_button]] = value
    def dec_button: nk_style_button = !struct.at(432).asInstanceOf[Ptr[nk_style_button]]
    def dec_button_=(value: nk_style_button): Unit = !struct.at(432).asInstanceOf[Ptr[nk_style_button]] = value
    def inc_symbol: nk_symbol_type = !struct.at(624).asInstanceOf[Ptr[nk_symbol_type]]
    def inc_symbol_=(value: nk_symbol_type): Unit = !struct.at(624).asInstanceOf[Ptr[nk_symbol_type]] = value
    def dec_symbol: nk_symbol_type = !struct.at(628).asInstanceOf[Ptr[nk_symbol_type]]
    def dec_symbol_=(value: nk_symbol_type): Unit = !struct.at(628).asInstanceOf[Ptr[nk_symbol_type]] = value
    def userdata: nk_handle = !struct.at(632).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(632).asInstanceOf[Ptr[nk_handle]] = value
    def draw_begin: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(640).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_begin_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(640).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value
    def draw_end: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(648).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_end_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(648).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value

opaque type nk_style_selectable = CArray[CChar, Nat.Digit3[Nat._2, Nat._8, Nat._8]]
object nk_style_selectable:
  given _tag: Tag[nk_style_selectable] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._8, Nat._8]](Tag.Byte, Tag.Digit3[Nat._2, Nat._8, Nat._8](Tag.Nat2, Tag.Nat8, Tag.Nat8))
  def apply()(using Zone): Ptr[nk_style_selectable] = scala.scalanative.unsafe.alloc[nk_style_selectable](1)
  def apply(normal : nk_style_item, hover : nk_style_item, pressed : nk_style_item, normal_active : nk_style_item, hover_active : nk_style_item, pressed_active : nk_style_item, text_normal : nk_color, text_hover : nk_color, text_pressed : nk_color, text_normal_active : nk_color, text_hover_active : nk_color, text_pressed_active : nk_color, text_background : nk_color, text_alignment : nk_flags, rounding : Float, padding : nk_vec2, touch_padding : nk_vec2, image_padding : nk_vec2, color_factor : Float, disabled_factor : Float, userdata : nk_handle, draw_begin : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit], draw_end : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit])(using Zone): Ptr[nk_style_selectable] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).pressed = pressed
    (!____ptr).normal_active = normal_active
    (!____ptr).hover_active = hover_active
    (!____ptr).pressed_active = pressed_active
    (!____ptr).text_normal = text_normal
    (!____ptr).text_hover = text_hover
    (!____ptr).text_pressed = text_pressed
    (!____ptr).text_normal_active = text_normal_active
    (!____ptr).text_hover_active = text_hover_active
    (!____ptr).text_pressed_active = text_pressed_active
    (!____ptr).text_background = text_background
    (!____ptr).text_alignment = text_alignment
    (!____ptr).rounding = rounding
    (!____ptr).padding = padding
    (!____ptr).touch_padding = touch_padding
    (!____ptr).image_padding = image_padding
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    (!____ptr).userdata = userdata
    (!____ptr).draw_begin = draw_begin
    (!____ptr).draw_end = draw_end
    ____ptr
  extension (struct: nk_style_selectable)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def pressed: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def pressed_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def normal_active: nk_style_item = !struct.at(96).asInstanceOf[Ptr[nk_style_item]]
    def normal_active_=(value: nk_style_item): Unit = !struct.at(96).asInstanceOf[Ptr[nk_style_item]] = value
    def hover_active: nk_style_item = !struct.at(128).asInstanceOf[Ptr[nk_style_item]]
    def hover_active_=(value: nk_style_item): Unit = !struct.at(128).asInstanceOf[Ptr[nk_style_item]] = value
    def pressed_active: nk_style_item = !struct.at(160).asInstanceOf[Ptr[nk_style_item]]
    def pressed_active_=(value: nk_style_item): Unit = !struct.at(160).asInstanceOf[Ptr[nk_style_item]] = value
    def text_normal: nk_color = !struct.at(192).asInstanceOf[Ptr[nk_color]]
    def text_normal_=(value: nk_color): Unit = !struct.at(192).asInstanceOf[Ptr[nk_color]] = value
    def text_hover: nk_color = !struct.at(196).asInstanceOf[Ptr[nk_color]]
    def text_hover_=(value: nk_color): Unit = !struct.at(196).asInstanceOf[Ptr[nk_color]] = value
    def text_pressed: nk_color = !struct.at(200).asInstanceOf[Ptr[nk_color]]
    def text_pressed_=(value: nk_color): Unit = !struct.at(200).asInstanceOf[Ptr[nk_color]] = value
    def text_normal_active: nk_color = !struct.at(204).asInstanceOf[Ptr[nk_color]]
    def text_normal_active_=(value: nk_color): Unit = !struct.at(204).asInstanceOf[Ptr[nk_color]] = value
    def text_hover_active: nk_color = !struct.at(208).asInstanceOf[Ptr[nk_color]]
    def text_hover_active_=(value: nk_color): Unit = !struct.at(208).asInstanceOf[Ptr[nk_color]] = value
    def text_pressed_active: nk_color = !struct.at(212).asInstanceOf[Ptr[nk_color]]
    def text_pressed_active_=(value: nk_color): Unit = !struct.at(212).asInstanceOf[Ptr[nk_color]] = value
    def text_background: nk_color = !struct.at(216).asInstanceOf[Ptr[nk_color]]
    def text_background_=(value: nk_color): Unit = !struct.at(216).asInstanceOf[Ptr[nk_color]] = value
    def text_alignment: nk_flags = !struct.at(220).asInstanceOf[Ptr[nk_flags]]
    def text_alignment_=(value: nk_flags): Unit = !struct.at(220).asInstanceOf[Ptr[nk_flags]] = value
    def rounding: Float = !struct.at(224).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(224).asInstanceOf[Ptr[Float]] = value
    def padding: nk_vec2 = !struct.at(228).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(228).asInstanceOf[Ptr[nk_vec2]] = value
    def touch_padding: nk_vec2 = !struct.at(236).asInstanceOf[Ptr[nk_vec2]]
    def touch_padding_=(value: nk_vec2): Unit = !struct.at(236).asInstanceOf[Ptr[nk_vec2]] = value
    def image_padding: nk_vec2 = !struct.at(244).asInstanceOf[Ptr[nk_vec2]]
    def image_padding_=(value: nk_vec2): Unit = !struct.at(244).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(252).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(252).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(256).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(256).asInstanceOf[Ptr[Float]] = value
    def userdata: nk_handle = !struct.at(260).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(260).asInstanceOf[Ptr[nk_handle]] = value
    def draw_begin: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(272).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_begin_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(272).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value
    def draw_end: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(280).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_end_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(280).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value

opaque type nk_style_slide = CStruct0
object nk_style_slide:
  given _tag: Tag[nk_style_slide] = Tag.materializeCStruct0Tag

opaque type nk_style_slider = CArray[CChar, Nat.Digit3[Nat._6, Nat._8, Nat._0]]
object nk_style_slider:
  given _tag: Tag[nk_style_slider] = Tag.CArray[CChar, Nat.Digit3[Nat._6, Nat._8, Nat._0]](Tag.Byte, Tag.Digit3[Nat._6, Nat._8, Nat._0](Tag.Nat6, Tag.Nat8, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_style_slider] = scala.scalanative.unsafe.alloc[nk_style_slider](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, border_color : nk_color, bar_normal : nk_color, bar_hover : nk_color, bar_active : nk_color, bar_filled : nk_color, cursor_normal : nk_style_item, cursor_hover : nk_style_item, cursor_active : nk_style_item, border : Float, rounding : Float, bar_height : Float, padding : nk_vec2, spacing : nk_vec2, cursor_size : nk_vec2, color_factor : Float, disabled_factor : Float, show_buttons : CInt, inc_button : nk_style_button, dec_button : nk_style_button, inc_symbol : nk_symbol_type, dec_symbol : nk_symbol_type, userdata : nk_handle, draw_begin : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit], draw_end : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit])(using Zone): Ptr[nk_style_slider] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).border_color = border_color
    (!____ptr).bar_normal = bar_normal
    (!____ptr).bar_hover = bar_hover
    (!____ptr).bar_active = bar_active
    (!____ptr).bar_filled = bar_filled
    (!____ptr).cursor_normal = cursor_normal
    (!____ptr).cursor_hover = cursor_hover
    (!____ptr).cursor_active = cursor_active
    (!____ptr).border = border
    (!____ptr).rounding = rounding
    (!____ptr).bar_height = bar_height
    (!____ptr).padding = padding
    (!____ptr).spacing = spacing
    (!____ptr).cursor_size = cursor_size
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    (!____ptr).show_buttons = show_buttons
    (!____ptr).inc_button = inc_button
    (!____ptr).dec_button = dec_button
    (!____ptr).inc_symbol = inc_symbol
    (!____ptr).dec_symbol = dec_symbol
    (!____ptr).userdata = userdata
    (!____ptr).draw_begin = draw_begin
    (!____ptr).draw_end = draw_end
    ____ptr
  extension (struct: nk_style_slider)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(96).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(96).asInstanceOf[Ptr[nk_color]] = value
    def bar_normal: nk_color = !struct.at(100).asInstanceOf[Ptr[nk_color]]
    def bar_normal_=(value: nk_color): Unit = !struct.at(100).asInstanceOf[Ptr[nk_color]] = value
    def bar_hover: nk_color = !struct.at(104).asInstanceOf[Ptr[nk_color]]
    def bar_hover_=(value: nk_color): Unit = !struct.at(104).asInstanceOf[Ptr[nk_color]] = value
    def bar_active: nk_color = !struct.at(108).asInstanceOf[Ptr[nk_color]]
    def bar_active_=(value: nk_color): Unit = !struct.at(108).asInstanceOf[Ptr[nk_color]] = value
    def bar_filled: nk_color = !struct.at(112).asInstanceOf[Ptr[nk_color]]
    def bar_filled_=(value: nk_color): Unit = !struct.at(112).asInstanceOf[Ptr[nk_color]] = value
    def cursor_normal: nk_style_item = !struct.at(116).asInstanceOf[Ptr[nk_style_item]]
    def cursor_normal_=(value: nk_style_item): Unit = !struct.at(116).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_hover: nk_style_item = !struct.at(148).asInstanceOf[Ptr[nk_style_item]]
    def cursor_hover_=(value: nk_style_item): Unit = !struct.at(148).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_active: nk_style_item = !struct.at(180).asInstanceOf[Ptr[nk_style_item]]
    def cursor_active_=(value: nk_style_item): Unit = !struct.at(180).asInstanceOf[Ptr[nk_style_item]] = value
    def border: Float = !struct.at(212).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(212).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(216).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(216).asInstanceOf[Ptr[Float]] = value
    def bar_height: Float = !struct.at(220).asInstanceOf[Ptr[Float]]
    def bar_height_=(value: Float): Unit = !struct.at(220).asInstanceOf[Ptr[Float]] = value
    def padding: nk_vec2 = !struct.at(224).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(224).asInstanceOf[Ptr[nk_vec2]] = value
    def spacing: nk_vec2 = !struct.at(232).asInstanceOf[Ptr[nk_vec2]]
    def spacing_=(value: nk_vec2): Unit = !struct.at(232).asInstanceOf[Ptr[nk_vec2]] = value
    def cursor_size: nk_vec2 = !struct.at(240).asInstanceOf[Ptr[nk_vec2]]
    def cursor_size_=(value: nk_vec2): Unit = !struct.at(240).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(248).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(248).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(252).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(252).asInstanceOf[Ptr[Float]] = value
    def show_buttons: CInt = !struct.at(256).asInstanceOf[Ptr[CInt]]
    def show_buttons_=(value: CInt): Unit = !struct.at(256).asInstanceOf[Ptr[CInt]] = value
    def inc_button: nk_style_button = !struct.at(264).asInstanceOf[Ptr[nk_style_button]]
    def inc_button_=(value: nk_style_button): Unit = !struct.at(264).asInstanceOf[Ptr[nk_style_button]] = value
    def dec_button: nk_style_button = !struct.at(456).asInstanceOf[Ptr[nk_style_button]]
    def dec_button_=(value: nk_style_button): Unit = !struct.at(456).asInstanceOf[Ptr[nk_style_button]] = value
    def inc_symbol: nk_symbol_type = !struct.at(648).asInstanceOf[Ptr[nk_symbol_type]]
    def inc_symbol_=(value: nk_symbol_type): Unit = !struct.at(648).asInstanceOf[Ptr[nk_symbol_type]] = value
    def dec_symbol: nk_symbol_type = !struct.at(652).asInstanceOf[Ptr[nk_symbol_type]]
    def dec_symbol_=(value: nk_symbol_type): Unit = !struct.at(652).asInstanceOf[Ptr[nk_symbol_type]] = value
    def userdata: nk_handle = !struct.at(656).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(656).asInstanceOf[Ptr[nk_handle]] = value
    def draw_begin: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(664).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_begin_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(664).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value
    def draw_end: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(672).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_end_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(672).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value

opaque type nk_style_tab = CArray[CChar, Nat.Digit3[Nat._8, Nat._5, Nat._6]]
object nk_style_tab:
  given _tag: Tag[nk_style_tab] = Tag.CArray[CChar, Nat.Digit3[Nat._8, Nat._5, Nat._6]](Tag.Byte, Tag.Digit3[Nat._8, Nat._5, Nat._6](Tag.Nat8, Tag.Nat5, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_style_tab] = scala.scalanative.unsafe.alloc[nk_style_tab](1)
  def apply(background : nk_style_item, border_color : nk_color, text : nk_color, tab_maximize_button : nk_style_button, tab_minimize_button : nk_style_button, node_maximize_button : nk_style_button, node_minimize_button : nk_style_button, sym_minimize : nk_symbol_type, sym_maximize : nk_symbol_type, border : Float, rounding : Float, indent : Float, padding : nk_vec2, spacing : nk_vec2, color_factor : Float, disabled_factor : Float)(using Zone): Ptr[nk_style_tab] = 
    val ____ptr = apply()
    (!____ptr).background = background
    (!____ptr).border_color = border_color
    (!____ptr).text = text
    (!____ptr).tab_maximize_button = tab_maximize_button
    (!____ptr).tab_minimize_button = tab_minimize_button
    (!____ptr).node_maximize_button = node_maximize_button
    (!____ptr).node_minimize_button = node_minimize_button
    (!____ptr).sym_minimize = sym_minimize
    (!____ptr).sym_maximize = sym_maximize
    (!____ptr).border = border
    (!____ptr).rounding = rounding
    (!____ptr).indent = indent
    (!____ptr).padding = padding
    (!____ptr).spacing = spacing
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    ____ptr
  extension (struct: nk_style_tab)
    def background: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def background_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(32).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(32).asInstanceOf[Ptr[nk_color]] = value
    def text: nk_color = !struct.at(36).asInstanceOf[Ptr[nk_color]]
    def text_=(value: nk_color): Unit = !struct.at(36).asInstanceOf[Ptr[nk_color]] = value
    def tab_maximize_button: nk_style_button = !struct.at(40).asInstanceOf[Ptr[nk_style_button]]
    def tab_maximize_button_=(value: nk_style_button): Unit = !struct.at(40).asInstanceOf[Ptr[nk_style_button]] = value
    def tab_minimize_button: nk_style_button = !struct.at(232).asInstanceOf[Ptr[nk_style_button]]
    def tab_minimize_button_=(value: nk_style_button): Unit = !struct.at(232).asInstanceOf[Ptr[nk_style_button]] = value
    def node_maximize_button: nk_style_button = !struct.at(424).asInstanceOf[Ptr[nk_style_button]]
    def node_maximize_button_=(value: nk_style_button): Unit = !struct.at(424).asInstanceOf[Ptr[nk_style_button]] = value
    def node_minimize_button: nk_style_button = !struct.at(616).asInstanceOf[Ptr[nk_style_button]]
    def node_minimize_button_=(value: nk_style_button): Unit = !struct.at(616).asInstanceOf[Ptr[nk_style_button]] = value
    def sym_minimize: nk_symbol_type = !struct.at(808).asInstanceOf[Ptr[nk_symbol_type]]
    def sym_minimize_=(value: nk_symbol_type): Unit = !struct.at(808).asInstanceOf[Ptr[nk_symbol_type]] = value
    def sym_maximize: nk_symbol_type = !struct.at(812).asInstanceOf[Ptr[nk_symbol_type]]
    def sym_maximize_=(value: nk_symbol_type): Unit = !struct.at(812).asInstanceOf[Ptr[nk_symbol_type]] = value
    def border: Float = !struct.at(816).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(816).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(820).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(820).asInstanceOf[Ptr[Float]] = value
    def indent: Float = !struct.at(824).asInstanceOf[Ptr[Float]]
    def indent_=(value: Float): Unit = !struct.at(824).asInstanceOf[Ptr[Float]] = value
    def padding: nk_vec2 = !struct.at(828).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(828).asInstanceOf[Ptr[nk_vec2]] = value
    def spacing: nk_vec2 = !struct.at(836).asInstanceOf[Ptr[nk_vec2]]
    def spacing_=(value: nk_vec2): Unit = !struct.at(836).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(844).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(844).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(848).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(848).asInstanceOf[Ptr[Float]] = value

opaque type nk_style_text = CArray[CChar, Nat.Digit2[Nat._2, Nat._0]]
object nk_style_text:
  given _tag: Tag[nk_style_text] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._0]](Tag.Byte, Tag.Digit2[Nat._2, Nat._0](Tag.Nat2, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_style_text] = scala.scalanative.unsafe.alloc[nk_style_text](1)
  def apply(color : nk_color, padding : nk_vec2, color_factor : Float, disabled_factor : Float)(using Zone): Ptr[nk_style_text] = 
    val ____ptr = apply()
    (!____ptr).color = color
    (!____ptr).padding = padding
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    ____ptr
  extension (struct: nk_style_text)
    def color: nk_color = !struct.at(0).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(0).asInstanceOf[Ptr[nk_color]] = value
    def padding: nk_vec2 = !struct.at(4).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(4).asInstanceOf[Ptr[nk_vec2]] = value
    def color_factor: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(16).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(16).asInstanceOf[Ptr[Float]] = value

opaque type nk_style_toggle = CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._0]]
object nk_style_toggle:
  given _tag: Tag[nk_style_toggle] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._4, Nat._0](Tag.Nat2, Tag.Nat4, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_style_toggle] = scala.scalanative.unsafe.alloc[nk_style_toggle](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, border_color : nk_color, cursor_normal : nk_style_item, cursor_hover : nk_style_item, text_normal : nk_color, text_hover : nk_color, text_active : nk_color, text_background : nk_color, text_alignment : nk_flags, padding : nk_vec2, touch_padding : nk_vec2, spacing : Float, border : Float, color_factor : Float, disabled_factor : Float, userdata : nk_handle, draw_begin : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit], draw_end : CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit])(using Zone): Ptr[nk_style_toggle] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).border_color = border_color
    (!____ptr).cursor_normal = cursor_normal
    (!____ptr).cursor_hover = cursor_hover
    (!____ptr).text_normal = text_normal
    (!____ptr).text_hover = text_hover
    (!____ptr).text_active = text_active
    (!____ptr).text_background = text_background
    (!____ptr).text_alignment = text_alignment
    (!____ptr).padding = padding
    (!____ptr).touch_padding = touch_padding
    (!____ptr).spacing = spacing
    (!____ptr).border = border
    (!____ptr).color_factor = color_factor
    (!____ptr).disabled_factor = disabled_factor
    (!____ptr).userdata = userdata
    (!____ptr).draw_begin = draw_begin
    (!____ptr).draw_end = draw_end
    ____ptr
  extension (struct: nk_style_toggle)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def border_color: nk_color = !struct.at(96).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(96).asInstanceOf[Ptr[nk_color]] = value
    def cursor_normal: nk_style_item = !struct.at(100).asInstanceOf[Ptr[nk_style_item]]
    def cursor_normal_=(value: nk_style_item): Unit = !struct.at(100).asInstanceOf[Ptr[nk_style_item]] = value
    def cursor_hover: nk_style_item = !struct.at(132).asInstanceOf[Ptr[nk_style_item]]
    def cursor_hover_=(value: nk_style_item): Unit = !struct.at(132).asInstanceOf[Ptr[nk_style_item]] = value
    def text_normal: nk_color = !struct.at(164).asInstanceOf[Ptr[nk_color]]
    def text_normal_=(value: nk_color): Unit = !struct.at(164).asInstanceOf[Ptr[nk_color]] = value
    def text_hover: nk_color = !struct.at(168).asInstanceOf[Ptr[nk_color]]
    def text_hover_=(value: nk_color): Unit = !struct.at(168).asInstanceOf[Ptr[nk_color]] = value
    def text_active: nk_color = !struct.at(172).asInstanceOf[Ptr[nk_color]]
    def text_active_=(value: nk_color): Unit = !struct.at(172).asInstanceOf[Ptr[nk_color]] = value
    def text_background: nk_color = !struct.at(176).asInstanceOf[Ptr[nk_color]]
    def text_background_=(value: nk_color): Unit = !struct.at(176).asInstanceOf[Ptr[nk_color]] = value
    def text_alignment: nk_flags = !struct.at(180).asInstanceOf[Ptr[nk_flags]]
    def text_alignment_=(value: nk_flags): Unit = !struct.at(180).asInstanceOf[Ptr[nk_flags]] = value
    def padding: nk_vec2 = !struct.at(184).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(184).asInstanceOf[Ptr[nk_vec2]] = value
    def touch_padding: nk_vec2 = !struct.at(192).asInstanceOf[Ptr[nk_vec2]]
    def touch_padding_=(value: nk_vec2): Unit = !struct.at(192).asInstanceOf[Ptr[nk_vec2]] = value
    def spacing: Float = !struct.at(200).asInstanceOf[Ptr[Float]]
    def spacing_=(value: Float): Unit = !struct.at(200).asInstanceOf[Ptr[Float]] = value
    def border: Float = !struct.at(204).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(204).asInstanceOf[Ptr[Float]] = value
    def color_factor: Float = !struct.at(208).asInstanceOf[Ptr[Float]]
    def color_factor_=(value: Float): Unit = !struct.at(208).asInstanceOf[Ptr[Float]] = value
    def disabled_factor: Float = !struct.at(212).asInstanceOf[Ptr[Float]]
    def disabled_factor_=(value: Float): Unit = !struct.at(212).asInstanceOf[Ptr[Float]] = value
    def userdata: nk_handle = !struct.at(216).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(216).asInstanceOf[Ptr[nk_handle]] = value
    def draw_begin: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(224).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_begin_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(224).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value
    def draw_end: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit] = !struct.at(232).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]
    def draw_end_=(value: CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]): Unit = !struct.at(232).asInstanceOf[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]] = value

opaque type nk_style_window = CArray[CChar, Nat.Digit3[Nat._7, Nat._5, Nat._2]]
object nk_style_window:
  given _tag: Tag[nk_style_window] = Tag.CArray[CChar, Nat.Digit3[Nat._7, Nat._5, Nat._2]](Tag.Byte, Tag.Digit3[Nat._7, Nat._5, Nat._2](Tag.Nat7, Tag.Nat5, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_style_window] = scala.scalanative.unsafe.alloc[nk_style_window](1)
  def apply(header : nk_style_window_header, fixed_background : nk_style_item, background : nk_color, border_color : nk_color, popup_border_color : nk_color, combo_border_color : nk_color, contextual_border_color : nk_color, menu_border_color : nk_color, group_border_color : nk_color, tooltip_border_color : nk_color, scaler : nk_style_item, border : Float, combo_border : Float, contextual_border : Float, menu_border : Float, group_border : Float, tooltip_border : Float, popup_border : Float, min_row_height_padding : Float, rounding : Float, spacing : nk_vec2, scrollbar_size : nk_vec2, min_size : nk_vec2, padding : nk_vec2, group_padding : nk_vec2, popup_padding : nk_vec2, combo_padding : nk_vec2, contextual_padding : nk_vec2, menu_padding : nk_vec2, tooltip_padding : nk_vec2)(using Zone): Ptr[nk_style_window] = 
    val ____ptr = apply()
    (!____ptr).header = header
    (!____ptr).fixed_background = fixed_background
    (!____ptr).background = background
    (!____ptr).border_color = border_color
    (!____ptr).popup_border_color = popup_border_color
    (!____ptr).combo_border_color = combo_border_color
    (!____ptr).contextual_border_color = contextual_border_color
    (!____ptr).menu_border_color = menu_border_color
    (!____ptr).group_border_color = group_border_color
    (!____ptr).tooltip_border_color = tooltip_border_color
    (!____ptr).scaler = scaler
    (!____ptr).border = border
    (!____ptr).combo_border = combo_border
    (!____ptr).contextual_border = contextual_border
    (!____ptr).menu_border = menu_border
    (!____ptr).group_border = group_border
    (!____ptr).tooltip_border = tooltip_border
    (!____ptr).popup_border = popup_border
    (!____ptr).min_row_height_padding = min_row_height_padding
    (!____ptr).rounding = rounding
    (!____ptr).spacing = spacing
    (!____ptr).scrollbar_size = scrollbar_size
    (!____ptr).min_size = min_size
    (!____ptr).padding = padding
    (!____ptr).group_padding = group_padding
    (!____ptr).popup_padding = popup_padding
    (!____ptr).combo_padding = combo_padding
    (!____ptr).contextual_padding = contextual_padding
    (!____ptr).menu_padding = menu_padding
    (!____ptr).tooltip_padding = tooltip_padding
    ____ptr
  extension (struct: nk_style_window)
    def header: nk_style_window_header = !struct.at(0).asInstanceOf[Ptr[nk_style_window_header]]
    def header_=(value: nk_style_window_header): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_window_header]] = value
    def fixed_background: nk_style_item = !struct.at(536).asInstanceOf[Ptr[nk_style_item]]
    def fixed_background_=(value: nk_style_item): Unit = !struct.at(536).asInstanceOf[Ptr[nk_style_item]] = value
    def background: nk_color = !struct.at(568).asInstanceOf[Ptr[nk_color]]
    def background_=(value: nk_color): Unit = !struct.at(568).asInstanceOf[Ptr[nk_color]] = value
    def border_color: nk_color = !struct.at(572).asInstanceOf[Ptr[nk_color]]
    def border_color_=(value: nk_color): Unit = !struct.at(572).asInstanceOf[Ptr[nk_color]] = value
    def popup_border_color: nk_color = !struct.at(576).asInstanceOf[Ptr[nk_color]]
    def popup_border_color_=(value: nk_color): Unit = !struct.at(576).asInstanceOf[Ptr[nk_color]] = value
    def combo_border_color: nk_color = !struct.at(580).asInstanceOf[Ptr[nk_color]]
    def combo_border_color_=(value: nk_color): Unit = !struct.at(580).asInstanceOf[Ptr[nk_color]] = value
    def contextual_border_color: nk_color = !struct.at(584).asInstanceOf[Ptr[nk_color]]
    def contextual_border_color_=(value: nk_color): Unit = !struct.at(584).asInstanceOf[Ptr[nk_color]] = value
    def menu_border_color: nk_color = !struct.at(588).asInstanceOf[Ptr[nk_color]]
    def menu_border_color_=(value: nk_color): Unit = !struct.at(588).asInstanceOf[Ptr[nk_color]] = value
    def group_border_color: nk_color = !struct.at(592).asInstanceOf[Ptr[nk_color]]
    def group_border_color_=(value: nk_color): Unit = !struct.at(592).asInstanceOf[Ptr[nk_color]] = value
    def tooltip_border_color: nk_color = !struct.at(596).asInstanceOf[Ptr[nk_color]]
    def tooltip_border_color_=(value: nk_color): Unit = !struct.at(596).asInstanceOf[Ptr[nk_color]] = value
    def scaler: nk_style_item = !struct.at(600).asInstanceOf[Ptr[nk_style_item]]
    def scaler_=(value: nk_style_item): Unit = !struct.at(600).asInstanceOf[Ptr[nk_style_item]] = value
    def border: Float = !struct.at(632).asInstanceOf[Ptr[Float]]
    def border_=(value: Float): Unit = !struct.at(632).asInstanceOf[Ptr[Float]] = value
    def combo_border: Float = !struct.at(636).asInstanceOf[Ptr[Float]]
    def combo_border_=(value: Float): Unit = !struct.at(636).asInstanceOf[Ptr[Float]] = value
    def contextual_border: Float = !struct.at(640).asInstanceOf[Ptr[Float]]
    def contextual_border_=(value: Float): Unit = !struct.at(640).asInstanceOf[Ptr[Float]] = value
    def menu_border: Float = !struct.at(644).asInstanceOf[Ptr[Float]]
    def menu_border_=(value: Float): Unit = !struct.at(644).asInstanceOf[Ptr[Float]] = value
    def group_border: Float = !struct.at(648).asInstanceOf[Ptr[Float]]
    def group_border_=(value: Float): Unit = !struct.at(648).asInstanceOf[Ptr[Float]] = value
    def tooltip_border: Float = !struct.at(652).asInstanceOf[Ptr[Float]]
    def tooltip_border_=(value: Float): Unit = !struct.at(652).asInstanceOf[Ptr[Float]] = value
    def popup_border: Float = !struct.at(656).asInstanceOf[Ptr[Float]]
    def popup_border_=(value: Float): Unit = !struct.at(656).asInstanceOf[Ptr[Float]] = value
    def min_row_height_padding: Float = !struct.at(660).asInstanceOf[Ptr[Float]]
    def min_row_height_padding_=(value: Float): Unit = !struct.at(660).asInstanceOf[Ptr[Float]] = value
    def rounding: Float = !struct.at(664).asInstanceOf[Ptr[Float]]
    def rounding_=(value: Float): Unit = !struct.at(664).asInstanceOf[Ptr[Float]] = value
    def spacing: nk_vec2 = !struct.at(668).asInstanceOf[Ptr[nk_vec2]]
    def spacing_=(value: nk_vec2): Unit = !struct.at(668).asInstanceOf[Ptr[nk_vec2]] = value
    def scrollbar_size: nk_vec2 = !struct.at(676).asInstanceOf[Ptr[nk_vec2]]
    def scrollbar_size_=(value: nk_vec2): Unit = !struct.at(676).asInstanceOf[Ptr[nk_vec2]] = value
    def min_size: nk_vec2 = !struct.at(684).asInstanceOf[Ptr[nk_vec2]]
    def min_size_=(value: nk_vec2): Unit = !struct.at(684).asInstanceOf[Ptr[nk_vec2]] = value
    def padding: nk_vec2 = !struct.at(692).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(692).asInstanceOf[Ptr[nk_vec2]] = value
    def group_padding: nk_vec2 = !struct.at(700).asInstanceOf[Ptr[nk_vec2]]
    def group_padding_=(value: nk_vec2): Unit = !struct.at(700).asInstanceOf[Ptr[nk_vec2]] = value
    def popup_padding: nk_vec2 = !struct.at(708).asInstanceOf[Ptr[nk_vec2]]
    def popup_padding_=(value: nk_vec2): Unit = !struct.at(708).asInstanceOf[Ptr[nk_vec2]] = value
    def combo_padding: nk_vec2 = !struct.at(716).asInstanceOf[Ptr[nk_vec2]]
    def combo_padding_=(value: nk_vec2): Unit = !struct.at(716).asInstanceOf[Ptr[nk_vec2]] = value
    def contextual_padding: nk_vec2 = !struct.at(724).asInstanceOf[Ptr[nk_vec2]]
    def contextual_padding_=(value: nk_vec2): Unit = !struct.at(724).asInstanceOf[Ptr[nk_vec2]] = value
    def menu_padding: nk_vec2 = !struct.at(732).asInstanceOf[Ptr[nk_vec2]]
    def menu_padding_=(value: nk_vec2): Unit = !struct.at(732).asInstanceOf[Ptr[nk_vec2]] = value
    def tooltip_padding: nk_vec2 = !struct.at(740).asInstanceOf[Ptr[nk_vec2]]
    def tooltip_padding_=(value: nk_vec2): Unit = !struct.at(740).asInstanceOf[Ptr[nk_vec2]] = value

opaque type nk_style_window_header = CArray[CChar, Nat.Digit3[Nat._5, Nat._3, Nat._6]]
object nk_style_window_header:
  given _tag: Tag[nk_style_window_header] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._5, Nat._3, Nat._6](Tag.Nat5, Tag.Nat3, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_style_window_header] = scala.scalanative.unsafe.alloc[nk_style_window_header](1)
  def apply(normal : nk_style_item, hover : nk_style_item, active : nk_style_item, close_button : nk_style_button, minimize_button : nk_style_button, close_symbol : nk_symbol_type, minimize_symbol : nk_symbol_type, maximize_symbol : nk_symbol_type, label_normal : nk_color, label_hover : nk_color, label_active : nk_color, align : nk_style_header_align, padding : nk_vec2, label_padding : nk_vec2, spacing : nk_vec2)(using Zone): Ptr[nk_style_window_header] = 
    val ____ptr = apply()
    (!____ptr).normal = normal
    (!____ptr).hover = hover
    (!____ptr).active = active
    (!____ptr).close_button = close_button
    (!____ptr).minimize_button = minimize_button
    (!____ptr).close_symbol = close_symbol
    (!____ptr).minimize_symbol = minimize_symbol
    (!____ptr).maximize_symbol = maximize_symbol
    (!____ptr).label_normal = label_normal
    (!____ptr).label_hover = label_hover
    (!____ptr).label_active = label_active
    (!____ptr).align = align
    (!____ptr).padding = padding
    (!____ptr).label_padding = label_padding
    (!____ptr).spacing = spacing
    ____ptr
  extension (struct: nk_style_window_header)
    def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
    def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
    def hover: nk_style_item = !struct.at(32).asInstanceOf[Ptr[nk_style_item]]
    def hover_=(value: nk_style_item): Unit = !struct.at(32).asInstanceOf[Ptr[nk_style_item]] = value
    def active: nk_style_item = !struct.at(64).asInstanceOf[Ptr[nk_style_item]]
    def active_=(value: nk_style_item): Unit = !struct.at(64).asInstanceOf[Ptr[nk_style_item]] = value
    def close_button: nk_style_button = !struct.at(96).asInstanceOf[Ptr[nk_style_button]]
    def close_button_=(value: nk_style_button): Unit = !struct.at(96).asInstanceOf[Ptr[nk_style_button]] = value
    def minimize_button: nk_style_button = !struct.at(288).asInstanceOf[Ptr[nk_style_button]]
    def minimize_button_=(value: nk_style_button): Unit = !struct.at(288).asInstanceOf[Ptr[nk_style_button]] = value
    def close_symbol: nk_symbol_type = !struct.at(480).asInstanceOf[Ptr[nk_symbol_type]]
    def close_symbol_=(value: nk_symbol_type): Unit = !struct.at(480).asInstanceOf[Ptr[nk_symbol_type]] = value
    def minimize_symbol: nk_symbol_type = !struct.at(484).asInstanceOf[Ptr[nk_symbol_type]]
    def minimize_symbol_=(value: nk_symbol_type): Unit = !struct.at(484).asInstanceOf[Ptr[nk_symbol_type]] = value
    def maximize_symbol: nk_symbol_type = !struct.at(488).asInstanceOf[Ptr[nk_symbol_type]]
    def maximize_symbol_=(value: nk_symbol_type): Unit = !struct.at(488).asInstanceOf[Ptr[nk_symbol_type]] = value
    def label_normal: nk_color = !struct.at(492).asInstanceOf[Ptr[nk_color]]
    def label_normal_=(value: nk_color): Unit = !struct.at(492).asInstanceOf[Ptr[nk_color]] = value
    def label_hover: nk_color = !struct.at(496).asInstanceOf[Ptr[nk_color]]
    def label_hover_=(value: nk_color): Unit = !struct.at(496).asInstanceOf[Ptr[nk_color]] = value
    def label_active: nk_color = !struct.at(500).asInstanceOf[Ptr[nk_color]]
    def label_active_=(value: nk_color): Unit = !struct.at(500).asInstanceOf[Ptr[nk_color]] = value
    def align: nk_style_header_align = !struct.at(504).asInstanceOf[Ptr[nk_style_header_align]]
    def align_=(value: nk_style_header_align): Unit = !struct.at(504).asInstanceOf[Ptr[nk_style_header_align]] = value
    def padding: nk_vec2 = !struct.at(508).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(508).asInstanceOf[Ptr[nk_vec2]] = value
    def label_padding: nk_vec2 = !struct.at(516).asInstanceOf[Ptr[nk_vec2]]
    def label_padding_=(value: nk_vec2): Unit = !struct.at(516).asInstanceOf[Ptr[nk_vec2]] = value
    def spacing: nk_vec2 = !struct.at(524).asInstanceOf[Ptr[nk_vec2]]
    def spacing_=(value: nk_vec2): Unit = !struct.at(524).asInstanceOf[Ptr[nk_vec2]] = value

opaque type nk_table = CArray[CChar, Nat.Digit3[Nat._5, Nat._0, Nat._4]]
object nk_table:
  given _tag: Tag[nk_table] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._0, Nat._4]](Tag.Byte, Tag.Digit3[Nat._5, Nat._0, Nat._4](Tag.Nat5, Tag.Nat0, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_table] = scala.scalanative.unsafe.alloc[nk_table](1)
  def apply(seq : CUnsignedInt, size : CUnsignedInt, keys : CArray[nk_hash, Nat.Digit2[Nat._6, Nat._0]], values : CArray[nk_uint, Nat.Digit2[Nat._6, Nat._0]], next : Ptr[nk_table], prev : Ptr[nk_table])(using Zone): Ptr[nk_table] = 
    val ____ptr = apply()
    (!____ptr).seq = seq
    (!____ptr).size = size
    (!____ptr).keys = keys
    (!____ptr).values = values
    (!____ptr).next = next
    (!____ptr).prev = prev
    ____ptr
  extension (struct: nk_table)
    def seq: CUnsignedInt = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
    def seq_=(value: CUnsignedInt): Unit = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
    def size: CUnsignedInt = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]]
    def size_=(value: CUnsignedInt): Unit = !struct.at(4).asInstanceOf[Ptr[CUnsignedInt]] = value
    def keys: CArray[nk_hash, Nat.Digit2[Nat._6, Nat._0]] = !struct.at(8).asInstanceOf[Ptr[CArray[nk_hash, Nat.Digit2[Nat._6, Nat._0]]]]
    def keys_=(value: CArray[nk_hash, Nat.Digit2[Nat._6, Nat._0]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[nk_hash, Nat.Digit2[Nat._6, Nat._0]]]] = value
    def values: CArray[nk_uint, Nat.Digit2[Nat._6, Nat._0]] = !struct.at(248).asInstanceOf[Ptr[CArray[nk_uint, Nat.Digit2[Nat._6, Nat._0]]]]
    def values_=(value: CArray[nk_uint, Nat.Digit2[Nat._6, Nat._0]]): Unit = !struct.at(248).asInstanceOf[Ptr[CArray[nk_uint, Nat.Digit2[Nat._6, Nat._0]]]] = value
    def next: Ptr[nk_table] = !struct.at(488).asInstanceOf[Ptr[Ptr[nk_table]]]
    def next_=(value: Ptr[nk_table]): Unit = !struct.at(488).asInstanceOf[Ptr[Ptr[nk_table]]] = value
    def prev: Ptr[nk_table] = !struct.at(496).asInstanceOf[Ptr[Ptr[nk_table]]]
    def prev_=(value: Ptr[nk_table]): Unit = !struct.at(496).asInstanceOf[Ptr[Ptr[nk_table]]] = value

opaque type nk_text = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]
object nk_text:
  given _tag: Tag[nk_text] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  def apply()(using Zone): Ptr[nk_text] = scala.scalanative.unsafe.alloc[nk_text](1)
  def apply(padding : nk_vec2, background : nk_color, text : nk_color)(using Zone): Ptr[nk_text] = 
    val ____ptr = apply()
    (!____ptr).padding = padding
    (!____ptr).background = background
    (!____ptr).text = text
    ____ptr
  extension (struct: nk_text)
    def padding: nk_vec2 = !struct.at(0).asInstanceOf[Ptr[nk_vec2]]
    def padding_=(value: nk_vec2): Unit = !struct.at(0).asInstanceOf[Ptr[nk_vec2]] = value
    def background: nk_color = !struct.at(8).asInstanceOf[Ptr[nk_color]]
    def background_=(value: nk_color): Unit = !struct.at(8).asInstanceOf[Ptr[nk_color]] = value
    def text: nk_color = !struct.at(12).asInstanceOf[Ptr[nk_color]]
    def text_=(value: nk_color): Unit = !struct.at(12).asInstanceOf[Ptr[nk_color]] = value

opaque type nk_text_edit = CArray[CChar, Nat.Digit4[Nat._5, Nat._3, Nat._8, Nat._4]]
object nk_text_edit:
  given _tag: Tag[nk_text_edit] = Tag.CArray[CChar, Nat.Digit4[Nat._5, Nat._3, Nat._8, Nat._4]](Tag.Byte, Tag.Digit4[Nat._5, Nat._3, Nat._8, Nat._4](Tag.Nat5, Tag.Nat3, Tag.Nat8, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_text_edit] = scala.scalanative.unsafe.alloc[nk_text_edit](1)
  def apply(clip : nk_clipboard, string : nk_str, filter : nk_plugin_filter, scrollbar : nk_vec2, cursor : CInt, select_start : CInt, select_end : CInt, mode : CUnsignedChar, cursor_at_end_of_line : CUnsignedChar, initialized : CUnsignedChar, has_preferred_x : CUnsignedChar, single_line : CUnsignedChar, active : CUnsignedChar, padding1 : CUnsignedChar, preferred_x : Float, undo : nk_text_undo_state)(using Zone): Ptr[nk_text_edit] = 
    val ____ptr = apply()
    (!____ptr).clip = clip
    (!____ptr).string = string
    (!____ptr).filter = filter
    (!____ptr).scrollbar = scrollbar
    (!____ptr).cursor = cursor
    (!____ptr).select_start = select_start
    (!____ptr).select_end = select_end
    (!____ptr).mode = mode
    (!____ptr).cursor_at_end_of_line = cursor_at_end_of_line
    (!____ptr).initialized = initialized
    (!____ptr).has_preferred_x = has_preferred_x
    (!____ptr).single_line = single_line
    (!____ptr).active = active
    (!____ptr).padding1 = padding1
    (!____ptr).preferred_x = preferred_x
    (!____ptr).undo = undo
    ____ptr
  extension (struct: nk_text_edit)
    def clip: nk_clipboard = !struct.at(0).asInstanceOf[Ptr[nk_clipboard]]
    def clip_=(value: nk_clipboard): Unit = !struct.at(0).asInstanceOf[Ptr[nk_clipboard]] = value
    def string: nk_str = !struct.at(24).asInstanceOf[Ptr[nk_str]]
    def string_=(value: nk_str): Unit = !struct.at(24).asInstanceOf[Ptr[nk_str]] = value
    def filter: nk_plugin_filter = !struct.at(152).asInstanceOf[Ptr[nk_plugin_filter]]
    def filter_=(value: nk_plugin_filter): Unit = !struct.at(152).asInstanceOf[Ptr[nk_plugin_filter]] = value
    def scrollbar: nk_vec2 = !struct.at(160).asInstanceOf[Ptr[nk_vec2]]
    def scrollbar_=(value: nk_vec2): Unit = !struct.at(160).asInstanceOf[Ptr[nk_vec2]] = value
    def cursor: CInt = !struct.at(168).asInstanceOf[Ptr[CInt]]
    def cursor_=(value: CInt): Unit = !struct.at(168).asInstanceOf[Ptr[CInt]] = value
    def select_start: CInt = !struct.at(172).asInstanceOf[Ptr[CInt]]
    def select_start_=(value: CInt): Unit = !struct.at(172).asInstanceOf[Ptr[CInt]] = value
    def select_end: CInt = !struct.at(176).asInstanceOf[Ptr[CInt]]
    def select_end_=(value: CInt): Unit = !struct.at(176).asInstanceOf[Ptr[CInt]] = value
    def mode: CUnsignedChar = !struct.at(180).asInstanceOf[Ptr[CUnsignedChar]]
    def mode_=(value: CUnsignedChar): Unit = !struct.at(180).asInstanceOf[Ptr[CUnsignedChar]] = value
    def cursor_at_end_of_line: CUnsignedChar = !struct.at(181).asInstanceOf[Ptr[CUnsignedChar]]
    def cursor_at_end_of_line_=(value: CUnsignedChar): Unit = !struct.at(181).asInstanceOf[Ptr[CUnsignedChar]] = value
    def initialized: CUnsignedChar = !struct.at(182).asInstanceOf[Ptr[CUnsignedChar]]
    def initialized_=(value: CUnsignedChar): Unit = !struct.at(182).asInstanceOf[Ptr[CUnsignedChar]] = value
    def has_preferred_x: CUnsignedChar = !struct.at(183).asInstanceOf[Ptr[CUnsignedChar]]
    def has_preferred_x_=(value: CUnsignedChar): Unit = !struct.at(183).asInstanceOf[Ptr[CUnsignedChar]] = value
    def single_line: CUnsignedChar = !struct.at(184).asInstanceOf[Ptr[CUnsignedChar]]
    def single_line_=(value: CUnsignedChar): Unit = !struct.at(184).asInstanceOf[Ptr[CUnsignedChar]] = value
    def active: CUnsignedChar = !struct.at(185).asInstanceOf[Ptr[CUnsignedChar]]
    def active_=(value: CUnsignedChar): Unit = !struct.at(185).asInstanceOf[Ptr[CUnsignedChar]] = value
    def padding1: CUnsignedChar = !struct.at(186).asInstanceOf[Ptr[CUnsignedChar]]
    def padding1_=(value: CUnsignedChar): Unit = !struct.at(186).asInstanceOf[Ptr[CUnsignedChar]] = value
    def preferred_x: Float = !struct.at(188).asInstanceOf[Ptr[Float]]
    def preferred_x_=(value: Float): Unit = !struct.at(188).asInstanceOf[Ptr[Float]] = value
    def undo: nk_text_undo_state = !struct.at(192).asInstanceOf[Ptr[nk_text_undo_state]]
    def undo_=(value: nk_text_undo_state): Unit = !struct.at(192).asInstanceOf[Ptr[nk_text_undo_state]] = value

opaque type nk_text_edit_row = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object nk_text_edit_row:
  given _tag: Tag[nk_text_edit_row] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_text_edit_row] = scala.scalanative.unsafe.alloc[nk_text_edit_row](1)
  def apply(x0 : Float, x1 : Float, baseline_y_delta : Float, ymin : Float, ymax : Float, num_chars : CInt)(using Zone): Ptr[nk_text_edit_row] = 
    val ____ptr = apply()
    (!____ptr).x0 = x0
    (!____ptr).x1 = x1
    (!____ptr).baseline_y_delta = baseline_y_delta
    (!____ptr).ymin = ymin
    (!____ptr).ymax = ymax
    (!____ptr).num_chars = num_chars
    ____ptr
  extension (struct: nk_text_edit_row)
    def x0: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def x0_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def x1: Float = !struct.at(4).asInstanceOf[Ptr[Float]]
    def x1_=(value: Float): Unit = !struct.at(4).asInstanceOf[Ptr[Float]] = value
    def baseline_y_delta: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def baseline_y_delta_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def ymin: Float = !struct.at(12).asInstanceOf[Ptr[Float]]
    def ymin_=(value: Float): Unit = !struct.at(12).asInstanceOf[Ptr[Float]] = value
    def ymax: Float = !struct.at(16).asInstanceOf[Ptr[Float]]
    def ymax_=(value: Float): Unit = !struct.at(16).asInstanceOf[Ptr[Float]] = value
    def num_chars: CInt = !struct.at(20).asInstanceOf[Ptr[CInt]]
    def num_chars_=(value: CInt): Unit = !struct.at(20).asInstanceOf[Ptr[CInt]] = value

opaque type nk_text_find = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object nk_text_find:
  given _tag: Tag[nk_text_find] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_text_find] = scala.scalanative.unsafe.alloc[nk_text_find](1)
  def apply(x : Float, y : Float, height : Float, first_char : CInt, _length : CInt, prev_first : CInt)(using Zone): Ptr[nk_text_find] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).height = height
    (!____ptr).first_char = first_char
    (!____ptr)._length = _length
    (!____ptr).prev_first = prev_first
    ____ptr
  extension (struct: nk_text_find)
    def x: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def x_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def y: Float = !struct.at(4).asInstanceOf[Ptr[Float]]
    def y_=(value: Float): Unit = !struct.at(4).asInstanceOf[Ptr[Float]] = value
    def height: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def height_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def first_char: CInt = !struct.at(12).asInstanceOf[Ptr[CInt]]
    def first_char_=(value: CInt): Unit = !struct.at(12).asInstanceOf[Ptr[CInt]] = value
    def _length: CInt = !struct.at(16).asInstanceOf[Ptr[CInt]]
    def _length_=(value: CInt): Unit = !struct.at(16).asInstanceOf[Ptr[CInt]] = value
    def prev_first: CInt = !struct.at(20).asInstanceOf[Ptr[CInt]]
    def prev_first_=(value: CInt): Unit = !struct.at(20).asInstanceOf[Ptr[CInt]] = value

opaque type nk_text_undo_record = CArray[CChar, Nat.Digit2[Nat._1, Nat._2]]
object nk_text_undo_record:
  given _tag: Tag[nk_text_undo_record] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._2]](Tag.Byte, Tag.Digit2[Nat._1, Nat._2](Tag.Nat1, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_text_undo_record] = scala.scalanative.unsafe.alloc[nk_text_undo_record](1)
  def apply(where : CInt, insert_length : CShort, delete_length : CShort, char_storage : CShort)(using Zone): Ptr[nk_text_undo_record] = 
    val ____ptr = apply()
    (!____ptr).where = where
    (!____ptr).insert_length = insert_length
    (!____ptr).delete_length = delete_length
    (!____ptr).char_storage = char_storage
    ____ptr
  extension (struct: nk_text_undo_record)
    def where: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def where_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def insert_length: CShort = !struct.at(4).asInstanceOf[Ptr[CShort]]
    def insert_length_=(value: CShort): Unit = !struct.at(4).asInstanceOf[Ptr[CShort]] = value
    def delete_length: CShort = !struct.at(6).asInstanceOf[Ptr[CShort]]
    def delete_length_=(value: CShort): Unit = !struct.at(6).asInstanceOf[Ptr[CShort]] = value
    def char_storage: CShort = !struct.at(8).asInstanceOf[Ptr[CShort]]
    def char_storage_=(value: CShort): Unit = !struct.at(8).asInstanceOf[Ptr[CShort]] = value

opaque type nk_text_undo_state = CArray[CChar, Nat.Digit4[Nat._5, Nat._1, Nat._9, Nat._2]]
object nk_text_undo_state:
  given _tag: Tag[nk_text_undo_state] = Tag.CArray[CChar, Nat.Digit4[Nat._5, Nat._1, Nat._9, Nat._2]](Tag.Byte, Tag.Digit4[Nat._5, Nat._1, Nat._9, Nat._2](Tag.Nat5, Tag.Nat1, Tag.Nat9, Tag.Nat2))
  def apply()(using Zone): Ptr[nk_text_undo_state] = scala.scalanative.unsafe.alloc[nk_text_undo_state](1)
  def apply(undo_rec : CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]], undo_char : CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]], undo_point : CShort, redo_point : CShort, undo_char_point : CShort, redo_char_point : CShort)(using Zone): Ptr[nk_text_undo_state] = 
    val ____ptr = apply()
    (!____ptr).undo_rec = undo_rec
    (!____ptr).undo_char = undo_char
    (!____ptr).undo_point = undo_point
    (!____ptr).redo_point = redo_point
    (!____ptr).undo_char_point = undo_char_point
    (!____ptr).redo_char_point = redo_char_point
    ____ptr
  extension (struct: nk_text_undo_state)
    def undo_rec: CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]] = !struct.at(0).asInstanceOf[Ptr[CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]]]]
    def undo_rec_=(value: CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]]]] = value
    def undo_char: CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]] = !struct.at(1188).asInstanceOf[Ptr[CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]]]]
    def undo_char_=(value: CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]]): Unit = !struct.at(1188).asInstanceOf[Ptr[CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]]]] = value
    def undo_point: CShort = !struct.at(5184).asInstanceOf[Ptr[CShort]]
    def undo_point_=(value: CShort): Unit = !struct.at(5184).asInstanceOf[Ptr[CShort]] = value
    def redo_point: CShort = !struct.at(5186).asInstanceOf[Ptr[CShort]]
    def redo_point_=(value: CShort): Unit = !struct.at(5186).asInstanceOf[Ptr[CShort]] = value
    def undo_char_point: CShort = !struct.at(5188).asInstanceOf[Ptr[CShort]]
    def undo_char_point_=(value: CShort): Unit = !struct.at(5188).asInstanceOf[Ptr[CShort]] = value
    def redo_char_point: CShort = !struct.at(5190).asInstanceOf[Ptr[CShort]]
    def redo_char_point_=(value: CShort): Unit = !struct.at(5190).asInstanceOf[Ptr[CShort]] = value

opaque type nk_user_font = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]
object nk_user_font:
  given _tag: Tag[nk_user_font] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_user_font] = scala.scalanative.unsafe.alloc[nk_user_font](1)
  def apply(userdata : nk_handle, height : Float, width : nk_text_width_f)(using Zone): Ptr[nk_user_font] = 
    val ____ptr = apply()
    (!____ptr).userdata = userdata
    (!____ptr).height = height
    (!____ptr).width = width
    ____ptr
  extension (struct: nk_user_font)
    def userdata: nk_handle = !struct.at(0).asInstanceOf[Ptr[nk_handle]]
    def userdata_=(value: nk_handle): Unit = !struct.at(0).asInstanceOf[Ptr[nk_handle]] = value
    def height: Float = !struct.at(8).asInstanceOf[Ptr[Float]]
    def height_=(value: Float): Unit = !struct.at(8).asInstanceOf[Ptr[Float]] = value
    def width: nk_text_width_f = !struct.at(16).asInstanceOf[Ptr[nk_text_width_f]]
    def width_=(value: nk_text_width_f): Unit = !struct.at(16).asInstanceOf[Ptr[nk_text_width_f]] = value

opaque type nk_user_font_glyph = CStruct0
object nk_user_font_glyph:
  given _tag: Tag[nk_user_font_glyph] = Tag.materializeCStruct0Tag

opaque type nk_vec2 = CArray[CChar, Nat._8]
object nk_vec2:
  given _tag: Tag[nk_vec2] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[nk_vec2] = scala.scalanative.unsafe.alloc[nk_vec2](1)
  def apply(x : Float, y : Float)(using Zone): Ptr[nk_vec2] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr
  extension (struct: nk_vec2)
    def x: Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def x_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def y: Float = !struct.at(4).asInstanceOf[Ptr[Float]]
    def y_=(value: Float): Unit = !struct.at(4).asInstanceOf[Ptr[Float]] = value

opaque type nk_vec2i = CArray[CChar, Nat._4]
object nk_vec2i:
  given _tag: Tag[nk_vec2i] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
  def apply()(using Zone): Ptr[nk_vec2i] = scala.scalanative.unsafe.alloc[nk_vec2i](1)
  def apply(x : CShort, y : CShort)(using Zone): Ptr[nk_vec2i] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr
  extension (struct: nk_vec2i)
    def x: CShort = !struct.at(0).asInstanceOf[Ptr[CShort]]
    def x_=(value: CShort): Unit = !struct.at(0).asInstanceOf[Ptr[CShort]] = value
    def y: CShort = !struct.at(2).asInstanceOf[Ptr[CShort]]
    def y_=(value: CShort): Unit = !struct.at(2).asInstanceOf[Ptr[CShort]] = value

opaque type nk_window = CArray[CChar, Nat.Digit3[Nat._4, Nat._8, Nat._0]]
object nk_window:
  given _tag: Tag[nk_window] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._8, Nat._0]](Tag.Byte, Tag.Digit3[Nat._4, Nat._8, Nat._0](Tag.Nat4, Tag.Nat8, Tag.Nat0))
  def apply()(using Zone): Ptr[nk_window] = scala.scalanative.unsafe.alloc[nk_window](1)
  def apply(seq : CUnsignedInt, name : nk_hash, name_string : CArray[CChar, Nat.Digit2[Nat._6, Nat._4]], flags : nk_flags, bounds : nk_rect, scrollbar : nk_scroll, buffer : nk_command_buffer, layout : Ptr[nk_panel], scrollbar_hiding_timer : Float, property : nk_property_state, popup : nk_popup_state, edit : nk_edit_state, scrolled : CUnsignedInt, widgets_disabled : nk_bool, tables : Ptr[nk_table], table_count : CUnsignedInt, next : Ptr[nk_window], prev : Ptr[nk_window], parent : Ptr[nk_window])(using Zone): Ptr[nk_window] = 
    val ____ptr = apply()
    (!____ptr).seq = seq
    (!____ptr).name = name
    (!____ptr).name_string = name_string
    (!____ptr).flags = flags
    (!____ptr).bounds = bounds
    (!____ptr).scrollbar = scrollbar
    (!____ptr).buffer = buffer
    (!____ptr).layout = layout
    (!____ptr).scrollbar_hiding_timer = scrollbar_hiding_timer
    (!____ptr).property = property
    (!____ptr).popup = popup
    (!____ptr).edit = edit
    (!____ptr).scrolled = scrolled
    (!____ptr).widgets_disabled = widgets_disabled
    (!____ptr).tables = tables
    (!____ptr).table_count = table_count
    (!____ptr).next = next
    (!____ptr).prev = prev
    (!____ptr).parent = parent
    ____ptr
  extension (struct: nk_window)
    def seq: CUnsignedInt = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
    def seq_=(value: CUnsignedInt): Unit = !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
    def name: nk_hash = !struct.at(4).asInstanceOf[Ptr[nk_hash]]
    def name_=(value: nk_hash): Unit = !struct.at(4).asInstanceOf[Ptr[nk_hash]] = value
    def name_string: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]] = !struct.at(8).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]]
    def name_string_=(value: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]): Unit = !struct.at(8).asInstanceOf[Ptr[CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]]] = value
    def flags: nk_flags = !struct.at(72).asInstanceOf[Ptr[nk_flags]]
    def flags_=(value: nk_flags): Unit = !struct.at(72).asInstanceOf[Ptr[nk_flags]] = value
    def bounds: nk_rect = !struct.at(76).asInstanceOf[Ptr[nk_rect]]
    def bounds_=(value: nk_rect): Unit = !struct.at(76).asInstanceOf[Ptr[nk_rect]] = value
    def scrollbar: nk_scroll = !struct.at(92).asInstanceOf[Ptr[nk_scroll]]
    def scrollbar_=(value: nk_scroll): Unit = !struct.at(92).asInstanceOf[Ptr[nk_scroll]] = value
    def buffer: nk_command_buffer = !struct.at(104).asInstanceOf[Ptr[nk_command_buffer]]
    def buffer_=(value: nk_command_buffer): Unit = !struct.at(104).asInstanceOf[Ptr[nk_command_buffer]] = value
    def layout: Ptr[nk_panel] = !struct.at(168).asInstanceOf[Ptr[Ptr[nk_panel]]]
    def layout_=(value: Ptr[nk_panel]): Unit = !struct.at(168).asInstanceOf[Ptr[Ptr[nk_panel]]] = value
    def scrollbar_hiding_timer: Float = !struct.at(176).asInstanceOf[Ptr[Float]]
    def scrollbar_hiding_timer_=(value: Float): Unit = !struct.at(176).asInstanceOf[Ptr[Float]] = value
    def property: nk_property_state = !struct.at(180).asInstanceOf[Ptr[nk_property_state]]
    def property_=(value: nk_property_state): Unit = !struct.at(180).asInstanceOf[Ptr[nk_property_state]] = value
    def popup: nk_popup_state = !struct.at(288).asInstanceOf[Ptr[nk_popup_state]]
    def popup_=(value: nk_popup_state): Unit = !struct.at(288).asInstanceOf[Ptr[nk_popup_state]] = value
    def edit: nk_edit_state = !struct.at(384).asInstanceOf[Ptr[nk_edit_state]]
    def edit_=(value: nk_edit_state): Unit = !struct.at(384).asInstanceOf[Ptr[nk_edit_state]] = value
    def scrolled: CUnsignedInt = !struct.at(428).asInstanceOf[Ptr[CUnsignedInt]]
    def scrolled_=(value: CUnsignedInt): Unit = !struct.at(428).asInstanceOf[Ptr[CUnsignedInt]] = value
    def widgets_disabled: nk_bool = !struct.at(432).asInstanceOf[Ptr[nk_bool]]
    def widgets_disabled_=(value: nk_bool): Unit = !struct.at(432).asInstanceOf[Ptr[nk_bool]] = value
    def tables: Ptr[nk_table] = !struct.at(440).asInstanceOf[Ptr[Ptr[nk_table]]]
    def tables_=(value: Ptr[nk_table]): Unit = !struct.at(440).asInstanceOf[Ptr[Ptr[nk_table]]] = value
    def table_count: CUnsignedInt = !struct.at(448).asInstanceOf[Ptr[CUnsignedInt]]
    def table_count_=(value: CUnsignedInt): Unit = !struct.at(448).asInstanceOf[Ptr[CUnsignedInt]] = value
    def next: Ptr[nk_window] = !struct.at(456).asInstanceOf[Ptr[Ptr[nk_window]]]
    def next_=(value: Ptr[nk_window]): Unit = !struct.at(456).asInstanceOf[Ptr[Ptr[nk_window]]] = value
    def prev: Ptr[nk_window] = !struct.at(464).asInstanceOf[Ptr[Ptr[nk_window]]]
    def prev_=(value: Ptr[nk_window]): Unit = !struct.at(464).asInstanceOf[Ptr[Ptr[nk_window]]] = value
    def parent: Ptr[nk_window] = !struct.at(472).asInstanceOf[Ptr[Ptr[nk_window]]]
    def parent_=(value: Ptr[nk_window]): Unit = !struct.at(472).asInstanceOf[Ptr[Ptr[nk_window]]] = value

opaque type stbrp_context = CStruct9[CInt, CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Ptr[Byte], CArray[Ptr[Byte], Nat._2]]
object stbrp_context:
  given _tag: Tag[stbrp_context] = Tag.materializeCStruct9Tag[CInt, CInt, CInt, CInt, CInt, CInt, Ptr[Byte], Ptr[Byte], CArray[Ptr[Byte], Nat._2]]
  def apply()(using Zone): Ptr[stbrp_context] = scala.scalanative.unsafe.alloc[stbrp_context](1)
  def apply(width : CInt, height : CInt, align : CInt, init_mode : CInt, heuristic : CInt, num_nodes : CInt, active_head : Ptr[stbrp_node], free_head : Ptr[stbrp_node], extra : CArray[stbrp_node, Nat._2])(using Zone): Ptr[stbrp_context] = 
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    (!____ptr).align = align
    (!____ptr).init_mode = init_mode
    (!____ptr).heuristic = heuristic
    (!____ptr).num_nodes = num_nodes
    (!____ptr).active_head = active_head
    (!____ptr).free_head = free_head
    (!____ptr).extra = extra
    ____ptr
  extension (struct: stbrp_context)
    def width : CInt = struct._1
    def width_=(value: CInt): Unit = !struct.at1 = value
    def height : CInt = struct._2
    def height_=(value: CInt): Unit = !struct.at2 = value
    def align : CInt = struct._3
    def align_=(value: CInt): Unit = !struct.at3 = value
    def init_mode : CInt = struct._4
    def init_mode_=(value: CInt): Unit = !struct.at4 = value
    def heuristic : CInt = struct._5
    def heuristic_=(value: CInt): Unit = !struct.at5 = value
    def num_nodes : CInt = struct._6
    def num_nodes_=(value: CInt): Unit = !struct.at6 = value
    def active_head : Ptr[stbrp_node] = struct._7.asInstanceOf[Ptr[stbrp_node]]
    def active_head_=(value: Ptr[stbrp_node]): Unit = !struct.at7 = value.asInstanceOf[Ptr[Byte]]
    def free_head : Ptr[stbrp_node] = struct._8.asInstanceOf[Ptr[stbrp_node]]
    def free_head_=(value: Ptr[stbrp_node]): Unit = !struct.at8 = value.asInstanceOf[Ptr[Byte]]
    def extra : CArray[stbrp_node, Nat._2] = struct._9.asInstanceOf[CArray[stbrp_node, Nat._2]]
    def extra_=(value: CArray[stbrp_node, Nat._2]): Unit = !struct.at9 = value.asInstanceOf[CArray[Ptr[Byte], Nat._2]]

opaque type stbrp_node = CStruct3[stbrp_coord, stbrp_coord, Ptr[Byte]]
object stbrp_node:
  given _tag: Tag[stbrp_node] = Tag.materializeCStruct3Tag[stbrp_coord, stbrp_coord, Ptr[Byte]]
  def apply()(using Zone): Ptr[stbrp_node] = scala.scalanative.unsafe.alloc[stbrp_node](1)
  def apply(x : stbrp_coord, y : stbrp_coord, next : Ptr[stbrp_node])(using Zone): Ptr[stbrp_node] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).next = next
    ____ptr
  extension (struct: stbrp_node)
    def x : stbrp_coord = struct._1
    def x_=(value: stbrp_coord): Unit = !struct.at1 = value
    def y : stbrp_coord = struct._2
    def y_=(value: stbrp_coord): Unit = !struct.at2 = value
    def next : Ptr[stbrp_node] = struct._3.asInstanceOf[Ptr[stbrp_node]]
    def next_=(value: Ptr[stbrp_node]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]

opaque type stbrp_rect = CStruct6[CInt, stbrp_coord, stbrp_coord, stbrp_coord, stbrp_coord, CInt]
object stbrp_rect:
  given _tag: Tag[stbrp_rect] = Tag.materializeCStruct6Tag[CInt, stbrp_coord, stbrp_coord, stbrp_coord, stbrp_coord, CInt]
  def apply()(using Zone): Ptr[stbrp_rect] = scala.scalanative.unsafe.alloc[stbrp_rect](1)
  def apply(id : CInt, w : stbrp_coord, h : stbrp_coord, x : stbrp_coord, y : stbrp_coord, was_packed : CInt)(using Zone): Ptr[stbrp_rect] = 
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).was_packed = was_packed
    ____ptr
  extension (struct: stbrp_rect)
    def id : CInt = struct._1
    def id_=(value: CInt): Unit = !struct.at1 = value
    def w : stbrp_coord = struct._2
    def w_=(value: stbrp_coord): Unit = !struct.at2 = value
    def h : stbrp_coord = struct._3
    def h_=(value: stbrp_coord): Unit = !struct.at3 = value
    def x : stbrp_coord = struct._4
    def x_=(value: stbrp_coord): Unit = !struct.at4 = value
    def y : stbrp_coord = struct._5
    def y_=(value: stbrp_coord): Unit = !struct.at5 = value
    def was_packed : CInt = struct._6
    def was_packed_=(value: CInt): Unit = !struct.at6 = value

opaque type stbtt__bitmap = CStruct4[CInt, CInt, CInt, Ptr[CUnsignedChar]]
object stbtt__bitmap:
  given _tag: Tag[stbtt__bitmap] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, Ptr[CUnsignedChar]]
  def apply()(using Zone): Ptr[stbtt__bitmap] = scala.scalanative.unsafe.alloc[stbtt__bitmap](1)
  def apply(w : CInt, h : CInt, stride : CInt, pixels : Ptr[CUnsignedChar])(using Zone): Ptr[stbtt__bitmap] = 
    val ____ptr = apply()
    (!____ptr).w = w
    (!____ptr).h = h
    (!____ptr).stride = stride
    (!____ptr).pixels = pixels
    ____ptr
  extension (struct: stbtt__bitmap)
    def w : CInt = struct._1
    def w_=(value: CInt): Unit = !struct.at1 = value
    def h : CInt = struct._2
    def h_=(value: CInt): Unit = !struct.at2 = value
    def stride : CInt = struct._3
    def stride_=(value: CInt): Unit = !struct.at3 = value
    def pixels : Ptr[CUnsignedChar] = struct._4
    def pixels_=(value: Ptr[CUnsignedChar]): Unit = !struct.at4 = value

opaque type stbtt__buf = CStruct3[Ptr[CUnsignedChar], CInt, CInt]
object stbtt__buf:
  given _tag: Tag[stbtt__buf] = Tag.materializeCStruct3Tag[Ptr[CUnsignedChar], CInt, CInt]
  def apply()(using Zone): Ptr[stbtt__buf] = scala.scalanative.unsafe.alloc[stbtt__buf](1)
  def apply(data : Ptr[CUnsignedChar], cursor : CInt, size : CInt)(using Zone): Ptr[stbtt__buf] = 
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).cursor = cursor
    (!____ptr).size = size
    ____ptr
  extension (struct: stbtt__buf)
    def data : Ptr[CUnsignedChar] = struct._1
    def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at1 = value
    def cursor : CInt = struct._2
    def cursor_=(value: CInt): Unit = !struct.at2 = value
    def size : CInt = struct._3
    def size_=(value: CInt): Unit = !struct.at3 = value

opaque type stbtt_aligned_quad = CStruct8[Float, Float, Float, Float, Float, Float, Float, Float]
object stbtt_aligned_quad:
  given _tag: Tag[stbtt_aligned_quad] = Tag.materializeCStruct8Tag[Float, Float, Float, Float, Float, Float, Float, Float]
  def apply()(using Zone): Ptr[stbtt_aligned_quad] = scala.scalanative.unsafe.alloc[stbtt_aligned_quad](1)
  def apply(x0 : Float, y0 : Float, s0 : Float, t0 : Float, x1 : Float, y1 : Float, s1 : Float, t1 : Float)(using Zone): Ptr[stbtt_aligned_quad] = 
    val ____ptr = apply()
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    (!____ptr).s0 = s0
    (!____ptr).t0 = t0
    (!____ptr).x1 = x1
    (!____ptr).y1 = y1
    (!____ptr).s1 = s1
    (!____ptr).t1 = t1
    ____ptr
  extension (struct: stbtt_aligned_quad)
    def x0 : Float = struct._1
    def x0_=(value: Float): Unit = !struct.at1 = value
    def y0 : Float = struct._2
    def y0_=(value: Float): Unit = !struct.at2 = value
    def s0 : Float = struct._3
    def s0_=(value: Float): Unit = !struct.at3 = value
    def t0 : Float = struct._4
    def t0_=(value: Float): Unit = !struct.at4 = value
    def x1 : Float = struct._5
    def x1_=(value: Float): Unit = !struct.at5 = value
    def y1 : Float = struct._6
    def y1_=(value: Float): Unit = !struct.at6 = value
    def s1 : Float = struct._7
    def s1_=(value: Float): Unit = !struct.at7 = value
    def t1 : Float = struct._8
    def t1_=(value: Float): Unit = !struct.at8 = value

opaque type stbtt_bakedchar = CStruct7[CUnsignedShort, CUnsignedShort, CUnsignedShort, CUnsignedShort, Float, Float, Float]
object stbtt_bakedchar:
  given _tag: Tag[stbtt_bakedchar] = Tag.materializeCStruct7Tag[CUnsignedShort, CUnsignedShort, CUnsignedShort, CUnsignedShort, Float, Float, Float]
  def apply()(using Zone): Ptr[stbtt_bakedchar] = scala.scalanative.unsafe.alloc[stbtt_bakedchar](1)
  def apply(x0 : CUnsignedShort, y0 : CUnsignedShort, x1 : CUnsignedShort, y1 : CUnsignedShort, xoff : Float, yoff : Float, xadvance : Float)(using Zone): Ptr[stbtt_bakedchar] = 
    val ____ptr = apply()
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    (!____ptr).x1 = x1
    (!____ptr).y1 = y1
    (!____ptr).xoff = xoff
    (!____ptr).yoff = yoff
    (!____ptr).xadvance = xadvance
    ____ptr
  extension (struct: stbtt_bakedchar)
    def x0 : CUnsignedShort = struct._1
    def x0_=(value: CUnsignedShort): Unit = !struct.at1 = value
    def y0 : CUnsignedShort = struct._2
    def y0_=(value: CUnsignedShort): Unit = !struct.at2 = value
    def x1 : CUnsignedShort = struct._3
    def x1_=(value: CUnsignedShort): Unit = !struct.at3 = value
    def y1 : CUnsignedShort = struct._4
    def y1_=(value: CUnsignedShort): Unit = !struct.at4 = value
    def xoff : Float = struct._5
    def xoff_=(value: Float): Unit = !struct.at5 = value
    def yoff : Float = struct._6
    def yoff_=(value: Float): Unit = !struct.at6 = value
    def xadvance : Float = struct._7
    def xadvance_=(value: Float): Unit = !struct.at7 = value

opaque type stbtt_fontinfo = CStruct20[Ptr[Byte], Ptr[CUnsignedChar], CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, stbtt__buf, stbtt__buf, stbtt__buf, stbtt__buf, stbtt__buf, stbtt__buf]
object stbtt_fontinfo:
  given _tag: Tag[stbtt_fontinfo] = Tag.materializeCStruct20Tag[Ptr[Byte], Ptr[CUnsignedChar], CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, stbtt__buf, stbtt__buf, stbtt__buf, stbtt__buf, stbtt__buf, stbtt__buf]
  def apply()(using Zone): Ptr[stbtt_fontinfo] = scala.scalanative.unsafe.alloc[stbtt_fontinfo](1)
  def apply(userdata : Ptr[Byte], data : Ptr[CUnsignedChar], fontstart : CInt, numGlyphs : CInt, loca : CInt, head : CInt, glyf : CInt, hhea : CInt, hmtx : CInt, kern : CInt, gpos : CInt, svg : CInt, index_map : CInt, indexToLocFormat : CInt, cff : stbtt__buf, charstrings : stbtt__buf, gsubrs : stbtt__buf, subrs : stbtt__buf, fontdicts : stbtt__buf, fdselect : stbtt__buf)(using Zone): Ptr[stbtt_fontinfo] = 
    val ____ptr = apply()
    (!____ptr).userdata = userdata
    (!____ptr).data = data
    (!____ptr).fontstart = fontstart
    (!____ptr).numGlyphs = numGlyphs
    (!____ptr).loca = loca
    (!____ptr).head = head
    (!____ptr).glyf = glyf
    (!____ptr).hhea = hhea
    (!____ptr).hmtx = hmtx
    (!____ptr).kern = kern
    (!____ptr).gpos = gpos
    (!____ptr).svg = svg
    (!____ptr).index_map = index_map
    (!____ptr).indexToLocFormat = indexToLocFormat
    (!____ptr).cff = cff
    (!____ptr).charstrings = charstrings
    (!____ptr).gsubrs = gsubrs
    (!____ptr).subrs = subrs
    (!____ptr).fontdicts = fontdicts
    (!____ptr).fdselect = fdselect
    ____ptr
  extension (struct: stbtt_fontinfo)
    def userdata : Ptr[Byte] = struct._1
    def userdata_=(value: Ptr[Byte]): Unit = !struct.at1 = value
    def data : Ptr[CUnsignedChar] = struct._2
    def data_=(value: Ptr[CUnsignedChar]): Unit = !struct.at2 = value
    def fontstart : CInt = struct._3
    def fontstart_=(value: CInt): Unit = !struct.at3 = value
    def numGlyphs : CInt = struct._4
    def numGlyphs_=(value: CInt): Unit = !struct.at4 = value
    def loca : CInt = struct._5
    def loca_=(value: CInt): Unit = !struct.at5 = value
    def head : CInt = struct._6
    def head_=(value: CInt): Unit = !struct.at6 = value
    def glyf : CInt = struct._7
    def glyf_=(value: CInt): Unit = !struct.at7 = value
    def hhea : CInt = struct._8
    def hhea_=(value: CInt): Unit = !struct.at8 = value
    def hmtx : CInt = struct._9
    def hmtx_=(value: CInt): Unit = !struct.at9 = value
    def kern : CInt = struct._10
    def kern_=(value: CInt): Unit = !struct.at10 = value
    def gpos : CInt = struct._11
    def gpos_=(value: CInt): Unit = !struct.at11 = value
    def svg : CInt = struct._12
    def svg_=(value: CInt): Unit = !struct.at12 = value
    def index_map : CInt = struct._13
    def index_map_=(value: CInt): Unit = !struct.at13 = value
    def indexToLocFormat : CInt = struct._14
    def indexToLocFormat_=(value: CInt): Unit = !struct.at14 = value
    def cff : stbtt__buf = struct._15
    def cff_=(value: stbtt__buf): Unit = !struct.at15 = value
    def charstrings : stbtt__buf = struct._16
    def charstrings_=(value: stbtt__buf): Unit = !struct.at16 = value
    def gsubrs : stbtt__buf = struct._17
    def gsubrs_=(value: stbtt__buf): Unit = !struct.at17 = value
    def subrs : stbtt__buf = struct._18
    def subrs_=(value: stbtt__buf): Unit = !struct.at18 = value
    def fontdicts : stbtt__buf = struct._19
    def fontdicts_=(value: stbtt__buf): Unit = !struct.at19 = value
    def fdselect : stbtt__buf = struct._20
    def fdselect_=(value: stbtt__buf): Unit = !struct.at20 = value

opaque type stbtt_kerningentry = CStruct3[CInt, CInt, CInt]
object stbtt_kerningentry:
  given _tag: Tag[stbtt_kerningentry] = Tag.materializeCStruct3Tag[CInt, CInt, CInt]
  def apply()(using Zone): Ptr[stbtt_kerningentry] = scala.scalanative.unsafe.alloc[stbtt_kerningentry](1)
  def apply(glyph1 : CInt, glyph2 : CInt, advance : CInt)(using Zone): Ptr[stbtt_kerningentry] = 
    val ____ptr = apply()
    (!____ptr).glyph1 = glyph1
    (!____ptr).glyph2 = glyph2
    (!____ptr).advance = advance
    ____ptr
  extension (struct: stbtt_kerningentry)
    def glyph1 : CInt = struct._1
    def glyph1_=(value: CInt): Unit = !struct.at1 = value
    def glyph2 : CInt = struct._2
    def glyph2_=(value: CInt): Unit = !struct.at2 = value
    def advance : CInt = struct._3
    def advance_=(value: CInt): Unit = !struct.at3 = value

opaque type stbtt_pack_context = CStruct11[Ptr[Byte], Ptr[Byte], CInt, CInt, CInt, CInt, CInt, CUnsignedInt, CUnsignedInt, Ptr[CUnsignedChar], Ptr[Byte]]
object stbtt_pack_context:
  given _tag: Tag[stbtt_pack_context] = Tag.materializeCStruct11Tag[Ptr[Byte], Ptr[Byte], CInt, CInt, CInt, CInt, CInt, CUnsignedInt, CUnsignedInt, Ptr[CUnsignedChar], Ptr[Byte]]
  def apply()(using Zone): Ptr[stbtt_pack_context] = scala.scalanative.unsafe.alloc[stbtt_pack_context](1)
  def apply(user_allocator_context : Ptr[Byte], pack_info : Ptr[Byte], width : CInt, height : CInt, stride_in_bytes : CInt, padding : CInt, skip_missing : CInt, h_oversample : CUnsignedInt, v_oversample : CUnsignedInt, pixels : Ptr[CUnsignedChar], nodes : Ptr[Byte])(using Zone): Ptr[stbtt_pack_context] = 
    val ____ptr = apply()
    (!____ptr).user_allocator_context = user_allocator_context
    (!____ptr).pack_info = pack_info
    (!____ptr).width = width
    (!____ptr).height = height
    (!____ptr).stride_in_bytes = stride_in_bytes
    (!____ptr).padding = padding
    (!____ptr).skip_missing = skip_missing
    (!____ptr).h_oversample = h_oversample
    (!____ptr).v_oversample = v_oversample
    (!____ptr).pixels = pixels
    (!____ptr).nodes = nodes
    ____ptr
  extension (struct: stbtt_pack_context)
    def user_allocator_context : Ptr[Byte] = struct._1
    def user_allocator_context_=(value: Ptr[Byte]): Unit = !struct.at1 = value
    def pack_info : Ptr[Byte] = struct._2
    def pack_info_=(value: Ptr[Byte]): Unit = !struct.at2 = value
    def width : CInt = struct._3
    def width_=(value: CInt): Unit = !struct.at3 = value
    def height : CInt = struct._4
    def height_=(value: CInt): Unit = !struct.at4 = value
    def stride_in_bytes : CInt = struct._5
    def stride_in_bytes_=(value: CInt): Unit = !struct.at5 = value
    def padding : CInt = struct._6
    def padding_=(value: CInt): Unit = !struct.at6 = value
    def skip_missing : CInt = struct._7
    def skip_missing_=(value: CInt): Unit = !struct.at7 = value
    def h_oversample : CUnsignedInt = struct._8
    def h_oversample_=(value: CUnsignedInt): Unit = !struct.at8 = value
    def v_oversample : CUnsignedInt = struct._9
    def v_oversample_=(value: CUnsignedInt): Unit = !struct.at9 = value
    def pixels : Ptr[CUnsignedChar] = struct._10
    def pixels_=(value: Ptr[CUnsignedChar]): Unit = !struct.at10 = value
    def nodes : Ptr[Byte] = struct._11
    def nodes_=(value: Ptr[Byte]): Unit = !struct.at11 = value

opaque type stbtt_pack_range = CStruct7[Float, CInt, Ptr[CInt], CInt, Ptr[stbtt_packedchar], CUnsignedChar, CUnsignedChar]
object stbtt_pack_range:
  given _tag: Tag[stbtt_pack_range] = Tag.materializeCStruct7Tag[Float, CInt, Ptr[CInt], CInt, Ptr[stbtt_packedchar], CUnsignedChar, CUnsignedChar]
  def apply()(using Zone): Ptr[stbtt_pack_range] = scala.scalanative.unsafe.alloc[stbtt_pack_range](1)
  def apply(font_size : Float, first_unicode_codepoint_in_range : CInt, array_of_unicode_codepoints : Ptr[CInt], num_chars : CInt, chardata_for_range : Ptr[stbtt_packedchar], h_oversample : CUnsignedChar, v_oversample : CUnsignedChar)(using Zone): Ptr[stbtt_pack_range] = 
    val ____ptr = apply()
    (!____ptr).font_size = font_size
    (!____ptr).first_unicode_codepoint_in_range = first_unicode_codepoint_in_range
    (!____ptr).array_of_unicode_codepoints = array_of_unicode_codepoints
    (!____ptr).num_chars = num_chars
    (!____ptr).chardata_for_range = chardata_for_range
    (!____ptr).h_oversample = h_oversample
    (!____ptr).v_oversample = v_oversample
    ____ptr
  extension (struct: stbtt_pack_range)
    def font_size : Float = struct._1
    def font_size_=(value: Float): Unit = !struct.at1 = value
    def first_unicode_codepoint_in_range : CInt = struct._2
    def first_unicode_codepoint_in_range_=(value: CInt): Unit = !struct.at2 = value
    def array_of_unicode_codepoints : Ptr[CInt] = struct._3
    def array_of_unicode_codepoints_=(value: Ptr[CInt]): Unit = !struct.at3 = value
    def num_chars : CInt = struct._4
    def num_chars_=(value: CInt): Unit = !struct.at4 = value
    def chardata_for_range : Ptr[stbtt_packedchar] = struct._5
    def chardata_for_range_=(value: Ptr[stbtt_packedchar]): Unit = !struct.at5 = value
    def h_oversample : CUnsignedChar = struct._6
    def h_oversample_=(value: CUnsignedChar): Unit = !struct.at6 = value
    def v_oversample : CUnsignedChar = struct._7
    def v_oversample_=(value: CUnsignedChar): Unit = !struct.at7 = value

opaque type stbtt_packedchar = CStruct9[CUnsignedShort, CUnsignedShort, CUnsignedShort, CUnsignedShort, Float, Float, Float, Float, Float]
object stbtt_packedchar:
  given _tag: Tag[stbtt_packedchar] = Tag.materializeCStruct9Tag[CUnsignedShort, CUnsignedShort, CUnsignedShort, CUnsignedShort, Float, Float, Float, Float, Float]
  def apply()(using Zone): Ptr[stbtt_packedchar] = scala.scalanative.unsafe.alloc[stbtt_packedchar](1)
  def apply(x0 : CUnsignedShort, y0 : CUnsignedShort, x1 : CUnsignedShort, y1 : CUnsignedShort, xoff : Float, yoff : Float, xadvance : Float, xoff2 : Float, yoff2 : Float)(using Zone): Ptr[stbtt_packedchar] = 
    val ____ptr = apply()
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    (!____ptr).x1 = x1
    (!____ptr).y1 = y1
    (!____ptr).xoff = xoff
    (!____ptr).yoff = yoff
    (!____ptr).xadvance = xadvance
    (!____ptr).xoff2 = xoff2
    (!____ptr).yoff2 = yoff2
    ____ptr
  extension (struct: stbtt_packedchar)
    def x0 : CUnsignedShort = struct._1
    def x0_=(value: CUnsignedShort): Unit = !struct.at1 = value
    def y0 : CUnsignedShort = struct._2
    def y0_=(value: CUnsignedShort): Unit = !struct.at2 = value
    def x1 : CUnsignedShort = struct._3
    def x1_=(value: CUnsignedShort): Unit = !struct.at3 = value
    def y1 : CUnsignedShort = struct._4
    def y1_=(value: CUnsignedShort): Unit = !struct.at4 = value
    def xoff : Float = struct._5
    def xoff_=(value: Float): Unit = !struct.at5 = value
    def yoff : Float = struct._6
    def yoff_=(value: Float): Unit = !struct.at6 = value
    def xadvance : Float = struct._7
    def xadvance_=(value: Float): Unit = !struct.at7 = value
    def xoff2 : Float = struct._8
    def xoff2_=(value: Float): Unit = !struct.at8 = value
    def yoff2 : Float = struct._9
    def yoff2_=(value: Float): Unit = !struct.at9 = value

opaque type stbtt_vertex = CStruct8[CShort, CShort, CShort, CShort, CShort, CShort, CUnsignedChar, CUnsignedChar]
object stbtt_vertex:
  given _tag: Tag[stbtt_vertex] = Tag.materializeCStruct8Tag[CShort, CShort, CShort, CShort, CShort, CShort, CUnsignedChar, CUnsignedChar]
  def apply()(using Zone): Ptr[stbtt_vertex] = scala.scalanative.unsafe.alloc[stbtt_vertex](1)
  def apply(x : CShort, y : CShort, cx : CShort, cy : CShort, cx1 : CShort, cy1 : CShort, `type` : CUnsignedChar, padding : CUnsignedChar)(using Zone): Ptr[stbtt_vertex] = 
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).cx = cx
    (!____ptr).cy = cy
    (!____ptr).cx1 = cx1
    (!____ptr).cy1 = cy1
    (!____ptr).`type` = `type`
    (!____ptr).padding = padding
    ____ptr
  extension (struct: stbtt_vertex)
    def x : CShort = struct._1
    def x_=(value: CShort): Unit = !struct.at1 = value
    def y : CShort = struct._2
    def y_=(value: CShort): Unit = !struct.at2 = value
    def cx : CShort = struct._3
    def cx_=(value: CShort): Unit = !struct.at3 = value
    def cy : CShort = struct._4
    def cy_=(value: CShort): Unit = !struct.at4 = value
    def cx1 : CShort = struct._5
    def cx1_=(value: CShort): Unit = !struct.at5 = value
    def cy1 : CShort = struct._6
    def cy1_=(value: CShort): Unit = !struct.at6 = value
    def `type` : CUnsignedChar = struct._7
    def type_=(value: CUnsignedChar): Unit = !struct.at7 = value
    def padding : CUnsignedChar = struct._8
    def padding_=(value: CUnsignedChar): Unit = !struct.at8 = value