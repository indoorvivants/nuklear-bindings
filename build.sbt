resolvers ++= Resolver.sonatypeOssRepos("snapshots")

import bindgen.plugin.BindgenMode
import bindgen.interface.Binding

scalaVersion := "3.3.3"

enablePlugins(ScalaNativePlugin, BindgenPlugin)

bindgenBindings := Seq(
  Binding(
    baseDirectory.value / "src" / "main" / "resources" / "scala-native" / "nuklear.h",
    "nuklear",
    cImports = List("nuklear.h"),
    clangFlags = List(
      "-DNK_IMPLEMENTATION=1",
      "-DNK_INCLUDE_DEFAULT_FONT=1",
      "-DNK_INCLUDE_DEFAULT_ALLOCATOR=1",
      "-DNK_INCLUDE_FIXED_TYPES=1",
      "-I" + (baseDirectory.value / "src" / "main" / "resources" / "scala-native")
    ),
    multiFile = true,
    opaqueStructs = Set("nk_*")
  ).withNoLocation(true)
)

bindgenMode := BindgenMode.Manual(
  scalaDir = baseDirectory.value / "src" / "main" / "scala" / "generated",
  cDir =
    baseDirectory.value / "src" / "main" / "resources" / "scala-native" / "generated"
)
