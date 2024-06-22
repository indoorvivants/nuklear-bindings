package nuklear

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_handle = CArray[Byte, Nat._8]
object nk_handle:
  given _tag: Tag[nk_handle] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[nk_handle] = 
    val ___ptr = alloc[nk_handle](1)
    ___ptr
  @scala.annotation.targetName("apply_ptr")
  def apply(ptr: Ptr[Byte])(using Zone): Ptr[nk_handle] =
    val ___ptr = alloc[nk_handle](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, ptr)
    ___ptr
  @scala.annotation.targetName("apply_id")
  def apply(id: CInt)(using Zone): Ptr[nk_handle] =
    val ___ptr = alloc[nk_handle](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CInt]].update(0, id)
    ___ptr
  extension (struct: nk_handle)
    def ptr : Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
    def ptr_=(value: Ptr[Byte]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
    def id : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def id_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_page_data = CArray[Byte, Nat.Digit3[Nat._5, Nat._0, Nat._4]]
object nk_page_data:
  given _tag: Tag[nk_page_data] = Tag.CArray[CChar, Nat.Digit3[Nat._5, Nat._0, Nat._4]](Tag.Byte, Tag.Digit3[Nat._5, Nat._0, Nat._4](Tag.Nat5, Tag.Nat0, Tag.Nat4))
  def apply()(using Zone): Ptr[nk_page_data] = 
    val ___ptr = alloc[nk_page_data](1)
    ___ptr
  @scala.annotation.targetName("apply_tbl")
  def apply(tbl: nk_table)(using Zone): Ptr[nk_page_data] =
    val ___ptr = alloc[nk_page_data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[nk_table]].update(0, tbl)
    ___ptr
  @scala.annotation.targetName("apply_pan")
  def apply(pan: nk_panel)(using Zone): Ptr[nk_page_data] =
    val ___ptr = alloc[nk_page_data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[nk_panel]].update(0, pan)
    ___ptr
  @scala.annotation.targetName("apply_win")
  def apply(win: nk_window)(using Zone): Ptr[nk_page_data] =
    val ___ptr = alloc[nk_page_data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[nk_window]].update(0, win)
    ___ptr
  extension (struct: nk_page_data)
    def tbl : nk_table = !struct.at(0).asInstanceOf[Ptr[nk_table]]
    def tbl_=(value: nk_table): Unit = !struct.at(0).asInstanceOf[Ptr[nk_table]] = value
    def pan : nk_panel = !struct.at(0).asInstanceOf[Ptr[nk_panel]]
    def pan_=(value: nk_panel): Unit = !struct.at(0).asInstanceOf[Ptr[nk_panel]] = value
    def win : nk_window = !struct.at(0).asInstanceOf[Ptr[nk_window]]
    def win_=(value: nk_window): Unit = !struct.at(0).asInstanceOf[Ptr[nk_window]] = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_property = CArray[Byte, Nat._8]
object nk_property:
  given _tag: Tag[nk_property] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  def apply()(using Zone): Ptr[nk_property] = 
    val ___ptr = alloc[nk_property](1)
    ___ptr
  @scala.annotation.targetName("apply_i")
  def apply(i: CInt)(using Zone): Ptr[nk_property] =
    val ___ptr = alloc[nk_property](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CInt]].update(0, i)
    ___ptr
  @scala.annotation.targetName("apply_f")
  def apply(f: Float)(using Zone): Ptr[nk_property] =
    val ___ptr = alloc[nk_property](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Float]].update(0, f)
    ___ptr
  @scala.annotation.targetName("apply_d")
  def apply(d: Double)(using Zone): Ptr[nk_property] =
    val ___ptr = alloc[nk_property](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Double]].update(0, d)
    ___ptr
  extension (struct: nk_property)
    def i : CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
    def i_=(value: CInt): Unit = !struct.at(0).asInstanceOf[Ptr[CInt]] = value
    def f : Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    def f_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    def d : Double = !struct.at(0).asInstanceOf[Ptr[Double]]
    def d_=(value: Double): Unit = !struct.at(0).asInstanceOf[Ptr[Double]] = value

/**
 * [bindgen] header: /Users/velvetbaldmime/projects/nuklear-bindings/src/main/resources/scala-native/nuklear.h
*/
opaque type nk_style_item_data = CArray[Byte, Nat.Digit2[Nat._2, Nat._8]]
object nk_style_item_data:
  given _tag: Tag[nk_style_item_data] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._8]](Tag.Byte, Tag.Digit2[Nat._2, Nat._8](Tag.Nat2, Tag.Nat8))
  def apply()(using Zone): Ptr[nk_style_item_data] = 
    val ___ptr = alloc[nk_style_item_data](1)
    ___ptr
  @scala.annotation.targetName("apply_color")
  def apply(color: nk_color)(using Zone): Ptr[nk_style_item_data] =
    val ___ptr = alloc[nk_style_item_data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[nk_color]].update(0, color)
    ___ptr
  @scala.annotation.targetName("apply_image")
  def apply(image: nk_image)(using Zone): Ptr[nk_style_item_data] =
    val ___ptr = alloc[nk_style_item_data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[nk_image]].update(0, image)
    ___ptr
  @scala.annotation.targetName("apply_slice")
  def apply(slice: nk_nine_slice)(using Zone): Ptr[nk_style_item_data] =
    val ___ptr = alloc[nk_style_item_data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[nk_nine_slice]].update(0, slice)
    ___ptr
  extension (struct: nk_style_item_data)
    def color : nk_color = !struct.at(0).asInstanceOf[Ptr[nk_color]]
    def color_=(value: nk_color): Unit = !struct.at(0).asInstanceOf[Ptr[nk_color]] = value
    def image : nk_image = !struct.at(0).asInstanceOf[Ptr[nk_image]]
    def image_=(value: nk_image): Unit = !struct.at(0).asInstanceOf[Ptr[nk_image]] = value
    def slice : nk_nine_slice = !struct.at(0).asInstanceOf[Ptr[nk_nine_slice]]
    def slice_=(value: nk_nine_slice): Unit = !struct.at(0).asInstanceOf[Ptr[nk_nine_slice]] = value