package nuklear

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*



@extern private[nuklear] def __sn_wrap_nuklear_nk_begin(ctx : Ptr[nk_context], title : CString, bounds : Ptr[nk_rect], flags : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_begin_titled(ctx : Ptr[nk_context], name : CString, title : CString, bounds : Ptr[nk_rect], flags : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_button_behavior(state : Ptr[nk_flags], r : Ptr[nk_rect], i : Ptr[nk_input], behavior : nk_button_behavior): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_button_color(ctx : Ptr[nk_context], color : Ptr[nk_color]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_button_image(ctx : Ptr[nk_context], img : Ptr[nk_image]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_button_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], label : CString, align : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_button_image_label_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : Ptr[nk_image], label : CString, text_alignment : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_button_image_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : Ptr[nk_image]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_button_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_button_image_text_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : Ptr[nk_image], text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_chart_add_slot_colored(ctx : Ptr[nk_context], `type` : nk_chart_type, color : Ptr[nk_color], highlight : Ptr[nk_color], count : CInt, min_value : Float, max_value : Float): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_chart_begin_colored(ctx : Ptr[nk_context], `type` : nk_chart_type, color : Ptr[nk_color], highlight : Ptr[nk_color], count : CInt, min_value : Float, max_value : Float): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_cf(in : Ptr[nk_color], __return : Ptr[nk_colorf]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_d(r : Ptr[Double], g : Ptr[Double], b : Ptr[Double], a : Ptr[Double], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_dv(c : Ptr[Double], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_f(r : Ptr[Float], g : Ptr[Float], b : Ptr[Float], a : Ptr[Float], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_fv(c : Ptr[Float], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hex_rgb(output : CString, col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hex_rgba(output : CString, col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsv_b(out_h : Ptr[nk_byte], out_s : Ptr[nk_byte], out_v : Ptr[nk_byte], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsv_bv(out : Ptr[nk_byte], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsv_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsv_fv(out : Ptr[Float], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsv_i(out_h : Ptr[CInt], out_s : Ptr[CInt], out_v : Ptr[CInt], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsv_iv(out : Ptr[CInt], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsva_b(h : Ptr[nk_byte], s : Ptr[nk_byte], v : Ptr[nk_byte], a : Ptr[nk_byte], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsva_bv(out : Ptr[nk_byte], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsva_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], out_a : Ptr[Float], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsva_fv(out : Ptr[Float], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsva_i(out_h : Ptr[CInt], out_s : Ptr[CInt], out_v : Ptr[CInt], out_a : Ptr[CInt], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_hsva_iv(out : Ptr[CInt], in : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_picker(ctx : Ptr[nk_context], color : Ptr[nk_colorf], fmt : nk_color_format, __return : Ptr[nk_colorf]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_color_u32(in : Ptr[nk_color]): nk_uint = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_colorf_hsva_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], out_a : Ptr[Float], in : Ptr[nk_colorf]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_colorf_hsva_fv(hsva : Ptr[Float], in : Ptr[nk_colorf]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo(ctx : Ptr[nk_context], items : Ptr[CString], count : CInt, selected : CInt, item_height : CInt, size : Ptr[nk_vec2]): CInt = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin(ctx : Ptr[nk_context], win : Ptr[nk_window], size : Ptr[nk_vec2], is_clicked : nk_bool, header : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_color(ctx : Ptr[nk_context], color : Ptr[nk_color], size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_image(ctx : Ptr[nk_context], img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_image_label(ctx : Ptr[nk_context], selected : CString, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_image_text(ctx : Ptr[nk_context], selected : CString, len : CInt, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_label(ctx : Ptr[nk_context], selected : CString, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_symbol(ctx : Ptr[nk_context], symbol : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_symbol_label(ctx : Ptr[nk_context], selected : CString, `type` : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_symbol_text(ctx : Ptr[nk_context], selected : CString, len : CInt, symbol : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_begin_text(ctx : Ptr[nk_context], selected : CString, len : CInt, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_callback(ctx : Ptr[nk_context], item_getter : CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit], userdata : Ptr[Byte], selected : CInt, count : CInt, item_height : CInt, size : Ptr[nk_vec2]): CInt = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_item_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, alignment : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_item_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, len : CInt, alignment : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_separator(ctx : Ptr[nk_context], items_separated_by_separator : CString, separator : CInt, selected : CInt, count : CInt, item_height : CInt, size : Ptr[nk_vec2]): CInt = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combo_string(ctx : Ptr[nk_context], items_separated_by_zeros : CString, selected : CInt, count : CInt, item_height : CInt, size : Ptr[nk_vec2]): CInt = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combobox(ctx : Ptr[nk_context], items : Ptr[CString], count : CInt, selected : Ptr[CInt], item_height : CInt, size : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combobox_callback(ctx : Ptr[nk_context], item_getter : CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit], userdata : Ptr[Byte], selected : Ptr[CInt], count : CInt, item_height : CInt, size : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combobox_separator(ctx : Ptr[nk_context], items_separated_by_separator : CString, separator : CInt, selected : Ptr[CInt], count : CInt, item_height : CInt, size : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_combobox_string(ctx : Ptr[nk_context], items_separated_by_zeros : CString, selected : Ptr[CInt], count : CInt, item_height : CInt, size : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_contextual_begin(ctx : Ptr[nk_context], flags : nk_flags, size : Ptr[nk_vec2], trigger_bounds : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_contextual_item_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], label : CString, align : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_contextual_item_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_button(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], r : Ptr[nk_rect], style : Ptr[nk_style_button], in : Ptr[nk_input], behavior : nk_button_behavior, content : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_button_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], img : Ptr[nk_image], b : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_button_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], symbol : nk_symbol_type, behavior : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_button_text(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], string : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_button_text_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], img : Ptr[nk_image], str : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], font : Ptr[nk_user_font], in : Ptr[nk_input]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_button_text_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], symbol : nk_symbol_type, str : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], font : Ptr[nk_user_font], in : Ptr[nk_input]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_color_picker(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], col : Ptr[nk_colorf], fmt : nk_color_format, bounds : Ptr[nk_rect], padding : Ptr[nk_vec2], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_edit(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], flags : nk_flags, filter : nk_plugin_filter, edit : Ptr[nk_text_edit], style : Ptr[nk_style_edit], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_flags = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_progress(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], value : nk_size, max : nk_size, modifiable : nk_bool, style : Ptr[nk_style_progress], in : Ptr[nk_input]): nk_size = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_property(ws : Ptr[nk_flags], out : Ptr[nk_command_buffer], property : Ptr[nk_rect], name : CString, variant : Ptr[nk_property_variant], inc_per_pixel : Float, buffer : CString, len : Ptr[CInt], state : Ptr[CInt], cursor : Ptr[CInt], select_begin : Ptr[CInt], select_end : Ptr[CInt], style : Ptr[nk_style_property], filter : nk_property_filter, in : Ptr[nk_input], font : Ptr[nk_user_font], text_edit : Ptr[nk_text_edit], behavior : nk_button_behavior): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_scrollbarh(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], scroll : Ptr[nk_rect], has_scrolling : CInt, offset : Float, target : Float, step : Float, button_pixel_inc : Float, style : Ptr[nk_style_scrollbar], in : Ptr[nk_input], font : Ptr[nk_user_font]): Float = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_scrollbarv(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], scroll : Ptr[nk_rect], has_scrolling : CInt, offset : Float, target : Float, step : Float, button_pixel_inc : Float, style : Ptr[nk_style_scrollbar], in : Ptr[nk_input], font : Ptr[nk_user_font]): Float = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_selectable(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_selectable_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], img : Ptr[nk_image], style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_selectable_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], sym : nk_symbol_type, style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_slider(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], min : Float, `val` : Float, max : Float, step : Float, style : Ptr[nk_style_slider], in : Ptr[nk_input], font : Ptr[nk_user_font]): Float = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_do_toggle(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], r : Ptr[nk_rect], active : Ptr[nk_bool], str : CString, len : CInt, `type` : nk_toggle_type, style : Ptr[nk_style_toggle], in : Ptr[nk_input], font : Ptr[nk_user_font], widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_drag_behavior(state : Ptr[nk_flags], in : Ptr[nk_input], drag : Ptr[nk_rect], variant : Ptr[nk_property_variant], inc_per_pixel : Float): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_draw_color_picker(o : Ptr[nk_command_buffer], matrix : Ptr[nk_rect], hue_bar : Ptr[nk_rect], alpha_bar : Ptr[nk_rect], col : Ptr[nk_colorf]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_draw_image(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], img : Ptr[nk_image], col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_draw_nine_slice(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], slc : Ptr[nk_nine_slice], col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_draw_symbol(out : Ptr[nk_command_buffer], `type` : nk_symbol_type, content : Ptr[nk_rect], background : Ptr[nk_color], foreground : Ptr[nk_color], border_width : Float, font : Ptr[nk_user_font]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_draw_text(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], string : CString, length : CInt, font : Ptr[nk_user_font], bg : Ptr[nk_color], fg : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_edit_draw_text(out : Ptr[nk_command_buffer], style : Ptr[nk_style_edit], pos_x : Float, pos_y : Float, x_offset : Float, text : CString, byte_len : CInt, row_height : Float, font : Ptr[nk_user_font], background : Ptr[nk_color], foreground : Ptr[nk_color], is_selected : nk_bool): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_fill_arc(b : Ptr[nk_command_buffer], cx : Float, cy : Float, radius : Float, a_min : Float, a_max : Float, c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_fill_circle(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_fill_polygon(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_fill_rect(b : Ptr[nk_command_buffer], rect : Ptr[nk_rect], rounding : Float, c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_fill_rect_multi_color(b : Ptr[nk_command_buffer], rect : Ptr[nk_rect], left : Ptr[nk_color], top : Ptr[nk_color], right : Ptr[nk_color], bottom : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_fill_triangle(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, x2 : Float, y2 : Float, c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_get_null_rect(__return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsv(h : CInt, s : CInt, v : CInt, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsv_bv(c : Ptr[nk_byte], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsv_f(h : Float, s : Float, v : Float, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsv_fv(c : Ptr[Float], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsv_iv(c : Ptr[CInt], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsva(h : CInt, s : CInt, v : CInt, a : CInt, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsva_bv(c : Ptr[nk_byte], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsva_colorf(h : Float, s : Float, v : Float, a : Float, __return : Ptr[nk_colorf]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsva_colorfv(c : Ptr[Float], __return : Ptr[nk_colorf]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsva_f(h : Float, s : Float, v : Float, a : Float, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsva_fv(c : Ptr[Float], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_hsva_iv(c : Ptr[CInt], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_image(ctx : Ptr[nk_context], img : Ptr[nk_image]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_image_color(ctx : Ptr[nk_context], img : Ptr[nk_image], col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_image_handle(handle : nk_handle, __return : Ptr[nk_image]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_image_id(id : CInt, __return : Ptr[nk_image]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_image_ptr(ptr : Ptr[Byte], __return : Ptr[nk_image]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_any_mouse_click_in_rect(in : Ptr[nk_input], b : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_has_mouse_click_down_in_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect], down : nk_bool): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_has_mouse_click_in_button_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_has_mouse_click_in_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_is_mouse_click_down_in_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect], down : nk_bool): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_is_mouse_click_in_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_is_mouse_hovering_rect(i : Ptr[nk_input], rect : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_is_mouse_prev_hovering_rect(i : Ptr[nk_input], rect : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_mouse_clicked(i : Ptr[nk_input], id : nk_buttons, rect : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_input_scroll(ctx : Ptr[nk_context], `val` : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_label_colored(ctx : Ptr[nk_context], str : CString, align : nk_flags, color : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_label_colored_wrap(ctx : Ptr[nk_context], str : CString, color : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_layout_space_bounds(ctx : Ptr[nk_context], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_layout_space_push(ctx : Ptr[nk_context], rect : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_layout_space_rect_to_local(ctx : Ptr[nk_context], ret : Ptr[nk_rect], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_layout_space_rect_to_screen(ctx : Ptr[nk_context], ret : Ptr[nk_rect], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_layout_space_to_local(ctx : Ptr[nk_context], ret : Ptr[nk_vec2], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_layout_space_to_screen(ctx : Ptr[nk_context], ret : Ptr[nk_vec2], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_layout_widget_bounds(ctx : Ptr[nk_context], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin(ctx : Ptr[nk_context], win : Ptr[nk_window], id : CString, is_clicked : CInt, header : Ptr[nk_rect], size : Ptr[nk_vec2]): CInt = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin_image(ctx : Ptr[nk_context], id : CString, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin_image_label(ctx : Ptr[nk_context], title : CString, align : nk_flags, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin_image_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin_label(ctx : Ptr[nk_context], text : CString, align : nk_flags, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin_symbol(ctx : Ptr[nk_context], id : CString, sym : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin_symbol_label(ctx : Ptr[nk_context], title : CString, align : nk_flags, sym : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin_symbol_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, sym : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_begin_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, size : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_item_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], label : CString, align : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_menu_item_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_nine_slice_handle(handle : nk_handle, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort, __return : Ptr[nk_nine_slice]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_nine_slice_id(id : CInt, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort, __return : Ptr[nk_nine_slice]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_nine_slice_ptr(ptr : Ptr[Byte], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort, __return : Ptr[nk_nine_slice]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_nonblock_begin(ctx : Ptr[nk_context], flags : nk_flags, body : Ptr[nk_rect], header : Ptr[nk_rect], panel_type : nk_panel_type): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_pad_rect(r : Ptr[nk_rect], pad : Ptr[nk_vec2], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_panel_get_border_color(style : Ptr[nk_style], `type` : nk_panel_type, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_panel_get_padding(style : Ptr[nk_style], `type` : nk_panel_type, __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_popup_begin(ctx : Ptr[nk_context], `type` : nk_popup_type, title : CString, flags : nk_flags, rect : Ptr[nk_rect]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_progress_behavior(state : Ptr[nk_flags], in : Ptr[nk_input], r : Ptr[nk_rect], cursor : Ptr[nk_rect], max : nk_size, value : nk_size, modifiable : nk_bool): nk_size = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_property_behavior(ws : Ptr[nk_flags], in : Ptr[nk_input], property : Ptr[nk_rect], label : Ptr[nk_rect], edit : Ptr[nk_rect], empty : Ptr[nk_rect], state : Ptr[CInt], variant : Ptr[nk_property_variant], inc_per_pixel : Float): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_property_variant_double(value : Double, min_value : Double, max_value : Double, step : Double, __return : Ptr[nk_property_variant]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_property_variant_float(value : Float, min_value : Float, max_value : Float, step : Float, __return : Ptr[nk_property_variant]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_property_variant_int(value : CInt, min_value : CInt, max_value : CInt, step : CInt, __return : Ptr[nk_property_variant]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_push_custom(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], cb : nk_command_custom_callback, usr : nk_handle): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_push_scissor(b : Ptr[nk_command_buffer], r : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rect(x : Float, y : Float, w : Float, h : Float, __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rect_pos(r : Ptr[nk_rect], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rect_size(r : Ptr[nk_rect], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_recta(pos : Ptr[nk_vec2], size : Ptr[nk_vec2], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_recti(x : CInt, y : CInt, w : CInt, h : CInt, __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rectiv(r : Ptr[CInt], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rectv(r : Ptr[Float], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgb(r : CInt, g : CInt, b : CInt, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgb_bv(c : Ptr[nk_byte], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgb_cf(c : Ptr[nk_colorf], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgb_f(r : Float, g : Float, b : Float, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgb_factor(col : Ptr[nk_color], factor : Float, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgb_fv(c : Ptr[Float], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgb_hex(rgb : CString, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgb_iv(c : Ptr[CInt], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgba(r : CInt, g : CInt, b : CInt, a : CInt, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgba_bv(c : Ptr[nk_byte], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgba_cf(c : Ptr[nk_colorf], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgba_f(r : Float, g : Float, b : Float, a : Float, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgba_fv(c : Ptr[Float], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgba_hex(rgb : CString, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgba_iv(c : Ptr[CInt], __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rgba_u32(in : nk_uint, __return : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_rule_horizontal(ctx : Ptr[nk_context], color : Ptr[nk_color], rounding : nk_bool): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_select_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], str : CString, align : nk_flags, value : nk_bool): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_select_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], str : CString, len : CInt, align : nk_flags, value : nk_bool): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_selectable_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], str : CString, align : nk_flags, value : Ptr[nk_bool]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_selectable_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_shrink_rect(r : Ptr[nk_rect], amount : Float, __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_slider_behavior(state : Ptr[nk_flags], logical_cursor : Ptr[nk_rect], visual_cursor : Ptr[nk_rect], in : Ptr[nk_input], bounds : Ptr[nk_rect], slider_min : Float, slider_max : Float, slider_value : Float, slider_step : Float, slider_steps : Float): Float = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_stroke_arc(b : Ptr[nk_command_buffer], cx : Float, cy : Float, radius : Float, a_min : Float, a_max : Float, line_thickness : Float, c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_stroke_circle(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], line_thickness : Float, c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_stroke_curve(b : Ptr[nk_command_buffer], ax : Float, ay : Float, ctrl0x : Float, ctrl0y : Float, ctrl1x : Float, ctrl1y : Float, bx : Float, by : Float, line_thickness : Float, col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_stroke_line(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, line_thickness : Float, c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_stroke_polygon(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, line_thickness : Float, col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_stroke_polyline(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, line_thickness : Float, col : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_stroke_rect(b : Ptr[nk_command_buffer], rect : Ptr[nk_rect], rounding : Float, line_thickness : Float, c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_stroke_triangle(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, x2 : Float, y2 : Float, line_thickness : Float, c : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_style_item_color(col : Ptr[nk_color], __return : Ptr[nk_style_item]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_style_item_hide(__return : Ptr[nk_style_item]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_style_item_image(img : Ptr[nk_image], __return : Ptr[nk_style_item]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_style_item_nine_slice(slice : Ptr[nk_nine_slice], __return : Ptr[nk_style_item]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_style_push_color(ctx : Ptr[nk_context], address : Ptr[nk_color], value : Ptr[nk_color]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_style_push_style_item(ctx : Ptr[nk_context], address : Ptr[nk_style_item], value : Ptr[nk_style_item]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_style_push_vec2(ctx : Ptr[nk_context], address : Ptr[nk_vec2], value : Ptr[nk_vec2]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_sub9slice_handle(handle : nk_handle, w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort, __return : Ptr[nk_nine_slice]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_sub9slice_id(id : CInt, w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort, __return : Ptr[nk_nine_slice]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_sub9slice_ptr(ptr : Ptr[Byte], w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort, __return : Ptr[nk_nine_slice]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_subimage_handle(handle : nk_handle, w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect], __return : Ptr[nk_image]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_subimage_id(id : CInt, w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect], __return : Ptr[nk_image]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_subimage_ptr(ptr : Ptr[Byte], w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect], __return : Ptr[nk_image]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_text_calculate_text_bounds(font : Ptr[nk_user_font], begin : CString, byte_len : CInt, row_height : Float, remaining : Ptr[CString], out_offset : Ptr[nk_vec2], glyphs : Ptr[CInt], op : CInt, __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_text_colored(ctx : Ptr[nk_context], str : CString, len : CInt, alignment : nk_flags, color : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_text_wrap_colored(ctx : Ptr[nk_context], str : CString, len : CInt, color : Ptr[nk_color]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_toggle_behavior(in : Ptr[nk_input], select : Ptr[nk_rect], state : Ptr[nk_flags], active : nk_bool): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_tree_element_image_push_hashed(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, initial_state : nk_collapse_states, selected : Ptr[nk_bool], hash : CString, len : CInt, seed : CInt): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_tree_image_push_hashed(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, initial_state : nk_collapse_states, hash : CString, len : CInt, seed : CInt): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_tree_state_image_push(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, state : Ptr[nk_collapse_states]): nk_bool = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_triangle_from_direction(result : Ptr[nk_vec2], r : Ptr[nk_rect], pad_x : Float, pad_y : Float, direction : nk_heading): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_vec2(x : Float, y : Float, __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_vec2i(x : CInt, y : CInt, __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_vec2iv(v : Ptr[CInt], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_vec2v(v : Ptr[Float], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_widget_bounds(ctx : Ptr[nk_context], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_widget_fitting(bounds : Ptr[nk_rect], ctx : Ptr[nk_context], item_padding : Ptr[nk_vec2]): nk_widget_layout_states = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_widget_position(ctx : Ptr[nk_context], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_widget_size(ctx : Ptr[nk_context], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_widget_text(o : Ptr[nk_command_buffer], b : Ptr[nk_rect], string : CString, len : CInt, t : Ptr[nk_text], a : nk_flags, f : Ptr[nk_user_font]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_widget_text_wrap(o : Ptr[nk_command_buffer], b : Ptr[nk_rect], string : CString, len : CInt, t : Ptr[nk_text], f : Ptr[nk_user_font]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_get_bounds(ctx : Ptr[nk_context], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_get_content_region(ctx : Ptr[nk_context], __return : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_get_content_region_max(ctx : Ptr[nk_context], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_get_content_region_min(ctx : Ptr[nk_context], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_get_content_region_size(ctx : Ptr[nk_context], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_get_position(ctx : Ptr[nk_context], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_get_size(ctx : Ptr[nk_context], __return : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_set_bounds(ctx : Ptr[nk_context], name : CString, bounds : Ptr[nk_rect]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_set_position(ctx : Ptr[nk_context], name : CString, pos : Ptr[nk_vec2]): Unit = extern

@extern private[nuklear] def __sn_wrap_nuklear_nk_window_set_size(ctx : Ptr[nk_context], name : CString, size : Ptr[nk_vec2]): Unit = extern

@extern def nk__begin(ctx : Ptr[nk_context]): Ptr[nk_command] = extern

@extern def nk__next(ctx : Ptr[nk_context], cmd : Ptr[nk_command]): Ptr[nk_command] = extern

@extern def nk_add_value(ctx : Ptr[nk_context], win : Ptr[nk_window], name : nk_hash, value : nk_uint): Ptr[nk_uint] = extern

@extern def nk_buffer_align(unaligned : Ptr[Byte], align : nk_size, alignment : Ptr[nk_size], `type` : nk_buffer_allocation_type): Ptr[Byte] = extern

@extern def nk_buffer_alloc(b : Ptr[nk_buffer], `type` : nk_buffer_allocation_type, size : nk_size, align : nk_size): Ptr[Byte] = extern

@extern def nk_buffer_clear(b : Ptr[nk_buffer]): Unit = extern

@extern def nk_buffer_free(b : Ptr[nk_buffer]): Unit = extern

@extern def nk_buffer_info(s : Ptr[nk_memory_status], b : Ptr[nk_buffer]): Unit = extern

@extern def nk_buffer_init(b : Ptr[nk_buffer], a : Ptr[nk_allocator], initial_size : nk_size): Unit = extern

@extern def nk_buffer_init_default(buffer : Ptr[nk_buffer]): Unit = extern

@extern def nk_buffer_init_fixed(b : Ptr[nk_buffer], m : Ptr[Byte], size : nk_size): Unit = extern

@extern def nk_buffer_mark(buffer : Ptr[nk_buffer], `type` : nk_buffer_allocation_type): Unit = extern

@extern def nk_buffer_memory(buffer : Ptr[nk_buffer]): Ptr[Byte] = extern

@extern def nk_buffer_memory_const(buffer : Ptr[nk_buffer]): Ptr[Byte] = extern

@extern def nk_buffer_push(b : Ptr[nk_buffer], `type` : nk_buffer_allocation_type, memory : Ptr[Byte], size : nk_size, align : nk_size): Unit = extern

@extern def nk_buffer_realloc(b : Ptr[nk_buffer], capacity : nk_size, size : Ptr[nk_size]): Ptr[Byte] = extern

@extern def nk_buffer_reset(buffer : Ptr[nk_buffer], `type` : nk_buffer_allocation_type): Unit = extern

@extern def nk_buffer_total(buffer : Ptr[nk_buffer]): nk_size = extern

@extern def nk_build(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_button_label(ctx : Ptr[nk_context], title : CString): nk_bool = extern

@extern def nk_button_label_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], title : CString): nk_bool = extern

@extern def nk_button_pop_behavior(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_button_push_behavior(ctx : Ptr[nk_context], behavior : nk_button_behavior): nk_bool = extern

@extern def nk_button_set_behavior(ctx : Ptr[nk_context], behavior : nk_button_behavior): Unit = extern

@extern def nk_button_symbol(ctx : Ptr[nk_context], symbol : nk_symbol_type): nk_bool = extern

@extern def nk_button_symbol_label(ctx : Ptr[nk_context], symbol : nk_symbol_type, label : CString, align : nk_flags): nk_bool = extern

@extern def nk_button_symbol_label_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], symbol : nk_symbol_type, title : CString, align : nk_flags): nk_bool = extern

@extern def nk_button_symbol_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], symbol : nk_symbol_type): nk_bool = extern

@extern def nk_button_symbol_text(ctx : Ptr[nk_context], symbol : nk_symbol_type, text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern def nk_button_symbol_text_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], symbol : nk_symbol_type, text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern def nk_button_text(ctx : Ptr[nk_context], title : CString, len : CInt): nk_bool = extern

@extern def nk_button_text_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], title : CString, len : CInt): nk_bool = extern

@extern def nk_chart_add_slot(ctx : Ptr[nk_context], `type` : nk_chart_type, count : CInt, min_value : Float, max_value : Float): Unit = extern

@extern def nk_chart_begin(ctx : Ptr[nk_context], `type` : nk_chart_type, count : CInt, min_value : Float, max_value : Float): nk_bool = extern

@extern def nk_chart_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_chart_push(ctx : Ptr[nk_context], value : Float): nk_flags = extern

@extern def nk_chart_push_column(ctx : Ptr[nk_context], win : Ptr[nk_window], chart : Ptr[nk_chart], value : Float, slot : CInt): nk_flags = extern

@extern def nk_chart_push_line(ctx : Ptr[nk_context], win : Ptr[nk_window], g : Ptr[nk_chart], value : Float, slot : CInt): nk_flags = extern

@extern def nk_chart_push_slot(ctx : Ptr[nk_context], value : Float, slot : CInt): nk_flags = extern

@extern def nk_check_flags_label(ctx : Ptr[nk_context], label : CString, flags : CUnsignedInt, value : CUnsignedInt): CUnsignedInt = extern

@extern def nk_check_flags_text(ctx : Ptr[nk_context], text : CString, len : CInt, flags : CUnsignedInt, value : CUnsignedInt): CUnsignedInt = extern

@extern def nk_check_label(ctx : Ptr[nk_context], label : CString, active : nk_bool): nk_bool = extern

@extern def nk_check_text(ctx : Ptr[nk_context], text : CString, len : CInt, active : nk_bool): nk_bool = extern

@extern def nk_check_text_align(ctx : Ptr[nk_context], text : CString, len : CInt, active : nk_bool, widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = extern

@extern def nk_checkbox_flags_label(ctx : Ptr[nk_context], label : CString, flags : Ptr[CUnsignedInt], value : CUnsignedInt): nk_bool = extern

@extern def nk_checkbox_flags_text(ctx : Ptr[nk_context], text : CString, len : CInt, flags : Ptr[CUnsignedInt], value : CUnsignedInt): nk_bool = extern

@extern def nk_checkbox_label(ctx : Ptr[nk_context], label : CString, active : Ptr[nk_bool]): nk_bool = extern

@extern def nk_checkbox_label_align(ctx : Ptr[nk_context], label : CString, active : Ptr[nk_bool], widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = extern

@extern def nk_checkbox_text(ctx : Ptr[nk_context], text : CString, len : CInt, active : Ptr[nk_bool]): nk_bool = extern

@extern def nk_checkbox_text_align(ctx : Ptr[nk_context], text : CString, len : CInt, active : Ptr[nk_bool], widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = extern

@extern def nk_clear(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_color_pick(ctx : Ptr[nk_context], color : Ptr[nk_colorf], fmt : nk_color_format): nk_bool = extern

@extern def nk_color_picker_behavior(state : Ptr[nk_flags], bounds : Ptr[nk_rect], matrix : Ptr[nk_rect], hue_bar : Ptr[nk_rect], alpha_bar : Ptr[nk_rect], color : Ptr[nk_colorf], in : Ptr[nk_input]): nk_bool = extern

@extern def nk_combo_close(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_combo_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_combo_item_label(ctx : Ptr[nk_context], label : CString, align : nk_flags): nk_bool = extern

@extern def nk_combo_item_symbol_label(ctx : Ptr[nk_context], sym : nk_symbol_type, label : CString, alignment : nk_flags): nk_bool = extern

@extern def nk_combo_item_symbol_text(ctx : Ptr[nk_context], sym : nk_symbol_type, text : CString, len : CInt, alignment : nk_flags): nk_bool = extern

@extern def nk_combo_item_text(ctx : Ptr[nk_context], text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern def nk_command_buffer_init(cb : Ptr[nk_command_buffer], b : Ptr[nk_buffer], clip : nk_command_clipping): Unit = extern

@extern def nk_command_buffer_push(b : Ptr[nk_command_buffer], t : nk_command_type, size : nk_size): Ptr[Byte] = extern

@extern def nk_command_buffer_reset(b : Ptr[nk_command_buffer]): Unit = extern

@extern def nk_contextual_close(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_contextual_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_contextual_item_label(ctx : Ptr[nk_context], label : CString, align : nk_flags): nk_bool = extern

@extern def nk_contextual_item_symbol_label(ctx : Ptr[nk_context], symbol : nk_symbol_type, text : CString, align : nk_flags): nk_bool = extern

@extern def nk_contextual_item_symbol_text(ctx : Ptr[nk_context], symbol : nk_symbol_type, text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern def nk_contextual_item_text(ctx : Ptr[nk_context], text : CString, len : CInt, alignment : nk_flags): nk_bool = extern

@extern def nk_cos(x : Float): Float = extern

@extern def nk_create_page_element(ctx : Ptr[nk_context]): Ptr[nk_page_element] = extern

@extern def nk_create_panel(ctx : Ptr[nk_context]): Ptr[Byte] = extern

@extern def nk_create_table(ctx : Ptr[nk_context]): Ptr[nk_table] = extern

@extern def nk_create_window(ctx : Ptr[nk_context]): Ptr[Byte] = extern

@extern def nk_draw_button(out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], state : nk_flags, style : Ptr[nk_style_button]): Ptr[nk_style_item] = extern

@extern def nk_draw_button_image(out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], content : Ptr[nk_rect], state : nk_flags, style : Ptr[nk_style_button], img : Ptr[nk_image]): Unit = extern

@extern def nk_draw_button_symbol(out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], content : Ptr[nk_rect], state : nk_flags, style : Ptr[nk_style_button], `type` : nk_symbol_type, font : Ptr[nk_user_font]): Unit = extern

@extern def nk_draw_button_text(out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], content : Ptr[nk_rect], state : nk_flags, style : Ptr[nk_style_button], txt : CString, len : CInt, text_alignment : nk_flags, font : Ptr[nk_user_font]): Unit = extern

@extern def nk_draw_button_text_image(out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], label : Ptr[nk_rect], image : Ptr[nk_rect], state : nk_flags, style : Ptr[nk_style_button], str : CString, len : CInt, font : Ptr[nk_user_font], img : Ptr[nk_image]): Unit = extern

@extern def nk_draw_button_text_symbol(out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], label : Ptr[nk_rect], symbol : Ptr[nk_rect], state : nk_flags, style : Ptr[nk_style_button], str : CString, len : CInt, `type` : nk_symbol_type, font : Ptr[nk_user_font]): Unit = extern

@extern def nk_draw_checkbox(out : Ptr[nk_command_buffer], state : nk_flags, style : Ptr[nk_style_toggle], active : nk_bool, label : Ptr[nk_rect], selector : Ptr[nk_rect], cursors : Ptr[nk_rect], string : CString, len : CInt, font : Ptr[nk_user_font], text_alignment : nk_flags): Unit = extern

@extern def nk_draw_option(out : Ptr[nk_command_buffer], state : nk_flags, style : Ptr[nk_style_toggle], active : nk_bool, label : Ptr[nk_rect], selector : Ptr[nk_rect], cursors : Ptr[nk_rect], string : CString, len : CInt, font : Ptr[nk_user_font], text_alignment : nk_flags): Unit = extern

@extern def nk_draw_progress(out : Ptr[nk_command_buffer], state : nk_flags, style : Ptr[nk_style_progress], bounds : Ptr[nk_rect], scursor : Ptr[nk_rect], value : nk_size, max : nk_size): Unit = extern

@extern def nk_draw_property(out : Ptr[nk_command_buffer], style : Ptr[nk_style_property], bounds : Ptr[nk_rect], label : Ptr[nk_rect], state : nk_flags, name : CString, len : CInt, font : Ptr[nk_user_font]): Unit = extern

@extern def nk_draw_scrollbar(out : Ptr[nk_command_buffer], state : nk_flags, style : Ptr[nk_style_scrollbar], bounds : Ptr[nk_rect], scroll : Ptr[nk_rect]): Unit = extern

@extern def nk_draw_selectable(out : Ptr[nk_command_buffer], state : nk_flags, style : Ptr[nk_style_selectable], active : nk_bool, bounds : Ptr[nk_rect], icon : Ptr[nk_rect], img : Ptr[nk_image], sym : nk_symbol_type, string : CString, len : CInt, align : nk_flags, font : Ptr[nk_user_font]): Unit = extern

@extern def nk_draw_slider(out : Ptr[nk_command_buffer], state : nk_flags, style : Ptr[nk_style_slider], bounds : Ptr[nk_rect], visual_cursor : Ptr[nk_rect], min : Float, value : Float, max : Float): Unit = extern

@extern def nk_dtoa(s : CString, n : Double): CString = extern

@extern def nk_edit_buffer(ctx : Ptr[nk_context], flags : nk_flags, edit : Ptr[nk_text_edit], filter : nk_plugin_filter): nk_flags = extern

@extern def nk_edit_focus(ctx : Ptr[nk_context], flags : nk_flags): Unit = extern

@extern def nk_edit_string(ctx : Ptr[nk_context], flags : nk_flags, memory : CString, len : Ptr[CInt], max : CInt, filter : nk_plugin_filter): nk_flags = extern

@extern def nk_edit_string_zero_terminated(ctx : Ptr[nk_context], flags : nk_flags, buffer : CString, max : CInt, filter : nk_plugin_filter): nk_flags = extern

@extern def nk_edit_unfocus(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_filter_ascii(box : Ptr[nk_text_edit], unicode : nk_rune): nk_bool = extern

@extern def nk_filter_binary(box : Ptr[nk_text_edit], unicode : nk_rune): nk_bool = extern

@extern def nk_filter_decimal(box : Ptr[nk_text_edit], unicode : nk_rune): nk_bool = extern

@extern def nk_filter_default(box : Ptr[nk_text_edit], unicode : nk_rune): nk_bool = extern

@extern def nk_filter_float(box : Ptr[nk_text_edit], unicode : nk_rune): nk_bool = extern

@extern def nk_filter_hex(box : Ptr[nk_text_edit], unicode : nk_rune): nk_bool = extern

@extern def nk_filter_oct(box : Ptr[nk_text_edit], unicode : nk_rune): nk_bool = extern

@extern def nk_find_value(win : Ptr[nk_window], name : nk_hash): Ptr[nk_uint] = extern

@extern def nk_find_window(ctx : Ptr[nk_context], hash : nk_hash, name : CString): Ptr[nk_window] = extern

@extern def nk_finish(ctx : Ptr[nk_context], win : Ptr[nk_window]): Unit = extern

@extern def nk_finish_buffer(ctx : Ptr[nk_context], buffer : Ptr[nk_command_buffer]): Unit = extern

@extern def nk_finish_popup(ctx : Ptr[nk_context], win : Ptr[nk_window]): Unit = extern

@extern def nk_free(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_free_page_element(ctx : Ptr[nk_context], elem : Ptr[nk_page_element]): Unit = extern

@extern def nk_free_panel(ctx : Ptr[nk_context], pan : Ptr[nk_panel]): Unit = extern

@extern def nk_free_table(ctx : Ptr[nk_context], tbl : Ptr[nk_table]): Unit = extern

@extern def nk_free_window(ctx : Ptr[nk_context], win : Ptr[nk_window]): Unit = extern

@extern def nk_group_begin(ctx : Ptr[nk_context], title : CString, flags : nk_flags): nk_bool = extern

@extern def nk_group_begin_titled(ctx : Ptr[nk_context], id : CString, title : CString, flags : nk_flags): nk_bool = extern

@extern def nk_group_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_group_get_scroll(ctx : Ptr[nk_context], id : CString, x_offset : Ptr[nk_uint], y_offset : Ptr[nk_uint]): Unit = extern

@extern def nk_group_scrolled_begin(ctx : Ptr[nk_context], scroll : Ptr[nk_scroll], title : CString, flags : nk_flags): nk_bool = extern

@extern def nk_group_scrolled_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_group_scrolled_offset_begin(ctx : Ptr[nk_context], x_offset : Ptr[nk_uint], y_offset : Ptr[nk_uint], title : CString, flags : nk_flags): nk_bool = extern

@extern def nk_group_set_scroll(ctx : Ptr[nk_context], id : CString, x_offset : nk_uint, y_offset : nk_uint): Unit = extern

@extern def nk_handle_id(id : CInt): nk_handle = extern

@extern def nk_handle_ptr(ptr : Ptr[Byte]): nk_handle = extern

@extern def nk_iceilf(x : Float): CInt = extern

@extern def nk_ifloord(x : Double): CInt = extern

@extern def nk_ifloorf(x : Float): CInt = extern

@extern def nk_image_is_subimage(img : Ptr[nk_image]): nk_bool = extern

@extern def nk_init(ctx : Ptr[nk_context], alloc : Ptr[nk_allocator], font : Ptr[nk_user_font]): nk_bool = extern

@extern def nk_init_custom(ctx : Ptr[nk_context], cmds : Ptr[nk_buffer], pool : Ptr[nk_buffer], font : Ptr[nk_user_font]): nk_bool = extern

@extern def nk_init_default(ctx : Ptr[nk_context], font : Ptr[nk_user_font]): nk_bool = extern

@extern def nk_init_fixed(ctx : Ptr[nk_context], memory : Ptr[Byte], size : nk_size, font : Ptr[nk_user_font]): nk_bool = extern

@extern def nk_input_begin(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_input_button(ctx : Ptr[nk_context], id : nk_buttons, x : CInt, y : CInt, down : nk_bool): Unit = extern

@extern def nk_input_char(ctx : Ptr[nk_context], c : CChar): Unit = extern

@extern def nk_input_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_input_glyph(ctx : Ptr[nk_context], glyph : nk_glyph): Unit = extern

@extern def nk_input_has_mouse_click(i : Ptr[nk_input], id : nk_buttons): nk_bool = extern

@extern def nk_input_is_key_down(i : Ptr[nk_input], key : nk_keys): nk_bool = extern

@extern def nk_input_is_key_pressed(i : Ptr[nk_input], key : nk_keys): nk_bool = extern

@extern def nk_input_is_key_released(i : Ptr[nk_input], key : nk_keys): nk_bool = extern

@extern def nk_input_is_mouse_down(i : Ptr[nk_input], id : nk_buttons): nk_bool = extern

@extern def nk_input_is_mouse_pressed(i : Ptr[nk_input], id : nk_buttons): nk_bool = extern

@extern def nk_input_is_mouse_released(i : Ptr[nk_input], id : nk_buttons): nk_bool = extern

@extern def nk_input_key(ctx : Ptr[nk_context], key : nk_keys, down : nk_bool): Unit = extern

@extern def nk_input_motion(ctx : Ptr[nk_context], x : CInt, y : CInt): Unit = extern

@extern def nk_input_unicode(ctx : Ptr[nk_context], unicode : nk_rune): Unit = extern

@extern def nk_insert_window(ctx : Ptr[nk_context], win : Ptr[nk_window], loc : nk_window_insert_location): Unit = extern

@extern def nk_inv_sqrt(n : Float): Float = extern

@extern def nk_is_lower(c : CInt): nk_bool = extern

@extern def nk_is_upper(c : CInt): nk_bool = extern

@extern def nk_is_word_boundary(state : Ptr[nk_text_edit], idx : CInt): CInt = extern

@extern def nk_item_is_any_active(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_itoa(s : CString, n : CLongInt): CString = extern

@extern def nk_label(ctx : Ptr[nk_context], str : CString, alignment : nk_flags): Unit = extern

@extern def nk_label_wrap(ctx : Ptr[nk_context], str : CString): Unit = extern

@extern def nk_layout_peek(bounds : Ptr[nk_rect], ctx : Ptr[nk_context]): Unit = extern

@extern def nk_layout_ratio_from_pixel(ctx : Ptr[nk_context], pixel_width : Float): Float = extern

@extern def nk_layout_reset_min_row_height(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_layout_row(ctx : Ptr[nk_context], fmt : nk_layout_format, height : Float, cols : CInt, ratio : Ptr[Float]): Unit = extern

@extern def nk_layout_row_begin(ctx : Ptr[nk_context], fmt : nk_layout_format, row_height : Float, cols : CInt): Unit = extern

@extern def nk_layout_row_calculate_usable_space(style : Ptr[nk_style], `type` : nk_panel_type, total_space : Float, columns : CInt): Float = extern

@extern def nk_layout_row_dynamic(ctx : Ptr[nk_context], height : Float, cols : CInt): Unit = extern

@extern def nk_layout_row_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_layout_row_push(ctx : Ptr[nk_context], ratio_or_width : Float): Unit = extern

@extern def nk_layout_row_static(ctx : Ptr[nk_context], height : Float, item_width : CInt, cols : CInt): Unit = extern

@extern def nk_layout_row_template_begin(ctx : Ptr[nk_context], height : Float): Unit = extern

@extern def nk_layout_row_template_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_layout_row_template_push_dynamic(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_layout_row_template_push_static(ctx : Ptr[nk_context], width : Float): Unit = extern

@extern def nk_layout_row_template_push_variable(ctx : Ptr[nk_context], min_width : Float): Unit = extern

@extern def nk_layout_set_min_row_height(ctx : Ptr[nk_context], height : Float): Unit = extern

@extern def nk_layout_space_begin(ctx : Ptr[nk_context], fmt : nk_layout_format, height : Float, widget_count : CInt): Unit = extern

@extern def nk_layout_space_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_layout_widget_space(bounds : Ptr[nk_rect], ctx : Ptr[nk_context], win : Ptr[nk_window], modify : CInt): Unit = extern

@extern def nk_link_page_element_into_freelist(ctx : Ptr[nk_context], elem : Ptr[nk_page_element]): Unit = extern

@extern def nk_list_view_begin(ctx : Ptr[nk_context], view : Ptr[nk_list_view], title : CString, flags : nk_flags, row_height : CInt, row_count : CInt): nk_bool = extern

@extern def nk_list_view_end(view : Ptr[nk_list_view]): Unit = extern

@extern def nk_log10(n : Double): CInt = extern

@extern def nk_malloc(unused : nk_handle, old : Ptr[Byte], size : nk_size): Ptr[Byte] = extern

@extern def nk_memcopy(dst0 : Ptr[Byte], src0 : Ptr[Byte], length : nk_size): Ptr[Byte] = extern

@extern def nk_memset(ptr : Ptr[Byte], c0 : CInt, size : nk_size): Unit = extern

@extern def nk_menu_close(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_menu_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_menu_item_label(ctx : Ptr[nk_context], label : CString, align : nk_flags): nk_bool = extern

@extern def nk_menu_item_symbol_label(ctx : Ptr[nk_context], sym : nk_symbol_type, label : CString, align : nk_flags): nk_bool = extern

@extern def nk_menu_item_symbol_text(ctx : Ptr[nk_context], sym : nk_symbol_type, text : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern def nk_menu_item_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags): nk_bool = extern

@extern def nk_menubar_begin(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_menubar_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_mfree(unused : nk_handle, ptr : Ptr[Byte]): Unit = extern

@extern def nk_murmur_hash(key : Ptr[Byte], len : CInt, seed : nk_hash): nk_hash = extern

@extern def nk_nine_slice_is_sub9slice(slice : Ptr[nk_nine_slice]): CInt = extern

@extern def nk_option_label(ctx : Ptr[nk_context], label : CString, active : nk_bool): nk_bool = extern

@extern def nk_option_label_align(ctx : Ptr[nk_context], label : CString, active : nk_bool, widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = extern

@extern def nk_option_text(ctx : Ptr[nk_context], text : CString, len : CInt, is_active : nk_bool): nk_bool = extern

@extern def nk_option_text_align(ctx : Ptr[nk_context], text : CString, len : CInt, is_active : nk_bool, widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = extern

@extern def nk_panel_alloc_row(ctx : Ptr[nk_context], win : Ptr[nk_window]): Unit = extern

@extern def nk_panel_alloc_space(bounds : Ptr[nk_rect], ctx : Ptr[nk_context]): Unit = extern

@extern def nk_panel_begin(ctx : Ptr[nk_context], title : CString, panel_type : nk_panel_type): nk_bool = extern

@extern def nk_panel_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_panel_get_border(style : Ptr[nk_style], flags : nk_flags, `type` : nk_panel_type): Float = extern

@extern def nk_panel_has_header(flags : nk_flags, title : CString): nk_bool = extern

@extern def nk_panel_is_nonblock(`type` : nk_panel_type): nk_bool = extern

@extern def nk_panel_is_sub(`type` : nk_panel_type): nk_bool = extern

@extern def nk_panel_layout(ctx : Ptr[nk_context], win : Ptr[nk_window], height : Float, cols : CInt): Unit = extern

@extern def nk_parse_hex(p : CString, length : CInt): CInt = extern

@extern def nk_plot(ctx : Ptr[nk_context], `type` : nk_chart_type, values : Ptr[Float], count : CInt, offset : CInt): Unit = extern

@extern def nk_plot_function(ctx : Ptr[nk_context], `type` : nk_chart_type, userdata : Ptr[Byte], value_getter : CFuncPtr2[Ptr[Byte], CInt, Float], count : CInt, offset : CInt): Unit = extern

@extern def nk_pool_alloc(pool : Ptr[nk_pool]): Ptr[nk_page_element] = extern

@extern def nk_pool_free(pool : Ptr[nk_pool]): Unit = extern

@extern def nk_pool_init(pool : Ptr[nk_pool], alloc : Ptr[nk_allocator], capacity : CUnsignedInt): Unit = extern

@extern def nk_pool_init_fixed(pool : Ptr[nk_pool], memory : Ptr[Byte], size : nk_size): Unit = extern

@extern def nk_popup_close(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_popup_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_popup_get_scroll(ctx : Ptr[nk_context], offset_x : Ptr[nk_uint], offset_y : Ptr[nk_uint]): Unit = extern

@extern def nk_popup_set_scroll(ctx : Ptr[nk_context], offset_x : nk_uint, offset_y : nk_uint): Unit = extern

@extern def nk_pow(x : Double, n : CInt): Double = extern

@extern def nk_prog(ctx : Ptr[nk_context], cur : nk_size, max : nk_size, modifyable : nk_bool): nk_size = extern

@extern def nk_progress(ctx : Ptr[nk_context], cur : Ptr[nk_size], max : nk_size, is_modifyable : nk_bool): nk_bool = extern

@extern def nk_property(ctx : Ptr[nk_context], name : CString, variant : Ptr[nk_property_variant], inc_per_pixel : Float, filter : nk_property_filter): Unit = extern

@extern def nk_property_double(ctx : Ptr[nk_context], name : CString, min : Double, `val` : Ptr[Double], max : Double, step : Double, inc_per_pixel : Float): Unit = extern

@extern def nk_property_float(ctx : Ptr[nk_context], name : CString, min : Float, `val` : Ptr[Float], max : Float, step : Float, inc_per_pixel : Float): Unit = extern

@extern def nk_property_int(ctx : Ptr[nk_context], name : CString, min : CInt, `val` : Ptr[CInt], max : CInt, step : CInt, inc_per_pixel : Float): Unit = extern

@extern def nk_propertyd(ctx : Ptr[nk_context], name : CString, min : Double, `val` : Double, max : Double, step : Double, inc_per_pixel : Float): Double = extern

@extern def nk_propertyf(ctx : Ptr[nk_context], name : CString, min : Float, `val` : Float, max : Float, step : Float, inc_per_pixel : Float): Float = extern

@extern def nk_propertyi(ctx : Ptr[nk_context], name : CString, min : CInt, `val` : CInt, max : CInt, step : CInt, inc_per_pixel : Float): CInt = extern

@extern def nk_push_table(win : Ptr[nk_window], tbl : Ptr[nk_table]): Unit = extern

@extern def nk_radio_label(ctx : Ptr[nk_context], label : CString, active : Ptr[nk_bool]): nk_bool = extern

@extern def nk_radio_label_align(ctx : Ptr[nk_context], label : CString, active : Ptr[nk_bool], widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = extern

@extern def nk_radio_text(ctx : Ptr[nk_context], text : CString, len : CInt, active : Ptr[nk_bool]): nk_bool = extern

@extern def nk_radio_text_align(ctx : Ptr[nk_context], text : CString, len : CInt, active : Ptr[nk_bool], widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = extern

@extern def nk_remove_table(win : Ptr[nk_window], tbl : Ptr[nk_table]): Unit = extern

@extern def nk_remove_window(ctx : Ptr[nk_context], win : Ptr[nk_window]): Unit = extern

@extern def nk_round_up_pow2(v : nk_uint): nk_uint = extern

@extern def nk_row_layout(ctx : Ptr[nk_context], fmt : nk_layout_format, height : Float, cols : CInt, width : CInt): Unit = extern

@extern def nk_scrollbar_behavior(state : Ptr[nk_flags], in : Ptr[nk_input], has_scrolling : CInt, scroll : Ptr[nk_rect], cursor : Ptr[nk_rect], empty0 : Ptr[nk_rect], empty1 : Ptr[nk_rect], scroll_offset : Float, target : Float, scroll_step : Float, o : nk_orientation): Float = extern

@extern def nk_select_label(ctx : Ptr[nk_context], str : CString, align : nk_flags, value : nk_bool): nk_bool = extern

@extern def nk_select_symbol_label(ctx : Ptr[nk_context], sym : nk_symbol_type, title : CString, align : nk_flags, value : nk_bool): nk_bool = extern

@extern def nk_select_symbol_text(ctx : Ptr[nk_context], sym : nk_symbol_type, title : CString, title_len : CInt, align : nk_flags, value : nk_bool): nk_bool = extern

@extern def nk_select_text(ctx : Ptr[nk_context], str : CString, len : CInt, align : nk_flags, value : nk_bool): nk_bool = extern

@extern def nk_selectable_label(ctx : Ptr[nk_context], str : CString, align : nk_flags, value : Ptr[nk_bool]): nk_bool = extern

@extern def nk_selectable_symbol_label(ctx : Ptr[nk_context], sym : nk_symbol_type, title : CString, align : nk_flags, value : Ptr[nk_bool]): nk_bool = extern

@extern def nk_selectable_symbol_text(ctx : Ptr[nk_context], sym : nk_symbol_type, str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool]): nk_bool = extern

@extern def nk_selectable_text(ctx : Ptr[nk_context], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool]): nk_bool = extern

@extern def nk_setup(ctx : Ptr[nk_context], font : Ptr[nk_user_font]): Unit = extern

@extern def nk_sin(x : Float): Float = extern

@extern def nk_slide_float(ctx : Ptr[nk_context], min : Float, `val` : Float, max : Float, step : Float): Float = extern

@extern def nk_slide_int(ctx : Ptr[nk_context], min : CInt, `val` : CInt, max : CInt, step : CInt): CInt = extern

@extern def nk_slider_float(ctx : Ptr[nk_context], min_value : Float, value : Ptr[Float], max_value : Float, value_step : Float): nk_bool = extern

@extern def nk_slider_int(ctx : Ptr[nk_context], min : CInt, `val` : Ptr[CInt], max : CInt, step : CInt): nk_bool = extern

@extern def nk_spacer(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_spacing(ctx : Ptr[nk_context], cols : CInt): Unit = extern

@extern def nk_start(ctx : Ptr[nk_context], win : Ptr[nk_window]): Unit = extern

@extern def nk_start_buffer(ctx : Ptr[nk_context], buffer : Ptr[nk_command_buffer]): Unit = extern

@extern def nk_start_popup(ctx : Ptr[nk_context], win : Ptr[nk_window]): Unit = extern

@extern def nk_str_append_str_char(s : Ptr[nk_str], str : CString): CInt = extern

@extern def nk_str_append_str_runes(str : Ptr[nk_str], runes : Ptr[nk_rune]): CInt = extern

@extern def nk_str_append_str_utf8(str : Ptr[nk_str], text : CString): CInt = extern

@extern def nk_str_append_text_char(s : Ptr[nk_str], str : CString, len : CInt): CInt = extern

@extern def nk_str_append_text_runes(str : Ptr[nk_str], text : Ptr[nk_rune], len : CInt): CInt = extern

@extern def nk_str_append_text_utf8(str : Ptr[nk_str], text : CString, len : CInt): CInt = extern

@extern def nk_str_at_char(s : Ptr[nk_str], pos : CInt): CString = extern

@extern def nk_str_at_char_const(s : Ptr[nk_str], pos : CInt): CString = extern

@extern def nk_str_at_const(str : Ptr[nk_str], pos : CInt, unicode : Ptr[nk_rune], len : Ptr[CInt]): CString = extern

@extern def nk_str_at_rune(str : Ptr[nk_str], pos : CInt, unicode : Ptr[nk_rune], len : Ptr[CInt]): CString = extern

@extern def nk_str_clear(str : Ptr[nk_str]): Unit = extern

@extern def nk_str_delete_chars(s : Ptr[nk_str], pos : CInt, len : CInt): Unit = extern

@extern def nk_str_delete_runes(s : Ptr[nk_str], pos : CInt, len : CInt): Unit = extern

@extern def nk_str_free(str : Ptr[nk_str]): Unit = extern

@extern def nk_str_get(s : Ptr[nk_str]): CString = extern

@extern def nk_str_get_const(s : Ptr[nk_str]): CString = extern

@extern def nk_str_init(str : Ptr[nk_str], alloc : Ptr[nk_allocator], size : nk_size): Unit = extern

@extern def nk_str_init_default(str : Ptr[nk_str]): Unit = extern

@extern def nk_str_init_fixed(str : Ptr[nk_str], memory : Ptr[Byte], size : nk_size): Unit = extern

@extern def nk_str_insert_at_char(s : Ptr[nk_str], pos : CInt, str : CString, len : CInt): CInt = extern

@extern def nk_str_insert_at_rune(str : Ptr[nk_str], pos : CInt, cstr : CString, len : CInt): CInt = extern

@extern def nk_str_insert_str_char(str : Ptr[nk_str], pos : CInt, text : CString): CInt = extern

@extern def nk_str_insert_str_runes(str : Ptr[nk_str], pos : CInt, runes : Ptr[nk_rune]): CInt = extern

@extern def nk_str_insert_str_utf8(str : Ptr[nk_str], pos : CInt, text : CString): CInt = extern

@extern def nk_str_insert_text_char(str : Ptr[nk_str], pos : CInt, text : CString, len : CInt): CInt = extern

@extern def nk_str_insert_text_runes(str : Ptr[nk_str], pos : CInt, runes : Ptr[nk_rune], len : CInt): CInt = extern

@extern def nk_str_insert_text_utf8(str : Ptr[nk_str], pos : CInt, text : CString, len : CInt): CInt = extern

@extern def nk_str_len(s : Ptr[nk_str]): CInt = extern

@extern def nk_str_len_char(s : Ptr[nk_str]): CInt = extern

@extern def nk_str_match_here(regexp : CString, text : CString): CInt = extern

@extern def nk_str_match_star(c : CInt, regexp : CString, text : CString): CInt = extern

@extern def nk_str_remove_chars(s : Ptr[nk_str], len : CInt): Unit = extern

@extern def nk_str_remove_runes(str : Ptr[nk_str], len : CInt): Unit = extern

@extern def nk_str_rune_at(str : Ptr[nk_str], pos : CInt): nk_rune = extern

@extern def nk_strfilter(text : CString, regexp : CString): CInt = extern

@extern def nk_stricmp(s1 : CString, s2 : CString): CInt = extern

@extern def nk_stricmpn(s1 : CString, s2 : CString, n : CInt): CInt = extern

@extern def nk_string_float_limit(string : CString, prec : CInt): CInt = extern

@extern def nk_strlen(str : CString): CInt = extern

@extern def nk_strmatch_fuzzy_string(str : CString, pattern : CString, out_score : Ptr[CInt]): CInt = extern

@extern def nk_strmatch_fuzzy_text(str : CString, str_len : CInt, pattern : CString, out_score : Ptr[CInt]): CInt = extern

@extern def nk_strrev_ascii(s : CString): Unit = extern

@extern def nk_strtod(str : CString, endptr : Ptr[CString]): Double = extern

@extern def nk_strtof(str : CString, endptr : Ptr[CString]): Float = extern

@extern def nk_strtoi(str : CString, endptr : Ptr[CString]): CInt = extern

@extern def nk_style_default(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_style_from_table(ctx : Ptr[nk_context], table : Ptr[nk_color]): Unit = extern

@extern def nk_style_get_color_by_name(c : nk_style_colors): CString = extern

@extern def nk_style_hide_cursor(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_style_load_all_cursors(ctx : Ptr[nk_context], cursors : Ptr[nk_cursor]): Unit = extern

@extern def nk_style_load_cursor(ctx : Ptr[nk_context], cursor : nk_style_cursor, c : Ptr[nk_cursor]): Unit = extern

@extern def nk_style_pop_color(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_style_pop_flags(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_style_pop_float(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_style_pop_font(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_style_pop_style_item(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_style_pop_vec2(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_style_push_flags(ctx : Ptr[nk_context], address : Ptr[nk_flags], value : nk_flags): nk_bool = extern

@extern def nk_style_push_float(ctx : Ptr[nk_context], address : Ptr[Float], value : Float): nk_bool = extern

@extern def nk_style_push_font(ctx : Ptr[nk_context], font : Ptr[nk_user_font]): nk_bool = extern

@extern def nk_style_set_cursor(ctx : Ptr[nk_context], c : nk_style_cursor): nk_bool = extern

@extern def nk_style_set_font(ctx : Ptr[nk_context], font : Ptr[nk_user_font]): Unit = extern

@extern def nk_style_show_cursor(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_text(ctx : Ptr[nk_context], str : CString, len : CInt, alignment : nk_flags): Unit = extern

@extern def nk_text_clamp(font : Ptr[nk_user_font], text : CString, text_len : CInt, space : Float, glyphs : Ptr[CInt], text_width : Ptr[Float], sep_list : Ptr[nk_rune], sep_count : CInt): CInt = extern

@extern def nk_text_wrap(ctx : Ptr[nk_context], str : CString, len : CInt): Unit = extern

@extern def nk_textedit_clamp(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_clear_state(state : Ptr[nk_text_edit], `type` : nk_text_edit_type, filter : nk_plugin_filter): Unit = extern

@extern def nk_textedit_click(state : Ptr[nk_text_edit], x : Float, y : Float, font : Ptr[nk_user_font], row_height : Float): Unit = extern

@extern def nk_textedit_create_undo_record(state : Ptr[nk_text_undo_state], numchars : CInt): Ptr[nk_text_undo_record] = extern

@extern def nk_textedit_createundo(state : Ptr[nk_text_undo_state], pos : CInt, insert_len : CInt, delete_len : CInt): Ptr[nk_rune] = extern

@extern def nk_textedit_cut(state : Ptr[nk_text_edit]): nk_bool = extern

@extern def nk_textedit_delete(state : Ptr[nk_text_edit], where : CInt, len : CInt): Unit = extern

@extern def nk_textedit_delete_selection(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_discard_redo(state : Ptr[nk_text_undo_state]): Unit = extern

@extern def nk_textedit_discard_undo(state : Ptr[nk_text_undo_state]): Unit = extern

@extern def nk_textedit_drag(state : Ptr[nk_text_edit], x : Float, y : Float, font : Ptr[nk_user_font], row_height : Float): Unit = extern

@extern def nk_textedit_find_charpos(find : Ptr[nk_text_find], state : Ptr[nk_text_edit], n : CInt, single_line : CInt, font : Ptr[nk_user_font], row_height : Float): Unit = extern

@extern def nk_textedit_flush_redo(state : Ptr[nk_text_undo_state]): Unit = extern

@extern def nk_textedit_free(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_get_width(edit : Ptr[nk_text_edit], line_start : CInt, char_id : CInt, font : Ptr[nk_user_font]): Float = extern

@extern def nk_textedit_init(state : Ptr[nk_text_edit], alloc : Ptr[nk_allocator], size : nk_size): Unit = extern

@extern def nk_textedit_init_default(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_init_fixed(state : Ptr[nk_text_edit], memory : Ptr[Byte], size : nk_size): Unit = extern

@extern def nk_textedit_key(state : Ptr[nk_text_edit], key : nk_keys, shift_mod : CInt, font : Ptr[nk_user_font], row_height : Float): Unit = extern

@extern def nk_textedit_layout_row(r : Ptr[nk_text_edit_row], edit : Ptr[nk_text_edit], line_start_id : CInt, row_height : Float, font : Ptr[nk_user_font]): Unit = extern

@extern def nk_textedit_locate_coord(edit : Ptr[nk_text_edit], x : Float, y : Float, font : Ptr[nk_user_font], row_height : Float): CInt = extern

@extern def nk_textedit_makeundo_delete(state : Ptr[nk_text_edit], where : CInt, length : CInt): Unit = extern

@extern def nk_textedit_makeundo_insert(state : Ptr[nk_text_edit], where : CInt, length : CInt): Unit = extern

@extern def nk_textedit_makeundo_replace(state : Ptr[nk_text_edit], where : CInt, old_length : CInt, new_length : CInt): Unit = extern

@extern def nk_textedit_move_to_first(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_move_to_last(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_move_to_word_next(state : Ptr[nk_text_edit]): CInt = extern

@extern def nk_textedit_move_to_word_previous(state : Ptr[nk_text_edit]): CInt = extern

@extern def nk_textedit_paste(state : Ptr[nk_text_edit], ctext : CString, len : CInt): nk_bool = extern

@extern def nk_textedit_prep_selection_at_cursor(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_redo(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_select_all(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_sortselection(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_textedit_text(state : Ptr[nk_text_edit], text : CString, total_len : CInt): Unit = extern

@extern def nk_textedit_undo(state : Ptr[nk_text_edit]): Unit = extern

@extern def nk_to_lower(c : CInt): CInt = extern

@extern def nk_to_upper(c : CInt): CInt = extern

@extern def nk_tooltip(ctx : Ptr[nk_context], text : CString): Unit = extern

@extern def nk_tooltip_begin(ctx : Ptr[nk_context], width : Float): nk_bool = extern

@extern def nk_tooltip_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_tree_base(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, initial_state : nk_collapse_states, hash : CString, len : CInt, line : CInt): CInt = extern

@extern def nk_tree_element_base(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, initial_state : nk_collapse_states, selected : Ptr[nk_bool], hash : CString, len : CInt, line : CInt): CInt = extern

@extern def nk_tree_element_image_push_hashed_base(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, title_len : CInt, state : Ptr[nk_collapse_states], selected : Ptr[nk_bool]): CInt = extern

@extern def nk_tree_element_pop(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_tree_element_push_hashed(ctx : Ptr[nk_context], `type` : nk_tree_type, title : CString, initial_state : nk_collapse_states, selected : Ptr[nk_bool], hash : CString, len : CInt, seed : CInt): nk_bool = extern

@extern def nk_tree_pop(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_tree_push_hashed(ctx : Ptr[nk_context], `type` : nk_tree_type, title : CString, initial_state : nk_collapse_states, hash : CString, len : CInt, line : CInt): nk_bool = extern

@extern def nk_tree_state_base(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, state : Ptr[nk_collapse_states]): CInt = extern

@extern def nk_tree_state_pop(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_tree_state_push(ctx : Ptr[nk_context], `type` : nk_tree_type, title : CString, state : Ptr[nk_collapse_states]): nk_bool = extern

@extern def nk_unify(clip : Ptr[nk_rect], a : Ptr[nk_rect], x0 : Float, y0 : Float, x1 : Float, y1 : Float): Unit = extern

@extern def nk_utf_at(buffer : CString, length : CInt, index : CInt, unicode : Ptr[nk_rune], len : Ptr[CInt]): CString = extern

@extern def nk_utf_decode(c : CString, u : Ptr[nk_rune], clen : CInt): CInt = extern

@extern def nk_utf_decode_byte(c : CChar, i : Ptr[CInt]): nk_rune = extern

@extern def nk_utf_encode(u : nk_rune, c : CString, clen : CInt): CInt = extern

@extern def nk_utf_encode_byte(u : nk_rune, i : CInt): CChar = extern

@extern def nk_utf_len(str : CString, len : CInt): CInt = extern

@extern def nk_utf_validate(u : Ptr[nk_rune], i : CInt): CInt = extern

@extern def nk_widget(bounds : Ptr[nk_rect], ctx : Ptr[nk_context]): nk_widget_layout_states = extern

@extern def nk_widget_disable_begin(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_widget_disable_end(ctx : Ptr[nk_context]): Unit = extern

@extern def nk_widget_has_mouse_click_down(ctx : Ptr[nk_context], btn : nk_buttons, down : nk_bool): nk_bool = extern

@extern def nk_widget_height(ctx : Ptr[nk_context]): Float = extern

@extern def nk_widget_is_hovered(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_widget_is_mouse_clicked(ctx : Ptr[nk_context], btn : nk_buttons): nk_bool = extern

@extern def nk_widget_width(ctx : Ptr[nk_context]): Float = extern

@extern def nk_window_close(ctx : Ptr[nk_context], name : CString): Unit = extern

@extern def nk_window_collapse(ctx : Ptr[nk_context], name : CString, c : nk_collapse_states): Unit = extern

@extern def nk_window_collapse_if(ctx : Ptr[nk_context], name : CString, c : nk_collapse_states, cond : CInt): Unit = extern

@extern def nk_window_find(ctx : Ptr[nk_context], name : CString): Ptr[nk_window] = extern

@extern def nk_window_get_canvas(ctx : Ptr[nk_context]): Ptr[nk_command_buffer] = extern

@extern def nk_window_get_height(ctx : Ptr[nk_context]): Float = extern

@extern def nk_window_get_panel(ctx : Ptr[nk_context]): Ptr[nk_panel] = extern

@extern def nk_window_get_scroll(ctx : Ptr[nk_context], offset_x : Ptr[nk_uint], offset_y : Ptr[nk_uint]): Unit = extern

@extern def nk_window_get_width(ctx : Ptr[nk_context]): Float = extern

@extern def nk_window_has_focus(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_window_is_active(ctx : Ptr[nk_context], name : CString): nk_bool = extern

@extern def nk_window_is_any_hovered(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_window_is_closed(ctx : Ptr[nk_context], name : CString): nk_bool = extern

@extern def nk_window_is_collapsed(ctx : Ptr[nk_context], name : CString): nk_bool = extern

@extern def nk_window_is_hidden(ctx : Ptr[nk_context], name : CString): nk_bool = extern

@extern def nk_window_is_hovered(ctx : Ptr[nk_context]): nk_bool = extern

@extern def nk_window_set_focus(ctx : Ptr[nk_context], name : CString): Unit = extern

@extern def nk_window_set_scroll(ctx : Ptr[nk_context], offset_x : nk_uint, offset_y : nk_uint): Unit = extern

@extern def nk_window_show(ctx : Ptr[nk_context], name : CString, s : nk_show_states): Unit = extern

@extern def nk_window_show_if(ctx : Ptr[nk_context], name : CString, s : nk_show_states, cond : CInt): Unit = extern

@extern def nk_zero(ptr : Ptr[Byte], size : nk_size): Unit = extern

@extern def stbrp_init_target(context : Ptr[stbrp_context], width : CInt, height : CInt, nodes : Ptr[stbrp_node], num_nodes : CInt): Unit = extern

@extern def stbrp_pack_rects(context : Ptr[stbrp_context], rects : Ptr[stbrp_rect], num_rects : CInt): CInt = extern

@extern def stbrp_setup_allow_out_of_mem(context : Ptr[stbrp_context], allow_out_of_mem : CInt): Unit = extern

@extern def stbrp_setup_heuristic(context : Ptr[stbrp_context], heuristic : CInt): Unit = extern

@extern def stbtt_BakeFontBitmap(data : Ptr[CUnsignedChar], offset : CInt, pixel_height : Float, pixels : Ptr[CUnsignedChar], pw : CInt, ph : CInt, first_char : CInt, num_chars : CInt, chardata : Ptr[stbtt_bakedchar]): CInt = extern

@extern def stbtt_CompareUTF8toUTF16_bigendian(s1 : CString, len1 : CInt, s2 : CString, len2 : CInt): CInt = extern

@extern def stbtt_FindGlyphIndex(info : Ptr[stbtt_fontinfo], unicode_codepoint : CInt): CInt = extern

@extern def stbtt_FindMatchingFont(fontdata : Ptr[CUnsignedChar], name : CString, flags : CInt): CInt = extern

@extern def stbtt_FindSVGDoc(info : Ptr[stbtt_fontinfo], gl : CInt): Ptr[CUnsignedChar] = extern

@extern def stbtt_FreeBitmap(bitmap : Ptr[CUnsignedChar], userdata : Ptr[Byte]): Unit = extern

@extern def stbtt_FreeSDF(bitmap : Ptr[CUnsignedChar], userdata : Ptr[Byte]): Unit = extern

@extern def stbtt_FreeShape(info : Ptr[stbtt_fontinfo], vertices : Ptr[stbtt_vertex]): Unit = extern

@extern def stbtt_GetBakedQuad(chardata : Ptr[stbtt_bakedchar], pw : CInt, ph : CInt, char_index : CInt, xpos : Ptr[Float], ypos : Ptr[Float], q : Ptr[stbtt_aligned_quad], opengl_fillrule : CInt): Unit = extern

@extern def stbtt_GetCodepointBitmap(info : Ptr[stbtt_fontinfo], scale_x : Float, scale_y : Float, codepoint : CInt, width : Ptr[CInt], height : Ptr[CInt], xoff : Ptr[CInt], yoff : Ptr[CInt]): Ptr[CUnsignedChar] = extern

@extern def stbtt_GetCodepointBitmapBox(font : Ptr[stbtt_fontinfo], codepoint : CInt, scale_x : Float, scale_y : Float, ix0 : Ptr[CInt], iy0 : Ptr[CInt], ix1 : Ptr[CInt], iy1 : Ptr[CInt]): Unit = extern

@extern def stbtt_GetCodepointBitmapBoxSubpixel(font : Ptr[stbtt_fontinfo], codepoint : CInt, scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, ix0 : Ptr[CInt], iy0 : Ptr[CInt], ix1 : Ptr[CInt], iy1 : Ptr[CInt]): Unit = extern

@extern def stbtt_GetCodepointBitmapSubpixel(info : Ptr[stbtt_fontinfo], scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, codepoint : CInt, width : Ptr[CInt], height : Ptr[CInt], xoff : Ptr[CInt], yoff : Ptr[CInt]): Ptr[CUnsignedChar] = extern

@extern def stbtt_GetCodepointBox(info : Ptr[stbtt_fontinfo], codepoint : CInt, x0 : Ptr[CInt], y0 : Ptr[CInt], x1 : Ptr[CInt], y1 : Ptr[CInt]): CInt = extern

@extern def stbtt_GetCodepointHMetrics(info : Ptr[stbtt_fontinfo], codepoint : CInt, advanceWidth : Ptr[CInt], leftSideBearing : Ptr[CInt]): Unit = extern

@extern def stbtt_GetCodepointKernAdvance(info : Ptr[stbtt_fontinfo], ch1 : CInt, ch2 : CInt): CInt = extern

@extern def stbtt_GetCodepointSDF(info : Ptr[stbtt_fontinfo], scale : Float, codepoint : CInt, padding : CInt, onedge_value : CUnsignedChar, pixel_dist_scale : Float, width : Ptr[CInt], height : Ptr[CInt], xoff : Ptr[CInt], yoff : Ptr[CInt]): Ptr[CUnsignedChar] = extern

@extern def stbtt_GetCodepointSVG(info : Ptr[stbtt_fontinfo], unicode_codepoint : CInt, svg : Ptr[CString]): CInt = extern

@extern def stbtt_GetCodepointShape(info : Ptr[stbtt_fontinfo], unicode_codepoint : CInt, vertices : Ptr[Ptr[stbtt_vertex]]): CInt = extern

@extern def stbtt_GetFontBoundingBox(info : Ptr[stbtt_fontinfo], x0 : Ptr[CInt], y0 : Ptr[CInt], x1 : Ptr[CInt], y1 : Ptr[CInt]): Unit = extern

@extern def stbtt_GetFontNameString(font : Ptr[stbtt_fontinfo], length : Ptr[CInt], platformID : CInt, encodingID : CInt, languageID : CInt, nameID : CInt): CString = extern

@extern def stbtt_GetFontOffsetForIndex(data : Ptr[CUnsignedChar], index : CInt): CInt = extern

@extern def stbtt_GetFontVMetrics(info : Ptr[stbtt_fontinfo], ascent : Ptr[CInt], descent : Ptr[CInt], lineGap : Ptr[CInt]): Unit = extern

@extern def stbtt_GetFontVMetricsOS2(info : Ptr[stbtt_fontinfo], typoAscent : Ptr[CInt], typoDescent : Ptr[CInt], typoLineGap : Ptr[CInt]): CInt = extern

@extern def stbtt_GetGlyphBitmap(info : Ptr[stbtt_fontinfo], scale_x : Float, scale_y : Float, glyph : CInt, width : Ptr[CInt], height : Ptr[CInt], xoff : Ptr[CInt], yoff : Ptr[CInt]): Ptr[CUnsignedChar] = extern

@extern def stbtt_GetGlyphBitmapBox(font : Ptr[stbtt_fontinfo], glyph : CInt, scale_x : Float, scale_y : Float, ix0 : Ptr[CInt], iy0 : Ptr[CInt], ix1 : Ptr[CInt], iy1 : Ptr[CInt]): Unit = extern

@extern def stbtt_GetGlyphBitmapBoxSubpixel(font : Ptr[stbtt_fontinfo], glyph : CInt, scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, ix0 : Ptr[CInt], iy0 : Ptr[CInt], ix1 : Ptr[CInt], iy1 : Ptr[CInt]): Unit = extern

@extern def stbtt_GetGlyphBitmapSubpixel(info : Ptr[stbtt_fontinfo], scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, glyph : CInt, width : Ptr[CInt], height : Ptr[CInt], xoff : Ptr[CInt], yoff : Ptr[CInt]): Ptr[CUnsignedChar] = extern

@extern def stbtt_GetGlyphBox(info : Ptr[stbtt_fontinfo], glyph_index : CInt, x0 : Ptr[CInt], y0 : Ptr[CInt], x1 : Ptr[CInt], y1 : Ptr[CInt]): CInt = extern

@extern def stbtt_GetGlyphHMetrics(info : Ptr[stbtt_fontinfo], glyph_index : CInt, advanceWidth : Ptr[CInt], leftSideBearing : Ptr[CInt]): Unit = extern

@extern def stbtt_GetGlyphKernAdvance(info : Ptr[stbtt_fontinfo], glyph1 : CInt, glyph2 : CInt): CInt = extern

@extern def stbtt_GetGlyphSDF(info : Ptr[stbtt_fontinfo], scale : Float, glyph : CInt, padding : CInt, onedge_value : CUnsignedChar, pixel_dist_scale : Float, width : Ptr[CInt], height : Ptr[CInt], xoff : Ptr[CInt], yoff : Ptr[CInt]): Ptr[CUnsignedChar] = extern

@extern def stbtt_GetGlyphSVG(info : Ptr[stbtt_fontinfo], gl : CInt, svg : Ptr[CString]): CInt = extern

@extern def stbtt_GetGlyphShape(info : Ptr[stbtt_fontinfo], glyph_index : CInt, vertices : Ptr[Ptr[stbtt_vertex]]): CInt = extern

@extern def stbtt_GetKerningTable(info : Ptr[stbtt_fontinfo], table : Ptr[stbtt_kerningentry], table_length : CInt): CInt = extern

@extern def stbtt_GetKerningTableLength(info : Ptr[stbtt_fontinfo]): CInt = extern

@extern def stbtt_GetNumberOfFonts(data : Ptr[CUnsignedChar]): CInt = extern

@extern def stbtt_GetPackedQuad(chardata : Ptr[stbtt_packedchar], pw : CInt, ph : CInt, char_index : CInt, xpos : Ptr[Float], ypos : Ptr[Float], q : Ptr[stbtt_aligned_quad], align_to_integer : CInt): Unit = extern

@extern def stbtt_GetScaledFontVMetrics(fontdata : Ptr[CUnsignedChar], index : CInt, size : Float, ascent : Ptr[Float], descent : Ptr[Float], lineGap : Ptr[Float]): Unit = extern

@extern def stbtt_InitFont(info : Ptr[stbtt_fontinfo], data : Ptr[CUnsignedChar], offset : CInt): CInt = extern

@extern def stbtt_IsGlyphEmpty(info : Ptr[stbtt_fontinfo], glyph_index : CInt): CInt = extern

@extern def stbtt_MakeCodepointBitmap(info : Ptr[stbtt_fontinfo], output : Ptr[CUnsignedChar], out_w : CInt, out_h : CInt, out_stride : CInt, scale_x : Float, scale_y : Float, codepoint : CInt): Unit = extern

@extern def stbtt_MakeCodepointBitmapSubpixel(info : Ptr[stbtt_fontinfo], output : Ptr[CUnsignedChar], out_w : CInt, out_h : CInt, out_stride : CInt, scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, codepoint : CInt): Unit = extern

@extern def stbtt_MakeCodepointBitmapSubpixelPrefilter(info : Ptr[stbtt_fontinfo], output : Ptr[CUnsignedChar], out_w : CInt, out_h : CInt, out_stride : CInt, scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, oversample_x : CInt, oversample_y : CInt, sub_x : Ptr[Float], sub_y : Ptr[Float], codepoint : CInt): Unit = extern

@extern def stbtt_MakeGlyphBitmap(info : Ptr[stbtt_fontinfo], output : Ptr[CUnsignedChar], out_w : CInt, out_h : CInt, out_stride : CInt, scale_x : Float, scale_y : Float, glyph : CInt): Unit = extern

@extern def stbtt_MakeGlyphBitmapSubpixel(info : Ptr[stbtt_fontinfo], output : Ptr[CUnsignedChar], out_w : CInt, out_h : CInt, out_stride : CInt, scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, glyph : CInt): Unit = extern

@extern def stbtt_MakeGlyphBitmapSubpixelPrefilter(info : Ptr[stbtt_fontinfo], output : Ptr[CUnsignedChar], out_w : CInt, out_h : CInt, out_stride : CInt, scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, oversample_x : CInt, oversample_y : CInt, sub_x : Ptr[Float], sub_y : Ptr[Float], glyph : CInt): Unit = extern

@extern def stbtt_PackBegin(spc : Ptr[stbtt_pack_context], pixels : Ptr[CUnsignedChar], width : CInt, height : CInt, stride_in_bytes : CInt, padding : CInt, alloc_context : Ptr[Byte]): CInt = extern

@extern def stbtt_PackEnd(spc : Ptr[stbtt_pack_context]): Unit = extern

@extern def stbtt_PackFontRange(spc : Ptr[stbtt_pack_context], fontdata : Ptr[CUnsignedChar], font_index : CInt, font_size : Float, first_unicode_char_in_range : CInt, num_chars_in_range : CInt, chardata_for_range : Ptr[stbtt_packedchar]): CInt = extern

@extern def stbtt_PackFontRanges(spc : Ptr[stbtt_pack_context], fontdata : Ptr[CUnsignedChar], font_index : CInt, ranges : Ptr[stbtt_pack_range], num_ranges : CInt): CInt = extern

@extern def stbtt_PackFontRangesGatherRects(spc : Ptr[stbtt_pack_context], info : Ptr[stbtt_fontinfo], ranges : Ptr[stbtt_pack_range], num_ranges : CInt, rects : Ptr[stbrp_rect]): CInt = extern

@extern def stbtt_PackFontRangesPackRects(spc : Ptr[stbtt_pack_context], rects : Ptr[stbrp_rect], num_rects : CInt): Unit = extern

@extern def stbtt_PackFontRangesRenderIntoRects(spc : Ptr[stbtt_pack_context], info : Ptr[stbtt_fontinfo], ranges : Ptr[stbtt_pack_range], num_ranges : CInt, rects : Ptr[stbrp_rect]): CInt = extern

@extern def stbtt_PackSetOversampling(spc : Ptr[stbtt_pack_context], h_oversample : CUnsignedInt, v_oversample : CUnsignedInt): Unit = extern

@extern def stbtt_PackSetSkipMissingCodepoints(spc : Ptr[stbtt_pack_context], skip : CInt): Unit = extern

@extern def stbtt_Rasterize(result : Ptr[stbtt__bitmap], flatness_in_pixels : Float, vertices : Ptr[stbtt_vertex], num_verts : CInt, scale_x : Float, scale_y : Float, shift_x : Float, shift_y : Float, x_off : CInt, y_off : CInt, invert : CInt, userdata : Ptr[Byte]): Unit = extern

@extern def stbtt_ScaleForMappingEmToPixels(info : Ptr[stbtt_fontinfo], pixels : Float): Float = extern

@extern def stbtt_ScaleForPixelHeight(info : Ptr[stbtt_fontinfo], pixels : Float): Float = extern

def nk_begin(ctx : Ptr[nk_context], title : CString, bounds : Ptr[nk_rect], flags : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_begin(ctx, title, bounds, flags)

def nk_begin(ctx : Ptr[nk_context], title : CString, bounds : nk_rect, flags : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_begin(ctx, title, (__ptr_0 + 0), flags)

def nk_begin_titled(ctx : Ptr[nk_context], name : CString, title : CString, bounds : Ptr[nk_rect], flags : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_begin_titled(ctx, name, title, bounds, flags)

def nk_begin_titled(ctx : Ptr[nk_context], name : CString, title : CString, bounds : nk_rect, flags : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_begin_titled(ctx, name, title, (__ptr_0 + 0), flags)

def nk_button_behavior(state : Ptr[nk_flags], r : nk_rect, i : Ptr[nk_input], behavior : nk_button_behavior)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_button_behavior(state, (__ptr_0 + 0), i, behavior)

def nk_button_behavior(state : Ptr[nk_flags], r : Ptr[nk_rect], i : Ptr[nk_input], behavior : nk_button_behavior): nk_bool = 
  __sn_wrap_nuklear_nk_button_behavior(state, r, i, behavior)

def nk_button_color(ctx : Ptr[nk_context], color : Ptr[nk_color]): nk_bool = 
  __sn_wrap_nuklear_nk_button_color(ctx, color)

def nk_button_color(ctx : Ptr[nk_context], color : nk_color)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_nuklear_nk_button_color(ctx, (__ptr_0 + 0))

def nk_button_image(ctx : Ptr[nk_context], img : Ptr[nk_image]): nk_bool = 
  __sn_wrap_nuklear_nk_button_image(ctx, img)

def nk_button_image(ctx : Ptr[nk_context], img : nk_image)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_button_image(ctx, (__ptr_0 + 0))

def nk_button_image_label(ctx : Ptr[nk_context], img : nk_image, label : CString, align : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_button_image_label(ctx, (__ptr_0 + 0), label, align)

def nk_button_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], label : CString, align : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_button_image_label(ctx, img, label, align)

def nk_button_image_label_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : nk_image, label : CString, text_alignment : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_button_image_label_styled(ctx, style, (__ptr_0 + 0), label, text_alignment)

def nk_button_image_label_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : Ptr[nk_image], label : CString, text_alignment : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_button_image_label_styled(ctx, style, img, label, text_alignment)

def nk_button_image_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : Ptr[nk_image]): nk_bool = 
  __sn_wrap_nuklear_nk_button_image_styled(ctx, style, img)

def nk_button_image_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : nk_image)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_button_image_styled(ctx, style, (__ptr_0 + 0))

def nk_button_image_text(ctx : Ptr[nk_context], img : nk_image, text : CString, len : CInt, align : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_button_image_text(ctx, (__ptr_0 + 0), text, len, align)

def nk_button_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, len : CInt, align : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_button_image_text(ctx, img, text, len, align)

def nk_button_image_text_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : Ptr[nk_image], text : CString, len : CInt, align : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_button_image_text_styled(ctx, style, img, text, len, align)

def nk_button_image_text_styled(ctx : Ptr[nk_context], style : Ptr[nk_style_button], img : nk_image, text : CString, len : CInt, align : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_button_image_text_styled(ctx, style, (__ptr_0 + 0), text, len, align)

def nk_chart_add_slot_colored(ctx : Ptr[nk_context], `type` : nk_chart_type, color : Ptr[nk_color], highlight : Ptr[nk_color], count : CInt, min_value : Float, max_value : Float): Unit = 
  __sn_wrap_nuklear_nk_chart_add_slot_colored(ctx, `type`, color, highlight, count, min_value, max_value)

def nk_chart_add_slot_colored(ctx : Ptr[nk_context], `type` : nk_chart_type, color : nk_color, highlight : nk_color, count : CInt, min_value : Float, max_value : Float)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](2)
  !(__ptr_0 + 0) = color
  !(__ptr_0 + 1) = highlight
  __sn_wrap_nuklear_nk_chart_add_slot_colored(ctx, `type`, (__ptr_0 + 0), (__ptr_0 + 1), count, min_value, max_value)

def nk_chart_begin_colored(ctx : Ptr[nk_context], `type` : nk_chart_type, color : nk_color, highlight : nk_color, count : CInt, min_value : Float, max_value : Float)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](2)
  !(__ptr_0 + 0) = color
  !(__ptr_0 + 1) = highlight
  __sn_wrap_nuklear_nk_chart_begin_colored(ctx, `type`, (__ptr_0 + 0), (__ptr_0 + 1), count, min_value, max_value)

def nk_chart_begin_colored(ctx : Ptr[nk_context], `type` : nk_chart_type, color : Ptr[nk_color], highlight : Ptr[nk_color], count : CInt, min_value : Float, max_value : Float): nk_bool = 
  __sn_wrap_nuklear_nk_chart_begin_colored(ctx, `type`, color, highlight, count, min_value, max_value)

def nk_color_cf(in : Ptr[nk_color])(using Zone): nk_colorf = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  __sn_wrap_nuklear_nk_color_cf(in, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_color_cf(in : nk_color)(using Zone): nk_colorf = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_1 + 0) = in
  __sn_wrap_nuklear_nk_color_cf((__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_color_cf(in : Ptr[nk_color])(__return : Ptr[nk_colorf]): Unit = 
  __sn_wrap_nuklear_nk_color_cf(in, __return)

def nk_color_d(r : Ptr[Double], g : Ptr[Double], b : Ptr[Double], a : Ptr[Double], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_d(r, g, b, a, in)

def nk_color_d(r : Ptr[Double], g : Ptr[Double], b : Ptr[Double], a : Ptr[Double], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_d(r, g, b, a, (__ptr_0 + 0))

def nk_color_dv(c : Ptr[Double], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_dv(c, (__ptr_0 + 0))

def nk_color_dv(c : Ptr[Double], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_dv(c, in)

def nk_color_f(r : Ptr[Float], g : Ptr[Float], b : Ptr[Float], a : Ptr[Float], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_f(r, g, b, a, (__ptr_0 + 0))

def nk_color_f(r : Ptr[Float], g : Ptr[Float], b : Ptr[Float], a : Ptr[Float], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_f(r, g, b, a, in)

def nk_color_fv(c : Ptr[Float], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_fv(c, in)

def nk_color_fv(c : Ptr[Float], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_fv(c, (__ptr_0 + 0))

def nk_color_hex_rgb(output : CString, col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_color_hex_rgb(output, (__ptr_0 + 0))

def nk_color_hex_rgb(output : CString, col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hex_rgb(output, col)

def nk_color_hex_rgba(output : CString, col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_color_hex_rgba(output, (__ptr_0 + 0))

def nk_color_hex_rgba(output : CString, col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hex_rgba(output, col)

def nk_color_hsv_b(out_h : Ptr[nk_byte], out_s : Ptr[nk_byte], out_v : Ptr[nk_byte], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsv_b(out_h, out_s, out_v, in)

def nk_color_hsv_b(out_h : Ptr[nk_byte], out_s : Ptr[nk_byte], out_v : Ptr[nk_byte], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsv_b(out_h, out_s, out_v, (__ptr_0 + 0))

def nk_color_hsv_bv(out : Ptr[nk_byte], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsv_bv(out, (__ptr_0 + 0))

def nk_color_hsv_bv(out : Ptr[nk_byte], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsv_bv(out, in)

def nk_color_hsv_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsv_f(out_h, out_s, out_v, in)

def nk_color_hsv_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsv_f(out_h, out_s, out_v, (__ptr_0 + 0))

def nk_color_hsv_fv(out : Ptr[Float], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsv_fv(out, in)

def nk_color_hsv_fv(out : Ptr[Float], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsv_fv(out, (__ptr_0 + 0))

def nk_color_hsv_i(out_h : Ptr[CInt], out_s : Ptr[CInt], out_v : Ptr[CInt], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsv_i(out_h, out_s, out_v, in)

def nk_color_hsv_i(out_h : Ptr[CInt], out_s : Ptr[CInt], out_v : Ptr[CInt], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsv_i(out_h, out_s, out_v, (__ptr_0 + 0))

def nk_color_hsv_iv(out : Ptr[CInt], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsv_iv(out, (__ptr_0 + 0))

def nk_color_hsv_iv(out : Ptr[CInt], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsv_iv(out, in)

def nk_color_hsva_b(h : Ptr[nk_byte], s : Ptr[nk_byte], v : Ptr[nk_byte], a : Ptr[nk_byte], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsva_b(h, s, v, a, in)

def nk_color_hsva_b(h : Ptr[nk_byte], s : Ptr[nk_byte], v : Ptr[nk_byte], a : Ptr[nk_byte], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsva_b(h, s, v, a, (__ptr_0 + 0))

def nk_color_hsva_bv(out : Ptr[nk_byte], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsva_bv(out, in)

def nk_color_hsva_bv(out : Ptr[nk_byte], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsva_bv(out, (__ptr_0 + 0))

def nk_color_hsva_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], out_a : Ptr[Float], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsva_f(out_h, out_s, out_v, out_a, (__ptr_0 + 0))

def nk_color_hsva_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], out_a : Ptr[Float], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsva_f(out_h, out_s, out_v, out_a, in)

def nk_color_hsva_fv(out : Ptr[Float], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsva_fv(out, (__ptr_0 + 0))

def nk_color_hsva_fv(out : Ptr[Float], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsva_fv(out, in)

def nk_color_hsva_i(out_h : Ptr[CInt], out_s : Ptr[CInt], out_v : Ptr[CInt], out_a : Ptr[CInt], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsva_i(out_h, out_s, out_v, out_a, (__ptr_0 + 0))

def nk_color_hsva_i(out_h : Ptr[CInt], out_s : Ptr[CInt], out_v : Ptr[CInt], out_a : Ptr[CInt], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsva_i(out_h, out_s, out_v, out_a, in)

def nk_color_hsva_iv(out : Ptr[CInt], in : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_hsva_iv(out, (__ptr_0 + 0))

def nk_color_hsva_iv(out : Ptr[CInt], in : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_color_hsva_iv(out, in)

def nk_color_picker(ctx : Ptr[nk_context], color : Ptr[nk_colorf], fmt : nk_color_format)(__return : Ptr[nk_colorf]): Unit = 
  __sn_wrap_nuklear_nk_color_picker(ctx, color, fmt, __return)

def nk_color_picker(ctx : Ptr[nk_context], color : nk_colorf, fmt : nk_color_format)(using Zone): nk_colorf = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](2)
  !(__ptr_0 + 0) = color
  __sn_wrap_nuklear_nk_color_picker(ctx, (__ptr_0 + 0), fmt, (__ptr_0 + 1))
  !(__ptr_0 + 1)

def nk_color_picker(ctx : Ptr[nk_context], color : Ptr[nk_colorf], fmt : nk_color_format)(using Zone): nk_colorf = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  __sn_wrap_nuklear_nk_color_picker(ctx, color, fmt, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_color_u32(in : Ptr[nk_color]): nk_uint = 
  __sn_wrap_nuklear_nk_color_u32(in)

def nk_color_u32(in : nk_color)(using Zone): nk_uint = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_color_u32((__ptr_0 + 0))

def nk_colorf_hsva_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], out_a : Ptr[Float], in : Ptr[nk_colorf]): Unit = 
  __sn_wrap_nuklear_nk_colorf_hsva_f(out_h, out_s, out_v, out_a, in)

def nk_colorf_hsva_f(out_h : Ptr[Float], out_s : Ptr[Float], out_v : Ptr[Float], out_a : Ptr[Float], in : nk_colorf)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_colorf_hsva_f(out_h, out_s, out_v, out_a, (__ptr_0 + 0))

def nk_colorf_hsva_fv(hsva : Ptr[Float], in : nk_colorf)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  !(__ptr_0 + 0) = in
  __sn_wrap_nuklear_nk_colorf_hsva_fv(hsva, (__ptr_0 + 0))

def nk_colorf_hsva_fv(hsva : Ptr[Float], in : Ptr[nk_colorf]): Unit = 
  __sn_wrap_nuklear_nk_colorf_hsva_fv(hsva, in)

def nk_combo(ctx : Ptr[nk_context], items : Ptr[CString], count : CInt, selected : CInt, item_height : CInt, size : Ptr[nk_vec2]): CInt = 
  __sn_wrap_nuklear_nk_combo(ctx, items, count, selected, item_height, size)

def nk_combo(ctx : Ptr[nk_context], items : Ptr[CString], count : CInt, selected : CInt, item_height : CInt, size : nk_vec2)(using Zone): CInt = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo(ctx, items, count, selected, item_height, (__ptr_0 + 0))

def nk_combo_begin(ctx : Ptr[nk_context], win : Ptr[nk_window], size : nk_vec2, is_clicked : nk_bool, header : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_1 + 0) = size
  !(__ptr_0 + 0) = header
  __sn_wrap_nuklear_nk_combo_begin(ctx, win, (__ptr_1 + 0), is_clicked, (__ptr_0 + 0))

def nk_combo_begin(ctx : Ptr[nk_context], win : Ptr[nk_window], size : Ptr[nk_vec2], is_clicked : nk_bool, header : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin(ctx, win, size, is_clicked, header)

def nk_combo_begin_color(ctx : Ptr[nk_context], color : nk_color, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_1 + 0) = color
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_color(ctx, (__ptr_1 + 0), (__ptr_0 + 0))

def nk_combo_begin_color(ctx : Ptr[nk_context], color : Ptr[nk_color], size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_color(ctx, color, size)

def nk_combo_begin_image(ctx : Ptr[nk_context], img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_image(ctx, img, size)

def nk_combo_begin_image(ctx : Ptr[nk_context], img : nk_image, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = img
  !(__ptr_1 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_image(ctx, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_combo_begin_image_label(ctx : Ptr[nk_context], selected : CString, img : nk_image, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = img
  !(__ptr_1 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_image_label(ctx, selected, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_combo_begin_image_label(ctx : Ptr[nk_context], selected : CString, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_image_label(ctx, selected, img, size)

def nk_combo_begin_image_text(ctx : Ptr[nk_context], selected : CString, len : CInt, img : nk_image, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = img
  !(__ptr_1 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_image_text(ctx, selected, len, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_combo_begin_image_text(ctx : Ptr[nk_context], selected : CString, len : CInt, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_image_text(ctx, selected, len, img, size)

def nk_combo_begin_label(ctx : Ptr[nk_context], selected : CString, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_label(ctx, selected, (__ptr_0 + 0))

def nk_combo_begin_label(ctx : Ptr[nk_context], selected : CString, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_label(ctx, selected, size)

def nk_combo_begin_symbol(ctx : Ptr[nk_context], symbol : nk_symbol_type, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_symbol(ctx, symbol, (__ptr_0 + 0))

def nk_combo_begin_symbol(ctx : Ptr[nk_context], symbol : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_symbol(ctx, symbol, size)

def nk_combo_begin_symbol_label(ctx : Ptr[nk_context], selected : CString, `type` : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_symbol_label(ctx, selected, `type`, size)

def nk_combo_begin_symbol_label(ctx : Ptr[nk_context], selected : CString, `type` : nk_symbol_type, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_symbol_label(ctx, selected, `type`, (__ptr_0 + 0))

def nk_combo_begin_symbol_text(ctx : Ptr[nk_context], selected : CString, len : CInt, symbol : nk_symbol_type, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_symbol_text(ctx, selected, len, symbol, (__ptr_0 + 0))

def nk_combo_begin_symbol_text(ctx : Ptr[nk_context], selected : CString, len : CInt, symbol : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_symbol_text(ctx, selected, len, symbol, size)

def nk_combo_begin_text(ctx : Ptr[nk_context], selected : CString, len : CInt, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_begin_text(ctx, selected, len, (__ptr_0 + 0))

def nk_combo_begin_text(ctx : Ptr[nk_context], selected : CString, len : CInt, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_combo_begin_text(ctx, selected, len, size)

def nk_combo_callback(ctx : Ptr[nk_context], item_getter : CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit], userdata : Ptr[Byte], selected : CInt, count : CInt, item_height : CInt, size : nk_vec2)(using Zone): CInt = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_callback(ctx, item_getter, userdata, selected, count, item_height, (__ptr_0 + 0))

def nk_combo_callback(ctx : Ptr[nk_context], item_getter : CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit], userdata : Ptr[Byte], selected : CInt, count : CInt, item_height : CInt, size : Ptr[nk_vec2]): CInt = 
  __sn_wrap_nuklear_nk_combo_callback(ctx, item_getter, userdata, selected, count, item_height, size)

def nk_combo_item_image_label(ctx : Ptr[nk_context], img : nk_image, text : CString, alignment : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_combo_item_image_label(ctx, (__ptr_0 + 0), text, alignment)

def nk_combo_item_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, alignment : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_combo_item_image_label(ctx, img, text, alignment)

def nk_combo_item_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, len : CInt, alignment : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_combo_item_image_text(ctx, img, text, len, alignment)

def nk_combo_item_image_text(ctx : Ptr[nk_context], img : nk_image, text : CString, len : CInt, alignment : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_combo_item_image_text(ctx, (__ptr_0 + 0), text, len, alignment)

def nk_combo_separator(ctx : Ptr[nk_context], items_separated_by_separator : CString, separator : CInt, selected : CInt, count : CInt, item_height : CInt, size : nk_vec2)(using Zone): CInt = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, (__ptr_0 + 0))

def nk_combo_separator(ctx : Ptr[nk_context], items_separated_by_separator : CString, separator : CInt, selected : CInt, count : CInt, item_height : CInt, size : Ptr[nk_vec2]): CInt = 
  __sn_wrap_nuklear_nk_combo_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, size)

def nk_combo_string(ctx : Ptr[nk_context], items_separated_by_zeros : CString, selected : CInt, count : CInt, item_height : CInt, size : nk_vec2)(using Zone): CInt = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combo_string(ctx, items_separated_by_zeros, selected, count, item_height, (__ptr_0 + 0))

def nk_combo_string(ctx : Ptr[nk_context], items_separated_by_zeros : CString, selected : CInt, count : CInt, item_height : CInt, size : Ptr[nk_vec2]): CInt = 
  __sn_wrap_nuklear_nk_combo_string(ctx, items_separated_by_zeros, selected, count, item_height, size)

def nk_combobox(ctx : Ptr[nk_context], items : Ptr[CString], count : CInt, selected : Ptr[CInt], item_height : CInt, size : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_combobox(ctx, items, count, selected, item_height, size)

def nk_combobox(ctx : Ptr[nk_context], items : Ptr[CString], count : CInt, selected : Ptr[CInt], item_height : CInt, size : nk_vec2)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combobox(ctx, items, count, selected, item_height, (__ptr_0 + 0))

def nk_combobox_callback(ctx : Ptr[nk_context], item_getter : CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit], userdata : Ptr[Byte], selected : Ptr[CInt], count : CInt, item_height : CInt, size : nk_vec2)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combobox_callback(ctx, item_getter, userdata, selected, count, item_height, (__ptr_0 + 0))

def nk_combobox_callback(ctx : Ptr[nk_context], item_getter : CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit], userdata : Ptr[Byte], selected : Ptr[CInt], count : CInt, item_height : CInt, size : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_combobox_callback(ctx, item_getter, userdata, selected, count, item_height, size)

def nk_combobox_separator(ctx : Ptr[nk_context], items_separated_by_separator : CString, separator : CInt, selected : Ptr[CInt], count : CInt, item_height : CInt, size : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_combobox_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, size)

def nk_combobox_separator(ctx : Ptr[nk_context], items_separated_by_separator : CString, separator : CInt, selected : Ptr[CInt], count : CInt, item_height : CInt, size : nk_vec2)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combobox_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, (__ptr_0 + 0))

def nk_combobox_string(ctx : Ptr[nk_context], items_separated_by_zeros : CString, selected : Ptr[CInt], count : CInt, item_height : CInt, size : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_combobox_string(ctx, items_separated_by_zeros, selected, count, item_height, size)

def nk_combobox_string(ctx : Ptr[nk_context], items_separated_by_zeros : CString, selected : Ptr[CInt], count : CInt, item_height : CInt, size : nk_vec2)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_combobox_string(ctx, items_separated_by_zeros, selected, count, item_height, (__ptr_0 + 0))

def nk_contextual_begin(ctx : Ptr[nk_context], flags : nk_flags, size : Ptr[nk_vec2], trigger_bounds : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_contextual_begin(ctx, flags, size, trigger_bounds)

def nk_contextual_begin(ctx : Ptr[nk_context], flags : nk_flags, size : nk_vec2, trigger_bounds : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_1 + 0) = size
  !(__ptr_0 + 0) = trigger_bounds
  __sn_wrap_nuklear_nk_contextual_begin(ctx, flags, (__ptr_1 + 0), (__ptr_0 + 0))

def nk_contextual_item_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], label : CString, align : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_contextual_item_image_label(ctx, img, label, align)

def nk_contextual_item_image_label(ctx : Ptr[nk_context], img : nk_image, label : CString, align : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_contextual_item_image_label(ctx, (__ptr_0 + 0), label, align)

def nk_contextual_item_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, len : CInt, align : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_contextual_item_image_text(ctx, img, text, len, align)

def nk_contextual_item_image_text(ctx : Ptr[nk_context], img : nk_image, text : CString, len : CInt, align : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_contextual_item_image_text(ctx, (__ptr_0 + 0), text, len, align)

def nk_do_button(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], r : Ptr[nk_rect], style : Ptr[nk_style_button], in : Ptr[nk_input], behavior : nk_button_behavior, content : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_do_button(state, out, r, style, in, behavior, content)

def nk_do_button(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], r : nk_rect, style : Ptr[nk_style_button], in : Ptr[nk_input], behavior : nk_button_behavior, content : Ptr[nk_rect])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_do_button(state, out, (__ptr_0 + 0), style, in, behavior, content)

def nk_do_button_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], img : Ptr[nk_image], b : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input]): nk_bool = 
  __sn_wrap_nuklear_nk_do_button_image(state, out, bounds, img, b, style, in)

def nk_do_button_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, img : nk_image, b : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_1 + 0) = bounds
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_do_button_image(state, out, (__ptr_1 + 0), (__ptr_0 + 0), b, style, in)

def nk_do_button_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], symbol : nk_symbol_type, behavior : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = 
  __sn_wrap_nuklear_nk_do_button_symbol(state, out, bounds, symbol, behavior, style, in, font)

def nk_do_button_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, symbol : nk_symbol_type, behavior : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_button_symbol(state, out, (__ptr_0 + 0), symbol, behavior, style, in, font)

def nk_do_button_text(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, string : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_button_text(state, out, (__ptr_0 + 0), string, len, align, behavior, style, in, font)

def nk_do_button_text(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], string : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = 
  __sn_wrap_nuklear_nk_do_button_text(state, out, bounds, string, len, align, behavior, style, in, font)

def nk_do_button_text_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], img : Ptr[nk_image], str : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], font : Ptr[nk_user_font], in : Ptr[nk_input]): nk_bool = 
  __sn_wrap_nuklear_nk_do_button_text_image(state, out, bounds, img, str, len, align, behavior, style, font, in)

def nk_do_button_text_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, img : nk_image, str : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], font : Ptr[nk_user_font], in : Ptr[nk_input])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_1 + 0) = bounds
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_do_button_text_image(state, out, (__ptr_1 + 0), (__ptr_0 + 0), str, len, align, behavior, style, font, in)

def nk_do_button_text_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, symbol : nk_symbol_type, str : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], font : Ptr[nk_user_font], in : Ptr[nk_input])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_button_text_symbol(state, out, (__ptr_0 + 0), symbol, str, len, align, behavior, style, font, in)

def nk_do_button_text_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], symbol : nk_symbol_type, str : CString, len : CInt, align : nk_flags, behavior : nk_button_behavior, style : Ptr[nk_style_button], font : Ptr[nk_user_font], in : Ptr[nk_input]): nk_bool = 
  __sn_wrap_nuklear_nk_do_button_text_symbol(state, out, bounds, symbol, str, len, align, behavior, style, font, in)

def nk_do_color_picker(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], col : Ptr[nk_colorf], fmt : nk_color_format, bounds : Ptr[nk_rect], padding : Ptr[nk_vec2], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = 
  __sn_wrap_nuklear_nk_do_color_picker(state, out, col, fmt, bounds, padding, in, font)

def nk_do_color_picker(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], col : Ptr[nk_colorf], fmt : nk_color_format, bounds : nk_rect, padding : nk_vec2, in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = bounds
  !(__ptr_1 + 0) = padding
  __sn_wrap_nuklear_nk_do_color_picker(state, out, col, fmt, (__ptr_0 + 0), (__ptr_1 + 0), in, font)

def nk_do_edit(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, flags : nk_flags, filter : nk_plugin_filter, edit : Ptr[nk_text_edit], style : Ptr[nk_style_edit], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): nk_flags = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_edit(state, out, (__ptr_0 + 0), flags, filter, edit, style, in, font)

def nk_do_edit(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], flags : nk_flags, filter : nk_plugin_filter, edit : Ptr[nk_text_edit], style : Ptr[nk_style_edit], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_flags = 
  __sn_wrap_nuklear_nk_do_edit(state, out, bounds, flags, filter, edit, style, in, font)

def nk_do_progress(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, value : nk_size, max : nk_size, modifiable : nk_bool, style : Ptr[nk_style_progress], in : Ptr[nk_input])(using Zone): nk_size = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_progress(state, out, (__ptr_0 + 0), value, max, modifiable, style, in)

def nk_do_progress(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], value : nk_size, max : nk_size, modifiable : nk_bool, style : Ptr[nk_style_progress], in : Ptr[nk_input]): nk_size = 
  __sn_wrap_nuklear_nk_do_progress(state, out, bounds, value, max, modifiable, style, in)

def nk_do_property(ws : Ptr[nk_flags], out : Ptr[nk_command_buffer], property : Ptr[nk_rect], name : CString, variant : Ptr[nk_property_variant], inc_per_pixel : Float, buffer : CString, len : Ptr[CInt], state : Ptr[CInt], cursor : Ptr[CInt], select_begin : Ptr[CInt], select_end : Ptr[CInt], style : Ptr[nk_style_property], filter : nk_property_filter, in : Ptr[nk_input], font : Ptr[nk_user_font], text_edit : Ptr[nk_text_edit], behavior : nk_button_behavior): Unit = 
  __sn_wrap_nuklear_nk_do_property(ws, out, property, name, variant, inc_per_pixel, buffer, len, state, cursor, select_begin, select_end, style, filter, in, font, text_edit, behavior)

def nk_do_property(ws : Ptr[nk_flags], out : Ptr[nk_command_buffer], property : nk_rect, name : CString, variant : Ptr[nk_property_variant], inc_per_pixel : Float, buffer : CString, len : Ptr[CInt], state : Ptr[CInt], cursor : Ptr[CInt], select_begin : Ptr[CInt], select_end : Ptr[CInt], style : Ptr[nk_style_property], filter : nk_property_filter, in : Ptr[nk_input], font : Ptr[nk_user_font], text_edit : Ptr[nk_text_edit], behavior : nk_button_behavior)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = property
  __sn_wrap_nuklear_nk_do_property(ws, out, (__ptr_0 + 0), name, variant, inc_per_pixel, buffer, len, state, cursor, select_begin, select_end, style, filter, in, font, text_edit, behavior)

def nk_do_scrollbarh(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], scroll : Ptr[nk_rect], has_scrolling : CInt, offset : Float, target : Float, step : Float, button_pixel_inc : Float, style : Ptr[nk_style_scrollbar], in : Ptr[nk_input], font : Ptr[nk_user_font]): Float = 
  __sn_wrap_nuklear_nk_do_scrollbarh(state, out, scroll, has_scrolling, offset, target, step, button_pixel_inc, style, in, font)

def nk_do_scrollbarh(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], scroll : nk_rect, has_scrolling : CInt, offset : Float, target : Float, step : Float, button_pixel_inc : Float, style : Ptr[nk_style_scrollbar], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): Float = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = scroll
  __sn_wrap_nuklear_nk_do_scrollbarh(state, out, (__ptr_0 + 0), has_scrolling, offset, target, step, button_pixel_inc, style, in, font)

def nk_do_scrollbarv(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], scroll : Ptr[nk_rect], has_scrolling : CInt, offset : Float, target : Float, step : Float, button_pixel_inc : Float, style : Ptr[nk_style_scrollbar], in : Ptr[nk_input], font : Ptr[nk_user_font]): Float = 
  __sn_wrap_nuklear_nk_do_scrollbarv(state, out, scroll, has_scrolling, offset, target, step, button_pixel_inc, style, in, font)

def nk_do_scrollbarv(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], scroll : nk_rect, has_scrolling : CInt, offset : Float, target : Float, step : Float, button_pixel_inc : Float, style : Ptr[nk_style_scrollbar], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): Float = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = scroll
  __sn_wrap_nuklear_nk_do_scrollbarv(state, out, (__ptr_0 + 0), has_scrolling, offset, target, step, button_pixel_inc, style, in, font)

def nk_do_selectable(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = 
  __sn_wrap_nuklear_nk_do_selectable(state, out, bounds, str, len, align, value, style, in, font)

def nk_do_selectable(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_selectable(state, out, (__ptr_0 + 0), str, len, align, value, style, in, font)

def nk_do_selectable_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], img : Ptr[nk_image], style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = 
  __sn_wrap_nuklear_nk_do_selectable_image(state, out, bounds, str, len, align, value, img, style, in, font)

def nk_do_selectable_image(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], img : Ptr[nk_image], style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_selectable_image(state, out, (__ptr_0 + 0), str, len, align, value, img, style, in, font)

def nk_do_selectable_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], sym : nk_symbol_type, style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_selectable_symbol(state, out, (__ptr_0 + 0), str, len, align, value, sym, style, in, font)

def nk_do_selectable_symbol(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool], sym : nk_symbol_type, style : Ptr[nk_style_selectable], in : Ptr[nk_input], font : Ptr[nk_user_font]): nk_bool = 
  __sn_wrap_nuklear_nk_do_selectable_symbol(state, out, bounds, str, len, align, value, sym, style, in, font)

def nk_do_slider(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : nk_rect, min : Float, `val` : Float, max : Float, step : Float, style : Ptr[nk_style_slider], in : Ptr[nk_input], font : Ptr[nk_user_font])(using Zone): Float = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_do_slider(state, out, (__ptr_0 + 0), min, `val`, max, step, style, in, font)

def nk_do_slider(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], bounds : Ptr[nk_rect], min : Float, `val` : Float, max : Float, step : Float, style : Ptr[nk_style_slider], in : Ptr[nk_input], font : Ptr[nk_user_font]): Float = 
  __sn_wrap_nuklear_nk_do_slider(state, out, bounds, min, `val`, max, step, style, in, font)

def nk_do_toggle(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], r : nk_rect, active : Ptr[nk_bool], str : CString, len : CInt, `type` : nk_toggle_type, style : Ptr[nk_style_toggle], in : Ptr[nk_input], font : Ptr[nk_user_font], widget_alignment : nk_flags, text_alignment : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_do_toggle(state, out, (__ptr_0 + 0), active, str, len, `type`, style, in, font, widget_alignment, text_alignment)

def nk_do_toggle(state : Ptr[nk_flags], out : Ptr[nk_command_buffer], r : Ptr[nk_rect], active : Ptr[nk_bool], str : CString, len : CInt, `type` : nk_toggle_type, style : Ptr[nk_style_toggle], in : Ptr[nk_input], font : Ptr[nk_user_font], widget_alignment : nk_flags, text_alignment : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_do_toggle(state, out, r, active, str, len, `type`, style, in, font, widget_alignment, text_alignment)

def nk_drag_behavior(state : Ptr[nk_flags], in : Ptr[nk_input], drag : nk_rect, variant : Ptr[nk_property_variant], inc_per_pixel : Float)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = drag
  __sn_wrap_nuklear_nk_drag_behavior(state, in, (__ptr_0 + 0), variant, inc_per_pixel)

def nk_drag_behavior(state : Ptr[nk_flags], in : Ptr[nk_input], drag : Ptr[nk_rect], variant : Ptr[nk_property_variant], inc_per_pixel : Float): Unit = 
  __sn_wrap_nuklear_nk_drag_behavior(state, in, drag, variant, inc_per_pixel)

def nk_draw_color_picker(o : Ptr[nk_command_buffer], matrix : Ptr[nk_rect], hue_bar : Ptr[nk_rect], alpha_bar : Ptr[nk_rect], col : nk_colorf)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_draw_color_picker(o, matrix, hue_bar, alpha_bar, (__ptr_0 + 0))

def nk_draw_color_picker(o : Ptr[nk_command_buffer], matrix : Ptr[nk_rect], hue_bar : Ptr[nk_rect], alpha_bar : Ptr[nk_rect], col : Ptr[nk_colorf]): Unit = 
  __sn_wrap_nuklear_nk_draw_color_picker(o, matrix, hue_bar, alpha_bar, col)

def nk_draw_image(b : Ptr[nk_command_buffer], r : nk_rect, img : Ptr[nk_image], col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = r
  !(__ptr_1 + 0) = col
  __sn_wrap_nuklear_nk_draw_image(b, (__ptr_0 + 0), img, (__ptr_1 + 0))

def nk_draw_image(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], img : Ptr[nk_image], col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_draw_image(b, r, img, col)

def nk_draw_nine_slice(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], slc : Ptr[nk_nine_slice], col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_draw_nine_slice(b, r, slc, col)

def nk_draw_nine_slice(b : Ptr[nk_command_buffer], r : nk_rect, slc : Ptr[nk_nine_slice], col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = r
  !(__ptr_1 + 0) = col
  __sn_wrap_nuklear_nk_draw_nine_slice(b, (__ptr_0 + 0), slc, (__ptr_1 + 0))

def nk_draw_symbol(out : Ptr[nk_command_buffer], `type` : nk_symbol_type, content : Ptr[nk_rect], background : Ptr[nk_color], foreground : Ptr[nk_color], border_width : Float, font : Ptr[nk_user_font]): Unit = 
  __sn_wrap_nuklear_nk_draw_symbol(out, `type`, content, background, foreground, border_width, font)

def nk_draw_symbol(out : Ptr[nk_command_buffer], `type` : nk_symbol_type, content : nk_rect, background : nk_color, foreground : nk_color, border_width : Float, font : Ptr[nk_user_font])(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](2)
  !(__ptr_0 + 0) = content
  !(__ptr_1 + 0) = background
  !(__ptr_1 + 1) = foreground
  __sn_wrap_nuklear_nk_draw_symbol(out, `type`, (__ptr_0 + 0), (__ptr_1 + 0), (__ptr_1 + 1), border_width, font)

def nk_draw_text(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], string : CString, length : CInt, font : Ptr[nk_user_font], bg : Ptr[nk_color], fg : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_draw_text(b, r, string, length, font, bg, fg)

def nk_draw_text(b : Ptr[nk_command_buffer], r : nk_rect, string : CString, length : CInt, font : Ptr[nk_user_font], bg : nk_color, fg : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](2)
  !(__ptr_0 + 0) = r
  !(__ptr_1 + 0) = bg
  !(__ptr_1 + 1) = fg
  __sn_wrap_nuklear_nk_draw_text(b, (__ptr_0 + 0), string, length, font, (__ptr_1 + 0), (__ptr_1 + 1))

def nk_edit_draw_text(out : Ptr[nk_command_buffer], style : Ptr[nk_style_edit], pos_x : Float, pos_y : Float, x_offset : Float, text : CString, byte_len : CInt, row_height : Float, font : Ptr[nk_user_font], background : Ptr[nk_color], foreground : Ptr[nk_color], is_selected : nk_bool): Unit = 
  __sn_wrap_nuklear_nk_edit_draw_text(out, style, pos_x, pos_y, x_offset, text, byte_len, row_height, font, background, foreground, is_selected)

def nk_edit_draw_text(out : Ptr[nk_command_buffer], style : Ptr[nk_style_edit], pos_x : Float, pos_y : Float, x_offset : Float, text : CString, byte_len : CInt, row_height : Float, font : Ptr[nk_user_font], background : nk_color, foreground : nk_color, is_selected : nk_bool)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](2)
  !(__ptr_0 + 0) = background
  !(__ptr_0 + 1) = foreground
  __sn_wrap_nuklear_nk_edit_draw_text(out, style, pos_x, pos_y, x_offset, text, byte_len, row_height, font, (__ptr_0 + 0), (__ptr_0 + 1), is_selected)

def nk_fill_arc(b : Ptr[nk_command_buffer], cx : Float, cy : Float, radius : Float, a_min : Float, a_max : Float, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = c
  __sn_wrap_nuklear_nk_fill_arc(b, cx, cy, radius, a_min, a_max, (__ptr_0 + 0))

def nk_fill_arc(b : Ptr[nk_command_buffer], cx : Float, cy : Float, radius : Float, a_min : Float, a_max : Float, c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_fill_arc(b, cx, cy, radius, a_min, a_max, c)

def nk_fill_circle(b : Ptr[nk_command_buffer], r : nk_rect, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = r
  !(__ptr_1 + 0) = c
  __sn_wrap_nuklear_nk_fill_circle(b, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_fill_circle(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_fill_circle(b, r, c)

def nk_fill_polygon(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_fill_polygon(b, points, point_count, col)

def nk_fill_polygon(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_fill_polygon(b, points, point_count, (__ptr_0 + 0))

def nk_fill_rect(b : Ptr[nk_command_buffer], rect : nk_rect, rounding : Float, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = rect
  !(__ptr_1 + 0) = c
  __sn_wrap_nuklear_nk_fill_rect(b, (__ptr_0 + 0), rounding, (__ptr_1 + 0))

def nk_fill_rect(b : Ptr[nk_command_buffer], rect : Ptr[nk_rect], rounding : Float, c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_fill_rect(b, rect, rounding, c)

def nk_fill_rect_multi_color(b : Ptr[nk_command_buffer], rect : Ptr[nk_rect], left : Ptr[nk_color], top : Ptr[nk_color], right : Ptr[nk_color], bottom : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_fill_rect_multi_color(b, rect, left, top, right, bottom)

def nk_fill_rect_multi_color(b : Ptr[nk_command_buffer], rect : nk_rect, left : nk_color, top : nk_color, right : nk_color, bottom : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](4)
  !(__ptr_0 + 0) = rect
  !(__ptr_1 + 0) = left
  !(__ptr_1 + 1) = top
  !(__ptr_1 + 2) = right
  !(__ptr_1 + 3) = bottom
  __sn_wrap_nuklear_nk_fill_rect_multi_color(b, (__ptr_0 + 0), (__ptr_1 + 0), (__ptr_1 + 1), (__ptr_1 + 2), (__ptr_1 + 3))

def nk_fill_triangle(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, x2 : Float, y2 : Float, c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_fill_triangle(b, x0, y0, x1, y1, x2, y2, c)

def nk_fill_triangle(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, x2 : Float, y2 : Float, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = c
  __sn_wrap_nuklear_nk_fill_triangle(b, x0, y0, x1, y1, x2, y2, (__ptr_0 + 0))

def nk_get_null_rect()(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_get_null_rect((__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_get_null_rect()(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_get_null_rect(__return)

def nk_hsv(h : CInt, s : CInt, v : CInt)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsv(h, s, v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsv(h : CInt, s : CInt, v : CInt)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsv(h, s, v, __return)

def nk_hsv_bv(c : Ptr[nk_byte])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsv_bv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsv_bv(c : Ptr[nk_byte])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsv_bv(c, __return)

def nk_hsv_f(h : Float, s : Float, v : Float)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsv_f(h, s, v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsv_f(h : Float, s : Float, v : Float)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsv_f(h, s, v, __return)

def nk_hsv_fv(c : Ptr[Float])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsv_fv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsv_fv(c : Ptr[Float])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsv_fv(c, __return)

def nk_hsv_iv(c : Ptr[CInt])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsv_iv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsv_iv(c : Ptr[CInt])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsv_iv(c, __return)

def nk_hsva(h : CInt, s : CInt, v : CInt, a : CInt)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsva(h, s, v, a, __return)

def nk_hsva(h : CInt, s : CInt, v : CInt, a : CInt)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsva(h, s, v, a, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsva_bv(c : Ptr[nk_byte])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsva_bv(c, __return)

def nk_hsva_bv(c : Ptr[nk_byte])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsva_bv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsva_colorf(h : Float, s : Float, v : Float, a : Float)(using Zone): nk_colorf = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  __sn_wrap_nuklear_nk_hsva_colorf(h, s, v, a, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsva_colorf(h : Float, s : Float, v : Float, a : Float)(__return : Ptr[nk_colorf]): Unit = 
  __sn_wrap_nuklear_nk_hsva_colorf(h, s, v, a, __return)

def nk_hsva_colorfv(c : Ptr[Float])(using Zone): nk_colorf = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  __sn_wrap_nuklear_nk_hsva_colorfv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsva_colorfv(c : Ptr[Float])(__return : Ptr[nk_colorf]): Unit = 
  __sn_wrap_nuklear_nk_hsva_colorfv(c, __return)

def nk_hsva_f(h : Float, s : Float, v : Float, a : Float)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsva_f(h, s, v, a, __return)

def nk_hsva_f(h : Float, s : Float, v : Float, a : Float)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsva_f(h, s, v, a, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsva_fv(c : Ptr[Float])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsva_fv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_hsva_fv(c : Ptr[Float])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsva_fv(c, __return)

def nk_hsva_iv(c : Ptr[CInt])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_hsva_iv(c, __return)

def nk_hsva_iv(c : Ptr[CInt])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_hsva_iv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_image(ctx : Ptr[nk_context], img : Ptr[nk_image]): Unit = 
  __sn_wrap_nuklear_nk_image(ctx, img)

def nk_image(ctx : Ptr[nk_context], img : nk_image)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_image(ctx, (__ptr_0 + 0))

def nk_image_color(ctx : Ptr[nk_context], img : nk_image, col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = img
  !(__ptr_1 + 0) = col
  __sn_wrap_nuklear_nk_image_color(ctx, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_image_color(ctx : Ptr[nk_context], img : Ptr[nk_image], col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_image_color(ctx, img, col)

def nk_image_handle(handle : nk_handle)(__return : Ptr[nk_image]): Unit = 
  __sn_wrap_nuklear_nk_image_handle(handle, __return)

def nk_image_handle(handle : nk_handle)(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  __sn_wrap_nuklear_nk_image_handle(handle, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_image_id(id : CInt)(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  __sn_wrap_nuklear_nk_image_id(id, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_image_id(id : CInt)(__return : Ptr[nk_image]): Unit = 
  __sn_wrap_nuklear_nk_image_id(id, __return)

def nk_image_ptr(ptr : Ptr[Byte])(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  __sn_wrap_nuklear_nk_image_ptr(ptr, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_image_ptr(ptr : Ptr[Byte])(__return : Ptr[nk_image]): Unit = 
  __sn_wrap_nuklear_nk_image_ptr(ptr, __return)

def nk_input_any_mouse_click_in_rect(in : Ptr[nk_input], b : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = b
  __sn_wrap_nuklear_nk_input_any_mouse_click_in_rect(in, (__ptr_0 + 0))

def nk_input_any_mouse_click_in_rect(in : Ptr[nk_input], b : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_input_any_mouse_click_in_rect(in, b)

def nk_input_has_mouse_click_down_in_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect], down : nk_bool): nk_bool = 
  __sn_wrap_nuklear_nk_input_has_mouse_click_down_in_rect(i, id, b, down)

def nk_input_has_mouse_click_down_in_rect(i : Ptr[nk_input], id : nk_buttons, b : nk_rect, down : nk_bool)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = b
  __sn_wrap_nuklear_nk_input_has_mouse_click_down_in_rect(i, id, (__ptr_0 + 0), down)

def nk_input_has_mouse_click_in_button_rect(i : Ptr[nk_input], id : nk_buttons, b : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = b
  __sn_wrap_nuklear_nk_input_has_mouse_click_in_button_rect(i, id, (__ptr_0 + 0))

def nk_input_has_mouse_click_in_button_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_input_has_mouse_click_in_button_rect(i, id, b)

def nk_input_has_mouse_click_in_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_input_has_mouse_click_in_rect(i, id, b)

def nk_input_has_mouse_click_in_rect(i : Ptr[nk_input], id : nk_buttons, b : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = b
  __sn_wrap_nuklear_nk_input_has_mouse_click_in_rect(i, id, (__ptr_0 + 0))

def nk_input_is_mouse_click_down_in_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect], down : nk_bool): nk_bool = 
  __sn_wrap_nuklear_nk_input_is_mouse_click_down_in_rect(i, id, b, down)

def nk_input_is_mouse_click_down_in_rect(i : Ptr[nk_input], id : nk_buttons, b : nk_rect, down : nk_bool)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = b
  __sn_wrap_nuklear_nk_input_is_mouse_click_down_in_rect(i, id, (__ptr_0 + 0), down)

def nk_input_is_mouse_click_in_rect(i : Ptr[nk_input], id : nk_buttons, b : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = b
  __sn_wrap_nuklear_nk_input_is_mouse_click_in_rect(i, id, (__ptr_0 + 0))

def nk_input_is_mouse_click_in_rect(i : Ptr[nk_input], id : nk_buttons, b : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_input_is_mouse_click_in_rect(i, id, b)

def nk_input_is_mouse_hovering_rect(i : Ptr[nk_input], rect : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_input_is_mouse_hovering_rect(i, rect)

def nk_input_is_mouse_hovering_rect(i : Ptr[nk_input], rect : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = rect
  __sn_wrap_nuklear_nk_input_is_mouse_hovering_rect(i, (__ptr_0 + 0))

def nk_input_is_mouse_prev_hovering_rect(i : Ptr[nk_input], rect : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_input_is_mouse_prev_hovering_rect(i, rect)

def nk_input_is_mouse_prev_hovering_rect(i : Ptr[nk_input], rect : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = rect
  __sn_wrap_nuklear_nk_input_is_mouse_prev_hovering_rect(i, (__ptr_0 + 0))

def nk_input_mouse_clicked(i : Ptr[nk_input], id : nk_buttons, rect : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_input_mouse_clicked(i, id, rect)

def nk_input_mouse_clicked(i : Ptr[nk_input], id : nk_buttons, rect : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = rect
  __sn_wrap_nuklear_nk_input_mouse_clicked(i, id, (__ptr_0 + 0))

def nk_input_scroll(ctx : Ptr[nk_context], `val` : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_input_scroll(ctx, `val`)

def nk_input_scroll(ctx : Ptr[nk_context], `val` : nk_vec2)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = `val`
  __sn_wrap_nuklear_nk_input_scroll(ctx, (__ptr_0 + 0))

def nk_label_colored(ctx : Ptr[nk_context], str : CString, align : nk_flags, color : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_nuklear_nk_label_colored(ctx, str, align, (__ptr_0 + 0))

def nk_label_colored(ctx : Ptr[nk_context], str : CString, align : nk_flags, color : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_label_colored(ctx, str, align, color)

def nk_label_colored_wrap(ctx : Ptr[nk_context], str : CString, color : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_nuklear_nk_label_colored_wrap(ctx, str, (__ptr_0 + 0))

def nk_label_colored_wrap(ctx : Ptr[nk_context], str : CString, color : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_label_colored_wrap(ctx, str, color)

def nk_layout_space_bounds(ctx : Ptr[nk_context])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_layout_space_bounds(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_layout_space_bounds(ctx : Ptr[nk_context])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_layout_space_bounds(ctx, __return)

def nk_layout_space_push(ctx : Ptr[nk_context], rect : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_layout_space_push(ctx, rect)

def nk_layout_space_push(ctx : Ptr[nk_context], rect : nk_rect)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = rect
  __sn_wrap_nuklear_nk_layout_space_push(ctx, (__ptr_0 + 0))

def nk_layout_space_rect_to_local(ctx : Ptr[nk_context], ret : Ptr[nk_rect])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_layout_space_rect_to_local(ctx, ret, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_layout_space_rect_to_local(ctx : Ptr[nk_context], ret : Ptr[nk_rect])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_layout_space_rect_to_local(ctx, ret, __return)

def nk_layout_space_rect_to_local(ctx : Ptr[nk_context], ret : nk_rect)(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](2)
  !(__ptr_0 + 0) = ret
  __sn_wrap_nuklear_nk_layout_space_rect_to_local(ctx, (__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def nk_layout_space_rect_to_screen(ctx : Ptr[nk_context], ret : Ptr[nk_rect])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_layout_space_rect_to_screen(ctx, ret, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_layout_space_rect_to_screen(ctx : Ptr[nk_context], ret : Ptr[nk_rect])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_layout_space_rect_to_screen(ctx, ret, __return)

def nk_layout_space_rect_to_screen(ctx : Ptr[nk_context], ret : nk_rect)(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](2)
  !(__ptr_0 + 0) = ret
  __sn_wrap_nuklear_nk_layout_space_rect_to_screen(ctx, (__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def nk_layout_space_to_local(ctx : Ptr[nk_context], ret : Ptr[nk_vec2])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_layout_space_to_local(ctx, ret, __return)

def nk_layout_space_to_local(ctx : Ptr[nk_context], ret : nk_vec2)(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](2)
  !(__ptr_0 + 0) = ret
  __sn_wrap_nuklear_nk_layout_space_to_local(ctx, (__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def nk_layout_space_to_local(ctx : Ptr[nk_context], ret : Ptr[nk_vec2])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_layout_space_to_local(ctx, ret, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_layout_space_to_screen(ctx : Ptr[nk_context], ret : Ptr[nk_vec2])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_layout_space_to_screen(ctx, ret, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_layout_space_to_screen(ctx : Ptr[nk_context], ret : Ptr[nk_vec2])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_layout_space_to_screen(ctx, ret, __return)

def nk_layout_space_to_screen(ctx : Ptr[nk_context], ret : nk_vec2)(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](2)
  !(__ptr_0 + 0) = ret
  __sn_wrap_nuklear_nk_layout_space_to_screen(ctx, (__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def nk_layout_widget_bounds(ctx : Ptr[nk_context])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_layout_widget_bounds(ctx, __return)

def nk_layout_widget_bounds(ctx : Ptr[nk_context])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_layout_widget_bounds(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_menu_begin(ctx : Ptr[nk_context], win : Ptr[nk_window], id : CString, is_clicked : CInt, header : Ptr[nk_rect], size : Ptr[nk_vec2]): CInt = 
  __sn_wrap_nuklear_nk_menu_begin(ctx, win, id, is_clicked, header, size)

def nk_menu_begin(ctx : Ptr[nk_context], win : Ptr[nk_window], id : CString, is_clicked : CInt, header : nk_rect, size : nk_vec2)(using Zone): CInt = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = header
  !(__ptr_1 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin(ctx, win, id, is_clicked, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_menu_begin_image(ctx : Ptr[nk_context], id : CString, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_menu_begin_image(ctx, id, img, size)

def nk_menu_begin_image(ctx : Ptr[nk_context], id : CString, img : nk_image, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = img
  !(__ptr_1 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin_image(ctx, id, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_menu_begin_image_label(ctx : Ptr[nk_context], title : CString, align : nk_flags, img : nk_image, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = img
  !(__ptr_1 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin_image_label(ctx, title, align, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_menu_begin_image_label(ctx : Ptr[nk_context], title : CString, align : nk_flags, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_menu_begin_image_label(ctx, title, align, img, size)

def nk_menu_begin_image_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, img : Ptr[nk_image], size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_menu_begin_image_text(ctx, title, len, align, img, size)

def nk_menu_begin_image_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, img : nk_image, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = img
  !(__ptr_1 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin_image_text(ctx, title, len, align, (__ptr_0 + 0), (__ptr_1 + 0))

def nk_menu_begin_label(ctx : Ptr[nk_context], text : CString, align : nk_flags, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin_label(ctx, text, align, (__ptr_0 + 0))

def nk_menu_begin_label(ctx : Ptr[nk_context], text : CString, align : nk_flags, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_menu_begin_label(ctx, text, align, size)

def nk_menu_begin_symbol(ctx : Ptr[nk_context], id : CString, sym : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_menu_begin_symbol(ctx, id, sym, size)

def nk_menu_begin_symbol(ctx : Ptr[nk_context], id : CString, sym : nk_symbol_type, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin_symbol(ctx, id, sym, (__ptr_0 + 0))

def nk_menu_begin_symbol_label(ctx : Ptr[nk_context], title : CString, align : nk_flags, sym : nk_symbol_type, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin_symbol_label(ctx, title, align, sym, (__ptr_0 + 0))

def nk_menu_begin_symbol_label(ctx : Ptr[nk_context], title : CString, align : nk_flags, sym : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_menu_begin_symbol_label(ctx, title, align, sym, size)

def nk_menu_begin_symbol_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, sym : nk_symbol_type, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin_symbol_text(ctx, title, len, align, sym, (__ptr_0 + 0))

def nk_menu_begin_symbol_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, sym : nk_symbol_type, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_menu_begin_symbol_text(ctx, title, len, align, sym, size)

def nk_menu_begin_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, size : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_menu_begin_text(ctx, title, len, align, size)

def nk_menu_begin_text(ctx : Ptr[nk_context], title : CString, len : CInt, align : nk_flags, size : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_menu_begin_text(ctx, title, len, align, (__ptr_0 + 0))

def nk_menu_item_image_label(ctx : Ptr[nk_context], img : nk_image, label : CString, align : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_menu_item_image_label(ctx, (__ptr_0 + 0), label, align)

def nk_menu_item_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], label : CString, align : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_menu_item_image_label(ctx, img, label, align)

def nk_menu_item_image_text(ctx : Ptr[nk_context], img : nk_image, text : CString, len : CInt, align : nk_flags)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_menu_item_image_text(ctx, (__ptr_0 + 0), text, len, align)

def nk_menu_item_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], text : CString, len : CInt, align : nk_flags): nk_bool = 
  __sn_wrap_nuklear_nk_menu_item_image_text(ctx, img, text, len, align)

def nk_nine_slice_handle(handle : nk_handle, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  __sn_wrap_nuklear_nk_nine_slice_handle(handle, l, t, r, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_nine_slice_handle(handle : nk_handle, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(__return : Ptr[nk_nine_slice]): Unit = 
  __sn_wrap_nuklear_nk_nine_slice_handle(handle, l, t, r, b, __return)

def nk_nine_slice_id(id : CInt, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(__return : Ptr[nk_nine_slice]): Unit = 
  __sn_wrap_nuklear_nk_nine_slice_id(id, l, t, r, b, __return)

def nk_nine_slice_id(id : CInt, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  __sn_wrap_nuklear_nk_nine_slice_id(id, l, t, r, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_nine_slice_ptr(ptr : Ptr[Byte], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  __sn_wrap_nuklear_nk_nine_slice_ptr(ptr, l, t, r, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_nine_slice_ptr(ptr : Ptr[Byte], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(__return : Ptr[nk_nine_slice]): Unit = 
  __sn_wrap_nuklear_nk_nine_slice_ptr(ptr, l, t, r, b, __return)

def nk_nonblock_begin(ctx : Ptr[nk_context], flags : nk_flags, body : nk_rect, header : nk_rect, panel_type : nk_panel_type)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](2)
  !(__ptr_0 + 0) = body
  !(__ptr_0 + 1) = header
  __sn_wrap_nuklear_nk_nonblock_begin(ctx, flags, (__ptr_0 + 0), (__ptr_0 + 1), panel_type)

def nk_nonblock_begin(ctx : Ptr[nk_context], flags : nk_flags, body : Ptr[nk_rect], header : Ptr[nk_rect], panel_type : nk_panel_type): nk_bool = 
  __sn_wrap_nuklear_nk_nonblock_begin(ctx, flags, body, header, panel_type)

def nk_pad_rect(r : Ptr[nk_rect], pad : Ptr[nk_vec2])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_pad_rect(r, pad, __return)

def nk_pad_rect(r : nk_rect, pad : nk_vec2)(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](2)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = r
  !(__ptr_1 + 0) = pad
  __sn_wrap_nuklear_nk_pad_rect((__ptr_0 + 0), (__ptr_1 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def nk_pad_rect(r : Ptr[nk_rect], pad : Ptr[nk_vec2])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_pad_rect(r, pad, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_panel_get_border_color(style : Ptr[nk_style], `type` : nk_panel_type)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_panel_get_border_color(style, `type`, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_panel_get_border_color(style : Ptr[nk_style], `type` : nk_panel_type)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_panel_get_border_color(style, `type`, __return)

def nk_panel_get_padding(style : Ptr[nk_style], `type` : nk_panel_type)(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_panel_get_padding(style, `type`, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_panel_get_padding(style : Ptr[nk_style], `type` : nk_panel_type)(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_panel_get_padding(style, `type`, __return)

def nk_popup_begin(ctx : Ptr[nk_context], `type` : nk_popup_type, title : CString, flags : nk_flags, rect : nk_rect)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = rect
  __sn_wrap_nuklear_nk_popup_begin(ctx, `type`, title, flags, (__ptr_0 + 0))

def nk_popup_begin(ctx : Ptr[nk_context], `type` : nk_popup_type, title : CString, flags : nk_flags, rect : Ptr[nk_rect]): nk_bool = 
  __sn_wrap_nuklear_nk_popup_begin(ctx, `type`, title, flags, rect)

def nk_progress_behavior(state : Ptr[nk_flags], in : Ptr[nk_input], r : Ptr[nk_rect], cursor : Ptr[nk_rect], max : nk_size, value : nk_size, modifiable : nk_bool): nk_size = 
  __sn_wrap_nuklear_nk_progress_behavior(state, in, r, cursor, max, value, modifiable)

def nk_progress_behavior(state : Ptr[nk_flags], in : Ptr[nk_input], r : nk_rect, cursor : nk_rect, max : nk_size, value : nk_size, modifiable : nk_bool)(using Zone): nk_size = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](2)
  !(__ptr_0 + 0) = r
  !(__ptr_0 + 1) = cursor
  __sn_wrap_nuklear_nk_progress_behavior(state, in, (__ptr_0 + 0), (__ptr_0 + 1), max, value, modifiable)

def nk_property_behavior(ws : Ptr[nk_flags], in : Ptr[nk_input], property : nk_rect, label : nk_rect, edit : nk_rect, empty : nk_rect, state : Ptr[CInt], variant : Ptr[nk_property_variant], inc_per_pixel : Float)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](4)
  !(__ptr_0 + 0) = property
  !(__ptr_0 + 1) = label
  !(__ptr_0 + 2) = edit
  !(__ptr_0 + 3) = empty
  __sn_wrap_nuklear_nk_property_behavior(ws, in, (__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2), (__ptr_0 + 3), state, variant, inc_per_pixel)

def nk_property_behavior(ws : Ptr[nk_flags], in : Ptr[nk_input], property : Ptr[nk_rect], label : Ptr[nk_rect], edit : Ptr[nk_rect], empty : Ptr[nk_rect], state : Ptr[CInt], variant : Ptr[nk_property_variant], inc_per_pixel : Float): Unit = 
  __sn_wrap_nuklear_nk_property_behavior(ws, in, property, label, edit, empty, state, variant, inc_per_pixel)

def nk_property_variant_double(value : Double, min_value : Double, max_value : Double, step : Double)(__return : Ptr[nk_property_variant]): Unit = 
  __sn_wrap_nuklear_nk_property_variant_double(value, min_value, max_value, step, __return)

def nk_property_variant_double(value : Double, min_value : Double, max_value : Double, step : Double)(using Zone): nk_property_variant = 
  val __ptr_0: Ptr[nk_property_variant] = alloc[nk_property_variant](1)
  __sn_wrap_nuklear_nk_property_variant_double(value, min_value, max_value, step, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_property_variant_float(value : Float, min_value : Float, max_value : Float, step : Float)(__return : Ptr[nk_property_variant]): Unit = 
  __sn_wrap_nuklear_nk_property_variant_float(value, min_value, max_value, step, __return)

def nk_property_variant_float(value : Float, min_value : Float, max_value : Float, step : Float)(using Zone): nk_property_variant = 
  val __ptr_0: Ptr[nk_property_variant] = alloc[nk_property_variant](1)
  __sn_wrap_nuklear_nk_property_variant_float(value, min_value, max_value, step, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_property_variant_int(value : CInt, min_value : CInt, max_value : CInt, step : CInt)(using Zone): nk_property_variant = 
  val __ptr_0: Ptr[nk_property_variant] = alloc[nk_property_variant](1)
  __sn_wrap_nuklear_nk_property_variant_int(value, min_value, max_value, step, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_property_variant_int(value : CInt, min_value : CInt, max_value : CInt, step : CInt)(__return : Ptr[nk_property_variant]): Unit = 
  __sn_wrap_nuklear_nk_property_variant_int(value, min_value, max_value, step, __return)

def nk_push_custom(b : Ptr[nk_command_buffer], r : nk_rect, cb : nk_command_custom_callback, usr : nk_handle)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_push_custom(b, (__ptr_0 + 0), cb, usr)

def nk_push_custom(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], cb : nk_command_custom_callback, usr : nk_handle): Unit = 
  __sn_wrap_nuklear_nk_push_custom(b, r, cb, usr)

def nk_push_scissor(b : Ptr[nk_command_buffer], r : nk_rect)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_push_scissor(b, (__ptr_0 + 0))

def nk_push_scissor(b : Ptr[nk_command_buffer], r : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_push_scissor(b, r)

def nk_rect(x : Float, y : Float, w : Float, h : Float)(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_rect(x, y, w, h, __return)

def nk_rect(x : Float, y : Float, w : Float, h : Float)(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_rect(x, y, w, h, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rect_pos(r : Ptr[nk_rect])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_rect_pos(r, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rect_pos(r : nk_rect)(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_rect_pos((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_rect_pos(r : Ptr[nk_rect])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_rect_pos(r, __return)

def nk_rect_size(r : nk_rect)(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_rect_size((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_rect_size(r : Ptr[nk_rect])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_rect_size(r, __return)

def nk_rect_size(r : Ptr[nk_rect])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_rect_size(r, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_recta(pos : nk_vec2, size : nk_vec2)(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_vec2] = alloc[nk_vec2](2)
  !(__ptr_1 + 0) = pos
  !(__ptr_1 + 1) = size
  __sn_wrap_nuklear_nk_recta((__ptr_1 + 0), (__ptr_1 + 1), (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_recta(pos : Ptr[nk_vec2], size : Ptr[nk_vec2])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_recta(pos, size, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_recta(pos : Ptr[nk_vec2], size : Ptr[nk_vec2])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_recta(pos, size, __return)

def nk_recti(x : CInt, y : CInt, w : CInt, h : CInt)(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_recti(x, y, w, h, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_recti(x : CInt, y : CInt, w : CInt, h : CInt)(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_recti(x, y, w, h, __return)

def nk_rectiv(r : Ptr[CInt])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_rectiv(r, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rectiv(r : Ptr[CInt])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_rectiv(r, __return)

def nk_rectv(r : Ptr[Float])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_rectv(r, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rectv(r : Ptr[Float])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_rectv(r, __return)

def nk_rgb(r : CInt, g : CInt, b : CInt)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgb(r, g, b, __return)

def nk_rgb(r : CInt, g : CInt, b : CInt)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgb(r, g, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgb_bv(c : Ptr[nk_byte])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgb_bv(c, __return)

def nk_rgb_bv(c : Ptr[nk_byte])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgb_bv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgb_cf(c : Ptr[nk_colorf])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgb_cf(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgb_cf(c : Ptr[nk_colorf])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgb_cf(c, __return)

def nk_rgb_cf(c : nk_colorf)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = c
  __sn_wrap_nuklear_nk_rgb_cf((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_rgb_f(r : Float, g : Float, b : Float)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgb_f(r, g, b, __return)

def nk_rgb_f(r : Float, g : Float, b : Float)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgb_f(r, g, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgb_factor(col : Ptr[nk_color], factor : Float)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgb_factor(col, factor, __return)

def nk_rgb_factor(col : nk_color, factor : Float)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](2)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_rgb_factor((__ptr_0 + 0), factor, (__ptr_0 + 1))
  !(__ptr_0 + 1)

def nk_rgb_factor(col : Ptr[nk_color], factor : Float)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgb_factor(col, factor, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgb_fv(c : Ptr[Float])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgb_fv(c, __return)

def nk_rgb_fv(c : Ptr[Float])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgb_fv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgb_hex(rgb : CString)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgb_hex(rgb, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgb_hex(rgb : CString)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgb_hex(rgb, __return)

def nk_rgb_iv(c : Ptr[CInt])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgb_iv(c, __return)

def nk_rgb_iv(c : Ptr[CInt])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgb_iv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba(r : CInt, g : CInt, b : CInt, a : CInt)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgba(r, g, b, a, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba(r : CInt, g : CInt, b : CInt, a : CInt)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgba(r, g, b, a, __return)

def nk_rgba_bv(c : Ptr[nk_byte])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgba_bv(c, __return)

def nk_rgba_bv(c : Ptr[nk_byte])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgba_bv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba_cf(c : Ptr[nk_colorf])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgba_cf(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba_cf(c : Ptr[nk_colorf])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgba_cf(c, __return)

def nk_rgba_cf(c : nk_colorf)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_colorf] = alloc[nk_colorf](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = c
  __sn_wrap_nuklear_nk_rgba_cf((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_rgba_f(r : Float, g : Float, b : Float, a : Float)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgba_f(r, g, b, a, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba_f(r : Float, g : Float, b : Float, a : Float)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgba_f(r, g, b, a, __return)

def nk_rgba_fv(c : Ptr[Float])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgba_fv(c, __return)

def nk_rgba_fv(c : Ptr[Float])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgba_fv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba_hex(rgb : CString)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgba_hex(rgb, __return)

def nk_rgba_hex(rgb : CString)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgba_hex(rgb, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba_iv(c : Ptr[CInt])(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgba_iv(c, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba_iv(c : Ptr[CInt])(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgba_iv(c, __return)

def nk_rgba_u32(in : nk_uint)(using Zone): nk_color = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  __sn_wrap_nuklear_nk_rgba_u32(in, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_rgba_u32(in : nk_uint)(__return : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_rgba_u32(in, __return)

def nk_rule_horizontal(ctx : Ptr[nk_context], color : nk_color, rounding : nk_bool)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_nuklear_nk_rule_horizontal(ctx, (__ptr_0 + 0), rounding)

def nk_rule_horizontal(ctx : Ptr[nk_context], color : Ptr[nk_color], rounding : nk_bool): Unit = 
  __sn_wrap_nuklear_nk_rule_horizontal(ctx, color, rounding)

def nk_select_image_label(ctx : Ptr[nk_context], img : nk_image, str : CString, align : nk_flags, value : nk_bool)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_select_image_label(ctx, (__ptr_0 + 0), str, align, value)

def nk_select_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], str : CString, align : nk_flags, value : nk_bool): nk_bool = 
  __sn_wrap_nuklear_nk_select_image_label(ctx, img, str, align, value)

def nk_select_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], str : CString, len : CInt, align : nk_flags, value : nk_bool): nk_bool = 
  __sn_wrap_nuklear_nk_select_image_text(ctx, img, str, len, align, value)

def nk_select_image_text(ctx : Ptr[nk_context], img : nk_image, str : CString, len : CInt, align : nk_flags, value : nk_bool)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_select_image_text(ctx, (__ptr_0 + 0), str, len, align, value)

def nk_selectable_image_label(ctx : Ptr[nk_context], img : Ptr[nk_image], str : CString, align : nk_flags, value : Ptr[nk_bool]): nk_bool = 
  __sn_wrap_nuklear_nk_selectable_image_label(ctx, img, str, align, value)

def nk_selectable_image_label(ctx : Ptr[nk_context], img : nk_image, str : CString, align : nk_flags, value : Ptr[nk_bool])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_selectable_image_label(ctx, (__ptr_0 + 0), str, align, value)

def nk_selectable_image_text(ctx : Ptr[nk_context], img : nk_image, str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_selectable_image_text(ctx, (__ptr_0 + 0), str, len, align, value)

def nk_selectable_image_text(ctx : Ptr[nk_context], img : Ptr[nk_image], str : CString, len : CInt, align : nk_flags, value : Ptr[nk_bool]): nk_bool = 
  __sn_wrap_nuklear_nk_selectable_image_text(ctx, img, str, len, align, value)

def nk_shrink_rect(r : Ptr[nk_rect], amount : Float)(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_shrink_rect(r, amount, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_shrink_rect(r : nk_rect, amount : Float)(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](2)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_shrink_rect((__ptr_0 + 0), amount, (__ptr_0 + 1))
  !(__ptr_0 + 1)

def nk_shrink_rect(r : Ptr[nk_rect], amount : Float)(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_shrink_rect(r, amount, __return)

def nk_slider_behavior(state : Ptr[nk_flags], logical_cursor : Ptr[nk_rect], visual_cursor : Ptr[nk_rect], in : Ptr[nk_input], bounds : Ptr[nk_rect], slider_min : Float, slider_max : Float, slider_value : Float, slider_step : Float, slider_steps : Float): Float = 
  __sn_wrap_nuklear_nk_slider_behavior(state, logical_cursor, visual_cursor, in, bounds, slider_min, slider_max, slider_value, slider_step, slider_steps)

def nk_slider_behavior(state : Ptr[nk_flags], logical_cursor : Ptr[nk_rect], visual_cursor : Ptr[nk_rect], in : Ptr[nk_input], bounds : nk_rect, slider_min : Float, slider_max : Float, slider_value : Float, slider_step : Float, slider_steps : Float)(using Zone): Float = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_slider_behavior(state, logical_cursor, visual_cursor, in, (__ptr_0 + 0), slider_min, slider_max, slider_value, slider_step, slider_steps)

def nk_stroke_arc(b : Ptr[nk_command_buffer], cx : Float, cy : Float, radius : Float, a_min : Float, a_max : Float, line_thickness : Float, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = c
  __sn_wrap_nuklear_nk_stroke_arc(b, cx, cy, radius, a_min, a_max, line_thickness, (__ptr_0 + 0))

def nk_stroke_arc(b : Ptr[nk_command_buffer], cx : Float, cy : Float, radius : Float, a_min : Float, a_max : Float, line_thickness : Float, c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_stroke_arc(b, cx, cy, radius, a_min, a_max, line_thickness, c)

def nk_stroke_circle(b : Ptr[nk_command_buffer], r : Ptr[nk_rect], line_thickness : Float, c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_stroke_circle(b, r, line_thickness, c)

def nk_stroke_circle(b : Ptr[nk_command_buffer], r : nk_rect, line_thickness : Float, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = r
  !(__ptr_1 + 0) = c
  __sn_wrap_nuklear_nk_stroke_circle(b, (__ptr_0 + 0), line_thickness, (__ptr_1 + 0))

def nk_stroke_curve(b : Ptr[nk_command_buffer], ax : Float, ay : Float, ctrl0x : Float, ctrl0y : Float, ctrl1x : Float, ctrl1y : Float, bx : Float, by : Float, line_thickness : Float, col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_stroke_curve(b, ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, (__ptr_0 + 0))

def nk_stroke_curve(b : Ptr[nk_command_buffer], ax : Float, ay : Float, ctrl0x : Float, ctrl0y : Float, ctrl1x : Float, ctrl1y : Float, bx : Float, by : Float, line_thickness : Float, col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_stroke_curve(b, ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, col)

def nk_stroke_line(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, line_thickness : Float, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = c
  __sn_wrap_nuklear_nk_stroke_line(b, x0, y0, x1, y1, line_thickness, (__ptr_0 + 0))

def nk_stroke_line(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, line_thickness : Float, c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_stroke_line(b, x0, y0, x1, y1, line_thickness, c)

def nk_stroke_polygon(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, line_thickness : Float, col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_stroke_polygon(b, points, point_count, line_thickness, col)

def nk_stroke_polygon(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, line_thickness : Float, col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_stroke_polygon(b, points, point_count, line_thickness, (__ptr_0 + 0))

def nk_stroke_polyline(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, line_thickness : Float, col : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_stroke_polyline(b, points, point_count, line_thickness, (__ptr_0 + 0))

def nk_stroke_polyline(b : Ptr[nk_command_buffer], points : Ptr[Float], point_count : CInt, line_thickness : Float, col : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_stroke_polyline(b, points, point_count, line_thickness, col)

def nk_stroke_rect(b : Ptr[nk_command_buffer], rect : Ptr[nk_rect], rounding : Float, line_thickness : Float, c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_stroke_rect(b, rect, rounding, line_thickness, c)

def nk_stroke_rect(b : Ptr[nk_command_buffer], rect : nk_rect, rounding : Float, line_thickness : Float, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = rect
  !(__ptr_1 + 0) = c
  __sn_wrap_nuklear_nk_stroke_rect(b, (__ptr_0 + 0), rounding, line_thickness, (__ptr_1 + 0))

def nk_stroke_triangle(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, x2 : Float, y2 : Float, line_thickness : Float, c : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_stroke_triangle(b, x0, y0, x1, y1, x2, y2, line_thickness, c)

def nk_stroke_triangle(b : Ptr[nk_command_buffer], x0 : Float, y0 : Float, x1 : Float, y1 : Float, x2 : Float, y2 : Float, line_thickness : Float, c : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = c
  __sn_wrap_nuklear_nk_stroke_triangle(b, x0, y0, x1, y1, x2, y2, line_thickness, (__ptr_0 + 0))

def nk_style_item_color(col : Ptr[nk_color])(using Zone): nk_style_item = 
  val __ptr_0: Ptr[nk_style_item] = alloc[nk_style_item](1)
  __sn_wrap_nuklear_nk_style_item_color(col, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_style_item_color(col : nk_color)(using Zone): nk_style_item = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  val __ptr_1: Ptr[nk_style_item] = alloc[nk_style_item](1)
  !(__ptr_0 + 0) = col
  __sn_wrap_nuklear_nk_style_item_color((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_style_item_color(col : Ptr[nk_color])(__return : Ptr[nk_style_item]): Unit = 
  __sn_wrap_nuklear_nk_style_item_color(col, __return)

def nk_style_item_hide()(__return : Ptr[nk_style_item]): Unit = 
  __sn_wrap_nuklear_nk_style_item_hide(__return)

def nk_style_item_hide()(using Zone): nk_style_item = 
  val __ptr_0: Ptr[nk_style_item] = alloc[nk_style_item](1)
  __sn_wrap_nuklear_nk_style_item_hide((__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_style_item_image(img : nk_image)(using Zone): nk_style_item = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_style_item] = alloc[nk_style_item](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_style_item_image((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_style_item_image(img : Ptr[nk_image])(__return : Ptr[nk_style_item]): Unit = 
  __sn_wrap_nuklear_nk_style_item_image(img, __return)

def nk_style_item_image(img : Ptr[nk_image])(using Zone): nk_style_item = 
  val __ptr_0: Ptr[nk_style_item] = alloc[nk_style_item](1)
  __sn_wrap_nuklear_nk_style_item_image(img, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_style_item_nine_slice(slice : Ptr[nk_nine_slice])(__return : Ptr[nk_style_item]): Unit = 
  __sn_wrap_nuklear_nk_style_item_nine_slice(slice, __return)

def nk_style_item_nine_slice(slice : Ptr[nk_nine_slice])(using Zone): nk_style_item = 
  val __ptr_0: Ptr[nk_style_item] = alloc[nk_style_item](1)
  __sn_wrap_nuklear_nk_style_item_nine_slice(slice, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_style_item_nine_slice(slice : nk_nine_slice)(using Zone): nk_style_item = 
  val __ptr_0: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  val __ptr_1: Ptr[nk_style_item] = alloc[nk_style_item](1)
  !(__ptr_0 + 0) = slice
  __sn_wrap_nuklear_nk_style_item_nine_slice((__ptr_0 + 0), (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_style_push_color(ctx : Ptr[nk_context], address : Ptr[nk_color], value : Ptr[nk_color]): nk_bool = 
  __sn_wrap_nuklear_nk_style_push_color(ctx, address, value)

def nk_style_push_color(ctx : Ptr[nk_context], address : Ptr[nk_color], value : nk_color)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = value
  __sn_wrap_nuklear_nk_style_push_color(ctx, address, (__ptr_0 + 0))

def nk_style_push_style_item(ctx : Ptr[nk_context], address : Ptr[nk_style_item], value : Ptr[nk_style_item]): nk_bool = 
  __sn_wrap_nuklear_nk_style_push_style_item(ctx, address, value)

def nk_style_push_style_item(ctx : Ptr[nk_context], address : Ptr[nk_style_item], value : nk_style_item)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_style_item] = alloc[nk_style_item](1)
  !(__ptr_0 + 0) = value
  __sn_wrap_nuklear_nk_style_push_style_item(ctx, address, (__ptr_0 + 0))

def nk_style_push_vec2(ctx : Ptr[nk_context], address : Ptr[nk_vec2], value : nk_vec2)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = value
  __sn_wrap_nuklear_nk_style_push_vec2(ctx, address, (__ptr_0 + 0))

def nk_style_push_vec2(ctx : Ptr[nk_context], address : Ptr[nk_vec2], value : Ptr[nk_vec2]): nk_bool = 
  __sn_wrap_nuklear_nk_style_push_vec2(ctx, address, value)

def nk_sub9slice_handle(handle : nk_handle, w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(__return : Ptr[nk_nine_slice]): Unit = 
  __sn_wrap_nuklear_nk_sub9slice_handle(handle, w, h, rgn, l, t, r, b, __return)

def nk_sub9slice_handle(handle : nk_handle, w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  __sn_wrap_nuklear_nk_sub9slice_handle(handle, w, h, rgn, l, t, r, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_sub9slice_handle(handle : nk_handle, w : nk_ushort, h : nk_ushort, rgn : nk_rect, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  !(__ptr_0 + 0) = rgn
  __sn_wrap_nuklear_nk_sub9slice_handle(handle, w, h, (__ptr_0 + 0), l, t, r, b, (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_sub9slice_id(id : CInt, w : nk_ushort, h : nk_ushort, rgn : nk_rect, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  !(__ptr_0 + 0) = rgn
  __sn_wrap_nuklear_nk_sub9slice_id(id, w, h, (__ptr_0 + 0), l, t, r, b, (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_sub9slice_id(id : CInt, w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  __sn_wrap_nuklear_nk_sub9slice_id(id, w, h, rgn, l, t, r, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_sub9slice_id(id : CInt, w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(__return : Ptr[nk_nine_slice]): Unit = 
  __sn_wrap_nuklear_nk_sub9slice_id(id, w, h, rgn, l, t, r, b, __return)

def nk_sub9slice_ptr(ptr : Ptr[Byte], w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  __sn_wrap_nuklear_nk_sub9slice_ptr(ptr, w, h, rgn, l, t, r, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_sub9slice_ptr(ptr : Ptr[Byte], w : nk_ushort, h : nk_ushort, rgn : Ptr[nk_rect], l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(__return : Ptr[nk_nine_slice]): Unit = 
  __sn_wrap_nuklear_nk_sub9slice_ptr(ptr, w, h, rgn, l, t, r, b, __return)

def nk_sub9slice_ptr(ptr : Ptr[Byte], w : nk_ushort, h : nk_ushort, rgn : nk_rect, l : nk_ushort, t : nk_ushort, r : nk_ushort, b : nk_ushort)(using Zone): nk_nine_slice = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  val __ptr_1: Ptr[nk_nine_slice] = alloc[nk_nine_slice](1)
  !(__ptr_0 + 0) = rgn
  __sn_wrap_nuklear_nk_sub9slice_ptr(ptr, w, h, (__ptr_0 + 0), l, t, r, b, (__ptr_1 + 0))
  !(__ptr_1 + 0)

def nk_subimage_handle(handle : nk_handle, w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect])(__return : Ptr[nk_image]): Unit = 
  __sn_wrap_nuklear_nk_subimage_handle(handle, w, h, r, __return)

def nk_subimage_handle(handle : nk_handle, w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect])(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  __sn_wrap_nuklear_nk_subimage_handle(handle, w, h, r, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_subimage_handle(handle : nk_handle, w : nk_ushort, h : nk_ushort, r : nk_rect)(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_1 + 0) = r
  __sn_wrap_nuklear_nk_subimage_handle(handle, w, h, (__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_subimage_id(id : CInt, w : nk_ushort, h : nk_ushort, r : nk_rect)(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_1 + 0) = r
  __sn_wrap_nuklear_nk_subimage_id(id, w, h, (__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_subimage_id(id : CInt, w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect])(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  __sn_wrap_nuklear_nk_subimage_id(id, w, h, r, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_subimage_id(id : CInt, w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect])(__return : Ptr[nk_image]): Unit = 
  __sn_wrap_nuklear_nk_subimage_id(id, w, h, r, __return)

def nk_subimage_ptr(ptr : Ptr[Byte], w : nk_ushort, h : nk_ushort, r : nk_rect)(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  val __ptr_1: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_1 + 0) = r
  __sn_wrap_nuklear_nk_subimage_ptr(ptr, w, h, (__ptr_1 + 0), (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_subimage_ptr(ptr : Ptr[Byte], w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect])(__return : Ptr[nk_image]): Unit = 
  __sn_wrap_nuklear_nk_subimage_ptr(ptr, w, h, r, __return)

def nk_subimage_ptr(ptr : Ptr[Byte], w : nk_ushort, h : nk_ushort, r : Ptr[nk_rect])(using Zone): nk_image = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  __sn_wrap_nuklear_nk_subimage_ptr(ptr, w, h, r, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_text_calculate_text_bounds(font : Ptr[nk_user_font], begin : CString, byte_len : CInt, row_height : Float, remaining : Ptr[CString], out_offset : Ptr[nk_vec2], glyphs : Ptr[CInt], op : CInt)(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_text_calculate_text_bounds(font, begin, byte_len, row_height, remaining, out_offset, glyphs, op, __return)

def nk_text_calculate_text_bounds(font : Ptr[nk_user_font], begin : CString, byte_len : CInt, row_height : Float, remaining : Ptr[CString], out_offset : Ptr[nk_vec2], glyphs : Ptr[CInt], op : CInt)(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_text_calculate_text_bounds(font, begin, byte_len, row_height, remaining, out_offset, glyphs, op, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_text_colored(ctx : Ptr[nk_context], str : CString, len : CInt, alignment : nk_flags, color : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_text_colored(ctx, str, len, alignment, color)

def nk_text_colored(ctx : Ptr[nk_context], str : CString, len : CInt, alignment : nk_flags, color : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_nuklear_nk_text_colored(ctx, str, len, alignment, (__ptr_0 + 0))

def nk_text_wrap_colored(ctx : Ptr[nk_context], str : CString, len : CInt, color : Ptr[nk_color]): Unit = 
  __sn_wrap_nuklear_nk_text_wrap_colored(ctx, str, len, color)

def nk_text_wrap_colored(ctx : Ptr[nk_context], str : CString, len : CInt, color : nk_color)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_color] = alloc[nk_color](1)
  !(__ptr_0 + 0) = color
  __sn_wrap_nuklear_nk_text_wrap_colored(ctx, str, len, (__ptr_0 + 0))

def nk_toggle_behavior(in : Ptr[nk_input], select : nk_rect, state : Ptr[nk_flags], active : nk_bool)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = select
  __sn_wrap_nuklear_nk_toggle_behavior(in, (__ptr_0 + 0), state, active)

def nk_toggle_behavior(in : Ptr[nk_input], select : Ptr[nk_rect], state : Ptr[nk_flags], active : nk_bool): nk_bool = 
  __sn_wrap_nuklear_nk_toggle_behavior(in, select, state, active)

def nk_tree_element_image_push_hashed(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, initial_state : nk_collapse_states, selected : Ptr[nk_bool], hash : CString, len : CInt, seed : CInt): nk_bool = 
  __sn_wrap_nuklear_nk_tree_element_image_push_hashed(ctx, `type`, img, title, initial_state, selected, hash, len, seed)

def nk_tree_element_image_push_hashed(ctx : Ptr[nk_context], `type` : nk_tree_type, img : nk_image, title : CString, initial_state : nk_collapse_states, selected : Ptr[nk_bool], hash : CString, len : CInt, seed : CInt)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_tree_element_image_push_hashed(ctx, `type`, (__ptr_0 + 0), title, initial_state, selected, hash, len, seed)

def nk_tree_image_push_hashed(ctx : Ptr[nk_context], `type` : nk_tree_type, img : nk_image, title : CString, initial_state : nk_collapse_states, hash : CString, len : CInt, seed : CInt)(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_tree_image_push_hashed(ctx, `type`, (__ptr_0 + 0), title, initial_state, hash, len, seed)

def nk_tree_image_push_hashed(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, initial_state : nk_collapse_states, hash : CString, len : CInt, seed : CInt): nk_bool = 
  __sn_wrap_nuklear_nk_tree_image_push_hashed(ctx, `type`, img, title, initial_state, hash, len, seed)

def nk_tree_state_image_push(ctx : Ptr[nk_context], `type` : nk_tree_type, img : Ptr[nk_image], title : CString, state : Ptr[nk_collapse_states]): nk_bool = 
  __sn_wrap_nuklear_nk_tree_state_image_push(ctx, `type`, img, title, state)

def nk_tree_state_image_push(ctx : Ptr[nk_context], `type` : nk_tree_type, img : nk_image, title : CString, state : Ptr[nk_collapse_states])(using Zone): nk_bool = 
  val __ptr_0: Ptr[nk_image] = alloc[nk_image](1)
  !(__ptr_0 + 0) = img
  __sn_wrap_nuklear_nk_tree_state_image_push(ctx, `type`, (__ptr_0 + 0), title, state)

def nk_triangle_from_direction(result : Ptr[nk_vec2], r : Ptr[nk_rect], pad_x : Float, pad_y : Float, direction : nk_heading): Unit = 
  __sn_wrap_nuklear_nk_triangle_from_direction(result, r, pad_x, pad_y, direction)

def nk_triangle_from_direction(result : Ptr[nk_vec2], r : nk_rect, pad_x : Float, pad_y : Float, direction : nk_heading)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = r
  __sn_wrap_nuklear_nk_triangle_from_direction(result, (__ptr_0 + 0), pad_x, pad_y, direction)

def nk_vec2(x : Float, y : Float)(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_vec2(x, y, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_vec2(x : Float, y : Float)(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_vec2(x, y, __return)

def nk_vec2i(x : CInt, y : CInt)(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_vec2i(x, y, __return)

def nk_vec2i(x : CInt, y : CInt)(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_vec2i(x, y, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_vec2iv(v : Ptr[CInt])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_vec2iv(v, __return)

def nk_vec2iv(v : Ptr[CInt])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_vec2iv(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_vec2v(v : Ptr[Float])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_vec2v(v, __return)

def nk_vec2v(v : Ptr[Float])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_vec2v(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_widget_bounds(ctx : Ptr[nk_context])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_widget_bounds(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_widget_bounds(ctx : Ptr[nk_context])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_widget_bounds(ctx, __return)

def nk_widget_fitting(bounds : Ptr[nk_rect], ctx : Ptr[nk_context], item_padding : nk_vec2)(using Zone): nk_widget_layout_states = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = item_padding
  __sn_wrap_nuklear_nk_widget_fitting(bounds, ctx, (__ptr_0 + 0))

def nk_widget_fitting(bounds : Ptr[nk_rect], ctx : Ptr[nk_context], item_padding : Ptr[nk_vec2]): nk_widget_layout_states = 
  __sn_wrap_nuklear_nk_widget_fitting(bounds, ctx, item_padding)

def nk_widget_position(ctx : Ptr[nk_context])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_widget_position(ctx, __return)

def nk_widget_position(ctx : Ptr[nk_context])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_widget_position(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_widget_size(ctx : Ptr[nk_context])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_widget_size(ctx, __return)

def nk_widget_size(ctx : Ptr[nk_context])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_widget_size(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_widget_text(o : Ptr[nk_command_buffer], b : Ptr[nk_rect], string : CString, len : CInt, t : Ptr[nk_text], a : nk_flags, f : Ptr[nk_user_font]): Unit = 
  __sn_wrap_nuklear_nk_widget_text(o, b, string, len, t, a, f)

def nk_widget_text(o : Ptr[nk_command_buffer], b : nk_rect, string : CString, len : CInt, t : Ptr[nk_text], a : nk_flags, f : Ptr[nk_user_font])(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = b
  __sn_wrap_nuklear_nk_widget_text(o, (__ptr_0 + 0), string, len, t, a, f)

def nk_widget_text_wrap(o : Ptr[nk_command_buffer], b : nk_rect, string : CString, len : CInt, t : Ptr[nk_text], f : Ptr[nk_user_font])(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = b
  __sn_wrap_nuklear_nk_widget_text_wrap(o, (__ptr_0 + 0), string, len, t, f)

def nk_widget_text_wrap(o : Ptr[nk_command_buffer], b : Ptr[nk_rect], string : CString, len : CInt, t : Ptr[nk_text], f : Ptr[nk_user_font]): Unit = 
  __sn_wrap_nuklear_nk_widget_text_wrap(o, b, string, len, t, f)

def nk_window_get_bounds(ctx : Ptr[nk_context])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_window_get_bounds(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_window_get_bounds(ctx : Ptr[nk_context])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_window_get_bounds(ctx, __return)

def nk_window_get_content_region(ctx : Ptr[nk_context])(using Zone): nk_rect = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  __sn_wrap_nuklear_nk_window_get_content_region(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_window_get_content_region(ctx : Ptr[nk_context])(__return : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_window_get_content_region(ctx, __return)

def nk_window_get_content_region_max(ctx : Ptr[nk_context])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_window_get_content_region_max(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_window_get_content_region_max(ctx : Ptr[nk_context])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_window_get_content_region_max(ctx, __return)

def nk_window_get_content_region_min(ctx : Ptr[nk_context])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_window_get_content_region_min(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_window_get_content_region_min(ctx : Ptr[nk_context])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_window_get_content_region_min(ctx, __return)

def nk_window_get_content_region_size(ctx : Ptr[nk_context])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_window_get_content_region_size(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_window_get_content_region_size(ctx : Ptr[nk_context])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_window_get_content_region_size(ctx, __return)

def nk_window_get_position(ctx : Ptr[nk_context])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_window_get_position(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_window_get_position(ctx : Ptr[nk_context])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_window_get_position(ctx, __return)

def nk_window_get_size(ctx : Ptr[nk_context])(__return : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_window_get_size(ctx, __return)

def nk_window_get_size(ctx : Ptr[nk_context])(using Zone): nk_vec2 = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  __sn_wrap_nuklear_nk_window_get_size(ctx, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def nk_window_set_bounds(ctx : Ptr[nk_context], name : CString, bounds : nk_rect)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_rect] = alloc[nk_rect](1)
  !(__ptr_0 + 0) = bounds
  __sn_wrap_nuklear_nk_window_set_bounds(ctx, name, (__ptr_0 + 0))

def nk_window_set_bounds(ctx : Ptr[nk_context], name : CString, bounds : Ptr[nk_rect]): Unit = 
  __sn_wrap_nuklear_nk_window_set_bounds(ctx, name, bounds)

def nk_window_set_position(ctx : Ptr[nk_context], name : CString, pos : nk_vec2)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = pos
  __sn_wrap_nuklear_nk_window_set_position(ctx, name, (__ptr_0 + 0))

def nk_window_set_position(ctx : Ptr[nk_context], name : CString, pos : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_window_set_position(ctx, name, pos)

def nk_window_set_size(ctx : Ptr[nk_context], name : CString, size : Ptr[nk_vec2]): Unit = 
  __sn_wrap_nuklear_nk_window_set_size(ctx, name, size)

def nk_window_set_size(ctx : Ptr[nk_context], name : CString, size : nk_vec2)(using Zone): Unit = 
  val __ptr_0: Ptr[nk_vec2] = alloc[nk_vec2](1)
  !(__ptr_0 + 0) = size
  __sn_wrap_nuklear_nk_window_set_size(ctx, name, (__ptr_0 + 0))