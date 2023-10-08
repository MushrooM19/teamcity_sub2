package sub2

object sub2 : Project({
    name = "sub2"
    defaultTemplate = RelativeId("Echo5")

    buildType(Sub2_Script)
})

object Sub2_Script : BuildType({
    name = "script"
})